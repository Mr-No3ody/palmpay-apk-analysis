package Wf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;

/* JADX INFO: renamed from: Wf.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C0757c0 extends n0 implements CompletableJob {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10843c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0757c0(Job job) {
        super(true);
        boolean z3 = true;
        s(job);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n0.f10889b;
        ChildHandle childHandle = (ChildHandle) atomicReferenceFieldUpdater.get(this);
        C0768l c0768l = childHandle instanceof C0768l ? (C0768l) childHandle : null;
        if (c0768l == null) {
            z3 = false;
            break;
        }
        n0 n0VarF = c0768l.f();
        while (!n0VarF.n()) {
            ChildHandle childHandle2 = (ChildHandle) atomicReferenceFieldUpdater.get(n0VarF);
            C0768l c0768l2 = childHandle2 instanceof C0768l ? (C0768l) childHandle2 : null;
            if (c0768l2 == null) {
                z3 = false;
                break;
            }
            n0VarF = c0768l2.f();
        }
        this.f10843c = z3;
    }

    @Override // kotlinx.coroutines.CompletableJob
    public final boolean complete() {
        return v(Unit.f38893a);
    }

    @Override // kotlinx.coroutines.CompletableJob
    public final boolean completeExceptionally(Throwable th) {
        return v(new C0771o(th, false));
    }

    @Override // Wf.n0
    public final boolean n() {
        return this.f10843c;
    }

    @Override // Wf.n0
    public final boolean o() {
        return true;
    }
}
