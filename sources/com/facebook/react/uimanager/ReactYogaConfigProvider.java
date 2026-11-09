package com.facebook.react.uimanager;

import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.yoga.YogaNative;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p041ce.o;
import p355xf.C2131j;
import p355xf.EnumC2132k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/facebook/react/uimanager/ReactYogaConfigProvider;", "", "<init>", "()V", "LH3/c;", "yogaConfig$delegate", "Lkotlin/Lazy;", "getYogaConfig", "()LH3/c;", "yogaConfig", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactYogaConfigProvider {

    @NotNull
    public static final ReactYogaConfigProvider INSTANCE = new ReactYogaConfigProvider();

    /* JADX INFO: renamed from: yogaConfig$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy yogaConfig;

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture$default("ReactYogaConfigProvider", null, 2, null);
        yogaConfig = C2131j.a(EnumC2132k.f43971c, new o(5));
    }

    private ReactYogaConfigProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H3.c yogaConfig_delegate$lambda$1() {
        long jJni_YGConfigNewJNI = YogaNative.jni_YGConfigNewJNI();
        H3.d dVar = new H3.d();
        if (jJni_YGConfigNewJNI == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        dVar.f3623a = jJni_YGConfigNewJNI;
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(jJni_YGConfigNewJNI, 0.0f);
        YogaNative.jni_YGConfigSetErrataJNI(dVar.f3623a, Integer.MAX_VALUE);
        return dVar;
    }

    @NotNull
    public final H3.c getYogaConfig() {
        Object value = yogaConfig.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (H3.c) value;
    }
}
