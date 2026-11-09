package com.palmpay.lib.liveness.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.databinding.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/palmpay/lib/liveness/model/LivenessConfigResponse;", "Landroid/os/Parcelable;", "transactionId", "", "clientConfig", "Lcom/palmpay/lib/liveness/model/ClientConfig;", "<init>", "(Ljava/lang/String;Lcom/palmpay/lib/liveness/model/ClientConfig;)V", "getTransactionId", "()Ljava/lang/String;", "getClientConfig", "()Lcom/palmpay/lib/liveness/model/ClientConfig;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LivenessConfigResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LivenessConfigResponse> CREATOR = new g(29);

    @Nullable
    private final ClientConfig clientConfig;

    @NotNull
    private final String transactionId;

    public LivenessConfigResponse(@NotNull String transactionId, @Nullable ClientConfig clientConfig) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.transactionId = transactionId;
        this.clientConfig = clientConfig;
    }

    public static /* synthetic */ LivenessConfigResponse copy$default(LivenessConfigResponse livenessConfigResponse, String str, ClientConfig clientConfig, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = livenessConfigResponse.transactionId;
        }
        if ((i7 & 2) != 0) {
            clientConfig = livenessConfigResponse.clientConfig;
        }
        return livenessConfigResponse.copy(str, clientConfig);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ClientConfig getClientConfig() {
        return this.clientConfig;
    }

    @NotNull
    public final LivenessConfigResponse copy(@NotNull String transactionId, @Nullable ClientConfig clientConfig) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        return new LivenessConfigResponse(transactionId, clientConfig);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LivenessConfigResponse)) {
            return false;
        }
        LivenessConfigResponse livenessConfigResponse = (LivenessConfigResponse) other;
        return Intrinsics.c(this.transactionId, livenessConfigResponse.transactionId) && Intrinsics.c(this.clientConfig, livenessConfigResponse.clientConfig);
    }

    @Nullable
    public final ClientConfig getClientConfig() {
        return this.clientConfig;
    }

    @NotNull
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        int iHashCode = this.transactionId.hashCode() * 31;
        ClientConfig clientConfig = this.clientConfig;
        return iHashCode + (clientConfig == null ? 0 : clientConfig.hashCode());
    }

    @NotNull
    public String toString() {
        return "LivenessConfigResponse(transactionId=" + this.transactionId + ", clientConfig=" + this.clientConfig + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.transactionId);
        ClientConfig clientConfig = this.clientConfig;
        if (clientConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            clientConfig.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ LivenessConfigResponse(String str, ClientConfig clientConfig, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? null : clientConfig);
    }
}
