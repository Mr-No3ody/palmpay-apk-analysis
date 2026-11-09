package com.luck.picture.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.interfaces.OnRecyclerViewPreloadMoreListener;
import com.luck.picture.lib.interfaces.OnRecyclerViewScrollListener;
import com.luck.picture.lib.interfaces.OnRecyclerViewScrollStateListener;

/* JADX INFO: loaded from: classes3.dex */
public class RecyclerPreloadView extends RecyclerView {
    private static final int BOTTOM_DEFAULT = 1;
    public static final int BOTTOM_PRELOAD = 2;
    private static final int LIMIT = 150;
    private static final String TAG = "RecyclerPreloadView";
    private boolean isEnabledLoadMore;
    private boolean isInTheBottom;
    private int mFirstVisiblePosition;
    private int mLastVisiblePosition;
    private OnRecyclerViewPreloadMoreListener onRecyclerViewPreloadListener;
    private OnRecyclerViewScrollListener onRecyclerViewScrollListener;
    private OnRecyclerViewScrollStateListener onRecyclerViewScrollStateListener;
    private int reachBottomRow;

    public RecyclerPreloadView(@NonNull Context context) {
        super(context);
        this.isInTheBottom = false;
        this.isEnabledLoadMore = false;
        this.reachBottomRow = 1;
    }

    private void setLayoutManagerPosition(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            this.mFirstVisiblePosition = gridLayoutManager.findFirstVisibleItemPosition();
            this.mLastVisiblePosition = gridLayoutManager.findLastVisibleItemPosition();
        } else if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            this.mFirstVisiblePosition = linearLayoutManager.findFirstVisibleItemPosition();
            this.mLastVisiblePosition = linearLayoutManager.findLastVisibleItemPosition();
        }
    }

    public int getFirstVisiblePosition() {
        return this.mFirstVisiblePosition;
    }

    public int getLastVisiblePosition() {
        return this.mLastVisiblePosition;
    }

    public boolean isEnabledLoadMore() {
        return this.isEnabledLoadMore;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i7) {
        OnRecyclerViewScrollStateListener onRecyclerViewScrollStateListener;
        super.onScrollStateChanged(i7);
        if (i7 == 0 || i7 == 1) {
            setLayoutManagerPosition(getLayoutManager());
        }
        OnRecyclerViewScrollListener onRecyclerViewScrollListener = this.onRecyclerViewScrollListener;
        if (onRecyclerViewScrollListener != null) {
            onRecyclerViewScrollListener.onScrollStateChanged(i7);
        }
        if (i7 != 0 || (onRecyclerViewScrollStateListener = this.onRecyclerViewScrollStateListener) == null) {
            return;
        }
        onRecyclerViewScrollStateListener.onScrollSlow();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i7, int i10) {
        super.onScrolled(i7, i10);
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null) {
            throw new RuntimeException("LayoutManager is null,Please check it!");
        }
        setLayoutManagerPosition(layoutManager);
        if (this.onRecyclerViewPreloadListener != null && this.isEnabledLoadMore) {
            RecyclerView.Adapter adapter = getAdapter();
            if (adapter == null) {
                throw new RuntimeException("Adapter is null,Please check it!");
            }
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                if (gridLayoutManager.findLastVisibleItemPosition() / gridLayoutManager.getSpanCount() < (adapter.getItemCount() / gridLayoutManager.getSpanCount()) - this.reachBottomRow) {
                    this.isInTheBottom = false;
                } else if (!this.isInTheBottom) {
                    this.onRecyclerViewPreloadListener.onRecyclerViewPreloadMore();
                    if (i10 > 0) {
                        this.isInTheBottom = true;
                    }
                } else if (i10 == 0) {
                    this.isInTheBottom = false;
                }
            } else {
                this.isInTheBottom = false;
            }
        }
        OnRecyclerViewScrollListener onRecyclerViewScrollListener = this.onRecyclerViewScrollListener;
        if (onRecyclerViewScrollListener != null) {
            onRecyclerViewScrollListener.onScrolled(i7, i10);
        }
        if (this.onRecyclerViewScrollStateListener != null) {
            if (Math.abs(i10) < LIMIT) {
                this.onRecyclerViewScrollStateListener.onScrollSlow();
            } else {
                this.onRecyclerViewScrollStateListener.onScrollFast();
            }
        }
    }

    public void setEnabledLoadMore(boolean z3) {
        this.isEnabledLoadMore = z3;
    }

    public void setLastVisiblePosition(int i7) {
        this.mLastVisiblePosition = i7;
    }

    public void setOnRecyclerViewPreloadListener(OnRecyclerViewPreloadMoreListener onRecyclerViewPreloadMoreListener) {
        this.onRecyclerViewPreloadListener = onRecyclerViewPreloadMoreListener;
    }

    public void setOnRecyclerViewScrollListener(OnRecyclerViewScrollListener onRecyclerViewScrollListener) {
        this.onRecyclerViewScrollListener = onRecyclerViewScrollListener;
    }

    public void setOnRecyclerViewScrollStateListener(OnRecyclerViewScrollStateListener onRecyclerViewScrollStateListener) {
        this.onRecyclerViewScrollStateListener = onRecyclerViewScrollStateListener;
    }

    public void setReachBottomRow(int i7) {
        if (i7 < 1) {
            i7 = 1;
        }
        this.reachBottomRow = i7;
    }

    public RecyclerPreloadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isInTheBottom = false;
        this.isEnabledLoadMore = false;
        this.reachBottomRow = 1;
    }

    public RecyclerPreloadView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.isInTheBottom = false;
        this.isEnabledLoadMore = false;
        this.reachBottomRow = 1;
    }
}
