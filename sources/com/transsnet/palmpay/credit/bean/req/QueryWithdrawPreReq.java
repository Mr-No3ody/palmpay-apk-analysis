package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u001b\u0010\u0010R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/QueryWithdrawPreReq;", "", "productSubId", "", "loanAmount", "", "queryFirstLoan", "", "loanSource", "loanProduct", "", "sceneSource", "protocolType", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getProductSubId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLoanAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getQueryFirstLoan", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLoanSource", "getLoanProduct", "()Ljava/lang/String;", "getSceneSource", "getProtocolType", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryWithdrawPreReq {

    @Nullable
    private final Long loanAmount;

    @Nullable
    private final String loanProduct;

    @Nullable
    private final Integer loanSource;

    @Nullable
    private final Integer productSubId;

    @Nullable
    private final Integer protocolType;

    @Nullable
    private final Boolean queryFirstLoan;

    @Nullable
    private final Integer sceneSource;

    public QueryWithdrawPreReq(@Nullable Integer num, @Nullable Long l5, @Nullable Boolean bool, @Nullable Integer num2, @Nullable String str, @Nullable Integer num3, @Nullable Integer num4) {
        this.productSubId = num;
        this.loanAmount = l5;
        this.queryFirstLoan = bool;
        this.loanSource = num2;
        this.loanProduct = str;
        this.sceneSource = num3;
        this.protocolType = num4;
    }

    @Nullable
    public final Long getLoanAmount() {
        return this.loanAmount;
    }

    @Nullable
    public final String getLoanProduct() {
        return this.loanProduct;
    }

    @Nullable
    public final Integer getLoanSource() {
        return this.loanSource;
    }

    @Nullable
    public final Integer getProductSubId() {
        return this.productSubId;
    }

    @Nullable
    public final Integer getProtocolType() {
        return this.protocolType;
    }

    @Nullable
    public final Boolean getQueryFirstLoan() {
        return this.queryFirstLoan;
    }

    @Nullable
    public final Integer getSceneSource() {
        return this.sceneSource;
    }

    public /* synthetic */ QueryWithdrawPreReq(Integer num, Long l5, Boolean bool, Integer num2, String str, Integer num3, Integer num4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, l5, (i7 & 4) != 0 ? Boolean.FALSE : bool, num2, str, num3, (i7 & 64) != 0 ? null : num4);
    }
}
