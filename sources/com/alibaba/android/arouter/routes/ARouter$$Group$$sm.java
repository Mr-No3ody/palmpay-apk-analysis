package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.transsnet.palmpay.send_money.ui.activity.AddBeneficiaryActivity;
import com.transsnet.palmpay.send_money.ui.activity.CompensationDetailActivity;
import com.transsnet.palmpay.send_money.ui.activity.PayShopInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.SelectBankActivity;
import com.transsnet.palmpay.send_money.ui.activity.SetAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.TransReceiptActivity;
import com.transsnet.palmpay.send_money.ui.activity.TransferToCommonAccountActivity;
import com.transsnet.palmpay.send_money.ui.activity.TransferToMobileActivity;
import com.transsnet.palmpay.send_money.ui.activity.WithdrawInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.pay_me.MoneyTransferRecordListActivity;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateActivity;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateResultActivity;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateV2Activity;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferHomeActivity;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferOrderDetailActivity;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferPaymentSelectActivity;
import com.transsnet.palmpay.send_money.ui.activity.settings.TransferLimitSettingsActivity;
import com.transsnet.palmpay.send_money.ui.activity.settings.TransferNotificationSettingsActivity;
import com.transsnet.palmpay.send_money.ui.activity.settings.TransferSettingsActivity;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableBeneficiariesListActivity;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableDetailActivity;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableHomeActivity;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableOrderListActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.BankAccountBeneficiaryActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.SelectBankForToBankActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankAccountActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.ReceiveMoneyResultActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayContactActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd.TransferViaUssdActivity;
import com.transsnet.palmpay.send_money.ui.fragment.MoneyTransferHistoryFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFragment;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$sm implements IRouteGroup {

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$1, reason: invalid class name */
    public class AnonymousClass1 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$10, reason: invalid class name */
    public class AnonymousClass10 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$11, reason: invalid class name */
    public class AnonymousClass11 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$12, reason: invalid class name */
    public class AnonymousClass12 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$13, reason: invalid class name */
    public class AnonymousClass13 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$14, reason: invalid class name */
    public class AnonymousClass14 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$15, reason: invalid class name */
    public class AnonymousClass15 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$16, reason: invalid class name */
    public class AnonymousClass16 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$17, reason: invalid class name */
    public class AnonymousClass17 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$18, reason: invalid class name */
    public class AnonymousClass18 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$19, reason: invalid class name */
    public class AnonymousClass19 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$2, reason: invalid class name */
    public class AnonymousClass2 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$20, reason: invalid class name */
    public class AnonymousClass20 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$21, reason: invalid class name */
    public class AnonymousClass21 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$22, reason: invalid class name */
    public class AnonymousClass22 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$23, reason: invalid class name */
    public class AnonymousClass23 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$24, reason: invalid class name */
    public class AnonymousClass24 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$3, reason: invalid class name */
    public class AnonymousClass3 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$4, reason: invalid class name */
    public class AnonymousClass4 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$5, reason: invalid class name */
    public class AnonymousClass5 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$6, reason: invalid class name */
    public class AnonymousClass6 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$7, reason: invalid class name */
    public class AnonymousClass7 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$8, reason: invalid class name */
    public class AnonymousClass8 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$sm$9, reason: invalid class name */
    public class AnonymousClass9 extends HashMap<String, Integer> {
    }

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.ACTIVITY;
        map.put("/sm/add_beneficiary", RouteMeta.build(routeType, AddBeneficiaryActivity.class, "/sm/add_beneficiary", "sm", null, -1, Integer.MIN_VALUE));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.put("extra_data", 0);
        anonymousClass1.put("core_order_source_type", 8);
        map.put("/sm/back_account_beneficiary", RouteMeta.build(routeType, BankAccountBeneficiaryActivity.class, "/sm/back_account_beneficiary", "sm", anonymousClass1, -1, Integer.MIN_VALUE));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        anonymousClass2.put("orderId", 8);
        map.put("/sm/compensation_detail", RouteMeta.build(routeType, CompensationDetailActivity.class, "/sm/compensation_detail", "sm", anonymousClass2, -1, Integer.MIN_VALUE));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        anonymousClass3.put("core_bill_in_out", 3);
        anonymousClass3.put("core_bill_type", 8);
        anonymousClass3.put("core_bill_status", 3);
        map.put("/sm/money_transfer_history_activity", RouteMeta.build(routeType, MoneyTransferRecordListActivity.class, "/sm/money_transfer_history_activity", "sm", anonymousClass3, -1, Integer.MIN_VALUE));
        RouteType routeType2 = RouteType.FRAGMENT;
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        anonymousClass4.put("core_bill_in_out", 3);
        anonymousClass4.put("core_bill_type", 8);
        anonymousClass4.put("core_bill_status", 3);
        map.put("/sm/money_transfer_history_fragment", RouteMeta.build(routeType2, MoneyTransferHistoryFragment.class, "/sm/money_transfer_history_fragment", "sm", anonymousClass4, -1, Integer.MIN_VALUE));
        AnonymousClass5 anonymousClass5 = new AnonymousClass5();
        anonymousClass5.put("extra_data", 8);
        anonymousClass5.put("MEMBER_ID", 8);
        anonymousClass5.put("phone_number", 8);
        anonymousClass5.put("extra_type", 3);
        anonymousClass5.put("isHideInfo", 0);
        anonymousClass5.put("core_order_source_type", 8);
        map.put("/sm/palmpay_personal_transfer", RouteMeta.build(routeType, TransferToPalmPayInputAmountActivity.class, "/sm/palmpay_personal_transfer", "sm", anonymousClass5, -1, Integer.MIN_VALUE));
        AnonymousClass6 anonymousClass6 = new AnonymousClass6();
        anonymousClass6.put("sn_no", 8);
        anonymousClass6.put("core_order_source_type", 8);
        map.put("/sm/pay_shop_input_amount", RouteMeta.build(routeType, PayShopInputAmountActivity.class, "/sm/pay_shop_input_amount", "sm", anonymousClass6, -1, Integer.MIN_VALUE));
        AnonymousClass7 anonymousClass7 = new AnonymousClass7();
        anonymousClass7.put("extra_id", 8);
        map.put("/sm/receipt", RouteMeta.build(routeType, TransReceiptActivity.class, "/sm/receipt", "sm", anonymousClass7, -1, Integer.MIN_VALUE));
        map.put("/sm/receive_money_result", RouteMeta.build(routeType, ReceiveMoneyResultActivity.class, "/sm/receive_money_result", "sm", null, -1, Integer.MIN_VALUE));
        AnonymousClass8 anonymousClass8 = new AnonymousClass8();
        anonymousClass8.put("extra_amount", 7);
        anonymousClass8.put("extra_note", 8);
        anonymousClass8.put("contact_name", 8);
        anonymousClass8.put("extra_data", 8);
        anonymousClass8.put("BANK_ACCOUNT_NUMBER", 8);
        anonymousClass8.put("extra_type", 3);
        map.put("/sm/schedule_transfer_create", RouteMeta.build(routeType, ScheduleTransferCreateActivity.class, "/sm/schedule_transfer_create", "sm", anonymousClass8, -1, Integer.MIN_VALUE));
        AnonymousClass9 anonymousClass9 = new AnonymousClass9();
        anonymousClass9.put("extra_data", 10);
        map.put("/sm/schedule_transfer_create_result", RouteMeta.build(routeType, ScheduleTransferCreateResultActivity.class, "/sm/schedule_transfer_create_result", "sm", anonymousClass9, -1, Integer.MIN_VALUE));
        AnonymousClass10 anonymousClass10 = new AnonymousClass10();
        anonymousClass10.put("extra_amount", 7);
        anonymousClass10.put("extra_note", 8);
        anonymousClass10.put("contact_name", 8);
        anonymousClass10.put("extra_data", 8);
        anonymousClass10.put("BANK_ACCOUNT_NUMBER", 8);
        anonymousClass10.put("extra_type", 3);
        map.put("/sm/schedule_transfer_create_v2", RouteMeta.build(routeType, ScheduleTransferCreateV2Activity.class, "/sm/schedule_transfer_create_v2", "sm", anonymousClass10, -1, Integer.MIN_VALUE));
        AnonymousClass11 anonymousClass11 = new AnonymousClass11();
        anonymousClass11.put("extra_amount", 4);
        anonymousClass11.put("extra_data", 8);
        anonymousClass11.put("core_extra_bank_account_data", 8);
        map.put("/sm/schedule_transfer_for_bank_unstable", RouteMeta.build(routeType, ScheduleTransferForBankUnstableHomeActivity.class, "/sm/schedule_transfer_for_bank_unstable", "sm", anonymousClass11, -1, Integer.MIN_VALUE));
        AnonymousClass12 anonymousClass12 = new AnonymousClass12();
        anonymousClass12.put("extra_data", 8);
        map.put("/sm/schedule_transfer_for_bank_unstable_beneficiaries_list", RouteMeta.build(routeType, ScheduleTransferForBankUnstableBeneficiariesListActivity.class, "/sm/schedule_transfer_for_bank_unstable_beneficiaries_list", "sm", anonymousClass12, -1, Integer.MIN_VALUE));
        AnonymousClass13 anonymousClass13 = new AnonymousClass13();
        anonymousClass13.put("orderId", 8);
        map.put("/sm/schedule_transfer_for_bank_unstable_detail", RouteMeta.build(routeType, ScheduleTransferForBankUnstableDetailActivity.class, "/sm/schedule_transfer_for_bank_unstable_detail", "sm", anonymousClass13, -1, Integer.MIN_VALUE));
        map.put("/sm/schedule_transfer_for_bank_unstable_list", RouteMeta.build(routeType, ScheduleTransferForBankUnstableOrderListActivity.class, "/sm/schedule_transfer_for_bank_unstable_list", "sm", null, -1, Integer.MIN_VALUE));
        AnonymousClass14 anonymousClass14 = new AnonymousClass14();
        anonymousClass14.put("extra_flag", 3);
        map.put("/sm/schedule_transfer_home", RouteMeta.build(routeType, ScheduleTransferHomeActivity.class, "/sm/schedule_transfer_home", "sm", anonymousClass14, -1, Integer.MIN_VALUE));
        AnonymousClass15 anonymousClass15 = new AnonymousClass15();
        anonymousClass15.put("orderId", 8);
        map.put("/sm/schedule_transfer_order_detail", RouteMeta.build(routeType, ScheduleTransferOrderDetailActivity.class, "/sm/schedule_transfer_order_detail", "sm", anonymousClass15, -1, Integer.MIN_VALUE));
        AnonymousClass16 anonymousClass16 = new AnonymousClass16();
        anonymousClass16.put("extra_flag", 3);
        map.put("/sm/schedule_transfer_payment_select", RouteMeta.build(routeType, ScheduleTransferPaymentSelectActivity.class, "/sm/schedule_transfer_payment_select", "sm", anonymousClass16, -1, Integer.MIN_VALUE));
        AnonymousClass17 anonymousClass17 = new AnonymousClass17();
        anonymousClass17.put("extra_type", 3);
        anonymousClass17.put("bank_list_type", 3);
        map.put("/sm/select_bank_activity", RouteMeta.build(routeType, SelectBankActivity.class, "/sm/select_bank_activity", "sm", anonymousClass17, -1, Integer.MIN_VALUE));
        AnonymousClass18 anonymousClass18 = new AnonymousClass18();
        anonymousClass18.put("core_extra_bank_account_data", 8);
        map.put("/sm/select_bank_for_to_bank_activity", RouteMeta.build(routeType, SelectBankForToBankActivity.class, "/sm/select_bank_for_to_bank_activity", "sm", anonymousClass18, -1, Integer.MIN_VALUE));
        map.put("/sm/set_amount", RouteMeta.build(routeType, SetAmountActivity.class, "/sm/set_amount", "sm", null, -1, Integer.MIN_VALUE));
        AnonymousClass19 anonymousClass19 = new AnonymousClass19();
        anonymousClass19.put("accountNo", 8);
        anonymousClass19.put("core_order_source_type", 8);
        map.put("/sm/trans_to_bank", RouteMeta.build(routeType, TransferToBankAccountActivity.class, "/sm/trans_to_bank", "sm", anonymousClass19, -1, Integer.MIN_VALUE));
        map.put("/sm/trans_to_bank_confirm", RouteMeta.build(routeType, TransferToBankInputAmountActivity.class, "/sm/trans_to_bank_confirm", "sm", null, -1, Integer.MIN_VALUE));
        AnonymousClass20 anonymousClass20 = new AnonymousClass20();
        anonymousClass20.put("extra_data", 8);
        anonymousClass20.put("extra_type", 3);
        anonymousClass20.put("core_order_source_type", 8);
        map.put("/sm/trans_to_common_account", RouteMeta.build(routeType, TransferToCommonAccountActivity.class, "/sm/trans_to_common_account", "sm", anonymousClass20, -1, Integer.MIN_VALUE));
        AnonymousClass21 anonymousClass21 = new AnonymousClass21();
        anonymousClass21.put("is_send", 0);
        anonymousClass21.put("extra_data", 8);
        anonymousClass21.put("MEMBER_ID", 8);
        anonymousClass21.put("phone_number", 8);
        anonymousClass21.put("extra_type", 3);
        anonymousClass21.put("isHideInfo", 0);
        anonymousClass21.put("core_order_source_type", 8);
        map.put("/sm/trans_to_mobile", RouteMeta.build(routeType, TransferToMobileActivity.class, "/sm/trans_to_mobile", "sm", anonymousClass21, -1, Integer.MIN_VALUE));
        AnonymousClass22 anonymousClass22 = new AnonymousClass22();
        anonymousClass22.put("core_order_source_type", 8);
        map.put("/sm/trans_to_palmpay_home", RouteMeta.build(routeType2, TransferToPalmPayHomeFragment.class, "/sm/trans_to_palmpay_home", "sm", anonymousClass22, -1, Integer.MIN_VALUE));
        map.put("/sm/transfer_limit_settings", RouteMeta.build(routeType, TransferLimitSettingsActivity.class, "/sm/transfer_limit_settings", "sm", null, -1, Integer.MIN_VALUE));
        map.put("/sm/transfer_notification_settings", RouteMeta.build(routeType, TransferNotificationSettingsActivity.class, "/sm/transfer_notification_settings", "sm", null, -1, Integer.MIN_VALUE));
        map.put("/sm/transfer_settings", RouteMeta.build(routeType, TransferSettingsActivity.class, "/sm/transfer_settings", "sm", null, -1, Integer.MIN_VALUE));
        AnonymousClass23 anonymousClass23 = new AnonymousClass23();
        anonymousClass23.put("MEMBER_ID", 8);
        anonymousClass23.put("core_order_source_type", 8);
        map.put("/sm/transfer_to_palmpay_contact", RouteMeta.build(routeType, TransferToPalmPayContactActivity.class, "/sm/transfer_to_palmpay_contact", "sm", anonymousClass23, -1, Integer.MIN_VALUE));
        map.put("/sm/transfer_via_ussd", RouteMeta.build(routeType, TransferViaUssdActivity.class, "/sm/transfer_via_ussd", "sm", null, -1, Integer.MIN_VALUE));
        AnonymousClass24 anonymousClass24 = new AnonymousClass24();
        anonymousClass24.put("sn_no", 8);
        anonymousClass24.put("core_order_source_type", 8);
        map.put("/sm/withdraw_input_amount", RouteMeta.build(routeType, WithdrawInputAmountActivity.class, "/sm/withdraw_input_amount", "sm", anonymousClass24, -1, Integer.MIN_VALUE));
    }
}
