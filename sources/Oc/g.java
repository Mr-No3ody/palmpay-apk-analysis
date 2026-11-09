package Oc;

import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import com.transsnet.palmpay.managemoney.ui.activity.CashBoxMainActivity;
import com.transsnet.palmpay.managemoney.ui.dialog.CashCouponFailDialogFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements BaseDialogFragment.OnDialogDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CashCouponFailDialogFragment f6764a;

    public g(CashCouponFailDialogFragment cashCouponFailDialogFragment) {
        this.f6764a = cashCouponFailDialogFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment.OnDialogDismissListener
    public final void onDismiss() {
        androidx.fragment.app.E activity = this.f6764a.getActivity();
        if (activity == null || !(activity instanceof CashBoxMainActivity)) {
            return;
        }
        p059e1.a.X("SHOW_NEWER_TIP", true);
        com.palmpay.lib.apm.launchcounter.util.d.F("/manage_money/cash_box_main_activity");
        ((CashBoxMainActivity) activity).finish();
    }
}
