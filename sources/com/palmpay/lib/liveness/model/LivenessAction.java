package com.palmpay.lib.liveness.model;

import C0.G;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.F;
import androidx.databinding.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/palmpay/lib/liveness/model/LivenessAction;", "Landroid/os/Parcelable;", "action", "", "threshold", "isShakeDetect", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getAction", "()Ljava/lang/String;", "getThreshold", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LivenessAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LivenessAction> CREATOR = new g(27);

    @NotNull
    private final String action;
    private final boolean isShakeDetect;

    @NotNull
    private final String threshold;

    public LivenessAction(@NotNull String action, @NotNull String threshold, boolean z3) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(threshold, "threshold");
        this.action = action;
        this.threshold = threshold;
        this.isShakeDetect = z3;
    }

    public static /* synthetic */ LivenessAction copy$default(LivenessAction livenessAction, String str, String str2, boolean z3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = livenessAction.action;
        }
        if ((i7 & 2) != 0) {
            str2 = livenessAction.threshold;
        }
        if ((i7 & 4) != 0) {
            z3 = livenessAction.isShakeDetect;
        }
        return livenessAction.copy(str, str2, z3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getThreshold() {
        return this.threshold;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsShakeDetect() {
        return this.isShakeDetect;
    }

    @NotNull
    public final LivenessAction copy(@NotNull String action, @NotNull String threshold, boolean isShakeDetect) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(threshold, "threshold");
        return new LivenessAction(action, threshold, isShakeDetect);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LivenessAction)) {
            return false;
        }
        LivenessAction livenessAction = (LivenessAction) other;
        return Intrinsics.c(this.action, livenessAction.action) && Intrinsics.c(this.threshold, livenessAction.threshold) && this.isShakeDetect == livenessAction.isShakeDetect;
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final String getThreshold() {
        return this.threshold;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isShakeDetect) + G.c(this.action.hashCode() * 31, 31, this.threshold);
    }

    public final boolean isShakeDetect() {
        return this.isShakeDetect;
    }

    @NotNull
    public String toString() {
        String str = this.action;
        String str2 = this.threshold;
        boolean z3 = this.isShakeDetect;
        StringBuilder sbF = F.f("LivenessAction(action=", str, ", threshold=", str2, ", isShakeDetect=");
        sbF.append(z3);
        sbF.append(")");
        return sbF.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.action);
        dest.writeString(this.threshold);
        dest.writeInt(this.isShakeDetect ? 1 : 0);
    }
}
