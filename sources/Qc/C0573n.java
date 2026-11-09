package Qc;

import com.transsnet.palmpay.core.bean.CommonBeanResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: Qc.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0573n extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CommonBeanResult f7801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7803c;

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C0573n c0573n = new C0573n(2, continuation);
        c0573n.f7803c = obj;
        return c0573n;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0573n) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r2.emit(r4, r8) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a5, code lost:
    
        if (r1.emit(r4, r8) == r0) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r8.f7802b
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L33
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            goto L1c
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto La8
        L21:
            com.transsnet.palmpay.core.bean.CommonBeanResult r1 = r8.f7801a
            java.lang.Object r2 = r8.f7803c
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L73
        L2b:
            java.lang.Object r1 = r8.f7803c
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L4e
        L33:
            androidx.camera.core.impl.utils.executor.g.M(r9)
            java.lang.Object r9 = r8.f7803c
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
            androidx.camera.video.internal.c r1 = p324va.c.f43141a
            java.lang.Object r1 = r1.f14623d
            com.transsnet.palmpay.core.network.api.AccountApiService r1 = (com.transsnet.palmpay.core.network.api.AccountApiService) r1
            r8.f7803c = r9
            r8.f7802b = r5
            java.lang.Object r1 = r1.getAutoTransferConfig(r8)
            if (r1 != r0) goto L4b
            goto La7
        L4b:
            r7 = r1
            r1 = r9
            r9 = r7
        L4e:
            com.transsnet.palmpay.core.bean.CommonBeanResult r9 = (com.transsnet.palmpay.core.bean.CommonBeanResult) r9
            T r5 = r9.data
            com.transsnet.palmpay.core.bean.rsp.GetAutoTransferConfigResp r5 = (com.transsnet.palmpay.core.bean.rsp.GetAutoTransferConfigResp) r5
            if (r5 == 0) goto L85
            int r5 = r5.isAutoTransfer
            if (r5 != 0) goto L85
            Kc.b r2 = Kc.c.f4996b
            Kc.c r2 = r2.getInstance()
            com.transsnet.palmpay.managemoney.api.ManageApiService r2 = r2.f4997a
            r8.f7803c = r1
            r8.f7801a = r9
            r8.f7802b = r4
            java.lang.Object r2 = r2.getRemindTurnOnAutoSave(r8)
            if (r2 != r0) goto L6f
            goto La7
        L6f:
            r7 = r1
            r1 = r9
            r9 = r2
            r2 = r7
        L73:
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r1, r9)
            r8.f7803c = r6
            r8.f7801a = r6
            r8.f7802b = r3
            java.lang.Object r9 = r2.emit(r4, r8)
            if (r9 != r0) goto La8
            goto La7
        L85:
            com.transsnet.palmpay.managemoney.bean.resp.GetRemindTurnOnAutoSaveResp r3 = new com.transsnet.palmpay.managemoney.bean.resp.GetRemindTurnOnAutoSaveResp
            com.transsnet.palmpay.managemoney.bean.resp.GetRemindTurnOnAutoSaveResp$Data r4 = new com.transsnet.palmpay.managemoney.bean.resp.GetRemindTurnOnAutoSaveResp$Data
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.<init>(r5)
            r3.<init>(r4)
            java.lang.String r4 = "00000000"
            r3.setRespCode(r4)
            kotlin.Unit r4 = kotlin.Unit.f38893a
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r9, r3)
            r8.f7803c = r6
            r8.f7802b = r2
            java.lang.Object r9 = r1.emit(r4, r8)
            if (r9 != r0) goto La8
        La7:
            return r0
        La8:
            kotlin.Unit r9 = kotlin.Unit.f38893a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Qc.C0573n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
