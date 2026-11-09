package p285sc;

import Ff.h;
import com.transsnet.palmpay.jara_packet.bean.req.CommentReq;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnCommentListActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: sc.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2029c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f42208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CommentReq f42209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ReferEarnCommentListActivity f42210d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2029c(Continuation continuation, CommentReq commentReq, ReferEarnCommentListActivity referEarnCommentListActivity) {
        super(2, continuation);
        this.f42209c = commentReq;
        this.f42210d = referEarnCommentListActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C2029c c2029c = new C2029c(continuation, this.f42209c, this.f42210d);
        c2029c.f42208b = obj;
        return c2029c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2029c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (Wf.AbstractC0780y.s(r5, r6, r8) == r0) goto L31;
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
            int r1 = r8.f42207a
            com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnCommentListActivity r2 = r8.f42210d
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2b
            if (r1 == r6) goto L25
            if (r1 == r5) goto L1f
            if (r1 != r4) goto L17
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L87
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            java.lang.Object r1 = r8.f42208b
            androidx.camera.core.impl.utils.executor.g.M(r9)
            goto L6d
        L25:
            androidx.camera.core.impl.utils.executor.g.M(r9)     // Catch: java.lang.Throwable -> L29
            goto L45
        L29:
            r9 = move-exception
            goto L4b
        L2b:
            androidx.camera.core.impl.utils.executor.g.M(r9)
            java.lang.Object r9 = r8.f42208b
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            xf.o r9 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L29
            d3.k r9 = p254qc.a.f41475a     // Catch: java.lang.Throwable -> L29
            java.lang.Object r9 = r9.f35518b     // Catch: java.lang.Throwable -> L29
            com.transsnet.palmpay.jara_packet.api.JaraPacketApiService r9 = (com.transsnet.palmpay.jara_packet.api.JaraPacketApiService) r9     // Catch: java.lang.Throwable -> L29
            com.transsnet.palmpay.jara_packet.bean.req.CommentReq r1 = r8.f42209c     // Catch: java.lang.Throwable -> L29
            r8.f42207a = r6     // Catch: java.lang.Throwable -> L29
            java.lang.Object r9 = r9.queryComments(r1, r8)     // Catch: java.lang.Throwable -> L29
            if (r9 != r0) goto L45
            goto L86
        L45:
            com.transsnet.palmpay.core.bean.CommonResult r9 = (com.transsnet.palmpay.core.bean.CommonResult) r9     // Catch: java.lang.Throwable -> L29
            xf.o r1 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L29
        L49:
            r1 = r9
            goto L52
        L4b:
            xf.o r1 = p355xf.q.f43977a
            xf.p r9 = androidx.camera.core.impl.utils.executor.g.f(r9)
            goto L49
        L52:
            boolean r9 = r1 instanceof p355xf.p
            if (r9 != 0) goto L6d
            r9 = r1
            com.transsnet.palmpay.core.bean.CommonResult r9 = (com.transsnet.palmpay.core.bean.CommonResult) r9
            cg.f r6 = Wf.I.f10809a
            Wf.p0 r6 = p015ag.o.f11960a
            sc.a r7 = new sc.a
            r7.<init>(r9, r3, r2)
            r8.f42208b = r1
            r8.f42207a = r5
            java.lang.Object r9 = Wf.AbstractC0780y.s(r6, r7, r8)
            if (r9 != r0) goto L6d
            goto L86
        L6d:
            java.lang.Throwable r9 = p355xf.q.a(r1)
            if (r9 == 0) goto L87
            cg.f r5 = Wf.I.f10809a
            Wf.p0 r5 = p015ag.o.f11960a
            sc.b r6 = new sc.b
            r6.<init>(r9, r3, r2)
            r8.f42208b = r1
            r8.f42207a = r4
            java.lang.Object r9 = Wf.AbstractC0780y.s(r5, r6, r8)
            if (r9 != r0) goto L87
        L86:
            return r0
        L87:
            kotlin.Unit r9 = kotlin.Unit.f38893a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p285sc.C2029c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
