package p297te;

import Ff.h;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.MerchantPaymentActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f42606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MerchantPaymentActivity f42607c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Continuation continuation, MerchantPaymentActivity merchantPaymentActivity) {
        super(2, continuation);
        this.f42607c = merchantPaymentActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        c cVar = new c(continuation, this.f42607c);
        cVar.f42606b = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        if (Wf.AbstractC0780y.s(r3, r6, r9) == r0) goto L31;
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
            int r1 = r9.f42605a
            r2 = 3
            r3 = 1
            r4 = 0
            com.transsnet.palmpay.ui.activity.thirdpartymerchant.MerchantPaymentActivity r5 = r9.f42607c
            r6 = 2
            if (r1 == 0) goto L2b
            if (r1 == r3) goto L25
            if (r1 == r6) goto L1f
            if (r1 != r2) goto L17
            androidx.camera.core.impl.utils.executor.g.M(r10)
            goto L8d
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            java.lang.Object r1 = r9.f42606b
            androidx.camera.core.impl.utils.executor.g.M(r10)
            goto L73
        L25:
            androidx.camera.core.impl.utils.executor.g.M(r10)     // Catch: java.lang.Throwable -> L29
            goto L4b
        L29:
            r10 = move-exception
            goto L51
        L2b:
            androidx.camera.core.impl.utils.executor.g.M(r10)
            java.lang.Object r10 = r9.f42606b
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            xf.o r10 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L29
            m6.j r10 = Cc.a.f1353a     // Catch: java.lang.Throwable -> L29
            java.lang.Object r10 = r10.f39520b     // Catch: java.lang.Throwable -> L29
            com.transsnet.palmpay.main.export.business.IApiMainService r10 = (com.transsnet.palmpay.main.export.business.IApiMainService) r10     // Catch: java.lang.Throwable -> L29
            com.transsnet.palmpay.main.export.bean.req.CreateMerchantPaymentOrderReq r1 = new com.transsnet.palmpay.main.export.bean.req.CreateMerchantPaymentOrderReq     // Catch: java.lang.Throwable -> L29
            java.lang.String r7 = r5.f34978a     // Catch: java.lang.Throwable -> L29
            r8 = 0
            r1.<init>(r7, r8, r6, r4)     // Catch: java.lang.Throwable -> L29
            r9.f42605a = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r10 = r10.createMerchantPaymentOrder(r1, r9)     // Catch: java.lang.Throwable -> L29
            if (r10 != r0) goto L4b
            goto L8c
        L4b:
            com.transsnet.palmpay.core.bean.CommonResult r10 = (com.transsnet.palmpay.core.bean.CommonResult) r10     // Catch: java.lang.Throwable -> L29
            xf.o r1 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L29
        L4f:
            r1 = r10
            goto L58
        L51:
            xf.o r1 = p355xf.q.f43977a
            xf.p r10 = androidx.camera.core.impl.utils.executor.g.f(r10)
            goto L4f
        L58:
            boolean r10 = r1 instanceof p355xf.p
            if (r10 != 0) goto L73
            r10 = r1
            com.transsnet.palmpay.core.bean.CommonResult r10 = (com.transsnet.palmpay.core.bean.CommonResult) r10
            cg.f r3 = Wf.I.f10809a
            Wf.p0 r3 = p015ag.o.f11960a
            te.a r7 = new te.a
            r7.<init>(r10, r4, r5)
            r9.f42606b = r1
            r9.f42605a = r6
            java.lang.Object r10 = Wf.AbstractC0780y.s(r3, r7, r9)
            if (r10 != r0) goto L73
            goto L8c
        L73:
            java.lang.Throwable r10 = p355xf.q.a(r1)
            if (r10 == 0) goto L8d
            cg.f r3 = Wf.I.f10809a
            Wf.p0 r3 = p015ag.o.f11960a
            te.b r6 = new te.b
            r6.<init>(r10, r4, r5)
            r9.f42606b = r1
            r9.f42605a = r2
            java.lang.Object r10 = Wf.AbstractC0780y.s(r3, r6, r9)
            if (r10 != r0) goto L8d
        L8c:
            return r0
        L8d:
            kotlin.Unit r10 = kotlin.Unit.f38893a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p297te.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
