package Ea;

import Pa.i0;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.CommonAdListener;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.adsdk.widgets.banner.BannerAdView;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends CommonAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Boolean f2266c;

    public /* synthetic */ b(Object obj, Boolean bool, int i7) {
        this.f2264a = i7;
        this.f2265b = obj;
        this.f2266c = bool;
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onClick(AdEntity adEntity) {
        switch (this.f2264a) {
            case 0:
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 1:
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            default:
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.CommonAdListener, com.transsnet.adsdk.interfaces.IAdListener
    public final void onLoadFailed() {
        switch (this.f2264a) {
            case 0:
                super.onLoadFailed();
                if (this.f2266c.booleanValue()) {
                    Object obj = this.f2265b;
                    if (i0.X(((SingleAdView) obj).getContext())) {
                        ((SingleAdView) obj).setVisibility(8);
                        break;
                    }
                }
                break;
            case 1:
                super.onLoadFailed();
                if (this.f2266c.booleanValue()) {
                    Object obj2 = this.f2265b;
                    if (i0.X(((BannerAdView) obj2).getContext())) {
                        ((BannerAdView) obj2).setVisibility(8);
                        break;
                    }
                }
                break;
            default:
                super.onLoadFailed();
                if (this.f2266c.booleanValue()) {
                    Object obj3 = this.f2265b;
                    if (i0.X(((MarqueeView) obj3).getContext())) {
                        ((MarqueeView) obj3).setVisibility(8);
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.CommonAdListener, com.transsnet.adsdk.interfaces.IAdListener
    public final void onLoadSuccess() {
        switch (this.f2264a) {
            case 0:
                super.onLoadSuccess();
                Object obj = this.f2265b;
                if (i0.X(((SingleAdView) obj).getContext())) {
                    ((SingleAdView) obj).setVisibility(0);
                    break;
                }
                break;
            case 1:
                super.onLoadSuccess();
                Object obj2 = this.f2265b;
                if (i0.X(((BannerAdView) obj2).getContext())) {
                    ((BannerAdView) obj2).setVisibility(0);
                    break;
                }
                break;
            default:
                super.onLoadSuccess();
                Object obj3 = this.f2265b;
                if (i0.X(((MarqueeView) obj3).getContext())) {
                    ((MarqueeView) obj3).setVisibility(0);
                    break;
                }
                break;
        }
    }
}
