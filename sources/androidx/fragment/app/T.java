package androidx.fragment.app;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class T implements SpecialEffectsControllerFactory {
    @Override // androidx.fragment.app.SpecialEffectsControllerFactory
    public final D0 createController(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new C1176k(container);
    }
}
