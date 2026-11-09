package Ua;

import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV5View;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f9459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ OneTimeCodeV5View f9460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f9461g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(Continuation continuation, String str, int i7, boolean z3, OneTimeCodeV5View oneTimeCodeV5View, boolean z8) {
        super(2, continuation);
        this.f9457c = str;
        this.f9458d = i7;
        this.f9459e = z3;
        this.f9460f = oneTimeCodeV5View;
        this.f9461g = z8;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        q0 q0Var = new q0(continuation, this.f9457c, this.f9458d, this.f9459e, this.f9460f, this.f9461g);
        q0Var.f9456b = obj;
        return q0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        if (Wf.AbstractC0780y.s(r5, r6, r9) == r0) goto L31;
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
            int r1 = r9.f9455a
            com.transsnet.palmpay.core.viewmodel.OneTimeCodeV5View r2 = r9.f9460f
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2b
            if (r1 == r6) goto L25
            if (r1 == r5) goto L1f
            if (r1 != r4) goto L17
            androidx.camera.core.impl.utils.executor.g.M(r10)
            goto L8d
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            java.lang.Object r1 = r9.f9456b
            androidx.camera.core.impl.utils.executor.g.M(r10)
            goto L71
        L25:
            androidx.camera.core.impl.utils.executor.g.M(r10)     // Catch: java.lang.Throwable -> L29
            goto L47
        L29:
            r10 = move-exception
            goto L4d
        L2b:
            androidx.camera.core.impl.utils.executor.g.M(r10)
            java.lang.Object r10 = r9.f9456b
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            xf.o r10 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L29
            androidx.camera.video.internal.c r10 = p324va.c.f43141a     // Catch: java.lang.Throwable -> L29
            java.lang.Object r10 = r10.f14621b     // Catch: java.lang.Throwable -> L29
            com.transsnet.palmpay.core.network.PayApiService r10 = (com.transsnet.palmpay.core.network.PayApiService) r10     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r9.f9457c     // Catch: java.lang.Throwable -> L29
            int r7 = r9.f9458d     // Catch: java.lang.Throwable -> L29
            r9.f9455a = r6     // Catch: java.lang.Throwable -> L29
            java.lang.Object r10 = r10.getSmsChannelVM(r1, r7, r9)     // Catch: java.lang.Throwable -> L29
            if (r10 != r0) goto L47
            goto L8c
        L47:
            com.transsnet.palmpay.core.bean.CommonResult r10 = (com.transsnet.palmpay.core.bean.CommonResult) r10     // Catch: java.lang.Throwable -> L29
            xf.o r1 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L29
        L4b:
            r1 = r10
            goto L54
        L4d:
            xf.o r1 = p355xf.q.f43977a
            xf.p r10 = androidx.camera.core.impl.utils.executor.g.f(r10)
            goto L4b
        L54:
            boolean r10 = r1 instanceof p355xf.p
            if (r10 != 0) goto L71
            r10 = r1
            com.transsnet.palmpay.core.bean.CommonResult r10 = (com.transsnet.palmpay.core.bean.CommonResult) r10
            cg.f r6 = Wf.I.f10809a
            Wf.p0 r6 = p015ag.o.f11960a
            Ua.o0 r7 = new Ua.o0
            boolean r8 = r9.f9459e
            r7.<init>(r10, r3, r8, r2)
            r9.f9456b = r1
            r9.f9455a = r5
            java.lang.Object r10 = Wf.AbstractC0780y.s(r6, r7, r9)
            if (r10 != r0) goto L71
            goto L8c
        L71:
            java.lang.Throwable r10 = p355xf.q.a(r1)
            if (r10 == 0) goto L8d
            cg.f r5 = Wf.I.f10809a
            Wf.p0 r5 = p015ag.o.f11960a
            Ua.p0 r6 = new Ua.p0
            boolean r7 = r9.f9461g
            r6.<init>(r10, r3, r7, r2)
            r9.f9456b = r1
            r9.f9455a = r4
            java.lang.Object r10 = Wf.AbstractC0780y.s(r5, r6, r9)
            if (r10 != r0) goto L8d
        L8c:
            return r0
        L8d:
            kotlin.Unit r10 = kotlin.Unit.f38893a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Ua.q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
