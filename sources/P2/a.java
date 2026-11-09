package P2;

import B5.c;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.drawable.base.DrawableWithCaches;
import com.facebook.drawee.drawable.d;
import com.facebook.fresco.animation.drawable.AnimationListener;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable implements Animatable, DrawableWithCaches {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Z4.a f6858B = new Z4.a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K2.a f6860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R2.a f6861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f6862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f6864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6866g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f6867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f6868j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6869o;
    public int t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d f6872w;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f6870p = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile AnimationListener f6871v = f6858B;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final c f6859A = new c(this, 15);

    public a(K2.a aVar) {
        this.f6860a = aVar;
        this.f6861b = new R2.a(aVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f6860a == null || this.f6861b == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long jMax = this.f6862c ? jUptimeMillis - this.f6863d : Math.max(this.f6864e, 0L);
        int frameNumberToRender = this.f6861b.getFrameNumberToRender(jMax, this.f6864e);
        if (frameNumberToRender == -1) {
            frameNumberToRender = this.f6860a.f4900a.getFrameCount() - 1;
            this.f6871v.onAnimationStop(this);
            this.f6862c = false;
        } else if (frameNumberToRender == 0 && this.f6866g != -1 && jUptimeMillis >= this.f6865f) {
            this.f6871v.onAnimationRepeat(this);
        }
        boolean zDrawFrame = this.f6860a.drawFrame(this, canvas, frameNumberToRender);
        if (zDrawFrame) {
            this.f6871v.onAnimationFrame(this, frameNumberToRender);
            this.f6866g = frameNumberToRender;
        }
        if (!zDrawFrame) {
            this.t++;
            if (p229p2.a.f41180a.isLoggable(2)) {
                p229p2.a.o(a.class, "Dropped a frame. Count: %s", Integer.valueOf(this.t));
            }
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        if (this.f6862c) {
            long targetRenderTimeForNextFrameMs = this.f6861b.getTargetRenderTimeForNextFrameMs(jUptimeMillis2 - this.f6863d);
            if (targetRenderTimeForNextFrameMs != -1) {
                long j6 = this.f6863d + targetRenderTimeForNextFrameMs + this.f6870p;
                this.f6865f = j6;
                scheduleSelf(this.f6859A, j6);
            } else {
                this.f6871v.onAnimationStop(this);
                this.f6862c = false;
            }
        }
        this.f6864e = jMax;
    }

    @Override // com.facebook.drawable.base.DrawableWithCaches
    public final void dropCaches() {
        K2.a aVar = this.f6860a;
        if (aVar != null) {
            aVar.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        K2.a aVar = this.f6860a;
        return aVar == null ? super.getIntrinsicHeight() : aVar.f4900a.f5536o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        K2.a aVar = this.f6860a;
        return aVar == null ? super.getIntrinsicWidth() : aVar.f4900a.f5535j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f6862c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        K2.a aVar = this.f6860a;
        if (aVar != null) {
            aVar.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        if (this.f6862c) {
            return false;
        }
        long j6 = i7;
        if (this.f6864e == j6) {
            return false;
        }
        this.f6864e = j6;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (this.f6872w == null) {
            this.f6872w = new d();
        }
        this.f6872w.f21229a = i7;
        K2.a aVar = this.f6860a;
        if (aVar != null) {
            aVar.setAlpha(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f6872w == null) {
            this.f6872w = new d();
        }
        d dVar = this.f6872w;
        dVar.f21231c = colorFilter;
        dVar.f21230b = colorFilter != null;
        K2.a aVar = this.f6860a;
        if (aVar != null) {
            aVar.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        K2.a aVar;
        if (this.f6862c || (aVar = this.f6860a) == null || aVar.f4900a.getFrameCount() <= 1) {
            return;
        }
        this.f6862c = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j6 = jUptimeMillis - this.f6867i;
        this.f6863d = j6;
        this.f6865f = j6;
        this.f6864e = jUptimeMillis - this.f6868j;
        this.f6866g = this.f6869o;
        invalidateSelf();
        this.f6871v.onAnimationStart(this);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.f6862c) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.f6867i = jUptimeMillis - this.f6863d;
            this.f6868j = jUptimeMillis - this.f6864e;
            this.f6869o = this.f6866g;
            this.f6862c = false;
            this.f6863d = 0L;
            this.f6865f = 0L;
            this.f6864e = -1L;
            this.f6866g = -1;
            unscheduleSelf(this.f6859A);
            this.f6871v.onAnimationStop(this);
        }
    }
}
