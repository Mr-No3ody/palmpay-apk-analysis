package p142ja;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f38469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f38470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconicsImageView f38471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f38472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f38473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f38474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f38475g;

    public g(ConstraintLayout constraintLayout, RecyclerView recyclerView, IconicsImageView iconicsImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f38469a = constraintLayout;
        this.f38470b = recyclerView;
        this.f38471c = iconicsImageView;
        this.f38472d = textView;
        this.f38473e = textView2;
        this.f38474f = textView3;
        this.f38475g = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f38469a;
    }
}
