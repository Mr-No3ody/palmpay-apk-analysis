package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.uimanager.IllegalViewOperationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b \u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\r\u0010\u0006\u001a\u00020\u0005H\u0010¢\u0006\u0002\b\u0007J5\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0010¢\u0006\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/uimanager/layoutanimation/BaseLayoutAnimation;", "Lcom/facebook/react/uimanager/layoutanimation/AbstractLayoutAnimation;", "<init>", "()V", "isReverse", "", "isValid", "isValid$ReactAndroid_release", "createAnimationImpl", "Landroid/view/animation/Animation;", "view", "Landroid/view/View;", "x", "", "y", "width", "height", "createAnimationImpl$ReactAndroid_release", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseLayoutAnimation extends AbstractLayoutAnimation {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/uimanager/layoutanimation/BaseLayoutAnimation$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnimatedPropertyType.values().length];
            try {
                iArr[AnimatedPropertyType.OPACITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnimatedPropertyType.SCALE_XY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnimatedPropertyType.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnimatedPropertyType.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("BaseLayoutAnimation", LegacyArchitectureLogLevel.ERROR);
    }

    @Override // com.facebook.react.uimanager.layoutanimation.AbstractLayoutAnimation
    @NotNull
    public Animation createAnimationImpl$ReactAndroid_release(@NotNull View view, int x3, int y8, int width, int height) {
        Intrinsics.checkNotNullParameter(view, "view");
        AnimatedPropertyType animatedProperty = getAnimatedProperty();
        if (animatedProperty == null) {
            throw new IllegalViewOperationException("Missing animated property from animation config");
        }
        int i7 = WhenMappings.$EnumSwitchMapping$0[animatedProperty.ordinal()];
        if (i7 == 1) {
            return new OpacityAnimation(view, isReverse() ? view.getAlpha() : 0.0f, isReverse() ? 0.0f : view.getAlpha());
        }
        if (i7 == 2) {
            float f10 = isReverse() ? 1.0f : 0.0f;
            float f11 = isReverse() ? 0.0f : 1.0f;
            return new ScaleAnimation(f10, f11, f10, f11, 1, 0.5f, 1, 0.5f);
        }
        if (i7 == 3) {
            return new ScaleAnimation(isReverse() ? 1.0f : 0.0f, isReverse() ? 0.0f : 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.0f);
        }
        if (i7 == 4) {
            return new ScaleAnimation(1.0f, 1.0f, isReverse() ? 1.0f : 0.0f, isReverse() ? 0.0f : 1.0f, 1, 0.0f, 1, 0.5f);
        }
        throw new l();
    }

    public abstract boolean isReverse();

    @Override // com.facebook.react.uimanager.layoutanimation.AbstractLayoutAnimation
    public boolean isValid$ReactAndroid_release() {
        return getDurationMs() > 0 && getAnimatedProperty() != null;
    }
}
