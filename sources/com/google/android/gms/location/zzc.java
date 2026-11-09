package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        WorkSource workSource = null;
        String strCreateString = null;
        int[] iArrCreateIntArray = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        long j6 = 0;
        long j10 = 0;
        boolean z3 = false;
        boolean z8 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    j6 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 2:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 3:
                    workSource = (WorkSource) SafeParcelReader.createParcelable(parcel, header, WorkSource.CREATOR);
                    break;
                case 4:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    iArrCreateIntArray = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 6:
                    z8 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    j10 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 9:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzb(j6, z3, workSource, strCreateString, iArrCreateIntArray, z8, strCreateString2, j10, strCreateString3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzb[i7];
    }
}
