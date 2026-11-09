package p135j0;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L f38120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f38122c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, Continuation continuation) {
        super(2, continuation);
        this.f38122c = r0Var;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new q0(this.f38122c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0047 A[PHI: r1 r7
      0x0047: PHI (r1v1 j0.L) = (r1v2 j0.L), (r1v3 j0.L) binds: [B:13:0x0044, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
      0x0047: PHI (r7v6 java.lang.Object) = (r7v11 java.lang.Object), (r7v0 java.lang.Object) binds: [B:13:0x0044, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r1.invoke(r7, r6) == r0) goto L17;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0050 -> B:18:0x0053). Please report as a decompilation issue!!! */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r6.f38121b
            r2 = 2
            r3 = 1
            j0.r0 r4 = r6.f38122c
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            androidx.camera.core.impl.utils.executor.g.M(r7)
            goto L53
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            j0.L r1 = r6.f38120a
            androidx.camera.core.impl.utils.executor.g.M(r7)
            goto L47
        L20:
            androidx.camera.core.impl.utils.executor.g.M(r7)
            Pa.w r7 = r4.f38129d
            java.lang.Object r7 = r7.f7166b
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.get()
            if (r7 <= 0) goto L62
        L2f:
            kotlinx.coroutines.CoroutineScope r7 = r4.f38126a
            kotlin.coroutines.CoroutineContext r7 = r7.getF17355b()
            Wf.AbstractC0780y.g(r7)
            j0.L r1 = r4.f38127b
            Yf.n r7 = r4.f38128c
            r6.f38120a = r1
            r6.f38121b = r3
            java.lang.Object r7 = r7.receive(r6)
            if (r7 != r0) goto L47
            goto L52
        L47:
            r5 = 0
            r6.f38120a = r5
            r6.f38121b = r2
            java.lang.Object r7 = r1.invoke(r7, r6)
            if (r7 != r0) goto L53
        L52:
            return r0
        L53:
            Pa.w r7 = r4.f38129d
            java.lang.Object r7 = r7.f7166b
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L2f
            kotlin.Unit r7 = kotlin.Unit.f38893a
            return r7
        L62:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p135j0.q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
