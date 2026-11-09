package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0010¢\u0006\u0002\b\u0006J7\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0010¢\u0006\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/uimanager/layoutanimation/LayoutUpdateAnimation;", "Lcom/facebook/react/uimanager/layoutanimation/AbstractLayoutAnimation;", "<init>", "()V", "isValid", "", "isValid$ReactAndroid_release", "createAnimationImpl", "Landroid/view/animation/Animation;", "view", "Landroid/view/View;", "x", "", "y", "width", "height", "createAnimationImpl$ReactAndroid_release", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LayoutUpdateAnimation extends AbstractLayoutAnimation {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final boolean USE_TRANSLATE_ANIMATION = false;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/uimanager/layoutanimation/LayoutUpdateAnimation$Companion;", "", "<init>", "()V", "USE_TRANSLATE_ANIMATION", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("LayoutUpdateAnimation", LegacyArchitectureLogLevel.ERROR);
    }

    @Override // com.facebook.react.uimanager.layoutanimation.AbstractLayoutAnimation
    @Nullable
    public Animation createAnimationImpl$ReactAndroid_release(@NotNull View view, int x3, int y8, int width, int height) {
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z3 = true;
        boolean z8 = (((int) view.getX()) == x3 && ((int) view.getY()) == y8) ? false : true;
        if (view.getWidth() == width && view.getHeight() == height) {
            z3 = false;
        }
        if (z8 || z3) {
            return new PositionAndSizeAnimation(view, x3, y8, width, height);
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.layoutanimation.AbstractLayoutAnimation
    public boolean isValid$ReactAndroid_release() {
        return getDurationMs() > 0;
    }
}
