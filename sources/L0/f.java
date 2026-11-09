package L0;

import C0.C0120l;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1204n;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry$SavedStateProvider;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f5522d = new e(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavedStateRegistryOwner f5523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f5524b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5525c;

    public f(SavedStateRegistryOwner savedStateRegistryOwner) {
        this.f5523a = savedStateRegistryOwner;
    }

    public final void a() {
        SavedStateRegistryOwner savedStateRegistryOwner = this.f5523a;
        AbstractC1205o lifecycle = savedStateRegistryOwner.getLifecycle();
        if (((C1212w) lifecycle).f17478d != EnumC1204n.f17461b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new Recreator(savedStateRegistryOwner));
        d dVar = this.f5524b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (dVar.f5517b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new C0120l(dVar, 2));
        dVar.f5517b = true;
        this.f5525c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f5525c) {
            a();
        }
        C1212w c1212w = (C1212w) this.f5523a.getLifecycle();
        if (c1212w.f17478d.a(EnumC1204n.f17463d)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c1212w.f17478d).toString());
        }
        d dVar = this.f5524b;
        if (!dVar.f5517b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (dVar.f5519d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        dVar.f5518c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        dVar.f5519d = true;
    }

    public final void c(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        d dVar = this.f5524b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = dVar.f5518c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        A.f fVar = dVar.f5516a;
        fVar.getClass();
        A.d dVar2 = new A.d(fVar);
        fVar.f16c.put(dVar2, Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(dVar2, "this.components.iteratorWithAdditions()");
        while (dVar2.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar2.next();
            bundle.putBundle((String) entry.getKey(), ((SavedStateRegistry$SavedStateProvider) entry.getValue()).saveState());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }
}
