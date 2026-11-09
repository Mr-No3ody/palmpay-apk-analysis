package p129ib;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f37478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f37479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f37480d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z3, boolean z8, m mVar, Continuation continuation) {
        super(2, continuation);
        this.f37478b = z3;
        this.f37479c = z8;
        this.f37480d = mVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f37478b, this.f37479c, this.f37480d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (Wf.AbstractC0780y.s(r0, r5, r8) == r1) goto L24;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r0 = "queryPopUpsV2 failed >>> "
            Ef.a r1 = Ef.a.f2423a
            int r2 = r8.f37477a
            java.lang.String r3 = "HomeDialogHandler"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L24
            if (r2 == r5) goto L20
            if (r2 != r4) goto L18
            androidx.camera.core.impl.utils.executor.g.M(r9)     // Catch: java.lang.Exception -> L16
            goto L8d
        L16:
            r9 = move-exception
            goto L84
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            androidx.camera.core.impl.utils.executor.g.M(r9)     // Catch: java.lang.Exception -> L16
            goto L41
        L24:
            androidx.camera.core.impl.utils.executor.g.M(r9)
            ob.a r9 = p221ob.c.f40268a     // Catch: java.lang.Exception -> L16
            ob.c r9 = r9.getInstance()     // Catch: java.lang.Exception -> L16
            r9.getClass()     // Catch: java.lang.Exception -> L16
            com.transsnet.palmpay.credit.network.IApiCreditService r9 = p221ob.c.a()     // Catch: java.lang.Exception -> L16
            boolean r2 = r8.f37478b     // Catch: java.lang.Exception -> L16
            boolean r7 = r8.f37479c     // Catch: java.lang.Exception -> L16
            r8.f37477a = r5     // Catch: java.lang.Exception -> L16
            java.lang.Object r9 = r9.queryLoanDialogPopUps(r2, r7, r6, r8)     // Catch: java.lang.Exception -> L16
            if (r9 != r1) goto L41
            goto L5e
        L41:
            com.transsnet.palmpay.core.bean.CommonBeanResult r9 = (com.transsnet.palmpay.core.bean.CommonBeanResult) r9     // Catch: java.lang.Exception -> L16
            if (r9 == 0) goto L8d
            ib.m r2 = r8.f37480d     // Catch: java.lang.Exception -> L16
            boolean r5 = r9.isSuccess()     // Catch: java.lang.Exception -> L16
            if (r5 == 0) goto L5f
            cg.f r0 = Wf.I.f10809a     // Catch: java.lang.Exception -> L16
            Wf.p0 r0 = p015ag.o.f11960a     // Catch: java.lang.Exception -> L16
            ib.k r5 = new ib.k     // Catch: java.lang.Exception -> L16
            r5.<init>(r2, r9, r6)     // Catch: java.lang.Exception -> L16
            r8.f37477a = r4     // Catch: java.lang.Exception -> L16
            java.lang.Object r9 = Wf.AbstractC0780y.s(r0, r5, r8)     // Catch: java.lang.Exception -> L16
            if (r9 != r1) goto L8d
        L5e:
            return r1
        L5f:
            java.lang.String r1 = r9.getRespCode()     // Catch: java.lang.Exception -> L16
            java.lang.String r9 = r9.getRespMsg()     // Catch: java.lang.Exception -> L16
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L16
            r2.<init>(r0)     // Catch: java.lang.Exception -> L16
            r2.append(r1)     // Catch: java.lang.Exception -> L16
            java.lang.String r0 = " "
            r2.append(r0)     // Catch: java.lang.Exception -> L16
            r2.append(r9)     // Catch: java.lang.Exception -> L16
            java.lang.String r9 = r2.toString()     // Catch: java.lang.Exception -> L16
            java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch: java.lang.Exception -> L16
            r0 = 5
            F6.d.h(r3, r0, r9)     // Catch: java.lang.Exception -> L16
            goto L8d
        L84:
            java.lang.String r0 = "queryPopUpsV2 error >>>"
            java.lang.Object[] r9 = new java.lang.Object[]{r0, r9}
            F6.d.c(r3, r9)
        L8d:
            kotlin.Unit r9 = kotlin.Unit.f38893a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p129ib.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
