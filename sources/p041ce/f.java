package p041ce;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f18934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f18935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f18936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f18937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f18938g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Continuation continuation, Long l5, String str, String str2, g gVar, h hVar) {
        super(2, continuation);
        this.f18934c = l5;
        this.f18935d = str;
        this.f18936e = str2;
        this.f18937f = gVar;
        this.f18938g = hVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        g gVar = this.f18937f;
        h hVar = this.f18938g;
        f fVar = new f(continuation, this.f18934c, this.f18935d, this.f18936e, gVar, hVar);
        fVar.f18933b = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        if (Wf.AbstractC0780y.s(r4, r5, r9) == r0) goto L37;
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
            int r1 = r9.f18932a
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L24
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            androidx.camera.core.impl.utils.executor.g.M(r10)
            goto Lb6
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            java.lang.Object r1 = r9.f18933b
            androidx.camera.core.impl.utils.executor.g.M(r10)
            goto L9c
        L24:
            androidx.camera.core.impl.utils.executor.g.M(r10)     // Catch: java.lang.Throwable -> L28
            goto L70
        L28:
            r10 = move-exception
            goto L76
        L2a:
            androidx.camera.core.impl.utils.executor.g.M(r10)
            java.lang.Object r10 = r9.f18933b
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            xf.o r10 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L28
            java.lang.String r10 = "claimId"
            java.lang.Long r1 = r9.f18934c     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L40
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L40
            goto L42
        L40:
            java.lang.String r1 = ""
        L42:
            kotlin.Pair r6 = new kotlin.Pair     // Catch: java.lang.Throwable -> L28
            r6.<init>(r10, r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r10 = "memberId"
            java.lang.String r1 = r9.f18935d     // Catch: java.lang.Throwable -> L28
            kotlin.Pair r7 = new kotlin.Pair     // Catch: java.lang.Throwable -> L28
            r7.<init>(r10, r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r10 = "transType"
            java.lang.String r1 = r9.f18936e     // Catch: java.lang.Throwable -> L28
            kotlin.Pair r8 = new kotlin.Pair     // Catch: java.lang.Throwable -> L28
            r8.<init>(r10, r1)     // Catch: java.lang.Throwable -> L28
            kotlin.Pair[] r10 = new kotlin.Pair[]{r6, r7, r8}     // Catch: java.lang.Throwable -> L28
            java.util.Map r10 = kotlin.collections.G.g(r10)     // Catch: java.lang.Throwable -> L28
            Sd.b r1 = Qd.a.f7847a     // Catch: java.lang.Throwable -> L28
            java.lang.Object r1 = r1.f8871b     // Catch: java.lang.Throwable -> L28
            com.transsnet.palmpay.teller.business.IApiTellerService r1 = (com.transsnet.palmpay.teller.business.IApiTellerService) r1     // Catch: java.lang.Throwable -> L28
            r9.f18932a = r5     // Catch: java.lang.Throwable -> L28
            java.lang.Object r10 = r1.claimCouponPackage(r10, r9)     // Catch: java.lang.Throwable -> L28
            if (r10 != r0) goto L70
            goto Lb5
        L70:
            com.transsnet.palmpay.core.bean.CommonResult r10 = (com.transsnet.palmpay.core.bean.CommonResult) r10     // Catch: java.lang.Throwable -> L28
            xf.o r1 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L28
        L74:
            r1 = r10
            goto L7d
        L76:
            xf.o r1 = p355xf.q.f43977a
            xf.p r10 = androidx.camera.core.impl.utils.executor.g.f(r10)
            goto L74
        L7d:
            boolean r10 = r1 instanceof p355xf.p
            if (r10 != 0) goto L9c
            r10 = r1
            com.transsnet.palmpay.core.bean.CommonResult r10 = (com.transsnet.palmpay.core.bean.CommonResult) r10
            cg.f r5 = Wf.I.f10809a
            Wf.p0 r5 = p015ag.o.f11960a
            ce.d r6 = new ce.d
            ce.g r7 = r9.f18937f
            ce.h r8 = r9.f18938g
            r6.<init>(r10, r2, r7, r8)
            r9.f18933b = r1
            r9.f18932a = r4
            java.lang.Object r10 = Wf.AbstractC0780y.s(r5, r6, r9)
            if (r10 != r0) goto L9c
            goto Lb5
        L9c:
            java.lang.Throwable r10 = p355xf.q.a(r1)
            if (r10 == 0) goto Lb6
            cg.f r4 = Wf.I.f10809a
            Wf.p0 r4 = p015ag.o.f11960a
            ce.e r5 = new ce.e
            r5.<init>(r2, r10)
            r9.f18933b = r1
            r9.f18932a = r3
            java.lang.Object r10 = Wf.AbstractC0780y.s(r4, r5, r9)
            if (r10 != r0) goto Lb6
        Lb5:
            return r0
        Lb6:
            kotlin.Unit r10 = kotlin.Unit.f38893a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p041ce.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
