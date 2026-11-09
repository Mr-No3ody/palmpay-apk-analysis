package com.transsnet.palmpay.core.rnbridge.bridge;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/RefreshBankTokenResult;", "", "success", "", "memberId", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMemberId", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/transsnet/palmpay/core/rnbridge/bridge/RefreshBankTokenResult;", "equals", "other", "hashCode", "", "toString", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RefreshBankTokenResult {

    @Nullable
    private final String memberId;

    @Nullable
    private final Boolean success;

    /* JADX WARN: Multi-variable type inference failed */
    public RefreshBankTokenResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RefreshBankTokenResult copy$default(RefreshBankTokenResult refreshBankTokenResult, Boolean bool, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            bool = refreshBankTokenResult.success;
        }
        if ((i7 & 2) != 0) {
            str = refreshBankTokenResult.memberId;
        }
        return refreshBankTokenResult.copy(bool, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getSuccess() {
        return this.success;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMemberId() {
        return this.memberId;
    }

    @NotNull
    public final RefreshBankTokenResult copy(@Nullable Boolean success, @Nullable String memberId) {
        return new RefreshBankTokenResult(success, memberId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefreshBankTokenResult)) {
            return false;
        }
        RefreshBankTokenResult refreshBankTokenResult = (RefreshBankTokenResult) other;
        return Intrinsics.c(this.success, refreshBankTokenResult.success) && Intrinsics.c(this.memberId, refreshBankTokenResult.memberId);
    }

    @Nullable
    public final String getMemberId() {
        return this.memberId;
    }

    @Nullable
    public final Boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        Boolean bool = this.success;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.memberId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RefreshBankTokenResult(success=" + this.success + ", memberId=" + this.memberId + ")";
    }

    public RefreshBankTokenResult(@Nullable Boolean bool, @Nullable String str) {
        this.success = bool;
        this.memberId = str;
    }

    public /* synthetic */ RefreshBankTokenResult(Boolean bool, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : bool, (i7 & 2) != 0 ? null : str);
    }
}
