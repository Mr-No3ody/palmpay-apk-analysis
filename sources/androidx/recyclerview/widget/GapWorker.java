package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.annotation.Nullable;
import androidx.core.os.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class GapWorker implements Runnable {
    static final ThreadLocal<GapWorker> sGapWorker = new ThreadLocal<>();
    static Comparator<Task> sTaskComparator = new Comparator<Task>() { // from class: androidx.recyclerview.widget.GapWorker.1
        @Override // java.util.Comparator
        public int compare(Task task, Task task2) {
            RecyclerView recyclerView = task.view;
            if ((recyclerView == null) != (task2.view == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z3 = task.immediate;
            if (z3 != task2.immediate) {
                return z3 ? -1 : 1;
            }
            int i7 = task2.viewVelocity - task.viewVelocity;
            if (i7 != 0) {
                return i7;
            }
            int i10 = task.distanceToItem - task2.distanceToItem;
            if (i10 != 0) {
                return i10;
            }
            return 0;
        }
    };
    long mFrameIntervalNs;
    long mPostTimeNs;
    ArrayList<RecyclerView> mRecyclerViews = new ArrayList<>();
    private ArrayList<Task> mTasks = new ArrayList<>();

    @SuppressLint({"VisibleForTests"})
    public static class LayoutPrefetchRegistryImpl implements RecyclerView.LayoutManager.LayoutPrefetchRegistry {
        int mCount;
        int[] mPrefetchArray;
        int mPrefetchDx;
        int mPrefetchDy;

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry
        public void addPosition(int i7, int i10) {
            if (i7 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i10 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i11 = this.mCount;
            int i12 = i11 * 2;
            int[] iArr = this.mPrefetchArray;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.mPrefetchArray = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i12 >= iArr.length) {
                int[] iArr3 = new int[i11 * 4];
                this.mPrefetchArray = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.mPrefetchArray;
            iArr4[i12] = i7;
            iArr4[i12 + 1] = i10;
            this.mCount++;
        }

        public void clearPrefetchPositions() {
            int[] iArr = this.mPrefetchArray;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.mCount = 0;
        }

        public void collectPrefetchPositionsFromView(RecyclerView recyclerView, boolean z3) {
            this.mCount = 0;
            int[] iArr = this.mPrefetchArray;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || layoutManager == null || !layoutManager.isItemPrefetchEnabled()) {
                return;
            }
            if (z3) {
                if (!recyclerView.mAdapterHelper.hasPendingUpdates()) {
                    layoutManager.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                layoutManager.collectAdjacentPrefetchPositions(this.mPrefetchDx, this.mPrefetchDy, recyclerView.mState, this);
            }
            int i7 = this.mCount;
            if (i7 > layoutManager.mPrefetchMaxCountObserved) {
                layoutManager.mPrefetchMaxCountObserved = i7;
                layoutManager.mPrefetchMaxObservedInInitialPrefetch = z3;
                recyclerView.mRecycler.updateViewCacheSize();
            }
        }

        public boolean lastPrefetchIncludedPosition(int i7) {
            if (this.mPrefetchArray != null) {
                int i10 = this.mCount * 2;
                for (int i11 = 0; i11 < i10; i11 += 2) {
                    if (this.mPrefetchArray[i11] == i7) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void setPrefetchVector(int i7, int i10) {
            this.mPrefetchDx = i7;
            this.mPrefetchDy = i10;
        }
    }

    public static class Task {
        public int distanceToItem;
        public boolean immediate;
        public int position;
        public RecyclerView view;
        public int viewVelocity;

        public void clear() {
            this.immediate = false;
            this.viewVelocity = 0;
            this.distanceToItem = 0;
            this.view = null;
            this.position = 0;
        }
    }

    private void buildTaskList() {
        Task task;
        int size = this.mRecyclerViews.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView = this.mRecyclerViews.get(i10);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.collectPrefetchPositionsFromView(recyclerView, false);
                i7 += recyclerView.mPrefetchRegistry.mCount;
            }
        }
        this.mTasks.ensureCapacity(i7);
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView2 = this.mRecyclerViews.get(i12);
            if (recyclerView2.getWindowVisibility() == 0) {
                LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView2.mPrefetchRegistry;
                int iAbs = Math.abs(layoutPrefetchRegistryImpl.mPrefetchDy) + Math.abs(layoutPrefetchRegistryImpl.mPrefetchDx);
                for (int i13 = 0; i13 < layoutPrefetchRegistryImpl.mCount * 2; i13 += 2) {
                    if (i11 >= this.mTasks.size()) {
                        task = new Task();
                        this.mTasks.add(task);
                    } else {
                        task = this.mTasks.get(i11);
                    }
                    int[] iArr = layoutPrefetchRegistryImpl.mPrefetchArray;
                    int i14 = iArr[i13 + 1];
                    task.immediate = i14 <= iAbs;
                    task.viewVelocity = iAbs;
                    task.distanceToItem = i14;
                    task.view = recyclerView2;
                    task.position = iArr[i13];
                    i11++;
                }
            }
        }
        Collections.sort(this.mTasks, sTaskComparator);
    }

    private void flushTaskWithDeadline(Task task, long j6) {
        RecyclerView.ViewHolder viewHolderPrefetchPositionWithDeadline = prefetchPositionWithDeadline(task.view, task.position, task.immediate ? Long.MAX_VALUE : j6);
        if (viewHolderPrefetchPositionWithDeadline == null || viewHolderPrefetchPositionWithDeadline.mNestedRecyclerView == null || !viewHolderPrefetchPositionWithDeadline.isBound() || viewHolderPrefetchPositionWithDeadline.isInvalid()) {
            return;
        }
        prefetchInnerRecyclerViewWithDeadline(viewHolderPrefetchPositionWithDeadline.mNestedRecyclerView.get(), j6);
    }

    private void flushTasksWithDeadline(long j6) {
        for (int i7 = 0; i7 < this.mTasks.size(); i7++) {
            Task task = this.mTasks.get(i7);
            if (task.view == null) {
                return;
            }
            flushTaskWithDeadline(task, j6);
            task.clear();
        }
    }

    public static boolean isPrefetchPositionAttached(RecyclerView recyclerView, int i7) {
        int unfilteredChildCount = recyclerView.mChildHelper.getUnfilteredChildCount();
        for (int i10 = 0; i10 < unfilteredChildCount; i10++) {
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.getUnfilteredChildAt(i10));
            if (childViewHolderInt.mPosition == i7 && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void prefetchInnerRecyclerViewWithDeadline(@Nullable RecyclerView recyclerView, long j6) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.getUnfilteredChildCount() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView.mPrefetchRegistry;
        layoutPrefetchRegistryImpl.collectPrefetchPositionsFromView(recyclerView, true);
        if (layoutPrefetchRegistryImpl.mCount != 0) {
            try {
                int i7 = j.f16100a;
                Trace.beginSection("RV Nested Prefetch");
                recyclerView.mState.prepareForNestedPrefetch(recyclerView.mAdapter);
                for (int i10 = 0; i10 < layoutPrefetchRegistryImpl.mCount * 2; i10 += 2) {
                    prefetchPositionWithDeadline(recyclerView, layoutPrefetchRegistryImpl.mPrefetchArray[i10], j6);
                }
                Trace.endSection();
            } catch (Throwable th) {
                int i11 = j.f16100a;
                Trace.endSection();
                throw th;
            }
        }
    }

    private RecyclerView.ViewHolder prefetchPositionWithDeadline(RecyclerView recyclerView, int i7, long j6) {
        if (isPrefetchPositionAttached(recyclerView, i7)) {
            return null;
        }
        RecyclerView.Recycler recycler = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.ViewHolder viewHolderTryGetViewHolderForPositionByDeadline = recycler.tryGetViewHolderForPositionByDeadline(i7, false, j6);
            if (viewHolderTryGetViewHolderForPositionByDeadline != null) {
                if (!viewHolderTryGetViewHolderForPositionByDeadline.isBound() || viewHolderTryGetViewHolderForPositionByDeadline.isInvalid()) {
                    recycler.addViewHolderToRecycledViewPool(viewHolderTryGetViewHolderForPositionByDeadline, false);
                } else {
                    recycler.recycleView(viewHolderTryGetViewHolderForPositionByDeadline.itemView);
                }
            }
            return viewHolderTryGetViewHolderForPositionByDeadline;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public void add(RecyclerView recyclerView) {
        if (RecyclerView.sDebugAssertionsEnabled && this.mRecyclerViews.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.mRecyclerViews.add(recyclerView);
    }

    public void postFromTraversal(RecyclerView recyclerView, int i7, int i10) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.mRecyclerViews.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.mPostTimeNs == 0) {
                this.mPostTimeNs = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.mPrefetchRegistry.setPrefetchVector(i7, i10);
    }

    public void prefetch(long j6) {
        buildTaskList();
        flushTasksWithDeadline(j6);
    }

    public void remove(RecyclerView recyclerView) {
        boolean zRemove = this.mRecyclerViews.remove(recyclerView);
        if (RecyclerView.sDebugAssertionsEnabled && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            int i7 = j.f16100a;
            Trace.beginSection("RV Prefetch");
            if (this.mRecyclerViews.isEmpty()) {
                this.mPostTimeNs = 0L;
                return;
            }
            int size = this.mRecyclerViews.size();
            long jMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView recyclerView = this.mRecyclerViews.get(i10);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.mPostTimeNs = 0L;
            } else {
                prefetch(TimeUnit.MILLISECONDS.toNanos(jMax) + this.mFrameIntervalNs);
                this.mPostTimeNs = 0L;
            }
        } finally {
            this.mPostTimeNs = 0L;
            int i11 = j.f16100a;
            Trace.endSection();
        }
    }
}
