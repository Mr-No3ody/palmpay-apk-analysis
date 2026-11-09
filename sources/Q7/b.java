package Q7;

import C0.G;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReactContext f7629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EventDispatcher f7631c;

    static {
        new a(null);
    }

    public b(ReactContext reactContext, int i7) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f7629a = reactContext;
        this.f7630b = i7;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, i7);
        if (eventDispatcherForReactTag == null) {
            throw new IllegalStateException(G.m(i7, "[RNScreens] Nullish event dispatcher for view with tag: ").toString());
        }
        this.f7631c = eventDispatcherForReactTag;
    }
}
