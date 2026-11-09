package com.palmpay.lib.liveness.model;

import C0.G;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, d2 = {"Lcom/palmpay/lib/liveness/model/LivenessCheckResponse;", "Landroid/os/Parcelable;", "token", "", "memberId", "bizId", "s3Url", "similarity", "transactionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getMemberId", "getBizId", "getS3Url", "getSimilarity", "getTransactionId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LivenessCheckResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LivenessCheckResponse> CREATOR = new g(28);

    @Nullable
    private final String bizId;

    @Nullable
    private final String memberId;

    @Nullable
    private final String s3Url;

    @Nullable
    private final String similarity;

    @Nullable
    private final String token;

    @Nullable
    private final String transactionId;

    public LivenessCheckResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ LivenessCheckResponse copy$default(LivenessCheckResponse livenessCheckResponse, String str, String str2, String str3, String str4, String str5, String str6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = livenessCheckResponse.token;
        }
        if ((i7 & 2) != 0) {
            str2 = livenessCheckResponse.memberId;
        }
        if ((i7 & 4) != 0) {
            str3 = livenessCheckResponse.bizId;
        }
        if ((i7 & 8) != 0) {
            str4 = livenessCheckResponse.s3Url;
        }
        if ((i7 & 16) != 0) {
            str5 = livenessCheckResponse.similarity;
        }
        if ((i7 & 32) != 0) {
            str6 = livenessCheckResponse.transactionId;
        }
        String str7 = str5;
        String str8 = str6;
        return livenessCheckResponse.copy(str, str2, str3, str4, str7, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMemberId() {
        return this.memberId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBizId() {
        return this.bizId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getS3Url() {
        return this.s3Url;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSimilarity() {
        return this.similarity;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    @NotNull
    public final LivenessCheckResponse copy(@Nullable String token, @Nullable String memberId, @Nullable String bizId, @Nullable String s3Url, @Nullable String similarity, @Nullable String transactionId) {
        return new LivenessCheckResponse(token, memberId, bizId, s3Url, similarity, transactionId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LivenessCheckResponse)) {
            return false;
        }
        LivenessCheckResponse livenessCheckResponse = (LivenessCheckResponse) other;
        return Intrinsics.c(this.token, livenessCheckResponse.token) && Intrinsics.c(this.memberId, livenessCheckResponse.memberId) && Intrinsics.c(this.bizId, livenessCheckResponse.bizId) && Intrinsics.c(this.s3Url, livenessCheckResponse.s3Url) && Intrinsics.c(this.similarity, livenessCheckResponse.similarity) && Intrinsics.c(this.transactionId, livenessCheckResponse.transactionId);
    }

    @Nullable
    public final String getBizId() {
        return this.bizId;
    }

    @Nullable
    public final String getMemberId() {
        return this.memberId;
    }

    @Nullable
    public final String getS3Url() {
        return this.s3Url;
    }

    @Nullable
    public final String getSimilarity() {
        return this.similarity;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        String str = this.token;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.memberId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bizId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.s3Url;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.similarity;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.transactionId;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.token;
        String str2 = this.memberId;
        String str3 = this.bizId;
        String str4 = this.s3Url;
        String str5 = this.similarity;
        String str6 = this.transactionId;
        StringBuilder sbF = F.f("LivenessCheckResponse(token=", str, ", memberId=", str2, ", bizId=");
        u.x(sbF, str3, ", s3Url=", str4, ", similarity=");
        return G.s(sbF, str5, ", transactionId=", str6, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.token);
        dest.writeString(this.memberId);
        dest.writeString(this.bizId);
        dest.writeString(this.s3Url);
        dest.writeString(this.similarity);
        dest.writeString(this.transactionId);
    }

    public LivenessCheckResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.token = str;
        this.memberId = str2;
        this.bizId = str3;
        this.s3Url = str4;
        this.similarity = str5;
        this.transactionId = str6;
    }

    public /* synthetic */ LivenessCheckResponse(String str, String str2, String str3, String str4, String str5, String str6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : str5, (i7 & 32) != 0 ? null : str6);
    }
}
