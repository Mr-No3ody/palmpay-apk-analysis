package p089g;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.app.INotificationSideChannel;

/* JADX INFO: loaded from: classes.dex */
public final class a implements INotificationSideChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f36803a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f36803a;
    }

    @Override // android.support.v4.app.INotificationSideChannel
    public final void cancel(String str, int i7, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(INotificationSideChannel.f11979g);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i7);
            parcelObtain.writeString(str2);
            this.f36803a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.app.INotificationSideChannel
    public final void cancelAll(String str) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(INotificationSideChannel.f11979g);
            parcelObtain.writeString(str);
            this.f36803a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.app.INotificationSideChannel
    public final void notify(String str, int i7, String str2, Notification notification) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(INotificationSideChannel.f11979g);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i7);
            parcelObtain.writeString(str2);
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f36803a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
