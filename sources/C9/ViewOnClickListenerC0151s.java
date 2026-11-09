package C9;

import android.content.Intent;
import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.cash_in.ui.activity.RechargeActivity;
import com.transsnet.palmpay.cash_in.ui.activity.RecordListActivity;
import com.transsnet.palmpay.util.KeyboardUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C9.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0151s implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RechargeActivity f1326b;

    public /* synthetic */ ViewOnClickListenerC0151s(RechargeActivity rechargeActivity, int i7) {
        this.f1325a = i7;
        this.f1326b = rechargeActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RechargeActivity rechargeActivity = this.f1326b;
        switch (this.f1325a) {
            case 0:
                String str = RechargeActivity.f26858r0;
                Intent intent = new Intent(rechargeActivity, (Class<?>) RecordListActivity.class);
                intent.putExtra("extra_type", "01");
                rechargeActivity.startActivity(intent);
                break;
            case 1:
                String str2 = RechargeActivity.f26858r0;
                int id2 = view.getId();
                if (id2 == p366y9.b.rl_select_bank || id2 == p366y9.b.rl_bank_info) {
                    String str3 = rechargeActivity.f26864H;
                    if (Intrinsics.c(str3, RechargeActivity.f26858r0)) {
                        ARouter.getInstance().build("/sm/select_bank_activity").withInt("bank_list_type", 9).navigation(rechargeActivity, 100);
                    } else if (Intrinsics.c(str3, RechargeActivity.f26859s0)) {
                        rechargeActivity.t(true);
                    } else if (Intrinsics.c(str3, RechargeActivity.f26860t0)) {
                        rechargeActivity.t(true);
                    }
                } else if (id2 == p366y9.b.fl_add_bank_account) {
                    rechargeActivity.q();
                }
                break;
            case 2:
                String str4 = RechargeActivity.f26858r0;
                KeyboardUtils.hideSoftInput(rechargeActivity);
                rechargeActivity.finish();
                break;
            case 3:
                String str5 = RechargeActivity.f26858r0;
                rechargeActivity.q();
                break;
            case 4:
                String str6 = RechargeActivity.f26858r0;
                rechargeActivity.m();
                break;
            default:
                rechargeActivity.f26881p0.postDelayed(new Ae.n(rechargeActivity, 4), 100L);
                break;
        }
    }
}
