package androidx.core.os;

import Wf.C0765i;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import p355xf.o;
import p355xf.q;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Continuation<Object> f16094a;

    public e(C0765i c0765i) {
        super(false);
        this.f16094a = c0765i;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            Continuation<Object> continuation = this.f16094a;
            o oVar = q.f43977a;
            continuation.resumeWith(androidx.camera.core.impl.utils.executor.g.f(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            Continuation<Object> continuation = this.f16094a;
            o oVar = q.f43977a;
            continuation.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
