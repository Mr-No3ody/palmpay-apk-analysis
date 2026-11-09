package p179m1;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final void a(LottieAnimationView view, boolean z3) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, view.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new k(themedReactContext.getSurfaceId(), view.getId(), z3));
        }
    }
}
