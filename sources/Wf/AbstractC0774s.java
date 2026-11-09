package Wf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Wf.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0774s extends kotlin.coroutines.a implements ContinuationInterceptor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f10896b = new r(ContinuationInterceptor.f38936l0, new Wd.G(9));

    public AbstractC0774s() {
        super(ContinuationInterceptor.f38936l0);
    }

    public abstract void a(CoroutineContext coroutineContext, Runnable runnable);

    public void b(CoroutineContext coroutineContext, Runnable runnable) {
        p015ag.a.h(this, coroutineContext, runnable);
    }

    public boolean c(CoroutineContext coroutineContext) {
        return !(this instanceof A0);
    }

    public AbstractC0774s d(int i7) {
        p015ag.a.a(i7);
        return new p015ag.g(this, i7);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!(key instanceof kotlin.coroutines.b)) {
            if (ContinuationInterceptor.f38936l0 == key) {
                return this;
            }
            return null;
        }
        kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
        bVar.getClass();
        CoroutineContext.Key key2 = this.f38937a;
        Intrinsics.checkNotNullParameter(key2, "key");
        if (key2 != bVar && bVar.f38939b != key2) {
            return null;
        }
        Intrinsics.checkNotNullParameter(this, "element");
        CoroutineContext.Element element = (CoroutineContext.Element) bVar.f38938a.invoke(this);
        if (element != null) {
            return element;
        }
        return null;
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final Continuation interceptContinuation(Continuation continuation) {
        return new p015ag.f(this, continuation);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            bVar.getClass();
            CoroutineContext.Key key2 = this.f38937a;
            Intrinsics.checkNotNullParameter(key2, "key");
            if (key2 != bVar && bVar.f38939b != key2) {
                return this;
            }
            Intrinsics.checkNotNullParameter(this, "element");
            if (((CoroutineContext.Element) bVar.f38938a.invoke(this)) != null) {
                return kotlin.coroutines.f.f38943a;
            }
        } else if (ContinuationInterceptor.f38936l0 == key) {
            return kotlin.coroutines.f.f38943a;
        }
        return this;
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final void releaseInterceptedContinuation(Continuation continuation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Intrinsics.f(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        p015ag.f fVar = (p015ag.f) continuation;
        do {
            atomicReferenceFieldUpdater = p015ag.f.f11935i;
        } while (atomicReferenceFieldUpdater.get(fVar) == p015ag.a.f11929c);
        Object obj = atomicReferenceFieldUpdater.get(fVar);
        C0765i c0765i = obj instanceof C0765i ? (C0765i) obj : null;
        if (c0765i != null) {
            c0765i.j();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0780y.i(this);
    }
}
