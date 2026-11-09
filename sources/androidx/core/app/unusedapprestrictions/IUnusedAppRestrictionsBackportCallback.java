package androidx.core.app.unusedapprestrictions;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({c.f39800a})
public interface IUnusedAppRestrictionsBackportCallback extends IInterface {
    void onIsPermissionRevocationEnabledForAppResult(boolean z3, boolean z8) throws RemoteException;
}
