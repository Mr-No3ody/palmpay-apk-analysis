package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "PolygonOptionsCreator")
@SafeParcelable.Reserved({1})
public final class PolygonOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new zzt();

    @SafeParcelable.Field(getter = "getPoints", id = 2)
    private final List zza;

    @SafeParcelable.Field(getter = "getHolesForParcel", id = 3, type = "java.util.List")
    private final List zzb;

    @SafeParcelable.Field(getter = "getStrokeWidth", id = 4)
    private float zzc;

    @SafeParcelable.Field(getter = "getStrokeColor", id = 5)
    private int zzd;

    @SafeParcelable.Field(getter = "getFillColor", id = 6)
    private int zze;

    @SafeParcelable.Field(getter = "getZIndex", id = 7)
    private float zzf;

    @SafeParcelable.Field(getter = "isVisible", id = 8)
    private boolean zzg;

    @SafeParcelable.Field(getter = "isGeodesic", id = 9)
    private boolean zzh;

    @SafeParcelable.Field(getter = "isClickable", id = 10)
    private boolean zzi;

    @SafeParcelable.Field(getter = "getStrokeJointType", id = 11)
    private int zzj;

    @Nullable
    @SafeParcelable.Field(getter = "getStrokePattern", id = 12)
    private List zzk;

    public PolygonOptions() {
        this.zzc = 10.0f;
        this.zzd = -16777216;
        this.zze = 0;
        this.zzf = 0.0f;
        this.zzg = true;
        this.zzh = false;
        this.zzi = false;
        this.zzj = 0;
        this.zzk = null;
        this.zza = new ArrayList();
        this.zzb = new ArrayList();
    }

    @NonNull
    public PolygonOptions add(@NonNull LatLng latLng) {
        Preconditions.checkNotNull(latLng, "point must not be null.");
        this.zza.add(latLng);
        return this;
    }

    @NonNull
    public PolygonOptions addAll(@NonNull Iterable<LatLng> iterable) {
        Preconditions.checkNotNull(iterable, "points must not be null.");
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.zza.add(it.next());
        }
        return this;
    }

    @NonNull
    public PolygonOptions addHole(@NonNull Iterable<LatLng> iterable) {
        Preconditions.checkNotNull(iterable, "points must not be null.");
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        this.zzb.add(arrayList);
        return this;
    }

    @NonNull
    public PolygonOptions clickable(boolean z3) {
        this.zzi = z3;
        return this;
    }

    @NonNull
    public PolygonOptions fillColor(int i7) {
        this.zze = i7;
        return this;
    }

    @NonNull
    public PolygonOptions geodesic(boolean z3) {
        this.zzh = z3;
        return this;
    }

    public int getFillColor() {
        return this.zze;
    }

    @NonNull
    public List<List<LatLng>> getHoles() {
        return this.zzb;
    }

    @NonNull
    public List<LatLng> getPoints() {
        return this.zza;
    }

    public int getStrokeColor() {
        return this.zzd;
    }

    public int getStrokeJointType() {
        return this.zzj;
    }

    @Nullable
    public List<PatternItem> getStrokePattern() {
        return this.zzk;
    }

    public float getStrokeWidth() {
        return this.zzc;
    }

    public float getZIndex() {
        return this.zzf;
    }

    public boolean isClickable() {
        return this.zzi;
    }

    public boolean isGeodesic() {
        return this.zzh;
    }

    public boolean isVisible() {
        return this.zzg;
    }

    @NonNull
    public PolygonOptions strokeColor(int i7) {
        this.zzd = i7;
        return this;
    }

    @NonNull
    public PolygonOptions strokeJointType(int i7) {
        this.zzj = i7;
        return this;
    }

    @NonNull
    public PolygonOptions strokePattern(@Nullable List<PatternItem> list) {
        this.zzk = list;
        return this;
    }

    @NonNull
    public PolygonOptions strokeWidth(float f10) {
        this.zzc = f10;
        return this;
    }

    @NonNull
    public PolygonOptions visible(boolean z3) {
        this.zzg = z3;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, getPoints(), false);
        SafeParcelWriter.writeList(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeFloat(parcel, 4, getStrokeWidth());
        SafeParcelWriter.writeInt(parcel, 5, getStrokeColor());
        SafeParcelWriter.writeInt(parcel, 6, getFillColor());
        SafeParcelWriter.writeFloat(parcel, 7, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 8, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 9, isGeodesic());
        SafeParcelWriter.writeBoolean(parcel, 10, isClickable());
        SafeParcelWriter.writeInt(parcel, 11, getStrokeJointType());
        SafeParcelWriter.writeTypedList(parcel, 12, getStrokePattern(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public PolygonOptions zIndex(float f10) {
        this.zzf = f10;
        return this;
    }

    @NonNull
    public PolygonOptions add(@NonNull LatLng... latLngArr) {
        Preconditions.checkNotNull(latLngArr, "points must not be null.");
        this.zza.addAll(Arrays.asList(latLngArr));
        return this;
    }

    @SafeParcelable.Constructor
    public PolygonOptions(@SafeParcelable.Param(id = 2) List list, @SafeParcelable.Param(id = 3) List list2, @SafeParcelable.Param(id = 4) float f10, @SafeParcelable.Param(id = 5) int i7, @SafeParcelable.Param(id = 6) int i10, @SafeParcelable.Param(id = 7) float f11, @SafeParcelable.Param(id = 8) boolean z3, @SafeParcelable.Param(id = 9) boolean z8, @SafeParcelable.Param(id = 10) boolean z10, @SafeParcelable.Param(id = 11) int i11, @Nullable @SafeParcelable.Param(id = 12) List list3) {
        this.zza = list;
        this.zzb = list2;
        this.zzc = f10;
        this.zzd = i7;
        this.zze = i10;
        this.zzf = f11;
        this.zzg = z3;
        this.zzh = z8;
        this.zzi = z10;
        this.zzj = i11;
        this.zzk = list3;
    }
}
