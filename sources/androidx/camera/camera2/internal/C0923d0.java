package androidx.camera.camera2.internal;

import E.AbstractC0198c;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.ImageCapture$ScreenFlash;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p310ub.C2085k0;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0923d0 implements Camera2CapturePipeline$PipelineTask {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f13495f = TimeUnit.SECONDS.toNanos(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f13496g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0944o f13497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.i f13498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.d f13499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageCapture$ScreenFlash f13500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Sd.b f13501e;

    public C0923d0(C0944o c0944o, androidx.camera.core.impl.utils.executor.i iVar, androidx.camera.core.impl.utils.executor.d dVar, Sd.b bVar) {
        this.f13497a = c0944o;
        this.f13498b = iVar;
        this.f13499c = dVar;
        this.f13501e = bVar;
        ImageCapture$ScreenFlash imageCapture$ScreenFlash = c0944o.f13619q;
        Objects.requireNonNull(imageCapture$ScreenFlash);
        this.f13500d = imageCapture$ScreenFlash;
    }

    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask
    public final boolean isCaptureResultNeeded() {
        return false;
    }

    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask
    public final void postCapture() {
        p140j8.f.G("Camera2CapturePipeline");
        boolean zD = this.f13501e.d();
        C0944o c0944o = this.f13497a;
        if (zD) {
            c0944o.c(false);
        }
        c0944o.f13610h.c(false).addListener(new RunnableC0930h(1), this.f13498b);
        c0944o.f13610h.a(false, true);
        androidx.camera.core.impl.utils.executor.d dVarS = org.chromium.support_lib_boundary.util.b.S();
        ImageCapture$ScreenFlash imageCapture$ScreenFlash = this.f13500d;
        Objects.requireNonNull(imageCapture$ScreenFlash);
        dVarS.execute(new RunnableC0961x(imageCapture$ScreenFlash, 3));
    }

    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask
    public final ListenableFuture preCapture(TotalCaptureResult totalCaptureResult) {
        p140j8.f.G("Camera2CapturePipeline");
        AtomicReference atomicReference = new AtomicReference();
        androidx.concurrent.futures.m mVarY = AbstractC0198c.y(new C0936k(atomicReference, 7));
        int i7 = 1;
        androidx.camera.core.impl.utils.futures.b bVarA = androidx.camera.core.impl.utils.futures.b.a(AbstractC0198c.y(new C0953t(i7, this, atomicReference)));
        C0919b0 c0919b0 = new C0919b0(this, i7);
        bVarA.getClass();
        androidx.camera.core.impl.utils.executor.i iVar = this.f13498b;
        androidx.camera.core.impl.utils.futures.a aVarI = androidx.camera.core.impl.utils.futures.j.i(androidx.camera.core.impl.utils.futures.j.i(androidx.camera.core.impl.utils.futures.j.i(androidx.camera.core.impl.utils.futures.j.i(androidx.camera.core.impl.utils.futures.j.i(bVarA, c0919b0, iVar), new C0919b0(this, 2), iVar), new C0953t(2, this, mVarY), iVar), new C0919b0(this, 3), iVar), new C0919b0(this, 4), iVar);
        Q q10 = new Q(3);
        return androidx.camera.core.impl.utils.futures.j.i(aVarI, new C2085k0(q10, 13), org.chromium.support_lib_boundary.util.b.u());
    }
}
