package Fe;

import com.transsnet.palmpay.account.bean.rsp.NotificationSettings;
import com.transsnet.palmpay.account.bean.rsp.SettingSwitchRsp;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.main.export.bean.req.ThresholdListRsp;
import com.transsnet.palmpay.main.export.bean.req.ThresholdRsp;
import com.transsnet.palmpay.ui.mvp.contract.SettingsContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f2773b;

    public /* synthetic */ g0(q0 q0Var, int i7) {
        this.f2772a = i7;
        this.f2773b = q0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2772a) {
            case 0:
                CommonResult it = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                SettingsContract.View view = (SettingsContract.View) this.f2773b.f27351a;
                if (view != null) {
                    view.handleCreateOneStepPayThreshold(it);
                }
                break;
            case 1:
                CommonResult it2 = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                SettingsContract.View view2 = (SettingsContract.View) this.f2773b.f27351a;
                if (view2 != null) {
                    view2.handleLogoutRsp(it2);
                }
                break;
            case 2:
                SettingsContract.View view3 = (SettingsContract.View) this.f2773b.f27351a;
                if (view3 != null) {
                    view3.handleLogoutRsp(null);
                }
                break;
            case 3:
                ThresholdListRsp it3 = (ThresholdListRsp) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                SettingsContract.View view4 = (SettingsContract.View) this.f2773b.f27351a;
                if (view4 != null) {
                    view4.handlePaymentThresholds(it3);
                }
                break;
            case 4:
                CommonBeanResult<ThresholdRsp> it4 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                SettingsContract.View view5 = (SettingsContract.View) this.f2773b.f27351a;
                if (view5 != null) {
                    view5.handleOneStepPayThreshold(it4);
                }
                break;
            case 5:
                CommonBeanResult<SettingSwitchRsp> it5 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                SettingsContract.View view6 = (SettingsContract.View) this.f2773b.f27351a;
                if (view6 != null) {
                    view6.handleSettingSwitchRsp(it5);
                }
                break;
            case 6:
                CommonResult it6 = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                SettingsContract.View view7 = (SettingsContract.View) this.f2773b.f27351a;
                if (view7 != null) {
                    view7.handleModifyOneStepPayThreshold(it6);
                }
                break;
            case 7:
                SettingsContract.View view8 = (SettingsContract.View) this.f2773b.f27351a;
                if (view8 != null) {
                    view8.handleModifyOneStepPayThreshold(null);
                }
                break;
            case 8:
                CommonResult it7 = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                SettingsContract.View view9 = (SettingsContract.View) this.f2773b.f27351a;
                if (view9 != null) {
                    view9.handleUpdateNotificationSettingsResult(it7);
                }
                break;
            case 9:
                CommonBeanResult<NotificationSettings> it8 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                SettingsContract.View view10 = (SettingsContract.View) this.f2773b.f27351a;
                if (view10 != null) {
                    view10.handleNotificationSettings(it8);
                }
                break;
            default:
                SettingsContract.View view11 = (SettingsContract.View) this.f2773b.f27351a;
                if (view11 != null) {
                    view11.handleNotificationSettings(null);
                }
                break;
        }
        return Unit.f38893a;
    }
}
