package com.palmpay.lib.liveness.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u0005J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\r\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0013¨\u0006%"}, d2 = {"Lcom/palmpay/lib/liveness/model/CheckRequest;", "Landroid/os/Parcelable;", "transactionId", "", "dealType", "", "systemType", "deviceFingerprint", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getTransactionId", "()Ljava/lang/String;", "getDealType", "()I", "getSystemType", "setSystemType", "(I)V", "getDeviceFingerprint", "setDeviceFingerprint", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CheckRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CheckRequest> CREATOR = new g(21);
    private final int dealType;

    @Nullable
    private String deviceFingerprint;
    private int systemType;

    @NotNull
    private final String transactionId;

    public CheckRequest(@NotNull String transactionId, int i7, int i10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.transactionId = transactionId;
        this.dealType = i7;
        this.systemType = i10;
        this.deviceFingerprint = str;
    }

    public static /* synthetic */ CheckRequest copy$default(CheckRequest checkRequest, String str, int i7, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = checkRequest.transactionId;
        }
        if ((i11 & 2) != 0) {
            i7 = checkRequest.dealType;
        }
        if ((i11 & 4) != 0) {
            i10 = checkRequest.systemType;
        }
        if ((i11 & 8) != 0) {
            str2 = checkRequest.deviceFingerprint;
        }
        return checkRequest.copy(str, i7, i10, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDealType() {
        return this.dealType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSystemType() {
        return this.systemType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceFingerprint() {
        return this.deviceFingerprint;
    }

    @NotNull
    public final CheckRequest copy(@NotNull String transactionId, int dealType, int systemType, @Nullable String deviceFingerprint) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        return new CheckRequest(transactionId, dealType, systemType, deviceFingerprint);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckRequest)) {
            return false;
        }
        CheckRequest checkRequest = (CheckRequest) other;
        return Intrinsics.c(this.transactionId, checkRequest.transactionId) && this.dealType == checkRequest.dealType && this.systemType == checkRequest.systemType && Intrinsics.c(this.deviceFingerprint, checkRequest.deviceFingerprint);
    }

    public final int getDealType() {
        return this.dealType;
    }

    @Nullable
    public final String getDeviceFingerprint() {
        return this.deviceFingerprint;
    }

    public final int getSystemType() {
        return this.systemType;
    }

    @NotNull
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        int iB = u.b(this.systemType, u.b(this.dealType, this.transactionId.hashCode() * 31, 31), 31);
        String str = this.deviceFingerprint;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final void setDeviceFingerprint(@Nullable String str) {
        this.deviceFingerprint = str;
    }

    public final void setSystemType(int i7) {
        this.systemType = i7;
    }

    @NotNull
    public String toString() {
        return "CheckRequest(transactionId=" + this.transactionId + ", dealType=" + this.dealType + ", systemType=" + this.systemType + ", deviceFingerprint=" + this.deviceFingerprint + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.transactionId);
        dest.writeInt(this.dealType);
        dest.writeInt(this.systemType);
        dest.writeString(this.deviceFingerprint);
    }

    public /* synthetic */ CheckRequest(String str, int i7, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? 0 : i7, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? null : str2);
    }
}
