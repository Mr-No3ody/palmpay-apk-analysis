package androidx.work.multiprocess;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({c.f39800a})
public interface IWorkManagerImplCallback extends IInterface {
    void onFailure(String error) throws RemoteException;

    void onSuccess(byte[] response) throws RemoteException;
}
