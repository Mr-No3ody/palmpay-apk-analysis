package androidx.camera.core.processing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.CameraCaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.e f14372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f14374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f14375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix f14377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CameraCaptureResult f14378h;

    public b(Object obj, androidx.camera.core.impl.utils.e eVar, int i7, Size size, Rect rect, int i10, Matrix matrix, CameraCaptureResult cameraCaptureResult) {
        if (obj == null) {
            throw new NullPointerException("Null data");
        }
        this.f14371a = obj;
        this.f14372b = eVar;
        this.f14373c = i7;
        this.f14374d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f14375e = rect;
        this.f14376f = i10;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f14377g = matrix;
        if (cameraCaptureResult == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f14378h = cameraCaptureResult;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f14371a.equals(bVar.f14371a)) {
                androidx.camera.core.impl.utils.e eVar = bVar.f14372b;
                androidx.camera.core.impl.utils.e eVar2 = this.f14372b;
                if (eVar2 != null ? eVar2.equals(eVar) : eVar == null) {
                    if (this.f14373c == bVar.f14373c && this.f14374d.equals(bVar.f14374d) && this.f14375e.equals(bVar.f14375e) && this.f14376f == bVar.f14376f && this.f14377g.equals(bVar.f14377g) && this.f14378h.equals(bVar.f14378h)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f14371a.hashCode() ^ 1000003) * 1000003;
        androidx.camera.core.impl.utils.e eVar = this.f14372b;
        return ((((((((((((iHashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003) ^ this.f14373c) * 1000003) ^ this.f14374d.hashCode()) * 1000003) ^ this.f14375e.hashCode()) * 1000003) ^ this.f14376f) * 1000003) ^ this.f14377g.hashCode()) * 1000003) ^ this.f14378h.hashCode();
    }

    public final String toString() {
        return "Packet{data=" + this.f14371a + ", exif=" + this.f14372b + ", format=" + this.f14373c + ", size=" + this.f14374d + ", cropRect=" + this.f14375e + ", rotationDegrees=" + this.f14376f + ", sensorToBufferTransform=" + this.f14377g + ", cameraCaptureResult=" + this.f14378h + "}";
    }
}
