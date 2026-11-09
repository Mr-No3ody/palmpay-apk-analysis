package com.transsnet.palmpay.core.bean.bill;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.material.navigation.NavigationBarView;
import com.google.api.Service;
import com.google.common.base.Ascii;
import com.google.protobuf.DescriptorProtos;
import com.luck.picture.lib.config.PictureConfig;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.rsp.HomeMenuBean;
import com.transsnet.palmpay.core.config.BillBusinessType;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public class TransTypeUtils {
    static final String[] NEW_PAYMENT_METHOD_TRANS_TYPES = {TransType.TRANS_TYPE_BILLER_WAEC_PAYMENTS, TransType.TRANS_TYPE_BILLER_COWRY_CARD_PAYMENTS, TransType.TRANS_TYPE_BILLER_PRODUCTS_SERVICES_PAYMENTS, TransType.TRANS_TYPE_BILLER_BANKONE_MFBS_PAYMENTS, TransType.TRANS_TYPE_BILLER_FINANCIAL_SERVICES_PAYMENTS, TransType.TRANS_TYPE_BILLER_TRAVEL_HOTEL_PAYMENTS, TransType.TRANS_TYPE_BILLER_INVOICE_PAYMENTS, TransType.TRANS_TYPE_BILLER_GOVERNMENT_PAYMENTS, TransType.TRANS_TYPE_BILLER_EDUCATION, TransType.TRANS_TYPE_BILLER_RELIGIOUS, TransType.TRANS_TYPE_BILLER_TRANSPORT, "29", TransType.TRANS_TYPE_BILLER_INSURANCE, TransType.TRANS_TYPE_PREPAID_CARD, "16", TransType.TRANS_TYPE_ONELOOP_AIRTIME_BUY, "15", "17", TransType.TRANS_TYPE_BUNDLE, TransType.TRANS_TYPE_BILLER_JAMB_PAYMENTS, TransType.TRANS_TYPE_BILLER_ONLINE_SHOPPING, TransType.TRANS_TYPE_BILLER_EVENT_TICKET, TransType.TRANS_TYPE_BILLER_DUES_AND_SERVICE_CHARGE, TransType.TRANS_TYPE_BILLER_CREDIT_AND_LOANS, TransType.TRANS_TYPE_BILLER_COMMERCE_RETAIL_TRADE, TransType.TRANS_TYPE_BILLER_ASSOCIATIONS_AND_SOCIETIES, "04", TransType.TRANS_TYPE_BUNDLE, TransType.TRANS_TYPE_SPLIT_BILL, TransType.TRANS_TYPE_ONELOOP_AIRTIME_SELL, "03", TransType.TRANS_TYPE_BILLER_BETTING, TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW, "01", "02", TransType.TRANS_TYPE_WITHDRAW_TO_AGENT, TransType.TRANS_TYPE_PAY_SHOP};
    static final String[] NEW_CASHIER_DESK_TRANS_TYPES = {TransType.TRANS_TYPE_FIXED_SAVING, TransType.TRANS_TYPE_CASH_BOX_DEPOSIT, TransType.TRANS_TYPE_CASH_BOX_WITHDRAW, TransType.TRANS_TYPE_EXCHANGE_CASH_DEPOSIT, TransType.TRANS_TYPE_EXCHANGE_CASH_BALANCE_PAYMENT, TransType.TRANS_TYPE_SPEND_SAVE_WITHDRAW, TransType.TRANS_TYPE_FIXED_SAVING_PAID, TransType.TRANS_TYPE_CL_BORROW, TransType.TRANS_TYPE_CL_REPAY, TransType.TRANS_TYPE_X5};
    static final String[] NEW_DIALOG_PAYMENT_METHOD_TRANS_TYPES = {TransType.TRANS_TYPE_BILLER_WAEC_PAYMENTS, TransType.TRANS_TYPE_BILLER_COWRY_CARD_PAYMENTS, TransType.TRANS_TYPE_BILLER_PRODUCTS_SERVICES_PAYMENTS, TransType.TRANS_TYPE_BILLER_BANKONE_MFBS_PAYMENTS, TransType.TRANS_TYPE_BILLER_FINANCIAL_SERVICES_PAYMENTS, TransType.TRANS_TYPE_BILLER_TRAVEL_HOTEL_PAYMENTS, TransType.TRANS_TYPE_BILLER_INVOICE_PAYMENTS, TransType.TRANS_TYPE_BILLER_GOVERNMENT_PAYMENTS, TransType.TRANS_TYPE_BILLER_EDUCATION, TransType.TRANS_TYPE_BILLER_RELIGIOUS, TransType.TRANS_TYPE_BILLER_TRANSPORT, "29", TransType.TRANS_TYPE_BILLER_INSURANCE, TransType.TRANS_TYPE_PREPAID_CARD, "16", TransType.TRANS_TYPE_ONELOOP_AIRTIME_BUY, "15", "17", TransType.TRANS_TYPE_BUNDLE, TransType.TRANS_TYPE_BILLER_JAMB_PAYMENTS, TransType.TRANS_TYPE_BILLER_ONLINE_SHOPPING, TransType.TRANS_TYPE_BILLER_EVENT_TICKET, TransType.TRANS_TYPE_BILLER_DUES_AND_SERVICE_CHARGE, TransType.TRANS_TYPE_BILLER_CREDIT_AND_LOANS, TransType.TRANS_TYPE_BILLER_COMMERCE_RETAIL_TRADE, TransType.TRANS_TYPE_BILLER_ASSOCIATIONS_AND_SOCIETIES, "04", TransType.TRANS_TYPE_BUNDLE, TransType.TRANS_TYPE_SPLIT_BILL, "03", TransType.TRANS_TYPE_BILLER_BETTING, TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW, "01", "02"};

    public static boolean isUseNewCashierDesk(String transType) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, NEW_CASHIER_DESK_TRANS_TYPES);
        Collections.addAll(arrayList, NEW_PAYMENT_METHOD_TRANS_TYPES);
        return arrayList.contains(transType) && BaseApplication.isNG();
    }

    public static boolean isUseNewPaymentMethod(String transType) {
        return Arrays.asList(NEW_PAYMENT_METHOD_TRANS_TYPES).contains(transType) && BaseApplication.isNG();
    }

    public static boolean isUseNewQueryPaymentMethodDialog(String transType) {
        return Arrays.asList(NEW_DIALOG_PAYMENT_METHOD_TRANS_TYPES).contains(transType) && BaseApplication.isNG();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String translateTransType(String transType) {
        if (TextUtils.isEmpty(transType)) {
            return "";
        }
        Context context = BaseApplication.getContext();
        transType.getClass();
        byte b7 = -1;
        switch (transType.hashCode()) {
            case -2015956000:
                if (transType.equals(TransType.BILL_TYPE_DISBURSEMENT)) {
                    b7 = 0;
                }
                break;
            case -264491136:
                if (transType.equals(TransType.BILL_TYPE_ADD_MONEY)) {
                    b7 = 1;
                }
                break;
            case 1538:
                if (transType.equals("02")) {
                    b7 = 2;
                }
                break;
            case 1539:
                if (transType.equals("03")) {
                    b7 = 3;
                }
                break;
            case 1540:
                if (transType.equals("04")) {
                    b7 = 4;
                }
                break;
            case 1572:
                if (transType.equals("15")) {
                    b7 = 5;
                }
                break;
            case 1573:
                if (transType.equals("16")) {
                    b7 = 6;
                }
                break;
            case 1574:
                if (transType.equals("17")) {
                    b7 = 7;
                }
                break;
            case 1600:
                if (transType.equals(TransType.TRANS_TYPE_P2P_CASH_IN)) {
                    b7 = 8;
                }
                break;
            case 1601:
                if (transType.equals(TransType.TRANS_TYPE_P2P_CASH_OUT)) {
                    b7 = 9;
                }
                break;
            case 1604:
                if (transType.equals(TransType.TRANS_TYPE_COMMISSION)) {
                    b7 = 10;
                }
                break;
            case 1607:
                if (transType.equals("29")) {
                    b7 = Ascii.VT;
                }
                break;
            case 1633:
                if (transType.equals(TransType.TRANS_TYPE_BUNDLE)) {
                    b7 = Ascii.FF;
                }
                break;
            case 1635:
                if (transType.equals(TransType.TRANS_TYPE_AUTO_DEDUCT)) {
                    b7 = Ascii.CR;
                }
                break;
            case 1664:
                if (transType.equals(TransType.TRANS_TYPE_BILLER_INSURANCE)) {
                    b7 = Ascii.SO;
                }
                break;
            case 1666:
                if (transType.equals("46")) {
                    b7 = Ascii.SI;
                }
                break;
            case 1667:
                if (transType.equals(TransType.TRANS_TYPE_FACE_TO_FACE_P2P_CASH_IN)) {
                    b7 = Ascii.DLE;
                }
                break;
            case 1668:
                if (transType.equals(TransType.TRANS_TYPE_FACE_TO_FACE_P2P_CASH_OUT)) {
                    b7 = 17;
                }
                break;
            case 1722:
                if (transType.equals(TransType.TRANS_TYPE_INTERBANK_CASH_IN)) {
                    b7 = Ascii.DC2;
                }
                break;
            case 1821:
                if (transType.equals(TransType.TRANS_TYPE_BILLER_BETTING)) {
                    b7 = 19;
                }
                break;
            case 1824:
                if (transType.equals("99")) {
                    b7 = Ascii.DC4;
                }
                break;
            case 3120:
                if (transType.equals(TransType.TRANS_TYPE_GROUP_BUY)) {
                    b7 = Ascii.NAK;
                }
                break;
            case 3185:
                if (transType.equals(TransType.TRANS_TYPE_PALMBUY)) {
                    b7 = Ascii.SYN;
                }
                break;
            case 3214:
                if (transType.equals(TransType.TRANS_TYPE_GRAB)) {
                    b7 = Ascii.ETB;
                }
                break;
            case 3219:
                if (transType.equals(TransType.TRANS_TYPE_PRE_PAY)) {
                    b7 = Ascii.CAN;
                }
                break;
            case 3248:
                if (transType.equals(TransType.TRANS_TYPE_OK_CARD)) {
                    b7 = Ascii.EM;
                }
                break;
            case 3250:
                if (transType.equals(TransType.TRANS_TYPE_BILLER_TRANSPORT)) {
                    b7 = Ascii.SUB;
                }
                break;
            case 3272:
                if (transType.equals(TransType.TRANS_TYPE_BILLER_RELIGIOUS)) {
                    b7 = Ascii.ESC;
                }
                break;
            case 3273:
                if (transType.equals(TransType.TRANS_TYPE_BILLER_EDUCATION)) {
                    b7 = Ascii.FS;
                }
                break;
            case 3276:
                if (transType.equals(TransType.TRANS_TYPE_LOCAL_LIFE)) {
                    b7 = Ascii.GS;
                }
                break;
            case 3305:
                if (transType.equals(TransType.TRANS_TYPE_BILLER_GOVERNMENT_PAYMENTS)) {
                    b7 = Ascii.RS;
                }
                break;
            case 3306:
                if (transType.equals(TransType.TRANS_TYPE_BILLER_INVOICE_PAYMENTS)) {
                    b7 = Ascii.US;
                }
                break;
            case 3307:
                if (transType.equals(TransType.TRANS_TYPE_BILLER_TRAVEL_HOTEL_PAYMENTS)) {
                    b7 = 32;
                }
                break;
            case 3308:
                if (transType.equals(TransType.TRANS_TYPE_BILLER_FINANCIAL_SERVICES_PAYMENTS)) {
                    b7 = 33;
                }
                break;
            case 3309:
                if (transType.equals(TransType.TRANS_TYPE_BILLER_BANKONE_MFBS_PAYMENTS)) {
                    b7 = 34;
                }
                break;
            case 3310:
                if (transType.equals(TransType.TRANS_TYPE_BILLER_PRODUCTS_SERVICES_PAYMENTS)) {
                    b7 = 35;
                }
                break;
            case 3311:
                if (transType.equals(TransType.TRANS_TYPE_BILLER_COWRY_CARD_PAYMENTS)) {
                    b7 = 36;
                }
                break;
            case 3338:
                if (transType.equals(TransType.TRANS_TYPE_BUY_EARLY_REFUND)) {
                    b7 = 37;
                }
                break;
            case 3367:
                if (transType.equals(TransType.TRANS_TYPE_BILLER_WAEC_PAYMENTS)) {
                    b7 = 38;
                }
                break;
            case 3525:
                if (transType.equals(TransType.TRANS_TYPE_BILLER_ONLINE_SHOPPING)) {
                    b7 = 39;
                }
                break;
            case 3526:
                if (transType.equals(TransType.TRANS_TYPE_BILLER_EVENT_TICKET)) {
                    b7 = 40;
                }
                break;
            case 3527:
                if (transType.equals(TransType.TRANS_TYPE_BILLER_DUES_AND_SERVICE_CHARGE)) {
                    b7 = 41;
                }
                break;
            case 3528:
                if (transType.equals(TransType.TRANS_TYPE_BILLER_CREDIT_AND_LOANS)) {
                    b7 = 42;
                }
                break;
            case 3529:
                if (transType.equals(TransType.TRANS_TYPE_BILLER_COMMERCE_RETAIL_TRADE)) {
                    b7 = 43;
                }
                break;
            case 3551:
                if (transType.equals(TransType.TRANS_TYPE_BILLER_ASSOCIATIONS_AND_SOCIETIES)) {
                    b7 = 44;
                }
                break;
            case 3583:
                if (transType.equals(TransType.TRANS_TYPE_FIXED_SAVING)) {
                    b7 = 45;
                }
                break;
            case 3584:
                if (transType.equals(TransType.TRANS_TYPE_FIXED_SAVING_PAID)) {
                    b7 = 46;
                }
                break;
            case 3646:
                if (transType.equals(TransType.TRANS_TYPE_ONELOOP_AIRTIME_BUY)) {
                    b7 = 47;
                }
                break;
            case 3647:
                if (transType.equals(TransType.TRANS_TYPE_ONELOOP_AIRTIME_SELL)) {
                    b7 = 48;
                }
                break;
            case 3648:
                if (transType.equals(TransType.TRANS_TYPE_OPERATING)) {
                    b7 = 49;
                }
                break;
            case 3676:
                if (transType.equals(TransType.TRANS_TYPE_AGENT_COMMISSION)) {
                    b7 = 50;
                }
                break;
            case 3679:
                if (transType.equals(TransType.TRANS_TYPE_PAY_SHOP)) {
                    b7 = 51;
                }
                break;
            case 3712:
                if (transType.equals(TransType.TRANS_TYPE_USSD_CHARGE)) {
                    b7 = 52;
                }
                break;
            case 3739:
                if (transType.equals(TransType.TRANS_TYPE_GENIEX_DATA_BUNDLE)) {
                    b7 = 53;
                }
                break;
            case 3740:
                if (transType.equals(TransType.TRANS_TYPE_GENIEX_RECHARGE_BALANCE)) {
                    b7 = 54;
                }
                break;
            case 49675759:
                if (transType.equals(TransType.BILL_TYPE_LUCKY_MONEY)) {
                    b7 = 55;
                }
                break;
            case 50420689:
                if (transType.equals(TransType.BILL_TYPE_REFUND)) {
                    b7 = 56;
                }
                break;
            case 53310381:
                if (transType.equals(TransType.BILL_TYPE_REPAY_LOAN)) {
                    b7 = 57;
                }
                break;
            case 53369965:
                if (transType.equals(TransType.BILL_TYPE_QRCODE_PAYMENT)) {
                    b7 = 58;
                }
                break;
            case 308988352:
                if (transType.equals(TransType.BILL_TYPE_DEBIT_CARD)) {
                    b7 = 59;
                }
                break;
            case 1455127103:
                if (transType.equals(TransType.BILL_TYPE_COMBINE_MERCHANT)) {
                    b7 = 60;
                }
                break;
            case 1464056546:
                if (transType.equals(TransType.BILL_TYPE_CASHBOX)) {
                    b7 = 61;
                }
                break;
            case 1722532172:
                if (transType.equals(TransType.BILL_TYPE_TRANSFER)) {
                    b7 = 62;
                }
                break;
        }
        switch (b7) {
            case 0:
                return context.getString(k.core_disbursement);
            case 1:
                return context.getString(k.core_add_money);
            case 2:
                return context.getString(k.core_withdraw);
            case 3:
            case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                return context.getString(k.core_money_transfer);
            case 4:
                return context.getString(k.core_top_up_airtime);
            case 5:
                return context.getString(k.core_water);
            case 6:
                return context.getString(k.core_electricity);
            case 7:
                return context.getString(k.core_tv);
            case 8:
            case 16:
                return context.getString(k.core_p2p_cash_in);
            case 9:
            case 17:
                return context.getString(k.core_p2p_cash_out);
            case 10:
                return context.getString(k.core_commission);
            case 11:
                return context.getString(k.core_internet);
            case 12:
                return context.getString(k.core_buy_bundle);
            case 13:
                return context.getString(k.core_auto_deduct);
            case 14:
                return context.getString(k.core_insurance);
            case 15:
                return context.getString(k.core_lucky_money);
            case 18:
                return context.getString(k.core_interbank_transfer);
            case 19:
                return context.getString(k.core_betting);
            case 20:
                return context.getString(k.core_refund);
            case 21:
                return context.getString(k.core_group_discount);
            case 22:
                return context.getString(k.core_palmbuy);
            case 23:
                return context.getString(k.core_grab);
            case 24:
                return context.getString(k.core_prepay_top_up);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return context.getString(k.core_ok_card);
            case 26:
                return context.getString(k.core_transportation_tolls);
            case 27:
                return context.getString(k.core_religious);
            case 28:
                return context.getString(k.core_education);
            case 29:
                return context.getString(k.core_nearby_offers);
            case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                return context.getString(k.core_biller_government_payments);
            case 31:
                return context.getString(k.core_biller_invoice_payments);
            case 32:
                return context.getString(k.core_biller_travel_hotel_payments);
            case 33:
                return context.getString(k.core_biller_financial_services_payments);
            case 34:
                return context.getString(k.core_biller_bankone_mfbs_payments);
            case 35:
                return context.getString(k.core_biller_products_services_payments);
            case 36:
                return context.getString(k.core_biller_cowry_card_payments);
            case 37:
                return context.getString(k.core_early_refund);
            case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                return context.getString(k.core_biller_waec_payments);
            case 39:
                return context.getString(k.core_biller_online_shopping_payments);
            case 40:
                return context.getString(k.core_biller_event_ticket_payments);
            case 41:
                return context.getString(k.core_biller_dues_and_service_charge_payments);
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                return context.getString(k.core_biller_credit_and_loans_payments);
            case 43:
                return context.getString(k.core_biller_commerce_retail_trade_payments);
            case 44:
                return context.getString(k.core_biller_associations_and_societies_payments);
            case 45:
                return context.getString(k.core_fixed_saving);
            case 46:
                return context.getString(k.core_fixed_saving_paid);
            case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                return context.getString(k.core_daily_flash_sales);
            case 48:
                return context.getString(k.core_sell_airtime);
            case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                return context.getString(k.core_activity);
            case 50:
                return context.getString(k.core_palmpay_plus);
            case 51:
                return context.getString(k.core_pay_shop);
            case 52:
                return context.getString(k.core_ussd_charge);
            case 53:
                return context.getString(k.core_geniex_data);
            case 54:
                return context.getString(k.core_geniex_recharge);
            case 55:
                return context.getString(k.core_lucky_money);
            case 56:
                return context.getString(k.core_refund);
            case 57:
                return context.getString(k.core_repay_loan);
            case 58:
                return context.getString(k.core_qrcode);
            case 59:
                return context.getString(k.core_debit_card);
            case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                return context.getString(k.core_merchant);
            case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                return context.getString(k.core_palmpay_payment_cash_box);
            default:
                return "";
        }
    }
}
