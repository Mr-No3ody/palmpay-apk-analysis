package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.identity.ClientIdentity;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        WorkSource workSource = new WorkSource();
        ClientIdentity clientIdentity = null;
        boolean z3 = false;
        int i7 = 0;
        int i10 = 0;
        boolean z8 = false;
        long j6 = -1;
        float f10 = 0.0f;
        int i11 = Integer.MAX_VALUE;
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        long j12 = 0;
        long j13 = 600000;
        long j14 = 3600000;
        int i12 = 102;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i12 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    j14 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 3:
                    j13 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 4:
                case 14:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 5:
                    j10 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 6:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 7:
                    f10 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 8:
                    j12 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 9:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    j11 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 11:
                    j6 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 12:
                    i7 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 13:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 15:
                    z8 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 16:
                    workSource = (WorkSource) SafeParcelReader.createParcelable(parcel, header, WorkSource.CREATOR);
                    break;
                case 17:
                    clientIdentity = (ClientIdentity) SafeParcelReader.createParcelable(parcel, header, ClientIdentity.CREATOR);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new LocationRequest(i12, j14, j13, j12, j10, j11, i11, f10, z3, j6, i7, i10, z8, workSource, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new LocationRequest[i7];
    }
}
