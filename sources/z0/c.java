package z0;

import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.a0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ViewModelProvider$Factory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f[] f44409b;

    public c(f... initializers) {
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        this.f44409b = initializers;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.o] */
    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final a0 create(Class modelClass, b extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        a0 a0Var = null;
        for (f fVar : this.f44409b) {
            if (fVar.f44410a.equals(modelClass)) {
                Object objInvoke = fVar.f44411b.invoke(extras);
                a0Var = objInvoke instanceof a0 ? (a0) objInvoke : null;
            }
        }
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(modelClass.getName()));
    }
}
