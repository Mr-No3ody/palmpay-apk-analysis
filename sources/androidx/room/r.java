package androidx.room;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class r implements IMultiInstanceInvalidationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f17789a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f17789a;
    }

    @Override // androidx.room.IMultiInstanceInvalidationCallback
    public final void onInvalidation(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMultiInstanceInvalidationCallback.f17707i);
            parcelObtain.writeStringArray(strArr);
            this.f17789a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
