package p086fe;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class T extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F f36580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f36581e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(String str, F f10, Continuation continuation, String str2) {
        super(2, continuation);
        this.f36579c = str;
        this.f36580d = f10;
        this.f36581e = str2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        T t = new T(this.f36579c, this.f36580d, continuation, this.f36581e);
        t.f36578b = obj;
        return t;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((T) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008e  */
    /* JADX WARN: Code duplicated, block: B:26:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
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
            int r1 = r10.f36577a
            kotlin.jvm.internal.F r2 = r10.f36580d
            java.lang.String r3 = r10.f36579c
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
            goto Lc0
        L24:
            java.lang.Object r1 = r10.f36578b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            androidx.camera.core.impl.utils.executor.g.M(r11)
            goto L85
        L2c:
            java.lang.Object r1 = r10.f36578b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            androidx.camera.core.impl.utils.executor.g.M(r11)
            goto L6c
        L34:
            androidx.camera.core.impl.utils.executor.g.M(r11)
            java.lang.Object r11 = r10.f36578b
            r1 = r11
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            java.lang.String r11 = com.horcrux.svg.d0.p(r3)
            boolean r8 = android.text.TextUtils.isEmpty(r11)
            if (r8 != 0) goto L6c
            com.transsnet.palmpay.teller.viewmodel.BillPaymentHomeNGViewModel$queryTransactionLimitAmount$$inlined$launchRequestFromCacheFirstByParams$default$1$1$1 r8 = new com.transsnet.palmpay.teller.viewmodel.BillPaymentHomeNGViewModel$queryTransactionLimitAmount$$inlined$launchRequestFromCacheFirstByParams$default$1$1$1
            r8.<init>()
            java.lang.reflect.Type r8 = r8.getType()
            Pa.w r9 = Pa.C0525w.f()
            java.lang.Object r8 = r9.e(r11, r8)
            com.transsnet.palmpay.core.bean.CommonResult r8 = (com.transsnet.palmpay.core.bean.CommonResult) r8
            kotlin.jvm.internal.Intrinsics.e(r11)
            r2.f38951a = r11
            kotlin.jvm.internal.Intrinsics.e(r8)
            r10.f36578b = r1
            r10.f36577a = r7
            java.lang.Object r11 = r1.emit(r8, r10)
            if (r11 != r0) goto L6c
            goto Lbf
        L6c:
            androidx.camera.video.internal.c r11 = p324va.c.f43141a
            java.lang.Object r11 = r11.f14621b
            com.transsnet.palmpay.core.network.PayApiService r11 = (com.transsnet.palmpay.core.network.PayApiService) r11
            java.lang.Object r7 = p070ee.b.f36288a
            java.lang.String r7 = r10.f36581e
            java.lang.String r7 = p070ee.b.b(r7)
            r10.f36578b = r1
            r10.f36577a = r6
            java.lang.Object r11 = r11.queryLimitAmountV2ByNew(r7, r10)
            if (r11 != r0) goto L85
            goto Lbf
        L85:
            com.transsnet.palmpay.core.bean.CommonResult r11 = (com.transsnet.palmpay.core.bean.CommonResult) r11
            boolean r6 = r11.isSuccess()
            r7 = 0
            if (r6 == 0) goto Lb5
            Pa.w r4 = Pa.C0525w.f()
            java.lang.Object r4 = r4.f7166b
            com.google.gson.Gson r4 = (com.google.gson.Gson) r4
            java.lang.Class<com.transsnet.palmpay.core.bean.rsp.QueryLimitAmountResp> r6 = com.transsnet.palmpay.core.bean.rsp.QueryLimitAmountResp.class
            java.lang.String r4 = r4.toJson(r11, r6)
            r6 = 604800(0x93a80, float:8.47505E-40)
            com.horcrux.svg.d0.r(r6, r3, r4)
            java.lang.Object r2 = r2.f38951a
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto Lc0
            r10.f36578b = r7
            r10.f36577a = r5
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto Lc0
            goto Lbf
        Lb5:
            r10.f36578b = r7
            r10.f36577a = r4
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto Lc0
        Lbf:
            return r0
        Lc0:
            kotlin.Unit r11 = kotlin.Unit.f38893a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p086fe.T.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
