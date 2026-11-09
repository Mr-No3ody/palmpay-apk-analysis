package p098ga;

import Ff.h;
import com.transsnet.palmpay.core.base.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f37020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f37021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f37022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f37023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f37024g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(boolean z3, l lVar, long j6, boolean z8, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f37020c = z3;
        this.f37021d = lVar;
        this.f37022e = j6;
        this.f37023f = z8;
        this.f37024g = (h) function1;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [Ff.h, kotlin.jvm.functions.Function1] */
    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        ?? r10 = this.f37024g;
        c cVar = new c(this.f37020c, this.f37021d, this.f37022e, this.f37023f, r10, continuation);
        cVar.f37019b = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r10 == r0) goto L32;
     */
    /* JADX WARN: Type inference failed for: r10v11, types: [Ff.h, kotlin.jvm.functions.Function1] */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r9.f37018a
            r2 = 2
            r3 = 1
            com.transsnet.palmpay.core.base.l r4 = r9.f37021d
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            androidx.camera.core.impl.utils.executor.g.M(r10)     // Catch: java.lang.Throwable -> L12
            goto L70
        L12:
            r10 = move-exception
            goto L73
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1c:
            java.lang.Object r1 = r9.f37019b
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            androidx.camera.core.impl.utils.executor.g.M(r10)
            goto L50
        L24:
            androidx.camera.core.impl.utils.executor.g.M(r10)
            java.lang.Object r10 = r9.f37019b
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            com.palmpay.lib.apm.network.NQEManager r1 = com.palmpay.lib.apm.network.NQEManager.INSTANCE
            boolean r1 = r1.isNetworkOffline()
            if (r1 == 0) goto L3d
            boolean r10 = r9.f37020c
            if (r10 == 0) goto L3a
            org.chromium.support_lib_boundary.util.b.F(r4)
        L3a:
            kotlin.Unit r10 = kotlin.Unit.f38893a
            return r10
        L3d:
            long r5 = r9.f37022e
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L50
            r9.f37019b = r10
            r9.f37018a = r3
            java.lang.Object r10 = Wf.D.b(r5, r9)
            if (r10 != r0) goto L50
            goto L6f
        L50:
            Ff.h r10 = r9.f37024g
            xf.o r1 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L12
            boolean r1 = r9.f37023f
            if (r1 == 0) goto L5d
            com.transsnet.palmpay.core.base.o r1 = com.transsnet.palmpay.core.base.o.f27359a     // Catch: java.lang.Throwable -> L12
            r4.k(r1)     // Catch: java.lang.Throwable -> L12
        L5d:
            Wf.s r1 = Pa.I.f7021a     // Catch: java.lang.Throwable -> L12
            ga.b r3 = new ga.b     // Catch: java.lang.Throwable -> L12
            r5 = 0
            r3.<init>(r10, r5)     // Catch: java.lang.Throwable -> L12
            r9.f37019b = r5     // Catch: java.lang.Throwable -> L12
            r9.f37018a = r2     // Catch: java.lang.Throwable -> L12
            java.lang.Object r10 = Wf.AbstractC0780y.s(r1, r3, r9)     // Catch: java.lang.Throwable -> L12
            if (r10 != r0) goto L70
        L6f:
            return r0
        L70:
            xf.o r0 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L12
            goto L79
        L73:
            xf.o r0 = p355xf.q.f43977a
            xf.p r10 = androidx.camera.core.impl.utils.executor.g.f(r10)
        L79:
            boolean r0 = r10 instanceof p355xf.p
            if (r0 != 0) goto L80
            org.chromium.support_lib_boundary.util.b.B(r4, r10)
        L80:
            java.lang.Throwable r10 = p355xf.q.a(r10)
            if (r10 == 0) goto L89
            org.chromium.support_lib_boundary.util.b.D(r4, r10)
        L89:
            kotlin.Unit r10 = kotlin.Unit.f38893a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p098ga.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
