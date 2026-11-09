package Ua;

import com.transsnet.palmpay.core.bean.reward.OrderResultRewardItemBean;
import com.transsnet.palmpay.core.viewmodel.OrderResultRewardModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OrderResultRewardItemBean f9489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OrderResultRewardModel f9490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A0 f9491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ OrderResultRewardItemBean f9492f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Continuation continuation, OrderResultRewardItemBean orderResultRewardItemBean, OrderResultRewardModel orderResultRewardModel, A0 a3, OrderResultRewardItemBean orderResultRewardItemBean2) {
        super(2, continuation);
        this.f9489c = orderResultRewardItemBean;
        this.f9490d = orderResultRewardModel;
        this.f9491e = a3;
        this.f9492f = orderResultRewardItemBean2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        u0 u0Var = new u0(continuation, this.f9489c, this.f9490d, this.f9491e, this.f9492f);
        u0Var.f9488b = obj;
        return u0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
    
        if (Wf.AbstractC0780y.s(r4, r5, r13) == r1) goto L37;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            Ef.a r1 = Ef.a.f2423a
            int r0 = r13.f9487a
            com.transsnet.palmpay.core.viewmodel.OrderResultRewardModel r2 = r13.f9490d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L30
            if (r0 == r5) goto L27
            if (r0 == r4) goto L1f
            if (r0 != r3) goto L17
            androidx.camera.core.impl.utils.executor.g.M(r14)
            r12 = r13
            goto La6
        L17:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1f:
            java.lang.Object r0 = r13.f9488b
            androidx.camera.core.impl.utils.executor.g.M(r14)
            r12 = r13
            goto L8b
        L27:
            androidx.camera.core.impl.utils.executor.g.M(r14)     // Catch: java.lang.Throwable -> L2c
            r12 = r13
            goto L56
        L2c:
            r0 = move-exception
            r14 = r0
            r12 = r13
            goto L62
        L30:
            androidx.camera.core.impl.utils.executor.g.M(r14)
            java.lang.Object r14 = r13.f9488b
            kotlinx.coroutines.CoroutineScope r14 = (kotlinx.coroutines.CoroutineScope) r14
            xf.o r14 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L5f
            androidx.camera.video.internal.c r14 = p324va.c.f43141a     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r14 = r14.f14621b     // Catch: java.lang.Throwable -> L5f
            r6 = r14
            com.transsnet.palmpay.core.network.PayApiService r6 = (com.transsnet.palmpay.core.network.PayApiService) r6     // Catch: java.lang.Throwable -> L5f
            com.transsnet.palmpay.core.bean.reward.OrderResultRewardItemBean r14 = r13.f9489c     // Catch: java.lang.Throwable -> L5f
            java.lang.String r7 = r14.recordNo     // Catch: java.lang.Throwable -> L5f
            java.lang.String r8 = r2.f28525o     // Catch: java.lang.Throwable -> L5f
            java.lang.String r9 = r14.payId     // Catch: java.lang.Throwable -> L5f
            java.lang.String r10 = r14.orderNo     // Catch: java.lang.Throwable -> L5f
            java.lang.Integer r11 = r14.rewardType     // Catch: java.lang.Throwable -> L5f
            r13.f9487a = r5     // Catch: java.lang.Throwable -> L5f
            r12 = r13
            java.lang.Object r14 = r6.claimReward(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L5c
            if (r14 != r1) goto L56
            goto La5
        L56:
            com.transsnet.palmpay.core.bean.CommonResult r14 = (com.transsnet.palmpay.core.bean.CommonResult) r14     // Catch: java.lang.Throwable -> L5c
            xf.o r0 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L5c
        L5a:
            r0 = r14
            goto L69
        L5c:
            r0 = move-exception
        L5d:
            r14 = r0
            goto L62
        L5f:
            r0 = move-exception
            r12 = r13
            goto L5d
        L62:
            xf.o r0 = p355xf.q.f43977a
            xf.p r14 = androidx.camera.core.impl.utils.executor.g.f(r14)
            goto L5a
        L69:
            boolean r14 = r0 instanceof p355xf.p
            if (r14 != 0) goto L8b
            r6 = r0
            com.transsnet.palmpay.core.bean.CommonResult r6 = (com.transsnet.palmpay.core.bean.CommonResult) r6
            cg.f r14 = Wf.I.f10809a
            Wf.p0 r14 = p015ag.o.f11960a
            Ua.s0 r5 = new Ua.s0
            Ua.A0 r9 = r12.f9491e
            com.transsnet.palmpay.core.bean.reward.OrderResultRewardItemBean r10 = r12.f9492f
            r7 = 0
            com.transsnet.palmpay.core.viewmodel.OrderResultRewardModel r8 = r12.f9490d
            r5.<init>(r6, r7, r8, r9, r10)
            r12.f9488b = r0
            r12.f9487a = r4
            java.lang.Object r14 = Wf.AbstractC0780y.s(r14, r5, r13)
            if (r14 != r1) goto L8b
            goto La5
        L8b:
            java.lang.Throwable r14 = p355xf.q.a(r0)
            if (r14 == 0) goto La6
            cg.f r4 = Wf.I.f10809a
            Wf.p0 r4 = p015ag.o.f11960a
            Ua.t0 r5 = new Ua.t0
            r6 = 0
            r5.<init>(r14, r6, r2)
            r12.f9488b = r0
            r12.f9487a = r3
            java.lang.Object r14 = Wf.AbstractC0780y.s(r4, r5, r13)
            if (r14 != r1) goto La6
        La5:
            return r1
        La6:
            kotlin.Unit r14 = kotlin.Unit.f38893a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: Ua.u0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
