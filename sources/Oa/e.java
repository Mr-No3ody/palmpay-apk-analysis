package Oa;

import com.transsnet.palmpay.core.ui.widget.BrowseCountdownView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BrowseCountdownView f6691c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BrowseCountdownView browseCountdownView, Continuation continuation) {
        super(2, continuation);
        this.f6691c = browseCountdownView;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.f6691c, continuation);
        eVar.f6690b = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (Wf.AbstractC0780y.s(r4, r5, r7) == r0) goto L31;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r7.f6689a
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L29
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            androidx.camera.core.impl.utils.executor.g.M(r8)
            goto L87
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            java.lang.Object r1 = r7.f6690b
            androidx.camera.core.impl.utils.executor.g.M(r8)
            goto L6d
        L23:
            androidx.camera.core.impl.utils.executor.g.M(r8)     // Catch: java.lang.Throwable -> L27
            goto L45
        L27:
            r8 = move-exception
            goto L4b
        L29:
            androidx.camera.core.impl.utils.executor.g.M(r8)
            java.lang.Object r8 = r7.f6690b
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            xf.o r8 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L27
            androidx.camera.video.internal.c r8 = p324va.c.f43141a     // Catch: java.lang.Throwable -> L27
            java.lang.Object r8 = r8.f14621b     // Catch: java.lang.Throwable -> L27
            com.transsnet.palmpay.core.network.PayApiService r8 = (com.transsnet.palmpay.core.network.PayApiService) r8     // Catch: java.lang.Throwable -> L27
            com.transsnet.palmpay.core.ui.widget.BrowseCountdownView r1 = r7.f6691c     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r1.f28111g     // Catch: java.lang.Throwable -> L27
            r7.f6689a = r5     // Catch: java.lang.Throwable -> L27
            java.lang.Object r8 = r8.reportBrowseFinished(r1, r7)     // Catch: java.lang.Throwable -> L27
            if (r8 != r0) goto L45
            goto L86
        L45:
            com.transsnet.palmpay.core.bean.CommonResult r8 = (com.transsnet.palmpay.core.bean.CommonResult) r8     // Catch: java.lang.Throwable -> L27
            xf.o r1 = p355xf.q.f43977a     // Catch: java.lang.Throwable -> L27
        L49:
            r1 = r8
            goto L52
        L4b:
            xf.o r1 = p355xf.q.f43977a
            xf.p r8 = androidx.camera.core.impl.utils.executor.g.f(r8)
            goto L49
        L52:
            boolean r8 = r1 instanceof p355xf.p
            if (r8 != 0) goto L6d
            r8 = r1
            com.transsnet.palmpay.core.bean.CommonResult r8 = (com.transsnet.palmpay.core.bean.CommonResult) r8
            cg.f r5 = Wf.I.f10809a
            Wf.p0 r5 = p015ag.o.f11960a
            Oa.c r6 = new Oa.c
            r6.<init>(r8, r2)
            r7.f6690b = r1
            r7.f6689a = r4
            java.lang.Object r8 = Wf.AbstractC0780y.s(r5, r6, r7)
            if (r8 != r0) goto L6d
            goto L86
        L6d:
            java.lang.Throwable r8 = p355xf.q.a(r1)
            if (r8 == 0) goto L87
            cg.f r4 = Wf.I.f10809a
            Wf.p0 r4 = p015ag.o.f11960a
            Oa.d r5 = new Oa.d
            r5.<init>(r2, r8)
            r7.f6690b = r1
            r7.f6689a = r3
            java.lang.Object r8 = Wf.AbstractC0780y.s(r4, r5, r7)
            if (r8 != r0) goto L87
        L86:
            return r0
        L87:
            kotlin.Unit r8 = kotlin.Unit.f38893a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Oa.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
