package com.google.android.flexbox;

import N8.q0;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements FlexContainer, RecyclerView.SmoothScroller.ScrollVectorProvider {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEBUG = false;
    private static final String TAG = "FlexboxLayoutManager";
    private static final Rect TEMP_RECT = new Rect();
    private int mAlignItems;
    private AnchorInfo mAnchorInfo;
    private final Context mContext;
    private int mDirtyPosition;
    private int mFlexDirection;
    private List<FlexLine> mFlexLines;
    private FlexboxHelper.FlexLinesResult mFlexLinesResult;
    private int mFlexWrap;
    private final FlexboxHelper mFlexboxHelper;
    private boolean mFromBottomToTop;
    private boolean mIsRtl;
    private int mJustifyContent;
    private int mLastHeight;
    private int mLastWidth;
    private LayoutState mLayoutState;
    private int mMaxLine;
    private OrientationHelper mOrientationHelper;
    private View mParent;
    private SavedState mPendingSavedState;
    private int mPendingScrollPosition;
    private int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private RecyclerView.Recycler mRecycler;
    private RecyclerView.State mState;
    private OrientationHelper mSubOrientationHelper;
    private SparseArray<View> mViewCache;

    public class AnchorInfo {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private boolean mAssignedFromSavedState;
        private int mCoordinate;
        private int mFlexLinePosition;
        private boolean mLayoutFromEnd;
        private int mPerpendicularCoordinate;
        private int mPosition;
        private boolean mValid;

        private AnchorInfo() {
            this.mPerpendicularCoordinate = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void assignCoordinateFromPadding() {
            if (FlexboxLayoutManager.this.isMainAxisDirectionHorizontal() || !FlexboxLayoutManager.this.mIsRtl) {
                this.mCoordinate = this.mLayoutFromEnd ? FlexboxLayoutManager.this.mOrientationHelper.getEndAfterPadding() : FlexboxLayoutManager.this.mOrientationHelper.getStartAfterPadding();
            } else {
                this.mCoordinate = this.mLayoutFromEnd ? FlexboxLayoutManager.this.mOrientationHelper.getEndAfterPadding() : FlexboxLayoutManager.this.getWidth() - FlexboxLayoutManager.this.mOrientationHelper.getStartAfterPadding();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void assignFromView(View view) {
            OrientationHelper orientationHelper = FlexboxLayoutManager.this.mFlexWrap == 0 ? FlexboxLayoutManager.this.mSubOrientationHelper : FlexboxLayoutManager.this.mOrientationHelper;
            if (FlexboxLayoutManager.this.isMainAxisDirectionHorizontal() || !FlexboxLayoutManager.this.mIsRtl) {
                if (this.mLayoutFromEnd) {
                    this.mCoordinate = orientationHelper.getTotalSpaceChange() + orientationHelper.getDecoratedEnd(view);
                } else {
                    this.mCoordinate = orientationHelper.getDecoratedStart(view);
                }
            } else if (this.mLayoutFromEnd) {
                this.mCoordinate = orientationHelper.getTotalSpaceChange() + orientationHelper.getDecoratedStart(view);
            } else {
                this.mCoordinate = orientationHelper.getDecoratedEnd(view);
            }
            this.mPosition = FlexboxLayoutManager.this.getPosition(view);
            this.mAssignedFromSavedState = false;
            int[] iArr = FlexboxLayoutManager.this.mFlexboxHelper.mIndexToFlexLine;
            int i7 = this.mPosition;
            if (i7 == -1) {
                i7 = 0;
            }
            int i10 = iArr[i7];
            this.mFlexLinePosition = i10 != -1 ? i10 : 0;
            if (FlexboxLayoutManager.this.mFlexLines.size() > this.mFlexLinePosition) {
                this.mPosition = ((FlexLine) FlexboxLayoutManager.this.mFlexLines.get(this.mFlexLinePosition)).mFirstIndex;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.mPosition = -1;
            this.mFlexLinePosition = -1;
            this.mCoordinate = Integer.MIN_VALUE;
            this.mValid = false;
            this.mAssignedFromSavedState = false;
            if (FlexboxLayoutManager.this.isMainAxisDirectionHorizontal()) {
                if (FlexboxLayoutManager.this.mFlexWrap == 0) {
                    this.mLayoutFromEnd = FlexboxLayoutManager.this.mFlexDirection == 1;
                    return;
                } else {
                    this.mLayoutFromEnd = FlexboxLayoutManager.this.mFlexWrap == 2;
                    return;
                }
            }
            if (FlexboxLayoutManager.this.mFlexWrap == 0) {
                this.mLayoutFromEnd = FlexboxLayoutManager.this.mFlexDirection == 3;
            } else {
                this.mLayoutFromEnd = FlexboxLayoutManager.this.mFlexWrap == 2;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.mPosition + ", mFlexLinePosition=" + this.mFlexLinePosition + ", mCoordinate=" + this.mCoordinate + ", mPerpendicularCoordinate=" + this.mPerpendicularCoordinate + ", mLayoutFromEnd=" + this.mLayoutFromEnd + ", mValid=" + this.mValid + ", mAssignedFromSavedState=" + this.mAssignedFromSavedState + '}';
        }
    }

    public static class LayoutState {
        private static final int ITEM_DIRECTION_TAIL = 1;
        private static final int LAYOUT_END = 1;
        private static final int LAYOUT_START = -1;
        private static final int SCROLLING_OFFSET_NaN = Integer.MIN_VALUE;
        private int mAvailable;
        private int mFlexLinePosition;
        private boolean mInfinite;
        private int mItemDirection;
        private int mLastScrollDelta;
        private int mLayoutDirection;
        private int mOffset;
        private int mPosition;
        private int mScrollingOffset;
        private boolean mShouldRecycle;

        private LayoutState() {
            this.mItemDirection = 1;
            this.mLayoutDirection = 1;
        }

        public static /* synthetic */ int access$1508(LayoutState layoutState) {
            int i7 = layoutState.mFlexLinePosition;
            layoutState.mFlexLinePosition = i7 + 1;
            return i7;
        }

        public static /* synthetic */ int access$1510(LayoutState layoutState) {
            int i7 = layoutState.mFlexLinePosition;
            layoutState.mFlexLinePosition = i7 - 1;
            return i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasMore(RecyclerView.State state, List<FlexLine> list) {
            int i7;
            int i10 = this.mPosition;
            return i10 >= 0 && i10 < state.getItemCount() && (i7 = this.mFlexLinePosition) >= 0 && i7 < list.size();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("LayoutState{mAvailable=");
            sb2.append(this.mAvailable);
            sb2.append(", mFlexLinePosition=");
            sb2.append(this.mFlexLinePosition);
            sb2.append(", mPosition=");
            sb2.append(this.mPosition);
            sb2.append(", mOffset=");
            sb2.append(this.mOffset);
            sb2.append(", mScrollingOffset=");
            sb2.append(this.mScrollingOffset);
            sb2.append(", mLastScrollDelta=");
            sb2.append(this.mLastScrollDelta);
            sb2.append(", mItemDirection=");
            sb2.append(this.mItemDirection);
            sb2.append(", mLayoutDirection=");
            return q0.m(sb2, this.mLayoutDirection, '}');
        }
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    private boolean canViewBeRecycledFromEnd(View view, int i7) {
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            return this.mOrientationHelper.getDecoratedStart(view) >= this.mOrientationHelper.getEnd() - i7;
        }
        return this.mOrientationHelper.getDecoratedEnd(view) <= i7;
    }

    private boolean canViewBeRecycledFromStart(View view, int i7) {
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            return this.mOrientationHelper.getDecoratedEnd(view) <= i7;
        }
        return this.mOrientationHelper.getEnd() - this.mOrientationHelper.getDecoratedStart(view) <= i7;
    }

    private void clearFlexLines() {
        this.mFlexLines.clear();
        this.mAnchorInfo.reset();
        this.mAnchorInfo.mPerpendicularCoordinate = 0;
    }

    private int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        ensureOrientationHelper();
        View viewFindFirstReferenceChild = findFirstReferenceChild(itemCount);
        View viewFindLastReferenceChild = findLastReferenceChild(itemCount);
        if (state.getItemCount() == 0 || viewFindFirstReferenceChild == null || viewFindLastReferenceChild == null) {
            return 0;
        }
        return Math.min(this.mOrientationHelper.getTotalSpace(), this.mOrientationHelper.getDecoratedEnd(viewFindLastReferenceChild) - this.mOrientationHelper.getDecoratedStart(viewFindFirstReferenceChild));
    }

    private int computeScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View viewFindFirstReferenceChild = findFirstReferenceChild(itemCount);
        View viewFindLastReferenceChild = findLastReferenceChild(itemCount);
        if (state.getItemCount() != 0 && viewFindFirstReferenceChild != null && viewFindLastReferenceChild != null) {
            int position = getPosition(viewFindFirstReferenceChild);
            int position2 = getPosition(viewFindLastReferenceChild);
            int iAbs = Math.abs(this.mOrientationHelper.getDecoratedEnd(viewFindLastReferenceChild) - this.mOrientationHelper.getDecoratedStart(viewFindFirstReferenceChild));
            int[] iArr = this.mFlexboxHelper.mIndexToFlexLine;
            int i7 = iArr[position];
            if (i7 != 0 && i7 != -1) {
                return Math.round((i7 * (iAbs / ((iArr[position2] - i7) + 1))) + (this.mOrientationHelper.getStartAfterPadding() - this.mOrientationHelper.getDecoratedStart(viewFindFirstReferenceChild)));
            }
        }
        return 0;
    }

    private int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View viewFindFirstReferenceChild = findFirstReferenceChild(itemCount);
        View viewFindLastReferenceChild = findLastReferenceChild(itemCount);
        if (state.getItemCount() == 0 || viewFindFirstReferenceChild == null || viewFindLastReferenceChild == null) {
            return 0;
        }
        return (int) ((Math.abs(this.mOrientationHelper.getDecoratedEnd(viewFindLastReferenceChild) - this.mOrientationHelper.getDecoratedStart(viewFindFirstReferenceChild)) / ((findLastVisibleItemPosition() - findFirstVisibleItemPosition()) + 1)) * state.getItemCount());
    }

    private void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = new LayoutState();
        }
    }

    private void ensureOrientationHelper() {
        if (this.mOrientationHelper != null) {
            return;
        }
        if (isMainAxisDirectionHorizontal()) {
            if (this.mFlexWrap == 0) {
                this.mOrientationHelper = OrientationHelper.createHorizontalHelper(this);
                this.mSubOrientationHelper = OrientationHelper.createVerticalHelper(this);
                return;
            } else {
                this.mOrientationHelper = OrientationHelper.createVerticalHelper(this);
                this.mSubOrientationHelper = OrientationHelper.createHorizontalHelper(this);
                return;
            }
        }
        if (this.mFlexWrap == 0) {
            this.mOrientationHelper = OrientationHelper.createVerticalHelper(this);
            this.mSubOrientationHelper = OrientationHelper.createHorizontalHelper(this);
        } else {
            this.mOrientationHelper = OrientationHelper.createHorizontalHelper(this);
            this.mSubOrientationHelper = OrientationHelper.createVerticalHelper(this);
        }
    }

    private int fill(RecyclerView.Recycler recycler, RecyclerView.State state, LayoutState layoutState) {
        if (layoutState.mScrollingOffset != Integer.MIN_VALUE) {
            if (layoutState.mAvailable < 0) {
                layoutState.mScrollingOffset += layoutState.mAvailable;
            }
            recycleByLayoutState(recycler, layoutState);
        }
        int i7 = layoutState.mAvailable;
        int crossSize = layoutState.mAvailable;
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int iLayoutFlexLine = 0;
        while (true) {
            if ((crossSize <= 0 && !this.mLayoutState.mInfinite) || !layoutState.hasMore(state, this.mFlexLines)) {
                break;
            }
            FlexLine flexLine = this.mFlexLines.get(layoutState.mFlexLinePosition);
            layoutState.mPosition = flexLine.mFirstIndex;
            iLayoutFlexLine += layoutFlexLine(flexLine, layoutState);
            if (zIsMainAxisDirectionHorizontal || !this.mIsRtl) {
                layoutState.mOffset = (flexLine.getCrossSize() * layoutState.mLayoutDirection) + layoutState.mOffset;
            } else {
                layoutState.mOffset -= flexLine.getCrossSize() * layoutState.mLayoutDirection;
            }
            crossSize -= flexLine.getCrossSize();
        }
        layoutState.mAvailable -= iLayoutFlexLine;
        if (layoutState.mScrollingOffset != Integer.MIN_VALUE) {
            layoutState.mScrollingOffset += iLayoutFlexLine;
            if (layoutState.mAvailable < 0) {
                layoutState.mScrollingOffset += layoutState.mAvailable;
            }
            recycleByLayoutState(recycler, layoutState);
        }
        return i7 - layoutState.mAvailable;
    }

    private View findFirstReferenceChild(int i7) {
        View viewFindReferenceChild = findReferenceChild(0, getChildCount(), i7);
        if (viewFindReferenceChild == null) {
            return null;
        }
        int i10 = this.mFlexboxHelper.mIndexToFlexLine[getPosition(viewFindReferenceChild)];
        if (i10 == -1) {
            return null;
        }
        return findFirstReferenceViewInLine(viewFindReferenceChild, this.mFlexLines.get(i10));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    private View findFirstReferenceViewInLine(View view, FlexLine flexLine) {
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int i7 = flexLine.mItemCount;
        for (int i10 = 1; i10 < i7; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.mIsRtl || zIsMainAxisDirectionHorizontal) {
                    if (this.mOrientationHelper.getDecoratedStart(view) > this.mOrientationHelper.getDecoratedStart(childAt)) {
                        view = childAt;
                    }
                } else if (this.mOrientationHelper.getDecoratedEnd(view) < this.mOrientationHelper.getDecoratedEnd(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    private View findLastReferenceChild(int i7) {
        View viewFindReferenceChild = findReferenceChild(getChildCount() - 1, -1, i7);
        if (viewFindReferenceChild == null) {
            return null;
        }
        return findLastReferenceViewInLine(viewFindReferenceChild, this.mFlexLines.get(this.mFlexboxHelper.mIndexToFlexLine[getPosition(viewFindReferenceChild)]));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    private View findLastReferenceViewInLine(View view, FlexLine flexLine) {
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int childCount = (getChildCount() - flexLine.mItemCount) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (!this.mIsRtl || zIsMainAxisDirectionHorizontal) {
                    if (this.mOrientationHelper.getDecoratedEnd(view) < this.mOrientationHelper.getDecoratedEnd(childAt)) {
                        view = childAt;
                    }
                } else if (this.mOrientationHelper.getDecoratedStart(view) > this.mOrientationHelper.getDecoratedStart(childAt)) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    private View findOneVisibleChild(int i7, int i10, boolean z3) {
        int i11 = i10 > i7 ? 1 : -1;
        while (i7 != i10) {
            View childAt = getChildAt(i7);
            if (isViewVisible(childAt, z3)) {
                return childAt;
            }
            i7 += i11;
        }
        return null;
    }

    private View findReferenceChild(int i7, int i10, int i11) {
        ensureOrientationHelper();
        ensureLayoutState();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
        int i12 = i10 > i7 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i7 != i10) {
            View childAt = getChildAt(i7);
            int position = getPosition(childAt);
            if (position >= 0 && position < i11) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.getDecoratedStart(childAt) >= startAfterPadding && this.mOrientationHelper.getDecoratedEnd(childAt) <= endAfterPadding) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i7 += i12;
        }
        return view != null ? view : view2;
    }

    private int fixLayoutEndGap(int i7, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z3) {
        int iHandleScrollingMainOrientation;
        int endAfterPadding;
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            int endAfterPadding2 = this.mOrientationHelper.getEndAfterPadding() - i7;
            if (endAfterPadding2 <= 0) {
                return 0;
            }
            iHandleScrollingMainOrientation = -handleScrollingMainOrientation(-endAfterPadding2, recycler, state);
        } else {
            int startAfterPadding = i7 - this.mOrientationHelper.getStartAfterPadding();
            if (startAfterPadding <= 0) {
                return 0;
            }
            iHandleScrollingMainOrientation = handleScrollingMainOrientation(startAfterPadding, recycler, state);
        }
        int i10 = i7 + iHandleScrollingMainOrientation;
        if (!z3 || (endAfterPadding = this.mOrientationHelper.getEndAfterPadding() - i10) <= 0) {
            return iHandleScrollingMainOrientation;
        }
        this.mOrientationHelper.offsetChildren(endAfterPadding);
        return endAfterPadding + iHandleScrollingMainOrientation;
    }

    private int fixLayoutStartGap(int i7, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z3) {
        int iHandleScrollingMainOrientation;
        int startAfterPadding;
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            int startAfterPadding2 = i7 - this.mOrientationHelper.getStartAfterPadding();
            if (startAfterPadding2 <= 0) {
                return 0;
            }
            iHandleScrollingMainOrientation = -handleScrollingMainOrientation(startAfterPadding2, recycler, state);
        } else {
            int endAfterPadding = this.mOrientationHelper.getEndAfterPadding() - i7;
            if (endAfterPadding <= 0) {
                return 0;
            }
            iHandleScrollingMainOrientation = handleScrollingMainOrientation(-endAfterPadding, recycler, state);
        }
        int i10 = i7 + iHandleScrollingMainOrientation;
        if (!z3 || (startAfterPadding = i10 - this.mOrientationHelper.getStartAfterPadding()) <= 0) {
            return iHandleScrollingMainOrientation;
        }
        this.mOrientationHelper.offsetChildren(-startAfterPadding);
        return iHandleScrollingMainOrientation - startAfterPadding;
    }

    private int getChildBottom(View view) {
        return getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    private View getChildClosestToStart() {
        return getChildAt(0);
    }

    private int getChildLeft(View view) {
        return getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
    }

    private int getChildRight(View view) {
        return getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
    }

    private int getChildTop(View view) {
        return getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    private int handleScrollingMainOrientation(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i7 == 0) {
            return 0;
        }
        ensureOrientationHelper();
        int i10 = 1;
        this.mLayoutState.mShouldRecycle = true;
        boolean z3 = !isMainAxisDirectionHorizontal() && this.mIsRtl;
        if (!z3 ? i7 <= 0 : i7 >= 0) {
            i10 = -1;
        }
        int iAbs = Math.abs(i7);
        updateLayoutState(i10, iAbs);
        int iFill = this.mLayoutState.mScrollingOffset + fill(recycler, state, this.mLayoutState);
        if (iFill < 0) {
            return 0;
        }
        if (z3) {
            if (iAbs > iFill) {
                i7 = (-i10) * iFill;
            }
        } else if (iAbs > iFill) {
            i7 = i10 * iFill;
        }
        this.mOrientationHelper.offsetChildren(-i7);
        this.mLayoutState.mLastScrollDelta = i7;
        return i7;
    }

    private int handleScrollingSubOrientation(int i7) {
        if (getChildCount() == 0 || i7 == 0) {
            return 0;
        }
        ensureOrientationHelper();
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        View view = this.mParent;
        int width = zIsMainAxisDirectionHorizontal ? view.getWidth() : view.getHeight();
        int width2 = zIsMainAxisDirectionHorizontal ? getWidth() : getHeight();
        if (getLayoutDirection() == 1) {
            int iAbs = Math.abs(i7);
            if (i7 < 0) {
                return -Math.min((width2 + this.mAnchorInfo.mPerpendicularCoordinate) - width, iAbs);
            }
            if (this.mAnchorInfo.mPerpendicularCoordinate + i7 > 0) {
                return -this.mAnchorInfo.mPerpendicularCoordinate;
            }
        } else {
            if (i7 > 0) {
                return Math.min((width2 - this.mAnchorInfo.mPerpendicularCoordinate) - width, i7);
            }
            if (this.mAnchorInfo.mPerpendicularCoordinate + i7 < 0) {
                return -this.mAnchorInfo.mPerpendicularCoordinate;
            }
        }
        return i7;
    }

    private static boolean isMeasurementUpToDate(int i7, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (i11 > 0 && i7 != i11) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i7;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i7;
        }
        return true;
    }

    private boolean isViewVisible(View view, boolean z3) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int childLeft = getChildLeft(view);
        int childTop = getChildTop(view);
        int childRight = getChildRight(view);
        int childBottom = getChildBottom(view);
        boolean z8 = paddingLeft <= childLeft && width >= childRight;
        boolean z10 = childLeft >= width || childRight >= paddingLeft;
        boolean z11 = paddingTop <= childTop && height >= childBottom;
        boolean z12 = childTop >= height || childBottom >= paddingTop;
        if (z3) {
            return z8 && z11;
        }
        return z10 && z12;
    }

    private int layoutFlexLine(FlexLine flexLine, LayoutState layoutState) {
        return isMainAxisDirectionHorizontal() ? layoutFlexLineMainAxisHorizontal(flexLine, layoutState) : layoutFlexLineMainAxisVertical(flexLine, layoutState);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00da  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    /* JADX WARN: Code duplicated, block: B:53:0x012e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0146  */
    private int layoutFlexLineMainAxisHorizontal(FlexLine flexLine, LayoutState layoutState) {
        float f10;
        float f11;
        float f12;
        float rightDecorationWidth;
        float leftDecorationWidth;
        float fMax;
        int itemCount;
        int i7;
        int i10;
        float f13;
        View flexItemAt;
        float f14;
        int iExtractLowerInt;
        int iExtractHigherInt;
        LayoutParams layoutParams;
        float leftDecorationWidth2;
        float rightDecorationWidth2;
        int topDecorationHeight;
        FlexLine flexLine2 = flexLine;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int width = getWidth();
        int i11 = layoutState.mOffset;
        if (layoutState.mLayoutDirection == -1) {
            i11 -= flexLine2.mCrossSize;
        }
        int i12 = i11;
        int i13 = layoutState.mPosition;
        int i14 = this.mJustifyContent;
        int i15 = 1;
        if (i14 == 0) {
            f10 = paddingLeft;
            f11 = width - paddingRight;
        } else {
            if (i14 != 1) {
                if (i14 == 2) {
                    int i16 = flexLine2.mMainSize;
                    f10 = paddingLeft + ((width - i16) / 2.0f);
                    f11 = (width - paddingRight) - ((width - i16) / 2.0f);
                } else if (i14 == 3) {
                    f10 = paddingLeft;
                    int i17 = flexLine2.mItemCount;
                    f12 = (width - flexLine2.mMainSize) / (i17 != 1 ? i17 - 1 : 1.0f);
                    f11 = width - paddingRight;
                } else if (i14 == 4) {
                    int i18 = flexLine2.mItemCount;
                    f12 = i18 != 0 ? (width - flexLine2.mMainSize) / i18 : 0.0f;
                    float f15 = f12 / 2.0f;
                    f10 = paddingLeft + f15;
                    f11 = (width - paddingRight) - f15;
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
                    }
                    int i19 = flexLine2.mItemCount;
                    f12 = i19 != 0 ? (width - flexLine2.mMainSize) / (i19 + 1) : 0.0f;
                    f10 = paddingLeft + f12;
                    f11 = (width - paddingRight) - f12;
                }
                rightDecorationWidth = f10 - this.mAnchorInfo.mPerpendicularCoordinate;
                leftDecorationWidth = f11 - this.mAnchorInfo.mPerpendicularCoordinate;
                fMax = Math.max(f12, 0.0f);
                itemCount = flexLine2.getItemCount();
                i7 = 0;
                i10 = i13;
                while (i10 < i13 + itemCount) {
                    f13 = leftDecorationWidth;
                    flexItemAt = getFlexItemAt(i10);
                    if (flexItemAt == null) {
                        leftDecorationWidth = f13;
                        f14 = fMax;
                    } else {
                        if (layoutState.mLayoutDirection == i15) {
                            calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                            addView(flexItemAt);
                        } else {
                            calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                            addView(flexItemAt, i7);
                            i7++;
                        }
                        int i20 = i7;
                        FlexboxHelper flexboxHelper = this.mFlexboxHelper;
                        f14 = fMax;
                        long j6 = flexboxHelper.mMeasureSpecCache[i10];
                        iExtractLowerInt = flexboxHelper.extractLowerInt(j6);
                        iExtractHigherInt = this.mFlexboxHelper.extractHigherInt(j6);
                        layoutParams = (LayoutParams) flexItemAt.getLayoutParams();
                        if (shouldMeasureChild(flexItemAt, iExtractLowerInt, iExtractHigherInt, layoutParams)) {
                            flexItemAt.measure(iExtractLowerInt, iExtractHigherInt);
                        }
                        leftDecorationWidth2 = rightDecorationWidth + getLeftDecorationWidth(flexItemAt) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        rightDecorationWidth2 = f13 - (getRightDecorationWidth(flexItemAt) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                        topDecorationHeight = getTopDecorationHeight(flexItemAt) + i12;
                        if (this.mIsRtl) {
                            this.mFlexboxHelper.layoutSingleChildHorizontal(flexItemAt, flexLine2, Math.round(rightDecorationWidth2) - flexItemAt.getMeasuredWidth(), topDecorationHeight, Math.round(rightDecorationWidth2), flexItemAt.getMeasuredHeight() + topDecorationHeight);
                        } else {
                            this.mFlexboxHelper.layoutSingleChildHorizontal(flexItemAt, flexLine, Math.round(leftDecorationWidth2), topDecorationHeight, flexItemAt.getMeasuredWidth() + Math.round(leftDecorationWidth2), flexItemAt.getMeasuredHeight() + topDecorationHeight);
                        }
                        rightDecorationWidth = getRightDecorationWidth(flexItemAt) + flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + f14 + leftDecorationWidth2;
                        i7 = i20;
                        leftDecorationWidth = rightDecorationWidth2 - ((getLeftDecorationWidth(flexItemAt) + (flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin)) + f14);
                    }
                    i10++;
                    flexLine2 = flexLine;
                    fMax = f14;
                    i15 = 1;
                }
                layoutState.mFlexLinePosition += this.mLayoutState.mLayoutDirection;
                return flexLine.getCrossSize();
            }
            int i21 = flexLine2.mMainSize;
            float f16 = (width - i21) + paddingRight;
            f11 = i21 - paddingLeft;
            f10 = f16;
        }
        f12 = 0.0f;
        rightDecorationWidth = f10 - this.mAnchorInfo.mPerpendicularCoordinate;
        leftDecorationWidth = f11 - this.mAnchorInfo.mPerpendicularCoordinate;
        fMax = Math.max(f12, 0.0f);
        itemCount = flexLine2.getItemCount();
        i7 = 0;
        i10 = i13;
        while (i10 < i13 + itemCount) {
            f13 = leftDecorationWidth;
            flexItemAt = getFlexItemAt(i10);
            if (flexItemAt == null) {
                leftDecorationWidth = f13;
                f14 = fMax;
            } else {
                if (layoutState.mLayoutDirection == i15) {
                    calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                    addView(flexItemAt);
                } else {
                    calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                    addView(flexItemAt, i7);
                    i7++;
                }
                int i22 = i7;
                FlexboxHelper flexboxHelper2 = this.mFlexboxHelper;
                f14 = fMax;
                long j10 = flexboxHelper2.mMeasureSpecCache[i10];
                iExtractLowerInt = flexboxHelper2.extractLowerInt(j10);
                iExtractHigherInt = this.mFlexboxHelper.extractHigherInt(j10);
                layoutParams = (LayoutParams) flexItemAt.getLayoutParams();
                if (shouldMeasureChild(flexItemAt, iExtractLowerInt, iExtractHigherInt, layoutParams)) {
                    flexItemAt.measure(iExtractLowerInt, iExtractHigherInt);
                }
                leftDecorationWidth2 = rightDecorationWidth + getLeftDecorationWidth(flexItemAt) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                rightDecorationWidth2 = f13 - (getRightDecorationWidth(flexItemAt) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                topDecorationHeight = getTopDecorationHeight(flexItemAt) + i12;
                if (this.mIsRtl) {
                    this.mFlexboxHelper.layoutSingleChildHorizontal(flexItemAt, flexLine2, Math.round(rightDecorationWidth2) - flexItemAt.getMeasuredWidth(), topDecorationHeight, Math.round(rightDecorationWidth2), flexItemAt.getMeasuredHeight() + topDecorationHeight);
                } else {
                    this.mFlexboxHelper.layoutSingleChildHorizontal(flexItemAt, flexLine, Math.round(leftDecorationWidth2), topDecorationHeight, flexItemAt.getMeasuredWidth() + Math.round(leftDecorationWidth2), flexItemAt.getMeasuredHeight() + topDecorationHeight);
                }
                rightDecorationWidth = getRightDecorationWidth(flexItemAt) + flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + f14 + leftDecorationWidth2;
                i7 = i22;
                leftDecorationWidth = rightDecorationWidth2 - ((getLeftDecorationWidth(flexItemAt) + (flexItemAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin)) + f14);
            }
            i10++;
            flexLine2 = flexLine;
            fMax = f14;
            i15 = 1;
        }
        layoutState.mFlexLinePosition += this.mLayoutState.mLayoutDirection;
        return flexLine.getCrossSize();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x011a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0125  */
    /* JADX WARN: Code duplicated, block: B:53:0x013f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0143  */
    /* JADX WARN: Code duplicated, block: B:56:0x0161  */
    /* JADX WARN: Code duplicated, block: B:57:0x017e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0184  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a1  */
    private int layoutFlexLineMainAxisVertical(FlexLine flexLine, LayoutState layoutState) {
        float f10;
        float f11;
        float f12;
        float bottomDecorationHeight;
        float topDecorationHeight;
        float fMax;
        int itemCount;
        int i7;
        int i10;
        float f13;
        View flexItemAt;
        float f14;
        int iExtractLowerInt;
        int iExtractHigherInt;
        LayoutParams layoutParams;
        float topDecorationHeight2;
        float bottomDecorationHeight2;
        int leftDecorationWidth;
        int rightDecorationWidth;
        boolean z3;
        boolean z8;
        FlexLine flexLine2 = flexLine;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i11 = layoutState.mOffset;
        int i12 = layoutState.mOffset;
        if (layoutState.mLayoutDirection == -1) {
            int i13 = flexLine2.mCrossSize;
            i11 -= i13;
            i12 += i13;
        }
        int i14 = i11;
        int i15 = i12;
        int i16 = layoutState.mPosition;
        int i17 = this.mJustifyContent;
        boolean z10 = true;
        if (i17 == 0) {
            f10 = paddingTop;
            f11 = height - paddingBottom;
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    int i18 = flexLine2.mMainSize;
                    f10 = paddingTop + ((height - i18) / 2.0f);
                    f11 = (height - paddingBottom) - ((height - i18) / 2.0f);
                } else if (i17 == 3) {
                    f10 = paddingTop;
                    int i19 = flexLine2.mItemCount;
                    f12 = (height - flexLine2.mMainSize) / (i19 != 1 ? i19 - 1 : 1.0f);
                    f11 = height - paddingBottom;
                } else if (i17 == 4) {
                    int i20 = flexLine2.mItemCount;
                    f12 = i20 != 0 ? (height - flexLine2.mMainSize) / i20 : 0.0f;
                    float f15 = f12 / 2.0f;
                    f10 = paddingTop + f15;
                    f11 = (height - paddingBottom) - f15;
                } else {
                    if (i17 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
                    }
                    int i21 = flexLine2.mItemCount;
                    f12 = i21 != 0 ? (height - flexLine2.mMainSize) / (i21 + 1) : 0.0f;
                    f10 = paddingTop + f12;
                    f11 = (height - paddingBottom) - f12;
                }
                bottomDecorationHeight = f10 - this.mAnchorInfo.mPerpendicularCoordinate;
                topDecorationHeight = f11 - this.mAnchorInfo.mPerpendicularCoordinate;
                fMax = Math.max(f12, 0.0f);
                itemCount = flexLine2.getItemCount();
                i7 = 0;
                i10 = i16;
                while (i10 < i16 + itemCount) {
                    f13 = topDecorationHeight;
                    flexItemAt = getFlexItemAt(i10);
                    if (flexItemAt == null) {
                        topDecorationHeight = f13;
                        z8 = z10;
                        f14 = fMax;
                    } else {
                        FlexboxHelper flexboxHelper = this.mFlexboxHelper;
                        f14 = fMax;
                        long j6 = flexboxHelper.mMeasureSpecCache[i10];
                        iExtractLowerInt = flexboxHelper.extractLowerInt(j6);
                        iExtractHigherInt = this.mFlexboxHelper.extractHigherInt(j6);
                        layoutParams = (LayoutParams) flexItemAt.getLayoutParams();
                        if (shouldMeasureChild(flexItemAt, iExtractLowerInt, iExtractHigherInt, layoutParams)) {
                            flexItemAt.measure(iExtractLowerInt, iExtractHigherInt);
                        }
                        topDecorationHeight2 = bottomDecorationHeight + getTopDecorationHeight(flexItemAt) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        bottomDecorationHeight2 = f13 - (getBottomDecorationHeight(flexItemAt) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                        if (layoutState.mLayoutDirection == 1) {
                            calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                            addView(flexItemAt);
                        } else {
                            calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                            addView(flexItemAt, i7);
                            i7++;
                        }
                        int i22 = i7;
                        leftDecorationWidth = getLeftDecorationWidth(flexItemAt) + i14;
                        rightDecorationWidth = i15 - getRightDecorationWidth(flexItemAt);
                        z3 = this.mIsRtl;
                        if (z3) {
                            z8 = true;
                            if (this.mFromBottomToTop) {
                                this.mFlexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine, z3, leftDecorationWidth, Math.round(bottomDecorationHeight2) - flexItemAt.getMeasuredHeight(), flexItemAt.getMeasuredWidth() + leftDecorationWidth, Math.round(bottomDecorationHeight2));
                            } else {
                                this.mFlexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine, z3, leftDecorationWidth, Math.round(topDecorationHeight2), flexItemAt.getMeasuredWidth() + leftDecorationWidth, flexItemAt.getMeasuredHeight() + Math.round(topDecorationHeight2));
                            }
                        } else if (this.mFromBottomToTop) {
                            z8 = true;
                            this.mFlexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine2, z3, rightDecorationWidth - flexItemAt.getMeasuredWidth(), Math.round(bottomDecorationHeight2) - flexItemAt.getMeasuredHeight(), rightDecorationWidth, Math.round(bottomDecorationHeight2));
                        } else {
                            z8 = true;
                            this.mFlexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine, z3, rightDecorationWidth - flexItemAt.getMeasuredWidth(), Math.round(topDecorationHeight2), rightDecorationWidth, flexItemAt.getMeasuredHeight() + Math.round(topDecorationHeight2));
                        }
                        bottomDecorationHeight = getBottomDecorationHeight(flexItemAt) + flexItemAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + f14 + topDecorationHeight2;
                        i7 = i22;
                        topDecorationHeight = bottomDecorationHeight2 - ((getTopDecorationHeight(flexItemAt) + (flexItemAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin)) + f14);
                    }
                    i10++;
                    flexLine2 = flexLine;
                    fMax = f14;
                    z10 = z8;
                }
                layoutState.mFlexLinePosition += this.mLayoutState.mLayoutDirection;
                return flexLine.getCrossSize();
            }
            int i23 = flexLine2.mMainSize;
            float f16 = (height - i23) + paddingBottom;
            f11 = i23 - paddingTop;
            f10 = f16;
        }
        f12 = 0.0f;
        bottomDecorationHeight = f10 - this.mAnchorInfo.mPerpendicularCoordinate;
        topDecorationHeight = f11 - this.mAnchorInfo.mPerpendicularCoordinate;
        fMax = Math.max(f12, 0.0f);
        itemCount = flexLine2.getItemCount();
        i7 = 0;
        i10 = i16;
        while (i10 < i16 + itemCount) {
            f13 = topDecorationHeight;
            flexItemAt = getFlexItemAt(i10);
            if (flexItemAt == null) {
                topDecorationHeight = f13;
                z8 = z10;
                f14 = fMax;
            } else {
                FlexboxHelper flexboxHelper2 = this.mFlexboxHelper;
                f14 = fMax;
                long j10 = flexboxHelper2.mMeasureSpecCache[i10];
                iExtractLowerInt = flexboxHelper2.extractLowerInt(j10);
                iExtractHigherInt = this.mFlexboxHelper.extractHigherInt(j10);
                layoutParams = (LayoutParams) flexItemAt.getLayoutParams();
                if (shouldMeasureChild(flexItemAt, iExtractLowerInt, iExtractHigherInt, layoutParams)) {
                    flexItemAt.measure(iExtractLowerInt, iExtractHigherInt);
                }
                topDecorationHeight2 = bottomDecorationHeight + getTopDecorationHeight(flexItemAt) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                bottomDecorationHeight2 = f13 - (getBottomDecorationHeight(flexItemAt) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                if (layoutState.mLayoutDirection == 1) {
                    calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                    addView(flexItemAt);
                } else {
                    calculateItemDecorationsForChild(flexItemAt, TEMP_RECT);
                    addView(flexItemAt, i7);
                    i7++;
                }
                int i24 = i7;
                leftDecorationWidth = getLeftDecorationWidth(flexItemAt) + i14;
                rightDecorationWidth = i15 - getRightDecorationWidth(flexItemAt);
                z3 = this.mIsRtl;
                if (z3) {
                    z8 = true;
                    if (this.mFromBottomToTop) {
                        this.mFlexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine, z3, leftDecorationWidth, Math.round(bottomDecorationHeight2) - flexItemAt.getMeasuredHeight(), flexItemAt.getMeasuredWidth() + leftDecorationWidth, Math.round(bottomDecorationHeight2));
                    } else {
                        this.mFlexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine, z3, leftDecorationWidth, Math.round(topDecorationHeight2), flexItemAt.getMeasuredWidth() + leftDecorationWidth, flexItemAt.getMeasuredHeight() + Math.round(topDecorationHeight2));
                    }
                } else if (this.mFromBottomToTop) {
                    z8 = true;
                    this.mFlexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine2, z3, rightDecorationWidth - flexItemAt.getMeasuredWidth(), Math.round(bottomDecorationHeight2) - flexItemAt.getMeasuredHeight(), rightDecorationWidth, Math.round(bottomDecorationHeight2));
                } else {
                    z8 = true;
                    this.mFlexboxHelper.layoutSingleChildVertical(flexItemAt, flexLine, z3, rightDecorationWidth - flexItemAt.getMeasuredWidth(), Math.round(topDecorationHeight2), rightDecorationWidth, flexItemAt.getMeasuredHeight() + Math.round(topDecorationHeight2));
                }
                bottomDecorationHeight = getBottomDecorationHeight(flexItemAt) + flexItemAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + f14 + topDecorationHeight2;
                i7 = i24;
                topDecorationHeight = bottomDecorationHeight2 - ((getTopDecorationHeight(flexItemAt) + (flexItemAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin)) + f14);
            }
            i10++;
            flexLine2 = flexLine;
            fMax = f14;
            z10 = z8;
        }
        layoutState.mFlexLinePosition += this.mLayoutState.mLayoutDirection;
        return flexLine.getCrossSize();
    }

    private void recycleByLayoutState(RecyclerView.Recycler recycler, LayoutState layoutState) {
        if (layoutState.mShouldRecycle) {
            if (layoutState.mLayoutDirection == -1) {
                recycleFlexLinesFromEnd(recycler, layoutState);
            } else {
                recycleFlexLinesFromStart(recycler, layoutState);
            }
        }
    }

    private void recycleChildren(RecyclerView.Recycler recycler, int i7, int i10) {
        while (i10 >= i7) {
            removeAndRecycleViewAt(i10, recycler);
            i10--;
        }
    }

    private void recycleFlexLinesFromEnd(RecyclerView.Recycler recycler, LayoutState layoutState) {
        if (layoutState.mScrollingOffset < 0) {
            return;
        }
        this.mOrientationHelper.getEnd();
        int unused = layoutState.mScrollingOffset;
        int childCount = getChildCount();
        if (childCount == 0) {
            return;
        }
        int i7 = childCount - 1;
        int i10 = this.mFlexboxHelper.mIndexToFlexLine[getPosition(getChildAt(i7))];
        if (i10 == -1) {
            return;
        }
        FlexLine flexLine = this.mFlexLines.get(i10);
        for (int i11 = i7; i11 >= 0; i11--) {
            View childAt = getChildAt(i11);
            if (!canViewBeRecycledFromEnd(childAt, layoutState.mScrollingOffset)) {
                break;
            }
            if (flexLine.mFirstIndex == getPosition(childAt)) {
                if (i10 <= 0) {
                    childCount = i11;
                    break;
                } else {
                    i10 += layoutState.mLayoutDirection;
                    flexLine = this.mFlexLines.get(i10);
                    childCount = i11;
                }
            }
        }
        recycleChildren(recycler, childCount, i7);
    }

    private void recycleFlexLinesFromStart(RecyclerView.Recycler recycler, LayoutState layoutState) {
        int childCount;
        if (layoutState.mScrollingOffset >= 0 && (childCount = getChildCount()) != 0) {
            int i7 = this.mFlexboxHelper.mIndexToFlexLine[getPosition(getChildAt(0))];
            int i10 = -1;
            if (i7 == -1) {
                return;
            }
            FlexLine flexLine = this.mFlexLines.get(i7);
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (!canViewBeRecycledFromStart(childAt, layoutState.mScrollingOffset)) {
                    break;
                }
                if (flexLine.mLastIndex == getPosition(childAt)) {
                    if (i7 >= this.mFlexLines.size() - 1) {
                        i10 = i11;
                        break;
                    } else {
                        i7 += layoutState.mLayoutDirection;
                        flexLine = this.mFlexLines.get(i7);
                        i10 = i11;
                    }
                }
            }
            recycleChildren(recycler, 0, i10);
        }
    }

    private void resolveInfiniteAmount() {
        int heightMode = isMainAxisDirectionHorizontal() ? getHeightMode() : getWidthMode();
        this.mLayoutState.mInfinite = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    private void resolveLayoutDirection() {
        int layoutDirection = getLayoutDirection();
        int i7 = this.mFlexDirection;
        if (i7 == 0) {
            this.mIsRtl = layoutDirection == 1;
            this.mFromBottomToTop = this.mFlexWrap == 2;
            return;
        }
        if (i7 == 1) {
            this.mIsRtl = layoutDirection != 1;
            this.mFromBottomToTop = this.mFlexWrap == 2;
            return;
        }
        if (i7 == 2) {
            boolean z3 = layoutDirection == 1;
            this.mIsRtl = z3;
            if (this.mFlexWrap == 2) {
                this.mIsRtl = !z3;
            }
            this.mFromBottomToTop = false;
            return;
        }
        if (i7 != 3) {
            this.mIsRtl = false;
            this.mFromBottomToTop = false;
            return;
        }
        boolean z8 = layoutDirection == 1;
        this.mIsRtl = z8;
        if (this.mFlexWrap == 2) {
            this.mIsRtl = !z8;
        }
        this.mFromBottomToTop = true;
    }

    private boolean shouldMeasureChild(View view, int i7, int i10, RecyclerView.LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && isMeasurementCacheEnabled() && isMeasurementUpToDate(view.getWidth(), i7, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    private boolean updateAnchorFromChildren(RecyclerView.State state, AnchorInfo anchorInfo) {
        if (getChildCount() == 0) {
            return false;
        }
        View viewFindLastReferenceChild = anchorInfo.mLayoutFromEnd ? findLastReferenceChild(state.getItemCount()) : findFirstReferenceChild(state.getItemCount());
        if (viewFindLastReferenceChild == null) {
            return false;
        }
        anchorInfo.assignFromView(viewFindLastReferenceChild);
        if (state.isPreLayout() || !supportsPredictiveItemAnimations()) {
            return true;
        }
        if (this.mOrientationHelper.getDecoratedStart(viewFindLastReferenceChild) < this.mOrientationHelper.getEndAfterPadding() && this.mOrientationHelper.getDecoratedEnd(viewFindLastReferenceChild) >= this.mOrientationHelper.getStartAfterPadding()) {
            return true;
        }
        anchorInfo.mCoordinate = anchorInfo.mLayoutFromEnd ? this.mOrientationHelper.getEndAfterPadding() : this.mOrientationHelper.getStartAfterPadding();
        return true;
    }

    private boolean updateAnchorFromPendingState(RecyclerView.State state, AnchorInfo anchorInfo, SavedState savedState) {
        int i7;
        if (!state.isPreLayout() && (i7 = this.mPendingScrollPosition) != -1) {
            if (i7 >= 0 && i7 < state.getItemCount()) {
                anchorInfo.mPosition = this.mPendingScrollPosition;
                anchorInfo.mFlexLinePosition = this.mFlexboxHelper.mIndexToFlexLine[anchorInfo.mPosition];
                SavedState savedState2 = this.mPendingSavedState;
                if (savedState2 != null && savedState2.hasValidAnchor(state.getItemCount())) {
                    anchorInfo.mCoordinate = this.mOrientationHelper.getStartAfterPadding() + savedState.mAnchorOffset;
                    anchorInfo.mAssignedFromSavedState = true;
                    anchorInfo.mFlexLinePosition = -1;
                    return true;
                }
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
                        anchorInfo.mCoordinate = this.mOrientationHelper.getStartAfterPadding() + this.mPendingScrollPositionOffset;
                    } else {
                        anchorInfo.mCoordinate = this.mPendingScrollPositionOffset - this.mOrientationHelper.getEndPadding();
                    }
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                if (viewFindViewByPosition == null) {
                    if (getChildCount() > 0) {
                        anchorInfo.mLayoutFromEnd = this.mPendingScrollPosition < getPosition(getChildAt(0));
                    }
                    anchorInfo.assignCoordinateFromPadding();
                } else {
                    if (this.mOrientationHelper.getDecoratedMeasurement(viewFindViewByPosition) > this.mOrientationHelper.getTotalSpace()) {
                        anchorInfo.assignCoordinateFromPadding();
                        return true;
                    }
                    if (this.mOrientationHelper.getDecoratedStart(viewFindViewByPosition) - this.mOrientationHelper.getStartAfterPadding() < 0) {
                        anchorInfo.mCoordinate = this.mOrientationHelper.getStartAfterPadding();
                        anchorInfo.mLayoutFromEnd = false;
                        return true;
                    }
                    if (this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(viewFindViewByPosition) < 0) {
                        anchorInfo.mCoordinate = this.mOrientationHelper.getEndAfterPadding();
                        anchorInfo.mLayoutFromEnd = true;
                        return true;
                    }
                    anchorInfo.mCoordinate = anchorInfo.mLayoutFromEnd ? this.mOrientationHelper.getTotalSpaceChange() + this.mOrientationHelper.getDecoratedEnd(viewFindViewByPosition) : this.mOrientationHelper.getDecoratedStart(viewFindViewByPosition);
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.State state, AnchorInfo anchorInfo) {
        if (updateAnchorFromPendingState(state, anchorInfo, this.mPendingSavedState) || updateAnchorFromChildren(state, anchorInfo)) {
            return;
        }
        anchorInfo.assignCoordinateFromPadding();
        anchorInfo.mPosition = 0;
        anchorInfo.mFlexLinePosition = 0;
    }

    private void updateDirtyPosition(int i7) {
        if (i7 >= findLastVisibleItemPosition()) {
            return;
        }
        int childCount = getChildCount();
        this.mFlexboxHelper.ensureMeasureSpecCache(childCount);
        this.mFlexboxHelper.ensureMeasuredSizeCache(childCount);
        this.mFlexboxHelper.ensureIndexToFlexLine(childCount);
        if (i7 >= this.mFlexboxHelper.mIndexToFlexLine.length) {
            return;
        }
        this.mDirtyPosition = i7;
        View childClosestToStart = getChildClosestToStart();
        if (childClosestToStart == null) {
            return;
        }
        this.mPendingScrollPosition = getPosition(childClosestToStart);
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            this.mPendingScrollPositionOffset = this.mOrientationHelper.getDecoratedStart(childClosestToStart) - this.mOrientationHelper.getStartAfterPadding();
        } else {
            this.mPendingScrollPositionOffset = this.mOrientationHelper.getEndPadding() + this.mOrientationHelper.getDecoratedEnd(childClosestToStart);
        }
    }

    private void updateFlexLines(int i7) {
        int i10;
        int i11;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        int width = getWidth();
        int height = getHeight();
        boolean z3 = false;
        if (isMainAxisDirectionHorizontal()) {
            int i12 = this.mLastWidth;
            if (i12 != Integer.MIN_VALUE && i12 != width) {
                z3 = true;
            }
            i10 = this.mLayoutState.mInfinite ? this.mContext.getResources().getDisplayMetrics().heightPixels : this.mLayoutState.mAvailable;
        } else {
            int i13 = this.mLastHeight;
            if (i13 != Integer.MIN_VALUE && i13 != height) {
                z3 = true;
            }
            i10 = this.mLayoutState.mInfinite ? this.mContext.getResources().getDisplayMetrics().widthPixels : this.mLayoutState.mAvailable;
        }
        int i14 = i10;
        this.mLastWidth = width;
        this.mLastHeight = height;
        int i15 = this.mDirtyPosition;
        if (i15 == -1 && (this.mPendingScrollPosition != -1 || z3)) {
            if (this.mAnchorInfo.mLayoutFromEnd) {
                return;
            }
            this.mFlexLines.clear();
            this.mFlexLinesResult.reset();
            if (isMainAxisDirectionHorizontal()) {
                this.mFlexboxHelper.calculateHorizontalFlexLinesToIndex(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i14, this.mAnchorInfo.mPosition, this.mFlexLines);
            } else {
                this.mFlexboxHelper.calculateVerticalFlexLinesToIndex(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i14, this.mAnchorInfo.mPosition, this.mFlexLines);
            }
            this.mFlexLines = this.mFlexLinesResult.mFlexLines;
            this.mFlexboxHelper.determineMainSize(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.mFlexboxHelper.stretchViews();
            AnchorInfo anchorInfo = this.mAnchorInfo;
            anchorInfo.mFlexLinePosition = this.mFlexboxHelper.mIndexToFlexLine[anchorInfo.mPosition];
            this.mLayoutState.mFlexLinePosition = this.mAnchorInfo.mFlexLinePosition;
            return;
        }
        int iMin = i15 != -1 ? Math.min(i15, this.mAnchorInfo.mPosition) : this.mAnchorInfo.mPosition;
        this.mFlexLinesResult.reset();
        if (!isMainAxisDirectionHorizontal()) {
            i11 = iMin;
            if (this.mFlexLines.size() > 0) {
                this.mFlexboxHelper.clearFlexLines(this.mFlexLines, i11);
                iMin = i11;
                this.mFlexboxHelper.calculateFlexLines(this.mFlexLinesResult, iMakeMeasureSpec2, iMakeMeasureSpec, i14, iMin, this.mAnchorInfo.mPosition, this.mFlexLines);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
                i11 = iMin;
            } else {
                this.mFlexboxHelper.ensureIndexToFlexLine(i7);
                this.mFlexboxHelper.calculateVerticalFlexLines(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i14, 0, this.mFlexLines);
            }
        } else if (this.mFlexLines.size() > 0) {
            this.mFlexboxHelper.clearFlexLines(this.mFlexLines, iMin);
            this.mFlexboxHelper.calculateFlexLines(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i14, iMin, this.mAnchorInfo.mPosition, this.mFlexLines);
            i11 = iMin;
        } else {
            i11 = iMin;
            this.mFlexboxHelper.ensureIndexToFlexLine(i7);
            this.mFlexboxHelper.calculateHorizontalFlexLines(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i14, 0, this.mFlexLines);
        }
        this.mFlexLines = this.mFlexLinesResult.mFlexLines;
        this.mFlexboxHelper.determineMainSize(iMakeMeasureSpec, iMakeMeasureSpec2, i11);
        this.mFlexboxHelper.stretchViews(i11);
    }

    private void updateLayoutState(int i7, int i10) {
        this.mLayoutState.mLayoutDirection = i7;
        boolean zIsMainAxisDirectionHorizontal = isMainAxisDirectionHorizontal();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        boolean z3 = !zIsMainAxisDirectionHorizontal && this.mIsRtl;
        if (i7 == 1) {
            View childAt = getChildAt(getChildCount() - 1);
            this.mLayoutState.mOffset = this.mOrientationHelper.getDecoratedEnd(childAt);
            int position = getPosition(childAt);
            View viewFindLastReferenceViewInLine = findLastReferenceViewInLine(childAt, this.mFlexLines.get(this.mFlexboxHelper.mIndexToFlexLine[position]));
            this.mLayoutState.mItemDirection = 1;
            LayoutState layoutState = this.mLayoutState;
            layoutState.mPosition = position + layoutState.mItemDirection;
            if (this.mFlexboxHelper.mIndexToFlexLine.length <= this.mLayoutState.mPosition) {
                this.mLayoutState.mFlexLinePosition = -1;
            } else {
                LayoutState layoutState2 = this.mLayoutState;
                layoutState2.mFlexLinePosition = this.mFlexboxHelper.mIndexToFlexLine[layoutState2.mPosition];
            }
            if (z3) {
                this.mLayoutState.mOffset = this.mOrientationHelper.getDecoratedStart(viewFindLastReferenceViewInLine);
                this.mLayoutState.mScrollingOffset = this.mOrientationHelper.getStartAfterPadding() + (-this.mOrientationHelper.getDecoratedStart(viewFindLastReferenceViewInLine));
                LayoutState layoutState3 = this.mLayoutState;
                layoutState3.mScrollingOffset = layoutState3.mScrollingOffset >= 0 ? this.mLayoutState.mScrollingOffset : 0;
            } else {
                this.mLayoutState.mOffset = this.mOrientationHelper.getDecoratedEnd(viewFindLastReferenceViewInLine);
                this.mLayoutState.mScrollingOffset = this.mOrientationHelper.getDecoratedEnd(viewFindLastReferenceViewInLine) - this.mOrientationHelper.getEndAfterPadding();
            }
            if ((this.mLayoutState.mFlexLinePosition == -1 || this.mLayoutState.mFlexLinePosition > this.mFlexLines.size() - 1) && this.mLayoutState.mPosition <= getFlexItemCount()) {
                int i11 = i10 - this.mLayoutState.mScrollingOffset;
                this.mFlexLinesResult.reset();
                if (i11 > 0) {
                    if (zIsMainAxisDirectionHorizontal) {
                        this.mFlexboxHelper.calculateHorizontalFlexLines(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i11, this.mLayoutState.mPosition, this.mFlexLines);
                    } else {
                        this.mFlexboxHelper.calculateVerticalFlexLines(this.mFlexLinesResult, iMakeMeasureSpec, iMakeMeasureSpec2, i11, this.mLayoutState.mPosition, this.mFlexLines);
                    }
                    this.mFlexboxHelper.determineMainSize(iMakeMeasureSpec, iMakeMeasureSpec2, this.mLayoutState.mPosition);
                    this.mFlexboxHelper.stretchViews(this.mLayoutState.mPosition);
                }
            }
        } else {
            View childAt2 = getChildAt(0);
            this.mLayoutState.mOffset = this.mOrientationHelper.getDecoratedStart(childAt2);
            int position2 = getPosition(childAt2);
            View viewFindFirstReferenceViewInLine = findFirstReferenceViewInLine(childAt2, this.mFlexLines.get(this.mFlexboxHelper.mIndexToFlexLine[position2]));
            this.mLayoutState.mItemDirection = 1;
            int i12 = this.mFlexboxHelper.mIndexToFlexLine[position2];
            if (i12 == -1) {
                i12 = 0;
            }
            if (i12 > 0) {
                this.mLayoutState.mPosition = position2 - this.mFlexLines.get(i12 - 1).getItemCount();
            } else {
                this.mLayoutState.mPosition = -1;
            }
            this.mLayoutState.mFlexLinePosition = i12 > 0 ? i12 - 1 : 0;
            if (z3) {
                this.mLayoutState.mOffset = this.mOrientationHelper.getDecoratedEnd(viewFindFirstReferenceViewInLine);
                this.mLayoutState.mScrollingOffset = this.mOrientationHelper.getDecoratedEnd(viewFindFirstReferenceViewInLine) - this.mOrientationHelper.getEndAfterPadding();
                LayoutState layoutState4 = this.mLayoutState;
                layoutState4.mScrollingOffset = layoutState4.mScrollingOffset >= 0 ? this.mLayoutState.mScrollingOffset : 0;
            } else {
                this.mLayoutState.mOffset = this.mOrientationHelper.getDecoratedStart(viewFindFirstReferenceViewInLine);
                this.mLayoutState.mScrollingOffset = this.mOrientationHelper.getStartAfterPadding() + (-this.mOrientationHelper.getDecoratedStart(viewFindFirstReferenceViewInLine));
            }
        }
        LayoutState layoutState5 = this.mLayoutState;
        layoutState5.mAvailable = i10 - layoutState5.mScrollingOffset;
    }

    private void updateLayoutStateToFillEnd(AnchorInfo anchorInfo, boolean z3, boolean z8) {
        if (z8) {
            resolveInfiniteAmount();
        } else {
            this.mLayoutState.mInfinite = false;
        }
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            this.mLayoutState.mAvailable = this.mOrientationHelper.getEndAfterPadding() - anchorInfo.mCoordinate;
        } else {
            this.mLayoutState.mAvailable = anchorInfo.mCoordinate - getPaddingRight();
        }
        this.mLayoutState.mPosition = anchorInfo.mPosition;
        this.mLayoutState.mItemDirection = 1;
        this.mLayoutState.mLayoutDirection = 1;
        this.mLayoutState.mOffset = anchorInfo.mCoordinate;
        this.mLayoutState.mScrollingOffset = Integer.MIN_VALUE;
        this.mLayoutState.mFlexLinePosition = anchorInfo.mFlexLinePosition;
        if (!z3 || this.mFlexLines.size() <= 1 || anchorInfo.mFlexLinePosition < 0 || anchorInfo.mFlexLinePosition >= this.mFlexLines.size() - 1) {
            return;
        }
        FlexLine flexLine = this.mFlexLines.get(anchorInfo.mFlexLinePosition);
        LayoutState.access$1508(this.mLayoutState);
        LayoutState layoutState = this.mLayoutState;
        layoutState.mPosition = flexLine.getItemCount() + layoutState.mPosition;
    }

    private void updateLayoutStateToFillStart(AnchorInfo anchorInfo, boolean z3, boolean z8) {
        if (z8) {
            resolveInfiniteAmount();
        } else {
            this.mLayoutState.mInfinite = false;
        }
        if (isMainAxisDirectionHorizontal() || !this.mIsRtl) {
            this.mLayoutState.mAvailable = anchorInfo.mCoordinate - this.mOrientationHelper.getStartAfterPadding();
        } else {
            this.mLayoutState.mAvailable = (this.mParent.getWidth() - anchorInfo.mCoordinate) - this.mOrientationHelper.getStartAfterPadding();
        }
        this.mLayoutState.mPosition = anchorInfo.mPosition;
        this.mLayoutState.mItemDirection = 1;
        this.mLayoutState.mLayoutDirection = -1;
        this.mLayoutState.mOffset = anchorInfo.mCoordinate;
        this.mLayoutState.mScrollingOffset = Integer.MIN_VALUE;
        this.mLayoutState.mFlexLinePosition = anchorInfo.mFlexLinePosition;
        if (!z3 || anchorInfo.mFlexLinePosition <= 0 || this.mFlexLines.size() <= anchorInfo.mFlexLinePosition) {
            return;
        }
        FlexLine flexLine = this.mFlexLines.get(anchorInfo.mFlexLinePosition);
        LayoutState.access$1510(this.mLayoutState);
        this.mLayoutState.mPosition -= flexLine.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        if (this.mFlexWrap == 0) {
            return isMainAxisDirectionHorizontal();
        }
        if (!isMainAxisDirectionHorizontal()) {
            return true;
        }
        int width = getWidth();
        View view = this.mParent;
        return width > (view != null ? view.getWidth() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        if (this.mFlexWrap == 0) {
            return !isMainAxisDirectionHorizontal();
        }
        if (!isMainAxisDirectionHorizontal()) {
            int height = getHeight();
            View view = this.mParent;
            if (height <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i7) {
        if (getChildCount() == 0) {
            return null;
        }
        int i10 = i7 < getPosition(getChildAt(0)) ? -1 : 1;
        return isMainAxisDirectionHorizontal() ? new PointF(0.0f, i10) : new PointF(i10, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignItems() {
        return this.mAlignItems;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getChildHeightMeasureSpec(int i7, int i10, int i11) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), i10, i11, canScrollVertically());
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getChildWidthMeasureSpec(int i7, int i10, int i11) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), i10, i11, canScrollHorizontally());
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getDecorationLengthCrossAxis(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (isMainAxisDirectionHorizontal()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return rightDecorationWidth + leftDecorationWidth;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getDecorationLengthMainAxis(View view, int i7, int i10) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (isMainAxisDirectionHorizontal()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return bottomDecorationHeight + topDecorationHeight;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexDirection() {
        return this.mFlexDirection;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public View getFlexItemAt(int i7) {
        View view = this.mViewCache.get(i7);
        return view != null ? view : this.mRecycler.getViewForPosition(i7);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexItemCount() {
        return this.mState.getItemCount();
    }

    @Override // com.google.android.flexbox.FlexContainer
    public List<FlexLine> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.mFlexLines.size());
        int size = this.mFlexLines.size();
        for (int i7 = 0; i7 < size; i7++) {
            FlexLine flexLine = this.mFlexLines.get(i7);
            if (flexLine.getItemCount() != 0) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public List<FlexLine> getFlexLinesInternal() {
        return this.mFlexLines;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexWrap() {
        return this.mFlexWrap;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getJustifyContent() {
        return this.mJustifyContent;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getLargestMainSize() {
        if (this.mFlexLines.size() == 0) {
            return 0;
        }
        int size = this.mFlexLines.size();
        int iMax = Integer.MIN_VALUE;
        for (int i7 = 0; i7 < size; i7++) {
            iMax = Math.max(iMax, this.mFlexLines.get(i7).mMainSize);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getMaxLine() {
        return this.mMaxLine;
    }

    public int getPositionToFlexLineIndex(int i7) {
        return this.mFlexboxHelper.mIndexToFlexLine[i7];
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public View getReorderedFlexItemAt(int i7) {
        return getFlexItemAt(i7);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getSumOfCrossSize() {
        int size = this.mFlexLines.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i7 += this.mFlexLines.get(i10).mCrossSize;
        }
        return i7;
    }

    public boolean isLayoutRtl() {
        return this.mIsRtl;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public boolean isMainAxisDirectionHorizontal() {
        int i7 = this.mFlexDirection;
        return i7 == 0 || i7 == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.mParent = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i7, int i10) {
        super.onItemsAdded(recyclerView, i7, i10);
        updateDirtyPosition(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(@NonNull RecyclerView recyclerView, int i7, int i10, int i11) {
        super.onItemsMoved(recyclerView, i7, i10, i11);
        updateDirtyPosition(Math.min(i7, i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i7, int i10) {
        super.onItemsRemoved(recyclerView, i7, i10);
        updateDirtyPosition(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i7, int i10, Object obj) {
        super.onItemsUpdated(recyclerView, i7, i10, obj);
        updateDirtyPosition(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i7;
        int i10;
        this.mRecycler = recycler;
        this.mState = state;
        int itemCount = state.getItemCount();
        if (itemCount == 0 && state.isPreLayout()) {
            return;
        }
        resolveLayoutDirection();
        ensureOrientationHelper();
        ensureLayoutState();
        this.mFlexboxHelper.ensureMeasureSpecCache(itemCount);
        this.mFlexboxHelper.ensureMeasuredSizeCache(itemCount);
        this.mFlexboxHelper.ensureIndexToFlexLine(itemCount);
        this.mLayoutState.mShouldRecycle = false;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.hasValidAnchor(itemCount)) {
            this.mPendingScrollPosition = this.mPendingSavedState.mAnchorPosition;
        }
        if (!this.mAnchorInfo.mValid || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            this.mAnchorInfo.reset();
            updateAnchorInfoForLayout(state, this.mAnchorInfo);
            this.mAnchorInfo.mValid = true;
        }
        detachAndScrapAttachedViews(recycler);
        if (this.mAnchorInfo.mLayoutFromEnd) {
            updateLayoutStateToFillStart(this.mAnchorInfo, false, true);
        } else {
            updateLayoutStateToFillEnd(this.mAnchorInfo, false, true);
        }
        updateFlexLines(itemCount);
        if (this.mAnchorInfo.mLayoutFromEnd) {
            fill(recycler, state, this.mLayoutState);
            i10 = this.mLayoutState.mOffset;
            updateLayoutStateToFillEnd(this.mAnchorInfo, true, false);
            fill(recycler, state, this.mLayoutState);
            i7 = this.mLayoutState.mOffset;
        } else {
            fill(recycler, state, this.mLayoutState);
            i7 = this.mLayoutState.mOffset;
            updateLayoutStateToFillStart(this.mAnchorInfo, true, false);
            fill(recycler, state, this.mLayoutState);
            i10 = this.mLayoutState.mOffset;
        }
        if (getChildCount() > 0) {
            if (this.mAnchorInfo.mLayoutFromEnd) {
                fixLayoutStartGap(i10 + fixLayoutEndGap(i7, recycler, state, true), recycler, state, false);
            } else {
                fixLayoutEndGap(i7 + fixLayoutStartGap(i10, recycler, state, true), recycler, state, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mDirtyPosition = -1;
        this.mAnchorInfo.reset();
        this.mViewCache.clear();
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexItemAdded(View view, int i7, int i10, FlexLine flexLine) {
        calculateItemDecorationsForChild(view, TEMP_RECT);
        if (isMainAxisDirectionHorizontal()) {
            int rightDecorationWidth = getRightDecorationWidth(view) + getLeftDecorationWidth(view);
            flexLine.mMainSize += rightDecorationWidth;
            flexLine.mDividerLengthInMainSize += rightDecorationWidth;
            return;
        }
        int bottomDecorationHeight = getBottomDecorationHeight(view) + getTopDecorationHeight(view);
        flexLine.mMainSize += bottomDecorationHeight;
        flexLine.mDividerLengthInMainSize += bottomDecorationHeight;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexLineAdded(FlexLine flexLine) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.mPendingSavedState = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() <= 0) {
            savedState.invalidateAnchor();
            return savedState;
        }
        View childClosestToStart = getChildClosestToStart();
        savedState.mAnchorPosition = getPosition(childClosestToStart);
        savedState.mAnchorOffset = this.mOrientationHelper.getDecoratedStart(childClosestToStart) - this.mOrientationHelper.getStartAfterPadding();
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!isMainAxisDirectionHorizontal() || (this.mFlexWrap == 0 && isMainAxisDirectionHorizontal())) {
            int iHandleScrollingMainOrientation = handleScrollingMainOrientation(i7, recycler, state);
            this.mViewCache.clear();
            return iHandleScrollingMainOrientation;
        }
        int iHandleScrollingSubOrientation = handleScrollingSubOrientation(i7);
        this.mAnchorInfo.mPerpendicularCoordinate += iHandleScrollingSubOrientation;
        this.mSubOrientationHelper.offsetChildren(-iHandleScrollingSubOrientation);
        return iHandleScrollingSubOrientation;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i7) {
        this.mPendingScrollPosition = i7;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (isMainAxisDirectionHorizontal() || (this.mFlexWrap == 0 && !isMainAxisDirectionHorizontal())) {
            int iHandleScrollingMainOrientation = handleScrollingMainOrientation(i7, recycler, state);
            this.mViewCache.clear();
            return iHandleScrollingMainOrientation;
        }
        int iHandleScrollingSubOrientation = handleScrollingSubOrientation(i7);
        this.mAnchorInfo.mPerpendicularCoordinate += iHandleScrollingSubOrientation;
        this.mSubOrientationHelper.offsetChildren(-iHandleScrollingSubOrientation);
        return iHandleScrollingSubOrientation;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignContent(int i7) {
        throw new UnsupportedOperationException("Setting the alignContent in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to use this attribute.");
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignItems(int i7) {
        int i10 = this.mAlignItems;
        if (i10 != i7) {
            if (i10 == 4 || i7 == 4) {
                removeAllViews();
                clearFlexLines();
            }
            this.mAlignItems = i7;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexDirection(int i7) {
        if (this.mFlexDirection != i7) {
            removeAllViews();
            this.mFlexDirection = i7;
            this.mOrientationHelper = null;
            this.mSubOrientationHelper = null;
            clearFlexLines();
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexLines(List<FlexLine> list) {
        this.mFlexLines = list;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexWrap(int i7) {
        if (i7 == 2) {
            throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
        }
        int i10 = this.mFlexWrap;
        if (i10 != i7) {
            if (i10 == 0 || i7 == 0) {
                removeAllViews();
                clearFlexLines();
            }
            this.mFlexWrap = i7;
            this.mOrientationHelper = null;
            this.mSubOrientationHelper = null;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setJustifyContent(int i7) {
        if (this.mJustifyContent != i7) {
            this.mJustifyContent = i7;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setMaxLine(int i7) {
        if (this.mMaxLine != i7) {
            this.mMaxLine = i7;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z3) {
        this.mRecycleChildrenOnDetach = z3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i7) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i7);
        startSmoothScroll(linearSmoothScroller);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void updateViewCache(int i7, View view) {
        this.mViewCache.put(i7, view);
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.flexbox.FlexboxLayoutManager.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }
        };
        private int mAnchorOffset;
        private int mAnchorPosition;

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasValidAnchor(int i7) {
            int i10 = this.mAnchorPosition;
            return i10 >= 0 && i10 < i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void invalidateAnchor() {
            this.mAnchorPosition = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("SavedState{mAnchorPosition=");
            sb2.append(this.mAnchorPosition);
            sb2.append(", mAnchorOffset=");
            return q0.m(sb2, this.mAnchorOffset, '}');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mAnchorOffset);
        }

        public SavedState() {
        }

        private SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mAnchorOffset = parcel.readInt();
        }

        private SavedState(SavedState savedState) {
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mAnchorOffset = savedState.mAnchorOffset;
        }
    }

    public FlexboxLayoutManager(Context context, int i7) {
        this(context, i7, 1);
    }

    public FlexboxLayoutManager(Context context, int i7, int i10) {
        this.mMaxLine = -1;
        this.mFlexLines = new ArrayList();
        this.mFlexboxHelper = new FlexboxHelper(this);
        this.mAnchorInfo = new AnchorInfo();
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mLastWidth = Integer.MIN_VALUE;
        this.mLastHeight = Integer.MIN_VALUE;
        this.mViewCache = new SparseArray<>();
        this.mDirtyPosition = -1;
        this.mFlexLinesResult = new FlexboxHelper.FlexLinesResult();
        setFlexDirection(i7);
        setFlexWrap(i10);
        setAlignItems(4);
        setAutoMeasureEnabled(true);
        this.mContext = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i7, int i10) {
        super.onItemsUpdated(recyclerView, i7, i10);
        updateDirtyPosition(i7);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() { // from class: com.google.android.flexbox.FlexboxLayoutManager.LayoutParams.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LayoutParams[] newArray(int i7) {
                return new LayoutParams[i7];
            }
        };
        private int mAlignSelf;
        private float mFlexBasisPercent;
        private float mFlexGrow;
        private float mFlexShrink;
        private int mMaxHeight;
        private int mMaxWidth;
        private int mMinHeight;
        private int mMinWidth;
        private boolean mWrapBefore;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getAlignSelf() {
            return this.mAlignSelf;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexBasisPercent() {
            return this.mFlexBasisPercent;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexGrow() {
            return this.mFlexGrow;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexShrink() {
            return this.mFlexShrink;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginBottom() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginLeft() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginRight() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginTop() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxHeight() {
            return this.mMaxHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxWidth() {
            return this.mMaxWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinHeight() {
            return this.mMinHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinWidth() {
            return this.mMinWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean isWrapBefore() {
            return this.mWrapBefore;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setAlignSelf(int i7) {
            this.mAlignSelf = i7;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexBasisPercent(float f10) {
            this.mFlexBasisPercent = f10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexGrow(float f10) {
            this.mFlexGrow = f10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexShrink(float f10) {
            this.mFlexShrink = f10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setHeight(int i7) {
            ((ViewGroup.MarginLayoutParams) this).height = i7;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxHeight(int i7) {
            this.mMaxHeight = i7;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxWidth(int i7) {
            this.mMaxWidth = i7;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinHeight(int i7) {
            this.mMinHeight = i7;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinWidth(int i7) {
            this.mMinWidth = i7;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setOrder(int i7) {
            throw new UnsupportedOperationException("Setting the order in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to reorder using the attribute.");
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWidth(int i7) {
            ((ViewGroup.MarginLayoutParams) this).width = i7;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWrapBefore(boolean z3) {
            this.mWrapBefore = z3;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeFloat(this.mFlexGrow);
            parcel.writeFloat(this.mFlexShrink);
            parcel.writeInt(this.mAlignSelf);
            parcel.writeFloat(this.mFlexBasisPercent);
            parcel.writeInt(this.mMinWidth);
            parcel.writeInt(this.mMinHeight);
            parcel.writeInt(this.mMaxWidth);
            parcel.writeInt(this.mMaxHeight);
            parcel.writeByte(this.mWrapBefore ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(int i7, int i10) {
            super(i7, i10);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((RecyclerView.LayoutParams) layoutParams);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
            this.mFlexGrow = layoutParams.mFlexGrow;
            this.mFlexShrink = layoutParams.mFlexShrink;
            this.mAlignSelf = layoutParams.mAlignSelf;
            this.mFlexBasisPercent = layoutParams.mFlexBasisPercent;
            this.mMinWidth = layoutParams.mMinWidth;
            this.mMinHeight = layoutParams.mMinHeight;
            this.mMaxWidth = layoutParams.mMaxWidth;
            this.mMaxHeight = layoutParams.mMaxHeight;
            this.mWrapBefore = layoutParams.mWrapBefore;
        }

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
            this.mFlexGrow = parcel.readFloat();
            this.mFlexShrink = parcel.readFloat();
            this.mAlignSelf = parcel.readInt();
            this.mFlexBasisPercent = parcel.readFloat();
            this.mMinWidth = parcel.readInt();
            this.mMinHeight = parcel.readInt();
            this.mMaxWidth = parcel.readInt();
            this.mMaxHeight = parcel.readInt();
            this.mWrapBefore = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i7, int i10) {
        this.mMaxLine = -1;
        this.mFlexLines = new ArrayList();
        this.mFlexboxHelper = new FlexboxHelper(this);
        this.mAnchorInfo = new AnchorInfo();
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mLastWidth = Integer.MIN_VALUE;
        this.mLastHeight = Integer.MIN_VALUE;
        this.mViewCache = new SparseArray<>();
        this.mDirtyPosition = -1;
        this.mFlexLinesResult = new FlexboxHelper.FlexLinesResult();
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i7, i10);
        int i11 = properties.orientation;
        if (i11 != 0) {
            if (i11 == 1) {
                if (properties.reverseLayout) {
                    setFlexDirection(3);
                } else {
                    setFlexDirection(2);
                }
            }
        } else if (properties.reverseLayout) {
            setFlexDirection(1);
        } else {
            setFlexDirection(0);
        }
        setFlexWrap(1);
        setAlignItems(4);
        setAutoMeasureEnabled(true);
        this.mContext = context;
    }
}
