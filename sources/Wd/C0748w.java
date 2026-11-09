package Wd;

import Pa.n0;
import android.content.Intent;
import android.text.TextUtils;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.send_money.ui.activity.TransferResultActivity;
import com.transsnet.palmpay.teller.ui.activity.BillerTransactionResultActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Wd.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0748w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseMvvmVBActivity f10791c;

    public /* synthetic */ C0748w(boolean z3, BaseMvvmVBActivity baseMvvmVBActivity, int i7) {
        this.f10789a = i7;
        this.f10790b = z3;
        this.f10791c = baseMvvmVBActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Intent intentA;
        switch (this.f10789a) {
            case 0:
                String str = (String) obj;
                if (this.f10790b) {
                    n0.g().k(new ClickEvent("t3_upgrade_electricity_popup_click").add("Level", BaseApplication.get().getUser().getMobileMoneyAccountTier()));
                }
                if (!TextUtils.isEmpty(str) && (intentA = Pa.F.a((BillerTransactionResultActivity) this.f10791c, str)) != null) {
                    ActivityUtils.startActivity(intentA);
                }
                break;
            default:
                if (this.f10790b) {
                    com.palmpay.lib.apm.launchcounter.util.d.x(null, "NotificationSettings");
                } else {
                    Oe.d.h((TransferResultActivity) this.f10791c);
                }
                break;
        }
        return Unit.f38893a;
    }
}
