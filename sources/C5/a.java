package C5;

import android.app.Application;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Application f1157a;

    static {
        Application application;
        Application application2 = null;
        try {
            try {
                application = (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke(null, new Object[0]);
                if (application != null) {
                    f1157a = application;
                    return;
                }
                try {
                    throw new IllegalStateException("Static initialization of Applications must be on main thread.");
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                    try {
                        application = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
                    } catch (Exception unused) {
                        e.printStackTrace();
                    }
                    f1157a = application;
                }
            } catch (Throwable th) {
                th = th;
                application2 = application;
                f1157a = application2;
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            application = null;
        } catch (Throwable th2) {
            th = th2;
            f1157a = application2;
            throw th;
        }
    }
}
