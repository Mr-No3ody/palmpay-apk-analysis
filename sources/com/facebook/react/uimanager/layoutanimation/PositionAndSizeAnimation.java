package com.facebook.react.uimanager.layoutanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J(\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J(\u0010!\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00040\u00040\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/facebook/react/uimanager/layoutanimation/PositionAndSizeAnimation;", "Landroid/view/animation/Animation;", "Lcom/facebook/react/uimanager/layoutanimation/LayoutHandlingAnimation;", "view", "Landroid/view/View;", "x", "", "y", "width", "height", "<init>", "(Landroid/view/View;IIII)V", "viewRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "startX", "", "startY", "deltaX", "deltaY", "startWidth", "startHeight", "deltaWidth", "deltaHeight", "applyTransformation", "", "interpolatedTime", "t", "Landroid/view/animation/Transformation;", "onLayoutUpdate", "isValid", "", "willChangeBounds", "calculateAnimation", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PositionAndSizeAnimation extends Animation implements LayoutHandlingAnimation {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private int deltaHeight;
    private int deltaWidth;
    private float deltaX;
    private float deltaY;
    private int startHeight;
    private int startWidth;
    private float startX;
    private float startY;

    @NotNull
    private final WeakReference<View> viewRef;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/uimanager/layoutanimation/PositionAndSizeAnimation$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("PositionAndSizeAnimation", LegacyArchitectureLogLevel.ERROR);
    }

    public PositionAndSizeAnimation(@NotNull View view, int i7, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.viewRef = new WeakReference<>(view);
        calculateAnimation(i7, i10, i11, i12);
    }

    private final void calculateAnimation(int x3, int y8, int width, int height) {
        View view = this.viewRef.get();
        if (view != null) {
            this.startX = view.getX() - view.getTranslationX();
            this.startY = view.getY() - view.getTranslationY();
            this.startWidth = view.getWidth();
            int height2 = view.getHeight();
            this.startHeight = height2;
            this.deltaX = x3 - this.startX;
            this.deltaY = y8 - this.startY;
            this.deltaWidth = width - this.startWidth;
            this.deltaHeight = height - height2;
        }
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float interpolatedTime, @NotNull Transformation t) {
        Intrinsics.checkNotNullParameter(t, "t");
        View view = this.viewRef.get();
        if (view != null) {
            float f10 = (this.deltaX * interpolatedTime) + this.startX;
            float f11 = (this.deltaY * interpolatedTime) + this.startY;
            view.layout(Math.round(f10), Math.round(f11), Math.round(f10 + (this.deltaWidth * interpolatedTime) + this.startWidth), Math.round(f11 + (this.deltaHeight * interpolatedTime) + this.startHeight));
        }
    }

    @Override // com.facebook.react.uimanager.layoutanimation.LayoutHandlingAnimation
    public boolean isValid() {
        return this.viewRef.get() != null;
    }

    @Override // com.facebook.react.uimanager.layoutanimation.LayoutHandlingAnimation
    public void onLayoutUpdate(int x3, int y8, int width, int height) {
        calculateAnimation(x3, y8, width, height);
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
