package com.google.maps.android.clustering.view;

import androidx.annotation.StyleRes;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public interface ClusterRenderer<T extends ClusterItem> {
    @StyleRes
    int getClusterTextAppearance(int i7);

    int getColor(int i7);

    void onAdd();

    void onClustersChanged(Set<? extends Cluster<T>> set);

    void onRemove();

    void setAnimation(boolean z3);

    void setAnimationDuration(long j6);

    void setOnClusterClickListener(ClusterManager.OnClusterClickListener<T> onClusterClickListener);

    void setOnClusterInfoWindowClickListener(ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener);

    void setOnClusterInfoWindowLongClickListener(ClusterManager.OnClusterInfoWindowLongClickListener<T> onClusterInfoWindowLongClickListener);

    void setOnClusterItemClickListener(ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener);

    void setOnClusterItemInfoWindowClickListener(ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener);

    void setOnClusterItemInfoWindowLongClickListener(ClusterManager.OnClusterItemInfoWindowLongClickListener<T> onClusterItemInfoWindowLongClickListener);
}
