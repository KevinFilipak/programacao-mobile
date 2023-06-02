package br.com.koruthos.cursoandroid.databinding;
import br.com.koruthos.cursoandroid.R;
import br.com.koruthos.cursoandroid.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTela2BindingImpl extends FragmentTela2Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textviewprincipal, 1);
        sViewsWithIds.put(R.id.profile_image, 2);
        sViewsWithIds.put(R.id.profile_image3, 3);
        sViewsWithIds.put(R.id.profile_image4, 4);
        sViewsWithIds.put(R.id.tela2_txt_nome, 5);
        sViewsWithIds.put(R.id.tela2_txt_nome3, 6);
        sViewsWithIds.put(R.id.tela2_txt_nome4, 7);
        sViewsWithIds.put(R.id.tela2_txt_email, 8);
        sViewsWithIds.put(R.id.tela2_txt_email5, 9);
        sViewsWithIds.put(R.id.tela2_txt_email7, 10);
        sViewsWithIds.put(R.id.tela2_txt_email2, 11);
        sViewsWithIds.put(R.id.tela2_txt_email8, 12);
        sViewsWithIds.put(R.id.tela2_txt_email6, 13);
        sViewsWithIds.put(R.id.textView3, 14);
        sViewsWithIds.put(R.id.textView18, 15);
        sViewsWithIds.put(R.id.textView7, 16);
        sViewsWithIds.put(R.id.textView19, 17);
        sViewsWithIds.put(R.id.textView34, 18);
        sViewsWithIds.put(R.id.textView8, 19);
        sViewsWithIds.put(R.id.textView21, 20);
        sViewsWithIds.put(R.id.textView35, 21);
        sViewsWithIds.put(R.id.textView9, 22);
        sViewsWithIds.put(R.id.textView24, 23);
        sViewsWithIds.put(R.id.textView36, 24);
        sViewsWithIds.put(R.id.textView10, 25);
        sViewsWithIds.put(R.id.textView11, 26);
        sViewsWithIds.put(R.id.textView39, 27);
        sViewsWithIds.put(R.id.textView27, 28);
        sViewsWithIds.put(R.id.button7, 29);
        sViewsWithIds.put(R.id.button11, 30);
        sViewsWithIds.put(R.id.button13, 31);
        sViewsWithIds.put(R.id.button8, 32);
        sViewsWithIds.put(R.id.button12, 33);
        sViewsWithIds.put(R.id.button14, 34);
        sViewsWithIds.put(R.id.textView26, 35);
        sViewsWithIds.put(R.id.textView31, 36);
        sViewsWithIds.put(R.id.textView38, 37);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTela2BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 38, sIncludes, sViewsWithIds));
    }
    private FragmentTela2BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[30]
            , (android.widget.Button) bindings[33]
            , (android.widget.Button) bindings[31]
            , (android.widget.Button) bindings[34]
            , (android.widget.Button) bindings[29]
            , (android.widget.Button) bindings[32]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[2]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[3]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[35]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[36]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[37]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}