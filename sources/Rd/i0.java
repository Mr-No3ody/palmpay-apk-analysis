package Rd;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.palmpay.custom_view.ModelItemSelection;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 implements ViewBinding {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ModelNumberInputLayout f8341A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f8342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BannerAdView f8343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f8344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f8345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f8346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f8347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f8348g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinearLayout f8349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final NestedScrollView f8350j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinearLayout f8351o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PpAmountEditText f8352p;
    public final FrameLayout t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ModelItemSelection f8353v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ModelNumberInputLayout f8354w;

    public i0(FrameLayout frameLayout, BannerAdView bannerAdView, LinearLayout linearLayout, TextView textView, TextView textView2, LinearLayout linearLayout2, TextView textView3, LinearLayout linearLayout3, NestedScrollView nestedScrollView, LinearLayout linearLayout4, PpAmountEditText ppAmountEditText, FrameLayout frameLayout2, ModelItemSelection modelItemSelection, ModelNumberInputLayout modelNumberInputLayout, ModelNumberInputLayout modelNumberInputLayout2) {
        this.f8342a = frameLayout;
        this.f8343b = bannerAdView;
        this.f8344c = linearLayout;
        this.f8345d = textView;
        this.f8346e = textView2;
        this.f8347f = linearLayout2;
        this.f8348g = textView3;
        this.f8349i = linearLayout3;
        this.f8350j = nestedScrollView;
        this.f8351o = linearLayout4;
        this.f8352p = ppAmountEditText;
        this.t = frameLayout2;
        this.f8353v = modelItemSelection;
        this.f8354w = modelNumberInputLayout;
        this.f8341A = modelNumberInputLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8342a;
    }
}
