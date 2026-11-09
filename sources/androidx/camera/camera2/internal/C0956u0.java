package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0956u0 implements CameraBurstCaptureCallback$CaptureSequenceCallback, CallbackToFutureAdapter$Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0962x0 f13660a;

    public /* synthetic */ C0956u0(C0962x0 c0962x0) {
        this.f13660a = c0962x0;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(androidx.concurrent.futures.k kVar) {
        String str;
        C0962x0 c0962x0 = this.f13660a;
        synchronized (c0962x0.f13670a) {
            p118hf.a.k(c0962x0.f13680k == null, "Release completer expected to be null");
            c0962x0.f13680k = kVar;
            str = "Release[session=" + c0962x0 + "]";
        }
        return str;
    }

    @Override // androidx.camera.camera2.internal.CameraBurstCaptureCallback$CaptureSequenceCallback
    public void onCaptureSequenceCompletedOrAborted(CameraCaptureSession cameraCaptureSession, int i7, boolean z3) {
        C0962x0 c0962x0 = this.f13660a;
        synchronized (c0962x0.f13670a) {
            try {
                if (c0962x0.f13678i == 5) {
                    c0962x0.h(c0962x0.f13675f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
