package androidx.camera.core.streamsharing;

import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements AsyncFunction, StreamSharing$Control {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14506b;

    public /* synthetic */ j(Object obj, int i7) {
        this.f14505a = i7;
        this.f14506b = obj;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        switch (this.f14505a) {
            case 0:
                return ((CameraCapturePipeline) ((ListenableFuture) this.f14506b).get()).invokePreCapture();
            default:
                return ((CameraCapturePipeline) ((ListenableFuture) this.f14506b).get()).invokePostCapture();
        }
    }

    @Override // androidx.camera.core.streamsharing.StreamSharing$Control
    public ListenableFuture jpegSnapshot(int i7, int i10) {
        top.zibin.luban.io.a aVar = ((d) this.f14506b).f14477s;
        return aVar != null ? ((androidx.camera.core.processing.f) aVar.f42645b).snapshot(i7, i10) : new androidx.camera.core.impl.utils.futures.l(new Exception("Failed to take picture: pipeline is not ready."), 1);
    }
}
