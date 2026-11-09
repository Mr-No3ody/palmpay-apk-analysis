package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 extends androidx.viewpager.widget.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z f17130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1161a f17131d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f17132e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f17133f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Fragment f17134g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17135h;

    public g0(Z z3) {
        this.f17130c = z3;
    }

    @Override // androidx.viewpager.widget.a
    public final void a(ViewPager viewPager, int i7, Object obj) {
        ArrayList arrayList;
        Fragment fragment = (Fragment) obj;
        C1161a c1161a = this.f17131d;
        Z z3 = this.f17130c;
        if (c1161a == null) {
            this.f17131d = N8.q0.e(z3, z3);
        }
        while (true) {
            arrayList = this.f17132e;
            if (arrayList.size() > i7) {
                break;
            } else {
                arrayList.add(null);
            }
        }
        arrayList.set(i7, fragment.isAdded() ? z3.d0(fragment) : null);
        this.f17133f.set(i7, null);
        this.f17131d.m(fragment);
        if (fragment.equals(this.f17134g)) {
            this.f17134g = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public final void b() {
        C1161a c1161a = this.f17131d;
        if (c1161a != null) {
            if (!this.f17135h) {
                try {
                    this.f17135h = true;
                    c1161a.j();
                    this.f17135h = false;
                } catch (Throwable th) {
                    this.f17135h = false;
                    throw th;
                }
            }
            this.f17131d = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public final Object g(ViewPager viewPager, int i7) {
        Fragment.SavedState savedState;
        Fragment fragment;
        ArrayList arrayList = this.f17133f;
        if (arrayList.size() > i7 && (fragment = (Fragment) arrayList.get(i7)) != null) {
            return fragment;
        }
        if (this.f17131d == null) {
            Z z3 = this.f17130c;
            this.f17131d = N8.q0.e(z3, z3);
        }
        Fragment fragmentN = n(i7);
        ArrayList arrayList2 = this.f17132e;
        if (arrayList2.size() > i7 && (savedState = (Fragment.SavedState) arrayList2.get(i7)) != null) {
            fragmentN.setInitialSavedState(savedState);
        }
        while (arrayList.size() <= i7) {
            arrayList.add(null);
        }
        fragmentN.setMenuVisibility(false);
        fragmentN.setUserVisibleHint(false);
        arrayList.set(i7, fragmentN);
        this.f17131d.d(viewPager.getId(), fragmentN, null, 1);
        return fragmentN;
    }

    @Override // androidx.viewpager.widget.a
    public final boolean h(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    public final void j(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            ArrayList arrayList = this.f17132e;
            arrayList.clear();
            ArrayList arrayList2 = this.f17133f;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    arrayList.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i7 = Integer.parseInt(str.substring(1));
                    Fragment fragmentH = this.f17130c.H(bundle, str);
                    if (fragmentH != null) {
                        while (arrayList2.size() <= i7) {
                            arrayList2.add(null);
                        }
                        fragmentH.setMenuVisibility(false);
                        arrayList2.set(i7, fragmentH);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.a
    public final Parcelable k() {
        Bundle bundle;
        ArrayList arrayList = this.f17132e;
        if (arrayList.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[arrayList.size()];
            arrayList.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f17133f;
            if (i7 >= arrayList2.size()) {
                return bundle;
            }
            Fragment fragment = (Fragment) arrayList2.get(i7);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f17130c.X(bundle, C0.G.m(i7, "f"), fragment);
            }
            i7++;
        }
    }

    @Override // androidx.viewpager.widget.a
    public final void l(Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f17134g;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f17134g.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.f17134g = fragment;
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
