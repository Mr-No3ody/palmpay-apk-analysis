package Rd;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f8440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f8441c;

    public o0(LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView) {
        this.f8439a = linearLayout;
        this.f8440b = linearLayout2;
        this.f8441c = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8439a;
    }
}
