package androidx.appcompat.widget;

import M7.C0442b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: renamed from: androidx.appcompat.widget.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0891x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f13026b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C0891x f13027c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B0 f13028a;

    public static synchronized C0891x a() {
        try {
            if (f13027c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13027c;
    }

    public static synchronized PorterDuffColorFilter c(int i7, PorterDuff.Mode mode) {
        return B0.f(i7, mode);
    }

    public static synchronized void d() {
        if (f13027c == null) {
            C0891x c0891x = new C0891x();
            f13027c = c0891x;
            c0891x.f13028a = B0.b();
            B0 b0 = f13027c.f13028a;
            androidx.camera.camera2.internal.P0 p3 = new androidx.camera.camera2.internal.P0();
            synchronized (b0) {
                b0.f12635e = p3;
            }
        }
    }

    public static void e(Drawable drawable, C0442b c0442b, int[] iArr) {
        PorterDuff.Mode mode = B0.f12628f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z3 = c0442b.f5806b;
            if (!z3 && !c0442b.f5805a) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilterF = null;
            ColorStateList colorStateList = z3 ? (ColorStateList) c0442b.f5807c : null;
            PorterDuff.Mode mode2 = c0442b.f5805a ? (PorterDuff.Mode) c0442b.f5808d : B0.f12628f;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterF = B0.f(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterF);
        }
    }

    public final synchronized Drawable b(int i7, Context context) {
        return this.f13028a.d(i7, context);
    }
}
