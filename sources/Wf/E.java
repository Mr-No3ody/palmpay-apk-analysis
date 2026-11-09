package Wf;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class E extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f10804a;

    public E(Throwable th, AbstractC0774s abstractC0774s, CoroutineContext coroutineContext) {
        super("Coroutine dispatcher " + abstractC0774s + " threw an exception, context = " + coroutineContext, th);
        this.f10804a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f10804a;
    }
}
