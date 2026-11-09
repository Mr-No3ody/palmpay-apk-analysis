package androidx.appcompat.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.o1;
import androidx.appcompat.widget.p1;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.q0;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.appcompat.app.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0843v implements OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f12325a;

    public C0843v(I i7) {
        this.f12325a = i7;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final q0 onApplyWindowInsets(View view, q0 q0Var) {
        boolean z3;
        boolean z8;
        int iD = q0Var.d();
        I i7 = this.f12325a;
        i7.getClass();
        int iD2 = q0Var.d();
        ActionBarContextView actionBarContextView = i7.f12139X;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z3 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) i7.f12139X.getLayoutParams();
            boolean z10 = true;
            if (i7.f12139X.isShown()) {
                if (i7.f12135S0 == null) {
                    i7.f12135S0 = new Rect();
                    i7.T0 = new Rect();
                }
                Rect rect = i7.f12135S0;
                Rect rect2 = i7.T0;
                rect.set(q0Var.b(), q0Var.d(), q0Var.c(), q0Var.a());
                ViewGroup viewGroup = i7.f12146q0;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z11 = p1.f12995a;
                    o1.a(viewGroup, rect, rect2);
                } else {
                    if (!p1.f12995a) {
                        p1.f12995a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            p1.f12996b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                p1.f12996b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    Method method = p1.f12996b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                ViewGroup viewGroup2 = i7.f12146q0;
                WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
                q0 q0VarA = androidx.core.view.F.a(viewGroup2);
                int iB = q0VarA == null ? 0 : q0VarA.b();
                int iC = q0VarA == null ? 0 : q0VarA.c();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z8 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z8 = true;
                }
                Context context = i7.f12144p;
                if (i10 <= 0 || i7.f12148s0 != null) {
                    View view2 = i7.f12148s0;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            i7.f12148s0.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    i7.f12148s0 = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    i7.f12146q0.addView(i7.f12148s0, -1, layoutParams);
                }
                View view4 = i7.f12148s0;
                z10 = view4 != null;
                if (z10 && view4.getVisibility() != 0) {
                    View view5 = i7.f12148s0;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? context.getColor(p241q.c.abc_decor_view_status_guard_light) : context.getColor(p241q.c.abc_decor_view_status_guard));
                }
                if (!i7.f12155x0 && z10) {
                    iD2 = 0;
                }
                boolean z12 = z10;
                z10 = z8;
                z3 = z12;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z3 = false;
            } else {
                z3 = false;
                z10 = false;
            }
            if (z10) {
                i7.f12139X.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = i7.f12148s0;
        if (view6 != null) {
            view6.setVisibility(z3 ? 0 : 8);
        }
        return androidx.core.view.N.l(view, iD != iD2 ? q0Var.f(q0Var.b(), iD2, q0Var.c(), q0Var.a()) : q0Var);
    }
}
