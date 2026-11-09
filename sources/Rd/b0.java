package Rd;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f8210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f8211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f8212d;

    public b0(LinearLayout linearLayout, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView) {
        this.f8209a = linearLayout;
        this.f8210b = recyclerView;
        this.f8211c = recyclerView2;
        this.f8212d = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8209a;
    }
}
