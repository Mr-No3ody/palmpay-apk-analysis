package p041ce;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: ce.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1281c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f18924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f18925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f18926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function1 f18927f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1281c(Continuation continuation, Long l5, String str, Function1 function1, Function1 function2) {
        super(2, continuation);
        this.f18924c = l5;
        this.f18925d = str;
        this.f18926e = function1;
        this.f18927f = function2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1281c c1281c = new C1281c(continuation, this.f18924c, this.f18925d, this.f18926e, this.f18927f);
        c1281c.f18923b = obj;
        return c1281c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1281c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
    
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
            int r1 = r9.f18922a
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L24
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            androidx.camera.core.impl.utils.executor.g.M(r10)
            goto Lad
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            java.lang.Object r1 = r9.f18923b
            androidx.camera.core.impl.utils.executor.g.M(r10)
            goto L93
        L24:
            androidx.camera.core.impl.utils.executor.g.M(r10)     // Catch: java.lang.Throwable -> L28
            goto L67
        L28:
            r10 = move-exception
            goto L6d
        L2a:
            androidx.camera.core.impl.utils.executor.g.M(r10)
            java.lang.Object r10 = r9.f18923b
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            xf.o r10 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L28
            java.lang.String r10 = "claimId"
            java.lang.Long r1 = r9.f18924c     // Catch: java.lang.Throwable -> L28
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
            java.lang.String r1 = r9.f18925d     // Catch: java.lang.Throwable -> L28
            kotlin.Pair r7 = new kotlin.Pair     // Catch: java.lang.Throwable -> L28
            r7.<init>(r10, r1)     // Catch: java.lang.Throwable -> L28
            kotlin.Pair[] r10 = new kotlin.Pair[]{r6, r7}     // Catch: java.lang.Throwable -> L28
            java.util.Map r10 = kotlin.collections.G.g(r10)     // Catch: java.lang.Throwable -> L28
            Sd.b r1 = Qd.a.f7847a     // Catch: java.lang.Throwable -> L28
            java.lang.Object r1 = r1.f8871b     // Catch: java.lang.Throwable -> L28
            com.transsnet.palmpay.teller.business.IApiTellerService r1 = (com.transsnet.palmpay.teller.business.IApiTellerService) r1     // Catch: java.lang.Throwable -> L28
            r9.f18922a = r5     // Catch: java.lang.Throwable -> L28
            java.lang.Object r10 = r1.claimCoupon(r10, r9)     // Catch: java.lang.Throwable -> L28
            if (r10 != r0) goto L67
            goto Lac
        L67:
            com.transsnet.palmpay.core.bean.CommonResult r10 = (com.transsnet.palmpay.core.bean.CommonResult) r10     // Catch: java.lang.Throwable -> L28
            xf.o r1 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L28
        L6b:
            r1 = r10
            goto L74
        L6d:
            xf.o r1 = p355xf.q.f43977a
            xf.p r10 = androidx.camera.core.impl.utils.executor.g.f(r10)
            goto L6b
        L74:
            boolean r10 = r1 instanceof p355xf.p
            if (r10 != 0) goto L93
            r10 = r1
            com.transsnet.palmpay.core.bean.CommonResult r10 = (com.transsnet.palmpay.core.bean.CommonResult) r10
            cg.f r5 = Wf.I.f10809a
            Wf.p0 r5 = p015ag.o.f11960a
            ce.a r6 = new ce.a
            kotlin.jvm.functions.Function1 r7 = r9.f18926e
            kotlin.jvm.functions.Function1 r8 = r9.f18927f
            r6.<init>(r10, r2, r7, r8)
            r9.f18923b = r1
            r9.f18922a = r4
            java.lang.Object r10 = Wf.AbstractC0780y.s(r5, r6, r9)
            if (r10 != r0) goto L93
            goto Lac
        L93:
            java.lang.Throwable r10 = p355xf.q.a(r1)
            if (r10 == 0) goto Lad
            cg.f r4 = Wf.I.f10809a
            Wf.p0 r4 = p015ag.o.f11960a
            ce.b r5 = new ce.b
            r5.<init>(r2, r10)
            r9.f18923b = r1
            r9.f18922a = r3
            java.lang.Object r10 = Wf.AbstractC0780y.s(r4, r5, r9)
            if (r10 != r0) goto Lad
        Lac:
            return r0
        Lad:
            kotlin.Unit r10 = kotlin.Unit.f38893a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p041ce.C1281c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
