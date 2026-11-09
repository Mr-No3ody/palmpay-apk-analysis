package androidx.camera.video;

import android.os.SystemClock;
import androidx.biometric.RunnableC0903g;
import androidx.camera.core.impl.AbstractC0999q;
import androidx.camera.core.impl.C0;
import androidx.camera.core.impl.CameraCaptureResult;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class x extends AbstractC0999q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14867a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f14868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.concurrent.futures.k f14869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0 f14870d;

    public x(AtomicBoolean atomicBoolean, androidx.concurrent.futures.k kVar, C0 c0) {
        this.f14868b = atomicBoolean;
        this.f14869c = kVar;
        this.f14870d = c0;
    }

    @Override // androidx.camera.core.impl.AbstractC0999q
    public final void b(int i7, CameraCaptureResult cameraCaptureResult) {
        Object obj;
        if (this.f14867a) {
            this.f14867a = false;
            cameraCaptureResult.getTimestamp();
            SystemClock.uptimeMillis();
            SystemClock.elapsedRealtime();
            p140j8.f.G("VideoCapture");
        }
        AtomicBoolean atomicBoolean = this.f14868b;
        if (atomicBoolean.get() || (obj = cameraCaptureResult.getTagBundle().f13941a.get("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        androidx.concurrent.futures.k kVar = this.f14869c;
        if (iIntValue == kVar.hashCode() && kVar.b(null) && !atomicBoolean.getAndSet(true)) {
            org.chromium.support_lib_boundary.util.b.S().execute(new RunnableC0903g(25, this, this.f14870d));
        }
    }
}
