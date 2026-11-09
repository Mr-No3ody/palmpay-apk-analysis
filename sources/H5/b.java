package H5;

import android.content.Context;
import com.mikepenz.iconics.utils.IconicsLogger;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p355xf.o;
import p355xf.p;
import p355xf.q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f3695a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f3696b = b.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.growingio.android.circler.a f3697c = IconicsLogger.f23603j0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f3698d;

    public static final void a(Context value) {
        Intrinsics.checkNotNullParameter(value, "context");
        M5.a aVar = M5.a.f5768a;
        Intrinsics.checkNotNullParameter(value, "value");
        if (M5.a.f5769b == null) {
            M5.a.f5769b = value.getApplicationContext();
        }
        M5.a.f5770c.isEmpty();
    }

    public static final boolean b() {
        Object objF;
        try {
            o oVar = q.f43977a;
            objF = M5.a.f5769b;
            if (objF == null) {
                Intrinsics.checkNotNullExpressionValue("A 'Iconics.init(context)' has to happen first. Call from your application. Usually this happens via an 'IconicsDrawable' usage.", "StringBuilder().apply(builderAction).toString()");
                throw new RuntimeException("A 'Iconics.init(context)' has to happen first. Call from your application. Usually this happens via an 'IconicsDrawable' usage.");
            }
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            objF = androidx.camera.core.impl.utils.executor.g.f(th);
        }
        return !(objF instanceof p);
    }
}
