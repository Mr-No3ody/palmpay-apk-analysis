package androidx.core.widget;

import C0.G;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.C1056h;
import androidx.core.view.C1066s;
import androidx.core.view.N;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.ScrollingView;
import androidx.core.view.r;
import com.microsoft.codepush.react.CodePushConstants;
import java.util.ArrayList;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements NestedScrollingParent3, NestedScrollingChild3, ScrollingView {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final float f16308v0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final f f16309w0 = new f();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int[] f16310x0 = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f16311A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f16312B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f16313C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f16314H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int[] f16315L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int[] f16316M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f16317Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f16320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OverScroller f16321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EdgeEffect f16322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EdgeEffect f16323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16324g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16325i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f16326j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f16327k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f16328o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f16329p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public SavedState f16330p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final C1066s f16331q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final r f16332r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f16333s0;
    public VelocityTracker t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public OnScrollChangeListener f16334t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final C1056h f16335u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16336v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f16337w;

    public interface OnScrollChangeListener {
        void onScrollChange(@NonNull NestedScrollView nestedScrollView, int i7, int i10, int i11, int i12);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new h();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16338a;

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" scrollPosition=");
            return G.n(this.f16338a, "}", sb2);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f16338a);
        }
    }

    public NestedScrollView(@NonNull Context context) {
        this(context, null);
    }

    public static boolean f(NestedScrollView nestedScrollView, View view) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && f(nestedScrollView, (View) parent);
    }

    public final boolean a(int i7) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i7);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !g(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i7 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i7 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i7 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f16320c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m(b(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i7);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !g(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i10 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i7 - verticalFadingEdgeLength : i7;
        int i11 = rect.bottom;
        if (i11 > i10 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i10, (childAt.getBottom() + layoutParams.bottomMargin) - i7);
        }
        if (rect.top >= scrollY || i11 >= i10) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i10 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public final boolean c(KeyEvent keyEvent) {
        this.f16320c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? e(33) : a(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? e(130) : a(130);
                    }
                    if (keyCode == 62) {
                        k(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return e(33);
                    }
                    if (keyCode == 93) {
                        return e(130);
                    }
                    if (keyCode == 122) {
                        k(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        k(130);
                        return false;
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0081  */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00da  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f8  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i7;
        int scrollRange;
        int overScrollMode;
        if (this.f16321d.isFinished()) {
            return;
        }
        this.f16321d.computeScrollOffset();
        int currY = this.f16321d.getCurrY();
        int i10 = currY - this.f16327k0;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f16323f;
        EdgeEffect edgeEffect2 = this.f16322e;
        if (i10 <= 0 || p264r5.a.p(edgeEffect2) == 0.0f) {
            if (i10 < 0 && p264r5.a.p(edgeEffect) != 0.0f) {
                float f10 = height;
                iRound = Math.round(p264r5.a.C(edgeEffect, (i10 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
                if (iRound != i10) {
                    edgeEffect.finish();
                }
            }
            this.f16327k0 = currY;
            iArr = this.f16316M;
            iArr[1] = 0;
            dispatchNestedPreScroll(0, i10, iArr, null, 1);
            i7 = i10 - iArr[1];
            scrollRange = getScrollRange();
            if (androidx.core.os.b.c()) {
                g.a(this, Math.abs(this.f16321d.getCurrVelocity()));
            }
            if (i7 != 0) {
                int scrollY = getScrollY();
                j(i7, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i11 = i7 - scrollY2;
                iArr[1] = 0;
                dispatchNestedScroll(0, scrollY2, 0, i11, this.f16315L, 1, iArr);
                i7 = i11 - iArr[1];
            }
            if (i7 != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i7 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f16321d.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f16321d.getCurrVelocity());
                    }
                }
                this.f16321d.abortAnimation();
                stopNestedScroll(1);
            }
            if (this.f16321d.isFinished()) {
                stopNestedScroll(1);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(p264r5.a.C(edgeEffect2, ((-i10) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i10) {
            edgeEffect2.finish();
        }
        i10 -= iRound;
        this.f16327k0 = currY;
        iArr = this.f16316M;
        iArr[1] = 0;
        dispatchNestedPreScroll(0, i10, iArr, null, 1);
        i7 = i10 - iArr[1];
        scrollRange = getScrollRange();
        if (androidx.core.os.b.c()) {
            g.a(this, Math.abs(this.f16321d.getCurrVelocity()));
        }
        if (i7 != 0) {
            int scrollY3 = getScrollY();
            j(i7, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i12 = i7 - scrollY4;
            iArr[1] = 0;
            dispatchNestedScroll(0, scrollY4, 0, i12, this.f16315L, 1, iArr);
            i7 = i12 - iArr[1];
        }
        if (i7 != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i7 < 0) {
                    if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f16321d.getCurrVelocity());
                    }
                } else if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f16321d.getCurrVelocity());
                }
            } else if (i7 < 0) {
                if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f16321d.getCurrVelocity());
                }
            } else if (edgeEffect.isFinished()) {
                edgeEffect.onAbsorb((int) this.f16321d.getCurrVelocity());
            }
            this.f16321d.abortAnimation();
            stopNestedScroll(1);
        }
        if (this.f16321d.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            stopNestedScroll(1);
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    public void d(int i7) {
        if (getChildCount() > 0) {
            this.f16321d.fling(getScrollX(), getScrollY(), 0, i7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            startNestedScroll(2, 1);
            this.f16327k0 = getScrollY();
            postInvalidateOnAnimation();
            if (androidx.core.os.b.c()) {
                g.a(this, Math.abs(this.f16321d.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || c(keyEvent);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedFling(float f10, float f11, boolean z3) {
        return this.f16332r0.a(f10, f11, z3);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f16332r0.b(f10, f11);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedPreScroll(int i7, int i10, int[] iArr, int[] iArr2) {
        return this.f16332r0.c(i7, i10, iArr, iArr2, 0);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedScroll(int i7, int i10, int i11, int i12, int[] iArr) {
        return this.f16332r0.d(i7, i10, i11, i12, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f16322e;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f16323f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    public final boolean e(int i7) {
        int childCount;
        boolean z3 = i7 == 130;
        int height = getHeight();
        Rect rect = this.f16320c;
        rect.top = 0;
        rect.bottom = height;
        if (z3 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return l(i7, rect.top, rect.bottom);
    }

    public final boolean g(View view, int i7, int i10) {
        Rect rect = this.f16320c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i7 >= getScrollY() && rect.top - i7 <= getScrollY() + i10;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f16331q0.a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @VisibleForTesting
    public float getVerticalScrollFactorCompat() {
        if (this.f16333s0 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f16333s0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f16333s0;
    }

    public final void h(int i7, int i10, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i7);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f16332r0.d(0, scrollY2, 0, i7 - scrollY2, null, i10, iArr);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean hasNestedScrollingParent() {
        return this.f16332r0.f(0);
    }

    public final void i(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f16314H) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f16324g = (int) motionEvent.getY(i7);
            this.f16314H = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean isNestedScrollingEnabled() {
        return this.f16332r0.f16281d;
    }

    public final boolean j(int i7, int i10, int i11, int i12) {
        int i13;
        boolean z3;
        int i14;
        boolean z8;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i15 = i11 + i7;
        if (i10 <= 0 && i10 >= 0) {
            i13 = i10;
            z3 = false;
        } else {
            i13 = 0;
            z3 = true;
        }
        if (i15 <= i12) {
            if (i15 < 0) {
                i14 = 0;
            } else {
                i14 = i15;
                z8 = false;
            }
            if (z8 && !this.f16332r0.f(1)) {
                this.f16321d.springBack(i13, i14, 0, 0, 0, getScrollRange());
            }
            onOverScrolled(i13, i14, z3, z8);
            return !z3 || z8;
        }
        i14 = i12;
        z8 = true;
        if (z8) {
            this.f16321d.springBack(i13, i14, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i13, i14, z3, z8);
        if (z3) {
        }
    }

    public final boolean k(int i7) {
        boolean z3 = i7 == 130;
        int height = getHeight();
        Rect rect = this.f16320c;
        if (z3) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            rect.top = getScrollY() - height;
            if (rect.top < 0) {
                rect.top = 0;
            }
        }
        int i10 = rect.top;
        int i11 = height + i10;
        rect.bottom = i11;
        return l(i7, i10, i11);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean l(int i7, int i10, int i11) {
        boolean z3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i12 = height + scrollY;
        boolean z8 = i7 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z10 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = focusables.get(i13);
            int top2 = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top2 < i11) {
                boolean z11 = i10 < top2 && bottom < i11;
                if (view == null) {
                    view = view2;
                    z10 = z11;
                } else {
                    boolean z12 = (z8 && top2 < view.getTop()) || (!z8 && bottom > view.getBottom());
                    if (z10) {
                        if (z11 && z12) {
                            view = view2;
                        }
                    } else if (z11) {
                        view = view2;
                        z10 = true;
                    } else if (z12) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i10 < scrollY || i11 > i12) {
            m(z8 ? i10 - scrollY : i11 - i12, 0, 1, true);
            z3 = true;
        } else {
            z3 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i7);
        }
        return z3;
    }

    public final int m(int i7, int i10, int i11, boolean z3) {
        int i12;
        int i13;
        VelocityTracker velocityTracker;
        if (i11 == 1) {
            startNestedScroll(2, i11);
        }
        boolean zC = this.f16332r0.c(0, i7, this.f16316M, this.f16315L, i11);
        boolean z8 = false;
        int[] iArr = this.f16316M;
        int[] iArr2 = this.f16315L;
        if (zC) {
            i12 = i7 - iArr[1];
            i13 = iArr2[1];
        } else {
            i12 = i7;
            i13 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z10 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z3;
        boolean z11 = j(i12, 0, scrollY, scrollRange) && !this.f16332r0.f(i11);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        dispatchNestedScroll(0, scrollY2, 0, i12 - scrollY2, this.f16315L, i11, iArr);
        int i14 = i13 + iArr2[1];
        int i15 = i12 - iArr[1];
        int i16 = scrollY + i15;
        EdgeEffect edgeEffect = this.f16323f;
        EdgeEffect edgeEffect2 = this.f16322e;
        if (i16 < 0) {
            if (z10) {
                p264r5.a.C(edgeEffect2, (-i15) / getHeight(), i10 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i16 > scrollRange && z10) {
            p264r5.a.C(edgeEffect, i15 / getHeight(), 1.0f - (i10 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z8 = z11;
        } else {
            postInvalidateOnAnimation();
        }
        if (z8 && i11 == 0 && (velocityTracker = this.t) != null) {
            velocityTracker.clear();
        }
        if (i11 == 1) {
            stopNestedScroll(i11);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i14;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i7, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(EdgeEffect edgeEffect, int i7) {
        if (i7 > 0) {
            return true;
        }
        float fP = p264r5.a.p(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i7) * 0.35f;
        float f10 = this.f16318a * 0.015f;
        double dLog = Math.log(fAbs / f10);
        double d2 = f16308v0;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * dLog) * ((double) f10))) < fP;
    }

    public final void o(int i7, int i10, boolean z3) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f16319b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f16321d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i10 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z3) {
                startNestedScroll(2, 1);
            } else {
                stopNestedScroll(1);
            }
            this.f16327k0 = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f16321d.isFinished()) {
                this.f16321d.abortAnimation();
                stopNestedScroll(1);
            }
            scrollBy(i7, i10);
        }
        this.f16319b = AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16326j = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i7;
        int width;
        float axisValue;
        boolean z3;
        if (motionEvent.getAction() == 8 && !this.f16329p) {
            if ((motionEvent.getSource() & 2) == 2) {
                i7 = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if ((motionEvent.getSource() & 4194304) == 4194304) {
                i7 = 26;
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                axisValue = axisValue2;
            } else {
                i7 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                m(-((int) (getVerticalScrollFactorCompat() * axisValue)), width, 1, (motionEvent.getSource() & 8194) == 8194);
                if (i7 != 0) {
                    C1056h c1056h = this.f16335u0;
                    c1056h.getClass();
                    int source = motionEvent.getSource();
                    int deviceId = motionEvent.getDeviceId();
                    int i10 = c1056h.f16232h;
                    int[] iArr = c1056h.f16234j;
                    if (i10 == source && c1056h.f16233i == deviceId && c1056h.f16231g == i7) {
                        z3 = false;
                    } else {
                        c1056h.f16227c.calculateFlingVelocityThresholds(c1056h.f16225a, iArr, motionEvent, i7);
                        c1056h.f16232h = source;
                        c1056h.f16233i = deviceId;
                        c1056h.f16231g = i7;
                        z3 = true;
                    }
                    if (iArr[0] == Integer.MAX_VALUE) {
                        VelocityTracker velocityTracker = c1056h.f16229e;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            c1056h.f16229e = null;
                            return true;
                        }
                    } else {
                        if (c1056h.f16229e == null) {
                            c1056h.f16229e = VelocityTracker.obtain();
                        }
                        float currentVelocity = c1056h.f16228d.getCurrentVelocity(c1056h.f16229e, motionEvent, i7);
                        C2085k0 c2085k0 = c1056h.f16226b;
                        float scaledScrollFactor = c2085k0.getScaledScrollFactor() * currentVelocity;
                        float fSignum = Math.signum(scaledScrollFactor);
                        if (z3 || (fSignum != Math.signum(c1056h.f16230f) && fSignum != 0.0f)) {
                            c2085k0.stopDifferentialMotionFling();
                        }
                        if (Math.abs(scaledScrollFactor) >= iArr[0]) {
                            int i11 = iArr[1];
                            float fMax = Math.max(-i11, Math.min(scaledScrollFactor, i11));
                            c1056h.f16230f = c2085k0.startDifferentialMotionFling(fMax) ? fMax : 0.0f;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX WARN: Code duplicated, block: B:70:0x012d  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action == 2 && this.f16329p) {
            return true;
        }
        int i7 = action & 255;
        if (i7 == 0) {
            int y8 = (int) motionEvent.getY();
            int x3 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y8 < childAt.getTop() - scrollY || y8 >= childAt.getBottom() - scrollY || x3 < childAt.getLeft() || x3 >= childAt.getRight()) {
                    if (!q(motionEvent) && this.f16321d.isFinished()) {
                        z3 = false;
                    }
                    this.f16329p = z3;
                    velocityTracker = this.t;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.t = null;
                    }
                } else {
                    this.f16324g = y8;
                    this.f16314H = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.t;
                    if (velocityTracker3 == null) {
                        this.t = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.t.addMovement(motionEvent);
                    this.f16321d.computeScrollOffset();
                    if (!q(motionEvent) && this.f16321d.isFinished()) {
                        z3 = false;
                    }
                    this.f16329p = z3;
                    startNestedScroll(2, 0);
                }
            } else {
                if (!q(motionEvent)) {
                    z3 = false;
                }
                this.f16329p = z3;
                velocityTracker = this.t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.t = null;
                }
            }
        } else if (i7 == 1) {
            this.f16329p = false;
            this.f16314H = -1;
            velocityTracker2 = this.t;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.t = null;
            }
            if (this.f16321d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            stopNestedScroll(0);
        } else if (i7 == 2) {
            int i10 = this.f16314H;
            if (i10 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i10 + " in onInterceptTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y10 - this.f16324g) > this.f16311A && (2 & getNestedScrollAxes()) == 0) {
                        this.f16329p = true;
                        this.f16324g = y10;
                        if (this.t == null) {
                            this.t = VelocityTracker.obtain();
                        }
                        this.t.addMovement(motionEvent);
                        this.f16317Q = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i7 == 3) {
            this.f16329p = false;
            this.f16314H = -1;
            velocityTracker2 = this.t;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.t = null;
            }
            if (this.f16321d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            stopNestedScroll(0);
        } else if (i7 == 6) {
            i(motionEvent);
        }
        return this.f16329p;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        int measuredHeight;
        super.onLayout(z3, i7, i10, i11, i12);
        int i13 = 0;
        this.f16325i = false;
        View view = this.f16328o;
        if (view != null && f(this, view)) {
            View view2 = this.f16328o;
            Rect rect = this.f16320c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iB = b(rect);
            if (iB != 0) {
                scrollBy(0, iB);
            }
        }
        this.f16328o = null;
        if (!this.f16326j) {
            if (this.f16330p0 != null) {
                scrollTo(getScrollX(), this.f16330p0.f16338a);
                this.f16330p0 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i13 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i13 != scrollY) {
                scrollTo(getScrollX(), i13);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f16326j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.f16336v && View.MeasureSpec.getMode(i10) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z3) {
        if (z3) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        d((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return this.f16332r0.b(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        dispatchNestedPreScroll(i7, i10, iArr, null, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        h(i12, i13, iArr);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScrollAccepted(View view, View view2, int i7, int i10) {
        C1066s c1066s = this.f16331q0;
        if (i10 == 1) {
            c1066s.f16286b = i7;
        } else {
            c1066s.f16285a = i7;
        }
        startNestedScroll(2, i10);
    }

    @Override // android.view.View
    public void onOverScrolled(int i7, int i10, boolean z3, boolean z8) {
        super.scrollTo(i7, i10);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (i7 == 2) {
            i7 = 130;
        } else if (i7 == 1) {
            i7 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i7) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i7);
        if (viewFindNextFocus != null && g(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i7, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f16330p0 = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f16338a = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        OnScrollChangeListener onScrollChangeListener = this.f16334t0;
        if (onScrollChangeListener != null) {
            onScrollChangeListener.onScrollChange(this, i7, i10, i11, i12);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !g(viewFindFocus, 0, i12)) {
            return;
        }
        Rect rect = this.f16320c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iB = b(rect);
        if (iB != 0) {
            if (this.f16337w) {
                o(0, iB, false);
            } else {
                scrollBy(0, iB);
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean onStartNestedScroll(View view, View view2, int i7, int i10) {
        return (i7 & 2) != 0;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onStopNestedScroll(View view, int i7) {
        C1066s c1066s = this.f16331q0;
        if (i7 == 1) {
            c1066s.f16286b = 0;
        } else {
            c1066s.f16285a = 0;
        }
        stopNestedScroll(i7);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.t == null) {
            this.t = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f16317Q = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f10 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f16317Q);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f16323f;
            EdgeEffect edgeEffect2 = this.f16322e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.t;
                velocityTracker.computeCurrentVelocity(1000, this.f16313C);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f16314H);
                if (Math.abs(yVelocity) >= this.f16312B) {
                    if (p264r5.a.p(edgeEffect2) != 0.0f) {
                        if (n(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            d(-yVelocity);
                        }
                    } else if (p264r5.a.p(edgeEffect) != 0.0f) {
                        int i7 = -yVelocity;
                        if (n(edgeEffect, i7)) {
                            edgeEffect.onAbsorb(i7);
                        } else {
                            d(i7);
                        }
                    } else {
                        int i10 = -yVelocity;
                        float f11 = i10;
                        if (!this.f16332r0.b(0.0f, f11)) {
                            dispatchNestedFling(0.0f, f11, true);
                            d(i10);
                        }
                    }
                } else if (this.f16321d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f16314H = -1;
                this.f16329p = false;
                VelocityTracker velocityTracker2 = this.t;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.t = null;
                }
                stopNestedScroll(0);
                this.f16322e.onRelease();
                this.f16323f.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f16314H);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f16314H + " in onTouchEvent");
                } else {
                    int y8 = (int) motionEvent.getY(iFindPointerIndex);
                    int i11 = this.f16324g - y8;
                    float x3 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i11 / getHeight();
                    if (p264r5.a.p(edgeEffect2) != 0.0f) {
                        float f12 = -p264r5.a.C(edgeEffect2, -height, x3);
                        if (p264r5.a.p(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f10 = f12;
                    } else if (p264r5.a.p(edgeEffect) != 0.0f) {
                        float fC = p264r5.a.C(edgeEffect, height, 1.0f - x3);
                        if (p264r5.a.p(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f10 = fC;
                    }
                    int iRound = Math.round(f10 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i12 = i11 - iRound;
                    if (!this.f16329p && Math.abs(i12) > this.f16311A) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f16329p = true;
                        i12 = i12 > 0 ? i12 - this.f16311A : i12 + this.f16311A;
                    }
                    if (this.f16329p) {
                        int iM = m(i12, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f16324g = y8 - iM;
                        this.f16317Q += iM;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f16329p && getChildCount() > 0 && this.f16321d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f16314H = -1;
                this.f16329p = false;
                VelocityTracker velocityTracker3 = this.t;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.t = null;
                }
                stopNestedScroll(0);
                this.f16322e.onRelease();
                this.f16323f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f16324g = (int) motionEvent.getY(actionIndex);
                this.f16314H = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                i(motionEvent);
                this.f16324g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f16314H));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f16329p && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f16321d.isFinished()) {
                this.f16321d.abortAnimation();
                stopNestedScroll(1);
            }
            int y10 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f16324g = y10;
            this.f16314H = pointerId;
            startNestedScroll(2, 0);
        }
        VelocityTracker velocityTracker4 = this.t;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final void p(int i7) {
        o(0 - getScrollX(), i7 - getScrollY(), false);
    }

    public final boolean q(MotionEvent motionEvent) {
        boolean z3;
        EdgeEffect edgeEffect = this.f16322e;
        if (p264r5.a.p(edgeEffect) != 0.0f) {
            p264r5.a.C(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z3 = true;
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.f16323f;
        if (p264r5.a.p(edgeEffect2) == 0.0f) {
            return z3;
        }
        p264r5.a.C(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f16325i) {
            this.f16328o = view2;
        } else {
            Rect rect = this.f16320c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iB = b(rect);
            if (iB != 0) {
                scrollBy(0, iB);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iB = b(rect);
        boolean z8 = iB != 0;
        if (z8) {
            if (z3) {
                scrollBy(0, iB);
                return z8;
            }
            o(0, iB, false);
        }
        return z8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        VelocityTracker velocityTracker;
        if (z3 && (velocityTracker = this.t) != null) {
            velocityTracker.recycle();
            this.t = null;
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f16325i = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public final void scrollTo(int i7, int i10) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i7 < 0) {
                i7 = 0;
            } else if (width + i7 > width2) {
                i7 = width2 - width;
            }
            if (height >= height2 || i10 < 0) {
                i10 = 0;
            } else if (height + i10 > height2) {
                i10 = height2 - height;
            }
            if (i7 == getScrollX() && i10 == getScrollY()) {
                return;
            }
            super.scrollTo(i7, i10);
        }
    }

    public void setFillViewport(boolean z3) {
        if (z3 != this.f16336v) {
            this.f16336v = z3;
            requestLayout();
        }
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z3) {
        this.f16332r0.g(z3);
    }

    public void setOnScrollChangeListener(@Nullable OnScrollChangeListener onScrollChangeListener) {
        this.f16334t0 = onScrollChangeListener;
    }

    public void setSmoothScrollingEnabled(boolean z3) {
        this.f16337w = z3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean startNestedScroll(int i7) {
        return this.f16332r0.h(i7, 0);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public final void stopNestedScroll(int i7) {
        this.f16332r0.i(i7);
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, W.a.nestedScrollViewStyle);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public final boolean dispatchNestedPreScroll(int i7, int i10, int[] iArr, int[] iArr2, int i11) {
        return this.f16332r0.c(i7, i10, iArr, iArr2, i11);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public final boolean dispatchNestedScroll(int i7, int i10, int i11, int i12, int[] iArr, int i13) {
        return this.f16332r0.d(i7, i10, i11, i12, iArr, i13, null);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public final boolean hasNestedScrollingParent(int i7) {
        return this.f16332r0.f(i7);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr, int i11) {
        dispatchNestedPreScroll(i7, i10, iArr, null, i11);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12, int i13) {
        h(i12, i13, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        return onStartNestedScroll(view, view2, i7, 0);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public final boolean startNestedScroll(int i7, int i10) {
        return this.f16332r0.h(i7, i10);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        super(context, attributeSet, i7);
        this.f16320c = new Rect();
        this.f16325i = true;
        this.f16326j = false;
        this.f16328o = null;
        this.f16329p = false;
        this.f16337w = true;
        this.f16314H = -1;
        this.f16315L = new int[2];
        this.f16316M = new int[2];
        this.f16335u0 = new C1056h(getContext(), new C2085k0(this, 14));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            edgeEffect = d.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f16322e = edgeEffect;
        if (i10 >= 31) {
            edgeEffect2 = d.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f16323f = edgeEffect2;
        this.f16318a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f16321d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(CodePushConstants.DOWNLOAD_BUFFER_SIZE);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f16311A = viewConfiguration.getScaledTouchSlop();
        this.f16312B = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f16313C = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f16310x0, i7, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f16331q0 = new C1066s();
        this.f16332r0 = new r(this);
        setNestedScrollingEnabled(true);
        N.q(this, f16309w0);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public final void dispatchNestedScroll(int i7, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        this.f16332r0.d(i7, i10, i11, i12, iArr, i13, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        h(i12, 0, null);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        if (getChildCount() <= 0) {
            super.addView(view, i7);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        onNestedScrollAccepted(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i7, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
