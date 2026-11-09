package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzai implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        zzpl zzplVar = null;
        String strCreateString3 = null;
        zzbh zzbhVar = null;
        zzbh zzbhVar2 = null;
        zzbh zzbhVar3 = null;
        long j6 = 0;
        long j10 = 0;
        long j11 = 0;
        boolean z3 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    zzplVar = (zzpl) SafeParcelReader.createParcelable(parcel, header, zzpl.CREATOR);
                    break;
                case 5:
                    j6 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 6:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    zzbhVar = (zzbh) SafeParcelReader.createParcelable(parcel, header, zzbh.CREATOR);
                    break;
                case 9:
                    j10 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 10:
                    zzbhVar2 = (zzbh) SafeParcelReader.createParcelable(parcel, header, zzbh.CREATOR);
                    break;
                case 11:
                    j11 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 12:
                    zzbhVar3 = (zzbh) SafeParcelReader.createParcelable(parcel, header, zzbh.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzah(strCreateString, strCreateString2, zzplVar, j6, z3, strCreateString3, zzbhVar, j10, zzbhVar2, j11, zzbhVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzah[i7];
    }
}
