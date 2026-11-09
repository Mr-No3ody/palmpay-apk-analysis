package androidx.camera.camera2.internal;

import E.AbstractC0198c;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import com.google.common.util.concurrent.ListenableFuture;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
public final class U implements CameraCapturePipeline {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.i f13269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z f13270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13271c;

    public U(Z z3, androidx.camera.core.impl.utils.executor.i iVar, int i7) {
        this.f13270b = z3;
        this.f13269a = iVar;
        this.f13271c = i7;
    }

    @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
    public final ListenableFuture invokePostCapture() {
        return AbstractC0198c.y(new C0936k(this, 3));
    }

    @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
    public final ListenableFuture invokePreCapture() {
        p140j8.f.G("Camera2CapturePipeline");
        androidx.camera.core.impl.utils.futures.b bVarA = androidx.camera.core.impl.utils.futures.b.a(this.f13270b.a(this.f13271c));
        Q q10 = new Q(1);
        bVarA.getClass();
        return androidx.camera.core.impl.utils.futures.j.i(bVarA, new C2085k0(q10, 13), this.f13269a);
    }
}
