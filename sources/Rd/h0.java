package Rd;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f8330b;

    public h0(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f8329a = linearLayout;
        this.f8330b = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8329a;
    }
}
