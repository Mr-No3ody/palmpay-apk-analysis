package jh;

import android.os.IBinder;
import android.os.Parcel;
import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements q999ggg99999qqggqqg9qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f38602a;

    public static String a(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 22);
            byte b10 = (byte) (bArr[0] ^ Ascii.VT);
            bArr[0] = b10;
            for (int i12 = 1; i12 < length; i12++) {
                b10 = (byte) ((b10 ^ bArr[i12]) ^ b7);
                bArr[i12] = b10;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f38602a;
    }

    @Override // q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String gqgg9q99qg9() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("684846070b56424219075a560b39624144584d4c4c4f5e51574f7949492e23496949616c494c61635e555350434642", 82));
            if (!this.f38602a.transact(4, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f38603a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final boolean q999ggg99999qqggqqg9qg() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("687b7534386571712a346965380a5172776b7e7f7f7c6d62647c4a7a7a1d107a5a7a525f7a7f52506d666063707571", 97));
            if (!this.f38602a.transact(1, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f38603a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String qgq9qg99() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("686c62232f7266663d237e722f1d4665607c6968686b7a75736b5d6d6d0a076d4d6d45486d6845477a717774676266", 118));
            if (!this.f38602a.transact(2, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f38603a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String qgqq999g() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("68121c5d510c1818435d000c5163381b1e0217161615040b0d1523131374791333133b3613163b39040f090a191c18", 8));
            if (!this.f38602a.transact(5, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f38603a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String qqggggg9g9q99q9gq() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("684d43020e5347471c025f530e3c6744415d4849494a5b54524a7c4c4c2b264c6c4c64694c4964665b505655464347", 87));
            if (!this.f38602a.transact(3, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f38603a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
