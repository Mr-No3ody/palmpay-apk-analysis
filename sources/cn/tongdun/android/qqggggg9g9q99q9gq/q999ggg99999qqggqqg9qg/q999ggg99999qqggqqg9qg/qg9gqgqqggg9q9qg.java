package cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.adjust.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public interface qg9gqgqqggg9q9qg extends IInterface {

    public static abstract class q999ggg99999qqggqqg9qg extends Binder implements qg9gqgqqggg9q9qg {

        /* JADX INFO: renamed from: cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qg9gqgqqggg9q9qg$q999ggg99999qqggqqg9qg$q999ggg99999qqggqqg9qg, reason: collision with other inner class name */
        public static class C0013q999ggg99999qqggqqg9qg implements qg9gqgqqggg9q9qg {

            /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
            private IBinder f19244q999ggg99999qqggqqg9qg;

            public C0013q999ggg99999qqggqqg9qg(IBinder iBinder) {
                this.f19244q999ggg99999qqggqqg9qg = iBinder;
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
                    byte b7 = (byte) (bArr[0] ^ 122);
                    bArr[0] = b7;
                    for (int i12 = 1; i12 < length; i12++) {
                        b7 = (byte) ((b7 ^ bArr[i12]) ^ 30);
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
                return this.f19244q999ggg99999qqggqqg9qg;
            }

            public final String q999ggg99999qqggqqg9qg(String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(q999ggg99999qqggqqg9qg("19121c5d581302130b0f405f010b151913547918210b153913", 124));
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.f19244q999ggg99999qqggqqg9qg.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static qg9gqgqqggg9q9qg q999ggg99999qqggqqg9qg(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(q999ggg99999qqggqqg9qg("194b4504014a5b4a5256190658524c404a0d204178524c604a", 17));
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof qg9gqgqqggg9q9qg)) ? new C0013q999ggg99999qqggqqg9qg(iBinder) : (qg9gqgqqggg9q9qg) iInterfaceQueryLocalInterface;
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
                byte b7 = (byte) (bArr[0] ^ 122);
                bArr[0] = b7;
                for (int i12 = 1; i12 < length; i12++) {
                    b7 = (byte) ((b7 ^ bArr[i12]) ^ 71);
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
