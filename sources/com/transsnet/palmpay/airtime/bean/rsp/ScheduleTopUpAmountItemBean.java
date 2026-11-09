package com.transsnet.palmpay.airtime.bean.rsp;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR\u001c\u0010 \u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR\u001e\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010*\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0007\"\u0004\b,\u0010\tR\u001e\u0010-\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b.\u0010&\"\u0004\b/\u0010(R\u001c\u00100\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0007\"\u0004\b2\u0010\tR\u001c\u00103\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0007\"\u0004\b5\u0010\tR\u001c\u00106\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0007\"\u0004\b8\u0010\tR\u001c\u00109\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0007\"\u0004\b;\u0010\tR\u001c\u0010<\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0007\"\u0004\b>\u0010\tR\u001e\u0010?\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b@\u0010&\"\u0004\bA\u0010(R\u001e\u0010B\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\bC\u0010&\"\u0004\bD\u0010(R\u001c\u0010E\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0007\"\u0004\bG\u0010\tR\u001e\u0010H\u001a\u0004\u0018\u00010IX\u0086\u000e¢\u0006\u0010\n\u0002\u0010N\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001e\u0010O\u001a\u0004\u0018\u00010IX\u0086\u000e¢\u0006\u0010\n\u0002\u0010N\u001a\u0004\bP\u0010K\"\u0004\bQ\u0010MR\u001c\u0010R\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0007\"\u0004\bT\u0010\t¨\u0006U"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/rsp/ScheduleTopUpAmountItemBean;", "", "<init>", "()V", "businessType", "", "getBusinessType", "()Ljava/lang/String;", "setBusinessType", "(Ljava/lang/String;)V", "fixed", "", "getFixed", "()Ljava/lang/Integer;", "setFixed", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "institutionName", "getInstitutionName", "setInstitutionName", "institutionId", "getInstitutionId", "setInstitutionId", "billerName", "getBillerName", "setBillerName", "billerId", "getBillerId", "setBillerId", "billerLogo", "getBillerLogo", "setBillerLogo", "itemId", "getItemId", "setItemId", FirebaseAnalytics.Param.PRICE, "", "getPrice", "()Ljava/lang/Long;", "setPrice", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "rewardsRateText", "getRewardsRateText", "setRewardsRateText", "discountAmount", "getDiscountAmount", "setDiscountAmount", "productName", "getProductName", "setProductName", "productType", "getProductType", "setProductType", "validity", "getValidity", "setValidity", "promptText", "getPromptText", "setPromptText", "productId", "getProductId", "setProductId", "minAmount", "getMinAmount", "setMinAmount", "maxAmount", "getMaxAmount", "setMaxAmount", "institutionLogo", "getInstitutionLogo", "setInstitutionLogo", "recommend", "", "getRecommend", "()Ljava/lang/Boolean;", "setRecommend", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "suspend", "getSuspend", "setSuspend", "itemTag", "getItemTag", "setItemTag", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScheduleTopUpAmountItemBean {

    @Nullable
    private String billerId;

    @Nullable
    private String billerLogo;

    @Nullable
    private String billerName;

    @Nullable
    private String businessType;

    @Nullable
    private Long discountAmount;

    @Nullable
    private Integer fixed;

    @Nullable
    private String institutionId;

    @Nullable
    private String institutionLogo;

    @Nullable
    private String institutionName;

    @Nullable
    private String itemId;

    @Nullable
    private String itemTag;

    @Nullable
    private Long maxAmount;

    @Nullable
    private Long minAmount;

    @Nullable
    private Long price;

    @Nullable
    private String productId;

    @Nullable
    private String productName;

    @Nullable
    private String productType;

    @Nullable
    private String promptText;

    @Nullable
    private Boolean recommend;

    @Nullable
    private String rewardsRateText;

    @Nullable
    private Boolean suspend;

    @Nullable
    private String validity;

    @Nullable
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    public final String getBillerLogo() {
        return this.billerLogo;
    }

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    public final String getBusinessType() {
        return this.businessType;
    }

    @Nullable
    public final Long getDiscountAmount() {
        return this.discountAmount;
    }

    @Nullable
    public final Integer getFixed() {
        return this.fixed;
    }

    @Nullable
    public final String getInstitutionId() {
        return this.institutionId;
    }

    @Nullable
    public final String getInstitutionLogo() {
        return this.institutionLogo;
    }

    @Nullable
    public final String getInstitutionName() {
        return this.institutionName;
    }

    @Nullable
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final String getItemTag() {
        return this.itemTag;
    }

    @Nullable
    public final Long getMaxAmount() {
        return this.maxAmount;
    }

    @Nullable
    public final Long getMinAmount() {
        return this.minAmount;
    }

    @Nullable
    public final Long getPrice() {
        return this.price;
    }

    @Nullable
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    @Nullable
    public final String getProductType() {
        return this.productType;
    }

    @Nullable
    public final String getPromptText() {
        return this.promptText;
    }

    @Nullable
    public final Boolean getRecommend() {
        return this.recommend;
    }

    @Nullable
    public final String getRewardsRateText() {
        return this.rewardsRateText;
    }

    @Nullable
    public final Boolean getSuspend() {
        return this.suspend;
    }

    @Nullable
    public final String getValidity() {
        return this.validity;
    }

    public final void setBillerId(@Nullable String str) {
        this.billerId = str;
    }

    public final void setBillerLogo(@Nullable String str) {
        this.billerLogo = str;
    }

    public final void setBillerName(@Nullable String str) {
        this.billerName = str;
    }

    public final void setBusinessType(@Nullable String str) {
        this.businessType = str;
    }

    public final void setDiscountAmount(@Nullable Long l5) {
        this.discountAmount = l5;
    }

    public final void setFixed(@Nullable Integer num) {
        this.fixed = num;
    }

    public final void setInstitutionId(@Nullable String str) {
        this.institutionId = str;
    }

    public final void setInstitutionLogo(@Nullable String str) {
        this.institutionLogo = str;
    }

    public final void setInstitutionName(@Nullable String str) {
        this.institutionName = str;
    }

    public final void setItemId(@Nullable String str) {
        this.itemId = str;
    }

    public final void setItemTag(@Nullable String str) {
        this.itemTag = str;
    }

    public final void setMaxAmount(@Nullable Long l5) {
        this.maxAmount = l5;
    }

    public final void setMinAmount(@Nullable Long l5) {
        this.minAmount = l5;
    }

    public final void setPrice(@Nullable Long l5) {
        this.price = l5;
    }

    public final void setProductId(@Nullable String str) {
        this.productId = str;
    }

    public final void setProductName(@Nullable String str) {
        this.productName = str;
    }

    public final void setProductType(@Nullable String str) {
        this.productType = str;
    }

    public final void setPromptText(@Nullable String str) {
        this.promptText = str;
    }

    public final void setRecommend(@Nullable Boolean bool) {
        this.recommend = bool;
    }

    public final void setRewardsRateText(@Nullable String str) {
        this.rewardsRateText = str;
    }

    public final void setSuspend(@Nullable Boolean bool) {
        this.suspend = bool;
    }

    public final void setValidity(@Nullable String str) {
        this.validity = str;
    }
}
