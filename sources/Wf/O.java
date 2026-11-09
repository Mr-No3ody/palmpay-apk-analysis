package Wf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class O implements Runnable, Comparable, DisposableHandle, ThreadSafeHeapNode {

    @Nullable
    private volatile Object _heap;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f10817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10818b = -1;

    public O(long j6) {
        this.f10817a = j6;
    }

    public final int a(long j6, P p3, Q q10) {
        synchronized (this) {
            if (this._heap == AbstractC0780y.f10910b) {
                return 2;
            }
            synchronized (p3) {
                try {
                    ThreadSafeHeapNode[] threadSafeHeapNodeArr = p3.f11972a;
                    O o10 = (O) (threadSafeHeapNodeArr != null ? threadSafeHeapNodeArr[0] : null);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Q.f10820g;
                    q10.getClass();
                    if (Q.f10822j.get(q10) == 1) {
                        return 1;
                    }
                    if (o10 == null) {
                        p3.f10819c = j6;
                    } else {
                        long j10 = o10.f10817a;
                        if (j10 - j6 < 0) {
                            j6 = j10;
                        }
                        if (j6 - p3.f10819c > 0) {
                            p3.f10819c = j6;
                        }
                    }
                    long j11 = this.f10817a;
                    long j12 = p3.f10819c;
                    if (j11 - j12 < 0) {
                        this.f10817a = j12;
                    }
                    p3.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j6 = this.f10817a - ((O) obj).f10817a;
        if (j6 > 0) {
            return 1;
        }
        return j6 < 0 ? -1 : 0;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                Pa.a0 a0Var = AbstractC0780y.f10910b;
                if (obj == a0Var) {
                    return;
                }
                P p3 = obj instanceof P ? (P) obj : null;
                if (p3 != null) {
                    synchronized (p3) {
                        if (getHeap() != null) {
                            p3.b(getIndex());
                        }
                    }
                }
                this._heap = a0Var;
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public final p015ag.w getHeap() {
        Object obj = this._heap;
        if (obj instanceof p015ag.w) {
            return (p015ag.w) obj;
        }
        return null;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public final int getIndex() {
        return this.f10818b;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public final void setHeap(p015ag.w wVar) {
        if (this._heap == AbstractC0780y.f10910b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = wVar;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public final void setIndex(int i7) {
        this.f10818b = i7;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f10817a + ']';
    }
}
