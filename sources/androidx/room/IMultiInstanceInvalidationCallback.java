package androidx.room;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39800a})
public interface IMultiInstanceInvalidationCallback extends IInterface {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f17707i = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    void onInvalidation(String[] strArr) throws RemoteException;
}
