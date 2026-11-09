package x9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f43676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f43677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F f43678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f43679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f43680f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, F f10, Continuation continuation, String str2, String str3) {
        super(2, continuation);
        this.f43677c = str;
        this.f43678d = f10;
        this.f43679e = str2;
        this.f43680f = str3;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        String str = this.f43679e;
        String str2 = this.f43680f;
        j jVar = new j(this.f43677c, this.f43678d, continuation, str, str2);
        jVar.f43676b = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008a  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:
    
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
            int r1 = r10.f43675a
            kotlin.jvm.internal.F r2 = r10.f43678d
            java.lang.String r3 = r10.f43677c
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
            goto Lbc
        L24:
            java.lang.Object r1 = r10.f43676b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            androidx.camera.core.impl.utils.executor.g.M(r11)
            goto L81
        L2c:
            java.lang.Object r1 = r10.f43676b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            androidx.camera.core.impl.utils.executor.g.M(r11)
            goto L6c
        L34:
            androidx.camera.core.impl.utils.executor.g.M(r11)
            java.lang.Object r11 = r10.f43676b
            r1 = r11
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            java.lang.String r11 = com.horcrux.svg.d0.p(r3)
            boolean r8 = android.text.TextUtils.isEmpty(r11)
            if (r8 != 0) goto L6c
            com.transsnet.palmpay.betting.viewmodel.BettingDepositViewModel$queryOptionsAmount$$inlined$launchRequestFromCacheFirstByParams$default$1$1$1 r8 = new com.transsnet.palmpay.betting.viewmodel.BettingDepositViewModel$queryOptionsAmount$$inlined$launchRequestFromCacheFirstByParams$default$1$1$1
            r8.<init>()
            java.lang.reflect.Type r8 = r8.getType()
            Pa.w r9 = Pa.C0525w.f()
            java.lang.Object r8 = r9.e(r11, r8)
            com.transsnet.palmpay.core.bean.CommonResult r8 = (com.transsnet.palmpay.core.bean.CommonResult) r8
            kotlin.jvm.internal.Intrinsics.e(r11)
            r2.f38951a = r11
            kotlin.jvm.internal.Intrinsics.e(r8)
            r10.f43676b = r1
            r10.f43675a = r7
            java.lang.Object r11 = r1.emit(r8, r10)
            if (r11 != r0) goto L6c
            goto Lbb
        L6c:
            Sd.b r11 = Qd.a.f7847a
            java.lang.Object r11 = r11.f8871b
            com.transsnet.palmpay.teller.business.IApiTellerService r11 = (com.transsnet.palmpay.teller.business.IApiTellerService) r11
            r10.f43676b = r1
            r10.f43675a = r6
            java.lang.String r6 = r10.f43679e
            java.lang.String r7 = r10.f43680f
            java.lang.Object r11 = r11.queryBettingAmountItemNew(r6, r7, r10)
            if (r11 != r0) goto L81
            goto Lbb
        L81:
            com.transsnet.palmpay.core.bean.CommonResult r11 = (com.transsnet.palmpay.core.bean.CommonResult) r11
            boolean r6 = r11.isSuccess()
            r7 = 0
            if (r6 == 0) goto Lb1
            Pa.w r4 = Pa.C0525w.f()
            java.lang.Object r4 = r4.f7166b
            com.google.gson.Gson r4 = (com.google.gson.Gson) r4
            java.lang.Class<com.transsnet.palmpay.core.bean.CommonListResultV2> r6 = com.transsnet.palmpay.core.bean.CommonListResultV2.class
            java.lang.String r4 = r4.toJson(r11, r6)
            r6 = 604800(0x93a80, float:8.47505E-40)
            com.horcrux.svg.d0.r(r6, r3, r4)
            java.lang.Object r2 = r2.f38951a
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto Lbc
            r10.f43676b = r7
            r10.f43675a = r5
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto Lbc
            goto Lbb
        Lb1:
            r10.f43676b = r7
            r10.f43675a = r4
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto Lbc
        Lbb:
            return r0
        Lbc:
            kotlin.Unit r11 = kotlin.Unit.f38893a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: x9.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
