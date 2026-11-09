package H;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3518b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3519c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3520d = -1;

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    public h(String str, String str2) throws Throwable {
        int iJ;
        int iJ2;
        int iGlCreateProgram;
        try {
            iJ = j.j(35633, str);
            try {
                iJ2 = j.j(35632, str2);
                try {
                    iGlCreateProgram = GLES20.glCreateProgram();
                    try {
                        j.b("glCreateProgram");
                        GLES20.glAttachShader(iGlCreateProgram, iJ);
                        j.b("glAttachShader");
                        GLES20.glAttachShader(iGlCreateProgram, iJ2);
                        j.b("glAttachShader");
                        GLES20.glLinkProgram(iGlCreateProgram);
                        int[] iArr = new int[1];
                        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                        if (iArr[0] == 1) {
                            this.f3517a = iGlCreateProgram;
                            a();
                        } else {
                            throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                        }
                    } catch (IllegalArgumentException e10) {
                        e = e10;
                        if (iJ != -1) {
                            GLES20.glDeleteShader(iJ);
                        }
                        if (iJ2 != -1) {
                            GLES20.glDeleteShader(iJ2);
                        }
                        if (iGlCreateProgram != -1) {
                            GLES20.glDeleteProgram(iGlCreateProgram);
                        }
                        throw e;
                    } catch (IllegalStateException e11) {
                        e = e11;
                        if (iJ != -1) {
                            GLES20.glDeleteShader(iJ);
                        }
                        if (iJ2 != -1) {
                            GLES20.glDeleteShader(iJ2);
                        }
                        if (iGlCreateProgram != -1) {
                            GLES20.glDeleteProgram(iGlCreateProgram);
                        }
                        throw e;
                    }
                } catch (IllegalArgumentException | IllegalStateException e12) {
                    e = e12;
                    iGlCreateProgram = -1;
                }
            } catch (IllegalArgumentException | IllegalStateException e13) {
                e = e13;
                iJ2 = -1;
                iGlCreateProgram = iJ2;
                if (iJ != -1) {
                    GLES20.glDeleteShader(iJ);
                }
                if (iJ2 != -1) {
                    GLES20.glDeleteShader(iJ2);
                }
                if (iGlCreateProgram != -1) {
                    GLES20.glDeleteProgram(iGlCreateProgram);
                }
                throw e;
            }
        } catch (IllegalArgumentException | IllegalStateException e14) {
            e = e14;
            iJ = -1;
            iJ2 = -1;
        }
    }

    public final void a() {
        int i7 = this.f3517a;
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i7, "aPosition");
        this.f3520d = iGlGetAttribLocation;
        j.e(iGlGetAttribLocation, "aPosition");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(i7, "uTransMatrix");
        this.f3518b = iGlGetUniformLocation;
        j.e(iGlGetUniformLocation, "uTransMatrix");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i7, "uAlphaScale");
        this.f3519c = iGlGetUniformLocation2;
        j.e(iGlGetUniformLocation2, "uAlphaScale");
    }

    public void b() {
        GLES20.glUseProgram(this.f3517a);
        j.b("glUseProgram");
        GLES20.glEnableVertexAttribArray(this.f3520d);
        j.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f3520d, 2, 5126, false, 0, (Buffer) j.f3531h);
        j.b("glVertexAttribPointer");
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        GLES20.glUniformMatrix4fv(this.f3518b, 1, false, fArr, 0);
        j.b("glUniformMatrix4fv");
        GLES20.glUniform1f(this.f3519c, 1.0f);
        j.b("glUniform1f");
    }
}
