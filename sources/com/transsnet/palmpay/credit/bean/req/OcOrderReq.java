package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/OcOrderReq;", "", "amount", "", "cardNo", "", "billId", "transType", "operateType", "", "extensionInfo", "loanProduct", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCardNo", "()Ljava/lang/String;", "getBillId", "getTransType", "getOperateType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExtensionInfo", "getLoanProduct", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcOrderReq {

    @Nullable
    private final Long amount;

    @Nullable
    private final String billId;

    @Nullable
    private final String cardNo;

    @Nullable
    private final String extensionInfo;

    @Nullable
    private final String loanProduct;

    @Nullable
    private final Integer operateType;

    @Nullable
    private final String transType;

    public OcOrderReq(@Nullable Long l5, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable String str5) {
        this.amount = l5;
        this.cardNo = str;
        this.billId = str2;
        this.transType = str3;
        this.operateType = num;
        this.extensionInfo = str4;
        this.loanProduct = str5;
    }

    @Nullable
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getBillId() {
        return this.billId;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final String getExtensionInfo() {
        return this.extensionInfo;
    }

    @Nullable
    public final String getLoanProduct() {
        return this.loanProduct;
    }

    @Nullable
    public final Integer getOperateType() {
        return this.operateType;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    public /* synthetic */ OcOrderReq(Long l5, String str, String str2, String str3, Integer num, String str4, String str5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(l5, str, str2, str3, num, str4, (i7 & 64) != 0 ? null : str5);
    }
}
