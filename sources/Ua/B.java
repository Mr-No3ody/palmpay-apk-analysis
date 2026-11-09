package Ua;

import com.transsnet.palmpay.core.viewmodel.ModelBillNoticeItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class B extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ModelBillNoticeItem f9303c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Continuation continuation, ModelBillNoticeItem modelBillNoticeItem) {
        super(2, continuation);
        this.f9303c = modelBillNoticeItem;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        B b7 = new B(continuation, this.f9303c);
        b7.f9302b = obj;
        return b7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (Wf.AbstractC0780y.s(r3, r5, r8) == r0) goto L31;
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
            int r1 = r8.f9301a
            r2 = 0
            com.transsnet.palmpay.core.viewmodel.ModelBillNoticeItem r3 = r8.f9303c
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2b
            if (r1 == r6) goto L25
            if (r1 == r5) goto L1f
            if (r1 != r4) goto L17
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L96
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            java.lang.Object r1 = r8.f9302b
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L7c
        L25:
            androidx.camera.core.impl.utils.executor.g.M(r9)     // Catch: java.lang.Throwable -> L29
            goto L54
        L29:
            r9 = move-exception
            goto L5a
        L2b:
            androidx.camera.core.impl.utils.executor.g.M(r9)
            java.lang.Object r9 = r8.f9302b
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            xf.o r9 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L29
            androidx.camera.video.internal.c r9 = p324va.c.f43141a     // Catch: java.lang.Throwable -> L29
            java.lang.Object r9 = r9.f14621b     // Catch: java.lang.Throwable -> L29
            com.transsnet.palmpay.core.network.PayApiService r9 = (com.transsnet.palmpay.core.network.PayApiService) r9     // Catch: java.lang.Throwable -> L29
            com.transsnet.palmpay.core.bean.req.QueryServiceStateByCategoryIdReq r1 = new com.transsnet.palmpay.core.bean.req.QueryServiceStateByCategoryIdReq     // Catch: java.lang.Throwable -> L29
            r1.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r7 = r3.f28274c     // Catch: java.lang.Throwable -> L29
            java.lang.String[] r7 = new java.lang.String[]{r7}     // Catch: java.lang.Throwable -> L29
            java.util.ArrayList r7 = kotlin.collections.C1850q.e(r7)     // Catch: java.lang.Throwable -> L29
            r1.categoryId = r7     // Catch: java.lang.Throwable -> L29
            r8.f9301a = r6     // Catch: java.lang.Throwable -> L29
            java.lang.Object r9 = r9.queryServiceStateByCategoryIdByNew(r1, r8)     // Catch: java.lang.Throwable -> L29
            if (r9 != r0) goto L54
            goto L95
        L54:
            com.transsnet.palmpay.core.bean.CommonResult r9 = (com.transsnet.palmpay.core.bean.CommonResult) r9     // Catch: java.lang.Throwable -> L29
            xf.o r1 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L29
        L58:
            r1 = r9
            goto L61
        L5a:
            xf.o r1 = p355xf.q.f43977a
            xf.p r9 = androidx.camera.core.impl.utils.executor.g.f(r9)
            goto L58
        L61:
            boolean r9 = r1 instanceof p355xf.p
            if (r9 != 0) goto L7c
            r9 = r1
            com.transsnet.palmpay.core.bean.CommonResult r9 = (com.transsnet.palmpay.core.bean.CommonResult) r9
            cg.f r6 = Wf.I.f10809a
            Wf.p0 r6 = p015ag.o.f11960a
            Ua.z r7 = new Ua.z
            r7.<init>(r9, r2, r3)
            r8.f9302b = r1
            r8.f9301a = r5
            java.lang.Object r9 = Wf.AbstractC0780y.s(r6, r7, r8)
            if (r9 != r0) goto L7c
            goto L95
        L7c:
            java.lang.Throwable r9 = p355xf.q.a(r1)
            if (r9 == 0) goto L96
            cg.f r3 = Wf.I.f10809a
            Wf.p0 r3 = p015ag.o.f11960a
            Ua.A r5 = new Ua.A
            r5.<init>(r2, r9)
            r8.f9302b = r1
            r8.f9301a = r4
            java.lang.Object r9 = Wf.AbstractC0780y.s(r3, r5, r8)
            if (r9 != r0) goto L96
        L95:
            return r0
        L96:
            kotlin.Unit r9 = kotlin.Unit.f38893a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Ua.B.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
