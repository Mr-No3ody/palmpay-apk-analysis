package com.facebook.react.bridge;

import G0.g;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStripAny;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DoNotStripAny
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00142\u00060\u0001j\u0002`\u0002:\u0002\u0013\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0082 J\t\u0010\u000e\u001a\u00020\u000fH\u0086 J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0001R\u0014\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "delegate", "Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget$TargetDelegate;", "<init>", "(Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget$TargetDelegate;)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "getMHybridData$annotations", "()V", "initHybrid", "executor", "Ljava/util/concurrent/Executor;", "sendDebuggerResumeCommand", "", "close", "isValid", "", "TargetDelegate", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactInstanceManagerInspectorTarget implements AutoCloseable {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final HybridData mHybridData;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @DoNotStripAny
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004H&J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/bridge/ReactInstanceManagerInspectorTarget$TargetDelegate;", "", "getMetadata", "", "", "onReload", "", "onSetPausedInDebuggerMessage", "message", "loadNetworkResource", "url", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface TargetDelegate {
        @NotNull
        Map<String, String> getMetadata();

        void loadNetworkResource(@NotNull String url, @NotNull InspectorNetworkRequestListener listener);

        void onReload();

        void onSetPausedInDebuggerMessage(@Nullable String message);
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("ReactInstanceManagerInspectorTarget", LegacyArchitectureLogLevel.WARNING);
        BridgeSoLoader.staticInit();
    }

    public ReactInstanceManagerInspectorTarget(@NotNull TargetDelegate delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.mHybridData = initHybrid(new g(1), delegate);
    }

    private static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(Executor executor, TargetDelegate delegate);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mHybridData$lambda$0(Runnable runnable) {
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            Intrinsics.e(runnable);
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.mHybridData.resetNative();
    }

    @JvmName(name = "isValid")
    public final boolean isValid() {
        return this.mHybridData.isValid();
    }

    public final native void sendDebuggerResumeCommand();
}
