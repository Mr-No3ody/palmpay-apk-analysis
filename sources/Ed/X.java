package Ed;

import Rd.C0599o;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFragment;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class X extends com.chuanyi.ad.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2349e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2350f;

    public X(TransferToBankHomeFragment transferToBankHomeFragment, SingleAdView singleAdView, String str, ClickEvent clickEvent) {
        this.f2350f = transferToBankHomeFragment;
        this.f21082b = singleAdView;
        this.f21083c = str;
        this.f21084d = clickEvent;
    }

    @Override // com.chuanyi.ad.a, com.transsnet.adsdk.interfaces.IAdListener
    public final void onLoadSuccess() {
        SingleAdView singleAdView;
        SingleAdView singleAdView2;
        Object obj = this.f2350f;
        switch (this.f2349e) {
            case 0:
                p223od.q qVar = (p223od.q) ((TransferToBankHomeFragment) obj).f27335j;
                if (qVar != null && (singleAdView = qVar.f40461d) != null) {
                    p220oa.h.C(singleAdView);
                    break;
                }
                break;
            default:
                KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
                C0599o c0599o = (C0599o) ((BuyBundleHomePageActivity) obj).f27334c;
                if (c0599o != null && (singleAdView2 = c0599o.f8438w) != null) {
                    p220oa.h.s(singleAdView2, true);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(BuyBundleHomePageActivity buyBundleHomePageActivity, SingleAdView singleAdView) {
        super(singleAdView, "Data Bundle Home Page Pocker Banner");
        this.f2350f = buyBundleHomePageActivity;
    }
}
