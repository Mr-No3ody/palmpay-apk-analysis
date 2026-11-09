package androidx.work.multiprocess;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({c.f39800a})
public interface IWorkManagerImpl extends IInterface {
    void cancelAllWork(IWorkManagerImplCallback callback) throws RemoteException;

    void cancelAllWorkByTag(String tag, IWorkManagerImplCallback callback) throws RemoteException;

    void cancelUniqueWork(String name, IWorkManagerImplCallback callback) throws RemoteException;

    void cancelWorkById(String id2, IWorkManagerImplCallback callback) throws RemoteException;

    void enqueueContinuation(byte[] request, IWorkManagerImplCallback callback) throws RemoteException;

    void enqueueWorkRequests(byte[] request, IWorkManagerImplCallback callback) throws RemoteException;

    void queryWorkInfo(byte[] request, IWorkManagerImplCallback callback) throws RemoteException;

    void setForegroundAsync(byte[] request, IWorkManagerImplCallback callback) throws RemoteException;

    void setProgress(byte[] request, IWorkManagerImplCallback callback) throws RemoteException;

    void updateUniquePeriodicWorkRequest(String name, byte[] request, IWorkManagerImplCallback callback) throws RemoteException;
}
