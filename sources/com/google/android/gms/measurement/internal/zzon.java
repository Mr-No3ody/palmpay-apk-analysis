package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzon implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        byte[] bArrCreateByteArray = null;
        String strCreateString = null;
        Bundle bundleCreateBundle = null;
        String strCreateString2 = null;
        long j6 = 0;
        long j10 = 0;
        int i7 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    j6 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 2:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 3:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 5:
                    i7 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    j10 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 7:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzom(j6, bArrCreateByteArray, strCreateString, bundleCreateBundle, i7, j10, strCreateString2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzom[i7];
    }
}
