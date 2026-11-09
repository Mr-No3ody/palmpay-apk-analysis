package Me;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f5992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f5994c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, Continuation continuation) {
        super(2, continuation);
        this.f5994c = rVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new q(this.f5994c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        if (Wf.AbstractC0780y.s(r10, r1, r9) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        if (Wf.AbstractC0780y.s(r10, r1, r9) == r0) goto L33;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r9.f5993b
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            Me.r r7 = r9.f5994c
            if (r1 == 0) goto L2e
            if (r1 == r5) goto L28
            if (r1 == r4) goto L23
            if (r1 == r3) goto L23
            if (r1 == r2) goto L1d
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            java.lang.Throwable r0 = r9.f5992a
            androidx.camera.core.impl.utils.executor.g.M(r10)
            goto L8b
        L23:
            androidx.camera.core.impl.utils.executor.g.M(r10)
            goto L9e
        L28:
            androidx.camera.core.impl.utils.executor.g.M(r10)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8c
            goto L4f
        L2c:
            r10 = move-exception
            goto L76
        L2e:
            androidx.camera.core.impl.utils.executor.g.M(r10)
            m6.j r10 = Cc.a.f1353a     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8c
            java.lang.Object r10 = r10.f39520b     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8c
            com.transsnet.palmpay.main.export.business.IApiMainService r10 = (com.transsnet.palmpay.main.export.business.IApiMainService) r10     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8c
            com.transsnet.palmpay.main.export.bean.req.BatchClaimPointReq r1 = new com.transsnet.palmpay.main.export.bean.req.BatchClaimPointReq     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8c
            r1.<init>()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8c
            xf.t r8 = r7.f6002o     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8c
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8c
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8c
            r1.bizIdList = r8     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8c
            r9.f5993b = r5     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8c
            java.lang.Object r10 = r10.batchClaimPoint(r1, r9)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8c
            if (r10 != r0) goto L4f
            goto L9d
        L4f:
            com.transsnet.palmpay.core.bean.CommonResult r10 = (com.transsnet.palmpay.core.bean.CommonResult) r10     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8c
            boolean r10 = r10.isSuccess()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8c
            if (r10 == 0) goto L64
            java.lang.String r10 = "Claim successful."
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8c
            com.transsnet.palmpay.util.ToastUtils.showLong(r10, r1)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8c
            java.lang.String r10 = "PointHome"
            com.palmpay.lib.apm.launchcounter.util.d.x(r6, r10)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L8c
        L64:
            cg.f r10 = Wf.I.f10809a
            Wf.p0 r10 = p015ag.o.f11960a
            Me.p r1 = new Me.p
            r1.<init>(r7, r6)
            r9.f5993b = r4
            java.lang.Object r10 = Wf.AbstractC0780y.s(r10, r1, r9)
            if (r10 != r0) goto L9e
            goto L9d
        L76:
            cg.f r1 = Wf.I.f10809a
            Wf.p0 r1 = p015ag.o.f11960a
            Me.p r3 = new Me.p
            r3.<init>(r7, r6)
            r9.f5992a = r10
            r9.f5993b = r2
            java.lang.Object r1 = Wf.AbstractC0780y.s(r1, r3, r9)
            if (r1 != r0) goto L8a
            goto L9d
        L8a:
            r0 = r10
        L8b:
            throw r0
        L8c:
            cg.f r10 = Wf.I.f10809a
            Wf.p0 r10 = p015ag.o.f11960a
            Me.p r1 = new Me.p
            r1.<init>(r7, r6)
            r9.f5993b = r3
            java.lang.Object r10 = Wf.AbstractC0780y.s(r10, r1, r9)
            if (r10 != r0) goto L9e
        L9d:
            return r0
        L9e:
            kotlin.Unit r10 = kotlin.Unit.f38893a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Me.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
