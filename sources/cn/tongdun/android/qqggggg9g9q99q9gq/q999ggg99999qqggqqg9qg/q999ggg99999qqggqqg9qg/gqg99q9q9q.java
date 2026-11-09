package cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes.dex */
public interface gqg99q9q9q extends IInterface {

    public static abstract class q999ggg99999qqggqqg9qg extends Binder implements gqg99q9q9q {

        /* JADX INFO: renamed from: cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gqg99q9q9q$q999ggg99999qqggqqg9qg$q999ggg99999qqggqqg9qg, reason: collision with other inner class name */
        public static class C0012q999ggg99999qqggqqg9qg implements gqg99q9q9q {

            /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
            private IBinder f19242q999ggg99999qqggqqg9qg;

            public C0012q999ggg99999qqggqqg9qg(IBinder iBinder) {
                this.f19242q999ggg99999qqggqqg9qg = iBinder;
            }

            private static String q999ggg99999qqggqqg9qg(String str, int i7) {
                try {
                    int length = str.length() / 2;
                    char[] charArray = str.toCharArray();
                    byte[] bArr = new byte[length];
                    for (int i10 = 0; i10 < length; i10++) {
                        int i11 = i10 << 1;
                        bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
                    }
                    byte b7 = (byte) (bArr[0] ^ 1);
                    bArr[0] = b7;
                    for (int i12 = 1; i12 < length; i12++) {
                        b7 = (byte) ((b7 ^ bArr[i12]) ^ 83);
                        bArr[i12] = b7;
                    }
                    return new String(bArr, Constants.ENCODING);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return "";
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f19242q999ggg99999qqggqqg9qg;
            }

            public final String q999ggg99999qqggqqg9qg(String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(q999ggg99999qqggqqg9qg("625f5110124c4f4a550e0e54435e5e19344974437e5e", 31));
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.f19242q999ggg99999qqggqqg9qg.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static gqg99q9q9q q999ggg99999qqggqqg9qg(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(q999ggg99999qqggqqg9qg("6d7d7332306e6d68772c2c76617c7c3b166b56615c7c", 106));
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof gqg99q9q9q)) ? new C0012q999ggg99999qqggqqg9qg(iBinder) : (gqg99q9q9q) iInterfaceQueryLocalInterface;
        }

        private static String q999ggg99999qqggqqg9qg(String str, int i7) {
            try {
                int length = str.length() / 2;
                char[] charArray = str.toCharArray();
                byte[] bArr = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 << 1;
                    bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
                }
                byte b7 = (byte) (bArr[0] ^ Ascii.SO);
                bArr[0] = b7;
                for (int i12 = 1; i12 < length; i12++) {
                    b7 = (byte) ((b7 ^ bArr[i12]) ^ 113);
                    bArr[i12] = b7;
                }
                return new String(bArr, Constants.ENCODING);
            } catch (Exception e10) {
                e10.printStackTrace();
                return "";
            }
        }
    }
}
