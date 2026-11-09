package Wf;

import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes4.dex */
public final class M extends O {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CancellableContinuation f10814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f10815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(Q q10, long j6, CancellableContinuation cancellableContinuation) {
        super(j6);
        this.f10815d = q10;
        this.f10814c = cancellableContinuation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10814c.resumeUndispatched(this.f10815d, Unit.f38893a);
    }

    @Override // Wf.O
    public final String toString() {
        return super.toString() + this.f10814c;
    }
}
