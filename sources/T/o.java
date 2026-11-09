package T;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class o extends p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8926g;

    @Override // T.p
    public final boolean b(float f10, long j6, O.e eVar, View view) {
        Method method;
        o oVar;
        if (view instanceof MotionLayout) {
            float fA = a(f10, j6, eVar, view);
            oVar = this;
            ((MotionLayout) view).setProgress(fA);
        } else {
            if (this.f8926g) {
                return false;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f8926g = true;
                method = null;
            }
            if (method != null) {
                try {
                    float fA2 = a(f10, j6, eVar, view);
                    oVar = this;
                    try {
                        method.invoke(view, Float.valueOf(fA2));
                    } catch (IllegalAccessException e10) {
                        e = e10;
                        Log.e("ViewTimeCycle", "unable to setProgress", e);
                    } catch (InvocationTargetException e11) {
                        e = e11;
                        Log.e("ViewTimeCycle", "unable to setProgress", e);
                    }
                } catch (IllegalAccessException e12) {
                    e = e12;
                    oVar = this;
                } catch (InvocationTargetException e13) {
                    e = e13;
                    oVar = this;
                }
            } else {
                oVar = this;
            }
        }
        return oVar.f8930d;
    }
}
