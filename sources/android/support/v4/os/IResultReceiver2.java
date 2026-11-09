package android.support.v4.os;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({c.f39800a})
public interface IResultReceiver2 extends IInterface {
    void send(int i7, Bundle bundle) throws RemoteException;
}
