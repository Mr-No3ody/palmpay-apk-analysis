package Ce;

import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.CommonAdListener;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;

/* JADX INFO: loaded from: classes4.dex */
public final class G extends CommonAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SingleAdView f1423b;

    public /* synthetic */ G(SingleAdView singleAdView, int i7) {
        this.f1422a = i7;
        this.f1423b = singleAdView;
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onClick(AdEntity adEntity) {
        switch (this.f1422a) {
            case 0:
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 1:
                try {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
                break;
            default:
                try {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.CommonAdListener, com.transsnet.adsdk.interfaces.IAdListener
    public void onLoadFailed() {
        switch (this.f1422a) {
            case 1:
                super.onLoadFailed();
                SingleAdView singleAdView = this.f1423b;
                if (singleAdView != null) {
                    singleAdView.setVisibility(8);
                }
                break;
            case 2:
                super.onLoadFailed();
                SingleAdView singleAdView2 = this.f1423b;
                if (singleAdView2 != null) {
                    singleAdView2.setVisibility(8);
                }
                break;
            default:
                super.onLoadFailed();
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.CommonAdListener, com.transsnet.adsdk.interfaces.IAdListener
    public final void onLoadSuccess() {
        switch (this.f1422a) {
            case 0:
                super.onLoadSuccess();
                p220oa.h.j(this.f1423b, Integer.valueOf(CommonViewExtKt.getDp(8.0f)), Integer.valueOf(CommonViewExtKt.getDp(16.0f)), Integer.valueOf(CommonViewExtKt.getDp(16.0f)), 0);
                break;
            case 1:
                super.onLoadSuccess();
                SingleAdView singleAdView = this.f1423b;
                if (singleAdView != null) {
                    singleAdView.setVisibility(0);
                }
                break;
            default:
                super.onLoadSuccess();
                SingleAdView singleAdView2 = this.f1423b;
                if (singleAdView2 != null) {
                    singleAdView2.setVisibility(0);
                }
                break;
        }
    }

    public G(SingleAdView singleAdView) {
        this.f1422a = 0;
        this.f1423b = singleAdView;
    }
}
