package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: androidx.appcompat.widget.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0859g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f12904a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f12905b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f12906c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 29 || i7 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f12904a);
        } else {
            drawable.setState(f12905b);
        }
        drawable.setState(state);
    }

    public static Rect b(Drawable drawable) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            Insets insetsA = AbstractC0857f0.a(drawable);
            return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
        }
        Drawable drawableP0 = org.chromium.support_lib_boundary.util.b.p0(drawable);
        if (i7 >= 29) {
            boolean z3 = AbstractC0855e0.f12891a;
        } else if (AbstractC0855e0.f12891a) {
            try {
                Object objInvoke = AbstractC0855e0.f12892b.invoke(drawableP0, new Object[0]);
                if (objInvoke != null) {
                    return new Rect(AbstractC0855e0.f12893c.getInt(objInvoke), AbstractC0855e0.f12894d.getInt(objInvoke), AbstractC0855e0.f12895e.getInt(objInvoke), AbstractC0855e0.f12896f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f12906c;
    }

    public static PorterDuff.Mode c(int i7, PorterDuff.Mode mode) {
        if (i7 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i7 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i7 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i7) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
