package p015ag;

import Ab.y;
import Pa.a0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f11967a = new a0("NO_THREAD_ELEMENTS", 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f11968b = new y(11);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f11969c = new y(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f11970d = new y(13);

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f11967a) {
            return;
        }
        if (!(obj instanceof x)) {
            Object objFold = coroutineContext.fold(null, f11969c);
            Intrinsics.f(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((ThreadContextElement) objFold).restoreThreadContext(coroutineContext, obj);
            return;
        }
        x xVar = (x) obj;
        ThreadContextElement[] threadContextElementArr = xVar.f11975c;
        int length = threadContextElementArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i7 = length - 1;
            ThreadContextElement threadContextElement = threadContextElementArr[length];
            Intrinsics.e(threadContextElement);
            threadContextElement.restoreThreadContext(coroutineContext, xVar.f11974b[length]);
            if (i7 < 0) {
                return;
            } else {
                length = i7;
            }
        }
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, f11968b);
        Intrinsics.e(objFold);
        return objFold;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return f11967a;
        }
        return obj instanceof Integer ? coroutineContext.fold(new x(((Number) obj).intValue(), coroutineContext), f11970d) : ((ThreadContextElement) obj).updateThreadContext(coroutineContext);
    }
}
