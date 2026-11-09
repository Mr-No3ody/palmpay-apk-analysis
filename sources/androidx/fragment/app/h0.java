package androidx.fragment.app;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17139a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f17140b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f17141c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1166c0 f17142d;

    public final void a(Fragment fragment) {
        if (this.f17139a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f17139a) {
            this.f17139a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final Fragment b(String str) {
        f0 f0Var = (f0) this.f17140b.get(str);
        if (f0Var != null) {
            return f0Var.f17125c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment fragmentFindFragmentByWho;
        for (f0 f0Var : this.f17140b.values()) {
            if (f0Var != null && (fragmentFindFragmentByWho = f0Var.f17125c.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (f0 f0Var : this.f17140b.values()) {
            if (f0Var != null) {
                arrayList.add(f0Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (f0 f0Var : this.f17140b.values()) {
            if (f0Var != null) {
                arrayList.add(f0Var.f17125c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f17139a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f17139a) {
            arrayList = new ArrayList(this.f17139a);
        }
        return arrayList;
    }

    public final void g(f0 f0Var) {
        Fragment fragment = f0Var.f17125c;
        String str = fragment.mWho;
        HashMap map = this.f17140b;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.mWho, f0Var);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.f17142d.d(fragment);
            } else {
                this.f17142d.f(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (Z.L(2)) {
            fragment.toString();
        }
    }

    public final void h(f0 f0Var) {
        Fragment fragment = f0Var.f17125c;
        if (fragment.mRetainInstance) {
            this.f17142d.f(fragment);
        }
        HashMap map = this.f17140b;
        if (map.get(fragment.mWho) == f0Var && ((f0) map.put(fragment.mWho, null)) != null && Z.L(2)) {
            fragment.toString();
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap map = this.f17141c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }
}
