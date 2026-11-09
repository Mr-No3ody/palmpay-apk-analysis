package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        LatLng latLng = null;
        ArrayList arrayListCreateTypedList = null;
        int i7 = 0;
        int i10 = 0;
        boolean z3 = false;
        boolean z8 = false;
        float f10 = 0.0f;
        float f11 = 0.0f;
        double d2 = 0.0d;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.createParcelable(parcel, header, LatLng.CREATOR);
                    break;
                case 3:
                    d2 = SafeParcelReader.readDouble(parcel, header);
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
                    arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new CircleOptions(latLng, d2, f10, i7, i10, f11, z3, z8, arrayListCreateTypedList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new CircleOptions[i7];
    }
}
