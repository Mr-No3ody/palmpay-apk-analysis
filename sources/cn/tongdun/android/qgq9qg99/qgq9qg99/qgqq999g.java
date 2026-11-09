package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class qgqq999g {

    public static class q999ggg99999qqggqqg9qg implements ServiceConnection {

        /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
        private boolean f19201q999ggg99999qqggqqg9qg;
        private LinkedBlockingQueue qgq9qg99;

        private q999ggg99999qqggqqg9qg() {
            this.f19201q999ggg99999qqggqqg9qg = false;
            this.qgq9qg99 = new LinkedBlockingQueue(1);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.qgq9qg99.put(iBinder);
            } catch (Exception unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        public final IBinder q999ggg99999qqggqqg9qg() {
            if (this.f19201q999ggg99999qqggqqg9qg) {
                return null;
            }
            this.f19201q999ggg99999qqggqqg9qg = true;
            try {
                return (IBinder) this.qgq9qg99.take();
            } catch (Exception unused) {
                return null;
            }
        }

        public /* synthetic */ q999ggg99999qqggqqg9qg(byte b7) {
            this();
        }
    }

    public static class qgq9qg99 implements IInterface {

        /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
        private final IBinder f19202q999ggg99999qqggqqg9qg;

        public qgq9qg99(IBinder iBinder) {
            this.f19202q999ggg99999qqggqqg9qg = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f19202q999ggg99999qqggqqg9qg;
        }

        public final String q999ggg99999qqggqqg9qg() {
            if (this.f19202q999ggg99999qqggqqg9qg == null) {
                return "";
            }
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(q999ggg99999qqggqqg9qg("4e46480903424a424143010545405c574c470003405417054f5d170d474b4150574545465d160d4d505b5d564547082d426f58595d4c5750504d4364677d7c5d4e55404c", 43));
                this.f19202q999ggg99999qqggqqg9qg.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                String string = parcelObtain2.readString();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return string;
            } catch (Throwable unused) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return "";
            }
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
                byte b7 = (byte) (i7 ^ 97);
                byte b10 = (byte) (bArr[0] ^ 45);
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

        public final boolean q999ggg99999qqggqqg9qg(boolean z3) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(q999ggg99999qqggqqg9qg("4e343a7b713038303331737737322e253e357271322665773d2f657f35393322253737342f647f3f22292f2437357a5f301d2a2b2f3e2522223f3116150f0e2f3c27323e", 89));
                parcelObtain.writeInt(1);
                this.f19202q999ggg99999qqggqqg9qg.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                boolean z8 = parcelObtain2.readInt() != 0;
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return z8;
            } catch (Throwable unused) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return false;
            }
        }
    }

    static {
        q999ggg99999qqggqqg9qg("0d57591812535b535052101454514d465d561112514506145e4c061c565a5041465454574c071c5c414a4c475456193c537e49484c5d4641415c5275766c6d4c5f44515d", HomeDialogState.PRIORITY_HIGHEST_111);
        q999ggg99999qqggqqg9qg("5e6a6a6a6a6a6a6a77776a6a6a77776a6a6a77776a6a6a77776a6a6a6a6a6a6a6a6a6a6a", 94);
    }

    public static String q999ggg99999qqggqqg9qg(Context context) {
        if (context != null && Looper.getMainLooper() != Looper.myLooper()) {
            if (!cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99q9ggqg9gqgq9.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("0d232d6c66272f27242664602025393229226566253172713a38302b352f35292e6f402a343922", 27))) {
                return q999ggg99999qqggqqg9qg("5e020202020202021f1f0202021f1f0202021f1f0202021f1f0202020202020202020202", 54);
            }
            q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar = new q999ggg99999qqggqqg9qg((byte) 0);
            try {
                Intent intent = new Intent(q999ggg99999qqggqqg9qg("0d626c2d27666e66656725216164787368632427647033216b793329636f65747361616279323378796a7164682513697b7d68", 90));
                intent.setPackage(q999ggg99999qqggqqg9qg("0d757b3a307179717270323676736f647f7433307367", 77));
                if (context.bindService(intent, q999ggg99999qqggqqg9qgVar, 1)) {
                    qgq9qg99 qgq9qg99Var = new qgq9qg99(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg());
                    if (qgq9qg99Var.q999ggg99999qqggqqg9qg(true)) {
                        String strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("5e4444444444444459594444445959444444595944444459594444444444444444444444", HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR);
                        try {
                            context.unbindService(q999ggg99999qqggqqg9qgVar);
                        } catch (Throwable unused) {
                        }
                        return strQ999ggg99999qqggqqg9qg;
                    }
                    String strQ999ggg99999qqggqqg9qg2 = qgq9qg99Var.q999ggg99999qqggqqg9qg();
                    try {
                        context.unbindService(q999ggg99999qqggqqg9qgVar);
                    } catch (Throwable unused2) {
                    }
                    return strQ999ggg99999qqggqqg9qg2;
                }
            } catch (Throwable unused3) {
            }
            try {
                context.unbindService(q999ggg99999qqggqqg9qgVar);
            } catch (Throwable unused4) {
            }
        }
        return "";
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
            byte b7 = (byte) (i7 ^ 52);
            byte b10 = (byte) (bArr[0] ^ 110);
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
}
