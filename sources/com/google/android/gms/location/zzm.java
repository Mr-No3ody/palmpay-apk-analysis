package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        byte b7 = 0;
        long j6 = 0;
        float[] fArrCreateFloatArray = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                switch (fieldId) {
                    case 4:
                        f10 = SafeParcelReader.readFloat(parcel, header);
                        break;
                    case 5:
                        f11 = SafeParcelReader.readFloat(parcel, header);
                        break;
                    case 6:
                        j6 = SafeParcelReader.readLong(parcel, header);
                        break;
                    case 7:
                        b7 = SafeParcelReader.readByte(parcel, header);
                        break;
                    case 8:
                        f12 = SafeParcelReader.readFloat(parcel, header);
                        break;
                    case 9:
                        f13 = SafeParcelReader.readFloat(parcel, header);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel, header);
                        break;
                }
            } else {
                fArrCreateFloatArray = SafeParcelReader.createFloatArray(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new DeviceOrientation(fArrCreateFloatArray, f10, f11, j6, b7, f12, f13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new DeviceOrientation[i7];
    }
}
