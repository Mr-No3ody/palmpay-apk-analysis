package p204nb;

import Ef.a;
import F6.d;
import Ff.c;
import Wf.AbstractC0780y;
import Wf.C0769m;
import androidx.camera.core.impl.utils.executor.g;
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.sync.Mutex;
import p072eg.e;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C0769m f39916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C0769m f39917d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f39914a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f39915b = new e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f39918e = new e();

    public static final boolean a(Exception exc) {
        String message;
        String message2;
        return (exc instanceof IOException) || (exc instanceof SocketTimeoutException) || ((message = exc.getMessage()) != null && StringsKt.A(message, "timeout", true)) || ((message2 = exc.getMessage()) != null && StringsKt.A(message2, "network", true));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(String str, Continuation continuation) throws Throwable {
        i iVar;
        Mutex mutex;
        Mutex mutex2;
        Mutex mutex3;
        Exception e10;
        CompletableDeferred completableDeferred;
        Mutex mutex4;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i7 = iVar.f39894e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                iVar.f39894e = i7 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, continuation);
            }
        } else {
            iVar = new i(this, continuation);
        }
        Object obj = iVar.f39892c;
        Object obj2 = a.f2423a;
        int i10 = iVar.f39894e;
        try {
            try {
                if (i10 == 0) {
                    g.M(obj);
                    iVar.f39890a = str;
                    mutex2 = f39915b;
                    iVar.f39891b = mutex2;
                    iVar.f39894e = 1;
                    if (mutex2.lock(null, iVar) != obj2) {
                    }
                    return obj2;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        mutex = (Mutex) iVar.f39890a;
                        try {
                            g.M(obj);
                            mutex4 = mutex;
                            mutex4.unlock(null);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            mutex.unlock(null);
                            throw th;
                        }
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    completableDeferred = (CompletableDeferred) iVar.f39891b;
                    mutex3 = (Mutex) iVar.f39890a;
                    try {
                        try {
                            g.M(obj);
                            Boolean bool = (Boolean) obj;
                            bool.getClass();
                            completableDeferred.complete(bool);
                            f39916c = null;
                            mutex3.unlock(null);
                            return bool;
                        } catch (Exception e11) {
                            e10 = e11;
                            d.c("LoanBankSilentAuth", "ensure failed", e10);
                            Boolean bool2 = Boolean.FALSE;
                            completableDeferred.complete(bool2);
                            f39916c = null;
                            mutex3.unlock(null);
                            return bool2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        f39916c = null;
                        throw th;
                    }
                }
                Mutex mutex5 = (Mutex) iVar.f39891b;
                String str2 = (String) iVar.f39890a;
                g.M(obj);
                mutex2 = mutex5;
                str = str2;
                C0769m c0769m = f39916c;
                if (c0769m != null) {
                    iVar.f39890a = mutex2;
                    iVar.f39891b = null;
                    iVar.f39894e = 2;
                    Object objC = c0769m.c(iVar);
                    if (objC != obj2) {
                        Mutex mutex6 = mutex2;
                        obj = objC;
                        mutex4 = mutex6;
                        mutex4.unlock(null);
                        return obj;
                    }
                } else {
                    C0769m c0769mA = AbstractC0780y.a();
                    f39916c = c0769mA;
                    try {
                        q qVar = f39914a;
                        iVar.f39890a = mutex2;
                        iVar.f39891b = c0769mA;
                        iVar.f39894e = 3;
                        Object objC2 = qVar.c(str, iVar);
                        if (objC2 != obj2) {
                            mutex3 = mutex2;
                            obj = objC2;
                            completableDeferred = c0769mA;
                            Boolean bool3 = (Boolean) obj;
                            bool3.getClass();
                            completableDeferred.complete(bool3);
                            f39916c = null;
                            mutex3.unlock(null);
                            return bool3;
                        }
                    } catch (Exception e12) {
                        mutex3 = mutex2;
                        e10 = e12;
                        completableDeferred = c0769mA;
                        d.c("LoanBankSilentAuth", "ensure failed", e10);
                        Boolean bool4 = Boolean.FALSE;
                        completableDeferred.complete(bool4);
                        f39916c = null;
                        mutex3.unlock(null);
                        return bool4;
                    } catch (Throwable th3) {
                        th = th3;
                        f39916c = null;
                        throw th;
                    }
                }
                return obj2;
            } catch (Throwable th4) {
                Mutex mutex7 = mutex2;
                th = th4;
                mutex = mutex7;
                mutex.unlock(null);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            mutex = iVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r9 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, Ff.c r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204nb.q.c(java.lang.String, Ff.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r0v13, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [Ff.c, kotlin.coroutines.Continuation, nb.n] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v2, types: [Wf.m, Wf.n0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [nb.q] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v4, types: [eg.e, kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r9v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object d(c cVar) throws Throwable {
        ?? nVar;
        ?? r10;
        ?? r11;
        Throwable th;
        ?? r3;
        C0769m c0769m;
        ?? r12;
        if (cVar instanceof n) {
            n nVar2 = (n) cVar;
            int i7 = nVar2.f39907e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                nVar2.f39907e = i7 - Integer.MIN_VALUE;
                nVar = nVar2;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object obj = nVar.f39905c;
        a aVar = a.f2423a;
        int i10 = nVar.f39907e;
        try {
            try {
                if (i10 == 0) {
                    g.M(obj);
                    r10 = f39918e;
                    nVar.f39903a = r10;
                    nVar.f39907e = 1;
                    if (r10.lock(null, nVar) != aVar) {
                    }
                    r11 = r10;
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        Mutex mutex = nVar.f39903a;
                        g.M(obj);
                        r12 = mutex;
                        r12.unlock(null);
                        return obj;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0769m = nVar.f39904b;
                    Mutex mutex2 = nVar.f39903a;
                    try {
                        g.M(obj);
                        r3 = mutex2;
                        e eVar = (e) obj;
                        c0769m.complete(eVar);
                        f39917d = null;
                        r3.unlock(null);
                        return eVar;
                    } catch (Throwable th2) {
                        th = th2;
                        f39917d = null;
                        throw th;
                    }
                }
                Mutex mutex3 = nVar.f39903a;
                g.M(obj);
                r11 = mutex3;
                r11 = r10;
                ?? r13 = f39917d;
                if (r13 != 0) {
                    nVar.f39903a = r11;
                    nVar.f39907e = 2;
                    Object objC = r13.c(nVar);
                    if (objC != aVar) {
                        r12 = r11;
                        obj = objC;
                        r12.unlock(null);
                        return obj;
                    }
                } else {
                    C0769m c0769mA = AbstractC0780y.a();
                    f39917d = c0769mA;
                    try {
                        ?? r14 = f39914a;
                        nVar.f39903a = r11;
                        nVar.f39904b = c0769mA;
                        nVar.f39907e = 3;
                        Object objE = r14.e(nVar);
                        if (objE != aVar) {
                            r3 = r11;
                            obj = objE;
                            c0769m = c0769mA;
                            e eVar2 = (e) obj;
                            c0769m.complete(eVar2);
                            f39917d = null;
                            r3.unlock(null);
                            return eVar2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        f39917d = null;
                        throw th;
                    }
                }
                r11 = r10;
                return aVar;
            } catch (Throwable th4) {
                nVar = r11;
                th = th4;
                nVar.unlock(null);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (r7 == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(Ff.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p204nb.o
            if (r0 == 0) goto L13
            r0 = r7
            nb.o r0 = (p204nb.o) r0
            int r1 = r0.f39910c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39910c = r1
            goto L18
        L13:
            nb.o r0 = new nb.o
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f39908a
            Ef.a r1 = Ef.a.f2423a
            int r2 = r0.f39910c
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L36
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            androidx.camera.core.impl.utils.executor.g.M(r7)
            goto L6e
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            androidx.camera.core.impl.utils.executor.g.M(r7)
            goto L4c
        L36:
            androidx.camera.core.impl.utils.executor.g.M(r7)
            r0.f39910c = r3
            cg.f r7 = Wf.I.f10809a
            cg.e r7 = p042cg.e.f19009c
            nb.j r2 = new nb.j
            r5 = 0
            r2.<init>(r4, r5)
            java.lang.Object r7 = Wf.AbstractC0780y.s(r7, r2, r0)
            if (r7 != r1) goto L4c
            goto L6d
        L4c:
            nb.b r7 = (p204nb.b) r7
            boolean r2 = r7.f39876a
            if (r2 != 0) goto L63
            nb.c r0 = new nb.c
            boolean r1 = r7.f39877b
            if (r1 == 0) goto L5b
            nb.a r1 = p204nb.a.f39873a
            goto L5d
        L5b:
            nb.a r1 = p204nb.a.f39874b
        L5d:
            java.lang.String r7 = r7.f39878c
            r0.<init>(r1, r7)
            return r0
        L63:
            nb.v r7 = p204nb.v.f39929a
            r0.f39910c = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L6e
        L6d:
            return r1
        L6e:
            nb.r r7 = (p204nb.r) r7
            nb.s r0 = r7.f39919a
            int r0 = r0.ordinal()
            if (r0 == 0) goto L94
            java.lang.String r7 = r7.f39920b
            if (r0 == r3) goto L8c
            if (r0 != r4) goto L86
            nb.c r0 = new nb.c
            nb.a r1 = p204nb.a.f39874b
            r0.<init>(r1, r7)
            return r0
        L86:
            xf.l r7 = new xf.l
            r7.<init>()
            throw r7
        L8c:
            nb.c r0 = new nb.c
            nb.a r1 = p204nb.a.f39873a
            r0.<init>(r1, r7)
            return r0
        L94:
            nb.d r7 = p204nb.d.f39881a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p204nb.q.e(Ff.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if (r7 == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(Ff.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p204nb.p
            if (r0 == 0) goto L13
            r0 = r7
            nb.p r0 = (p204nb.p) r0
            int r1 = r0.f39913c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39913c = r1
            goto L18
        L13:
            nb.p r0 = new nb.p
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f39911a
            Ef.a r1 = Ef.a.f2423a
            int r2 = r0.f39913c
            r3 = 0
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r5) goto L2b
            androidx.camera.core.impl.utils.executor.g.M(r7)
            goto L77
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            androidx.camera.core.impl.utils.executor.g.M(r7)
            goto L4d
        L37:
            androidx.camera.core.impl.utils.executor.g.M(r7)
            r0.f39913c = r4
            cg.f r7 = Wf.I.f10809a
            cg.e r7 = p042cg.e.f19009c
            nb.k r2 = new nb.k
            r4 = 0
            r2.<init>(r5, r4)
            java.lang.Object r7 = Wf.AbstractC0780y.s(r7, r2, r0)
            if (r7 != r1) goto L4d
            goto L76
        L4d:
            nb.f r7 = (p204nb.f) r7
            boolean r2 = r7.f39882a
            if (r2 != 0) goto L64
            nb.g r0 = new nb.g
            boolean r1 = r7.f39884c
            if (r1 == 0) goto L5c
            nb.a r1 = p204nb.a.f39873a
            goto L5e
        L5c:
            nb.a r1 = p204nb.a.f39874b
        L5e:
            java.lang.String r7 = r7.f39885d
            r0.<init>(r3, r1, r7)
            return r0
        L64:
            boolean r7 = r7.f39883b
            if (r7 == 0) goto L6e
            nb.g r7 = new nb.g
            r7.<init>()
            return r7
        L6e:
            r0.f39913c = r5
            java.lang.Object r7 = r6.d(r0)
            if (r7 != r1) goto L77
        L76:
            return r1
        L77:
            nb.e r7 = (p204nb.e) r7
            boolean r0 = r7 instanceof p204nb.d
            if (r0 == 0) goto L83
            nb.g r7 = new nb.g
            r7.<init>()
            return r7
        L83:
            java.lang.String r0 = "null cannot be cast to non-null type com.transsnet.palmpay.credit.manager.bankauth.LoanBankSilentAuthManager.InitializeTokenResult.Fail"
            kotlin.jvm.internal.Intrinsics.f(r7, r0)
            nb.c r7 = (p204nb.c) r7
            nb.g r0 = new nb.g
            nb.a r1 = r7.f39879a
            java.lang.String r7 = r7.f39880b
            r0.<init>(r3, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p204nb.q.f(Ff.c):java.lang.Object");
    }
}
