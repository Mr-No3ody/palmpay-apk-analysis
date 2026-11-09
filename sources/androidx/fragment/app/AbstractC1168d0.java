package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import androidx.lifecycle.EnumC1204n;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: androidx.fragment.app.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1168d0 extends androidx.viewpager.widget.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z f17109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1161a f17111e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Fragment f17112f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17113g;

    public AbstractC1168d0(Z z3, int i7) {
        this.f17109c = z3;
        this.f17110d = i7;
    }

    @Override // androidx.viewpager.widget.a
    public final void a(ViewPager viewPager, int i7, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f17111e == null) {
            Z z3 = this.f17109c;
            this.f17111e = N8.q0.e(z3, z3);
        }
        C1161a c1161a = this.f17111e;
        c1161a.getClass();
        Z z8 = fragment.mFragmentManager;
        if (z8 != null && z8 != c1161a.f17092r) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        c1161a.b(new j0(fragment, 6));
        if (fragment.equals(this.f17112f)) {
            this.f17112f = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public final void b() {
        C1161a c1161a = this.f17111e;
        if (c1161a != null) {
            if (!this.f17113g) {
                try {
                    this.f17113g = true;
                    c1161a.j();
                    this.f17113g = false;
                } catch (Throwable th) {
                    this.f17113g = false;
                    throw th;
                }
            }
            this.f17111e = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public final Object g(ViewPager viewPager, int i7) {
        C1161a c1161a = this.f17111e;
        Z z3 = this.f17109c;
        if (c1161a == null) {
            this.f17111e = N8.q0.e(z3, z3);
        }
        long j6 = i7;
        Fragment fragmentE = z3.E("android:switcher:" + viewPager.getId() + ":" + j6);
        if (fragmentE != null) {
            C1161a c1161a2 = this.f17111e;
            c1161a2.getClass();
            c1161a2.b(new j0(fragmentE, 7));
        } else {
            fragmentE = n(i7);
            this.f17111e.d(viewPager.getId(), fragmentE, "android:switcher:" + viewPager.getId() + ":" + j6, 1);
        }
        if (fragmentE != this.f17112f) {
            fragmentE.setMenuVisibility(false);
            if (this.f17110d == 1) {
                this.f17111e.n(fragmentE, EnumC1204n.f17463d);
                return fragmentE;
            }
            fragmentE.setUserVisibleHint(false);
        }
        return fragmentE;
    }

    @Override // androidx.viewpager.widget.a
    public final boolean h(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    public final void j(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.a
    public final Parcelable k() {
        return null;
    }

    @Override // androidx.viewpager.widget.a
    public final void l(Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f17112f;
        if (fragment != fragment2) {
            Z z3 = this.f17109c;
            int i7 = this.f17110d;
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (i7 == 1) {
                    if (this.f17111e == null) {
                        this.f17111e = N8.q0.e(z3, z3);
                    }
                    this.f17111e.n(this.f17112f, EnumC1204n.f17463d);
                } else {
                    this.f17112f.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (i7 == 1) {
                if (this.f17111e == null) {
                    this.f17111e = N8.q0.e(z3, z3);
                }
                this.f17111e.n(fragment, EnumC1204n.f17464e);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f17112f = fragment;
        }
    }

    @Override // androidx.viewpager.widget.a
    public final void m(ViewPager viewPager) {
        if (viewPager.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public abstract Fragment n(int i7);
}
