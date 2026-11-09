package com.facebook.react.internal.featureflags;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0087 J\t\u0010\u0006\u001a\u00020\u0005H\u0087 J\t\u0010\u0007\u001a\u00020\u0005H\u0087 J\t\u0010\b\u001a\u00020\u0005H\u0087 J\t\u0010\t\u001a\u00020\u0005H\u0087 J\t\u0010\n\u001a\u00020\u0005H\u0087 J\t\u0010\u000b\u001a\u00020\u0005H\u0087 J\t\u0010\f\u001a\u00020\u0005H\u0087 J\t\u0010\r\u001a\u00020\u0005H\u0087 J\t\u0010\u000e\u001a\u00020\u0005H\u0087 J\t\u0010\u000f\u001a\u00020\u0005H\u0087 J\t\u0010\u0010\u001a\u00020\u0005H\u0087 J\t\u0010\u0011\u001a\u00020\u0005H\u0087 J\t\u0010\u0012\u001a\u00020\u0005H\u0087 J\t\u0010\u0013\u001a\u00020\u0005H\u0087 J\t\u0010\u0014\u001a\u00020\u0005H\u0087 J\t\u0010\u0015\u001a\u00020\u0005H\u0087 J\t\u0010\u0016\u001a\u00020\u0005H\u0087 J\t\u0010\u0017\u001a\u00020\u0005H\u0087 J\t\u0010\u0018\u001a\u00020\u0005H\u0087 J\t\u0010\u0019\u001a\u00020\u0005H\u0087 J\t\u0010\u001a\u001a\u00020\u0005H\u0087 J\t\u0010\u001b\u001a\u00020\u0005H\u0087 J\t\u0010\u001c\u001a\u00020\u0005H\u0087 J\t\u0010\u001d\u001a\u00020\u0005H\u0087 J\t\u0010\u001e\u001a\u00020\u0005H\u0087 J\t\u0010\u001f\u001a\u00020\u0005H\u0087 J\t\u0010 \u001a\u00020\u0005H\u0087 J\t\u0010!\u001a\u00020\u0005H\u0087 J\t\u0010\"\u001a\u00020\u0005H\u0087 J\t\u0010#\u001a\u00020\u0005H\u0087 J\t\u0010$\u001a\u00020\u0005H\u0087 J\t\u0010%\u001a\u00020\u0005H\u0087 J\t\u0010&\u001a\u00020\u0005H\u0087 J\t\u0010'\u001a\u00020\u0005H\u0087 J\t\u0010(\u001a\u00020\u0005H\u0087 J\t\u0010)\u001a\u00020\u0005H\u0087 J\t\u0010*\u001a\u00020\u0005H\u0087 J\t\u0010+\u001a\u00020\u0005H\u0087 J\t\u0010,\u001a\u00020\u0005H\u0087 J\t\u0010-\u001a\u00020\u0005H\u0087 J\t\u0010.\u001a\u00020\u0005H\u0087 J\t\u0010/\u001a\u00020\u0005H\u0087 J\t\u00100\u001a\u00020\u0005H\u0087 J\t\u00101\u001a\u00020\u0005H\u0087 J\t\u00102\u001a\u00020\u0005H\u0087 J\t\u00103\u001a\u000204H\u0087 J\t\u00105\u001a\u00020\u0005H\u0087 J\t\u00106\u001a\u00020\u0005H\u0087 J\t\u00107\u001a\u00020\u0005H\u0087 J\t\u00108\u001a\u00020\u0005H\u0087 J\t\u00109\u001a\u00020\u0005H\u0087 J\t\u0010:\u001a\u00020\u0005H\u0087 J\t\u0010;\u001a\u00020\u0005H\u0087 J\t\u0010<\u001a\u00020\u0005H\u0087 J\t\u0010=\u001a\u00020\u0005H\u0087 J\t\u0010>\u001a\u00020\u0005H\u0087 J\t\u0010?\u001a\u00020\u0005H\u0087 J\t\u0010@\u001a\u00020\u0005H\u0087 J\t\u0010A\u001a\u00020\u0005H\u0087 J\t\u0010B\u001a\u000204H\u0087 J\u0011\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u0001H\u0087 J\t\u0010F\u001a\u00020DH\u0087 J\u0013\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010E\u001a\u00020\u0001H\u0087 ¨\u0006I"}, d2 = {"Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;", "", "<init>", "()V", "commonTestFlag", "", "animatedShouldSignalBatch", "cxxNativeAnimatedEnabled", "cxxNativeAnimatedRemoveJsSync", "disableMainQueueSyncDispatchIOS", "disableMountItemReorderingAndroid", "disableTextLayoutManagerCacheAndroid", "enableAccessibilityOrder", "enableAccumulatedUpdatesInRawPropsAndroid", "enableAndroidTextMeasurementOptimizations", "enableBridgelessArchitecture", "enableCppPropsIteratorSetter", "enableCustomFocusSearchOnClippedElementsAndroid", "enableDestroyShadowTreeRevisionAsync", "enableDoubleMeasurementFixAndroid", "enableEagerRootViewAttachment", "enableFabricLogs", "enableFabricRenderer", "enableFixForParentTagDuringReparenting", "enableFontScaleChangesUpdatingLayout", "enableIOSTextBaselineOffsetPerLine", "enableIOSViewClipToPaddingBox", "enableInteropViewManagerClassLookUpOptimizationIOS", "enableLayoutAnimationsOnAndroid", "enableLayoutAnimationsOnIOS", "enableMainQueueCoordinatorOnIOS", "enableMainQueueModulesOnIOS", "enableModuleArgumentNSNullConversionIOS", "enableNativeCSSParsing", "enableNetworkEventReporting", "enableNewBackgroundAndBorderDrawables", "enablePreparedTextLayout", "enablePropsUpdateReconciliationAndroid", "enableResourceTimingAPI", "enableSynchronousStateUpdates", "enableViewCulling", "enableViewRecycling", "enableViewRecyclingForText", "enableViewRecyclingForView", "enableVirtualViewDebugFeatures", "enableVirtualViewRenderState", "enableVirtualViewWindowFocusDetection", "fixMappingOfEventPrioritiesBetweenFabricAndReact", "fuseboxEnabledRelease", "fuseboxNetworkInspectionEnabled", "hideOffscreenVirtualViewsOnIOS", "preparedTextCacheSize", "", "preventShadowTreeCommitExhaustion", "traceTurboModulePromiseRejectionsOnAndroid", "updateRuntimeShadowNodeReferencesOnCommit", "useAlwaysAvailableJSErrorHandling", "useFabricInterop", "useNativeEqualsInNativeReadableArrayAndroid", "useNativeTransformHelperAndroid", "useNativeViewConfigsInBridgelessMode", "useOptimizedEventBatchingOnAndroid", "useRawPropsJsiValue", "useShadowNodeStateOnClone", "useTurboModuleInterop", "useTurboModules", "virtualViewPrerenderRatio", "override", "", "provider", "dangerouslyReset", "dangerouslyForceOverride", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactNativeFeatureFlagsCxxInterop {

    @NotNull
    public static final ReactNativeFeatureFlagsCxxInterop INSTANCE = new ReactNativeFeatureFlagsCxxInterop();

    static {
        SoLoader.j("react_featureflagsjni");
    }

    private ReactNativeFeatureFlagsCxxInterop() {
    }

    @JvmStatic
    @DoNotStrip
    public static final native boolean animatedShouldSignalBatch();

    @JvmStatic
    @DoNotStrip
    public static final native boolean commonTestFlag();

    @JvmStatic
    @DoNotStrip
    public static final native boolean cxxNativeAnimatedEnabled();

    @JvmStatic
    @DoNotStrip
    public static final native boolean cxxNativeAnimatedRemoveJsSync();

    @JvmStatic
    @DoNotStrip
    @Nullable
    public static final native String dangerouslyForceOverride(@NotNull Object provider);

    @JvmStatic
    @DoNotStrip
    public static final native void dangerouslyReset();

    @JvmStatic
    @DoNotStrip
    public static final native boolean disableMainQueueSyncDispatchIOS();

    @JvmStatic
    @DoNotStrip
    public static final native boolean disableMountItemReorderingAndroid();

    @JvmStatic
    @DoNotStrip
    public static final native boolean disableTextLayoutManagerCacheAndroid();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableAccessibilityOrder();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableAccumulatedUpdatesInRawPropsAndroid();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableAndroidTextMeasurementOptimizations();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableBridgelessArchitecture();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableCppPropsIteratorSetter();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableCustomFocusSearchOnClippedElementsAndroid();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableDestroyShadowTreeRevisionAsync();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableDoubleMeasurementFixAndroid();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableEagerRootViewAttachment();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableFabricLogs();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableFabricRenderer();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableFixForParentTagDuringReparenting();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableFontScaleChangesUpdatingLayout();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableIOSTextBaselineOffsetPerLine();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableIOSViewClipToPaddingBox();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableInteropViewManagerClassLookUpOptimizationIOS();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableLayoutAnimationsOnAndroid();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableLayoutAnimationsOnIOS();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableMainQueueCoordinatorOnIOS();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableMainQueueModulesOnIOS();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableModuleArgumentNSNullConversionIOS();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableNativeCSSParsing();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableNetworkEventReporting();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableNewBackgroundAndBorderDrawables();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enablePreparedTextLayout();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enablePropsUpdateReconciliationAndroid();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableResourceTimingAPI();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableSynchronousStateUpdates();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableViewCulling();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableViewRecycling();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableViewRecyclingForText();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableViewRecyclingForView();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableVirtualViewDebugFeatures();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableVirtualViewRenderState();

    @JvmStatic
    @DoNotStrip
    public static final native boolean enableVirtualViewWindowFocusDetection();

    @JvmStatic
    @DoNotStrip
    public static final native boolean fixMappingOfEventPrioritiesBetweenFabricAndReact();

    @JvmStatic
    @DoNotStrip
    public static final native boolean fuseboxEnabledRelease();

    @JvmStatic
    @DoNotStrip
    public static final native boolean fuseboxNetworkInspectionEnabled();

    @JvmStatic
    @DoNotStrip
    public static final native boolean hideOffscreenVirtualViewsOnIOS();

    @JvmStatic
    @DoNotStrip
    public static final native void override(@NotNull Object provider);

    @JvmStatic
    @DoNotStrip
    public static final native double preparedTextCacheSize();

    @JvmStatic
    @DoNotStrip
    public static final native boolean preventShadowTreeCommitExhaustion();

    @JvmStatic
    @DoNotStrip
    public static final native boolean traceTurboModulePromiseRejectionsOnAndroid();

    @JvmStatic
    @DoNotStrip
    public static final native boolean updateRuntimeShadowNodeReferencesOnCommit();

    @JvmStatic
    @DoNotStrip
    public static final native boolean useAlwaysAvailableJSErrorHandling();

    @JvmStatic
    @DoNotStrip
    public static final native boolean useFabricInterop();

    @JvmStatic
    @DoNotStrip
    public static final native boolean useNativeEqualsInNativeReadableArrayAndroid();

    @JvmStatic
    @DoNotStrip
    public static final native boolean useNativeTransformHelperAndroid();

    @JvmStatic
    @DoNotStrip
    public static final native boolean useNativeViewConfigsInBridgelessMode();

    @JvmStatic
    @DoNotStrip
    public static final native boolean useOptimizedEventBatchingOnAndroid();

    @JvmStatic
    @DoNotStrip
    public static final native boolean useRawPropsJsiValue();

    @JvmStatic
    @DoNotStrip
    public static final native boolean useShadowNodeStateOnClone();

    @JvmStatic
    @DoNotStrip
    public static final native boolean useTurboModuleInterop();

    @JvmStatic
    @DoNotStrip
    public static final native boolean useTurboModules();

    @JvmStatic
    @DoNotStrip
    public static final native double virtualViewPrerenderRatio();
}
