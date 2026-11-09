package com.transsnet.palmpay.core.bean.rsp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/ViewBankCardResp;", "", "riskResult", "", "cardNo", "", "toast", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getRiskResult", "()Ljava/lang/Boolean;", "setRiskResult", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getCardNo", "()Ljava/lang/String;", "setCardNo", "(Ljava/lang/String;)V", "getToast", "setToast", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ViewBankCardResp {

    @Nullable
    private String cardNo;

    @Nullable
    private Boolean riskResult;

    @Nullable
    private String toast;

    public ViewBankCardResp() {
        this(null, null, null, 7, null);
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final Boolean getRiskResult() {
        return this.riskResult;
    }

    @Nullable
    public final String getToast() {
        return this.toast;
    }

    public final void setCardNo(@Nullable String str) {
        this.cardNo = str;
    }

    public final void setRiskResult(@Nullable Boolean bool) {
        this.riskResult = bool;
    }

    public final void setToast(@Nullable String str) {
        this.toast = str;
    }

    public ViewBankCardResp(@Nullable Boolean bool, @Nullable String str, @Nullable String str2) {
        this.riskResult = bool;
        this.cardNo = str;
        this.toast = str2;
    }

    public /* synthetic */ ViewBankCardResp(Boolean bool, String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : bool, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2);
    }
}
