package p135j0;

import C0.J;
import Ff.c;
import O2.a;
import Sd.b;
import Wf.AbstractC0780y;
import Wf.t0;
import androidx.camera.core.impl.utils.executor.g;
import androidx.datastore.core.CorruptionHandler;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.StorageConnection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.T;
import p072eg.e;
import p355xf.C2126e;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
public final class O implements DataStore {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f37960m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U f37961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CorruptionHandler f37962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f37963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T f37964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f37965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t0 f37967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f37968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f37969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f37970j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f37971k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r0 f37972l;

    static {
        new C1776i(null);
    }

    public O(U storage, List initTasksList, CorruptionHandler corruptionHandler, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f37961a = storage;
        this.f37962b = corruptionHandler;
        this.f37963c = scope;
        this.f37964d = new T(new C1786t(this, null));
        this.f37965e = new e();
        this.f37968h = new b(21);
        a aVar = new a();
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        aVar.f6556d = this;
        aVar.f6553a = new e();
        aVar.f6554b = AbstractC0780y.a();
        aVar.f6555c = CollectionsKt.Y(initTasksList);
        this.f37969i = aVar;
        this.f37970j = C2131j.b(new C1781n(this, 1));
        this.f37971k = C2131j.b(new C1781n(this, 0));
        this.f37972l = new r0(scope, new J(this, 7), new L(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(O o10, c cVar) {
        C1787u c1787u;
        e eVar;
        o10.getClass();
        if (cVar instanceof C1787u) {
            c1787u = (C1787u) cVar;
            int i7 = c1787u.f38151e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c1787u.f38151e = i7 - Integer.MIN_VALUE;
            } else {
                c1787u = new C1787u(o10, cVar);
            }
        } else {
            c1787u = new C1787u(o10, cVar);
        }
        Object obj = c1787u.f38149c;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = c1787u.f38151e;
        if (i10 == 0) {
            g.M(obj);
            c1787u.f38147a = o10;
            eVar = o10.f37965e;
            c1787u.f38148b = eVar;
            c1787u.f38151e = 1;
            if (eVar.lock(null, c1787u) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e eVar2 = c1787u.f38148b;
            O o11 = c1787u.f38147a;
            g.M(obj);
            eVar = eVar2;
            o10 = o11;
        }
        try {
            int i11 = o10.f37966f - 1;
            o10.f37966f = i11;
            if (i11 == 0) {
                t0 t0Var = o10.f37967g;
                if (t0Var != null) {
                    t0Var.cancel((CancellationException) null);
                }
                o10.f37967g = null;
            }
            Unit unit = Unit.f38893a;
            return Unit.f38893a;
        } finally {
            eVar.unlock(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        if (r9 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bf, code lost:
    
        if (r9 == r1) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [j0.O, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [j0.O] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(p135j0.O r9, p135j0.b0 r10, Ff.c r11) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p135j0.O.b(j0.O, j0.b0, Ff.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(O o10, c cVar) {
        C1790x c1790x;
        e eVar;
        o10.getClass();
        if (cVar instanceof C1790x) {
            c1790x = (C1790x) cVar;
            int i7 = c1790x.f38168e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c1790x.f38168e = i7 - Integer.MIN_VALUE;
            } else {
                c1790x = new C1790x(o10, cVar);
            }
        } else {
            c1790x = new C1790x(o10, cVar);
        }
        Object obj = c1790x.f38166c;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = c1790x.f38168e;
        if (i10 == 0) {
            g.M(obj);
            c1790x.f38164a = o10;
            eVar = o10.f37965e;
            c1790x.f38165b = eVar;
            c1790x.f38168e = 1;
            if (eVar.lock(null, c1790x) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e eVar2 = c1790x.f38165b;
            O o11 = c1790x.f38164a;
            g.M(obj);
            eVar = eVar2;
            o10 = o11;
        }
        try {
            int i11 = o10.f37966f + 1;
            o10.f37966f = i11;
            if (i11 == 1) {
                o10.f37967g = AbstractC0780y.m(o10.f37963c, null, null, new C1791y(o10, null), 3);
            }
            Unit unit = Unit.f38893a;
            return Unit.f38893a;
        } finally {
            eVar.unlock(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(O o10, boolean z3, Continuation continuation) {
        A a3;
        O o11;
        w0 w0Var;
        O o12;
        Pair pair;
        w0 w0Var2;
        o10.getClass();
        if (continuation instanceof A) {
            a3 = (A) continuation;
            int i7 = a3.f37900f;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                a3.f37900f = i7 - Integer.MIN_VALUE;
            } else {
                a3 = new A(o10, continuation);
            }
        } else {
            a3 = new A(o10, continuation);
        }
        Object objTryLock = a3.f37898d;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = a3.f37900f;
        if (i10 == 0) {
            g.M(objTryLock);
            w0 w0VarB = o10.f37968h.b();
            if (w0VarB instanceof x0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            InterProcessCoordinator interProcessCoordinatorF = o10.f();
            a3.f37895a = o10;
            a3.f37896b = w0VarB;
            a3.f37897c = z3;
            a3.f37900f = 1;
            Object version = interProcessCoordinatorF.getVersion(a3);
            if (version != aVar) {
                o11 = o10;
                w0Var = w0VarB;
                objTryLock = version;
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                o12 = a3.f37895a;
                g.M(objTryLock);
                pair = (Pair) objTryLock;
                w0Var2 = (w0) pair.f38891a;
                if (((Boolean) pair.f38892b).booleanValue()) {
                    o12.f37968h.e(w0Var2);
                }
                return w0Var2;
            }
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o12 = a3.f37895a;
            g.M(objTryLock);
            pair = (Pair) objTryLock;
            w0Var2 = (w0) pair.f38891a;
            if (((Boolean) pair.f38892b).booleanValue()) {
                o12.f37968h.e(w0Var2);
            }
            return w0Var2;
        }
        z3 = a3.f37897c;
        w0Var = a3.f37896b;
        o11 = a3.f37895a;
        g.M(objTryLock);
        int iIntValue = ((Number) objTryLock).intValue();
        boolean z8 = w0Var instanceof C1769b;
        int i11 = z8 ? w0Var.f38163a : -1;
        if (z8 && iIntValue == i11) {
            return w0Var;
        }
        if (z3) {
            InterProcessCoordinator interProcessCoordinatorF2 = o11.f();
            B b7 = new B(o11, null);
            a3.f37895a = o11;
            a3.f37896b = null;
            a3.f37900f = 2;
            objTryLock = interProcessCoordinatorF2.lock(b7, a3);
            if (objTryLock != aVar) {
                o12 = o11;
                pair = (Pair) objTryLock;
                w0Var2 = (w0) pair.f38891a;
                if (((Boolean) pair.f38892b).booleanValue()) {
                    o12.f37968h.e(w0Var2);
                }
                return w0Var2;
            }
        } else {
            InterProcessCoordinator interProcessCoordinatorF3 = o11.f();
            C c6 = new C(o11, i11, null);
            a3.f37895a = o11;
            a3.f37896b = null;
            a3.f37900f = 3;
            objTryLock = interProcessCoordinatorF3.tryLock(c6, a3);
            if (objTryLock != aVar) {
                o12 = o11;
                pair = (Pair) objTryLock;
                w0Var2 = (w0) pair.f38891a;
                if (((Boolean) pair.f38892b).booleanValue()) {
                    o12.f37968h.e(w0Var2);
                }
                return w0Var2;
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a2 A[Catch: a -> 0x0062, TryCatch #0 {a -> 0x0062, blocks: (B:19:0x005d, B:54:0x0101, B:24:0x006b, B:51:0x00e3, B:32:0x0088, B:40:0x00a2, B:42:0x00a8, B:36:0x0091, B:48:0x00d0), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:63:0x013e A[Catch: all -> 0x016a, TryCatch #1 {all -> 0x016a, blocks: (B:61:0x012c, B:63:0x013e, B:64:0x0146), top: B:79:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0146 A[Catch: all -> 0x016a, TRY_LEAVE, TryCatch #1 {all -> 0x016a, blocks: (B:61:0x012c, B:63:0x013e, B:64:0x0146), top: B:79:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0156  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object e(O o10, boolean z3, c cVar) {
        D d2;
        F f10;
        C1767a c1767a;
        O o11;
        boolean z8;
        F f11;
        D d10;
        C1767a c1767a2;
        F f12;
        Object objLock;
        D d11;
        F f13;
        int iHashCode;
        Object version;
        O o12;
        int i7;
        Object obj;
        o10.getClass();
        if (cVar instanceof D) {
            d2 = (D) cVar;
            int i10 = d2.f37920j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                d2.f37920j = i10 - Integer.MIN_VALUE;
            } else {
                d2 = new D(o10, cVar);
            }
        } else {
            d2 = new D(o10, cVar);
        }
        Object version2 = d2.f37918g;
        Object c1769b = Ef.a.f2423a;
        try {
            switch (d2.f37920j) {
                case 0:
                    g.M(version2);
                    if (z3) {
                        d2.f37912a = o10;
                        d2.f37916e = z3;
                        d2.f37920j = 1;
                        version2 = o10.h(d2);
                        if (version2 != c1769b) {
                            if (version2 != null) {
                                iHashCode = version2.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            InterProcessCoordinator interProcessCoordinatorF = o10.f();
                            d2.f37912a = o10;
                            d2.f37913b = version2;
                            d2.f37916e = z3;
                            d2.f37917f = iHashCode;
                            d2.f37920j = 2;
                            version = interProcessCoordinatorF.getVersion(d2);
                            if (version != c1769b) {
                                o12 = o10;
                                i7 = iHashCode;
                                obj = version2;
                                version2 = version;
                                return new C1769b(obj, i7, ((Number) version2).intValue());
                            }
                        }
                    } else {
                        InterProcessCoordinator interProcessCoordinatorF2 = o10.f();
                        d2.f37912a = o10;
                        d2.f37916e = z3;
                        d2.f37920j = 3;
                        version2 = interProcessCoordinatorF2.getVersion(d2);
                        if (version2 != c1769b) {
                            int iIntValue = ((Number) version2).intValue();
                            InterProcessCoordinator interProcessCoordinatorF3 = o10.f();
                            E e10 = new E(o10, iIntValue, null);
                            d2.f37912a = o10;
                            d2.f37916e = z3;
                            d2.f37920j = 4;
                            version2 = interProcessCoordinatorF3.tryLock(e10, d2);
                            if (version2 == c1769b) {
                            }
                            return (C1769b) version2;
                        }
                    }
                    return c1769b;
                case 1:
                    z3 = d2.f37916e;
                    o10 = (O) d2.f37912a;
                    g.M(version2);
                    if (version2 != null) {
                        iHashCode = version2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    InterProcessCoordinator interProcessCoordinatorF4 = o10.f();
                    d2.f37912a = o10;
                    d2.f37913b = version2;
                    d2.f37916e = z3;
                    d2.f37917f = iHashCode;
                    d2.f37920j = 2;
                    version = interProcessCoordinatorF4.getVersion(d2);
                    if (version != c1769b) {
                        o12 = o10;
                        i7 = iHashCode;
                        obj = version2;
                        version2 = version;
                        return new C1769b(obj, i7, ((Number) version2).intValue());
                    }
                    return c1769b;
                case 2:
                    i7 = d2.f37917f;
                    z3 = d2.f37916e;
                    obj = d2.f37913b;
                    o12 = (O) d2.f37912a;
                    try {
                        g.M(version2);
                        return new C1769b(obj, i7, ((Number) version2).intValue());
                    } catch (C1767a e11) {
                        e = e11;
                        o10 = o12;
                        f10 = new F();
                        CorruptionHandler corruptionHandler = o10.f37962b;
                        d2.f37912a = o10;
                        d2.f37913b = e;
                        d2.f37914c = f10;
                        d2.f37915d = f10;
                        d2.f37916e = z3;
                        d2.f37920j = 5;
                        Object objHandleCorruption = corruptionHandler.handleCorruption(e, d2);
                        if (objHandleCorruption != c1769b) {
                            c1767a = e;
                            version2 = objHandleCorruption;
                            o11 = o10;
                            z8 = z3;
                            f11 = f10;
                            f11.f38951a = version2;
                            d10 = new D();
                            try {
                                f12 = new F(f10, o11, d10, null);
                                d2.f37912a = c1767a;
                                d2.f37913b = f10;
                                d2.f37914c = d10;
                                d2.f37915d = null;
                                d2.f37920j = 6;
                                if (z8) {
                                    o11.getClass();
                                    objLock = f12.invoke(d2);
                                } else {
                                    objLock = o11.f().lock(new C1788v(f12, null), d2);
                                }
                                if (objLock != c1769b) {
                                    d11 = d10;
                                    f13 = f10;
                                    Object obj2 = f13.f38951a;
                                    c1769b = new C1769b(obj2, obj2 != null ? obj2.hashCode() : 0, d11.f38949a);
                                }
                            } catch (Throwable th) {
                                th = th;
                                c1767a2 = c1767a;
                                C2126e.a(c1767a2, th);
                                throw c1767a2;
                            }
                        }
                        return c1769b;
                    }
                case 3:
                    z3 = d2.f37916e;
                    o10 = (O) d2.f37912a;
                    g.M(version2);
                    int iIntValue2 = ((Number) version2).intValue();
                    InterProcessCoordinator interProcessCoordinatorF5 = o10.f();
                    E e12 = new E(o10, iIntValue2, null);
                    d2.f37912a = o10;
                    d2.f37916e = z3;
                    d2.f37920j = 4;
                    version2 = interProcessCoordinatorF5.tryLock(e12, d2);
                    if (version2 == c1769b) {
                        return c1769b;
                    }
                    return (C1769b) version2;
                case 4:
                    boolean z10 = d2.f37916e;
                    g.M(version2);
                    return (C1769b) version2;
                case 5:
                    z8 = d2.f37916e;
                    f11 = d2.f37915d;
                    f10 = (F) d2.f37914c;
                    c1767a = (C1767a) d2.f37913b;
                    o11 = (O) d2.f37912a;
                    g.M(version2);
                    f11.f38951a = version2;
                    d10 = new D();
                    f12 = new F(f10, o11, d10, null);
                    d2.f37912a = c1767a;
                    d2.f37913b = f10;
                    d2.f37914c = d10;
                    d2.f37915d = null;
                    d2.f37920j = 6;
                    if (z8) {
                        o11.getClass();
                        objLock = f12.invoke(d2);
                    } else {
                        objLock = o11.f().lock(new C1788v(f12, null), d2);
                    }
                    if (objLock != c1769b) {
                        d11 = d10;
                        f13 = f10;
                        Object obj3 = f13.f38951a;
                        c1769b = new C1769b(obj3, obj3 != null ? obj3.hashCode() : 0, d11.f38949a);
                    }
                    return c1769b;
                case 6:
                    d11 = (D) d2.f37914c;
                    f13 = (F) d2.f37913b;
                    c1767a2 = (C1767a) d2.f37912a;
                    try {
                        g.M(version2);
                        Object obj4 = f13.f38951a;
                        c1769b = new C1769b(obj4, obj4 != null ? obj4.hashCode() : 0, d11.f38949a);
                        return c1769b;
                    } catch (Throwable th2) {
                        th = th2;
                        C2126e.a(c1767a2, th);
                        throw c1767a2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (C1767a e13) {
            e = e13;
        }
    }

    public final InterProcessCoordinator f() {
        return (InterProcessCoordinator) this.f37971k.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4.h(r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(Ff.c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p135j0.C1792z
            if (r0 == 0) goto L13
            r0 = r6
            j0.z r0 = (p135j0.C1792z) r0
            int r1 = r0.f38177e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38177e = r1
            goto L18
        L13:
            j0.z r0 = new j0.z
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f38175c
            Ef.a r1 = Ef.a.f2423a
            int r2 = r0.f38177e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r1 = r0.f38174b
            j0.O r0 = r0.f38173a
            androidx.camera.core.impl.utils.executor.g.M(r6)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r6 = move-exception
            goto L6f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            j0.O r2 = r0.f38173a
            androidx.camera.core.impl.utils.executor.g.M(r6)
            goto L51
        L3e:
            androidx.camera.core.impl.utils.executor.g.M(r6)
            androidx.datastore.core.InterProcessCoordinator r6 = r5.f()
            r0.f38173a = r5
            r0.f38177e = r4
            java.lang.Object r6 = r6.getVersion(r0)
            if (r6 != r1) goto L50
            goto L65
        L50:
            r2 = r5
        L51:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            O2.a r4 = r2.f37969i     // Catch: java.lang.Throwable -> L6d
            r0.f38173a = r2     // Catch: java.lang.Throwable -> L6d
            r0.f38174b = r6     // Catch: java.lang.Throwable -> L6d
            r0.f38177e = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r6 = r4.h(r0)     // Catch: java.lang.Throwable -> L6d
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            kotlin.Unit r6 = kotlin.Unit.f38893a
            return r6
        L69:
            r1 = r6
            r6 = r0
            r0 = r2
            goto L6f
        L6d:
            r0 = move-exception
            goto L69
        L6f:
            Sd.b r0 = r0.f37968h
            j0.n0 r2 = new j0.n0
            r2.<init>(r1, r6)
            r0.e(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p135j0.O.g(Ff.c):java.lang.Object");
    }

    @Override // androidx.datastore.core.DataStore
    public final Flow getData() {
        return this.f37964d;
    }

    public final Object h(c cVar) {
        return ((StorageConnection) this.f37970j.getValue()).readScope(new r(3, (Continuation) null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(Object obj, boolean z3, c cVar) {
        M m7;
        D d2;
        if (cVar instanceof M) {
            m7 = (M) cVar;
            int i7 = m7.f37952d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                m7.f37952d = i7 - Integer.MIN_VALUE;
            } else {
                m7 = new M(this, cVar);
            }
        } else {
            m7 = new M(this, cVar);
        }
        Object obj2 = m7.f37950b;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = m7.f37952d;
        if (i10 == 0) {
            g.M(obj2);
            D d10 = new D();
            StorageConnection storageConnection = (StorageConnection) this.f37970j.getValue();
            N n10 = new N(d10, this, obj, z3, null);
            m7.f37949a = d10;
            m7.f37952d = 1;
            if (storageConnection.writeScope(n10, m7) == aVar) {
                return aVar;
            }
            d2 = d10;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d2 = m7.f37949a;
            g.M(obj2);
        }
        return new Integer(d2.f38949a);
    }

    @Override // androidx.datastore.core.DataStore
    public final Object updateData(Function2 function2, Continuation continuation) {
        A0 a3 = (A0) continuation.getContext().get(y0.f38172a);
        if (a3 != null) {
            a3.a(this);
        }
        return AbstractC0780y.s(new A0(a3, this), new J(this, function2, null), continuation);
    }
}
