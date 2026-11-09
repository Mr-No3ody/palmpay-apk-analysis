package Fg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.f;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f2839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f2842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f2843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2844f;

    public b(d taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f2839a = taskRunner;
        this.f2840b = name;
        this.f2843e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = Dg.c.f1879a;
        synchronized (this.f2839a) {
            try {
                if (b()) {
                    this.f2839a.d(this);
                }
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        a aVar = this.f2842d;
        if (aVar != null && aVar.f2836b) {
            this.f2844f = true;
        }
        ArrayList arrayList = this.f2843e;
        boolean z3 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f2836b) {
                a aVar2 = (a) arrayList.get(size);
                if (d.f2845h.getLogger().isLoggable(Level.FINE)) {
                    p118hf.a.b(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z3 = true;
            }
        }
        return z3;
    }

    public final void c(a task, long j6) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f2839a) {
            if (!this.f2841c) {
                if (e(task, j6, false)) {
                    this.f2839a.d(this);
                }
                Unit unit = Unit.f38893a;
            } else if (task.f2836b) {
                if (d.f2845h.getLogger().isLoggable(Level.FINE)) {
                    p118hf.a.b(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d.f2845h.getLogger().isLoggable(Level.FINE)) {
                    p118hf.a.b(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:25:0x007e  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c A[LOOP:0: B:23:0x0078->B:28:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0090 A[EDGE_INSN: B:40:0x0090->B:30:0x0090 BREAK  A[LOOP:0: B:23:0x0078->B:28:0x008c], SYNTHETIC] */
    public final boolean e(a task, long j6, boolean z3) {
        Iterator it;
        int size;
        String strConcat;
        Intrinsics.checkNotNullParameter(task, "task");
        task.getClass();
        Intrinsics.checkNotNullParameter(this, "queue");
        b bVar = task.f2837c;
        if (bVar != this) {
            if (bVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f2837c = this;
        }
        f fVar = this.f2839a.f2848a;
        long jNanoTime = System.nanoTime();
        long j10 = jNanoTime + j6;
        ArrayList arrayList = this.f2843e;
        int iIndexOf = arrayList.indexOf(task);
        if (iIndexOf == -1) {
            task.f2838d = j10;
            if (d.f2845h.getLogger().isLoggable(Level.FINE)) {
                if (z3) {
                    strConcat = "run again after ".concat(p118hf.a.r(j10 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(p118hf.a.r(j10 - jNanoTime));
                }
                p118hf.a.b(task, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((a) it.next()).f2838d - jNanoTime > j6) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, task);
            if (size == 0) {
                return true;
            }
        } else if (task.f2838d > j10) {
            arrayList.remove(iIndexOf);
            task.f2838d = j10;
            if (d.f2845h.getLogger().isLoggable(Level.FINE)) {
                if (z3) {
                    strConcat = "run again after ".concat(p118hf.a.r(j10 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(p118hf.a.r(j10 - jNanoTime));
                }
                p118hf.a.b(task, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((a) it.next()).f2838d - jNanoTime > j6) {
                    break;
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, task);
            if (size == 0) {
                return true;
            }
        } else if (d.f2845h.getLogger().isLoggable(Level.FINE)) {
            p118hf.a.b(task, this, "already scheduled");
            return false;
        }
        return false;
    }

    public final void f() {
        byte[] bArr = Dg.c.f1879a;
        synchronized (this.f2839a) {
            try {
                this.f2841c = true;
                if (b()) {
                    this.f2839a.d(this);
                }
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return this.f2840b;
    }
}
