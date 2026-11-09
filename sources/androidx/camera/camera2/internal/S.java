package androidx.camera.camera2.internal;

import E.AbstractC0198c;
import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
public final class S implements Camera2CapturePipeline$PipelineTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0944o f13259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N7.a f13260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13262d = false;

    public S(C0944o c0944o, int i7, N7.a aVar) {
        this.f13259a = c0944o;
        this.f13261c = i7;
        this.f13260b = aVar;
    }

    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask
    public final boolean isCaptureResultNeeded() {
        return this.f13261c == 0;
    }

    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask
    public final void postCapture() {
        if (this.f13262d) {
            p140j8.f.G("Camera2CapturePipeline");
            this.f13259a.f13610h.a(false, true);
            this.f13260b.f6100b = false;
        }
    }

    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask
    public final ListenableFuture preCapture(TotalCaptureResult totalCaptureResult) {
        if (!C0929g0.c(this.f13261c, totalCaptureResult)) {
            return androidx.camera.core.impl.utils.futures.j.d(Boolean.FALSE);
        }
        p140j8.f.G("Camera2CapturePipeline");
        this.f13262d = true;
        androidx.camera.core.impl.utils.futures.b bVarA = androidx.camera.core.impl.utils.futures.b.a(AbstractC0198c.y(new C0936k(this, 2)));
        Q q10 = new Q(0);
        androidx.camera.core.impl.utils.executor.a aVarU = org.chromium.support_lib_boundary.util.b.u();
        bVarA.getClass();
        return androidx.camera.core.impl.utils.futures.j.i(bVarA, new C2085k0(q10, 13), aVarU);
    }
}
