package androidx.core.app;

import android.os.RemoteException;
import android.support.v4.app.INotificationSideChannel;

/* JADX INFO: loaded from: classes.dex */
interface NotificationManagerCompat$Task {
    void send(INotificationSideChannel iNotificationSideChannel) throws RemoteException;
}
