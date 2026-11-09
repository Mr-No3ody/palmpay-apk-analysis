package hh;

import android.os.IBinder;
import android.os.Parcel;
import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements q999ggg99999qqggqqg9qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f37389a;

    public static String a(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 117);
            byte b10 = (byte) (bArr[0] ^ Ascii.SO);
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
        return this.f37389a;
    }

    @Override // q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String q999ggg99999qqggqqg9qg(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("6d232d6c6020253932292265623e382b3a3432734802380f092a2f332a2338", 90));
            parcelObtain.writeString(str);
            if (!this.f37389a.transact(2, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f37390a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String qgq9qg99() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("6d2a246569292c303b202b6c6b373122333d3b7a410b31060023263a232a31", 83));
            if (!this.f37389a.transact(3, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f37390a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String qqggggg9g9q99q9gq() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("6d646a2b2767627e756e652225797f6c7d7375340f457f484e6d68746d647f", 29));
            if (!this.f37389a.transact(4, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f37390a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final boolean q999ggg99999qqggqqg9qg() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("6d0e00414d0d08141f040f484f13150617191f5e652f15222407021e070e15", 119));
            if (!this.f37389a.transact(1, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f37390a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String qgq9qg99(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("6d555b1a1656534f445f541314484e5d4c4244053e744e797f5c59455c554e", 44));
            parcelObtain.writeString(str);
            if (!this.f37389a.transact(5, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f37390a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
