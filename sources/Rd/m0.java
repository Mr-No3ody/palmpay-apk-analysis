package Rd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 implements ViewBinding {

    @NonNull
    public final RecyclerView itemRy;

    @NonNull
    public final LinearLayout ivArrowRight;

    @NonNull
    public final LinearLayout llTabs;

    @NonNull
    private final ConstraintLayout rootView;

    private m0(@NonNull ConstraintLayout rootView, @NonNull RecyclerView itemRy, @NonNull LinearLayout ivArrowRight, @NonNull LinearLayout llTabs) {
        this.rootView = rootView;
        this.itemRy = itemRy;
        this.ivArrowRight = ivArrowRight;
        this.llTabs = llTabs;
    }

    @NonNull
    public static m0 bind(@NonNull View rootView) {
        int i7 = Pd.c.itemRy;
        RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, rootView);
        if (recyclerView != null) {
            i7 = Pd.c.ivArrowRight;
            LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, rootView);
            if (linearLayout != null) {
                i7 = Pd.c.llTabs;
                LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, rootView);
                if (linearLayout2 != null) {
                    return new m0((ConstraintLayout) rootView, recyclerView, linearLayout, linearLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i7)));
    }

    @NonNull
    public static m0 inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static m0 inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(Pd.d.qt_layout_quick_betting_view, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
