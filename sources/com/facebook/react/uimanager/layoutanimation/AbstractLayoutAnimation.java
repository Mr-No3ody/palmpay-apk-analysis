package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.google.firebase.messaging.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0019\u001a\u00020\u001aH ¢\u0006\u0002\b\u001bJ7\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bH ¢\u0006\u0002\b$J\u0006\u0010%\u001a\u00020&J\u0016\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000bJ0\u0010+\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000f¨\u0006-"}, d2 = {"Lcom/facebook/react/uimanager/layoutanimation/AbstractLayoutAnimation;", "", "<init>", "()V", "interpolator", "Landroid/view/animation/Interpolator;", "getInterpolator", "()Landroid/view/animation/Interpolator;", "setInterpolator", "(Landroid/view/animation/Interpolator;)V", "delayMs", "", "getDelayMs", "()I", "setDelayMs", "(I)V", "animatedProperty", "Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;", "getAnimatedProperty", "()Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;", "setAnimatedProperty", "(Lcom/facebook/react/uimanager/layoutanimation/AnimatedPropertyType;)V", "durationMs", "getDurationMs", "setDurationMs", "isValid", "", "isValid$ReactAndroid_release", "createAnimationImpl", "Landroid/view/animation/Animation;", "view", "Landroid/view/View;", "x", "y", "width", "height", "createAnimationImpl$ReactAndroid_release", "reset", "", "initializeFromConfig", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/facebook/react/bridge/ReadableMap;", "globalDuration", "createAnimation", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAbstractLayoutAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractLayoutAnimation.kt\ncom/facebook/react/uimanager/layoutanimation/AbstractLayoutAnimation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
public abstract class AbstractLayoutAnimation {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<InterpolatorType, BaseInterpolator> INTERPOLATOR;
    private static final boolean SLOWDOWN_ANIMATION_MODE = false;

    @Nullable
    private AnimatedPropertyType animatedProperty;
    private int delayMs;
    private int durationMs;

    @Nullable
    private Interpolator interpolator;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/uimanager/layoutanimation/AbstractLayoutAnimation$Companion;", "", "<init>", "()V", "SLOWDOWN_ANIMATION_MODE", "", "INTERPOLATOR", "", "Lcom/facebook/react/uimanager/layoutanimation/InterpolatorType;", "Landroid/view/animation/BaseInterpolator;", "getInterpolator", "Landroid/view/animation/Interpolator;", "type", "params", "Lcom/facebook/react/bridge/ReadableMap;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAbstractLayoutAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractLayoutAnimation.kt\ncom/facebook/react/uimanager/layoutanimation/AbstractLayoutAnimation$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        @NotNull
        public final Interpolator getInterpolator(@NotNull InterpolatorType type, @NotNull ReadableMap params) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(params, "params");
            Interpolator simpleSpringInterpolator = type == InterpolatorType.SPRING ? new SimpleSpringInterpolator(SimpleSpringInterpolator.INSTANCE.getSpringDamping(params)) : (Interpolator) AbstractLayoutAnimation.INTERPOLATOR.get(type);
            if (simpleSpringInterpolator != null) {
                return simpleSpringInterpolator;
            }
            throw new IllegalArgumentException(("Missing interpolator for type : " + type).toString());
        }

        private Companion() {
        }
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("AbstractLayoutAnimation", LegacyArchitectureLogLevel.ERROR);
        INTERPOLATOR = G.g(new Pair(InterpolatorType.LINEAR, new LinearInterpolator()), new Pair(InterpolatorType.EASE_IN, new AccelerateInterpolator()), new Pair(InterpolatorType.EASE_OUT, new DecelerateInterpolator()), new Pair(InterpolatorType.EASE_IN_EASE_OUT, new AccelerateDecelerateInterpolator()));
    }

    @Nullable
    public final Animation createAnimation(@NotNull View view, int x3, int y8, int width, int height) {
        Animation animationCreateAnimationImpl$ReactAndroid_release;
        Intrinsics.checkNotNullParameter(view, "view");
        if (!isValid$ReactAndroid_release() || (animationCreateAnimationImpl$ReactAndroid_release = createAnimationImpl$ReactAndroid_release(view, x3, y8, width, height)) == null) {
            return null;
        }
        animationCreateAnimationImpl$ReactAndroid_release.setDuration(this.durationMs);
        animationCreateAnimationImpl$ReactAndroid_release.setStartOffset(this.delayMs);
        animationCreateAnimationImpl$ReactAndroid_release.setInterpolator(this.interpolator);
        return animationCreateAnimationImpl$ReactAndroid_release;
    }

    @Nullable
    public abstract Animation createAnimationImpl$ReactAndroid_release(@NotNull View view, int x3, int y8, int width, int height);

    @Nullable
    public final AnimatedPropertyType getAnimatedProperty() {
        return this.animatedProperty;
    }

    public final int getDelayMs() {
        return this.delayMs;
    }

    public final int getDurationMs() {
        return this.durationMs;
    }

    @Nullable
    public final Interpolator getInterpolator() {
        return this.interpolator;
    }

    public final void initializeFromConfig(@NotNull ReadableMap data, int globalDuration) {
        AnimatedPropertyType animatedPropertyTypeFromString;
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.hasKey("property")) {
            AnimatedPropertyType.Companion companion = AnimatedPropertyType.INSTANCE;
            String string = data.getString("property");
            if (string == null) {
                string = "";
            }
            animatedPropertyTypeFromString = companion.fromString(string);
        } else {
            animatedPropertyTypeFromString = null;
        }
        this.animatedProperty = animatedPropertyTypeFromString;
        if (data.hasKey("duration")) {
            globalDuration = data.getInt("duration");
        }
        this.durationMs = globalDuration;
        this.delayMs = data.hasKey("delay") ? data.getInt("delay") : 0;
        if (!data.hasKey("type")) {
            throw new IllegalArgumentException("Missing interpolation type.");
        }
        Companion companion2 = INSTANCE;
        InterpolatorType.Companion companion3 = InterpolatorType.INSTANCE;
        String string2 = data.getString("type");
        this.interpolator = companion2.getInterpolator(companion3.fromString(string2 != null ? string2 : ""), data);
        if (isValid$ReactAndroid_release()) {
            return;
        }
        throw new IllegalViewOperationException("Invalid layout animation : " + data);
    }

    public abstract boolean isValid$ReactAndroid_release();

    public final void reset() {
        this.animatedProperty = null;
        this.durationMs = 0;
        this.delayMs = 0;
        this.interpolator = null;
    }

    public final void setAnimatedProperty(@Nullable AnimatedPropertyType animatedPropertyType) {
        this.animatedProperty = animatedPropertyType;
    }

    public final void setDelayMs(int i7) {
        this.delayMs = i7;
    }

    public final void setDurationMs(int i7) {
        this.durationMs = i7;
    }

    public final void setInterpolator(@Nullable Interpolator interpolator) {
        this.interpolator = interpolator;
    }
}
