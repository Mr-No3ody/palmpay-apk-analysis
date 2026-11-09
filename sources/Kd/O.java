package Kd;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class O extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.F f5105d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(String str, kotlin.jvm.internal.F f10, Continuation continuation) {
        super(2, continuation);
        this.f5104c = str;
        this.f5105d = f10;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        O o10 = new O(this.f5104c, this.f5105d, continuation);
        o10.f5103b = obj;
        return o10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0091  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b5, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c0, code lost:
    
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
            int r1 = r10.f5102a
            kotlin.jvm.internal.F r2 = r10.f5105d
            java.lang.String r3 = r10.f5104c
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
            goto Lc3
        L24:
            java.lang.Object r1 = r10.f5103b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            androidx.camera.core.impl.utils.executor.g.M(r11)
            goto L88
        L2c:
            java.lang.Object r1 = r10.f5103b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            androidx.camera.core.impl.utils.executor.g.M(r11)
            goto L6c
        L34:
            androidx.camera.core.impl.utils.executor.g.M(r11)
            java.lang.Object r11 = r10.f5103b
            r1 = r11
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            java.lang.String r11 = com.horcrux.svg.d0.p(r3)
            boolean r8 = android.text.TextUtils.isEmpty(r11)
            if (r8 != 0) goto L6c
            com.transsnet.palmpay.send_money.viewmodel.ScheduleTransferPaymentViewModel$queryHomeBankFavoriteRecipients$$inlined$launchRequestFromCacheFirstByParams$default$1$1$1 r8 = new com.transsnet.palmpay.send_money.viewmodel.ScheduleTransferPaymentViewModel$queryHomeBankFavoriteRecipients$$inlined$launchRequestFromCacheFirstByParams$default$1$1$1
            r8.<init>()
            java.lang.reflect.Type r8 = r8.getType()
            Pa.w r9 = Pa.C0525w.f()
            java.lang.Object r8 = r9.e(r11, r8)
            com.transsnet.palmpay.core.bean.CommonResult r8 = (com.transsnet.palmpay.core.bean.CommonResult) r8
            kotlin.jvm.internal.Intrinsics.e(r11)
            r2.f38951a = r11
            kotlin.jvm.internal.Intrinsics.e(r8)
            r10.f5103b = r1
            r10.f5102a = r7
            java.lang.Object r11 = r1.emit(r8, r10)
            if (r11 != r0) goto L6c
            goto Lc2
        L6c:
            Oe.a r11 = p188md.b.f39648a
            java.lang.Object r11 = r11.f6830b
            com.transsnet.palmpay.send_money.api.SendMoneyApiService r11 = (com.transsnet.palmpay.send_money.api.SendMoneyApiService) r11
            com.transsnet.palmpay.core.bean.req.CommonListReq r8 = new com.transsnet.palmpay.core.bean.req.CommonListReq
            r8.<init>()
            r9 = 200(0xc8, float:2.8E-43)
            r8.pageNum = r9
            r8.pageSize = r7
            r10.f5103b = r1
            r10.f5102a = r6
            java.lang.Object r11 = r11.queryBankFavoriteRecipients(r8, r10)
            if (r11 != r0) goto L88
            goto Lc2
        L88:
            com.transsnet.palmpay.core.bean.CommonResult r11 = (com.transsnet.palmpay.core.bean.CommonResult) r11
            boolean r6 = r11.isSuccess()
            r7 = 0
            if (r6 == 0) goto Lb8
            Pa.w r4 = Pa.C0525w.f()
            java.lang.Object r4 = r4.f7166b
            com.google.gson.Gson r4 = (com.google.gson.Gson) r4
            java.lang.Class<com.transsnet.palmpay.send_money.bean.RecipientListResp> r6 = com.transsnet.palmpay.send_money.bean.RecipientListResp.class
            java.lang.String r4 = r4.toJson(r11, r6)
            r6 = 86400(0x15180, float:1.21072E-40)
            com.horcrux.svg.d0.r(r6, r3, r4)
            java.lang.Object r2 = r2.f38951a
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto Lc3
            r10.f5103b = r7
            r10.f5102a = r5
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto Lc3
            goto Lc2
        Lb8:
            r10.f5103b = r7
            r10.f5102a = r4
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto Lc3
        Lc2:
            return r0
        Lc3:
            kotlin.Unit r11 = kotlin.Unit.f38893a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Kd.O.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
