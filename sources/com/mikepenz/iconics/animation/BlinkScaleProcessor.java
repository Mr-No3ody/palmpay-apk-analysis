package com.mikepenz.iconics.animation;

import H5.c;
import I5.b;
import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.Rect;
import androidx.annotation.FloatRange;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u0000 C2\u00020\u0001:\u0001DBM\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010JO\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010\f\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\u000e\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010:\u001a\u0004\b\u000e\u0010;\"\u0004\b<\u0010=R\u001a\u0010?\u001a\u00020>8\u0016X\u0096D¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lcom/mikepenz/iconics/animation/BlinkScaleProcessor;", "Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;", "", "minimumScale", "maximumScale", "Landroid/animation/TimeInterpolator;", "interpolator", "", "duration", "", "repeatCount", "LI5/b;", "repeatMode", "", "isStartImmediately", "<init>", "(FFLandroid/animation/TimeInterpolator;JILI5/b;Z)V", "Landroid/graphics/Canvas;", "canvas", "LH5/c;", "Landroid/text/TextPaint;", "iconBrush", "Landroid/graphics/Paint;", "iconContourBrush", "backgroundBrush", "backgroundContourBrush", "", "processPreDraw", "(Landroid/graphics/Canvas;LH5/c;LH5/c;LH5/c;LH5/c;)V", "processPostDraw", "(Landroid/graphics/Canvas;)V", "F", "getMinimumScale", "()F", "setMinimumScale", "(F)V", "getMaximumScale", "setMaximumScale", "Landroid/animation/TimeInterpolator;", "getInterpolator", "()Landroid/animation/TimeInterpolator;", "setInterpolator", "(Landroid/animation/TimeInterpolator;)V", "J", "getDuration", "()J", "setDuration", "(J)V", "I", "getRepeatCount", "()I", "setRepeatCount", "(I)V", "LI5/b;", "getRepeatMode", "()LI5/b;", "setRepeatMode", "(LI5/b;)V", "Z", "()Z", "setStartImmediately", "(Z)V", "", "animationTag", "Ljava/lang/String;", "getAnimationTag", "()Ljava/lang/String;", "Companion", "a", "iconics-core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class BlinkScaleProcessor extends IconicsAnimationProcessor {

    @JvmField
    public static long DEFAULT_DURATION = 500;

    @NotNull
    private final String animationTag;
    private long duration;

    @NotNull
    private TimeInterpolator interpolator;
    private boolean isStartImmediately;
    private float maximumScale;
    private float minimumScale;
    private int repeatCount;

    @NotNull
    private b repeatMode;

    public BlinkScaleProcessor() {
        this(0.0f, 0.0f, null, 0L, 0, null, false, 127, null);
    }

    @Override // com.mikepenz.iconics.animation.IconicsAnimationProcessor
    @NotNull
    public String getAnimationTag() {
        return this.animationTag;
    }

    @Override // com.mikepenz.iconics.animation.IconicsAnimationProcessor
    public long getDuration() {
        return this.duration;
    }

    @Override // com.mikepenz.iconics.animation.IconicsAnimationProcessor
    @NotNull
    public TimeInterpolator getInterpolator() {
        return this.interpolator;
    }

    public float getMaximumScale() {
        return this.maximumScale;
    }

    public float getMinimumScale() {
        return this.minimumScale;
    }

    @Override // com.mikepenz.iconics.animation.IconicsAnimationProcessor
    public int getRepeatCount() {
        return this.repeatCount;
    }

    @Override // com.mikepenz.iconics.animation.IconicsAnimationProcessor
    @NotNull
    public b getRepeatMode() {
        return this.repeatMode;
    }

    @Override // com.mikepenz.iconics.animation.IconicsAnimationProcessor
    /* JADX INFO: renamed from: isStartImmediately, reason: from getter */
    public boolean getIsStartImmediately() {
        return this.isStartImmediately;
    }

    @Override // com.mikepenz.iconics.animation.IconicsAnimationProcessor
    public void processPostDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.restore();
    }

    @Override // com.mikepenz.iconics.animation.IconicsAnimationProcessor
    public void processPreDraw(@NotNull Canvas canvas, @NotNull c iconBrush, @NotNull c iconContourBrush, @NotNull c backgroundBrush, @NotNull c backgroundContourBrush) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(iconBrush, "iconBrush");
        Intrinsics.checkNotNullParameter(iconContourBrush, "iconContourBrush");
        Intrinsics.checkNotNullParameter(backgroundBrush, "backgroundBrush");
        Intrinsics.checkNotNullParameter(backgroundContourBrush, "backgroundContourBrush");
        float animatedPercent = getAnimatedPercent() * ((getMaximumScale() - getMinimumScale()) / 100);
        Rect drawableBounds = getDrawableBounds();
        if (drawableBounds != null) {
            canvas.save();
            canvas.scale(animatedPercent, animatedPercent, drawableBounds.width() / 2, drawableBounds.height() / 2);
        }
    }

    public void setDuration(long j6) {
        this.duration = j6;
    }

    public void setInterpolator(@NotNull TimeInterpolator timeInterpolator) {
        Intrinsics.checkNotNullParameter(timeInterpolator, "<set-?>");
        this.interpolator = timeInterpolator;
    }

    public void setMaximumScale(float f10) {
        this.maximumScale = f10;
    }

    public void setMinimumScale(float f10) {
        this.minimumScale = f10;
    }

    public void setRepeatCount(int i7) {
        this.repeatCount = i7;
    }

    public void setRepeatMode(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.repeatMode = bVar;
    }

    public void setStartImmediately(boolean z3) {
        this.isStartImmediately = z3;
    }

    public /* synthetic */ BlinkScaleProcessor(float f10, float f11, TimeInterpolator timeInterpolator, long j6, int i7, b bVar, boolean z3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 1.0f : f11, (i10 & 4) != 0 ? IconicsAnimationProcessor.DEFAULT_INTERPOLATOR : timeInterpolator, (i10 & 8) != 0 ? DEFAULT_DURATION : j6, (i10 & 16) != 0 ? -1 : i7, (i10 & 32) != 0 ? b.REVERSE : bVar, (i10 & 64) != 0 ? true : z3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlinkScaleProcessor(@FloatRange(from = 0.0d) float f10, @FloatRange(from = 0.0d) float f11, @NotNull TimeInterpolator interpolator, long j6, int i7, @NotNull b repeatMode, boolean z3) {
        super(interpolator, j6, i7, repeatMode, z3);
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
        this.minimumScale = f10;
        this.maximumScale = f11;
        this.interpolator = interpolator;
        this.duration = j6;
        this.repeatCount = i7;
        this.repeatMode = repeatMode;
        this.isStartImmediately = z3;
        this.animationTag = "blink_scale";
    }
}
