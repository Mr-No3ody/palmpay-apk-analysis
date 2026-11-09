package p191mg;

import androidx.camera.core.impl.utils.executor.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p355xf.o;
import p355xf.p;
import p355xf.q;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f39719a;

    static {
        Object objF;
        try {
            o oVar = q.f43977a;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
            objF = StringsKt.toIntOrNull(property);
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            objF = g.f(th);
        }
        if (objF instanceof p) {
            objF = null;
        }
        Integer num = (Integer) objF;
        f39719a = num != null ? num.intValue() : 2097152;
    }
}
