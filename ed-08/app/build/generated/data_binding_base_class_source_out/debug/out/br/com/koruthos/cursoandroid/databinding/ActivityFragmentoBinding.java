// Generated by data binding compiler. Do not edit!
package br.com.koruthos.cursoandroid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import br.com.koruthos.cursoandroid.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityFragmentoBinding extends ViewDataBinding {
  @NonNull
  public final BottomNavigationView fragmentoBtmNavigation;

  @NonNull
  public final FrameLayout fragmentoContainer;

  protected ActivityFragmentoBinding(Object _bindingComponent, View _root, int _localFieldCount,
      BottomNavigationView fragmentoBtmNavigation, FrameLayout fragmentoContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fragmentoBtmNavigation = fragmentoBtmNavigation;
    this.fragmentoContainer = fragmentoContainer;
  }

  @NonNull
  public static ActivityFragmentoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_fragmento, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityFragmentoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityFragmentoBinding>inflateInternal(inflater, R.layout.activity_fragmento, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityFragmentoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_fragmento, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityFragmentoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityFragmentoBinding>inflateInternal(inflater, R.layout.activity_fragmento, null, false, component);
  }

  public static ActivityFragmentoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityFragmentoBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityFragmentoBinding)bind(component, view, R.layout.activity_fragmento);
  }
}
