package X0;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f10931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10932c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ConstraintTrackingWorker constraintTrackingWorker, Ff.c cVar) {
        super(cVar);
        this.f10931b = constraintTrackingWorker;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f10930a = obj;
        this.f10932c |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.d(this.f10931b, null, null, null, this);
    }
}
