package X0;

import V0.B;
import androidx.work.impl.workers.ConstraintTrackingWorker;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConstraintTrackingWorker f10945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B f10946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f10948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10949e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ConstraintTrackingWorker constraintTrackingWorker, Ff.c cVar) {
        super(cVar);
        this.f10948d = constraintTrackingWorker;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f10947c = obj;
        this.f10949e |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.e(this.f10948d, this);
    }
}
