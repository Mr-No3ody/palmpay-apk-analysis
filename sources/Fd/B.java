package Fd;

import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.CommonAdListener;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.ui.widget.DragView;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends CommonAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayHomeFragment f2651b;

    public /* synthetic */ B(TransferToPalmPayHomeFragment transferToPalmPayHomeFragment, int i7) {
        this.f2650a = i7;
        this.f2651b = transferToPalmPayHomeFragment;
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onClick(AdEntity adEntity) {
        switch (this.f2650a) {
            case 0:
                try {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
                break;
            case 1:
                try {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                break;
            case 2:
                try {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                } catch (Exception e12) {
                    e12.printStackTrace();
                    return;
                }
                break;
            default:
                try {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                } catch (Exception e13) {
                    e13.printStackTrace();
                    return;
                }
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.CommonAdListener, com.transsnet.adsdk.interfaces.IAdListener
    public final void onLoadFailed() {
        DragView dragView;
        SingleAdView singleAdView;
        SingleAdView singleAdView2;
        MarqueeViewV2 marqueeViewV2;
        switch (this.f2650a) {
            case 0:
                super.onLoadFailed();
                p223od.r rVar = (p223od.r) this.f2651b.f27335j;
                if (rVar != null && (dragView = rVar.f40484f) != null) {
                    p220oa.h.c(dragView);
                    break;
                }
                break;
            case 1:
                super.onLoadFailed();
                p223od.r rVar2 = (p223od.r) this.f2651b.f27335j;
                if (rVar2 != null && (singleAdView = rVar2.f40490v) != null) {
                    p220oa.h.c(singleAdView);
                    break;
                }
                break;
            case 2:
                super.onLoadFailed();
                p223od.r rVar3 = (p223od.r) this.f2651b.f27335j;
                if (rVar3 != null && (singleAdView2 = rVar3.f40491w) != null) {
                    p220oa.h.c(singleAdView2);
                    break;
                }
                break;
            default:
                super.onLoadFailed();
                p223od.r rVar4 = (p223od.r) this.f2651b.f27335j;
                if (rVar4 != null && (marqueeViewV2 = rVar4.f40481c) != null) {
                    p220oa.h.c(marqueeViewV2);
                    break;
                }
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.CommonAdListener, com.transsnet.adsdk.interfaces.IAdListener
    public final void onLoadSuccess() {
        DragView dragView;
        SingleAdView singleAdView;
        SingleAdView singleAdView2;
        MarqueeViewV2 marqueeViewV2;
        switch (this.f2650a) {
            case 0:
                super.onLoadSuccess();
                p223od.r rVar = (p223od.r) this.f2651b.f27335j;
                if (rVar != null && (dragView = rVar.f40484f) != null) {
                    p220oa.h.C(dragView);
                    break;
                }
                break;
            case 1:
                super.onLoadSuccess();
                p223od.r rVar2 = (p223od.r) this.f2651b.f27335j;
                if (rVar2 != null && (singleAdView = rVar2.f40490v) != null) {
                    p220oa.h.C(singleAdView);
                    break;
                }
                break;
            case 2:
                super.onLoadSuccess();
                p223od.r rVar3 = (p223od.r) this.f2651b.f27335j;
                if (rVar3 != null && (singleAdView2 = rVar3.f40491w) != null) {
                    p220oa.h.C(singleAdView2);
                    break;
                }
                break;
            default:
                super.onLoadSuccess();
                p223od.r rVar4 = (p223od.r) this.f2651b.f27335j;
                if (rVar4 != null && (marqueeViewV2 = rVar4.f40481c) != null) {
                    p220oa.h.C(marqueeViewV2);
                    break;
                }
                break;
        }
    }
}
