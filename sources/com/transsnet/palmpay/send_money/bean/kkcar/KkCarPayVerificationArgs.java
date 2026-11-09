package com.transsnet.palmpay.send_money.bean.kkcar;

import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/kkcar/KkCarPayVerificationArgs;", "", "payByOrderResp", "Lcom/transsnet/palmpay/core/bean/payment/PayByOrderResp;", "checkPayReq", "Lcom/transsnet/palmpay/core/bean/payment/CheckPayReq;", "<init>", "(Lcom/transsnet/palmpay/core/bean/payment/PayByOrderResp;Lcom/transsnet/palmpay/core/bean/payment/CheckPayReq;)V", "getPayByOrderResp", "()Lcom/transsnet/palmpay/core/bean/payment/PayByOrderResp;", "getCheckPayReq", "()Lcom/transsnet/palmpay/core/bean/payment/CheckPayReq;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class KkCarPayVerificationArgs {

    @NotNull
    private final CheckPayReq checkPayReq;

    @NotNull
    private final PayByOrderResp payByOrderResp;

    public KkCarPayVerificationArgs(@NotNull PayByOrderResp payByOrderResp, @NotNull CheckPayReq checkPayReq) {
        Intrinsics.checkNotNullParameter(payByOrderResp, "payByOrderResp");
        Intrinsics.checkNotNullParameter(checkPayReq, "checkPayReq");
        this.payByOrderResp = payByOrderResp;
        this.checkPayReq = checkPayReq;
    }

    public static /* synthetic */ KkCarPayVerificationArgs copy$default(KkCarPayVerificationArgs kkCarPayVerificationArgs, PayByOrderResp payByOrderResp, CheckPayReq checkPayReq, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            payByOrderResp = kkCarPayVerificationArgs.payByOrderResp;
        }
        if ((i7 & 2) != 0) {
            checkPayReq = kkCarPayVerificationArgs.checkPayReq;
        }
        return kkCarPayVerificationArgs.copy(payByOrderResp, checkPayReq);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PayByOrderResp getPayByOrderResp() {
        return this.payByOrderResp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CheckPayReq getCheckPayReq() {
        return this.checkPayReq;
    }

    @NotNull
    public final KkCarPayVerificationArgs copy(@NotNull PayByOrderResp payByOrderResp, @NotNull CheckPayReq checkPayReq) {
        Intrinsics.checkNotNullParameter(payByOrderResp, "payByOrderResp");
        Intrinsics.checkNotNullParameter(checkPayReq, "checkPayReq");
        return new KkCarPayVerificationArgs(payByOrderResp, checkPayReq);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KkCarPayVerificationArgs)) {
            return false;
        }
        KkCarPayVerificationArgs kkCarPayVerificationArgs = (KkCarPayVerificationArgs) other;
        return Intrinsics.c(this.payByOrderResp, kkCarPayVerificationArgs.payByOrderResp) && Intrinsics.c(this.checkPayReq, kkCarPayVerificationArgs.checkPayReq);
    }

    @NotNull
    public final CheckPayReq getCheckPayReq() {
        return this.checkPayReq;
    }

    @NotNull
    public final PayByOrderResp getPayByOrderResp() {
        return this.payByOrderResp;
    }

    public int hashCode() {
        return this.checkPayReq.hashCode() + (this.payByOrderResp.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "KkCarPayVerificationArgs(payByOrderResp=" + this.payByOrderResp + ", checkPayReq=" + this.checkPayReq + ")";
    }
}
