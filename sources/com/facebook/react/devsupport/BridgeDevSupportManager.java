package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.SurfaceDelegateFactory;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import com.facebook.react.devsupport.interfaces.PausedInDebuggerOverlayManager;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.packagerconnection.RequestHandler;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u0014\u0010\u001b\u001a\u00020\u00078TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/facebook/react/devsupport/BridgeDevSupportManager;", "Lcom/facebook/react/devsupport/DevSupportManagerBase;", "applicationContext", "Landroid/content/Context;", "reactInstanceManagerHelper", "Lcom/facebook/react/devsupport/ReactInstanceDevHelper;", "packagerPathForJSBundleName", "", "enableOnCreate", "", "redBoxHandler", "Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;", "devBundleDownloadListener", "Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;", "minNumShakes", "", "customPackagerCommandHandlers", "", "Lcom/facebook/react/packagerconnection/RequestHandler;", "surfaceDelegateFactory", "Lcom/facebook/react/common/SurfaceDelegateFactory;", "devLoadingViewManager", "Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;", "pausedInDebuggerOverlayManager", "Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;", "<init>", "(Landroid/content/Context;Lcom/facebook/react/devsupport/ReactInstanceDevHelper;Ljava/lang/String;ZLcom/facebook/react/devsupport/interfaces/RedBoxHandler;Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;ILjava/util/Map;Lcom/facebook/react/common/SurfaceDelegateFactory;Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;)V", "uniqueTag", "getUniqueTag", "()Ljava/lang/String;", "handleReloadJS", "", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BridgeDevSupportManager extends DevSupportManagerBase {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/devsupport/BridgeDevSupportManager$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("BridgeDevSupportManager", LegacyArchitectureLogLevel.ERROR);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BridgeDevSupportManager(@NotNull Context applicationContext, @NotNull ReactInstanceDevHelper reactInstanceManagerHelper, @Nullable String str, boolean z3, @Nullable RedBoxHandler redBoxHandler, @Nullable DevBundleDownloadListener devBundleDownloadListener, int i7, @Nullable Map<String, ? extends RequestHandler> map, @Nullable SurfaceDelegateFactory surfaceDelegateFactory, @Nullable DevLoadingViewManager devLoadingViewManager, @Nullable PausedInDebuggerOverlayManager pausedInDebuggerOverlayManager) {
        super(applicationContext, reactInstanceManagerHelper, str, z3, redBoxHandler, devBundleDownloadListener, i7, map, surfaceDelegateFactory, devLoadingViewManager, pausedInDebuggerOverlayManager);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(reactInstanceManagerHelper, "reactInstanceManagerHelper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleReloadJS$lambda$1(BridgeDevSupportManager bridgeDevSupportManager) {
        UiThreadUtil.runOnUiThread(new a(bridgeDevSupportManager, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleReloadJS$lambda$1$lambda$0(BridgeDevSupportManager bridgeDevSupportManager) {
        bridgeDevSupportManager.getReactInstanceDevHelper().onJSBundleLoadedFromServer();
    }

    @Override // com.facebook.react.devsupport.DevSupportManagerBase
    @NotNull
    public String getUniqueTag() {
        return "Bridge";
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void handleReloadJS() {
        UiThreadUtil.assertOnUiThread();
        ReactMarker.logMarker(ReactMarkerConstants.RELOAD, getDevSettings().getPackagerConnectionSettings().getDebugServerHost());
        hideRedboxDialog();
        p375z2.a tag = A2.a.f31a;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter("RNCore: load from Server", "message");
        DevServerHelper devServerHelper = getDevServerHelper();
        String jSAppBundleName = getJsAppBundleName();
        p059e1.a.f(jSAppBundleName);
        Intrinsics.checkNotNullExpressionValue(jSAppBundleName, "assertNotNull(...)");
        reloadJSFromServer(devServerHelper.getDevServerBundleURL(jSAppBundleName), new j(this));
    }
}
