package p129ib;

import Ff.h;
import android.app.Activity;
import com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f37472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f37473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ QueryLoanDialogPopUpsBean f37474d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, Activity activity, QueryLoanDialogPopUpsBean queryLoanDialogPopUpsBean, Continuation continuation) {
        super(2, continuation);
        this.f37472b = mVar;
        this.f37473c = activity;
        this.f37474d = queryLoanDialogPopUpsBean;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f37472b, this.f37473c, this.f37474d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (Wf.AbstractC0780y.s(r10, r3, r9) == r0) goto L20;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r9.f37471a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            androidx.camera.core.impl.utils.executor.g.M(r10)     // Catch: java.lang.Exception -> L10
            goto L69
        L10:
            r0 = move-exception
            r10 = r0
            goto L66
        L13:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1b:
            androidx.camera.core.impl.utils.executor.g.M(r10)     // Catch: java.lang.Exception -> L10
            goto L4a
        L1f:
            androidx.camera.core.impl.utils.executor.g.M(r10)
            java.lang.String r10 = "HomeDialogHandler"
            java.lang.String r1 = "handleQuotaChange >>>"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Exception -> L10
            r4 = 3
            F6.d.h(r10, r4, r1)     // Catch: java.lang.Exception -> L10
            ob.a r10 = p221ob.c.f40268a     // Catch: java.lang.Exception -> L10
            ob.c r10 = r10.getInstance()     // Catch: java.lang.Exception -> L10
            r10.getClass()     // Catch: java.lang.Exception -> L10
            com.transsnet.palmpay.credit.network.IApiCreditService r10 = p221ob.c.a()     // Catch: java.lang.Exception -> L10
            com.transsnet.palmpay.credit.bean.req.QueryLoanAmountIncreaseReq r1 = new com.transsnet.palmpay.credit.bean.req.QueryLoanAmountIncreaseReq     // Catch: java.lang.Exception -> L10
            r4 = 0
            r1.<init>(r4, r3, r4)     // Catch: java.lang.Exception -> L10
            r9.f37471a = r3     // Catch: java.lang.Exception -> L10
            java.lang.Object r10 = r10.queryLoanAmountIncrease(r1, r9)     // Catch: java.lang.Exception -> L10
            if (r10 != r0) goto L4a
            goto L65
        L4a:
            ib.m r5 = r9.f37472b     // Catch: java.lang.Exception -> L10
            android.app.Activity r6 = r9.f37473c     // Catch: java.lang.Exception -> L10
            com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean r7 = r9.f37474d     // Catch: java.lang.Exception -> L10
            r4 = r10
            com.transsnet.palmpay.credit.bean.resp.CreditIncreaseInfo r4 = (com.transsnet.palmpay.credit.bean.resp.CreditIncreaseInfo) r4     // Catch: java.lang.Exception -> L10
            cg.f r10 = Wf.I.f10809a     // Catch: java.lang.Exception -> L10
            Wf.p0 r10 = p015ag.o.f11960a     // Catch: java.lang.Exception -> L10
            ib.i r3 = new ib.i     // Catch: java.lang.Exception -> L10
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L10
            r9.f37471a = r2     // Catch: java.lang.Exception -> L10
            java.lang.Object r10 = Wf.AbstractC0780y.s(r10, r3, r9)     // Catch: java.lang.Exception -> L10
            if (r10 != r0) goto L69
        L65:
            return r0
        L66:
            r10.printStackTrace()
        L69:
            kotlin.Unit r10 = kotlin.Unit.f38893a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p129ib.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
