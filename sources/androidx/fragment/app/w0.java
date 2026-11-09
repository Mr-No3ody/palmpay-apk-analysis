package androidx.fragment.app;

import android.view.ViewGroup;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {
    public /* synthetic */ w0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public final D0 getOrCreateController(@NotNull ViewGroup container, @NotNull Z fragmentManager) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        SpecialEffectsControllerFactory specialEffectsControllerFactoryK = fragmentManager.K();
        Intrinsics.checkNotNullExpressionValue(specialEffectsControllerFactoryK, "fragmentManager.specialEffectsControllerFactory");
        return getOrCreateController(container, specialEffectsControllerFactoryK);
    }

    private w0() {
    }

    @JvmStatic
    @NotNull
    public final D0 getOrCreateController(@NotNull ViewGroup container, @NotNull SpecialEffectsControllerFactory factory) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object tag = container.getTag(p260r0.b.special_effects_controller_view_tag);
        if (tag instanceof D0) {
            return (D0) tag;
        }
        D0 d0CreateController = factory.createController(container);
        Intrinsics.checkNotNullExpressionValue(d0CreateController, "factory.createController(container)");
        container.setTag(p260r0.b.special_effects_controller_view_tag, d0CreateController);
        return d0CreateController;
    }
}
