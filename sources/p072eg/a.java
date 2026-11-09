package p072eg;

import Pa.a0;
import Wf.AbstractC0774s;
import Wf.C0765i;
import Z6.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Waiter;
import p015ag.s;
import p051d9.C1605b;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements CancellableContinuation, Waiter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0765i f36295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f36296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f36297c;

    public a(e eVar, C0765i c0765i, Object obj) {
        this.f36297c = eVar;
        this.f36295a = c0765i;
        this.f36296b = obj;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final boolean cancel(Throwable th) {
        return this.f36295a.cancel(th);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void completeResume(Object obj) {
        this.f36295a.completeResume(obj);
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f36295a.f10867e;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void initCancellability() {
        this.f36295a.initCancellability();
    }

    @Override // kotlinx.coroutines.Waiter
    public final void invokeOnCancellation(s sVar, int i7) {
        this.f36295a.invokeOnCancellation(sVar, i7);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final boolean isActive() {
        return this.f36295a.isActive();
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final boolean isCancelled() {
        return this.f36295a.isCancelled();
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final boolean isCompleted() {
        return this.f36295a.isCompleted();
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void resume(Object obj, Function1 function1) {
        this.f36295a.resume((Unit) obj, function1);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void resumeUndispatched(AbstractC0774s abstractC0774s, Object obj) {
        this.f36295a.resumeUndispatched(abstractC0774s, (Unit) obj);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void resumeUndispatchedWithException(AbstractC0774s abstractC0774s, Throwable th) {
        this.f36295a.resumeUndispatchedWithException(abstractC0774s, th);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.f36295a.resumeWith(obj);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final Object tryResume(Object obj, Object obj2) {
        return this.f36295a.v((Unit) obj, obj2, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final Object tryResumeWithException(Throwable th) {
        return this.f36295a.tryResumeWithException(th);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void invokeOnCancellation(Function1 function1) {
        this.f36295a.invokeOnCancellation(function1);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void resume(Object obj, Function3 function3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f36303i;
        e eVar = this.f36297c;
        atomicReferenceFieldUpdater.set(eVar, this.f36296b);
        C1605b c1605b = new C1605b(7, eVar, this);
        this.f36295a.resume((Unit) obj, c1605b);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final Object tryResume(Object obj, Object obj2, Function3 function3) {
        e eVar = this.f36297c;
        b bVar = new b(2, eVar, this);
        a0 a0VarV = this.f36295a.v((Unit) obj, obj2, bVar);
        if (a0VarV != null) {
            e.f36303i.set(eVar, this.f36296b);
        }
        return a0VarV;
    }
}
