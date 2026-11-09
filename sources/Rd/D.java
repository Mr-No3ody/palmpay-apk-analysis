package Rd;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.palmpay.core.viewmodel.ModelAvailableCouponItem;
import com.transsnet.palmpay.custom_view.ModelItemSelection;

/* JADX INFO: loaded from: classes4.dex */
public final class D implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BannerAdView f8014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ModelAvailableCouponItem f8015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f8016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ModelItemSelection f8017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f8018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f8019g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PpTitleBar f8020i;

    public D(LinearLayout linearLayout, BannerAdView bannerAdView, ModelAvailableCouponItem modelAvailableCouponItem, ConstraintLayout constraintLayout, ModelItemSelection modelItemSelection, TextView textView, TextView textView2, PpTitleBar ppTitleBar) {
        this.f8013a = linearLayout;
        this.f8014b = bannerAdView;
        this.f8015c = modelAvailableCouponItem;
        this.f8016d = constraintLayout;
        this.f8017e = modelItemSelection;
        this.f8018f = textView;
        this.f8019g = textView2;
        this.f8020i = ppTitleBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f8013a;
    }
}
