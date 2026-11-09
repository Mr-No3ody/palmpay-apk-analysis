package p310ub;

import android.widget.LinearLayout;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.CommonAdListener;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyResultActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ub.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2096q extends CommonAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcApplyResultActivity f42906b;

    public /* synthetic */ C2096q(OcApplyResultActivity ocApplyResultActivity, int i7) {
        this.f42905a = i7;
        this.f42906b = ocApplyResultActivity;
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onClick(AdEntity adEntity) {
        switch (this.f42905a) {
            case 0:
                OcApplyResultActivity.n(this.f42906b, adEntity);
                break;
            case 1:
                OcApplyResultActivity.n(this.f42906b, adEntity);
                break;
            case 2:
                OcApplyResultActivity.n(this.f42906b, adEntity);
                break;
            case 3:
                OcApplyResultActivity.n(this.f42906b, adEntity);
                break;
            case 4:
                OcApplyResultActivity.n(this.f42906b, adEntity);
                break;
            default:
                OcApplyResultActivity.n(this.f42906b, adEntity);
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.CommonAdListener, com.transsnet.adsdk.interfaces.IAdListener
    public void onLoadFailed() {
        switch (this.f42905a) {
            case 0:
                super.onLoadFailed();
                Object value = this.f42906b.f29311q0.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((LinearLayout) value).setVisibility(8);
                break;
            default:
                super.onLoadFailed();
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.CommonAdListener, com.transsnet.adsdk.interfaces.IAdListener
    public void onLoadSuccess() {
        switch (this.f42905a) {
            case 0:
                super.onLoadSuccess();
                Object value = this.f42906b.f29311q0.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((LinearLayout) value).setVisibility(0);
                break;
            default:
                super.onLoadSuccess();
                break;
        }
    }
}
