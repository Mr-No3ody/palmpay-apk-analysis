package H;

import C0.G;
import E.C0216v;
import N8.q0;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.camera.camera2.internal.F;
import androidx.camera.core.processing.ShaderProvider;
import com.alibaba.android.arouter.utils.Consts;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.palmpay.lib.webview.cache.WebCacheConstant;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f3524a = {12344};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f3525b = {12445, 13632, 12344};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f3526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f3527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f3528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f3529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f3530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final FloatBuffer f3531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final FloatBuffer f3532i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f3533j;

    static {
        Locale locale = Locale.US;
        f3526c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f3527d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f3528e = new e(0);
        f3529f = new e(1);
        f3530g = new e(2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer.position(0);
        f3531h = floatBufferAsFloatBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer2.position(0);
        f3532i = floatBufferAsFloatBuffer2;
        f3533j = new d(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbT = G.t(str, ": EGL error: 0x");
        sbT.append(Integer.toHexString(iEglGetError));
        throw new IllegalStateException(sbT.toString());
    }

    public static void b(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        StringBuilder sbT = G.t(str, ": GL error 0x");
        sbT.append(Integer.toHexString(iGlGetError));
        throw new IllegalStateException(sbT.toString());
    }

    public static void c(Thread thread) {
        p118hf.a.k(thread == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    public static void d(AtomicBoolean atomicBoolean, boolean z3) {
        p118hf.a.k(z3 == atomicBoolean.get(), z3 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized");
    }

    public static void e(int i7, String str) {
        if (i7 < 0) {
            throw new IllegalStateException(q0.k("Unable to locate '", str, "' in program"));
        }
    }

    public static HashMap f(C0216v c0216v) {
        Object iVar;
        g gVar;
        Map map = Collections.EMPTY_MAP;
        HashMap map2 = new HashMap();
        g[] gVarArrValues = g.values();
        int length = gVarArrValues.length;
        for (int i7 = 0; i7 < length; i7++) {
            g gVar2 = gVarArrValues[i7];
            ShaderProvider shaderProvider = (ShaderProvider) map.get(gVar2);
            if (shaderProvider != null) {
                iVar = new i(c0216v, shaderProvider);
            } else if (gVar2 == g.f3515c || gVar2 == (gVar = g.f3514b)) {
                iVar = new i(c0216v, gVar2);
            } else {
                p118hf.a.k(gVar2 == g.f3513a, "Unhandled input format: " + gVar2);
                if (c0216v.a()) {
                    iVar = new f("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    ShaderProvider shaderProvider2 = (ShaderProvider) map.get(gVar);
                    iVar = shaderProvider2 != null ? new i(c0216v, shaderProvider2) : new i(c0216v, gVar);
                }
            }
            Objects.toString(gVar2);
            iVar.toString();
            map2.put(gVar2, iVar);
        }
        return map2;
    }

    public static int g() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        b("glGenTextures");
        int i7 = iArr[0];
        GLES20.glBindTexture(36197, i7);
        b("glBindTexture " + i7);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, WebCacheConstant.NET_READ_BUFFER_SIZE, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        b("glTexParameter");
        return i7;
    }

    public static EGLSurface h(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        a("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static String i() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return IdManager.DEFAULT_VERSION_NAME;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        strGroup2.getClass();
        return q0.y(strGroup, Consts.DOT, strGroup2);
    }

    public static int j(int i7, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i7);
        b("glCreateShader type=" + i7);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        p140j8.f.G("GLUtils");
        GLES20.glDeleteShader(iGlCreateShader);
        StringBuilder sbE = F.e(i7, "Could not compile shader type ", ":");
        sbE.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        throw new IllegalStateException(sbE.toString());
    }
}
