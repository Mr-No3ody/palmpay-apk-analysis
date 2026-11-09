package androidx.camera.core.impl;

import E.C0211p;
import E.C0216v;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.CameraInfo;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface CameraInfoInternal extends CameraInfo {
    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default List lambda$getCameraSelector$0(List list) {
        String cameraId = getCameraId();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraInfo cameraInfo = (CameraInfo) it.next();
            p118hf.a.f(cameraInfo instanceof CameraInfoInternal);
            if (((CameraInfoInternal) cameraInfo).getCameraId().equals(cameraId)) {
                return Collections.singletonList(cameraInfo);
            }
        }
        throw new IllegalStateException(N8.q0.k("Unable to find camera with id ", cameraId, " from list of available cameras."));
    }

    void addSessionCaptureCallback(@NonNull Executor executor, @NonNull AbstractC0999q abstractC0999q);

    @NonNull
    Object getCameraCharacteristics();

    @NonNull
    String getCameraId();

    @NonNull
    y0 getCameraQuirks();

    @Override // androidx.camera.core.CameraInfo
    @NonNull
    default C0211p getCameraSelector() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C.a(this, 1));
        linkedHashSet.add(new C0984i0(getLensFacing()));
        return new C0211p(linkedHashSet);
    }

    @NonNull
    EncoderProfilesProvider getEncoderProfilesProvider();

    @NonNull
    default CameraInfoInternal getImplementation() {
        return this;
    }

    @Nullable
    Object getPhysicalCameraCharacteristics(@NonNull String str);

    @NonNull
    Set<C0216v> getSupportedDynamicRanges();

    @NonNull
    List<Size> getSupportedHighResolutions(int i7);

    @NonNull
    Set<Integer> getSupportedOutputFormats();

    @NonNull
    List<Size> getSupportedResolutions(int i7);

    @NonNull
    P0 getTimebase();

    default boolean isCaptureProcessProgressSupported() {
        return false;
    }

    default boolean isPostviewSupported() {
        return false;
    }

    boolean isPreviewStabilizationSupported();

    boolean isVideoStabilizationSupported();

    void removeSessionCaptureCallback(@NonNull AbstractC0999q abstractC0999q);
}
