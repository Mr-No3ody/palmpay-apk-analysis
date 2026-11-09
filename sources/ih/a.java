package ih;

import android.os.IBinder;
import android.os.Parcel;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import q999ggg99999qqggqqg9qg.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements q999ggg99999qqggqqg9qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f37626a;

    public static String a(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 9);
            byte b10 = (byte) (bArr[0] ^ 101);
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
        return this.f37626a;
    }

    @Override // q999ggg99999qqggqqg9qg.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String q999ggg99999qqggqqg9qg() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("06757b3a22637274632438666c7273786a66737f32367174713b18466c7253586a66737f5554787263647676756e584f6e7d66737f", HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR));
            if (!this.f37626a.transact(1, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f37627a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final boolean qgq9qg99() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("067d73322a6b7a7c6b2c306e647a7b70626e7b773a3e797c7933104e647a5b50626e7b775d5c707a6b6c7e7e7d66504766756e7b77", KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP));
            if (!this.f37626a.transact(2, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f37627a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
