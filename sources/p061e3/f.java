package p061e3;

import com.facebook.cache.disk.FileCache;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.core.ExecutorSupplier;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.collections.F;
import kotlin.collections.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p045d3.d;
import p136j2.b;
import p262r2.g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f36009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f36010c;

    public /* synthetic */ f(g gVar, h hVar, int i7) {
        this.f36008a = i7;
        this.f36009b = gVar;
        this.f36010c = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36008a) {
            case 0:
                g this$0 = this.f36009b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                h this$1 = this.f36010c;
                Intrinsics.checkNotNullParameter(this$1, "this$1");
                FileCache mainFileCache = this$0.getMainFileCache();
                PooledByteBufferFactory pooledByteBufferFactoryB = this$1.f36018b.b(this$1.f36021e);
                Intrinsics.checkNotNullExpressionValue(pooledByteBufferFactoryB, "getPooledByteBufferFactory(...)");
                g gVarC = this$1.f36018b.c();
                Intrinsics.checkNotNullExpressionValue(gVarC, "getPooledByteStreams(...)");
                ExecutorSupplier executorSupplier = this$1.f36019c;
                Executor executorForLocalStorageRead = executorSupplier.forLocalStorageRead();
                Intrinsics.checkNotNullExpressionValue(executorForLocalStorageRead, "forLocalStorageRead(...)");
                Executor executorForLocalStorageWrite = executorSupplier.forLocalStorageWrite();
                Intrinsics.checkNotNullExpressionValue(executorForLocalStorageWrite, "forLocalStorageWrite(...)");
                return new d(mainFileCache, pooledByteBufferFactoryB, gVarC, executorForLocalStorageRead, executorForLocalStorageWrite, this$1.f36020d);
            case 1:
                g this$2 = this.f36009b;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                h this$3 = this.f36010c;
                Intrinsics.checkNotNullParameter(this$3, "this$1");
                FileCache smallImageFileCache = this$2.getSmallImageFileCache();
                PooledByteBufferFactory pooledByteBufferFactoryB2 = this$3.f36018b.b(this$3.f36021e);
                Intrinsics.checkNotNullExpressionValue(pooledByteBufferFactoryB2, "getPooledByteBufferFactory(...)");
                g gVarC2 = this$3.f36018b.c();
                Intrinsics.checkNotNullExpressionValue(gVarC2, "getPooledByteStreams(...)");
                ExecutorSupplier executorSupplier2 = this$3.f36019c;
                Executor executorForLocalStorageRead2 = executorSupplier2.forLocalStorageRead();
                Intrinsics.checkNotNullExpressionValue(executorForLocalStorageRead2, "forLocalStorageRead(...)");
                Executor executorForLocalStorageWrite2 = executorSupplier2.forLocalStorageWrite();
                Intrinsics.checkNotNullExpressionValue(executorForLocalStorageWrite2, "forLocalStorageWrite(...)");
                return new d(smallImageFileCache, pooledByteBufferFactoryB2, gVarC2, executorForLocalStorageRead2, executorForLocalStorageWrite2, this$3.f36020d);
            case 2:
                h this$4 = this.f36010c;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                Intrinsics.checkNotNullParameter(this.f36009b, "this$1");
                Map map = this$4.f36024h;
                if (map == null) {
                    return G.c();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(F.a(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), this$4.f36017a.get((b) entry.getValue()));
                }
                return linkedHashMap;
            default:
                g this$5 = this.f36009b;
                Intrinsics.checkNotNullParameter(this$5, "this$0");
                h this$6 = this.f36010c;
                Intrinsics.checkNotNullParameter(this$6, "this$1");
                Map dynamicFileCaches = this$5.getDynamicFileCaches();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(F.a(dynamicFileCaches.size()));
                for (Map.Entry entry2 : dynamicFileCaches.entrySet()) {
                    Object key = entry2.getKey();
                    FileCache fileCache = (FileCache) entry2.getValue();
                    PooledByteBufferFactory pooledByteBufferFactoryB3 = this$6.f36018b.b(this$6.f36021e);
                    Intrinsics.checkNotNullExpressionValue(pooledByteBufferFactoryB3, "getPooledByteBufferFactory(...)");
                    g gVarC3 = this$6.f36018b.c();
                    Intrinsics.checkNotNullExpressionValue(gVarC3, "getPooledByteStreams(...)");
                    ExecutorSupplier executorSupplier3 = this$6.f36019c;
                    Executor executorForLocalStorageRead3 = executorSupplier3.forLocalStorageRead();
                    Intrinsics.checkNotNullExpressionValue(executorForLocalStorageRead3, "forLocalStorageRead(...)");
                    Executor executorForLocalStorageWrite3 = executorSupplier3.forLocalStorageWrite();
                    Intrinsics.checkNotNullExpressionValue(executorForLocalStorageWrite3, "forLocalStorageWrite(...)");
                    linkedHashMap2.put(key, new d(fileCache, pooledByteBufferFactoryB3, gVarC3, executorForLocalStorageRead3, executorForLocalStorageWrite3, this$6.f36020d));
                }
                return new p213o2.d(linkedHashMap2);
        }
    }

    public /* synthetic */ f(h hVar, g gVar) {
        this.f36008a = 2;
        this.f36010c = hVar;
        this.f36009b = gVar;
    }
}
