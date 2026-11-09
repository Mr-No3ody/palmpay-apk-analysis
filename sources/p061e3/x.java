package p061e3;

import C0.G;
import He.a;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.core.ExecutorSupplier;
import com.facebook.imagepipeline.producers.C1337b;
import com.facebook.imagepipeline.producers.C1343h;
import com.facebook.imagepipeline.producers.C1344i;
import com.facebook.imagepipeline.producers.C1346k;
import com.facebook.imagepipeline.producers.C1348m;
import com.facebook.imagepipeline.producers.C1353s;
import com.facebook.imagepipeline.producers.C1357w;
import com.facebook.imagepipeline.producers.I;
import com.facebook.imagepipeline.producers.K;
import com.facebook.imagepipeline.producers.L;
import com.facebook.imagepipeline.producers.N;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.producers.P;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.S;
import com.facebook.imagepipeline.producers.ThumbnailProducer;
import com.facebook.imagepipeline.producers.U;
import com.facebook.imagepipeline.producers.W;
import com.facebook.imagepipeline.producers.b0;
import com.facebook.imagepipeline.producers.f0;
import com.facebook.imagepipeline.producers.h0;
import com.facebook.imagepipeline.producers.l0;
import com.facebook.imagepipeline.producers.n0;
import com.facebook.imagepipeline.request.d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import p196n3.c;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final w f36138z = new w(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f36139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f36140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NetworkFetcher f36141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f36142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f36143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f36144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f36145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f36146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set f36147i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f36148j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f36149k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f36150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f36151m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f36152n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f36153o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f36154p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f36155q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f36156r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t f36157s;
    public final t t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final t f36158u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f36159v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f36160w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t f36161x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final t f36162y;

    public x(ContentResolver contentResolver, u producerFactory, NetworkFetcher networkFetcher, boolean z3, a threadHandoffProducerQueue, i downsampleMode, boolean z8, c imageTranscoderFactory, Set set) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(producerFactory, "producerFactory");
        Intrinsics.checkNotNullParameter(networkFetcher, "networkFetcher");
        Intrinsics.checkNotNullParameter(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        Intrinsics.checkNotNullParameter(downsampleMode, "downsampleMode");
        Intrinsics.checkNotNullParameter(imageTranscoderFactory, "imageTranscoderFactory");
        this.f36139a = contentResolver;
        this.f36140b = producerFactory;
        this.f36141c = networkFetcher;
        this.f36142d = z3;
        this.f36143e = threadHandoffProducerQueue;
        this.f36144f = downsampleMode;
        this.f36145g = z8;
        this.f36146h = imageTranscoderFactory;
        this.f36147i = set;
        this.f36148j = new LinkedHashMap();
        new LinkedHashMap();
        new LinkedHashMap();
        final int i7 = 0;
        C2131j.b(new Function0(this) { // from class: e3.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f36137b;

            {
                this.f36137b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                h0 h0VarB;
                boolean z10 = true;
                switch (i7) {
                    case 0:
                        x this$0 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$0.b());
                    case 1:
                        x this$1 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        p181m3.a.a();
                        Object value = this$1.f36155q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new C1337b((Producer) value);
                    case 2:
                        x this$2 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        p181m3.a.a();
                        return this$2.h((Producer) this$2.f36152n.getValue());
                    case 3:
                        x this$3 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        p181m3.a.a();
                        u uVar = this$3.f36140b;
                        Producer producer = (Producer) this$3.f36152n.getValue();
                        uVar.getClass();
                        return new l0(producer, this$3.f36143e);
                    case 4:
                        x this$4 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        p181m3.a.a();
                        u uVar2 = this$4.f36140b;
                        Producer producerB = this$4.b();
                        uVar2.getClass();
                        return new C1337b(producerB, 2);
                    case 5:
                        x this$5 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        p181m3.a.a();
                        NetworkFetcher networkFetcher2 = this$5.f36141c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                p181m3.a.a();
                                u uVar3 = this$5.f36140b;
                                b0 b0Var = new b0(uVar3.f36127k, uVar3.f36120d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(b0Var, "newNetworkFetchProducer(...)");
                                C1337b c1337b = new C1337b(this$5.j(b0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(c1337b, "newAddImageTransformMetaDataProducer(...)");
                                u uVar4 = this$5.f36140b;
                                if (!this$5.f36142d || this$5.f36144f == i.f36028c) {
                                    z10 = false;
                                }
                                h0VarB = uVar4.b(c1337b, z10, this$5.f36146h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return h0VarB;
                    case 6:
                        x this$6 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        p181m3.a.a();
                        u uVar5 = this$6.f36140b;
                        Producer producerA = this$6.a();
                        uVar5.getClass();
                        return new C1337b(producerA, 2);
                    case 7:
                        x this$7 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        p181m3.a.a();
                        S sA = this$7.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA, "newLocalFileFetchProducer(...)");
                        C1344i c1344iJ = this$7.j(sA);
                        this$7.f36140b.getClass();
                        return new l0(c1344iJ, this$7.f36143e);
                    case 8:
                        x this$8 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        p181m3.a.a();
                        u uVar6 = this$8.f36140b;
                        uVar6.getClass();
                        K k2 = new K(uVar6.f36126j.forLocalStorageRead(), uVar6.f36127k, uVar6.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k2, "newLocalContentUriFetchProducer(...)");
                        C1344i c1344iJ2 = this$8.j(k2);
                        this$8.f36140b.getClass();
                        return new l0(c1344iJ2, this$8.f36143e);
                    case 9:
                        x this$9 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        S sA2 = this$9.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA2, "newLocalFileFetchProducer(...)");
                        u uVar7 = this$9.f36140b;
                        return this$9.i(sA2, new ThumbnailProducer[]{new N(uVar7.f36126j.forThumbnailProducer(), uVar7.f36127k, uVar7.f36117a)});
                    case 10:
                        x this$10 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        u uVar8 = this$10.f36140b;
                        W w3 = new W(1, uVar8.f36126j.forLocalStorageRead(), uVar8.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w3, "newLocalVideoThumbnailProducer(...)");
                        return this$10.g(w3);
                    case 11:
                        x this$11 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        u uVar9 = this$11.f36140b;
                        uVar9.getClass();
                        K k8 = new K(uVar9.f36126j.forLocalStorageRead(), uVar9.f36127k, uVar9.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k8, "newLocalContentUriFetchProducer(...)");
                        u uVar10 = this$11.f36140b;
                        uVar10.getClass();
                        ExecutorSupplier executorSupplier = uVar10.f36126j;
                        Executor executorForLocalStorageRead = executorSupplier.forLocalStorageRead();
                        ContentResolver contentResolver2 = uVar10.f36117a;
                        PooledByteBufferFactory pooledByteBufferFactory = uVar10.f36127k;
                        return this$11.i(k8, new ThumbnailProducer[]{new L(executorForLocalStorageRead, pooledByteBufferFactory, contentResolver2), new N(executorSupplier.forThumbnailProducer(), pooledByteBufferFactory, uVar10.f36117a)});
                    case 12:
                        x this$12 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        u uVar11 = this$12.f36140b;
                        W w6 = new W(0, uVar11.f36126j.forBackgroundTasks(), uVar11.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w6, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.g(w6);
                    case 13:
                        x this$13 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        u uVar12 = this$13.f36140b;
                        uVar12.getClass();
                        f0 f0Var = new f0(uVar12.f36126j.forLocalStorageRead(), uVar12.f36127k, uVar12.f36117a);
                        Intrinsics.checkNotNullExpressionValue(f0Var, "newQualifiedResourceFetchProducer(...)");
                        u uVar13 = this$13.f36140b;
                        return this$13.i(f0Var, new ThumbnailProducer[]{new N(uVar13.f36126j.forThumbnailProducer(), uVar13.f36127k, uVar13.f36117a)});
                    case 14:
                        x this$14 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        u uVar14 = this$14.f36140b;
                        uVar14.getClass();
                        U u6 = new U(uVar14.f36126j.forLocalStorageRead(), uVar14.f36127k, uVar14.f36118b);
                        Intrinsics.checkNotNullExpressionValue(u6, "newLocalResourceFetchProducer(...)");
                        u uVar15 = this$14.f36140b;
                        return this$14.i(u6, new ThumbnailProducer[]{new N(uVar15.f36126j.forThumbnailProducer(), uVar15.f36127k, uVar15.f36117a)});
                    case 15:
                        x this$15 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        u uVar16 = this$15.f36140b;
                        uVar16.getClass();
                        I i10 = new I(uVar16.f36126j.forLocalStorageRead(), uVar16.f36127k, uVar16.f36119c);
                        Intrinsics.checkNotNullExpressionValue(i10, "newLocalAssetFetchProducer(...)");
                        u uVar17 = this$15.f36140b;
                        return this$15.i(i10, new ThumbnailProducer[]{new N(uVar17.f36126j.forThumbnailProducer(), uVar17.f36127k, uVar17.f36117a)});
                    case 16:
                        x this$16 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        u uVar18 = this$16.f36140b;
                        uVar18.getClass();
                        C1348m c1348m = new C1348m(p180m2.a.f39461a, uVar18.f36127k);
                        Intrinsics.checkNotNullExpressionValue(c1348m, "newDataFetchProducer(...)");
                        return this$16.h(this$16.f36140b.b(new C1337b(c1348m, 0), true, this$16.f36146h));
                    default:
                        x this$17 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$17.a());
                }
            }
        });
        final int i10 = 17;
        C2131j.b(new Function0(this) { // from class: e3.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f36137b;

            {
                this.f36137b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                h0 h0VarB;
                boolean z10 = true;
                switch (i10) {
                    case 0:
                        x this$0 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$0.b());
                    case 1:
                        x this$1 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        p181m3.a.a();
                        Object value = this$1.f36155q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new C1337b((Producer) value);
                    case 2:
                        x this$2 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        p181m3.a.a();
                        return this$2.h((Producer) this$2.f36152n.getValue());
                    case 3:
                        x this$3 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        p181m3.a.a();
                        u uVar = this$3.f36140b;
                        Producer producer = (Producer) this$3.f36152n.getValue();
                        uVar.getClass();
                        return new l0(producer, this$3.f36143e);
                    case 4:
                        x this$4 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        p181m3.a.a();
                        u uVar2 = this$4.f36140b;
                        Producer producerB = this$4.b();
                        uVar2.getClass();
                        return new C1337b(producerB, 2);
                    case 5:
                        x this$5 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        p181m3.a.a();
                        NetworkFetcher networkFetcher2 = this$5.f36141c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                p181m3.a.a();
                                u uVar3 = this$5.f36140b;
                                b0 b0Var = new b0(uVar3.f36127k, uVar3.f36120d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(b0Var, "newNetworkFetchProducer(...)");
                                C1337b c1337b = new C1337b(this$5.j(b0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(c1337b, "newAddImageTransformMetaDataProducer(...)");
                                u uVar4 = this$5.f36140b;
                                if (!this$5.f36142d || this$5.f36144f == i.f36028c) {
                                    z10 = false;
                                }
                                h0VarB = uVar4.b(c1337b, z10, this$5.f36146h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return h0VarB;
                    case 6:
                        x this$6 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        p181m3.a.a();
                        u uVar5 = this$6.f36140b;
                        Producer producerA = this$6.a();
                        uVar5.getClass();
                        return new C1337b(producerA, 2);
                    case 7:
                        x this$7 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        p181m3.a.a();
                        S sA = this$7.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA, "newLocalFileFetchProducer(...)");
                        C1344i c1344iJ = this$7.j(sA);
                        this$7.f36140b.getClass();
                        return new l0(c1344iJ, this$7.f36143e);
                    case 8:
                        x this$8 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        p181m3.a.a();
                        u uVar6 = this$8.f36140b;
                        uVar6.getClass();
                        K k2 = new K(uVar6.f36126j.forLocalStorageRead(), uVar6.f36127k, uVar6.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k2, "newLocalContentUriFetchProducer(...)");
                        C1344i c1344iJ2 = this$8.j(k2);
                        this$8.f36140b.getClass();
                        return new l0(c1344iJ2, this$8.f36143e);
                    case 9:
                        x this$9 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        S sA2 = this$9.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA2, "newLocalFileFetchProducer(...)");
                        u uVar7 = this$9.f36140b;
                        return this$9.i(sA2, new ThumbnailProducer[]{new N(uVar7.f36126j.forThumbnailProducer(), uVar7.f36127k, uVar7.f36117a)});
                    case 10:
                        x this$10 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        u uVar8 = this$10.f36140b;
                        W w3 = new W(1, uVar8.f36126j.forLocalStorageRead(), uVar8.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w3, "newLocalVideoThumbnailProducer(...)");
                        return this$10.g(w3);
                    case 11:
                        x this$11 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        u uVar9 = this$11.f36140b;
                        uVar9.getClass();
                        K k8 = new K(uVar9.f36126j.forLocalStorageRead(), uVar9.f36127k, uVar9.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k8, "newLocalContentUriFetchProducer(...)");
                        u uVar10 = this$11.f36140b;
                        uVar10.getClass();
                        ExecutorSupplier executorSupplier = uVar10.f36126j;
                        Executor executorForLocalStorageRead = executorSupplier.forLocalStorageRead();
                        ContentResolver contentResolver2 = uVar10.f36117a;
                        PooledByteBufferFactory pooledByteBufferFactory = uVar10.f36127k;
                        return this$11.i(k8, new ThumbnailProducer[]{new L(executorForLocalStorageRead, pooledByteBufferFactory, contentResolver2), new N(executorSupplier.forThumbnailProducer(), pooledByteBufferFactory, uVar10.f36117a)});
                    case 12:
                        x this$12 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        u uVar11 = this$12.f36140b;
                        W w6 = new W(0, uVar11.f36126j.forBackgroundTasks(), uVar11.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w6, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.g(w6);
                    case 13:
                        x this$13 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        u uVar12 = this$13.f36140b;
                        uVar12.getClass();
                        f0 f0Var = new f0(uVar12.f36126j.forLocalStorageRead(), uVar12.f36127k, uVar12.f36117a);
                        Intrinsics.checkNotNullExpressionValue(f0Var, "newQualifiedResourceFetchProducer(...)");
                        u uVar13 = this$13.f36140b;
                        return this$13.i(f0Var, new ThumbnailProducer[]{new N(uVar13.f36126j.forThumbnailProducer(), uVar13.f36127k, uVar13.f36117a)});
                    case 14:
                        x this$14 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        u uVar14 = this$14.f36140b;
                        uVar14.getClass();
                        U u6 = new U(uVar14.f36126j.forLocalStorageRead(), uVar14.f36127k, uVar14.f36118b);
                        Intrinsics.checkNotNullExpressionValue(u6, "newLocalResourceFetchProducer(...)");
                        u uVar15 = this$14.f36140b;
                        return this$14.i(u6, new ThumbnailProducer[]{new N(uVar15.f36126j.forThumbnailProducer(), uVar15.f36127k, uVar15.f36117a)});
                    case 15:
                        x this$15 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        u uVar16 = this$15.f36140b;
                        uVar16.getClass();
                        I i11 = new I(uVar16.f36126j.forLocalStorageRead(), uVar16.f36127k, uVar16.f36119c);
                        Intrinsics.checkNotNullExpressionValue(i11, "newLocalAssetFetchProducer(...)");
                        u uVar17 = this$15.f36140b;
                        return this$15.i(i11, new ThumbnailProducer[]{new N(uVar17.f36126j.forThumbnailProducer(), uVar17.f36127k, uVar17.f36117a)});
                    case 16:
                        x this$16 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        u uVar18 = this$16.f36140b;
                        uVar18.getClass();
                        C1348m c1348m = new C1348m(p180m2.a.f39461a, uVar18.f36127k);
                        Intrinsics.checkNotNullExpressionValue(c1348m, "newDataFetchProducer(...)");
                        return this$16.h(this$16.f36140b.b(new C1337b(c1348m, 0), true, this$16.f36146h));
                    default:
                        x this$17 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$17.a());
                }
            }
        });
        final int i11 = 1;
        C2131j.b(new Function0(this) { // from class: e3.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f36137b;

            {
                this.f36137b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                h0 h0VarB;
                boolean z10 = true;
                switch (i11) {
                    case 0:
                        x this$0 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$0.b());
                    case 1:
                        x this$1 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        p181m3.a.a();
                        Object value = this$1.f36155q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new C1337b((Producer) value);
                    case 2:
                        x this$2 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        p181m3.a.a();
                        return this$2.h((Producer) this$2.f36152n.getValue());
                    case 3:
                        x this$3 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        p181m3.a.a();
                        u uVar = this$3.f36140b;
                        Producer producer = (Producer) this$3.f36152n.getValue();
                        uVar.getClass();
                        return new l0(producer, this$3.f36143e);
                    case 4:
                        x this$4 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        p181m3.a.a();
                        u uVar2 = this$4.f36140b;
                        Producer producerB = this$4.b();
                        uVar2.getClass();
                        return new C1337b(producerB, 2);
                    case 5:
                        x this$5 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        p181m3.a.a();
                        NetworkFetcher networkFetcher2 = this$5.f36141c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                p181m3.a.a();
                                u uVar3 = this$5.f36140b;
                                b0 b0Var = new b0(uVar3.f36127k, uVar3.f36120d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(b0Var, "newNetworkFetchProducer(...)");
                                C1337b c1337b = new C1337b(this$5.j(b0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(c1337b, "newAddImageTransformMetaDataProducer(...)");
                                u uVar4 = this$5.f36140b;
                                if (!this$5.f36142d || this$5.f36144f == i.f36028c) {
                                    z10 = false;
                                }
                                h0VarB = uVar4.b(c1337b, z10, this$5.f36146h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return h0VarB;
                    case 6:
                        x this$6 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        p181m3.a.a();
                        u uVar5 = this$6.f36140b;
                        Producer producerA = this$6.a();
                        uVar5.getClass();
                        return new C1337b(producerA, 2);
                    case 7:
                        x this$7 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        p181m3.a.a();
                        S sA = this$7.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA, "newLocalFileFetchProducer(...)");
                        C1344i c1344iJ = this$7.j(sA);
                        this$7.f36140b.getClass();
                        return new l0(c1344iJ, this$7.f36143e);
                    case 8:
                        x this$8 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        p181m3.a.a();
                        u uVar6 = this$8.f36140b;
                        uVar6.getClass();
                        K k2 = new K(uVar6.f36126j.forLocalStorageRead(), uVar6.f36127k, uVar6.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k2, "newLocalContentUriFetchProducer(...)");
                        C1344i c1344iJ2 = this$8.j(k2);
                        this$8.f36140b.getClass();
                        return new l0(c1344iJ2, this$8.f36143e);
                    case 9:
                        x this$9 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        S sA2 = this$9.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA2, "newLocalFileFetchProducer(...)");
                        u uVar7 = this$9.f36140b;
                        return this$9.i(sA2, new ThumbnailProducer[]{new N(uVar7.f36126j.forThumbnailProducer(), uVar7.f36127k, uVar7.f36117a)});
                    case 10:
                        x this$10 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        u uVar8 = this$10.f36140b;
                        W w3 = new W(1, uVar8.f36126j.forLocalStorageRead(), uVar8.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w3, "newLocalVideoThumbnailProducer(...)");
                        return this$10.g(w3);
                    case 11:
                        x this$11 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        u uVar9 = this$11.f36140b;
                        uVar9.getClass();
                        K k8 = new K(uVar9.f36126j.forLocalStorageRead(), uVar9.f36127k, uVar9.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k8, "newLocalContentUriFetchProducer(...)");
                        u uVar10 = this$11.f36140b;
                        uVar10.getClass();
                        ExecutorSupplier executorSupplier = uVar10.f36126j;
                        Executor executorForLocalStorageRead = executorSupplier.forLocalStorageRead();
                        ContentResolver contentResolver2 = uVar10.f36117a;
                        PooledByteBufferFactory pooledByteBufferFactory = uVar10.f36127k;
                        return this$11.i(k8, new ThumbnailProducer[]{new L(executorForLocalStorageRead, pooledByteBufferFactory, contentResolver2), new N(executorSupplier.forThumbnailProducer(), pooledByteBufferFactory, uVar10.f36117a)});
                    case 12:
                        x this$12 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        u uVar11 = this$12.f36140b;
                        W w6 = new W(0, uVar11.f36126j.forBackgroundTasks(), uVar11.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w6, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.g(w6);
                    case 13:
                        x this$13 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        u uVar12 = this$13.f36140b;
                        uVar12.getClass();
                        f0 f0Var = new f0(uVar12.f36126j.forLocalStorageRead(), uVar12.f36127k, uVar12.f36117a);
                        Intrinsics.checkNotNullExpressionValue(f0Var, "newQualifiedResourceFetchProducer(...)");
                        u uVar13 = this$13.f36140b;
                        return this$13.i(f0Var, new ThumbnailProducer[]{new N(uVar13.f36126j.forThumbnailProducer(), uVar13.f36127k, uVar13.f36117a)});
                    case 14:
                        x this$14 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        u uVar14 = this$14.f36140b;
                        uVar14.getClass();
                        U u6 = new U(uVar14.f36126j.forLocalStorageRead(), uVar14.f36127k, uVar14.f36118b);
                        Intrinsics.checkNotNullExpressionValue(u6, "newLocalResourceFetchProducer(...)");
                        u uVar15 = this$14.f36140b;
                        return this$14.i(u6, new ThumbnailProducer[]{new N(uVar15.f36126j.forThumbnailProducer(), uVar15.f36127k, uVar15.f36117a)});
                    case 15:
                        x this$15 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        u uVar16 = this$15.f36140b;
                        uVar16.getClass();
                        I i12 = new I(uVar16.f36126j.forLocalStorageRead(), uVar16.f36127k, uVar16.f36119c);
                        Intrinsics.checkNotNullExpressionValue(i12, "newLocalAssetFetchProducer(...)");
                        u uVar17 = this$15.f36140b;
                        return this$15.i(i12, new ThumbnailProducer[]{new N(uVar17.f36126j.forThumbnailProducer(), uVar17.f36127k, uVar17.f36117a)});
                    case 16:
                        x this$16 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        u uVar18 = this$16.f36140b;
                        uVar18.getClass();
                        C1348m c1348m = new C1348m(p180m2.a.f39461a, uVar18.f36127k);
                        Intrinsics.checkNotNullExpressionValue(c1348m, "newDataFetchProducer(...)");
                        return this$16.h(this$16.f36140b.b(new C1337b(c1348m, 0), true, this$16.f36146h));
                    default:
                        x this$17 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$17.a());
                }
            }
        });
        final int i12 = 2;
        this.f36149k = C2131j.b(new Function0(this) { // from class: e3.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f36137b;

            {
                this.f36137b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                h0 h0VarB;
                boolean z10 = true;
                switch (i12) {
                    case 0:
                        x this$0 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$0.b());
                    case 1:
                        x this$1 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        p181m3.a.a();
                        Object value = this$1.f36155q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new C1337b((Producer) value);
                    case 2:
                        x this$2 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        p181m3.a.a();
                        return this$2.h((Producer) this$2.f36152n.getValue());
                    case 3:
                        x this$3 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        p181m3.a.a();
                        u uVar = this$3.f36140b;
                        Producer producer = (Producer) this$3.f36152n.getValue();
                        uVar.getClass();
                        return new l0(producer, this$3.f36143e);
                    case 4:
                        x this$4 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        p181m3.a.a();
                        u uVar2 = this$4.f36140b;
                        Producer producerB = this$4.b();
                        uVar2.getClass();
                        return new C1337b(producerB, 2);
                    case 5:
                        x this$5 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        p181m3.a.a();
                        NetworkFetcher networkFetcher2 = this$5.f36141c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                p181m3.a.a();
                                u uVar3 = this$5.f36140b;
                                b0 b0Var = new b0(uVar3.f36127k, uVar3.f36120d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(b0Var, "newNetworkFetchProducer(...)");
                                C1337b c1337b = new C1337b(this$5.j(b0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(c1337b, "newAddImageTransformMetaDataProducer(...)");
                                u uVar4 = this$5.f36140b;
                                if (!this$5.f36142d || this$5.f36144f == i.f36028c) {
                                    z10 = false;
                                }
                                h0VarB = uVar4.b(c1337b, z10, this$5.f36146h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return h0VarB;
                    case 6:
                        x this$6 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        p181m3.a.a();
                        u uVar5 = this$6.f36140b;
                        Producer producerA = this$6.a();
                        uVar5.getClass();
                        return new C1337b(producerA, 2);
                    case 7:
                        x this$7 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        p181m3.a.a();
                        S sA = this$7.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA, "newLocalFileFetchProducer(...)");
                        C1344i c1344iJ = this$7.j(sA);
                        this$7.f36140b.getClass();
                        return new l0(c1344iJ, this$7.f36143e);
                    case 8:
                        x this$8 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        p181m3.a.a();
                        u uVar6 = this$8.f36140b;
                        uVar6.getClass();
                        K k2 = new K(uVar6.f36126j.forLocalStorageRead(), uVar6.f36127k, uVar6.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k2, "newLocalContentUriFetchProducer(...)");
                        C1344i c1344iJ2 = this$8.j(k2);
                        this$8.f36140b.getClass();
                        return new l0(c1344iJ2, this$8.f36143e);
                    case 9:
                        x this$9 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        S sA2 = this$9.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA2, "newLocalFileFetchProducer(...)");
                        u uVar7 = this$9.f36140b;
                        return this$9.i(sA2, new ThumbnailProducer[]{new N(uVar7.f36126j.forThumbnailProducer(), uVar7.f36127k, uVar7.f36117a)});
                    case 10:
                        x this$10 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        u uVar8 = this$10.f36140b;
                        W w3 = new W(1, uVar8.f36126j.forLocalStorageRead(), uVar8.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w3, "newLocalVideoThumbnailProducer(...)");
                        return this$10.g(w3);
                    case 11:
                        x this$11 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        u uVar9 = this$11.f36140b;
                        uVar9.getClass();
                        K k8 = new K(uVar9.f36126j.forLocalStorageRead(), uVar9.f36127k, uVar9.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k8, "newLocalContentUriFetchProducer(...)");
                        u uVar10 = this$11.f36140b;
                        uVar10.getClass();
                        ExecutorSupplier executorSupplier = uVar10.f36126j;
                        Executor executorForLocalStorageRead = executorSupplier.forLocalStorageRead();
                        ContentResolver contentResolver2 = uVar10.f36117a;
                        PooledByteBufferFactory pooledByteBufferFactory = uVar10.f36127k;
                        return this$11.i(k8, new ThumbnailProducer[]{new L(executorForLocalStorageRead, pooledByteBufferFactory, contentResolver2), new N(executorSupplier.forThumbnailProducer(), pooledByteBufferFactory, uVar10.f36117a)});
                    case 12:
                        x this$12 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        u uVar11 = this$12.f36140b;
                        W w6 = new W(0, uVar11.f36126j.forBackgroundTasks(), uVar11.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w6, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.g(w6);
                    case 13:
                        x this$13 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        u uVar12 = this$13.f36140b;
                        uVar12.getClass();
                        f0 f0Var = new f0(uVar12.f36126j.forLocalStorageRead(), uVar12.f36127k, uVar12.f36117a);
                        Intrinsics.checkNotNullExpressionValue(f0Var, "newQualifiedResourceFetchProducer(...)");
                        u uVar13 = this$13.f36140b;
                        return this$13.i(f0Var, new ThumbnailProducer[]{new N(uVar13.f36126j.forThumbnailProducer(), uVar13.f36127k, uVar13.f36117a)});
                    case 14:
                        x this$14 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        u uVar14 = this$14.f36140b;
                        uVar14.getClass();
                        U u6 = new U(uVar14.f36126j.forLocalStorageRead(), uVar14.f36127k, uVar14.f36118b);
                        Intrinsics.checkNotNullExpressionValue(u6, "newLocalResourceFetchProducer(...)");
                        u uVar15 = this$14.f36140b;
                        return this$14.i(u6, new ThumbnailProducer[]{new N(uVar15.f36126j.forThumbnailProducer(), uVar15.f36127k, uVar15.f36117a)});
                    case 15:
                        x this$15 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        u uVar16 = this$15.f36140b;
                        uVar16.getClass();
                        I i13 = new I(uVar16.f36126j.forLocalStorageRead(), uVar16.f36127k, uVar16.f36119c);
                        Intrinsics.checkNotNullExpressionValue(i13, "newLocalAssetFetchProducer(...)");
                        u uVar17 = this$15.f36140b;
                        return this$15.i(i13, new ThumbnailProducer[]{new N(uVar17.f36126j.forThumbnailProducer(), uVar17.f36127k, uVar17.f36117a)});
                    case 16:
                        x this$16 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        u uVar18 = this$16.f36140b;
                        uVar18.getClass();
                        C1348m c1348m = new C1348m(p180m2.a.f39461a, uVar18.f36127k);
                        Intrinsics.checkNotNullExpressionValue(c1348m, "newDataFetchProducer(...)");
                        return this$16.h(this$16.f36140b.b(new C1337b(c1348m, 0), true, this$16.f36146h));
                    default:
                        x this$17 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$17.a());
                }
            }
        });
        final int i13 = 3;
        this.f36150l = C2131j.b(new Function0(this) { // from class: e3.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f36137b;

            {
                this.f36137b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                h0 h0VarB;
                boolean z10 = true;
                switch (i13) {
                    case 0:
                        x this$0 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$0.b());
                    case 1:
                        x this$1 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        p181m3.a.a();
                        Object value = this$1.f36155q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new C1337b((Producer) value);
                    case 2:
                        x this$2 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        p181m3.a.a();
                        return this$2.h((Producer) this$2.f36152n.getValue());
                    case 3:
                        x this$3 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        p181m3.a.a();
                        u uVar = this$3.f36140b;
                        Producer producer = (Producer) this$3.f36152n.getValue();
                        uVar.getClass();
                        return new l0(producer, this$3.f36143e);
                    case 4:
                        x this$4 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        p181m3.a.a();
                        u uVar2 = this$4.f36140b;
                        Producer producerB = this$4.b();
                        uVar2.getClass();
                        return new C1337b(producerB, 2);
                    case 5:
                        x this$5 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        p181m3.a.a();
                        NetworkFetcher networkFetcher2 = this$5.f36141c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                p181m3.a.a();
                                u uVar3 = this$5.f36140b;
                                b0 b0Var = new b0(uVar3.f36127k, uVar3.f36120d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(b0Var, "newNetworkFetchProducer(...)");
                                C1337b c1337b = new C1337b(this$5.j(b0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(c1337b, "newAddImageTransformMetaDataProducer(...)");
                                u uVar4 = this$5.f36140b;
                                if (!this$5.f36142d || this$5.f36144f == i.f36028c) {
                                    z10 = false;
                                }
                                h0VarB = uVar4.b(c1337b, z10, this$5.f36146h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return h0VarB;
                    case 6:
                        x this$6 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        p181m3.a.a();
                        u uVar5 = this$6.f36140b;
                        Producer producerA = this$6.a();
                        uVar5.getClass();
                        return new C1337b(producerA, 2);
                    case 7:
                        x this$7 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        p181m3.a.a();
                        S sA = this$7.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA, "newLocalFileFetchProducer(...)");
                        C1344i c1344iJ = this$7.j(sA);
                        this$7.f36140b.getClass();
                        return new l0(c1344iJ, this$7.f36143e);
                    case 8:
                        x this$8 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        p181m3.a.a();
                        u uVar6 = this$8.f36140b;
                        uVar6.getClass();
                        K k2 = new K(uVar6.f36126j.forLocalStorageRead(), uVar6.f36127k, uVar6.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k2, "newLocalContentUriFetchProducer(...)");
                        C1344i c1344iJ2 = this$8.j(k2);
                        this$8.f36140b.getClass();
                        return new l0(c1344iJ2, this$8.f36143e);
                    case 9:
                        x this$9 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        S sA2 = this$9.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA2, "newLocalFileFetchProducer(...)");
                        u uVar7 = this$9.f36140b;
                        return this$9.i(sA2, new ThumbnailProducer[]{new N(uVar7.f36126j.forThumbnailProducer(), uVar7.f36127k, uVar7.f36117a)});
                    case 10:
                        x this$10 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        u uVar8 = this$10.f36140b;
                        W w3 = new W(1, uVar8.f36126j.forLocalStorageRead(), uVar8.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w3, "newLocalVideoThumbnailProducer(...)");
                        return this$10.g(w3);
                    case 11:
                        x this$11 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        u uVar9 = this$11.f36140b;
                        uVar9.getClass();
                        K k8 = new K(uVar9.f36126j.forLocalStorageRead(), uVar9.f36127k, uVar9.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k8, "newLocalContentUriFetchProducer(...)");
                        u uVar10 = this$11.f36140b;
                        uVar10.getClass();
                        ExecutorSupplier executorSupplier = uVar10.f36126j;
                        Executor executorForLocalStorageRead = executorSupplier.forLocalStorageRead();
                        ContentResolver contentResolver2 = uVar10.f36117a;
                        PooledByteBufferFactory pooledByteBufferFactory = uVar10.f36127k;
                        return this$11.i(k8, new ThumbnailProducer[]{new L(executorForLocalStorageRead, pooledByteBufferFactory, contentResolver2), new N(executorSupplier.forThumbnailProducer(), pooledByteBufferFactory, uVar10.f36117a)});
                    case 12:
                        x this$12 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        u uVar11 = this$12.f36140b;
                        W w6 = new W(0, uVar11.f36126j.forBackgroundTasks(), uVar11.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w6, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.g(w6);
                    case 13:
                        x this$13 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        u uVar12 = this$13.f36140b;
                        uVar12.getClass();
                        f0 f0Var = new f0(uVar12.f36126j.forLocalStorageRead(), uVar12.f36127k, uVar12.f36117a);
                        Intrinsics.checkNotNullExpressionValue(f0Var, "newQualifiedResourceFetchProducer(...)");
                        u uVar13 = this$13.f36140b;
                        return this$13.i(f0Var, new ThumbnailProducer[]{new N(uVar13.f36126j.forThumbnailProducer(), uVar13.f36127k, uVar13.f36117a)});
                    case 14:
                        x this$14 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        u uVar14 = this$14.f36140b;
                        uVar14.getClass();
                        U u6 = new U(uVar14.f36126j.forLocalStorageRead(), uVar14.f36127k, uVar14.f36118b);
                        Intrinsics.checkNotNullExpressionValue(u6, "newLocalResourceFetchProducer(...)");
                        u uVar15 = this$14.f36140b;
                        return this$14.i(u6, new ThumbnailProducer[]{new N(uVar15.f36126j.forThumbnailProducer(), uVar15.f36127k, uVar15.f36117a)});
                    case 15:
                        x this$15 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        u uVar16 = this$15.f36140b;
                        uVar16.getClass();
                        I i14 = new I(uVar16.f36126j.forLocalStorageRead(), uVar16.f36127k, uVar16.f36119c);
                        Intrinsics.checkNotNullExpressionValue(i14, "newLocalAssetFetchProducer(...)");
                        u uVar17 = this$15.f36140b;
                        return this$15.i(i14, new ThumbnailProducer[]{new N(uVar17.f36126j.forThumbnailProducer(), uVar17.f36127k, uVar17.f36117a)});
                    case 16:
                        x this$16 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        u uVar18 = this$16.f36140b;
                        uVar18.getClass();
                        C1348m c1348m = new C1348m(p180m2.a.f39461a, uVar18.f36127k);
                        Intrinsics.checkNotNullExpressionValue(c1348m, "newDataFetchProducer(...)");
                        return this$16.h(this$16.f36140b.b(new C1337b(c1348m, 0), true, this$16.f36146h));
                    default:
                        x this$17 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$17.a());
                }
            }
        });
        final int i14 = 4;
        this.f36151m = C2131j.b(new Function0(this) { // from class: e3.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f36137b;

            {
                this.f36137b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                h0 h0VarB;
                boolean z10 = true;
                switch (i14) {
                    case 0:
                        x this$0 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$0.b());
                    case 1:
                        x this$1 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        p181m3.a.a();
                        Object value = this$1.f36155q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new C1337b((Producer) value);
                    case 2:
                        x this$2 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        p181m3.a.a();
                        return this$2.h((Producer) this$2.f36152n.getValue());
                    case 3:
                        x this$3 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        p181m3.a.a();
                        u uVar = this$3.f36140b;
                        Producer producer = (Producer) this$3.f36152n.getValue();
                        uVar.getClass();
                        return new l0(producer, this$3.f36143e);
                    case 4:
                        x this$4 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        p181m3.a.a();
                        u uVar2 = this$4.f36140b;
                        Producer producerB = this$4.b();
                        uVar2.getClass();
                        return new C1337b(producerB, 2);
                    case 5:
                        x this$5 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        p181m3.a.a();
                        NetworkFetcher networkFetcher2 = this$5.f36141c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                p181m3.a.a();
                                u uVar3 = this$5.f36140b;
                                b0 b0Var = new b0(uVar3.f36127k, uVar3.f36120d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(b0Var, "newNetworkFetchProducer(...)");
                                C1337b c1337b = new C1337b(this$5.j(b0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(c1337b, "newAddImageTransformMetaDataProducer(...)");
                                u uVar4 = this$5.f36140b;
                                if (!this$5.f36142d || this$5.f36144f == i.f36028c) {
                                    z10 = false;
                                }
                                h0VarB = uVar4.b(c1337b, z10, this$5.f36146h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return h0VarB;
                    case 6:
                        x this$6 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        p181m3.a.a();
                        u uVar5 = this$6.f36140b;
                        Producer producerA = this$6.a();
                        uVar5.getClass();
                        return new C1337b(producerA, 2);
                    case 7:
                        x this$7 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        p181m3.a.a();
                        S sA = this$7.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA, "newLocalFileFetchProducer(...)");
                        C1344i c1344iJ = this$7.j(sA);
                        this$7.f36140b.getClass();
                        return new l0(c1344iJ, this$7.f36143e);
                    case 8:
                        x this$8 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        p181m3.a.a();
                        u uVar6 = this$8.f36140b;
                        uVar6.getClass();
                        K k2 = new K(uVar6.f36126j.forLocalStorageRead(), uVar6.f36127k, uVar6.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k2, "newLocalContentUriFetchProducer(...)");
                        C1344i c1344iJ2 = this$8.j(k2);
                        this$8.f36140b.getClass();
                        return new l0(c1344iJ2, this$8.f36143e);
                    case 9:
                        x this$9 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        S sA2 = this$9.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA2, "newLocalFileFetchProducer(...)");
                        u uVar7 = this$9.f36140b;
                        return this$9.i(sA2, new ThumbnailProducer[]{new N(uVar7.f36126j.forThumbnailProducer(), uVar7.f36127k, uVar7.f36117a)});
                    case 10:
                        x this$10 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        u uVar8 = this$10.f36140b;
                        W w3 = new W(1, uVar8.f36126j.forLocalStorageRead(), uVar8.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w3, "newLocalVideoThumbnailProducer(...)");
                        return this$10.g(w3);
                    case 11:
                        x this$11 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        u uVar9 = this$11.f36140b;
                        uVar9.getClass();
                        K k8 = new K(uVar9.f36126j.forLocalStorageRead(), uVar9.f36127k, uVar9.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k8, "newLocalContentUriFetchProducer(...)");
                        u uVar10 = this$11.f36140b;
                        uVar10.getClass();
                        ExecutorSupplier executorSupplier = uVar10.f36126j;
                        Executor executorForLocalStorageRead = executorSupplier.forLocalStorageRead();
                        ContentResolver contentResolver2 = uVar10.f36117a;
                        PooledByteBufferFactory pooledByteBufferFactory = uVar10.f36127k;
                        return this$11.i(k8, new ThumbnailProducer[]{new L(executorForLocalStorageRead, pooledByteBufferFactory, contentResolver2), new N(executorSupplier.forThumbnailProducer(), pooledByteBufferFactory, uVar10.f36117a)});
                    case 12:
                        x this$12 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        u uVar11 = this$12.f36140b;
                        W w6 = new W(0, uVar11.f36126j.forBackgroundTasks(), uVar11.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w6, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.g(w6);
                    case 13:
                        x this$13 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        u uVar12 = this$13.f36140b;
                        uVar12.getClass();
                        f0 f0Var = new f0(uVar12.f36126j.forLocalStorageRead(), uVar12.f36127k, uVar12.f36117a);
                        Intrinsics.checkNotNullExpressionValue(f0Var, "newQualifiedResourceFetchProducer(...)");
                        u uVar13 = this$13.f36140b;
                        return this$13.i(f0Var, new ThumbnailProducer[]{new N(uVar13.f36126j.forThumbnailProducer(), uVar13.f36127k, uVar13.f36117a)});
                    case 14:
                        x this$14 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        u uVar14 = this$14.f36140b;
                        uVar14.getClass();
                        U u6 = new U(uVar14.f36126j.forLocalStorageRead(), uVar14.f36127k, uVar14.f36118b);
                        Intrinsics.checkNotNullExpressionValue(u6, "newLocalResourceFetchProducer(...)");
                        u uVar15 = this$14.f36140b;
                        return this$14.i(u6, new ThumbnailProducer[]{new N(uVar15.f36126j.forThumbnailProducer(), uVar15.f36127k, uVar15.f36117a)});
                    case 15:
                        x this$15 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        u uVar16 = this$15.f36140b;
                        uVar16.getClass();
                        I i15 = new I(uVar16.f36126j.forLocalStorageRead(), uVar16.f36127k, uVar16.f36119c);
                        Intrinsics.checkNotNullExpressionValue(i15, "newLocalAssetFetchProducer(...)");
                        u uVar17 = this$15.f36140b;
                        return this$15.i(i15, new ThumbnailProducer[]{new N(uVar17.f36126j.forThumbnailProducer(), uVar17.f36127k, uVar17.f36117a)});
                    case 16:
                        x this$16 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        u uVar18 = this$16.f36140b;
                        uVar18.getClass();
                        C1348m c1348m = new C1348m(p180m2.a.f39461a, uVar18.f36127k);
                        Intrinsics.checkNotNullExpressionValue(c1348m, "newDataFetchProducer(...)");
                        return this$16.h(this$16.f36140b.b(new C1337b(c1348m, 0), true, this$16.f36146h));
                    default:
                        x this$17 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$17.a());
                }
            }
        });
        final int i15 = 5;
        this.f36152n = C2131j.b(new Function0(this) { // from class: e3.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f36137b;

            {
                this.f36137b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                h0 h0VarB;
                boolean z10 = true;
                switch (i15) {
                    case 0:
                        x this$0 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$0.b());
                    case 1:
                        x this$1 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        p181m3.a.a();
                        Object value = this$1.f36155q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new C1337b((Producer) value);
                    case 2:
                        x this$2 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        p181m3.a.a();
                        return this$2.h((Producer) this$2.f36152n.getValue());
                    case 3:
                        x this$3 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        p181m3.a.a();
                        u uVar = this$3.f36140b;
                        Producer producer = (Producer) this$3.f36152n.getValue();
                        uVar.getClass();
                        return new l0(producer, this$3.f36143e);
                    case 4:
                        x this$4 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        p181m3.a.a();
                        u uVar2 = this$4.f36140b;
                        Producer producerB = this$4.b();
                        uVar2.getClass();
                        return new C1337b(producerB, 2);
                    case 5:
                        x this$5 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        p181m3.a.a();
                        NetworkFetcher networkFetcher2 = this$5.f36141c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                p181m3.a.a();
                                u uVar3 = this$5.f36140b;
                                b0 b0Var = new b0(uVar3.f36127k, uVar3.f36120d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(b0Var, "newNetworkFetchProducer(...)");
                                C1337b c1337b = new C1337b(this$5.j(b0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(c1337b, "newAddImageTransformMetaDataProducer(...)");
                                u uVar4 = this$5.f36140b;
                                if (!this$5.f36142d || this$5.f36144f == i.f36028c) {
                                    z10 = false;
                                }
                                h0VarB = uVar4.b(c1337b, z10, this$5.f36146h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return h0VarB;
                    case 6:
                        x this$6 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        p181m3.a.a();
                        u uVar5 = this$6.f36140b;
                        Producer producerA = this$6.a();
                        uVar5.getClass();
                        return new C1337b(producerA, 2);
                    case 7:
                        x this$7 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        p181m3.a.a();
                        S sA = this$7.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA, "newLocalFileFetchProducer(...)");
                        C1344i c1344iJ = this$7.j(sA);
                        this$7.f36140b.getClass();
                        return new l0(c1344iJ, this$7.f36143e);
                    case 8:
                        x this$8 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        p181m3.a.a();
                        u uVar6 = this$8.f36140b;
                        uVar6.getClass();
                        K k2 = new K(uVar6.f36126j.forLocalStorageRead(), uVar6.f36127k, uVar6.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k2, "newLocalContentUriFetchProducer(...)");
                        C1344i c1344iJ2 = this$8.j(k2);
                        this$8.f36140b.getClass();
                        return new l0(c1344iJ2, this$8.f36143e);
                    case 9:
                        x this$9 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        S sA2 = this$9.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA2, "newLocalFileFetchProducer(...)");
                        u uVar7 = this$9.f36140b;
                        return this$9.i(sA2, new ThumbnailProducer[]{new N(uVar7.f36126j.forThumbnailProducer(), uVar7.f36127k, uVar7.f36117a)});
                    case 10:
                        x this$10 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        u uVar8 = this$10.f36140b;
                        W w3 = new W(1, uVar8.f36126j.forLocalStorageRead(), uVar8.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w3, "newLocalVideoThumbnailProducer(...)");
                        return this$10.g(w3);
                    case 11:
                        x this$11 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        u uVar9 = this$11.f36140b;
                        uVar9.getClass();
                        K k8 = new K(uVar9.f36126j.forLocalStorageRead(), uVar9.f36127k, uVar9.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k8, "newLocalContentUriFetchProducer(...)");
                        u uVar10 = this$11.f36140b;
                        uVar10.getClass();
                        ExecutorSupplier executorSupplier = uVar10.f36126j;
                        Executor executorForLocalStorageRead = executorSupplier.forLocalStorageRead();
                        ContentResolver contentResolver2 = uVar10.f36117a;
                        PooledByteBufferFactory pooledByteBufferFactory = uVar10.f36127k;
                        return this$11.i(k8, new ThumbnailProducer[]{new L(executorForLocalStorageRead, pooledByteBufferFactory, contentResolver2), new N(executorSupplier.forThumbnailProducer(), pooledByteBufferFactory, uVar10.f36117a)});
                    case 12:
                        x this$12 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        u uVar11 = this$12.f36140b;
                        W w6 = new W(0, uVar11.f36126j.forBackgroundTasks(), uVar11.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w6, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.g(w6);
                    case 13:
                        x this$13 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        u uVar12 = this$13.f36140b;
                        uVar12.getClass();
                        f0 f0Var = new f0(uVar12.f36126j.forLocalStorageRead(), uVar12.f36127k, uVar12.f36117a);
                        Intrinsics.checkNotNullExpressionValue(f0Var, "newQualifiedResourceFetchProducer(...)");
                        u uVar13 = this$13.f36140b;
                        return this$13.i(f0Var, new ThumbnailProducer[]{new N(uVar13.f36126j.forThumbnailProducer(), uVar13.f36127k, uVar13.f36117a)});
                    case 14:
                        x this$14 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        u uVar14 = this$14.f36140b;
                        uVar14.getClass();
                        U u6 = new U(uVar14.f36126j.forLocalStorageRead(), uVar14.f36127k, uVar14.f36118b);
                        Intrinsics.checkNotNullExpressionValue(u6, "newLocalResourceFetchProducer(...)");
                        u uVar15 = this$14.f36140b;
                        return this$14.i(u6, new ThumbnailProducer[]{new N(uVar15.f36126j.forThumbnailProducer(), uVar15.f36127k, uVar15.f36117a)});
                    case 15:
                        x this$15 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        u uVar16 = this$15.f36140b;
                        uVar16.getClass();
                        I i16 = new I(uVar16.f36126j.forLocalStorageRead(), uVar16.f36127k, uVar16.f36119c);
                        Intrinsics.checkNotNullExpressionValue(i16, "newLocalAssetFetchProducer(...)");
                        u uVar17 = this$15.f36140b;
                        return this$15.i(i16, new ThumbnailProducer[]{new N(uVar17.f36126j.forThumbnailProducer(), uVar17.f36127k, uVar17.f36117a)});
                    case 16:
                        x this$16 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        u uVar18 = this$16.f36140b;
                        uVar18.getClass();
                        C1348m c1348m = new C1348m(p180m2.a.f39461a, uVar18.f36127k);
                        Intrinsics.checkNotNullExpressionValue(c1348m, "newDataFetchProducer(...)");
                        return this$16.h(this$16.f36140b.b(new C1337b(c1348m, 0), true, this$16.f36146h));
                    default:
                        x this$17 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$17.a());
                }
            }
        });
        final int i16 = 6;
        this.f36153o = C2131j.b(new Function0(this) { // from class: e3.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f36137b;

            {
                this.f36137b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                h0 h0VarB;
                boolean z10 = true;
                switch (i16) {
                    case 0:
                        x this$0 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$0.b());
                    case 1:
                        x this$1 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        p181m3.a.a();
                        Object value = this$1.f36155q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new C1337b((Producer) value);
                    case 2:
                        x this$2 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        p181m3.a.a();
                        return this$2.h((Producer) this$2.f36152n.getValue());
                    case 3:
                        x this$3 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        p181m3.a.a();
                        u uVar = this$3.f36140b;
                        Producer producer = (Producer) this$3.f36152n.getValue();
                        uVar.getClass();
                        return new l0(producer, this$3.f36143e);
                    case 4:
                        x this$4 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        p181m3.a.a();
                        u uVar2 = this$4.f36140b;
                        Producer producerB = this$4.b();
                        uVar2.getClass();
                        return new C1337b(producerB, 2);
                    case 5:
                        x this$5 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        p181m3.a.a();
                        NetworkFetcher networkFetcher2 = this$5.f36141c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                p181m3.a.a();
                                u uVar3 = this$5.f36140b;
                                b0 b0Var = new b0(uVar3.f36127k, uVar3.f36120d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(b0Var, "newNetworkFetchProducer(...)");
                                C1337b c1337b = new C1337b(this$5.j(b0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(c1337b, "newAddImageTransformMetaDataProducer(...)");
                                u uVar4 = this$5.f36140b;
                                if (!this$5.f36142d || this$5.f36144f == i.f36028c) {
                                    z10 = false;
                                }
                                h0VarB = uVar4.b(c1337b, z10, this$5.f36146h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return h0VarB;
                    case 6:
                        x this$6 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        p181m3.a.a();
                        u uVar5 = this$6.f36140b;
                        Producer producerA = this$6.a();
                        uVar5.getClass();
                        return new C1337b(producerA, 2);
                    case 7:
                        x this$7 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        p181m3.a.a();
                        S sA = this$7.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA, "newLocalFileFetchProducer(...)");
                        C1344i c1344iJ = this$7.j(sA);
                        this$7.f36140b.getClass();
                        return new l0(c1344iJ, this$7.f36143e);
                    case 8:
                        x this$8 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        p181m3.a.a();
                        u uVar6 = this$8.f36140b;
                        uVar6.getClass();
                        K k2 = new K(uVar6.f36126j.forLocalStorageRead(), uVar6.f36127k, uVar6.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k2, "newLocalContentUriFetchProducer(...)");
                        C1344i c1344iJ2 = this$8.j(k2);
                        this$8.f36140b.getClass();
                        return new l0(c1344iJ2, this$8.f36143e);
                    case 9:
                        x this$9 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        S sA2 = this$9.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA2, "newLocalFileFetchProducer(...)");
                        u uVar7 = this$9.f36140b;
                        return this$9.i(sA2, new ThumbnailProducer[]{new N(uVar7.f36126j.forThumbnailProducer(), uVar7.f36127k, uVar7.f36117a)});
                    case 10:
                        x this$10 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        u uVar8 = this$10.f36140b;
                        W w3 = new W(1, uVar8.f36126j.forLocalStorageRead(), uVar8.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w3, "newLocalVideoThumbnailProducer(...)");
                        return this$10.g(w3);
                    case 11:
                        x this$11 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        u uVar9 = this$11.f36140b;
                        uVar9.getClass();
                        K k8 = new K(uVar9.f36126j.forLocalStorageRead(), uVar9.f36127k, uVar9.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k8, "newLocalContentUriFetchProducer(...)");
                        u uVar10 = this$11.f36140b;
                        uVar10.getClass();
                        ExecutorSupplier executorSupplier = uVar10.f36126j;
                        Executor executorForLocalStorageRead = executorSupplier.forLocalStorageRead();
                        ContentResolver contentResolver2 = uVar10.f36117a;
                        PooledByteBufferFactory pooledByteBufferFactory = uVar10.f36127k;
                        return this$11.i(k8, new ThumbnailProducer[]{new L(executorForLocalStorageRead, pooledByteBufferFactory, contentResolver2), new N(executorSupplier.forThumbnailProducer(), pooledByteBufferFactory, uVar10.f36117a)});
                    case 12:
                        x this$12 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        u uVar11 = this$12.f36140b;
                        W w6 = new W(0, uVar11.f36126j.forBackgroundTasks(), uVar11.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w6, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.g(w6);
                    case 13:
                        x this$13 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        u uVar12 = this$13.f36140b;
                        uVar12.getClass();
                        f0 f0Var = new f0(uVar12.f36126j.forLocalStorageRead(), uVar12.f36127k, uVar12.f36117a);
                        Intrinsics.checkNotNullExpressionValue(f0Var, "newQualifiedResourceFetchProducer(...)");
                        u uVar13 = this$13.f36140b;
                        return this$13.i(f0Var, new ThumbnailProducer[]{new N(uVar13.f36126j.forThumbnailProducer(), uVar13.f36127k, uVar13.f36117a)});
                    case 14:
                        x this$14 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        u uVar14 = this$14.f36140b;
                        uVar14.getClass();
                        U u6 = new U(uVar14.f36126j.forLocalStorageRead(), uVar14.f36127k, uVar14.f36118b);
                        Intrinsics.checkNotNullExpressionValue(u6, "newLocalResourceFetchProducer(...)");
                        u uVar15 = this$14.f36140b;
                        return this$14.i(u6, new ThumbnailProducer[]{new N(uVar15.f36126j.forThumbnailProducer(), uVar15.f36127k, uVar15.f36117a)});
                    case 15:
                        x this$15 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        u uVar16 = this$15.f36140b;
                        uVar16.getClass();
                        I i17 = new I(uVar16.f36126j.forLocalStorageRead(), uVar16.f36127k, uVar16.f36119c);
                        Intrinsics.checkNotNullExpressionValue(i17, "newLocalAssetFetchProducer(...)");
                        u uVar17 = this$15.f36140b;
                        return this$15.i(i17, new ThumbnailProducer[]{new N(uVar17.f36126j.forThumbnailProducer(), uVar17.f36127k, uVar17.f36117a)});
                    case 16:
                        x this$16 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        u uVar18 = this$16.f36140b;
                        uVar18.getClass();
                        C1348m c1348m = new C1348m(p180m2.a.f39461a, uVar18.f36127k);
                        Intrinsics.checkNotNullExpressionValue(c1348m, "newDataFetchProducer(...)");
                        return this$16.h(this$16.f36140b.b(new C1337b(c1348m, 0), true, this$16.f36146h));
                    default:
                        x this$17 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$17.a());
                }
            }
        });
        final int i17 = 7;
        this.f36154p = C2131j.b(new Function0(this) { // from class: e3.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f36137b;

            {
                this.f36137b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                h0 h0VarB;
                boolean z10 = true;
                switch (i17) {
                    case 0:
                        x this$0 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$0.b());
                    case 1:
                        x this$1 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        p181m3.a.a();
                        Object value = this$1.f36155q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new C1337b((Producer) value);
                    case 2:
                        x this$2 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        p181m3.a.a();
                        return this$2.h((Producer) this$2.f36152n.getValue());
                    case 3:
                        x this$3 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        p181m3.a.a();
                        u uVar = this$3.f36140b;
                        Producer producer = (Producer) this$3.f36152n.getValue();
                        uVar.getClass();
                        return new l0(producer, this$3.f36143e);
                    case 4:
                        x this$4 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        p181m3.a.a();
                        u uVar2 = this$4.f36140b;
                        Producer producerB = this$4.b();
                        uVar2.getClass();
                        return new C1337b(producerB, 2);
                    case 5:
                        x this$5 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        p181m3.a.a();
                        NetworkFetcher networkFetcher2 = this$5.f36141c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                p181m3.a.a();
                                u uVar3 = this$5.f36140b;
                                b0 b0Var = new b0(uVar3.f36127k, uVar3.f36120d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(b0Var, "newNetworkFetchProducer(...)");
                                C1337b c1337b = new C1337b(this$5.j(b0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(c1337b, "newAddImageTransformMetaDataProducer(...)");
                                u uVar4 = this$5.f36140b;
                                if (!this$5.f36142d || this$5.f36144f == i.f36028c) {
                                    z10 = false;
                                }
                                h0VarB = uVar4.b(c1337b, z10, this$5.f36146h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return h0VarB;
                    case 6:
                        x this$6 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        p181m3.a.a();
                        u uVar5 = this$6.f36140b;
                        Producer producerA = this$6.a();
                        uVar5.getClass();
                        return new C1337b(producerA, 2);
                    case 7:
                        x this$7 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        p181m3.a.a();
                        S sA = this$7.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA, "newLocalFileFetchProducer(...)");
                        C1344i c1344iJ = this$7.j(sA);
                        this$7.f36140b.getClass();
                        return new l0(c1344iJ, this$7.f36143e);
                    case 8:
                        x this$8 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        p181m3.a.a();
                        u uVar6 = this$8.f36140b;
                        uVar6.getClass();
                        K k2 = new K(uVar6.f36126j.forLocalStorageRead(), uVar6.f36127k, uVar6.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k2, "newLocalContentUriFetchProducer(...)");
                        C1344i c1344iJ2 = this$8.j(k2);
                        this$8.f36140b.getClass();
                        return new l0(c1344iJ2, this$8.f36143e);
                    case 9:
                        x this$9 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        S sA2 = this$9.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA2, "newLocalFileFetchProducer(...)");
                        u uVar7 = this$9.f36140b;
                        return this$9.i(sA2, new ThumbnailProducer[]{new N(uVar7.f36126j.forThumbnailProducer(), uVar7.f36127k, uVar7.f36117a)});
                    case 10:
                        x this$10 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        u uVar8 = this$10.f36140b;
                        W w3 = new W(1, uVar8.f36126j.forLocalStorageRead(), uVar8.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w3, "newLocalVideoThumbnailProducer(...)");
                        return this$10.g(w3);
                    case 11:
                        x this$11 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        u uVar9 = this$11.f36140b;
                        uVar9.getClass();
                        K k8 = new K(uVar9.f36126j.forLocalStorageRead(), uVar9.f36127k, uVar9.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k8, "newLocalContentUriFetchProducer(...)");
                        u uVar10 = this$11.f36140b;
                        uVar10.getClass();
                        ExecutorSupplier executorSupplier = uVar10.f36126j;
                        Executor executorForLocalStorageRead = executorSupplier.forLocalStorageRead();
                        ContentResolver contentResolver2 = uVar10.f36117a;
                        PooledByteBufferFactory pooledByteBufferFactory = uVar10.f36127k;
                        return this$11.i(k8, new ThumbnailProducer[]{new L(executorForLocalStorageRead, pooledByteBufferFactory, contentResolver2), new N(executorSupplier.forThumbnailProducer(), pooledByteBufferFactory, uVar10.f36117a)});
                    case 12:
                        x this$12 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        u uVar11 = this$12.f36140b;
                        W w6 = new W(0, uVar11.f36126j.forBackgroundTasks(), uVar11.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w6, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.g(w6);
                    case 13:
                        x this$13 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        u uVar12 = this$13.f36140b;
                        uVar12.getClass();
                        f0 f0Var = new f0(uVar12.f36126j.forLocalStorageRead(), uVar12.f36127k, uVar12.f36117a);
                        Intrinsics.checkNotNullExpressionValue(f0Var, "newQualifiedResourceFetchProducer(...)");
                        u uVar13 = this$13.f36140b;
                        return this$13.i(f0Var, new ThumbnailProducer[]{new N(uVar13.f36126j.forThumbnailProducer(), uVar13.f36127k, uVar13.f36117a)});
                    case 14:
                        x this$14 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        u uVar14 = this$14.f36140b;
                        uVar14.getClass();
                        U u6 = new U(uVar14.f36126j.forLocalStorageRead(), uVar14.f36127k, uVar14.f36118b);
                        Intrinsics.checkNotNullExpressionValue(u6, "newLocalResourceFetchProducer(...)");
                        u uVar15 = this$14.f36140b;
                        return this$14.i(u6, new ThumbnailProducer[]{new N(uVar15.f36126j.forThumbnailProducer(), uVar15.f36127k, uVar15.f36117a)});
                    case 15:
                        x this$15 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        u uVar16 = this$15.f36140b;
                        uVar16.getClass();
                        I i18 = new I(uVar16.f36126j.forLocalStorageRead(), uVar16.f36127k, uVar16.f36119c);
                        Intrinsics.checkNotNullExpressionValue(i18, "newLocalAssetFetchProducer(...)");
                        u uVar17 = this$15.f36140b;
                        return this$15.i(i18, new ThumbnailProducer[]{new N(uVar17.f36126j.forThumbnailProducer(), uVar17.f36127k, uVar17.f36117a)});
                    case 16:
                        x this$16 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        u uVar18 = this$16.f36140b;
                        uVar18.getClass();
                        C1348m c1348m = new C1348m(p180m2.a.f39461a, uVar18.f36127k);
                        Intrinsics.checkNotNullExpressionValue(c1348m, "newDataFetchProducer(...)");
                        return this$16.h(this$16.f36140b.b(new C1337b(c1348m, 0), true, this$16.f36146h));
                    default:
                        x this$17 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$17.a());
                }
            }
        });
        final int i18 = 8;
        this.f36155q = C2131j.b(new Function0(this) { // from class: e3.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f36137b;

            {
                this.f36137b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                h0 h0VarB;
                boolean z10 = true;
                switch (i18) {
                    case 0:
                        x this$0 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$0.b());
                    case 1:
                        x this$1 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        p181m3.a.a();
                        Object value = this$1.f36155q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new C1337b((Producer) value);
                    case 2:
                        x this$2 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        p181m3.a.a();
                        return this$2.h((Producer) this$2.f36152n.getValue());
                    case 3:
                        x this$3 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        p181m3.a.a();
                        u uVar = this$3.f36140b;
                        Producer producer = (Producer) this$3.f36152n.getValue();
                        uVar.getClass();
                        return new l0(producer, this$3.f36143e);
                    case 4:
                        x this$4 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        p181m3.a.a();
                        u uVar2 = this$4.f36140b;
                        Producer producerB = this$4.b();
                        uVar2.getClass();
                        return new C1337b(producerB, 2);
                    case 5:
                        x this$5 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        p181m3.a.a();
                        NetworkFetcher networkFetcher2 = this$5.f36141c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                p181m3.a.a();
                                u uVar3 = this$5.f36140b;
                                b0 b0Var = new b0(uVar3.f36127k, uVar3.f36120d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(b0Var, "newNetworkFetchProducer(...)");
                                C1337b c1337b = new C1337b(this$5.j(b0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(c1337b, "newAddImageTransformMetaDataProducer(...)");
                                u uVar4 = this$5.f36140b;
                                if (!this$5.f36142d || this$5.f36144f == i.f36028c) {
                                    z10 = false;
                                }
                                h0VarB = uVar4.b(c1337b, z10, this$5.f36146h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return h0VarB;
                    case 6:
                        x this$6 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        p181m3.a.a();
                        u uVar5 = this$6.f36140b;
                        Producer producerA = this$6.a();
                        uVar5.getClass();
                        return new C1337b(producerA, 2);
                    case 7:
                        x this$7 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        p181m3.a.a();
                        S sA = this$7.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA, "newLocalFileFetchProducer(...)");
                        C1344i c1344iJ = this$7.j(sA);
                        this$7.f36140b.getClass();
                        return new l0(c1344iJ, this$7.f36143e);
                    case 8:
                        x this$8 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        p181m3.a.a();
                        u uVar6 = this$8.f36140b;
                        uVar6.getClass();
                        K k2 = new K(uVar6.f36126j.forLocalStorageRead(), uVar6.f36127k, uVar6.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k2, "newLocalContentUriFetchProducer(...)");
                        C1344i c1344iJ2 = this$8.j(k2);
                        this$8.f36140b.getClass();
                        return new l0(c1344iJ2, this$8.f36143e);
                    case 9:
                        x this$9 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        S sA2 = this$9.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA2, "newLocalFileFetchProducer(...)");
                        u uVar7 = this$9.f36140b;
                        return this$9.i(sA2, new ThumbnailProducer[]{new N(uVar7.f36126j.forThumbnailProducer(), uVar7.f36127k, uVar7.f36117a)});
                    case 10:
                        x this$10 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        u uVar8 = this$10.f36140b;
                        W w3 = new W(1, uVar8.f36126j.forLocalStorageRead(), uVar8.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w3, "newLocalVideoThumbnailProducer(...)");
                        return this$10.g(w3);
                    case 11:
                        x this$11 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        u uVar9 = this$11.f36140b;
                        uVar9.getClass();
                        K k8 = new K(uVar9.f36126j.forLocalStorageRead(), uVar9.f36127k, uVar9.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k8, "newLocalContentUriFetchProducer(...)");
                        u uVar10 = this$11.f36140b;
                        uVar10.getClass();
                        ExecutorSupplier executorSupplier = uVar10.f36126j;
                        Executor executorForLocalStorageRead = executorSupplier.forLocalStorageRead();
                        ContentResolver contentResolver2 = uVar10.f36117a;
                        PooledByteBufferFactory pooledByteBufferFactory = uVar10.f36127k;
                        return this$11.i(k8, new ThumbnailProducer[]{new L(executorForLocalStorageRead, pooledByteBufferFactory, contentResolver2), new N(executorSupplier.forThumbnailProducer(), pooledByteBufferFactory, uVar10.f36117a)});
                    case 12:
                        x this$12 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        u uVar11 = this$12.f36140b;
                        W w6 = new W(0, uVar11.f36126j.forBackgroundTasks(), uVar11.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w6, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.g(w6);
                    case 13:
                        x this$13 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        u uVar12 = this$13.f36140b;
                        uVar12.getClass();
                        f0 f0Var = new f0(uVar12.f36126j.forLocalStorageRead(), uVar12.f36127k, uVar12.f36117a);
                        Intrinsics.checkNotNullExpressionValue(f0Var, "newQualifiedResourceFetchProducer(...)");
                        u uVar13 = this$13.f36140b;
                        return this$13.i(f0Var, new ThumbnailProducer[]{new N(uVar13.f36126j.forThumbnailProducer(), uVar13.f36127k, uVar13.f36117a)});
                    case 14:
                        x this$14 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        u uVar14 = this$14.f36140b;
                        uVar14.getClass();
                        U u6 = new U(uVar14.f36126j.forLocalStorageRead(), uVar14.f36127k, uVar14.f36118b);
                        Intrinsics.checkNotNullExpressionValue(u6, "newLocalResourceFetchProducer(...)");
                        u uVar15 = this$14.f36140b;
                        return this$14.i(u6, new ThumbnailProducer[]{new N(uVar15.f36126j.forThumbnailProducer(), uVar15.f36127k, uVar15.f36117a)});
                    case 15:
                        x this$15 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        u uVar16 = this$15.f36140b;
                        uVar16.getClass();
                        I i19 = new I(uVar16.f36126j.forLocalStorageRead(), uVar16.f36127k, uVar16.f36119c);
                        Intrinsics.checkNotNullExpressionValue(i19, "newLocalAssetFetchProducer(...)");
                        u uVar17 = this$15.f36140b;
                        return this$15.i(i19, new ThumbnailProducer[]{new N(uVar17.f36126j.forThumbnailProducer(), uVar17.f36127k, uVar17.f36117a)});
                    case 16:
                        x this$16 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        u uVar18 = this$16.f36140b;
                        uVar18.getClass();
                        C1348m c1348m = new C1348m(p180m2.a.f39461a, uVar18.f36127k);
                        Intrinsics.checkNotNullExpressionValue(c1348m, "newDataFetchProducer(...)");
                        return this$16.h(this$16.f36140b.b(new C1337b(c1348m, 0), true, this$16.f36146h));
                    default:
                        x this$17 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$17.a());
                }
            }
        });
        final int i19 = 9;
        this.f36156r = C2131j.b(new Function0(this) { // from class: e3.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f36137b;

            {
                this.f36137b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                h0 h0VarB;
                boolean z10 = true;
                switch (i19) {
                    case 0:
                        x this$0 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$0.b());
                    case 1:
                        x this$1 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        p181m3.a.a();
                        Object value = this$1.f36155q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new C1337b((Producer) value);
                    case 2:
                        x this$2 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        p181m3.a.a();
                        return this$2.h((Producer) this$2.f36152n.getValue());
                    case 3:
                        x this$3 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        p181m3.a.a();
                        u uVar = this$3.f36140b;
                        Producer producer = (Producer) this$3.f36152n.getValue();
                        uVar.getClass();
                        return new l0(producer, this$3.f36143e);
                    case 4:
                        x this$4 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        p181m3.a.a();
                        u uVar2 = this$4.f36140b;
                        Producer producerB = this$4.b();
                        uVar2.getClass();
                        return new C1337b(producerB, 2);
                    case 5:
                        x this$5 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        p181m3.a.a();
                        NetworkFetcher networkFetcher2 = this$5.f36141c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                p181m3.a.a();
                                u uVar3 = this$5.f36140b;
                                b0 b0Var = new b0(uVar3.f36127k, uVar3.f36120d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(b0Var, "newNetworkFetchProducer(...)");
                                C1337b c1337b = new C1337b(this$5.j(b0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(c1337b, "newAddImageTransformMetaDataProducer(...)");
                                u uVar4 = this$5.f36140b;
                                if (!this$5.f36142d || this$5.f36144f == i.f36028c) {
                                    z10 = false;
                                }
                                h0VarB = uVar4.b(c1337b, z10, this$5.f36146h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return h0VarB;
                    case 6:
                        x this$6 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        p181m3.a.a();
                        u uVar5 = this$6.f36140b;
                        Producer producerA = this$6.a();
                        uVar5.getClass();
                        return new C1337b(producerA, 2);
                    case 7:
                        x this$7 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        p181m3.a.a();
                        S sA = this$7.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA, "newLocalFileFetchProducer(...)");
                        C1344i c1344iJ = this$7.j(sA);
                        this$7.f36140b.getClass();
                        return new l0(c1344iJ, this$7.f36143e);
                    case 8:
                        x this$8 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        p181m3.a.a();
                        u uVar6 = this$8.f36140b;
                        uVar6.getClass();
                        K k2 = new K(uVar6.f36126j.forLocalStorageRead(), uVar6.f36127k, uVar6.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k2, "newLocalContentUriFetchProducer(...)");
                        C1344i c1344iJ2 = this$8.j(k2);
                        this$8.f36140b.getClass();
                        return new l0(c1344iJ2, this$8.f36143e);
                    case 9:
                        x this$9 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        S sA2 = this$9.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA2, "newLocalFileFetchProducer(...)");
                        u uVar7 = this$9.f36140b;
                        return this$9.i(sA2, new ThumbnailProducer[]{new N(uVar7.f36126j.forThumbnailProducer(), uVar7.f36127k, uVar7.f36117a)});
                    case 10:
                        x this$10 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        u uVar8 = this$10.f36140b;
                        W w3 = new W(1, uVar8.f36126j.forLocalStorageRead(), uVar8.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w3, "newLocalVideoThumbnailProducer(...)");
                        return this$10.g(w3);
                    case 11:
                        x this$11 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        u uVar9 = this$11.f36140b;
                        uVar9.getClass();
                        K k8 = new K(uVar9.f36126j.forLocalStorageRead(), uVar9.f36127k, uVar9.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k8, "newLocalContentUriFetchProducer(...)");
                        u uVar10 = this$11.f36140b;
                        uVar10.getClass();
                        ExecutorSupplier executorSupplier = uVar10.f36126j;
                        Executor executorForLocalStorageRead = executorSupplier.forLocalStorageRead();
                        ContentResolver contentResolver2 = uVar10.f36117a;
                        PooledByteBufferFactory pooledByteBufferFactory = uVar10.f36127k;
                        return this$11.i(k8, new ThumbnailProducer[]{new L(executorForLocalStorageRead, pooledByteBufferFactory, contentResolver2), new N(executorSupplier.forThumbnailProducer(), pooledByteBufferFactory, uVar10.f36117a)});
                    case 12:
                        x this$12 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        u uVar11 = this$12.f36140b;
                        W w6 = new W(0, uVar11.f36126j.forBackgroundTasks(), uVar11.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w6, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.g(w6);
                    case 13:
                        x this$13 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        u uVar12 = this$13.f36140b;
                        uVar12.getClass();
                        f0 f0Var = new f0(uVar12.f36126j.forLocalStorageRead(), uVar12.f36127k, uVar12.f36117a);
                        Intrinsics.checkNotNullExpressionValue(f0Var, "newQualifiedResourceFetchProducer(...)");
                        u uVar13 = this$13.f36140b;
                        return this$13.i(f0Var, new ThumbnailProducer[]{new N(uVar13.f36126j.forThumbnailProducer(), uVar13.f36127k, uVar13.f36117a)});
                    case 14:
                        x this$14 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        u uVar14 = this$14.f36140b;
                        uVar14.getClass();
                        U u6 = new U(uVar14.f36126j.forLocalStorageRead(), uVar14.f36127k, uVar14.f36118b);
                        Intrinsics.checkNotNullExpressionValue(u6, "newLocalResourceFetchProducer(...)");
                        u uVar15 = this$14.f36140b;
                        return this$14.i(u6, new ThumbnailProducer[]{new N(uVar15.f36126j.forThumbnailProducer(), uVar15.f36127k, uVar15.f36117a)});
                    case 15:
                        x this$15 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        u uVar16 = this$15.f36140b;
                        uVar16.getClass();
                        I i110 = new I(uVar16.f36126j.forLocalStorageRead(), uVar16.f36127k, uVar16.f36119c);
                        Intrinsics.checkNotNullExpressionValue(i110, "newLocalAssetFetchProducer(...)");
                        u uVar17 = this$15.f36140b;
                        return this$15.i(i110, new ThumbnailProducer[]{new N(uVar17.f36126j.forThumbnailProducer(), uVar17.f36127k, uVar17.f36117a)});
                    case 16:
                        x this$16 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        u uVar18 = this$16.f36140b;
                        uVar18.getClass();
                        C1348m c1348m = new C1348m(p180m2.a.f39461a, uVar18.f36127k);
                        Intrinsics.checkNotNullExpressionValue(c1348m, "newDataFetchProducer(...)");
                        return this$16.h(this$16.f36140b.b(new C1337b(c1348m, 0), true, this$16.f36146h));
                    default:
                        x this$17 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$17.a());
                }
            }
        });
        final int i20 = 10;
        this.f36157s = C2131j.b(new Function0(this) { // from class: e3.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f36137b;

            {
                this.f36137b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                h0 h0VarB;
                boolean z10 = true;
                switch (i20) {
                    case 0:
                        x this$0 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$0.b());
                    case 1:
                        x this$1 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        p181m3.a.a();
                        Object value = this$1.f36155q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new C1337b((Producer) value);
                    case 2:
                        x this$2 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        p181m3.a.a();
                        return this$2.h((Producer) this$2.f36152n.getValue());
                    case 3:
                        x this$3 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        p181m3.a.a();
                        u uVar = this$3.f36140b;
                        Producer producer = (Producer) this$3.f36152n.getValue();
                        uVar.getClass();
                        return new l0(producer, this$3.f36143e);
                    case 4:
                        x this$4 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        p181m3.a.a();
                        u uVar2 = this$4.f36140b;
                        Producer producerB = this$4.b();
                        uVar2.getClass();
                        return new C1337b(producerB, 2);
                    case 5:
                        x this$5 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        p181m3.a.a();
                        NetworkFetcher networkFetcher2 = this$5.f36141c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                p181m3.a.a();
                                u uVar3 = this$5.f36140b;
                                b0 b0Var = new b0(uVar3.f36127k, uVar3.f36120d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(b0Var, "newNetworkFetchProducer(...)");
                                C1337b c1337b = new C1337b(this$5.j(b0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(c1337b, "newAddImageTransformMetaDataProducer(...)");
                                u uVar4 = this$5.f36140b;
                                if (!this$5.f36142d || this$5.f36144f == i.f36028c) {
                                    z10 = false;
                                }
                                h0VarB = uVar4.b(c1337b, z10, this$5.f36146h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return h0VarB;
                    case 6:
                        x this$6 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        p181m3.a.a();
                        u uVar5 = this$6.f36140b;
                        Producer producerA = this$6.a();
                        uVar5.getClass();
                        return new C1337b(producerA, 2);
                    case 7:
                        x this$7 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        p181m3.a.a();
                        S sA = this$7.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA, "newLocalFileFetchProducer(...)");
                        C1344i c1344iJ = this$7.j(sA);
                        this$7.f36140b.getClass();
                        return new l0(c1344iJ, this$7.f36143e);
                    case 8:
                        x this$8 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        p181m3.a.a();
                        u uVar6 = this$8.f36140b;
                        uVar6.getClass();
                        K k2 = new K(uVar6.f36126j.forLocalStorageRead(), uVar6.f36127k, uVar6.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k2, "newLocalContentUriFetchProducer(...)");
                        C1344i c1344iJ2 = this$8.j(k2);
                        this$8.f36140b.getClass();
                        return new l0(c1344iJ2, this$8.f36143e);
                    case 9:
                        x this$9 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        S sA2 = this$9.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA2, "newLocalFileFetchProducer(...)");
                        u uVar7 = this$9.f36140b;
                        return this$9.i(sA2, new ThumbnailProducer[]{new N(uVar7.f36126j.forThumbnailProducer(), uVar7.f36127k, uVar7.f36117a)});
                    case 10:
                        x this$10 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        u uVar8 = this$10.f36140b;
                        W w3 = new W(1, uVar8.f36126j.forLocalStorageRead(), uVar8.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w3, "newLocalVideoThumbnailProducer(...)");
                        return this$10.g(w3);
                    case 11:
                        x this$11 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        u uVar9 = this$11.f36140b;
                        uVar9.getClass();
                        K k8 = new K(uVar9.f36126j.forLocalStorageRead(), uVar9.f36127k, uVar9.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k8, "newLocalContentUriFetchProducer(...)");
                        u uVar10 = this$11.f36140b;
                        uVar10.getClass();
                        ExecutorSupplier executorSupplier = uVar10.f36126j;
                        Executor executorForLocalStorageRead = executorSupplier.forLocalStorageRead();
                        ContentResolver contentResolver2 = uVar10.f36117a;
                        PooledByteBufferFactory pooledByteBufferFactory = uVar10.f36127k;
                        return this$11.i(k8, new ThumbnailProducer[]{new L(executorForLocalStorageRead, pooledByteBufferFactory, contentResolver2), new N(executorSupplier.forThumbnailProducer(), pooledByteBufferFactory, uVar10.f36117a)});
                    case 12:
                        x this$12 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        u uVar11 = this$12.f36140b;
                        W w6 = new W(0, uVar11.f36126j.forBackgroundTasks(), uVar11.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w6, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.g(w6);
                    case 13:
                        x this$13 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        u uVar12 = this$13.f36140b;
                        uVar12.getClass();
                        f0 f0Var = new f0(uVar12.f36126j.forLocalStorageRead(), uVar12.f36127k, uVar12.f36117a);
                        Intrinsics.checkNotNullExpressionValue(f0Var, "newQualifiedResourceFetchProducer(...)");
                        u uVar13 = this$13.f36140b;
                        return this$13.i(f0Var, new ThumbnailProducer[]{new N(uVar13.f36126j.forThumbnailProducer(), uVar13.f36127k, uVar13.f36117a)});
                    case 14:
                        x this$14 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        u uVar14 = this$14.f36140b;
                        uVar14.getClass();
                        U u6 = new U(uVar14.f36126j.forLocalStorageRead(), uVar14.f36127k, uVar14.f36118b);
                        Intrinsics.checkNotNullExpressionValue(u6, "newLocalResourceFetchProducer(...)");
                        u uVar15 = this$14.f36140b;
                        return this$14.i(u6, new ThumbnailProducer[]{new N(uVar15.f36126j.forThumbnailProducer(), uVar15.f36127k, uVar15.f36117a)});
                    case 15:
                        x this$15 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        u uVar16 = this$15.f36140b;
                        uVar16.getClass();
                        I i110 = new I(uVar16.f36126j.forLocalStorageRead(), uVar16.f36127k, uVar16.f36119c);
                        Intrinsics.checkNotNullExpressionValue(i110, "newLocalAssetFetchProducer(...)");
                        u uVar17 = this$15.f36140b;
                        return this$15.i(i110, new ThumbnailProducer[]{new N(uVar17.f36126j.forThumbnailProducer(), uVar17.f36127k, uVar17.f36117a)});
                    case 16:
                        x this$16 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        u uVar18 = this$16.f36140b;
                        uVar18.getClass();
                        C1348m c1348m = new C1348m(p180m2.a.f39461a, uVar18.f36127k);
                        Intrinsics.checkNotNullExpressionValue(c1348m, "newDataFetchProducer(...)");
                        return this$16.h(this$16.f36140b.b(new C1337b(c1348m, 0), true, this$16.f36146h));
                    default:
                        x this$17 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$17.a());
                }
            }
        });
        final int i21 = 11;
        this.t = C2131j.b(new Function0(this) { // from class: e3.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f36137b;

            {
                this.f36137b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                h0 h0VarB;
                boolean z10 = true;
                switch (i21) {
                    case 0:
                        x this$0 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$0.b());
                    case 1:
                        x this$1 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        p181m3.a.a();
                        Object value = this$1.f36155q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new C1337b((Producer) value);
                    case 2:
                        x this$2 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        p181m3.a.a();
                        return this$2.h((Producer) this$2.f36152n.getValue());
                    case 3:
                        x this$3 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        p181m3.a.a();
                        u uVar = this$3.f36140b;
                        Producer producer = (Producer) this$3.f36152n.getValue();
                        uVar.getClass();
                        return new l0(producer, this$3.f36143e);
                    case 4:
                        x this$4 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        p181m3.a.a();
                        u uVar2 = this$4.f36140b;
                        Producer producerB = this$4.b();
                        uVar2.getClass();
                        return new C1337b(producerB, 2);
                    case 5:
                        x this$5 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        p181m3.a.a();
                        NetworkFetcher networkFetcher2 = this$5.f36141c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                p181m3.a.a();
                                u uVar3 = this$5.f36140b;
                                b0 b0Var = new b0(uVar3.f36127k, uVar3.f36120d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(b0Var, "newNetworkFetchProducer(...)");
                                C1337b c1337b = new C1337b(this$5.j(b0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(c1337b, "newAddImageTransformMetaDataProducer(...)");
                                u uVar4 = this$5.f36140b;
                                if (!this$5.f36142d || this$5.f36144f == i.f36028c) {
                                    z10 = false;
                                }
                                h0VarB = uVar4.b(c1337b, z10, this$5.f36146h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return h0VarB;
                    case 6:
                        x this$6 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        p181m3.a.a();
                        u uVar5 = this$6.f36140b;
                        Producer producerA = this$6.a();
                        uVar5.getClass();
                        return new C1337b(producerA, 2);
                    case 7:
                        x this$7 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        p181m3.a.a();
                        S sA = this$7.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA, "newLocalFileFetchProducer(...)");
                        C1344i c1344iJ = this$7.j(sA);
                        this$7.f36140b.getClass();
                        return new l0(c1344iJ, this$7.f36143e);
                    case 8:
                        x this$8 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        p181m3.a.a();
                        u uVar6 = this$8.f36140b;
                        uVar6.getClass();
                        K k2 = new K(uVar6.f36126j.forLocalStorageRead(), uVar6.f36127k, uVar6.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k2, "newLocalContentUriFetchProducer(...)");
                        C1344i c1344iJ2 = this$8.j(k2);
                        this$8.f36140b.getClass();
                        return new l0(c1344iJ2, this$8.f36143e);
                    case 9:
                        x this$9 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        S sA2 = this$9.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA2, "newLocalFileFetchProducer(...)");
                        u uVar7 = this$9.f36140b;
                        return this$9.i(sA2, new ThumbnailProducer[]{new N(uVar7.f36126j.forThumbnailProducer(), uVar7.f36127k, uVar7.f36117a)});
                    case 10:
                        x this$10 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        u uVar8 = this$10.f36140b;
                        W w3 = new W(1, uVar8.f36126j.forLocalStorageRead(), uVar8.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w3, "newLocalVideoThumbnailProducer(...)");
                        return this$10.g(w3);
                    case 11:
                        x this$11 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        u uVar9 = this$11.f36140b;
                        uVar9.getClass();
                        K k8 = new K(uVar9.f36126j.forLocalStorageRead(), uVar9.f36127k, uVar9.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k8, "newLocalContentUriFetchProducer(...)");
                        u uVar10 = this$11.f36140b;
                        uVar10.getClass();
                        ExecutorSupplier executorSupplier = uVar10.f36126j;
                        Executor executorForLocalStorageRead = executorSupplier.forLocalStorageRead();
                        ContentResolver contentResolver2 = uVar10.f36117a;
                        PooledByteBufferFactory pooledByteBufferFactory = uVar10.f36127k;
                        return this$11.i(k8, new ThumbnailProducer[]{new L(executorForLocalStorageRead, pooledByteBufferFactory, contentResolver2), new N(executorSupplier.forThumbnailProducer(), pooledByteBufferFactory, uVar10.f36117a)});
                    case 12:
                        x this$12 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        u uVar11 = this$12.f36140b;
                        W w6 = new W(0, uVar11.f36126j.forBackgroundTasks(), uVar11.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w6, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.g(w6);
                    case 13:
                        x this$13 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        u uVar12 = this$13.f36140b;
                        uVar12.getClass();
                        f0 f0Var = new f0(uVar12.f36126j.forLocalStorageRead(), uVar12.f36127k, uVar12.f36117a);
                        Intrinsics.checkNotNullExpressionValue(f0Var, "newQualifiedResourceFetchProducer(...)");
                        u uVar13 = this$13.f36140b;
                        return this$13.i(f0Var, new ThumbnailProducer[]{new N(uVar13.f36126j.forThumbnailProducer(), uVar13.f36127k, uVar13.f36117a)});
                    case 14:
                        x this$14 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        u uVar14 = this$14.f36140b;
                        uVar14.getClass();
                        U u6 = new U(uVar14.f36126j.forLocalStorageRead(), uVar14.f36127k, uVar14.f36118b);
                        Intrinsics.checkNotNullExpressionValue(u6, "newLocalResourceFetchProducer(...)");
                        u uVar15 = this$14.f36140b;
                        return this$14.i(u6, new ThumbnailProducer[]{new N(uVar15.f36126j.forThumbnailProducer(), uVar15.f36127k, uVar15.f36117a)});
                    case 15:
                        x this$15 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        u uVar16 = this$15.f36140b;
                        uVar16.getClass();
                        I i110 = new I(uVar16.f36126j.forLocalStorageRead(), uVar16.f36127k, uVar16.f36119c);
                        Intrinsics.checkNotNullExpressionValue(i110, "newLocalAssetFetchProducer(...)");
                        u uVar17 = this$15.f36140b;
                        return this$15.i(i110, new ThumbnailProducer[]{new N(uVar17.f36126j.forThumbnailProducer(), uVar17.f36127k, uVar17.f36117a)});
                    case 16:
                        x this$16 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        u uVar18 = this$16.f36140b;
                        uVar18.getClass();
                        C1348m c1348m = new C1348m(p180m2.a.f39461a, uVar18.f36127k);
                        Intrinsics.checkNotNullExpressionValue(c1348m, "newDataFetchProducer(...)");
                        return this$16.h(this$16.f36140b.b(new C1337b(c1348m, 0), true, this$16.f36146h));
                    default:
                        x this$17 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$17.a());
                }
            }
        });
        final int i22 = 12;
        this.f36158u = C2131j.b(new Function0(this) { // from class: e3.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f36137b;

            {
                this.f36137b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                h0 h0VarB;
                boolean z10 = true;
                switch (i22) {
                    case 0:
                        x this$0 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$0.b());
                    case 1:
                        x this$1 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        p181m3.a.a();
                        Object value = this$1.f36155q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new C1337b((Producer) value);
                    case 2:
                        x this$2 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        p181m3.a.a();
                        return this$2.h((Producer) this$2.f36152n.getValue());
                    case 3:
                        x this$3 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        p181m3.a.a();
                        u uVar = this$3.f36140b;
                        Producer producer = (Producer) this$3.f36152n.getValue();
                        uVar.getClass();
                        return new l0(producer, this$3.f36143e);
                    case 4:
                        x this$4 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        p181m3.a.a();
                        u uVar2 = this$4.f36140b;
                        Producer producerB = this$4.b();
                        uVar2.getClass();
                        return new C1337b(producerB, 2);
                    case 5:
                        x this$5 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        p181m3.a.a();
                        NetworkFetcher networkFetcher2 = this$5.f36141c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                p181m3.a.a();
                                u uVar3 = this$5.f36140b;
                                b0 b0Var = new b0(uVar3.f36127k, uVar3.f36120d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(b0Var, "newNetworkFetchProducer(...)");
                                C1337b c1337b = new C1337b(this$5.j(b0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(c1337b, "newAddImageTransformMetaDataProducer(...)");
                                u uVar4 = this$5.f36140b;
                                if (!this$5.f36142d || this$5.f36144f == i.f36028c) {
                                    z10 = false;
                                }
                                h0VarB = uVar4.b(c1337b, z10, this$5.f36146h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return h0VarB;
                    case 6:
                        x this$6 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        p181m3.a.a();
                        u uVar5 = this$6.f36140b;
                        Producer producerA = this$6.a();
                        uVar5.getClass();
                        return new C1337b(producerA, 2);
                    case 7:
                        x this$7 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        p181m3.a.a();
                        S sA = this$7.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA, "newLocalFileFetchProducer(...)");
                        C1344i c1344iJ = this$7.j(sA);
                        this$7.f36140b.getClass();
                        return new l0(c1344iJ, this$7.f36143e);
                    case 8:
                        x this$8 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        p181m3.a.a();
                        u uVar6 = this$8.f36140b;
                        uVar6.getClass();
                        K k2 = new K(uVar6.f36126j.forLocalStorageRead(), uVar6.f36127k, uVar6.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k2, "newLocalContentUriFetchProducer(...)");
                        C1344i c1344iJ2 = this$8.j(k2);
                        this$8.f36140b.getClass();
                        return new l0(c1344iJ2, this$8.f36143e);
                    case 9:
                        x this$9 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        S sA2 = this$9.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA2, "newLocalFileFetchProducer(...)");
                        u uVar7 = this$9.f36140b;
                        return this$9.i(sA2, new ThumbnailProducer[]{new N(uVar7.f36126j.forThumbnailProducer(), uVar7.f36127k, uVar7.f36117a)});
                    case 10:
                        x this$10 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        u uVar8 = this$10.f36140b;
                        W w3 = new W(1, uVar8.f36126j.forLocalStorageRead(), uVar8.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w3, "newLocalVideoThumbnailProducer(...)");
                        return this$10.g(w3);
                    case 11:
                        x this$11 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        u uVar9 = this$11.f36140b;
                        uVar9.getClass();
                        K k8 = new K(uVar9.f36126j.forLocalStorageRead(), uVar9.f36127k, uVar9.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k8, "newLocalContentUriFetchProducer(...)");
                        u uVar10 = this$11.f36140b;
                        uVar10.getClass();
                        ExecutorSupplier executorSupplier = uVar10.f36126j;
                        Executor executorForLocalStorageRead = executorSupplier.forLocalStorageRead();
                        ContentResolver contentResolver2 = uVar10.f36117a;
                        PooledByteBufferFactory pooledByteBufferFactory = uVar10.f36127k;
                        return this$11.i(k8, new ThumbnailProducer[]{new L(executorForLocalStorageRead, pooledByteBufferFactory, contentResolver2), new N(executorSupplier.forThumbnailProducer(), pooledByteBufferFactory, uVar10.f36117a)});
                    case 12:
                        x this$12 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        u uVar11 = this$12.f36140b;
                        W w6 = new W(0, uVar11.f36126j.forBackgroundTasks(), uVar11.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w6, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.g(w6);
                    case 13:
                        x this$13 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        u uVar12 = this$13.f36140b;
                        uVar12.getClass();
                        f0 f0Var = new f0(uVar12.f36126j.forLocalStorageRead(), uVar12.f36127k, uVar12.f36117a);
                        Intrinsics.checkNotNullExpressionValue(f0Var, "newQualifiedResourceFetchProducer(...)");
                        u uVar13 = this$13.f36140b;
                        return this$13.i(f0Var, new ThumbnailProducer[]{new N(uVar13.f36126j.forThumbnailProducer(), uVar13.f36127k, uVar13.f36117a)});
                    case 14:
                        x this$14 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        u uVar14 = this$14.f36140b;
                        uVar14.getClass();
                        U u6 = new U(uVar14.f36126j.forLocalStorageRead(), uVar14.f36127k, uVar14.f36118b);
                        Intrinsics.checkNotNullExpressionValue(u6, "newLocalResourceFetchProducer(...)");
                        u uVar15 = this$14.f36140b;
                        return this$14.i(u6, new ThumbnailProducer[]{new N(uVar15.f36126j.forThumbnailProducer(), uVar15.f36127k, uVar15.f36117a)});
                    case 15:
                        x this$15 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        u uVar16 = this$15.f36140b;
                        uVar16.getClass();
                        I i110 = new I(uVar16.f36126j.forLocalStorageRead(), uVar16.f36127k, uVar16.f36119c);
                        Intrinsics.checkNotNullExpressionValue(i110, "newLocalAssetFetchProducer(...)");
                        u uVar17 = this$15.f36140b;
                        return this$15.i(i110, new ThumbnailProducer[]{new N(uVar17.f36126j.forThumbnailProducer(), uVar17.f36127k, uVar17.f36117a)});
                    case 16:
                        x this$16 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        u uVar18 = this$16.f36140b;
                        uVar18.getClass();
                        C1348m c1348m = new C1348m(p180m2.a.f39461a, uVar18.f36127k);
                        Intrinsics.checkNotNullExpressionValue(c1348m, "newDataFetchProducer(...)");
                        return this$16.h(this$16.f36140b.b(new C1337b(c1348m, 0), true, this$16.f36146h));
                    default:
                        x this$17 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$17.a());
                }
            }
        });
        final int i23 = 13;
        this.f36159v = C2131j.b(new Function0(this) { // from class: e3.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f36137b;

            {
                this.f36137b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                h0 h0VarB;
                boolean z10 = true;
                switch (i23) {
                    case 0:
                        x this$0 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$0.b());
                    case 1:
                        x this$1 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        p181m3.a.a();
                        Object value = this$1.f36155q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new C1337b((Producer) value);
                    case 2:
                        x this$2 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        p181m3.a.a();
                        return this$2.h((Producer) this$2.f36152n.getValue());
                    case 3:
                        x this$3 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        p181m3.a.a();
                        u uVar = this$3.f36140b;
                        Producer producer = (Producer) this$3.f36152n.getValue();
                        uVar.getClass();
                        return new l0(producer, this$3.f36143e);
                    case 4:
                        x this$4 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        p181m3.a.a();
                        u uVar2 = this$4.f36140b;
                        Producer producerB = this$4.b();
                        uVar2.getClass();
                        return new C1337b(producerB, 2);
                    case 5:
                        x this$5 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        p181m3.a.a();
                        NetworkFetcher networkFetcher2 = this$5.f36141c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                p181m3.a.a();
                                u uVar3 = this$5.f36140b;
                                b0 b0Var = new b0(uVar3.f36127k, uVar3.f36120d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(b0Var, "newNetworkFetchProducer(...)");
                                C1337b c1337b = new C1337b(this$5.j(b0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(c1337b, "newAddImageTransformMetaDataProducer(...)");
                                u uVar4 = this$5.f36140b;
                                if (!this$5.f36142d || this$5.f36144f == i.f36028c) {
                                    z10 = false;
                                }
                                h0VarB = uVar4.b(c1337b, z10, this$5.f36146h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return h0VarB;
                    case 6:
                        x this$6 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        p181m3.a.a();
                        u uVar5 = this$6.f36140b;
                        Producer producerA = this$6.a();
                        uVar5.getClass();
                        return new C1337b(producerA, 2);
                    case 7:
                        x this$7 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        p181m3.a.a();
                        S sA = this$7.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA, "newLocalFileFetchProducer(...)");
                        C1344i c1344iJ = this$7.j(sA);
                        this$7.f36140b.getClass();
                        return new l0(c1344iJ, this$7.f36143e);
                    case 8:
                        x this$8 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        p181m3.a.a();
                        u uVar6 = this$8.f36140b;
                        uVar6.getClass();
                        K k2 = new K(uVar6.f36126j.forLocalStorageRead(), uVar6.f36127k, uVar6.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k2, "newLocalContentUriFetchProducer(...)");
                        C1344i c1344iJ2 = this$8.j(k2);
                        this$8.f36140b.getClass();
                        return new l0(c1344iJ2, this$8.f36143e);
                    case 9:
                        x this$9 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        S sA2 = this$9.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA2, "newLocalFileFetchProducer(...)");
                        u uVar7 = this$9.f36140b;
                        return this$9.i(sA2, new ThumbnailProducer[]{new N(uVar7.f36126j.forThumbnailProducer(), uVar7.f36127k, uVar7.f36117a)});
                    case 10:
                        x this$10 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        u uVar8 = this$10.f36140b;
                        W w3 = new W(1, uVar8.f36126j.forLocalStorageRead(), uVar8.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w3, "newLocalVideoThumbnailProducer(...)");
                        return this$10.g(w3);
                    case 11:
                        x this$11 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        u uVar9 = this$11.f36140b;
                        uVar9.getClass();
                        K k8 = new K(uVar9.f36126j.forLocalStorageRead(), uVar9.f36127k, uVar9.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k8, "newLocalContentUriFetchProducer(...)");
                        u uVar10 = this$11.f36140b;
                        uVar10.getClass();
                        ExecutorSupplier executorSupplier = uVar10.f36126j;
                        Executor executorForLocalStorageRead = executorSupplier.forLocalStorageRead();
                        ContentResolver contentResolver2 = uVar10.f36117a;
                        PooledByteBufferFactory pooledByteBufferFactory = uVar10.f36127k;
                        return this$11.i(k8, new ThumbnailProducer[]{new L(executorForLocalStorageRead, pooledByteBufferFactory, contentResolver2), new N(executorSupplier.forThumbnailProducer(), pooledByteBufferFactory, uVar10.f36117a)});
                    case 12:
                        x this$12 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        u uVar11 = this$12.f36140b;
                        W w6 = new W(0, uVar11.f36126j.forBackgroundTasks(), uVar11.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w6, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.g(w6);
                    case 13:
                        x this$13 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        u uVar12 = this$13.f36140b;
                        uVar12.getClass();
                        f0 f0Var = new f0(uVar12.f36126j.forLocalStorageRead(), uVar12.f36127k, uVar12.f36117a);
                        Intrinsics.checkNotNullExpressionValue(f0Var, "newQualifiedResourceFetchProducer(...)");
                        u uVar13 = this$13.f36140b;
                        return this$13.i(f0Var, new ThumbnailProducer[]{new N(uVar13.f36126j.forThumbnailProducer(), uVar13.f36127k, uVar13.f36117a)});
                    case 14:
                        x this$14 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        u uVar14 = this$14.f36140b;
                        uVar14.getClass();
                        U u6 = new U(uVar14.f36126j.forLocalStorageRead(), uVar14.f36127k, uVar14.f36118b);
                        Intrinsics.checkNotNullExpressionValue(u6, "newLocalResourceFetchProducer(...)");
                        u uVar15 = this$14.f36140b;
                        return this$14.i(u6, new ThumbnailProducer[]{new N(uVar15.f36126j.forThumbnailProducer(), uVar15.f36127k, uVar15.f36117a)});
                    case 15:
                        x this$15 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        u uVar16 = this$15.f36140b;
                        uVar16.getClass();
                        I i110 = new I(uVar16.f36126j.forLocalStorageRead(), uVar16.f36127k, uVar16.f36119c);
                        Intrinsics.checkNotNullExpressionValue(i110, "newLocalAssetFetchProducer(...)");
                        u uVar17 = this$15.f36140b;
                        return this$15.i(i110, new ThumbnailProducer[]{new N(uVar17.f36126j.forThumbnailProducer(), uVar17.f36127k, uVar17.f36117a)});
                    case 16:
                        x this$16 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        u uVar18 = this$16.f36140b;
                        uVar18.getClass();
                        C1348m c1348m = new C1348m(p180m2.a.f39461a, uVar18.f36127k);
                        Intrinsics.checkNotNullExpressionValue(c1348m, "newDataFetchProducer(...)");
                        return this$16.h(this$16.f36140b.b(new C1337b(c1348m, 0), true, this$16.f36146h));
                    default:
                        x this$17 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$17.a());
                }
            }
        });
        final int i24 = 14;
        this.f36160w = C2131j.b(new Function0(this) { // from class: e3.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f36137b;

            {
                this.f36137b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                h0 h0VarB;
                boolean z10 = true;
                switch (i24) {
                    case 0:
                        x this$0 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$0.b());
                    case 1:
                        x this$1 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        p181m3.a.a();
                        Object value = this$1.f36155q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new C1337b((Producer) value);
                    case 2:
                        x this$2 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        p181m3.a.a();
                        return this$2.h((Producer) this$2.f36152n.getValue());
                    case 3:
                        x this$3 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        p181m3.a.a();
                        u uVar = this$3.f36140b;
                        Producer producer = (Producer) this$3.f36152n.getValue();
                        uVar.getClass();
                        return new l0(producer, this$3.f36143e);
                    case 4:
                        x this$4 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        p181m3.a.a();
                        u uVar2 = this$4.f36140b;
                        Producer producerB = this$4.b();
                        uVar2.getClass();
                        return new C1337b(producerB, 2);
                    case 5:
                        x this$5 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        p181m3.a.a();
                        NetworkFetcher networkFetcher2 = this$5.f36141c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                p181m3.a.a();
                                u uVar3 = this$5.f36140b;
                                b0 b0Var = new b0(uVar3.f36127k, uVar3.f36120d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(b0Var, "newNetworkFetchProducer(...)");
                                C1337b c1337b = new C1337b(this$5.j(b0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(c1337b, "newAddImageTransformMetaDataProducer(...)");
                                u uVar4 = this$5.f36140b;
                                if (!this$5.f36142d || this$5.f36144f == i.f36028c) {
                                    z10 = false;
                                }
                                h0VarB = uVar4.b(c1337b, z10, this$5.f36146h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return h0VarB;
                    case 6:
                        x this$6 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        p181m3.a.a();
                        u uVar5 = this$6.f36140b;
                        Producer producerA = this$6.a();
                        uVar5.getClass();
                        return new C1337b(producerA, 2);
                    case 7:
                        x this$7 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        p181m3.a.a();
                        S sA = this$7.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA, "newLocalFileFetchProducer(...)");
                        C1344i c1344iJ = this$7.j(sA);
                        this$7.f36140b.getClass();
                        return new l0(c1344iJ, this$7.f36143e);
                    case 8:
                        x this$8 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        p181m3.a.a();
                        u uVar6 = this$8.f36140b;
                        uVar6.getClass();
                        K k2 = new K(uVar6.f36126j.forLocalStorageRead(), uVar6.f36127k, uVar6.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k2, "newLocalContentUriFetchProducer(...)");
                        C1344i c1344iJ2 = this$8.j(k2);
                        this$8.f36140b.getClass();
                        return new l0(c1344iJ2, this$8.f36143e);
                    case 9:
                        x this$9 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        S sA2 = this$9.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA2, "newLocalFileFetchProducer(...)");
                        u uVar7 = this$9.f36140b;
                        return this$9.i(sA2, new ThumbnailProducer[]{new N(uVar7.f36126j.forThumbnailProducer(), uVar7.f36127k, uVar7.f36117a)});
                    case 10:
                        x this$10 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        u uVar8 = this$10.f36140b;
                        W w3 = new W(1, uVar8.f36126j.forLocalStorageRead(), uVar8.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w3, "newLocalVideoThumbnailProducer(...)");
                        return this$10.g(w3);
                    case 11:
                        x this$11 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        u uVar9 = this$11.f36140b;
                        uVar9.getClass();
                        K k8 = new K(uVar9.f36126j.forLocalStorageRead(), uVar9.f36127k, uVar9.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k8, "newLocalContentUriFetchProducer(...)");
                        u uVar10 = this$11.f36140b;
                        uVar10.getClass();
                        ExecutorSupplier executorSupplier = uVar10.f36126j;
                        Executor executorForLocalStorageRead = executorSupplier.forLocalStorageRead();
                        ContentResolver contentResolver2 = uVar10.f36117a;
                        PooledByteBufferFactory pooledByteBufferFactory = uVar10.f36127k;
                        return this$11.i(k8, new ThumbnailProducer[]{new L(executorForLocalStorageRead, pooledByteBufferFactory, contentResolver2), new N(executorSupplier.forThumbnailProducer(), pooledByteBufferFactory, uVar10.f36117a)});
                    case 12:
                        x this$12 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        u uVar11 = this$12.f36140b;
                        W w6 = new W(0, uVar11.f36126j.forBackgroundTasks(), uVar11.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w6, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.g(w6);
                    case 13:
                        x this$13 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        u uVar12 = this$13.f36140b;
                        uVar12.getClass();
                        f0 f0Var = new f0(uVar12.f36126j.forLocalStorageRead(), uVar12.f36127k, uVar12.f36117a);
                        Intrinsics.checkNotNullExpressionValue(f0Var, "newQualifiedResourceFetchProducer(...)");
                        u uVar13 = this$13.f36140b;
                        return this$13.i(f0Var, new ThumbnailProducer[]{new N(uVar13.f36126j.forThumbnailProducer(), uVar13.f36127k, uVar13.f36117a)});
                    case 14:
                        x this$14 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        u uVar14 = this$14.f36140b;
                        uVar14.getClass();
                        U u6 = new U(uVar14.f36126j.forLocalStorageRead(), uVar14.f36127k, uVar14.f36118b);
                        Intrinsics.checkNotNullExpressionValue(u6, "newLocalResourceFetchProducer(...)");
                        u uVar15 = this$14.f36140b;
                        return this$14.i(u6, new ThumbnailProducer[]{new N(uVar15.f36126j.forThumbnailProducer(), uVar15.f36127k, uVar15.f36117a)});
                    case 15:
                        x this$15 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        u uVar16 = this$15.f36140b;
                        uVar16.getClass();
                        I i110 = new I(uVar16.f36126j.forLocalStorageRead(), uVar16.f36127k, uVar16.f36119c);
                        Intrinsics.checkNotNullExpressionValue(i110, "newLocalAssetFetchProducer(...)");
                        u uVar17 = this$15.f36140b;
                        return this$15.i(i110, new ThumbnailProducer[]{new N(uVar17.f36126j.forThumbnailProducer(), uVar17.f36127k, uVar17.f36117a)});
                    case 16:
                        x this$16 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        u uVar18 = this$16.f36140b;
                        uVar18.getClass();
                        C1348m c1348m = new C1348m(p180m2.a.f39461a, uVar18.f36127k);
                        Intrinsics.checkNotNullExpressionValue(c1348m, "newDataFetchProducer(...)");
                        return this$16.h(this$16.f36140b.b(new C1337b(c1348m, 0), true, this$16.f36146h));
                    default:
                        x this$17 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$17.a());
                }
            }
        });
        final int i25 = 15;
        this.f36161x = C2131j.b(new Function0(this) { // from class: e3.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f36137b;

            {
                this.f36137b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                h0 h0VarB;
                boolean z10 = true;
                switch (i25) {
                    case 0:
                        x this$0 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$0.b());
                    case 1:
                        x this$1 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        p181m3.a.a();
                        Object value = this$1.f36155q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new C1337b((Producer) value);
                    case 2:
                        x this$2 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        p181m3.a.a();
                        return this$2.h((Producer) this$2.f36152n.getValue());
                    case 3:
                        x this$3 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        p181m3.a.a();
                        u uVar = this$3.f36140b;
                        Producer producer = (Producer) this$3.f36152n.getValue();
                        uVar.getClass();
                        return new l0(producer, this$3.f36143e);
                    case 4:
                        x this$4 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        p181m3.a.a();
                        u uVar2 = this$4.f36140b;
                        Producer producerB = this$4.b();
                        uVar2.getClass();
                        return new C1337b(producerB, 2);
                    case 5:
                        x this$5 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        p181m3.a.a();
                        NetworkFetcher networkFetcher2 = this$5.f36141c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                p181m3.a.a();
                                u uVar3 = this$5.f36140b;
                                b0 b0Var = new b0(uVar3.f36127k, uVar3.f36120d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(b0Var, "newNetworkFetchProducer(...)");
                                C1337b c1337b = new C1337b(this$5.j(b0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(c1337b, "newAddImageTransformMetaDataProducer(...)");
                                u uVar4 = this$5.f36140b;
                                if (!this$5.f36142d || this$5.f36144f == i.f36028c) {
                                    z10 = false;
                                }
                                h0VarB = uVar4.b(c1337b, z10, this$5.f36146h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return h0VarB;
                    case 6:
                        x this$6 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        p181m3.a.a();
                        u uVar5 = this$6.f36140b;
                        Producer producerA = this$6.a();
                        uVar5.getClass();
                        return new C1337b(producerA, 2);
                    case 7:
                        x this$7 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        p181m3.a.a();
                        S sA = this$7.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA, "newLocalFileFetchProducer(...)");
                        C1344i c1344iJ = this$7.j(sA);
                        this$7.f36140b.getClass();
                        return new l0(c1344iJ, this$7.f36143e);
                    case 8:
                        x this$8 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        p181m3.a.a();
                        u uVar6 = this$8.f36140b;
                        uVar6.getClass();
                        K k2 = new K(uVar6.f36126j.forLocalStorageRead(), uVar6.f36127k, uVar6.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k2, "newLocalContentUriFetchProducer(...)");
                        C1344i c1344iJ2 = this$8.j(k2);
                        this$8.f36140b.getClass();
                        return new l0(c1344iJ2, this$8.f36143e);
                    case 9:
                        x this$9 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        S sA2 = this$9.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA2, "newLocalFileFetchProducer(...)");
                        u uVar7 = this$9.f36140b;
                        return this$9.i(sA2, new ThumbnailProducer[]{new N(uVar7.f36126j.forThumbnailProducer(), uVar7.f36127k, uVar7.f36117a)});
                    case 10:
                        x this$10 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        u uVar8 = this$10.f36140b;
                        W w3 = new W(1, uVar8.f36126j.forLocalStorageRead(), uVar8.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w3, "newLocalVideoThumbnailProducer(...)");
                        return this$10.g(w3);
                    case 11:
                        x this$11 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        u uVar9 = this$11.f36140b;
                        uVar9.getClass();
                        K k8 = new K(uVar9.f36126j.forLocalStorageRead(), uVar9.f36127k, uVar9.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k8, "newLocalContentUriFetchProducer(...)");
                        u uVar10 = this$11.f36140b;
                        uVar10.getClass();
                        ExecutorSupplier executorSupplier = uVar10.f36126j;
                        Executor executorForLocalStorageRead = executorSupplier.forLocalStorageRead();
                        ContentResolver contentResolver2 = uVar10.f36117a;
                        PooledByteBufferFactory pooledByteBufferFactory = uVar10.f36127k;
                        return this$11.i(k8, new ThumbnailProducer[]{new L(executorForLocalStorageRead, pooledByteBufferFactory, contentResolver2), new N(executorSupplier.forThumbnailProducer(), pooledByteBufferFactory, uVar10.f36117a)});
                    case 12:
                        x this$12 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        u uVar11 = this$12.f36140b;
                        W w6 = new W(0, uVar11.f36126j.forBackgroundTasks(), uVar11.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w6, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.g(w6);
                    case 13:
                        x this$13 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        u uVar12 = this$13.f36140b;
                        uVar12.getClass();
                        f0 f0Var = new f0(uVar12.f36126j.forLocalStorageRead(), uVar12.f36127k, uVar12.f36117a);
                        Intrinsics.checkNotNullExpressionValue(f0Var, "newQualifiedResourceFetchProducer(...)");
                        u uVar13 = this$13.f36140b;
                        return this$13.i(f0Var, new ThumbnailProducer[]{new N(uVar13.f36126j.forThumbnailProducer(), uVar13.f36127k, uVar13.f36117a)});
                    case 14:
                        x this$14 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        u uVar14 = this$14.f36140b;
                        uVar14.getClass();
                        U u6 = new U(uVar14.f36126j.forLocalStorageRead(), uVar14.f36127k, uVar14.f36118b);
                        Intrinsics.checkNotNullExpressionValue(u6, "newLocalResourceFetchProducer(...)");
                        u uVar15 = this$14.f36140b;
                        return this$14.i(u6, new ThumbnailProducer[]{new N(uVar15.f36126j.forThumbnailProducer(), uVar15.f36127k, uVar15.f36117a)});
                    case 15:
                        x this$15 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        u uVar16 = this$15.f36140b;
                        uVar16.getClass();
                        I i110 = new I(uVar16.f36126j.forLocalStorageRead(), uVar16.f36127k, uVar16.f36119c);
                        Intrinsics.checkNotNullExpressionValue(i110, "newLocalAssetFetchProducer(...)");
                        u uVar17 = this$15.f36140b;
                        return this$15.i(i110, new ThumbnailProducer[]{new N(uVar17.f36126j.forThumbnailProducer(), uVar17.f36127k, uVar17.f36117a)});
                    case 16:
                        x this$16 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        u uVar18 = this$16.f36140b;
                        uVar18.getClass();
                        C1348m c1348m = new C1348m(p180m2.a.f39461a, uVar18.f36127k);
                        Intrinsics.checkNotNullExpressionValue(c1348m, "newDataFetchProducer(...)");
                        return this$16.h(this$16.f36140b.b(new C1337b(c1348m, 0), true, this$16.f36146h));
                    default:
                        x this$17 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$17.a());
                }
            }
        });
        final int i26 = 16;
        this.f36162y = C2131j.b(new Function0(this) { // from class: e3.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f36137b;

            {
                this.f36137b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                h0 h0VarB;
                boolean z10 = true;
                switch (i26) {
                    case 0:
                        x this$0 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$0.b());
                    case 1:
                        x this$1 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        p181m3.a.a();
                        Object value = this$1.f36155q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return new C1337b((Producer) value);
                    case 2:
                        x this$2 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        p181m3.a.a();
                        return this$2.h((Producer) this$2.f36152n.getValue());
                    case 3:
                        x this$3 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        p181m3.a.a();
                        u uVar = this$3.f36140b;
                        Producer producer = (Producer) this$3.f36152n.getValue();
                        uVar.getClass();
                        return new l0(producer, this$3.f36143e);
                    case 4:
                        x this$4 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        p181m3.a.a();
                        u uVar2 = this$4.f36140b;
                        Producer producerB = this$4.b();
                        uVar2.getClass();
                        return new C1337b(producerB, 2);
                    case 5:
                        x this$5 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        p181m3.a.a();
                        NetworkFetcher networkFetcher2 = this$5.f36141c;
                        synchronized (this$5) {
                            try {
                                Intrinsics.checkNotNullParameter(networkFetcher2, "networkFetcher");
                                p181m3.a.a();
                                u uVar3 = this$5.f36140b;
                                b0 b0Var = new b0(uVar3.f36127k, uVar3.f36120d, networkFetcher2);
                                Intrinsics.checkNotNullExpressionValue(b0Var, "newNetworkFetchProducer(...)");
                                C1337b c1337b = new C1337b(this$5.j(b0Var), 0);
                                Intrinsics.checkNotNullExpressionValue(c1337b, "newAddImageTransformMetaDataProducer(...)");
                                u uVar4 = this$5.f36140b;
                                if (!this$5.f36142d || this$5.f36144f == i.f36028c) {
                                    z10 = false;
                                }
                                h0VarB = uVar4.b(c1337b, z10, this$5.f36146h);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return h0VarB;
                    case 6:
                        x this$6 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        p181m3.a.a();
                        u uVar5 = this$6.f36140b;
                        Producer producerA = this$6.a();
                        uVar5.getClass();
                        return new C1337b(producerA, 2);
                    case 7:
                        x this$7 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        p181m3.a.a();
                        S sA = this$7.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA, "newLocalFileFetchProducer(...)");
                        C1344i c1344iJ = this$7.j(sA);
                        this$7.f36140b.getClass();
                        return new l0(c1344iJ, this$7.f36143e);
                    case 8:
                        x this$8 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        p181m3.a.a();
                        u uVar6 = this$8.f36140b;
                        uVar6.getClass();
                        K k2 = new K(uVar6.f36126j.forLocalStorageRead(), uVar6.f36127k, uVar6.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k2, "newLocalContentUriFetchProducer(...)");
                        C1344i c1344iJ2 = this$8.j(k2);
                        this$8.f36140b.getClass();
                        return new l0(c1344iJ2, this$8.f36143e);
                    case 9:
                        x this$9 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$9, "this$0");
                        S sA2 = this$9.f36140b.a();
                        Intrinsics.checkNotNullExpressionValue(sA2, "newLocalFileFetchProducer(...)");
                        u uVar7 = this$9.f36140b;
                        return this$9.i(sA2, new ThumbnailProducer[]{new N(uVar7.f36126j.forThumbnailProducer(), uVar7.f36127k, uVar7.f36117a)});
                    case 10:
                        x this$10 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$10, "this$0");
                        u uVar8 = this$10.f36140b;
                        W w3 = new W(1, uVar8.f36126j.forLocalStorageRead(), uVar8.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w3, "newLocalVideoThumbnailProducer(...)");
                        return this$10.g(w3);
                    case 11:
                        x this$11 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$11, "this$0");
                        u uVar9 = this$11.f36140b;
                        uVar9.getClass();
                        K k8 = new K(uVar9.f36126j.forLocalStorageRead(), uVar9.f36127k, uVar9.f36117a);
                        Intrinsics.checkNotNullExpressionValue(k8, "newLocalContentUriFetchProducer(...)");
                        u uVar10 = this$11.f36140b;
                        uVar10.getClass();
                        ExecutorSupplier executorSupplier = uVar10.f36126j;
                        Executor executorForLocalStorageRead = executorSupplier.forLocalStorageRead();
                        ContentResolver contentResolver2 = uVar10.f36117a;
                        PooledByteBufferFactory pooledByteBufferFactory = uVar10.f36127k;
                        return this$11.i(k8, new ThumbnailProducer[]{new L(executorForLocalStorageRead, pooledByteBufferFactory, contentResolver2), new N(executorSupplier.forThumbnailProducer(), pooledByteBufferFactory, uVar10.f36117a)});
                    case 12:
                        x this$12 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$12, "this$0");
                        if (Build.VERSION.SDK_INT < 29) {
                            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                        }
                        u uVar11 = this$12.f36140b;
                        W w6 = new W(0, uVar11.f36126j.forBackgroundTasks(), uVar11.f36117a);
                        Intrinsics.checkNotNullExpressionValue(w6, "newLocalThumbnailBitmapSdk29Producer(...)");
                        return this$12.g(w6);
                    case 13:
                        x this$13 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$13, "this$0");
                        u uVar12 = this$13.f36140b;
                        uVar12.getClass();
                        f0 f0Var = new f0(uVar12.f36126j.forLocalStorageRead(), uVar12.f36127k, uVar12.f36117a);
                        Intrinsics.checkNotNullExpressionValue(f0Var, "newQualifiedResourceFetchProducer(...)");
                        u uVar13 = this$13.f36140b;
                        return this$13.i(f0Var, new ThumbnailProducer[]{new N(uVar13.f36126j.forThumbnailProducer(), uVar13.f36127k, uVar13.f36117a)});
                    case 14:
                        x this$14 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$14, "this$0");
                        u uVar14 = this$14.f36140b;
                        uVar14.getClass();
                        U u6 = new U(uVar14.f36126j.forLocalStorageRead(), uVar14.f36127k, uVar14.f36118b);
                        Intrinsics.checkNotNullExpressionValue(u6, "newLocalResourceFetchProducer(...)");
                        u uVar15 = this$14.f36140b;
                        return this$14.i(u6, new ThumbnailProducer[]{new N(uVar15.f36126j.forThumbnailProducer(), uVar15.f36127k, uVar15.f36117a)});
                    case 15:
                        x this$15 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$15, "this$0");
                        u uVar16 = this$15.f36140b;
                        uVar16.getClass();
                        I i110 = new I(uVar16.f36126j.forLocalStorageRead(), uVar16.f36127k, uVar16.f36119c);
                        Intrinsics.checkNotNullExpressionValue(i110, "newLocalAssetFetchProducer(...)");
                        u uVar17 = this$15.f36140b;
                        return this$15.i(i110, new ThumbnailProducer[]{new N(uVar17.f36126j.forThumbnailProducer(), uVar17.f36127k, uVar17.f36117a)});
                    case 16:
                        x this$16 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$16, "this$0");
                        u uVar18 = this$16.f36140b;
                        uVar18.getClass();
                        C1348m c1348m = new C1348m(p180m2.a.f39461a, uVar18.f36127k);
                        Intrinsics.checkNotNullExpressionValue(c1348m, "newDataFetchProducer(...)");
                        return this$16.h(this$16.f36140b.b(new C1337b(c1348m, 0), true, this$16.f36146h));
                    default:
                        x this$17 = this.f36137b;
                        Intrinsics.checkNotNullParameter(this$17, "this$0");
                        p181m3.a.a();
                        return new C1337b(this$17.a());
                }
            }
        });
    }

    public final Producer a() {
        Object value = this.f36154p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Producer) value;
    }

    public final Producer b() {
        Object value = this.f36150l.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Producer) value;
    }

    public final Producer c(d dVar) {
        p181m3.a.a();
        Uri sourceUri = dVar.getSourceUri();
        Intrinsics.checkNotNullExpressionValue(sourceUri, "getSourceUri(...)");
        if (sourceUri == null) {
            throw new IllegalStateException("Uri is null.");
        }
        int sourceUriType = dVar.getSourceUriType();
        if (sourceUriType == 0) {
            return (Producer) this.f36149k.getValue();
        }
        t tVar = this.f36157s;
        switch (sourceUriType) {
            case 2:
                return dVar.getLoadThumbnailOnlyForAndroidSdkAboveQ() ? e() : (Producer) tVar.getValue();
            case 3:
                return dVar.getLoadThumbnailOnlyForAndroidSdkAboveQ() ? e() : (Producer) this.f36156r.getValue();
            case 4:
                if (dVar.getLoadThumbnailOnlyForAndroidSdkAboveQ()) {
                    return e();
                }
                String type = this.f36139a.getType(sourceUri);
                Object obj = p244q2.a.f41447a;
                return type != null ? y.m(type, "video/", false) : false ? (Producer) tVar.getValue() : (Producer) this.t.getValue();
            case 5:
                return (Producer) this.f36161x.getValue();
            case 6:
                return (Producer) this.f36160w.getValue();
            case 7:
                return (Producer) this.f36162y.getValue();
            case 8:
                return (Producer) this.f36159v.getValue();
            default:
                Set set = this.f36147i;
                if (set != null) {
                    Iterator it = set.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                }
                throw new IllegalArgumentException(G.o("Unsupported uri scheme! Uri is: ", f36138z.getShortenedUriString(sourceUri)));
        }
    }

    public final Producer d(d imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        w wVar = f36138z;
        wVar.validateEncodedImageRequest(imageRequest);
        int sourceUriType = imageRequest.getSourceUriType();
        if (sourceUriType == 0) {
            Object value = this.f36151m.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (Producer) value;
        }
        if (sourceUriType == 2 || sourceUriType == 3) {
            Object value2 = this.f36153o.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            return (Producer) value2;
        }
        Uri sourceUri = imageRequest.getSourceUri();
        Intrinsics.checkNotNullExpressionValue(sourceUri, "getSourceUri(...)");
        throw new IllegalArgumentException(G.o("Unsupported uri scheme for encoded image fetch! Uri is: ", wVar.getShortenedUriString(sourceUri)));
    }

    public final Producer e() {
        return (Producer) this.f36158u.getValue();
    }

    public final synchronized Producer f(Producer producer) {
        Producer producer2;
        producer2 = (Producer) this.f36148j.get(producer);
        if (producer2 == null) {
            u uVar = this.f36140b;
            C1357w c1357w = new C1357w(producer, uVar.f36132p, uVar.f36126j.forBackgroundTasks());
            Intrinsics.checkNotNullExpressionValue(c1357w, "newPostprocessorProducer(...)");
            u uVar2 = this.f36140b;
            C1357w c1357w2 = new C1357w(uVar2.f36130n, uVar2.f36131o, c1357w, 2);
            this.f36148j.put(producer, c1357w2);
            producer2 = c1357w2;
        }
        return producer2;
    }

    public final Producer g(Producer producer) {
        u uVar = this.f36140b;
        MemoryCache memoryCache = uVar.f36130n;
        CacheKeyFactory cacheKeyFactory = uVar.f36131o;
        C1346k c1346k = new C1346k(memoryCache, cacheKeyFactory, producer, 0);
        Intrinsics.checkNotNullExpressionValue(c1346k, "newBitmapMemoryCacheProducer(...)");
        C1344i c1344i = new C1344i(cacheKeyFactory, c1346k);
        Intrinsics.checkNotNullExpressionValue(c1344i, "newBitmapMemoryCacheKeyMultiplexProducer(...)");
        l0 inputProducer = new l0(c1344i, this.f36143e);
        Intrinsics.checkNotNullExpressionValue(inputProducer, "newBackgroundThreadHandoffProducer(...)");
        MemoryCache memoryCache2 = uVar.f36130n;
        Intrinsics.checkNotNullParameter(memoryCache2, "memoryCache");
        Intrinsics.checkNotNullParameter(cacheKeyFactory, "cacheKeyFactory");
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        C1343h c1343h = new C1343h(memoryCache2, cacheKeyFactory, inputProducer, 0);
        Intrinsics.checkNotNullExpressionValue(c1343h, "newBitmapMemoryCacheGetProducer(...)");
        return c1343h;
    }

    public final Producer h(Producer inputProducer) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        p181m3.a.a();
        u uVar = this.f36140b;
        uVar.getClass();
        C1353s c1353s = new C1353s(uVar.f36120d, uVar.f36126j.forDecode(), uVar.f36121e, uVar.f36122f, uVar.f36123g, uVar.f36124h, uVar.f36125i, inputProducer, uVar.f36134r, uVar.f36133q);
        Intrinsics.checkNotNullExpressionValue(c1353s, "newDecodeProducer(...)");
        return g(c1353s);
    }

    public final Producer i(P p3, ThumbnailProducer[] thumbnailProducerArr) {
        C1337b c1337b = new C1337b(j(p3), 0);
        Intrinsics.checkNotNullExpressionValue(c1337b, "newAddImageTransformMetaDataProducer(...)");
        u uVar = this.f36140b;
        c cVar = this.f36146h;
        n0 n0Var = new n0(uVar.f36126j.forLightweightBackgroundTasks(), uVar.b(c1337b, true, cVar));
        Intrinsics.checkNotNullExpressionValue(n0Var, "newThrottlingProducer(...)");
        C1337b c1337b2 = new C1337b(thumbnailProducerArr);
        Intrinsics.checkNotNullExpressionValue(c1337b2, "newThumbnailBranchProducer(...)");
        h0 h0VarB = uVar.b(c1337b2, true, cVar);
        Intrinsics.checkNotNullExpressionValue(h0VarB, "newResizeAndRotateProducer(...)");
        W w3 = new W(2, h0VarB, n0Var);
        Intrinsics.checkNotNullExpressionValue(w3, "newBranchOnSeparateImagesProducer(...)");
        return h(w3);
    }

    public final C1344i j(Producer producer) {
        boolean z3 = this.f36145g;
        u uVar = this.f36140b;
        if (z3) {
            p181m3.a.a();
            Supplier supplier = uVar.f36128l;
            CacheKeyFactory cacheKeyFactory = uVar.f36131o;
            producer = new C1357w(supplier, cacheKeyFactory, new C1357w(supplier, cacheKeyFactory, producer, 1), 0);
            Intrinsics.checkNotNullExpressionValue(producer, "newDiskCacheReadProducer(...)");
        }
        MemoryCache memoryCache = uVar.f36129m;
        CacheKeyFactory cacheKeyFactory2 = uVar.f36131o;
        C1346k c1346k = new C1346k(memoryCache, cacheKeyFactory2, producer, 1);
        Intrinsics.checkNotNullExpressionValue(c1346k, "newEncodedMemoryCacheProducer(...)");
        C1344i c1344i = new C1344i(cacheKeyFactory2, uVar.f36135s, c1346k);
        Intrinsics.checkNotNullExpressionValue(c1344i, "newEncodedCacheKeyMultiplexProducer(...)");
        return c1344i;
    }
}
