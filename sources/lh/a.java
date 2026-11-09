package lh;

import android.os.IBinder;
import android.os.Parcel;
import com.adjust.sdk.Constants;
import com.google.common.primitives.SignedBytes;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements q999ggg99999qqggqqg9qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f39402a;

    public static String a(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 28);
            byte b10 = (byte) (bArr[0] ^ SignedBytes.MAX_POWER_OF_TWO);
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
        return this.f39402a;
    }

    @Override // q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String gqgg9q99qg9() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("2368662728737f2426616f28075a764c4949437e757370636662", KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP));
            if (!this.f39402a.transact(4, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f39403a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final boolean q999ggg99999qqggqqg9qg() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("234f41000f5458030146480f207d516b6e6e6459525457444145", 95));
            if (!this.f39402a.transact(1, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f39403a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final void qg9gqgqqggg9q9qg() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("23616f2e217a762d2f6866210e537f4540404a777c7a796a6f6b", 113));
            if (!this.f39402a.transact(6, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f39403a;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final boolean qgq9qg99() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("23767839366d613a387f71361944685257575d606b6d6e7d787c", 102));
            if (!this.f39402a.transact(2, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f39403a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String qgqq999g() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("23303e7f702b277c7e3937705f022e1411111b262d2b283b3e3a", 32));
            if (!this.f39402a.transact(5, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f39403a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg
    public final String qqggggg9g9q99q9gq() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a("23666829267d712a286f61260954784247474d707b7d7e6d686c", 118));
            if (!this.f39402a.transact(3, parcelObtain, parcelObtain2, 0)) {
                int i7 = b.f39403a;
            }
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
