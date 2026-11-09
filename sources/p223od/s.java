package p223od;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f40492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PpButton f40493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpButton f40494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f40495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f40496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LottieAnimationView f40497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinearLayout f40498g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f40499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f40500j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f40501o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f40502p;
    public final TextView t;

    public s(ConstraintLayout constraintLayout, PpButton ppButton, PpButton ppButton2, IconicsImageView iconicsImageView, ImageView imageView, AppCompatImageView appCompatImageView, LottieAnimationView lottieAnimationView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f40492a = constraintLayout;
        this.f40493b = ppButton;
        this.f40494c = ppButton2;
        this.f40495d = imageView;
        this.f40496e = appCompatImageView;
        this.f40497f = lottieAnimationView;
        this.f40498g = linearLayout;
        this.f40499i = textView;
        this.f40500j = textView2;
        this.f40501o = textView3;
        this.f40502p = textView4;
        this.t = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f40492a;
    }
}
