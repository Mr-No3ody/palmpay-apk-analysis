package Ae;

import com.transsnet.palmpay.core.bean.req.ShareAccountDetailReq;
import com.transsnet.palmpay.ui.dialog.SendMoneyHandlerHomeDialog;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShareAccountDetailReq f308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SendMoneyHandlerHomeDialog f309c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ShareAccountDetailReq shareAccountDetailReq, SendMoneyHandlerHomeDialog sendMoneyHandlerHomeDialog, Continuation continuation) {
        super(2, continuation);
        this.f308b = shareAccountDetailReq;
        this.f309c = sendMoneyHandlerHomeDialog;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new t(this.f308b, this.f309c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r7 == r0) goto L20;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r6.f307a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            androidx.camera.core.impl.utils.executor.g.M(r7)     // Catch: java.lang.Exception -> L10
            goto L49
        L10:
            r7 = move-exception
            goto L4c
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            androidx.camera.core.impl.utils.executor.g.M(r7)     // Catch: java.lang.Exception -> L10
            goto L32
        L1e:
            androidx.camera.core.impl.utils.executor.g.M(r7)
            androidx.camera.video.internal.c r7 = p324va.c.f43141a     // Catch: java.lang.Exception -> L10
            java.lang.Object r7 = r7.f14623d     // Catch: java.lang.Exception -> L10
            com.transsnet.palmpay.core.network.api.AccountApiService r7 = (com.transsnet.palmpay.core.network.api.AccountApiService) r7     // Catch: java.lang.Exception -> L10
            com.transsnet.palmpay.core.bean.req.ShareAccountDetailReq r1 = r6.f308b     // Catch: java.lang.Exception -> L10
            r6.f307a = r3     // Catch: java.lang.Exception -> L10
            java.lang.Object r7 = r7.queryShareAccountDetailMvvm(r1, r6)     // Catch: java.lang.Exception -> L10
            if (r7 != r0) goto L32
            goto L48
        L32:
            com.transsnet.palmpay.core.bean.CommonBeanResult r7 = (com.transsnet.palmpay.core.bean.CommonBeanResult) r7     // Catch: java.lang.Exception -> L10
            cg.f r1 = Wf.I.f10809a     // Catch: java.lang.Exception -> L10
            Wf.p0 r1 = p015ag.o.f11960a     // Catch: java.lang.Exception -> L10
            Ae.s r3 = new Ae.s     // Catch: java.lang.Exception -> L10
            com.transsnet.palmpay.ui.dialog.SendMoneyHandlerHomeDialog r4 = r6.f309c     // Catch: java.lang.Exception -> L10
            r5 = 0
            r3.<init>(r7, r4, r5)     // Catch: java.lang.Exception -> L10
            r6.f307a = r2     // Catch: java.lang.Exception -> L10
            java.lang.Object r7 = Wf.AbstractC0780y.s(r1, r3, r6)     // Catch: java.lang.Exception -> L10
            if (r7 != r0) goto L49
        L48:
            return r0
        L49:
            kotlin.Unit r7 = (kotlin.Unit) r7     // Catch: java.lang.Exception -> L10
            goto L56
        L4c:
            java.lang.String r7 = org.chromium.support_lib_boundary.util.b.W(r7)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.transsnet.palmpay.util.ToastUtils.showLong(r7, r0)
        L56:
            kotlin.Unit r7 = kotlin.Unit.f38893a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ae.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
