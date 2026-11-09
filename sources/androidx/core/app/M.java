package androidx.core.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f15938d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static L f15941g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotificationManager f15943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f15937c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static HashSet f15939e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f15940f = new Object();

    public M(Context context) {
        this.f15942a = context;
        this.f15943b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i7) {
        this.f15943b.cancel(null, i7);
    }

    public final void b(int i7, Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.f15943b;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(null, i7, notification);
            return;
        }
        I i10 = new I(this.f15942a.getPackageName(), i7, notification);
        synchronized (f15940f) {
            try {
                if (f15941g == null) {
                    f15941g = new L(this.f15942a.getApplicationContext());
                }
                f15941g.f15934b.obtainMessage(0, i10).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel(null, i7);
    }
}
