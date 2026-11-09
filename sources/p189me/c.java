package p189me;

import Ff.h;
import com.transsnet.palmpay.ui.activity.message.NotificationListV2Activity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotificationListV2Activity f39653b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(NotificationListV2Activity notificationListV2Activity, Continuation continuation) {
        super(2, continuation);
        this.f39653b = notificationListV2Activity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f39653b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
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
            int r1 = r6.f39652a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            androidx.camera.core.impl.utils.executor.g.M(r7)     // Catch: java.lang.Exception -> L4e
            goto L4c
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            androidx.camera.core.impl.utils.executor.g.M(r7)     // Catch: java.lang.Exception -> L4e
            goto L33
        L1c:
            androidx.camera.core.impl.utils.executor.g.M(r7)
            androidx.camera.video.internal.c r7 = p324va.c.f43141a     // Catch: java.lang.Exception -> L4e
            java.lang.Object r7 = r7.f14621b     // Catch: java.lang.Exception -> L4e
            com.transsnet.palmpay.core.network.PayApiService r7 = (com.transsnet.palmpay.core.network.PayApiService) r7     // Catch: java.lang.Exception -> L4e
            com.transsnet.palmpay.core.bean.req.QueryUnReadMsgCntReq r1 = new com.transsnet.palmpay.core.bean.req.QueryUnReadMsgCntReq     // Catch: java.lang.Exception -> L4e
            r1.<init>()     // Catch: java.lang.Exception -> L4e
            r6.f39652a = r3     // Catch: java.lang.Exception -> L4e
            java.lang.Object r7 = r7.queryUnReadMessageCount(r1, r6)     // Catch: java.lang.Exception -> L4e
            if (r7 != r0) goto L33
            goto L4b
        L33:
            com.transsnet.palmpay.core.bean.CommonBeanResult r7 = (com.transsnet.palmpay.core.bean.CommonBeanResult) r7     // Catch: java.lang.Exception -> L4e
            if (r7 == 0) goto L4e
            com.transsnet.palmpay.ui.activity.message.NotificationListV2Activity r1 = r6.f39653b     // Catch: java.lang.Exception -> L4e
            cg.f r3 = Wf.I.f10809a     // Catch: java.lang.Exception -> L4e
            Wf.p0 r3 = p015ag.o.f11960a     // Catch: java.lang.Exception -> L4e
            me.b r4 = new me.b     // Catch: java.lang.Exception -> L4e
            r5 = 0
            r4.<init>(r7, r1, r5)     // Catch: java.lang.Exception -> L4e
            r6.f39652a = r2     // Catch: java.lang.Exception -> L4e
            java.lang.Object r7 = Wf.AbstractC0780y.s(r3, r4, r6)     // Catch: java.lang.Exception -> L4e
            if (r7 != r0) goto L4c
        L4b:
            return r0
        L4c:
            kotlin.Unit r7 = (kotlin.Unit) r7     // Catch: java.lang.Exception -> L4e
        L4e:
            kotlin.Unit r7 = kotlin.Unit.f38893a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p189me.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
