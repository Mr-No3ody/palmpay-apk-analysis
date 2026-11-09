package p080f7;

import android.app.Activity;
import android.app.Application;
import android.app.NotificationManager;
import android.os.Build;
import android.provider.Settings;
import com.hjq.toast.config.IToast;
import com.hjq.toast.config.IToastStyle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p377z5.b;
import p377z5.d;
import p377z5.f;
import p377z5.g;
import p377z5.j;
import p377z5.k;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Application f36410f;

    public a(Application application) {
        this.f36410f = application;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    @Override // com.hjq.toast.config.IToastStrategy
    public final IToast createToast(j jVar) {
        IToast gVar;
        boolean z3 = false;
        Activity activity = p377z5.a.a().f44444a;
        int i7 = Build.VERSION.SDK_INT;
        Application application = this.f36410f;
        if (Settings.canDrawOverlays(application)) {
            gVar = new b(application);
        } else {
            jVar.getClass();
            if (!"Pixel 6".equalsIgnoreCase(Build.MODEL.toUpperCase())) {
                if ((activity == null || activity.isFinishing()) ? false : !activity.isDestroyed()) {
                    gVar = new b(activity);
                } else if (i7 == 25) {
                    gVar = new f(application);
                } else if (i7 < 29) {
                    gVar = new g(application);
                } else {
                    gVar = new g(application);
                }
            } else if (i7 == 25) {
                gVar = new f(application);
            } else if (i7 < 29 || ((NotificationManager) application.getSystemService(NotificationManager.class)).areNotificationsEnabled()) {
                gVar = new g(application);
            } else {
                gVar = new d(application);
            }
        }
        if (!((gVar instanceof b) || i7 < 30 || this.f44476a.getApplicationInfo().targetSdkVersion < 30)) {
            if (Build.VERSION.SDK_INT < 30) {
                z3 = true;
            } else {
                try {
                    Method method = Class.forName("android.app.compat.CompatChanges").getMethod("isChangeEnabled", Long.TYPE);
                    method.setAccessible(true);
                    z3 = Boolean.parseBoolean(String.valueOf(method.invoke(null, 147798919L)));
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                    e10.printStackTrace();
                }
            }
            if (z3) {
                return gVar;
            }
        }
        IToastStyle iToastStyle = jVar.f44472c;
        gVar.setView(iToastStyle.createView(this.f44476a));
        gVar.setGravity(iToastStyle.getGravity(), iToastStyle.getXOffset(), iToastStyle.getYOffset());
        gVar.setMargin(iToastStyle.getHorizontalMargin(), iToastStyle.getVerticalMargin());
        return gVar;
    }
}
