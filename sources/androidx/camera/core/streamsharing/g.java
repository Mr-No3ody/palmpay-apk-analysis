package androidx.camera.core.streamsharing;

import E.n0;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Observable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class g implements CameraInternal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraInternal f14487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f14488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f14489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f14490d;

    public g(CameraInternal cameraInternal, h hVar, j jVar) {
        this.f14487a = cameraInternal;
        this.f14490d = hVar;
        this.f14488b = new k(cameraInternal.getCameraControlInternal(), jVar);
        this.f14489c = new l(cameraInternal.getCameraInfoInternal());
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void attachUseCases(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void close() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void detachUseCases(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final CameraControlInternal getCameraControlInternal() {
        return this.f14488b;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final CameraInfoInternal getCameraInfoInternal() {
        return this.f14489c;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final Observable getCameraState() {
        return this.f14487a.getCameraState();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final boolean getHasTransform() {
        return false;
    }

    @Override // androidx.camera.core.UseCase$StateChangeCallback
    public final void onUseCaseActive(n0 n0Var) {
        p140j8.f.b();
        this.f14490d.onUseCaseActive(n0Var);
    }

    @Override // androidx.camera.core.UseCase$StateChangeCallback
    public final void onUseCaseInactive(n0 n0Var) {
        p140j8.f.b();
        this.f14490d.onUseCaseInactive(n0Var);
    }

    @Override // androidx.camera.core.UseCase$StateChangeCallback
    public final void onUseCaseReset(n0 n0Var) {
        p140j8.f.b();
        this.f14490d.onUseCaseReset(n0Var);
    }

    @Override // androidx.camera.core.UseCase$StateChangeCallback
    public final void onUseCaseUpdated(n0 n0Var) {
        p140j8.f.b();
        this.f14490d.onUseCaseUpdated(n0Var);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void open() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final ListenableFuture release() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }
}
