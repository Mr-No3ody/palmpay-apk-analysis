package com.shencoder.pagergridlayoutmanager;

import F7.d;
import F7.e;
import N8.q0;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p192n.c;

/* JADX INFO: loaded from: classes3.dex */
public class PagerGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public RecyclerView f25195B;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public PagerChangedListener f25197H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f25204a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25210g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25211i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25212j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public F7.a f25213k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f25214o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f25215p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25205b = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Rect f25217w = new Rect();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Rect f25194A = new Rect();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f25196C = false;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f25198L = 0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f25199M = 0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f25200Q = true;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final float f25201X = 100.0f;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f25202Y = 500;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final a f25203Z = new a();
    public final F7.b t = new F7.b();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final N2.b f25216v = new N2.b();

    public static class LayoutParams extends RecyclerView.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({c.f39802c})
    public @interface Orientation {
    }

    public interface PagerChangedListener {
        void onPagerCountChanged(@IntRange(from = 0) int i7);

        void onPagerIndexSelected(@IntRange(from = -1) int i7, @IntRange(from = -1) int i10);
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f25218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25220c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f25221d;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SavedState{mOrientation=");
            sb2.append(this.f25218a);
            sb2.append(", mRows=");
            sb2.append(this.f25219b);
            sb2.append(", mColumns=");
            sb2.append(this.f25220c);
            sb2.append(", mCurrentPagerIndex=");
            return q0.m(sb2, this.f25221d, '}');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f25218a);
            parcel.writeInt(this.f25219b);
            parcel.writeInt(this.f25220c);
            parcel.writeInt(this.f25221d);
        }
    }

    public PagerGridLayoutManager(int i7, int i10) {
        this.f25209f = 0;
        this.f25210g = -1;
        assertNotInLayoutOrScroll(null);
        if (this.f25206c != i7) {
            int iMax = Math.max(i7, 1);
            this.f25206c = iMax;
            this.f25209f = 0;
            this.f25210g = -1;
            this.f25208e = iMax * this.f25207d;
            requestLayout();
        }
        assertNotInLayoutOrScroll(null);
        if (this.f25207d != i10) {
            int iMax2 = Math.max(i10, 1);
            this.f25207d = iMax2;
            this.f25209f = 0;
            this.f25210g = -1;
            this.f25208e = this.f25206c * iMax2;
            requestLayout();
        }
        setOrientation(0);
        assertNotInLayoutOrScroll(null);
    }

    public final int a(int i7, boolean z3) {
        int paddingTop;
        int paddingBottom;
        if (!getClipToPadding()) {
            int i10 = this.f25208e;
            if (i7 % i10 == (z3 ? 0 : i10 - 1)) {
                if (this.f25205b == 0) {
                    paddingTop = getPaddingStart();
                    paddingBottom = getPaddingEnd();
                } else {
                    paddingTop = getPaddingTop();
                    paddingBottom = getPaddingBottom();
                }
                return paddingBottom + paddingTop;
            }
        }
        return 0;
    }

    public final int b(RecyclerView.Recycler recycler, RecyclerView.State state) {
        N2.b bVar;
        F7.b bVar2 = this.t;
        int i7 = bVar2.f2614a;
        int i10 = i7;
        while (true) {
            bVar = this.f25216v;
            if (i10 > 0) {
                int i11 = bVar2.f2616c;
                if (!(i11 >= 0 && i11 < state.getItemCount())) {
                    break;
                }
                if (this.f25196C) {
                    m(recycler, state, bVar2, bVar);
                } else {
                    i(recycler, state, bVar2, bVar);
                }
                int i12 = bVar2.f2614a;
                int i13 = bVar.f6069a;
                bVar2.f2614a = i12 - i13;
                i10 -= i13;
            } else {
                break;
            }
        }
        boolean z3 = bVar2.f2617d == 1;
        while (true) {
            int i14 = bVar2.f2616c;
            if (i14 < 0 || i14 >= state.getItemCount()) {
                break;
            }
            int i15 = bVar2.f2616c;
            if (z3 ? g(i15) : h(i15)) {
                break;
            }
            if (this.f25196C) {
                m(recycler, state, bVar2, bVar);
            } else {
                i(recycler, state, bVar2, bVar);
            }
        }
        j(recycler);
        return i7 - bVar2.f2614a;
    }

    public final int c(View view) {
        int decoratedBottom;
        int i7;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f25205b == 0) {
            decoratedBottom = getDecoratedRight(view);
            i7 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            decoratedBottom = getDecoratedBottom(view);
            i7 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return decoratedBottom + i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return this.f25205b == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return this.f25205b == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    public final int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0 || state.getItemCount() == 0) {
            return 0;
        }
        return e();
    }

    public final int computeScrollOffset(RecyclerView.State state) {
        View childAt;
        int i7;
        if (getChildCount() == 0 || state.getItemCount() == 0 || (childAt = getChildAt(0)) == null) {
            return 0;
        }
        int position = getPosition(childAt);
        float fE = e();
        int i10 = this.f25205b;
        float f10 = fE / (i10 == 0 ? this.f25207d : this.f25206c);
        if (i10 == 0) {
            int i11 = position / this.f25208e;
            int i12 = this.f25207d;
            i7 = (position % i12) + (i11 * i12);
        } else {
            i7 = position / this.f25207d;
        }
        if (p()) {
            return (computeScrollRange(state) - computeScrollExtent(state)) - Math.round((i7 * f10) + (c(childAt) - f()));
        }
        return Math.round((i7 * f10) + ((this.f25205b == 0 ? getPaddingStart() : getPaddingTop()) - d(childAt)));
    }

    public final int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0 || state.getItemCount() == 0) {
            return 0;
        }
        return e() * Math.max(this.f25209f, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public final PointF computeScrollVectorForPosition(int i7) {
        int position;
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        while (true) {
            childCount--;
            if (childCount < 0) {
                position = -1;
                break;
            }
            View childAt = getChildAt(childCount);
            if (childAt != null) {
                position = getPosition(childAt);
                if (position % this.f25208e == 0) {
                    break;
                }
            }
        }
        if (position == -1) {
            return null;
        }
        float f10 = i7 < position ? -1.0f : 1.0f;
        if (p()) {
            f10 = -f10;
        }
        return this.f25205b == 0 ? new PointF(f10, 0.0f) : new PointF(0.0f, f10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    public final int d(View view) {
        int decoratedTop;
        int i7;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f25205b == 0) {
            decoratedTop = getDecoratedLeft(view);
            i7 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        } else {
            decoratedTop = getDecoratedTop(view);
            i7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        }
        return decoratedTop - i7;
    }

    public final int e() {
        int height;
        int paddingBottom;
        if (this.f25205b == 0) {
            height = getWidth() - getPaddingStart();
            paddingBottom = getPaddingEnd();
        } else {
            height = getHeight() - getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public final int f() {
        int height;
        int paddingBottom;
        if (this.f25205b == 0) {
            height = getWidth();
            paddingBottom = getPaddingEnd();
        } else {
            height = getHeight();
            paddingBottom = getPaddingBottom();
        }
        return height - paddingBottom;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final View findViewByPosition(int i7) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i7 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i7) {
                return childAt;
            }
        }
        return super.findViewByPosition(i7);
    }

    public final boolean g(int i7) {
        if (this.f25205b == 0) {
            return (i7 % this.f25208e) / this.f25207d == 0;
        }
        return i7 % this.f25207d == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getHeight() {
        return super.getHeight() - Math.max(this.f25199M, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getWidth() {
        return super.getWidth() - Math.max(this.f25198L, 0);
    }

    public final boolean h(int i7) {
        if (this.f25205b == 0) {
            return (i7 % this.f25208e) / this.f25207d == this.f25206c - 1;
        }
        int i10 = this.f25207d;
        return i7 % i10 == i10 - 1;
    }

    public final void i(RecyclerView.Recycler recycler, RecyclerView.State state, F7.b bVar, N2.b bVar2) {
        int i7;
        int iA;
        int i10;
        int i11;
        int i12;
        int width;
        int paddingStart;
        int iA2;
        int i13;
        int iA3;
        int height;
        boolean z3 = bVar.f2617d == 1;
        int i14 = bVar.f2616c;
        View viewForPosition = recycler.getViewForPosition(i14);
        if (z3) {
            addView(viewForPosition);
        } else {
            addView(viewForPosition, 0);
        }
        bVar.f2616c = z3 ? F7.b.a(i14, this.f25205b, this.f25206c, this.f25207d, state) : F7.b.b(i14, this.f25205b, this.f25206c, this.f25207d);
        measureChildWithMargins(viewForPosition, this.f25214o, this.f25215p);
        boolean zG = z3 ? g(i14) : h(i14);
        if (zG) {
            i7 = this.f25205b == 0 ? this.f25211i : this.f25212j;
        } else {
            i7 = 0;
        }
        bVar2.f6069a = i7;
        int i15 = this.f25205b;
        Rect rect = bVar.f2618e;
        if (i15 == 0) {
            if (z3) {
                if (zG) {
                    paddingStart = a(i14, true) + rect.left + this.f25211i;
                    iA2 = getPaddingTop();
                } else {
                    paddingStart = rect.left;
                    iA2 = rect.bottom;
                }
                width = this.f25211i + paddingStart;
                i13 = this.f25212j;
                iA = i13 + iA2;
            } else {
                if (zG) {
                    iA3 = (rect.left - this.f25211i) - a(i14, false);
                    height = getHeight() - getPaddingBottom();
                } else {
                    iA3 = rect.left;
                    height = rect.top;
                }
                iA = height;
                paddingStart = iA3;
                iA2 = iA - this.f25212j;
                width = this.f25211i + paddingStart;
            }
            i12 = iA2;
            i10 = paddingStart;
            i11 = width;
        } else if (z3) {
            if (zG) {
                paddingStart = getPaddingStart();
                iA2 = a(i14, true) + rect.bottom;
            } else {
                paddingStart = rect.left + this.f25211i;
                iA2 = rect.top;
            }
            width = this.f25211i + paddingStart;
            i13 = this.f25212j;
            iA = i13 + iA2;
            i12 = iA2;
            i10 = paddingStart;
            i11 = width;
        } else if (zG) {
            width = getWidth() - getPaddingEnd();
            paddingStart = width - this.f25211i;
            iA = rect.top - a(i14, false);
            iA2 = iA - this.f25212j;
            i12 = iA2;
            i10 = paddingStart;
            i11 = width;
        } else {
            int i16 = rect.left;
            int i17 = this.f25211i;
            int i18 = i16 - i17;
            int i19 = rect.top;
            iA = this.f25212j + i19;
            i10 = i18;
            i11 = i17 + i18;
            i12 = i19;
        }
        int i20 = iA;
        rect.set(i10, i12, i11, i20);
        layoutDecoratedWithMargins(viewForPosition, i10, i12, i11, i20);
    }

    public final void j(RecyclerView.Recycler recycler) {
        F7.b bVar = this.t;
        if (bVar.f2615b) {
            if (p()) {
                if (bVar.f2617d == -1) {
                    l(recycler);
                    return;
                } else {
                    k(recycler);
                    return;
                }
            }
            if (bVar.f2617d == -1) {
                k(recycler);
            } else {
                l(recycler);
            }
        }
    }

    public final void k(RecyclerView.Recycler recycler) {
        int iF = getClipToPadding() ? f() : this.f25205b == 0 ? getWidth() : getHeight();
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt != null && d(childAt) > iF) {
                removeAndRecycleViewAt(childCount, recycler);
            }
        }
    }

    public final void l(RecyclerView.Recycler recycler) {
        int paddingStart = getClipToPadding() ? this.f25205b == 0 ? getPaddingStart() : getPaddingTop() : 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt != null && c(childAt) < paddingStart) {
                removeAndRecycleViewAt(childCount, recycler);
            }
        }
    }

    public final void m(RecyclerView.Recycler recycler, RecyclerView.State state, F7.b bVar, N2.b bVar2) {
        int i7;
        int paddingStart;
        int i10;
        int iA;
        int i11;
        int iA2;
        int width;
        boolean z3 = bVar.f2617d == 1;
        int i12 = bVar.f2616c;
        View viewForPosition = recycler.getViewForPosition(i12);
        if (z3) {
            addView(viewForPosition);
        } else {
            addView(viewForPosition, 0);
        }
        bVar.f2616c = z3 ? F7.b.a(i12, this.f25205b, this.f25206c, this.f25207d, state) : F7.b.b(i12, this.f25205b, this.f25206c, this.f25207d);
        measureChildWithMargins(viewForPosition, this.f25214o, this.f25215p);
        boolean zG = z3 ? g(i12) : h(i12);
        if (zG) {
            i7 = this.f25205b == 0 ? this.f25211i : this.f25212j;
        } else {
            i7 = 0;
        }
        bVar2.f6069a = i7;
        int i13 = this.f25205b;
        Rect rect = bVar.f2618e;
        if (i13 != 0) {
            if (z3) {
                if (zG) {
                    width = getWidth() - getPaddingEnd();
                    iA = a(i12, true) + rect.bottom;
                } else {
                    width = rect.left;
                    iA = rect.top;
                }
                i10 = width;
                paddingStart = i10 - this.f25211i;
                i11 = this.f25212j;
            } else if (zG) {
                paddingStart = getPaddingStart();
                i10 = paddingStart + this.f25211i;
                iA2 = rect.top - a(i12, false);
                iA = iA2 - this.f25212j;
            } else {
                paddingStart = rect.right;
                i10 = paddingStart + this.f25211i;
                iA = rect.top;
                i11 = this.f25212j;
            }
            iA2 = i11 + iA;
        } else if (z3) {
            if (zG) {
                paddingStart = (rect.left - this.f25211i) - a(i12, true);
                iA = getPaddingTop();
            } else {
                paddingStart = rect.left;
                iA = rect.bottom;
            }
            i10 = this.f25211i + paddingStart;
            i11 = this.f25212j;
            iA2 = i11 + iA;
        } else {
            if (zG) {
                int iA3 = a(i12, false) + rect.left + this.f25211i;
                iA2 = getHeight() - getPaddingBottom();
                paddingStart = iA3;
            } else {
                paddingStart = rect.left;
                iA2 = rect.top;
            }
            iA = iA2 - this.f25212j;
            i10 = this.f25211i + paddingStart;
        }
        int i14 = paddingStart;
        int i15 = iA;
        int i16 = i10;
        int i17 = iA2;
        rect.set(i14, i15, i16, i17);
        layoutDecoratedWithMargins(viewForPosition, i14, i15, i16, i17);
    }

    public final int n(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        View childAt;
        int i10;
        int paddingStart;
        int iC;
        int iF;
        int i11;
        if (getChildCount() != 0 && i7 != 0 && this.f25209f != 1) {
            F7.b bVar = this.t;
            bVar.f2615b = true;
            int i12 = -1;
            if (!p() ? i7 > 0 : i7 <= 0) {
                i12 = 1;
            }
            bVar.f2617d = i12;
            boolean z3 = i12 == 1;
            int iAbs = Math.abs(i7);
            if (z3) {
                childAt = getChildAt(getChildCount() - 1);
                if (p()) {
                    i10 = -d(childAt);
                    paddingStart = this.f25205b == 0 ? getPaddingStart() : getPaddingTop();
                    i11 = paddingStart + i10;
                } else {
                    iC = c(childAt);
                    iF = f();
                    i11 = iC - iF;
                }
            } else {
                childAt = getChildAt(0);
                if (p()) {
                    iC = c(childAt);
                    iF = f();
                    i11 = iC - iF;
                } else {
                    i10 = -d(childAt);
                    paddingStart = this.f25205b == 0 ? getPaddingStart() : getPaddingTop();
                    i11 = paddingStart + i10;
                }
            }
            getDecoratedBoundsWithMargins(childAt, bVar.f2618e);
            bVar.f2616c = z3 ? F7.b.a(getPosition(childAt), this.f25205b, this.f25206c, this.f25207d, state) : F7.b.b(getPosition(childAt), this.f25205b, this.f25206c, this.f25207d);
            bVar.f2614a = iAbs - i11;
            int iB = b(recycler, state) + i11;
            if (z3) {
                iB += bVar.f2620g;
            }
            if (iB >= 0) {
                if (iAbs > iB) {
                    i7 = i12 * iB;
                }
                int i13 = -i7;
                if (this.f25205b == 0) {
                    offsetChildrenHorizontal(i13);
                } else {
                    offsetChildrenVertical(i13);
                }
                bVar.f2619f = i7;
                j(recycler);
                return i7;
            }
        }
        return 0;
    }

    public final void o(int i7) {
        int i10 = this.f25210g;
        if (i10 == i7) {
            return;
        }
        this.f25210g = i7;
        PagerChangedListener pagerChangedListener = this.f25197H;
        if (pagerChangedListener != null) {
            pagerChangedListener.onPagerIndexSelected(i10, i7);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        recyclerView.setHasFixedSize(true);
        for (ViewParent parent = recyclerView.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                if (!this.f25200Q) {
                    break;
                }
                F7.a aVar = new F7.a(recyclerView, this);
                this.f25213k0 = aVar;
                recyclerView.addOnItemTouchListener(aVar);
                break;
            }
        }
        recyclerView.addOnChildAttachStateChangeListener(this.f25203Z);
        e eVar = new e();
        this.f25204a = eVar;
        eVar.attachToRecyclerView(recyclerView);
        this.f25195B = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        RecyclerView recyclerView2 = this.f25195B;
        if (recyclerView2 != null) {
            F7.a aVar = this.f25213k0;
            if (aVar != null) {
                recyclerView2.removeOnItemTouchListener(aVar);
            }
            this.f25195B.removeOnChildAttachStateChangeListener(this.f25203Z);
            this.f25195B = null;
        }
        this.f25204a.attachToRecyclerView(null);
        this.f25204a = null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f6  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int height;
        int width;
        int paddingTop;
        int i7;
        int paddingStart;
        int width2;
        int height2;
        int i10;
        int itemCount = getItemCount();
        if (itemCount == 0) {
            removeAndRecycleAllViews(recycler);
            if (this.f25209f != 0) {
                this.f25209f = 0;
                PagerChangedListener pagerChangedListener = this.f25197H;
                if (pagerChangedListener != null) {
                    pagerChangedListener.onPagerCountChanged(0);
                }
            }
            o(-1);
            return;
        }
        if (state.isPreLayout()) {
            return;
        }
        if (this.f25205b == 1 || getLayoutDirection() != 1) {
            this.f25196C = false;
        } else {
            this.f25196C = true;
        }
        boolean z3 = this.f25196C;
        Rect rect = this.f25194A;
        Rect rect2 = this.f25217w;
        if (z3) {
            rect2.set((getWidth() - getPaddingEnd()) - this.f25211i, getPaddingTop(), getWidth() - getPaddingEnd(), getPaddingTop() + this.f25212j);
            rect.set(getPaddingStart(), (getHeight() - getPaddingBottom()) - this.f25212j, getPaddingStart() + this.f25211i, getHeight() - getPaddingBottom());
        } else {
            rect2.set(getPaddingStart(), getPaddingTop(), getPaddingStart() + this.f25211i, getPaddingTop() + this.f25212j);
            rect.set((getWidth() - getPaddingEnd()) - this.f25211i, (getHeight() - getPaddingBottom()) - this.f25212j, getWidth() - getPaddingEnd(), getHeight() - getPaddingBottom());
        }
        int i11 = this.f25208e;
        int i12 = itemCount / i11;
        int i13 = itemCount % i11;
        if (i13 != 0) {
            i12++;
        }
        F7.b bVar = this.t;
        bVar.f2620g = 0;
        if (i12 > 1) {
            if (i13 != 0) {
                int i14 = this.f25207d;
                int i15 = i13 / i14;
                int i16 = i13 % i14;
                if (this.f25205b != 0) {
                    if (i16 > 0) {
                        i15++;
                    }
                    i10 = this.f25212j * (this.f25206c - i15);
                } else if (i15 == 0) {
                    i10 = (i14 - i16) * this.f25211i;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = 0;
            }
            bVar.f2620g = i10;
        }
        bVar.f2615b = false;
        bVar.f2617d = 1;
        bVar.f2614a = e();
        int i17 = this.f25210g;
        int iMin = i17 == -1 ? 0 : Math.min(i17, (getItemCount() - 1) / this.f25208e);
        RecyclerView recyclerView = this.f25195B;
        View childAt = (recyclerView == null || recyclerView.getScrollState() == 0 || getChildCount() == 0) ? null : getChildAt(0);
        boolean z8 = this.f25196C;
        Rect rect3 = bVar.f2618e;
        if (z8) {
            if (childAt == null) {
                int i18 = this.f25208e * iMin;
                bVar.f2616c = i18;
                int iA = a(i18, true);
                if (this.f25205b == 0) {
                    paddingTop = getHeight() - getPaddingBottom();
                    paddingStart = (getWidth() - getPaddingEnd()) + iA;
                } else {
                    paddingTop = getPaddingTop() - iA;
                    paddingStart = getPaddingStart();
                }
            } else {
                int position = getPosition(childAt);
                bVar.f2616c = position;
                int iA2 = a(position, true);
                getDecoratedBoundsWithMargins(childAt, rect3);
                if (this.f25205b == 0) {
                    if (g(position)) {
                        height2 = getHeight() - getPaddingBottom();
                        paddingStart = rect3.right + iA2;
                    } else {
                        height2 = rect3.top;
                        paddingStart = rect3.left;
                    }
                } else if (g(position)) {
                    height2 = rect3.top - iA2;
                    paddingStart = getPaddingStart();
                } else {
                    height2 = rect3.bottom;
                    paddingStart = rect3.right;
                }
                bVar.f2614a -= this.f25205b == 0 ? d(childAt) - f() : d(childAt);
                paddingTop = height2;
            }
            i7 = paddingTop - this.f25212j;
            width = this.f25211i + paddingStart;
        } else {
            if (childAt == null) {
                int i19 = this.f25208e * iMin;
                bVar.f2616c = i19;
                int iA3 = a(i19, true);
                if (this.f25205b == 0) {
                    paddingTop = getHeight() - getPaddingBottom();
                    width2 = getPaddingStart() - iA3;
                } else {
                    paddingTop = getPaddingTop() - iA3;
                    width2 = getWidth() - getPaddingEnd();
                }
                width = width2;
            } else {
                int position2 = getPosition(childAt);
                bVar.f2616c = position2;
                int iA4 = a(position2, true);
                getDecoratedBoundsWithMargins(childAt, rect3);
                if (this.f25205b == 0) {
                    if (g(position2)) {
                        height = getHeight() - getPaddingBottom();
                        width = rect3.left - iA4;
                    } else {
                        height = rect3.top;
                        width = rect3.right;
                    }
                } else if (g(position2)) {
                    height = rect3.top - iA4;
                    width = getWidth() - getPaddingEnd();
                } else {
                    height = rect3.bottom;
                    width = rect3.left;
                }
                bVar.f2614a -= d(childAt);
                paddingTop = height;
            }
            i7 = paddingTop - this.f25212j;
            paddingStart = width - this.f25211i;
        }
        rect3.set(paddingStart, i7, width, paddingTop);
        detachAndScrapAttachedViews(recycler);
        b(recycler, state);
        if (childAt == null) {
            if (this.f25209f != i12) {
                this.f25209f = i12;
                PagerChangedListener pagerChangedListener2 = this.f25197H;
                if (pagerChangedListener2 != null) {
                    pagerChangedListener2.onPagerCountChanged(i12);
                }
            }
            o(iMin);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(RecyclerView.State state) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int i7, int i10) {
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode != 1073741824 || mode2 != 1073741824) {
            throw new IllegalStateException("RecyclerView's width and height must be exactly");
        }
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingStart = (size - getPaddingStart()) - getPaddingEnd();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int i11 = this.f25207d;
        int i12 = i11 > 0 ? paddingStart / i11 : 0;
        this.f25211i = i12;
        int i13 = this.f25206c;
        int i14 = i13 > 0 ? paddingTop / i13 : 0;
        this.f25212j = i14;
        int i15 = paddingStart - (i11 * i12);
        this.f25198L = i15;
        int i16 = paddingTop - (i13 * i14);
        this.f25199M = i16;
        this.f25214o = (paddingStart - i15) - i12;
        this.f25215p = (paddingTop - i16) - i14;
        super.onMeasure(recycler, state, i7, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f25205b = savedState.f25218a;
            int i7 = savedState.f25219b;
            this.f25206c = i7;
            int i10 = savedState.f25220c;
            this.f25207d = i10;
            this.f25208e = i7 * i10;
            o(savedState.f25221d);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.f25218a = this.f25205b;
        savedState.f25219b = this.f25206c;
        savedState.f25220c = this.f25207d;
        savedState.f25221d = this.f25210g;
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onScrollStateChanged(int i7) {
    }

    public final boolean p() {
        return this.f25196C && this.f25205b == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f25205b == 1) {
            return 0;
        }
        return n(i7, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i7) {
        assertNotInLayoutOrScroll(null);
        int i10 = i7 / this.f25208e;
        assertNotInLayoutOrScroll(null);
        int iMin = Math.min(Math.max(i10, 0), (getItemCount() - 1) / this.f25208e);
        if (iMin == this.f25210g) {
            return;
        }
        o(iMin);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f25205b == 0) {
            return 0;
        }
        return n(i7, recycler, state);
    }

    public final void setOrientation(int i7) {
        assertNotInLayoutOrScroll(null);
        if (this.f25205b != 0) {
            this.f25205b = 0;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i7) {
        assertNotInLayoutOrScroll(null);
        int i10 = i7 / this.f25208e;
        assertNotInLayoutOrScroll(null);
        int iMin = Math.min(Math.max(i10, 0), (getItemCount() - 1) / this.f25208e);
        int i11 = this.f25210g;
        if (iMin == i11) {
            return;
        }
        boolean z3 = iMin > i11;
        if (Math.abs(iMin - i11) <= 3) {
            d dVar = new d(this.f25195B, this);
            int i12 = this.f25208e;
            int i13 = iMin * i12;
            if (!z3) {
                i13 = (i13 + i12) - 1;
            }
            dVar.setTargetPosition(i13);
            startSmoothScroll(dVar);
            return;
        }
        int i14 = iMin > i11 ? iMin - 3 : iMin + 3;
        assertNotInLayoutOrScroll(null);
        int iMin2 = Math.min(Math.max(i14, 0), (getItemCount() - 1) / this.f25208e);
        if (iMin2 != this.f25210g) {
            o(iMin2);
            requestLayout();
        }
        RecyclerView recyclerView2 = this.f25195B;
        if (recyclerView2 != null) {
            int i15 = this.f25208e;
            int i16 = iMin * i15;
            if (!z3) {
                i16 = (i16 + i15) - 1;
            }
            recyclerView2.post(new F7.c(i16, this, recyclerView2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof RecyclerView.LayoutParams) {
            return new LayoutParams((RecyclerView.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }
}
