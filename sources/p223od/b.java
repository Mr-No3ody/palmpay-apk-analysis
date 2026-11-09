package p223od;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f40298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f40299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconicsTextView f40300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f40301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f40302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f40303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f40304g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f40305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f40306j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f40307o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final IconicsTextView f40308p;

    public b(ConstraintLayout constraintLayout, FrameLayout frameLayout, IconicsTextView iconicsTextView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, IconicsTextView iconicsTextView2) {
        this.f40298a = constraintLayout;
        this.f40299b = frameLayout;
        this.f40300c = iconicsTextView;
        this.f40301d = textView;
        this.f40302e = textView2;
        this.f40303f = textView3;
        this.f40304g = textView4;
        this.f40305i = textView5;
        this.f40306j = textView6;
        this.f40307o = textView7;
        this.f40308p = iconicsTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f40298a;
    }
}
