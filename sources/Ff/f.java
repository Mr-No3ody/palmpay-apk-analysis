package Ff;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f extends a {
    public f(Continuation continuation) {
        super(continuation);
        if (continuation != null && continuation.getContext() != kotlin.coroutines.f.f38943a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return kotlin.coroutines.f.f38943a;
    }
}
