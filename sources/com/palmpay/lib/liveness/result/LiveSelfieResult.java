package com.palmpay.lib.liveness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.palmpay.lib.liveness.model.CheckResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/palmpay/lib/liveness/result/LiveSelfieResult;", "Landroid/os/Parcelable;", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LiveSelfieResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LiveSelfieResult> CREATOR = new p321v7.a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckResponse f23818a;

    public LiveSelfieResult(CheckResponse checkResponse) {
        Intrinsics.checkNotNullParameter(checkResponse, "checkResponse");
        this.f23818a = checkResponse;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiveSelfieResult) && Intrinsics.c(this.f23818a, ((LiveSelfieResult) obj).f23818a);
    }

    public final int hashCode() {
        return this.f23818a.hashCode();
    }

    public final String toString() {
        return "LiveSelfieResult(checkResponse=" + this.f23818a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f23818a.writeToParcel(dest, i7);
    }
}
