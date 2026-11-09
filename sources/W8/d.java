package W8;

import N8.q0;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.view.View;
import com.google.api.Service;
import com.transsnet.palmpay.account.ui.fragment.login.LogInInputMobileFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithFaceFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithPinFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithPswFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithRiskControlSmsFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithSmsFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithTouchIdFragment;
import com.transsnet.palmpay.account.ui.fragment.setpin.SetNewPswFragment;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStep1Fragment;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStepInputPinV2Fragment;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStepOtcFragment;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.ui.activity.AddBankCardAccountActivity;
import com.transsnet.palmpay.core.ui.activity.AddNewCardWithPaymentActivity;
import com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity;
import com.transsnet.palmpay.teller.ui.activity.BillPaymentOrderDetailActivity;
import com.transsnet.palmpay.teller.ui.dialog.PickBillerDialog;
import com.transsnet.palmpay.teller.ui.view.ModelPointClaimItem;
import com.transsnet.palmpay.util.ToastUtils;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10578a;

    public /* synthetic */ d(int i7) {
        this.f10578a = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f10578a) {
            case 0:
                int i7 = LogInInputMobileFragment.f26194C;
                i0.b0("/h5/help/service?entryType=login");
                break;
            case 1:
                int i10 = LogInInputMobileFragment.f26194C;
                i0.b0("/h5/help/service?entryType=login");
                break;
            case 2:
                i0.b0("/h5/help/service?entryType=login");
                break;
            case 3:
                int i11 = LogInWithFaceFragment.f26205B;
                i0.b0("/h5/help/service?entryType=login");
                break;
            case 4:
                int i12 = LogInWithPinFragment.f26213p;
                i0.b0("/h5/help/service?entryType=login");
                break;
            case 5:
                int i13 = LogInWithPswFragment.f26216p;
                i0.b0("/h5/help/service?entryType=login");
                break;
            case 6:
                int i14 = LogInWithRiskControlSmsFragment.t;
                i0.b0("/h5/help/service?entryType=login");
                break;
            case 7:
                int i15 = LogInWithSmsFragment.f26222C;
                i0.b0("/h5/help/service?entryType=login");
                break;
            case 8:
                int i16 = LogInWithTouchIdFragment.f26230C;
                i0.b0("/h5/help/service?entryType=login");
                break;
            case 9:
                q0.u("/contact/add");
                break;
            case 10:
                q0.u("/contact/add");
                break;
            case 11:
                BillPaymentOrderDetailActivity.a aVar = BillPaymentOrderDetailActivity.f34162i;
                com.palmpay.lib.apm.launchcounter.util.d.x(null, "Coupon");
                break;
            case 12:
                PickBillerDialog.initViews$lambda$5(view);
                break;
            case 13:
                SetNewPswFragment.a aVar2 = SetNewPswFragment.f26249j;
                if (!BaseApplication.hasLogin()) {
                    i0.b0("/h5/help/service?entryType=login");
                } else {
                    i0.b0("/h5/help/service");
                }
                break;
            case 14:
                ToastUtils.showLong(Pd.f.qt_network_connection_tips);
                break;
            case 15:
                SignUpStep1Fragment.a aVar3 = SignUpStep1Fragment.f26251u0;
                i0.b0("/h5/help/service?entryType=register");
                break;
            case 16:
                SignUpStep1Fragment.a aVar4 = SignUpStep1Fragment.f26251u0;
                i0.b0("/h5/help/service?entryType=login");
                break;
            case 17:
                n0.g().l("SignUpMobilePopupWait");
                break;
            case 18:
                SignUpStepInputPinV2Fragment.a aVar5 = SignUpStepInputPinV2Fragment.f26273A;
                i0.b0("/h5/help/service?entryType=register");
                break;
            case 19:
                n0.g().l("SignUpSetPINPopupWait");
                break;
            case 20:
                SignUpStepOtcFragment.a aVar6 = SignUpStepOtcFragment.f26279v;
                i0.b0("/h5/help/service?entryType=register");
                break;
            case 21:
                n0.g().l("SignUpOtpPopupWait");
                break;
            case 22:
                n0.g().l("BillDetailsClick");
                i0.b0("/lego-ssr-h5?id=h5/kyc-upgrade-boot");
                break;
            case 23:
                if (!BaseApplication.hasLogin()) {
                    i0.b0("/h5/help/service?entryType=login");
                } else {
                    i0.b0(com.transsnet.palmpay.core.config.d.a(null));
                }
                break;
            case 24:
                int i17 = ModelPointClaimItem.f34347a;
                if (!r0.U0()) {
                    com.palmpay.lib.apm.launchcounter.util.d.x(null, "PointHome");
                    break;
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                int i18 = ModelPointClaimItem.f34347a;
                if (!r0.U0()) {
                    com.palmpay.lib.apm.launchcounter.util.d.x(null, "PointHome");
                    break;
                }
                break;
            case 26:
                int i19 = AddBankCardAccountActivity.f27411f;
                i0.b0("/#/activity/faq/bind-card");
                break;
            case 27:
                int i20 = AddNewCardWithPaymentActivity.f27421r0;
                i0.b0("/#/activity/faq/bind-card");
                break;
            case 28:
                int i21 = BaseCoreCashierPreviewActivity.f27451C;
                i0.H(null);
                break;
            default:
                i0.H(null);
                break;
        }
    }
}
