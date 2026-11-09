package com.google.maps.android.clustering.algo;

import M.j;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.projection.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class GridBasedAlgorithm<T extends ClusterItem> extends AbstractAlgorithm<T> {
    private static final int DEFAULT_GRID_SIZE = 100;
    private int mGridSize = 100;
    private final Set<T> mItems = Collections.synchronizedSet(new HashSet());

    private static long getCoord(long j6, double d2, double d10) {
        return (long) (Math.floor(d10) + (Math.floor(d2) * j6));
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItem(T t) {
        return this.mItems.add(t);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItems(Collection<T> collection) {
        return this.mItems.addAll(collection);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        this.mItems.clear();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f10) {
        long jCeil = (long) Math.ceil((Math.pow(2.0d, f10) * 256.0d) / ((double) this.mGridSize));
        SphericalMercatorProjection sphericalMercatorProjection = new SphericalMercatorProjection(jCeil);
        HashSet hashSet = new HashSet();
        j jVar = new j();
        synchronized (this.mItems) {
            try {
                for (T t : this.mItems) {
                    Point point = sphericalMercatorProjection.toPoint(t.getPosition());
                    long coord = getCoord(jCeil, point.f23092x, point.f23093y);
                    StaticCluster staticCluster = (StaticCluster) jVar.b(coord);
                    if (staticCluster == null) {
                        staticCluster = new StaticCluster(sphericalMercatorProjection.toLatLng(new com.google.maps.android.geometry.Point(Math.floor(point.f23092x) + 0.5d, Math.floor(point.f23093y) + 0.5d)));
                        jVar.e(coord, staticCluster);
                        hashSet.add(staticCluster);
                    }
                    staticCluster.add(t);
                    jCeil = jCeil;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashSet;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Collection<T> getItems() {
        return this.mItems;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.mGridSize;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItem(T t) {
        return this.mItems.remove(t);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItems(Collection<T> collection) {
        return this.mItems.removeAll(collection);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i7) {
        this.mGridSize = i7;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean updateItem(T t) {
        boolean zRemoveItem;
        synchronized (this.mItems) {
            try {
                zRemoveItem = removeItem(t);
                if (zRemoveItem) {
                    zRemoveItem = addItem(t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zRemoveItem;
    }
}
