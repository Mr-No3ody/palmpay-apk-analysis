package androidx.camera.camera2.internal;

import androidx.camera.core.impl.AbstractC0999q;
import androidx.camera.core.impl.C1004t;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.SessionProcessor;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class T0 implements SessionProcessor.CaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CameraCaptureResult f13268c = null;

    public T0(int i7, List list) {
        this.f13267b = i7;
        this.f13266a = list;
    }

    @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
    public final void onCaptureCompleted(long j6, int i7, CameraCaptureResult cameraCaptureResult) {
        this.f13268c = cameraCaptureResult;
    }

    @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
    public final void onCaptureFailed(int i7) {
        Iterator it = this.f13266a.iterator();
        while (it.hasNext()) {
            ((AbstractC0999q) it.next()).c(this.f13267b, new C1004t());
        }
    }

    @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
    public final void onCaptureProcessProgressed(int i7) {
        Iterator it = this.f13266a.iterator();
        while (it.hasNext()) {
            ((AbstractC0999q) it.next()).d(this.f13267b, i7);
        }
    }

    @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
    public final void onCaptureSequenceCompleted(int i7) {
        CameraCaptureResult hVar = this.f13268c;
        if (hVar == null) {
            hVar = new org.sufficientlysecure.htmltextview.h(3);
        }
        Iterator it = this.f13266a.iterator();
        while (it.hasNext()) {
            ((AbstractC0999q) it.next()).b(this.f13267b, hVar);
        }
    }

    @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
    public final void onCaptureStarted(int i7, long j6) {
        Iterator it = this.f13266a.iterator();
        while (it.hasNext()) {
            ((AbstractC0999q) it.next()).e(this.f13267b);
        }
    }
}
