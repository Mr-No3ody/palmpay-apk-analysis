package androidx.camera.camera2.internal;

import E.AbstractC0198c;
import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;
import p310ub.C2085k0;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0927f0 implements Camera2CapturePipeline$PipelineTask {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f13514g = TimeUnit.SECONDS.toNanos(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f13515h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0944o f13516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13518c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.i f13519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.d f13520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13521f;

    public C0927f0(C0944o c0944o, int i7, androidx.camera.core.impl.utils.executor.i iVar, androidx.camera.core.impl.utils.executor.d dVar, boolean z3) {
        this.f13516a = c0944o;
        this.f13517b = i7;
        this.f13519d = iVar;
        this.f13520e = dVar;
        this.f13521f = z3;
    }

    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask
    public final boolean isCaptureResultNeeded() {
        return this.f13517b == 0;
    }

    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask
    public final void postCapture() {
        if (this.f13518c) {
            C0944o c0944o = this.f13516a;
            c0944o.f13612j.a(null, false);
            p140j8.f.G("Camera2CapturePipeline");
            if (this.f13521f) {
                c0944o.f13610h.a(false, true);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask
    public final ListenableFuture preCapture(TotalCaptureResult totalCaptureResult) {
        C0929g0.c(this.f13517b, totalCaptureResult);
        p140j8.f.G("Camera2CapturePipeline");
        if (C0929g0.c(this.f13517b, totalCaptureResult)) {
            if (!this.f13516a.f13620r) {
                p140j8.f.G("Camera2CapturePipeline");
                this.f13518c = true;
                androidx.camera.core.impl.utils.futures.b bVarA = androidx.camera.core.impl.utils.futures.b.a(AbstractC0198c.y(new C0925e0(this, 0)));
                C0925e0 c0925e0 = new C0925e0(this, 1);
                androidx.camera.core.impl.utils.executor.i iVar = this.f13519d;
                bVarA.getClass();
                androidx.camera.core.impl.utils.futures.a aVarI = androidx.camera.core.impl.utils.futures.j.i(androidx.camera.core.impl.utils.futures.j.i(bVarA, c0925e0, iVar), new C0925e0(this, 2), this.f13519d);
                Q q10 = new Q(4);
                return androidx.camera.core.impl.utils.futures.j.i(aVarI, new C2085k0(q10, 13), org.chromium.support_lib_boundary.util.b.u());
            }
            p140j8.f.G("Camera2CapturePipeline");
        }
        return androidx.camera.core.impl.utils.futures.j.d(Boolean.FALSE);
    }
}
