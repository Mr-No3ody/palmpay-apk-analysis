package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u001a\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/CLRepaymentPlanV4Req;", "", "loanAmount", "", "cardNo", "", "ifUseCoupon", "", "ifQueryCoupon", "queryAllCoupon", "ifUseBorrowAllDiscount", "couponId", "transType", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;)V", "getLoanAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCardNo", "()Ljava/lang/String;", "getIfUseCoupon", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIfQueryCoupon", "getQueryAllCoupon", "getIfUseBorrowAllDiscount", "getCouponId", "getTransType", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLRepaymentPlanV4Req {

    @Nullable
    private final String cardNo;

    @Nullable
    private final Long couponId;

    @Nullable
    private final Boolean ifQueryCoupon;

    @Nullable
    private final Boolean ifUseBorrowAllDiscount;

    @Nullable
    private final Boolean ifUseCoupon;

    @Nullable
    private final Long loanAmount;

    @Nullable
    private final Boolean queryAllCoupon;

    @Nullable
    private final String transType;

    public CLRepaymentPlanV4Req(@Nullable Long l5, @Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Long l6, @Nullable String str2) {
        this.loanAmount = l5;
        this.cardNo = str;
        this.ifUseCoupon = bool;
        this.ifQueryCoupon = bool2;
        this.queryAllCoupon = bool3;
        this.ifUseBorrowAllDiscount = bool4;
        this.couponId = l6;
        this.transType = str2;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final Long getCouponId() {
        return this.couponId;
    }

    @Nullable
    public final Boolean getIfQueryCoupon() {
        return this.ifQueryCoupon;
    }

    @Nullable
    public final Boolean getIfUseBorrowAllDiscount() {
        return this.ifUseBorrowAllDiscount;
    }

    @Nullable
    public final Boolean getIfUseCoupon() {
        return this.ifUseCoupon;
    }

    @Nullable
    public final Long getLoanAmount() {
        return this.loanAmount;
    }

    @Nullable
    public final Boolean getQueryAllCoupon() {
        return this.queryAllCoupon;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    public /* synthetic */ CLRepaymentPlanV4Req(Long l5, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Long l6, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(l5, str, (i7 & 4) != 0 ? Boolean.FALSE : bool, (i7 & 8) != 0 ? Boolean.FALSE : bool2, (i7 & 16) != 0 ? Boolean.FALSE : bool3, (i7 & 32) != 0 ? Boolean.FALSE : bool4, (i7 & 64) != 0 ? null : l6, (i7 & 128) != 0 ? null : str2);
    }
}
