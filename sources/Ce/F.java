package Ce;

import android.text.TextUtils;
import android.view.ViewTreeObserver;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.CommonAdListener;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends CommonAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeFragmentHomeTab f1421b;

    public /* synthetic */ F(HomeFragmentHomeTab homeFragmentHomeTab, int i7) {
        this.f1420a = i7;
        this.f1421b = homeFragmentHomeTab;
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onClick(AdEntity adEntity) {
        switch (this.f1420a) {
            case 0:
                if (!TextUtils.isEmpty(adEntity != null ? adEntity.relativeUrl : null)) {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                } else if (!BaseApplication.hasLogin()) {
                    Pa.i0.K(null, null);
                }
                break;
            case 1:
                if (!TextUtils.isEmpty(adEntity != null ? adEntity.relativeUrl : null)) {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                } else if (!BaseApplication.hasLogin()) {
                    Pa.i0.K(null, null);
                }
                break;
            default:
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.CommonAdListener, com.transsnet.adsdk.interfaces.IAdListener
    public void onLoadFailed() {
        switch (this.f1420a) {
            case 1:
                super.onLoadFailed();
                SingleAdView singleAdView = this.f1421b.f35096C;
                if (singleAdView != null) {
                    p220oa.h.c(singleAdView);
                }
                break;
            case 2:
                super.onLoadFailed();
                MarqueeViewV2 marqueeViewV2 = this.f1421b.f35100Q;
                if (marqueeViewV2 != null) {
                    p220oa.h.s(marqueeViewV2, false);
                }
                break;
            default:
                super.onLoadFailed();
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.CommonAdListener, com.transsnet.adsdk.interfaces.IAdListener
    public void onLoadSuccess() {
        ViewTreeObserver viewTreeObserver;
        switch (this.f1420a) {
            case 0:
                super.onLoadSuccess();
                HomeFragmentHomeTab homeFragmentHomeTab = this.f1421b;
                SingleAdView singleAdView = homeFragmentHomeTab.f35099M;
                if (singleAdView != null && (viewTreeObserver = singleAdView.getViewTreeObserver()) != null) {
                    viewTreeObserver.addOnGlobalLayoutListener(new Be.c(homeFragmentHomeTab, 1));
                    break;
                }
                break;
            case 1:
                super.onLoadSuccess();
                SingleAdView singleAdView2 = this.f1421b.f35096C;
                if (singleAdView2 != null) {
                    p220oa.h.j(singleAdView2, 0, Integer.valueOf(CommonViewExtKt.getDp(16.0f)), Integer.valueOf(CommonViewExtKt.getDp(16.0f)), Integer.valueOf(CommonViewExtKt.getDp(8.0f)));
                }
                break;
            default:
                super.onLoadSuccess();
                break;
        }
    }
}
