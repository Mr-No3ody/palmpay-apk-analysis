package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
interface ZoomControl$ZoomImpl {
    void addRequestOption(@NonNull androidx.camera.camera2.impl.a aVar);

    @NonNull
    Rect getCropSensorRegion();

    float getMaxZoom();

    float getMinZoom();

    void onCaptureResult(@NonNull TotalCaptureResult totalCaptureResult);

    void resetZoom();

    void setZoomRatio(float f10, @NonNull androidx.concurrent.futures.k kVar);
}
