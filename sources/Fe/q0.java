package Fe;

import com.transsnet.palmpay.account.bean.rsp.NotificationSettings;
import com.transsnet.palmpay.main.export.bean.req.ThresholdReq;
import com.transsnet.palmpay.ui.mvp.contract.SettingsContract;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 extends com.transsnet.palmpay.core.base.j implements SettingsContract.Presenter {
    @Override // com.transsnet.palmpay.ui.mvp.contract.SettingsContract.Presenter
    public final void createOneStepPayThreshold(ThresholdReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        J3.a.D(this, this.f27351a, new i0(req, null), new g0(this, 0), new Ab.B(28), false, true);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.SettingsContract.Presenter
    public final void logout() {
        J3.a.D(this, this.f27351a, new j0(1, null), new g0(this, 1), new g0(this, 2), false, true);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.SettingsContract.Presenter
    public final void modifyOneStepPayThreshold(ThresholdReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        J3.a.D(this, this.f27351a, new k0(req, null), new g0(this, 6), new g0(this, 7), false, true);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.SettingsContract.Presenter
    public final void queryNotificationSetting() {
        J3.a.D(this, this.f27351a, new l0(1, null), new g0(this, 9), new g0(this, 10), false, false);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.SettingsContract.Presenter
    public final void queryOneStepPayThreshold() {
        J3.a.D(this, this.f27351a, new m0(1, null), new g0(this, 4), new Ab.B(27), false, true);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.SettingsContract.Presenter
    public final void queryPaymentThresholds() {
        J3.a.D(this, this.f27351a, new n0(1, null), new g0(this, 3), new Ab.B(26), false, true);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.SettingsContract.Presenter
    public final void querySettingSwitch() {
        J3.a.D(this, this.f27351a, new o0(1, null), new g0(this, 5), new Ab.B(29), false, false);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.SettingsContract.Presenter
    public final void updateNotificationSetting(NotificationSettings notificationSettings) {
        J3.a.D(this, this.f27351a, new p0(notificationSettings, null), new g0(this, 8), new h0(0), true, true);
    }
}
