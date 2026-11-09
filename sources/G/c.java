package G;

import E.C0216v;
import E.U;
import H.i;
import H.j;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.SurfaceOutput;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c extends androidx.camera.core.processing.h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2860n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2861o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final U f2862p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final U f2863q;

    public c(U u6, U u10) {
        this.f2862p = u6;
        this.f2863q = u10;
    }

    @Override // androidx.camera.core.processing.h
    public final H.b e(C0216v c0216v) {
        Map map = Collections.EMPTY_MAP;
        H.b bVarE = super.e(c0216v);
        this.f2860n = j.g();
        this.f2861o = j.g();
        return bVarE;
    }

    public final void l(long j6, Surface surface, SurfaceOutput surfaceOutput, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        j.d(this.f14400a, true);
        j.c(this.f14402c);
        HashMap map = this.f14401b;
        p118hf.a.k(map.containsKey(surface), "The surface is not registered.");
        H.d dVarB = (H.d) map.get(surface);
        Objects.requireNonNull(dVarB);
        if (dVarB == j.f3533j) {
            dVarB = b(surface);
            if (dVarB == null) {
                return;
            } else {
                map.put(surface, dVarB);
            }
        }
        H.d dVar = dVarB;
        Surface surface2 = this.f14408i;
        EGLSurface eGLSurface = dVar.f3509a;
        if (surface != surface2) {
            f(eGLSurface);
            this.f14408i = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        m(dVar, surfaceOutput, surfaceTexture, this.f2862p, this.f2860n);
        m(dVar, surfaceOutput, surfaceTexture2, this.f2863q, this.f2861o);
        EGLExt.eglPresentationTimeANDROID(this.f14403d, eGLSurface, j6);
        if (EGL14.eglSwapBuffers(this.f14403d, eGLSurface)) {
            return;
        }
        Integer.toHexString(EGL14.eglGetError());
        p140j8.f.G("DualOpenGlRenderer");
        i(surface, false);
    }

    public final void m(H.d dVar, SurfaceOutput surfaceOutput, SurfaceTexture surfaceTexture, U u6, int i7) {
        k(i7);
        int i10 = dVar.f3510b;
        int i11 = dVar.f3511c;
        GLES20.glViewport(0, 0, i10, i11);
        GLES20.glScissor(0, 0, i10, i11);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        surfaceOutput.updateTransformMatrix(fArr2, fArr, true);
        H.h hVar = this.f14410k;
        hVar.getClass();
        if (hVar instanceof i) {
            GLES20.glUniformMatrix4fv(((i) hVar).f3522f, 1, false, fArr2, 0);
            j.b("glUniformMatrix4fv");
        }
        u6.getClass();
        Size size = new Size((int) (i10 * 1.0f), (int) (i11 * 1.0f));
        Size size2 = new Size(i10, i11);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        Matrix.translateM(fArr4, 0, 0.0f, 0.0f, 0.0f);
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(hVar.f3518b, 1, false, fArr5, 0);
        j.b("glUniformMatrix4fv");
        GLES20.glUniform1f(hVar.f3519c, 1.0f);
        j.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        j.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
