package Pa;

import B6.RunnableC0085g;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.core.base.BaseApplication;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class U extends n0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static volatile U f7050v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Object f7051w = new Object();

    public static U F() {
        U u6;
        U u10 = f7050v;
        if (u10 != null) {
            return u10;
        }
        synchronized (f7051w) {
            try {
                if (f7050v == null) {
                    f7050v = new U(BaseApplication.getContext());
                }
                u6 = f7050v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return u6;
    }

    public final void G(HashMap map) {
        a(map);
        HashMap map2 = new HashMap(map);
        FirebaseAnalytics firebaseAnalytics = this.f7120b;
        if (firebaseAnalytics != null) {
            T.b(-1).execute(new Da.h(this, 8, firebaseAnalytics, map2));
        }
        T.c(new RunnableC0085g(17, this, n0.y(map2)));
    }
}
