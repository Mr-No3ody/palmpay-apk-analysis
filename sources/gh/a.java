package gh;

import android.os.IBinder;
import android.os.Parcel;
import com.adjust.sdk.Constants;
import q999ggg99999qqggqqg9qg.gqgg9q99qg9.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements q999ggg99999qqggqqg9qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f37248a;

    public static String a(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 37);
            byte b10 = (byte) (bArr[0] ^ 90);
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
        return this.f37248a;
    }

    @Override // q999ggg99999qqggqqg9qg.gqgg9q99qg9.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String gqgg9q99qg9(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("392d23626c2d21223d30246b6b20323e2b272d2c362724213e3c277b462c00323e2b270d0c080d2e2e272336", 4));
            parcelObtain.writeString(str);
            if (!this.f37248a.transact(4, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f37249a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.gqgg9q99qg9.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String q999ggg99999qqggqqg9qg(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("391d13525c1d11120d00145b5b10020e1b171d1c061714110e0c174b761c30020e1b173d3c383d1e1e171306", 52));
            parcelObtain.writeString(str);
            if (!this.f37248a.transact(1, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f37249a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.gqgg9q99qg9.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String qgq9qg99() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("39343a7b7534383b24293d7272392b27323e34352f3e3d3827253e625f35192b27323e1415111437373e3a2f", 29));
            if (!this.f37248a.transact(6, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f37249a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.gqgg9q99qg9.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String qqggggg9g9q99q9gq(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("390c02434d0c00031c11054a4a01131f0a060c0d170605001f1d065a670d21131f0a062c2d292c0f0f060217", 37));
            parcelObtain.writeString(str);
            if (!this.f37248a.transact(3, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f37249a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.gqgg9q99qg9.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final boolean q999ggg99999qqggqqg9qg() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("39090746480905061914004f4f04161a0f030908120300051a18035f620824161a0f0329282c290a0a030712", 32));
            if (!this.f37248a.transact(5, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f37249a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.gqgg9q99qg9.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String qgq9qg99(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("392d23626c2d21223d30246b6b20323e2b272d2c362724213e3c277b462c00323e2b270d0c080d2e2e272336", 4));
            parcelObtain.writeString(str);
            if (!this.f37248a.transact(2, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f37249a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
