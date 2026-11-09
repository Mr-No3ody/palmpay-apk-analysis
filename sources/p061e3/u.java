package p061e3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.core.ExecutorSupplier;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.S;
import com.facebook.imagepipeline.producers.h0;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import p032c3.b;
import p121i2.d;
import p196n3.c;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f36117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f36118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AssetManager f36119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ByteArrayPool f36120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageDecoder f36121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ProgressiveJpegConfig f36122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f36123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f36124h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f36125i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ExecutorSupplier f36126j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final PooledByteBufferFactory f36127k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Supplier f36128l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final MemoryCache f36129m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final MemoryCache f36130n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CacheKeyFactory f36131o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f36132p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f36133q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f36134r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f36135s;

    public u(Context context, ByteArrayPool byteArrayPool, ImageDecoder imageDecoder, ProgressiveJpegConfig progressiveJpegConfig, i iVar, boolean z3, boolean z8, ExecutorSupplier executorSupplier, PooledByteBufferFactory pooledByteBufferFactory, MemoryCache memoryCache, MemoryCache memoryCache2, Supplier supplier, CacheKeyFactory cacheKeyFactory, b bVar, int i7, int i10, boolean z10, int i11, b bVar2, boolean z11, int i12) {
        this.f36117a = context.getApplicationContext().getContentResolver();
        this.f36118b = context.getApplicationContext().getResources();
        this.f36119c = context.getApplicationContext().getAssets();
        this.f36120d = byteArrayPool;
        this.f36121e = imageDecoder;
        this.f36122f = progressiveJpegConfig;
        this.f36123g = iVar;
        this.f36124h = z3;
        this.f36125i = z8;
        this.f36126j = executorSupplier;
        this.f36127k = pooledByteBufferFactory;
        this.f36130n = memoryCache;
        this.f36129m = memoryCache2;
        this.f36128l = supplier;
        this.f36131o = cacheKeyFactory;
        this.f36132p = bVar;
        new d(i12);
        new d(i12);
        this.f36134r = i11;
        this.f36133q = bVar2;
        this.f36135s = z11;
    }

    public final S a() {
        Executor executor = this.f36126j.forLocalStorageRead();
        Intrinsics.checkNotNullParameter(executor, "executor");
        PooledByteBufferFactory pooledByteBufferFactory = this.f36127k;
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        return new S(executor, pooledByteBufferFactory);
    }

    public final h0 b(Producer producer, boolean z3, c cVar) {
        return new h0(this.f36126j.forBackgroundTasks(), this.f36127k, producer, z3, cVar);
    }
}
