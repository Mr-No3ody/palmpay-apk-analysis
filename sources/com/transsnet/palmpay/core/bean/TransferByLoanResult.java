package com.transsnet.palmpay.core.bean;

import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.G;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/core/bean/TransferByLoanResult;", "Ljava/io/Serializable;", "status", "", "payload", "", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getStatus", "()Ljava/lang/String;", "getPayload", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TransferByLoanResult implements Serializable {

    @NotNull
    public static final String STATUS_CANCELLED = "cancelled";

    @NotNull
    public static final String STATUS_CONFIRMED = "confirmed";

    @NotNull
    public static final String STATUS_FAILED = "failed";

    @NotNull
    private final Map<String, Object> payload;

    @NotNull
    private final String status;

    public TransferByLoanResult(@NotNull String status, @NotNull Map<String, ? extends Object> payload) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.status = status;
        this.payload = payload;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransferByLoanResult copy$default(TransferByLoanResult transferByLoanResult, String str, Map map, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = transferByLoanResult.status;
        }
        if ((i7 & 2) != 0) {
            map = transferByLoanResult.payload;
        }
        return transferByLoanResult.copy(str, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final Map<String, Object> component2() {
        return this.payload;
    }

    @NotNull
    public final TransferByLoanResult copy(@NotNull String status, @NotNull Map<String, ? extends Object> payload) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new TransferByLoanResult(status, payload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferByLoanResult)) {
            return false;
        }
        TransferByLoanResult transferByLoanResult = (TransferByLoanResult) other;
        return Intrinsics.c(this.status, transferByLoanResult.status) && Intrinsics.c(this.payload, transferByLoanResult.payload);
    }

    @NotNull
    public final Map<String, Object> getPayload() {
        return this.payload;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.payload.hashCode() + (this.status.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "TransferByLoanResult(status=" + this.status + ", payload=" + this.payload + ")";
    }

    public /* synthetic */ TransferByLoanResult(String str, Map map, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? G.c() : map);
    }
}
