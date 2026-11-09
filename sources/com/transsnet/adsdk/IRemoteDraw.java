package com.transsnet.adsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public interface IRemoteDraw extends IInterface {
    public static final String DESCRIPTOR = "com.transsnet.adsdk.IRemoteDraw";

    public static class Default implements IRemoteDraw {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.transsnet.adsdk.IRemoteDraw
        public boolean dispatchTouchEvent(MotionEvent event) throws RemoteException {
            return false;
        }

        @Override // com.transsnet.adsdk.IRemoteDraw
        public void release() throws RemoteException {
        }

        @Override // com.transsnet.adsdk.IRemoteDraw
        public void setSurface(Surface surface, int width, int height) throws RemoteException {
        }

        @Override // com.transsnet.adsdk.IRemoteDraw
        public void setWebUrl(String url) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IRemoteDraw {
        static final int TRANSACTION_dispatchTouchEvent = 3;
        static final int TRANSACTION_release = 4;
        static final int TRANSACTION_setSurface = 1;
        static final int TRANSACTION_setWebUrl = 2;

        public Stub() {
            attachInterface(this, IRemoteDraw.DESCRIPTOR);
        }

        public static IRemoteDraw asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface(IRemoteDraw.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IRemoteDraw)) {
                return (IRemoteDraw) iInterfaceQueryLocalInterface;
            }
            f fVar = new f();
            fVar.f25574a = obj;
            return fVar;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface(IRemoteDraw.DESCRIPTOR);
            }
            if (i7 == 1598968902) {
                parcel2.writeString(IRemoteDraw.DESCRIPTOR);
                return true;
            }
            if (i7 == 1) {
                setSurface((Surface) _Parcel.readTypedObject(parcel, Surface.CREATOR), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
            } else if (i7 == 2) {
                setWebUrl(parcel.readString());
                parcel2.writeNoException();
            } else if (i7 == 3) {
                boolean zDispatchTouchEvent = dispatchTouchEvent((MotionEvent) _Parcel.readTypedObject(parcel, MotionEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zDispatchTouchEvent ? 1 : 0);
            } else {
                if (i7 != 4) {
                    return super.onTransact(i7, parcel, parcel2, i10);
                }
                release();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> c6) {
            if (parcel.readInt() != 0) {
                return c6.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T value, int parcelableFlags) {
            if (value == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                value.writeToParcel(parcel, parcelableFlags);
            }
        }
    }

    boolean dispatchTouchEvent(MotionEvent event) throws RemoteException;

    void release() throws RemoteException;

    void setSurface(Surface surface, int width, int height) throws RemoteException;

    void setWebUrl(String url) throws RemoteException;
}
