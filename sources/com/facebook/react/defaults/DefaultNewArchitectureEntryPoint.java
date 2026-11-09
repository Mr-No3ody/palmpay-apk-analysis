package com.facebook.react.defaults;

import com.facebook.react.common.ReleaseLevel;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsOverrides_RNOSS_Experimental_Android;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsOverrides_RNOSS_Stable_Android;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007J\u001c\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007J&\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0007J\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\b\u0013J,\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020$0#2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0007R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\u0014\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u001a\u0010\u0017R\u000e\u0010\u001b\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001e\u0010\u0017R\u000e\u0010\u001f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u0003\u001a\u0004\b!\u0010\u0017¨\u0006%"}, d2 = {"Lcom/facebook/react/defaults/DefaultNewArchitectureEntryPoint;", "", "<init>", "()V", "releaseLevel", "Lcom/facebook/react/common/ReleaseLevel;", "getReleaseLevel", "()Lcom/facebook/react/common/ReleaseLevel;", "setReleaseLevel", "(Lcom/facebook/react/common/ReleaseLevel;)V", "load", "", "turboModulesEnabled", "", "fabricEnabled", "bridgelessEnabled", "loadWithFeatureFlags", "featureFlags", "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;", "loadWithFeatureFlags$ReactAndroid_release", "privateFabricEnabled", "getFabricEnabled$annotations", "getFabricEnabled", "()Z", "privateTurboModulesEnabled", "getTurboModulesEnabled$annotations", "getTurboModulesEnabled", "privateConcurrentReactEnabled", "concurrentReactEnabled", "getConcurrentReactEnabled$annotations", "getConcurrentReactEnabled", "privateBridgelessEnabled", "getBridgelessEnabled$annotations", "getBridgelessEnabled", "isConfigurationValid", "Lkotlin/Pair;", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultNewArchitectureEntryPoint {
    private static boolean privateBridgelessEnabled;
    private static boolean privateConcurrentReactEnabled;
    private static boolean privateFabricEnabled;
    private static boolean privateTurboModulesEnabled;

    @NotNull
    public static final DefaultNewArchitectureEntryPoint INSTANCE = new DefaultNewArchitectureEntryPoint();

    @NotNull
    private static ReleaseLevel releaseLevel = ReleaseLevel.STABLE;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReleaseLevel.values().length];
            try {
                iArr[ReleaseLevel.EXPERIMENTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReleaseLevel.CANARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReleaseLevel.STABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private DefaultNewArchitectureEntryPoint() {
    }

    public static final boolean getBridgelessEnabled() {
        return privateBridgelessEnabled;
    }

    @JvmStatic
    public static /* synthetic */ void getBridgelessEnabled$annotations() {
    }

    public static final boolean getConcurrentReactEnabled() {
        return privateConcurrentReactEnabled;
    }

    @JvmStatic
    public static /* synthetic */ void getConcurrentReactEnabled$annotations() {
    }

    public static final boolean getFabricEnabled() {
        return privateFabricEnabled;
    }

    @JvmStatic
    public static /* synthetic */ void getFabricEnabled$annotations() {
    }

    public static final boolean getTurboModulesEnabled() {
        return privateTurboModulesEnabled;
    }

    @JvmStatic
    public static /* synthetic */ void getTurboModulesEnabled$annotations() {
    }

    @JvmStatic
    public static final void load() {
        load(true, true, true);
    }

    public static /* synthetic */ void load$default(boolean z3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z3 = true;
        }
        load(z3);
    }

    @JvmStatic
    public static final void loadWithFeatureFlags$ReactAndroid_release(@NotNull ReactNativeFeatureFlagsProvider featureFlags) {
        Intrinsics.checkNotNullParameter(featureFlags, "featureFlags");
        ReactNativeFeatureFlags.override(featureFlags);
        privateFabricEnabled = featureFlags.enableFabricRenderer();
        privateTurboModulesEnabled = featureFlags.useTurboModules();
        privateConcurrentReactEnabled = featureFlags.enableFabricRenderer();
        privateBridgelessEnabled = featureFlags.getNewArchitectureEnabled();
        DefaultSoLoader.maybeLoadSoLibrary();
    }

    @NotNull
    public final ReleaseLevel getReleaseLevel() {
        return releaseLevel;
    }

    @VisibleForTesting
    @NotNull
    public final Pair<Boolean, String> isConfigurationValid(boolean turboModulesEnabled, boolean fabricEnabled, boolean bridgelessEnabled) {
        if (!fabricEnabled || turboModulesEnabled) {
            return (!bridgelessEnabled || (turboModulesEnabled && fabricEnabled)) ? new Pair<>(Boolean.TRUE, "") : new Pair<>(Boolean.FALSE, "bridgelessEnabled=true requires (turboModulesEnabled=true AND fabricEnabled=true) - Please update your DefaultNewArchitectureEntryPoint.load() parameters.");
        }
        return new Pair<>(Boolean.FALSE, "fabricEnabled=true requires turboModulesEnabled=true (is now false) - Please update your DefaultNewArchitectureEntryPoint.load() parameters.");
    }

    public final void setReleaseLevel(@NotNull ReleaseLevel releaseLevel2) {
        Intrinsics.checkNotNullParameter(releaseLevel2, "<set-?>");
        releaseLevel = releaseLevel2;
    }

    @Deprecated(message = "Loading the entry point with different flags for Fabric, TurboModule and Bridgeless is deprecated.Please use load() instead when loading the New Architecture.", replaceWith = @ReplaceWith(expression = "load()", imports = {}))
    @JvmStatic
    public static final void load(boolean turboModulesEnabled) {
        load(turboModulesEnabled, true, true);
    }

    public static /* synthetic */ void load$default(boolean z3, boolean z8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z3 = true;
        }
        if ((i7 & 2) != 0) {
            z8 = true;
        }
        load(z3, z8);
    }

    @Deprecated(message = "Loading the entry point with different flags for Fabric, TurboModule and Bridgeless is deprecated.Please use load() instead when loading the New Architecture.", replaceWith = @ReplaceWith(expression = "load()", imports = {}))
    @JvmStatic
    public static final void load(boolean turboModulesEnabled, boolean fabricEnabled) {
        load(turboModulesEnabled, fabricEnabled, true);
    }

    public static /* synthetic */ void load$default(boolean z3, boolean z8, boolean z10, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z3 = true;
        }
        if ((i7 & 2) != 0) {
            z8 = true;
        }
        if ((i7 & 4) != 0) {
            z10 = true;
        }
        load(z3, z8, z10);
    }

    @Deprecated(message = "Loading the entry point with different flags for Fabric, TurboModule and Bridgeless is deprecated.Please use load() instead when loading the New Architecture.", replaceWith = @ReplaceWith(expression = "load()", imports = {}))
    @JvmStatic
    public static final void load(boolean turboModulesEnabled, boolean fabricEnabled, boolean bridgelessEnabled) {
        Pair<Boolean, String> pairIsConfigurationValid = INSTANCE.isConfigurationValid(turboModulesEnabled, fabricEnabled, bridgelessEnabled);
        boolean zBooleanValue = ((Boolean) pairIsConfigurationValid.f38891a).booleanValue();
        String str = (String) pairIsConfigurationValid.f38892b;
        if (zBooleanValue) {
            int i7 = WhenMappings.$EnumSwitchMapping$0[releaseLevel.ordinal()];
            if (i7 == 1) {
                ReactNativeFeatureFlags.override(new ReactNativeFeatureFlagsOverrides_RNOSS_Experimental_Android());
            } else if (i7 == 2) {
                ReactNativeFeatureFlags.override(new ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android());
            } else if (i7 == 3) {
                ReactNativeFeatureFlags.override(new ReactNativeFeatureFlagsOverrides_RNOSS_Stable_Android(fabricEnabled, bridgelessEnabled, turboModulesEnabled));
            } else {
                throw new l();
            }
            privateFabricEnabled = fabricEnabled;
            privateTurboModulesEnabled = turboModulesEnabled;
            privateConcurrentReactEnabled = fabricEnabled;
            privateBridgelessEnabled = bridgelessEnabled;
            DefaultSoLoader.maybeLoadSoLibrary();
            return;
        }
        throw new IllegalStateException(str.toString());
    }
}
