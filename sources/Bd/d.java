package Bd;

import Ff.h;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KkCarPayResultDialog f902c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(KkCarPayResultDialog kkCarPayResultDialog, Continuation continuation) {
        super(2, continuation);
        this.f902c = kkCarPayResultDialog;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(this.f902c, continuation);
        dVar.f901b = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d A[PHI: r1
      0x003d: PHI (r1v3 kotlinx.coroutines.CoroutineScope) = 
      (r1v2 kotlinx.coroutines.CoroutineScope)
      (r1v4 kotlinx.coroutines.CoroutineScope)
      (r1v6 kotlinx.coroutines.CoroutineScope)
     binds: [B:13:0x003a, B:24:0x0061, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x0050 A[PHI: r1 r8
      0x0050: PHI (r1v4 kotlinx.coroutines.CoroutineScope) = (r1v3 kotlinx.coroutines.CoroutineScope), (r1v8 kotlinx.coroutines.CoroutineScope) binds: [B:18:0x004d, B:10:0x001a] A[DONT_GENERATE, DONT_INLINE]
      0x0050: PHI (r8v7 java.lang.Object) = (r8v6 java.lang.Object), (r8v0 java.lang.Object) binds: [B:18:0x004d, B:10:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0061 -> B:15:0x003d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // Ff.a
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r7.f900a
            r2 = 5000(0x1388, double:2.4703E-320)
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2a
            if (r1 == r6) goto L22
            if (r1 == r5) goto L1a
            if (r1 != r4) goto L12
            goto L22
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            java.lang.Object r1 = r7.f901b
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            androidx.camera.core.impl.utils.executor.g.M(r8)
            goto L50
        L22:
            java.lang.Object r1 = r7.f901b
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            androidx.camera.core.impl.utils.executor.g.M(r8)
            goto L3d
        L2a:
            androidx.camera.core.impl.utils.executor.g.M(r8)
            java.lang.Object r8 = r7.f901b
            r1 = r8
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            r7.f901b = r1
            r7.f900a = r6
            java.lang.Object r8 = Wf.D.b(r2, r7)
            if (r8 != r0) goto L3d
            goto L63
        L3d:
            boolean r8 = Wf.AbstractC0777v.e(r1)
            if (r8 == 0) goto L64
            r7.f901b = r1
            r7.f900a = r5
            com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog r8 = r7.f902c
            java.lang.Object r8 = com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog.access$pollOrderOnce(r8, r7)
            if (r8 != r0) goto L50
            goto L63
        L50:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L59
            goto L64
        L59:
            r7.f901b = r1
            r7.f900a = r4
            java.lang.Object r8 = Wf.D.b(r2, r7)
            if (r8 != r0) goto L3d
        L63:
            return r0
        L64:
            kotlin.Unit r8 = kotlin.Unit.f38893a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Bd.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
