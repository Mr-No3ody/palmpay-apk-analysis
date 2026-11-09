package M8;

import C0.G;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.transsnet.palmpay.account.ILoginInfoInterface;
import com.transsnet.palmpay.account.LoginInfo;
import com.transsnet.palmpay.core.base.BaseApplication;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Binder implements ILoginInfoInterface {
    @Override // com.transsnet.palmpay.account.ILoginInfoInterface
    public final LoginInfo getLoginInfo() {
        if (!BaseApplication.hasLogin()) {
            return null;
        }
        String token = BaseApplication.get().getToken();
        String strK = G.k();
        String strA = G.A();
        String fullName = BaseApplication.get().getUser().getFullName();
        LoginInfo loginInfo = new LoginInfo();
        loginInfo.f25778a = token;
        loginInfo.f25779b = strK;
        loginInfo.f25780c = strA;
        loginInfo.f25781d = fullName;
        return loginInfo;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface(ILoginInfoInterface.DESCRIPTOR);
        }
        if (i7 == 1598968902) {
            parcel2.writeString(ILoginInfoInterface.DESCRIPTOR);
            return true;
        }
        if (i7 != 1) {
            return super.onTransact(i7, parcel, parcel2, i10);
        }
        LoginInfo loginInfo = getLoginInfo();
        parcel2.writeNoException();
        if (loginInfo != null) {
            parcel2.writeInt(1);
            loginInfo.writeToParcel(parcel2, 1);
        } else {
            parcel2.writeInt(0);
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
