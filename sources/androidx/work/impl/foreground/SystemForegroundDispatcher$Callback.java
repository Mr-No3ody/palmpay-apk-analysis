package androidx.work.impl.foreground;

import android.app.Notification;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
interface SystemForegroundDispatcher$Callback {
    @MainThread
    void cancelNotification(int notificationId);

    @MainThread
    void notify(int notificationId, @NonNull Notification notification);

    @MainThread
    void startForeground(int notificationId, int notificationType, @NonNull Notification notification);

    @MainThread
    void stop(int startId);
}
