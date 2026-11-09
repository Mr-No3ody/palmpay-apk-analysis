package androidx.core.app;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class z extends D4.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f16011c;

    @Override // D4.f
    public final void g(H h7) {
        new Notification.BigTextStyle(h7.f15920b).setBigContentTitle(null).bigText(this.f16011c);
    }

    @Override // D4.f
    public final String n() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
