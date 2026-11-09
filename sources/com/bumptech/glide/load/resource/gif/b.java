package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p045d3.k;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ResourceDecoder {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f20973f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f20974g = new k((byte) 0, 18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f20977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f20978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f20979e;

    public b(Context context, ArrayList arrayList, BitmapPool bitmapPool, com.bumptech.glide.load.engine.bitmap_recycle.f fVar) {
        a aVar = f20973f;
        this.f20975a = context.getApplicationContext();
        this.f20976b = arrayList;
        this.f20978d = aVar;
        this.f20979e = new c(bitmapPool, fVar);
        this.f20977c = f20974g;
    }

    public final C1.d a(ByteBuffer byteBuffer, int i7, int i10, p332w1.c cVar, com.bumptech.glide.load.h hVar) {
        boolean zIsLoggable;
        int i11 = J1.i.f4465a;
        SystemClock.elapsedRealtimeNanos();
        try {
            p332w1.b bVarB = cVar.b();
            if (bVarB.f43240c > 0 && bVarB.f43239b == 0) {
                Bitmap.Config config = hVar.a(i.f21016a) == com.bumptech.glide.load.b.f20515b ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iMin = Math.min(bVarB.f43244g / i10, bVarB.f43243f / i7);
                int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
                a aVar = this.f20978d;
                c cVar2 = this.f20979e;
                aVar.getClass();
                com.bumptech.glide.gifdecoder.a aVar2 = new com.bumptech.glide.gifdecoder.a(cVar2, bVarB, byteBuffer, iMax);
                aVar2.setDefaultBitmapConfig(config);
                aVar2.advance();
                Bitmap nextFrame = aVar2.getNextFrame();
                if (nextFrame != null) {
                    return new C1.d(new d(new androidx.vectordrawable.graphics.drawable.f(new h(com.bumptech.glide.b.b(this.f20975a), aVar2, i7, i10, nextFrame), 1)), 1);
                }
                if (zIsLoggable) {
                    return null;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:24:0x003c
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // com.bumptech.glide.load.ResourceDecoder
    public final com.bumptech.glide.load.engine.Resource decode(java.lang.Object r8, int r9, int r10, com.bumptech.glide.load.h r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            d3.k r8 = r7.f20977c
            monitor-enter(r8)
            java.lang.Object r0 = r8.f35518b     // Catch: java.lang.Throwable -> L37
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> L37
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L37
            w1.c r0 = (p332w1.c) r0     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L17
            w1.c r0 = new w1.c     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
        L17:
            r5 = r0
            goto L1d
        L19:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L3a
        L1d:
            r5.f(r2)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            C1.d r8 = r1.a(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2f
            d3.k r9 = r1.f20977c
            r9.k(r5)
            return r8
        L2f:
            r0 = move-exception
            r8 = r0
            d3.k r9 = r1.f20977c
            r9.k(r5)
            throw r8
        L37:
            r0 = move-exception
            r1 = r7
        L39:
            r9 = r0
        L3a:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3c
            throw r9
        L3c:
            r0 = move-exception
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.gif.b.decode(java.lang.Object, int, int, com.bumptech.glide.load.h):com.bumptech.glide.load.engine.Resource");
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean handles(Object obj, com.bumptech.glide.load.h hVar) {
        return !((Boolean) hVar.a(i.f21017b)).booleanValue() && com.bumptech.glide.load.e.c(this.f20976b, (ByteBuffer) obj) == ImageHeaderParser.ImageType.GIF;
    }
}
