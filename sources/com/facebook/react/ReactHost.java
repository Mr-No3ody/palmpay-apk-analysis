package com.facebook.react;

import Wd.G;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.interfaces.TaskInterface;
import com.facebook.react.interfaces.fabric.ReactSurface;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0016\u001a\u00020\u0017H&J\u001c\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH&J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\u0012\u0010\u001e\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\u0012\u0010\u001f\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\b\u0010\u001f\u001a\u00020\u0019H&J\b\u0010 \u001a\u00020\u0019H&J\u0012\u0010 \u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\"\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H&J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H&J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010-\u001a\u00020&H&J&\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010-\u001a\u00020&2\u000e\u0010/\u001a\n\u0018\u000100j\u0004\u0018\u0001`1H&JK\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010-\u001a\u00020&2\u000e\u0010/\u001a\n\u0018\u000100j\u0004\u0018\u0001`12#\b\u0002\u00102\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u001903H&J\b\u00107\u001a\u00020\u0019H&J*\u00108\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\b\u0010<\u001a\u0004\u0018\u00010=H&J\u0010\u0010>\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\u0017H&J\u0010\u0010@\u001a\u00020\u00192\u0006\u0010A\u001a\u00020=H&J\u0010\u0010B\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H&J\u0016\u0010C\u001a\u00020\u00192\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00190EH&J\u0016\u0010F\u001a\u00020\u00192\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00190EH&J\u0010\u0010G\u001a\u00020\u00192\u0006\u0010H\u001a\u00020IH&J\u0010\u0010J\u001a\u00020\u00192\u0006\u0010H\u001a\u00020IH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006KÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/ReactHost;", "", "lifecycleState", "Lcom/facebook/react/common/LifecycleState;", "getLifecycleState", "()Lcom/facebook/react/common/LifecycleState;", "currentReactContext", "Lcom/facebook/react/bridge/ReactContext;", "getCurrentReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "devSupportManager", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "getDevSupportManager", "()Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "reactQueueConfiguration", "Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "getReactQueueConfiguration", "()Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "memoryPressureRouter", "Lcom/facebook/react/MemoryPressureRouter;", "getMemoryPressureRouter", "()Lcom/facebook/react/MemoryPressureRouter;", "onBackPressed", "", "onHostResume", "", "activity", "Landroid/app/Activity;", "defaultBackButtonImpl", "Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;", "onHostLeaveHint", "onHostPause", "onHostDestroy", "createSurface", "Lcom/facebook/react/interfaces/fabric/ReactSurface;", "context", "Landroid/content/Context;", "moduleName", "", "initialProps", "Landroid/os/Bundle;", ViewProps.START, "Lcom/facebook/react/interfaces/TaskInterface;", "Ljava/lang/Void;", "reload", "reason", "destroy", "ex", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onDestroyFinished", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "instanceDestroyedSuccessfully", "invalidate", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onWindowFocusChange", "hasFocus", "onNewIntent", "intent", "onConfigurationChanged", "addBeforeDestroyListener", "onBeforeDestroy", "Lkotlin/Function0;", "removeBeforeDestroyListener", "addReactInstanceEventListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/facebook/react/ReactInstanceEventListener;", "removeReactInstanceEventListener", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ReactHost {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ TaskInterface destroy$default(ReactHost reactHost, String str, Exception exc, Function1 function1, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destroy");
        }
        if ((i7 & 4) != 0) {
            function1 = new G(24);
        }
        return reactHost.destroy(str, exc, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static Unit destroy$lambda$0(boolean z3) {
        return Unit.f38893a;
    }

    void addBeforeDestroyListener(@NotNull Function0<Unit> onBeforeDestroy);

    void addReactInstanceEventListener(@NotNull ReactInstanceEventListener listener);

    @NotNull
    ReactSurface createSurface(@NotNull Context context, @NotNull String moduleName, @Nullable Bundle initialProps);

    @NotNull
    TaskInterface<Void> destroy(@NotNull String reason, @Nullable Exception ex);

    @NotNull
    TaskInterface<Void> destroy(@NotNull String reason, @Nullable Exception ex, @NotNull Function1<? super Boolean, Unit> onDestroyFinished);

    @Nullable
    ReactContext getCurrentReactContext();

    @Nullable
    DevSupportManager getDevSupportManager();

    @NotNull
    LifecycleState getLifecycleState();

    @NotNull
    MemoryPressureRouter getMemoryPressureRouter();

    @Nullable
    ReactQueueConfiguration getReactQueueConfiguration();

    void invalidate();

    void onActivityResult(@NotNull Activity activity, int requestCode, int resultCode, @Nullable Intent data);

    boolean onBackPressed();

    void onConfigurationChanged(@NotNull Context context);

    void onHostDestroy();

    void onHostDestroy(@Nullable Activity activity);

    void onHostLeaveHint(@Nullable Activity activity);

    void onHostPause();

    void onHostPause(@Nullable Activity activity);

    void onHostResume(@Nullable Activity activity);

    void onHostResume(@Nullable Activity activity, @Nullable DefaultHardwareBackBtnHandler defaultBackButtonImpl);

    void onNewIntent(@NotNull Intent intent);

    void onWindowFocusChange(boolean hasFocus);

    @NotNull
    TaskInterface<Void> reload(@NotNull String reason);

    void removeBeforeDestroyListener(@NotNull Function0<Unit> onBeforeDestroy);

    void removeReactInstanceEventListener(@NotNull ReactInstanceEventListener listener);

    @NotNull
    TaskInterface<Void> start();
}
