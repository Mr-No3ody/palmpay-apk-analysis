package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzao implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z3 = false;
        int i16 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i7 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    i12 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    i13 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 7:
                    i15 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 8:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    i16 = SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new SleepClassifyEvent(i7, i10, i11, i12, i13, i14, i15, z3, i16);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new SleepClassifyEvent[i7];
    }
}
