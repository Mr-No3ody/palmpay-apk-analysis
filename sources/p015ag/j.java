package p015ag;

import Wf.AbstractC0780y;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11947a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11948b = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11949c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean a(j jVar, int i7) {
        while (true) {
            j jVarB = b();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11948b;
            if (jVarB == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    jVarB = (j) obj;
                    if (!jVarB.e()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVarB);
                }
            }
            if (jVarB instanceof h) {
                return (((h) jVarB).f11946d & i7) == 0 && jVarB.a(jVar, i7);
            }
            atomicReferenceFieldUpdater.set(jVar, jVarB);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f11947a;
            atomicReferenceFieldUpdater2.set(jVar, this);
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(jVarB, this, jVar)) {
                    jVar.c(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(jVarB) == this);
        }
    }

    public final j b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f11948b;
            j jVar = (j) atomicReferenceFieldUpdater2.get(this);
            j jVar2 = jVar;
            while (true) {
                j jVar3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f11947a;
                    obj = atomicReferenceFieldUpdater.get(jVar2);
                    if (obj == this) {
                        if (jVar == jVar2) {
                            return jVar2;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, jVar, jVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != jVar) {
                                break;
                            }
                        }
                        return jVar2;
                    }
                    if (e()) {
                        return null;
                    }
                    if (!(obj instanceof p)) {
                        Intrinsics.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        jVar3 = jVar2;
                        jVar2 = (j) obj;
                    } else {
                        if (jVar3 != null) {
                            break;
                        }
                        jVar2 = (j) atomicReferenceFieldUpdater2.get(jVar2);
                    }
                }
                j jVar4 = ((p) obj).f11961a;
                while (!atomicReferenceFieldUpdater.compareAndSet(jVar3, jVar2, jVar4)) {
                    if (atomicReferenceFieldUpdater.get(jVar3) != jVar2) {
                        break;
                    }
                }
                jVar2 = jVar3;
            }
        }
    }

    public final void c(j jVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11948b;
            j jVar2 = (j) atomicReferenceFieldUpdater.get(jVar);
            if (f11947a.get(this) != jVar) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(jVar, jVar2, this)) {
                    if (e()) {
                        jVar.b();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(jVar) == jVar2);
        }
    }

    public final j d() {
        j jVar;
        Object obj = f11947a.get(this);
        p pVar = obj instanceof p ? (p) obj : null;
        if (pVar != null && (jVar = pVar.f11961a) != null) {
            return jVar;
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (j) obj;
    }

    public boolean e() {
        return f11947a.get(this) instanceof p;
    }

    public String toString() {
        return new i(this, AbstractC0780y.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + AbstractC0780y.i(this);
    }
}
