package androidx.lifecycle;

import Wf.C0753a0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/q;", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LifecycleCoroutineScopeImpl extends AbstractC1207q implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1205o f17354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f17355b;

    public LifecycleCoroutineScopeImpl(AbstractC1205o lifecycle, CoroutineContext coroutineContext) {
        Job job;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f17354a = lifecycle;
        this.f17355b = coroutineContext;
        if (((C1212w) lifecycle).f17478d != EnumC1204n.f17460a || (job = (Job) coroutineContext.get(C0753a0.f10836a)) == null) {
            return;
        }
        job.cancel((CancellationException) null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF17355b() {
        return this.f17355b;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, EnumC1203m event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        AbstractC1205o abstractC1205o = this.f17354a;
        if (((C1212w) abstractC1205o).f17478d.compareTo(EnumC1204n.f17460a) <= 0) {
            abstractC1205o.b(this);
            Job job = (Job) this.f17355b.get(C0753a0.f10836a);
            if (job != null) {
                job.cancel((CancellationException) null);
            }
        }
    }
}
