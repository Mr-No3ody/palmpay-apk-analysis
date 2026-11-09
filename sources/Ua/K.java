package Ua;

import com.transsnet.palmpay.core.viewmodel.ModelClaimCouponItemView;
import com.transsnet.palmpay.core.viewmodel.ModelClaimCouponListItemView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class K extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ModelClaimCouponItemView f9345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f9346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f9347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ModelClaimCouponListItemView f9348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f9349g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Continuation continuation, ModelClaimCouponItemView modelClaimCouponItemView, String str, String str2, ModelClaimCouponListItemView modelClaimCouponListItemView, String str3) {
        super(2, continuation);
        this.f9345c = modelClaimCouponItemView;
        this.f9346d = str;
        this.f9347e = str2;
        this.f9348f = modelClaimCouponListItemView;
        this.f9349g = str3;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        ModelClaimCouponListItemView modelClaimCouponListItemView = this.f9348f;
        String str = this.f9349g;
        K k2 = new K(continuation, this.f9345c, this.f9346d, this.f9347e, modelClaimCouponListItemView, str);
        k2.f9344b = obj;
        return k2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0087  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        if (Wf.AbstractC0780y.s(r3, r4, r10) == r1) goto L31;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            Ef.a r1 = Ef.a.f2423a
            int r0 = r10.f9343a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L29
            if (r0 == r4) goto L22
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L14
            androidx.camera.core.impl.utils.executor.g.M(r11)
            goto L9c
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            java.lang.Object r0 = r10.f9344b
            androidx.camera.core.impl.utils.executor.g.M(r11)
            goto L81
        L22:
            androidx.camera.core.impl.utils.executor.g.M(r11)     // Catch: java.lang.Throwable -> L26
            goto L52
        L26:
            r0 = move-exception
            r11 = r0
            goto L58
        L29:
            androidx.camera.core.impl.utils.executor.g.M(r11)
            java.lang.Object r11 = r10.f9344b
            kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
            xf.o r11 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L26
            androidx.camera.video.internal.c r11 = p324va.c.f43141a     // Catch: java.lang.Throwable -> L26
            java.lang.Object r11 = r11.f14621b     // Catch: java.lang.Throwable -> L26
            com.transsnet.palmpay.core.network.PayApiService r11 = (com.transsnet.palmpay.core.network.PayApiService) r11     // Catch: java.lang.Throwable -> L26
            com.transsnet.palmpay.core.bean.req.ClaimCouponReq r0 = new com.transsnet.palmpay.core.bean.req.ClaimCouponReq     // Catch: java.lang.Throwable -> L26
            com.transsnet.palmpay.core.viewmodel.ModelClaimCouponItemView r5 = r10.f9345c     // Catch: java.lang.Throwable -> L26
            java.lang.String r5 = r5.getTransType()     // Catch: java.lang.Throwable -> L26
            java.lang.String r6 = ""
            java.lang.String r7 = r10.f9346d     // Catch: java.lang.Throwable -> L26
            java.lang.String r8 = r10.f9347e     // Catch: java.lang.Throwable -> L26
            r0.<init>(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L26
            r10.f9343a = r4     // Catch: java.lang.Throwable -> L26
            java.lang.Object r11 = r11.claimCoupon(r0, r10)     // Catch: java.lang.Throwable -> L26
            if (r11 != r1) goto L52
            goto L9b
        L52:
            com.transsnet.palmpay.core.bean.CommonResult r11 = (com.transsnet.palmpay.core.bean.CommonResult) r11     // Catch: java.lang.Throwable -> L26
            xf.o r0 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L26
        L56:
            r0 = r11
            goto L5f
        L58:
            xf.o r0 = p355xf.q.f43977a
            xf.p r11 = androidx.camera.core.impl.utils.executor.g.f(r11)
            goto L56
        L5f:
            boolean r11 = r0 instanceof p355xf.p
            if (r11 != 0) goto L81
            r5 = r0
            com.transsnet.palmpay.core.bean.CommonResult r5 = (com.transsnet.palmpay.core.bean.CommonResult) r5
            cg.f r11 = Wf.I.f10809a
            Wf.p0 r11 = p015ag.o.f11960a
            Ua.I r4 = new Ua.I
            java.lang.String r8 = r10.f9349g
            com.transsnet.palmpay.core.viewmodel.ModelClaimCouponListItemView r7 = r10.f9348f
            r6 = 0
            com.transsnet.palmpay.core.viewmodel.ModelClaimCouponItemView r9 = r10.f9345c
            r4.<init>(r5, r6, r7, r8, r9)
            r10.f9344b = r0
            r10.f9343a = r3
            java.lang.Object r11 = Wf.AbstractC0780y.s(r11, r4, r10)
            if (r11 != r1) goto L81
            goto L9b
        L81:
            java.lang.Throwable r11 = p355xf.q.a(r0)
            if (r11 == 0) goto L9c
            cg.f r3 = Wf.I.f10809a
            Wf.p0 r3 = p015ag.o.f11960a
            Ua.J r4 = new Ua.J
            r5 = 0
            r4.<init>(r5, r11)
            r10.f9344b = r0
            r10.f9343a = r2
            java.lang.Object r11 = Wf.AbstractC0780y.s(r3, r4, r10)
            if (r11 != r1) goto L9c
        L9b:
            return r1
        L9c:
            kotlin.Unit r11 = kotlin.Unit.f38893a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Ua.K.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
