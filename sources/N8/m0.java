package N8;

import Rd.C0599o;
import android.content.Intent;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountActivity;
import com.transsnet.palmpay.airtime.ui.ScheduleTopUpHomeActivity;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.managemoney.ui.activity.PlanBreakPreDetailActivity;
import com.transsnet.palmpay.managemoney.ui.dialog.TurnOnAutoSaveSuccessDialogFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.PlanDetailViewModel;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentElectricityHomeFragment;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentTvHomeFragment;
import com.transsnet.palmpay.teller.ui.view.ModelBillerTipsInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6241b;

    public /* synthetic */ m0(Object obj, int i7) {
        this.f6240a = i7;
        this.f6241b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ModelBillerTipsInfo modelBillerTipsInfo;
        ModelBillerTipsInfo modelBillerTipsInfo2;
        String stringExtra;
        PlanDetailViewModel planDetailViewModel;
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout;
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout2;
        int i7 = 1;
        Object obj = this.f6241b;
        switch (this.f6240a) {
            case 0:
                VerifyAccountActivity verifyAccountActivity = (VerifyAccountActivity) obj;
                io.fastkv.n.O(verifyAccountActivity, 0, null, "Security Check", null, null, null, "To securely update your PIN or password, we require location access to detect suspicious activity and prevent fraud.", Integer.valueOf(p025ba.k.core_agree), null, new k0(verifyAccountActivity, i7), Integer.valueOf(p025ba.k.core_not_now), null, null, null, false, 0, 8385147);
                break;
            case 1:
                int i10 = BillPaymentElectricityHomeFragment.f34255z0;
                BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment = (BillPaymentElectricityHomeFragment) obj;
                Rd.f0 f0Var = (Rd.f0) billPaymentElectricityHomeFragment.f27335j;
                if (f0Var != null && (modelBillerTipsInfo = f0Var.f8281A) != null) {
                    BillerListItemBean billerListItemBean = billPaymentElectricityHomeFragment.f34265Z;
                    String billerId = billerListItemBean != null ? billerListItemBean.getBillerId() : null;
                    BillerListItemBean billerListItemBean2 = billPaymentElectricityHomeFragment.f34265Z;
                    modelBillerTipsInfo.b(billerId, billerListItemBean2 != null ? billerListItemBean2.getBillerName() : null);
                }
                break;
            case 2:
                int i11 = BillPaymentTvHomeFragment.f34295v0;
                BillPaymentTvHomeFragment billPaymentTvHomeFragment = (BillPaymentTvHomeFragment) obj;
                Rd.g0 g0Var = (Rd.g0) billPaymentTvHomeFragment.f27335j;
                if (g0Var != null && (modelBillerTipsInfo2 = g0Var.f8307A) != null) {
                    BillerListItemBean billerListItemBean3 = billPaymentTvHomeFragment.f34306k0;
                    String billerId2 = billerListItemBean3 != null ? billerListItemBean3.getBillerId() : null;
                    BillerListItemBean billerListItemBean4 = billPaymentTvHomeFragment.f34306k0;
                    modelBillerTipsInfo2.b(billerId2, billerListItemBean4 != null ? billerListItemBean4.getBillerName() : null);
                }
                break;
            case 3:
                PlanBreakPreDetailActivity planBreakPreDetailActivity = (PlanBreakPreDetailActivity) obj;
                Intent intent = planBreakPreDetailActivity.getIntent();
                if (intent != null && (stringExtra = intent.getStringExtra("orderNo")) != null && (planDetailViewModel = (PlanDetailViewModel) planBreakPreDetailActivity.l()) != null) {
                    planDetailViewModel.d(stringExtra);
                }
                break;
            case 4:
                androidx.fragment.app.E activity = ((TurnOnAutoSaveSuccessDialogFragment) obj).getActivity();
                if (activity != null) {
                    activity.finish();
                }
                break;
            case 5:
                KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
                C0599o c0599o = (C0599o) ((BuyBundleHomePageActivity) obj).f27334c;
                if (c0599o != null && (modelMobileWithIconInputLayout = c0599o.f8429d) != null) {
                    modelMobileWithIconInputLayout.showContactIv(true, true);
                }
                break;
            case 6:
                ((ScheduleTopUpHomeActivity) obj).f26472d = true;
                break;
            default:
                int i12 = TopupAirtimeActivity.f26495x0;
                Rd.H h7 = (Rd.H) ((TopupAirtimeActivity) obj).f27334c;
                if (h7 != null && (modelMobileWithIconInputLayout2 = h7.f8066g) != null) {
                    modelMobileWithIconInputLayout2.showContactIv(true, true);
                }
                break;
        }
        return Unit.f38893a;
    }
}
