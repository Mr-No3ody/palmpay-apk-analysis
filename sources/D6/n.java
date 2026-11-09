package D6;

import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.a0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements ViewModelProvider$Factory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1685b;

    public n(int i7) {
        this.f1685b = i7;
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final a0 create(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(m.class)) {
            return new m(this.f1685b);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
