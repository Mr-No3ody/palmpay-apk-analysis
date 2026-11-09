package androidx.work.impl;

import androidx.work.impl.model.WorkTagDao;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.ImageCacheStatsTracker;
import com.facebook.react.runtime.ReactHostImpl;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.work.impl.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC1270c implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18469d;

    public /* synthetic */ CallableC1270c(ReactHostImpl reactHostImpl, String str, Exception exc) {
        this.f18466a = 1;
        this.f18468c = reactHostImpl;
        this.f18467b = str;
        this.f18469d = exc;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f18466a) {
            case 0:
                WorkDatabase workDatabase = ((C1271d) this.f18468c).f18534e;
                WorkTagDao workTagDaoI = workDatabase.i();
                String str = (String) this.f18467b;
                ((ArrayList) this.f18469d).addAll(workTagDaoI.getTagsForWorkSpecId(str));
                return workDatabase.h().getWorkSpec(str);
            case 1:
                return ReactHostImpl.destroy$lambda$10((ReactHostImpl) this.f18468c, (String) this.f18467b, (Exception) this.f18469d);
            default:
                AtomicBoolean isCancelled = (AtomicBoolean) this.f18468c;
                Intrinsics.checkNotNullParameter(isCancelled, "$isCancelled");
                p045d3.d this$0 = (p045d3.d) this.f18469d;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                CacheKey key = (CacheKey) this.f18467b;
                Intrinsics.checkNotNullParameter(key, "$key");
                try {
                    if (isCancelled.get()) {
                        throw new CancellationException();
                    }
                    p109h3.e eVarD = this$0.f35501g.d(key);
                    Class cls = p045d3.d.f35494h;
                    ImageCacheStatsTracker imageCacheStatsTracker = this$0.f35500f;
                    if (eVarD != null) {
                        p229p2.a.o(cls, "Found image for %s in staging area", key.getUriString());
                        imageCacheStatsTracker.onStagingAreaHit(key);
                    } else {
                        p229p2.a.o(cls, "Did not find image for %s in staging area", key.getUriString());
                        imageCacheStatsTracker.onStagingAreaMiss(key);
                        try {
                            PooledByteBuffer pooledByteBufferD = this$0.d(key);
                            if (pooledByteBufferD == null) {
                                return null;
                            }
                            com.facebook.common.references.b bVarI = CloseableReference.i(pooledByteBufferD);
                            Intrinsics.checkNotNullExpressionValue(bVarI, "of(...)");
                            try {
                                p109h3.e eVar = new p109h3.e(bVarI);
                                bVarI.close();
                                eVarD = eVar;
                            } catch (Throwable th) {
                                CloseableReference.d(bVarI);
                                throw th;
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (!Thread.interrupted()) {
                        return eVarD;
                    }
                    if (p229p2.a.f41180a.isLoggable(2)) {
                        p229p2.b.a(2, cls.getSimpleName(), "Host thread was interrupted, decreasing reference count");
                    }
                    eVarD.close();
                    throw new InterruptedException();
                } catch (Throwable th2) {
                    Intrinsics.checkNotNullParameter(th2, "th");
                    throw th2;
                }
        }
    }

    public /* synthetic */ CallableC1270c(Object obj, int i7, Object obj2, Object obj3) {
        this.f18466a = i7;
        this.f18468c = obj;
        this.f18469d = obj2;
        this.f18467b = obj3;
    }
}
