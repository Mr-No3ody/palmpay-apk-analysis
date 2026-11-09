package com.mikepenz.iconics.animation;

import C0.C0127t;
import I5.a;
import I5.b;
import I5.c;
import I5.d;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.animation.LinearInterpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.RequiresApi;
import androidx.startup.Initializer;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mikepenz.iconics.typeface.IconicsInitializer;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1849p;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0002UX\b&\u0018\u0000 m2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002n?J\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u001b\u0010\u0011J\u000f\u0010\u001c\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001c\u0010\u0011J\u0019\u0010!\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J!\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010'0&H\u0016¢\u0006\u0004\b(\u0010)R\"\u0010+\u001a\u00020*8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00109\u001a\u0002088\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010@\u001a\u00020?8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010G\u001a\u00020F8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bG\u0010I\"\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010OR\u0016\u0010P\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010HR\u001e\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u001e\u0010T\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010SR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u001b\u0010]\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0011\u0010^\u001a\u00020F8F¢\u0006\u0006\u001a\u0004\b^\u0010IR\u0011\u0010_\u001a\u00020F8F¢\u0006\u0006\u001a\u0004\b_\u0010IR\u0011\u0010`\u001a\u00020F8G¢\u0006\u0006\u001a\u0004\b`\u0010IR\u0016\u0010d\u001a\u0004\u0018\u00010a8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0016\u0010h\u001a\u0004\u0018\u00010e8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010l\u001a\u00020i8EX\u0084\u0004¢\u0006\u0006\u001a\u0004\bj\u0010k¨\u0006o"}, d2 = {"Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;", "Landroidx/startup/Initializer;", "", ViewProps.START, "()Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;", "Lcom/mikepenz/iconics/animation/IconicsAnimationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "(Lcom/mikepenz/iconics/animation/IconicsAnimationListener;)Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;", "removeListener", "(Lcom/mikepenz/iconics/animation/IconicsAnimationListener;)V", "Lcom/mikepenz/iconics/animation/IconicsAnimationPauseListener;", "addPauseListener", "(Lcom/mikepenz/iconics/animation/IconicsAnimationPauseListener;)Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;", "removePauseListener", "(Lcom/mikepenz/iconics/animation/IconicsAnimationPauseListener;)V", "removeAllListeners", "()V", PPRNBridge.DIALOG_ACTION_CANCEL, ViewProps.END, "reverse", "pause", "resume", "Landroid/graphics/Canvas;", "canvas", "processPostDraw", "(Landroid/graphics/Canvas;)V", "onDrawableAttached", "onDrawableDetached", "LI5/a;", "drawable", "setDrawable$iconics_core", "(LI5/a;)V", "setDrawable", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "Landroid/animation/TimeInterpolator;", "interpolator", "Landroid/animation/TimeInterpolator;", "getInterpolator", "()Landroid/animation/TimeInterpolator;", "setInterpolator", "(Landroid/animation/TimeInterpolator;)V", "", "duration", "J", "getDuration", "()J", "setDuration", "(J)V", "", "repeatCount", "I", "getRepeatCount", "()I", "setRepeatCount", "(I)V", "LI5/b;", "repeatMode", "LI5/b;", "getRepeatMode", "()LI5/b;", "setRepeatMode", "(LI5/b;)V", "", "isStartImmediately", "Z", "()Z", "setStartImmediately", "(Z)V", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", "LI5/a;", "isStartRequested", "", "listeners", "Ljava/util/List;", "pauseListeners", "I5/c", "proxyListener", "LI5/c;", "I5/d", "proxyPauseListener$delegate", "Lkotlin/Lazy;", "getProxyPauseListener", "()LI5/d;", "proxyPauseListener", "isStarted", "isRunning", "isPaused", "", "getDrawableState", "()[I", "drawableState", "Landroid/graphics/Rect;", "getDrawableBounds", "()Landroid/graphics/Rect;", "drawableBounds", "", "getAnimatedPercent", "()F", "animatedPercent", "Companion", "a", "iconics-core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class IconicsAnimationProcessor implements Initializer<Unit> {

    @JvmField
    @NotNull
    public static final LinearInterpolator DEFAULT_INTERPOLATOR = new LinearInterpolator();
    public static final int INFINITE = -1;

    @NotNull
    private final ValueAnimator animator;

    @Nullable
    private a drawable;
    private long duration;

    @NotNull
    private TimeInterpolator interpolator;
    private boolean isStartImmediately;
    private boolean isStartRequested;

    @Nullable
    private List<IconicsAnimationListener> listeners;

    @Nullable
    private List<IconicsAnimationPauseListener> pauseListeners;

    @NotNull
    private final c proxyListener;

    /* JADX INFO: renamed from: proxyPauseListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy proxyPauseListener;
    private int repeatCount;

    @NotNull
    private b repeatMode;

    public IconicsAnimationProcessor(TimeInterpolator interpolator, long j6, int i7, b repeatMode, boolean z3) {
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
        this.interpolator = interpolator;
        this.duration = j6;
        this.repeatCount = i7;
        this.repeatMode = repeatMode;
        this.isStartImmediately = z3;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "ofFloat(0f, 100f)");
        this.animator = valueAnimatorOfFloat;
        this.proxyListener = new c(this);
        this.proxyPauseListener = C2131j.b(new C0127t(this, 3));
    }

    @NotNull
    public final IconicsAnimationProcessor addListener(@NotNull IconicsAnimationListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.listeners == null) {
            this.listeners = new ArrayList();
            this.animator.addListener(this.proxyListener);
        }
        List<IconicsAnimationListener> list = this.listeners;
        if (list != null) {
            list.add(listener);
        }
        return this;
    }

    @RequiresApi(19)
    @NotNull
    public final IconicsAnimationProcessor addPauseListener(@NotNull IconicsAnimationPauseListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.pauseListeners == null) {
            this.pauseListeners = new ArrayList();
            this.animator.addPauseListener((d) this.proxyPauseListener.getValue());
        }
        List<IconicsAnimationPauseListener> list = this.pauseListeners;
        if (list != null) {
            list.add(listener);
        }
        return this;
    }

    public final void cancel() {
        this.animator.cancel();
    }

    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ Unit create(Context context) {
        create2(context);
        return Unit.f38893a;
    }

    @Override // androidx.startup.Initializer
    @NotNull
    public List<Class<? extends Initializer<?>>> dependencies() {
        return C1849p.c(IconicsInitializer.class);
    }

    public final void end() {
        this.animator.end();
    }

    @FloatRange(from = 0.0d, to = 100.0d)
    public final float getAnimatedPercent() {
        Object animatedValue = this.animator.getAnimatedValue();
        Intrinsics.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) animatedValue).floatValue();
    }

    public abstract String getAnimationTag();

    @Nullable
    public final Rect getDrawableBounds() {
        a aVar = this.drawable;
        if (aVar != null) {
            return aVar.getBounds();
        }
        return null;
    }

    @Nullable
    public final int[] getDrawableState() {
        a aVar = this.drawable;
        if (aVar != null) {
            return aVar.getState();
        }
        return null;
    }

    public long getDuration() {
        return this.duration;
    }

    public TimeInterpolator getInterpolator() {
        return this.interpolator;
    }

    public int getRepeatCount() {
        return this.repeatCount;
    }

    public b getRepeatMode() {
        return this.repeatMode;
    }

    @RequiresApi(19)
    public final boolean isPaused() {
        return this.animator.isPaused();
    }

    public final boolean isRunning() {
        return this.animator.isRunning();
    }

    /* JADX INFO: renamed from: isStartImmediately, reason: from getter */
    public boolean getIsStartImmediately() {
        return this.isStartImmediately;
    }

    public final boolean isStarted() {
        return this.animator.isStarted();
    }

    public final void onDrawableAttached() {
    }

    public void onDrawableDetached() {
    }

    @RequiresApi(19)
    public final void pause() {
        this.animator.pause();
    }

    public void processPostDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
    }

    public void processPreDraw(Canvas canvas, H5.c iconBrush, H5.c iconContourBrush, H5.c backgroundBrush, H5.c backgroundContourBrush) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(iconBrush, "iconBrush");
        Intrinsics.checkNotNullParameter(iconContourBrush, "iconContourBrush");
        Intrinsics.checkNotNullParameter(backgroundBrush, "backgroundBrush");
        Intrinsics.checkNotNullParameter(backgroundContourBrush, "backgroundContourBrush");
    }

    public final void removeAllListeners() {
        List<IconicsAnimationListener> list = this.listeners;
        if (list != null) {
            list.clear();
            this.listeners = null;
            this.animator.removeListener(this.proxyListener);
        }
        List<IconicsAnimationPauseListener> list2 = this.pauseListeners;
        if (list2 != null) {
            list2.clear();
            this.pauseListeners = null;
            this.animator.removePauseListener((d) this.proxyPauseListener.getValue());
        }
    }

    public final void removeListener(@NotNull IconicsAnimationListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<IconicsAnimationListener> list = this.listeners;
        if (list != null) {
            list.remove(listener);
        }
        List<IconicsAnimationListener> list2 = this.listeners;
        if (list2 == null || list2.size() != 0) {
            return;
        }
        this.listeners = null;
        this.animator.removeListener(this.proxyListener);
    }

    @RequiresApi(19)
    public final void removePauseListener(@NotNull IconicsAnimationPauseListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<IconicsAnimationPauseListener> list = this.pauseListeners;
        if (list != null) {
            list.remove(listener);
        }
        List<IconicsAnimationPauseListener> list2 = this.pauseListeners;
        if (list2 == null || list2.size() != 0) {
            return;
        }
        this.pauseListeners = null;
        this.animator.removePauseListener((d) this.proxyPauseListener.getValue());
    }

    @RequiresApi(19)
    public final void resume() {
        this.animator.resume();
    }

    public final void reverse() {
        this.animator.reverse();
    }

    public final void setDrawable$iconics_core(@Nullable a drawable) {
        if (this.drawable != null) {
            this.drawable = null;
            onDrawableDetached();
        }
        this.drawable = drawable;
        if (drawable == null) {
            this.animator.cancel();
            return;
        }
        onDrawableAttached();
        if (getIsStartImmediately() || this.isStartRequested) {
            start();
        }
    }

    @NotNull
    public final IconicsAnimationProcessor start() {
        this.animator.setInterpolator(getInterpolator());
        this.animator.setDuration(getDuration());
        this.animator.setRepeatCount(getRepeatCount());
        this.animator.setRepeatMode(getRepeatMode().f4017a);
        if (this.drawable == null) {
            this.isStartRequested = true;
            return this;
        }
        this.isStartRequested = false;
        this.animator.start();
        return this;
    }

    /* JADX INFO: renamed from: create, reason: avoid collision after fix types in other method */
    public void create2(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        HashMap map = H5.b.f3695a;
        Intrinsics.checkNotNullParameter(this, "processor");
        H5.b.f3695a.put(getAnimationTag(), getClass());
    }

    public IconicsAnimationProcessor() {
        this(DEFAULT_INTERPOLATOR, 300L, -1, b.RESTART, true);
    }
}
