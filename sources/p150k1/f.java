package p150k1;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FloatBuffer f38632b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f38634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38635e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f38638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f38639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f38640j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38631a = 20;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f38633c = new float[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38636f = -12345;

    public f() {
        float[] fArr = new float[16];
        this.f38634d = fArr;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        Intrinsics.checkNotNullExpressionValue(floatBufferAsFloatBuffer, "allocateDirect(\n        …eOrder()).asFloatBuffer()");
        this.f38632b = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
        Matrix.setIdentityM(fArr, 0);
    }

    public static void a(String op) {
        Intrinsics.checkNotNullParameter(op, "op");
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new RuntimeException(op + ": glError " + iGlGetError);
    }

    public static int b(int i7, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i7);
        a("glCreateShader type=" + i7);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }
}
