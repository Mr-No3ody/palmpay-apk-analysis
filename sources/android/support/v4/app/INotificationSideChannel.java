package android.support.v4.app;

import android.app.Notification;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({c.f39800a})
public interface INotificationSideChannel extends IInterface {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f11979g = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    void cancel(String str, int i7, String str2) throws RemoteException;

    void cancelAll(String str) throws RemoteException;

    void notify(String str, int i7, String str2, Notification notification) throws RemoteException;
}
