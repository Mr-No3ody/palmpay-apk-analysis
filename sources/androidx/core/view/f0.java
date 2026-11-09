package androidx.core.view;

import android.graphics.Rect;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends i0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f16218e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f16219f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Constructor f16220g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f16221h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WindowInsets f16222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.core.graphics.e f16223d;

    public f0() {
        this.f16222c = i();
    }

    @Nullable
    private static WindowInsets i() {
        if (!f16219f) {
            try {
                f16218e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f16219f = true;
        }
        Field field = f16218e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!f16221h) {
            try {
                f16220g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            f16221h = true;
        }
        Constructor constructor = f16220g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // androidx.core.view.i0
    @NonNull
    public q0 b() {
        a();
        q0 q0VarH = q0.h(null, this.f16222c);
        androidx.core.graphics.e[] eVarArr = this.f16236b;
        o0 o0Var = q0VarH.f16277a;
        o0Var.q(eVarArr);
        o0Var.t(this.f16223d);
        return q0VarH;
    }

    @Override // androidx.core.view.i0
    public void e(@Nullable androidx.core.graphics.e eVar) {
        this.f16223d = eVar;
    }

    @Override // androidx.core.view.i0
    public void g(@NonNull androidx.core.graphics.e eVar) {
        WindowInsets windowInsets = this.f16222c;
        if (windowInsets != null) {
            this.f16222c = windowInsets.replaceSystemWindowInsets(eVar.f16058a, eVar.f16059b, eVar.f16060c, eVar.f16061d);
        }
    }

    public f0(@NonNull q0 q0Var) {
        super(q0Var);
        this.f16222c = q0Var.g();
    }
}
