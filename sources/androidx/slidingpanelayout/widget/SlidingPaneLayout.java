package androidx.slidingpanelayout.widget;

import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.t0;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.F;
import androidx.core.view.N;
import androidx.core.view.q0;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup implements Openable {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final boolean f17819r0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public PanelSlideListener f17820A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final androidx.customview.widget.g f17821B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f17822C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f17823H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Rect f17824L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final ArrayList f17825M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f17826Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f17829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f17830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f17832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f17833g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f17834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17835j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public FoldingFeature f17836k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17837o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f17838p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Sd.b f17839p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public d f17840q0;
    public float t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f17841v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CopyOnWriteArrayList f17842w;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int[] f17843d = {R.attr.layout_weight};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f17844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f17845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f17846c;

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f17844a = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f17843d);
            this.f17844a = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public interface PanelSlideListener {
        void onPanelClosed(@NonNull View view);

        void onPanelOpened(@NonNull View view);

        void onPanelSlide(@NonNull View view, float f10);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new g();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f17847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17848b;

        public SavedState(Parcel parcel) {
            super(parcel, null);
            this.f17847a = parcel.readInt() != 0;
            this.f17848b = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f17847a ? 1 : 0);
            parcel.writeInt(this.f17848b);
        }
    }

    public static class TouchBlocker extends FrameLayout {
        @Override // android.view.View
        public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        f17819r0 = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(@NonNull Context context) {
        this(context, null);
    }

    private androidx.core.graphics.e getSystemGestureInsets() {
        if (!f17819r0) {
            return null;
        }
        WeakHashMap weakHashMap = N.f16168a;
        q0 q0VarA = F.a(this);
        if (q0VarA != null) {
            return q0VarA.f16277a.j();
        }
        return null;
    }

    private void setFoldingFeatureObserver(d dVar) {
        this.f17840q0 = dVar;
        Sd.b onFoldingFeatureChangeListener = this.f17839p0;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(onFoldingFeatureChangeListener, "onFoldingFeatureChangeListener");
        dVar.f17861d = onFoldingFeatureChangeListener;
    }

    public final boolean a() {
        if (!this.f17831e) {
            this.f17822C = false;
        }
        if (!this.f17823H && !e(1.0f)) {
            return false;
        }
        this.f17822C = false;
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() != 1) {
            super.addView(view, i7, layoutParams);
            return;
        }
        TouchBlocker touchBlocker = new TouchBlocker(view.getContext());
        touchBlocker.addView(view);
        super.addView(touchBlocker, i7, layoutParams);
    }

    public final boolean b(View view) {
        if (view == null) {
            return false;
        }
        return this.f17831e && ((LayoutParams) view.getLayoutParams()).f17846c && this.f17833g > 0.0f;
    }

    public final boolean c() {
        WeakHashMap weakHashMap = N.f16168a;
        return getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // androidx.customview.widget.Openable
    public final void close() {
        a();
    }

    @Override // android.view.View
    public final void computeScroll() {
        androidx.customview.widget.g gVar = this.f17821B;
        if (gVar.h()) {
            if (!this.f17831e) {
                gVar.a();
            } else {
                WeakHashMap weakHashMap = N.f16168a;
                postInvalidateOnAnimation();
            }
        }
    }

    public final void d(float f10) {
        boolean zC = c();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt != this.f17832f) {
                float f11 = 1.0f - this.f17834i;
                int i10 = this.f17838p;
                this.f17834i = f10;
                int i11 = ((int) (f11 * i10)) - ((int) ((1.0f - f10) * i10));
                if (zC) {
                    i11 = -i11;
                }
                childAt.offsetLeftAndRight(i11);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i7;
        int right;
        super.draw(canvas);
        Drawable drawable = c() ? this.f17830d : this.f17829c;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top2 = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (c()) {
            right = childAt.getRight();
            i7 = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i10 = left - intrinsicWidth;
            i7 = left;
            right = i10;
        }
        drawable.setBounds(right, top2, i7, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        boolean zC = c() ^ isOpen();
        androidx.customview.widget.g gVar = this.f17821B;
        if (zC) {
            gVar.f16407q = 1;
            androidx.core.graphics.e systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                gVar.f16405o = Math.max(gVar.f16406p, systemGestureInsets.f16058a);
            }
        } else {
            gVar.f16407q = 2;
            androidx.core.graphics.e systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                gVar.f16405o = Math.max(gVar.f16406p, systemGestureInsets2.f16060c);
            }
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.f17831e && !layoutParams.f17845b && this.f17832f != null) {
            Rect rect = this.f17824L;
            canvas.getClipBounds(rect);
            if (c()) {
                rect.left = Math.max(rect.left, this.f17832f.getRight());
            } else {
                rect.right = Math.min(rect.right, this.f17832f.getLeft());
            }
            canvas.clipRect(rect);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j6);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    public final boolean e(float f10) {
        int paddingLeft;
        if (this.f17831e) {
            boolean zC = c();
            LayoutParams layoutParams = (LayoutParams) this.f17832f.getLayoutParams();
            if (zC) {
                int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                paddingLeft = (int) (getWidth() - (((f10 * this.f17835j) + paddingRight) + this.f17832f.getWidth()));
            } else {
                paddingLeft = (int) ((f10 * this.f17835j) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
            }
            View view = this.f17832f;
            if (this.f17821B.v(view, paddingLeft, view.getTop())) {
                int childCount = getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() == 4) {
                        childAt.setVisibility(0);
                    }
                }
                WeakHashMap weakHashMap = N.f16168a;
                postInvalidateOnAnimation();
                return true;
            }
        }
        return false;
    }

    public final void f(View view) {
        int left;
        int right;
        int top2;
        int bottom;
        View childAt;
        View view2 = view;
        boolean zC = c();
        int width = zC ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zC ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view2.isOpaque()) {
            left = 0;
            right = 0;
            top2 = 0;
            bottom = 0;
        } else {
            left = view2.getLeft();
            right = view2.getRight();
            top2 = view2.getTop();
            bottom = view2.getBottom();
        }
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount && (childAt = getChildAt(i7)) != view2) {
            if (childAt.getVisibility() != 8) {
                childAt.setVisibility((Math.max(zC ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top2 || Math.min(zC ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i7++;
            view2 = view;
            zC = zC;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.f17844a = 0.0f;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams2 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams2.f17844a = 0.0f;
            return layoutParams2;
        }
        LayoutParams layoutParams3 = new LayoutParams(layoutParams);
        layoutParams3.f17844a = 0.0f;
        return layoutParams3;
    }

    @ColorInt
    @Deprecated
    public int getCoveredFadeColor() {
        return this.f17828b;
    }

    public final int getLockMode() {
        return this.f17826Q;
    }

    @Px
    public int getParallaxDistance() {
        return this.f17838p;
    }

    @ColorInt
    @Deprecated
    public int getSliderFadeColor() {
        return this.f17827a;
    }

    @Override // androidx.customview.widget.Openable
    public final boolean isOpen() {
        return !this.f17831e || this.f17833g == 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Activity activity;
        super.onAttachedToWindow();
        this.f17823H = true;
        if (this.f17840q0 != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                d dVar = this.f17840q0;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(activity, "activity");
                t0 t0Var = dVar.f17860c;
                if (t0Var != null) {
                    t0Var.cancel((CancellationException) null);
                }
                dVar.f17860c = AbstractC0780y.m(AbstractC0777v.a(AbstractC0780y.h(dVar.f17859b)), null, null, new c(dVar, activity, null), 3);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        t0 t0Var;
        super.onDetachedFromWindow();
        this.f17823H = true;
        d dVar = this.f17840q0;
        if (dVar != null && (t0Var = dVar.f17860c) != null) {
            t0Var.cancel((CancellationException) null);
        }
        ArrayList arrayList = this.f17825M;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        boolean z8 = this.f17831e;
        androidx.customview.widget.g gVar = this.f17821B;
        if (!z8 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            int x3 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            gVar.getClass();
            this.f17822C = androidx.customview.widget.g.m(childAt, x3, y8);
        }
        if (!this.f17831e || (this.f17837o && actionMasked != 0)) {
            gVar.b();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            gVar.b();
            return false;
        }
        if (actionMasked == 0) {
            this.f17837o = false;
            float x7 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.t = x7;
            this.f17841v = y10;
            gVar.getClass();
            if (androidx.customview.widget.g.m(this.f17832f, (int) x7, (int) y10) && b(this.f17832f)) {
                z3 = true;
            }
            return !gVar.u(motionEvent) || z3;
        }
        if (actionMasked == 2) {
            float x10 = motionEvent.getX();
            float y11 = motionEvent.getY();
            float fAbs = Math.abs(x10 - this.t);
            float fAbs2 = Math.abs(y11 - this.f17841v);
            if (fAbs > gVar.f16392b && fAbs2 > fAbs) {
                gVar.b();
                this.f17837o = true;
                return false;
            }
        }
        z3 = false;
        if (gVar.u(motionEvent)) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d8  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        FoldingFeature foldingFeature;
        int iWidth;
        boolean zC = c();
        int i18 = i11 - i7;
        int paddingRight = zC ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zC ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f17823H) {
            this.f17833g = (this.f17831e && this.f17822C) ? 0.0f : 1.0f;
        }
        int i19 = paddingRight;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f17845b) {
                    int i21 = i18 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i21) - i19) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.f17835j = iMin;
                    int i22 = zC ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    layoutParams.f17846c = (measuredWidth / 2) + ((i19 + i22) + iMin) > i21;
                    float f10 = iMin;
                    int i23 = (int) (this.f17833g * f10);
                    i13 = i22 + i23 + i19;
                    this.f17833g = i23 / f10;
                } else {
                    if (!this.f17831e || (i14 = this.f17838p) == 0) {
                        i13 = paddingRight;
                    } else {
                        i15 = (int) ((1.0f - this.f17833g) * i14);
                        i13 = paddingRight;
                    }
                    if (zC) {
                        i17 = (i18 - i13) + i15;
                        i16 = i17 - measuredWidth;
                    } else {
                        i16 = i13 - i15;
                        i17 = i16 + measuredWidth;
                    }
                    childAt.layout(i16, paddingTop, i17, childAt.getMeasuredHeight() + paddingTop);
                    foldingFeature = this.f17836k0;
                    if (foldingFeature == null && foldingFeature.getOrientation() == FoldingFeature.Orientation.VERTICAL && this.f17836k0.isSeparating()) {
                        iWidth = this.f17836k0.getBounds().width();
                    } else {
                        iWidth = 0;
                    }
                    paddingRight = Math.abs(iWidth) + childAt.getWidth() + paddingRight;
                    i19 = i13;
                }
                i15 = 0;
                if (zC) {
                    i17 = (i18 - i13) + i15;
                    i16 = i17 - measuredWidth;
                } else {
                    i16 = i13 - i15;
                    i17 = i16 + measuredWidth;
                }
                childAt.layout(i16, paddingTop, i17, childAt.getMeasuredHeight() + paddingTop);
                foldingFeature = this.f17836k0;
                if (foldingFeature == null) {
                    iWidth = 0;
                } else {
                    iWidth = 0;
                }
                paddingRight = Math.abs(iWidth) + childAt.getWidth() + paddingRight;
                i19 = i13;
            }
        }
        if (this.f17823H) {
            if (this.f17831e && this.f17838p != 0) {
                d(this.f17833g);
            }
            f(this.f17832f);
        }
        this.f17823H = false;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0089 A[PHI: r17
      0x0089: PHI (r17v2 float) = (r17v1 float), (r17v3 float) binds: [B:19:0x007f, B:21:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x009b  */
    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00da  */
    /* JADX WARN: Code duplicated, block: B:43:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ad  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v19 */
    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int paddingTop;
        int iMin;
        int i11;
        int iMax;
        int iMakeMeasureSpec;
        int i12;
        ArrayList arrayList;
        int i13;
        int minimumWidth;
        int iMax2;
        int i14;
        int iMakeMeasureSpec2;
        int measuredHeight;
        boolean z3;
        int i15;
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        ?? r10 = 0;
        if (mode2 != Integer.MIN_VALUE) {
            iMin = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        }
        int iMax3 = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f17832f = null;
        int i16 = 0;
        boolean z8 = false;
        int i17 = iMax3;
        float f10 = 0.0f;
        int i18 = 1;
        while (true) {
            i11 = 8;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.f17846c = r10;
            } else {
                float f11 = layoutParams.f17844a;
                if (f11 > 0.0f) {
                    f10 += f11;
                    if (((ViewGroup.MarginLayoutParams) layoutParams).width != 0) {
                        iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin), (int) r10);
                        i14 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                        if (i14 == -2) {
                            if (mode == 0) {
                                i15 = mode;
                            } else {
                                i15 = Integer.MIN_VALUE;
                            }
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, i15);
                        } else if (i14 == -1) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                        } else {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                        }
                        childAt.measure(iMakeMeasureSpec2, ViewGroup.getChildMeasureSpec(i10, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
                        int measuredWidth = childAt.getMeasuredWidth();
                        measuredHeight = childAt.getMeasuredHeight();
                        if (measuredHeight > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                iMin = Math.min(measuredHeight, paddingTop);
                            } else if (mode2 == 0) {
                                iMin = measuredHeight;
                            }
                        }
                        i17 -= measuredWidth;
                        if (i16 != 0) {
                            if (i17 < 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            layoutParams.f17845b = z3;
                            z8 |= z3;
                            if (z3) {
                                this.f17832f = childAt;
                            }
                        }
                    }
                } else {
                    iMax2 = Math.max(iMax3 - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin), (int) r10);
                    i14 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                    if (i14 == -2) {
                        if (mode == 0) {
                            i15 = mode;
                        } else {
                            i15 = Integer.MIN_VALUE;
                        }
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, i15);
                    } else if (i14 == -1) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                    } else {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                    }
                    childAt.measure(iMakeMeasureSpec2, ViewGroup.getChildMeasureSpec(i10, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    measuredHeight = childAt.getMeasuredHeight();
                    if (measuredHeight > iMin) {
                        if (mode2 == Integer.MIN_VALUE) {
                            iMin = Math.min(measuredHeight, paddingTop);
                        } else if (mode2 == 0) {
                            iMin = measuredHeight;
                        }
                    }
                    i17 -= measuredWidth2;
                    if (i16 != 0) {
                        if (i17 < 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        layoutParams.f17845b = z3;
                        z8 |= z3;
                        if (z3) {
                            this.f17832f = childAt;
                        }
                    }
                }
            }
            i16++;
            r10 = 0;
        }
        if (z8 || f10 > 0.0f) {
            int i19 = 0;
            while (i19 < childCount) {
                View childAt2 = getChildAt(i19);
                if (childAt2.getVisibility() == i11) {
                    i12 = i19;
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    int i20 = ((ViewGroup.MarginLayoutParams) layoutParams2).width;
                    float f12 = layoutParams2.f17844a;
                    int measuredWidth3 = (i20 != 0 || f12 <= 0.0f) ? childAt2.getMeasuredWidth() : 0;
                    if (z8) {
                        iMax = iMax3 - (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else if (f12 > 0.0f) {
                        iMax = measuredWidth3 + ((int) ((f12 * Math.max(0, i17)) / f10));
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else {
                        iMax = measuredWidth3;
                        iMakeMeasureSpec = 0;
                    }
                    int paddingBottom = getPaddingBottom() + getPaddingTop();
                    LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                    i12 = i19;
                    int iMakeMeasureSpec3 = (((ViewGroup.MarginLayoutParams) layoutParams3).width != 0 || layoutParams3.f17844a <= 0.0f) ? View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824) : ViewGroup.getChildMeasureSpec(i10, paddingBottom, ((ViewGroup.MarginLayoutParams) layoutParams3).height);
                    if (measuredWidth3 != iMax) {
                        childAt2.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                measuredHeight2 = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 == 0) {
                            }
                            iMin = measuredHeight2;
                        }
                    }
                }
                i19 = i12 + 1;
                i11 = 8;
            }
        }
        FoldingFeature foldingFeature = this.f17836k0;
        if (foldingFeature == null || !foldingFeature.isSeparating() || this.f17836k0.getBounds().left == 0 || this.f17836k0.getBounds().top != 0) {
            arrayList = null;
        } else {
            FoldingFeature foldingFeature2 = this.f17836k0;
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            int i21 = iArr[0];
            Rect rect = new Rect(i21, iArr[1], getWidth() + i21, getWidth() + iArr[1]);
            Rect rect2 = new Rect(foldingFeature2.getBounds());
            boolean zIntersect = rect2.intersect(rect);
            if (!(rect2.width() == 0 && rect2.height() == 0) && zIntersect) {
                rect2.offset(-iArr[0], -iArr[1]);
            } else {
                rect2 = null;
            }
            if (rect2 == null) {
                arrayList = null;
            } else {
                Rect rect3 = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), rect2.left), getHeight() - getPaddingBottom());
                int width = getWidth() - getPaddingRight();
                arrayList = new ArrayList(Arrays.asList(rect3, new Rect(Math.min(width, rect2.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
            }
        }
        if (arrayList != null && !z8) {
            int i22 = 0;
            while (i22 < childCount) {
                View childAt3 = getChildAt(i22);
                if (childAt3.getVisibility() != 8) {
                    Rect rect4 = (Rect) arrayList.get(i22);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    int i23 = ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin;
                    int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), Integer.MIN_VALUE), iMakeMeasureSpec4);
                    if ((childAt3.getMeasuredWidthAndState() & PointerEventHelper.X_FLAG_SUPPORTS_HOVER) != i18) {
                        boolean z10 = childAt3 instanceof TouchBlocker;
                        if (z10) {
                            View childAt4 = ((TouchBlocker) childAt3).getChildAt(0);
                            WeakHashMap weakHashMap = N.f16168a;
                            minimumWidth = childAt4.getMinimumWidth();
                        } else {
                            WeakHashMap weakHashMap2 = N.f16168a;
                            minimumWidth = childAt3.getMinimumWidth();
                        }
                        if (minimumWidth != 0) {
                            if (rect4.width() < (z10 ? ((TouchBlocker) childAt3).getChildAt(0).getMinimumWidth() : childAt3.getMinimumWidth())) {
                            }
                        }
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), 1073741824), iMakeMeasureSpec4);
                    }
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(iMax3 - i23, 1073741824), iMakeMeasureSpec4);
                    if (i22 != 0) {
                        i13 = 1;
                        layoutParams4.f17845b = true;
                        this.f17832f = childAt3;
                        z8 = true;
                    }
                    i22 += i13;
                    i18 = i13;
                }
                i13 = 1;
                i22 += i13;
                i18 = i13;
            }
        }
        boolean z11 = z8;
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + iMin);
        this.f17831e = z11;
        androidx.customview.widget.g gVar = this.f17821B;
        if (gVar.f16391a == 0 || z11) {
            return;
        }
        gVar.a();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f17847a) {
            if (!this.f17831e) {
                this.f17822C = true;
            }
            if (this.f17823H || e(0.0f)) {
                this.f17822C = true;
            }
        } else {
            a();
        }
        this.f17822C = savedState.f17847a;
        setLockMode(savedState.f17848b);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f17847a = this.f17831e ? isOpen() : this.f17822C;
        savedState.f17848b = this.f17826Q;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 != i11) {
            this.f17823H = true;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f17831e) {
            return super.onTouchEvent(motionEvent);
        }
        androidx.customview.widget.g gVar = this.f17821B;
        gVar.n(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x3 = motionEvent.getX();
            float y8 = motionEvent.getY();
            this.t = x3;
            this.f17841v = y8;
            return true;
        }
        if (actionMasked == 1 && b(this.f17832f)) {
            float x7 = motionEvent.getX();
            float y10 = motionEvent.getY();
            float f10 = x7 - this.t;
            float f11 = y10 - this.f17841v;
            int i7 = gVar.f16392b;
            if ((f11 * f11) + (f10 * f10) < i7 * i7 && androidx.customview.widget.g.m(this.f17832f, (int) x7, (int) y10)) {
                a();
            }
        }
        return true;
    }

    @Override // androidx.customview.widget.Openable
    public final void open() {
        if (!this.f17831e) {
            this.f17822C = true;
        }
        if (this.f17823H || e(0.0f)) {
            this.f17822C = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (view.getParent() instanceof TouchBlocker) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f17831e) {
            return;
        }
        this.f17822C = view == this.f17832f;
    }

    @Deprecated
    public void setCoveredFadeColor(@ColorInt int i7) {
        this.f17828b = i7;
    }

    public final void setLockMode(int i7) {
        this.f17826Q = i7;
    }

    @Deprecated
    public void setPanelSlideListener(@Nullable PanelSlideListener panelSlideListener) {
        PanelSlideListener panelSlideListener2 = this.f17820A;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17842w;
        if (panelSlideListener2 != null) {
            copyOnWriteArrayList.remove(panelSlideListener2);
        }
        if (panelSlideListener != null) {
            copyOnWriteArrayList.add(panelSlideListener);
        }
        this.f17820A = panelSlideListener;
    }

    public void setParallaxDistance(@Px int i7) {
        this.f17838p = i7;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@Nullable Drawable drawable) {
        this.f17829c = drawable;
    }

    public void setShadowDrawableRight(@Nullable Drawable drawable) {
        this.f17830d = drawable;
    }

    @Deprecated
    public void setShadowResource(@DrawableRes int i7) {
        setShadowDrawableLeft(getResources().getDrawable(i7));
    }

    public void setShadowResourceLeft(int i7) {
        setShadowDrawableLeft(getContext().getDrawable(i7));
    }

    public void setShadowResourceRight(int i7) {
        setShadowDrawableRight(getContext().getDrawable(i7));
    }

    @Deprecated
    public void setSliderFadeColor(@ColorInt int i7) {
        this.f17827a = i7;
    }

    public SlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f17827a = 0;
        this.f17833g = 1.0f;
        this.f17842w = new CopyOnWriteArrayList();
        this.f17823H = true;
        this.f17824L = new Rect();
        this.f17825M = new ArrayList();
        this.f17839p0 = new Sd.b(this, 13);
        float f10 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        N.q(this, new e(this));
        setImportantForAccessibility(1);
        androidx.customview.widget.g gVarI = androidx.customview.widget.g.i(this, 0.5f, new f(this));
        this.f17821B = gVarI;
        gVarI.f16404n = f10 * 400.0f;
        setFoldingFeatureObserver(new d(WindowInfoTracker.getOrCreate(context), androidx.core.content.d.d(context)));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
