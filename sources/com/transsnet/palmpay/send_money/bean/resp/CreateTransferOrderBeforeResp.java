package com.transsnet.palmpay.send_money.bean.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/CreateTransferOrderBeforeResp;", "", "feeType", "", "bankAccountMemberInfo", "Lcom/transsnet/palmpay/send_money/bean/resp/BankAccountMemberInfoResp;", "<init>", "(Ljava/lang/Integer;Lcom/transsnet/palmpay/send_money/bean/resp/BankAccountMemberInfoResp;)V", "getFeeType", "()Ljava/lang/Integer;", "setFeeType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getBankAccountMemberInfo", "()Lcom/transsnet/palmpay/send_money/bean/resp/BankAccountMemberInfoResp;", "setBankAccountMemberInfo", "(Lcom/transsnet/palmpay/send_money/bean/resp/BankAccountMemberInfoResp;)V", "component1", "component2", "copy", "(Ljava/lang/Integer;Lcom/transsnet/palmpay/send_money/bean/resp/BankAccountMemberInfoResp;)Lcom/transsnet/palmpay/send_money/bean/resp/CreateTransferOrderBeforeResp;", "equals", "", "other", "hashCode", "toString", "", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CreateTransferOrderBeforeResp {

    @Nullable
    private BankAccountMemberInfoResp bankAccountMemberInfo;

    @Nullable
    private Integer feeType;

    public CreateTransferOrderBeforeResp(@Nullable Integer num, @Nullable BankAccountMemberInfoResp bankAccountMemberInfoResp) {
        this.feeType = num;
        this.bankAccountMemberInfo = bankAccountMemberInfoResp;
    }

    public static /* synthetic */ CreateTransferOrderBeforeResp copy$default(CreateTransferOrderBeforeResp createTransferOrderBeforeResp, Integer num, BankAccountMemberInfoResp bankAccountMemberInfoResp, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = createTransferOrderBeforeResp.feeType;
        }
        if ((i7 & 2) != 0) {
            bankAccountMemberInfoResp = createTransferOrderBeforeResp.bankAccountMemberInfo;
        }
        return createTransferOrderBeforeResp.copy(num, bankAccountMemberInfoResp);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getFeeType() {
        return this.feeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BankAccountMemberInfoResp getBankAccountMemberInfo() {
        return this.bankAccountMemberInfo;
    }

    @NotNull
    public final CreateTransferOrderBeforeResp copy(@Nullable Integer feeType, @Nullable BankAccountMemberInfoResp bankAccountMemberInfo) {
        return new CreateTransferOrderBeforeResp(feeType, bankAccountMemberInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateTransferOrderBeforeResp)) {
            return false;
        }
        CreateTransferOrderBeforeResp createTransferOrderBeforeResp = (CreateTransferOrderBeforeResp) other;
        return Intrinsics.c(this.feeType, createTransferOrderBeforeResp.feeType) && Intrinsics.c(this.bankAccountMemberInfo, createTransferOrderBeforeResp.bankAccountMemberInfo);
    }

    @Nullable
    public final BankAccountMemberInfoResp getBankAccountMemberInfo() {
        return this.bankAccountMemberInfo;
    }

    @Nullable
    public final Integer getFeeType() {
        return this.feeType;
    }

    public int hashCode() {
        Integer num = this.feeType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        BankAccountMemberInfoResp bankAccountMemberInfoResp = this.bankAccountMemberInfo;
        return iHashCode + (bankAccountMemberInfoResp != null ? bankAccountMemberInfoResp.hashCode() : 0);
    }

    public final void setBankAccountMemberInfo(@Nullable BankAccountMemberInfoResp bankAccountMemberInfoResp) {
        this.bankAccountMemberInfo = bankAccountMemberInfoResp;
    }

    public final void setFeeType(@Nullable Integer num) {
        this.feeType = num;
    }

    @NotNull
    public String toString() {
        return "CreateTransferOrderBeforeResp(feeType=" + this.feeType + ", bankAccountMemberInfo=" + this.bankAccountMemberInfo + ")";
    }
}
