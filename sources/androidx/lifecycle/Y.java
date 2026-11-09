package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends h0 implements ViewModelProvider$Factory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f17422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f17423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f17424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC1205o f17425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L0.d f17426f;

    public Y(Application application, SavedStateRegistryOwner owner, Bundle bundle) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f17426f = owner.getSavedStateRegistry();
        this.f17425e = owner.getLifecycle();
        this.f17424d = bundle;
        this.f17422b = application;
        this.f17423c = application != null ? e0.f17446f.getInstance(application) : new e0(null);
    }

    @Override // androidx.lifecycle.h0
    public final void a(a0 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        AbstractC1205o abstractC1205o = this.f17425e;
        if (abstractC1205o != null) {
            L0.d dVar = this.f17426f;
            Intrinsics.e(dVar);
            V.a(viewModel, dVar, abstractC1205o);
        }
    }

    public final a0 b(Class modelClass, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        AbstractC1205o abstractC1205o = this.f17425e;
        if (abstractC1205o == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC1193c.class.isAssignableFrom(modelClass);
        Application application = this.f17422b;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? Z.a(Z.f17428b, modelClass) : Z.a(Z.f17427a, modelClass);
        if (constructorA == null) {
            return application != null ? this.f17423c.create(modelClass) : g0.f17454b.getInstance().create(modelClass);
        }
        L0.d dVar = this.f17426f;
        Intrinsics.e(dVar);
        SavedStateHandleController savedStateHandleControllerB = V.b(dVar, abstractC1205o, key, this.f17424d);
        T t = savedStateHandleControllerB.f17402b;
        a0 a0VarB = (!zIsAssignableFrom || application == null) ? Z.b(modelClass, constructorA, t) : Z.b(modelClass, constructorA, application, t);
        a0VarB.c(savedStateHandleControllerB, "androidx.lifecycle.savedstate.vm.tag");
        return a0VarB;
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final a0 create(Class modelClass, z0.b extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(g0.f17456d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(V.f17413a) == null || extras.a(V.f17414b) == null) {
            if (this.f17425e != null) {
                return b(modelClass, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(e0.f17448h);
        boolean zIsAssignableFrom = AbstractC1193c.class.isAssignableFrom(modelClass);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? Z.a(Z.f17428b, modelClass) : Z.a(Z.f17427a, modelClass);
        if (constructorA == null) {
            return this.f17423c.create(modelClass, extras);
        }
        return (!zIsAssignableFrom || application == null) ? Z.b(modelClass, constructorA, V.c(extras)) : Z.b(modelClass, constructorA, application, V.c(extras));
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final a0 create(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return b(modelClass, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
