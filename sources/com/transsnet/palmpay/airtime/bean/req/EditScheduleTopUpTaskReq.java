package com.transsnet.palmpay.airtime.bean.req;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001e\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010&\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\u001e\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u0010\n\u0002\u0010/\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/req/EditScheduleTopUpTaskReq;", "", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "memberId", "getMemberId", "setMemberId", "phone", "getPhone", "setPhone", "billerId", "getBillerId", "setBillerId", "billerName", "getBillerName", "setBillerName", "billerLogo", "getBillerLogo", "setBillerLogo", "itemId", "getItemId", "setItemId", "tagName", "getTagName", "setTagName", "timeType", "", "getTimeType", "()Ljava/lang/Integer;", "setTimeType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "timeValue", "getTimeValue", "setTimeValue", "rechargeAmount", "", "getRechargeAmount", "()Ljava/lang/Long;", "setRechargeAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EditScheduleTopUpTaskReq {

    @Nullable
    private String billerId;

    @Nullable
    private String billerLogo;

    @Nullable
    private String billerName;

    @Nullable
    private String id;

    @Nullable
    private String itemId;

    @Nullable
    private String memberId;

    @Nullable
    private String phone;

    @Nullable
    private Long rechargeAmount;

    @Nullable
    private String tagName;

    @Nullable
    private Integer timeType;

    @Nullable
    private Integer timeValue;

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
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final String getMemberId() {
        return this.memberId;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final Long getRechargeAmount() {
        return this.rechargeAmount;
    }

    @Nullable
    public final String getTagName() {
        return this.tagName;
    }

    @Nullable
    public final Integer getTimeType() {
        return this.timeType;
    }

    @Nullable
    public final Integer getTimeValue() {
        return this.timeValue;
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

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setItemId(@Nullable String str) {
        this.itemId = str;
    }

    public final void setMemberId(@Nullable String str) {
        this.memberId = str;
    }

    public final void setPhone(@Nullable String str) {
        this.phone = str;
    }

    public final void setRechargeAmount(@Nullable Long l5) {
        this.rechargeAmount = l5;
    }

    public final void setTagName(@Nullable String str) {
        this.tagName = str;
    }

    public final void setTimeType(@Nullable Integer num) {
        this.timeType = num;
    }

    public final void setTimeValue(@Nullable Integer num) {
        this.timeValue = num;
    }
}
