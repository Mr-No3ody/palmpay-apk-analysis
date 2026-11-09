package androidx.camera.core.streamsharing;

import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.AbstractC0974d0;
import androidx.camera.core.impl.CameraControlInternal;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC0974d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f14507c;

    public k(CameraControlInternal cameraControlInternal, j jVar) {
        super(cameraControlInternal);
        this.f14507c = jVar;
    }

    @Override // androidx.camera.core.impl.AbstractC0974d0, androidx.camera.core.impl.CameraControlInternal
    public final ListenableFuture submitStillCaptureRequests(List list, int i7, int i10) {
        p118hf.a.g(list.size() == 1, "Only support one capture config.");
        ListenableFuture<CameraCapturePipeline> cameraCapturePipelineAsync = this.f14042b.getCameraCapturePipelineAsync(i7, i10);
        androidx.camera.core.impl.utils.futures.b bVarA = androidx.camera.core.impl.utils.futures.b.a(cameraCapturePipelineAsync);
        j jVar = new j(cameraCapturePipelineAsync, 0);
        androidx.camera.core.impl.utils.executor.a aVarU = org.chromium.support_lib_boundary.util.b.u();
        bVarA.getClass();
        return androidx.camera.core.impl.utils.futures.j.a(Collections.singletonList(androidx.camera.core.impl.utils.futures.j.i(androidx.camera.core.impl.utils.futures.j.i(androidx.camera.core.impl.utils.futures.j.i(bVarA, jVar, aVarU), new U8.a(11, this, list), org.chromium.support_lib_boundary.util.b.u()), new j(cameraCapturePipelineAsync, 1), org.chromium.support_lib_boundary.util.b.u())));
    }
}
