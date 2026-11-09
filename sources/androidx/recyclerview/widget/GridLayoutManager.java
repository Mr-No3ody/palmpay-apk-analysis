package androidx.recyclerview.widget;

import C0.G;
import N8.q0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.NonNull;
import java.util.Arrays;
import p045d3.k;
import p074f0.d;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final boolean DEBUG = false;
    public static final int DEFAULT_SPAN_COUNT = -1;
    private static final String TAG = "GridLayoutManager";
    int[] mCachedBorders;
    final Rect mDecorInsets;
    boolean mPendingSpanCountChange;
    final SparseIntArray mPreLayoutSpanIndexCache;
    final SparseIntArray mPreLayoutSpanSizeCache;
    View[] mSet;
    int mSpanCount;
    SpanSizeLookup mSpanSizeLookup;
    private boolean mUsingSpansToEstimateScrollBarDimensions;

    public static final class DefaultSpanSizeLookup extends SpanSizeLookup {
        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanIndex(int i7, int i10) {
            return i7 % i10;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i7) {
            return 1;
        }
    }

    public static abstract class SpanSizeLookup {
        final SparseIntArray mSpanIndexCache = new SparseIntArray();
        final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
        private boolean mCacheSpanIndices = false;
        private boolean mCacheSpanGroupIndices = false;

        public static int findFirstKeyLessThan(SparseIntArray sparseIntArray, int i7) {
            int size = sparseIntArray.size() - 1;
            int i10 = 0;
            while (i10 <= size) {
                int i11 = (i10 + size) >>> 1;
                if (sparseIntArray.keyAt(i11) < i7) {
                    i10 = i11 + 1;
                } else {
                    size = i11 - 1;
                }
            }
            int i12 = i10 - 1;
            if (i12 < 0 || i12 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i12);
        }

        public int getCachedSpanGroupIndex(int i7, int i10) {
            if (!this.mCacheSpanGroupIndices) {
                return getSpanGroupIndex(i7, i10);
            }
            int i11 = this.mSpanGroupIndexCache.get(i7, -1);
            if (i11 != -1) {
                return i11;
            }
            int spanGroupIndex = getSpanGroupIndex(i7, i10);
            this.mSpanGroupIndexCache.put(i7, spanGroupIndex);
            return spanGroupIndex;
        }

        public int getCachedSpanIndex(int i7, int i10) {
            if (!this.mCacheSpanIndices) {
                return getSpanIndex(i7, i10);
            }
            int i11 = this.mSpanIndexCache.get(i7, -1);
            if (i11 != -1) {
                return i11;
            }
            int spanIndex = getSpanIndex(i7, i10);
            this.mSpanIndexCache.put(i7, spanIndex);
            return spanIndex;
        }

        public int getSpanGroupIndex(int i7, int i10) {
            int spanSize;
            int i11;
            int i12;
            int iFindFirstKeyLessThan;
            if (!this.mCacheSpanGroupIndices || (iFindFirstKeyLessThan = findFirstKeyLessThan(this.mSpanGroupIndexCache, i7)) == -1) {
                spanSize = 0;
                i11 = 0;
                i12 = 0;
            } else {
                i11 = this.mSpanGroupIndexCache.get(iFindFirstKeyLessThan);
                i12 = iFindFirstKeyLessThan + 1;
                spanSize = getSpanSize(iFindFirstKeyLessThan) + getCachedSpanIndex(iFindFirstKeyLessThan, i10);
                if (spanSize == i10) {
                    i11++;
                    spanSize = 0;
                }
            }
            int spanSize2 = getSpanSize(i7);
            while (i12 < i7) {
                int spanSize3 = getSpanSize(i12);
                spanSize += spanSize3;
                if (spanSize == i10) {
                    i11++;
                    spanSize = 0;
                } else if (spanSize > i10) {
                    i11++;
                    spanSize = spanSize3;
                }
                i12++;
            }
            return spanSize + spanSize2 > i10 ? i11 + 1 : i11;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0024  */
        /* JADX WARN: Code duplicated, block: B:14:0x002b  */
        /* JADX WARN: Code duplicated, block: B:15:0x002d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x002f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public int getSpanIndex(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.getSpanSize(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.mCacheSpanIndices
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.mSpanIndexCache
                int r2 = findFirstKeyLessThan(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.mSpanIndexCache
                int r3 = r3.get(r2)
                int r4 = r5.getSpanSize(r2)
                int r4 = r4 + r3
                goto L30
            L20:
                r2 = r1
                r4 = r2
            L22:
                if (r2 >= r6) goto L33
                int r3 = r5.getSpanSize(r2)
                int r4 = r4 + r3
                if (r4 != r7) goto L2d
                r4 = r1
                goto L30
            L2d:
                if (r4 <= r7) goto L30
                r4 = r3
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r4
                if (r0 > r7) goto L37
                return r4
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup.getSpanIndex(int, int):int");
        }

        public abstract int getSpanSize(int i7);

        public void invalidateSpanGroupIndexCache() {
            this.mSpanGroupIndexCache.clear();
        }

        public void invalidateSpanIndexCache() {
            this.mSpanIndexCache.clear();
        }

        public boolean isSpanGroupIndexCacheEnabled() {
            return this.mCacheSpanGroupIndices;
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.mCacheSpanIndices;
        }

        public void setSpanGroupIndexCacheEnabled(boolean z3) {
            if (!z3) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanGroupIndices = z3;
        }

        public void setSpanIndexCacheEnabled(boolean z3) {
            if (!z3) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanIndices = z3;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i10) {
        super(context, attributeSet, i7, i10);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new DefaultSpanSizeLookup();
        this.mDecorInsets = new Rect();
        setSpanCount(RecyclerView.LayoutManager.getProperties(context, attributeSet, i7, i10).spanCount);
    }

    private void assignSpans(RecyclerView.Recycler recycler, RecyclerView.State state, int i7, boolean z3) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (z3) {
            i12 = 1;
            i11 = i7;
            i10 = 0;
        } else {
            i10 = i7 - 1;
            i11 = -1;
            i12 = -1;
        }
        while (i10 != i11) {
            View view = this.mSet[i10];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int spanSize = getSpanSize(recycler, state, getPosition(view));
            layoutParams.mSpanSize = spanSize;
            layoutParams.mSpanIndex = i13;
            i13 += spanSize;
            i10 += i12;
        }
    }

    private void cachePreLayoutSpanMapping() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i7).getLayoutParams();
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            this.mPreLayoutSpanSizeCache.put(viewLayoutPosition, layoutParams.getSpanSize());
            this.mPreLayoutSpanIndexCache.put(viewLayoutPosition, layoutParams.getSpanIndex());
        }
    }

    private void calculateItemBorders(int i7) {
        this.mCachedBorders = calculateItemBorders(this.mCachedBorders, this.mSpanCount, i7);
    }

    private void clearPreLayoutSpanMappingCache() {
        this.mPreLayoutSpanSizeCache.clear();
        this.mPreLayoutSpanIndexCache.clear();
    }

    private int computeScrollOffsetWithSpanInfo(RecyclerView.State state) {
        if (getChildCount() != 0 && state.getItemCount() != 0) {
            ensureLayoutState();
            boolean zIsSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!zIsSmoothScrollbarEnabled, true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!zIsSmoothScrollbarEnabled, true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                int cachedSpanGroupIndex = this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToStart), this.mSpanCount);
                int cachedSpanGroupIndex2 = this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToEnd), this.mSpanCount);
                int iMax = this.mShouldReverseLayout ? Math.max(0, ((this.mSpanSizeLookup.getCachedSpanGroupIndex(state.getItemCount() - 1, this.mSpanCount) + 1) - Math.max(cachedSpanGroupIndex, cachedSpanGroupIndex2)) - 1) : Math.max(0, Math.min(cachedSpanGroupIndex, cachedSpanGroupIndex2));
                if (zIsSmoothScrollbarEnabled) {
                    return Math.round((iMax * (Math.abs(this.mOrientationHelper.getDecoratedEnd(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.getDecoratedStart(viewFindFirstVisibleChildClosestToStart)) / ((this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToEnd), this.mSpanCount) - this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToStart), this.mSpanCount)) + 1))) + (this.mOrientationHelper.getStartAfterPadding() - this.mOrientationHelper.getDecoratedStart(viewFindFirstVisibleChildClosestToStart)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private int computeScrollRangeWithSpanInfo(RecyclerView.State state) {
        if (getChildCount() != 0 && state.getItemCount() != 0) {
            ensureLayoutState();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.mSpanSizeLookup.getCachedSpanGroupIndex(state.getItemCount() - 1, this.mSpanCount) + 1;
                }
                return (int) (((this.mOrientationHelper.getDecoratedEnd(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.getDecoratedStart(viewFindFirstVisibleChildClosestToStart)) / ((this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToEnd), this.mSpanCount) - this.mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(viewFindFirstVisibleChildClosestToStart), this.mSpanCount)) + 1)) * (this.mSpanSizeLookup.getCachedSpanGroupIndex(state.getItemCount() - 1, this.mSpanCount) + 1));
            }
        }
        return 0;
    }

    private void ensureAnchorIsInCorrectSpan(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorInfo, int i7) {
        boolean z3 = i7 == 1;
        int spanIndex = getSpanIndex(recycler, state, anchorInfo.mPosition);
        if (z3) {
            while (spanIndex > 0) {
                int i10 = anchorInfo.mPosition;
                if (i10 <= 0) {
                    return;
                }
                int i11 = i10 - 1;
                anchorInfo.mPosition = i11;
                spanIndex = getSpanIndex(recycler, state, i11);
            }
            return;
        }
        int itemCount = state.getItemCount() - 1;
        int i12 = anchorInfo.mPosition;
        while (i12 < itemCount) {
            int i13 = i12 + 1;
            int spanIndex2 = getSpanIndex(recycler, state, i13);
            if (spanIndex2 <= spanIndex) {
                break;
            }
            i12 = i13;
            spanIndex = spanIndex2;
        }
        anchorInfo.mPosition = i12;
    }

    private void ensureViewSet() {
        View[] viewArr = this.mSet;
        if (viewArr == null || viewArr.length != this.mSpanCount) {
            this.mSet = new View[this.mSpanCount];
        }
    }

    private int getSpanGroupIndex(RecyclerView.Recycler recycler, RecyclerView.State state, int i7) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getCachedSpanGroupIndex(i7, this.mSpanCount);
        }
        int iConvertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i7);
        if (iConvertPreLayoutPositionToPostLayout == -1) {
            return 0;
        }
        return this.mSpanSizeLookup.getCachedSpanGroupIndex(iConvertPreLayoutPositionToPostLayout, this.mSpanCount);
    }

    private int getSpanIndex(RecyclerView.Recycler recycler, RecyclerView.State state, int i7) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getCachedSpanIndex(i7, this.mSpanCount);
        }
        int i10 = this.mPreLayoutSpanIndexCache.get(i7, -1);
        if (i10 != -1) {
            return i10;
        }
        int iConvertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i7);
        if (iConvertPreLayoutPositionToPostLayout == -1) {
            return 0;
        }
        return this.mSpanSizeLookup.getCachedSpanIndex(iConvertPreLayoutPositionToPostLayout, this.mSpanCount);
    }

    private int getSpanSize(RecyclerView.Recycler recycler, RecyclerView.State state, int i7) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getSpanSize(i7);
        }
        int i10 = this.mPreLayoutSpanSizeCache.get(i7, -1);
        if (i10 != -1) {
            return i10;
        }
        int iConvertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i7);
        if (iConvertPreLayoutPositionToPostLayout == -1) {
            return 1;
        }
        return this.mSpanSizeLookup.getSpanSize(iConvertPreLayoutPositionToPostLayout);
    }

    private void guessMeasurement(float f10, int i7) {
        calculateItemBorders(Math.max(Math.round(f10 * this.mSpanCount), i7));
    }

    private void measureChild(View view, int i7, boolean z3) {
        int childMeasureSpec;
        int childMeasureSpec2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.mDecorInsets;
        int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i11 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int spaceForSpanRange = getSpaceForSpanRange(layoutParams.mSpanIndex, layoutParams.mSpanSize);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(spaceForSpanRange, i7, i11, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getHeightMode(), i10, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int childMeasureSpec3 = RecyclerView.LayoutManager.getChildMeasureSpec(spaceForSpanRange, i7, i10, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int childMeasureSpec4 = RecyclerView.LayoutManager.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getWidthMode(), i11, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        measureChildWithDecorationsAndMargin(view, childMeasureSpec2, childMeasureSpec, z3);
    }

    private void measureChildWithDecorationsAndMargin(View view, int i7, int i10, boolean z3) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z3 ? shouldReMeasureChild(view, i7, i10, layoutParams) : shouldMeasureChild(view, i7, i10, layoutParams)) {
            view.measure(i7, i10);
        }
    }

    private void updateMeasurements() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        calculateItemBorders(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LinearLayoutManager.LayoutState layoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int spanSize = this.mSpanCount;
        for (int i7 = 0; i7 < this.mSpanCount && layoutState.hasMore(state) && spanSize > 0; i7++) {
            int i10 = layoutState.mCurrentPosition;
            layoutPrefetchRegistry.addPosition(i10, Math.max(0, layoutState.mScrollingOffset));
            spanSize -= this.mSpanSizeLookup.getSpanSize(i10);
            layoutState.mCurrentPosition += layoutState.mItemDirection;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollOffsetWithSpanInfo(state) : super.computeHorizontalScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollRangeWithSpanInfo(state) : super.computeHorizontalScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollOffsetWithSpanInfo(state) : super.computeVerticalScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return this.mUsingSpansToEstimateScrollBarDimensions ? computeScrollRangeWithSpanInfo(state) : super.computeVerticalScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z3, boolean z8) {
        int i7;
        int childCount;
        int childCount2 = getChildCount();
        int i10 = 1;
        if (z8) {
            childCount = getChildCount() - 1;
            i7 = -1;
            i10 = -1;
        } else {
            i7 = childCount2;
            childCount = 0;
        }
        int itemCount = state.getItemCount();
        ensureLayoutState();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        View view = null;
        View view2 = null;
        while (childCount != i7) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < itemCount && getSpanIndex(recycler, state, position) == 0) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.getDecoratedStart(childAt) < endAfterPadding && this.mOrientationHelper.getDecoratedEnd(childAt) >= startAfterPadding) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i10;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return this.mSpanCount;
        }
        if (state.getItemCount() < 1) {
            return 0;
        }
        return getSpanGroupIndex(recycler, state, state.getItemCount() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return this.mSpanCount;
        }
        if (state.getItemCount() < 1) {
            return 0;
        }
        return getSpanGroupIndex(recycler, state, state.getItemCount() - 1) + 1;
    }

    public int getSpaceForSpanRange(int i7, int i10) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.mCachedBorders;
            return iArr[i10 + i7] - iArr[i7];
        }
        int[] iArr2 = this.mCachedBorders;
        int i11 = this.mSpanCount;
        return iArr2[i11 - i7] - iArr2[(i11 - i7) - i10];
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    public SpanSizeLookup getSpanSizeLookup() {
        return this.mSpanSizeLookup;
    }

    public boolean isUsingSpansToEstimateScrollbarDimensions() {
        return this.mUsingSpansToEstimateScrollBarDimensions;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.LayoutState layoutState, LinearLayoutManager.LayoutChunkResult layoutChunkResult) {
        int i7;
        int i10;
        int paddingLeft;
        int paddingTop;
        int decoratedMeasurementInOther;
        int decoratedMeasurementInOther2;
        int i11;
        int childMeasureSpec;
        int childMeasureSpec2;
        View next;
        int modeInOther = this.mOrientationHelper.getModeInOther();
        boolean z3 = modeInOther != 1073741824;
        int i12 = getChildCount() > 0 ? this.mCachedBorders[this.mSpanCount] : 0;
        if (z3) {
            updateMeasurements();
        }
        boolean z8 = layoutState.mItemDirection == 1;
        int spanIndex = this.mSpanCount;
        if (!z8) {
            spanIndex = getSpanIndex(recycler, state, layoutState.mCurrentPosition) + getSpanSize(recycler, state, layoutState.mCurrentPosition);
        }
        int i13 = 0;
        while (i13 < this.mSpanCount && layoutState.hasMore(state) && spanIndex > 0) {
            int i14 = layoutState.mCurrentPosition;
            int spanSize = getSpanSize(recycler, state, i14);
            if (spanSize > this.mSpanCount) {
                throw new IllegalArgumentException(G.n(this.mSpanCount, " spans.", q0.p(i14, "Item at position ", spanSize, " requires ", " spans but GridLayoutManager has only ")));
            }
            spanIndex -= spanSize;
            if (spanIndex < 0 || (next = layoutState.next(recycler)) == null) {
                break;
            }
            this.mSet[i13] = next;
            i13++;
        }
        if (i13 == 0) {
            layoutChunkResult.mFinished = true;
            return;
        }
        assignSpans(recycler, state, i13, z8);
        float f10 = 0.0f;
        int i15 = 0;
        for (int i16 = 0; i16 < i13; i16++) {
            View view = this.mSet[i16];
            if (layoutState.mScrapList == null) {
                if (z8) {
                    addView(view);
                } else {
                    addView(view, 0);
                }
            } else if (z8) {
                addDisappearingView(view);
            } else {
                addDisappearingView(view, 0);
            }
            calculateItemDecorationsForChild(view, this.mDecorInsets);
            measureChild(view, modeInOther, false);
            int decoratedMeasurement = this.mOrientationHelper.getDecoratedMeasurement(view);
            if (decoratedMeasurement > i15) {
                i15 = decoratedMeasurement;
            }
            float decoratedMeasurementInOther3 = (this.mOrientationHelper.getDecoratedMeasurementInOther(view) * 1.0f) / ((LayoutParams) view.getLayoutParams()).mSpanSize;
            if (decoratedMeasurementInOther3 > f10) {
                f10 = decoratedMeasurementInOther3;
            }
        }
        if (z3) {
            guessMeasurement(f10, i12);
            i15 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                View view2 = this.mSet[i17];
                measureChild(view2, 1073741824, true);
                int decoratedMeasurement2 = this.mOrientationHelper.getDecoratedMeasurement(view2);
                if (decoratedMeasurement2 > i15) {
                    i15 = decoratedMeasurement2;
                }
            }
        }
        for (int i18 = 0; i18 < i13; i18++) {
            View view3 = this.mSet[i18];
            if (this.mOrientationHelper.getDecoratedMeasurement(view3) != i15) {
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                Rect rect = layoutParams.mDecorInsets;
                int i19 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                int i20 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                int spaceForSpanRange = getSpaceForSpanRange(layoutParams.mSpanIndex, layoutParams.mSpanSize);
                if (this.mOrientation == 1) {
                    childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(spaceForSpanRange, 1073741824, i20, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - i19, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - i20, 1073741824);
                    childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(spaceForSpanRange, 1073741824, i19, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                measureChildWithDecorationsAndMargin(view3, childMeasureSpec2, childMeasureSpec, true);
            }
        }
        layoutChunkResult.mConsumed = i15;
        if (this.mOrientation == 1) {
            if (layoutState.mLayoutDirection == -1) {
                decoratedMeasurementInOther2 = layoutState.mOffset;
                i11 = decoratedMeasurementInOther2 - i15;
            } else {
                i11 = layoutState.mOffset;
                decoratedMeasurementInOther2 = i11 + i15;
            }
            paddingTop = i11;
            decoratedMeasurementInOther = 0;
            paddingLeft = 0;
        } else {
            if (layoutState.mLayoutDirection == -1) {
                i10 = layoutState.mOffset;
                i7 = i10 - i15;
            } else {
                i7 = layoutState.mOffset;
                i10 = i7 + i15;
            }
            paddingLeft = i7;
            paddingTop = 0;
            decoratedMeasurementInOther = i10;
            decoratedMeasurementInOther2 = 0;
        }
        for (int i21 = 0; i21 < i13; i21++) {
            View view4 = this.mSet[i21];
            LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
            if (this.mOrientation != 1) {
                paddingTop = this.mCachedBorders[layoutParams2.mSpanIndex] + getPaddingTop();
                decoratedMeasurementInOther2 = this.mOrientationHelper.getDecoratedMeasurementInOther(view4) + paddingTop;
            } else if (isLayoutRTL()) {
                decoratedMeasurementInOther = getPaddingLeft() + this.mCachedBorders[this.mSpanCount - layoutParams2.mSpanIndex];
                paddingLeft = decoratedMeasurementInOther - this.mOrientationHelper.getDecoratedMeasurementInOther(view4);
            } else {
                paddingLeft = this.mCachedBorders[layoutParams2.mSpanIndex] + getPaddingLeft();
                decoratedMeasurementInOther = this.mOrientationHelper.getDecoratedMeasurementInOther(view4) + paddingLeft;
            }
            int i22 = decoratedMeasurementInOther2;
            int i23 = paddingTop;
            int i24 = decoratedMeasurementInOther;
            int i25 = paddingLeft;
            layoutDecoratedWithMargins(view4, i25, i23, i24, i22);
            decoratedMeasurementInOther2 = i22;
            paddingLeft = i25;
            decoratedMeasurementInOther = i24;
            paddingTop = i23;
            if (layoutParams2.isItemRemoved() || layoutParams2.isItemChanged()) {
                layoutChunkResult.mIgnoreConsumed = true;
            }
            layoutChunkResult.mFocusable = view4.hasFocusable() | layoutChunkResult.mFocusable;
        }
        Arrays.fill(this.mSet, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.AnchorInfo anchorInfo, int i7) {
        super.onAnchorReady(recycler, state, anchorInfo, i7);
        updateMeasurements();
        if (state.getItemCount() > 0 && !state.isPreLayout()) {
            ensureAnchorIsInCorrectSpan(recycler, state, anchorInfo, i7);
        }
        ensureViewSet();
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.Recycler r26, androidx.recyclerview.widget.RecyclerView.State r27) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, @NonNull d dVar) {
        super.onInitializeAccessibilityNodeInfo(recycler, state, dVar);
        dVar.k(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, d dVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, dVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int spanGroupIndex = getSpanGroupIndex(recycler, state, layoutParams2.getViewLayoutPosition());
        if (this.mOrientation == 0) {
            dVar.n(k.h(layoutParams2.getSpanIndex(), layoutParams2.getSpanSize(), spanGroupIndex, 1, false, false));
        } else {
            dVar.n(k.h(spanGroupIndex, 1, layoutParams2.getSpanIndex(), layoutParams2.getSpanSize(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i7, int i10) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i7, int i10, int i11) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i7, int i10) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i7, int i10, Object obj) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        this.mSpanSizeLookup.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.isPreLayout()) {
            cachePreLayoutSpanMapping();
        }
        super.onLayoutChildren(recycler, state);
        clearPreLayoutSpanMappingCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.mPendingSpanCountChange = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollHorizontallyBy(i7, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollVerticallyBy(i7, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i7, int i10) {
        int iChooseSize;
        int iChooseSize2;
        if (this.mCachedBorders == null) {
            super.setMeasuredDimension(rect, i7, i10);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            iChooseSize2 = RecyclerView.LayoutManager.chooseSize(i10, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.mCachedBorders;
            iChooseSize = RecyclerView.LayoutManager.chooseSize(i7, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.LayoutManager.chooseSize(i7, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.mCachedBorders;
            iChooseSize2 = RecyclerView.LayoutManager.chooseSize(i10, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public void setSpanCount(int i7) {
        if (i7 == this.mSpanCount) {
            return;
        }
        this.mPendingSpanCountChange = true;
        if (i7 < 1) {
            throw new IllegalArgumentException(G.m(i7, "Span count should be at least 1. Provided "));
        }
        this.mSpanCount = i7;
        this.mSpanSizeLookup.invalidateSpanIndexCache();
        requestLayout();
    }

    public void setSpanSizeLookup(SpanSizeLookup spanSizeLookup) {
        this.mSpanSizeLookup = spanSizeLookup;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z3) {
        if (z3) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    public void setUsingSpansToEstimateScrollbarDimensions(boolean z3) {
        this.mUsingSpansToEstimateScrollBarDimensions = z3;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.mPendingSpanCountChange;
    }

    public static int[] calculateItemBorders(int[] iArr, int i7, int i10) {
        int i11;
        if (iArr == null || iArr.length != i7 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i7 + 1];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i10 / i7;
        int i14 = i10 % i7;
        int i15 = 0;
        for (int i16 = 1; i16 <= i7; i16++) {
            i12 += i14;
            if (i12 <= 0 || i7 - i12 >= i14) {
                i11 = i13;
            } else {
                i11 = i13 + 1;
                i12 -= i7;
            }
            i15 += i11;
            iArr[i16] = i15;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        int mSpanIndex;
        int mSpanSize;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public int getSpanIndex() {
            return this.mSpanIndex;
        }

        public int getSpanSize() {
            return this.mSpanSize;
        }

        public LayoutParams(int i7, int i10) {
            super(i7, i10);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.mSpanIndex = -1;
            this.mSpanSize = 0;
        }
    }

    public GridLayoutManager(Context context, int i7) {
        super(context);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new DefaultSpanSizeLookup();
        this.mDecorInsets = new Rect();
        setSpanCount(i7);
    }

    public GridLayoutManager(Context context, int i7, int i10, boolean z3) {
        super(context, i10, z3);
        this.mPendingSpanCountChange = false;
        this.mSpanCount = -1;
        this.mPreLayoutSpanSizeCache = new SparseIntArray();
        this.mPreLayoutSpanIndexCache = new SparseIntArray();
        this.mSpanSizeLookup = new DefaultSpanSizeLookup();
        this.mDecorInsets = new Rect();
        setSpanCount(i7);
    }
}
