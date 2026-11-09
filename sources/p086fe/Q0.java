package p086fe;

import Ff.h;
import com.transsnet.palmpay.teller.bean.PaymentItemListReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class Q0 extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f36566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PaymentItemListReq f36567c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(String str, PaymentItemListReq paymentItemListReq, Continuation continuation) {
        super(1, continuation);
        this.f36566b = str;
        this.f36567c = paymentItemListReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new Q0(this.f36566b, this.f36567c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Q0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r6 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r6 == r0) goto L22;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r5.f36565a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            androidx.camera.core.impl.utils.executor.g.M(r6)
            goto L43
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            androidx.camera.core.impl.utils.executor.g.M(r6)
            goto L55
        L1c:
            androidx.camera.core.impl.utils.executor.g.M(r6)
            java.lang.String r6 = "8"
            java.lang.String r1 = r5.f36566b
            boolean r6 = r6.equals(r1)
            com.transsnet.palmpay.teller.bean.PaymentItemListReq r4 = r5.f36567c
            if (r6 != 0) goto L46
            java.lang.String r6 = "24"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L34
            goto L46
        L34:
            Sd.b r6 = Qd.a.f7847a
            java.lang.Object r6 = r6.f8871b
            com.transsnet.palmpay.teller.business.IApiTellerService r6 = (com.transsnet.palmpay.teller.business.IApiTellerService) r6
            r5.f36565a = r2
            java.lang.Object r6 = r6.getPaymentItemListByNew(r4, r5)
            if (r6 != r0) goto L43
            goto L54
        L43:
            com.transsnet.palmpay.teller.bean.PaymentItemListRsp r6 = (com.transsnet.palmpay.teller.bean.PaymentItemListRsp) r6
            return r6
        L46:
            Sd.b r6 = Qd.a.f7847a
            java.lang.Object r6 = r6.f8871b
            com.transsnet.palmpay.teller.business.IApiTellerService r6 = (com.transsnet.palmpay.teller.business.IApiTellerService) r6
            r5.f36565a = r3
            java.lang.Object r6 = r6.getBettingPaymentItemList(r4, r5)
            if (r6 != r0) goto L55
        L54:
            return r0
        L55:
            com.transsnet.palmpay.teller.bean.PaymentItemListRsp r6 = (com.transsnet.palmpay.teller.bean.PaymentItemListRsp) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p086fe.Q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
