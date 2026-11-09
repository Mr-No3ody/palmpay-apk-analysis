package Ff;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f2827a = new b();

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
