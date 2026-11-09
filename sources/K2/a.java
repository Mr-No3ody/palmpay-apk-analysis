package K2;

import B5.c;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.backend.AnimationBackend;
import java.util.concurrent.TimeUnit;
import p180m2.d;

/* JADX INFO: loaded from: classes.dex */
public final class a implements AnimationBackend {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L2.a f4900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RealtimeSinceBootClock f4901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f4902c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L2.a f4905f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4903d = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f4906g = new c(this, 11);

    public a(L2.a aVar, L2.a aVar2, RealtimeSinceBootClock realtimeSinceBootClock, d dVar) {
        this.f4900a = aVar;
        this.f4905f = aVar2;
        this.f4901b = realtimeSinceBootClock;
        this.f4902c = dVar;
    }

    public final synchronized void a() {
        if (!this.f4903d) {
            this.f4903d = true;
            this.f4902c.schedule(this.f4906g, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public final void clear() {
        this.f4900a.clear();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public final boolean drawFrame(Drawable drawable, Canvas canvas, int i7) {
        this.f4904e = this.f4901b.now();
        boolean zDrawFrame = this.f4900a.drawFrame(drawable, canvas, i7);
        a();
        return zDrawFrame;
    }

    @Override // com.facebook.fresco.animation.backend.AnimationInformation
    public final int getFrameCount() {
        return this.f4900a.getFrameCount();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationInformation
    public final int getFrameDurationMs(int i7) {
        return this.f4900a.getFrameDurationMs(i7);
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public final int getIntrinsicHeight() {
        return this.f4900a.f5536o;
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public final int getIntrinsicWidth() {
        return this.f4900a.f5535j;
    }

    @Override // com.facebook.fresco.animation.backend.AnimationInformation
    public final int getLoopCount() {
        return this.f4900a.getLoopCount();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public final int getSizeInBytes() {
        return this.f4900a.f5528b.getSizeInBytes();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public final void setAlpha(int i7) {
        this.f4900a.setAlpha(i7);
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public final void setBounds(Rect rect) {
        this.f4900a.setBounds(rect);
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4900a.setColorFilter(colorFilter);
    }
}
