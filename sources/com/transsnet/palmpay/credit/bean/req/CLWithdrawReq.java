package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001By\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0019\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b \u0010\u001bR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b!\u0010\u0014R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\"\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018¨\u0006$"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/CLWithdrawReq;", "", "amount", "", "repaymentDate", "preOrderNo", "", "couponId", "discountType", "", "couponDiscountInfo", "orderExtend", "Lcom/transsnet/palmpay/credit/bean/req/OrderExtendData;", "reductionWay", "nominaValue", "scene", "loanProduct", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/transsnet/palmpay/credit/bean/req/OrderExtendData;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRepaymentDate", "getPreOrderNo", "()Ljava/lang/String;", "getCouponId", "getDiscountType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCouponDiscountInfo", "getOrderExtend", "()Lcom/transsnet/palmpay/credit/bean/req/OrderExtendData;", "getReductionWay", "getNominaValue", "getScene", "getLoanProduct", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLWithdrawReq {

    @Nullable
    private final Long amount;

    @Nullable
    private final Integer couponDiscountInfo;

    @Nullable
    private final Long couponId;

    @Nullable
    private final Integer discountType;

    @Nullable
    private final String loanProduct;

    @Nullable
    private final Long nominaValue;

    @Nullable
    private final OrderExtendData orderExtend;

    @Nullable
    private final String preOrderNo;

    @Nullable
    private final Integer reductionWay;

    @Nullable
    private final Long repaymentDate;

    @Nullable
    private final Integer scene;

    public CLWithdrawReq(@Nullable Long l5, @Nullable Long l6, @Nullable String str, @Nullable Long l8, @Nullable Integer num, @Nullable Integer num2, @Nullable OrderExtendData orderExtendData, @Nullable Integer num3, @Nullable Long l10, @Nullable Integer num4, @Nullable String str2) {
        this.amount = l5;
        this.repaymentDate = l6;
        this.preOrderNo = str;
        this.couponId = l8;
        this.discountType = num;
        this.couponDiscountInfo = num2;
        this.orderExtend = orderExtendData;
        this.reductionWay = num3;
        this.nominaValue = l10;
        this.scene = num4;
        this.loanProduct = str2;
    }

    @Nullable
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    public final Integer getCouponDiscountInfo() {
        return this.couponDiscountInfo;
    }

    @Nullable
    public final Long getCouponId() {
        return this.couponId;
    }

    @Nullable
    public final Integer getDiscountType() {
        return this.discountType;
    }

    @Nullable
    public final String getLoanProduct() {
        return this.loanProduct;
    }

    @Nullable
    public final Long getNominaValue() {
        return this.nominaValue;
    }

    @Nullable
    public final OrderExtendData getOrderExtend() {
        return this.orderExtend;
    }

    @Nullable
    public final String getPreOrderNo() {
        return this.preOrderNo;
    }

    @Nullable
    public final Integer getReductionWay() {
        return this.reductionWay;
    }

    @Nullable
    public final Long getRepaymentDate() {
        return this.repaymentDate;
    }

    @Nullable
    public final Integer getScene() {
        return this.scene;
    }

    public /* synthetic */ CLWithdrawReq(Long l5, Long l6, String str, Long l8, Integer num, Integer num2, OrderExtendData orderExtendData, Integer num3, Long l10, Integer num4, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(l5, l6, str, l8, num, num2, orderExtendData, num3, l10, (i7 & 512) != 0 ? 1 : num4, (i7 & 1024) != 0 ? null : str2);
    }
}
