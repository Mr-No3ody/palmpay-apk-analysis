package androidx.drawerlayout.widget;

import Ab.r;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.E;
import androidx.core.view.N;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.q0;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.g;
import com.google.android.flexbox.FlexItem;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup implements Openable {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.drawerlayout.widget.DrawerLayout";
    private static final boolean ALLOW_EDGE_LOCK = false;
    static final boolean CAN_HIDE_DESCENDANTS;
    private static final boolean CHILDREN_DISALLOW_INTERCEPT = true;
    private static final int DEFAULT_SCRIM_COLOR = -1728053248;
    public static final int LOCK_MODE_LOCKED_CLOSED = 1;
    public static final int LOCK_MODE_LOCKED_OPEN = 2;
    public static final int LOCK_MODE_UNDEFINED = 3;
    public static final int LOCK_MODE_UNLOCKED = 0;
    private static final int MIN_DRAWER_MARGIN = 64;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final int PEEK_DELAY = 160;
    private static final boolean SET_DRAWER_SHADOW_FROM_ELEVATION;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "DrawerLayout";
    private static final float TOUCH_SLOP_SENSITIVITY = 1.0f;
    private static boolean sEdgeSizeUsingSystemGestureInsets;
    private final AccessibilityViewCommand mActionDismiss;
    private final c mChildAccessibilityDelegate;
    private Rect mChildHitRect;
    private Matrix mChildInvertedMatrix;
    private boolean mChildrenCanceledTouch;
    private boolean mDrawStatusBarBackground;
    private float mDrawerElevation;
    private int mDrawerState;
    private boolean mFirstLayout;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private Object mLastInsets;
    private final f mLeftCallback;
    private final g mLeftDragger;

    @Nullable
    private DrawerListener mListener;
    private List<DrawerListener> mListeners;
    private int mLockModeEnd;
    private int mLockModeLeft;
    private int mLockModeRight;
    private int mLockModeStart;
    private int mMinDrawerMargin;
    private final ArrayList<View> mNonDrawerViews;
    private final f mRightCallback;
    private final g mRightDragger;
    private int mScrimColor;
    private float mScrimOpacity;
    private Paint mScrimPaint;
    private Drawable mShadowEnd;
    private Drawable mShadowLeft;
    private Drawable mShadowLeftResolved;
    private Drawable mShadowRight;
    private Drawable mShadowRightResolved;
    private Drawable mShadowStart;
    private Drawable mStatusBarBackground;
    private CharSequence mTitleLeft;
    private CharSequence mTitleRight;
    private static final int[] THEME_ATTRS = {R.attr.colorPrimaryDark};
    static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};

    public interface DrawerListener {
        void onDrawerClosed(@NonNull View view);

        void onDrawerOpened(@NonNull View view);

        void onDrawerSlide(@NonNull View view, float f10);

        void onDrawerStateChanged(int i7);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f16819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f16820c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16821d;

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16818a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.LAYOUT_ATTRS);
            this.f16818a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16824c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16825d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f16826e;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f16822a = 0;
            this.f16822a = parcel.readInt();
            this.f16823b = parcel.readInt();
            this.f16824c = parcel.readInt();
            this.f16825d = parcel.readInt();
            this.f16826e = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f16822a);
            parcel.writeInt(this.f16823b);
            parcel.writeInt(this.f16824c);
            parcel.writeInt(this.f16825d);
            parcel.writeInt(this.f16826e);
        }
    }

    static {
        int i7 = Build.VERSION.SDK_INT;
        CAN_HIDE_DESCENDANTS = true;
        SET_DRAWER_SHADOW_FROM_ELEVATION = true;
        sEdgeSizeUsingSystemGestureInsets = i7 >= 29;
    }

    public DrawerLayout(@NonNull Context context) {
        this(context, null);
    }

    public static String gravityToString(int i7) {
        if ((i7 & 3) == 3) {
            return "LEFT";
        }
        return (i7 & 5) == 5 ? "RIGHT" : Integer.toHexString(i7);
    }

    public static boolean includeChildForAccessibility(View view) {
        WeakHashMap weakHashMap = N.f16168a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    public final void a() {
        Drawable drawable;
        Drawable drawable2;
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return;
        }
        WeakHashMap weakHashMap = N.f16168a;
        int layoutDirection = getLayoutDirection();
        if (layoutDirection == 0) {
            Drawable drawable3 = this.mShadowStart;
            if (drawable3 != null) {
                if (drawable3.isAutoMirrored()) {
                    drawable3.setLayoutDirection(layoutDirection);
                }
                drawable = this.mShadowStart;
            } else {
                drawable = this.mShadowLeft;
            }
        } else {
            Drawable drawable4 = this.mShadowEnd;
            if (drawable4 != null) {
                if (drawable4.isAutoMirrored()) {
                    drawable4.setLayoutDirection(layoutDirection);
                }
                drawable = this.mShadowEnd;
            } else {
                drawable = this.mShadowLeft;
            }
        }
        this.mShadowLeftResolved = drawable;
        int layoutDirection2 = getLayoutDirection();
        if (layoutDirection2 == 0) {
            Drawable drawable5 = this.mShadowEnd;
            if (drawable5 != null) {
                if (drawable5.isAutoMirrored()) {
                    drawable5.setLayoutDirection(layoutDirection2);
                }
                drawable2 = this.mShadowEnd;
            } else {
                drawable2 = this.mShadowRight;
            }
        } else {
            Drawable drawable6 = this.mShadowStart;
            if (drawable6 != null) {
                if (drawable6.isAutoMirrored()) {
                    drawable6.setLayoutDirection(layoutDirection2);
                }
                drawable2 = this.mShadowStart;
            } else {
                drawable2 = this.mShadowRight;
            }
        }
        this.mShadowRightResolved = drawable2;
    }

    public void addDrawerListener(@NonNull DrawerListener drawerListener) {
        if (drawerListener == null) {
            return;
        }
        if (this.mListeners == null) {
            this.mListeners = new ArrayList();
        }
        this.mListeners.add(drawerListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i7, int i10) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (!isDrawerView(childAt)) {
                this.mNonDrawerViews.add(childAt);
            } else if (isDrawerOpen(childAt)) {
                childAt.addFocusables(arrayList, i7, i10);
                z3 = true;
            }
        }
        if (!z3) {
            int size = this.mNonDrawerViews.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view = this.mNonDrawerViews.get(i12);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i7, i10);
                }
            }
        }
        this.mNonDrawerViews.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        if (findOpenDrawer() != null || isDrawerView(view)) {
            WeakHashMap weakHashMap = N.f16168a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = N.f16168a;
            view.setImportantForAccessibility(1);
        }
        if (CAN_HIDE_DESCENDANTS) {
            return;
        }
        N.q(view, this.mChildAccessibilityDelegate);
    }

    public final void b(View view) {
        p074f0.c cVar = p074f0.c.f36351m;
        N.n(cVar.a(), view);
        N.k(0, view);
        if (!isDrawerOpen(view) || getDrawerLockMode(view) == 2) {
            return;
        }
        N.o(view, cVar, null, this.mActionDismiss);
    }

    public final void c(View view, boolean z3) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if ((z3 || isDrawerView(childAt)) && !(z3 && childAt == view)) {
                WeakHashMap weakHashMap = N.f16168a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = N.f16168a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    public void cancelChildViewTouch() {
        if (this.mChildrenCanceledTouch) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.mChildrenCanceledTouch = true;
    }

    public boolean checkDrawerViewAbsoluteGravity(View view, int i7) {
        return (getDrawerViewAbsoluteGravity(view) & i7) == i7;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // androidx.customview.widget.Openable
    public void close() {
        closeDrawer(8388611);
    }

    public void closeDrawer(@NonNull View view) {
        closeDrawer(view, true);
    }

    public void closeDrawers() {
        closeDrawers(false);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i7 = 0; i7 < childCount; i7++) {
            fMax = Math.max(fMax, ((LayoutParams) getChildAt(i7).getLayoutParams()).f16819b);
        }
        this.mScrimOpacity = fMax;
        boolean zH = this.mLeftDragger.h();
        boolean zH2 = this.mRightDragger.h();
        if (zH || zH2) {
            WeakHashMap weakHashMap = N.f16168a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.mScrimOpacity <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x3 = motionEvent.getX();
        float y8 = motionEvent.getY();
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            View childAt = getChildAt(i7);
            if (this.mChildHitRect == null) {
                this.mChildHitRect = new Rect();
            }
            childAt.getHitRect(this.mChildHitRect);
            if (this.mChildHitRect.contains((int) x3, (int) y8) && !isContentView(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.mChildInvertedMatrix == null) {
                            this.mChildInvertedMatrix = new Matrix();
                        }
                        matrix.invert(this.mChildInvertedMatrix);
                        motionEventObtain.transform(this.mChildInvertedMatrix);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    public void dispatchOnDrawerClosed(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f16821d & 1) == 1) {
            layoutParams.f16821d = 0;
            List<DrawerListener> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerClosed(view);
                }
            }
            c(view, false);
            b(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    public void dispatchOnDrawerOpened(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f16821d & 1) == 0) {
            layoutParams.f16821d = 1;
            List<DrawerListener> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerOpened(view);
                }
            }
            c(view, true);
            b(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public void dispatchOnDrawerSlide(View view, float f10) {
        List<DrawerListener> list = this.mListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mListeners.get(size).onDrawerSlide(view, f10);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j6) {
        Drawable background;
        int height = getHeight();
        boolean zIsContentView = isContentView(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i7 = 0;
        if (zIsContentView) {
            int childCount = getChildCount();
            int i10 = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && isDrawerView(childAt) && childAt.getHeight() >= height) {
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i10) {
                            i10 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i10, 0, width, getHeight());
            i7 = i10;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j6);
        canvas.restoreToCount(iSave);
        float f10 = this.mScrimOpacity;
        if (f10 > 0.0f && zIsContentView) {
            int i12 = this.mScrimColor;
            this.mScrimPaint.setColor((i12 & FlexItem.MAX_SIZE) | (((int) ((((-16777216) & i12) >>> 24) * f10)) << 24));
            canvas.drawRect(i7, 0.0f, width, getHeight(), this.mScrimPaint);
            return zDrawChild;
        }
        if (this.mShadowLeftResolved != null && checkDrawerViewAbsoluteGravity(view, 3)) {
            int intrinsicWidth = this.mShadowLeftResolved.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.mLeftDragger.f16405o, 1.0f));
            this.mShadowLeftResolved.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.mShadowLeftResolved.setAlpha((int) (fMax * 255.0f));
            this.mShadowLeftResolved.draw(canvas);
            return zDrawChild;
        }
        if (this.mShadowRightResolved != null && checkDrawerViewAbsoluteGravity(view, 5)) {
            int intrinsicWidth2 = this.mShadowRightResolved.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.mRightDragger.f16405o, 1.0f));
            this.mShadowRightResolved.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.mShadowRightResolved.setAlpha((int) (fMax2 * 255.0f));
            this.mShadowRightResolved.draw(canvas);
        }
        return zDrawChild;
    }

    public View findDrawerWithGravity(int i7) {
        WeakHashMap weakHashMap = N.f16168a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((getDrawerViewAbsoluteGravity(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public View findOpenDrawer() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if ((((LayoutParams) childAt.getLayoutParams()).f16821d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public View findVisibleDrawer() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (isDrawerView(childAt) && isDrawerVisible(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.f16818a = 0;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.f16818a = 0;
            layoutParams3.f16818a = layoutParams2.f16818a;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams4.f16818a = 0;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        layoutParams5.f16818a = 0;
        return layoutParams5;
    }

    public float getDrawerElevation() {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return this.mDrawerElevation;
        }
        return 0.0f;
    }

    public int getDrawerLockMode(int i7) {
        WeakHashMap weakHashMap = N.f16168a;
        int layoutDirection = getLayoutDirection();
        if (i7 == 3) {
            int i10 = this.mLockModeLeft;
            if (i10 != 3) {
                return i10;
            }
            int i11 = layoutDirection == 0 ? this.mLockModeStart : this.mLockModeEnd;
            if (i11 != 3) {
                return i11;
            }
            return 0;
        }
        if (i7 == 5) {
            int i12 = this.mLockModeRight;
            if (i12 != 3) {
                return i12;
            }
            int i13 = layoutDirection == 0 ? this.mLockModeEnd : this.mLockModeStart;
            if (i13 != 3) {
                return i13;
            }
            return 0;
        }
        if (i7 == 8388611) {
            int i14 = this.mLockModeStart;
            if (i14 != 3) {
                return i14;
            }
            int i15 = layoutDirection == 0 ? this.mLockModeLeft : this.mLockModeRight;
            if (i15 != 3) {
                return i15;
            }
            return 0;
        }
        if (i7 != 8388613) {
            return 0;
        }
        int i16 = this.mLockModeEnd;
        if (i16 != 3) {
            return i16;
        }
        int i17 = layoutDirection == 0 ? this.mLockModeRight : this.mLockModeLeft;
        if (i17 != 3) {
            return i17;
        }
        return 0;
    }

    @Nullable
    public CharSequence getDrawerTitle(int i7) {
        WeakHashMap weakHashMap = N.f16168a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, getLayoutDirection());
        if (absoluteGravity == 3) {
            return this.mTitleLeft;
        }
        if (absoluteGravity == 5) {
            return this.mTitleRight;
        }
        return null;
    }

    public int getDrawerViewAbsoluteGravity(View view) {
        int i7 = ((LayoutParams) view.getLayoutParams()).f16818a;
        WeakHashMap weakHashMap = N.f16168a;
        return Gravity.getAbsoluteGravity(i7, getLayoutDirection());
    }

    public float getDrawerViewOffset(View view) {
        return ((LayoutParams) view.getLayoutParams()).f16819b;
    }

    @Nullable
    public Drawable getStatusBarBackgroundDrawable() {
        return this.mStatusBarBackground;
    }

    public boolean isContentView(View view) {
        return ((LayoutParams) view.getLayoutParams()).f16818a == 0;
    }

    public boolean isDrawerOpen(@NonNull View view) {
        if (isDrawerView(view)) {
            return (((LayoutParams) view.getLayoutParams()).f16821d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean isDrawerView(View view) {
        int i7 = ((LayoutParams) view.getLayoutParams()).f16818a;
        WeakHashMap weakHashMap = N.f16168a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public boolean isDrawerVisible(@NonNull View view) {
        if (isDrawerView(view)) {
            return ((LayoutParams) view.getLayoutParams()).f16819b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // androidx.customview.widget.Openable
    public boolean isOpen() {
        return isDrawerOpen(8388611);
    }

    public void moveDrawerToOffset(View view, float f10) {
        float drawerViewOffset = getDrawerViewOffset(view);
        float width = view.getWidth();
        int i7 = ((int) (width * f10)) - ((int) (drawerViewOffset * width));
        if (!checkDrawerViewAbsoluteGravity(view, 3)) {
            i7 = -i7;
        }
        view.offsetLeftAndRight(i7);
        setDrawerViewOffset(view, f10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        Object obj = this.mLastInsets;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0060  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        View viewJ;
        int actionMasked = motionEvent.getActionMasked();
        boolean zU = this.mLeftDragger.u(motionEvent) | this.mRightDragger.u(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                closeDrawers(true);
                this.mChildrenCanceledTouch = false;
            } else if (actionMasked == 2) {
                g gVar = this.mLeftDragger;
                int length = gVar.f16394d.length;
                for (int i7 = 0; i7 < length; i7++) {
                    if ((gVar.f16401k & (1 << i7)) != 0) {
                        float f10 = gVar.f16396f[i7] - gVar.f16394d[i7];
                        float f11 = gVar.f16397g[i7] - gVar.f16395e[i7];
                        float f12 = (f11 * f11) + (f10 * f10);
                        int i10 = gVar.f16392b;
                        if (f12 > i10 * i10) {
                            f fVar = this.mLeftCallback;
                            fVar.f16832d.removeCallbacks(fVar.f16831c);
                            f fVar2 = this.mRightCallback;
                            fVar2.f16832d.removeCallbacks(fVar2.f16831c);
                            break;
                        }
                    }
                }
            } else if (actionMasked == 3) {
                closeDrawers(true);
                this.mChildrenCanceledTouch = false;
            }
            z3 = false;
        } else {
            float x3 = motionEvent.getX();
            float y8 = motionEvent.getY();
            this.mInitialMotionX = x3;
            this.mInitialMotionY = y8;
            z3 = this.mScrimOpacity > 0.0f && (viewJ = this.mLeftDragger.j((int) x3, (int) y8)) != null && isContentView(viewJ);
            this.mChildrenCanceledTouch = false;
        }
        if (!zU && !z3) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (!((LayoutParams) getChildAt(i11).getLayoutParams()).f16820c) {
                }
            }
            if (!this.mChildrenCanceledTouch) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i7 != 4 || findVisibleDrawer() == null) {
            return super.onKeyDown(i7, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (i7 != 4) {
            return super.onKeyUp(i7, keyEvent);
        }
        View viewFindVisibleDrawer = findVisibleDrawer();
        if (viewFindVisibleDrawer != null && getDrawerLockMode(viewFindVisibleDrawer) == 0) {
            closeDrawers();
        }
        return viewFindVisibleDrawer != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        WindowInsets rootWindowInsets;
        float f10;
        int i13;
        boolean z8 = true;
        this.mInLayout = true;
        int i14 = i11 - i7;
        int childCount = getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (isContentView(childAt)) {
                    int i16 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i16, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        float f11 = measuredWidth;
                        i13 = (-measuredWidth) + ((int) (layoutParams.f16819b * f11));
                        f10 = (measuredWidth + i13) / f11;
                    } else {
                        float f12 = measuredWidth;
                        int i17 = i14 - ((int) (layoutParams.f16819b * f12));
                        f10 = (i14 - i17) / f12;
                        i13 = i17;
                    }
                    boolean z10 = f10 != layoutParams.f16819b ? z8 : false;
                    int i18 = layoutParams.f16818a & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR;
                    if (i18 == 16) {
                        int i19 = i12 - i10;
                        int i20 = (i19 - measuredHeight) / 2;
                        int i21 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i20 < i21) {
                            i20 = i21;
                        } else {
                            int i22 = i20 + measuredHeight;
                            int i23 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i22 > i19 - i23) {
                                i20 = (i19 - i23) - measuredHeight;
                            }
                        }
                        childAt.layout(i13, i20, measuredWidth + i13, measuredHeight + i20);
                    } else if (i18 != 80) {
                        int i24 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        childAt.layout(i13, i24, measuredWidth + i13, measuredHeight + i24);
                    } else {
                        int i25 = i12 - i10;
                        childAt.layout(i13, (i25 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i13, i25 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z10) {
                        setDrawerViewOffset(childAt, f10);
                    }
                    int i26 = layoutParams.f16819b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i26) {
                        childAt.setVisibility(i26);
                    }
                }
            }
            i15++;
            z8 = true;
        }
        if (sEdgeSizeUsingSystemGestureInsets && (rootWindowInsets = getRootWindowInsets()) != null) {
            androidx.core.graphics.e eVarJ = q0.h(null, rootWindowInsets).f16277a.j();
            g gVar = this.mLeftDragger;
            gVar.f16405o = Math.max(gVar.f16406p, eVarJ.f16058a);
            g gVar2 = this.mRightDragger;
            gVar2.f16405o = Math.max(gVar2.f16406p, eVarJ.f16060c);
        }
        this.mInLayout = false;
        this.mFirstLayout = false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i7, int i10) {
        boolean z3;
        int i11;
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        int i12 = 0;
        if (this.mLastInsets != null) {
            WeakHashMap weakHashMap = N.f16168a;
            if (getFitsSystemWindows()) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        WeakHashMap weakHashMap2 = N.f16168a;
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z3) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.f16818a, layoutDirection);
                    i11 = 1;
                    if (childAt.getFitsSystemWindows()) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.mLastInsets;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), i12, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(i12, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.mLastInsets;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), i12, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(i12, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                } else {
                    i11 = 1;
                }
                if (isContentView(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                } else {
                    if (!isDrawerView(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i13 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
                        float fE = E.e(childAt);
                        float f10 = this.mDrawerElevation;
                        if (fE != f10) {
                            E.l(childAt, f10);
                        }
                    }
                    int drawerViewAbsoluteGravity = getDrawerViewAbsoluteGravity(childAt) & 7;
                    int i16 = drawerViewAbsoluteGravity == 3 ? i11 : i12;
                    if ((i16 != 0 && i14 != 0) || (i16 == 0 && i15 != 0)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + gravityToString(drawerViewAbsoluteGravity) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (i16 != 0) {
                        i14 = i11;
                    } else {
                        i15 = i11;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i7, this.mMinDrawerMargin + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i10, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                }
                i13++;
                i12 = 0;
            }
            i13++;
            i12 = 0;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View viewFindDrawerWithGravity;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i7 = savedState.f16822a;
        if (i7 != 0 && (viewFindDrawerWithGravity = findDrawerWithGravity(i7)) != null) {
            openDrawer(viewFindDrawerWithGravity);
        }
        int i10 = savedState.f16823b;
        if (i10 != 3) {
            setDrawerLockMode(i10, 3);
        }
        int i11 = savedState.f16824c;
        if (i11 != 3) {
            setDrawerLockMode(i11, 5);
        }
        int i12 = savedState.f16825d;
        if (i12 != 3) {
            setDrawerLockMode(i12, 8388611);
        }
        int i13 = savedState.f16826e;
        if (i13 != 3) {
            setDrawerLockMode(i13, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i7) {
        a();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f16822a = 0;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i7).getLayoutParams();
            int i10 = layoutParams.f16821d;
            boolean z3 = i10 == 1;
            boolean z8 = i10 == 2;
            if (z3 || z8) {
                savedState.f16822a = layoutParams.f16818a;
                break;
            }
        }
        savedState.f16823b = this.mLockModeLeft;
        savedState.f16824c = this.mLockModeRight;
        savedState.f16825d = this.mLockModeStart;
        savedState.f16826e = this.mLockModeEnd;
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        View viewFindOpenDrawer;
        this.mLeftDragger.n(motionEvent);
        this.mRightDragger.n(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x3 = motionEvent.getX();
            float y8 = motionEvent.getY();
            this.mInitialMotionX = x3;
            this.mInitialMotionY = y8;
            this.mChildrenCanceledTouch = false;
        } else if (action == 1) {
            float x7 = motionEvent.getX();
            float y10 = motionEvent.getY();
            View viewJ = this.mLeftDragger.j((int) x7, (int) y10);
            if (viewJ != null && isContentView(viewJ)) {
                float f10 = x7 - this.mInitialMotionX;
                float f11 = y10 - this.mInitialMotionY;
                int i7 = this.mLeftDragger.f16392b;
                z3 = (f11 * f11) + (f10 * f10) >= ((float) (i7 * i7)) || (viewFindOpenDrawer = findOpenDrawer()) == null || getDrawerLockMode(viewFindOpenDrawer) == 2;
            }
            closeDrawers(z3);
        } else if (action == 3) {
            closeDrawers(true);
            this.mChildrenCanceledTouch = false;
        }
        return true;
    }

    @Override // androidx.customview.widget.Openable
    public void open() {
        openDrawer(8388611);
    }

    public void openDrawer(@NonNull View view) {
        openDrawer(view, true);
    }

    public void removeDrawerListener(@NonNull DrawerListener drawerListener) {
        List<DrawerListener> list;
        if (drawerListener == null || (list = this.mListeners) == null) {
            return;
        }
        list.remove(drawerListener);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        super.requestDisallowInterceptTouchEvent(z3);
        if (z3) {
            closeDrawers(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInLayout) {
            return;
        }
        super.requestLayout();
    }

    @RestrictTo({p192n.c.f39802c})
    public void setChildInsets(Object obj, boolean z3) {
        this.mLastInsets = obj;
        this.mDrawStatusBarBackground = z3;
        setWillNotDraw(!z3 && getBackground() == null);
        requestLayout();
    }

    public void setDrawerElevation(float f10) {
        this.mDrawerElevation = f10;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (isDrawerView(childAt)) {
                float f11 = this.mDrawerElevation;
                WeakHashMap weakHashMap = N.f16168a;
                E.l(childAt, f11);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(DrawerListener drawerListener) {
        DrawerListener drawerListener2 = this.mListener;
        if (drawerListener2 != null) {
            removeDrawerListener(drawerListener2);
        }
        if (drawerListener != null) {
            addDrawerListener(drawerListener);
        }
        this.mListener = drawerListener;
    }

    public void setDrawerLockMode(int i7) {
        setDrawerLockMode(i7, 3);
        setDrawerLockMode(i7, 5);
    }

    public void setDrawerShadow(Drawable drawable, int i7) {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return;
        }
        if ((i7 & 8388611) == 8388611) {
            this.mShadowStart = drawable;
        } else if ((i7 & 8388613) == 8388613) {
            this.mShadowEnd = drawable;
        } else if ((i7 & 3) == 3) {
            this.mShadowLeft = drawable;
        } else if ((i7 & 5) != 5) {
            return;
        } else {
            this.mShadowRight = drawable;
        }
        a();
        invalidate();
    }

    public void setDrawerTitle(int i7, @Nullable CharSequence charSequence) {
        WeakHashMap weakHashMap = N.f16168a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, getLayoutDirection());
        if (absoluteGravity == 3) {
            this.mTitleLeft = charSequence;
        } else if (absoluteGravity == 5) {
            this.mTitleRight = charSequence;
        }
    }

    public void setDrawerViewOffset(View view, float f10) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f10 == layoutParams.f16819b) {
            return;
        }
        layoutParams.f16819b = f10;
        dispatchOnDrawerSlide(view, f10);
    }

    public void setScrimColor(@ColorInt int i7) {
        this.mScrimColor = i7;
        invalidate();
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        this.mStatusBarBackground = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@ColorInt int i7) {
        this.mStatusBarBackground = new ColorDrawable(i7);
        invalidate();
    }

    public void updateDrawerState(int i7, View view) {
        int i10;
        int i11 = this.mLeftDragger.f16391a;
        int i12 = this.mRightDragger.f16391a;
        if (i11 == 1 || i12 == 1) {
            i10 = 1;
        } else {
            i10 = 2;
            if (i11 != 2 && i12 != 2) {
                i10 = 0;
            }
        }
        if (view != null && i7 == 0) {
            float f10 = ((LayoutParams) view.getLayoutParams()).f16819b;
            if (f10 == 0.0f) {
                dispatchOnDrawerClosed(view);
            } else if (f10 == 1.0f) {
                dispatchOnDrawerOpened(view);
            }
        }
        if (i10 != this.mDrawerState) {
            this.mDrawerState = i10;
            List<DrawerListener> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerStateChanged(i10);
                }
            }
        }
    }

    public DrawerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p211o0.a.drawerLayoutStyle);
    }

    public void closeDrawer(@NonNull View view, boolean z3) {
        if (!isDrawerView(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.mFirstLayout) {
            layoutParams.f16819b = 0.0f;
            layoutParams.f16821d = 0;
        } else if (z3) {
            layoutParams.f16821d |= 4;
            if (checkDrawerViewAbsoluteGravity(view, 3)) {
                this.mLeftDragger.v(view, -view.getWidth(), view.getTop());
            } else {
                this.mRightDragger.v(view, getWidth(), view.getTop());
            }
        } else {
            moveDrawerToOffset(view, 0.0f);
            updateDrawerState(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public void closeDrawers(boolean z3) {
        int childCount = getChildCount();
        boolean zV = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (isDrawerView(childAt) && (!z3 || layoutParams.f16820c)) {
                zV |= checkDrawerViewAbsoluteGravity(childAt, 3) ? this.mLeftDragger.v(childAt, -childAt.getWidth(), childAt.getTop()) : this.mRightDragger.v(childAt, getWidth(), childAt.getTop());
                layoutParams.f16820c = false;
            }
        }
        f fVar = this.mLeftCallback;
        fVar.f16832d.removeCallbacks(fVar.f16831c);
        f fVar2 = this.mRightCallback;
        fVar2.f16832d.removeCallbacks(fVar2.f16831c);
        if (zV) {
            invalidate();
        }
    }

    public void openDrawer(@NonNull View view, boolean z3) {
        if (!isDrawerView(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.mFirstLayout) {
            layoutParams.f16819b = 1.0f;
            layoutParams.f16821d = 1;
            c(view, true);
            b(view);
        } else if (z3) {
            layoutParams.f16821d |= 2;
            if (checkDrawerViewAbsoluteGravity(view, 3)) {
                this.mLeftDragger.v(view, 0, view.getTop());
            } else {
                this.mRightDragger.v(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            moveDrawerToOffset(view, 1.0f);
            updateDrawerState(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public DrawerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mChildAccessibilityDelegate = new c();
        this.mScrimColor = DEFAULT_SCRIM_COLOR;
        this.mScrimPaint = new Paint();
        this.mFirstLayout = true;
        this.mLockModeLeft = 3;
        this.mLockModeRight = 3;
        this.mLockModeStart = 3;
        this.mLockModeEnd = 3;
        this.mShadowStart = null;
        this.mShadowEnd = null;
        this.mShadowLeft = null;
        this.mShadowRight = null;
        this.mActionDismiss = new r(this, 12);
        setDescendantFocusability(CodePushConstants.DOWNLOAD_BUFFER_SIZE);
        float f10 = getResources().getDisplayMetrics().density;
        this.mMinDrawerMargin = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        f fVar = new f(this, 3);
        this.mLeftCallback = fVar;
        f fVar2 = new f(this, 5);
        this.mRightCallback = fVar2;
        g gVarI = g.i(this, 1.0f, fVar);
        this.mLeftDragger = gVarI;
        gVarI.f16407q = 1;
        gVarI.f16404n = f11;
        fVar.f16830b = gVarI;
        g gVarI2 = g.i(this, 1.0f, fVar2);
        this.mRightDragger = gVarI2;
        gVarI2.f16407q = 2;
        gVarI2.f16404n = f11;
        fVar2.f16830b = gVarI2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = N.f16168a;
        setImportantForAccessibility(1);
        N.q(this, new b(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new a());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(THEME_ATTRS);
            try {
                this.mStatusBarBackground = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, p211o0.c.DrawerLayout, i7, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(p211o0.c.DrawerLayout_elevation)) {
                this.mDrawerElevation = typedArrayObtainStyledAttributes2.getDimension(p211o0.c.DrawerLayout_elevation, 0.0f);
            } else {
                this.mDrawerElevation = getResources().getDimension(p211o0.b.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.mNonDrawerViews = new ArrayList<>();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public void setDrawerLockMode(int i7, int i10) {
        View viewFindDrawerWithGravity;
        WeakHashMap weakHashMap = N.f16168a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
        if (i10 == 3) {
            this.mLockModeLeft = i7;
        } else if (i10 == 5) {
            this.mLockModeRight = i7;
        } else if (i10 == 8388611) {
            this.mLockModeStart = i7;
        } else if (i10 == 8388613) {
            this.mLockModeEnd = i7;
        }
        if (i7 != 0) {
            (absoluteGravity == 3 ? this.mLeftDragger : this.mRightDragger).b();
        }
        if (i7 != 1) {
            if (i7 == 2 && (viewFindDrawerWithGravity = findDrawerWithGravity(absoluteGravity)) != null) {
                openDrawer(viewFindDrawerWithGravity);
                return;
            }
            return;
        }
        View viewFindDrawerWithGravity2 = findDrawerWithGravity(absoluteGravity);
        if (viewFindDrawerWithGravity2 != null) {
            closeDrawer(viewFindDrawerWithGravity2);
        }
    }

    public void setStatusBarBackground(int i7) {
        this.mStatusBarBackground = i7 != 0 ? getContext().getDrawable(i7) : null;
        invalidate();
    }

    public boolean isDrawerVisible(int i7) {
        View viewFindDrawerWithGravity = findDrawerWithGravity(i7);
        if (viewFindDrawerWithGravity != null) {
            return isDrawerVisible(viewFindDrawerWithGravity);
        }
        return false;
    }

    public boolean isDrawerOpen(int i7) {
        View viewFindDrawerWithGravity = findDrawerWithGravity(i7);
        if (viewFindDrawerWithGravity != null) {
            return isDrawerOpen(viewFindDrawerWithGravity);
        }
        return false;
    }

    public void setDrawerShadow(@DrawableRes int i7, int i10) {
        setDrawerShadow(getContext().getDrawable(i7), i10);
    }

    public int getDrawerLockMode(@NonNull View view) {
        if (isDrawerView(view)) {
            return getDrawerLockMode(((LayoutParams) view.getLayoutParams()).f16818a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setDrawerLockMode(int i7, @NonNull View view) {
        if (isDrawerView(view)) {
            setDrawerLockMode(i7, ((LayoutParams) view.getLayoutParams()).f16818a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void closeDrawer(int i7) {
        closeDrawer(i7, true);
    }

    public void closeDrawer(int i7, boolean z3) {
        View viewFindDrawerWithGravity = findDrawerWithGravity(i7);
        if (viewFindDrawerWithGravity != null) {
            closeDrawer(viewFindDrawerWithGravity, z3);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + gravityToString(i7));
        }
    }

    public void openDrawer(int i7) {
        openDrawer(i7, true);
    }

    public void openDrawer(int i7, boolean z3) {
        View viewFindDrawerWithGravity = findDrawerWithGravity(i7);
        if (viewFindDrawerWithGravity != null) {
            openDrawer(viewFindDrawerWithGravity, z3);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + gravityToString(i7));
        }
    }
}
