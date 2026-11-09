package p099gb;

import android.view.View;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.credit.view.LoanHomeBottomInfoView;
import com.transsnet.palmpay.credit.view.LoanOutstandingSummaryView;
import com.transsnet.palmpay.credit.view.ProductContentListView;
import com.transsnet.palmpay.custom_view.ReboundScrollView;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f37161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SingleAdView f37162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReboundScrollView f37163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewStub f37164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SwipeRefreshLayout f37165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LoanHomeBottomInfoView f37166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LoanOutstandingSummaryView f37167g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ProductContentListView f37168i;

    public i(ConstraintLayout constraintLayout, SingleAdView singleAdView, ReboundScrollView reboundScrollView, ViewStub viewStub, SwipeRefreshLayout swipeRefreshLayout, LoanHomeBottomInfoView loanHomeBottomInfoView, LoanOutstandingSummaryView loanOutstandingSummaryView, ProductContentListView productContentListView) {
        this.f37161a = constraintLayout;
        this.f37162b = singleAdView;
        this.f37163c = reboundScrollView;
        this.f37164d = viewStub;
        this.f37165e = swipeRefreshLayout;
        this.f37166f = loanHomeBottomInfoView;
        this.f37167g = loanOutstandingSummaryView;
        this.f37168i = productContentListView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f37161a;
    }
}
