package p130ic;

import Ff.h;
import com.transsnet.palmpay.teller.bean.DataBundleWalletItemBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataBundleWalletItemBean f37501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f37502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f37503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f37504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f37505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f37506g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DataBundleWalletItemBean dataBundleWalletItemBean, String str, long j6, boolean z3, String str2, String str3, Continuation continuation) {
        super(1, continuation);
        this.f37501b = dataBundleWalletItemBean;
        this.f37502c = str;
        this.f37503d = j6;
        this.f37504e = z3;
        this.f37505f = str2;
        this.f37506g = str3;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new d(this.f37501b, this.f37502c, this.f37503d, this.f37504e, this.f37505f, this.f37506g, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((d) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r8 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r8 == r0) goto L21;
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
            int r1 = r7.f37500a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            androidx.camera.core.impl.utils.executor.g.M(r8)
            goto L68
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L18:
            androidx.camera.core.impl.utils.executor.g.M(r8)
            goto L56
        L1c:
            androidx.camera.core.impl.utils.executor.g.M(r8)
            java.lang.String r8 = p070ee.c.f36289a
            boolean r8 = r7.f37504e
            java.lang.String r1 = r7.f37502c
            com.transsnet.palmpay.teller.bean.DataBundleWalletItemBean r4 = r7.f37501b
            long r5 = r7.f37503d
            com.transsnet.palmpay.teller.bean.CreateTellerOrderReq r8 = p070ee.c.d(r4, r1, r5, r8)
            java.lang.String r1 = r7.f37505f
            r8.outSourceId = r1
            java.lang.String r1 = r7.f37506g
            r8.sourceCategoryId = r1
            java.lang.String r1 = r4.getDiscountPackageId()
            if (r1 == 0) goto L59
            int r1 = r1.length()
            if (r1 <= 0) goto L59
            java.lang.String r1 = r4.getDiscountPackageId()
            r8.discountPackageId = r1
            Sd.b r1 = Qd.a.f7847a
            java.lang.Object r1 = r1.f8871b
            com.transsnet.palmpay.teller.business.IApiTellerService r1 = (com.transsnet.palmpay.teller.business.IApiTellerService) r1
            r7.f37500a = r3
            java.lang.Object r8 = r1.createFlashSaleDataBundleOrder(r8, r7)
            if (r8 != r0) goto L56
            goto L67
        L56:
            com.transsnet.palmpay.teller.bean.CreateTellerOrderRsp r8 = (com.transsnet.palmpay.teller.bean.CreateTellerOrderRsp) r8
            return r8
        L59:
            Sd.b r1 = Qd.a.f7847a
            java.lang.Object r1 = r1.f8871b
            com.transsnet.palmpay.teller.business.IApiTellerService r1 = (com.transsnet.palmpay.teller.business.IApiTellerService) r1
            r7.f37500a = r2
            java.lang.Object r8 = r1.createDataBundleOrder(r8, r7)
            if (r8 != r0) goto L68
        L67:
            return r0
        L68:
            com.transsnet.palmpay.teller.bean.CreateTellerOrderRsp r8 = (com.transsnet.palmpay.teller.bean.CreateTellerOrderRsp) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p130ic.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
