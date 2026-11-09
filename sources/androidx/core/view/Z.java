package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f16194e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p331w0.a f16195f = new p331w0.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f16196g = new DecelerateInterpolator();

    public static void e(View view, d0 d0Var) {
        W wJ = j(view);
        if (wJ != null) {
            wJ.onEnd(d0Var);
            if (wJ.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                e(viewGroup.getChildAt(i7), d0Var);
            }
        }
    }

    public static void f(View view, d0 d0Var, WindowInsets windowInsets, boolean z3) {
        W wJ = j(view);
        if (wJ != null) {
            wJ.mDispachedInsets = windowInsets;
            if (!z3) {
                wJ.onPrepare(d0Var);
                z3 = wJ.getDispatchMode() == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                f(viewGroup.getChildAt(i7), d0Var, windowInsets, z3);
            }
        }
    }

    public static void g(View view, q0 q0Var, List list) {
        W wJ = j(view);
        if (wJ != null) {
            q0Var = wJ.onProgress(q0Var, list);
            if (wJ.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                g(viewGroup.getChildAt(i7), q0Var, list);
            }
        }
    }

    public static void h(View view, d0 d0Var, V v3) {
        W wJ = j(view);
        if (wJ != null) {
            wJ.onStart(d0Var, v3);
            if (wJ.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                h(viewGroup.getChildAt(i7), d0Var, v3);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(W.c.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static W j(View view) {
        Object tag = view.getTag(W.c.tag_window_insets_animation_callback);
        if (tag instanceof Y) {
            return ((Y) tag).f16192a;
        }
        return null;
    }
}
