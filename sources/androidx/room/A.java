package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class A extends Binder implements IMultiInstanceInvalidationService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f17681a;

    public A(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f17681a = multiInstanceInvalidationService;
        attachInterface(this, IMultiInstanceInvalidationService.f17708j);
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public final void broadcastInvalidation(int i7, String[] tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f17681a;
        synchronized (multiInstanceInvalidationService.f17728c) {
            try {
                String str = (String) multiInstanceInvalidationService.f17727b.get(Integer.valueOf(i7));
                if (str == null) {
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.f17728c.beginBroadcast();
                for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.f17728c.getBroadcastCookie(i10);
                        Intrinsics.f(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.f17727b.get(num);
                        if (i7 != iIntValue && str.equals(str2)) {
                            try {
                                ((IMultiInstanceInvalidationCallback) multiInstanceInvalidationService.f17728c.getBroadcastItem(i10)).onInvalidation(tables);
                            } catch (RemoteException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.f17728c.finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.f17728c.finishBroadcast();
                Unit unit = Unit.f38893a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        String str = IMultiInstanceInvalidationService.f17708j;
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i7 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback = null;
        IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback2 = null;
        if (i7 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(IMultiInstanceInvalidationCallback.f17707i);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMultiInstanceInvalidationCallback)) {
                    r rVar = new r();
                    rVar.f17789a = strongBinder;
                    iMultiInstanceInvalidationCallback = rVar;
                } else {
                    iMultiInstanceInvalidationCallback = (IMultiInstanceInvalidationCallback) iInterfaceQueryLocalInterface;
                }
            }
            int iRegisterCallback = registerCallback(iMultiInstanceInvalidationCallback, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iRegisterCallback);
            return true;
        }
        if (i7 != 2) {
            if (i7 != 3) {
                return super.onTransact(i7, parcel, parcel2, i10);
            }
            broadcastInvalidation(parcel.readInt(), parcel.createStringArray());
            return true;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(IMultiInstanceInvalidationCallback.f17707i);
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof IMultiInstanceInvalidationCallback)) {
                r rVar2 = new r();
                rVar2.f17789a = strongBinder2;
                iMultiInstanceInvalidationCallback2 = rVar2;
            } else {
                iMultiInstanceInvalidationCallback2 = (IMultiInstanceInvalidationCallback) iInterfaceQueryLocalInterface2;
            }
        }
        unregisterCallback(iMultiInstanceInvalidationCallback2, parcel.readInt());
        parcel2.writeNoException();
        return true;
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public final int registerCallback(IMultiInstanceInvalidationCallback callback, String str) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i7 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f17681a;
        synchronized (multiInstanceInvalidationService.f17728c) {
            try {
                int i10 = multiInstanceInvalidationService.f17726a + 1;
                multiInstanceInvalidationService.f17726a = i10;
                if (multiInstanceInvalidationService.f17728c.register(callback, Integer.valueOf(i10))) {
                    multiInstanceInvalidationService.f17727b.put(Integer.valueOf(i10), str);
                    i7 = i10;
                } else {
                    multiInstanceInvalidationService.f17726a--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i7;
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public final void unregisterCallback(IMultiInstanceInvalidationCallback callback, int i7) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f17681a;
        synchronized (multiInstanceInvalidationService.f17728c) {
            multiInstanceInvalidationService.f17728c.unregister(callback);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
