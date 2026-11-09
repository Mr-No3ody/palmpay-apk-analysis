package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.api.Service;
import com.transsnet.palmpay.core.config.BillBusinessType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j6 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        boolean z3 = false;
        int i7 = 0;
        boolean z8 = false;
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        String strCreateString = "";
        String strCreateString2 = strCreateString;
        String strCreateString3 = strCreateString2;
        String strCreateString4 = strCreateString3;
        String strCreateString5 = null;
        String strCreateString6 = null;
        String strCreateString7 = null;
        String strCreateString8 = null;
        String strCreateString9 = null;
        String strCreateString10 = null;
        Boolean booleanObject = null;
        ArrayList<String> arrayListCreateStringList = null;
        String strCreateString11 = null;
        String strCreateString12 = null;
        int i12 = 100;
        boolean z11 = true;
        boolean z12 = true;
        long j17 = -2147483648L;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString7 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    strCreateString8 = SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    j6 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 7:
                    j10 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 8:
                    strCreateString9 = SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    j17 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 12:
                    strCreateString10 = SafeParcelReader.createString(parcel, header);
                    break;
                case 13:
                case 17:
                case 19:
                case 20:
                case 24:
                case 33:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 14:
                    j11 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 15:
                    i7 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 16:
                    z12 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 18:
                    z8 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 21:
                    booleanObject = SafeParcelReader.readBooleanObject(parcel, header);
                    break;
                case 22:
                    j12 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 23:
                    arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 26:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 27:
                    strCreateString11 = SafeParcelReader.createString(parcel, header);
                    break;
                case 28:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 29:
                    j13 = SafeParcelReader.readLong(parcel, header);
                    break;
                case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                    i12 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 31:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 32:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 34:
                    j14 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 35:
                    strCreateString12 = SafeParcelReader.createString(parcel, header);
                    break;
                case 36:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 37:
                    j15 = SafeParcelReader.readLong(parcel, header);
                    break;
                case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 39:
                    j16 = SafeParcelReader.readLong(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzr(strCreateString5, strCreateString6, strCreateString7, strCreateString8, j6, j10, strCreateString9, z11, z3, j17, strCreateString10, j11, i7, z12, z8, booleanObject, j12, arrayListCreateStringList, strCreateString, strCreateString2, strCreateString11, z10, j13, i12, strCreateString3, i10, j14, strCreateString12, strCreateString4, j15, i11, j16);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzr[i7];
    }
}
