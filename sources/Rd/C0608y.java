package Rd;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.mikepenz.iconics.view.IconicsImageView;

/* JADX INFO: renamed from: Rd.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0608y implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f8549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconicsImageView f8550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LottieAnimationView f8551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f8552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f8553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f8554g;

    public C0608y(LinearLayout linearLayout, ImageView imageView, IconicsImageView iconicsImageView, LottieAnimationView lottieAnimationView, TextView textView, TextView textView2, TextView textView3) {
        this.f8548a = linearLayout;
        this.f8549b = imageView;
        this.f8550c = iconicsImageView;
        this.f8551d = lottieAnimationView;
        this.f8552e = textView;
        this.f8553f = textView2;
        this.f8554g = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8548a;
    }
}
