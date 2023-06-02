package br.com.koruthos.cursoandroid;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import br.com.koruthos.cursoandroid.databinding.ActivityFragmentoBindingImpl;
import br.com.koruthos.cursoandroid.databinding.FragmentTela1BindingImpl;
import br.com.koruthos.cursoandroid.databinding.FragmentTela2BindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYFRAGMENTO = 1;

  private static final int LAYOUT_FRAGMENTTELA1 = 2;

  private static final int LAYOUT_FRAGMENTTELA2 = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(br.com.koruthos.cursoandroid.R.layout.activity_fragmento, LAYOUT_ACTIVITYFRAGMENTO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(br.com.koruthos.cursoandroid.R.layout.fragment_tela1, LAYOUT_FRAGMENTTELA1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(br.com.koruthos.cursoandroid.R.layout.fragment_tela2, LAYOUT_FRAGMENTTELA2);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYFRAGMENTO: {
          if ("layout/activity_fragmento_0".equals(tag)) {
            return new ActivityFragmentoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_fragmento is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTELA1: {
          if ("layout/fragment_tela1_0".equals(tag)) {
            return new FragmentTela1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_tela1 is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTELA2: {
          if ("layout/fragment_tela2_0".equals(tag)) {
            return new FragmentTela2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_tela2 is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/activity_fragmento_0", br.com.koruthos.cursoandroid.R.layout.activity_fragmento);
      sKeys.put("layout/fragment_tela1_0", br.com.koruthos.cursoandroid.R.layout.fragment_tela1);
      sKeys.put("layout/fragment_tela2_0", br.com.koruthos.cursoandroid.R.layout.fragment_tela2);
    }
  }
}
