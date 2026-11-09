package Rd;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.viewmodel.AndroidXWebView;

/* JADX INFO: renamed from: Rd.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0593i implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f8332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f8333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LottieAnimationView f8334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PpTitleBar f8335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f8336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f8337g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f8338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f8339j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AndroidXWebView f8340o;

    public C0593i(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, LottieAnimationView lottieAnimationView, PpTitleBar ppTitleBar, TextView textView, TextView textView2, TextView textView3, View view, AndroidXWebView androidXWebView) {
        this.f8331a = constraintLayout;
        this.f8332b = constraintLayout2;
        this.f8333c = imageView;
        this.f8334d = lottieAnimationView;
        this.f8335e = ppTitleBar;
        this.f8336f = textView;
        this.f8337g = textView2;
        this.f8338i = textView3;
        this.f8339j = view;
        this.f8340o = androidXWebView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8331a;
    }
}
