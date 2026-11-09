package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Bundle bundleCreateBundle = null;
        String strCreateString = null;
        boolean z3 = false;
        long j6 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                j6 = SafeParcelReader.readLong(parcel, header);
            } else if (fieldId == 2) {
                j10 = SafeParcelReader.readLong(parcel, header);
            } else if (fieldId == 3) {
                z3 = SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId == 7) {
                bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
            } else if (fieldId != 8) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                strCreateString = SafeParcelReader.createString(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzdb(j6, j10, z3, bundleCreateBundle, strCreateString);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzdb[i7];
    }
}
