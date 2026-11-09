package fh;

import android.os.IBinder;
import android.os.Parcel;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.bean.HomeDialogState;
import q999ggg99999qqggqqg9qg.gqg99q9q9q.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements q999ggg99999qqggqqg9qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f36800a;

    public static String a(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 31);
            byte b10 = (byte) (bArr[0] ^ 100);
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
        return this.f36800a;
    }

    @Override // q999ggg99999qqggqqg9qg.gqg99q9q9q.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String q999ggg99999qqggqqg9qg() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("074d4302154e5d060b40525e4b474d4c565756455e4b470a264c60525e4b474d4c6c665b505655464347", 94));
            if (!this.f36800a.transact(1, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f36801a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.gqg99q9q9q.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String qgq9qg99() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("075759180f54471c115a4844515d57564c4d4c5f44515d103c567a4844515d5756767c414a4c4f5c595d", 68));
            if (!this.f36800a.transact(2, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f36801a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.gqg99q9q9q.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final boolean qqggggg9g9q99q9gq() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("077d7332257e6d363b70626e7b777d7c666766756e7b773a167c50626e7b777d7c5c566b606665767377", HomeDialogState.PRIORITY_HIGHEST));
            if (!this.f36800a.transact(3, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f36801a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.gqg99q9q9q.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String q999ggg99999qqggqqg9qg(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("075f5110075c4f141952404c59555f5e444544574c595518345e72404c59555f5e7e7449424447545155", 76));
            parcelObtain.writeString(str);
            if (!this.f36800a.transact(4, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f36801a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.gqg99q9q9q.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String qgq9qg99(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("07494706114a59020f44565a4f434948525352415a4f430e224864565a4f43494868625f545251424743", 90));
            parcelObtain.writeString(str);
            if (!this.f36800a.transact(5, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f36801a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
