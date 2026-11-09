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
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "PolylineOptionsCreator")
@SafeParcelable.Reserved({1})
public final class PolylineOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new zzu();

    @SafeParcelable.Field(getter = "getPoints", id = 2)
    private final List zza;

    @SafeParcelable.Field(getter = "getWidth", id = 3)
    private float zzb;

    @SafeParcelable.Field(getter = "getColor", id = 4)
    private int zzc;

    @SafeParcelable.Field(getter = "getZIndex", id = 5)
    private float zzd;

    @SafeParcelable.Field(getter = "isVisible", id = 6)
    private boolean zze;

    @SafeParcelable.Field(getter = "isGeodesic", id = 7)
    private boolean zzf;

    @SafeParcelable.Field(getter = "isClickable", id = 8)
    private boolean zzg;

    @SafeParcelable.Field(getter = "getStartCap", id = 9)
    private Cap zzh;

    @SafeParcelable.Field(getter = "getEndCap", id = 10)
    private Cap zzi;

    @SafeParcelable.Field(getter = "getJointType", id = 11)
    private int zzj;

    @Nullable
    @SafeParcelable.Field(getter = "getPattern", id = 12)
    private List zzk;

    @SafeParcelable.Field(getter = "getSpans", id = 13)
    private List zzl;

    public PolylineOptions() {
        this.zzb = 10.0f;
        this.zzc = -16777216;
        this.zzd = 0.0f;
        this.zze = true;
        this.zzf = false;
        this.zzg = false;
        this.zzh = new ButtCap();
        this.zzi = new ButtCap();
        this.zzj = 0;
        this.zzk = null;
        this.zzl = new ArrayList();
        this.zza = new ArrayList();
    }

    @NonNull
    public PolylineOptions add(@NonNull LatLng latLng) {
        Preconditions.checkNotNull(this.zza, "point must not be null.");
        this.zza.add(latLng);
        return this;
    }

    @NonNull
    public PolylineOptions addAll(@NonNull Iterable<LatLng> iterable) {
        Preconditions.checkNotNull(iterable, "points must not be null.");
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.zza.add(it.next());
        }
        return this;
    }

    @NonNull
    public PolylineOptions addAllSpans(@NonNull Iterable<StyleSpan> iterable) {
        Iterator<StyleSpan> it = iterable.iterator();
        while (it.hasNext()) {
            addSpan(it.next());
        }
        return this;
    }

    @NonNull
    public PolylineOptions addSpan(@NonNull StyleSpan styleSpan) {
        this.zzl.add(styleSpan);
        return this;
    }

    @NonNull
    public PolylineOptions clickable(boolean z3) {
        this.zzg = z3;
        return this;
    }

    @NonNull
    public PolylineOptions color(int i7) {
        this.zzc = i7;
        return this;
    }

    @NonNull
    public PolylineOptions endCap(@NonNull Cap cap) {
        this.zzi = (Cap) Preconditions.checkNotNull(cap, "endCap must not be null");
        return this;
    }

    @NonNull
    public PolylineOptions geodesic(boolean z3) {
        this.zzf = z3;
        return this;
    }

    public int getColor() {
        return this.zzc;
    }

    @NonNull
    public Cap getEndCap() {
        return this.zzi.zza();
    }

    public int getJointType() {
        return this.zzj;
    }

    @Nullable
    public List<PatternItem> getPattern() {
        return this.zzk;
    }

    @NonNull
    public List<LatLng> getPoints() {
        return this.zza;
    }

    @NonNull
    public Cap getStartCap() {
        return this.zzh.zza();
    }

    public float getWidth() {
        return this.zzb;
    }

    public float getZIndex() {
        return this.zzd;
    }

    public boolean isClickable() {
        return this.zzg;
    }

    public boolean isGeodesic() {
        return this.zzf;
    }

    public boolean isVisible() {
        return this.zze;
    }

    @NonNull
    public PolylineOptions jointType(int i7) {
        this.zzj = i7;
        return this;
    }

    @NonNull
    public PolylineOptions pattern(@Nullable List<PatternItem> list) {
        this.zzk = list;
        return this;
    }

    @NonNull
    public PolylineOptions startCap(@NonNull Cap cap) {
        this.zzh = (Cap) Preconditions.checkNotNull(cap, "startCap must not be null");
        return this;
    }

    @NonNull
    public PolylineOptions visible(boolean z3) {
        this.zze = z3;
        return this;
    }

    @NonNull
    public PolylineOptions width(float f10) {
        this.zzb = f10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i7) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, getPoints(), false);
        SafeParcelWriter.writeFloat(parcel, 3, getWidth());
        SafeParcelWriter.writeInt(parcel, 4, getColor());
        SafeParcelWriter.writeFloat(parcel, 5, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 6, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 7, isGeodesic());
        SafeParcelWriter.writeBoolean(parcel, 8, isClickable());
        SafeParcelWriter.writeParcelable(parcel, 9, getStartCap(), i7, false);
        SafeParcelWriter.writeParcelable(parcel, 10, getEndCap(), i7, false);
        SafeParcelWriter.writeInt(parcel, 11, getJointType());
        SafeParcelWriter.writeTypedList(parcel, 12, getPattern(), false);
        ArrayList arrayList = new ArrayList(this.zzl.size());
        for (StyleSpan styleSpan : this.zzl) {
            StrokeStyle.Builder builder = new StrokeStyle.Builder(styleSpan.getStyle());
            builder.zzd(this.zzb);
            builder.zzc(this.zze);
            arrayList.add(new StyleSpan(builder.build(), styleSpan.getSegments()));
        }
        SafeParcelWriter.writeTypedList(parcel, 13, arrayList, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public PolylineOptions zIndex(float f10) {
        this.zzd = f10;
        return this;
    }

    @NonNull
    public PolylineOptions addSpan(@NonNull StyleSpan... styleSpanArr) {
        for (StyleSpan styleSpan : styleSpanArr) {
            addSpan(styleSpan);
        }
        return this;
    }

    @NonNull
    public PolylineOptions add(@NonNull LatLng... latLngArr) {
        Preconditions.checkNotNull(latLngArr, "points must not be null.");
        Collections.addAll(this.zza, latLngArr);
        return this;
    }

    @SafeParcelable.Constructor
    public PolylineOptions(@SafeParcelable.Param(id = 2) List list, @SafeParcelable.Param(id = 3) float f10, @SafeParcelable.Param(id = 4) int i7, @SafeParcelable.Param(id = 5) float f11, @SafeParcelable.Param(id = 6) boolean z3, @SafeParcelable.Param(id = 7) boolean z8, @SafeParcelable.Param(id = 8) boolean z10, @Nullable @SafeParcelable.Param(id = 9) Cap cap, @Nullable @SafeParcelable.Param(id = 10) Cap cap2, @SafeParcelable.Param(id = 11) int i10, @Nullable @SafeParcelable.Param(id = 12) List list2, @Nullable @SafeParcelable.Param(id = 13) List list3) {
        this.zzb = 10.0f;
        this.zzc = -16777216;
        this.zzd = 0.0f;
        this.zze = true;
        this.zzf = false;
        this.zzg = false;
        this.zzh = new ButtCap();
        this.zzi = new ButtCap();
        this.zzj = 0;
        this.zzk = null;
        this.zzl = new ArrayList();
        this.zza = list;
        this.zzb = f10;
        this.zzc = i7;
        this.zzd = f11;
        this.zze = z3;
        this.zzf = z8;
        this.zzg = z10;
        if (cap != null) {
            this.zzh = cap;
        }
        if (cap2 != null) {
            this.zzi = cap2;
        }
        this.zzj = i10;
        this.zzk = list2;
        if (list3 != null) {
            this.zzl = list3;
        }
    }
}
