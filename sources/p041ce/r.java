package p041ce;

import Ff.h;
import com.transsnet.palmpay.teller.ui.view.ModelAvailableCouponAndPointItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ModelAvailableCouponAndPointItem f18963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f18964d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Continuation continuation, ModelAvailableCouponAndPointItem modelAvailableCouponAndPointItem, o oVar) {
        super(2, continuation);
        this.f18963c = modelAvailableCouponAndPointItem;
        this.f18964d = oVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        r rVar = new r(continuation, this.f18963c, this.f18964d);
        rVar.f18962b = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        if (Wf.AbstractC0780y.s(r5, r6, r9) == r0) goto L31;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r9.f18961a
            com.transsnet.palmpay.teller.ui.view.ModelAvailableCouponAndPointItem r2 = r9.f18963c
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2b
            if (r1 == r6) goto L25
            if (r1 == r5) goto L1f
            if (r1 != r4) goto L17
            androidx.camera.core.impl.utils.executor.g.M(r10)
            goto L89
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            java.lang.Object r1 = r9.f18962b
            androidx.camera.core.impl.utils.executor.g.M(r10)
            goto L6f
        L25:
            androidx.camera.core.impl.utils.executor.g.M(r10)     // Catch: java.lang.Throwable -> L29
            goto L45
        L29:
            r10 = move-exception
            goto L4b
        L2b:
            androidx.camera.core.impl.utils.executor.g.M(r10)
            java.lang.Object r10 = r9.f18962b
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            xf.o r10 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L29
            Sd.b r10 = Qd.a.f7847a     // Catch: java.lang.Throwable -> L29
            java.lang.Object r10 = r10.f8871b     // Catch: java.lang.Throwable -> L29
            com.transsnet.palmpay.teller.business.IApiTellerService r10 = (com.transsnet.palmpay.teller.business.IApiTellerService) r10     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r2.f34332e     // Catch: java.lang.Throwable -> L29
            r9.f18961a = r6     // Catch: java.lang.Throwable -> L29
            java.lang.Object r10 = r10.queryCoupon(r1, r9)     // Catch: java.lang.Throwable -> L29
            if (r10 != r0) goto L45
            goto L88
        L45:
            com.transsnet.palmpay.core.bean.CommonResult r10 = (com.transsnet.palmpay.core.bean.CommonResult) r10     // Catch: java.lang.Throwable -> L29
            xf.o r1 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L29
        L49:
            r1 = r10
            goto L52
        L4b:
            xf.o r1 = p355xf.q.f43977a
            xf.p r10 = androidx.camera.core.impl.utils.executor.g.f(r10)
            goto L49
        L52:
            boolean r10 = r1 instanceof p355xf.p
            if (r10 != 0) goto L6f
            r10 = r1
            com.transsnet.palmpay.core.bean.CommonResult r10 = (com.transsnet.palmpay.core.bean.CommonResult) r10
            cg.f r6 = Wf.I.f10809a
            Wf.p0 r6 = p015ag.o.f11960a
            ce.p r7 = new ce.p
            ce.o r8 = r9.f18964d
            r7.<init>(r10, r3, r2, r8)
            r9.f18962b = r1
            r9.f18961a = r5
            java.lang.Object r10 = Wf.AbstractC0780y.s(r6, r7, r9)
            if (r10 != r0) goto L6f
            goto L88
        L6f:
            java.lang.Throwable r10 = p355xf.q.a(r1)
            if (r10 == 0) goto L89
            cg.f r5 = Wf.I.f10809a
            Wf.p0 r5 = p015ag.o.f11960a
            ce.q r6 = new ce.q
            r6.<init>(r10, r3, r2)
            r9.f18962b = r1
            r9.f18961a = r4
            java.lang.Object r10 = Wf.AbstractC0780y.s(r5, r6, r9)
            if (r10 != r0) goto L89
        L88:
            return r0
        L89:
            kotlin.Unit r10 = kotlin.Unit.f38893a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p041ce.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
