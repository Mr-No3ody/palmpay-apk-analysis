package p140j8;

import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.th3rdwave.safeareacontext.SafeAreaProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e extends m implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f38342a = new e(3, f.class, "handleOnInsetsChange", "handleOnInsetsChange(Lcom/th3rdwave/safeareacontext/SafeAreaProvider;Lcom/th3rdwave/safeareacontext/EdgeInsets;Lcom/th3rdwave/safeareacontext/Rect;)V", 1);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SafeAreaProvider p3 = (SafeAreaProvider) obj;
        a p10 = (a) obj2;
        d p11 = (d) obj3;
        Intrinsics.checkNotNullParameter(p3, "p0");
        Intrinsics.checkNotNullParameter(p10, "p1");
        Intrinsics.checkNotNullParameter(p11, "p2");
        Context context = p3.getContext();
        Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext context2 = (ReactContext) context;
        int id2 = p3.getId();
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(context2, id2);
        if (eventDispatcherForReactTag != null) {
            Intrinsics.checkNotNullParameter(context2, "context");
            eventDispatcherForReactTag.dispatchEvent(new c(UIManagerHelper.getSurfaceId(context2), id2, p10, p11));
        }
        return Unit.f38893a;
    }
}
