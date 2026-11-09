package p010a9;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11834c;

    public /* synthetic */ b(int i7, Object obj, Object obj2) {
        this.f11832a = i7;
        this.f11833b = obj;
        this.f11834c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v34 com.transsnet.palmpay.core.bean.BankInfo, still in use, count: 2, list:
          (r3v34 com.transsnet.palmpay.core.bean.BankInfo) from 0x0640: IGET (r3v34 com.transsnet.palmpay.core.bean.BankInfo) A[WRAPPED] (LINE:1601) com.transsnet.palmpay.core.bean.BankInfo.bankCode java.lang.String
          (r3v34 com.transsnet.palmpay.core.bean.BankInfo) from 0x064a: PHI (r3 I:??) = (r3v30 com.transsnet.palmpay.core.bean.BankInfo), (r3v34 com.transsnet.palmpay.core.bean.BankInfo) binds: [B:191:0x0649, B:247:0x064a] A[DONT_GENERATE, DONT_INLINE]
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
    public final void onClick(android.view.View r24) {
        /*
            Method dump skipped, instruction units count: 2164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p010a9.b.onClick(android.view.View):void");
    }
}
