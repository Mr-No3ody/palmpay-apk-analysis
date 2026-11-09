package p041ce;

import Ff.h;
import com.transsnet.palmpay.teller.ui.view.ModelAvailableCouponAndPointItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ModelAvailableCouponAndPointItem f18970c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Continuation continuation, ModelAvailableCouponAndPointItem modelAvailableCouponAndPointItem) {
        super(2, continuation);
        this.f18970c = modelAvailableCouponAndPointItem;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        u uVar = new u(continuation, this.f18970c);
        uVar.f18969b = obj;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (Wf.AbstractC0780y.s(r2, r5, r8) == r0) goto L34;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r8.f18968a
            com.transsnet.palmpay.teller.ui.view.ModelAvailableCouponAndPointItem r2 = r8.f18970c
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2b
            if (r1 == r6) goto L25
            if (r1 == r5) goto L1f
            if (r1 != r4) goto L17
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L8b
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            java.lang.Object r1 = r8.f18969b
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L71
        L25:
            androidx.camera.core.impl.utils.executor.g.M(r9)     // Catch: java.lang.Throwable -> L29
            goto L49
        L29:
            r9 = move-exception
            goto L4f
        L2b:
            androidx.camera.core.impl.utils.executor.g.M(r9)
            java.lang.Object r9 = r8.f18969b
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            xf.o r9 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L29
            Sd.b r9 = Qd.a.f7847a     // Catch: java.lang.Throwable -> L29
            java.lang.Object r9 = r9.f8871b     // Catch: java.lang.Throwable -> L29
            com.transsnet.palmpay.teller.business.IApiTellerService r9 = (com.transsnet.palmpay.teller.business.IApiTellerService) r9     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r2.f34332e     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L40
            java.lang.String r1 = ""
        L40:
            r8.f18968a = r6     // Catch: java.lang.Throwable -> L29
            java.lang.Object r9 = r9.queryCouponAndPointInfo(r1, r8)     // Catch: java.lang.Throwable -> L29
            if (r9 != r0) goto L49
            goto L8a
        L49:
            com.transsnet.palmpay.core.bean.CommonResult r9 = (com.transsnet.palmpay.core.bean.CommonResult) r9     // Catch: java.lang.Throwable -> L29
            xf.o r1 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L29
        L4d:
            r1 = r9
            goto L56
        L4f:
            xf.o r1 = p355xf.q.f43977a
            xf.p r9 = androidx.camera.core.impl.utils.executor.g.f(r9)
            goto L4d
        L56:
            boolean r9 = r1 instanceof p355xf.p
            if (r9 != 0) goto L71
            r9 = r1
            com.transsnet.palmpay.core.bean.CommonResult r9 = (com.transsnet.palmpay.core.bean.CommonResult) r9
            cg.f r6 = Wf.I.f10809a
            Wf.p0 r6 = p015ag.o.f11960a
            ce.s r7 = new ce.s
            r7.<init>(r9, r3, r2)
            r8.f18969b = r1
            r8.f18968a = r5
            java.lang.Object r9 = Wf.AbstractC0780y.s(r6, r7, r8)
            if (r9 != r0) goto L71
            goto L8a
        L71:
            java.lang.Throwable r9 = p355xf.q.a(r1)
            if (r9 == 0) goto L8b
            cg.f r2 = Wf.I.f10809a
            Wf.p0 r2 = p015ag.o.f11960a
            ce.t r5 = new ce.t
            r5.<init>(r3, r9)
            r8.f18969b = r1
            r8.f18968a = r4
            java.lang.Object r9 = Wf.AbstractC0780y.s(r2, r5, r8)
            if (r9 != r0) goto L8b
        L8a:
            return r0
        L8b:
            kotlin.Unit r9 = kotlin.Unit.f38893a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p041ce.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
