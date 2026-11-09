package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "StringToIntConverterCreator")
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {

    @NonNull
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zad();

    @SafeParcelable.VersionField(id = 1)
    final int zaa;
    private final HashMap zab;
    private final SparseArray zac;

    @KeepForSdk
    public StringToIntConverter() {
        this.zaa = 1;
        this.zab = new HashMap();
        this.zac = new SparseArray();
    }

    @NonNull
    @KeepForSdk
    public StringToIntConverter add(@NonNull String str, int i7) {
        this.zab.put(str, Integer.valueOf(i7));
        this.zac.put(i7, str);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i7) {
        int i10 = this.zaa;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i10);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.zab;
        for (String str : map.keySet()) {
            arrayList.add(new zac(str, ((Integer) map.get(str)).intValue()));
        }
        SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int zaa() {
        return 7;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int zab() {
        return 0;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    @NonNull
    public final /* bridge */ /* synthetic */ Object zac(@NonNull Object obj) {
        String str = (String) this.zac.get(((Integer) obj).intValue());
        return (str == null && this.zab.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    @Nullable
    public final /* bridge */ /* synthetic */ Object zad(@NonNull Object obj) {
        HashMap map = this.zab;
        Integer num = (Integer) map.get((String) obj);
        return num == null ? (Integer) map.get("gms_unknown") : num;
    }

    @SafeParcelable.Constructor
    public StringToIntConverter(@SafeParcelable.Param(id = 1) int i7, @SafeParcelable.Param(id = 2) ArrayList arrayList) {
        this.zaa = i7;
        this.zab = new HashMap();
        this.zac = new SparseArray();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            zac zacVar = (zac) arrayList.get(i10);
            add(zacVar.zab, zacVar.zac);
        }
    }
}
