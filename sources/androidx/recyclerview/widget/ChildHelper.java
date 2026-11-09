package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class ChildHelper {
    private static final boolean DEBUG = false;
    private static final int REMOVE_STATUS_IN_REMOVE = 1;
    private static final int REMOVE_STATUS_IN_REMOVE_IF_HIDDEN = 2;
    private static final int REMOVE_STATUS_NONE = 0;
    private static final String TAG = "ChildrenHelper";
    final Callback mCallback;
    private View mViewInRemoveView;
    private int mRemoveStatus = 0;
    final Bucket mBucket = new Bucket();
    final List<View> mHiddenViews = new ArrayList();

    public static class Bucket {
        static final int BITS_PER_WORD = 64;
        static final long LAST_BIT = Long.MIN_VALUE;
        long mData = 0;
        Bucket mNext;

        private void ensureNext() {
            if (this.mNext == null) {
                this.mNext = new Bucket();
            }
        }

        public void clear(int i7) {
            if (i7 < 64) {
                this.mData &= ~(1 << i7);
                return;
            }
            Bucket bucket = this.mNext;
            if (bucket != null) {
                bucket.clear(i7 - 64);
            }
        }

        public int countOnesBefore(int i7) {
            Bucket bucket = this.mNext;
            if (bucket == null) {
                return i7 >= 64 ? Long.bitCount(this.mData) : Long.bitCount(this.mData & ((1 << i7) - 1));
            }
            if (i7 < 64) {
                return Long.bitCount(this.mData & ((1 << i7) - 1));
            }
            return Long.bitCount(this.mData) + bucket.countOnesBefore(i7 - 64);
        }

        public boolean get(int i7) {
            if (i7 < 64) {
                return (this.mData & (1 << i7)) != 0;
            }
            ensureNext();
            return this.mNext.get(i7 - 64);
        }

        public void insert(int i7, boolean z3) {
            if (i7 >= 64) {
                ensureNext();
                this.mNext.insert(i7 - 64, z3);
                return;
            }
            long j6 = this.mData;
            boolean z8 = (Long.MIN_VALUE & j6) != 0;
            long j10 = (1 << i7) - 1;
            this.mData = ((j6 & (~j10)) << 1) | (j6 & j10);
            if (z3) {
                set(i7);
            } else {
                clear(i7);
            }
            if (z8 || this.mNext != null) {
                ensureNext();
                this.mNext.insert(0, z8);
            }
        }

        public boolean remove(int i7) {
            if (i7 >= 64) {
                ensureNext();
                return this.mNext.remove(i7 - 64);
            }
            long j6 = 1 << i7;
            long j10 = this.mData;
            boolean z3 = (j10 & j6) != 0;
            long j11 = j10 & (~j6);
            this.mData = j11;
            long j12 = j6 - 1;
            this.mData = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
            Bucket bucket = this.mNext;
            if (bucket != null) {
                if (bucket.get(0)) {
                    set(63);
                }
                this.mNext.remove(0);
            }
            return z3;
        }

        public void reset() {
            this.mData = 0L;
            Bucket bucket = this.mNext;
            if (bucket != null) {
                bucket.reset();
            }
        }

        public void set(int i7) {
            if (i7 < 64) {
                this.mData |= 1 << i7;
            } else {
                ensureNext();
                this.mNext.set(i7 - 64);
            }
        }

        public String toString() {
            if (this.mNext == null) {
                return Long.toBinaryString(this.mData);
            }
            return this.mNext.toString() + "xx" + Long.toBinaryString(this.mData);
        }
    }

    public interface Callback {
        void addView(View view, int i7);

        void attachViewToParent(View view, int i7, ViewGroup.LayoutParams layoutParams);

        void detachViewFromParent(int i7);

        View getChildAt(int i7);

        int getChildCount();

        RecyclerView.ViewHolder getChildViewHolder(View view);

        int indexOfChild(View view);

        void onEnteredHiddenState(View view);

        void onLeftHiddenState(View view);

        void removeAllViews();

        void removeViewAt(int i7);
    }

    public ChildHelper(Callback callback) {
        this.mCallback = callback;
    }

    private int getOffset(int i7) {
        if (i7 < 0) {
            return -1;
        }
        int childCount = this.mCallback.getChildCount();
        int i10 = i7;
        while (i10 < childCount) {
            int iCountOnesBefore = i7 - (i10 - this.mBucket.countOnesBefore(i10));
            if (iCountOnesBefore == 0) {
                while (this.mBucket.get(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += iCountOnesBefore;
        }
        return -1;
    }

    private void hideViewInternal(View view) {
        this.mHiddenViews.add(view);
        this.mCallback.onEnteredHiddenState(view);
    }

    private boolean unhideViewInternal(View view) {
        if (!this.mHiddenViews.remove(view)) {
            return false;
        }
        this.mCallback.onLeftHiddenState(view);
        return true;
    }

    public void addView(View view, boolean z3) {
        addView(view, -1, z3);
    }

    public void attachViewToParent(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z3) {
        int childCount = i7 < 0 ? this.mCallback.getChildCount() : getOffset(i7);
        this.mBucket.insert(childCount, z3);
        if (z3) {
            hideViewInternal(view);
        }
        this.mCallback.attachViewToParent(view, childCount, layoutParams);
    }

    public void detachViewFromParent(int i7) {
        int offset = getOffset(i7);
        this.mBucket.remove(offset);
        this.mCallback.detachViewFromParent(offset);
    }

    public View findHiddenNonRemovedView(int i7) {
        int size = this.mHiddenViews.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = this.mHiddenViews.get(i10);
            RecyclerView.ViewHolder childViewHolder = this.mCallback.getChildViewHolder(view);
            if (childViewHolder.getLayoutPosition() == i7 && !childViewHolder.isInvalid() && !childViewHolder.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    public View getChildAt(int i7) {
        return this.mCallback.getChildAt(getOffset(i7));
    }

    public int getChildCount() {
        return this.mCallback.getChildCount() - this.mHiddenViews.size();
    }

    public View getUnfilteredChildAt(int i7) {
        return this.mCallback.getChildAt(i7);
    }

    public int getUnfilteredChildCount() {
        return this.mCallback.getChildCount();
    }

    public void hide(View view) {
        int iIndexOfChild = this.mCallback.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.mBucket.set(iIndexOfChild);
            hideViewInternal(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public int indexOfChild(View view) {
        int iIndexOfChild = this.mCallback.indexOfChild(view);
        if (iIndexOfChild == -1 || this.mBucket.get(iIndexOfChild)) {
            return -1;
        }
        return iIndexOfChild - this.mBucket.countOnesBefore(iIndexOfChild);
    }

    public boolean isHidden(View view) {
        return this.mHiddenViews.contains(view);
    }

    public void removeAllViewsUnfiltered() {
        this.mBucket.reset();
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            this.mCallback.onLeftHiddenState(this.mHiddenViews.get(size));
            this.mHiddenViews.remove(size);
        }
        this.mCallback.removeAllViews();
    }

    public void removeView(View view) {
        int i7 = this.mRemoveStatus;
        if (i7 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i7 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.mRemoveStatus = 1;
            this.mViewInRemoveView = view;
            int iIndexOfChild = this.mCallback.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (this.mBucket.remove(iIndexOfChild)) {
                    unhideViewInternal(view);
                }
                this.mCallback.removeViewAt(iIndexOfChild);
            }
        } finally {
            this.mRemoveStatus = 0;
            this.mViewInRemoveView = null;
        }
    }

    public void removeViewAt(int i7) {
        int i10 = this.mRemoveStatus;
        if (i10 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int offset = getOffset(i7);
            View childAt = this.mCallback.getChildAt(offset);
            if (childAt != null) {
                this.mRemoveStatus = 1;
                this.mViewInRemoveView = childAt;
                if (this.mBucket.remove(offset)) {
                    unhideViewInternal(childAt);
                }
                this.mCallback.removeViewAt(offset);
            }
        } finally {
            this.mRemoveStatus = 0;
            this.mViewInRemoveView = null;
        }
    }

    public boolean removeViewIfHidden(View view) {
        int i7 = this.mRemoveStatus;
        if (i7 == 1) {
            if (this.mViewInRemoveView == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i7 == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.mRemoveStatus = 2;
            int iIndexOfChild = this.mCallback.indexOfChild(view);
            if (iIndexOfChild == -1) {
                unhideViewInternal(view);
                return true;
            }
            if (!this.mBucket.get(iIndexOfChild)) {
                return false;
            }
            this.mBucket.remove(iIndexOfChild);
            unhideViewInternal(view);
            this.mCallback.removeViewAt(iIndexOfChild);
            return true;
        } finally {
            this.mRemoveStatus = 0;
        }
    }

    public String toString() {
        return this.mBucket.toString() + ", hidden list:" + this.mHiddenViews.size();
    }

    public void unhide(View view) {
        int iIndexOfChild = this.mCallback.indexOfChild(view);
        if (iIndexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.mBucket.get(iIndexOfChild)) {
            this.mBucket.clear(iIndexOfChild);
            unhideViewInternal(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public void addView(View view, int i7, boolean z3) {
        int childCount = i7 < 0 ? this.mCallback.getChildCount() : getOffset(i7);
        this.mBucket.insert(childCount, z3);
        if (z3) {
            hideViewInternal(view);
        }
        this.mCallback.addView(view, childCount);
    }
}
