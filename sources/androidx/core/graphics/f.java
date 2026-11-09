package androidx.core.graphics;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f16062a = 0;

    static {
        new ThreadLocal();
    }

    public static void a(com.airbnb.lottie.animation.a aVar, b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.d(aVar, bVar != null ? a.b(bVar) : null);
        } else if (bVar == null) {
            aVar.setXfermode(null);
        } else {
            PorterDuff.Mode modeQ = o.q(bVar);
            aVar.setXfermode(modeQ != null ? new PorterDuffXfermode(modeQ) : null);
        }
    }
}
