package androidx.camera.camera2.internal;

import androidx.camera.core.impl.utils.futures.FutureCallback;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0965z implements FutureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CaptureSessionInterface f13696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J f13697c;

    public /* synthetic */ C0965z(J j6, CaptureSessionInterface captureSessionInterface, int i7) {
        this.f13695a = i7;
        this.f13697c = j6;
        this.f13696b = captureSessionInterface;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v9 androidx.camera.core.impl.H0, still in use, count: 2, list:
          (r1v9 androidx.camera.core.impl.H0) from 0x0025: INVOKE (r1v9 androidx.camera.core.impl.H0) VIRTUAL call: androidx.camera.core.impl.H0.b():java.util.List A[MD:():java.util.List (m), WRAPPED] (LINE:38)
          (r1v9 androidx.camera.core.impl.H0) from 0x0031: PHI (r1 I:??) = (r1v6 androidx.camera.core.impl.H0), (r1v9 androidx.camera.core.impl.H0) binds: [B:12:0x0030, B:28:0x0031] A[DONT_GENERATE, DONT_INLINE]
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
    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public final void onFailure(java.lang.Throwable r5) {
        /*
            r4 = this;
            int r0 = r4.f13695a
            switch(r0) {
                case 0: goto L94;
                default: goto L5;
            }
        L5:
            boolean r0 = r5 instanceof androidx.camera.core.impl.C0968a0
            if (r0 == 0) goto L54
            androidx.camera.camera2.internal.J r0 = r4.f13697c
            androidx.camera.core.impl.a0 r5 = (androidx.camera.core.impl.C0968a0) r5
            androidx.camera.core.impl.b0 r5 = r5.f14014a
            org.greenrobot.eventbus.f r0 = r0.f13175a
            java.util.Collection r0 = r0.g()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            androidx.camera.core.impl.H0 r1 = (androidx.camera.core.impl.H0) r1
            java.util.List r2 = r1.b()
            boolean r2 = r2.contains(r5)
            if (r2 == 0) goto L19
            goto L31
        L30:
            r1 = 0
        L31:
            if (r1 == 0) goto L94
            androidx.camera.camera2.internal.J r5 = r4.f13697c
            r5.getClass()
            androidx.camera.core.impl.utils.executor.d r0 = org.chromium.support_lib_boundary.util.b.S()
            androidx.camera.core.impl.SessionConfig$ErrorListener r2 = r1.f13885f
            if (r2 == 0) goto L94
            java.lang.Throwable r3 = new java.lang.Throwable
            r3.<init>()
            java.lang.String r3 = "Posting surface closed"
            r5.f(r3)
            androidx.camera.camera2.internal.j r5 = new androidx.camera.camera2.internal.j
            r3 = 5
            r5.<init>(r3, r2, r1)
            r0.execute(r5)
            goto L94
        L54:
            boolean r0 = r5 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L60
            androidx.camera.camera2.internal.J r5 = r4.f13697c
            java.lang.String r0 = "Unable to configure camera cancelled"
            r5.f(r0)
            goto L94
        L60:
            androidx.camera.camera2.internal.J r0 = r4.f13697c
            int r0 = r0.f13166B0
            r1 = 9
            if (r0 != r1) goto L74
            androidx.camera.camera2.internal.J r0 = r4.f13697c
            E.e r2 = new E.e
            r3 = 4
            r2.<init>(r3, r5)
            r3 = 1
            r0.r(r1, r2, r3)
        L74:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to configure camera "
            r0.<init>(r1)
            androidx.camera.camera2.internal.J r1 = r4.f13697c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Camera2CameraImpl"
            p140j8.f.h(r1, r0, r5)
            androidx.camera.camera2.internal.J r5 = r4.f13697c
            androidx.camera.camera2.internal.CaptureSessionInterface r0 = r5.t
            androidx.camera.camera2.internal.CaptureSessionInterface r1 = r4.f13696b
            if (r0 != r1) goto L94
            r5.q()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.C0965z.onFailure(java.lang.Throwable):void");
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public final void onSuccess(Object obj) {
        switch (this.f13695a) {
            case 0:
                this.f13697c.f13165B.remove(this.f13696b);
                int i7 = F.i(this.f13697c.f13166B0);
                if (i7 != 1 && i7 != 4) {
                    if (i7 == 5 || (i7 == 6 && this.f13697c.f13186p != 0)) {
                        this.f13697c.f("Camera reopen required. Checking if the current camera can be closed safely.");
                    }
                }
                if (this.f13697c.f13165B.isEmpty()) {
                    J j6 = this.f13697c;
                    if (j6.f13185o != null) {
                        j6.f("closing camera");
                        this.f13697c.f13185o.close();
                        this.f13697c.f13185o = null;
                    }
                }
                break;
            default:
                J j10 = this.f13697c;
                if (j10.f13169L.f917f == 2 && j10.f13166B0 == 9) {
                    this.f13697c.s(10);
                    break;
                }
                break;
        }
    }

    private final void a(Throwable th) {
    }
}
