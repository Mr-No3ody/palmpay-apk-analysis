package R2;

import com.facebook.common.time.Clock;
import com.facebook.common.time.MonotonicClock;
import com.facebook.fresco.animation.backend.AnimationBackend;
import com.facebook.fresco.animation.frame.FrameScheduler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a implements FrameScheduler, MonotonicClock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f7912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7913b;

    public a(AnimationBackend animationBackend) {
        this.f7912a = -1L;
        this.f7913b = animationBackend;
    }

    @Override // com.facebook.fresco.animation.frame.FrameScheduler
    public int getFrameNumberToRender(long j6, long j10) {
        long loopDurationMs = getLoopDurationMs();
        long frameDurationMs = 0;
        int i7 = 0;
        AnimationBackend animationBackend = (AnimationBackend) this.f7913b;
        if (loopDurationMs == 0) {
            long frameDurationMs2 = 0;
            while (true) {
                frameDurationMs2 += (long) animationBackend.getFrameDurationMs(i7);
                int i10 = i7 + 1;
                if (0 < frameDurationMs2) {
                    return i7;
                }
                i7 = i10;
            }
        } else {
            if (!isInfiniteAnimation() && j6 / loopDurationMs >= animationBackend.getLoopCount()) {
                return -1;
            }
            long j11 = j6 % loopDurationMs;
            while (true) {
                frameDurationMs += (long) animationBackend.getFrameDurationMs(i7);
                int i11 = i7 + 1;
                if (j11 < frameDurationMs) {
                    return i7;
                }
                i7 = i11;
            }
        }
    }

    @Override // com.facebook.fresco.animation.frame.FrameScheduler
    public long getLoopDurationMs() {
        long j6 = this.f7912a;
        if (j6 != -1) {
            return j6;
        }
        this.f7912a = 0L;
        AnimationBackend animationBackend = (AnimationBackend) this.f7913b;
        int frameCount = animationBackend.getFrameCount();
        for (int i7 = 0; i7 < frameCount; i7++) {
            this.f7912a += (long) animationBackend.getFrameDurationMs(i7);
        }
        return this.f7912a;
    }

    @Override // com.facebook.fresco.animation.frame.FrameScheduler
    public long getTargetRenderTimeForNextFrameMs(long j6) {
        long loopDurationMs = getLoopDurationMs();
        long frameDurationMs = 0;
        if (loopDurationMs == 0) {
            return -1L;
        }
        boolean zIsInfiniteAnimation = isInfiniteAnimation();
        AnimationBackend animationBackend = (AnimationBackend) this.f7913b;
        if (!zIsInfiniteAnimation && j6 / getLoopDurationMs() >= animationBackend.getLoopCount()) {
            return -1L;
        }
        long j10 = j6 % loopDurationMs;
        int frameCount = animationBackend.getFrameCount();
        for (int i7 = 0; i7 < frameCount && frameDurationMs <= j10; i7++) {
            frameDurationMs += (long) animationBackend.getFrameDurationMs(i7);
        }
        return (frameDurationMs - j10) + j6;
    }

    @Override // com.facebook.fresco.animation.frame.FrameScheduler
    public long getTargetRenderTimeMs(int i7) {
        long frameDurationMs = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            frameDurationMs += (long) ((AnimationBackend) this.f7913b).getFrameDurationMs(i7);
        }
        return frameDurationMs;
    }

    @Override // com.facebook.fresco.animation.frame.FrameScheduler
    public boolean isInfiniteAnimation() {
        return ((AnimationBackend) this.f7913b).getLoopCount() == 0;
    }

    @Override // com.facebook.common.time.MonotonicClock
    public long now() {
        long jMax = Math.max(this.f7912a, ((Clock) this.f7913b).now());
        this.f7912a = jMax;
        return jMax;
    }

    @Override // com.facebook.common.time.MonotonicClock
    public long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }

    public a(Clock clock) {
        this.f7913b = clock;
        this.f7912a = clock.now();
    }
}
