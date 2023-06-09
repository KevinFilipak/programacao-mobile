package br.com.koruthos.cursoandroid.databinding;
import br.com.koruthos.cursoandroid.R;
import br.com.koruthos.cursoandroid.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTela1BindingImpl extends FragmentTela1Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView, 1);
        sViewsWithIds.put(R.id.button, 2);
        sViewsWithIds.put(R.id.textView2, 3);
        sViewsWithIds.put(R.id.textView4, 4);
        sViewsWithIds.put(R.id.searchView, 5);
        sViewsWithIds.put(R.id.imageView, 6);
        sViewsWithIds.put(R.id.linearLayout2, 7);
        sViewsWithIds.put(R.id.button2, 8);
        sViewsWithIds.put(R.id.button4, 9);
        sViewsWithIds.put(R.id.button5, 10);
        sViewsWithIds.put(R.id.button6, 11);
        sViewsWithIds.put(R.id.textView5, 12);
        sViewsWithIds.put(R.id.constraintLayoutPrincipal, 13);
        sViewsWithIds.put(R.id.constraintLayout, 14);
        sViewsWithIds.put(R.id.view2, 15);
        sViewsWithIds.put(R.id.profile_image6, 16);
        sViewsWithIds.put(R.id.constraintLayout2, 17);
        sViewsWithIds.put(R.id.view3, 18);
        sViewsWithIds.put(R.id.profile_image7, 19);
        sViewsWithIds.put(R.id.constraintLayout3, 20);
        sViewsWithIds.put(R.id.view4, 21);
        sViewsWithIds.put(R.id.profile_image8, 22);
        sViewsWithIds.put(R.id.constraintLayout4, 23);
        sViewsWithIds.put(R.id.view5, 24);
        sViewsWithIds.put(R.id.profile_image9, 25);
        sViewsWithIds.put(R.id.textView6, 26);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTela1BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private FragmentTela1BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[8]
            , (android.widget.Button) bindings[9]
            , (android.widget.Button) bindings[10]
            , (android.widget.Button) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[20]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[23]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.LinearLayout) bindings[7]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[16]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.SearchView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[26]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[21]
            , (android.view.View) bindings[24]
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