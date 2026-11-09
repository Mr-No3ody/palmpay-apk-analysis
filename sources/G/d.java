package G;

import H.j;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.SurfaceOutput;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2866c;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.f2864a = i7;
        this.f2865b = obj;
        this.f2866c = obj2;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f2864a) {
            case 0:
                f fVar = (f) this.f2865b;
                SurfaceOutput surfaceOutput = (SurfaceOutput) this.f2866c;
                surfaceOutput.close();
                Surface surface = (Surface) fVar.f2877h.remove(surfaceOutput);
                if (surface != null) {
                    c cVar = fVar.f2870a;
                    j.d(cVar.f14400a, true);
                    j.c(cVar.f14402c);
                    cVar.i(surface, true);
                }
                break;
            case 1:
                ((Surface) this.f2865b).release();
                ((SurfaceTexture) this.f2866c).release();
                break;
            default:
                androidx.camera.core.processing.f fVar2 = (androidx.camera.core.processing.f) this.f2865b;
                SurfaceOutput surfaceOutput2 = (SurfaceOutput) this.f2866c;
                surfaceOutput2.close();
                Surface surface2 = (Surface) fVar2.f14395h.remove(surfaceOutput2);
                if (surface2 != null) {
                    androidx.camera.core.processing.h hVar = fVar2.f14388a;
                    j.d(hVar.f14400a, true);
                    j.c(hVar.f14402c);
                    hVar.i(surface2, true);
                }
                break;
        }
    }
}
