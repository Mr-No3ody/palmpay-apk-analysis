package p015ag;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11930a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11931b = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public b(s sVar) {
        this._prev$volatile = sVar;
    }

    public final void a() {
        f11931b.set(this, null);
    }

    public final b b() {
        Object obj = f11930a.get(this);
        if (obj == a.f11927a) {
            return null;
        }
        return (b) obj;
    }

    public abstract boolean c();

    public final void d() {
        b bVarB;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11931b;
            b bVar = (b) atomicReferenceFieldUpdater.get(this);
            while (bVar != null && bVar.c()) {
                bVar = (b) atomicReferenceFieldUpdater.get(bVar);
            }
            b bVarB2 = b();
            Intrinsics.e(bVarB2);
            while (bVarB2.c() && (bVarB = bVarB2.b()) != null) {
                bVarB2 = bVarB;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(bVarB2);
                b bVar2 = ((b) obj) == null ? null : bVar;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(bVarB2, obj, bVar2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(bVarB2) != obj) {
                    }
                }
            }
            if (bVar != null) {
                f11930a.set(bVar, bVarB2);
            }
            if (!bVarB2.c() || bVarB2.b() == null) {
                if (bVar == null || !bVar.c()) {
                    return;
                }
            }
        }
    }
}
