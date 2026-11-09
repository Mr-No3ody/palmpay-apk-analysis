package p150k1;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.view.Surface;
import com.palmpay.lib.webview.cache.WebCacheConstant;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SurfaceTexture f38619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Surface f38620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f38621c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f38622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f38623e;

    /* JADX WARN: Code duplicated, block: B:4:0x001f  */
    public c() {
        int iB;
        int iGlCreateProgram;
        f fVar = new f();
        this.f38623e = fVar;
        int iB2 = f.b(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
        if (iB2 == 0 || (iB = f.b(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n")) == 0) {
            iGlCreateProgram = 0;
        } else {
            iGlCreateProgram = GLES20.glCreateProgram();
            f.a("glCreateProgram");
            if (iGlCreateProgram == 0) {
                iGlCreateProgram = 0;
            } else {
                GLES20.glAttachShader(iGlCreateProgram, iB2);
                f.a("glAttachShader");
                GLES20.glAttachShader(iGlCreateProgram, iB);
                f.a("glAttachShader");
                GLES20.glLinkProgram(iGlCreateProgram);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                if (iArr[0] != 1) {
                    GLES20.glDeleteProgram(iGlCreateProgram);
                    iGlCreateProgram = 0;
                }
            }
        }
        fVar.f38635e = iGlCreateProgram;
        if (iGlCreateProgram == 0) {
            throw new RuntimeException("failed creating program");
        }
        fVar.f38639i = GLES20.glGetAttribLocation(iGlCreateProgram, "aPosition");
        f.a("glGetAttribLocation aPosition");
        if (fVar.f38639i == -1) {
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        fVar.f38640j = GLES20.glGetAttribLocation(fVar.f38635e, "aTextureCoord");
        f.a("glGetAttribLocation aTextureCoord");
        if (fVar.f38640j == -1) {
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        fVar.f38637g = GLES20.glGetUniformLocation(fVar.f38635e, "uMVPMatrix");
        f.a("glGetUniformLocation uMVPMatrix");
        if (fVar.f38637g == -1) {
            throw new RuntimeException("Could not get attrib location for uMVPMatrix");
        }
        fVar.f38638h = GLES20.glGetUniformLocation(fVar.f38635e, "uSTMatrix");
        f.a("glGetUniformLocation uSTMatrix");
        if (fVar.f38638h == -1) {
            throw new RuntimeException("Could not get attrib location for uSTMatrix");
        }
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        int i7 = iArr2[0];
        fVar.f38636f = i7;
        GLES20.glBindTexture(36197, i7);
        f.a("glBindTexture mTextureID");
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, WebCacheConstant.NET_READ_BUFFER_SIZE, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        f.a("glTexParameter");
        SurfaceTexture surfaceTexture = new SurfaceTexture(fVar.f38636f);
        this.f38619a = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f38620b = new Surface(this.f38619a);
    }

    public final void a() {
        synchronized (this.f38621c) {
            while (!this.f38622d) {
                try {
                    this.f38621c.wait(100);
                    if (!this.f38622d) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e10) {
                    throw new RuntimeException(e10);
                }
            }
            this.f38622d = false;
            Unit unit = Unit.f38893a;
        }
        if (this.f38623e != null) {
            f.a("before updateTexImage");
        }
        SurfaceTexture surfaceTexture = this.f38619a;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    public final void b() {
        f fVar = this.f38623e;
        if (fVar != null) {
            SurfaceTexture st = this.f38619a;
            Intrinsics.e(st);
            Intrinsics.checkNotNullParameter(st, "st");
            f.a("onDrawFrame start");
            float[] fArr = fVar.f38634d;
            st.getTransformMatrix(fArr);
            GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
            GLES20.glClear(16640);
            GLES20.glUseProgram(fVar.f38635e);
            f.a("glUseProgram");
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, fVar.f38636f);
            FloatBuffer floatBuffer = fVar.f38632b;
            floatBuffer.position(0);
            GLES20.glVertexAttribPointer(fVar.f38639i, 3, 5126, false, fVar.f38631a, (Buffer) fVar.f38632b);
            f.a("glVertexAttribPointer maPosition");
            GLES20.glEnableVertexAttribArray(fVar.f38639i);
            f.a("glEnableVertexAttribArray maPositionHandle");
            floatBuffer.position(3);
            GLES20.glVertexAttribPointer(fVar.f38640j, 2, 5126, false, fVar.f38631a, (Buffer) fVar.f38632b);
            f.a("glVertexAttribPointer maTextureHandle");
            GLES20.glEnableVertexAttribArray(fVar.f38640j);
            f.a("glEnableVertexAttribArray maTextureHandle");
            float[] fArr2 = fVar.f38633c;
            Matrix.setIdentityM(fArr2, 0);
            GLES20.glUniformMatrix4fv(fVar.f38637g, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(fVar.f38638h, 1, false, fArr, 0);
            GLES20.glDrawArrays(5, 0, 4);
            f.a("glDrawArrays");
            GLES20.glFinish();
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.f38621c) {
            if (this.f38622d) {
                throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
            }
            this.f38622d = true;
            this.f38621c.notifyAll();
            Unit unit = Unit.f38893a;
        }
    }
}
