package p340wc;

import Ff.h;
import com.transsnet.palmpay.jara_packet.ui.fragment.ReferEarnWithdrawListFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f43394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f43395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ReferEarnWithdrawListFragment f43396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Continuation continuation, String str, ReferEarnWithdrawListFragment referEarnWithdrawListFragment) {
        super(2, continuation);
        this.f43395c = str;
        this.f43396d = referEarnWithdrawListFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(continuation, this.f43395c, this.f43396d);
        dVar.f43394b = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
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
            int r1 = r8.f43393a
            com.transsnet.palmpay.jara_packet.ui.fragment.ReferEarnWithdrawListFragment r2 = r8.f43396d
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2b
            if (r1 == r6) goto L25
            if (r1 == r5) goto L1f
            if (r1 != r4) goto L17
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L87
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            java.lang.Object r1 = r8.f43394b
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L6d
        L25:
            androidx.camera.core.impl.utils.executor.g.M(r9)     // Catch: java.lang.Throwable -> L29
            goto L45
        L29:
            r9 = move-exception
            goto L4b
        L2b:
            androidx.camera.core.impl.utils.executor.g.M(r9)
            java.lang.Object r9 = r8.f43394b
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            xf.o r9 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L29
            d3.k r9 = p254qc.a.f41475a     // Catch: java.lang.Throwable -> L29
            java.lang.Object r9 = r9.f35518b     // Catch: java.lang.Throwable -> L29
            com.transsnet.palmpay.jara_packet.api.JaraPacketApiService r9 = (com.transsnet.palmpay.jara_packet.api.JaraPacketApiService) r9     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r8.f43395c     // Catch: java.lang.Throwable -> L29
            r8.f43393a = r6     // Catch: java.lang.Throwable -> L29
            java.lang.Object r9 = r9.referEarnWithDrawCreate(r1, r8)     // Catch: java.lang.Throwable -> L29
            if (r9 != r0) goto L45
            goto L86
        L45:
            com.transsnet.palmpay.core.bean.CommonResult r9 = (com.transsnet.palmpay.core.bean.CommonResult) r9     // Catch: java.lang.Throwable -> L29
            xf.o r1 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L29
        L49:
            r1 = r9
            goto L52
        L4b:
            xf.o r1 = p355xf.q.f43977a
            xf.p r9 = androidx.camera.core.impl.utils.executor.g.f(r9)
            goto L49
        L52:
            boolean r9 = r1 instanceof p355xf.p
            if (r9 != 0) goto L6d
            r9 = r1
            com.transsnet.palmpay.core.bean.CommonResult r9 = (com.transsnet.palmpay.core.bean.CommonResult) r9
            cg.f r6 = Wf.I.f10809a
            Wf.p0 r6 = p015ag.o.f11960a
            wc.b r7 = new wc.b
            r7.<init>(r9, r3, r2)
            r8.f43394b = r1
            r8.f43393a = r5
            java.lang.Object r9 = Wf.AbstractC0780y.s(r6, r7, r8)
            if (r9 != r0) goto L6d
            goto L86
        L6d:
            java.lang.Throwable r9 = p355xf.q.a(r1)
            if (r9 == 0) goto L87
            cg.f r5 = Wf.I.f10809a
            Wf.p0 r5 = p015ag.o.f11960a
            wc.c r6 = new wc.c
            r6.<init>(r9, r3, r2)
            r8.f43394b = r1
            r8.f43393a = r4
            java.lang.Object r9 = Wf.AbstractC0780y.s(r5, r6, r8)
            if (r9 != r0) goto L87
        L86:
            return r0
        L87:
            kotlin.Unit r9 = kotlin.Unit.f38893a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p340wc.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
