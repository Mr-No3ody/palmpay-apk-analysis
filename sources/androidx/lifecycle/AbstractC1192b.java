package androidx.lifecycle;

import C0.C0117i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1192b extends h0 implements ViewModelProvider$Factory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public L0.d f17432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC1205o f17433c;

    static {
        new C1191a(null);
    }

    @Override // androidx.lifecycle.h0
    public final void a(a0 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        L0.d dVar = this.f17432b;
        if (dVar != null) {
            AbstractC1205o abstractC1205o = this.f17433c;
            Intrinsics.e(abstractC1205o);
            V.a(viewModel, dVar, abstractC1205o);
        }
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final a0 create(Class modelClass, z0.b extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String key = (String) extras.a(g0.f17456d);
        if (key == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        L0.d dVar = this.f17432b;
        if (dVar == null) {
            T handle = V.c(extras);
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(handle, "handle");
            return new C0117i(handle);
        }
        Intrinsics.e(dVar);
        AbstractC1205o abstractC1205o = this.f17433c;
        Intrinsics.e(abstractC1205o);
        SavedStateHandleController savedStateHandleControllerB = V.b(dVar, abstractC1205o, key, null);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        T handle2 = savedStateHandleControllerB.f17402b;
        Intrinsics.checkNotNullParameter(handle2, "handle");
        C0117i c0117i = new C0117i(handle2);
        c0117i.c(savedStateHandleControllerB, "androidx.lifecycle.savedstate.vm.tag");
        return c0117i;
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final a0 create(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String key = modelClass.getCanonicalName();
        if (key != null) {
            if (this.f17433c != null) {
                L0.d dVar = this.f17432b;
                Intrinsics.e(dVar);
                AbstractC1205o abstractC1205o = this.f17433c;
                Intrinsics.e(abstractC1205o);
                SavedStateHandleController savedStateHandleControllerB = V.b(dVar, abstractC1205o, key, null);
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                T handle = savedStateHandleControllerB.f17402b;
                Intrinsics.checkNotNullParameter(handle, "handle");
                C0117i c0117i = new C0117i(handle);
                c0117i.c(savedStateHandleControllerB, "androidx.lifecycle.savedstate.vm.tag");
                return c0117i;
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
