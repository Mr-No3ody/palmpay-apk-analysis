package Bc;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.adsdk.widgets.banner.BannerAdView;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BannerAdView f714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SingleAdView f715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SingleAdView f716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SingleAdView f717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FrameLayout f718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RecyclerView f719g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RecyclerView f721j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final MarqueeView f722o;

    public h(LinearLayout linearLayout, BannerAdView bannerAdView, SingleAdView singleAdView, SingleAdView singleAdView2, SingleAdView singleAdView3, FrameLayout frameLayout, RecyclerView recyclerView, View view, RecyclerView recyclerView2, MarqueeView marqueeView) {
        this.f713a = linearLayout;
        this.f714b = bannerAdView;
        this.f715c = singleAdView;
        this.f716d = singleAdView2;
        this.f717e = singleAdView3;
        this.f718f = frameLayout;
        this.f719g = recyclerView;
        this.f720i = view;
        this.f721j = recyclerView2;
        this.f722o = marqueeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f713a;
    }
}
