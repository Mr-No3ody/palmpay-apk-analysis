package Pe;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: Pe.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0529a extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7216b;

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C0529a c0529a = new C0529a(2, continuation);
        c0529a.f7216b = obj;
        return c0529a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0529a) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r1.emit(r4, r6) == r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r6.f7215a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            androidx.camera.core.impl.utils.executor.g.M(r7)
            goto L69
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            java.lang.Object r1 = r6.f7216b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            androidx.camera.core.impl.utils.executor.g.M(r7)
            goto L39
        L20:
            androidx.camera.core.impl.utils.executor.g.M(r7)
            java.lang.Object r7 = r6.f7216b
            r1 = r7
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            androidx.camera.video.internal.c r7 = p324va.c.f43141a
            java.lang.Object r7 = r7.f14623d
            com.transsnet.palmpay.core.network.api.AccountApiService r7 = (com.transsnet.palmpay.core.network.api.AccountApiService) r7
            r6.f7216b = r1
            r6.f7215a = r3
            java.lang.Object r7 = r7.getAutoTransferConfig(r6)
            if (r7 != r0) goto L39
            goto L68
        L39:
            com.transsnet.palmpay.core.bean.CommonBeanResult r7 = (com.transsnet.palmpay.core.bean.CommonBeanResult) r7
            T r7 = r7.data
            com.transsnet.palmpay.core.bean.rsp.GetAutoTransferConfigResp r7 = (com.transsnet.palmpay.core.bean.rsp.GetAutoTransferConfigResp) r7
            if (r7 == 0) goto L69
            int r4 = r7.isWhitelistUser
            if (r4 != r3) goto L69
            if (r7 == 0) goto L69
            int r4 = r7.isAutoTransfer
            if (r4 != 0) goto L69
            kotlin.Pair r4 = new kotlin.Pair
            r5 = 0
            if (r7 == 0) goto L55
            boolean r7 = r7.isOpen
            if (r7 != 0) goto L55
            goto L56
        L55:
            r3 = r5
        L56:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            r3 = 0
            r4.<init>(r7, r3)
            r6.f7216b = r3
            r6.f7215a = r2
            java.lang.Object r7 = r1.emit(r4, r6)
            if (r7 != r0) goto L69
        L68:
            return r0
        L69:
            kotlin.Unit r7 = kotlin.Unit.f38893a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Pe.C0529a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
