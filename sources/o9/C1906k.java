package o9;

import com.transsnet.palmpay.teller.bean.DataBundleWalletItemBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o9.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1906k extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataBundleWalletItemBean f40199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f40200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f40201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f40202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f40203f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1906k(DataBundleWalletItemBean dataBundleWalletItemBean, String str, long j6, boolean z3, String str2, Continuation continuation) {
        super(1, continuation);
        this.f40199b = dataBundleWalletItemBean;
        this.f40200c = str;
        this.f40201d = j6;
        this.f40202e = z3;
        this.f40203f = str2;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1906k(this.f40199b, this.f40200c, this.f40201d, this.f40202e, this.f40203f, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1906k) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
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
            int r1 = r7.f40198a
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
            boolean r8 = r7.f40202e
            java.lang.String r1 = r7.f40200c
            com.transsnet.palmpay.teller.bean.DataBundleWalletItemBean r4 = r7.f40199b
            long r5 = r7.f40201d
            com.transsnet.palmpay.teller.bean.CreateTellerOrderReq r8 = p070ee.c.d(r4, r1, r5, r8)
            java.lang.String r1 = r7.f40203f
            r8.outSourceId = r1
            java.lang.String r1 = "10"
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
            r7.f40198a = r3
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
            r7.f40198a = r2
            java.lang.Object r8 = r1.createDataBundleOrder(r8, r7)
            if (r8 != r0) goto L68
        L67:
            return r0
        L68:
            com.transsnet.palmpay.teller.bean.CreateTellerOrderRsp r8 = (com.transsnet.palmpay.teller.bean.CreateTellerOrderRsp) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.C1906k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
