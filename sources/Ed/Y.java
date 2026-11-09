package Ed;

import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.CommonAdListener;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.ui.widget.DragView;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class Y extends CommonAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToBankHomeFragment f2352b;

    public /* synthetic */ Y(TransferToBankHomeFragment transferToBankHomeFragment, int i7) {
        this.f2351a = i7;
        this.f2352b = transferToBankHomeFragment;
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onClick(AdEntity adEntity) {
        switch (this.f2351a) {
            case 0:
                try {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                break;
            case 1:
                try {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
                break;
            default:
                try {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                } catch (Exception e12) {
                    e12.printStackTrace();
                    return;
                }
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.CommonAdListener, com.transsnet.adsdk.interfaces.IAdListener
    public final void onLoadFailed() {
        DragView dragView;
        MarqueeViewV2 marqueeViewV2;
        SingleAdView singleAdView;
        switch (this.f2351a) {
            case 0:
                super.onLoadFailed();
                p223od.q qVar = (p223od.q) this.f2352b.f27335j;
                if (qVar != null && (dragView = qVar.f40464g) != null) {
                    p220oa.h.c(dragView);
                    break;
                }
                break;
            case 1:
                super.onLoadFailed();
                p223od.q qVar2 = (p223od.q) this.f2352b.f27335j;
                if (qVar2 != null && (marqueeViewV2 = qVar2.f40459b) != null) {
                    p220oa.h.c(marqueeViewV2);
                    break;
                }
                break;
            default:
                super.onLoadFailed();
                p223od.q qVar3 = (p223od.q) this.f2352b.f27335j;
                if (qVar3 != null && (singleAdView = qVar3.f40470w) != null) {
                    p220oa.h.c(singleAdView);
                    break;
                }
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.CommonAdListener, com.transsnet.adsdk.interfaces.IAdListener
    public final void onLoadSuccess() {
        DragView dragView;
        MarqueeViewV2 marqueeViewV2;
        SingleAdView singleAdView;
        switch (this.f2351a) {
            case 0:
                super.onLoadSuccess();
                p223od.q qVar = (p223od.q) this.f2352b.f27335j;
                if (qVar != null && (dragView = qVar.f40464g) != null) {
                    p220oa.h.C(dragView);
                    break;
                }
                break;
            case 1:
                super.onLoadSuccess();
                p223od.q qVar2 = (p223od.q) this.f2352b.f27335j;
                if (qVar2 != null && (marqueeViewV2 = qVar2.f40459b) != null) {
                    p220oa.h.C(marqueeViewV2);
                    break;
                }
                break;
            default:
                super.onLoadSuccess();
                p223od.q qVar3 = (p223od.q) this.f2352b.f27335j;
                if (qVar3 != null && (singleAdView = qVar3.f40470w) != null) {
                    p220oa.h.C(singleAdView);
                    break;
                }
                break;
        }
    }
}
