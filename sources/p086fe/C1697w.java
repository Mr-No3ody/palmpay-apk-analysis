package p086fe;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: fe.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1697w extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F f36775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f36776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1697w(String str, F f10, Continuation continuation, String str2) {
        super(2, continuation);
        this.f36774c = str;
        this.f36775d = f10;
        this.f36776e = str2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1697w c1697w = new C1697w(this.f36774c, this.f36775d, continuation, this.f36776e);
        c1697w.f36773b = obj;
        return c1697w;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1697w) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008d  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b1, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bc, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L31;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r10.f36772a
            kotlin.jvm.internal.F r2 = r10.f36775d
            java.lang.String r3 = r10.f36774c
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L34
            if (r1 == r7) goto L2c
            if (r1 == r6) goto L24
            if (r1 == r5) goto L1f
            if (r1 != r4) goto L17
            goto L1f
        L17:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1f:
            androidx.camera.core.impl.utils.executor.g.M(r11)
            goto Lbf
        L24:
            java.lang.Object r1 = r10.f36773b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            androidx.camera.core.impl.utils.executor.g.M(r11)
            goto L84
        L2c:
            java.lang.Object r1 = r10.f36773b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            androidx.camera.core.impl.utils.executor.g.M(r11)
            goto L6c
        L34:
            androidx.camera.core.impl.utils.executor.g.M(r11)
            java.lang.Object r11 = r10.f36773b
            r1 = r11
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            java.lang.String r11 = com.horcrux.svg.d0.p(r3)
            boolean r8 = android.text.TextUtils.isEmpty(r11)
            if (r8 != 0) goto L6c
            com.transsnet.palmpay.teller.viewmodel.BillPaymentElectricityHomeViewModel$queryLastBiller$$inlined$launchRequestFromCacheFirstByParams$default$1$1$1 r8 = new com.transsnet.palmpay.teller.viewmodel.BillPaymentElectricityHomeViewModel$queryLastBiller$$inlined$launchRequestFromCacheFirstByParams$default$1$1$1
            r8.<init>()
            java.lang.reflect.Type r8 = r8.getType()
            Pa.w r9 = Pa.C0525w.f()
            java.lang.Object r8 = r9.e(r11, r8)
            com.transsnet.palmpay.core.bean.CommonResult r8 = (com.transsnet.palmpay.core.bean.CommonResult) r8
            kotlin.jvm.internal.Intrinsics.e(r11)
            r2.f38951a = r11
            kotlin.jvm.internal.Intrinsics.e(r8)
            r10.f36773b = r1
            r10.f36772a = r7
            java.lang.Object r11 = r1.emit(r8, r10)
            if (r11 != r0) goto L6c
            goto Lbe
        L6c:
            Sd.b r11 = Qd.a.f7847a
            java.lang.Object r11 = r11.f8871b
            com.transsnet.palmpay.teller.business.IApiTellerService r11 = (com.transsnet.palmpay.teller.business.IApiTellerService) r11
            com.transsnet.palmpay.teller.bean.QueryLastBillerReq r7 = new com.transsnet.palmpay.teller.bean.QueryLastBillerReq
            java.lang.String r8 = r10.f36776e
            r7.<init>(r8)
            r10.f36773b = r1
            r10.f36772a = r6
            java.lang.Object r11 = r11.queryLastBillerByNew(r7, r10)
            if (r11 != r0) goto L84
            goto Lbe
        L84:
            com.transsnet.palmpay.core.bean.CommonResult r11 = (com.transsnet.palmpay.core.bean.CommonResult) r11
            boolean r6 = r11.isSuccess()
            r7 = 0
            if (r6 == 0) goto Lb4
            Pa.w r4 = Pa.C0525w.f()
            java.lang.Object r4 = r4.f7166b
            com.google.gson.Gson r4 = (com.google.gson.Gson) r4
            java.lang.Class<com.transsnet.palmpay.teller.bean.QueryLastBillerRsp> r6 = com.transsnet.palmpay.teller.bean.QueryLastBillerRsp.class
            java.lang.String r4 = r4.toJson(r11, r6)
            r6 = 604800(0x93a80, float:8.47505E-40)
            com.horcrux.svg.d0.r(r6, r3, r4)
            java.lang.Object r2 = r2.f38951a
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto Lbf
            r10.f36773b = r7
            r10.f36772a = r5
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto Lbf
            goto Lbe
        Lb4:
            r10.f36773b = r7
            r10.f36772a = r4
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto Lbf
        Lbe:
            return r0
        Lbf:
            kotlin.Unit r11 = kotlin.Unit.f38893a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p086fe.C1697w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
