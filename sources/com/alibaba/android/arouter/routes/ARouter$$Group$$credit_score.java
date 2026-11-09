package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.transsnet.palmpay.credit.export.OkCardModuleImpl;
import com.transsnet.palmpay.credit.manager.LoanCreditService;
import com.transsnet.palmpay.credit.manager.bankauth.LoanBankSilentAuthService;
import com.transsnet.palmpay.credit.manager.transferbyloan.TransferByLoanService;
import com.transsnet.palmpay.credit.ui.activity.AliFaceActivity;
import com.transsnet.palmpay.credit.ui.activity.HowToUnfreezeActivity;
import com.transsnet.palmpay.credit.ui.activity.InputAmountActivity;
import com.transsnet.palmpay.credit.ui.activity.LoanHomeActivity;
import com.transsnet.palmpay.credit.ui.activity.LoanLocationRequestPermissionActivity;
import com.transsnet.palmpay.credit.ui.activity.MonoConnectActivity;
import com.transsnet.palmpay.credit.ui.activity.OcHomeMobileInstalmentStandaloneActivity;
import com.transsnet.palmpay.credit.ui.activity.PastShopListActivity;
import com.transsnet.palmpay.credit.ui.activity.PayShopHomeActivity;
import com.transsnet.palmpay.credit.ui.activity.PayShopInputAmountRedirectActivity;
import com.transsnet.palmpay.credit.ui.activity.PayShopPaymentPreviewActivity;
import com.transsnet.palmpay.credit.ui.activity.PayShopPaymentResultActivity;
import com.transsnet.palmpay.credit.ui.activity.PayShopTradeRecordDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.PayShopTransReceiptActivity;
import com.transsnet.palmpay.credit.ui.activity.RewardOrderDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLAutoRepaymentExplainActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBillDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBillDetailMoreActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBorrowActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBorrowPreviewActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBorrowResultActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLCreditManagementActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLInstallmentDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLInstallmentUpGradeResultActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLInterestDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLLastProtocolActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLMainActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLOcBillActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLOpenResultActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLPenaltyPeriodActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLPermissionActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRecordActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepayOrderDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentExtendActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentExtendPreviewActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentExtendResultActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentListActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentPreviewActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentResultActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLSecondMainActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLTakePhotoActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLTakePhotoGuideActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLTotalOverdueActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLUpGradeInstallmentAccountActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLUpgradeActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.UpgradeInstallmentTransParentActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.ClOpenAccountActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcALLVerifyActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcALiFaceGuideActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcAllBillActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyLiteActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyResultActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcAuthActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcAutoRepaymentExplainActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcBillActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcBillDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcBillHistoryActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcBillInstallmentActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcContactActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcFeedbackActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcFeedbackDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcFeedbackListActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcGoldCardUpgradeActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcGoldCardUpgradeBreakActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcIncreaseRecordActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcInstallmentBillDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcInstallmentRepayActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcInviteActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcKYCRouterActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcLastProtocolActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcMTNLoginActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcMainActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcMediaActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcOfflineInstallmentDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcOneLoopActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcOtpVerifyActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcOverpaymentActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcPhoneTempActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcPromotionActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcProtocolActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRePayPreviewActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcReferEarnActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcReferEarnHistoryActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepaidListActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayExtendActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayExtendPreviewActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayOrderDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayOrderDetailInPalmPayActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayResultActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepaymentDateActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepaymentInfoActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcSelectContactsActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcSetDefaultPayMethodActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcSettingActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcStartApplyActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcTotalAmountActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcTotalBillActivity;
import com.transsnet.palmpay.credit.ui.activity.transferbyloan.TransferByLoanActivity;
import com.transsnet.palmpay.credit.ui.fragment.CLOpenContainFragment;
import com.transsnet.palmpay.credit.ui.fragment.DoubleOpenBanFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcGuideCashOpenFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcGuideDoubleOpenFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcGuideFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcHomeFinanceFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcHomeLoanTabFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcHomeMobileInstalmentTabFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcMainFragment;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$credit_score implements IRouteGroup {

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$credit_score$1, reason: invalid class name */
    public class AnonymousClass1 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$credit_score$10, reason: invalid class name */
    public class AnonymousClass10 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$credit_score$11, reason: invalid class name */
    public class AnonymousClass11 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$credit_score$12, reason: invalid class name */
    public class AnonymousClass12 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$credit_score$13, reason: invalid class name */
    public class AnonymousClass13 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$credit_score$2, reason: invalid class name */
    public class AnonymousClass2 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$credit_score$3, reason: invalid class name */
    public class AnonymousClass3 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$credit_score$4, reason: invalid class name */
    public class AnonymousClass4 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$credit_score$5, reason: invalid class name */
    public class AnonymousClass5 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$credit_score$6, reason: invalid class name */
    public class AnonymousClass6 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$credit_score$7, reason: invalid class name */
    public class AnonymousClass7 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$credit_score$8, reason: invalid class name */
    public class AnonymousClass8 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$credit_score$9, reason: invalid class name */
    public class AnonymousClass9 extends HashMap<String, Integer> {
    }

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        map.put("/credit_score/ali_face_activity", RouteMeta.build(routeType, AliFaceActivity.class, "/credit_score/ali_face_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/all_operate_one_loop_activity", RouteMeta.build(routeType, OcOneLoopActivity.class, "/credit_score/all_operate_one_loop_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.put("extra_type", 3);
        map.put("/credit_score/bind_merchant", RouteMeta.build(routeType, PayShopHomeActivity.class, "/credit_score/bind_merchant", "credit_score", anonymousClass1, -1, Integer.MIN_VALUE));
        map.put("/credit_score/cl_bill_detail_activity", RouteMeta.build(routeType, CLBillDetailActivity.class, "/credit_score/cl_bill_detail_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/cl_bill_detail_more_activity", RouteMeta.build(routeType, CLBillDetailMoreActivity.class, "/credit_score/cl_bill_detail_more_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/cl_bill_repayment_list_activity", RouteMeta.build(routeType, CLRepaymentListActivity.class, "/credit_score/cl_bill_repayment_list_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/cl_borrow_activity", RouteMeta.build(routeType, CLBorrowActivity.class, "/credit_score/cl_borrow_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/cl_borrow_preview_activity", RouteMeta.build(routeType, CLBorrowPreviewActivity.class, "/credit_score/cl_borrow_preview_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/cl_borrow_result_activity", RouteMeta.build(routeType, CLBorrowResultActivity.class, "/credit_score/cl_borrow_result_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/cl_ins_detail_activity", RouteMeta.build(routeType, CLInstallmentDetailActivity.class, "/credit_score/cl_ins_detail_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/cl_interest_detail_activity", RouteMeta.build(routeType, CLInterestDetailActivity.class, "/credit_score/cl_interest_detail_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/cl_last_protocol_activity", RouteMeta.build(routeType, CLLastProtocolActivity.class, "/credit_score/cl_last_protocol_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/cl_main_activity", RouteMeta.build(routeType, CLMainActivity.class, "/credit_score/cl_main_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/cl_main_open_account_activity", RouteMeta.build(routeType, ClOpenAccountActivity.class, "/credit_score/cl_main_open_account_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/cl_oc_bill_activity", RouteMeta.build(routeType, CLOcBillActivity.class, "/credit_score/cl_oc_bill_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        RouteType routeType2 = RouteType.FRAGMENT;
        map.put("/credit_score/cl_open_contain", RouteMeta.build(routeType2, CLOpenContainFragment.class, "/credit_score/cl_open_contain", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/cl_permission_tips_activity", RouteMeta.build(routeType, CLPermissionActivity.class, "/credit_score/cl_permission_tips_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        anonymousClass2.put("tab", 3);
        map.put("/credit_score/cl_record_activity", RouteMeta.build(routeType, CLRecordActivity.class, "/credit_score/cl_record_activity", "credit_score", anonymousClass2, -1, Integer.MIN_VALUE));
        map.put("/credit_score/cl_repay_order_detail_activity", RouteMeta.build(routeType, CLRepayOrderDetailActivity.class, "/credit_score/cl_repay_order_detail_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/cl_repayment_activity", RouteMeta.build(routeType, CLRepaymentActivity.class, "/credit_score/cl_repayment_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/cl_repayment_extend_activity", RouteMeta.build(routeType, CLRepaymentExtendActivity.class, "/credit_score/cl_repayment_extend_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/cl_repayment_extend_preview__activity", RouteMeta.build(routeType, CLRepaymentExtendPreviewActivity.class, "/credit_score/cl_repayment_extend_preview__activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/cl_repayment_extend_result__activity", RouteMeta.build(routeType, CLRepaymentExtendResultActivity.class, "/credit_score/cl_repayment_extend_result__activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/cl_repayment_preview_activity", RouteMeta.build(routeType, CLRepaymentPreviewActivity.class, "/credit_score/cl_repayment_preview_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/cl_repayment_result_activity", RouteMeta.build(routeType, CLRepaymentResultActivity.class, "/credit_score/cl_repayment_result_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/credit_management_activity", RouteMeta.build(routeType, CLCreditManagementActivity.class, "/credit_score/credit_management_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/cs_cl_penalty_period_activity", RouteMeta.build(routeType, CLPenaltyPeriodActivity.class, "/credit_score/cs_cl_penalty_period_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/cs_cl_total_overdue_activity", RouteMeta.build(routeType, CLTotalOverdueActivity.class, "/credit_score/cs_cl_total_overdue_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/cs_cl_upgrade_activity", RouteMeta.build(routeType, CLUpgradeActivity.class, "/credit_score/cs_cl_upgrade_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        anonymousClass3.put("orderId", 8);
        map.put("/credit_score/detail", RouteMeta.build(routeType, PayShopTradeRecordDetailActivity.class, "/credit_score/detail", "credit_score", anonymousClass3, -1, Integer.MIN_VALUE));
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        anonymousClass4.put("sn_no", 8);
        map.put("/credit_score/input_amount", RouteMeta.build(routeType, InputAmountActivity.class, "/credit_score/input_amount", "credit_score", anonymousClass4, -1, Integer.MIN_VALUE));
        RouteType routeType3 = RouteType.PROVIDER;
        map.put("/credit_score/loan_bank_silent_auth_service", RouteMeta.build(routeType3, LoanBankSilentAuthService.class, "/credit_score/loan_bank_silent_auth_service", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/loan_credit_service", RouteMeta.build(routeType3, LoanCreditService.class, "/credit_score/loan_credit_service", "credit_score", null, -1, Integer.MIN_VALUE));
        AnonymousClass5 anonymousClass5 = new AnonymousClass5();
        anonymousClass5.put("extra_flag", 0);
        map.put("/credit_score/loan_home_activity", RouteMeta.build(routeType, LoanHomeActivity.class, "/credit_score/loan_home_activity", "credit_score", anonymousClass5, -1, Integer.MIN_VALUE));
        map.put("/credit_score/location_request_permission_activity", RouteMeta.build(routeType, LoanLocationRequestPermissionActivity.class, "/credit_score/location_request_permission_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/mono_connect_activity", RouteMeta.build(routeType, MonoConnectActivity.class, "/credit_score/mono_connect_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_ali_face_guide_activity", RouteMeta.build(routeType, OcALiFaceGuideActivity.class, "/credit_score/oc_ali_face_guide_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_all_bill_activity", RouteMeta.build(routeType, OcAllBillActivity.class, "/credit_score/oc_all_bill_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_all_verify_activity", RouteMeta.build(routeType, OcALLVerifyActivity.class, "/credit_score/oc_all_verify_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_amount_record_activity", RouteMeta.build(routeType, OcIncreaseRecordActivity.class, "/credit_score/oc_amount_record_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        AnonymousClass6 anonymousClass6 = new AnonymousClass6();
        anonymousClass6.put("extra_data_2", 4);
        anonymousClass6.put("extra_data_1", 4);
        anonymousClass6.put("extra_data", 8);
        map.put("/credit_score/oc_apply_lite_activity", RouteMeta.build(routeType, OcApplyLiteActivity.class, "/credit_score/oc_apply_lite_activity", "credit_score", anonymousClass6, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_apply_result_activity", RouteMeta.build(routeType, OcApplyResultActivity.class, "/credit_score/oc_apply_result_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_auth_activity", RouteMeta.build(routeType, OcAuthActivity.class, "/credit_score/oc_auth_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_auto_repayment_explain_activity", RouteMeta.build(routeType, OcAutoRepaymentExplainActivity.class, "/credit_score/oc_auto_repayment_explain_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_bill_activity", RouteMeta.build(routeType, OcBillActivity.class, "/credit_score/oc_bill_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_bill_detail_activity", RouteMeta.build(routeType, OcBillDetailActivity.class, "/credit_score/oc_bill_detail_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_bill_history_activity", RouteMeta.build(routeType, OcBillHistoryActivity.class, "/credit_score/oc_bill_history_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_bill_installment_activity", RouteMeta.build(routeType, OcBillInstallmentActivity.class, "/credit_score/oc_bill_installment_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_cash_open_guide_fragment", RouteMeta.build(routeType2, OcGuideCashOpenFragment.class, "/credit_score/oc_cash_open_guide_fragment", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_contact_activity", RouteMeta.build(routeType, OcContactActivity.class, "/credit_score/oc_contact_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_double_ban_fragment", RouteMeta.build(routeType2, DoubleOpenBanFragment.class, "/credit_score/oc_double_ban_fragment", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_double_open_guide_fragment", RouteMeta.build(routeType2, OcGuideDoubleOpenFragment.class, "/credit_score/oc_double_open_guide_fragment", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_feedback_activity", RouteMeta.build(routeType, OcFeedbackActivity.class, "/credit_score/oc_feedback_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_feedback_detail_activity", RouteMeta.build(routeType, OcFeedbackDetailActivity.class, "/credit_score/oc_feedback_detail_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_feedback_list_activity", RouteMeta.build(routeType, OcFeedbackListActivity.class, "/credit_score/oc_feedback_list_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_gold_card_upgard_break_activity", RouteMeta.build(routeType, OcGoldCardUpgradeBreakActivity.class, "/credit_score/oc_gold_card_upgard_break_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_gold_card_upgarde_activity", RouteMeta.build(routeType, OcGoldCardUpgradeActivity.class, "/credit_score/oc_gold_card_upgarde_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_guide_fragment", RouteMeta.build(routeType2, OcGuideFragment.class, "/credit_score/oc_guide_fragment", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_home_finance_fragment", RouteMeta.build(routeType2, OcHomeFinanceFragment.class, "/credit_score/oc_home_finance_fragment", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_home_loan_tab_fragment", RouteMeta.build(routeType2, OcHomeLoanTabFragment.class, "/credit_score/oc_home_loan_tab_fragment", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_home_mobile_installment_standalone_activity", RouteMeta.build(routeType, OcHomeMobileInstalmentStandaloneActivity.class, "/credit_score/oc_home_mobile_installment_standalone_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_home_mobile_installment_tab_fragment", RouteMeta.build(routeType2, OcHomeMobileInstalmentTabFragment.class, "/credit_score/oc_home_mobile_installment_tab_fragment", "credit_score", null, -1, Integer.MIN_VALUE));
        AnonymousClass7 anonymousClass7 = new AnonymousClass7();
        anonymousClass7.put("orderNo", 8);
        map.put("/credit_score/oc_install_bill_detail_activity", RouteMeta.build(routeType, OcInstallmentBillDetailActivity.class, "/credit_score/oc_install_bill_detail_activity", "credit_score", anonymousClass7, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_install_repay_activity", RouteMeta.build(routeType, OcInstallmentRepayActivity.class, "/credit_score/oc_install_repay_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_invite_activity", RouteMeta.build(routeType, OcInviteActivity.class, "/credit_score/oc_invite_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_kyc_router_activity", RouteMeta.build(routeType, OcKYCRouterActivity.class, "/credit_score/oc_kyc_router_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_last_protocol_activity", RouteMeta.build(routeType, OcLastProtocolActivity.class, "/credit_score/oc_last_protocol_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_main_activity", RouteMeta.build(routeType, OcMainActivity.class, "/credit_score/oc_main_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_main_fragment", RouteMeta.build(routeType2, OcMainFragment.class, "/credit_score/oc_main_fragment", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_main_second_activity", RouteMeta.build(routeType, CLSecondMainActivity.class, "/credit_score/oc_main_second_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_media_activity", RouteMeta.build(routeType, OcMediaActivity.class, "/credit_score/oc_media_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_offline_installment_detail_activity", RouteMeta.build(routeType, OcOfflineInstallmentDetailActivity.class, "/credit_score/oc_offline_installment_detail_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_otp_verify_activity", RouteMeta.build(routeType, OcOtpVerifyActivity.class, "/credit_score/oc_otp_verify_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_overpayment_activity", RouteMeta.build(routeType, OcOverpaymentActivity.class, "/credit_score/oc_overpayment_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_phone_temp_activity", RouteMeta.build(routeType, OcPhoneTempActivity.class, "/credit_score/oc_phone_temp_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        AnonymousClass8 anonymousClass8 = new AnonymousClass8();
        anonymousClass8.put("extra_data", 8);
        map.put("/credit_score/oc_promotion_activity", RouteMeta.build(routeType, OcPromotionActivity.class, "/credit_score/oc_promotion_activity", "credit_score", anonymousClass8, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_protocol_activity", RouteMeta.build(routeType, OcProtocolActivity.class, "/credit_score/oc_protocol_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_refer_earn_activity", RouteMeta.build(routeType, OcReferEarnActivity.class, "/credit_score/oc_refer_earn_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_refer_earn_history_activity", RouteMeta.build(routeType, OcReferEarnHistoryActivity.class, "/credit_score/oc_refer_earn_history_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_repaid_activity", RouteMeta.build(routeType, OcRepaidListActivity.class, "/credit_score/oc_repaid_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_repay_activity", RouteMeta.build(routeType, OcRepayActivity.class, "/credit_score/oc_repay_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_repay_extend_activity", RouteMeta.build(routeType, OcRepayExtendActivity.class, "/credit_score/oc_repay_extend_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_repay_extend_preview_activity", RouteMeta.build(routeType, OcRepayExtendPreviewActivity.class, "/credit_score/oc_repay_extend_preview_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_repay_order_detail_activity", RouteMeta.build(routeType, OcRepayOrderDetailActivity.class, "/credit_score/oc_repay_order_detail_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_repay_order_detail_in_palmpay_activity", RouteMeta.build(routeType, OcRepayOrderDetailInPalmPayActivity.class, "/credit_score/oc_repay_order_detail_in_palmpay_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_repay_preview_activity", RouteMeta.build(routeType, OcRePayPreviewActivity.class, "/credit_score/oc_repay_preview_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        AnonymousClass9 anonymousClass9 = new AnonymousClass9();
        anonymousClass9.put("key_pending_message", 8);
        anonymousClass9.put("key_pending_time", 4);
        anonymousClass9.put("key_pending_count_down_message", 8);
        map.put("/credit_score/oc_repay_result_activity", RouteMeta.build(routeType, OcRepayResultActivity.class, "/credit_score/oc_repay_result_activity", "credit_score", anonymousClass9, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_repayment_date_activity", RouteMeta.build(routeType, OcRepaymentDateActivity.class, "/credit_score/oc_repayment_date_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_repayment_info_activity", RouteMeta.build(routeType, OcRepaymentInfoActivity.class, "/credit_score/oc_repayment_info_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        AnonymousClass10 anonymousClass10 = new AnonymousClass10();
        anonymousClass10.put("CLICK_ITEM_TO_FOR_RESULT", 0);
        anonymousClass10.put("key_select_phone", 0);
        map.put("/credit_score/oc_select_contact_activity", RouteMeta.build(routeType, OcSelectContactsActivity.class, "/credit_score/oc_select_contact_activity", "credit_score", anonymousClass10, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_set_default_pay_method_activity", RouteMeta.build(routeType, OcSetDefaultPayMethodActivity.class, "/credit_score/oc_set_default_pay_method_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_setting_activity", RouteMeta.build(routeType, OcSettingActivity.class, "/credit_score/oc_setting_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_start_apply_activity", RouteMeta.build(routeType, OcStartApplyActivity.class, "/credit_score/oc_start_apply_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_total_amount_activity", RouteMeta.build(routeType, OcTotalAmountActivity.class, "/credit_score/oc_total_amount_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oc_total_bill_activity", RouteMeta.build(routeType, OcTotalBillActivity.class, "/credit_score/oc_total_bill_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/ol_auto_repayment_explain_activity", RouteMeta.build(routeType, CLAutoRepaymentExplainActivity.class, "/credit_score/ol_auto_repayment_explain_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/ol_open_result_activity", RouteMeta.build(routeType, CLOpenResultActivity.class, "/credit_score/ol_open_result_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/ol_take_photo_activity", RouteMeta.build(routeType, CLTakePhotoActivity.class, "/credit_score/ol_take_photo_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/ol_take_photo_guide_activity", RouteMeta.build(routeType, CLTakePhotoGuideActivity.class, "/credit_score/ol_take_photo_guide_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/ol_upgrade_installment_activity", RouteMeta.build(routeType, CLUpGradeInstallmentAccountActivity.class, "/credit_score/ol_upgrade_installment_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/ol_upgrade_installment_result_activity", RouteMeta.build(routeType, CLInstallmentUpGradeResultActivity.class, "/credit_score/ol_upgrade_installment_result_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/ol_upgrade_installment_trans_parent_dialog_activity", RouteMeta.build(routeType, UpgradeInstallmentTransParentActivity.class, "/credit_score/ol_upgrade_installment_trans_parent_dialog_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/oneloop", RouteMeta.build(routeType, OcMTNLoginActivity.class, "/credit_score/oneloop", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/past_shop", RouteMeta.build(routeType, PastShopListActivity.class, "/credit_score/past_shop", "credit_score", null, -1, Integer.MIN_VALUE));
        AnonymousClass11 anonymousClass11 = new AnonymousClass11();
        anonymousClass11.put("sn_no", 8);
        anonymousClass11.put("core_order_source_type", 8);
        map.put("/credit_score/pay_shop_input_amount", RouteMeta.build(routeType, PayShopInputAmountRedirectActivity.class, "/credit_score/pay_shop_input_amount", "credit_score", anonymousClass11, -1, Integer.MIN_VALUE));
        map.put("/credit_score/pay_shop_payment_preview", RouteMeta.build(routeType, PayShopPaymentPreviewActivity.class, "/credit_score/pay_shop_payment_preview", "credit_score", null, -1, Integer.MIN_VALUE));
        AnonymousClass12 anonymousClass12 = new AnonymousClass12();
        anonymousClass12.put("extra_data", 8);
        map.put("/credit_score/pay_shop_payment_result", RouteMeta.build(routeType, PayShopPaymentResultActivity.class, "/credit_score/pay_shop_payment_result", "credit_score", anonymousClass12, -1, Integer.MIN_VALUE));
        map.put("/credit_score/provier", RouteMeta.build(routeType3, OkCardModuleImpl.class, "/credit_score/provier", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/reward_order_detail_activity", RouteMeta.build(routeType, RewardOrderDetailActivity.class, "/credit_score/reward_order_detail_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        AnonymousClass13 anonymousClass13 = new AnonymousClass13();
        anonymousClass13.put("orderId", 8);
        map.put("/credit_score/trans_receipt", RouteMeta.build(routeType, PayShopTransReceiptActivity.class, "/credit_score/trans_receipt", "credit_score", anonymousClass13, -1, Integer.MIN_VALUE));
        map.put("/credit_score/transfer_by_loan_activity", RouteMeta.build(routeType, TransferByLoanActivity.class, "/credit_score/transfer_by_loan_activity", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/transfer_by_loan_service", RouteMeta.build(routeType3, TransferByLoanService.class, "/credit_score/transfer_by_loan_service", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("/credit_score/unfreeze_activity", RouteMeta.build(routeType, HowToUnfreezeActivity.class, "/credit_score/unfreeze_activity", "credit_score", null, -1, Integer.MIN_VALUE));
    }
}
