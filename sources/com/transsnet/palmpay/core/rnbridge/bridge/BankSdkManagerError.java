package com.transsnet.palmpay.core.rnbridge.bridge;

import C0.G;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/BankSdkManagerError;", "", "errorCode", "", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getErrorMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BankSdkManagerError {

    @Nullable
    private final String errorCode;

    @Nullable
    private final String errorMessage;

    /* JADX WARN: Multi-variable type inference failed */
    public BankSdkManagerError() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BankSdkManagerError copy$default(BankSdkManagerError bankSdkManagerError, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = bankSdkManagerError.errorCode;
        }
        if ((i7 & 2) != 0) {
            str2 = bankSdkManagerError.errorMessage;
        }
        return bankSdkManagerError.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final BankSdkManagerError copy(@Nullable String errorCode, @Nullable String errorMessage) {
        return new BankSdkManagerError(errorCode, errorMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankSdkManagerError)) {
            return false;
        }
        BankSdkManagerError bankSdkManagerError = (BankSdkManagerError) other;
        return Intrinsics.c(this.errorCode, bankSdkManagerError.errorCode) && Intrinsics.c(this.errorMessage, bankSdkManagerError.errorMessage);
    }

    @Nullable
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        String str = this.errorCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorMessage;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return G.q("BankSdkManagerError(errorCode=", this.errorCode, ", errorMessage=", this.errorMessage, ")");
    }

    public BankSdkManagerError(@Nullable String str, @Nullable String str2) {
        this.errorCode = str;
        this.errorMessage = str2;
    }

    public /* synthetic */ BankSdkManagerError(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2);
    }
}
