package com.palmpay.lib.liveness.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.databinding.g;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/palmpay/lib/liveness/model/AuthenticationResponse;", "Lcom/palmpay/lib/liveness/model/LiveBaseResponse;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/palmpay/lib/liveness/model/LivenessConfigResponse;", "<init>", "(Lcom/palmpay/lib/liveness/model/LivenessConfigResponse;)V", "getData", "()Lcom/palmpay/lib/liveness/model/LivenessConfigResponse;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AuthenticationResponse extends LiveBaseResponse {

    @NotNull
    public static final Parcelable.Creator<AuthenticationResponse> CREATOR = new g(20);

    @NotNull
    private final LivenessConfigResponse data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationResponse(@NotNull LivenessConfigResponse data) {
        super(null, null, null, 7, null);
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public static /* synthetic */ AuthenticationResponse copy$default(AuthenticationResponse authenticationResponse, LivenessConfigResponse livenessConfigResponse, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            livenessConfigResponse = authenticationResponse.data;
        }
        return authenticationResponse.copy(livenessConfigResponse);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LivenessConfigResponse getData() {
        return this.data;
    }

    @NotNull
    public final AuthenticationResponse copy(@NotNull LivenessConfigResponse data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new AuthenticationResponse(data);
    }

    @Override // com.palmpay.lib.liveness.model.LiveBaseResponse, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AuthenticationResponse) && Intrinsics.c(this.data, ((AuthenticationResponse) other).data);
    }

    @NotNull
    public final LivenessConfigResponse getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "AuthenticationResponse(data=" + this.data + ")";
    }

    @Override // com.palmpay.lib.liveness.model.LiveBaseResponse, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.data.writeToParcel(dest, flags);
    }
}
