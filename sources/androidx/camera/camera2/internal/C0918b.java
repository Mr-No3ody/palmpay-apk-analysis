package androidx.camera.camera2.internal;

import E.C0206k;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0918b implements ZoomControl$ZoomImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.l f13341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Range f13342b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.concurrent.futures.k f13344d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13346f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13343c = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f13345e = 1.0f;

    public C0918b(androidx.camera.camera2.internal.compat.l lVar) {
        boolean z3 = false;
        this.f13346f = false;
        this.f13341a = lVar;
        this.f13342b = (Range) lVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        if (Build.VERSION.SDK_INT >= 34) {
            int[] iArr = (int[]) ((CameraCharacteristics) lVar.f13405b.f13411a).get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
            if (iArr != null) {
                for (int i7 : iArr) {
                    if (i7 == 1) {
                        z3 = true;
                        break;
                    }
                }
            }
        }
        this.f13346f = z3;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl$ZoomImpl
    public final void addRequestOption(androidx.camera.camera2.impl.a options) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float fValueOf = Float.valueOf(this.f13343c);
        androidx.camera.core.impl.W priority = androidx.camera.core.impl.W.f13996c;
        options.a(key, fValueOf);
        if (this.f13346f) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(priority, "priority");
            if (Build.VERSION.SDK_INT >= 34) {
                options.a(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl$ZoomImpl
    public final Rect getCropSensorRegion() {
        Rect rect = (Rect) this.f13341a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl$ZoomImpl
    public final float getMaxZoom() {
        return ((Float) this.f13342b.getUpper()).floatValue();
    }

    @Override // androidx.camera.camera2.internal.ZoomControl$ZoomImpl
    public final float getMinZoom() {
        return ((Float) this.f13342b.getLower()).floatValue();
    }

    @Override // androidx.camera.camera2.internal.ZoomControl$ZoomImpl
    public final void onCaptureResult(TotalCaptureResult totalCaptureResult) {
        if (this.f13344d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f10 = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f10 == null) {
                return;
            }
            if (this.f13345e == f10.floatValue()) {
                this.f13344d.b(null);
                this.f13344d = null;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl$ZoomImpl
    public final void resetZoom() {
        this.f13343c = 1.0f;
        androidx.concurrent.futures.k kVar = this.f13344d;
        if (kVar != null) {
            kVar.d(new C0206k("Camera is not active."));
            this.f13344d = null;
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl$ZoomImpl
    public final void setZoomRatio(float f10, androidx.concurrent.futures.k kVar) {
        this.f13343c = f10;
        androidx.concurrent.futures.k kVar2 = this.f13344d;
        if (kVar2 != null) {
            kVar2.d(new C0206k("There is a new zoomRatio being set"));
        }
        this.f13345e = this.f13343c;
        this.f13344d = kVar;
    }
}
