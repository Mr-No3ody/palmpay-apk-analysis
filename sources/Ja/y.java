package Ja;

import android.view.View;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckSafetyAssessmentQAQuestionFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CheckSafetyAssessmentQAQuestionFragment f4691b;

    public /* synthetic */ y(CheckSafetyAssessmentQAQuestionFragment checkSafetyAssessmentQAQuestionFragment, int i7) {
        this.f4690a = i7;
        this.f4691b = checkSafetyAssessmentQAQuestionFragment;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v8 java.lang.Object, still in use, count: 2, list:
          (r4v8 java.lang.Object) from 0x00a8: PHI (r4 I:??) = (r4v5 java.lang.Object), (r4v8 java.lang.Object) binds: [B:43:0x00a7, B:53:0x00a8] A[DONT_GENERATE, DONT_INLINE]
          (r4v8 java.lang.Object) from 0x009c: CHECK_CAST (com.transsnet.palmpay.core.bean.verify.VerifyQuestionOptionBean) (r4v8 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r7) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ja.y.onClick(android.view.View):void");
    }
}
