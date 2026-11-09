package C0;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.NavViewModelStoreProvider;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: renamed from: C0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0119k implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0115g f1049v = new C0115g(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public K f1051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f1052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EnumC1204n f1053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NavViewModelStoreProvider f1054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f1056g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1212w f1057i = new C1212w(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final L0.f f1058j = L0.f.f5522d.create(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1059o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public EnumC1204n f1060p;
    public final androidx.lifecycle.Y t;

    public C0119k(Context context, K k2, Bundle bundle, EnumC1204n enumC1204n, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2) {
        this.f1050a = context;
        this.f1051b = k2;
        this.f1052c = bundle;
        this.f1053d = enumC1204n;
        this.f1054e = navViewModelStoreProvider;
        this.f1055f = str;
        this.f1056g = bundle2;
        p355xf.t tVarB = C2131j.b(new C0118j(this, 0));
        C2131j.b(new C0118j(this, 1));
        this.f1060p = EnumC1204n.f17461b;
        this.t = (androidx.lifecycle.Y) tVarB.getValue();
    }

    public final Bundle a() {
        Bundle bundle = this.f1052c;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final void b(EnumC1204n maxState) {
        Intrinsics.checkNotNullParameter(maxState, "maxState");
        this.f1060p = maxState;
        c();
    }

    public final void c() {
        if (!this.f1059o) {
            L0.f fVar = this.f1058j;
            fVar.a();
            this.f1059o = true;
            if (this.f1054e != null) {
                androidx.lifecycle.V.d(this);
            }
            fVar.b(this.f1056g);
        }
        int iOrdinal = this.f1053d.ordinal();
        int iOrdinal2 = this.f1060p.ordinal();
        C1212w c1212w = this.f1057i;
        if (iOrdinal < iOrdinal2) {
            c1212w.g(this.f1053d);
        } else {
            c1212w.g(this.f1060p);
        }
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof C0119k)) {
            C0119k c0119k = (C0119k) obj;
            if (Intrinsics.c(this.f1055f, c0119k.f1055f) && Intrinsics.c(this.f1051b, c0119k.f1051b) && Intrinsics.c(this.f1057i, c0119k.f1057i) && Intrinsics.c(this.f1058j.f5524b, c0119k.f1058j.f5524b)) {
                Bundle bundle = this.f1052c;
                Bundle bundle2 = c0119k.f1052c;
                if (Intrinsics.c(bundle, bundle2)) {
                    return true;
                }
                if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                    if (setKeySet.isEmpty()) {
                        return true;
                    }
                    for (String str : setKeySet) {
                        if (!Intrinsics.c(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final z0.b getDefaultViewModelCreationExtras() {
        z0.d dVar = new z0.d(0);
        Context context = this.f1050a;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            dVar.b(androidx.lifecycle.e0.f17448h, application);
        }
        dVar.b(androidx.lifecycle.V.f17413a, this);
        dVar.b(androidx.lifecycle.V.f17414b, this);
        Bundle bundleA = a();
        if (bundleA != null) {
            dVar.b(androidx.lifecycle.V.f17415c, bundleA);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return this.t;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final AbstractC1205o getLifecycle() {
        return this.f1057i;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final L0.d getSavedStateRegistry() {
        return this.f1058j.f5524b;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final androidx.lifecycle.i0 getViewModelStore() {
        if (!this.f1059o) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f1057i.f17478d == EnumC1204n.f17460a) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        NavViewModelStoreProvider navViewModelStoreProvider = this.f1054e;
        if (navViewModelStoreProvider != null) {
            return navViewModelStoreProvider.getViewModelStore(this.f1055f);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f1051b.hashCode() + (this.f1055f.hashCode() * 31);
        Bundle bundle = this.f1052c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i7 = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i7 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.f1058j.f5524b.hashCode() + ((this.f1057i.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C0119k.class.getSimpleName());
        sb2.append("(" + this.f1055f + ')');
        sb2.append(" destination=");
        sb2.append(this.f1051b);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
