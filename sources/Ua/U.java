package Ua;

import com.transsnet.palmpay.core.viewmodel.ModelDataPlanFlashSaleItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class U extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ModelDataPlanFlashSaleItem f9370d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(Continuation continuation, String str, ModelDataPlanFlashSaleItem modelDataPlanFlashSaleItem) {
        super(2, continuation);
        this.f9369c = str;
        this.f9370d = modelDataPlanFlashSaleItem;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        U u6 = new U(continuation, this.f9369c, this.f9370d);
        u6.f9368b = obj;
        return u6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        if (Wf.AbstractC0780y.s(r4, r5, r8) == r0) goto L35;
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
            int r1 = r8.f9367a
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L29
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L8c
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            java.lang.Object r1 = r8.f9368b
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L72
        L23:
            androidx.camera.core.impl.utils.executor.g.M(r9)     // Catch: java.lang.Throwable -> L27
            goto L48
        L27:
            r9 = move-exception
            goto L4e
        L29:
            androidx.camera.core.impl.utils.executor.g.M(r9)
            java.lang.Object r9 = r8.f9368b
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            xf.o r9 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L27
            androidx.camera.video.internal.c r9 = p324va.c.f43141a     // Catch: java.lang.Throwable -> L27
            java.lang.Object r9 = r9.f14621b     // Catch: java.lang.Throwable -> L27
            com.transsnet.palmpay.core.network.PayApiService r9 = (com.transsnet.palmpay.core.network.PayApiService) r9     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r8.f9369c     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L3d
            goto L3f
        L3d:
            java.lang.String r1 = ""
        L3f:
            r8.f9367a = r5     // Catch: java.lang.Throwable -> L27
            java.lang.Object r9 = r9.queryDataBundleFlashSaleList(r1, r8)     // Catch: java.lang.Throwable -> L27
            if (r9 != r0) goto L48
            goto L8b
        L48:
            com.transsnet.palmpay.core.bean.CommonResult r9 = (com.transsnet.palmpay.core.bean.CommonResult) r9     // Catch: java.lang.Throwable -> L27
            xf.o r1 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L27
        L4c:
            r1 = r9
            goto L55
        L4e:
            xf.o r1 = p355xf.q.f43977a
            xf.p r9 = androidx.camera.core.impl.utils.executor.g.f(r9)
            goto L4c
        L55:
            boolean r9 = r1 instanceof p355xf.p
            if (r9 != 0) goto L72
            r9 = r1
            com.transsnet.palmpay.core.bean.CommonResult r9 = (com.transsnet.palmpay.core.bean.CommonResult) r9
            cg.f r5 = Wf.I.f10809a
            Wf.p0 r5 = p015ag.o.f11960a
            Ua.S r6 = new Ua.S
            com.transsnet.palmpay.core.viewmodel.ModelDataPlanFlashSaleItem r7 = r8.f9370d
            r6.<init>(r9, r2, r7)
            r8.f9368b = r1
            r8.f9367a = r4
            java.lang.Object r9 = Wf.AbstractC0780y.s(r5, r6, r8)
            if (r9 != r0) goto L72
            goto L8b
        L72:
            java.lang.Throwable r9 = p355xf.q.a(r1)
            if (r9 == 0) goto L8c
            cg.f r4 = Wf.I.f10809a
            Wf.p0 r4 = p015ag.o.f11960a
            Ua.T r5 = new Ua.T
            r5.<init>(r2, r9)
            r8.f9368b = r1
            r8.f9367a = r3
            java.lang.Object r9 = Wf.AbstractC0780y.s(r4, r5, r8)
            if (r9 != r0) goto L8c
        L8b:
            return r0
        L8c:
            kotlin.Unit r9 = kotlin.Unit.f38893a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Ua.U.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
