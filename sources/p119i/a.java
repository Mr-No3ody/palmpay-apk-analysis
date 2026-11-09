package p119i;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.os.IResultReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class a implements IResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f37391a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f37391a;
    }

    @Override // android.support.v4.os.IResultReceiver
    public final void send(int i7, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IResultReceiver.f11980h);
            parcelObtain.writeInt(i7);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f37391a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
