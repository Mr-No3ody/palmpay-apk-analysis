package p338w9;

import com.transsnet.palmpay.betting.ui.view.ModelBettingRootView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f43349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ModelBettingRootView f43350c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Continuation continuation, ModelBettingRootView modelBettingRootView) {
        super(2, continuation);
        this.f43350c = modelBettingRootView;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        h hVar = new h(continuation, this.f43350c);
        hVar.f43349b = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (Wf.AbstractC0780y.s(r4, r5, r8) == r0) goto L31;
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
            int r1 = r8.f43348a
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L29
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L87
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            java.lang.Object r1 = r8.f43349b
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L6d
        L23:
            androidx.camera.core.impl.utils.executor.g.M(r9)     // Catch: java.lang.Throwable -> L27
            goto L43
        L27:
            r9 = move-exception
            goto L49
        L29:
            androidx.camera.core.impl.utils.executor.g.M(r9)
            java.lang.Object r9 = r8.f43349b
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            xf.o r9 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L27
            Sd.b r9 = Qd.a.f7847a     // Catch: java.lang.Throwable -> L27
            java.lang.Object r9 = r9.f8871b     // Catch: java.lang.Throwable -> L27
            com.transsnet.palmpay.teller.business.IApiTellerService r9 = (com.transsnet.palmpay.teller.business.IApiTellerService) r9     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "96"
            r8.f43348a = r5     // Catch: java.lang.Throwable -> L27
            java.lang.Object r9 = r9.queryCouponV2(r1, r8)     // Catch: java.lang.Throwable -> L27
            if (r9 != r0) goto L43
            goto L86
        L43:
            com.transsnet.palmpay.core.bean.CommonResult r9 = (com.transsnet.palmpay.core.bean.CommonResult) r9     // Catch: java.lang.Throwable -> L27
            xf.o r1 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L27
        L47:
            r1 = r9
            goto L50
        L49:
            xf.o r1 = p355xf.q.f43977a
            xf.p r9 = androidx.camera.core.impl.utils.executor.g.f(r9)
            goto L47
        L50:
            boolean r9 = r1 instanceof p355xf.p
            if (r9 != 0) goto L6d
            r9 = r1
            com.transsnet.palmpay.core.bean.CommonResult r9 = (com.transsnet.palmpay.core.bean.CommonResult) r9
            cg.f r5 = Wf.I.f10809a
            Wf.p0 r5 = p015ag.o.f11960a
            w9.f r6 = new w9.f
            com.transsnet.palmpay.betting.ui.view.ModelBettingRootView r7 = r8.f43350c
            r6.<init>(r9, r2, r7)
            r8.f43349b = r1
            r8.f43348a = r4
            java.lang.Object r9 = Wf.AbstractC0780y.s(r5, r6, r8)
            if (r9 != r0) goto L6d
            goto L86
        L6d:
            java.lang.Throwable r9 = p355xf.q.a(r1)
            if (r9 == 0) goto L87
            cg.f r4 = Wf.I.f10809a
            Wf.p0 r4 = p015ag.o.f11960a
            w9.g r5 = new w9.g
            r5.<init>(r2, r9)
            r8.f43349b = r1
            r8.f43348a = r3
            java.lang.Object r9 = Wf.AbstractC0780y.s(r4, r5, r8)
            if (r9 != r0) goto L87
        L86:
            return r0
        L87:
            kotlin.Unit r9 = kotlin.Unit.f38893a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p338w9.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
