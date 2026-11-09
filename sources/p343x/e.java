package p343x;

import N8.q0;
import Z.a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.q;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.AbstractC1051c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f43511A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f43512B;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ f f43515E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f43516a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f43523h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f43524i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f43525j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f43526k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f43527l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f43528m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f43529n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f43530o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f43531p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f43532q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f43533r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f43534s;
    public boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f43535u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f43536v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f43537w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f43538x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f43539y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public AbstractC1051c f43540z;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ColorStateList f43513C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f43514D = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43517b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43518c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43519d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43520e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f43521f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f43522g = true;

    public e(f fVar, Menu menu) {
        this.f43515E = fVar;
        this.f43516a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f43515E.f43545c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z3 = false;
        menuItem.setChecked(this.f43534s).setVisible(this.t).setEnabled(this.f43535u).setCheckable(this.f43533r >= 1).setTitleCondensed(this.f43527l).setIcon(this.f43528m);
        int i7 = this.f43536v;
        if (i7 >= 0) {
            menuItem.setShowAsAction(i7);
        }
        String str = this.f43539y;
        f fVar = this.f43515E;
        if (str != null) {
            if (fVar.f43545c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (fVar.f43546d == null) {
                fVar.f43546d = f.a(fVar.f43545c);
            }
            Object obj = fVar.f43546d;
            String str2 = this.f43539y;
            d dVar = new d();
            dVar.f43509a = obj;
            Class<?> cls = obj.getClass();
            try {
                dVar.f43510b = cls.getMethod(str2, d.f43508c);
                menuItem.setOnMenuItemClickListener(dVar);
            } catch (Exception e10) {
                StringBuilder sbQ = q0.q("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbQ.append(cls.getName());
                InflateException inflateException = new InflateException(sbQ.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }
        if (this.f43533r >= 2) {
            if (menuItem instanceof m) {
                ((m) menuItem).d(true);
            } else if (menuItem instanceof q) {
                q qVar = (q) menuItem;
                try {
                    Method method = qVar.f12475e;
                    SupportMenuItem supportMenuItem = qVar.f12474d;
                    if (method == null) {
                        qVar.f12475e = supportMenuItem.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    qVar.f12475e.invoke(supportMenuItem, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str3 = this.f43538x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, f.f43541e, fVar.f43543a));
            z3 = true;
        }
        int i10 = this.f43537w;
        if (i10 > 0 && !z3) {
            menuItem.setActionView(i10);
        }
        AbstractC1051c abstractC1051c = this.f43540z;
        if (abstractC1051c != null && (menuItem instanceof SupportMenuItem)) {
            ((SupportMenuItem) menuItem).setSupportActionProvider(abstractC1051c);
        }
        CharSequence charSequence = this.f43511A;
        boolean z8 = menuItem instanceof SupportMenuItem;
        if (z8) {
            ((SupportMenuItem) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.l(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f43512B;
        if (z8) {
            ((SupportMenuItem) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.p(menuItem, charSequence2);
        }
        char c6 = this.f43529n;
        int i11 = this.f43530o;
        if (z8) {
            ((SupportMenuItem) menuItem).setAlphabeticShortcut(c6, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.k(menuItem, c6, i11);
        }
        char c10 = this.f43531p;
        int i12 = this.f43532q;
        if (z8) {
            ((SupportMenuItem) menuItem).setNumericShortcut(c10, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.o(menuItem, c10, i12);
        }
        PorterDuff.Mode mode = this.f43514D;
        if (mode != null) {
            if (z8) {
                ((SupportMenuItem) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                a.n(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f43513C;
        if (colorStateList != null) {
            if (z8) {
                ((SupportMenuItem) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                a.m(menuItem, colorStateList);
            }
        }
    }
}
