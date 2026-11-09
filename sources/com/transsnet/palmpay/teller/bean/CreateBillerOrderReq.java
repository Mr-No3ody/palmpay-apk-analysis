package com.transsnet.palmpay.teller.bean;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.SingleLiveData$Params;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u001c\u0010%\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0018R\u001c\u00101\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u0010\tR\u001c\u00104\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0007\"\u0004\b6\u0010\tR\u001c\u00107\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0007\"\u0004\b9\u0010\tR\u001a\u0010:\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0016\"\u0004\b<\u0010\u0018R\u001a\u0010=\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0016\"\u0004\b?\u0010\u0018R\u001a\u0010@\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0016\"\u0004\bB\u0010\u0018R\u001c\u0010C\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0007\"\u0004\bE\u0010\tR\u001c\u0010F\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0007\"\u0004\bH\u0010\tR\u001a\u0010I\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0016\"\u0004\bK\u0010\u0018R\u001c\u0010L\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0007\"\u0004\bN\u0010\tR\u001c\u0010O\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0007\"\u0004\bQ\u0010\tR\u001a\u0010R\u001a\u00020SX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001a\u0010X\u001a\u00020SX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010U\"\u0004\bZ\u0010WR\u001a\u0010[\u001a\u00020SX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010U\"\u0004\b]\u0010WR\u001a\u0010^\u001a\u00020SX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010U\"\u0004\b`\u0010W¨\u0006a"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/CreateBillerOrderReq;", "Lcom/transsnet/palmpay/core/base/SingleLiveData$Params;", "<init>", "()V", "billerId", "", "getBillerId", "()Ljava/lang/String;", "setBillerId", "(Ljava/lang/String;)V", "billerName", "getBillerName", "setBillerName", "icon", "getIcon", "setIcon", "customerId", "getCustomerId", "setCustomerId", "businessAmount", "", "getBusinessAmount", "()J", "setBusinessAmount", "(J)V", "categoryId", "getCategoryId", "setCategoryId", "paymentItemId", "getPaymentItemId", "setPaymentItemId", "paymentItemName", "getPaymentItemName", "setPaymentItemName", "fullName", "getFullName", "setFullName", "transType", "getTransType", "setTransType", "businessType", "", "getBusinessType", "()I", "setBusinessType", "(I)V", "debtAmount", "getDebtAmount", "setDebtAmount", "discountPackageId", "getDiscountPackageId", "setDiscountPackageId", "customerDisplayName", "getCustomerDisplayName", "setCustomerDisplayName", FirebaseAnalytics.Param.CURRENCY, "getCurrency", "setCurrency", "payAmount", "getPayAmount", "setPayAmount", "payFee", "getPayFee", "setPayFee", "payeeAmount", "getPayeeAmount", "setPayeeAmount", "referenceId", "getReferenceId", "setReferenceId", "validity", "getValidity", "setValidity", "returnPoint", "getReturnPoint", "setReturnPoint", "address", "getAddress", "setAddress", "sourceCategoryId", "getSourceCategoryId", "setSourceCategoryId", "renewal", "", "getRenewal", "()Z", "setRenewal", "(Z)V", "familyAccountCheck", "getFamilyAccountCheck", "setFamilyAccountCheck", "verifyNetwork", "getVerifyNetwork", "setVerifyNetwork", "queryOutstanding", "getQueryOutstanding", "setQueryOutstanding", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CreateBillerOrderReq implements SingleLiveData$Params {

    @Nullable
    private String address;

    @Nullable
    private String billerId;

    @Nullable
    private String billerName;
    private long businessAmount;
    private int businessType;

    @Nullable
    private String categoryId;

    @Nullable
    private String customerDisplayName;

    @Nullable
    private String customerId;
    private long debtAmount;

    @Nullable
    private String discountPackageId;
    private boolean familyAccountCheck;

    @Nullable
    private String fullName;

    @Nullable
    private String icon;
    private long payAmount;
    private long payFee;
    private long payeeAmount;

    @Nullable
    private String paymentItemId;

    @Nullable
    private String paymentItemName;

    @Nullable
    private String referenceId;
    private boolean renewal;
    private long returnPoint;

    @Nullable
    private String sourceCategoryId;

    @Nullable
    private String transType;

    @Nullable
    private String validity;
    private boolean verifyNetwork;
    private boolean queryOutstanding = true;

    @Nullable
    private String currency = BaseApplication.getCurrency();

    @Nullable
    public final String getAddress() {
        return this.address;
    }

    @Nullable
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    public final long getBusinessAmount() {
        return this.businessAmount;
    }

    public final int getBusinessType() {
        return this.businessType;
    }

    @Nullable
    public final String getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCustomerDisplayName() {
        return this.customerDisplayName;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    public final long getDebtAmount() {
        return this.debtAmount;
    }

    @Nullable
    public final String getDiscountPackageId() {
        return this.discountPackageId;
    }

    public final boolean getFamilyAccountCheck() {
        return this.familyAccountCheck;
    }

    @Nullable
    public final String getFullName() {
        return this.fullName;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final long getPayAmount() {
        return this.payAmount;
    }

    public final long getPayFee() {
        return this.payFee;
    }

    public final long getPayeeAmount() {
        return this.payeeAmount;
    }

    @Nullable
    public final String getPaymentItemId() {
        return this.paymentItemId;
    }

    @Nullable
    public final String getPaymentItemName() {
        return this.paymentItemName;
    }

    public final boolean getQueryOutstanding() {
        return this.queryOutstanding;
    }

    @Nullable
    public final String getReferenceId() {
        return this.referenceId;
    }

    public final boolean getRenewal() {
        return this.renewal;
    }

    public final long getReturnPoint() {
        return this.returnPoint;
    }

    @Nullable
    public final String getSourceCategoryId() {
        return this.sourceCategoryId;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    @Nullable
    public final String getValidity() {
        return this.validity;
    }

    public final boolean getVerifyNetwork() {
        return this.verifyNetwork;
    }

    public final void setAddress(@Nullable String str) {
        this.address = str;
    }

    public final void setBillerId(@Nullable String str) {
        this.billerId = str;
    }

    public final void setBillerName(@Nullable String str) {
        this.billerName = str;
    }

    public final void setBusinessAmount(long j6) {
        this.businessAmount = j6;
    }

    public final void setBusinessType(int i7) {
        this.businessType = i7;
    }

    public final void setCategoryId(@Nullable String str) {
        this.categoryId = str;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setCustomerDisplayName(@Nullable String str) {
        this.customerDisplayName = str;
    }

    public final void setCustomerId(@Nullable String str) {
        this.customerId = str;
    }

    public final void setDebtAmount(long j6) {
        this.debtAmount = j6;
    }

    public final void setDiscountPackageId(@Nullable String str) {
        this.discountPackageId = str;
    }

    public final void setFamilyAccountCheck(boolean z3) {
        this.familyAccountCheck = z3;
    }

    public final void setFullName(@Nullable String str) {
        this.fullName = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setPayAmount(long j6) {
        this.payAmount = j6;
    }

    public final void setPayFee(long j6) {
        this.payFee = j6;
    }

    public final void setPayeeAmount(long j6) {
        this.payeeAmount = j6;
    }

    public final void setPaymentItemId(@Nullable String str) {
        this.paymentItemId = str;
    }

    public final void setPaymentItemName(@Nullable String str) {
        this.paymentItemName = str;
    }

    public final void setQueryOutstanding(boolean z3) {
        this.queryOutstanding = z3;
    }

    public final void setReferenceId(@Nullable String str) {
        this.referenceId = str;
    }

    public final void setRenewal(boolean z3) {
        this.renewal = z3;
    }

    public final void setReturnPoint(long j6) {
        this.returnPoint = j6;
    }

    public final void setSourceCategoryId(@Nullable String str) {
        this.sourceCategoryId = str;
    }

    public final void setTransType(@Nullable String str) {
        this.transType = str;
    }

    public final void setValidity(@Nullable String str) {
        this.validity = str;
    }

    public final void setVerifyNetwork(boolean z3) {
        this.verifyNetwork = z3;
    }
}
