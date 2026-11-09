package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzel implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i7 = -1;
        int i10 = 0;
        short s3 = 0;
        int i11 = 0;
        long j6 = 0;
        float f10 = 0.0f;
        double d2 = 0.0d;
        double d10 = 0.0d;
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 2:
                    j6 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 3:
                    s3 = SafeParcelReader.readShort(parcel, header);
                    break;
                case 4:
                    d2 = SafeParcelReader.readDouble(parcel, header);
                    break;
                case 5:
                    d10 = SafeParcelReader.readDouble(parcel, header);
                    break;
                case 6:
                    f10 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 7:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 8:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 9:
                    i7 = SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzek(strCreateString, i10, s3, d2, d10, f10, j6, i11, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzek[i7];
    }
}
