package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzad implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        StampStyle stampStyle = null;
        int i7 = 0;
        int i10 = 0;
        boolean z3 = false;
        float f10 = 0.0f;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                f10 = SafeParcelReader.readFloat(parcel, header);
            } else if (fieldId == 3) {
                i7 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 4) {
                i10 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 5) {
                z3 = SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId != 6) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                stampStyle = (StampStyle) SafeParcelReader.createParcelable(parcel, header, StampStyle.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new StrokeStyle(f10, i7, i10, z3, stampStyle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new StrokeStyle[i7];
    }
}
