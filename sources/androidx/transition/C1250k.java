package androidx.transition;

import android.os.Build;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.transition.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1250k extends U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f18068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GhostView f18069b;

    @Override // androidx.transition.U, androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        int i7 = Build.VERSION.SDK_INT;
        View view = this.f18068a;
        if (i7 == 28) {
            if (!C1262x.f18135g) {
                try {
                    if (!C1262x.f18131c) {
                        try {
                            C1262x.f18130b = Class.forName("android.view.GhostView");
                        } catch (ClassNotFoundException unused) {
                        }
                        C1262x.f18131c = true;
                    }
                    Method declaredMethod = C1262x.f18130b.getDeclaredMethod("removeGhost", View.class);
                    C1262x.f18134f = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused2) {
                }
                C1262x.f18135g = true;
            }
            Method method = C1262x.f18134f;
            if (method != null) {
                try {
                    method.invoke(null, view);
                } catch (IllegalAccessException unused3) {
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException(e10.getCause());
                }
            }
        } else {
            int i10 = GhostViewPort.f17940g;
            GhostViewPort ghostViewPort = (GhostViewPort) view.getTag(E.ghost_view);
            if (ghostViewPort != null) {
                int i11 = ghostViewPort.f17944d - 1;
                ghostViewPort.f17944d = i11;
                if (i11 <= 0) {
                    ((GhostViewHolder) ghostViewPort.getParent()).removeView(ghostViewPort);
                }
            }
        }
        view.setTag(E.transition_transform, null);
        view.setTag(E.parent_matrix, null);
    }

    @Override // androidx.transition.U, androidx.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        this.f18069b.setVisibility(4);
    }

    @Override // androidx.transition.U, androidx.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        this.f18069b.setVisibility(0);
    }
}
