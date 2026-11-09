package p054dd;

import Pa.n0;
import android.view.View;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.airtime.bean.rsp.Recharge2CashProviderV2Rsp;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashHomeActivity;
import kotlin.Pair;
import p002a.a;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Recharge2CashHomeActivity f35882b;

    public /* synthetic */ g(Recharge2CashHomeActivity recharge2CashHomeActivity, int i7) {
        this.f35881a = i7;
        this.f35882b = recharge2CashHomeActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f35881a) {
            case 0:
                Recharge2CashHomeActivity recharge2CashHomeActivity = this.f35882b;
                Pair pair = new Pair("phone", recharge2CashHomeActivity.f33119j);
                Recharge2CashProviderV2Rsp recharge2CashProviderV2Rsp = recharge2CashHomeActivity.f33120o;
                d.x(a.e(pair, new Pair("code", recharge2CashProviderV2Rsp != null ? recharge2CashProviderV2Rsp.billerName : null)), "TariffPlan");
                n0.g().l("RechargeToCashNewHomePage_TariffPlanPopUp_MigratePlanButton");
                break;
            default:
                Recharge2CashHomeActivity.r(this.f35882b, null, 1);
                break;
        }
    }
}
