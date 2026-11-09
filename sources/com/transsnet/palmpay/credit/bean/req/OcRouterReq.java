package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0018\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/OcRouterReq;", "", "hadLock", "", "loanProduct", "", "applySource", "", "phoneLockStatus", "cashInstallment", "channelEnum", "applyId", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getHadLock", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLoanProduct", "()Ljava/lang/String;", "getApplySource", "()I", "getPhoneLockStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCashInstallment", "getChannelEnum", "getApplyId", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcRouterReq {

    @Nullable
    private final String applyId;
    private final int applySource;

    @Nullable
    private final Boolean cashInstallment;

    @Nullable
    private final String channelEnum;

    @Nullable
    private final Boolean hadLock;

    @Nullable
    private final String loanProduct;

    @Nullable
    private final Integer phoneLockStatus;

    public OcRouterReq(@Nullable Boolean bool, @Nullable String str, int i7, @Nullable Integer num, @Nullable Boolean bool2, @Nullable String str2, @Nullable String str3) {
        this.hadLock = bool;
        this.loanProduct = str;
        this.applySource = i7;
        this.phoneLockStatus = num;
        this.cashInstallment = bool2;
        this.channelEnum = str2;
        this.applyId = str3;
    }

    @Nullable
    public final String getApplyId() {
        return this.applyId;
    }

    public final int getApplySource() {
        return this.applySource;
    }

    @Nullable
    public final Boolean getCashInstallment() {
        return this.cashInstallment;
    }

    @Nullable
    public final String getChannelEnum() {
        return this.channelEnum;
    }

    @Nullable
    public final Boolean getHadLock() {
        return this.hadLock;
    }

    @Nullable
    public final String getLoanProduct() {
        return this.loanProduct;
    }

    @Nullable
    public final Integer getPhoneLockStatus() {
        return this.phoneLockStatus;
    }

    public /* synthetic */ OcRouterReq(Boolean bool, String str, int i7, Integer num, Boolean bool2, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Boolean.FALSE : bool, str, (i10 & 4) != 0 ? 2 : i7, (i10 & 8) != 0 ? -1 : num, (i10 & 16) != 0 ? Boolean.FALSE : bool2, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : str3);
    }
}
