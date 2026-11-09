package androidx.lifecycle;

import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.v0;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry$SavedStateProvider;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C1858h;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f17413a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0 f17414b = new c0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f17415c = new c0();

    public static final void a(a0 viewModel, L0.d registry, AbstractC1205o lifecycle) {
        Object obj;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        HashMap map = viewModel.f17429a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = viewModel.f17429a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.f17403c) {
            return;
        }
        savedStateHandleController.a(registry, lifecycle);
        k(registry, lifecycle);
    }

    public static final SavedStateHandleController b(L0.d registry, AbstractC1205o lifecycle, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, T.f17405f.createHandle(registry.a(str), bundle));
        savedStateHandleController.a(registry, lifecycle);
        k(registry, lifecycle);
        return savedStateHandleController;
    }

    public static final T c(z0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) bVar.a(f17413a);
        if (savedStateRegistryOwner == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) bVar.a(f17414b);
        if (viewModelStoreOwner == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) bVar.a(f17415c);
        String key = (String) bVar.a(g0.f17456d);
        if (key == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        SavedStateRegistry$SavedStateProvider savedStateRegistry$SavedStateProviderB = savedStateRegistryOwner.getSavedStateRegistry().b();
        W w3 = savedStateRegistry$SavedStateProviderB instanceof W ? (W) savedStateRegistry$SavedStateProviderB : null;
        if (w3 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        X xG = g(viewModelStoreOwner);
        T t = (T) xG.f17421d.get(key);
        if (t != null) {
            return t;
        }
        S s3 = T.f17405f;
        Intrinsics.checkNotNullParameter(key, "key");
        w3.a();
        Bundle bundle2 = w3.f17419c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(key) : null;
        Bundle bundle4 = w3.f17419c;
        if (bundle4 != null) {
            bundle4.remove(key);
        }
        Bundle bundle5 = w3.f17419c;
        if (bundle5 != null && bundle5.isEmpty()) {
            w3.f17419c = null;
        }
        T tCreateHandle = s3.createHandle(bundle3, bundle);
        xG.f17421d.put(key, tCreateHandle);
        return tCreateHandle;
    }

    public static final void d(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        EnumC1204n enumC1204n = ((C1212w) savedStateRegistryOwner.getLifecycle()).f17478d;
        if (enumC1204n != EnumC1204n.f17461b && enumC1204n != EnumC1204n.f17462c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (savedStateRegistryOwner.getSavedStateRegistry().b() == null) {
            W w3 = new W(savedStateRegistryOwner.getSavedStateRegistry(), (ViewModelStoreOwner) savedStateRegistryOwner);
            savedStateRegistryOwner.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", w3);
            savedStateRegistryOwner.getLifecycle().a(new SavedStateHandleAttacher(w3));
        }
    }

    public static final LifecycleCoroutineScopeImpl e(AbstractC1205o abstractC1205o) {
        Intrinsics.checkNotNullParameter(abstractC1205o, "<this>");
        while (true) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) abstractC1205o.f17466a.get();
            if (lifecycleCoroutineScopeImpl != null) {
                return lifecycleCoroutineScopeImpl;
            }
            v0 v0VarC = AbstractC0780y.c();
            p042cg.f fVar = Wf.I.f10809a;
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = new LifecycleCoroutineScopeImpl(abstractC1205o, kotlin.coroutines.e.c(v0VarC, ((Xf.d) p015ag.o.f11960a).f11224e));
            AtomicReference atomicReference = abstractC1205o.f17466a;
            do {
                if (atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl2)) {
                    p042cg.f fVar2 = Wf.I.f10809a;
                    AbstractC0780y.m(lifecycleCoroutineScopeImpl2, ((Xf.d) p015ag.o.f11960a).f11224e, null, new r(lifecycleCoroutineScopeImpl2, null), 2);
                    return lifecycleCoroutineScopeImpl2;
                }
            } while (atomicReference.get() == null);
        }
    }

    public static final LifecycleCoroutineScopeImpl f(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<this>");
        return e(lifecycleOwner.getLifecycle());
    }

    public static final X g(ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "<this>");
        ArrayList arrayList = new ArrayList();
        U initializer = U.f17412a;
        C1858h clazz = kotlin.jvm.internal.G.a(X.class);
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        arrayList.add(new z0.f(p002a.a.m(clazz), initializer));
        z0.f[] fVarArr = (z0.f[]) arrayList.toArray(new z0.f[0]);
        return (X) new androidx.camera.video.internal.c(viewModelStoreOwner, new z0.c((z0.f[]) Arrays.copyOf(fVarArr, fVarArr.length))).i(X.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final CoroutineScope h(a0 a0Var) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        HashMap map = a0Var.f17429a;
        if (map == null) {
            obj2 = null;
        } else {
            synchronized (map) {
                obj = a0Var.f17429a.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
            }
            obj2 = obj;
        }
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        v0 v0VarC = AbstractC0780y.c();
        p042cg.f fVar = Wf.I.f10809a;
        Object objC = a0Var.c(new C1197g(kotlin.coroutines.e.c(v0VarC, ((Xf.d) p015ag.o.f11960a).f11224e)), "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        Intrinsics.checkNotNullExpressionValue(objC, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (CoroutineScope) objC;
    }

    public static final Object i(AbstractC1205o abstractC1205o, EnumC1204n enumC1204n, Function2 function2, Ff.h hVar) throws Throwable {
        if (enumC1204n == EnumC1204n.f17461b) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (((C1212w) abstractC1205o).f17478d == EnumC1204n.f17460a) {
            return Unit.f38893a;
        }
        Object objD = AbstractC0777v.d(new Q(abstractC1205o, enumC1204n, function2, null), hVar);
        return objD == Ef.a.f2423a ? objD : Unit.f38893a;
    }

    public static final Object j(LifecycleOwner lifecycleOwner, EnumC1204n enumC1204n, Function2 function2, Ff.h hVar) throws Throwable {
        Object objI = i(lifecycleOwner.getLifecycle(), enumC1204n, function2, hVar);
        return objI == Ef.a.f2423a ? objI : Unit.f38893a;
    }

    public static void k(final L0.d dVar, final AbstractC1205o abstractC1205o) {
        EnumC1204n enumC1204n = ((C1212w) abstractC1205o).f17478d;
        if (enumC1204n == EnumC1204n.f17461b || enumC1204n.a(EnumC1204n.f17463d)) {
            dVar.d();
        } else {
            abstractC1205o.a(new LifecycleEventObserver() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner source, EnumC1203m event) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (event == EnumC1203m.ON_START) {
                        abstractC1205o.b(this);
                        dVar.d();
                    }
                }
            });
        }
    }
}
