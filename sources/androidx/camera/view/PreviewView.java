package androidx.camera.view;

import E.C0217w;
import E.C0218x;
import E.C0219y;
import E.X;
import E.Y;
import E.m0;
import E.q0;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.camera.core.ImageAnalysis$Analyzer;
import androidx.camera.core.ImageCapture$ScreenFlash;
import androidx.camera.core.Preview$SurfaceProvider;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.core.view.N;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewView extends FrameLayout {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f14898B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final m f14899A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f14900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f14901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenFlashView f14902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f14903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.F f14905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f14906g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AbstractC1024e f14907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f14908j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final androidx.camera.view.impl.f f14909o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CameraInfoInternal f14910p;
    public MotionEvent t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final n f14911v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k f14912w;

    @RestrictTo({p192n.c.f39801b})
    public interface OnFrameUpdateListener {
        void onFrameUpdate(long j6);
    }

    @UiThread
    public PreviewView(@NonNull Context context) {
        this(context, null);
    }

    public static boolean c(m0 m0Var, o oVar) {
        boolean zEquals = m0Var.f2059e.getCameraInfoInternal().getImplementationType().equals("androidx.camera.camera2.legacy");
        boolean z3 = (J.b.f4448a.b(SurfaceViewStretchedQuirk.class) == null && J.b.f4448a.b(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (Build.VERSION.SDK_INT > 24 && !zEquals && !z3) {
            int iOrdinal = oVar.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal != 1) {
                throw new IllegalArgumentException("Invalid implementation mode: " + oVar);
            }
        }
        return true;
    }

    @Nullable
    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    @Nullable
    @UiThread
    private ImageCapture$ScreenFlash getScreenFlashInternal() {
        return this.f14902c.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i7 = 1;
        if (iOrdinal != 1) {
            i7 = 2;
            if (iOrdinal != 2) {
                i7 = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i7;
    }

    private void setScreenFlashUiInfo(ImageCapture$ScreenFlash imageCapture$ScreenFlash) {
        AbstractC1024e abstractC1024e = this.f14907i;
        if (abstractC1024e == null) {
            p140j8.f.G("PreviewView");
            return;
        }
        androidx.camera.view.internal.a aVar = androidx.camera.view.internal.a.f14974a;
        androidx.camera.view.internal.b bVar = new androidx.camera.view.internal.b(aVar, imageCapture$ScreenFlash);
        androidx.camera.view.internal.b bVarF = abstractC1024e.f();
        abstractC1024e.f14923B.put(aVar, bVar);
        androidx.camera.view.internal.b bVarF2 = abstractC1024e.f();
        if (bVarF2 == null || bVarF2.equals(bVarF)) {
            return;
        }
        abstractC1024e.q();
    }

    public final void a(boolean z3) {
        p140j8.f.b();
        q0 viewPort = getViewPort();
        if (this.f14907i == null || viewPort == null || !isAttachedToWindow()) {
            return;
        }
        try {
            this.f14907i.a(getSurfaceProvider(), viewPort);
        } catch (IllegalStateException e10) {
            if (!z3) {
                throw e10;
            }
            p140j8.f.h("PreviewView", e10.toString(), e10);
        }
    }

    public final void b() {
        Rect rect;
        Display display;
        CameraInfoInternal cameraInfoInternal;
        p140j8.f.b();
        if (this.f14901b != null) {
            if (this.f14904e && (display = getDisplay()) != null && (cameraInfoInternal = this.f14910p) != null) {
                int sensorRotationDegrees = cameraInfoInternal.getSensorRotationDegrees(display.getRotation());
                int rotation = display.getRotation();
                j jVar = this.f14903d;
                if (jVar.f14985g) {
                    jVar.f14981c = sensorRotationDegrees;
                    jVar.f14983e = rotation;
                }
            }
            this.f14901b.f();
        }
        s sVar = this.f14908j;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        sVar.getClass();
        p140j8.f.b();
        synchronized (sVar) {
            try {
                if (size.getWidth() == 0 || size.getHeight() == 0 || (rect = sVar.f15011c) == null) {
                    sVar.f15012d = null;
                } else {
                    sVar.f15012d = sVar.f15010b.a(size, layoutDirection, rect);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC1024e abstractC1024e = this.f14907i;
        if (abstractC1024e != null) {
            Matrix sensorToViewTransform = getSensorToViewTransform();
            p140j8.f.b();
            ImageAnalysis$Analyzer imageAnalysis$Analyzer = abstractC1024e.f14929f;
            if (imageAnalysis$Analyzer != null && imageAnalysis$Analyzer.getTargetCoordinateSystem() == 1) {
                abstractC1024e.f14929f.updateTransform(sensorToViewTransform);
            }
        }
    }

    @Nullable
    @UiThread
    public Bitmap getBitmap() {
        Bitmap bitmapB;
        p140j8.f.b();
        r rVar = this.f14901b;
        if (rVar == null || (bitmapB = rVar.b()) == null) {
            return null;
        }
        FrameLayout frameLayout = rVar.f15006b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        j jVar = rVar.f15007c;
        if (!jVar.f()) {
            return bitmapB;
        }
        Matrix matrixD = jVar.d();
        RectF rectFE = jVar.e(size, layoutDirection);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmapB.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixD);
        matrix.postScale(rectFE.width() / jVar.f14979a.getWidth(), rectFE.height() / jVar.f14979a.getHeight());
        matrix.postTranslate(rectFE.left, rectFE.top);
        canvas.drawBitmap(bitmapB, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    @Nullable
    @UiThread
    public AbstractC1024e getController() {
        p140j8.f.b();
        return this.f14907i;
    }

    @NonNull
    @UiThread
    public o getImplementationMode() {
        p140j8.f.b();
        return this.f14900a;
    }

    @NonNull
    @UiThread
    public Y getMeteringPointFactory() {
        p140j8.f.b();
        return this.f14908j;
    }

    @Nullable
    @TransformExperimental
    public K.a getOutputTransform() {
        Matrix matrixC;
        j jVar = this.f14903d;
        p140j8.f.b();
        try {
            matrixC = jVar.c(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixC = null;
        }
        Rect rect = jVar.f14980b;
        if (matrixC == null || rect == null) {
            p140j8.f.G("PreviewView");
            return null;
        }
        RectF rectF = androidx.camera.core.impl.utils.o.f14263a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(androidx.camera.core.impl.utils.o.f14263a, rectF2, Matrix.ScaleToFit.FILL);
        matrixC.preConcat(matrix);
        if (this.f14901b instanceof H) {
            matrixC.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            p140j8.f.G("PreviewView");
        }
        new Size(rect.width(), rect.height());
        return new K.a();
    }

    @NonNull
    public androidx.lifecycle.B getPreviewStreamState() {
        return this.f14905f;
    }

    @NonNull
    @UiThread
    public p getScaleType() {
        p140j8.f.b();
        return this.f14903d.f14986h;
    }

    @Nullable
    @ExperimentalPreviewViewScreenFlash
    @UiThread
    public ImageCapture$ScreenFlash getScreenFlash() {
        return getScreenFlashInternal();
    }

    @Nullable
    @UiThread
    public Matrix getSensorToViewTransform() {
        p140j8.f.b();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        j jVar = this.f14903d;
        if (!jVar.f()) {
            return null;
        }
        Matrix matrix = new Matrix(jVar.f14982d);
        matrix.postConcat(jVar.c(size, layoutDirection));
        return matrix;
    }

    @NonNull
    @UiThread
    public Preview$SurfaceProvider getSurfaceProvider() {
        p140j8.f.b();
        return this.f14899A;
    }

    @Nullable
    @UiThread
    public q0 getViewPort() {
        p140j8.f.b();
        if (getDisplay() == null) {
            return null;
        }
        int rotation = getDisplay().getRotation();
        p140j8.f.b();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Rational rational = new Rational(getWidth(), getHeight());
        int viewPortScaleType = getViewPortScaleType();
        int layoutDirection = getLayoutDirection();
        q0 q0Var = new q0();
        q0Var.f2097a = viewPortScaleType;
        q0Var.f2098b = rational;
        q0Var.f2099c = rotation;
        q0Var.f2100d = layoutDirection;
        return q0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.f14911v, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.f14912w);
        r rVar = this.f14901b;
        if (rVar != null) {
            rVar.c();
        }
        a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f14912w);
        r rVar = this.f14901b;
        if (rVar != null) {
            rVar.d();
        }
        AbstractC1024e abstractC1024e = this.f14907i;
        if (abstractC1024e != null) {
            abstractC1024e.b();
        }
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f14911v);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        float f10;
        float f11;
        if (this.f14907i == null) {
            return super.onTouchEvent(event);
        }
        boolean z3 = event.getPointerCount() == 1;
        boolean z8 = event.getAction() == 1;
        boolean z10 = event.getEventTime() - event.getDownTime() < ((long) ViewConfiguration.getLongPressTimeout());
        if (z3 && z8 && z10) {
            this.t = event;
            performClick();
            return true;
        }
        androidx.camera.view.impl.f fVar = this.f14909o;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        event.getEventTime();
        int actionMasked = event.getActionMasked();
        if (fVar.f14963c) {
            fVar.f14972l.onTouchEvent(event);
        }
        int pointerCount = event.getPointerCount();
        boolean z11 = (event.getButtonState() & 32) != 0;
        boolean z12 = fVar.f14971k == 2 && !z11;
        boolean z13 = actionMasked == 1 || actionMasked == 3 || z12;
        C1021b c1021b = fVar.f14962b;
        float f12 = 0.0f;
        if (actionMasked == 0 || z13) {
            if (fVar.f14967g) {
                fVar.a();
                c1021b.onZoomEvent(new androidx.camera.view.impl.b());
                fVar.f14967g = false;
                fVar.f14968h = 0.0f;
                fVar.f14971k = 0;
            } else if (fVar.b() && z13) {
                fVar.f14967g = false;
                fVar.f14968h = 0.0f;
                fVar.f14971k = 0;
            }
            if (z13) {
                return true;
            }
        }
        if (!fVar.f14967g && fVar.f14964d && !fVar.b() && !z13 && z11) {
            fVar.f14969i = event.getX();
            fVar.f14970j = event.getY();
            fVar.f14971k = 2;
            fVar.f14968h = 0.0f;
        }
        boolean z14 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z12;
        boolean z15 = actionMasked == 6;
        int actionIndex = z15 ? event.getActionIndex() : -1;
        int i7 = z15 ? pointerCount - 1 : pointerCount;
        if (fVar.b()) {
            f11 = fVar.f14969i;
            f10 = fVar.f14970j;
            fVar.f14973m = event.getY() < f10;
        } else {
            float x3 = 0.0f;
            float y8 = 0.0f;
            for (int i10 = 0; i10 < pointerCount; i10++) {
                if (actionIndex != i10) {
                    x3 = event.getX(i10) + x3;
                    y8 = event.getY(i10) + y8;
                }
            }
            float f13 = i7;
            float f14 = x3 / f13;
            f10 = y8 / f13;
            f11 = f14;
        }
        float fAbs = 0.0f;
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (actionIndex != i11) {
                float fAbs2 = Math.abs(event.getX(i11) - f11) + f12;
                fAbs = Math.abs(event.getY(i11) - f10) + fAbs;
                f12 = fAbs2;
            }
        }
        float f15 = i7;
        float f16 = f12 / f15;
        float f17 = fAbs / f15;
        float f18 = 2;
        float f19 = f16 * f18;
        float fHypot = f17 * f18;
        if (!fVar.b()) {
            fHypot = (float) Math.hypot(f19, fHypot);
        }
        boolean z16 = fVar.f14967g;
        Nf.b.b(f11);
        Nf.b.b(f10);
        if (!fVar.b() && fVar.f14967g && (fHypot < 0 || z14)) {
            fVar.a();
            c1021b.onZoomEvent(new androidx.camera.view.impl.b());
            fVar.f14967g = false;
            fVar.f14968h = fHypot;
        }
        if (z14) {
            fVar.f14965e = fHypot;
            fVar.f14966f = fHypot;
            fVar.f14968h = fHypot;
        }
        boolean zB = fVar.b();
        int i12 = fVar.f14961a;
        int i13 = zB ? i12 : 0;
        if (!fVar.f14967g && fHypot >= i13 && (z16 || Math.abs(fHypot - fVar.f14968h) > i12)) {
            fVar.f14965e = fHypot;
            fVar.f14966f = fHypot;
            c1021b.onZoomEvent(new androidx.camera.view.impl.b());
            fVar.f14967g = true;
        }
        if (actionMasked != 2) {
            return true;
        }
        fVar.f14965e = fHypot;
        if (fVar.f14967g) {
            c1021b.onZoomEvent(new androidx.camera.view.impl.c(fVar.a()));
        }
        fVar.f14966f = fVar.f14965e;
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f14907i != null) {
            MotionEvent motionEvent = this.t;
            float x3 = motionEvent != null ? motionEvent.getX() : getWidth() / 2.0f;
            MotionEvent motionEvent2 = this.t;
            float y8 = motionEvent2 != null ? motionEvent2.getY() : getHeight() / 2.0f;
            AbstractC1024e abstractC1024e = this.f14907i;
            if (abstractC1024e.h() && abstractC1024e.t) {
                p140j8.f.G("CameraController");
                abstractC1024e.f14945w.i(1);
                s sVar = this.f14908j;
                X xA = sVar.a(x3, y8, 0.16666667f);
                X xA2 = sVar.a(x3, y8, 0.25f);
                C0217w c0217w = new C0217w(xA);
                c0217w.a(xA2, 2);
                ListenableFuture<C0219y> listenableFutureStartFocusAndMetering = abstractC1024e.f14936m.getCameraControl().startFocusAndMetering(new C0218x(c0217w));
                C1023d c1023d = new C1023d();
                c1023d.f14920a = abstractC1024e;
                listenableFutureStartFocusAndMetering.addListener(new androidx.camera.core.impl.utils.futures.i(0, listenableFutureStartFocusAndMetering, c1023d), org.chromium.support_lib_boundary.util.b.u());
            } else {
                p140j8.f.G("CameraController");
            }
        }
        this.t = null;
        return super.performClick();
    }

    @UiThread
    public void setController(@Nullable AbstractC1024e abstractC1024e) {
        p140j8.f.b();
        AbstractC1024e abstractC1024e2 = this.f14907i;
        if (abstractC1024e2 != null && abstractC1024e2 != abstractC1024e) {
            abstractC1024e2.b();
            setScreenFlashUiInfo(null);
        }
        this.f14907i = abstractC1024e;
        a(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    @UiThread
    public void setImplementationMode(@NonNull o oVar) {
        p140j8.f.b();
        this.f14900a = oVar;
    }

    @UiThread
    public void setScaleType(@NonNull p pVar) {
        p140j8.f.b();
        this.f14903d.f14986h = pVar;
        b();
        a(false);
    }

    @ExperimentalPreviewViewScreenFlash
    public void setScreenFlashOverlayColor(@ColorInt int i7) {
        this.f14902c.setBackgroundColor(i7);
    }

    @UiThread
    public void setScreenFlashWindow(@Nullable Window window) {
        p140j8.f.b();
        this.f14902c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    @UiThread
    public PreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.camera.view.k] */
    @UiThread
    public PreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7, 0);
        this.f14900a = o.PERFORMANCE;
        j jVar = new j();
        jVar.f14986h = p.FILL_CENTER;
        this.f14903d = jVar;
        this.f14904e = true;
        this.f14905f = new androidx.lifecycle.F(q.f15002a);
        this.f14906g = new AtomicReference();
        this.f14908j = new s(jVar);
        this.f14911v = new n(this);
        this.f14912w = new View.OnLayoutChangeListener() { // from class: androidx.camera.view.k
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                int i18 = PreviewView.f14898B;
                PreviewView previewView = this.f14987a;
                if (i12 - i10 == i16 - i14 && i13 - i11 == i17 - i15) {
                    return;
                }
                previewView.b();
                previewView.a(true);
            }
        };
        this.f14899A = new m(this);
        p140j8.f.b();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, u.PreviewView, i7, 0);
        N.p(this, context, u.PreviewView, attributeSet, typedArrayObtainStyledAttributes, i7, 0);
        try {
            int integer = typedArrayObtainStyledAttributes.getInteger(u.PreviewView_scaleType, jVar.f14986h.f15001a);
            for (p pVar : p.values()) {
                if (pVar.f15001a == integer) {
                    setScaleType(pVar);
                    int integer2 = typedArrayObtainStyledAttributes.getInteger(u.PreviewView_implementationMode, 0);
                    for (o oVar : o.values()) {
                        if (oVar.f14995a == integer2) {
                            setImplementationMode(oVar);
                            typedArrayObtainStyledAttributes.recycle();
                            this.f14909o = new androidx.camera.view.impl.f(context, new C1021b(this));
                            if (getBackground() == null) {
                                setBackgroundColor(getContext().getColor(R.color.black));
                            }
                            ScreenFlashView screenFlashView = new ScreenFlashView(context);
                            this.f14902c = screenFlashView;
                            screenFlashView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
