package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z3 = false;
        boolean z8 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        String strCreateString = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 2:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 3:
                    z8 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 4:
                    iBinder = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 5:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 6:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 8:
                    z12 = SafeParcelReader.readBoolean(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzp(strCreateString, z3, z8, iBinder, z10, z11, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzp[i7];
    }
}
