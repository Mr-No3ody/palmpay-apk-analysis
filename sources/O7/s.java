package O7;

import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Screen f6673a;

    public s(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f6673a = screen;
    }

    public final void a(float f10, boolean z3, boolean z8) {
        float fB = kotlin.ranges.b.b(f10, 0.0f, 1.0f);
        short coalescingKey = ScreenFragment.f25321i.getCoalescingKey(fB);
        Screen screen = this.f6673a;
        EventDispatcher reactEventDispatcher = screen.getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.dispatchEvent(new u(UIManagerHelper.getSurfaceId(screen), screen.getId(), fB, z3, z8, coalescingKey));
        }
    }
}
