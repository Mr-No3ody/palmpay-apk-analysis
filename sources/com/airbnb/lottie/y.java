package com.airbnb.lottie;

import N8.q0;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.camera.camera2.internal.P0;
import com.airbnb.lottie.model.KeyPathElement;
import com.alibaba.android.arouter.utils.Consts;
import com.didiglobal.booster.instrument.ShadowThreadPoolExecutor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class y extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public static final boolean f20280L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public static final List f20281M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public static final ShadowThreadPoolExecutor f20282N0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p045d3.k f20283A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public Matrix f20284A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f20285B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final float[] f20286B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f20287C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public Matrix f20288C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public boolean f20289D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public EnumC1309a f20290E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final Semaphore f20291F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public Handler f20292G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public com.airbnb.lottie.model.layer.b f20293H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public v f20294H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final v f20295I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public float f20296J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public int f20297K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f20298L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f20299M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f20300Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f20301X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f20302Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f20303Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f20304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.airbnb.lottie.utils.e f20305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f20309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.airbnb.lottie.manager.a f20310g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f20311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageAssetDelegate f20312j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public H f20313k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public P0 f20314o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Map f20315p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f20316p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Matrix f20317q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Bitmap f20318r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Canvas f20319s0;
    public String t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Rect f20320t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public RectF f20321u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AbstractC1310b f20322v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public com.airbnb.lottie.animation.a f20323v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public J f20324w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public Rect f20325w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Rect f20326x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public RectF f20327y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public RectF f20328z0;

    static {
        f20280L0 = Build.VERSION.SDK_INT <= 25;
        f20281M0 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f20282N0 = new ShadowThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), (ThreadFactory) new com.airbnb.lottie.utils.d(), "\u200bcom.airbnb.lottie.LottieDrawable", true);
    }

    public y() {
        com.airbnb.lottie.utils.e eVar = new com.airbnb.lottie.utils.e();
        this.f20305b = eVar;
        this.f20306c = true;
        this.f20307d = false;
        this.f20308e = false;
        this.f20297K0 = 1;
        this.f20309f = new ArrayList();
        this.f20283A = new p045d3.k((byte) 0, 17);
        this.f20285B = false;
        this.f20287C = true;
        this.f20298L = 255;
        this.f20303Z = false;
        this.f20313k0 = H.f19567a;
        this.f20316p0 = false;
        this.f20317q0 = new Matrix();
        this.f20286B0 = new float[9];
        this.f20289D0 = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.airbnb.lottie.x
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                y yVar = this.f20279a;
                EnumC1309a enumC1309a = yVar.f20290E0;
                if (enumC1309a == null) {
                    enumC1309a = EnumC1309a.f19633a;
                }
                if (enumC1309a == EnumC1309a.f19634b) {
                    yVar.invalidateSelf();
                    return;
                }
                com.airbnb.lottie.model.layer.b bVar = yVar.f20293H;
                if (bVar != null) {
                    bVar.k(yVar.f20305b.a());
                }
            }
        };
        this.f20291F0 = new Semaphore(1);
        this.f20295I0 = new v(this, 1);
        this.f20296J0 = -3.4028235E38f;
        eVar.addUpdateListener(animatorUpdateListener);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public static boolean k(float f10) {
        return (Float.isNaN(f10) || Float.isInfinite(f10)) ? false : true;
    }

    public final void a(final p212o1.e eVar, final ColorFilter colorFilter, final p243q1.c cVar) {
        com.airbnb.lottie.model.layer.b bVar = this.f20293H;
        if (bVar == null) {
            this.f20309f.add(new LottieDrawable$LazyCompositionTask() { // from class: com.airbnb.lottie.s
                @Override // com.airbnb.lottie.LottieDrawable$LazyCompositionTask
                public final void run(k kVar) {
                    this.f20206a.a(eVar, colorFilter, cVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (eVar == p212o1.e.f40008c) {
            bVar.addValueCallback(colorFilter, cVar);
        } else {
            KeyPathElement keyPathElement = eVar.f40010b;
            if (keyPathElement != null) {
                keyPathElement.addValueCallback(colorFilter, cVar);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f20293H.resolveKeyPath(eVar, 0, arrayList, new p212o1.e(new String[0]));
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((p212o1.e) arrayList.get(i7)).f40010b.addValueCallback(colorFilter, cVar);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (colorFilter == LottieProperty.f19596C) {
                w(this.f20305b.a());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    public final boolean b(Context context) {
        p194n1.a aVar;
        if (this.f20307d) {
            return true;
        }
        if (!this.f20306c) {
            return false;
        }
        p194n1.a aVar2 = p194n1.a.f39819a;
        if (context != null) {
            Matrix matrix = com.airbnb.lottie.utils.i.f20269a;
            if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f) {
                aVar = aVar2;
            } else {
                aVar = p194n1.a.f39820b;
            }
        } else {
            aVar = aVar2;
        }
        return aVar == aVar2;
    }

    public final void c() {
        k kVar = this.f20304a;
        if (kVar == null) {
            return;
        }
        p039cb.c cVar = com.airbnb.lottie.parser.r.f20185a;
        Rect rect = kVar.f19884k;
        List list = Collections.EMPTY_LIST;
        com.airbnb.lottie.model.layer.b bVar = new com.airbnb.lottie.model.layer.b(this, new com.airbnb.lottie.model.layer.e(list, kVar, "__container", -1L, 1, -1L, null, list, new com.airbnb.lottie.model.animatable.d(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), kVar.f19883j, kVar);
        this.f20293H = bVar;
        if (this.f20300Q) {
            bVar.j(true);
        }
        this.f20293H.f20039L = this.f20287C;
    }

    public final void d() {
        com.airbnb.lottie.utils.e eVar = this.f20305b;
        if (eVar.f20238v) {
            eVar.cancel();
            if (!isVisible()) {
                this.f20297K0 = 1;
            }
        }
        this.f20304a = null;
        this.f20293H = null;
        this.f20310g = null;
        this.f20296J0 = -3.4028235E38f;
        eVar.t = null;
        eVar.f20236o = -2.1474836E9f;
        eVar.f20237p = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f10;
        float fA;
        k kVar;
        com.airbnb.lottie.model.layer.b bVar = this.f20293H;
        if (bVar == null) {
            return;
        }
        EnumC1309a enumC1309a = this.f20290E0;
        if (enumC1309a == null) {
            enumC1309a = EnumC1309a.f19633a;
        }
        boolean z3 = enumC1309a == EnumC1309a.f19634b;
        ShadowThreadPoolExecutor shadowThreadPoolExecutor = f20282N0;
        Semaphore semaphore = this.f20291F0;
        v vVar = this.f20295I0;
        com.airbnb.lottie.utils.e eVar = this.f20305b;
        if (z3) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z3) {
                    return;
                } else {
                    if ((f10 > fA ? 1 : (f10 == fA ? 0 : -1)) == 0) {
                        return;
                    }
                }
            } finally {
                if (z3) {
                    semaphore.release();
                    if (bVar.f20038K != eVar.a()) {
                        shadowThreadPoolExecutor.execute(vVar);
                    }
                }
            }
        }
        if (z3 && (kVar = this.f20304a) != null) {
            float f11 = this.f20296J0;
            float fA2 = eVar.a();
            this.f20296J0 = fA2;
            if (Math.abs(fA2 - f11) * kVar.b() >= 50.0f) {
                w(eVar.a());
            }
        }
        if (this.f20308e) {
            try {
                if (this.f20316p0) {
                    n(canvas, bVar);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                com.airbnb.lottie.utils.c.f20222a.getClass();
            }
        } else if (this.f20316p0) {
            n(canvas, bVar);
        } else {
            g(canvas);
        }
        this.f20289D0 = false;
    }

    public final void e() {
        k kVar = this.f20304a;
        if (kVar == null) {
            return;
        }
        H h7 = this.f20313k0;
        int i7 = Build.VERSION.SDK_INT;
        boolean z3 = kVar.f19888o;
        int i10 = kVar.f19889p;
        int iOrdinal = h7.ordinal();
        boolean z8 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z3 && i7 < 28) || i10 > 4 || i7 <= 25))) {
            z8 = true;
        }
        this.f20316p0 = z8;
    }

    public final void g(Canvas canvas) {
        com.airbnb.lottie.model.layer.b bVar = this.f20293H;
        k kVar = this.f20304a;
        if (bVar == null || kVar == null) {
            return;
        }
        Matrix matrix = this.f20317q0;
        matrix.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float fWidth = bounds.width() / kVar.f19884k.width();
            float fHeight = bounds.height() / kVar.f19884k.height();
            matrix.preTranslate(bounds.left, bounds.top);
            matrix.preScale(fWidth, fHeight);
        }
        bVar.draw(canvas, matrix, this.f20298L, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f20298L;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        k kVar = this.f20304a;
        if (kVar == null) {
            return -1;
        }
        return kVar.f19884k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        k kVar = this.f20304a;
        if (kVar == null) {
            return -1;
        }
        return kVar.f19884k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final Context h() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public final P0 i() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f20314o == null) {
            Drawable.Callback callback = getCallback();
            AbstractC1310b abstractC1310b = this.f20322v;
            P0 p3 = new P0();
            p3.f13246a = new androidx.work.impl.model.b(15, false);
            p3.f13247b = new HashMap();
            p3.f13248c = new HashMap();
            p3.f13251f = ".ttf";
            p3.f13250e = abstractC1310b;
            if (callback instanceof View) {
                p3.f13249d = ((View) callback).getContext().getAssets();
            } else {
                com.airbnb.lottie.utils.c.b("LottieDrawable must be inside of a view for images to work.");
                p3.f13249d = null;
            }
            this.f20314o = p3;
            String str = this.t;
            if (str != null) {
                p3.f13251f = str;
            }
        }
        return this.f20314o;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback;
        if (this.f20289D0) {
            return;
        }
        this.f20289D0 = true;
        if ((!f20280L0 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return j();
    }

    public final boolean j() {
        com.airbnb.lottie.utils.e eVar = this.f20305b;
        if (eVar == null) {
            return false;
        }
        return eVar.f20238v;
    }

    public final void l() {
        this.f20309f.clear();
        com.airbnb.lottie.utils.e eVar = this.f20305b;
        eVar.g(true);
        Iterator it = eVar.f20229c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(eVar);
        }
        if (isVisible()) {
            return;
        }
        this.f20297K0 = 1;
    }

    public final void m() {
        if (this.f20293H == null) {
            this.f20309f.add(new w(this, 1));
            return;
        }
        e();
        boolean zB = b(h());
        com.airbnb.lottie.utils.e eVar = this.f20305b;
        if (zB || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.f20238v = true;
                boolean zD = eVar.d();
                for (Animator.AnimatorListener animatorListener : eVar.f20228b) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(eVar, zD);
                    } else {
                        animatorListener.onAnimationStart(eVar);
                    }
                }
                eVar.h((int) (eVar.d() ? eVar.b() : eVar.c()));
                eVar.f20232f = 0L;
                eVar.f20235j = 0;
                if (eVar.f20238v) {
                    eVar.g(false);
                    Choreographer.getInstance().postFrameCallback(eVar);
                }
                this.f20297K0 = 1;
            } else {
                this.f20297K0 = 2;
            }
        }
        if (b(h())) {
            return;
        }
        Iterator it = f20281M0.iterator();
        p212o1.g gVarD = null;
        while (it.hasNext()) {
            gVarD = this.f20304a.d((String) it.next());
            if (gVarD != null) {
                break;
            }
        }
        if (gVarD != null) {
            p((int) gVarD.f40014b);
        } else {
            p((int) (eVar.f20230d < 0.0f ? eVar.c() : eVar.b()));
        }
        eVar.g(true);
        eVar.e(eVar.d());
        if (isVisible()) {
            return;
        }
        this.f20297K0 = 1;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00d5  */
    public final void n(Canvas canvas, com.airbnb.lottie.model.layer.b bVar) {
        boolean z3;
        if (this.f20304a == null || bVar == null) {
            return;
        }
        if (this.f20319s0 == null) {
            this.f20319s0 = new Canvas();
            this.f20328z0 = new RectF();
            this.f20284A0 = new Matrix();
            this.f20288C0 = new Matrix();
            this.f20320t0 = new Rect();
            this.f20321u0 = new RectF();
            this.f20323v0 = new com.airbnb.lottie.animation.a();
            this.f20325w0 = new Rect();
            this.f20326x0 = new Rect();
            this.f20327y0 = new RectF();
        }
        canvas.getMatrix(this.f20284A0);
        canvas.getClipBounds(this.f20320t0);
        Rect rect = this.f20320t0;
        this.f20321u0.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f20284A0.mapRect(this.f20321u0);
        f(this.f20320t0, this.f20321u0);
        if (this.f20287C) {
            this.f20328z0.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            bVar.getBounds(this.f20328z0, null, false);
        }
        this.f20284A0.mapRect(this.f20328z0);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        RectF rectF = this.f20328z0;
        rectF.set(rectF.left * fWidth, rectF.top * fHeight, rectF.right * fWidth, rectF.bottom * fHeight);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z3 = !((ViewGroup) parent).getClipChildren();
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        if (!z3) {
            RectF rectF2 = this.f20328z0;
            Rect rect2 = this.f20320t0;
            rectF2.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        RectF rectF3 = this.f20328z0;
        if (!(k(rectF3.left) && k(rectF3.top) && k(rectF3.right) && k(rectF3.bottom))) {
            com.airbnb.lottie.utils.c.b("Skipping software rendering: transformed bounds contain non-finite values.");
            return;
        }
        int iCeil = (int) Math.ceil(this.f20328z0.width());
        int iCeil2 = (int) Math.ceil(this.f20328z0.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            com.airbnb.lottie.utils.c.b("Skipping software rendering: transformed bounds have negative values.");
            return;
        }
        long j6 = ((long) iCeil) * ((long) iCeil2);
        if (j6 > 50000000) {
            com.airbnb.lottie.utils.c.b("Skipping software rendering: bitmap request exceeds safe pixel count (" + j6 + ")");
            return;
        }
        Bitmap bitmap = this.f20318r0;
        if (bitmap == null || bitmap.getWidth() < iCeil || this.f20318r0.getHeight() < iCeil2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            this.f20318r0 = bitmapCreateBitmap;
            this.f20319s0.setBitmap(bitmapCreateBitmap);
            this.f20289D0 = true;
        } else if (this.f20318r0.getWidth() > iCeil || this.f20318r0.getHeight() > iCeil2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f20318r0, 0, 0, iCeil, iCeil2);
            this.f20318r0 = bitmapCreateBitmap2;
            this.f20319s0.setBitmap(bitmapCreateBitmap2);
            this.f20289D0 = true;
        }
        if (this.f20289D0) {
            Matrix matrix = this.f20284A0;
            float[] fArr = this.f20286B0;
            matrix.getValues(fArr);
            float f10 = fArr[0];
            float f11 = fArr[4];
            Matrix matrix2 = this.f20317q0;
            matrix2.set(this.f20284A0);
            matrix2.preScale(fWidth, fHeight);
            RectF rectF4 = this.f20328z0;
            matrix2.postTranslate(-rectF4.left, -rectF4.top);
            matrix2.postScale(1.0f / f10, 1.0f / f11);
            this.f20318r0.eraseColor(0);
            this.f20319s0.setMatrix(com.airbnb.lottie.utils.i.f20269a);
            this.f20319s0.scale(f10, f11);
            bVar.draw(this.f20319s0, matrix2, this.f20298L, null);
            this.f20284A0.invert(this.f20288C0);
            this.f20288C0.mapRect(this.f20327y0, this.f20328z0);
            f(this.f20326x0, this.f20327y0);
        }
        this.f20325w0.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f20318r0, this.f20325w0, this.f20326x0, this.f20323v0);
    }

    public final void o() {
        if (this.f20293H == null) {
            this.f20309f.add(new w(this, 0));
            return;
        }
        e();
        boolean zB = b(h());
        com.airbnb.lottie.utils.e eVar = this.f20305b;
        if (zB || eVar.getRepeatCount() == 0) {
            if (isVisible()) {
                eVar.f20238v = true;
                eVar.g(false);
                Choreographer.getInstance().postFrameCallback(eVar);
                eVar.f20232f = 0L;
                if (eVar.d() && eVar.f20234i == eVar.c()) {
                    eVar.h(eVar.b());
                } else if (!eVar.d() && eVar.f20234i == eVar.b()) {
                    eVar.h(eVar.c());
                }
                Iterator it = eVar.f20229c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(eVar);
                }
                this.f20297K0 = 1;
            } else {
                this.f20297K0 = 3;
            }
        }
        if (b(h())) {
            return;
        }
        p((int) (eVar.f20230d < 0.0f ? eVar.c() : eVar.b()));
        eVar.g(true);
        eVar.e(eVar.d());
        if (isVisible()) {
            return;
        }
        this.f20297K0 = 1;
    }

    public final void p(int i7) {
        if (this.f20304a == null) {
            this.f20309f.add(new r(this, i7, 2));
        } else {
            this.f20305b.h(i7);
        }
    }

    public final void q(int i7) {
        if (this.f20304a == null) {
            this.f20309f.add(new r(this, i7, 0));
            return;
        }
        com.airbnb.lottie.utils.e eVar = this.f20305b;
        eVar.i(eVar.f20236o, i7 + 0.99f);
    }

    public final void r(String str) {
        k kVar = this.f20304a;
        if (kVar == null) {
            this.f20309f.add(new q(this, str, 1));
            return;
        }
        p212o1.g gVarD = kVar.d(str);
        if (gVarD == null) {
            throw new IllegalArgumentException(q0.k("Cannot find marker with name ", str, Consts.DOT));
        }
        q((int) (gVarD.f40014b + gVarD.f40015c));
    }

    public final void s(final int i7, final int i10) {
        if (this.f20304a == null) {
            this.f20309f.add(new LottieDrawable$LazyCompositionTask() { // from class: com.airbnb.lottie.u
                @Override // com.airbnb.lottie.LottieDrawable$LazyCompositionTask
                public final void run(k kVar) {
                    this.f20213a.s(i7, i10);
                }
            });
        } else {
            this.f20305b.i(i7, i10 + 0.99f);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.f20298L = i7;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        com.airbnb.lottie.utils.c.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z8) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z3, z8);
        if (z3) {
            int i7 = this.f20297K0;
            if (i7 == 2) {
                m();
                return visible;
            }
            if (i7 == 3) {
                o();
                return visible;
            }
        } else {
            if (this.f20305b.f20238v) {
                l();
                this.f20297K0 = 3;
                return visible;
            }
            if (zIsVisible) {
                this.f20297K0 = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        m();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f20309f.clear();
        com.airbnb.lottie.utils.e eVar = this.f20305b;
        eVar.g(true);
        eVar.e(eVar.d());
        if (isVisible()) {
            return;
        }
        this.f20297K0 = 1;
    }

    public final void t(String str) {
        k kVar = this.f20304a;
        if (kVar == null) {
            this.f20309f.add(new q(this, str, 0));
            return;
        }
        p212o1.g gVarD = kVar.d(str);
        if (gVarD == null) {
            throw new IllegalArgumentException(q0.k("Cannot find marker with name ", str, Consts.DOT));
        }
        int i7 = (int) gVarD.f40014b;
        s(i7, ((int) gVarD.f40015c) + i7);
    }

    public final void u(int i7) {
        if (this.f20304a == null) {
            this.f20309f.add(new r(this, i7, 1));
        } else {
            com.airbnb.lottie.utils.e eVar = this.f20305b;
            eVar.i(i7, (int) eVar.f20237p);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void v(String str) {
        k kVar = this.f20304a;
        if (kVar == null) {
            this.f20309f.add(new q(this, str, 2));
            return;
        }
        p212o1.g gVarD = kVar.d(str);
        if (gVarD == null) {
            throw new IllegalArgumentException(q0.k("Cannot find marker with name ", str, Consts.DOT));
        }
        u((int) gVarD.f40014b);
    }

    public final void w(float f10) {
        k kVar = this.f20304a;
        if (kVar == null) {
            this.f20309f.add(new t(this, f10, 2));
        } else {
            this.f20305b.h(com.airbnb.lottie.utils.g.f(kVar.f19885l, kVar.f19886m, f10));
        }
    }
}
