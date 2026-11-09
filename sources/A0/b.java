package A0;

import C0.C0131x;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.a0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ViewModelProvider$Factory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18b;

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final a0 create(Class modelClass) {
        switch (this.f18b) {
            case 0:
                return new c();
            default:
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                return new C0131x();
        }
    }
}
