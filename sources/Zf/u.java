package Zf;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements CoroutineContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f11793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f11794b;

    public u(CoroutineContext coroutineContext, Throwable th) {
        this.f11793a = coroutineContext;
        this.f11794b = th;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return this.f11793a.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return this.f11793a.get(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return this.f11793a.minusKey(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.f11793a.plus(coroutineContext);
    }
}
