package C9;

import Pa.i0;
import Pa.r0;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.cash_in.ui.activity.FundResultActivity;
import com.transsnet.palmpay.managemoney.ui.activity.PlanDetailActivity;
import com.transsnet.palmpay.p2pcash.ui.atm.view.AgentItemView;
import com.transsnet.palmpay.p2pcash.ui.atm.view.AppointDetailView;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.IntentUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.ToastUtils;

/* JADX INFO: renamed from: C9.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0150q implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1323b;

    public /* synthetic */ ViewOnClickListenerC0150q(String str, int i7) {
        this.f1322a = i7;
        this.f1323b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent openUrlIntent;
        String str = this.f1323b;
        switch (this.f1322a) {
            case 0:
                String[] strArr = FundResultActivity.f26846v;
                ARouter.getInstance().build("/cash_in_out/billdetail").withString("orderNo", str).withString("extra_type", "01").navigation();
                break;
            case 1:
                i0.b0("/compensation/#/home");
                F6.d.h("debug_tag", 3, "3 tvPendingMsg. setText, pendingMessage:" + str);
                break;
            case 2:
                ClipboardUtils.copyText(str);
                ToastUtils.showLong(Sc.e.p2p_str_copied);
                break;
            case 3:
                int i7 = AgentItemView.f32934f;
                PhoneUtils.dial(r0.w0(str));
                break;
            case 4:
                int i10 = AppointDetailView.f32944o;
                if (!TextUtils.isEmpty(str)) {
                    ClipboardUtils.copyText(str);
                    ToastUtils.showLong(Sc.e.p2p_str_copied);
                }
                break;
            case 5:
                int i11 = PlanDetailActivity.f32158s0;
                com.palmpay.lib.apm.launchcounter.util.d.H("/manage_money/plan_break_pre_activity", "orderNo", str);
                break;
            case 6:
                int i12 = PlanDetailActivity.f32158s0;
                com.palmpay.lib.apm.launchcounter.util.d.H("/manage_money/plan_break_pre_activity", "orderNo", str);
                break;
            default:
                if (str != null && (openUrlIntent = IntentUtils.getOpenUrlIntent(str, true)) != null) {
                    ActivityUtils.startActivity(openUrlIntent);
                    break;
                }
                break;
        }
    }
}
