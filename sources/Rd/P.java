package Rd;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class P implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IconicsImageView f8125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f8126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f8127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f8128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f8129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f8130g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f8131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearLayout f8132j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f8133o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f8134p;

    public P(ConstraintLayout constraintLayout, IconicsImageView iconicsImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, LinearLayout linearLayout, TextView textView7, ImageView imageView, TextView textView8) {
        this.f8124a = constraintLayout;
        this.f8125b = iconicsImageView;
        this.f8126c = textView;
        this.f8127d = textView2;
        this.f8128e = textView3;
        this.f8129f = textView4;
        this.f8130g = textView5;
        this.f8131i = textView6;
        this.f8132j = linearLayout;
        this.f8133o = textView7;
        this.f8134p = textView8;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8124a;
    }
}
