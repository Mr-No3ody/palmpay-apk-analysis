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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006 "}, d2 = {"Lcom/palmpay/lib/liveness/model/FacingDetectThreshold;", "Landroid/os/Parcelable;", "headEulerAngleZ", "", "headEulerAngleY", "headEulerAngleX", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "getHeadEulerAngleZ", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getHeadEulerAngleY", "getHeadEulerAngleX", "component1", "component2", "component3", "copy", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lcom/palmpay/lib/liveness/model/FacingDetectThreshold;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FacingDetectThreshold implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FacingDetectThreshold> CREATOR = new g(25);

    @Nullable
    private final Float headEulerAngleX;

    @Nullable
    private final Float headEulerAngleY;

    @Nullable
    private final Float headEulerAngleZ;

    public FacingDetectThreshold() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ FacingDetectThreshold copy$default(FacingDetectThreshold facingDetectThreshold, Float f10, Float f11, Float f12, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            f10 = facingDetectThreshold.headEulerAngleZ;
        }
        if ((i7 & 2) != 0) {
            f11 = facingDetectThreshold.headEulerAngleY;
        }
        if ((i7 & 4) != 0) {
            f12 = facingDetectThreshold.headEulerAngleX;
        }
        return facingDetectThreshold.copy(f10, f11, f12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float getHeadEulerAngleZ() {
        return this.headEulerAngleZ;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float getHeadEulerAngleY() {
        return this.headEulerAngleY;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getHeadEulerAngleX() {
        return this.headEulerAngleX;
    }

    @NotNull
    public final FacingDetectThreshold copy(@Nullable Float headEulerAngleZ, @Nullable Float headEulerAngleY, @Nullable Float headEulerAngleX) {
        return new FacingDetectThreshold(headEulerAngleZ, headEulerAngleY, headEulerAngleX);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FacingDetectThreshold)) {
            return false;
        }
        FacingDetectThreshold facingDetectThreshold = (FacingDetectThreshold) other;
        return Intrinsics.c(this.headEulerAngleZ, facingDetectThreshold.headEulerAngleZ) && Intrinsics.c(this.headEulerAngleY, facingDetectThreshold.headEulerAngleY) && Intrinsics.c(this.headEulerAngleX, facingDetectThreshold.headEulerAngleX);
    }

    @Nullable
    public final Float getHeadEulerAngleX() {
        return this.headEulerAngleX;
    }

    @Nullable
    public final Float getHeadEulerAngleY() {
        return this.headEulerAngleY;
    }

    @Nullable
    public final Float getHeadEulerAngleZ() {
        return this.headEulerAngleZ;
    }

    public int hashCode() {
        Float f10 = this.headEulerAngleZ;
        int iHashCode = (f10 == null ? 0 : f10.hashCode()) * 31;
        Float f11 = this.headEulerAngleY;
        int iHashCode2 = (iHashCode + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.headEulerAngleX;
        return iHashCode2 + (f12 != null ? f12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FacingDetectThreshold(headEulerAngleZ=" + this.headEulerAngleZ + ", headEulerAngleY=" + this.headEulerAngleY + ", headEulerAngleX=" + this.headEulerAngleX + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Float f10 = this.headEulerAngleZ;
        if (f10 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f10.floatValue());
        }
        Float f11 = this.headEulerAngleY;
        if (f11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f11.floatValue());
        }
        Float f12 = this.headEulerAngleX;
        if (f12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f12.floatValue());
        }
    }

    public FacingDetectThreshold(@Nullable Float f10, @Nullable Float f11, @Nullable Float f12) {
        this.headEulerAngleZ = f10;
        this.headEulerAngleY = f11;
        this.headEulerAngleX = f12;
    }

    public /* synthetic */ FacingDetectThreshold(Float f10, Float f11, Float f12, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : f10, (i7 & 2) != 0 ? null : f11, (i7 & 4) != 0 ? null : f12);
    }
}
