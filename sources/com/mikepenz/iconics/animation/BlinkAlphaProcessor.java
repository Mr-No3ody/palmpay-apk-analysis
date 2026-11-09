package com.mikepenz.iconics.animation;

import H5.c;
import I5.b;
import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import androidx.annotation.IntRange;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u0000 =2\u00020\u0001:\u0001>BM\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJO\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\t\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001c\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 R\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\r\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u00104\u001a\u0004\b\r\u00105\"\u0004\b6\u00107R\u001a\u00109\u001a\u0002088\u0016X\u0096D¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lcom/mikepenz/iconics/animation/BlinkAlphaProcessor;", "Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;", "", "minimumAlpha", "maximumAlpha", "Landroid/animation/TimeInterpolator;", "interpolator", "", "duration", "repeatCount", "LI5/b;", "repeatMode", "", "isStartImmediately", "<init>", "(IILandroid/animation/TimeInterpolator;JILI5/b;Z)V", "Landroid/graphics/Canvas;", "canvas", "LH5/c;", "Landroid/text/TextPaint;", "iconBrush", "Landroid/graphics/Paint;", "iconContourBrush", "backgroundBrush", "backgroundContourBrush", "", "processPreDraw", "(Landroid/graphics/Canvas;LH5/c;LH5/c;LH5/c;LH5/c;)V", "I", "getMinimumAlpha", "()I", "setMinimumAlpha", "(I)V", "getMaximumAlpha", "setMaximumAlpha", "Landroid/animation/TimeInterpolator;", "getInterpolator", "()Landroid/animation/TimeInterpolator;", "setInterpolator", "(Landroid/animation/TimeInterpolator;)V", "J", "getDuration", "()J", "setDuration", "(J)V", "getRepeatCount", "setRepeatCount", "LI5/b;", "getRepeatMode", "()LI5/b;", "setRepeatMode", "(LI5/b;)V", "Z", "()Z", "setStartImmediately", "(Z)V", "", "animationTag", "Ljava/lang/String;", "getAnimationTag", "()Ljava/lang/String;", "Companion", "a", "iconics-core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class BlinkAlphaProcessor extends IconicsAnimationProcessor {

    @JvmField
    public static long DEFAULT_DURATION = 500;

    @NotNull
    private final String animationTag;
    private long duration;

    @NotNull
    private TimeInterpolator interpolator;
    private boolean isStartImmediately;
    private int maximumAlpha;
    private int minimumAlpha;
    private int repeatCount;

    @NotNull
    private b repeatMode;

    public BlinkAlphaProcessor() {
        this(0, 0, null, 0L, 0, null, false, 127, null);
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

    public int getMaximumAlpha() {
        return this.maximumAlpha;
    }

    public int getMinimumAlpha() {
        return this.minimumAlpha;
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
    public void processPreDraw(@NotNull Canvas canvas, @NotNull c iconBrush, @NotNull c iconContourBrush, @NotNull c backgroundBrush, @NotNull c backgroundContourBrush) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(iconBrush, "iconBrush");
        Intrinsics.checkNotNullParameter(iconContourBrush, "iconContourBrush");
        Intrinsics.checkNotNullParameter(backgroundBrush, "backgroundBrush");
        Intrinsics.checkNotNullParameter(backgroundContourBrush, "backgroundContourBrush");
        int animatedPercent = (int) (getAnimatedPercent() * ((getMaximumAlpha() - getMinimumAlpha()) / 100));
        iconBrush.c(animatedPercent);
        iconContourBrush.c(animatedPercent);
        backgroundBrush.c(animatedPercent);
        backgroundContourBrush.c(animatedPercent);
    }

    public void setDuration(long j6) {
        this.duration = j6;
    }

    public void setInterpolator(@NotNull TimeInterpolator timeInterpolator) {
        Intrinsics.checkNotNullParameter(timeInterpolator, "<set-?>");
        this.interpolator = timeInterpolator;
    }

    public void setMaximumAlpha(int i7) {
        this.maximumAlpha = i7;
    }

    public void setMinimumAlpha(int i7) {
        this.minimumAlpha = i7;
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

    public /* synthetic */ BlinkAlphaProcessor(int i7, int i10, TimeInterpolator timeInterpolator, long j6, int i11, b bVar, boolean z3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i7, (i12 & 2) != 0 ? 255 : i10, (i12 & 4) != 0 ? IconicsAnimationProcessor.DEFAULT_INTERPOLATOR : timeInterpolator, (i12 & 8) != 0 ? DEFAULT_DURATION : j6, (i12 & 16) != 0 ? -1 : i11, (i12 & 32) != 0 ? b.REVERSE : bVar, (i12 & 64) != 0 ? true : z3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlinkAlphaProcessor(@IntRange(from = 0, to = 255) int i7, @IntRange(from = 0, to = 255) int i10, @NotNull TimeInterpolator interpolator, long j6, int i11, @NotNull b repeatMode, boolean z3) {
        super(interpolator, j6, i11, repeatMode, z3);
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
        this.minimumAlpha = i7;
        this.maximumAlpha = i10;
        this.interpolator = interpolator;
        this.duration = j6;
        this.repeatCount = i11;
        this.repeatMode = repeatMode;
        this.isStartImmediately = z3;
        this.animationTag = "blink_alpha";
    }
}
