package androidx.camera.view;

import E.C0205j;
import E.l0;
import E.m0;
import android.util.Size;
import androidx.camera.core.SurfaceRequest$TransformationInfoListener;
import androidx.camera.core.impl.CameraInternal;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements PreviewViewImplementation$OnSurfaceNotInUseListener, SurfaceRequest$TransformationInfoListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f14988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraInternal f14989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14990c;

    public /* synthetic */ l(m mVar, CameraInternal cameraInternal, m0 m0Var) {
        this.f14988a = mVar;
        this.f14989b = cameraInternal;
        this.f14990c = m0Var;
    }

    @Override // androidx.camera.view.PreviewViewImplementation$OnSurfaceNotInUseListener
    public void onSurfaceNotInUse() {
        i iVar;
        AtomicReference atomicReference = this.f14988a.f14991a.f14906g;
        do {
            iVar = (i) this.f14990c;
            if (atomicReference.compareAndSet(iVar, null)) {
                iVar.a(q.f15002a);
                break;
            }
        } while (atomicReference.get() == iVar);
        androidx.camera.core.impl.utils.futures.b bVar = iVar.f14956e;
        if (bVar != null) {
            bVar.cancel(false);
            iVar.f14956e = null;
        }
        this.f14989b.getCameraState().removeObserver(iVar);
    }

    @Override // androidx.camera.core.SurfaceRequest$TransformationInfoListener
    public void onTransformationInfoUpdate(l0 l0Var) {
        r rVar;
        m mVar = this.f14988a;
        mVar.getClass();
        Objects.toString(l0Var);
        p140j8.f.G("PreviewView");
        boolean z3 = this.f14989b.getCameraInfoInternal().getLensFacing() == 0;
        PreviewView previewView = mVar.f14991a;
        j jVar = previewView.f14903d;
        Size size = ((m0) this.f14990c).f2056b;
        jVar.getClass();
        Objects.toString(l0Var);
        Objects.toString(size);
        p140j8.f.G("PreviewTransform");
        C0205j c0205j = (C0205j) l0Var;
        jVar.f14980b = c0205j.f2043a;
        jVar.f14981c = c0205j.f2044b;
        int i7 = c0205j.f2045c;
        jVar.f14983e = i7;
        jVar.f14979a = size;
        jVar.f14984f = z3;
        jVar.f14985g = c0205j.f2046d;
        jVar.f14982d = c0205j.f2047e;
        if (i7 == -1 || ((rVar = previewView.f14901b) != null && (rVar instanceof F))) {
            previewView.f14904e = true;
        } else {
            previewView.f14904e = false;
        }
        previewView.b();
    }

    public /* synthetic */ l(m mVar, i iVar, CameraInternal cameraInternal) {
        this.f14988a = mVar;
        this.f14990c = iVar;
        this.f14989b = cameraInternal;
    }
}
