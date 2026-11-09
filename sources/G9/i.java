package G9;

import androidx.activity.result.ActivityResultCallback;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements ActivityResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3176b;

    public /* synthetic */ i(Object obj, int i7) {
        this.f3175a = i7;
        this.f3176b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:269:0x0797  */
    /* JADX WARN: Code duplicated, block: B:373:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v10 java.lang.Object, still in use, count: 2, list:
          (r3v10 java.lang.Object) from 0x0793: PHI (r3 I:??) = (r3v7 java.lang.Object), (r3v10 java.lang.Object) binds: [B:266:0x0792, B:347:0x0793] A[DONT_GENERATE, DONT_INLINE]
          (r3v10 java.lang.Object) from 0x0787: CHECK_CAST (com.transsnet.palmpay.airtime.bean.AirtimeOrderList$OrderData) (r3v10 java.lang.Object)
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
    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(java.lang.Object r32) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G9.i.onActivityResult(java.lang.Object):void");
    }
}
