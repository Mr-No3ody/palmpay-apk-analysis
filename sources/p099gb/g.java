package p099gb;

import android.view.View;
import android.view.ViewStub;
import androidx.viewbinding.ViewBinding;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.palmpay.credit.ui.view.NotifyInfoView;
import com.transsnet.palmpay.credit.view.KingKongContentInfoView;
import com.transsnet.palmpay.credit.view.LoanHomeBottomInfoView;
import com.transsnet.palmpay.credit.view.ProductContentListView;
import com.transsnet.palmpay.credit.view.TotalOutstandingView;
import com.transsnet.palmpay.custom_view.ReboundScrollView;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReboundScrollView f37144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SingleAdView f37145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BannerAdView f37146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewStub f37147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final KingKongContentInfoView f37148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LoanHomeBottomInfoView f37149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NotifyInfoView f37150g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ProductContentListView f37151i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TotalOutstandingView f37152j;

    public g(ReboundScrollView reboundScrollView, SingleAdView singleAdView, BannerAdView bannerAdView, ViewStub viewStub, KingKongContentInfoView kingKongContentInfoView, LoanHomeBottomInfoView loanHomeBottomInfoView, NotifyInfoView notifyInfoView, ProductContentListView productContentListView, TotalOutstandingView totalOutstandingView) {
        this.f37144a = reboundScrollView;
        this.f37145b = singleAdView;
        this.f37146c = bannerAdView;
        this.f37147d = viewStub;
        this.f37148e = kingKongContentInfoView;
        this.f37149f = loanHomeBottomInfoView;
        this.f37150g = notifyInfoView;
        this.f37151i = productContentListView;
        this.f37152j = totalOutstandingView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f37144a;
    }
}
