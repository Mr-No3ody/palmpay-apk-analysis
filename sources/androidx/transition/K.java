package androidx.transition;

import android.R;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f17948a = {R.attr.interpolator, R.attr.duration, R.attr.startDelay, R.attr.matchOrder};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f17949b = {R.attr.resizeClip};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f17950c = {R.attr.transitionVisibilityMode};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f17951d = {R.attr.fadingMode};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f17952e = {R.attr.reparent, R.attr.reparentWithOverlay};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f17953f = {R.attr.slideEdge};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f17954g = {R.attr.transitionOrdering};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f17955h = {R.attr.minimumHorizontalAngle, R.attr.minimumVerticalAngle, R.attr.maximumAngle};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f17956i = {R.attr.patternPathData};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Method f17957j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Method f17958k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f17959l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f17960m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f17961n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Method f17962o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f17963p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f17964q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static Field f17965r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f17966s;

    public static ArrayList a(Object obj, ArrayList arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(obj)) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static void b(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1264z.a(imageView, matrix);
            return;
        }
        if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
                return;
            }
            return;
        }
        if (f17960m) {
            try {
                AbstractC1264z.a(imageView, matrix);
            } catch (NoSuchMethodError unused) {
                f17960m = false;
            }
        }
    }

    public static void c(Canvas canvas, boolean z3) {
        Method method;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            if (z3) {
                AbstractC1240a.b(canvas);
                return;
            } else {
                AbstractC1240a.a(canvas);
                return;
            }
        }
        if (i7 == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
        if (!f17959l) {
            try {
                Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f17957j = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                f17958k = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f17959l = true;
        }
        if (z3) {
            try {
                Method method2 = f17957j;
                if (method2 != null) {
                    method2.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException unused2) {
                return;
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
        if (z3 || (method = f17958k) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }

    public static ArrayList e(Object obj, ArrayList arrayList) {
        if (arrayList != null) {
            arrayList.remove(obj);
            if (arrayList.isEmpty()) {
                return null;
            }
        }
        return arrayList;
    }

    public static void h(ViewGroup viewGroup, boolean z3) {
        if (Build.VERSION.SDK_INT >= 29) {
            j0.b(viewGroup, z3);
        } else if (f17961n) {
            try {
                j0.b(viewGroup, z3);
            } catch (NoSuchMethodError unused) {
                f17961n = false;
            }
        }
    }

    public float d(View view) {
        if (f17964q) {
            try {
                return m0.a(view);
            } catch (NoSuchMethodError unused) {
                f17964q = false;
            }
        }
        return view.getAlpha();
    }

    public void f(View view, float f10) {
        if (f17964q) {
            try {
                m0.b(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                f17964q = false;
            }
        }
        view.setAlpha(f10);
    }

    public void g(View view, int i7) {
        if (!f17966s) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f17965r = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f17966s = true;
        }
        Field field = f17965r;
        if (field != null) {
            try {
                f17965r.setInt(view, i7 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
