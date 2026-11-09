package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbi implements Parcelable.Creator {
    public static void zza(zzbh zzbhVar, Parcel parcel, int i7) {
        String str = zzbhVar.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeParcelable(parcel, 3, zzbhVar.zzb, i7, false);
        SafeParcelWriter.writeString(parcel, 4, zzbhVar.zzc, false);
        SafeParcelWriter.writeLong(parcel, 5, zzbhVar.zzd);
        SafeParcelWriter.writeLong(parcel, 6, zzbhVar.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j6 = 0;
        long j10 = 0;
        String strCreateString = null;
        zzbf zzbfVar = null;
        String strCreateString2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                strCreateString = SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 3) {
                zzbfVar = (zzbf) SafeParcelReader.createParcelable(parcel, header, zzbf.CREATOR);
            } else if (fieldId == 4) {
                strCreateString2 = SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 5) {
                j6 = SafeParcelReader.readLong(parcel, header);
            } else if (fieldId != 6) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                j10 = SafeParcelReader.readLong(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzbh(strCreateString, zzbfVar, strCreateString2, j6, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbh[i7];
    }
}
