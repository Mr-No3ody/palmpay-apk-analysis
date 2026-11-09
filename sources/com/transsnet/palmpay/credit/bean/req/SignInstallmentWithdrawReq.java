package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/SignInstallmentWithdrawReq;", "", "protocolType", "", "<init>", "(Ljava/lang/Integer;)V", "getProtocolType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SignInstallmentWithdrawReq {

    @Nullable
    private final Integer protocolType;

    /* JADX WARN: Multi-variable type inference failed */
    public SignInstallmentWithdrawReq() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public final Integer getProtocolType() {
        return this.protocolType;
    }

    public SignInstallmentWithdrawReq(@Nullable Integer num) {
        this.protocolType = num;
    }

    public /* synthetic */ SignInstallmentWithdrawReq(Integer num, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : num);
    }
}
