package com.example.ed09_ate_11.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.koruthos.rickmorty.widgets.adapters.ComentariosRecyclerAdapter
import com.example.ed09_ate_11.constantes.TAG
import com.example.ed09_ate_11.databinding.FragmentTela01Binding
import com.example.ed09_ate_11.databinding.FragmentTela02Binding
import com.example.ed09_ate_11.models.Comentarios
import com.example.ed09_ate_11.models.Filmes
import com.example.ed09_ate_11.models.Response
import com.example.ed09_ate_11.network.NetworkManager
import com.example.ed09_ate_11.widgets.adapters.FilmesRecyclerAdapter
import retrofit2.Call
import retrofit2.Callback

class Tela2Fragment : Fragment(){
    private lateinit var mBinding: FragmentTela02Binding

    // Lista com todos os Filmes

    private var mComentarios: MutableList<Comentarios> = mutableListOf()


    // Controle da paginação do webservice
    private var mPagina = 1

    /*    private var mNome: String = ""
        private var mEmail: String = ""*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*
                mNome = arguments?.getString(PARAM_NOME)!!
                mEmail = arguments?.getString(PARAM_EMAIL)!!
        */
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inicialização usando DataBinding
        mBinding = FragmentTela02Binding.inflate(inflater, container, false)
        return mBinding.root
    }


    // Para construir um fragmento, usamos o padrão builder
    // Ele permite que todos os fragmentos sejam criados de maneira uniforme, padroniza
    //  a passagem de parametros


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Inicializa o recycler view
        mBinding.comentariosRecycler.layoutManager = GridLayoutManager(activity, 2)

        // Inicializa o adapter
        mBinding.comentariosRecycler.adapter = ComentariosRecyclerAdapter(
            mComentarios,
            object : ComentariosRecyclerAdapter.Evento {
                override fun onComentarioClick(comentarios: Comentarios) {
                    this@Tela2Fragment.onComentariosClick(comentarios)
                }
            }
        )

        // Captura o evento de scroll para carregar mais itens na página
        mBinding.comentariosRecycler.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)

                // Se não for mais possível realizar o scroll para baixo, chama o webservice
                if (!recyclerView.canScrollVertically(1)) { //1 for down
                    carregarComentarios()
                }
            }
        })

        // Chamada para o webservice
        // A resposta do webservice vai atualizar o recycler view
        carregarComentarios()

    }


    private fun onComentariosClick(comentarios: Comentarios) {
    Toast.makeText(activity, comentarios.Comentarista?.comment, Toast.LENGTH_LONG).show()
}

/**
 * Chama o webservice para carregar mais episódios.
 */
private fun carregarComentarios() {
    Log.d(TAG, "carregarEpisodios: ")

    // Verifica se chegou na última página
    if (mPagina < 0) {
        Log.i(TAG, "carregarEpisodios: Última página - sem dados para carregar")
        return
    }

    Log.d(TAG, "carregarEpisodios: Carregando dados da página $mPagina")
    val call = NetworkManager.service.listarComentarios(mPagina)

    // Enfileira a execução do webservice e trata a resposta
    call.enqueue(object : Callback<Response<Comentarios>> {

        // Retorno de sucesso
        override fun onResponse(
            call: Call<Response<Comentarios>>,
            response: retrofit2.Response<Response<Comentarios>>
        ) {
            onResponseSuccess(response.body())
        }

        // Retorno de falha
        override fun onFailure(call: Call<Response<Comentarios>>, t: Throwable) {
            Log.e(TAG, "onFailure: ", t)
            if (context != null) {
                Toast.makeText(context, t.message, Toast.LENGTH_LONG).show()
            }
        }
    })
}

/**
 * Função para tratar a mensagem de sucesso do webservice.
 */
private fun onResponseSuccess(body: Response<Comentarios>?) {
    Log.d(TAG, "onResponseSuccess: ")

    // Atualiza qual é a próxima página a ser carregada
    // - Se for a última página, invalida o contador de páginas para evitar novas chamadas
    // - Senão, atualiza o contador de páginas
    if (body?.info?.next == null) {
        mPagina = -1
    } else {
        mPagina++
    }

    // Adiciona os resultados obtidos na lista de personagens
    if (body?.resultados != null) {
        // Recupera o range da lista
        val ini = mComentarios.size
        val qtd = body.resultados.size

        // Concatena as duas listas
        mComentarios.addAll(body.resultados)
        Log.d(TAG, "onResponseSuccess: ${mComentarios.size}")

        // Atualiza o recycler view
        Log.d(TAG, "onResponseSuccess: Atualizando adapter")
        Log.d(TAG, "onResponseSuccess: ${mBinding.comentariosRecycler.adapter}")
        mBinding.comentariosRecycler.adapter?.notifyItemRangeInserted(ini, qtd)

    }
}

    /** Função estática para a construção dos fragmentos */
    companion object {

        /*
                val PARAM_NOME = "nome"
                val PARAM_EMAIL = "email"
        */

        @JvmStatic
        fun newInstance(/*nome: String, email: String*/) : Tela2Fragment {

            val bundle = Bundle()
            /*
                        bundle.putString(PARAM_NOME, nome)
                        bundle.putString(PARAM_EMAIL, email)
            */

            val fragmento = Tela2Fragment()
            fragmento.arguments = bundle
            return fragmento
        }
    }
}