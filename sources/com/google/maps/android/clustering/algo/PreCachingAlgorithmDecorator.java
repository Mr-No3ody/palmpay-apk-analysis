package com.google.maps.android.clustering.algo;

import M.l;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes3.dex */
public class PreCachingAlgorithmDecorator<T extends ClusterItem> extends AbstractAlgorithm<T> {
    private final Algorithm<T> mAlgorithm;
    private final l mCache = new l(5);
    private final ReadWriteLock mCacheLock = new ReentrantReadWriteLock();
    private final Executor mExecutor = ShadowExecutors.newOptimizedCachedThreadPool("\u200bcom.google.maps.android.clustering.algo.PreCachingAlgorithmDecorator");

    public class PrecacheRunnable implements Runnable {
        private final int mZoom;

        public PrecacheRunnable(int i7) {
            this.mZoom = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
            } catch (InterruptedException unused) {
            }
            PreCachingAlgorithmDecorator.this.getClustersInternal(this.mZoom);
        }
    }

    public PreCachingAlgorithmDecorator(Algorithm<T> algorithm) {
        this.mAlgorithm = algorithm;
    }

    private void clearCache() {
        this.mCache.evictAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<? extends Cluster<T>> getClustersInternal(int i7) {
        this.mCacheLock.readLock().lock();
        Set<? extends Cluster<T>> clusters = (Set) this.mCache.get(Integer.valueOf(i7));
        this.mCacheLock.readLock().unlock();
        if (clusters == null) {
            this.mCacheLock.writeLock().lock();
            clusters = (Set) this.mCache.get(Integer.valueOf(i7));
            if (clusters == null) {
                clusters = this.mAlgorithm.getClusters(i7);
                this.mCache.put(Integer.valueOf(i7), clusters);
            }
            this.mCacheLock.writeLock().unlock();
        }
        return clusters;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItem(T t) {
        boolean zAddItem = this.mAlgorithm.addItem(t);
        if (zAddItem) {
            clearCache();
        }
        return zAddItem;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItems(Collection<T> collection) {
        boolean zAddItems = this.mAlgorithm.addItems(collection);
        if (zAddItems) {
            clearCache();
        }
        return zAddItems;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        this.mAlgorithm.clearItems();
        clearCache();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f10) {
        int i7 = (int) f10;
        Set<? extends Cluster<T>> clustersInternal = getClustersInternal(i7);
        int i10 = i7 + 1;
        if (this.mCache.get(Integer.valueOf(i10)) == null) {
            this.mExecutor.execute(new PrecacheRunnable(i10));
        }
        int i11 = i7 - 1;
        if (this.mCache.get(Integer.valueOf(i11)) == null) {
            this.mExecutor.execute(new PrecacheRunnable(i11));
        }
        return clustersInternal;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Collection<T> getItems() {
        return this.mAlgorithm.getItems();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.mAlgorithm.getMaxDistanceBetweenClusteredItems();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItem(T t) {
        boolean zRemoveItem = this.mAlgorithm.removeItem(t);
        if (zRemoveItem) {
            clearCache();
        }
        return zRemoveItem;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItems(Collection<T> collection) {
        boolean zRemoveItems = this.mAlgorithm.removeItems(collection);
        if (zRemoveItems) {
            clearCache();
        }
        return zRemoveItems;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i7) {
        this.mAlgorithm.setMaxDistanceBetweenClusteredItems(i7);
        clearCache();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean updateItem(T t) {
        boolean zUpdateItem = this.mAlgorithm.updateItem(t);
        if (zUpdateItem) {
            clearCache();
        }
        return zUpdateItem;
    }
}
