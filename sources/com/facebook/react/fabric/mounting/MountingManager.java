package com.facebook.react.fabric.mounting;

import H3.j;
import android.view.View;
import androidx.annotation.AnyThread;
import androidx.annotation.UiThread;
import androidx.camera.camera2.internal.F;
import com.airbnb.lottie.model.layer.d;
import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229p2.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 c2\u00020\u0001:\u0002dcB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020 2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b#\u0010\"J\u0017\u0010$\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b$\u0010\u001bJ\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b%\u0010\u001bJ\u0015\u0010&\u001a\u00020 2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b&\u0010\"J/\u0010*\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b*\u0010+J/\u0010*\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u001c2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010,J%\u0010.\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b¢\u0006\u0004\b.\u0010/J!\u00102\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u000100H\u0007¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0015H\u0007¢\u0006\u0004\b4\u00105J!\u00107\u001a\u0004\u0018\u0001062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b7\u00108Jo\u0010F\u001a\u00020E2\b\u0010\u001d\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010\u001c2\b\u0010;\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u0001002\b\u0010<\u001a\u0004\u0018\u0001002\u0006\u0010>\u001a\u00020=2\b\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010A\u001a\u00020=2\b\u0010B\u001a\u0004\u0018\u00010?2\b\u0010D\u001a\u0004\u0018\u00010CH\u0007¢\u0006\u0004\bF\u0010GJ=\u0010J\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010I\u001a\u0004\u0018\u00010HH\u0007¢\u0006\u0004\bJ\u0010KJA\u0010P\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010L\u001a\u0004\u0018\u00010\u001c2\u0006\u0010M\u001a\u00020 2\b\u0010I\u001a\u0004\u0018\u00010N2\u0006\u0010O\u001a\u00020\b¢\u0006\u0004\bP\u0010QR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010RR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010SR \u0010U\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\b0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010Z\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\\\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010[R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010b¨\u0006e"}, d2 = {"Lcom/facebook/react/fabric/mounting/MountingManager;", "", "Lcom/facebook/react/uimanager/ViewManagerRegistry;", "viewManagerRegistry", "Lcom/facebook/react/fabric/mounting/MountingManager$MountItemExecutor;", "mountItemExecutor", "<init>", "(Lcom/facebook/react/uimanager/ViewManagerRegistry;Lcom/facebook/react/fabric/mounting/MountingManager$MountItemExecutor;)V", "", "surfaceId", "reactTag", "Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;", "getSurfaceMountingManager", "(II)Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "Landroid/view/View;", "rootView", "startSurface", "(ILcom/facebook/react/uimanager/ThemedReactContext;Landroid/view/View;)Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;", "themedReactContext", "", "attachRootView", "(ILandroid/view/View;Lcom/facebook/react/uimanager/ThemedReactContext;)V", "stopSurface", "(I)V", "getSurfaceManager", "(I)Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;", "", "context", "getSurfaceManagerEnforced", "(ILjava/lang/String;)Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;", "", "surfaceIsStopped", "(I)Z", "isWaitingForViewAttach", "getSurfaceManagerForView", "getSurfaceManagerForViewEnforced", "getViewExists", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "commandArgs", "receiveCommand", "(IIILcom/facebook/react/bridge/ReadableArray;)V", "(IILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "eventType", "sendAccessibilityEvent", "(III)V", "Lcom/facebook/react/bridge/ReadableMap;", "props", "updateProps", "(ILcom/facebook/react/bridge/ReadableMap;)V", "clearJSResponder", "()V", "Lcom/facebook/react/fabric/events/EventEmitterWrapper;", "getEventEmitter", "(II)Lcom/facebook/react/fabric/events/EventEmitterWrapper;", "Lcom/facebook/react/bridge/ReactContext;", "componentName", "localData", RemoteConfigConstants.ResponseFieldKey.STATE, "", "width", "LH3/j;", "widthMode", "height", "heightMode", "", "attachmentsPositions", "", "measure", "(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;FLH3/j;FLH3/j;[F)J", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "params", "experimental_prefetchResource", "(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;IILcom/facebook/react/common/mapbuffer/MapBuffer;)V", "eventName", "canCoalesceEvent", "Lcom/facebook/react/bridge/WritableMap;", "eventCategory", "enqueuePendingEvent", "(IILjava/lang/String;ZLcom/facebook/react/bridge/WritableMap;I)V", "Lcom/facebook/react/uimanager/ViewManagerRegistry;", "Lcom/facebook/react/fabric/mounting/MountingManager$MountItemExecutor;", "Ljava/util/concurrent/ConcurrentHashMap;", "surfaceIdToManager", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "stoppedSurfaceIds", "Ljava/util/concurrent/CopyOnWriteArrayList;", "mostRecentSurfaceMountingManager", "Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;", "lastQueriedSurfaceMountingManager", "Lcom/facebook/react/touch/JSResponderHandler;", "jsResponderHandler", "Lcom/facebook/react/touch/JSResponderHandler;", "Lcom/facebook/react/uimanager/RootViewManager;", "rootViewManager", "Lcom/facebook/react/uimanager/RootViewManager;", "Companion", "MountItemExecutor", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MountingManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int MAX_STOPPED_SURFACE_IDS_LENGTH = 15;

    @NotNull
    private static final String TAG;

    @NotNull
    private final JSResponderHandler jsResponderHandler;

    @Nullable
    private SurfaceMountingManager lastQueriedSurfaceMountingManager;

    @Nullable
    private SurfaceMountingManager mostRecentSurfaceMountingManager;

    @NotNull
    private final MountItemExecutor mountItemExecutor;

    @NotNull
    private final RootViewManager rootViewManager;

    @NotNull
    private final CopyOnWriteArrayList<Integer> stoppedSurfaceIds;

    @NotNull
    private final ConcurrentHashMap<Integer, SurfaceMountingManager> surfaceIdToManager;

    @NotNull
    private final ViewManagerRegistry viewManagerRegistry;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/react/fabric/mounting/MountingManager$Companion;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "MAX_STOPPED_SURFACE_IDS_LENGTH", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getTAG() {
            return MountingManager.TAG;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/facebook/react/fabric/mounting/MountingManager$MountItemExecutor;", "", "executeItems", "", "items", "Ljava/util/Queue;", "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface MountItemExecutor {
        @ThreadConfined("UI")
        @UiThread
        void executeItems(@Nullable Queue<MountItem> items);
    }

    static {
        Intrinsics.checkNotNullExpressionValue("MountingManager", "getSimpleName(...)");
        TAG = "MountingManager";
    }

    public MountingManager(@NotNull ViewManagerRegistry viewManagerRegistry, @NotNull MountItemExecutor mountItemExecutor) {
        Intrinsics.checkNotNullParameter(viewManagerRegistry, "viewManagerRegistry");
        Intrinsics.checkNotNullParameter(mountItemExecutor, "mountItemExecutor");
        this.viewManagerRegistry = viewManagerRegistry;
        this.mountItemExecutor = mountItemExecutor;
        this.surfaceIdToManager = new ConcurrentHashMap<>();
        this.stoppedSurfaceIds = new CopyOnWriteArrayList<>();
        this.jsResponderHandler = new JSResponderHandler();
        this.rootViewManager = new RootViewManager();
    }

    private final SurfaceMountingManager getSurfaceMountingManager(int surfaceId, int reactTag) {
        return surfaceId == -1 ? getSurfaceManagerForView(reactTag) : getSurfaceManager(surfaceId);
    }

    @AnyThread
    public final void attachRootView(int surfaceId, @Nullable View rootView, @Nullable ThemedReactContext themedReactContext) {
        SurfaceMountingManager surfaceManagerEnforced = getSurfaceManagerEnforced(surfaceId, "attachView");
        if (surfaceManagerEnforced.isStopped()) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Trying to attach a view to a stopped surface"));
        } else {
            surfaceManagerEnforced.attachRootView(rootView, themedReactContext);
        }
    }

    @UiThread
    public final void clearJSResponder() {
        this.jsResponderHandler.clearJSResponder();
    }

    public final void enqueuePendingEvent(int surfaceId, int reactTag, @Nullable String eventName, boolean canCoalesceEvent, @Nullable WritableMap params, int eventCategory) {
        SurfaceMountingManager surfaceMountingManager = getSurfaceMountingManager(surfaceId, reactTag);
        if (surfaceMountingManager == null) {
            a.d(TAG, "Cannot queue event without valid surface mounting manager for tag: %d, surfaceId: %d", Integer.valueOf(reactTag), Integer.valueOf(surfaceId));
        } else {
            surfaceMountingManager.enqueuePendingEvent(reactTag, eventName, canCoalesceEvent, params, eventCategory);
        }
    }

    @AnyThread
    @UnstableReactNativeAPI
    public final void experimental_prefetchResource(@Nullable ReactContext reactContext, @Nullable String componentName, int surfaceId, int reactTag, @Nullable MapBuffer params) {
        ViewManagerRegistry viewManagerRegistry = this.viewManagerRegistry;
        if (componentName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        viewManagerRegistry.get(componentName).experimental_prefetchResource(reactContext, surfaceId, reactTag, params);
    }

    @AnyThread
    @ThreadConfined("ANY")
    @Nullable
    public final EventEmitterWrapper getEventEmitter(int surfaceId, int reactTag) {
        SurfaceMountingManager surfaceMountingManager = getSurfaceMountingManager(surfaceId, reactTag);
        if (surfaceMountingManager != null) {
            return surfaceMountingManager.getEventEmitter(reactTag);
        }
        return null;
    }

    @Nullable
    public final SurfaceMountingManager getSurfaceManager(int surfaceId) {
        SurfaceMountingManager surfaceMountingManager = this.lastQueriedSurfaceMountingManager;
        if (surfaceMountingManager != null && surfaceMountingManager.getSurfaceId() == surfaceId) {
            return this.lastQueriedSurfaceMountingManager;
        }
        SurfaceMountingManager surfaceMountingManager2 = this.mostRecentSurfaceMountingManager;
        if (surfaceMountingManager2 != null && surfaceMountingManager2.getSurfaceId() == surfaceId) {
            return this.mostRecentSurfaceMountingManager;
        }
        SurfaceMountingManager surfaceMountingManager3 = this.surfaceIdToManager.get(Integer.valueOf(surfaceId));
        this.lastQueriedSurfaceMountingManager = surfaceMountingManager3;
        return surfaceMountingManager3;
    }

    @NotNull
    public final SurfaceMountingManager getSurfaceManagerEnforced(int surfaceId, @NotNull String context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SurfaceMountingManager surfaceManager = getSurfaceManager(surfaceId);
        if (surfaceManager != null) {
            return surfaceManager;
        }
        throw new RetryableMountingLayerException(d.j("Unable to find SurfaceMountingManager for surfaceId: [", surfaceId, "]. Context: ", context));
    }

    @Nullable
    public final SurfaceMountingManager getSurfaceManagerForView(int reactTag) {
        SurfaceMountingManager surfaceMountingManager = this.mostRecentSurfaceMountingManager;
        if (surfaceMountingManager != null && surfaceMountingManager.getViewExists(reactTag)) {
            return this.mostRecentSurfaceMountingManager;
        }
        Iterator<Map.Entry<Integer, SurfaceMountingManager>> it = this.surfaceIdToManager.entrySet().iterator();
        while (it.hasNext()) {
            SurfaceMountingManager value = it.next().getValue();
            if (value != this.mostRecentSurfaceMountingManager && value.getViewExists(reactTag)) {
                if (this.mostRecentSurfaceMountingManager == null) {
                    this.mostRecentSurfaceMountingManager = value;
                }
                return value;
            }
        }
        return null;
    }

    @AnyThread
    @NotNull
    public final SurfaceMountingManager getSurfaceManagerForViewEnforced(int reactTag) {
        SurfaceMountingManager surfaceManagerForView = getSurfaceManagerForView(reactTag);
        if (surfaceManagerForView != null) {
            return surfaceManagerForView;
        }
        throw new RetryableMountingLayerException(F.c(reactTag, "Unable to find SurfaceMountingManager for tag: [", "]"));
    }

    public final boolean getViewExists(int reactTag) {
        return getSurfaceManagerForView(reactTag) != null;
    }

    public final boolean isWaitingForViewAttach(int surfaceId) {
        SurfaceMountingManager surfaceManager = getSurfaceManager(surfaceId);
        if (surfaceManager == null || surfaceManager.isStopped()) {
            return false;
        }
        return !surfaceManager.isRootViewAttached();
    }

    @AnyThread
    public final long measure(@Nullable ReactContext context, @Nullable String componentName, @Nullable ReadableMap localData, @Nullable ReadableMap props, @Nullable ReadableMap state, float width, @Nullable j widthMode, float height, @Nullable j heightMode, @Nullable float[] attachmentsPositions) {
        ViewManagerRegistry viewManagerRegistry = this.viewManagerRegistry;
        if (componentName != null) {
            return viewManagerRegistry.get(componentName).measure(context, localData, props, state, width, widthMode, height, heightMode, attachmentsPositions);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Deprecated(message = "receiveCommand with Int is deprecated, you should use receiveCommand with commandId:String", replaceWith = @ReplaceWith(expression = "receiveCommand(Int,Int,String,ReadableArray)", imports = {}))
    public final void receiveCommand(int surfaceId, int reactTag, int commandId, @NotNull ReadableArray commandArgs) {
        Intrinsics.checkNotNullParameter(commandArgs, "commandArgs");
        UiThreadUtil.assertOnUiThread();
        getSurfaceManagerEnforced(surfaceId, "receiveCommand:int").receiveCommand(reactTag, commandId, commandArgs);
    }

    public final void sendAccessibilityEvent(int surfaceId, int reactTag, int eventType) {
        UiThreadUtil.assertOnUiThread();
        if (surfaceId == -1) {
            getSurfaceManagerForViewEnforced(reactTag).sendAccessibilityEvent(reactTag, eventType);
        } else {
            getSurfaceManagerEnforced(surfaceId, "sendAccessibilityEvent").sendAccessibilityEvent(reactTag, eventType);
        }
    }

    @AnyThread
    @NotNull
    public final SurfaceMountingManager startSurface(int surfaceId, @Nullable ThemedReactContext reactContext, @Nullable View rootView) {
        JSResponderHandler jSResponderHandler = this.jsResponderHandler;
        ViewManagerRegistry viewManagerRegistry = this.viewManagerRegistry;
        RootViewManager rootViewManager = this.rootViewManager;
        MountItemExecutor mountItemExecutor = this.mountItemExecutor;
        if (reactContext == null) {
            throw new IllegalStateException("Required value was null.");
        }
        SurfaceMountingManager surfaceMountingManager = new SurfaceMountingManager(surfaceId, jSResponderHandler, viewManagerRegistry, rootViewManager, mountItemExecutor, reactContext);
        this.surfaceIdToManager.putIfAbsent(Integer.valueOf(surfaceId), surfaceMountingManager);
        if (this.surfaceIdToManager.get(Integer.valueOf(surfaceId)) != surfaceMountingManager) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException(F.c(surfaceId, "Called startSurface more than once for the SurfaceId [", "]")));
        }
        this.mostRecentSurfaceMountingManager = this.surfaceIdToManager.get(Integer.valueOf(surfaceId));
        if (rootView != null) {
            surfaceMountingManager.attachRootView(rootView, reactContext);
        }
        return surfaceMountingManager;
    }

    @AnyThread
    public final void stopSurface(int surfaceId) {
        SurfaceMountingManager surfaceMountingManager = this.surfaceIdToManager.get(Integer.valueOf(surfaceId));
        if (surfaceMountingManager == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException(F.c(surfaceId, "Cannot call stopSurface on non-existent surface: [", "]")));
            return;
        }
        while (this.stoppedSurfaceIds.size() >= 15) {
            Integer num = this.stoppedSurfaceIds.get(0);
            if (num == null) {
                throw new IllegalStateException("Required value was null.");
            }
            this.surfaceIdToManager.remove(num);
            this.stoppedSurfaceIds.remove(num);
            a.c(TAG, "Removing stale SurfaceMountingManager: [%d]", num);
        }
        this.stoppedSurfaceIds.add(Integer.valueOf(surfaceId));
        surfaceMountingManager.stopSurface();
        if (this.mostRecentSurfaceMountingManager == surfaceMountingManager) {
            this.mostRecentSurfaceMountingManager = null;
        }
        if (this.lastQueriedSurfaceMountingManager == surfaceMountingManager) {
            this.lastQueriedSurfaceMountingManager = null;
        }
    }

    public final boolean surfaceIsStopped(int surfaceId) {
        if (this.stoppedSurfaceIds.contains(Integer.valueOf(surfaceId))) {
            return true;
        }
        SurfaceMountingManager surfaceManager = getSurfaceManager(surfaceId);
        return surfaceManager != null && surfaceManager.isStopped();
    }

    @UiThread
    public final void updateProps(int reactTag, @Nullable ReadableMap props) {
        UiThreadUtil.assertOnUiThread();
        if (props == null) {
            return;
        }
        getSurfaceManagerForViewEnforced(reactTag).updateProps(reactTag, props);
    }

    public final void receiveCommand(int surfaceId, int reactTag, @Nullable String commandId, @NotNull ReadableArray commandArgs) {
        Intrinsics.checkNotNullParameter(commandArgs, "commandArgs");
        UiThreadUtil.assertOnUiThread();
        SurfaceMountingManager surfaceManagerEnforced = getSurfaceManagerEnforced(surfaceId, "receiveCommand:string");
        if (commandId == null) {
            throw new IllegalStateException("Required value was null.");
        }
        surfaceManagerEnforced.receiveCommand(reactTag, commandId, commandArgs);
    }
}
