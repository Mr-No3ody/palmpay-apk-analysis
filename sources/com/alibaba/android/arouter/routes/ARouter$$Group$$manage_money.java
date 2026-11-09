package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.transsnet.palmpay.managemoney.ui.activity.CashBoxAutoSaveActivity;
import com.transsnet.palmpay.managemoney.ui.activity.CashBoxAutoSaveOperationActivity;
import com.transsnet.palmpay.managemoney.ui.activity.CashBoxCampaignMainActivity;
import com.transsnet.palmpay.managemoney.ui.activity.CashBoxDepositWithdrawActivity;
import com.transsnet.palmpay.managemoney.ui.activity.CashBoxMainActivity;
import com.transsnet.palmpay.managemoney.ui.activity.CashBoxOrderDetailActivity;
import com.transsnet.palmpay.managemoney.ui.activity.CashBoxOrderResultActivity;
import com.transsnet.palmpay.managemoney.ui.activity.CashBoxTransactionHistoryActivity;
import com.transsnet.palmpay.managemoney.ui.activity.CreatePlanActivity;
import com.transsnet.palmpay.managemoney.ui.activity.DetailActivity;
import com.transsnet.palmpay.managemoney.ui.activity.FixedSavingOrderForBreakResultActivity;
import com.transsnet.palmpay.managemoney.ui.activity.FixedSavingPreviewActivity;
import com.transsnet.palmpay.managemoney.ui.activity.FixedSavingR2PreviewActivity;
import com.transsnet.palmpay.managemoney.ui.activity.FundTransactionHistoryActivity;
import com.transsnet.palmpay.managemoney.ui.activity.InsuranceTakePhotoActivity;
import com.transsnet.palmpay.managemoney.ui.activity.PaybackDetailActivity;
import com.transsnet.palmpay.managemoney.ui.activity.PlanBreakPreDetailActivity;
import com.transsnet.palmpay.managemoney.ui.activity.PlanDetailActivity;
import com.transsnet.palmpay.managemoney.ui.activity.SavingAdvancePreviewActivity;
import com.transsnet.palmpay.managemoney.ui.activity.SelectStateActivity;
import com.transsnet.palmpay.managemoney.ui.activity.SpendSavePreviewActivity;
import com.transsnet.palmpay.managemoney.ui.activity.TargetSavingsTransactionHistoryActivity;
import com.transsnet.palmpay.managemoney.ui.activity.TransactionHistoryActivity;
import com.transsnet.palmpay.managemoney.ui.activity.UserFixedSavingActivity;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxNewUserUseCouponDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxUseCouponResultDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.WealthMoreDialogFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.NewUserIntroductionFragment;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$manage_money implements IRouteGroup {

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$manage_money$1, reason: invalid class name */
    public class AnonymousClass1 extends HashMap<String, Integer> {
    }

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        map.put("/manage_money/cash_box_auto_save_activity", RouteMeta.build(routeType, CashBoxAutoSaveActivity.class, "/manage_money/cash_box_auto_save_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.put("extra_entry_type", 8);
        map.put("/manage_money/cash_box_auto_save_operation_activity", RouteMeta.build(routeType, CashBoxAutoSaveOperationActivity.class, "/manage_money/cash_box_auto_save_operation_activity", "manage_money", anonymousClass1, -1, Integer.MIN_VALUE));
        map.put("/manage_money/cash_box_campaign_activity", RouteMeta.build(routeType, CashBoxCampaignMainActivity.class, "/manage_money/cash_box_campaign_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/cash_box_deposit_withdraw_activity", RouteMeta.build(routeType, CashBoxDepositWithdrawActivity.class, "/manage_money/cash_box_deposit_withdraw_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/cash_box_main_activity", RouteMeta.build(routeType, CashBoxMainActivity.class, "/manage_money/cash_box_main_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/cash_box_order_detail_activity", RouteMeta.build(routeType, CashBoxOrderDetailActivity.class, "/manage_money/cash_box_order_detail_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/cash_box_order_preview_activity", RouteMeta.build(routeType, SavingAdvancePreviewActivity.class, "/manage_money/cash_box_order_preview_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/cash_box_order_result_activity", RouteMeta.build(routeType, CashBoxOrderResultActivity.class, "/manage_money/cash_box_order_result_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/cash_box_select_state_activity", RouteMeta.build(routeType, SelectStateActivity.class, "/manage_money/cash_box_select_state_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/cash_box_transaction_history_activity", RouteMeta.build(routeType, CashBoxTransactionHistoryActivity.class, "/manage_money/cash_box_transaction_history_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        RouteType routeType2 = RouteType.FRAGMENT;
        map.put("/manage_money/cash_box_use_coupon_fragment", RouteMeta.build(routeType2, CashBoxNewUserUseCouponDialogFragment.class, "/manage_money/cash_box_use_coupon_fragment", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/cash_box_use_coupon_result_fragment", RouteMeta.build(routeType2, CashBoxUseCouponResultDialogFragment.class, "/manage_money/cash_box_use_coupon_result_fragment", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/create_plan_activity", RouteMeta.build(routeType, CreatePlanActivity.class, "/manage_money/create_plan_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/detail_activity", RouteMeta.build(routeType, DetailActivity.class, "/manage_money/detail_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/fixed_saving_order_for_break_result_activity", RouteMeta.build(routeType, FixedSavingOrderForBreakResultActivity.class, "/manage_money/fixed_saving_order_for_break_result_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/fund_transaction_history_activity", RouteMeta.build(routeType, FundTransactionHistoryActivity.class, "/manage_money/fund_transaction_history_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/insurance_take_photo_activity", RouteMeta.build(routeType, InsuranceTakePhotoActivity.class, "/manage_money/insurance_take_photo_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/loading_activity", RouteMeta.build(routeType, UserFixedSavingActivity.class, "/manage_money/loading_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/new_user_introduction_activity", RouteMeta.build(routeType2, NewUserIntroductionFragment.class, "/manage_money/new_user_introduction_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/order_preview_activity", RouteMeta.build(routeType, FixedSavingPreviewActivity.class, "/manage_money/order_preview_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/order_r2_preview_activity", RouteMeta.build(routeType, FixedSavingR2PreviewActivity.class, "/manage_money/order_r2_preview_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/pay_back_detail_activity", RouteMeta.build(routeType, PaybackDetailActivity.class, "/manage_money/pay_back_detail_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/plan_break_pre_activity", RouteMeta.build(routeType, PlanBreakPreDetailActivity.class, "/manage_money/plan_break_pre_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/plan_detail_activity", RouteMeta.build(routeType, PlanDetailActivity.class, "/manage_money/plan_detail_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/spend_save_preview_activity", RouteMeta.build(routeType, SpendSavePreviewActivity.class, "/manage_money/spend_save_preview_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/target_savings_transaction_history_activity", RouteMeta.build(routeType, TargetSavingsTransactionHistoryActivity.class, "/manage_money/target_savings_transaction_history_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/transaction_history_activity", RouteMeta.build(routeType, TransactionHistoryActivity.class, "/manage_money/transaction_history_activity", "manage_money", null, -1, Integer.MIN_VALUE));
        map.put("/manage_money/wealth_more_dialog", RouteMeta.build(routeType2, WealthMoreDialogFragment.class, "/manage_money/wealth_more_dialog", "manage_money", null, -1, Integer.MIN_VALUE));
    }
}
