package com.google.android.gms.maps.model;

import C0.G;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "CapCreator")
@SafeParcelable.Reserved({1})
public class Cap extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Cap> CREATOR = new zzb();
    private static final String zza = "Cap";

    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getWrappedBitmapDescriptorImplBinder", id = 3, type = "android.os.IBinder")
    private final BitmapDescriptor zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getBitmapRefWidth", id = 4)
    private final Float zzd;

    public Cap(int i7) {
        this(i7, (BitmapDescriptor) null, (Float) null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.zzb == cap.zzb && Objects.equal(this.zzc, cap.zzc) && Objects.equal(this.zzd, cap.zzd);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    @NonNull
    public String toString() {
        return G.n(this.zzb, "]", new StringBuilder("[Cap: type="));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i7) {
        int i10 = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i10);
        BitmapDescriptor bitmapDescriptor = this.zzc;
        SafeParcelWriter.writeIBinder(parcel, 3, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
        SafeParcelWriter.writeFloatObject(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final Cap zza() {
        int i7 = this.zzb;
        if (i7 == 0) {
            return new ButtCap();
        }
        if (i7 == 1) {
            return new SquareCap();
        }
        if (i7 == 2) {
            return new RoundCap();
        }
        if (i7 != 3) {
            return this;
        }
        Preconditions.checkState(this.zzc != null, "bitmapDescriptor must not be null");
        Preconditions.checkState(this.zzd != null, "bitmapRefWidth must not be null");
        return new CustomCap(this.zzc, this.zzd.floatValue());
    }

    @SafeParcelable.Constructor
    public Cap(@SafeParcelable.Param(id = 2) int i7, @Nullable @SafeParcelable.Param(id = 3) IBinder iBinder, @Nullable @SafeParcelable.Param(id = 4) Float f10) {
        this(i7, iBinder == null ? null : new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder)), f10);
    }

    private Cap(int i7, @Nullable BitmapDescriptor bitmapDescriptor, @Nullable Float f10) {
        boolean z3 = true;
        boolean z8 = f10 != null && f10.floatValue() > 0.0f;
        if (i7 == 3) {
            z3 = bitmapDescriptor != null && z8;
            i7 = 3;
        }
        Preconditions.checkArgument(z3, "Invalid Cap: type=" + i7 + " bitmapDescriptor=" + bitmapDescriptor + " bitmapRefWidth=" + f10);
        this.zzb = i7;
        this.zzc = bitmapDescriptor;
        this.zzd = f10;
    }

    public Cap(@NonNull BitmapDescriptor bitmapDescriptor, float f10) {
        this(3, bitmapDescriptor, Float.valueOf(f10));
    }
}
