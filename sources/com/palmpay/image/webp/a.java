package com.palmpay.image.webp;

import E.AbstractC0198c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.util.Log;
import com.palmpay.lib.webview.cache.WebCacheConstant;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements XGLTextureView.Renderer {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float[] f23744p = {1.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final short[] f23745q = {0, 1, 2, 0, 2, 3};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final float[] f23746r = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FloatBuffer f23748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FloatBuffer f23749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ShortBuffer f23750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23754h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23756j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f23758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bitmap f23759m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f23760n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23761o;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23755i = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f23757k = new float[16];

    public a(Context context) {
        this.f23747a = context;
        FloatBuffer floatBufferPut = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer().put(f23744p);
        this.f23748b = floatBufferPut;
        floatBufferPut.position(0);
        ShortBuffer shortBufferPut = ByteBuffer.allocateDirect(12).order(ByteOrder.nativeOrder()).asShortBuffer().put(f23745q);
        this.f23750d = shortBufferPut;
        shortBufferPut.position(0);
        FloatBuffer floatBufferPut2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer().put(f23746r);
        this.f23749c = floatBufferPut2;
        floatBufferPut2.position(0);
    }

    @Override // com.palmpay.image.webp.XGLTextureView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        Bitmap bitmap = this.f23759m;
        if (bitmap == null) {
            Log.e("Null", "Content not ready...");
            return;
        }
        bitmap.eraseColor(0);
        Canvas canvas = new Canvas(this.f23759m);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Drawable drawable = this.f23758l;
        if (drawable != null) {
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.f23758l.draw(canvas);
        }
        GLES20.glClear(16384);
        float[] fArr = this.f23757k;
        Matrix.setIdentityM(fArr, 0);
        GLES20.glUniformMatrix4fv(this.f23756j, 1, false, fArr, 0);
        GLES20.glUniform1i(this.f23754h, 0);
        Bitmap bitmap2 = this.f23759m;
        int i7 = this.f23755i;
        int[] iArr = new int[1];
        if (i7 == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, WebCacheConstant.NET_READ_BUFFER_SIZE, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap2, 0);
        } else {
            GLES20.glBindTexture(3553, i7);
            GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap2);
            iArr[0] = i7;
        }
        GLES20.glBindTexture(3553, 0);
        this.f23755i = iArr[0];
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f23755i);
        GLES20.glDrawElements(4, 6, 5123, this.f23750d);
    }

    @Override // com.palmpay.image.webp.XGLTextureView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i7, int i10) {
        GLES20.glViewport(0, 0, i7, i10);
    }

    @Override // com.palmpay.image.webp.XGLTextureView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        this.f23751e = GLES20.glCreateProgram();
        int i7 = p048d6.a.texture_vertex;
        Context context = this.f23747a;
        String strW = AbstractC0198c.W(i7, context);
        int iGlCreateShader = GLES20.glCreateShader(35633);
        GLES20.glShaderSource(iGlCreateShader, strW);
        GLES20.glCompileShader(iGlCreateShader);
        String strW2 = AbstractC0198c.W(p048d6.a.texture_fragment, context);
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        GLES20.glShaderSource(iGlCreateShader2, strW2);
        GLES20.glCompileShader(iGlCreateShader2);
        GLES20.glAttachShader(this.f23751e, iGlCreateShader);
        GLES20.glAttachShader(this.f23751e, iGlCreateShader2);
        GLES20.glLinkProgram(this.f23751e);
        GLES20.glUseProgram(this.f23751e);
        this.f23752f = GLES20.glGetAttribLocation(this.f23751e, "vPosition");
        this.f23753g = GLES20.glGetAttribLocation(this.f23751e, "a_texCoord");
        this.f23754h = GLES20.glGetUniformLocation(this.f23751e, "s_texture");
        this.f23756j = GLES20.glGetUniformLocation(this.f23751e, "uMVPMatrix");
        GLES20.glEnableVertexAttribArray(this.f23752f);
        GLES20.glVertexAttribPointer(this.f23752f, 3, 5126, false, 12, (Buffer) this.f23748b);
        GLES20.glEnableVertexAttribArray(this.f23753g);
        GLES20.glVertexAttribPointer(this.f23753g, 2, 5126, false, 0, (Buffer) this.f23749c);
    }
}
