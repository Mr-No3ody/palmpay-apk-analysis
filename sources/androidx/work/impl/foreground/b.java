package androidx.work.impl.foreground;

import V0.C;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static void a(SystemForegroundService systemForegroundService, int i7, Notification notification, int i10) {
        systemForegroundService.startForeground(i7, notification, i10);
    }

    public static void b(SystemForegroundService systemForegroundService, int i7, Notification notification, int i10) {
        try {
            systemForegroundService.startForeground(i7, notification, i10);
        } catch (ForegroundServiceStartNotAllowedException unused) {
            C c6 = C.c();
            int i11 = SystemForegroundService.f18548e;
            c6.getClass();
        } catch (SecurityException unused2) {
            C c10 = C.c();
            int i12 = SystemForegroundService.f18548e;
            c10.getClass();
        }
    }
}
