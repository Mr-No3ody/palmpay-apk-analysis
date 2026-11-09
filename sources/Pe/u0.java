package Pe;

import com.transsnet.palmpay.core.bean.bill.BillTotalCountReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillTotalCountReq f7311b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(BillTotalCountReq billTotalCountReq, Continuation continuation) {
        super(1, continuation);
        this.f7311b = billTotalCountReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new u0(this.f7311b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((u0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r5 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (r5 == r0) goto L19;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r4.f7310a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            androidx.camera.core.impl.utils.executor.g.M(r5)
            goto L4a
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            androidx.camera.core.impl.utils.executor.g.M(r5)
            goto L38
        L1c:
            androidx.camera.core.impl.utils.executor.g.M(r5)
            com.transsnet.palmpay.core.bean.bill.BillTotalCountReq r5 = r4.f7311b
            java.lang.String r1 = r5.wardMemberId
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L3b
            androidx.camera.video.internal.c r1 = p324va.c.f43141a
            java.lang.Object r1 = r1.f14621b
            com.transsnet.palmpay.core.network.PayApiService r1 = (com.transsnet.palmpay.core.network.PayApiService) r1
            r4.f7310a = r3
            java.lang.Object r5 = r1.getBillTotalCount(r5, r4)
            if (r5 != r0) goto L38
            goto L49
        L38:
            com.transsnet.palmpay.core.bean.CommonBeanResult r5 = (com.transsnet.palmpay.core.bean.CommonBeanResult) r5
            return r5
        L3b:
            m6.j r1 = Cc.a.f1353a
            java.lang.Object r1 = r1.f39520b
            com.transsnet.palmpay.main.export.business.IApiMainService r1 = (com.transsnet.palmpay.main.export.business.IApiMainService) r1
            r4.f7310a = r2
            java.lang.Object r5 = r1.getBillTotalCount(r5, r4)
            if (r5 != r0) goto L4a
        L49:
            return r0
        L4a:
            com.transsnet.palmpay.core.bean.CommonBeanResult r5 = (com.transsnet.palmpay.core.bean.CommonBeanResult) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Pe.u0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
