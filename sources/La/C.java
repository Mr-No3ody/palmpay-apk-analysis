package La;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f5567b;

    public /* synthetic */ C(F f10, int i7) {
        this.f5566a = i7;
        this.f5567b = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v4 com.transsnet.palmpay.core.bean.PaymentMethod, still in use, count: 2, list:
          (r5v4 com.transsnet.palmpay.core.bean.PaymentMethod) from 0x01f6: IGET (r5v4 com.transsnet.palmpay.core.bean.PaymentMethod) A[WRAPPED] (LINE:503) com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean.defaultMethodFlag boolean
          (r5v4 com.transsnet.palmpay.core.bean.PaymentMethod) from 0x01fc: PHI (r5 I:??) = (r5v0 com.transsnet.palmpay.core.bean.PaymentMethod), (r5v4 com.transsnet.palmpay.core.bean.PaymentMethod) binds: [B:128:0x01fb, B:211:0x01fc] A[DONT_GENERATE, DONT_INLINE]
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
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: La.C.invoke(java.lang.Object):java.lang.Object");
    }
}
