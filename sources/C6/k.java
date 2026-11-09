package C6;

import com.palmpay.lib.liveness.video.VideoActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoActivity f1184b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(VideoActivity videoActivity, Continuation continuation) {
        super(2, continuation);
        this.f1184b = videoActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f1184b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r6.c(r5) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (com.palmpay.lib.liveness.video.VideoActivity.e(r2, r5) == r0) goto L18;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r5.f1183a
            com.palmpay.lib.liveness.video.VideoActivity r2 = r5.f1184b
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            androidx.camera.core.impl.utils.executor.g.M(r6)
            goto L3a
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            androidx.camera.core.impl.utils.executor.g.M(r6)
            goto L2e
        L1e:
            androidx.camera.core.impl.utils.executor.g.M(r6)
            Wf.B r6 = r2.f23959j
            if (r6 == 0) goto L31
            r5.f1183a = r4
            java.lang.Object r6 = r6.c(r5)
            if (r6 != r0) goto L2e
            goto L39
        L2e:
            r6 = 0
            r2.f23959j = r6
        L31:
            r5.f1183a = r3
            java.lang.Object r6 = com.palmpay.lib.liveness.video.VideoActivity.e(r2, r5)
            if (r6 != r0) goto L3a
        L39:
            return r0
        L3a:
            kotlin.Unit r6 = kotlin.Unit.f38893a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: C6.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
