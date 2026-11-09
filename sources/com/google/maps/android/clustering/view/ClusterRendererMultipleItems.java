package com.google.maps.android.clustering.view;

import N8.q0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.camera.video.u;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.R;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.ui.IconGenerator;
import com.google.maps.android.ui.SquareTextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public class ClusterRendererMultipleItems<T extends ClusterItem> implements ClusterRenderer<T> {
    private ClusterManager.OnClusterClickListener<T> mClickListener;
    private final ClusterManager<T> mClusterManager;
    private final MarkerCache<Cluster<T>> mClusterMarkerCache;
    private Set<? extends Cluster<T>> mClusters;
    private ShapeDrawable mColoredCircleBackground;
    private final float mDensity;
    private final IconGenerator mIconGenerator;
    private ClusterManager.OnClusterInfoWindowClickListener<T> mInfoWindowClickListener;
    private ClusterManager.OnClusterInfoWindowLongClickListener<T> mInfoWindowLongClickListener;
    private ClusterManager.OnClusterItemClickListener<T> mItemClickListener;
    private ClusterManager.OnClusterItemInfoWindowClickListener<T> mItemInfoWindowClickListener;
    private ClusterManager.OnClusterItemInfoWindowLongClickListener<T> mItemInfoWindowLongClickListener;
    private final GoogleMap mMap;
    private final MarkerCache<T> mMarkerCache;
    private float mZoom;
    private static final int[] BUCKETS = {10, 20, 50, 100, 200, 500, 1000};
    private static final TimeInterpolator ANIMATION_INTERP = new DecelerateInterpolator();
    private final Executor mExecutor = ShadowExecutors.newOptimizedSingleThreadExecutor("\u200bcom.google.maps.android.clustering.view.ClusterRendererMultipleItems");
    private final Queue<ClusterRendererMultipleItems<T>.AnimationTask> ongoingAnimations = new LinkedList();
    private Set<MarkerWithPosition> mMarkers = Collections.newSetFromMap(new ConcurrentHashMap());
    private final SparseArray<BitmapDescriptor> mIcons = new SparseArray<>();
    private int mMinClusterSize = 2;
    private final ClusterRendererMultipleItems<T>.ViewModifier mViewModifier = new ViewModifier(Looper.getMainLooper());
    private boolean mAnimate = true;
    private long mAnimationDurationMs = 300;

    public class AnimationTask extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private final LatLng from;
        private MarkerManager mMarkerManager;
        private boolean mRemoveOnComplete;
        private final Marker marker;
        private final MarkerWithPosition markerWithPosition;
        private final LatLng to;
        private ValueAnimator valueAnimator;

        public /* synthetic */ AnimationTask(ClusterRendererMultipleItems clusterRendererMultipleItems, MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2, int i7) {
            this(markerWithPosition, latLng, latLng2);
        }

        public void cancel() {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new b(this, 0));
                return;
            }
            this.markerWithPosition.position = this.to;
            this.mRemoveOnComplete = false;
            this.valueAnimator.cancel();
            ClusterRendererMultipleItems.this.ongoingAnimations.remove(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.mRemoveOnComplete) {
                ClusterRendererMultipleItems.this.mMarkerCache.remove(this.marker);
                ClusterRendererMultipleItems.this.mClusterMarkerCache.remove(this.marker);
                this.mMarkerManager.remove(this.marker);
            }
            this.markerWithPosition.position = this.to;
            ClusterRendererMultipleItems.this.ongoingAnimations.remove(this);
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            if (this.to == null || this.from == null || this.marker == null) {
                return;
            }
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.to;
            double d2 = latLng.latitude;
            LatLng latLng2 = this.from;
            double d10 = latLng2.latitude;
            double d11 = animatedFraction;
            double d12 = ((d2 - d10) * d11) + d10;
            double dSignum = latLng.longitude - latLng2.longitude;
            if (Math.abs(dSignum) > 180.0d) {
                dSignum -= Math.signum(dSignum) * 360.0d;
            }
            LatLng latLng3 = new LatLng(d12, (dSignum * d11) + this.from.longitude);
            this.marker.setPosition(latLng3);
            this.markerWithPosition.position = latLng3;
        }

        public void perform() {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.valueAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setInterpolator(ClusterRendererMultipleItems.ANIMATION_INTERP);
            this.valueAnimator.setDuration(ClusterRendererMultipleItems.this.mAnimationDurationMs);
            this.valueAnimator.addUpdateListener(this);
            this.valueAnimator.addListener(this);
            this.valueAnimator.start();
        }

        public void removeOnAnimationComplete(MarkerManager markerManager) {
            this.mMarkerManager = markerManager;
            this.mRemoveOnComplete = true;
        }

        private AnimationTask(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.markerWithPosition = markerWithPosition;
            this.marker = markerWithPosition.marker;
            this.from = latLng;
            this.to = latLng2;
        }
    }

    public class CreateMarkerTask {
        private final LatLng animateFrom;
        private final Cluster<T> cluster;
        private final Set<MarkerWithPosition> newMarkers;

        public CreateMarkerTask(Cluster<T> cluster, Set<MarkerWithPosition> set, LatLng latLng) {
            this.cluster = cluster;
            this.newMarkers = set;
            this.animateFrom = latLng;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void perform(ClusterRendererMultipleItems<T>.MarkerModifier markerModifier) {
            MarkerWithPosition markerWithPosition;
            MarkerWithPosition markerWithPosition2;
            ClusterItem clusterItem = null;
            if (ClusterRendererMultipleItems.this.shouldRenderAsCluster(this.cluster)) {
                Marker markerAddMarker = ClusterRendererMultipleItems.this.mClusterMarkerCache.get(this.cluster);
                if (markerAddMarker == null) {
                    MarkerOptions markerOptions = new MarkerOptions();
                    LatLng position = this.animateFrom;
                    if (position == null) {
                        position = this.cluster.getPosition();
                    }
                    MarkerOptions markerOptionsPosition = markerOptions.position(position);
                    ClusterRendererMultipleItems.this.onBeforeClusterRendered(this.cluster, markerOptionsPosition);
                    markerAddMarker = ClusterRendererMultipleItems.this.mClusterManager.getClusterMarkerCollection().addMarker(markerOptionsPosition);
                    ClusterRendererMultipleItems.this.mClusterMarkerCache.put(this.cluster, markerAddMarker);
                    markerWithPosition = new MarkerWithPosition(clusterItem, markerAddMarker);
                    LatLng latLng = this.animateFrom;
                    if (latLng != null) {
                        markerModifier.animate(markerWithPosition, latLng, this.cluster.getPosition());
                    }
                } else {
                    markerWithPosition = new MarkerWithPosition(clusterItem, markerAddMarker);
                    ClusterRendererMultipleItems.this.onClusterUpdated(this.cluster, markerAddMarker);
                }
                ClusterRendererMultipleItems.this.onClusterRendered(this.cluster, markerAddMarker);
                this.newMarkers.add(markerWithPosition);
                return;
            }
            for (T t : this.cluster.getItems()) {
                Marker markerAddMarker2 = ClusterRendererMultipleItems.this.mMarkerCache.get(t);
                LatLng position2 = t.getPosition();
                if (markerAddMarker2 == null) {
                    MarkerOptions markerOptions2 = new MarkerOptions();
                    LatLng latLng2 = this.animateFrom;
                    if (latLng2 != null) {
                        markerOptions2.position(latLng2);
                    } else if (ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator().hasNext() && ((Cluster) ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator().next()).getItems().contains(t)) {
                        Iterator it = ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator();
                        T t3 = null;
                        while (it.hasNext()) {
                            for (T t8 : ((Cluster) it.next()).getItems()) {
                                if (t8.equals(t)) {
                                    t3 = t8;
                                    break;
                                }
                            }
                        }
                        position2 = t3.getPosition();
                        markerOptions2.position(position2);
                    } else {
                        markerOptions2.position(t.getPosition());
                        if (t.getZIndex() != null) {
                            markerOptions2.zIndex(t.getZIndex().floatValue());
                        }
                    }
                    ClusterRendererMultipleItems.this.onBeforeClusterItemRendered(t, markerOptions2);
                    markerAddMarker2 = ClusterRendererMultipleItems.this.mClusterManager.getMarkerCollection().addMarker(markerOptions2);
                    markerWithPosition2 = new MarkerWithPosition(t, markerAddMarker2);
                    ClusterRendererMultipleItems.this.mMarkerCache.put(t, markerAddMarker2);
                    LatLng latLng3 = this.animateFrom;
                    if (latLng3 != null) {
                        markerModifier.animate(markerWithPosition2, latLng3, t.getPosition());
                    } else if (position2 != null) {
                        markerModifier.animate(markerWithPosition2, position2, t.getPosition());
                    }
                } else {
                    markerWithPosition2 = new MarkerWithPosition(t, markerAddMarker2);
                    markerModifier.animate(markerWithPosition2, markerAddMarker2.getPosition(), t.getPosition());
                }
                ClusterRendererMultipleItems.this.onClusterItemRendered(t, markerAddMarker2);
                this.newMarkers.add(markerWithPosition2);
            }
        }
    }

    public static class MarkerCache<T> {
        private final Map<T, Marker> mCache;
        private final Map<Marker, T> mCacheReverse;

        public /* synthetic */ MarkerCache(int i7) {
            this();
        }

        public Marker get(T t) {
            return this.mCache.get(t);
        }

        public void put(T t, Marker marker) {
            this.mCache.put(t, marker);
            this.mCacheReverse.put(marker, t);
        }

        public void remove(Marker marker) {
            T t = this.mCacheReverse.get(marker);
            this.mCacheReverse.remove(marker);
            this.mCache.remove(t);
        }

        private MarkerCache() {
            this.mCache = new HashMap();
            this.mCacheReverse = new HashMap();
        }

        public T get(Marker marker) {
            return this.mCacheReverse.get(marker);
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class MarkerModifier extends Handler implements MessageQueue.IdleHandler {
        private static final int BLANK = 0;
        private final Condition busyCondition;
        private final Lock lock;
        private final Queue<ClusterRendererMultipleItems<T>.AnimationTask> mAnimationTasks;
        private final Queue<ClusterRendererMultipleItems<T>.CreateMarkerTask> mCreateMarkerTasks;
        private boolean mListenerAdded;
        private final Queue<ClusterRendererMultipleItems<T>.CreateMarkerTask> mOnScreenCreateMarkerTasks;
        private final Queue<Marker> mOnScreenRemoveMarkerTasks;
        private final Queue<Marker> mRemoveMarkerTasks;

        public /* synthetic */ MarkerModifier(ClusterRendererMultipleItems clusterRendererMultipleItems, int i7) {
            this();
        }

        private void performNextTask() {
            if (!this.mOnScreenRemoveMarkerTasks.isEmpty()) {
                removeMarker(this.mOnScreenRemoveMarkerTasks.poll());
                return;
            }
            if (!this.mAnimationTasks.isEmpty()) {
                ClusterRendererMultipleItems<T>.AnimationTask animationTaskPoll = this.mAnimationTasks.poll();
                Objects.requireNonNull(animationTaskPoll);
                animationTaskPoll.perform();
            } else if (!this.mOnScreenCreateMarkerTasks.isEmpty()) {
                ClusterRendererMultipleItems<T>.CreateMarkerTask createMarkerTaskPoll = this.mOnScreenCreateMarkerTasks.poll();
                Objects.requireNonNull(createMarkerTaskPoll);
                createMarkerTaskPoll.perform(this);
            } else if (this.mCreateMarkerTasks.isEmpty()) {
                if (this.mRemoveMarkerTasks.isEmpty()) {
                    return;
                }
                removeMarker(this.mRemoveMarkerTasks.poll());
            } else {
                ClusterRendererMultipleItems<T>.CreateMarkerTask createMarkerTaskPoll2 = this.mCreateMarkerTasks.poll();
                Objects.requireNonNull(createMarkerTaskPoll2);
                createMarkerTaskPoll2.perform(this);
            }
        }

        private void removeMarker(Marker marker) {
            ClusterRendererMultipleItems.this.mMarkerCache.remove(marker);
            ClusterRendererMultipleItems.this.mClusterMarkerCache.remove(marker);
            ClusterRendererMultipleItems.this.mClusterManager.getMarkerManager().remove(marker);
        }

        public void add(boolean z3, ClusterRendererMultipleItems<T>.CreateMarkerTask createMarkerTask) {
            this.lock.lock();
            sendEmptyMessage(0);
            if (z3) {
                this.mOnScreenCreateMarkerTasks.add(createMarkerTask);
            } else {
                this.mCreateMarkerTasks.add(createMarkerTask);
            }
            this.lock.unlock();
        }

        public void animate(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.lock.lock();
            ClusterRendererMultipleItems<T>.AnimationTask animationTask = new AnimationTask(ClusterRendererMultipleItems.this, markerWithPosition, latLng, latLng2, 0);
            for (AnimationTask animationTask2 : ClusterRendererMultipleItems.this.ongoingAnimations) {
                if (animationTask2.marker.getId().equals(((AnimationTask) animationTask).marker.getId())) {
                    animationTask2.cancel();
                    break;
                }
            }
            this.mAnimationTasks.add(animationTask);
            ClusterRendererMultipleItems.this.ongoingAnimations.add(animationTask);
            this.lock.unlock();
        }

        public void animateThenRemove(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.lock.lock();
            ClusterRendererMultipleItems<T>.AnimationTask animationTask = new AnimationTask(ClusterRendererMultipleItems.this, markerWithPosition, latLng, latLng2, 0);
            for (AnimationTask animationTask2 : ClusterRendererMultipleItems.this.ongoingAnimations) {
                if (animationTask2.marker.getId().equals(((AnimationTask) animationTask).marker.getId())) {
                    animationTask2.cancel();
                    break;
                }
            }
            ClusterRendererMultipleItems.this.ongoingAnimations.add(animationTask);
            animationTask.removeOnAnimationComplete(ClusterRendererMultipleItems.this.mClusterManager.getMarkerManager());
            this.mAnimationTasks.add(animationTask);
            this.lock.unlock();
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            if (!this.mListenerAdded) {
                Looper.myQueue().addIdleHandler(this);
                this.mListenerAdded = true;
            }
            removeMessages(0);
            this.lock.lock();
            for (int i7 = 0; i7 < 10; i7++) {
                try {
                    performNextTask();
                } catch (Throwable th) {
                    this.lock.unlock();
                    throw th;
                }
            }
            if (isBusy()) {
                sendEmptyMessageDelayed(0, 10L);
            } else {
                this.mListenerAdded = false;
                Looper.myQueue().removeIdleHandler(this);
                this.busyCondition.signalAll();
            }
            this.lock.unlock();
        }

        public boolean isBusy() {
            try {
                this.lock.lock();
                return (this.mCreateMarkerTasks.isEmpty() && this.mOnScreenCreateMarkerTasks.isEmpty() && this.mOnScreenRemoveMarkerTasks.isEmpty() && this.mRemoveMarkerTasks.isEmpty() && this.mAnimationTasks.isEmpty()) ? false : true;
            } finally {
                this.lock.unlock();
            }
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        public void remove(boolean z3, Marker marker) {
            this.lock.lock();
            sendEmptyMessage(0);
            if (z3) {
                this.mOnScreenRemoveMarkerTasks.add(marker);
            } else {
                this.mRemoveMarkerTasks.add(marker);
            }
            this.lock.unlock();
        }

        public void waitUntilFree() {
            while (isBusy()) {
                sendEmptyMessage(0);
                this.lock.lock();
                try {
                    try {
                        if (isBusy()) {
                            this.busyCondition.await();
                        }
                        this.lock.unlock();
                    } catch (InterruptedException e10) {
                        throw new RuntimeException(e10);
                    }
                } catch (Throwable th) {
                    this.lock.unlock();
                    throw th;
                }
            }
        }

        private MarkerModifier() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.busyCondition = reentrantLock.newCondition();
            this.mCreateMarkerTasks = new LinkedList();
            this.mOnScreenCreateMarkerTasks = new LinkedList();
            this.mRemoveMarkerTasks = new LinkedList();
            this.mOnScreenRemoveMarkerTasks = new LinkedList();
            this.mAnimationTasks = new LinkedList();
        }
    }

    public static class MarkerWithPosition<T> {
        private final T clusterItem;
        private final Marker marker;
        private LatLng position;

        public /* synthetic */ MarkerWithPosition(ClusterItem clusterItem, Marker marker) {
            this(marker, clusterItem);
        }

        public boolean equals(Object obj) {
            if (obj instanceof MarkerWithPosition) {
                return this.marker.equals(((MarkerWithPosition) obj).marker);
            }
            return false;
        }

        public int hashCode() {
            return this.marker.hashCode();
        }

        private MarkerWithPosition(Marker marker, T t) {
            this.marker = marker;
            this.clusterItem = t;
            this.position = marker.getPosition();
        }
    }

    public class RenderTask implements Runnable {
        final Set<? extends Cluster<T>> clusters;
        private Runnable mCallback;
        private float mMapZoom;
        private Projection mProjection;
        private SphericalMercatorProjection mSphericalMercatorProjection;

        public /* synthetic */ RenderTask(ClusterRendererMultipleItems clusterRendererMultipleItems, Set set, int i7) {
            this(set);
        }

        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            LatLngBounds latLngBoundsBuild;
            ArrayList arrayList;
            ArrayList arrayList2;
            MarkerModifier markerModifier = new MarkerModifier(ClusterRendererMultipleItems.this, 0);
            float f10 = this.mMapZoom;
            Set<MarkerWithPosition> set = ClusterRendererMultipleItems.this.mMarkers;
            try {
                latLngBoundsBuild = this.mProjection.getVisibleRegion().latLngBounds;
            } catch (Exception e10) {
                e10.printStackTrace();
                latLngBoundsBuild = LatLngBounds.builder().include(new LatLng(0.0d, 0.0d)).build();
            }
            if (ClusterRendererMultipleItems.this.mClusters == null || !ClusterRendererMultipleItems.this.mAnimate) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (Cluster<T> cluster : ClusterRendererMultipleItems.this.mClusters) {
                    if (ClusterRendererMultipleItems.this.shouldRenderAsCluster(cluster) && latLngBoundsBuild.contains(cluster.getPosition())) {
                        arrayList.add(this.mSphericalMercatorProjection.toPoint(cluster.getPosition()));
                    }
                }
            }
            Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (Cluster<T> cluster2 : this.clusters) {
                boolean zContains = latLngBoundsBuild.contains(cluster2.getPosition());
                if (ClusterRendererMultipleItems.this.mAnimate) {
                    Point pointFindClosestCluster = ClusterRendererMultipleItems.this.findClosestCluster(arrayList, this.mSphericalMercatorProjection.toPoint(cluster2.getPosition()));
                    if (pointFindClosestCluster != null) {
                        markerModifier.add(true, new CreateMarkerTask(cluster2, setNewSetFromMap, this.mSphericalMercatorProjection.toLatLng(pointFindClosestCluster)));
                    } else {
                        markerModifier.add(true, new CreateMarkerTask(cluster2, setNewSetFromMap, null));
                    }
                } else {
                    markerModifier.add(zContains, new CreateMarkerTask(cluster2, setNewSetFromMap, null));
                }
            }
            markerModifier.waitUntilFree();
            set.removeAll(setNewSetFromMap);
            if (ClusterRendererMultipleItems.this.mAnimate) {
                arrayList2 = new ArrayList();
                for (Cluster<T> cluster3 : this.clusters) {
                    if (ClusterRendererMultipleItems.this.shouldRenderAsCluster(cluster3) && latLngBoundsBuild.contains(cluster3.getPosition())) {
                        arrayList2.add(this.mSphericalMercatorProjection.toPoint(cluster3.getPosition()));
                    }
                }
            } else {
                arrayList2 = null;
            }
            for (MarkerWithPosition markerWithPosition : set) {
                boolean zContains2 = latLngBoundsBuild.contains(markerWithPosition.position);
                if (zContains2 && ClusterRendererMultipleItems.this.mAnimate) {
                    Point pointFindClosestCluster2 = ClusterRendererMultipleItems.this.findClosestCluster(arrayList2, this.mSphericalMercatorProjection.toPoint(markerWithPosition.position));
                    if (pointFindClosestCluster2 != null) {
                        markerModifier.animateThenRemove(markerWithPosition, markerWithPosition.position, this.mSphericalMercatorProjection.toLatLng(pointFindClosestCluster2));
                    } else if (ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator().hasNext() && ((Cluster) ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator().next()).getItems().contains(markerWithPosition.clusterItem)) {
                        Iterator it = ClusterRendererMultipleItems.this.mClusterMarkerCache.mCache.keySet().iterator();
                        T t = null;
                        while (it.hasNext()) {
                            for (T t3 : ((Cluster) it.next()).getItems()) {
                                if (t3.equals(markerWithPosition.clusterItem)) {
                                    t = t3;
                                    break;
                                }
                            }
                        }
                        markerModifier.animateThenRemove(markerWithPosition, markerWithPosition.position, t.getPosition());
                    } else {
                        markerModifier.remove(true, markerWithPosition.marker);
                    }
                } else {
                    markerModifier.remove(zContains2, markerWithPosition.marker);
                }
            }
            markerModifier.waitUntilFree();
            ClusterRendererMultipleItems.this.mMarkers = setNewSetFromMap;
            ClusterRendererMultipleItems.this.mClusters = this.clusters;
            ClusterRendererMultipleItems.this.mZoom = f10;
            this.mCallback.run();
        }

        public void setCallback(Runnable runnable) {
            this.mCallback = runnable;
        }

        public void setMapZoom(float f10) {
            this.mMapZoom = f10;
            this.mSphericalMercatorProjection = new SphericalMercatorProjection(Math.pow(2.0d, Math.min(f10, ClusterRendererMultipleItems.this.mZoom)) * 256.0d);
        }

        public void setProjection(Projection projection) {
            this.mProjection = projection;
        }

        private RenderTask(Set<? extends Cluster<T>> set) {
            this.clusters = set;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class ViewModifier extends Handler {
        private static final int RUN_TASK = 0;
        private static final int TASK_FINISHED = 1;
        private ClusterRendererMultipleItems<T>.RenderTask mNextClusters;
        private boolean mViewModificationInProgress;

        public ViewModifier(Looper looper) {
            super(looper);
            this.mViewModificationInProgress = false;
            this.mNextClusters = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$handleMessage$0() {
            sendEmptyMessage(1);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ClusterRendererMultipleItems<T>.RenderTask renderTask;
            if (message.what == 1) {
                this.mViewModificationInProgress = false;
                if (this.mNextClusters != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.mViewModificationInProgress || this.mNextClusters == null) {
                return;
            }
            Projection projection = ClusterRendererMultipleItems.this.mMap.getProjection();
            synchronized (this) {
                renderTask = this.mNextClusters;
                this.mNextClusters = null;
                this.mViewModificationInProgress = true;
            }
            renderTask.setCallback(new b(this, 1));
            renderTask.setProjection(projection);
            renderTask.setMapZoom(ClusterRendererMultipleItems.this.mMap.getCameraPosition().zoom);
            ClusterRendererMultipleItems.this.mExecutor.execute(renderTask);
        }

        public void queue(Set<? extends Cluster<T>> set) {
            synchronized (this) {
                this.mNextClusters = new RenderTask(ClusterRendererMultipleItems.this, set, 0);
            }
            sendEmptyMessage(0);
        }
    }

    public ClusterRendererMultipleItems(Context context, GoogleMap googleMap, ClusterManager<T> clusterManager) {
        int i7 = 0;
        this.mMarkerCache = new MarkerCache<>(i7);
        this.mClusterMarkerCache = new MarkerCache<>(i7);
        this.mMap = googleMap;
        this.mDensity = context.getResources().getDisplayMetrics().density;
        IconGenerator iconGenerator = new IconGenerator(context);
        this.mIconGenerator = iconGenerator;
        iconGenerator.setContentView(makeSquareTextView(context));
        iconGenerator.setTextAppearance(R.style.amu_ClusterIcon_TextAppearance);
        iconGenerator.setBackground(makeClusterBackground());
        this.mClusterManager = clusterManager;
    }

    private static double distanceSquared(Point point, Point point2) {
        double d2 = point.f23092x;
        double d10 = point2.f23092x;
        double d11 = d2 - d10;
        double d12 = point.f23093y;
        double d13 = point2.f23093y;
        return q0.a(d12, d13, d12 - d13, (d2 - d10) * d11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Point findClosestCluster(List<Point> list, Point point) {
        Point point2 = null;
        if (list != null && !list.isEmpty()) {
            int maxDistanceBetweenClusteredItems = this.mClusterManager.getAlgorithm().getMaxDistanceBetweenClusteredItems();
            double d2 = maxDistanceBetweenClusteredItems * maxDistanceBetweenClusteredItems;
            for (Point point3 : list) {
                double dDistanceSquared = distanceSquared(point3, point);
                if (dDistanceSquared < d2) {
                    point2 = point3;
                    d2 = dDistanceSquared;
                }
            }
        }
        return point2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onAdd$0(Marker marker) {
        ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener = this.mItemClickListener;
        return onClusterItemClickListener != null && onClusterItemClickListener.onClusterItemClick(this.mMarkerCache.get(marker));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdd$1(Marker marker) {
        ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener = this.mItemInfoWindowClickListener;
        if (onClusterItemInfoWindowClickListener != null) {
            onClusterItemInfoWindowClickListener.onClusterItemInfoWindowClick(this.mMarkerCache.get(marker));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdd$2(Marker marker) {
        ClusterManager.OnClusterItemInfoWindowLongClickListener<T> onClusterItemInfoWindowLongClickListener = this.mItemInfoWindowLongClickListener;
        if (onClusterItemInfoWindowLongClickListener != null) {
            onClusterItemInfoWindowLongClickListener.onClusterItemInfoWindowLongClick(this.mMarkerCache.get(marker));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onAdd$3(Marker marker) {
        ClusterManager.OnClusterClickListener<T> onClusterClickListener = this.mClickListener;
        return onClusterClickListener != null && onClusterClickListener.onClusterClick(this.mClusterMarkerCache.get(marker));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdd$4(Marker marker) {
        ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener = this.mInfoWindowClickListener;
        if (onClusterInfoWindowClickListener != null) {
            onClusterInfoWindowClickListener.onClusterInfoWindowClick(this.mClusterMarkerCache.get(marker));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdd$5(Marker marker) {
        ClusterManager.OnClusterInfoWindowLongClickListener<T> onClusterInfoWindowLongClickListener = this.mInfoWindowLongClickListener;
        if (onClusterInfoWindowLongClickListener != null) {
            onClusterInfoWindowLongClickListener.onClusterInfoWindowLongClick(this.mClusterMarkerCache.get(marker));
        }
    }

    private LayerDrawable makeClusterBackground() {
        this.mColoredCircleBackground = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.mColoredCircleBackground});
        int i7 = (int) (this.mDensity * 3.0f);
        layerDrawable.setLayerInset(1, i7, i7, i7, i7);
        return layerDrawable;
    }

    private SquareTextView makeSquareTextView(Context context) {
        SquareTextView squareTextView = new SquareTextView(context);
        squareTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        squareTextView.setId(R.id.amu_text);
        int i7 = (int) (this.mDensity * 12.0f);
        squareTextView.setPadding(i7, i7, i7, i7);
        return squareTextView;
    }

    public int getBucket(@NonNull Cluster<T> cluster) {
        int size = cluster.getSize();
        int i7 = 0;
        if (size <= BUCKETS[0]) {
            return size;
        }
        while (true) {
            int[] iArr = BUCKETS;
            if (i7 >= iArr.length - 1) {
                return iArr[iArr.length - 1];
            }
            int i10 = i7 + 1;
            if (size < iArr[i10]) {
                return iArr[i7];
            }
            i7 = i10;
        }
    }

    public Cluster<T> getCluster(Marker marker) {
        return this.mClusterMarkerCache.get(marker);
    }

    public T getClusterItem(Marker marker) {
        return this.mMarkerCache.get(marker);
    }

    @NonNull
    public String getClusterText(int i7) {
        return i7 < BUCKETS[0] ? String.valueOf(i7) : u.g(i7, "+");
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    @StyleRes
    public int getClusterTextAppearance(int i7) {
        return R.style.amu_ClusterIcon_TextAppearance;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public int getColor(int i7) {
        float fMin = 300.0f - Math.min(i7, 300.0f);
        return Color.HSVToColor(new float[]{((fMin * fMin) / 90000.0f) * 220.0f, 1.0f, 0.6f});
    }

    @NonNull
    public BitmapDescriptor getDescriptorForCluster(@NonNull Cluster<T> cluster) {
        int bucket = getBucket(cluster);
        BitmapDescriptor bitmapDescriptor = this.mIcons.get(bucket);
        if (bitmapDescriptor != null) {
            return bitmapDescriptor;
        }
        this.mColoredCircleBackground.getPaint().setColor(getColor(bucket));
        this.mIconGenerator.setTextAppearance(getClusterTextAppearance(bucket));
        BitmapDescriptor bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(this.mIconGenerator.makeIcon(getClusterText(bucket)));
        this.mIcons.put(bucket, bitmapDescriptorFromBitmap);
        return bitmapDescriptorFromBitmap;
    }

    public Marker getMarker(T t) {
        return this.mMarkerCache.get(t);
    }

    public int getMinClusterSize() {
        return this.mMinClusterSize;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onAdd() {
        this.mClusterManager.getMarkerCollection().setOnMarkerClickListener(new a(this, 0));
        this.mClusterManager.getMarkerCollection().setOnInfoWindowClickListener(new a(this, 1));
        this.mClusterManager.getMarkerCollection().setOnInfoWindowLongClickListener(new a(this, 2));
        this.mClusterManager.getClusterMarkerCollection().setOnMarkerClickListener(new a(this, 3));
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowClickListener(new a(this, 4));
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowLongClickListener(new a(this, 5));
    }

    public void onBeforeClusterItemRendered(@NonNull T t, @NonNull MarkerOptions markerOptions) {
        if (t.getTitle() != null && t.getSnippet() != null) {
            markerOptions.title(t.getTitle());
            markerOptions.snippet(t.getSnippet());
        } else if (t.getTitle() != null) {
            markerOptions.title(t.getTitle());
        } else if (t.getSnippet() != null) {
            markerOptions.title(t.getSnippet());
        }
    }

    public void onBeforeClusterRendered(@NonNull Cluster<T> cluster, @NonNull MarkerOptions markerOptions) {
        markerOptions.icon(getDescriptorForCluster(cluster));
    }

    public void onClusterItemRendered(@NonNull T t, @NonNull Marker marker) {
    }

    public void onClusterItemUpdated(@NonNull T t, @NonNull Marker marker) {
        boolean z3 = true;
        boolean z8 = false;
        if (t.getTitle() == null || t.getSnippet() == null) {
            if (t.getSnippet() != null && !t.getSnippet().equals(marker.getTitle())) {
                marker.setTitle(t.getSnippet());
            } else if (t.getTitle() != null && !t.getTitle().equals(marker.getTitle())) {
                marker.setTitle(t.getTitle());
            }
            z8 = true;
        } else {
            if (!t.getTitle().equals(marker.getTitle())) {
                marker.setTitle(t.getTitle());
                z8 = true;
            }
            if (!t.getSnippet().equals(marker.getSnippet())) {
                marker.setSnippet(t.getSnippet());
                z8 = true;
            }
        }
        if (marker.getPosition().equals(t.getPosition())) {
            z3 = z8;
        } else {
            marker.setPosition(t.getPosition());
            if (t.getZIndex() != null) {
                marker.setZIndex(t.getZIndex().floatValue());
            }
        }
        if (z3 && marker.isInfoWindowShown()) {
            marker.showInfoWindow();
        }
    }

    public void onClusterRendered(@NonNull Cluster<T> cluster, @NonNull Marker marker) {
    }

    public void onClusterUpdated(@NonNull Cluster<T> cluster, @NonNull Marker marker) {
        marker.setIcon(getDescriptorForCluster(cluster));
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onClustersChanged(Set<? extends Cluster<T>> set) {
        this.mViewModifier.queue(set);
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void onRemove() {
        this.mClusterManager.getMarkerCollection().setOnMarkerClickListener(null);
        this.mClusterManager.getMarkerCollection().setOnInfoWindowClickListener(null);
        this.mClusterManager.getMarkerCollection().setOnInfoWindowLongClickListener(null);
        this.mClusterManager.getClusterMarkerCollection().setOnMarkerClickListener(null);
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowClickListener(null);
        this.mClusterManager.getClusterMarkerCollection().setOnInfoWindowLongClickListener(null);
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setAnimation(boolean z3) {
        this.mAnimate = z3;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setAnimationDuration(long j6) {
        this.mAnimationDurationMs = j6;
    }

    public void setMinClusterSize(int i7) {
        this.mMinClusterSize = i7;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterClickListener(ClusterManager.OnClusterClickListener<T> onClusterClickListener) {
        this.mClickListener = onClusterClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterInfoWindowClickListener(ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener) {
        this.mInfoWindowClickListener = onClusterInfoWindowClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterInfoWindowLongClickListener(ClusterManager.OnClusterInfoWindowLongClickListener<T> onClusterInfoWindowLongClickListener) {
        this.mInfoWindowLongClickListener = onClusterInfoWindowLongClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemClickListener(ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener) {
        this.mItemClickListener = onClusterItemClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemInfoWindowClickListener(ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener) {
        this.mItemInfoWindowClickListener = onClusterItemInfoWindowClickListener;
    }

    @Override // com.google.maps.android.clustering.view.ClusterRenderer
    public void setOnClusterItemInfoWindowLongClickListener(ClusterManager.OnClusterItemInfoWindowLongClickListener<T> onClusterItemInfoWindowLongClickListener) {
        this.mItemInfoWindowLongClickListener = onClusterItemInfoWindowLongClickListener;
    }

    public boolean shouldRenderAsCluster(@NonNull Cluster<T> cluster) {
        return cluster.getSize() >= this.mMinClusterSize;
    }

    public Marker getMarker(Cluster<T> cluster) {
        return this.mClusterMarkerCache.get(cluster);
    }
}
