package p041ce;

import Ff.h;
import com.transsnet.palmpay.teller.ui.view.ModelActivityBannerWithCoupon;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ModelActivityBannerWithCoupon f18952c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Continuation continuation, ModelActivityBannerWithCoupon modelActivityBannerWithCoupon) {
        super(2, continuation);
        this.f18952c = modelActivityBannerWithCoupon;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        m mVar = new m(continuation, this.f18952c);
        mVar.f18951b = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (Wf.AbstractC0780y.s(r3, r5, r8) == r0) goto L34;
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
            int r1 = r8.f18950a
            r2 = 0
            com.transsnet.palmpay.teller.ui.view.ModelActivityBannerWithCoupon r3 = r8.f18952c
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
            java.lang.Object r1 = r8.f18951b
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
            java.lang.Object r9 = r8.f18951b
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            xf.o r9 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L29
            Sd.b r9 = Qd.a.f7847a     // Catch: java.lang.Throwable -> L29
            java.lang.Object r9 = r9.f8871b     // Catch: java.lang.Throwable -> L29
            com.transsnet.palmpay.teller.business.IApiTellerService r9 = (com.transsnet.palmpay.teller.business.IApiTellerService) r9     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r3.f34327g     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L40
            java.lang.String r1 = ""
        L40:
            r8.f18950a = r6     // Catch: java.lang.Throwable -> L29
            java.lang.Object r9 = r9.queryBannerWithCoupon(r1, r8)     // Catch: java.lang.Throwable -> L29
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
            ce.k r7 = new ce.k
            r7.<init>(r9, r2, r3)
            r8.f18951b = r1
            r8.f18950a = r5
            java.lang.Object r9 = Wf.AbstractC0780y.s(r6, r7, r8)
            if (r9 != r0) goto L71
            goto L8a
        L71:
            java.lang.Throwable r9 = p355xf.q.a(r1)
            if (r9 == 0) goto L8b
            cg.f r3 = Wf.I.f10809a
            Wf.p0 r3 = p015ag.o.f11960a
            ce.l r5 = new ce.l
            r5.<init>(r2, r9)
            r8.f18951b = r1
            r8.f18950a = r4
            java.lang.Object r9 = Wf.AbstractC0780y.s(r3, r5, r8)
            if (r9 != r0) goto L8b
        L8a:
            return r0
        L8b:
            kotlin.Unit r9 = kotlin.Unit.f38893a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p041ce.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
