package Wf;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p355xf.C2126e;

/* JADX INFO: renamed from: Wf.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0776u {
    public static final void a(CoroutineContext coroutineContext, Throwable th) {
        if (th instanceof E) {
            th = ((E) th).f10804a;
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) coroutineContext.get(C0775t.f10898a);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(coroutineContext, th);
            } else {
                p015ag.a.d(coroutineContext, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                C2126e.a(runtimeException, th);
                th = runtimeException;
            }
            p015ag.a.d(coroutineContext, th);
        }
    }
}
