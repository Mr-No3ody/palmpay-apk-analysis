package p086fe;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class H0 extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f36518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36519c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.f36518b = str;
        this.f36519c = str2;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new H0(this.f36518b, this.f36519c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((H0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r8 == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        if (r8 == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        if (r8 == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        if (r8 == r0) goto L42;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r7.f36517a
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2c
            if (r1 == r5) goto L27
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            androidx.camera.core.impl.utils.executor.g.M(r8)
            goto L91
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            androidx.camera.core.impl.utils.executor.g.M(r8)
            goto L7f
        L23:
            androidx.camera.core.impl.utils.executor.g.M(r8)
            goto L63
        L27:
            androidx.camera.core.impl.utils.executor.g.M(r8)
            goto La3
        L2c:
            androidx.camera.core.impl.utils.executor.g.M(r8)
            java.lang.String r8 = "96"
            java.lang.String r1 = r7.f36518b
            boolean r8 = r8.equals(r1)
            java.lang.String r6 = r7.f36519c
            if (r8 != 0) goto L94
            java.lang.String r8 = "p2"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L94
            java.lang.String r8 = "r8"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L4c
            goto L94
        L4c:
            java.lang.String r8 = "v5"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L66
            Sd.b r8 = Qd.a.f7847a
            java.lang.Object r8 = r8.f8871b
            com.transsnet.palmpay.teller.business.IApiTellerService r8 = (com.transsnet.palmpay.teller.business.IApiTellerService) r8
            r7.f36517a = r4
            java.lang.Object r8 = r8.getOrderDetailByGiftCard(r6, r7)
            if (r8 != r0) goto L63
            goto La2
        L63:
            com.transsnet.palmpay.core.bean.CommonBeanResult r8 = (com.transsnet.palmpay.core.bean.CommonBeanResult) r8
            return r8
        L66:
            java.lang.String r8 = "34"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L82
            Sd.b r8 = Qd.a.f7847a
            java.lang.Object r8 = r8.f8871b
            com.transsnet.palmpay.teller.business.IApiTellerService r8 = (com.transsnet.palmpay.teller.business.IApiTellerService) r8
            r7.f36517a = r3
            java.lang.String r1 = "TRADE_RESULT"
            java.lang.Object r8 = r8.getOrderDetailByDataBundle(r6, r1, r7)
            if (r8 != r0) goto L7f
            goto La2
        L7f:
            com.transsnet.palmpay.core.bean.CommonBeanResult r8 = (com.transsnet.palmpay.core.bean.CommonBeanResult) r8
            return r8
        L82:
            Sd.b r8 = Qd.a.f7847a
            java.lang.Object r8 = r8.f8871b
            com.transsnet.palmpay.teller.business.IApiTellerService r8 = (com.transsnet.palmpay.teller.business.IApiTellerService) r8
            r7.f36517a = r2
            java.lang.Object r8 = r8.getOrderDetailByNew(r6, r7)
            if (r8 != r0) goto L91
            goto La2
        L91:
            com.transsnet.palmpay.core.bean.CommonBeanResult r8 = (com.transsnet.palmpay.core.bean.CommonBeanResult) r8
            return r8
        L94:
            Sd.b r8 = Qd.a.f7847a
            java.lang.Object r8 = r8.f8871b
            com.transsnet.palmpay.teller.business.IApiTellerService r8 = (com.transsnet.palmpay.teller.business.IApiTellerService) r8
            r7.f36517a = r5
            java.lang.Object r8 = r8.getBettingOrderDetailByNew(r6, r7)
            if (r8 != r0) goto La3
        La2:
            return r0
        La3:
            com.transsnet.palmpay.core.bean.CommonBeanResult r8 = (com.transsnet.palmpay.core.bean.CommonBeanResult) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p086fe.H0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
