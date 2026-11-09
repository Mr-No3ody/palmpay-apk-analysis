package com.transsnet.palmpay.send_money.bean.resp;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010$\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u001e\u0010'\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b(\u0010 \"\u0004\b)\u0010\"R\u001c\u0010*\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0007\"\u0004\b,\u0010\tR\u001c\u0010-\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0007\"\u0004\b/\u0010\tR\u001c\u00100\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0007\"\u0004\b2\u0010\tR\u001c\u00103\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0007\"\u0004\b5\u0010\tR\u001c\u00106\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0007\"\u0004\b8\u0010\tR\u001e\u00109\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b:\u0010\u0019\"\u0004\b;\u0010\u001bR\u001c\u0010<\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0007\"\u0004\b>\u0010\tR\u001c\u0010?\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0007\"\u0004\bA\u0010\tR\u001c\u0010B\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0007\"\u0004\bD\u0010\tR\u001c\u0010E\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0007\"\u0004\bG\u0010\tR\u001c\u0010H\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0007\"\u0004\bJ\u0010\tR\u001c\u0010K\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0007\"\u0004\bM\u0010\tR\u001c\u0010N\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0007\"\u0004\bP\u0010\tR\u001e\u0010Q\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\bR\u0010 \"\u0004\bS\u0010\"R\u001c\u0010T\u001a\u0004\u0018\u00010UX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010Y¨\u0006Z"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/CompensationDetailResp;", "", "<init>", "()V", "orderNo", "", "getOrderNo", "()Ljava/lang/String;", "setOrderNo", "(Ljava/lang/String;)V", "orderStatusDesc", "getOrderStatusDesc", "setOrderStatusDesc", "transType", "getTransType", "setTransType", "transScene", "getTransScene", "setTransScene", "payId", "getPayId", "setPayId", "orderStatus", "", "getOrderStatus", "()Ljava/lang/Integer;", "setOrderStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "totalAmount", "", "getTotalAmount", "()Ljava/lang/Long;", "setTotalAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "payAmount", "getPayAmount", "setPayAmount", "orderAmount", "getOrderAmount", "setOrderAmount", "payerBankCode", "getPayerBankCode", "setPayerBankCode", "payerCardNo", "getPayerCardNo", "setPayerCardNo", "payerBankUrl", "getPayerBankUrl", "setPayerBankUrl", "payerName", "getPayerName", "setPayerName", "payeeAccountId", "getPayeeAccountId", "setPayeeAccountId", "payeeAccountType", "getPayeeAccountType", "setPayeeAccountType", "payeeMemberId", "getPayeeMemberId", "setPayeeMemberId", "payeeName", "getPayeeName", "setPayeeName", "payeeMerchantName", "getPayeeMerchantName", "setPayeeMerchantName", FirebaseAnalytics.Param.CURRENCY, "getCurrency", "setCurrency", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "getCountryCode", "setCountryCode", "paymentTypeDesc", "getPaymentTypeDesc", "setPaymentTypeDesc", "receiveMethod", "getReceiveMethod", "setReceiveMethod", "gmtCreated", "getGmtCreated", "setGmtCreated", "orderStatusInfo", "Lcom/transsnet/palmpay/core/bean/BillProcessDetail;", "getOrderStatusInfo", "()Lcom/transsnet/palmpay/core/bean/BillProcessDetail;", "setOrderStatusInfo", "(Lcom/transsnet/palmpay/core/bean/BillProcessDetail;)V", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CompensationDetailResp {

    @Nullable
    private String countryCode;

    @Nullable
    private String currency;

    @Nullable
    private Long gmtCreated;

    @Nullable
    private Long orderAmount;

    @Nullable
    private String orderNo;

    @Nullable
    private Integer orderStatus;

    @Nullable
    private String orderStatusDesc;

    @Nullable
    private BillProcessDetail orderStatusInfo;

    @Nullable
    private Long payAmount;

    @Nullable
    private String payId;

    @Nullable
    private String payeeAccountId;

    @Nullable
    private Integer payeeAccountType;

    @Nullable
    private String payeeMemberId;

    @Nullable
    private String payeeMerchantName;

    @Nullable
    private String payeeName;

    @Nullable
    private String payerBankCode;

    @Nullable
    private String payerBankUrl;

    @Nullable
    private String payerCardNo;

    @Nullable
    private String payerName;

    @Nullable
    private String paymentTypeDesc;

    @Nullable
    private String receiveMethod;

    @Nullable
    private Long totalAmount;

    @Nullable
    private String transScene;

    @Nullable
    private String transType;

    @Nullable
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Long getGmtCreated() {
        return this.gmtCreated;
    }

    @Nullable
    public final Long getOrderAmount() {
        return this.orderAmount;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
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
    public final Long getPayAmount() {
        return this.payAmount;
    }

    @Nullable
    public final String getPayId() {
        return this.payId;
    }

    @Nullable
    public final String getPayeeAccountId() {
        return this.payeeAccountId;
    }

    @Nullable
    public final Integer getPayeeAccountType() {
        return this.payeeAccountType;
    }

    @Nullable
    public final String getPayeeMemberId() {
        return this.payeeMemberId;
    }

    @Nullable
    public final String getPayeeMerchantName() {
        return this.payeeMerchantName;
    }

    @Nullable
    public final String getPayeeName() {
        return this.payeeName;
    }

    @Nullable
    public final String getPayerBankCode() {
        return this.payerBankCode;
    }

    @Nullable
    public final String getPayerBankUrl() {
        return this.payerBankUrl;
    }

    @Nullable
    public final String getPayerCardNo() {
        return this.payerCardNo;
    }

    @Nullable
    public final String getPayerName() {
        return this.payerName;
    }

    @Nullable
    public final String getPaymentTypeDesc() {
        return this.paymentTypeDesc;
    }

    @Nullable
    public final String getReceiveMethod() {
        return this.receiveMethod;
    }

    @Nullable
    public final Long getTotalAmount() {
        return this.totalAmount;
    }

    @Nullable
    public final String getTransScene() {
        return this.transScene;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    public final void setCountryCode(@Nullable String str) {
        this.countryCode = str;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setGmtCreated(@Nullable Long l5) {
        this.gmtCreated = l5;
    }

    public final void setOrderAmount(@Nullable Long l5) {
        this.orderAmount = l5;
    }

    public final void setOrderNo(@Nullable String str) {
        this.orderNo = str;
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

    public final void setPayAmount(@Nullable Long l5) {
        this.payAmount = l5;
    }

    public final void setPayId(@Nullable String str) {
        this.payId = str;
    }

    public final void setPayeeAccountId(@Nullable String str) {
        this.payeeAccountId = str;
    }

    public final void setPayeeAccountType(@Nullable Integer num) {
        this.payeeAccountType = num;
    }

    public final void setPayeeMemberId(@Nullable String str) {
        this.payeeMemberId = str;
    }

    public final void setPayeeMerchantName(@Nullable String str) {
        this.payeeMerchantName = str;
    }

    public final void setPayeeName(@Nullable String str) {
        this.payeeName = str;
    }

    public final void setPayerBankCode(@Nullable String str) {
        this.payerBankCode = str;
    }

    public final void setPayerBankUrl(@Nullable String str) {
        this.payerBankUrl = str;
    }

    public final void setPayerCardNo(@Nullable String str) {
        this.payerCardNo = str;
    }

    public final void setPayerName(@Nullable String str) {
        this.payerName = str;
    }

    public final void setPaymentTypeDesc(@Nullable String str) {
        this.paymentTypeDesc = str;
    }

    public final void setReceiveMethod(@Nullable String str) {
        this.receiveMethod = str;
    }

    public final void setTotalAmount(@Nullable Long l5) {
        this.totalAmount = l5;
    }

    public final void setTransScene(@Nullable String str) {
        this.transScene = str;
    }

    public final void setTransType(@Nullable String str) {
        this.transType = str;
    }
}
