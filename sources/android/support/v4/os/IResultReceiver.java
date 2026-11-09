package android.support.v4.os;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({c.f39800a})
public interface IResultReceiver extends IInterface {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f11980h = "android$support$v4$os$IResultReceiver".replace('$', '.');

    void send(int i7, Bundle bundle) throws RemoteException;
}
