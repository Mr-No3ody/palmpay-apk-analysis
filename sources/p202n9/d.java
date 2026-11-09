package p202n9;

import Ff.h;
import com.transsnet.palmpay.airtime.ui.view.ModelAirtimeDataPlanQuickBuyItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ModelAirtimeDataPlanQuickBuyItem f39866c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Continuation continuation, ModelAirtimeDataPlanQuickBuyItem modelAirtimeDataPlanQuickBuyItem) {
        super(2, continuation);
        this.f39866c = modelAirtimeDataPlanQuickBuyItem;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(continuation, this.f39866c);
        dVar.f39865b = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
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
            int r1 = r8.f39864a
            com.transsnet.palmpay.airtime.ui.view.ModelAirtimeDataPlanQuickBuyItem r2 = r8.f39866c
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2b
            if (r1 == r6) goto L25
            if (r1 == r5) goto L1f
            if (r1 != r4) goto L17
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L85
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            java.lang.Object r1 = r8.f39865b
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L6b
        L25:
            androidx.camera.core.impl.utils.executor.g.M(r9)     // Catch: java.lang.Throwable -> L29
            goto L43
        L29:
            r9 = move-exception
            goto L49
        L2b:
            androidx.camera.core.impl.utils.executor.g.M(r9)
            java.lang.Object r9 = r8.f39865b
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            xf.o r9 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L29
            androidx.camera.video.internal.c r9 = p324va.c.f43141a     // Catch: java.lang.Throwable -> L29
            java.lang.Object r9 = r9.f14621b     // Catch: java.lang.Throwable -> L29
            com.transsnet.palmpay.core.network.PayApiService r9 = (com.transsnet.palmpay.core.network.PayApiService) r9     // Catch: java.lang.Throwable -> L29
            r8.f39864a = r6     // Catch: java.lang.Throwable -> L29
            java.lang.Object r9 = r9.queryHighlyRecommendDataBundle(r8)     // Catch: java.lang.Throwable -> L29
            if (r9 != r0) goto L43
            goto L84
        L43:
            com.transsnet.palmpay.core.bean.CommonResult r9 = (com.transsnet.palmpay.core.bean.CommonResult) r9     // Catch: java.lang.Throwable -> L29
            xf.o r1 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L29
        L47:
            r1 = r9
            goto L50
        L49:
            xf.o r1 = p355xf.q.f43977a
            xf.p r9 = androidx.camera.core.impl.utils.executor.g.f(r9)
            goto L47
        L50:
            boolean r9 = r1 instanceof p355xf.p
            if (r9 != 0) goto L6b
            r9 = r1
            com.transsnet.palmpay.core.bean.CommonResult r9 = (com.transsnet.palmpay.core.bean.CommonResult) r9
            cg.f r6 = Wf.I.f10809a
            Wf.p0 r6 = p015ag.o.f11960a
            n9.b r7 = new n9.b
            r7.<init>(r9, r3, r2)
            r8.f39865b = r1
            r8.f39864a = r5
            java.lang.Object r9 = Wf.AbstractC0780y.s(r6, r7, r8)
            if (r9 != r0) goto L6b
            goto L84
        L6b:
            java.lang.Throwable r9 = p355xf.q.a(r1)
            if (r9 == 0) goto L85
            cg.f r5 = Wf.I.f10809a
            Wf.p0 r5 = p015ag.o.f11960a
            n9.c r6 = new n9.c
            r6.<init>(r9, r3, r2)
            r8.f39865b = r1
            r8.f39864a = r4
            java.lang.Object r9 = Wf.AbstractC0780y.s(r5, r6, r8)
            if (r9 != r0) goto L85
        L84:
            return r0
        L85:
            kotlin.Unit r9 = kotlin.Unit.f38893a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p202n9.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
