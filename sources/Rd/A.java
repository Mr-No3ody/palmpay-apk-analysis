package Rd;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: loaded from: classes4.dex */
public final class A implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f7967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f7968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f7969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f7970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f7971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f7972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f7973g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PpButton f7974i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IconicsTextView f7975j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final PpButton f7976o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f7977p;

    public A(ConstraintLayout constraintLayout, ImageView imageView, AppCompatImageView appCompatImageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, PpButton ppButton, IconicsTextView iconicsTextView, PpButton ppButton2, TextView textView2) {
        this.f7967a = constraintLayout;
        this.f7968b = imageView;
        this.f7969c = appCompatImageView;
        this.f7970d = linearLayout;
        this.f7971e = linearLayout2;
        this.f7972f = linearLayout3;
        this.f7973g = textView;
        this.f7974i = ppButton;
        this.f7975j = iconicsTextView;
        this.f7976o = ppButton2;
        this.f7977p = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f7967a;
    }
}
