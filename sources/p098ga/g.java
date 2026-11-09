package p098ga;

import Ff.h;
import com.transsnet.palmpay.core.base.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f37036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f37037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f37038e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(long j6, l lVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f37036c = j6;
        this.f37037d = lVar;
        this.f37038e = (h) function1;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Ff.h, kotlin.jvm.functions.Function1] */
    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        g gVar = new g(this.f37036c, this.f37037d, this.f37038e, continuation);
        gVar.f37035b = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r10 == r0) goto L25;
     */
    /* JADX WARN: Type inference failed for: r10v10, types: [Ff.h, kotlin.jvm.functions.Function1] */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r9.f37034a
            r2 = 2
            r3 = 1
            com.transsnet.palmpay.core.base.l r4 = r9.f37037d
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            androidx.camera.core.impl.utils.executor.g.M(r10)     // Catch: java.lang.Throwable -> L12
            goto L65
        L12:
            r10 = move-exception
            goto L68
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1c:
            java.lang.Object r1 = r9.f37035b
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            androidx.camera.core.impl.utils.executor.g.M(r10)
            goto L49
        L24:
            androidx.camera.core.impl.utils.executor.g.M(r10)
            java.lang.Object r10 = r9.f37035b
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            com.palmpay.lib.apm.network.NQEManager r1 = com.palmpay.lib.apm.network.NQEManager.INSTANCE
            boolean r1 = r1.isNetworkOffline()
            if (r1 == 0) goto L36
            kotlin.Unit r10 = kotlin.Unit.f38893a
            return r10
        L36:
            long r5 = r9.f37036c
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L49
            r9.f37035b = r10
            r9.f37034a = r3
            java.lang.Object r10 = Wf.D.b(r5, r9)
            if (r10 != r0) goto L49
            goto L64
        L49:
            Ff.h r10 = r9.f37038e
            xf.o r1 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L12
            com.transsnet.palmpay.core.base.o r1 = com.transsnet.palmpay.core.base.o.f27359a     // Catch: java.lang.Throwable -> L12
            r4.k(r1)     // Catch: java.lang.Throwable -> L12
            Wf.s r1 = Pa.I.f7021a     // Catch: java.lang.Throwable -> L12
            ga.f r3 = new ga.f     // Catch: java.lang.Throwable -> L12
            r5 = 0
            r3.<init>(r10, r5)     // Catch: java.lang.Throwable -> L12
            r9.f37035b = r5     // Catch: java.lang.Throwable -> L12
            r9.f37034a = r2     // Catch: java.lang.Throwable -> L12
            java.lang.Object r10 = Wf.AbstractC0780y.s(r1, r3, r9)     // Catch: java.lang.Throwable -> L12
            if (r10 != r0) goto L65
        L64:
            return r0
        L65:
            xf.o r0 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L12
            goto L6e
        L68:
            xf.o r0 = p355xf.q.f43977a
            xf.p r10 = androidx.camera.core.impl.utils.executor.g.f(r10)
        L6e:
            boolean r0 = r10 instanceof p355xf.p
            if (r0 != 0) goto L75
            org.chromium.support_lib_boundary.util.b.C(r4, r10)
        L75:
            java.lang.Throwable r10 = p355xf.q.a(r10)
            if (r10 == 0) goto L7e
            org.chromium.support_lib_boundary.util.b.E(r4, r10)
        L7e:
            kotlin.Unit r10 = kotlin.Unit.f38893a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p098ga.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
