package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001e\u0010\u0016R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/CLSaveCashierContextReq;", "", "orderNo", "", "cardNo", "loanProduct", "accountType", "", "repaymentDate", "", "scene", "orderExtend", "Lcom/transsnet/palmpay/credit/bean/req/CLSaveCashierContextOrderExtend;", "reductionWay", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Lcom/transsnet/palmpay/credit/bean/req/CLSaveCashierContextOrderExtend;Ljava/lang/Integer;Ljava/lang/Long;)V", "getOrderNo", "()Ljava/lang/String;", "getCardNo", "getLoanProduct", "getAccountType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRepaymentDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getScene", "getOrderExtend", "()Lcom/transsnet/palmpay/credit/bean/req/CLSaveCashierContextOrderExtend;", "getReductionWay", "getAmount", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLSaveCashierContextReq {

    @Nullable
    private final Integer accountType;

    @Nullable
    private final Long amount;

    @Nullable
    private final String cardNo;

    @Nullable
    private final String loanProduct;

    @Nullable
    private final CLSaveCashierContextOrderExtend orderExtend;

    @Nullable
    private final String orderNo;

    @Nullable
    private final Integer reductionWay;

    @Nullable
    private final Long repaymentDate;

    @Nullable
    private final Integer scene;

    public CLSaveCashierContextReq(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Long l5, @Nullable Integer num2, @Nullable CLSaveCashierContextOrderExtend cLSaveCashierContextOrderExtend, @Nullable Integer num3, @Nullable Long l6) {
        this.orderNo = str;
        this.cardNo = str2;
        this.loanProduct = str3;
        this.accountType = num;
        this.repaymentDate = l5;
        this.scene = num2;
        this.orderExtend = cLSaveCashierContextOrderExtend;
        this.reductionWay = num3;
        this.amount = l6;
    }

    @Nullable
    public final Integer getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final String getLoanProduct() {
        return this.loanProduct;
    }

    @Nullable
    public final CLSaveCashierContextOrderExtend getOrderExtend() {
        return this.orderExtend;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
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

    public /* synthetic */ CLSaveCashierContextReq(String str, String str2, String str3, Integer num, Long l5, Integer num2, CLSaveCashierContextOrderExtend cLSaveCashierContextOrderExtend, Integer num3, Long l6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, num, l5, (i7 & 32) != 0 ? 1 : num2, (i7 & 64) != 0 ? null : cLSaveCashierContextOrderExtend, (i7 & 128) != 0 ? 0 : num3, l6);
    }
}
