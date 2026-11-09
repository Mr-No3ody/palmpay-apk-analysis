package androidx.work.multiprocess;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({c.f39800a})
public interface IListenableWorkerImpl extends IInterface {
    void interrupt(byte[] request, IWorkManagerImplCallback callback) throws RemoteException;

    void startWork(byte[] request, IWorkManagerImplCallback callback) throws RemoteException;
}
