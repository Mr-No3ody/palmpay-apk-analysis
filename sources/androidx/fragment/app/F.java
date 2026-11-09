package androidx.fragment.app;

import android.animation.Animator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cloneable f16979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16980b;

    public F(Z z3) {
        this.f16979a = new CopyOnWriteArrayList();
        this.f16980b = z3;
    }

    public void a(Fragment fragment, Bundle bundle, boolean z3) {
        Z z8 = (Z) this.f16980b;
        Fragment fragment2 = z8.f17089x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f17080n.a(fragment, bundle, true);
        }
        for (N n10 : (CopyOnWriteArrayList) this.f16979a) {
            if (!z3 || n10.f17033b) {
                n10.f17032a.onFragmentActivityCreated(z8, fragment, bundle);
            }
        }
    }

    public void b(Fragment fragment, boolean z3) {
        Z z8 = (Z) this.f16980b;
        E e10 = z8.f17087v.f17026b;
        Fragment fragment2 = z8.f17089x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f17080n.b(fragment, true);
        }
        for (N n10 : (CopyOnWriteArrayList) this.f16979a) {
            if (!z3 || n10.f17033b) {
                n10.f17032a.onFragmentAttached(z8, fragment, e10);
            }
        }
    }

    public void c(Fragment fragment, Bundle bundle, boolean z3) {
        Z z8 = (Z) this.f16980b;
        Fragment fragment2 = z8.f17089x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f17080n.c(fragment, bundle, true);
        }
        for (N n10 : (CopyOnWriteArrayList) this.f16979a) {
            if (!z3 || n10.f17033b) {
                n10.f17032a.onFragmentCreated(z8, fragment, bundle);
            }
        }
    }

    public void d(Fragment fragment, boolean z3) {
        Z z8 = (Z) this.f16980b;
        Fragment fragment2 = z8.f17089x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f17080n.d(fragment, true);
        }
        for (N n10 : (CopyOnWriteArrayList) this.f16979a) {
            if (!z3 || n10.f17033b) {
                n10.f17032a.onFragmentDestroyed(z8, fragment);
            }
        }
    }

    public void e(Fragment fragment, boolean z3) {
        Z z8 = (Z) this.f16980b;
        Fragment fragment2 = z8.f17089x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f17080n.e(fragment, true);
        }
        for (N n10 : (CopyOnWriteArrayList) this.f16979a) {
            if (!z3 || n10.f17033b) {
                n10.f17032a.onFragmentDetached(z8, fragment);
            }
        }
    }

    public void f(Fragment fragment, boolean z3) {
        Z z8 = (Z) this.f16980b;
        Fragment fragment2 = z8.f17089x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f17080n.f(fragment, true);
        }
        for (N n10 : (CopyOnWriteArrayList) this.f16979a) {
            if (!z3 || n10.f17033b) {
                n10.f17032a.onFragmentPaused(z8, fragment);
            }
        }
    }

    public void g(Fragment fragment, boolean z3) {
        Z z8 = (Z) this.f16980b;
        E e10 = z8.f17087v.f17026b;
        Fragment fragment2 = z8.f17089x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f17080n.g(fragment, true);
        }
        for (N n10 : (CopyOnWriteArrayList) this.f16979a) {
            if (!z3 || n10.f17033b) {
                n10.f17032a.onFragmentPreAttached(z8, fragment, e10);
            }
        }
    }

    public void h(Fragment fragment, Bundle bundle, boolean z3) {
        Z z8 = (Z) this.f16980b;
        Fragment fragment2 = z8.f17089x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f17080n.h(fragment, bundle, true);
        }
        for (N n10 : (CopyOnWriteArrayList) this.f16979a) {
            if (!z3 || n10.f17033b) {
                n10.f17032a.onFragmentPreCreated(z8, fragment, bundle);
            }
        }
    }

    public void i(Fragment fragment, boolean z3) {
        Z z8 = (Z) this.f16980b;
        Fragment fragment2 = z8.f17089x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f17080n.i(fragment, true);
        }
        for (N n10 : (CopyOnWriteArrayList) this.f16979a) {
            if (!z3 || n10.f17033b) {
                n10.f17032a.onFragmentResumed(z8, fragment);
            }
        }
    }

    public void j(Fragment fragment, Bundle bundle, boolean z3) {
        Z z8 = (Z) this.f16980b;
        Fragment fragment2 = z8.f17089x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f17080n.j(fragment, bundle, true);
        }
        for (N n10 : (CopyOnWriteArrayList) this.f16979a) {
            if (!z3 || n10.f17033b) {
                n10.f17032a.onFragmentSaveInstanceState(z8, fragment, bundle);
            }
        }
    }

    public void k(Fragment fragment, boolean z3) {
        Z z8 = (Z) this.f16980b;
        Fragment fragment2 = z8.f17089x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f17080n.k(fragment, true);
        }
        for (N n10 : (CopyOnWriteArrayList) this.f16979a) {
            if (!z3 || n10.f17033b) {
                n10.f17032a.onFragmentStarted(z8, fragment);
            }
        }
    }

    public void l(Fragment fragment, boolean z3) {
        Z z8 = (Z) this.f16980b;
        Fragment fragment2 = z8.f17089x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f17080n.l(fragment, true);
        }
        for (N n10 : (CopyOnWriteArrayList) this.f16979a) {
            if (!z3 || n10.f17033b) {
                n10.f17032a.onFragmentStopped(z8, fragment);
            }
        }
    }

    public void m(Fragment fragment, View view, Bundle bundle, boolean z3) {
        Z z8 = (Z) this.f16980b;
        Fragment fragment2 = z8.f17089x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f17080n.m(fragment, view, bundle, true);
        }
        for (N n10 : (CopyOnWriteArrayList) this.f16979a) {
            if (!z3 || n10.f17033b) {
                n10.f17032a.onFragmentViewCreated(z8, fragment, view, bundle);
            }
        }
    }

    public void n(Fragment fragment, boolean z3) {
        Z z8 = (Z) this.f16980b;
        Fragment fragment2 = z8.f17089x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f17080n.n(fragment, true);
        }
        for (N n10 : (CopyOnWriteArrayList) this.f16979a) {
            if (!z3 || n10.f17033b) {
                n10.f17032a.onFragmentViewDestroyed(z8, fragment);
            }
        }
    }

    public F(Animation animation) {
        this.f16979a = animation;
        this.f16980b = null;
    }

    public F(Animator animator) {
        this.f16979a = null;
        this.f16980b = animator;
    }
}
