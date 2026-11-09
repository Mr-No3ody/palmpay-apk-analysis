package Wf;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.ChildJob;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectClause0;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 extends kotlin.coroutines.a implements Job {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0 f10895b = new r0(C0753a0.f10836a);

    @Override // kotlinx.coroutines.Job
    public final ChildHandle attachChild(ChildJob childJob) {
        return s0.f10897a;
    }

    @Override // kotlinx.coroutines.Job
    public final /* synthetic */ void cancel() {
    }

    @Override // kotlinx.coroutines.Job
    public final CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public final Sequence getChildren() {
        return Sf.f.f8887a;
    }

    @Override // kotlinx.coroutines.Job
    public final SelectClause0 getOnJoin() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public final Job getParent() {
        return null;
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(Function1 function1) {
        return s0.f10897a;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public final Object join(Continuation continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.Job
    public final void cancel(CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(boolean z3, boolean z8, Function1 function1) {
        return s0.f10897a;
    }

    @Override // kotlinx.coroutines.Job
    public final /* synthetic */ boolean cancel(Throwable th) {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public final Job plus(Job job) {
        return job;
    }
}
