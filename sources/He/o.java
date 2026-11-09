package He;

import com.transsnet.palmpay.ui.view.ModelPremiumBenefits;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ModelPremiumBenefits f3906c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Continuation continuation, ModelPremiumBenefits modelPremiumBenefits) {
        super(2, continuation);
        this.f3906c = modelPremiumBenefits;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        o oVar = new o(continuation, this.f3906c);
        oVar.f3905b = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        if (Wf.AbstractC0780y.s(r5, r6, r8) == r0) goto L31;
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
            int r1 = r8.f3904a
            com.transsnet.palmpay.ui.view.ModelPremiumBenefits r2 = r8.f3906c
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2b
            if (r1 == r6) goto L25
            if (r1 == r5) goto L1f
            if (r1 != r4) goto L17
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L92
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            java.lang.Object r1 = r8.f3905b
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L78
        L25:
            androidx.camera.core.impl.utils.executor.g.M(r9)     // Catch: java.lang.Throwable -> L29
            goto L50
        L29:
            r9 = move-exception
            goto L56
        L2b:
            androidx.camera.core.impl.utils.executor.g.M(r9)
            java.lang.Object r9 = r8.f3905b
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            xf.o r9 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L29
            m6.j r9 = Cc.a.f1353a     // Catch: java.lang.Throwable -> L29
            java.lang.Object r9 = r9.f39520b     // Catch: java.lang.Throwable -> L29
            com.transsnet.palmpay.main.export.business.IApiMainService r9 = (com.transsnet.palmpay.main.export.business.IApiMainService) r9     // Catch: java.lang.Throwable -> L29
            com.transsnet.palmpay.main.export.bean.req.PremiumNoticeWithRewadReq r1 = new com.transsnet.palmpay.main.export.bean.req.PremiumNoticeWithRewadReq     // Catch: java.lang.Throwable -> L29
            r1.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r7 = ""
            java.util.List r7 = kotlin.collections.C1849p.c(r7)     // Catch: java.lang.Throwable -> L29
            r1.benefitNotShow = r7     // Catch: java.lang.Throwable -> L29
            r8.f3904a = r6     // Catch: java.lang.Throwable -> L29
            java.lang.Object r9 = r9.queryPremiumNoticeWithReward(r1, r8)     // Catch: java.lang.Throwable -> L29
            if (r9 != r0) goto L50
            goto L91
        L50:
            com.transsnet.palmpay.core.bean.CommonResult r9 = (com.transsnet.palmpay.core.bean.CommonResult) r9     // Catch: java.lang.Throwable -> L29
            xf.o r1 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L29
        L54:
            r1 = r9
            goto L5d
        L56:
            xf.o r1 = p355xf.q.f43977a
            xf.p r9 = androidx.camera.core.impl.utils.executor.g.f(r9)
            goto L54
        L5d:
            boolean r9 = r1 instanceof p355xf.p
            if (r9 != 0) goto L78
            r9 = r1
            com.transsnet.palmpay.core.bean.CommonResult r9 = (com.transsnet.palmpay.core.bean.CommonResult) r9
            cg.f r6 = Wf.I.f10809a
            Wf.p0 r6 = p015ag.o.f11960a
            He.m r7 = new He.m
            r7.<init>(r9, r3, r2)
            r8.f3905b = r1
            r8.f3904a = r5
            java.lang.Object r9 = Wf.AbstractC0780y.s(r6, r7, r8)
            if (r9 != r0) goto L78
            goto L91
        L78:
            java.lang.Throwable r9 = p355xf.q.a(r1)
            if (r9 == 0) goto L92
            cg.f r5 = Wf.I.f10809a
            Wf.p0 r5 = p015ag.o.f11960a
            He.n r6 = new He.n
            r6.<init>(r9, r3, r2)
            r8.f3905b = r1
            r8.f3904a = r4
            java.lang.Object r9 = Wf.AbstractC0780y.s(r5, r6, r8)
            if (r9 != r0) goto L92
        L91:
            return r0
        L92:
            kotlin.Unit r9 = kotlin.Unit.f38893a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: He.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
