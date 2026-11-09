package Ce;

import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.CommonAdListener;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import com.zhpan.indicator.IndicatorView;

/* JADX INFO: loaded from: classes4.dex */
public final class E extends CommonAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1419c;

    public /* synthetic */ E(int i7, Object obj, Object obj2) {
        this.f1417a = i7;
        this.f1418b = obj;
        this.f1419c = obj2;
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onClick(AdEntity adEntity) {
        switch (this.f1417a) {
            case 0:
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 1:
                if (adEntity != null) {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                }
                break;
            default:
                if (adEntity != null) {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                }
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.CommonAdListener, com.transsnet.adsdk.interfaces.IAdListener
    public final void onLoadFailed() {
        switch (this.f1417a) {
            case 0:
                super.onLoadFailed();
                IndicatorView indicatorView = (IndicatorView) this.f1418b;
                if (indicatorView != null) {
                    p220oa.h.s(indicatorView, false);
                }
                BannerAdView bannerAdView = ((HomeFragmentHomeTab) this.f1419c).f35098L;
                if (bannerAdView != null) {
                    p220oa.h.s(bannerAdView, false);
                }
                break;
            case 1:
                ((Hb.r) this.f1418b).f3848f = false;
                ((SingleAdView) this.f1419c).setVisibility(8);
                break;
            default:
                ((Hb.H) this.f1418b).f3804f = false;
                ((SingleAdView) this.f1419c).setVisibility(8);
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.CommonAdListener, com.transsnet.adsdk.interfaces.IAdListener
    public void onLoadSuccess() {
        switch (this.f1417a) {
            case 1:
                Hb.r rVar = (Hb.r) this.f1418b;
                rVar.f3848f = true;
                ((SingleAdView) this.f1419c).setVisibility(!rVar.f3847e ? 8 : 0);
                break;
            case 2:
                Hb.H h7 = (Hb.H) this.f1418b;
                h7.f3804f = true;
                ((SingleAdView) this.f1419c).setVisibility(!h7.f3803e ? 8 : 0);
                break;
            default:
                super.onLoadSuccess();
                break;
        }
    }
}
