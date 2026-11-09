package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class B0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static B0 f12629g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f12631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f12632b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f12633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.camera.camera2.internal.P0 f12635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f12628f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final A0 f12630h = new A0(6);

    public static synchronized B0 b() {
        try {
            if (f12629g == null) {
                f12629g = new B0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f12629g;
    }

    public static synchronized PorterDuffColorFilter f(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        A0 a3 = f12630h;
        a3.getClass();
        int i10 = (31 + i7) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) a3.get(Integer.valueOf(mode.hashCode() + i10));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i7, mode);
        }
        return porterDuffColorFilter;
    }

    public final synchronized void a(Context context, long j6, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                M.j jVar = (M.j) this.f12632b.get(context);
                if (jVar == null) {
                    jVar = new M.j();
                    this.f12632b.put(context, jVar);
                }
                jVar.e(j6, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Drawable c(Context context, long j6) {
        M.j jVar = (M.j) this.f12632b.get(context);
        if (jVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) jVar.b(j6);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            jVar.f(j6);
        }
        return null;
    }

    public final synchronized Drawable d(int i7, Context context) {
        return e(context, i7, false);
    }

    public final synchronized Drawable e(Context context, int i7, boolean z3) {
        Drawable drawableC;
        androidx.camera.camera2.internal.P0 p3;
        if (!this.f12634d) {
            this.f12634d = true;
            Drawable drawableD = d(p316v.a.abc_vector_test, context);
            if (drawableD == null || (!(drawableD instanceof androidx.vectordrawable.graphics.drawable.q) && !"android.graphics.drawable.VectorDrawable".equals(drawableD.getClass().getName()))) {
                this.f12634d = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
        if (this.f12633c == null) {
            this.f12633c = new TypedValue();
        }
        TypedValue typedValue = this.f12633c;
        context.getResources().getValue(i7, typedValue, true);
        long j6 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        drawableC = c(context, j6);
        PorterDuff.Mode tintModeForDrawableRes = null;
        if (drawableC == null) {
            androidx.camera.camera2.internal.P0 p10 = this.f12635e;
            drawableC = p10 == null ? null : p10.createDrawableFor(this, context, i7);
            if (drawableC != null) {
                drawableC.setChangingConfigurations(typedValue.changingConfigurations);
                a(context, j6, drawableC);
            }
        }
        if (drawableC == null) {
            drawableC = context.getDrawable(i7);
        }
        if (drawableC != null) {
            ColorStateList colorStateListG = g(i7, context);
            if (colorStateListG != null) {
                Drawable drawableMutate = drawableC.mutate();
                drawableMutate.setTintList(colorStateListG);
                androidx.camera.camera2.internal.P0 p11 = this.f12635e;
                if (p11 != null) {
                    tintModeForDrawableRes = p11.getTintModeForDrawableRes(i7);
                }
                if (tintModeForDrawableRes != null) {
                    drawableMutate.setTintMode(tintModeForDrawableRes);
                }
                tintModeForDrawableRes = drawableMutate;
            } else {
                androidx.camera.camera2.internal.P0 p12 = this.f12635e;
                if ((p12 != null && p12.tintDrawable(context, i7, drawableC)) || (((p3 = this.f12635e) != null && p3.tintDrawableUsingColorFilter(context, i7, drawableC)) || !z3)) {
                    tintModeForDrawableRes = drawableC;
                }
            }
            drawableC = tintModeForDrawableRes;
        }
        if (drawableC != null) {
            AbstractC0859g0.a(drawableC);
        }
        return drawableC;
    }

    public final synchronized ColorStateList g(int i7, Context context) {
        ColorStateList colorStateList;
        M.o oVar;
        WeakHashMap weakHashMap = this.f12631a;
        ColorStateList tintListForDrawableRes = null;
        colorStateList = (weakHashMap == null || (oVar = (M.o) weakHashMap.get(context)) == null) ? null : (ColorStateList) oVar.b(i7);
        if (colorStateList == null) {
            androidx.camera.camera2.internal.P0 p3 = this.f12635e;
            if (p3 != null) {
                tintListForDrawableRes = p3.getTintListForDrawableRes(context, i7);
            }
            if (tintListForDrawableRes != null) {
                if (this.f12631a == null) {
                    this.f12631a = new WeakHashMap();
                }
                M.o oVar2 = (M.o) this.f12631a.get(context);
                if (oVar2 == null) {
                    oVar2 = new M.o();
                    this.f12631a.put(context, oVar2);
                }
                oVar2.a(i7, tintListForDrawableRes);
            }
            colorStateList = tintListForDrawableRes;
        }
        return colorStateList;
    }
}
