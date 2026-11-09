package H;

import E.C0216v;
import android.opengl.GLES20;
import androidx.camera.core.processing.ShaderProvider;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes.dex */
public final class i extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3523g;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(C0216v c0216v, ShaderProvider shaderProvider) {
        String str = c0216v.a() ? j.f3527d : j.f3526c;
        try {
            String strCreateFragmentShader = shaderProvider.createFragmentShader("sTexture", "vTextureCoord");
            if (strCreateFragmentShader == null || !strCreateFragmentShader.contains("vTextureCoord") || !strCreateFragmentShader.contains("sTexture")) {
                throw new IllegalArgumentException("Invalid fragment shader");
            }
            super(str, strCreateFragmentShader);
            this.f3521e = -1;
            this.f3522f = -1;
            this.f3523g = -1;
            a();
            int i7 = this.f3517a;
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(i7, "sTexture");
            this.f3521e = iGlGetUniformLocation;
            j.e(iGlGetUniformLocation, "sTexture");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(i7, "aTextureCoord");
            this.f3523g = iGlGetAttribLocation;
            j.e(iGlGetAttribLocation, "aTextureCoord");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i7, "uTexMatrix");
            this.f3522f = iGlGetUniformLocation2;
            j.e(iGlGetUniformLocation2, "uTexMatrix");
        } catch (Throwable th) {
            if (!(th instanceof IllegalArgumentException)) {
                throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
            }
            throw th;
        }
    }

    @Override // H.h
    public final void b() {
        super.b();
        GLES20.glUniform1i(this.f3521e, 0);
        GLES20.glEnableVertexAttribArray(this.f3523g);
        j.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f3523g, 2, 5126, false, 0, (Buffer) j.f3532i);
        j.b("glVertexAttribPointer");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(C0216v c0216v, g gVar) {
        e eVar;
        if (c0216v.a()) {
            p118hf.a.g(gVar != g.f3513a, "No default sampler shader available for" + gVar);
            if (gVar == g.f3515c) {
                eVar = j.f3530g;
            } else {
                eVar = j.f3529f;
            }
        } else {
            eVar = j.f3528e;
        }
        this(c0216v, eVar);
    }
}
