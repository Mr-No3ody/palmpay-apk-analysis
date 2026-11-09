package p070ee;

import F6.d;
import Pa.r0;
import Vd.a;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.camera.core.impl.C0998p0;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.BaseOrderDetailBean;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.bill.TransTypeUtils;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontReq;
import com.transsnet.palmpay.custom_view.bean.OrderDetailItemBean;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonExtKt;
import com.transsnet.palmpay.teller.bean.BillPaymentOrderDetailRsp;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderReq;
import com.transsnet.palmpay.teller.bean.DataBundleWalletItemBean;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f36289a;

    static {
        String simpleName = c.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        f36289a = simpleName;
    }

    public static OrderInfoForCustomerService a(BillPaymentOrderDetailRsp billPaymentOrderDetailRsp) {
        if (billPaymentOrderDetailRsp == null) {
            return null;
        }
        OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
        orderInfoForCustomerService.paymentType = TransTypeUtils.translateTransType(billPaymentOrderDetailRsp.getTransType());
        Long updateTime = billPaymentOrderDetailRsp.getUpdateTime();
        orderInfoForCustomerService.time = updateTime != null ? updateTime.longValue() : 0L;
        Long payAmount = billPaymentOrderDetailRsp.getPayAmount();
        orderInfoForCustomerService.amount = payAmount != null ? payAmount.longValue() : 0L;
        Long payFee = billPaymentOrderDetailRsp.getPayFee();
        orderInfoForCustomerService.fee = payFee != null ? payFee.longValue() : 0L;
        orderInfoForCustomerService.orderNumber = billPaymentOrderDetailRsp.getOrderNo();
        orderInfoForCustomerService.orderStatus = billPaymentOrderDetailRsp.getOrderStatusDesc();
        Long vatFee = billPaymentOrderDetailRsp.getVatFee();
        orderInfoForCustomerService.vat = vatFee != null ? vatFee.longValue() : 0L;
        Long loyaltyPoint = billPaymentOrderDetailRsp.getLoyaltyPoint();
        orderInfoForCustomerService.pointsUsed = loyaltyPoint != null ? loyaltyPoint.longValue() : 0L;
        Long returnPoint = billPaymentOrderDetailRsp.getReturnPoint();
        orderInfoForCustomerService.pointsEarned = returnPoint != null ? returnPoint.longValue() : 0L;
        orderInfoForCustomerService.transType = billPaymentOrderDetailRsp.getTransType();
        if (billPaymentOrderDetailRsp.getOrderStatusInfo() != null) {
            BillProcessDetail orderStatusInfo = billPaymentOrderDetailRsp.getOrderStatusInfo();
            orderInfoForCustomerService.faqUrl = orderStatusInfo != null ? orderStatusInfo.faqLink : null;
            BillProcessDetail orderStatusInfo2 = billPaymentOrderDetailRsp.getOrderStatusInfo();
            orderInfoForCustomerService.feedbackLink = orderStatusInfo2 != null ? orderStatusInfo2.feedbackLink : null;
        }
        return orderInfoForCustomerService;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0137, code lost:
    
        r3 = r3.getString(Vd.a.qt_account_number);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, "getString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0140, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
    
        if (r4.equals("29") == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0093, code lost:
    
        if (r4.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_BIND_BANK_CARD) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009d, code lost:
    
        if (r4.equals("27") == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a7, code lost:
    
        if (r4.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_COMMISSION) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b1, code lost:
    
        if (r4.equals("19") == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bb, code lost:
    
        if (r4.equals("18") == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
    
        if (r4.equals("17") == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cf, code lost:
    
        if (r4.equals("16") == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d9, code lost:
    
        if (r4.equals("15") == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e3, code lost:
    
        if (r4.equals("14") == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ec, code lost:
    
        if (r4.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_AIRTIME_LOAN) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f5, code lost:
    
        if (r4.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_REPAY_CASH_LOAN) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00fe, code lost:
    
        if (r4.equals("31") == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0107, code lost:
    
        if (r4.equals("30") == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0110, code lost:
    
        if (r4.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_REPAY_AIRTIME_LOAN) != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0119, code lost:
    
        if (r4.equals("20") == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0122, code lost:
    
        if (r4.equals("5") == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x012b, code lost:
    
        if (r4.equals("2") == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0134, code lost:
    
        if (r4.equals("0") == false) goto L102;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.content.Context r3, java.lang.String r4) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p070ee.c.b(android.content.Context, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 int, still in use, count: 7, list:
      (r0v1 int) from 0x0014: IF  (r0v1 int) == (1629 int)  -> B:168:0x0281 A[HIDDEN] (LINE:21)
      (r0v1 int) from 0x0018: IF  (r0v1 int) == (1630 int)  -> B:163:0x026e A[HIDDEN] (LINE:25)
      (r0v1 int) from 0x001d: SWITCH (r0v1 int)
     case 53: goto B:143:0x0222
     case 54: goto B:138:0x020e
     case 55: goto B:133:0x01fa
     case 56: goto B:128:0x01e6
     case 57: goto B:123:0x01d2
     default: goto B:13:0x0020 A[RegionRef:SW:12] (LINE:30)
      (r0v1 int) from 0x0020: SWITCH (r0v1 int)
     case 1569: goto B:118:0x01be
     case 1570: goto B:113:0x01aa
     case 1571: goto B:108:0x0196
     case 1572: goto B:103:0x0182
     case 1573: goto B:98:0x016e
     case 1574: goto B:93:0x015a
     case 1575: goto B:88:0x0146
     case 1576: goto B:83:0x0132
     default: goto B:14:0x0023 A[RegionRef:SW:13] (LINE:33)
      (r0v1 int) from 0x0023: SWITCH (r0v1 int)
     case 1598: goto B:78:0x011e
     case 1599: goto B:73:0x010a
     case 1600: goto B:68:0x00f6
     case 1601: goto B:63:0x00e2
     case 1602: goto B:58:0x00ce
     default: goto B:15:0x0026 A[RegionRef:SW:14] (LINE:36)
      (r0v1 int) from 0x0026: SWITCH (r0v1 int)
     case 1604: goto B:53:0x00ba
     case 1605: goto B:48:0x00a6
     case 1606: goto B:43:0x0092
     case 1607: goto B:38:0x007e
     default: goto B:16:0x0029 A[RegionRef:SW:15] (LINE:39)
      (r0v1 int) from 0x0029: SWITCH (r0v1 int)
     case 1634: goto B:33:0x006a
     case 1635: goto B:28:0x0056
     case 1636: goto B:23:0x0042
     case 1637: goto B:18:0x002e
     default: goto B:177:? A[RegionRef:SW:16] (LINE:42)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String c(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null || str == null) {
            return "";
        }
        if (iHashCode == 1629) {
            if (!str.equals("30")) {
                return "";
            }
            String string = context.getString(a.qt_commerce_retail_trade_home_page_banner);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (iHashCode == 1630) {
            if (!str.equals("31")) {
                return "";
            }
            String string2 = context.getString(a.qt_associations_and_societies_home_page_banner);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        switch (str) {
            case "0":
                String string3 = context.getString(a.qt_water);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case "1":
                String string4 = context.getString(a.qt_electricity);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case "2":
                String string5 = context.getString(a.qt_cable_tv);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            default:
                switch (str) {
                    case 53:
                        if (!str.equals("5")) {
                            return "";
                        }
                        String string6 = context.getString(a.qt_internet);
                        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                        return string6;
                    case 54:
                        if (!str.equals(AddFamilyAccontReq.BILLER_CATEGORY_ID_BUNDLE)) {
                            return "";
                        }
                        String string7 = context.getString(a.qt_bundle_bills);
                        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                        return string7;
                    case 55:
                        if (!str.equals("7")) {
                            return "";
                        }
                        String string8 = context.getString(a.qt_insurance);
                        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                        return string8;
                    case 56:
                        if (!str.equals("8")) {
                            return "";
                        }
                        String string9 = context.getString(a.qt_betting);
                        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                        return string9;
                    case 57:
                        if (!str.equals("9")) {
                            return "";
                        }
                        String string10 = context.getString(a.qt_prepaid_card);
                        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                        return string10;
                    default:
                        switch (str) {
                            case 1569:
                                if (!str.equals(TransType.TRANS_TYPE_REPAY_CASH_LOAN)) {
                                    return "";
                                }
                                String string11 = context.getString(a.qt_transport);
                                Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                                return string11;
                            case 1570:
                                if (!str.equals(TransType.TRANS_TYPE_AIRTIME_LOAN)) {
                                    return "";
                                }
                                String string12 = context.getString(a.qt_religious);
                                Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
                                return string12;
                            case 1571:
                                if (!str.equals("14")) {
                                    return "";
                                }
                                String string13 = context.getString(a.qt_education);
                                Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
                                return string13;
                            case 1572:
                                if (!str.equals("15")) {
                                    return "";
                                }
                                String string14 = context.getString(k.core_biller_government_payments);
                                Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
                                return string14;
                            case 1573:
                                if (!str.equals("16")) {
                                    return "";
                                }
                                String string15 = context.getString(k.core_biller_invoice_payments);
                                Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
                                return string15;
                            case 1574:
                                if (!str.equals("17")) {
                                    return "";
                                }
                                String string16 = context.getString(k.core_biller_travel_hotel_payments);
                                Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
                                return string16;
                            case 1575:
                                if (!str.equals("18")) {
                                    return "";
                                }
                                String string17 = context.getString(k.core_biller_financial_services_payments);
                                Intrinsics.checkNotNullExpressionValue(string17, "getString(...)");
                                return string17;
                            case 1576:
                                if (!str.equals("19")) {
                                    return "";
                                }
                                String string18 = context.getString(k.core_biller_bankone_mfbs_payments);
                                Intrinsics.checkNotNullExpressionValue(string18, "getString(...)");
                                return string18;
                            default:
                                switch (str) {
                                    case 1598:
                                        if (!str.equals("20")) {
                                            return "";
                                        }
                                        String string19 = context.getString(k.core_biller_products_services_payments);
                                        Intrinsics.checkNotNullExpressionValue(string19, "getString(...)");
                                        return string19;
                                    case 1599:
                                        if (!str.equals(TransType.TRANS_TYPE_REPAY_AIRTIME_LOAN)) {
                                            return "";
                                        }
                                        String string20 = context.getString(k.core_biller_cowry_card_payments);
                                        Intrinsics.checkNotNullExpressionValue(string20, "getString(...)");
                                        return string20;
                                    case 1600:
                                        if (!str.equals(TransType.TRANS_TYPE_P2P_CASH_IN)) {
                                            return "";
                                        }
                                        String string21 = context.getString(k.core_biller_waec_payments);
                                        Intrinsics.checkNotNullExpressionValue(string21, "getString(...)");
                                        return string21;
                                    case 1601:
                                        if (!str.equals(TransType.TRANS_TYPE_P2P_CASH_OUT)) {
                                            return "";
                                        }
                                        String string22 = context.getString(a.qt_jamb);
                                        Intrinsics.checkNotNullExpressionValue(string22, "getString(...)");
                                        return string22;
                                    case 1602:
                                        if (!str.equals(TransType.TRANS_TYPE_MERCHANT_PAYMENT)) {
                                            return "";
                                        }
                                        String string23 = context.getString(a.qt_betting_withdraw);
                                        Intrinsics.checkNotNullExpressionValue(string23, "getString(...)");
                                        return string23;
                                    default:
                                        switch (str) {
                                            case 1604:
                                                if (!str.equals(TransType.TRANS_TYPE_COMMISSION)) {
                                                    return "";
                                                }
                                                String string24 = context.getString(a.qt_online_shopping_home_page_banner);
                                                Intrinsics.checkNotNullExpressionValue(string24, "getString(...)");
                                                return string24;
                                            case 1605:
                                                if (!str.equals("27")) {
                                                    return "";
                                                }
                                                String string25 = context.getString(a.qt_event_ticket_home_page_banner);
                                                Intrinsics.checkNotNullExpressionValue(string25, "getString(...)");
                                                return string25;
                                            case 1606:
                                                if (!str.equals(TransType.TRANS_TYPE_BIND_BANK_CARD)) {
                                                    return "";
                                                }
                                                String string26 = context.getString(a.qt_dues_and_service_charge_home_page_banner);
                                                Intrinsics.checkNotNullExpressionValue(string26, "getString(...)");
                                                return string26;
                                            case 1607:
                                                if (!str.equals("29")) {
                                                    return "";
                                                }
                                                String string27 = context.getString(a.qt_credit_and_loans_home_page_banner);
                                                Intrinsics.checkNotNullExpressionValue(string27, "getString(...)");
                                                return string27;
                                            default:
                                                switch (str) {
                                                    case 1634:
                                                        if (!str.equals(TransType.TRANS_TYPE_THIRD_PARTY_MERCHANT)) {
                                                            return "";
                                                        }
                                                        String string28 = context.getString(a.qt_gift_card);
                                                        Intrinsics.checkNotNullExpressionValue(string28, "getString(...)");
                                                        return string28;
                                                    case 1635:
                                                        if (!str.equals(TransType.TRANS_TYPE_AUTO_DEDUCT)) {
                                                            return "";
                                                        }
                                                        String string29 = context.getString(k.core_geniex_data);
                                                        Intrinsics.checkNotNullExpressionValue(string29, "getString(...)");
                                                        return string29;
                                                    case 1636:
                                                        if (!str.equals(TransType.TRANS_TYPE_EX_GRATIA_REFUND)) {
                                                            return "";
                                                        }
                                                        String string30 = context.getString(k.core_geniex_recharge);
                                                        Intrinsics.checkNotNullExpressionValue(string30, "getString(...)");
                                                        return string30;
                                                    case 1637:
                                                        if (!str.equals(TransType.TRANS_TYPE_EX_GRATIA_BONUS)) {
                                                            return "";
                                                        }
                                                        String string31 = context.getString(a.qt_trip);
                                                        Intrinsics.checkNotNullExpressionValue(string31, "getString(...)");
                                                        return string31;
                                                    default:
                                                        return "";
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static CreateTellerOrderReq d(DataBundleWalletItemBean item, String str, long j6, boolean z3) {
        Intrinsics.checkNotNullParameter(item, "item");
        CreateTellerOrderReq createTellerOrderReq = new CreateTellerOrderReq();
        createTellerOrderReq.businessAmount = j6;
        createTellerOrderReq.customerId = r0.v0(PhoneBaseNumberUtils.INSTANCE.getValidMobileNumber(str, BaseApplication.getCountryLocale()));
        createTellerOrderReq.fullName = BaseApplication.get().getUser().getFullName();
        createTellerOrderReq.businessType = 5;
        createTellerOrderReq.billerName = item.getBillerName();
        createTellerOrderReq.billerId = item.getBillerId();
        createTellerOrderReq.categoryId = AddFamilyAccontReq.BILLER_CATEGORY_ID_BUNDLE;
        createTellerOrderReq.verifyNetwork = z3;
        createTellerOrderReq.paymentItemId = item.getItemId();
        createTellerOrderReq.icon = item.getInstitutionLogo();
        createTellerOrderReq.paymentItemName = item.getItemName();
        createTellerOrderReq.dataBundleItemName = item.getItemName();
        createTellerOrderReq.validity = item.getValidity();
        return createTellerOrderReq;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x011a, code lost:
    
        if (r2.equals("8") == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x011f, code lost:
    
        return Vd.a.qt_user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
    
        if (r2.equals("29") == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
    
        if (r2.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_BIND_BANK_CARD) == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
    
        if (r2.equals("27") == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        if (r2.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_COMMISSION) == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005f, code lost:
    
        if (r2.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_MERCHANT_PAYMENT) == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0083, code lost:
    
        if (r2.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_REPAY_AIRTIME_LOAN) == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008d, code lost:
    
        if (r2.equals("20") == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0097, code lost:
    
        if (r2.equals("19") == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a1, code lost:
    
        if (r2.equals("18") == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ab, code lost:
    
        if (r2.equals("17") == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b5, code lost:
    
        if (r2.equals("16") == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00bf, code lost:
    
        if (r2.equals("15") == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f9, code lost:
    
        if (r2.equals("31") == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0102, code lost:
    
        if (r2.equals("30") == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0107, code lost:
    
        return Vd.a.qt_account_number;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int e(java.lang.String r2) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p070ee.c.e(java.lang.String):int");
    }

    public static final Uri f(String str) {
        return TextUtils.isEmpty(str) ? CommonExtKt.toDrawableUri(r.cv_bill_default_icon) : Ea.a.c(b.b(str), 0, 0, 0L);
    }

    public static ArrayList g(String text, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (TextUtils.isEmpty(text)) {
            return arrayList == null ? new ArrayList() : arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null && !arrayList.isEmpty()) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = text.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                try {
                    BillerListItemBean billerListItemBean = (BillerListItemBean) arrayList.get(i7);
                    Intrinsics.e(billerListItemBean);
                    if (i(billerListItemBean.getBillerName(), lowerCase) || i(billerListItemBean.getAbbreviatedName(), lowerCase) || i(billerListItemBean.getShortName(), lowerCase)) {
                        arrayList2.add(billerListItemBean);
                    }
                } catch (NullPointerException e10) {
                    d.c(f36289a, "searchBiller: ", e10);
                }
            }
            Collections.sort(arrayList2, new C0998p0(9));
        }
        return arrayList2;
    }

    public static ArrayList h(String text, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (TextUtils.isEmpty(text)) {
            return arrayList == null ? new ArrayList() : arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                Object obj = arrayList.get(i7);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                PaymentItemBean paymentItemBean = (PaymentItemBean) obj;
                String str = paymentItemBean.paymentItemName;
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                String lowerCase = text.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (i(str, lowerCase)) {
                    arrayList2.add(paymentItemBean);
                }
            }
        }
        return arrayList2;
    }

    public static boolean i(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        Intrinsics.e(str);
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
        String lowerCase2 = str2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return StringsKt.A(lowerCase, lowerCase2, false);
    }

    public static void j(int i7, View... views) {
        Intrinsics.checkNotNullParameter(views, "views");
        for (View view : views) {
            if (i7 == 1) {
                if (view != null) {
                    view.setAlpha(1.0f);
                }
            } else if (view != null) {
                view.setAlpha(0.5f);
            }
        }
    }

    public static void k(String str, BaseOrderDetailBean baseOrderDetailBean) {
        if (baseOrderDetailBean == null) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        List<OrderDetailItemBean> list = baseOrderDetailBean.ticketExtendFields;
        if (list != null) {
            for (OrderDetailItemBean orderDetailItemBean : list) {
                arrayList.add(orderDetailItemBean.getKey());
                arrayList2.add(orderDetailItemBean.getValue());
            }
        }
        Postcard postcardBuild = ARouter.getInstance().build("/coreImpl/transaction_receipt_page");
        Long payAmount = baseOrderDetailBean.getPayAmount();
        Postcard postcardWithLong = postcardBuild.withLong("extra_amount", payAmount != null ? payAmount.longValue() : 0L);
        Long createTime = baseOrderDetailBean.getCreateTime();
        postcardWithLong.withLong("extra_data", createTime != null ? createTime.longValue() : 0L).withString("extra_title_icon", str).withStringArrayList("extra_data_1", arrayList).withStringArrayList("extra_data_2", arrayList2).navigation();
    }
}
