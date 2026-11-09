package Db;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class H extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f1784d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f1783c = str;
        this.f1784d = str2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        H h7 = new H(this.f1783c, this.f1784d, continuation);
        h7.f1782b = obj;
        return h7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L15;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r8.f1781a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L54
        L10:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L18:
            java.lang.Object r1 = r8.f1782b
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L48
        L20:
            androidx.camera.core.impl.utils.executor.g.M(r9)
            java.lang.Object r9 = r8.f1782b
            r1 = r9
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            ob.a r9 = p221ob.c.f40268a
            com.transsnet.palmpay.credit.network.IApiCreditService r9 = C0.G.h(r9)
            com.transsnet.palmpay.credit.bean.req.OcUnfreezeReq r4 = new com.transsnet.palmpay.credit.bean.req.OcUnfreezeReq
            java.lang.Integer r5 = new java.lang.Integer
            r6 = 0
            r5.<init>(r6)
            java.lang.String r6 = r8.f1783c
            java.lang.String r7 = r8.f1784d
            r4.<init>(r6, r7, r5)
            r8.f1782b = r1
            r8.f1781a = r3
            java.lang.Object r9 = r9.unfreeze(r4, r8)
            if (r9 != r0) goto L48
            goto L53
        L48:
            r3 = 0
            r8.f1782b = r3
            r8.f1781a = r2
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L54
        L53:
            return r0
        L54:
            kotlin.Unit r9 = kotlin.Unit.f38893a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Db.H.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
