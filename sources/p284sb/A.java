package p284sb;

import C0.G;
import N8.q0;
import Pa.i0;
import Pa.n0;
import Ya.e;
import android.os.Bundle;
import android.view.View;
import com.google.api.Service;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.account.bean.ResetPinVerifyTypeRsp;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.ui.activity.PayShopPaymentResultActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBorrowResultActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLPermissionActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepayOrderDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentExtendActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentResultActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyResultActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcAuthActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcAutoRepaymentExplainActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcFeedbackDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcGetInstallmentCreditActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcInstallmentBillDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcInstallmentRepayActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcReferEarnActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayExtendActivity;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.send_money.ui.activity.pay_me.PayMeActivity;
import com.transsnet.palmpay.ui.activity.settings.AccountNumberActivity;
import com.transsnet.palmpay.ui.activity.settings.PersonalActivityV2;
import com.transsnet.palmpay.util.SPUtils;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class A implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42111a;

    public /* synthetic */ A(int i7) {
        this.f42111a = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f42111a) {
            case 0:
                int i7 = PayShopPaymentResultActivity.f28737Q;
                i0.b0("/compensation/#/home");
                break;
            case 1:
                AccountNumberActivity.a aVar = AccountNumberActivity.f34946b;
                d.H("/account/verifyAccount", "extra_type", SecurityVerifyMethodReq.LOGIN_CHANGE_PHONE);
                break;
            case 2:
                int i10 = PersonalActivityV2.f34952C;
                d.H("/account/verifyAccount", "extra_type", SecurityVerifyMethodReq.LOGIN_CHANGE_PHONE);
                break;
            case 3:
                int i11 = PersonalActivityV2.f34952C;
                i0.b0("/settings/upgrape-kyc/occupation");
                break;
            case 4:
                int i12 = PersonalActivityV2.f34952C;
                n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Me setting")).add("element_name", "Friend"));
                d.F("/contact/palmpay_list");
                break;
            case 5:
                int i13 = PersonalActivityV2.f34952C;
                n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "KYC information")).add("element_name", "Address"));
                i0.b0("/settings/upgrape-kyc/complete-address");
                break;
            case 6:
                int i14 = PersonalActivityV2.f34952C;
                n0.g().k(((ClickEvent) G.f("my_profile_page_element_click", "module_name", "Me setting")).add("element_name", ResetPinVerifyTypeRsp.VERIFY_TYPE_EMAIL));
                i0.b0("/settings/verify-email/home?securityPage=true&sceneSource=3");
                break;
            case 7:
                int i15 = CLBorrowResultActivity.f28876k0;
                q0.v("/main/home", "tab", "me");
                break;
            case 8:
                int i16 = CLPermissionActivity.f29010j;
                i0.b0("/#/cashloan/how-to-manually-open-system");
                break;
            case 9:
                int i17 = CLPermissionActivity.f29010j;
                i0.b0("/#/cashloan/how-to-manually-open-system");
                break;
            case 10:
                int i18 = CLPermissionActivity.f29010j;
                i0.b0("/#/cashloan/how-to-manually-open-system");
                break;
            case 11:
                int i19 = CLRepayOrderDetailActivity.f29020M;
                d.w(GetCustomerServiceUrlReq.ENTER_TYPE_FLEXI);
                break;
            case 12:
                int i20 = CLRepaymentExtendActivity.f29065L;
                d.w(GetCustomerServiceUrlReq.ENTER_TYPE_FLEXI);
                break;
            case 13:
                int i21 = CLRepaymentResultActivity.f29111q0;
                d.F("/credit_score/unfreeze_activity");
                break;
            case 14:
                int i22 = PayMeActivity.t;
                SPUtils.getInstance().put("voice_notification_dialog_show", false);
                break;
            case 15:
                int i23 = OcApplyBaseActivity.f29246X;
                break;
            case 16:
                int i24 = OcApplyResultActivity.f29276O0;
                q0.u("/main/home");
                break;
            case 17:
                int i25 = OcApplyResultActivity.f29276O0;
                d.x(null, "LoanFlexi");
                break;
            case 18:
                int i26 = OcAuthActivity.f29323g;
                break;
            case 19:
                int i27 = OcAutoRepaymentExplainActivity.f29327B;
                q0.v("/main/home", "tab", "finance");
                break;
            case 20:
                int i28 = OcAutoRepaymentExplainActivity.f29327B;
                q0.u("/credit_score/oc_main_activity");
                break;
            case 21:
                int i29 = OcFeedbackDetailActivity.f29439L;
                d.w(GetCustomerServiceUrlReq.ENTER_TYPE_FLEXI);
                break;
            case 22:
                int i30 = OcGetInstallmentCreditActivity.f29458v0;
                Bundle bundle = new Bundle();
                bundle.putString("type", "okc");
                d.x(bundle, "TermsAndConditions");
                break;
            case 23:
                int i31 = OcInstallmentBillDetailActivity.f29507X;
                break;
            case 24:
                int i32 = OcInstallmentBillDetailActivity.f29507X;
                int id2 = view.getId();
                if (id2 == s.atubd_contact_service_tv) {
                    i0.c0(com.transsnet.palmpay.core.config.d.a(GetCustomerServiceUrlReq.ENTER_TYPE_MY_STORE));
                } else if (id2 == e.payment_plan_content_tv) {
                    d.F("/credit_score/oc_main_activity");
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                int i33 = OcInstallmentRepayActivity.f29525t0;
                d.w(GetCustomerServiceUrlReq.ENTER_TYPE_FLEXI);
                break;
            case 26:
                int i34 = OcReferEarnActivity.f29672M;
                d.F("/credit_score/oc_refer_earn_history_activity");
                break;
            case 27:
                int i35 = OcRepayActivity.f29705v1;
                break;
            case 28:
                int i36 = OcRepayActivity.f29705v1;
                d.w(GetCustomerServiceUrlReq.ENTER_TYPE_FLEXI);
                break;
            default:
                int i37 = OcRepayExtendActivity.f29779C;
                d.w(GetCustomerServiceUrlReq.ENTER_TYPE_FLEXI);
                break;
        }
    }
}
