package p382zb;

import Ff.h;
import com.transsnet.palmpay.credit.ui.fragment.OcHomeMobileInstalmentTabFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class Y extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f44558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f44559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OcHomeMobileInstalmentTabFragment f44560d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(boolean z3, boolean z8, OcHomeMobileInstalmentTabFragment ocHomeMobileInstalmentTabFragment, Continuation continuation) {
        super(2, continuation);
        this.f44558b = z3;
        this.f44559c = z8;
        this.f44560d = ocHomeMobileInstalmentTabFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Y(this.f44558b, this.f44559c, this.f44560d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Y) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (Wf.AbstractC0780y.s(r3, r4, r6) == r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r6.f44557a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            androidx.camera.core.impl.utils.executor.g.M(r7)     // Catch: java.lang.Exception -> L10
            goto L6b
        L10:
            r7 = move-exception
            goto L68
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            androidx.camera.core.impl.utils.executor.g.M(r7)     // Catch: java.lang.Exception -> L10
            goto L3d
        L1e:
            androidx.camera.core.impl.utils.executor.g.M(r7)
            ob.a r7 = p221ob.c.f40268a     // Catch: java.lang.Exception -> L10
            ob.c r7 = r7.getInstance()     // Catch: java.lang.Exception -> L10
            r7.getClass()     // Catch: java.lang.Exception -> L10
            com.transsnet.palmpay.credit.network.IApiCreditService r7 = p221ob.c.a()     // Catch: java.lang.Exception -> L10
            boolean r1 = r6.f44558b     // Catch: java.lang.Exception -> L10
            boolean r4 = r6.f44559c     // Catch: java.lang.Exception -> L10
            java.lang.String r5 = "HIRE_PURCHASE"
            r6.f44557a = r3     // Catch: java.lang.Exception -> L10
            java.lang.Object r7 = r7.queryLoanDialogPopUps(r1, r4, r5, r6)     // Catch: java.lang.Exception -> L10
            if (r7 != r0) goto L3d
            goto L67
        L3d:
            com.transsnet.palmpay.core.bean.CommonBeanResult r7 = (com.transsnet.palmpay.core.bean.CommonBeanResult) r7     // Catch: java.lang.Exception -> L10
            if (r7 == 0) goto L6b
            com.transsnet.palmpay.credit.ui.fragment.OcHomeMobileInstalmentTabFragment r1 = r6.f44560d     // Catch: java.lang.Exception -> L10
            boolean r4 = r7.isSuccess()     // Catch: java.lang.Exception -> L10
            if (r4 == 0) goto L6b
            T r4 = r7.data     // Catch: java.lang.Exception -> L10
            com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean r4 = (com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean) r4     // Catch: java.lang.Exception -> L10
            if (r4 == 0) goto L6b
            boolean r4 = r4.getMobileInstallmentOpen()     // Catch: java.lang.Exception -> L10
            if (r4 != r3) goto L6b
            cg.f r3 = Wf.I.f10809a     // Catch: java.lang.Exception -> L10
            Wf.p0 r3 = p015ag.o.f11960a     // Catch: java.lang.Exception -> L10
            zb.X r4 = new zb.X     // Catch: java.lang.Exception -> L10
            r5 = 0
            r4.<init>(r1, r7, r5)     // Catch: java.lang.Exception -> L10
            r6.f44557a = r2     // Catch: java.lang.Exception -> L10
            java.lang.Object r7 = Wf.AbstractC0780y.s(r3, r4, r6)     // Catch: java.lang.Exception -> L10
            if (r7 != r0) goto L6b
        L67:
            return r0
        L68:
            r7.printStackTrace()
        L6b:
            kotlin.Unit r7 = kotlin.Unit.f38893a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p382zb.Y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
