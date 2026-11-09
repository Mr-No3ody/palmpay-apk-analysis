package Rd;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;

/* JADX INFO: loaded from: classes4.dex */
public final class B implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f7978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModelEmptyView f7979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f7980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f7981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RecyclerView f7982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RecyclerView f7983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f7984g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bc.k f7985i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Bc.p f7986j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f7987o;

    public B(LinearLayout linearLayout, ModelEmptyView modelEmptyView, ImageView imageView, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, TextView textView, Bc.k kVar, Bc.p pVar, TextView textView2) {
        this.f7978a = linearLayout;
        this.f7979b = modelEmptyView;
        this.f7980c = imageView;
        this.f7981d = recyclerView;
        this.f7982e = recyclerView2;
        this.f7983f = recyclerView3;
        this.f7984g = textView;
        this.f7985i = kVar;
        this.f7986j = pVar;
        this.f7987o = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f7978a;
    }
}
