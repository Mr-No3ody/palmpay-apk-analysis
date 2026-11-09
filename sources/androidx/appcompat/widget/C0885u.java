package androidx.appcompat.widget;

import M7.C0442b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.appcompat.widget.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0885u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f13006a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0442b f13009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0442b f13010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0442b f13011f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13008c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0891x f13007b = C0891x.a();

    public C0885u(View view) {
        this.f13006a = view;
    }

    public final void a() {
        View view = this.f13006a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f13009d != null) {
                if (this.f13011f == null) {
                    this.f13011f = new C0442b();
                }
                C0442b c0442b = this.f13011f;
                c0442b.f5807c = null;
                c0442b.f5806b = false;
                c0442b.f5808d = null;
                c0442b.f5805a = false;
                WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
                ColorStateList colorStateListC = androidx.core.view.E.c(view);
                if (colorStateListC != null) {
                    c0442b.f5806b = true;
                    c0442b.f5807c = colorStateListC;
                }
                PorterDuff.Mode modeD = androidx.core.view.E.d(view);
                if (modeD != null) {
                    c0442b.f5805a = true;
                    c0442b.f5808d = modeD;
                }
                if (c0442b.f5806b || c0442b.f5805a) {
                    C0891x.e(background, c0442b, view.getDrawableState());
                    return;
                }
            }
            C0442b c0442b2 = this.f13010e;
            if (c0442b2 != null) {
                C0891x.e(background, c0442b2, view.getDrawableState());
                return;
            }
            C0442b c0442b3 = this.f13009d;
            if (c0442b3 != null) {
                C0891x.e(background, c0442b3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        C0442b c0442b = this.f13010e;
        if (c0442b != null) {
            return (ColorStateList) c0442b.f5807c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        C0442b c0442b = this.f13010e;
        if (c0442b != null) {
            return (PorterDuff.Mode) c0442b.f5808d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i7) {
        ColorStateList colorStateListG;
        View view = this.f13006a;
        Z0 z0F = Z0.f(view.getContext(), attributeSet, p241q.j.ViewBackgroundHelper, i7, 0);
        TypedArray typedArray = z0F.f12863b;
        View view2 = this.f13006a;
        androidx.core.view.N.p(view2, view2.getContext(), p241q.j.ViewBackgroundHelper, attributeSet, z0F.f12863b, i7, 0);
        try {
            if (typedArray.hasValue(p241q.j.ViewBackgroundHelper_android_background)) {
                this.f13008c = typedArray.getResourceId(p241q.j.ViewBackgroundHelper_android_background, -1);
                C0891x c0891x = this.f13007b;
                Context context = view.getContext();
                int i10 = this.f13008c;
                synchronized (c0891x) {
                    colorStateListG = c0891x.f13028a.g(i10, context);
                }
                if (colorStateListG != null) {
                    g(colorStateListG);
                }
            }
            if (typedArray.hasValue(p241q.j.ViewBackgroundHelper_backgroundTint)) {
                androidx.core.view.E.j(view, z0F.a(p241q.j.ViewBackgroundHelper_backgroundTint));
            }
            if (typedArray.hasValue(p241q.j.ViewBackgroundHelper_backgroundTintMode)) {
                androidx.core.view.E.k(view, AbstractC0859g0.c(typedArray.getInt(p241q.j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            z0F.g();
        } catch (Throwable th) {
            z0F.g();
            throw th;
        }
    }

    public final void e() {
        this.f13008c = -1;
        g(null);
        a();
    }

    public final void f(int i7) {
        ColorStateList colorStateListG;
        this.f13008c = i7;
        C0891x c0891x = this.f13007b;
        if (c0891x != null) {
            Context context = this.f13006a.getContext();
            synchronized (c0891x) {
                colorStateListG = c0891x.f13028a.g(i7, context);
            }
        } else {
            colorStateListG = null;
        }
        g(colorStateListG);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f13009d == null) {
                this.f13009d = new C0442b();
            }
            C0442b c0442b = this.f13009d;
            c0442b.f5807c = colorStateList;
            c0442b.f5806b = true;
        } else {
            this.f13009d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f13010e == null) {
            this.f13010e = new C0442b();
        }
        C0442b c0442b = this.f13010e;
        c0442b.f5807c = colorStateList;
        c0442b.f5806b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f13010e == null) {
            this.f13010e = new C0442b();
        }
        C0442b c0442b = this.f13010e;
        c0442b.f5808d = mode;
        c0442b.f5805a = true;
        a();
    }
}
