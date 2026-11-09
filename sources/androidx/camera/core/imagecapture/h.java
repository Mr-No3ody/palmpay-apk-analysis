package androidx.camera.core.imagecapture;

import N8.q0;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.ImageCapture$OnImageSavedCallback;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class h extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f13757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.camera.video.internal.c f13758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageCapture$OnImageSavedCallback f13759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p279s5.d f13760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f13761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix f13762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13763h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f13764i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f13765j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f13766k;

    public h(Executor executor, androidx.camera.video.internal.c cVar, ImageCapture$OnImageSavedCallback imageCapture$OnImageSavedCallback, p279s5.d dVar, Rect rect, Matrix matrix, int i7, int i10, int i11, List list) {
        this.f13827a = ((CaptureFailedRetryQuirk) androidx.camera.core.internal.compat.quirk.a.f14321a.b(CaptureFailedRetryQuirk.class)) == null ? 0 : 1;
        if (executor == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.f13757b = executor;
        this.f13758c = cVar;
        this.f13759d = imageCapture$OnImageSavedCallback;
        this.f13760e = dVar;
        this.f13761f = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f13762g = matrix;
        this.f13763h = i7;
        this.f13764i = i10;
        this.f13765j = i11;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.f13766k = list;
    }

    public final boolean equals(Object obj) {
        androidx.camera.video.internal.c cVar;
        ImageCapture$OnImageSavedCallback imageCapture$OnImageSavedCallback;
        p279s5.d dVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f13757b.equals(((h) yVar).f13757b) && ((cVar = this.f13758c) != null ? cVar.equals(((h) yVar).f13758c) : ((h) yVar).f13758c == null) && ((imageCapture$OnImageSavedCallback = this.f13759d) != null ? imageCapture$OnImageSavedCallback.equals(((h) yVar).f13759d) : ((h) yVar).f13759d == null) && ((dVar = this.f13760e) != null ? dVar.equals(((h) yVar).f13760e) : ((h) yVar).f13760e == null)) {
                h hVar = (h) yVar;
                if (this.f13761f.equals(hVar.f13761f) && this.f13762g.equals(hVar.f13762g) && this.f13763h == hVar.f13763h && this.f13764i == hVar.f13764i && this.f13765j == hVar.f13765j && this.f13766k.equals(hVar.f13766k)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f13757b.hashCode() ^ 1000003) * 1000003;
        androidx.camera.video.internal.c cVar = this.f13758c;
        int iHashCode2 = (iHashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        ImageCapture$OnImageSavedCallback imageCapture$OnImageSavedCallback = this.f13759d;
        int iHashCode3 = (iHashCode2 ^ (imageCapture$OnImageSavedCallback == null ? 0 : imageCapture$OnImageSavedCallback.hashCode())) * 1000003;
        p279s5.d dVar = this.f13760e;
        return ((((((((((((iHashCode3 ^ (dVar != null ? dVar.hashCode() : 0)) * 1000003) ^ this.f13761f.hashCode()) * 1000003) ^ this.f13762g.hashCode()) * 1000003) ^ this.f13763h) * 1000003) ^ this.f13764i) * 1000003) ^ this.f13765j) * 1000003) ^ this.f13766k.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TakePictureRequest{appExecutor=");
        sb2.append(this.f13757b);
        sb2.append(", inMemoryCallback=");
        sb2.append(this.f13758c);
        sb2.append(", onDiskCallback=");
        sb2.append(this.f13759d);
        sb2.append(", outputFileOptions=");
        sb2.append(this.f13760e);
        sb2.append(", cropRect=");
        sb2.append(this.f13761f);
        sb2.append(", sensorToBufferTransform=");
        sb2.append(this.f13762g);
        sb2.append(", rotationDegrees=");
        sb2.append(this.f13763h);
        sb2.append(", jpegQuality=");
        sb2.append(this.f13764i);
        sb2.append(", captureMode=");
        sb2.append(this.f13765j);
        sb2.append(", sessionConfigCameraCaptureCallbacks=");
        return q0.o(sb2, this.f13766k, "}");
    }
}
