package x4;

import Bc.B;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f43569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f43570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f43571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f43572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f43573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f43574f;

    public a(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LinearLayout linearLayout, B b7, TextView textView, View view) {
        this.f43569a = constraintLayout;
        this.f43570b = constraintLayout2;
        this.f43571c = linearLayout;
        this.f43572d = b7;
        this.f43573e = textView;
        this.f43574f = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f43569a;
    }
}
