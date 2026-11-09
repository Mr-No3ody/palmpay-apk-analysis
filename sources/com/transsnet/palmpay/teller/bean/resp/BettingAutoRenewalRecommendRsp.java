package com.transsnet.palmpay.teller.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001e\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010'\u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\u001c\u0010*\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0007\"\u0004\b,\u0010\t¨\u0006-"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/BettingAutoRenewalRecommendRsp;", "", "<init>", "()V", "billerId", "", "getBillerId", "()Ljava/lang/String;", "setBillerId", "(Ljava/lang/String;)V", "billerName", "getBillerName", "setBillerName", "billerIcon", "getBillerIcon", "setBillerIcon", "itemId", "getItemId", "setItemId", "customerId", "getCustomerId", "setCustomerId", "businessAmount", "", "getBusinessAmount", "()Ljava/lang/Long;", "setBusinessAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "discountAmount", "getDiscountAmount", "setDiscountAmount", "timeType", "", "getTimeType", "()Ljava/lang/Integer;", "setTimeType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "timeValue", "getTimeValue", "setTimeValue", "timeText", "getTimeText", "setTimeText", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BettingAutoRenewalRecommendRsp {

    @Nullable
    private String billerIcon;

    @Nullable
    private String billerId;

    @Nullable
    private String billerName;

    @Nullable
    private Long businessAmount;

    @Nullable
    private String customerId;

    @Nullable
    private Long discountAmount;

    @Nullable
    private String itemId;

    @Nullable
    private String timeText;

    @Nullable
    private Integer timeType;

    @Nullable
    private Integer timeValue;

    @Nullable
    public final String getBillerIcon() {
        return this.billerIcon;
    }

    @Nullable
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    public final Long getBusinessAmount() {
        return this.businessAmount;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final Long getDiscountAmount() {
        return this.discountAmount;
    }

    @Nullable
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final String getTimeText() {
        return this.timeText;
    }

    @Nullable
    public final Integer getTimeType() {
        return this.timeType;
    }

    @Nullable
    public final Integer getTimeValue() {
        return this.timeValue;
    }

    public final void setBillerIcon(@Nullable String str) {
        this.billerIcon = str;
    }

    public final void setBillerId(@Nullable String str) {
        this.billerId = str;
    }

    public final void setBillerName(@Nullable String str) {
        this.billerName = str;
    }

    public final void setBusinessAmount(@Nullable Long l5) {
        this.businessAmount = l5;
    }

    public final void setCustomerId(@Nullable String str) {
        this.customerId = str;
    }

    public final void setDiscountAmount(@Nullable Long l5) {
        this.discountAmount = l5;
    }

    public final void setItemId(@Nullable String str) {
        this.itemId = str;
    }

    public final void setTimeText(@Nullable String str) {
        this.timeText = str;
    }

    public final void setTimeType(@Nullable Integer num) {
        this.timeType = num;
    }

    public final void setTimeValue(@Nullable Integer num) {
        this.timeValue = num;
    }
}
