package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1206p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1205o f17467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V7.g f17468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E0.k f17469c;

    public C1206p(AbstractC1205o lifecycle, V7.g dispatchQueue, Job parentJob) {
        EnumC1204n minState = EnumC1204n.f17462c;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(minState, "minState");
        Intrinsics.checkNotNullParameter(dispatchQueue, "dispatchQueue");
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        this.f17467a = lifecycle;
        this.f17468b = dispatchQueue;
        E0.k kVar = new E0.k(3, this, parentJob);
        this.f17469c = kVar;
        if (((C1212w) lifecycle).f17478d != EnumC1204n.f17460a) {
            lifecycle.a(kVar);
        } else {
            parentJob.cancel((CancellationException) null);
            a();
        }
    }

    public final void a() {
        this.f17467a.b(this.f17469c);
        V7.g gVar = this.f17468b;
        gVar.f10097b = true;
        gVar.b();
    }
}
