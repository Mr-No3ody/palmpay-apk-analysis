package com.transsnet.palmpay.airtime.bean;

import com.transsnet.palmpay.airtime.bean.rsp.AirtimeScheduleTopUpBean;
import com.transsnet.palmpay.core.bean.BaseOrderDetailBean;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.payment.PaymentFeeDetail;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001e\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010-\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b.\u0010\"\"\u0004\b/\u0010$R\u001e\u00100\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b1\u0010\"\"\u0004\b2\u0010$R\u001e\u00103\u001a\u0004\u0018\u000104X\u0086\u000e¢\u0006\u0010\n\u0002\u00109\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u0010:\u001a\u0004\u0018\u000104X\u0086\u000e¢\u0006\u0010\n\u0002\u00109\u001a\u0004\b;\u00106\"\u0004\b<\u00108R\u001e\u0010=\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b>\u0010\"\"\u0004\b?\u0010$R\u001c\u0010@\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0007\"\u0004\bB\u0010\tR\u001c\u0010C\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0007\"\u0004\bE\u0010\tR\u001c\u0010F\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0007\"\u0004\bH\u0010\tR\u001c\u0010I\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0007\"\u0004\bK\u0010\tR\u001c\u0010L\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0007\"\u0004\bN\u0010\tR\u001c\u0010O\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0007\"\u0004\bQ\u0010\tR\u001c\u0010R\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0007\"\u0004\bT\u0010\tR\u001e\u0010U\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\bV\u0010)\"\u0004\bW\u0010+R\u001c\u0010X\u001a\u0004\u0018\u00010YX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001c\u0010^\u001a\u0004\u0018\u00010_X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001e\u0010d\u001a\u0004\u0018\u000104X\u0086\u000e¢\u0006\u0010\n\u0002\u00109\u001a\u0004\be\u00106\"\u0004\bf\u00108R\u001c\u0010g\u001a\u0004\u0018\u00010hX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0011\u0010m\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\bm\u0010n¨\u0006o"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/AirtimeDetailData;", "Lcom/transsnet/palmpay/core/bean/BaseOrderDetailBean;", "<init>", "()V", "orderType", "", "getOrderType", "()Ljava/lang/String;", "setOrderType", "(Ljava/lang/String;)V", "bankName", "getBankName", "setBankName", "network", "getNetwork", "setNetwork", "icon", "getIcon", "setIcon", "biller", "getBiller", "setBiller", "billerName", "getBillerName", "setBillerName", "customerId", "getCustomerId", "setCustomerId", "subscribeTips", "getSubscribeTips", "setSubscribeTips", "unclaimedReturnPoint", "", "getUnclaimedReturnPoint", "()Ljava/lang/Long;", "setUnclaimedReturnPoint", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "needClaimPoint", "", "getNeedClaimPoint", "()Ljava/lang/Boolean;", "setNeedClaimPoint", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "amount", "getAmount", "setAmount", "flexiDiscount", "getFlexiDiscount", "setFlexiDiscount", "orderStatus", "", "getOrderStatus", "()Ljava/lang/Integer;", "setOrderStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "payerAccountType", "getPayerAccountType", "setPayerAccountType", "taxFee", "getTaxFee", "setTaxFee", "phone", "getPhone", "setPhone", "payId", "getPayId", "setPayId", "payerCardNo", "getPayerCardNo", "setPayerCardNo", "phoneName", "getPhoneName", "setPhoneName", "orderStatusDesc", "getOrderStatusDesc", "setOrderStatusDesc", "errorMessage", "getErrorMessage", "setErrorMessage", "pendingCouponRemark", "getPendingCouponRemark", "setPendingCouponRemark", "showRefund", "getShowRefund", "setShowRefund", "orderStatusInfo", "Lcom/transsnet/palmpay/core/bean/BillProcessDetail;", "getOrderStatusInfo", "()Lcom/transsnet/palmpay/core/bean/BillProcessDetail;", "setOrderStatusInfo", "(Lcom/transsnet/palmpay/core/bean/BillProcessDetail;)V", "feeDetailList", "Lcom/transsnet/palmpay/core/bean/payment/PaymentFeeDetail;", "getFeeDetailList", "()Lcom/transsnet/palmpay/core/bean/payment/PaymentFeeDetail;", "setFeeDetailList", "(Lcom/transsnet/palmpay/core/bean/payment/PaymentFeeDetail;)V", "billAgent", "getBillAgent", "setBillAgent", "autoRenewalOrderFields", "Lcom/transsnet/palmpay/airtime/bean/rsp/AirtimeScheduleTopUpBean;", "getAutoRenewalOrderFields", "()Lcom/transsnet/palmpay/airtime/bean/rsp/AirtimeScheduleTopUpBean;", "setAutoRenewalOrderFields", "(Lcom/transsnet/palmpay/airtime/bean/rsp/AirtimeScheduleTopUpBean;)V", "isAgent", "()Z", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AirtimeDetailData extends BaseOrderDetailBean {

    @Nullable
    private Long amount;

    @Nullable
    private AirtimeScheduleTopUpBean autoRenewalOrderFields;

    @Nullable
    private String bankName;

    @Nullable
    private Integer billAgent;

    @Nullable
    private String biller;

    @Nullable
    private String billerName;

    @Nullable
    private String customerId;

    @Nullable
    private String errorMessage;

    @Nullable
    private PaymentFeeDetail feeDetailList;

    @Nullable
    private Long flexiDiscount;

    @Nullable
    private String icon;

    @Nullable
    private Boolean needClaimPoint;

    @Nullable
    private String network;

    @Nullable
    private Integer orderStatus;

    @Nullable
    private String orderStatusDesc;

    @Nullable
    private BillProcessDetail orderStatusInfo;

    @Nullable
    private String orderType;

    @Nullable
    private String payId;

    @Nullable
    private Integer payerAccountType;

    @Nullable
    private String payerCardNo;

    @Nullable
    private String pendingCouponRemark;

    @Nullable
    private String phone;

    @Nullable
    private String phoneName;

    @Nullable
    private Boolean showRefund;

    @Nullable
    private String subscribeTips;

    @Nullable
    private Long taxFee;

    @Nullable
    private Long unclaimedReturnPoint = 0L;

    public AirtimeDetailData() {
        Boolean bool = Boolean.FALSE;
        this.needClaimPoint = bool;
        this.amount = 0L;
        this.flexiDiscount = 0L;
        this.orderStatus = 0;
        this.payerAccountType = 0;
        this.taxFee = 0L;
        this.showRefund = bool;
        this.billAgent = 0;
    }

    @Nullable
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    public final AirtimeScheduleTopUpBean getAutoRenewalOrderFields() {
        return this.autoRenewalOrderFields;
    }

    @Nullable
    public final String getBankName() {
        return this.bankName;
    }

    @Nullable
    public final Integer getBillAgent() {
        return this.billAgent;
    }

    @Nullable
    public final String getBiller() {
        return this.biller;
    }

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final PaymentFeeDetail getFeeDetailList() {
        return this.feeDetailList;
    }

    @Nullable
    public final Long getFlexiDiscount() {
        return this.flexiDiscount;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final Boolean getNeedClaimPoint() {
        return this.needClaimPoint;
    }

    @Nullable
    public final String getNetwork() {
        return this.network;
    }

    @Nullable
    public final Integer getOrderStatus() {
        return this.orderStatus;
    }

    @Nullable
    public final String getOrderStatusDesc() {
        return this.orderStatusDesc;
    }

    @Nullable
    public final BillProcessDetail getOrderStatusInfo() {
        return this.orderStatusInfo;
    }

    @Nullable
    public final String getOrderType() {
        return this.orderType;
    }

    @Nullable
    public final String getPayId() {
        return this.payId;
    }

    @Nullable
    public final Integer getPayerAccountType() {
        return this.payerAccountType;
    }

    @Nullable
    public final String getPayerCardNo() {
        return this.payerCardNo;
    }

    @Nullable
    public final String getPendingCouponRemark() {
        return this.pendingCouponRemark;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final String getPhoneName() {
        return this.phoneName;
    }

    @Nullable
    public final Boolean getShowRefund() {
        return this.showRefund;
    }

    @Nullable
    public final String getSubscribeTips() {
        return this.subscribeTips;
    }

    @Nullable
    public final Long getTaxFee() {
        return this.taxFee;
    }

    @Nullable
    public final Long getUnclaimedReturnPoint() {
        return this.unclaimedReturnPoint;
    }

    public final boolean isAgent() {
        Integer num = this.billAgent;
        return num != null && num.intValue() == 1;
    }

    public final void setAmount(@Nullable Long l5) {
        this.amount = l5;
    }

    public final void setAutoRenewalOrderFields(@Nullable AirtimeScheduleTopUpBean airtimeScheduleTopUpBean) {
        this.autoRenewalOrderFields = airtimeScheduleTopUpBean;
    }

    public final void setBankName(@Nullable String str) {
        this.bankName = str;
    }

    public final void setBillAgent(@Nullable Integer num) {
        this.billAgent = num;
    }

    public final void setBiller(@Nullable String str) {
        this.biller = str;
    }

    public final void setBillerName(@Nullable String str) {
        this.billerName = str;
    }

    public final void setCustomerId(@Nullable String str) {
        this.customerId = str;
    }

    public final void setErrorMessage(@Nullable String str) {
        this.errorMessage = str;
    }

    public final void setFeeDetailList(@Nullable PaymentFeeDetail paymentFeeDetail) {
        this.feeDetailList = paymentFeeDetail;
    }

    public final void setFlexiDiscount(@Nullable Long l5) {
        this.flexiDiscount = l5;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setNeedClaimPoint(@Nullable Boolean bool) {
        this.needClaimPoint = bool;
    }

    public final void setNetwork(@Nullable String str) {
        this.network = str;
    }

    public final void setOrderStatus(@Nullable Integer num) {
        this.orderStatus = num;
    }

    public final void setOrderStatusDesc(@Nullable String str) {
        this.orderStatusDesc = str;
    }

    public final void setOrderStatusInfo(@Nullable BillProcessDetail billProcessDetail) {
        this.orderStatusInfo = billProcessDetail;
    }

    public final void setOrderType(@Nullable String str) {
        this.orderType = str;
    }

    public final void setPayId(@Nullable String str) {
        this.payId = str;
    }

    public final void setPayerAccountType(@Nullable Integer num) {
        this.payerAccountType = num;
    }

    public final void setPayerCardNo(@Nullable String str) {
        this.payerCardNo = str;
    }

    public final void setPendingCouponRemark(@Nullable String str) {
        this.pendingCouponRemark = str;
    }

    public final void setPhone(@Nullable String str) {
        this.phone = str;
    }

    public final void setPhoneName(@Nullable String str) {
        this.phoneName = str;
    }

    public final void setShowRefund(@Nullable Boolean bool) {
        this.showRefund = bool;
    }

    public final void setSubscribeTips(@Nullable String str) {
        this.subscribeTips = str;
    }

    public final void setTaxFee(@Nullable Long l5) {
        this.taxFee = l5;
    }

    public final void setUnclaimedReturnPoint(@Nullable Long l5) {
        this.unclaimedReturnPoint = l5;
    }
}
