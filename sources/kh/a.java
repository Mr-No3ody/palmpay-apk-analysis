package kh;

import android.os.IBinder;
import android.os.Parcel;
import com.adjust.sdk.Constants;
import q999ggg99999qqggqqg9qg.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements q999ggg99999qqggqqg9qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f38889a;

    public static String a(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 24);
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
        return this.f38889a;
    }

    @Override // q999ggg99999qqggqqg9qg.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String q999ggg99999qqggqqg9qg() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("396866273976687a627f6d2d2b6b6e727962692e2e65777b6e626869737273607b6e622f036945777b6e624849535273607b6e62", 124));
            if (!this.f38889a.transact(1, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f38890a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String qgq9qg99(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("390e00415f100e1c04190b4b4d0d08141f040f484803111d08040e0f151415061d080449650f23111d08042e2f353415061d0804", 26));
            parcelObtain.writeString(str);
            if (!this.f38889a.transact(3, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f38890a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String q999ggg99999qqggqqg9qg(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("391d13524c031d0f170a18585e1e1b070c171c5b5b10020e1b171d1c060706150e1b175a761c30020e1b173d3c262706150e1b17", 9));
            parcelObtain.writeString(str);
            if (!this.f38889a.transact(2, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f38890a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
