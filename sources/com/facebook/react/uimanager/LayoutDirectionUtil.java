package com.facebook.react.uimanager;

import H3.e;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/uimanager/LayoutDirectionUtil;", "", "<init>", "()V", "LH3/e;", "direction", "", "toAndroidFromYoga", "(LH3/e;)I", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LayoutDirectionUtil {

    @NotNull
    public static final LayoutDirectionUtil INSTANCE = new LayoutDirectionUtil();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("LayoutDirectionUtil", LegacyArchitectureLogLevel.ERROR);
    }

    private LayoutDirectionUtil() {
    }

    @JvmStatic
    public static final int toAndroidFromYoga(@NotNull e direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        int i7 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i7 != 1) {
            return i7 != 2 ? 2 : 1;
        }
        return 0;
    }
}
