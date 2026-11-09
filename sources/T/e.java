package T;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8915d;

    @Override // T.f
    public final void e(View view, float f10) {
        Method method;
        if (view instanceof MotionLayout) {
            ((MotionLayout) view).setProgress(a(f10));
            return;
        }
        if (this.f8915d) {
            return;
        }
        try {
            method = view.getClass().getMethod("setProgress", Float.TYPE);
        } catch (NoSuchMethodException unused) {
            this.f8915d = true;
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(a(f10)));
            } catch (IllegalAccessException e10) {
                Log.e("ViewOscillator", "unable to setProgress", e10);
            } catch (InvocationTargetException e11) {
                Log.e("ViewOscillator", "unable to setProgress", e11);
            }
        }
    }
}
