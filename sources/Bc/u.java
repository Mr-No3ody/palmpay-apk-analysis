package Bc;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpButton f851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IconicsImageView f854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f856g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f857i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f858j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f859o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f860p;
    public final View t;

    public u(ConstraintLayout constraintLayout, PpButton ppButton, ImageView imageView, ImageView imageView2, IconicsImageView iconicsImageView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view) {
        this.f850a = constraintLayout;
        this.f851b = ppButton;
        this.f852c = imageView;
        this.f853d = imageView2;
        this.f854e = iconicsImageView;
        this.f855f = linearLayout;
        this.f856g = textView;
        this.f857i = textView2;
        this.f858j = textView3;
        this.f859o = textView4;
        this.f860p = textView5;
        this.t = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f850a;
    }
}
