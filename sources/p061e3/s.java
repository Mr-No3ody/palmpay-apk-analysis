package p061e3;

import He.a;
import W2.g;
import android.os.Build;
import androidx.camera.core.impl.utils.n;
import androidx.core.util.Pools$Pool;
import androidx.work.impl.model.b;
import com.facebook.common.executors.SerialExecutorService;
import com.facebook.common.internal.Supplier;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.imagepipeline.animated.factory.AnimatedFactory;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.cache.e;
import com.facebook.imagepipeline.cache.f;
import com.facebook.imagepipeline.core.ExecutorSupplier;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.memory.BitmapPool;
import com.facebook.imagepipeline.platform.PlatformDecoder;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;
import p045d3.j;
import p045d3.k;
import p137j3.w;
import p196n3.c;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static s f36098p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static k f36099q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f36100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f36101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f36102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Supplier f36103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CountingMemoryCache f36104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f36105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f36106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f36107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageDecoder f36108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f36109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u f36110k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public x f36111l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p032c3.a f36112m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p151k3.a f36113n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AnimatedFactory f36114o;

    public s(o oVar) {
        p181m3.a.a();
        this.f36101b = oVar;
        r rVar = oVar.f36081z;
        rVar.getClass();
        this.f36100a = new a(oVar.f36066j.f36004d);
        this.f36102c = new b(oVar.f36055B);
        p181m3.a.a();
        this.f36103d = oVar.f36064h;
        if (rVar.f36097i) {
            g.f10548d.getInstance().f10552c = true;
        }
    }

    public static synchronized void h(o oVar) {
        try {
            if (f36098p != null) {
                p229p2.a.s(s.class, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            f36098p = new s(oVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final AnimatedFactory a() {
        if (this.f36114o == null) {
            p032c3.b bVarF = f();
            o oVar = this.f36101b;
            d dVar = oVar.f36066j;
            CountingMemoryCache countingMemoryCacheB = b();
            r rVar = oVar.f36081z;
            rVar.getClass();
            rVar.getClass();
            int i7 = rVar.f36095g;
            rVar.getClass();
            if (!n.f14251c) {
                try {
                    Class cls = Boolean.TYPE;
                    Class cls2 = Integer.TYPE;
                    Constructor constructor = AnimatedFactoryV2Impl.class.getConstructor(p032c3.b.class, ExecutorSupplier.class, CountingMemoryCache.class, cls, cls, cls2, cls2, SerialExecutorService.class);
                    Boolean bool = Boolean.FALSE;
                    Object objNewInstance = constructor.newInstance(bVarF, dVar, countingMemoryCacheB, bool, bool, Integer.valueOf(i7), 1000, null);
                    Intrinsics.f(objNewInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.animated.factory.AnimatedFactory");
                    n.f14252d = (AnimatedFactory) objNewInstance;
                } catch (Throwable unused) {
                }
                if (n.f14252d != null) {
                    n.f14251c = true;
                }
            }
            this.f36114o = n.f14252d;
        }
        return this.f36114o;
    }

    public final CountingMemoryCache b() {
        if (this.f36104e == null) {
            o oVar = this.f36101b;
            com.facebook.imagepipeline.cache.c cVar = oVar.f36056C;
            r rVar = oVar.f36081z;
            rVar.getClass();
            rVar.getClass();
            this.f36104e = cVar.create(oVar.f36058b, oVar.f36072p, oVar.f36059c, false, false, null);
        }
        return this.f36104e;
    }

    public final b c() {
        if (this.f36105f == null) {
            CountingMemoryCache countingMemoryCacheB = b();
            j jVar = this.f36101b.f36067k;
            jVar.getClass();
            this.f36105f = new b(8, countingMemoryCacheB, new p183m6.j(jVar, 17));
        }
        return this.f36105f;
    }

    public final b d() {
        if (this.f36107h == null) {
            o oVar = this.f36101b;
            oVar.getClass();
            if (this.f36106g == null) {
                f fVar = new f(new e(), oVar.f36060d, oVar.f36065i, null, false, false);
                oVar.f36072p.getClass();
                this.f36106g = fVar;
            }
            f fVar2 = this.f36106g;
            j jVar = oVar.f36067k;
            jVar.getClass();
            this.f36107h = new b(8, fVar2, new k(jVar, 21));
        }
        return this.f36107h;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 e3.k, still in use, count: 3, list:
          (r2v0 e3.k) from 0x012c: MOVE (r34v0 e3.k) = (r2v0 e3.k) (LINE:301)
          (r2v0 e3.k) from 0x00ec: MOVE (r34v2 e3.k) = (r2v0 e3.k) (LINE:237)
          (r2v0 e3.k) from 0x00ee: PHI (r34v3 e3.k) = (r34v2 e3.k), (r2v0 e3.k) binds: [B:24:0x00ec, B:23:0x008f] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final p061e3.k e() {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p061e3.s.e():e3.k");
    }

    public final p032c3.b f() {
        if (this.f36112m == null) {
            w poolFactory = this.f36101b.f36075s;
            PlatformDecoder platformDecoder = g();
            Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
            Intrinsics.checkNotNullParameter(platformDecoder, "platformDecoder");
            b closeableReferenceFactory = this.f36102c;
            Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
            BitmapPool bitmapPoolA = poolFactory.a();
            Intrinsics.checkNotNullExpressionValue(bitmapPoolA, "getBitmapPool(...)");
            this.f36112m = new p032c3.a(bitmapPoolA, closeableReferenceFactory);
        }
        return this.f36112m;
    }

    public final PlatformDecoder g() {
        p151k3.a aVar;
        if (this.f36113n == null) {
            o oVar = this.f36101b;
            w poolFactory = oVar.f36075s;
            r rVar = oVar.f36081z;
            rVar.getClass();
            rVar.getClass();
            p045d3.g platformDecoderOptions = rVar.f36096h;
            Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
            Intrinsics.checkNotNullParameter(platformDecoderOptions, "platformDecoderOptions");
            if (Build.VERSION.SDK_INT >= 26) {
                BitmapPool bitmapPool = poolFactory.a();
                Intrinsics.checkNotNullExpressionValue(bitmapPool, "getBitmapPool(...)");
                Pools$Pool decodeBuffers = androidx.camera.core.impl.utils.executor.g.g(poolFactory);
                Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
                Intrinsics.checkNotNullParameter(decodeBuffers, "decodeBuffers");
                Intrinsics.checkNotNullParameter(platformDecoderOptions, "platformDecoderOptions");
                aVar = new p151k3.a(bitmapPool, decodeBuffers, platformDecoderOptions, 1);
            } else {
                BitmapPool bitmapPool2 = poolFactory.a();
                Intrinsics.checkNotNullExpressionValue(bitmapPool2, "getBitmapPool(...)");
                Pools$Pool decodeBuffers2 = androidx.camera.core.impl.utils.executor.g.g(poolFactory);
                Intrinsics.checkNotNullParameter(bitmapPool2, "bitmapPool");
                Intrinsics.checkNotNullParameter(decodeBuffers2, "decodeBuffers");
                Intrinsics.checkNotNullParameter(platformDecoderOptions, "platformDecoderOptions");
                aVar = new p151k3.a(bitmapPool2, decodeBuffers2, platformDecoderOptions, 0);
            }
            this.f36113n = aVar;
        }
        return this.f36113n;
    }
}
