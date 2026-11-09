package p015ag;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f11932a;

    public c(CoroutineContext coroutineContext) {
        this.f11932a = coroutineContext;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.f11932a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f11932a + ')';
    }
}
