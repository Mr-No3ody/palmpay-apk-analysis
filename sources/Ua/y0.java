package Ua;

import com.transsnet.palmpay.core.viewmodel.OrderResultRewardModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f9512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f9513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ OrderResultRewardModel f9514f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(OrderResultRewardModel orderResultRewardModel, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.f9511c = str;
        this.f9512d = str2;
        this.f9513e = str3;
        this.f9514f = orderResultRewardModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        y0 y0Var = new y0(this.f9514f, this.f9511c, this.f9512d, this.f9513e, continuation);
        y0Var.f9510b = obj;
        return y0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
    
        if (Wf.AbstractC0780y.s(r5, r6, r10) == r0) goto L31;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r10.f9509a
            com.transsnet.palmpay.core.viewmodel.OrderResultRewardModel r2 = r10.f9514f
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2b
            if (r1 == r6) goto L25
            if (r1 == r5) goto L1f
            if (r1 != r4) goto L17
            androidx.camera.core.impl.utils.executor.g.M(r11)
            goto L90
        L17:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1f:
            java.lang.Object r1 = r10.f9510b
            androidx.camera.core.impl.utils.executor.g.M(r11)
            goto L76
        L25:
            androidx.camera.core.impl.utils.executor.g.M(r11)     // Catch: java.lang.Throwable -> L29
            goto L4e
        L29:
            r11 = move-exception
            goto L54
        L2b:
            androidx.camera.core.impl.utils.executor.g.M(r11)
            java.lang.Object r11 = r10.f9510b
            kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
            xf.o r11 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L29
            androidx.camera.video.internal.c r11 = p324va.c.f43141a     // Catch: java.lang.Throwable -> L29
            java.lang.Object r11 = r11.f14621b     // Catch: java.lang.Throwable -> L29
            com.transsnet.palmpay.core.network.PayApiService r11 = (com.transsnet.palmpay.core.network.PayApiService) r11     // Catch: java.lang.Throwable -> L29
            com.transsnet.palmpay.core.bean.reward.OrderResultRewardsReq r1 = new com.transsnet.palmpay.core.bean.reward.OrderResultRewardsReq     // Catch: java.lang.Throwable -> L29
            java.lang.String r7 = r10.f9511c     // Catch: java.lang.Throwable -> L29
            java.lang.String r8 = r10.f9512d     // Catch: java.lang.Throwable -> L29
            java.lang.String r9 = r10.f9513e     // Catch: java.lang.Throwable -> L29
            r1.<init>(r7, r8, r9)     // Catch: java.lang.Throwable -> L29
            r10.f9509a = r6     // Catch: java.lang.Throwable -> L29
            java.lang.Object r11 = r11.queryOrderResultRewards(r1, r10)     // Catch: java.lang.Throwable -> L29
            if (r11 != r0) goto L4e
            goto L8f
        L4e:
            com.transsnet.palmpay.core.bean.CommonResult r11 = (com.transsnet.palmpay.core.bean.CommonResult) r11     // Catch: java.lang.Throwable -> L29
            xf.o r1 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L29
        L52:
            r1 = r11
            goto L5b
        L54:
            xf.o r1 = p355xf.q.f43977a
            xf.p r11 = androidx.camera.core.impl.utils.executor.g.f(r11)
            goto L52
        L5b:
            boolean r11 = r1 instanceof p355xf.p
            if (r11 != 0) goto L76
            r11 = r1
            com.transsnet.palmpay.core.bean.CommonResult r11 = (com.transsnet.palmpay.core.bean.CommonResult) r11
            cg.f r6 = Wf.I.f10809a
            Wf.p0 r6 = p015ag.o.f11960a
            Ua.w0 r7 = new Ua.w0
            r7.<init>(r11, r3, r2)
            r10.f9510b = r1
            r10.f9509a = r5
            java.lang.Object r11 = Wf.AbstractC0780y.s(r6, r7, r10)
            if (r11 != r0) goto L76
            goto L8f
        L76:
            java.lang.Throwable r11 = p355xf.q.a(r1)
            if (r11 == 0) goto L90
            cg.f r5 = Wf.I.f10809a
            Wf.p0 r5 = p015ag.o.f11960a
            Ua.x0 r6 = new Ua.x0
            r6.<init>(r11, r3, r2)
            r10.f9510b = r1
            r10.f9509a = r4
            java.lang.Object r11 = Wf.AbstractC0780y.s(r5, r6, r10)
            if (r11 != r0) goto L90
        L8f:
            return r0
        L90:
            kotlin.Unit r11 = kotlin.Unit.f38893a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Ua.y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
