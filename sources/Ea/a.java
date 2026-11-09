package Ea;

import C0.G;
import N8.q0;
import Pa.T;
import Pa.i0;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.core.bean.bill.SubTransType;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2262a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f2263b;

    public static final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f2263b) {
            return;
        }
        Thread.currentThread().getName();
        synchronized (f2262a) {
            if (f2263b) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            Intrinsics.f(applicationContext, "null cannot be cast to non-null type android.app.Application");
            Application application = (Application) applicationContext;
            SystemClock.elapsedRealtime();
            try {
                try {
                    ExecutorService executorServiceB = T.b(-4);
                    if (executorServiceB instanceof ThreadPoolExecutor) {
                        ARouter.setExecutor((ThreadPoolExecutor) executorServiceB);
                    }
                    ARouter.init(application);
                } catch (Exception e10) {
                    Log.e("ARouterInit", "ensureInit fail: " + e10.getMessage());
                    try {
                        ARouter.init(application);
                    } catch (Exception unused) {
                    }
                }
                f2263b = true;
                SystemClock.elapsedRealtime();
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                f2263b = true;
                SystemClock.elapsedRealtime();
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0129, code lost:
    
        if (r7.equals("01") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x012f, code lost:
    
        if (r9 == 5) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0132, code lost:
    
        if (r9 == 6) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0136, code lost:
    
        if (r9 == 23) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r7.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_CASH_BOX_INTEREST) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x013a, code lost:
    
        return com.transsnet.palmpay.custom_view.r.cv_bill_bank_card;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x013d, code lost:
    
        return com.transsnet.palmpay.custom_view.r.cv_bill_ussd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0140, code lost:
    
        return com.transsnet.palmpay.custom_view.r.cv_bill_bank_card;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0143, code lost:
    
        return com.transsnet.palmpay.custom_view.r.cv_bill_bank_card;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r7.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_PAY_SHOP) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r7.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_WITHDRAW_TO_AGENT) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r5 <= 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        return com.transsnet.palmpay.custom_view.r.cv_bill_receive_money;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_PAY_SHOP.equals(r7) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        return com.transsnet.palmpay.custom_view.r.cv_bill_payshop;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        return com.transsnet.palmpay.custom_view.r.cv_bill_withdraw_agent;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        if (r7.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_CASH_BOX_COUPON) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        if (r7.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_CASH_BOX_WITHDRAW) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006a, code lost:
    
        if (r7.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_CASH_BOX_DEPOSIT) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        return com.transsnet.palmpay.custom_view.r.cv_cash_box_icon_circle_purple;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
    
        if (r7.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_OK_CARD_EXTEND) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0095, code lost:
    
        if (r7.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_CL_REPAY) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009f, code lost:
    
        if (r7.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_CL_BORROW) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a5, code lost:
    
        return com.transsnet.palmpay.custom_view.r.cv_cl_cash_loan_icon;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ac, code lost:
    
        if (r7.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_OK_CARD) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b2, code lost:
    
        return com.transsnet.palmpay.custom_view.r.cv_ok_card_icon;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b9, code lost:
    
        if (r7.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_NIBSS_CHARGE_BACK) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c3, code lost:
    
        if (r7.equals("99") == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00cd, code lost:
    
        if (r7.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_CHARGE_BACK) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d2, code lost:
    
        return com.transsnet.palmpay.custom_view.r.cv_bill_refund;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ea, code lost:
    
        if (r7.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_AUTO_DEDUCT) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f3, code lost:
    
        if (r7.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_THIRD_PARTY_MERCHANT) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00fc, code lost:
    
        if (r7.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_BIND_BANK_CARD) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0105, code lost:
    
        if (r7.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_MERCHANT_PAYMENT) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x010a, code lost:
    
        return com.transsnet.palmpay.custom_view.r.cv_default_merchat;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int b(long r5, java.lang.String r7, int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ea.a.b(long, java.lang.String, int, int):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x015f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0162  */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0154, code lost:
    
        if (r6.equals("01") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r6.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_CASH_BOX_INTEREST) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0184, code lost:
    
        if (r8 != null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x018d, code lost:
    
        if (r8.intValue() != 23) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0190, code lost:
    
        if (r8 != null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0193, code lost:
    
        r8.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0198, code lost:
    
        r6 = com.transsnet.palmpay.custom_view.r.cv_bill_bank_card;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r6.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_PAY_SHOP) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r6.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_WITHDRAW_TO_AGENT) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r9 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        r7 = r9.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r7 <= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        r6 = com.transsnet.palmpay.custom_view.r.cv_bill_receive_money;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_PAY_SHOP.equals(r6) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        r6 = com.transsnet.palmpay.custom_view.r.cv_bill_payshop;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        r6 = com.transsnet.palmpay.custom_view.r.cv_bill_withdraw_agent;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        if (r6.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_CASH_BOX_COUPON) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        if (r6.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_CASH_BOX_WITHDRAW) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        if (r6.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_CASH_BOX_DEPOSIT) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
    
        r6 = com.transsnet.palmpay.custom_view.r.cv_cash_box_icon_circle_purple;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b0, code lost:
    
        if (r6.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_CL_REPAY) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ba, code lost:
    
        if (r6.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_CL_BORROW) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00be, code lost:
    
        r6 = com.transsnet.palmpay.custom_view.r.cv_cl_cash_loan_icon;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c8, code lost:
    
        if (r6.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_NIBSS_CHARGE_BACK) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d2, code lost:
    
        if (r6.equals("99") == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00dc, code lost:
    
        if (r6.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_CHARGE_BACK) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e0, code lost:
    
        r6 = com.transsnet.palmpay.custom_view.r.cv_bill_refund;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0105, code lost:
    
        if (r6.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_AUTO_DEDUCT) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x010e, code lost:
    
        if (r6.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_THIRD_PARTY_MERCHANT) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0117, code lost:
    
        if (r6.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_BIND_BANK_CARD) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0120, code lost:
    
        if (r6.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_MERCHANT_PAYMENT) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0123, code lost:
    
        r6 = com.transsnet.palmpay.custom_view.r.cv_default_merchat;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.net.Uri c(java.lang.String r6, java.lang.Integer r7, java.lang.Integer r8, java.lang.Long r9) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ea.a.c(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Long):android.net.Uri");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean e(String str, String str2, String str3) {
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case 1537:
                if (!str.equals("01")) {
                    return false;
                }
                G.z("/cash_in_out/billdetail", "orderNo", str2, "extra_type", str);
                return true;
            case 1538:
                if (!str.equals("02")) {
                    return false;
                }
                G.z("/cash_in_out/billdetail", "orderNo", str2, "extra_type", str);
                return true;
            case 1539:
                if (!str.equals("03")) {
                    return false;
                }
                q0.v("/smorder/detail", "orderId", str2);
                return true;
            case 1540:
                if (!str.equals("04")) {
                    return false;
                }
                q0.v("/airtime/billdetail", "orderNo", str2);
                return true;
            case 1572:
                if (!str.equals("15")) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 1573:
                if (!str.equals("16")) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 1574:
                if (!str.equals("17")) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 1602:
                if (!str.equals(TransType.TRANS_TYPE_MERCHANT_PAYMENT)) {
                    return false;
                }
                SubTransType subTransType = SubTransType.INSTANCE;
                if (!Intrinsics.c(subTransType.getSUB_TRANS_TYPE_PAY_CODE(), str3) && !Intrinsics.c(subTransType.getSUB_TRANS_TYPE_MERCHANT_PAY_CODE(), str3)) {
                    return true;
                }
                G.z("/main/paycode_order_detail", "orderNo", str2, "extra_type", str3);
                return true;
            case 1604:
                if (!str.equals(TransType.TRANS_TYPE_COMMISSION)) {
                    return false;
                }
                d.H("/main/commission_order_detail", "orderId", str2);
                return true;
            case 1606:
                if (!str.equals(TransType.TRANS_TYPE_BIND_BANK_CARD)) {
                    return false;
                }
                G.z("/cash_in_out/billdetail", "orderNo", str2, "extra_type", str);
                return true;
            case 1607:
                if (!str.equals("29")) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", "29");
                return true;
            case 1633:
                if (!str.equals(TransType.TRANS_TYPE_BUNDLE)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 1634:
                if (!str.equals(TransType.TRANS_TYPE_THIRD_PARTY_MERCHANT)) {
                    return false;
                }
                d.H("/main/third_party_merchant_order_detail", "orderId", str2);
                return true;
            case 1635:
                if (!str.equals(TransType.TRANS_TYPE_AUTO_DEDUCT)) {
                    return false;
                }
                G.z("/credit_score/oc_repay_order_detail_in_palmpay_activity", "orderType", TransType.TRANS_TYPE_AUTO_DEDUCT, "orderNo", str2);
                return true;
            case 1660:
                if (!str.equals(TransType.TRANS_TYPE_BULK_DISBURSEMENT)) {
                    return false;
                }
                G.z("/main/disbursement_order_detail", "orderId", str2, "extra_data", str);
                return true;
            case 1661:
                if (!str.equals(TransType.TRANS_TYPE_MERCHANT_DISBURSEMENT)) {
                    return false;
                }
                G.z("/main/interbank_cashin_order_detail", "orderId", str2, "transfer_type", str);
                return true;
            case 1664:
                if (!str.equals(TransType.TRANS_TYPE_BILLER_INSURANCE)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 1691:
                if (!str.equals(TransType.TRANS_TYPE_REFUND_2)) {
                    return false;
                }
                G.z("/main/refund_billdetail", "orderNo", str2, "extra_data", str);
                return true;
            case 1694:
                if (!str.equals(TransType.TRANS_TYPE_CHARGE_BACK)) {
                    return false;
                }
                G.z("/main/refund_billdetail", "orderNo", str2, "extra_data", str);
                return true;
            case 1695:
                if (!str.equals(TransType.TRANS_TYPE_BULK_MERCHANT_DISBURSEMENT)) {
                    return false;
                }
                G.z("/main/interbank_cashin_order_detail", "orderId", str2, "transfer_type", str);
                return true;
            case 1722:
                if (!str.equals(TransType.TRANS_TYPE_INTERBANK_CASH_IN)) {
                    return false;
                }
                G.z("/main/interbank_cashin_order_detail", "orderId", str2, "transfer_type", str);
                return true;
            case 1790:
                if (!str.equals(TransType.TRANS_TYPE_PARTNER_MERCHANT_B_SCAN_C)) {
                    return false;
                }
                d.H("/main/main_qrcode_pay_bill_detail_page", "orderId", str2);
                return true;
            case 1791:
                if (!str.equals(TransType.TRANS_TYPE_PARTNER_MERCHANT_C_SCAN_B)) {
                    return false;
                }
                d.H("/main/main_qrcode_pay_bill_detail_page", "orderId", str2);
                return true;
            case 1793:
                if (!str.equals(TransType.TRANS_TYPE_AGENT_SEND_MONEY_TO_PALMPAY)) {
                    return false;
                }
                G.z("/main/interbank_cashin_order_detail", "orderId", str2, "transfer_type", str);
                return true;
            case 1821:
                if (!str.equals(TransType.TRANS_TYPE_BILLER_BETTING)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 1822:
                if (!str.equals(TransType.TRANS_TYPE_AUTO_WITHDRAW)) {
                    return false;
                }
                G.z("/cash_in_out/billdetail", "orderNo", str2, "extra_type", str);
                return true;
            case 1824:
                if (!str.equals("99")) {
                    return false;
                }
                G.z("/main/refund_billdetail", "orderNo", str2, "extra_data", str);
                return true;
            case 3093:
                if (!str.equals(TransType.TRANS_TYPE_AWOOF_MONI_COMMISSION)) {
                    return false;
                }
                d.H("/jara_packet/commission_detailS", "orderId", str2);
                return true;
            case 3104:
                if (!str.equals(TransType.TRANS_TYPE_BUCKET_DATA)) {
                    return false;
                }
                d.y("BucketDataOrderDetail", "orderNo", str2);
                return true;
            case 3111:
                if (!str.equals(TransType.TRANS_TYPE_WITHDRAW_EARN)) {
                    return false;
                }
                i0.c0(com.transsnet.palmpay.core.config.d.g("/cashbox/common-transaction-detail?transType=" + str + "&orderId=" + str2));
                return true;
            case 3112:
                if (!str.equals(TransType.TRANS_TYPE_PURCHASE_EARN)) {
                    return false;
                }
                i0.c0(com.transsnet.palmpay.core.config.d.g("/cashbox/common-transaction-detail?transType=" + str + "&orderId=" + str2));
                return true;
            case 3117:
                if (!str.equals(TransType.TRANS_TYPE_PAY_MONEY_TO_PALMPAY_BUSINESS)) {
                    return false;
                }
                q0.v("/main/_offline_payment_detail_billdetail", "orderNo", str2);
                return true;
            case 3120:
                if (!str.equals(TransType.TRANS_TYPE_GROUP_BUY)) {
                    return false;
                }
                q0.v("/group_buy/order_detail", "orderId", str2);
                return true;
            case 3185:
                if (!str.equals(TransType.TRANS_TYPE_PALMBUY)) {
                    return false;
                }
                q0.v("/mall/payment_order_detail_page", "orderId", str2);
                return true;
            case 3214:
                if (!str.equals(TransType.TRANS_TYPE_GRAB)) {
                    return false;
                }
                q0.v("/mall/grab_order_detail_activity", "orderId", str2);
                return true;
            case 3217:
                if (!str.equals(TransType.TRANS_TYPE_NIBSS_CHARGE_BACK)) {
                    return false;
                }
                G.z("/main/refund_billdetail", "orderNo", str2, "extra_data", str);
                return true;
            case 3248:
                if (!str.equals(TransType.TRANS_TYPE_OK_CARD)) {
                    return false;
                }
                G.z("/credit_score/oc_repay_order_detail_in_palmpay_activity", "orderType", TransType.TRANS_TYPE_OK_CARD, "orderNo", str2);
                return true;
            case 3250:
                if (!str.equals(TransType.TRANS_TYPE_BILLER_TRANSPORT)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3272:
                if (!str.equals(TransType.TRANS_TYPE_BILLER_RELIGIOUS)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3273:
                if (!str.equals(TransType.TRANS_TYPE_BILLER_EDUCATION)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3276:
                if (!str.equals(TransType.TRANS_TYPE_LOCAL_LIFE)) {
                    return false;
                }
                q0.v("/local_life/payment_detail", "orderId", str2);
                return true;
            case 3305:
                if (!str.equals(TransType.TRANS_TYPE_BILLER_GOVERNMENT_PAYMENTS)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3306:
                if (!str.equals(TransType.TRANS_TYPE_BILLER_INVOICE_PAYMENTS)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3307:
                if (!str.equals(TransType.TRANS_TYPE_BILLER_TRAVEL_HOTEL_PAYMENTS)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3308:
                if (!str.equals(TransType.TRANS_TYPE_BILLER_FINANCIAL_SERVICES_PAYMENTS)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3309:
                if (!str.equals(TransType.TRANS_TYPE_BILLER_BANKONE_MFBS_PAYMENTS)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3310:
                if (!str.equals(TransType.TRANS_TYPE_BILLER_PRODUCTS_SERVICES_PAYMENTS)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3311:
                if (!str.equals(TransType.TRANS_TYPE_BILLER_COWRY_CARD_PAYMENTS)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3338:
                if (!str.equals(TransType.TRANS_TYPE_BUY_EARLY_REFUND)) {
                    return false;
                }
                q0.v("/main/buy_early_refund_billdetail", "orderId", str2);
                return true;
            case 3340:
                if (!str.equals(TransType.TRANS_TYPE_CL_BORROW)) {
                    return false;
                }
                G.z("/credit_score/oc_repay_order_detail_in_palmpay_activity", "orderType", TransType.TRANS_TYPE_CL_BORROW, "orderNo", str2);
                return true;
            case 3341:
                if (!str.equals(TransType.TRANS_TYPE_CL_REPAY)) {
                    return false;
                }
                G.z("/credit_score/oc_repay_order_detail_in_palmpay_activity", "orderType", TransType.TRANS_TYPE_CL_REPAY, "orderNo", str2);
                return true;
            case 3367:
                if (!str.equals(TransType.TRANS_TYPE_BILLER_WAEC_PAYMENTS)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3398:
                if (!str.equals(TransType.TRANS_TYPE_MY_TRIP)) {
                    return false;
                }
                i0.c0(com.transsnet.palmpay.core.config.d.g("/my-trip/order-detail?source=transaction_result&orderNo=" + str2));
                return true;
            case 3466:
                if (!str.equals(TransType.TRANS_TYPE_BILLER_JAMB_PAYMENTS)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3490:
                if (!str.equals(TransType.TRANS_TYPE_INSTALMENT_PAYMENT)) {
                    return false;
                }
                d.H("/credit_score/oc_install_bill_detail_activity", "orderNo", str2);
                return true;
            case 3522:
                if (!str.equals(TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3525:
                if (!str.equals(TransType.TRANS_TYPE_BILLER_ONLINE_SHOPPING)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3526:
                if (!str.equals(TransType.TRANS_TYPE_BILLER_EVENT_TICKET)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3527:
                if (!str.equals(TransType.TRANS_TYPE_BILLER_DUES_AND_SERVICE_CHARGE)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3528:
                if (!str.equals(TransType.TRANS_TYPE_BILLER_CREDIT_AND_LOANS)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3529:
                if (!str.equals(TransType.TRANS_TYPE_BILLER_COMMERCE_RETAIL_TRADE)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3551:
                if (!str.equals(TransType.TRANS_TYPE_BILLER_ASSOCIATIONS_AND_SOCIETIES)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3555:
                if (!str.equals(TransType.TRANS_TYPE_B2C)) {
                    return false;
                }
                G.z("/main/interbank_cashin_order_detail", "orderId", str2, "transfer_type", str);
                return true;
            case 3583:
                if (!str.equals(TransType.TRANS_TYPE_FIXED_SAVING)) {
                    return false;
                }
                ARouter.getInstance().build("/manage_money/detail_activity").withInt("detail_type", 1).withString("orderNo", str2).withString("transType", TransType.TRANS_TYPE_FIXED_SAVING).navigation();
                return true;
            case 3584:
                if (!str.equals(TransType.TRANS_TYPE_FIXED_SAVING_PAID)) {
                    return false;
                }
                ARouter.getInstance().build("/manage_money/detail_activity").withInt("detail_type", 1).withString("orderNo", str2).withString("transType", TransType.TRANS_TYPE_FIXED_SAVING_PAID).navigation();
                return true;
            case 3590:
                if (!str.equals(TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW_SECURITY_ORDER_CODE)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3620:
                if (!str.equals(TransType.TRANS_TYPE_NIBSS_IN_89)) {
                    return false;
                }
                G.z("/main/interbank_cashin_order_detail", "orderId", str2, "transfer_type", str);
                return true;
            case 3622:
                if (!str.equals(TransType.TRANS_TYPE_EXCHANGE_CASH_DEPOSIT)) {
                    return false;
                }
                G.z("/p2p/exchange_cash_transaction_detail", "orderNo", str2, "transType", str);
                return true;
            case 3645:
                if (!str.equals(TransType.TRANS_TYPE_EXCHANGE_CASH_BALANCE_PAYMENT)) {
                    return false;
                }
                G.z("/p2p/exchange_cash_transaction_detail", "orderNo", str2, "transType", str);
                return true;
            case 3646:
                if (!str.equals(TransType.TRANS_TYPE_ONELOOP_AIRTIME_BUY)) {
                    return false;
                }
                q0.v("/airtime/billdetail", "orderNo", str2);
                return true;
            case 3647:
                if (!str.equals(TransType.TRANS_TYPE_ONELOOP_AIRTIME_SELL)) {
                    return false;
                }
                d.H("/airtime/recharge_2_cash_detail", "orderNo", str2);
                return true;
            case 3648:
                if (!str.equals(TransType.TRANS_TYPE_OPERATING)) {
                    return false;
                }
                d.H("/credit_score/reward_order_detail_activity", "orderId", str2);
                return true;
            case 3649:
                if (!str.equals(TransType.TRANS_TYPE_CASH_BOX_DEPOSIT)) {
                    return false;
                }
                G.z("/manage_money/cash_box_order_detail_activity", "orderNo", str2, "transType", str);
                return true;
            case 3650:
                if (!str.equals(TransType.TRANS_TYPE_CASH_BOX_WITHDRAW)) {
                    return false;
                }
                G.z("/manage_money/cash_box_order_detail_activity", "orderNo", str2, "transType", str);
                return true;
            case 3652:
                if (!str.equals(TransType.TRANS_TYPE_CASH_BOX_COUPON)) {
                    return false;
                }
                Bundle bundle = new Bundle();
                bundle.putString("transType", str);
                bundle.putString("orderNo", str2);
                d.x(bundle, "CashBoxCouponDetail");
                return true;
            case 3676:
                if (!str.equals(TransType.TRANS_TYPE_AGENT_COMMISSION)) {
                    return false;
                }
                d.H("/quick_teller/pp_online_agent_detail", "orderNo", str2);
                return true;
            case 3677:
                if (!str.equals(TransType.TRANS_TYPE_COMPENSATION)) {
                    return false;
                }
                d.H("/sm/compensation_detail", "orderId", str2);
                return true;
            case 3678:
                if (!str.equals(TransType.TRANS_TYPE_WITHDRAW_TO_AGENT)) {
                    return false;
                }
                d.x(p002a.a.e(new Pair("orderNo", str2), new Pair("transType", str)), "CommonDetail");
                return true;
            case 3679:
                if (!str.equals(TransType.TRANS_TYPE_PAY_SHOP)) {
                    return false;
                }
                d.x(p002a.a.e(new Pair("orderNo", str2), new Pair("transType", str)), "CommonDetail");
                return true;
            case 3683:
                if (!str.equals(TransType.TRANS_TYPE_CASH_BOX_INTEREST)) {
                    return false;
                }
                d.y("TrialCashDetail", "orderNo", str2);
                return true;
            case 3684:
                if (!str.equals(TransType.TRANS_TYPE_PALM_SAFE)) {
                    return false;
                }
                d.H("/main/palm_safe_detail", "orderId", str2);
                return true;
            case 3708:
                if (!str.equals(TransType.TRANS_TYPE_SPEND_SAVE_DEPOSIT)) {
                    return false;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("transType", str);
                bundle2.putString("orderNo", str2);
                d.x(bundle2, "SpendSaveDetail");
                return true;
            case 3709:
                if (!str.equals(TransType.TRANS_TYPE_SPEND_SAVE_WITHDRAW)) {
                    return false;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putString("transType", str);
                bundle3.putString("orderNo", str2);
                d.x(bundle3, "SpendSaveDetail");
                return true;
            case 3710:
                if (!str.equals(TransType.TRANS_TYPE_SPEND_SAVE_INTEREST)) {
                    return false;
                }
                Bundle bundle4 = new Bundle();
                bundle4.putString("transType", str);
                bundle4.putString("orderNo", str2);
                d.x(bundle4, "SpendSaveDetail");
                return true;
            case 3711:
                if (!str.equals(TransType.TRANS_TYPE_GIFT_CARD)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3712:
                if (!str.equals(TransType.TRANS_TYPE_USSD_CHARGE)) {
                    return false;
                }
                d.y("UssdChargeOrderDetail", "orderNo", str2);
                return true;
            case 3713:
                if (!str.equals(TransType.TRANS_TYPE_TRIP)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3714:
                if (!str.equals(TransType.TRANS_TYPE_V8)) {
                    return false;
                }
                i0.b0("/palmpay-card/transaction-detail?orderId=" + str2 + "&transType=" + str);
                return true;
            case 3715:
                if (!str.equals(TransType.TRANS_TYPE_V9)) {
                    return false;
                }
                i0.b0("/palmpay-card/card-transaction-detail?orderId=" + str2 + "&transType=" + str);
                return true;
            case 3737:
                if (!str.equals(TransType.TRANS_TYPE_W0)) {
                    return false;
                }
                i0.b0("/palmpay-card/card-transaction-detail?orderId=" + str2 + "&transType=" + str);
                return true;
            case 3738:
                if (!str.equals(TransType.TRANS_TYPE_W1)) {
                    return false;
                }
                i0.b0("/palmpay-card/card-transaction-detail?orderId=" + str2 + "&transType=" + str);
                return true;
            case 3739:
                if (!str.equals(TransType.TRANS_TYPE_GENIEX_DATA_BUNDLE)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3740:
                if (!str.equals(TransType.TRANS_TYPE_GENIEX_RECHARGE_BALANCE)) {
                    return false;
                }
                G.z("/quick_teller/bill_detail", "orderNo", str2, "extra_type", str);
                return true;
            case 3741:
                if (!str.equals(TransType.TRANS_TYPE_ACTIVITY)) {
                    return false;
                }
                if (!Intrinsics.c(str3, SubTransType.INSTANCE.getSUB_TRANS_TYPE_COUPON_PACKAGE())) {
                    return true;
                }
                d.y("CouponPackageDetails", "orderNo", str2);
                return true;
            case 3745:
                if (!str.equals(TransType.TRANS_TYPE_W8)) {
                    return false;
                }
                i0.b0("/palmpay-card/card-transaction-detail?orderId=" + str2 + "&transType=" + str);
                return true;
            case 3746:
                if (!str.equals(TransType.TRANS_TYPE_W9)) {
                    return false;
                }
                i0.b0("/palmpay-card/card-transaction-detail?orderId=" + str2 + "&transType=" + str);
                return true;
            case 3769:
                if (!str.equals(TransType.TRANS_TYPE_B2C_X1)) {
                    return false;
                }
                G.z("/main/interbank_cashin_order_detail", "orderId", str2, "transfer_type", str);
                return true;
            case 3771:
                if (!str.equals(TransType.TRANS_TYPE_X3)) {
                    return false;
                }
                i0.b0("/palmpay-card/card-transaction-detail?orderId=" + str2 + "&transType=" + str);
                return true;
            case 3774:
                if (!str.equals(TransType.TRANS_TYPE_PURCHASE_FUND)) {
                    return false;
                }
                i0.c0(com.transsnet.palmpay.core.config.d.g("/cashbox/common-transaction-detail?transType=" + str + "&orderId=" + str2));
                return true;
            case 3775:
                if (!str.equals(TransType.TRANS_TYPE_REDEEM_FUND)) {
                    return false;
                }
                i0.c0(com.transsnet.palmpay.core.config.d.g("/cashbox/common-transaction-detail?transType=" + str + "&orderId=" + str2));
                return true;
            case 3777:
                if (!str.equals(TransType.TRANS_TYPE_INSURANCE)) {
                    return false;
                }
                i0.c0(com.transsnet.palmpay.core.config.d.g("/cashbox/common-transaction-detail?transType=" + str + "&orderId=" + str2));
                return true;
            case 3800:
                if (!str.equals(TransType.TRANS_TYPE_Y1)) {
                    return false;
                }
                i0.b0("/palmpay-card/transaction-detail/y1?orderId=" + str2);
                return true;
            case 3836:
                if (!str.equals(TransType.TRANS_TYPE_TOTAL_REFUND)) {
                    return false;
                }
                Bundle bundle5 = new Bundle();
                bundle5.putString("compensationOrderNo", str2);
                d.x(bundle5, "EarlyRefundDetail");
                return true;
            default:
                return false;
        }
    }
}
