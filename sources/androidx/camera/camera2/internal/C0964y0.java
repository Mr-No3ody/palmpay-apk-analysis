package androidx.camera.camera2.internal;

import E.C0206k;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0964y0 implements ZoomControl$ZoomImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.l f13691a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.concurrent.futures.k f13693c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f13692b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Rect f13694d = null;

    public C0964y0(androidx.camera.camera2.internal.compat.l lVar) {
        this.f13691a = lVar;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl$ZoomImpl
    public final void addRequestOption(androidx.camera.camera2.impl.a aVar) {
        Rect rect = this.f13692b;
        if (rect != null) {
            aVar.a(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl$ZoomImpl
    public final Rect getCropSensorRegion() {
        Rect rect = this.f13692b;
        if (rect != null) {
            return rect;
        }
        Rect rect2 = (Rect) this.f13691a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect2.getClass();
        return rect2;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl$ZoomImpl
    public final float getMaxZoom() {
        Float f10 = (Float) this.f13691a.a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f10 != null && f10.floatValue() >= 1.0f) {
            return f10.floatValue();
        }
        return 1.0f;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl$ZoomImpl
    public final float getMinZoom() {
        return 1.0f;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl$ZoomImpl
    public final void onCaptureResult(TotalCaptureResult totalCaptureResult) {
        if (this.f13693c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f13694d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f13693c.b(null);
            this.f13693c = null;
            this.f13694d = null;
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl$ZoomImpl
    public final void resetZoom() {
        this.f13694d = null;
        this.f13692b = null;
        androidx.concurrent.futures.k kVar = this.f13693c;
        if (kVar != null) {
            kVar.d(new C0206k("Camera is not active."));
            this.f13693c = null;
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl$ZoomImpl
    public final void setZoomRatio(float f10, androidx.concurrent.futures.k kVar) {
        Rect rect = (Rect) this.f13691a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        float fWidth = rect.width() / f10;
        float fHeight = rect.height() / f10;
        float fWidth2 = (rect.width() - fWidth) / 2.0f;
        float fHeight2 = (rect.height() - fHeight) / 2.0f;
        this.f13692b = new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
        androidx.concurrent.futures.k kVar2 = this.f13693c;
        if (kVar2 != null) {
            kVar2.d(new C0206k("There is a new zoomRatio being set"));
        }
        this.f13694d = this.f13692b;
        this.f13693c = kVar;
    }
}
