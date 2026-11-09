package com.facebook.fresco.animation.factory;

import Ab.r;
import android.content.Context;
import androidx.camera.camera2.internal.P0;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.executors.SerialExecutorService;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.animated.factory.AnimatedFactory;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.core.ExecutorSupplier;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.concurrent.NotThreadSafe;
import p032c3.b;
import p180m2.d;
import p245q3.a;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
@NotThreadSafe
@Nullsafe(a.f41451a)
public class AnimatedFactoryV2Impl implements AnimatedFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f21341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorSupplier f21342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CountingMemoryCache f21343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Y2.a f21345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Oe.a f21346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.growingio.android.debugger.a f21347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public P0 f21348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SerialExecutorService f21349i;

    @DoNotStrip
    public AnimatedFactoryV2Impl(b platformBitmapFactory, ExecutorSupplier executorSupplier, CountingMemoryCache<CacheKey, CloseableImage> backingCache, boolean downscaleFrameToDrawableDimensions, SerialExecutorService serialExecutorServiceForFramePreparing) {
        this.f21341a = platformBitmapFactory;
        this.f21342b = executorSupplier;
        this.f21343c = backingCache;
        this.f21344d = downscaleFrameToDrawableDimensions;
        this.f21349i = serialExecutorServiceForFramePreparing;
    }

    @Override // com.facebook.imagepipeline.animated.factory.AnimatedFactory
    public final DrawableFactory getAnimatedDrawableFactory(Context context) {
        if (this.f21348h == null) {
            new Q2.a(0);
            Object bVar = this.f21349i;
            if (bVar == null) {
                bVar = new p180m2.b(this.f21342b.forDecode());
            }
            new Q2.a(1);
            if (this.f21346f == null) {
                this.f21346f = new Oe.a(this, 7);
            }
            Oe.a aVar = this.f21346f;
            d dVarB = d.b();
            RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.get();
            b bVar2 = this.f21341a;
            CountingMemoryCache countingMemoryCache = this.f21343c;
            P0 p3 = new P0();
            p3.f13246a = aVar;
            p3.f13247b = dVarB;
            p3.f13248c = bVar;
            p3.f13249d = realtimeSinceBootClock;
            p3.f13250e = bVar2;
            p3.f13251f = countingMemoryCache;
            this.f21348h = p3;
        }
        return this.f21348h;
    }

    @Override // com.facebook.imagepipeline.animated.factory.AnimatedFactory
    public final ImageDecoder getGifDecoder() {
        return new C2085k0(this, 7);
    }

    @Override // com.facebook.imagepipeline.animated.factory.AnimatedFactory
    public final ImageDecoder getWebPDecoder() {
        return new r(this, 5);
    }
}
