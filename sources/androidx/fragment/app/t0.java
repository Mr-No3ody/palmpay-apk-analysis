package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryOwner;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ViewModelStoreOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fragment f17208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.i0 f17209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RunnableC1182q f17210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewModelProvider$Factory f17211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1212w f17212e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public L0.f f17213f = null;

    public t0(Fragment fragment, androidx.lifecycle.i0 i0Var, RunnableC1182q runnableC1182q) {
        this.f17208a = fragment;
        this.f17209b = i0Var;
        this.f17210c = runnableC1182q;
    }

    public final void a(EnumC1203m enumC1203m) {
        this.f17212e.e(enumC1203m);
    }

    public final void b() {
        if (this.f17212e == null) {
            this.f17212e = new C1212w(this);
            L0.f fVarCreate = L0.f.f5522d.create(this);
            this.f17213f = fVarCreate;
            fVarCreate.a();
            this.f17210c.run();
        }
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final z0.b getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.f17208a;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        z0.d dVar = new z0.d(0);
        if (application != null) {
            dVar.b(androidx.lifecycle.e0.f17448h, application);
        }
        dVar.b(androidx.lifecycle.V.f17413a, fragment);
        dVar.b(androidx.lifecycle.V.f17414b, this);
        if (fragment.getArguments() != null) {
            dVar.b(androidx.lifecycle.V.f17415c, fragment.getArguments());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.f17208a;
        ViewModelProvider$Factory defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.f17211d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f17211d == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f17211d = new androidx.lifecycle.Y(application, fragment, fragment.getArguments());
        }
        return this.f17211d;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final AbstractC1205o getLifecycle() {
        b();
        return this.f17212e;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final L0.d getSavedStateRegistry() {
        b();
        return this.f17213f.f5524b;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final androidx.lifecycle.i0 getViewModelStore() {
        b();
        return this.f17209b;
    }
}
