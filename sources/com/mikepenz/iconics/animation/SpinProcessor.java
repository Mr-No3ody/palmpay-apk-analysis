package com.mikepenz.iconics.animation;

import H5.c;
import I5.b;
import I5.e;
import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b$\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u0000 C2\u00020\u0001:\u0002D\u0002BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJO\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0007\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\t\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\r\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u00109\u001a\u0004\b\r\u0010:\"\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00109R\u001a\u0010?\u001a\u00020>8\u0016X\u0096D¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lcom/mikepenz/iconics/animation/SpinProcessor;", "Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;", "LI5/e;", "direction", "Landroid/animation/TimeInterpolator;", "interpolator", "", "duration", "", "repeatCount", "LI5/b;", "repeatMode", "", "isStartImmediately", "<init>", "(LI5/e;Landroid/animation/TimeInterpolator;JILI5/b;Z)V", "Landroid/graphics/Canvas;", "canvas", "LH5/c;", "Landroid/text/TextPaint;", "iconBrush", "Landroid/graphics/Paint;", "iconContourBrush", "backgroundBrush", "backgroundContourBrush", "", "processPreDraw", "(Landroid/graphics/Canvas;LH5/c;LH5/c;LH5/c;LH5/c;)V", "processPostDraw", "(Landroid/graphics/Canvas;)V", "onDrawableDetached", "()V", "LI5/e;", "getDirection", "()LI5/e;", "setDirection", "(LI5/e;)V", "Landroid/animation/TimeInterpolator;", "getInterpolator", "()Landroid/animation/TimeInterpolator;", "setInterpolator", "(Landroid/animation/TimeInterpolator;)V", "J", "getDuration", "()J", "setDuration", "(J)V", "I", "getRepeatCount", "()I", "setRepeatCount", "(I)V", "LI5/b;", "getRepeatMode", "()LI5/b;", "setRepeatMode", "(LI5/b;)V", "Z", "()Z", "setStartImmediately", "(Z)V", "isDrawableShadowCleared", "", "animationTag", "Ljava/lang/String;", "getAnimationTag", "()Ljava/lang/String;", "Companion", "a", "iconics-core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class SpinProcessor extends IconicsAnimationProcessor {

    @JvmField
    public static long DEFAULT_DURATION = 2000;

    @NotNull
    private final String animationTag;

    @NotNull
    private e direction;
    private long duration;

    @NotNull
    private TimeInterpolator interpolator;
    private boolean isDrawableShadowCleared;
    private boolean isStartImmediately;
    private int repeatCount;

    @NotNull
    private b repeatMode;

    public SpinProcessor() {
        this(null, null, 0L, 0, null, false, 63, null);
    }

    @Override // com.mikepenz.iconics.animation.IconicsAnimationProcessor
    @NotNull
    public String getAnimationTag() {
        return this.animationTag;
    }

    @NotNull
    public e getDirection() {
        return this.direction;
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
    public void onDrawableDetached() {
        this.isDrawableShadowCleared = false;
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
        if (!this.isDrawableShadowCleared) {
            ((TextPaint) iconBrush.f3699a).clearShadowLayer();
            this.isDrawableShadowCleared = true;
        }
        canvas.save();
        Rect drawableBounds = getDrawableBounds();
        float animatedPercent = getAnimatedPercent() * 3.6f * getDirection().f4022a;
        if (drawableBounds != null) {
            canvas.rotate(animatedPercent, drawableBounds.width() / 2, drawableBounds.height() / 2);
        }
    }

    public void setDirection(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.direction = eVar;
    }

    public void setDuration(long j6) {
        this.duration = j6;
    }

    public void setInterpolator(@NotNull TimeInterpolator timeInterpolator) {
        Intrinsics.checkNotNullParameter(timeInterpolator, "<set-?>");
        this.interpolator = timeInterpolator;
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

    public /* synthetic */ SpinProcessor(e eVar, TimeInterpolator timeInterpolator, long j6, int i7, b bVar, boolean z3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? e.CLOCKWISE : eVar, (i10 & 2) != 0 ? IconicsAnimationProcessor.DEFAULT_INTERPOLATOR : timeInterpolator, (i10 & 4) != 0 ? DEFAULT_DURATION : j6, (i10 & 8) != 0 ? -1 : i7, (i10 & 16) != 0 ? b.RESTART : bVar, (i10 & 32) != 0 ? true : z3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpinProcessor(@NotNull e direction, @NotNull TimeInterpolator interpolator, long j6, int i7, @NotNull b repeatMode, boolean z3) {
        super(interpolator, j6, i7, repeatMode, z3);
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
        this.direction = direction;
        this.interpolator = interpolator;
        this.duration = j6;
        this.repeatCount = i7;
        this.repeatMode = repeatMode;
        this.isStartImmediately = z3;
        this.animationTag = "spin";
    }
}
