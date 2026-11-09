package com.transsnet.palmpay.core.bean;

import C0.G;
import androidx.camera.camera2.internal.F;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/transsnet/palmpay/core/bean/TransferByLoanOpenParams;", "Ljava/io/Serializable;", "loanAmount", "", "accountNumber", "", "cashierContextId", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "getLoanAmount", "()J", "getAccountNumber", "()Ljava/lang/String;", "getCashierContextId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TransferByLoanOpenParams implements Serializable {

    @NotNull
    private final String accountNumber;

    @Nullable
    private final String cashierContextId;
    private final long loanAmount;

    public TransferByLoanOpenParams(long j6, @NotNull String accountNumber, @Nullable String str) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.loanAmount = j6;
        this.accountNumber = accountNumber;
        this.cashierContextId = str;
    }

    public static /* synthetic */ TransferByLoanOpenParams copy$default(TransferByLoanOpenParams transferByLoanOpenParams, long j6, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j6 = transferByLoanOpenParams.loanAmount;
        }
        if ((i7 & 2) != 0) {
            str = transferByLoanOpenParams.accountNumber;
        }
        if ((i7 & 4) != 0) {
            str2 = transferByLoanOpenParams.cashierContextId;
        }
        return transferByLoanOpenParams.copy(j6, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getLoanAmount() {
        return this.loanAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCashierContextId() {
        return this.cashierContextId;
    }

    @NotNull
    public final TransferByLoanOpenParams copy(long loanAmount, @NotNull String accountNumber, @Nullable String cashierContextId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new TransferByLoanOpenParams(loanAmount, accountNumber, cashierContextId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferByLoanOpenParams)) {
            return false;
        }
        TransferByLoanOpenParams transferByLoanOpenParams = (TransferByLoanOpenParams) other;
        return this.loanAmount == transferByLoanOpenParams.loanAmount && Intrinsics.c(this.accountNumber, transferByLoanOpenParams.accountNumber) && Intrinsics.c(this.cashierContextId, transferByLoanOpenParams.cashierContextId);
    }

    @NotNull
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    @Nullable
    public final String getCashierContextId() {
        return this.cashierContextId;
    }

    public final long getLoanAmount() {
        return this.loanAmount;
    }

    public int hashCode() {
        int iC = G.c(Long.hashCode(this.loanAmount) * 31, 31, this.accountNumber);
        String str = this.cashierContextId;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        long j6 = this.loanAmount;
        String str = this.accountNumber;
        String str2 = this.cashierContextId;
        StringBuilder sb2 = new StringBuilder("TransferByLoanOpenParams(loanAmount=");
        sb2.append(j6);
        sb2.append(", accountNumber=");
        sb2.append(str);
        return F.d(sb2, ", cashierContextId=", str2, ")");
    }

    public /* synthetic */ TransferByLoanOpenParams(long j6, String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j6, str, (i7 & 4) != 0 ? null : str2);
    }
}
