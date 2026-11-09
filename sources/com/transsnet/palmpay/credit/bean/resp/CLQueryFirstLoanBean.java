package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLQueryFirstLoanBean;", "", "freePasswordFlag", "", "firstLoanFlag", "cardNo", "", "productSubId", "", "signType", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;ILjava/lang/Integer;)V", "getFreePasswordFlag", "()Ljava/lang/Boolean;", "setFreePasswordFlag", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getFirstLoanFlag", "setFirstLoanFlag", "getCardNo", "()Ljava/lang/String;", "setCardNo", "(Ljava/lang/String;)V", "getProductSubId", "()I", "setProductSubId", "(I)V", "getSignType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLQueryFirstLoanBean {

    @Nullable
    private String cardNo;

    @Nullable
    private Boolean firstLoanFlag;

    @Nullable
    private Boolean freePasswordFlag;
    private int productSubId;

    @Nullable
    private final Integer signType;

    public CLQueryFirstLoanBean(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str, int i7, @Nullable Integer num) {
        this.freePasswordFlag = bool;
        this.firstLoanFlag = bool2;
        this.cardNo = str;
        this.productSubId = i7;
        this.signType = num;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final Boolean getFirstLoanFlag() {
        return this.firstLoanFlag;
    }

    @Nullable
    public final Boolean getFreePasswordFlag() {
        return this.freePasswordFlag;
    }

    public final int getProductSubId() {
        return this.productSubId;
    }

    @Nullable
    public final Integer getSignType() {
        return this.signType;
    }

    public final void setCardNo(@Nullable String str) {
        this.cardNo = str;
    }

    public final void setFirstLoanFlag(@Nullable Boolean bool) {
        this.firstLoanFlag = bool;
    }

    public final void setFreePasswordFlag(@Nullable Boolean bool) {
        this.freePasswordFlag = bool;
    }

    public final void setProductSubId(int i7) {
        this.productSubId = i7;
    }
}
