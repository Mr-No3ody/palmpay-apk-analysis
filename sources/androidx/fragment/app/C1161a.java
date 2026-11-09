package androidx.fragment.app;

import androidx.lifecycle.EnumC1204n;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1161a extends k0 implements FragmentManager$BackStackEntry, FragmentManager$OpGenerator {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Z f17092r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f17093s;
    public int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f17094u;

    public C1161a(Z z3) {
        z3.J();
        K k2 = z3.f17087v;
        if (k2 != null) {
            k2.f17026b.getClassLoader();
        }
        this.t = -1;
        this.f17094u = false;
        this.f17092r = z3;
    }

    @Override // androidx.fragment.app.k0
    public final void d(int i7, Fragment fragment, String str, int i10) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            p275s0.e.c(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                throw new IllegalStateException(androidx.camera.camera2.internal.F.d(sb2, fragment.mTag, " now ", str));
            }
            fragment.mTag = str;
        }
        if (i7 != 0) {
            if (i7 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i11 = fragment.mFragmentId;
            if (i11 != 0 && i11 != i7) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i7);
            }
            fragment.mFragmentId = i7;
            fragment.mContainerId = i7;
        }
        b(new j0(fragment, i10));
        fragment.mFragmentManager = this.f17092r;
    }

    public final void g(int i7) {
        if (this.f17167g) {
            if (Z.L(2)) {
                toString();
            }
            ArrayList arrayList = this.f17161a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                j0 j0Var = (j0) arrayList.get(i10);
                Fragment fragment = j0Var.f17153b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i7;
                    if (Z.L(2)) {
                        Objects.toString(j0Var.f17153b);
                        int i11 = j0Var.f17153b.mBackStackNesting;
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager$OpGenerator
    public final boolean generateOps(ArrayList arrayList, ArrayList arrayList2) {
        if (Z.L(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f17167g) {
            return true;
        }
        Z z3 = this.f17092r;
        if (z3.f17070d == null) {
            z3.f17070d = new ArrayList();
        }
        z3.f17070d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.FragmentManager$BackStackEntry
    public final CharSequence getBreadCrumbShortTitle() {
        int i7 = this.f17172l;
        return i7 != 0 ? this.f17092r.f17087v.f17026b.getText(i7) : this.f17173m;
    }

    @Override // androidx.fragment.app.FragmentManager$BackStackEntry
    public final int getBreadCrumbShortTitleRes() {
        return this.f17172l;
    }

    @Override // androidx.fragment.app.FragmentManager$BackStackEntry
    public final CharSequence getBreadCrumbTitle() {
        int i7 = this.f17170j;
        return i7 != 0 ? this.f17092r.f17087v.f17026b.getText(i7) : this.f17171k;
    }

    @Override // androidx.fragment.app.FragmentManager$BackStackEntry
    public final int getBreadCrumbTitleRes() {
        return this.f17170j;
    }

    @Override // androidx.fragment.app.FragmentManager$BackStackEntry
    public final int getId() {
        return this.t;
    }

    @Override // androidx.fragment.app.FragmentManager$BackStackEntry
    public final String getName() {
        return this.f17169i;
    }

    public final int h(boolean z3) {
        if (this.f17093s) {
            throw new IllegalStateException("commit already called");
        }
        if (Z.L(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new u0(0));
            k("  ", printWriter, true);
            printWriter.close();
        }
        this.f17093s = true;
        boolean z8 = this.f17167g;
        Z z10 = this.f17092r;
        if (z8) {
            this.t = z10.f17075i.getAndIncrement();
        } else {
            this.t = -1;
        }
        z10.w(this, z3);
        return this.t;
    }

    public final void i() {
        if (this.f17167g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f17168h = false;
        this.f17092r.z(this, false);
    }

    public final void j() {
        if (this.f17167g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f17168h = false;
        this.f17092r.z(this, true);
    }

    public final void k(String str, PrintWriter printWriter, boolean z3) {
        String str2;
        if (z3) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f17169i);
            printWriter.print(" mIndex=");
            printWriter.print(this.t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f17093s);
            if (this.f17166f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f17166f));
            }
            if (this.f17162b != 0 || this.f17163c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f17162b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f17163c));
            }
            if (this.f17164d != 0 || this.f17165e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f17164d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f17165e));
            }
            if (this.f17170j != 0 || this.f17171k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f17170j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f17171k);
            }
            if (this.f17172l != 0 || this.f17173m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f17172l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f17173m);
            }
        }
        ArrayList arrayList = this.f17161a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            j0 j0Var = (j0) arrayList.get(i7);
            switch (j0Var.f17152a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + j0Var.f17152a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i7);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(j0Var.f17153b);
            if (z3) {
                if (j0Var.f17155d != 0 || j0Var.f17156e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(j0Var.f17155d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(j0Var.f17156e));
                }
                if (j0Var.f17157f != 0 || j0Var.f17158g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(j0Var.f17157f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(j0Var.f17158g));
                }
            }
        }
    }

    public final C1161a l(Fragment fragment) {
        Z z3 = fragment.mFragmentManager;
        if (z3 == null || z3 == this.f17092r) {
            b(new j0(fragment, 4));
            return this;
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final C1161a m(Fragment fragment) {
        Z z3 = fragment.mFragmentManager;
        if (z3 == null || z3 == this.f17092r) {
            b(new j0(fragment, 3));
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final C1161a n(Fragment fragment, EnumC1204n enumC1204n) {
        Z z3 = fragment.mFragmentManager;
        Z z8 = this.f17092r;
        if (z3 != z8) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + z8);
        }
        if (enumC1204n == EnumC1204n.f17461b && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC1204n + " after the Fragment has been created");
        }
        if (enumC1204n == EnumC1204n.f17460a) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC1204n + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        j0 j0Var = new j0();
        j0Var.f17152a = 10;
        j0Var.f17153b = fragment;
        j0Var.f17154c = false;
        j0Var.f17159h = fragment.mMaxState;
        j0Var.f17160i = enumC1204n;
        b(j0Var);
        return this;
    }

    public final C1161a o(Fragment fragment) {
        Z z3;
        if (fragment == null || (z3 = fragment.mFragmentManager) == null || z3 == this.f17092r) {
            b(new j0(fragment, 8));
            return this;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final C1161a p(Fragment fragment) {
        Z z3 = fragment.mFragmentManager;
        if (z3 == null || z3 == this.f17092r) {
            b(new j0(fragment, 5));
            return this;
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.t >= 0) {
            sb2.append(" #");
            sb2.append(this.t);
        }
        if (this.f17169i != null) {
            sb2.append(" ");
            sb2.append(this.f17169i);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public C1161a(C1161a c1161a) {
        c1161a.f17092r.J();
        K k2 = c1161a.f17092r.f17087v;
        if (k2 != null) {
            k2.f17026b.getClassLoader();
        }
        for (j0 j0Var : c1161a.f17161a) {
            ArrayList arrayList = this.f17161a;
            j0 j0Var2 = new j0();
            j0Var2.f17152a = j0Var.f17152a;
            j0Var2.f17153b = j0Var.f17153b;
            j0Var2.f17154c = j0Var.f17154c;
            j0Var2.f17155d = j0Var.f17155d;
            j0Var2.f17156e = j0Var.f17156e;
            j0Var2.f17157f = j0Var.f17157f;
            j0Var2.f17158g = j0Var.f17158g;
            j0Var2.f17159h = j0Var.f17159h;
            j0Var2.f17160i = j0Var.f17160i;
            arrayList.add(j0Var2);
        }
        this.f17162b = c1161a.f17162b;
        this.f17163c = c1161a.f17163c;
        this.f17164d = c1161a.f17164d;
        this.f17165e = c1161a.f17165e;
        this.f17166f = c1161a.f17166f;
        this.f17167g = c1161a.f17167g;
        this.f17168h = c1161a.f17168h;
        this.f17169i = c1161a.f17169i;
        this.f17172l = c1161a.f17172l;
        this.f17173m = c1161a.f17173m;
        this.f17170j = c1161a.f17170j;
        this.f17171k = c1161a.f17171k;
        if (c1161a.f17174n != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f17174n = arrayList2;
            arrayList2.addAll(c1161a.f17174n);
        }
        if (c1161a.f17175o != null) {
            ArrayList arrayList3 = new ArrayList();
            this.f17175o = arrayList3;
            arrayList3.addAll(c1161a.f17175o);
        }
        this.f17176p = c1161a.f17176p;
        this.t = -1;
        this.f17094u = false;
        this.f17092r = c1161a.f17092r;
        this.f17093s = c1161a.f17093s;
        this.t = c1161a.t;
        this.f17094u = c1161a.f17094u;
    }
}
