package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjp implements Parcelable.Creator {
    public static boolean zza(int i7) {
        return i7 == 0;
    }

    public static boolean zzb(Object obj) {
        return obj == null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z3 = false;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        String strCreateString = null;
        String strCreateString2 = null;
        byte[] bArrCreateByteArray = null;
        double d2 = 0.0d;
        long j6 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    j6 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 4:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 5:
                    d2 = SafeParcelReader.readDouble(parcel, header);
                    break;
                case 6:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 8:
                    i7 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 9:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 10:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzjo(strCreateString, j6, z3, d2, strCreateString2, bArrCreateByteArray, i7, i10, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzjo[i7];
    }
}
