package androidx.core.app.unusedapprestrictions;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({c.f39800a})
public interface IUnusedAppRestrictionsBackportService extends IInterface {
    void isPermissionRevocationEnabledForApp(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) throws RemoteException;
}
