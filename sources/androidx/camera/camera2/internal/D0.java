package androidx.camera.camera2.internal;

import E.C0206k;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13127a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.concurrent.futures.k f13128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13130d;

    public /* synthetic */ D0(K0 k2, boolean z3, androidx.concurrent.futures.k kVar) {
        this.f13130d = k2;
        this.f13129c = z3;
        this.f13128b = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener, androidx.camera.camera2.internal.E0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13127a) {
            case 0:
                final K0 k2 = (K0) this.f13130d;
                boolean z3 = this.f13129c;
                final androidx.concurrent.futures.k kVar = this.f13128b;
                k2.f13203a.i(k2.f13224w);
                k2.f13223v = z3;
                if (k2.f13206d) {
                    final long jK = k2.f13203a.k();
                    ?? r3 = new Camera2CameraControlImpl$CaptureResultListener() { // from class: androidx.camera.camera2.internal.E0
                        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener
                        public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                            K0 k8 = k2;
                            k8.getClass();
                            boolean z8 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
                            p140j8.f.G("FocusMeteringControl");
                            if (z8 != k8.f13223v || !C0944o.h(totalCaptureResult, jK)) {
                                return false;
                            }
                            p140j8.f.G("FocusMeteringControl");
                            androidx.concurrent.futures.k kVar2 = kVar;
                            if (kVar2 != null) {
                                kVar2.b(null);
                            }
                            return true;
                        }
                    };
                    k2.f13224w = r3;
                    k2.f13203a.a(r3);
                } else if (kVar != null) {
                    kVar.d(new C0206k("Camera is not active."));
                }
                break;
            default:
                ((e1) this.f13130d).a(this.f13128b, this.f13129c);
                break;
        }
    }

    public /* synthetic */ D0(e1 e1Var, androidx.concurrent.futures.k kVar, boolean z3) {
        this.f13130d = e1Var;
        this.f13128b = kVar;
        this.f13129c = z3;
    }
}
