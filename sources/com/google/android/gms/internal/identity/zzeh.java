package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j6 = Long.MAX_VALUE;
        LocationRequest locationRequest = null;
        ArrayList arrayListCreateTypedList = null;
        String strCreateString = null;
        boolean z3 = false;
        boolean z8 = false;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                locationRequest = (LocationRequest) SafeParcelReader.createParcelable(parcel, header, LocationRequest.CREATOR);
            } else if (fieldId == 5) {
                arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, ClientIdentity.CREATOR);
            } else if (fieldId == 8) {
                z3 = SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId != 9) {
                switch (fieldId) {
                    case 11:
                        z10 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 12:
                        z11 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 13:
                        strCreateString = SafeParcelReader.createString(parcel, header);
                        break;
                    case 14:
                        j6 = SafeParcelReader.readLong(parcel, header);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel, header);
                        break;
                }
            } else {
                z8 = SafeParcelReader.readBoolean(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzeg(locationRequest, arrayListCreateTypedList, z3, z8, z10, z11, strCreateString, j6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzeg[i7];
    }
}
