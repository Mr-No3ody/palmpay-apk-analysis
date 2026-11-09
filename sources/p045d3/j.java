package p045d3;

import S7.b;
import U2.B;
import android.content.ContentValues;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Z;
import androidx.room.migration.AutoMigrationSpec;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.didi.drouter.store.IRouterProxy;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.cache.ImageCacheStatsTracker;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.soloader.C1392b;
import com.facebook.soloader.D;
import com.facebook.soloader.recovery.RecoveryStrategy;
import com.facebook.soloader.w;
import com.facebook.soloader.x;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.palmpay.lib.bridgewrapper.picker.CascadePickerBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.HideLoadingBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.ShowRichTextDialogBridge;
import com.transsnet.palmpay.credit.rnbridge.QuotaChangeSetBridge;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes.dex */
public final class j implements ImageCacheStatsTracker, RecoveryStrategy, AutoMigrationSpec, ObjectConstructor, IRouterProxy, SharingStarted {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static j f35515b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35516a;

    public /* synthetic */ j(int i7) {
        this.f35516a = i7;
    }

    public void a(Z fragmentManager, List ops) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(ops, "ops");
        Iterator it = ops.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(fragmentManager, this);
        }
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object callMethod(Object obj, String str, Object[] objArr) throws B {
        switch (this.f35516a) {
            case 6:
                throw new B(11);
            case 7:
                throw new B(11);
            case 8:
                throw new B(11);
            default:
                throw new B(11);
        }
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public Flow command(StateFlow stateFlow) {
        return new X0.j(kotlinx.coroutines.flow.Z.f39128a, 4);
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public Object construct() {
        return new ArrayDeque();
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object newInstance(Context context) {
        switch (this.f35516a) {
            case 6:
                return new CascadePickerBridge();
            case 7:
                return new HideLoadingBridge();
            case 8:
                return new ShowRichTextDialogBridge();
            default:
                return new QuotaChangeSetBridge();
        }
    }

    @Override // androidx.room.migration.AutoMigrationSpec
    public void onPostMigrate(SupportSQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.execSQL("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        db2.update("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }

    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, x[] xVarArr) {
        if (unsatisfiedLinkError instanceof w) {
            Log.e("SoLoader", "Checking /data/data missing libraries.");
            boolean z3 = false;
            for (x xVar : xVarArr) {
                if ((xVar instanceof D) && !(xVar instanceof C1392b)) {
                    D d2 = (D) xVar;
                    try {
                        for (com.facebook.soloader.B b7 : d2.g()) {
                            if (d2.e(b7.f21850a) == null) {
                                Log.e("SoLoader", "Missing " + b7.f21850a + " from " + d2.b() + ", will force prepare.");
                                d2.d(2);
                                z3 = true;
                                break;
                            }
                        }
                    } catch (Exception e10) {
                        Log.e("SoLoader", "Encountered an exception while recovering from /data/data failure ", e10);
                    }
                }
            }
            if (z3) {
                Log.e("SoLoader", "Successfully recovered from /data/data disk failure.");
                return true;
            }
            Log.e("SoLoader", "No libraries missing from unpacking so paths while recovering /data/data failure");
            return false;
        }
        return false;
    }

    public String toString() {
        switch (this.f35516a) {
            case 10:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onBitmapCacheHit(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onBitmapCacheMiss(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onBitmapCachePut(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onDiskCacheGetFail(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onDiskCacheHit(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onDiskCacheMiss(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onDiskCachePut(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onMemoryCacheHit(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onMemoryCacheMiss(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onMemoryCachePut(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onStagingAreaHit(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void onStagingAreaMiss(CacheKey cacheKey) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void registerBitmapMemoryCache(MemoryCache memoryCache) {
    }

    @Override // com.facebook.imagepipeline.cache.ImageCacheStatsTracker
    public void registerEncodedMemoryCache(MemoryCache memoryCache) {
    }
}
