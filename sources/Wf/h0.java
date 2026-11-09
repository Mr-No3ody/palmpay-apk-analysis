package Wf;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.Incomplete;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements Incomplete {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10859b = AtomicIntegerFieldUpdater.newUpdater(h0.class, "_isCompleting$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10860c = AtomicReferenceFieldUpdater.newUpdater(h0.class, Object.class, "_rootCause$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10861d = AtomicReferenceFieldUpdater.newUpdater(h0.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f10862a;

    public h0(q0 q0Var, Throwable th) {
        this.f10862a = q0Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable thB = b();
        if (thB == null) {
            f10860c.set(this, th);
            return;
        }
        if (th == thB) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10861d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    public final Throwable b() {
        return (Throwable) f10860c.get(this);
    }

    public final boolean c() {
        return b() != null;
    }

    public final ArrayList d(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10861d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thB = b();
        if (thB != null) {
            arrayList.add(0, thB);
        }
        if (th != null && !th.equals(thB)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0780y.f10916h);
        return arrayList;
    }

    @Override // kotlinx.coroutines.Incomplete
    public final q0 getList() {
        return this.f10862a;
    }

    @Override // kotlinx.coroutines.Incomplete
    public final boolean isActive() {
        return b() == null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Finishing[cancelling=");
        sb2.append(c());
        sb2.append(", completing=");
        sb2.append(f10859b.get(this) == 1);
        sb2.append(", rootCause=");
        sb2.append(b());
        sb2.append(", exceptions=");
        sb2.append(f10861d.get(this));
        sb2.append(", list=");
        sb2.append(this.f10862a);
        sb2.append(']');
        return sb2.toString();
    }
}
