package p142ja;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f38476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f38477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconicsImageView f38478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f38479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f38480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f38481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f38482g;

    public h(ConstraintLayout constraintLayout, RecyclerView recyclerView, IconicsImageView iconicsImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f38476a = constraintLayout;
        this.f38477b = recyclerView;
        this.f38478c = iconicsImageView;
        this.f38479d = textView;
        this.f38480e = textView2;
        this.f38481f = textView3;
        this.f38482g = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f38476a;
    }
}
