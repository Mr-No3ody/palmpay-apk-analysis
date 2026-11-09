package p142ja;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f38464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f38465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f38466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f38467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f38468e;

    public e(ConstraintLayout constraintLayout, RecyclerView recyclerView, TextView textView, TextView textView2, View view) {
        this.f38464a = constraintLayout;
        this.f38465b = recyclerView;
        this.f38466c = textView;
        this.f38467d = textView2;
        this.f38468e = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f38464a;
    }
}
