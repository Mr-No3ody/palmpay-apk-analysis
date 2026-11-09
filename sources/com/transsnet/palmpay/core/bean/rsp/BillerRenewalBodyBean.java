package com.transsnet.palmpay.core.bean.rsp;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.core.bean.CouponItem;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0018\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u0006!"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/BillerRenewalBodyBean;", "", "title", "", FirebaseAnalytics.Param.CONTENT, "couponDetailInfo", "Lcom/transsnet/palmpay/core/bean/CouponItem;", "recipientNumber", "itemAmount", "", "billerName", "billerId", "billerIcon", "itemId", "itemDesc", "topUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/core/bean/CouponItem;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getContent", "getCouponDetailInfo", "()Lcom/transsnet/palmpay/core/bean/CouponItem;", "getRecipientNumber", "getItemAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBillerName", "getBillerId", "getBillerIcon", "getItemId", "getItemDesc", "getTopUrl", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BillerRenewalBodyBean {

    @Nullable
    private final String billerIcon;

    @Nullable
    private final String billerId;

    @Nullable
    private final String billerName;

    @Nullable
    private final String content;

    @Nullable
    private final CouponItem couponDetailInfo;

    @Nullable
    private final Long itemAmount;

    @Nullable
    private final String itemDesc;

    @Nullable
    private final String itemId;

    @Nullable
    private final String recipientNumber;

    @Nullable
    private final String title;

    @Nullable
    private final String topUrl;

    public BillerRenewalBodyBean(@Nullable String str, @Nullable String str2, @Nullable CouponItem couponItem, @Nullable String str3, @Nullable Long l5, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.title = str;
        this.content = str2;
        this.couponDetailInfo = couponItem;
        this.recipientNumber = str3;
        this.itemAmount = l5;
        this.billerName = str4;
        this.billerId = str5;
        this.billerIcon = str6;
        this.itemId = str7;
        this.itemDesc = str8;
        this.topUrl = str9;
    }

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
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final CouponItem getCouponDetailInfo() {
        return this.couponDetailInfo;
    }

    @Nullable
    public final Long getItemAmount() {
        return this.itemAmount;
    }

    @Nullable
    public final String getItemDesc() {
        return this.itemDesc;
    }

    @Nullable
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final String getRecipientNumber() {
        return this.recipientNumber;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTopUrl() {
        return this.topUrl;
    }
}
