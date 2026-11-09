package Ua;

import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnHomePageActivity;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnResolveActivity;
import com.transsnet.palmpay.jara_packet.ui.fragment.ReferEarnWithdrawListFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ua.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0615a implements AdShowCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9380b;

    public /* synthetic */ C0615a(Object obj, int i7) {
        this.f9379a = i7;
        this.f9380b = obj;
    }

    @Override // com.transsnet.adsdk.widgets.interfaces.AdShowCallback
    public final void showAppAd(AdEntity adEntity) {
        switch (this.f9379a) {
            case 0:
                if ("RATE_DIALOG".equals(adEntity.relativeUrl)) {
                    p367ya.a.d().j();
                    ARouter.getInstance().build("/app/rate_app_activity").withFlags(268435456).navigation(((com.transsnet.palmpay.core.viewmodel.a) this.f9380b).f28574a.getContext());
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                if ("RATE_DIALOG".equalsIgnoreCase(adEntity.relativeUrl)) {
                    p367ya.a.d().j();
                    ARouter.getInstance().build("/app/rate_app_activity").withFlags(268435456).navigation((ReferEarnHomePageActivity) this.f9380b);
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                if ("RATE_DIALOG".equalsIgnoreCase(adEntity.relativeUrl)) {
                    p367ya.a.d().j();
                    ARouter.getInstance().build("/app/rate_app_activity").withFlags(268435456).navigation((ReferEarnResolveActivity) this.f9380b);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                if ("RATE_DIALOG".equalsIgnoreCase(adEntity.relativeUrl)) {
                    p367ya.a.d().j();
                    ARouter.getInstance().build("/app/rate_app_activity").withFlags(268435456).navigation(((ReferEarnWithdrawListFragment) this.f9380b).requireContext());
                }
                break;
        }
    }
}
