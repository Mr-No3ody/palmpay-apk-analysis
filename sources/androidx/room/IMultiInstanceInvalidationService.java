package androidx.room;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39800a})
public interface IMultiInstanceInvalidationService extends IInterface {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f17708j = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    void broadcastInvalidation(int i7, String[] strArr) throws RemoteException;

    int registerCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) throws RemoteException;

    void unregisterCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i7) throws RemoteException;
}
