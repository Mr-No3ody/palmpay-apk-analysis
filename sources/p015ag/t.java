package p015ag;

import androidx.camera.core.impl.utils.executor.g;
import p002a.a;
import p355xf.o;
import p355xf.q;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11965a = 0;

    static {
        Object objF;
        Object objF2;
        Exception exc = new Exception();
        String simpleName = a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            o oVar = q.f43977a;
            objF = Ff.a.class.getCanonicalName();
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            objF = g.f(th);
        }
        if (q.a(objF) != null) {
            objF = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objF2 = t.class.getCanonicalName();
        } catch (Throwable th2) {
            o oVar3 = q.f43977a;
            objF2 = g.f(th2);
        }
        if (q.a(objF2) != null) {
            objF2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
