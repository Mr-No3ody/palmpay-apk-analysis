package N8;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.navigation.fragment.NavHostFragment;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.core.bean.rsp.CommonShareNewRsp;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxUseCouponResultDialogFragment;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.ToastUtils;

/* JADX INFO: renamed from: N8.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0468l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6234c;

    public /* synthetic */ ViewOnClickListenerC0468l(LogInActivity logInActivity, boolean z3) {
        this.f6232a = 0;
        this.f6234c = logInActivity;
        this.f6233b = z3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0.P pF;
        C0.P pF2;
        C0.P pF3;
        Object obj = this.f6234c;
        boolean z3 = this.f6233b;
        switch (this.f6232a) {
            case 0:
                LogInActivity logInActivity = (LogInActivity) obj;
                NavHostFragment navHostFragment = logInActivity.f25886Y;
                if (navHostFragment != null && (pF3 = navHostFragment.f()) != null) {
                    pF3.k(F8.d.fragment_login_verify_touch_id, true);
                }
                io.fastkv.n.L(logInActivity.f25879B, false);
                if (!z3) {
                    NavHostFragment navHostFragment2 = logInActivity.f25886Y;
                    if (navHostFragment2 != null && (pF = navHostFragment2.f()) != null) {
                        pF.h(F8.d.fragment_login_verify_pin, null, null);
                        break;
                    }
                } else {
                    NavHostFragment navHostFragment3 = logInActivity.f25886Y;
                    if (navHostFragment3 != null && (pF2 = navHostFragment3.f()) != null) {
                        pF2.h(F8.d.fragment_login_verify_psw, null, null);
                        break;
                    }
                }
                break;
            case 1:
                CashBoxUseCouponResultDialogFragment.a aVar = CashBoxUseCouponResultDialogFragment.f32289C;
                if (z3) {
                    ARouter.getInstance().build("/manage_money/cash_box_deposit_withdraw_activity").withInt("cash_box_type", 1).navigation();
                }
                ((CashBoxUseCouponResultDialogFragment) obj).dismiss();
                break;
            case 2:
                if (z3) {
                    Context context = (Context) obj;
                    if (context instanceof Activity) {
                        ((Activity) context).finish();
                    }
                }
                break;
            default:
                if (z3) {
                    ClipboardUtils.copyText(((CommonShareNewRsp.ShareItem) obj).itemUrl);
                    ToastUtils.showLong(p025ba.k.core_copy_success);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0468l(boolean z3, Object obj, int i7) {
        this.f6232a = i7;
        this.f6233b = z3;
        this.f6234c = obj;
    }
}
