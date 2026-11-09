package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.projection.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.quadtree.PointQuadTree;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public class NonHierarchicalViewBasedAlgorithm<T extends ClusterItem> extends NonHierarchicalDistanceBasedAlgorithm<T> implements ScreenBasedAlgorithm<T> {
    private static final SphericalMercatorProjection PROJECTION = new SphericalMercatorProjection(1.0d);
    private LatLng mMapCenter;
    private int mViewHeight;
    private int mViewWidth;

    public NonHierarchicalViewBasedAlgorithm(int i7, int i10) {
        this.mViewWidth = i7;
        this.mViewHeight = i10;
    }

    private Bounds getVisibleBounds(float f10) {
        LatLng latLng = this.mMapCenter;
        if (latLng == null) {
            return new Bounds(0.0d, 0.0d, 0.0d, 0.0d);
        }
        Point point = PROJECTION.toPoint(latLng);
        double d2 = f10;
        double dPow = ((((double) this.mViewWidth) / Math.pow(2.0d, d2)) / 256.0d) / 2.0d;
        double dPow2 = ((((double) this.mViewHeight) / Math.pow(2.0d, d2)) / 256.0d) / 2.0d;
        double d10 = point.f23092x;
        double d11 = point.f23093y;
        return new Bounds(d10 - dPow, d10 + dPow, d11 - dPow2, d11 + dPow2);
    }

    @Override // com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm
    public Collection<NonHierarchicalDistanceBasedAlgorithm.QuadItem<T>> getClusteringItems(PointQuadTree<NonHierarchicalDistanceBasedAlgorithm.QuadItem<T>> pointQuadTree, float f10) {
        Bounds visibleBounds = getVisibleBounds(f10);
        ArrayList arrayList = new ArrayList();
        double d2 = visibleBounds.minX;
        if (d2 < 0.0d) {
            arrayList.addAll(pointQuadTree.search(new Bounds(d2 + 1.0d, 1.0d, visibleBounds.minY, visibleBounds.maxY)));
            visibleBounds = new Bounds(0.0d, visibleBounds.maxX, visibleBounds.minY, visibleBounds.maxY);
        }
        double d10 = visibleBounds.maxX;
        if (d10 > 1.0d) {
            arrayList.addAll(pointQuadTree.search(new Bounds(0.0d, d10 - 1.0d, visibleBounds.minY, visibleBounds.maxY)));
            visibleBounds = new Bounds(visibleBounds.minX, 1.0d, visibleBounds.minY, visibleBounds.maxY);
        }
        arrayList.addAll(pointQuadTree.search(visibleBounds));
        return arrayList;
    }

    @Override // com.google.maps.android.clustering.algo.ScreenBasedAlgorithm
    public void onCameraChange(CameraPosition cameraPosition) {
        this.mMapCenter = cameraPosition.target;
    }

    @Override // com.google.maps.android.clustering.algo.ScreenBasedAlgorithm
    public boolean shouldReclusterOnMapMovement() {
        return true;
    }

    public void updateViewSize(int i7, int i10) {
        this.mViewWidth = i7;
        this.mViewHeight = i10;
    }
}
