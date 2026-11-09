package M7;

import O7.C0490h;
import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenStackHeaderConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f5784a;

    public final void a(ScreenStackHeaderConfig config, Screen screen) {
        Intrinsics.checkNotNullParameter(config, "config");
        int height = config.isHeaderHidden ? 0 : config.getToolbar().getHeight();
        Integer num = this.f5784a;
        if (num != null && height == num.intValue()) {
            return;
        }
        this.f5784a = Integer.valueOf(height);
        if (screen != null) {
            Context context = screen.getContext();
            Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            ReactContext reactContext = (ReactContext) context;
            int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, screen.getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(new C0490h(surfaceId, screen.getId(), PixelUtil.toDIPFromPixel(height)));
            }
        }
    }
}
