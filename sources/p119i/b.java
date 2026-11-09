package p119i;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.os.IResultReceiver;
import android.support.v4.os.ResultReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Binder implements IResultReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f37392b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f37393a;

    public b(ResultReceiver resultReceiver) {
        this.f37393a = resultReceiver;
        attachInterface(this, IResultReceiver.f11980h);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        String str = IResultReceiver.f11980h;
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i7 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i7 != 1) {
            return super.onTransact(i7, parcel, parcel2, i10);
        }
        send(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // android.support.v4.os.IResultReceiver
    public final void send(int i7, Bundle bundle) {
        ResultReceiver resultReceiver = this.f37393a;
        resultReceiver.getClass();
        resultReceiver.getClass();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
