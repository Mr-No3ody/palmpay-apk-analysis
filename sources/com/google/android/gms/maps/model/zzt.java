package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayList = new ArrayList();
        float f10 = 0.0f;
        ArrayList arrayListCreateTypedList = null;
        int i7 = 0;
        int i10 = 0;
        boolean z3 = false;
        boolean z8 = false;
        boolean z10 = false;
        int i11 = 0;
        float f11 = 0.0f;
        ArrayList arrayListCreateTypedList2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    arrayListCreateTypedList2 = SafeParcelReader.createTypedList(parcel, header, LatLng.CREATOR);
                    break;
                case 3:
                    SafeParcelReader.readList(parcel, header, arrayList, zzt.class.getClassLoader());
                    break;
                case 4:
                    f10 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 5:
                    i7 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 7:
                    f11 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 8:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    z8 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 12:
                    arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new PolygonOptions(arrayListCreateTypedList2, arrayList, f10, i7, i10, f11, z3, z8, z10, i11, arrayListCreateTypedList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new PolygonOptions[i7];
    }
}
