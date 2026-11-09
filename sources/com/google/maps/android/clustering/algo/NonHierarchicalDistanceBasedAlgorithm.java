package com.google.maps.android.clustering.algo;

import N8.q0;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.quadtree.PointQuadTree;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class NonHierarchicalDistanceBasedAlgorithm<T extends ClusterItem> extends AbstractAlgorithm<T> {
    private static final int DEFAULT_MAX_DISTANCE_AT_ZOOM = 100;
    private static final SphericalMercatorProjection PROJECTION = new SphericalMercatorProjection(1.0d);
    private int mMaxDistance = 100;
    private final Collection<QuadItem<T>> mItems = new LinkedHashSet();
    private final PointQuadTree<QuadItem<T>> mQuadTree = new PointQuadTree<>(0.0d, 1.0d, 0.0d, 1.0d);

    public static class QuadItem<T extends ClusterItem> implements PointQuadTree.Item, Cluster<T> {
        private final T mClusterItem;
        private final Point mPoint;
        private final LatLng mPosition;
        private Set<T> singletonSet;

        public /* synthetic */ QuadItem(ClusterItem clusterItem, int i7) {
            this(clusterItem);
        }

        public boolean equals(Object obj) {
            if (obj instanceof QuadItem) {
                return ((QuadItem) obj).mClusterItem.equals(this.mClusterItem);
            }
            return false;
        }

        @Override // com.google.maps.android.quadtree.PointQuadTree.Item
        public Point getPoint() {
            return this.mPoint;
        }

        @Override // com.google.maps.android.clustering.Cluster
        public LatLng getPosition() {
            return this.mPosition;
        }

        @Override // com.google.maps.android.clustering.Cluster
        public int getSize() {
            return 1;
        }

        public int hashCode() {
            return this.mClusterItem.hashCode();
        }

        private QuadItem(T t) {
            this.mClusterItem = t;
            LatLng position = t.getPosition();
            this.mPosition = position;
            this.mPoint = NonHierarchicalDistanceBasedAlgorithm.PROJECTION.toPoint(position);
            this.singletonSet = Collections.singleton(t);
        }

        @Override // com.google.maps.android.clustering.Cluster
        public Set<T> getItems() {
            return this.singletonSet;
        }
    }

    private Bounds createBoundsFromSpan(Point point, double d2) {
        double d10 = d2 / 2.0d;
        double d11 = point.f23092x;
        double d12 = point.f23093y;
        return new Bounds(d11 - d10, d11 + d10, d12 - d10, d12 + d10);
    }

    private double distanceSquared(Point point, Point point2) {
        double d2 = point.f23092x;
        double d10 = point2.f23092x;
        double d11 = d2 - d10;
        double d12 = point.f23093y;
        double d13 = point2.f23093y;
        return q0.a(d12, d13, d12 - d13, (d2 - d10) * d11);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItem(T t) {
        boolean zAdd;
        QuadItem<T> quadItem = new QuadItem<>(t, 0);
        synchronized (this.mQuadTree) {
            try {
                zAdd = this.mItems.add(quadItem);
                if (zAdd) {
                    this.mQuadTree.add(quadItem);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zAdd;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItems(Collection<T> collection) {
        Iterator<T> it = collection.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            if (addItem(it.next())) {
                z3 = true;
            }
        }
        return z3;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        synchronized (this.mQuadTree) {
            this.mItems.clear();
            this.mQuadTree.clear();
        }
    }

    public Collection<QuadItem<T>> getClusteringItems(PointQuadTree<QuadItem<T>> pointQuadTree, float f10) {
        return this.mItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f10) {
        double dPow = (((double) this.mMaxDistance) / Math.pow(2.0d, (int) f10)) / 256.0d;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        synchronized (this.mQuadTree) {
            try {
                Iterator<QuadItem<T>> it = getClusteringItems(this.mQuadTree, f10).iterator();
                while (it.hasNext()) {
                    QuadItem<T> next = it.next();
                    if (!hashSet.contains(next)) {
                        Collection<T> collectionSearch = this.mQuadTree.search(createBoundsFromSpan(next.getPoint(), dPow));
                        if (collectionSearch.size() == 1) {
                            hashSet2.add(next);
                            hashSet.add(next);
                            map.put(next, Double.valueOf(0.0d));
                        } else {
                            StaticCluster staticCluster = new StaticCluster(((QuadItem) next).mClusterItem.getPosition());
                            hashSet2.add(staticCluster);
                            for (T t : collectionSearch) {
                                Double d2 = (Double) map.get(t);
                                Iterator<QuadItem<T>> it2 = it;
                                double dDistanceSquared = distanceSquared(t.getPoint(), next.getPoint());
                                if (d2 == null) {
                                    map.put(t, Double.valueOf(dDistanceSquared));
                                    staticCluster.add(t.mClusterItem);
                                    map2.put(t, staticCluster);
                                } else if (d2.doubleValue() >= dDistanceSquared) {
                                    ((StaticCluster) map2.get(t)).remove(t.mClusterItem);
                                    map.put(t, Double.valueOf(dDistanceSquared));
                                    staticCluster.add(t.mClusterItem);
                                    map2.put(t, staticCluster);
                                }
                                it = it2;
                            }
                            hashSet.addAll(collectionSearch);
                            it = it;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashSet2;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Collection<T> getItems() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.mQuadTree) {
            try {
                Iterator<QuadItem<T>> it = this.mItems.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(((QuadItem) it.next()).mClusterItem);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashSet;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.mMaxDistance;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItem(T t) {
        boolean zRemove;
        QuadItem quadItem = new QuadItem(t, 0);
        synchronized (this.mQuadTree) {
            try {
                zRemove = this.mItems.remove(quadItem);
                if (zRemove) {
                    this.mQuadTree.remove(quadItem);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zRemove;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItems(Collection<T> collection) {
        boolean z3;
        synchronized (this.mQuadTree) {
            try {
                Iterator<T> it = collection.iterator();
                int i7 = 0;
                z3 = false;
                while (it.hasNext()) {
                    QuadItem quadItem = new QuadItem(it.next(), i7);
                    if (this.mItems.remove(quadItem)) {
                        this.mQuadTree.remove(quadItem);
                        z3 = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i7) {
        this.mMaxDistance = i7;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean updateItem(T t) {
        boolean zRemoveItem;
        synchronized (this.mQuadTree) {
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
