package androidx.coordinatorlayout.widget;

import C0.G;
import Gb.Q;
import M.n;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools$Pool;
import androidx.core.view.C;
import androidx.core.view.C1066s;
import androidx.core.view.E;
import androidx.core.view.N;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.q0;
import androidx.customview.view.AbsSavedState;
import com.alibaba.android.arouter.utils.Consts;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2, NestedScrollingParent3 {
    static final Class<?>[] CONSTRUCTOR_PARAMS;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final String TAG = "CoordinatorLayout";
    static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final String WIDGET_PACKAGE_NAME;
    static final ThreadLocal<Map<String, Constructor<Behavior>>> sConstructors;
    private static final Pools$Pool<Rect> sRectPool;
    private OnApplyWindowInsetsListener mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final f mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private q0 mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final C1066s mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private d mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List<View> mTempList1;

    public interface AttachedBehavior {
        @NonNull
        Behavior getBehavior();
    }

    public static abstract class Behavior<V extends View> {
        public Behavior(Context context, AttributeSet attributeSet) {
        }

        @Nullable
        public static Object getTag(@NonNull View view) {
            return ((c) view.getLayoutParams()).f15889r;
        }

        public static void setTag(@NonNull View view, @Nullable Object obj) {
            ((c) view.getLayoutParams()).f15889r = obj;
        }

        public boolean blocksInteractionBelow(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3) {
            return getScrimOpacity(coordinatorLayout, v3) > 0.0f;
        }

        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull Rect rect) {
            return false;
        }

        @ColorInt
        public int getScrimColor(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3) {
            return -16777216;
        }

        @FloatRange(from = 0.0d, to = 1.0d)
        public float getScrimOpacity(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3) {
            return 0.0f;
        }

        public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view) {
            return false;
        }

        @NonNull
        public q0 onApplyWindowInsets(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull q0 q0Var) {
            return q0Var;
        }

        public void onAttachedToLayoutParams(@NonNull c cVar) {
        }

        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view) {
            return false;
        }

        public void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, int i7) {
            return false;
        }

        public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, int i7, int i10, int i11, int i12) {
            return false;
        }

        public boolean onNestedFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, float f10, float f11, boolean z3) {
            return false;
        }

        public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, float f10, float f11) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, int i7, int i10, @NonNull int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, int i7, int i10, int i11, int i12) {
        }

        @Deprecated
        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, @NonNull View view2, int i7) {
        }

        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull Rect rect, boolean z3) {
            return false;
        }

        public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull Parcelable parcelable) {
        }

        @Nullable
        public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, @NonNull View view2, int i7) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view) {
        }

        public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, int i7, int i10, @NonNull int[] iArr, int i11) {
            if (i11 == 0) {
                onNestedPreScroll(coordinatorLayout, v3, view, i7, i10, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, int i7, int i10, int i11, int i12, int i13) {
            if (i13 == 0) {
                onNestedScroll(coordinatorLayout, v3, view, i7, i10, i11, i12);
            }
        }

        public void onNestedScrollAccepted(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, @NonNull View view2, int i7, int i10) {
            if (i10 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v3, view, view2, i7);
            }
        }

        public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, @NonNull View view2, int i7, int i10) {
            if (i10 == 0) {
                return onStartNestedScroll(coordinatorLayout, v3, view, view2, i7);
            }
            return false;
        }

        public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, int i7) {
            if (i7 == 0) {
                onStopNestedScroll(coordinatorLayout, v3, view);
            }
        }

        public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull View view, int i7, int i10, int i11, int i12, int i13, @NonNull int[] iArr) {
            iArr[0] = iArr[0] + i11;
            iArr[1] = iArr[1] + i12;
            onNestedScroll(coordinatorLayout, v3, view, i7, i10, i11, i12, i13);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface DefaultBehavior {
        Class<? extends Behavior> value();
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({p192n.c.f39802c})
    public @interface DispatchChangeEvent {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SparseArray f15869a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i7 = parcel.readInt();
            int[] iArr = new int[i7];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f15869a = new SparseArray(i7);
            for (int i10 = 0; i10 < i7; i10++) {
                this.f15869a.append(iArr[i10], parcelableArray[i10]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            SparseArray sparseArray = this.f15869a;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = this.f15869a.keyAt(i10);
                parcelableArr[i10] = (Parcelable) this.f15869a.valueAt(i10);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i7);
        }
    }

    static {
        Package r3 = CoordinatorLayout.class.getPackage();
        WIDGET_PACKAGE_NAME = r3 != null ? r3.getName() : null;
        TOP_SORTED_CHILDREN_COMPARATOR = new Q(8);
        CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        sConstructors = new ThreadLocal<>();
        sRectPool = new p058e0.b(12);
    }

    public CoordinatorLayout(@NonNull Context context) {
        this(context, null);
    }

    public static Rect a() {
        Rect rectAcquire = sRectPool.acquire();
        return rectAcquire == null ? new Rect() : rectAcquire;
    }

    public static void c(int i7, Rect rect, Rect rect2, c cVar, int i10, int i11) {
        int iWidth;
        int iHeight;
        int i12 = cVar.f15874c;
        if (i12 == 0) {
            i12 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, i7);
        int i13 = cVar.f15875d;
        if ((i13 & 7) == 0) {
            i13 |= 8388611;
        }
        if ((i13 & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR) == 0) {
            i13 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i13, i7);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR;
        int i16 = absoluteGravity2 & 7;
        int i17 = absoluteGravity2 & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR;
        if (i16 != 1) {
            iWidth = i16 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i17 != 16) {
            iHeight = i17 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i14 == 1) {
            iWidth -= i10 / 2;
        } else if (i14 != 5) {
            iWidth -= i10;
        }
        if (i15 == 16) {
            iHeight -= i11 / 2;
        } else if (i15 != 80) {
            iHeight -= i11;
        }
        rect2.set(iWidth, iHeight, i10 + iWidth, i11 + iHeight);
    }

    public static void i(int i7, View view) {
        c cVar = (c) view.getLayoutParams();
        int i10 = cVar.f15880i;
        if (i10 != i7) {
            WeakHashMap weakHashMap = N.f16168a;
            view.offsetLeftAndRight(i7 - i10);
            cVar.f15880i = i7;
        }
    }

    public static void j(int i7, View view) {
        c cVar = (c) view.getLayoutParams();
        int i10 = cVar.f15881j;
        if (i10 != i7) {
            WeakHashMap weakHashMap = N.f16168a;
            view.offsetTopAndBottom(i7 - i10);
            cVar.f15881j = i7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Behavior parseBehavior(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(Consts.DOT)) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = sConstructors;
            Map<String, Constructor<Behavior>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<Behavior> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException(G.o("Could not inflate Behavior subclass ", str), e10);
        }
    }

    public void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new d(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    public final void b(c cVar, Rect rect, int i7, int i10) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i7) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) cVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i10) - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin));
        rect.set(iMax, iMax2, i7 + iMax, i10 + iMax2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof c) && super.checkLayoutParams(layoutParams);
    }

    public final int d(int i7) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            Log.e(TAG, "No keylines defined for " + this + " - attempted index lookup " + i7);
            return 0;
        }
        if (i7 >= 0 && i7 < iArr.length) {
            return iArr[i7];
        }
        Log.e(TAG, "Keyline index " + i7 + " out of range for " + this);
        return 0;
    }

    public void dispatchDependentViewsChanged(@NonNull View view) {
        ArrayList arrayList = (ArrayList) this.mChildDag.f15892b.get(view);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            View view2 = (View) arrayList.get(i7);
            Behavior behavior = ((c) view2.getLayoutParams()).f15872a;
            if (behavior != null) {
                behavior.onDependentViewChanged(this, view2, view);
            }
        }
    }

    public boolean doViewsOverlap(@NonNull View view, @NonNull View view2) {
        boolean z3 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect rectA = a();
        getChildRect(view, view.getParent() != this, rectA);
        Rect rectA2 = a();
        getChildRect(view2, view2.getParent() != this, rectA2);
        try {
            if (rectA.left <= rectA2.right && rectA.top <= rectA2.bottom && rectA.right >= rectA2.left && rectA.bottom >= rectA2.top) {
                z3 = true;
            }
            return z3;
        } finally {
            rectA.setEmpty();
            Pools$Pool<Rect> pools$Pool = sRectPool;
            pools$Pool.release(rectA);
            rectA2.setEmpty();
            pools$Pool.release(rectA2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0091  */
    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j6) {
        c cVar = (c) view.getLayoutParams();
        Behavior behavior = cVar.f15872a;
        if (behavior != null) {
            float scrimOpacity = behavior.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(cVar.f15872a.getScrimColor(this, view));
                Paint paint = this.mScrimPaint;
                int iRound = Math.round(scrimOpacity * 255.0f);
                if (iRound < 0) {
                    iRound = 0;
                } else if (iRound > 255) {
                    iRound = 255;
                }
                paint.setAlpha(iRound);
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.mScrimPaint);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final boolean e(Behavior behavior, View view, MotionEvent motionEvent, int i7) {
        if (i7 == 0) {
            return behavior.onInterceptTouchEvent(this, view, motionEvent);
        }
        if (i7 == 1) {
            return behavior.onTouchEvent(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    public void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z3 = false;
        loop0: for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            n nVar = this.mChildDag.f15892b;
            int i10 = nVar.f5695c;
            for (int i11 = 0; i11 < i10; i11++) {
                ArrayList arrayList = (ArrayList) nVar.j(i11);
                if (arrayList != null && arrayList.contains(childAt)) {
                    z3 = true;
                    break loop0;
                }
            }
        }
        if (z3 != this.mNeedsPreDrawListener) {
            if (z3) {
                addPreDrawListener();
            } else {
                removePreDrawListener();
            }
        }
    }

    public final boolean f(MotionEvent motionEvent, int i7) {
        boolean z3;
        boolean zBlocksInteractionBelow;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.mTempList1;
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator<View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEventObtain = null;
        int i11 = 0;
        boolean zE = false;
        boolean z8 = false;
        while (i11 < size) {
            View view = list.get(i11);
            c cVar = (c) view.getLayoutParams();
            Behavior behavior = cVar.f15872a;
            if (!(zE || z8) || actionMasked == 0) {
                if (!z8 && !zE && behavior != null) {
                    zE = e(behavior, view, motionEvent, i7);
                    if (zE) {
                        this.mBehaviorTouchView = view;
                        if (actionMasked != 3 && actionMasked != 1) {
                            for (int i12 = 0; i12 < i11; i12++) {
                                View view2 = list.get(i12);
                                Behavior behavior2 = ((c) view2.getLayoutParams()).f15872a;
                                if (behavior2 != null) {
                                    if (motionEventObtain == null) {
                                        motionEventObtain = MotionEvent.obtain(motionEvent);
                                        motionEventObtain.setAction(3);
                                    }
                                    e(behavior2, view2, motionEventObtain, i7);
                                }
                            }
                        }
                    }
                }
                Behavior behavior3 = cVar.f15872a;
                if (behavior3 == null) {
                    cVar.f15884m = false;
                }
                boolean z10 = cVar.f15884m;
                if (z10) {
                    zBlocksInteractionBelow = true;
                } else {
                    zBlocksInteractionBelow = (behavior3 != null ? behavior3.blocksInteractionBelow(this, view) : false) | z10;
                    cVar.f15884m = zBlocksInteractionBelow;
                }
                z3 = zBlocksInteractionBelow && !z10;
                if (zBlocksInteractionBelow && !z3) {
                    break;
                }
            } else {
                if (behavior != null) {
                    if (motionEventObtain == null) {
                        motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction(3);
                    }
                    e(behavior, view, motionEventObtain, i7);
                }
                z3 = z8;
            }
            i11++;
            z8 = z3;
        }
        list.clear();
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        return zE;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0076  */
    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0089  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x008d
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void g() {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.g():void");
    }

    public void getChildRect(View view, boolean z3, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z3) {
            getDescendantRect(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @NonNull
    public List<View> getDependencies(@NonNull View view) {
        n nVar = this.mChildDag.f15892b;
        int i7 = nVar.f5695c;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < i7; i10++) {
            ArrayList arrayList2 = (ArrayList) nVar.j(i10);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(nVar.f(i10));
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    @VisibleForTesting
    public final List<View> getDependencySortedChildren() {
        g();
        return Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    @NonNull
    public List<View> getDependents(@NonNull View view) {
        ArrayList arrayList = (ArrayList) this.mChildDag.f15892b.get(view);
        ArrayList arrayList2 = arrayList == null ? null : new ArrayList(arrayList);
        return arrayList2 == null ? Collections.EMPTY_LIST : arrayList2;
    }

    public void getDescendantRect(View view, Rect rect) {
        ThreadLocal threadLocal = g.f15895a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = g.f15895a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        g.a(this, view, matrix);
        ThreadLocal threadLocal3 = g.f15896b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public void getDesiredAnchoredChildRect(View view, int i7, Rect rect, Rect rect2) {
        c cVar = (c) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        c(i7, rect, rect2, cVar, measuredWidth, measuredHeight);
        b(cVar, rect2, measuredWidth, measuredHeight);
    }

    public void getLastChildRect(View view, Rect rect) {
        rect.set(((c) view.getLayoutParams()).f15888q);
    }

    @RestrictTo({p192n.c.f39802c})
    public final q0 getLastWindowInsets() {
        return this.mLastInsets;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c getResolvedLayoutParams(View view) {
        c cVar = (c) view.getLayoutParams();
        if (!cVar.f15873b) {
            if (view instanceof AttachedBehavior) {
                Behavior behavior = ((AttachedBehavior) view).getBehavior();
                if (behavior == null) {
                    Log.e(TAG, "Attached behavior class is null");
                }
                cVar.b(behavior);
                cVar.f15873b = true;
                return cVar;
            }
            DefaultBehavior defaultBehavior = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                defaultBehavior = (DefaultBehavior) superclass.getAnnotation(DefaultBehavior.class);
                if (defaultBehavior != null) {
                    break;
                }
            }
            if (defaultBehavior != null) {
                try {
                    cVar.b(defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception e10) {
                    Log.e(TAG, "Default behavior class " + defaultBehavior.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                }
            }
            cVar.f15873b = true;
        }
        return cVar;
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h() {
        View view = this.mBehaviorTouchView;
        if (view != null) {
            Behavior behavior = ((c) view.getLayoutParams()).f15872a;
            if (behavior != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                behavior.onTouchEvent(this, this.mBehaviorTouchView, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.mBehaviorTouchView = null;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ((c) getChildAt(i7).getLayoutParams()).f15884m = false;
        }
        this.mDisallowInterceptReset = false;
    }

    public boolean isPointInChildBounds(@NonNull View view, int i7, int i10) {
        Rect rectA = a();
        getDescendantRect(view, rectA);
        try {
            return rectA.contains(i7, i10);
        } finally {
            rectA.setEmpty();
            sRectPool.release(rectA);
        }
    }

    public final void k() {
        WeakHashMap weakHashMap = N.f16168a;
        if (!getFitsSystemWindows()) {
            E.n(this, null);
            return;
        }
        if (this.mApplyWindowInsetsListener == null) {
            this.mApplyWindowInsetsListener = new a(this);
        }
        E.n(this, this.mApplyWindowInsetsListener);
        setSystemUiVisibility(1280);
    }

    public void offsetChildToAnchor(View view, int i7) {
        Behavior behavior;
        c cVar = (c) view.getLayoutParams();
        if (cVar.f15882k != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            Rect rectA3 = a();
            getDescendantRect(cVar.f15882k, rectA);
            getChildRect(view, false, rectA2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            c(i7, rectA, rectA3, cVar, measuredWidth, measuredHeight);
            boolean z3 = (rectA3.left == rectA2.left && rectA3.top == rectA2.top) ? false : true;
            b(cVar, rectA3, measuredWidth, measuredHeight);
            int i10 = rectA3.left - rectA2.left;
            int i11 = rectA3.top - rectA2.top;
            if (i10 != 0) {
                WeakHashMap weakHashMap = N.f16168a;
                view.offsetLeftAndRight(i10);
            }
            if (i11 != 0) {
                WeakHashMap weakHashMap2 = N.f16168a;
                view.offsetTopAndBottom(i11);
            }
            if (z3 && (behavior = cVar.f15872a) != null) {
                behavior.onDependentViewChanged(this, view, cVar.f15882k);
            }
            rectA.setEmpty();
            Pools$Pool<Rect> pools$Pool = sRectPool;
            pools$Pool.release(rectA);
            rectA2.setEmpty();
            pools$Pool.release(rectA2);
            rectA3.setEmpty();
            pools$Pool.release(rectA3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h();
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new d(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null) {
            WeakHashMap weakHashMap = N.f16168a;
            if (getFitsSystemWindows()) {
                C.c(this);
            }
        }
        this.mIsAttachedToWindow = true;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0229  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r20v0, types: [android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final void onChildViewsChanged(int i7) {
        ?? r16;
        int i10;
        int i11;
        int i12;
        Behavior behavior;
        int i13;
        boolean zOnDependentViewChanged;
        boolean z3;
        boolean z8;
        int width;
        int i14;
        int i15;
        int i16;
        int height;
        int i17;
        int i18;
        int i19;
        int i20 = 80;
        int i21 = 48;
        ?? r10 = 1;
        WeakHashMap weakHashMap = N.f16168a;
        int layoutDirection = getLayoutDirection();
        int size = this.mDependencySortedChildren.size();
        Rect rectA = a();
        Rect rectA2 = a();
        Rect rectA3 = a();
        int i22 = 0;
        while (i22 < size) {
            View view = this.mDependencySortedChildren.get(i22);
            c cVar = (c) view.getLayoutParams();
            if (i7 == 0 && view.getVisibility() == 8) {
                i10 = i20;
                i11 = i22;
            } else {
                for (int i23 = 0; i23 < i22; i23 += r10 == true ? 1 : 0) {
                    if (cVar.f15883l == this.mDependencySortedChildren.get(i23)) {
                        offsetChildToAnchor(view, layoutDirection);
                    }
                }
                getChildRect(view, r10, rectA2);
                if (cVar.f15878g == 0 || rectA2.isEmpty()) {
                    r16 = r10 == true ? 1 : 0;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(cVar.f15878g, layoutDirection);
                    int i24 = absoluteGravity & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR;
                    if (i24 == i21) {
                        rectA.top = Math.max(rectA.top, rectA2.bottom);
                    } else if (i24 == i20) {
                        rectA.bottom = Math.max(rectA.bottom, getHeight() - rectA2.top);
                    }
                    int i25 = absoluteGravity & 7;
                    if (i25 == 3) {
                        rectA.left = Math.max(rectA.left, rectA2.right);
                        r16 = r10;
                    } else if (i25 == 5) {
                        r16 = r10;
                        rectA.right = Math.max(rectA.right, getWidth() - rectA2.left);
                        r16 = r10;
                    }
                }
                r16 = r10;
                if (cVar.f15879h == 0 || view.getVisibility() != 0) {
                    i10 = i20;
                    i11 = i22;
                } else {
                    WeakHashMap weakHashMap2 = N.f16168a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        c cVar2 = (c) view.getLayoutParams();
                        Behavior behavior2 = cVar2.f15872a;
                        Rect rectA4 = a();
                        Rect rectA5 = a();
                        int i26 = i20;
                        int i27 = i21;
                        i11 = i22;
                        rectA5.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (behavior2 == null || !behavior2.getInsetDodgeRect(this, view, rectA4)) {
                            rectA4.set(rectA5);
                        } else if (!rectA5.contains(rectA4)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA4.toShortString() + " | Bounds:" + rectA5.toShortString());
                        }
                        rectA5.setEmpty();
                        Pools$Pool<Rect> pools$Pool = sRectPool;
                        pools$Pool.release(rectA5);
                        if (rectA4.isEmpty()) {
                            rectA4.setEmpty();
                            pools$Pool.release(rectA4);
                            i10 = i26;
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(cVar2.f15879h, layoutDirection);
                            if ((absoluteGravity2 & 48) != i27 || (i18 = (rectA4.top - ((ViewGroup.MarginLayoutParams) cVar2).topMargin) - cVar2.f15881j) >= (i19 = rectA.top)) {
                                z3 = false;
                            } else {
                                j(i19 - i18, view);
                                z3 = r16 == true ? 1 : 0;
                            }
                            i10 = i26;
                            boolean z10 = z3;
                            if ((absoluteGravity2 & 80) == i10 && (height = ((getHeight() - rectA4.bottom) - ((ViewGroup.MarginLayoutParams) cVar2).bottomMargin) + cVar2.f15881j) < (i17 = rectA.bottom)) {
                                z10 = z3;
                                j(height - i17, view);
                                z10 = r16 == true ? 1 : 0;
                            }
                            if (!z10) {
                                j(0, view);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i15 = (rectA4.left - ((ViewGroup.MarginLayoutParams) cVar2).leftMargin) - cVar2.f15880i) >= (i16 = rectA.left)) {
                                z8 = false;
                            } else {
                                i(i16 - i15, view);
                                z8 = r16 == true ? 1 : 0;
                            }
                            boolean z11 = z8;
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectA4.right) - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin) + cVar2.f15880i) < (i14 = rectA.right)) {
                                z11 = z8;
                                i(width - i14, view);
                                z11 = r16 == true ? 1 : 0;
                            }
                            if (!z11) {
                                i(0, view);
                            }
                            rectA4.setEmpty();
                            pools$Pool.release(rectA4);
                        }
                    } else {
                        i10 = i20;
                        i11 = i22;
                    }
                }
                if (i7 != 2) {
                    getLastChildRect(view, rectA3);
                    if (!rectA3.equals(rectA2)) {
                        recordLastChildRect(view, rectA2);
                        i12 = i11 + 1;
                        r16 = r16;
                        while (i12 < size) {
                            View view2 = this.mDependencySortedChildren.get(i12);
                            c cVar3 = (c) view2.getLayoutParams();
                            behavior = cVar3.f15872a;
                            if (behavior != null || !behavior.layoutDependsOn(this, view2, view)) {
                                i13 = r16 == true ? 1 : 0;
                            } else if (i7 == 0 && cVar3.f15887p) {
                                cVar3.f15887p = false;
                                i13 = r16 == true ? 1 : 0;
                            } else {
                                if (i7 != 2) {
                                    zOnDependentViewChanged = behavior.onDependentViewChanged(this, view2, view);
                                    i13 = r16 == true ? 1 : 0;
                                } else {
                                    behavior.onDependentViewRemoved(this, view2, view);
                                    zOnDependentViewChanged = r16 == true ? 1 : 0;
                                    i13 = zOnDependentViewChanged ? 1 : 0;
                                }
                                if (i7 == i13) {
                                    cVar3.f15887p = zOnDependentViewChanged;
                                }
                            }
                            i12 += i13;
                            r16 = i13;
                        }
                    }
                } else {
                    i12 = i11 + 1;
                    r16 = r16;
                    while (i12 < size) {
                        View view3 = this.mDependencySortedChildren.get(i12);
                        c cVar4 = (c) view3.getLayoutParams();
                        behavior = cVar4.f15872a;
                        if (behavior != null) {
                            i13 = r16 == true ? 1 : 0;
                        } else {
                            i13 = r16 == true ? 1 : 0;
                        }
                        i12 += i13;
                        r16 = i13;
                    }
                }
                r10 = r16;
            }
            i22 = i11 + 1;
            i20 = i10;
            i21 = 48;
            r10 = r10;
        }
        rectA.setEmpty();
        Pools$Pool<Rect> pools$Pool2 = sRectPool;
        pools$Pool2.release(rectA);
        rectA2.setEmpty();
        pools$Pool2.release(rectA2);
        rectA3.setEmpty();
        pools$Pool2.release(rectA3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.mDrawStatusBarBackground || this.mStatusBarBackground == null) {
            return;
        }
        q0 q0Var = this.mLastInsets;
        int iD = q0Var != null ? q0Var.d() : 0;
        if (iD > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), iD);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            h();
        }
        boolean zF = f(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zF;
        }
        this.mBehaviorTouchView = null;
        h();
        return zF;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        Behavior behavior;
        WeakHashMap weakHashMap = N.f16168a;
        int layoutDirection = getLayoutDirection();
        int size = this.mDependencySortedChildren.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view = this.mDependencySortedChildren.get(i13);
            if (view.getVisibility() != 8 && ((behavior = ((c) view.getLayoutParams()).f15872a) == null || !behavior.onLayoutChild(this, view, layoutDirection))) {
                onLayoutChild(view, layoutDirection);
            }
        }
    }

    public void onLayoutChild(@NonNull View view, int i7) {
        int i10;
        c cVar = (c) view.getLayoutParams();
        View view2 = cVar.f15882k;
        if (view2 == null && cVar.f15877f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            try {
                getDescendantRect(view2, rectA);
                getDesiredAnchoredChildRect(view, i7, rectA, rectA2);
                view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
                return;
            } finally {
                rectA.setEmpty();
                Pools$Pool<Rect> pools$Pool = sRectPool;
                pools$Pool.release(rectA);
                rectA2.setEmpty();
                pools$Pool.release(rectA2);
            }
        }
        int i11 = cVar.f15876e;
        if (i11 >= 0) {
            c cVar2 = (c) view.getLayoutParams();
            int i12 = cVar2.f15874c;
            if (i12 == 0) {
                i12 = 8388661;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(i12, i7);
            int i13 = absoluteGravity & 7;
            int i14 = absoluteGravity & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (i7 == 1) {
                i11 = width - i11;
            }
            int iD = d(i11) - measuredWidth;
            if (i13 == 1) {
                iD += measuredWidth / 2;
            } else if (i13 == 5) {
                iD += measuredWidth;
            }
            if (i14 != 16) {
                i10 = i14 != 80 ? 0 : measuredHeight;
            } else {
                i10 = measuredHeight / 2;
            }
            int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin, Math.min(iD, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin));
            int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) cVar2).topMargin, Math.min(i10, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) cVar2).bottomMargin));
            view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
            return;
        }
        c cVar3 = (c) view.getLayoutParams();
        Rect rectA3 = a();
        rectA3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) cVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) cVar3).bottomMargin);
        if (this.mLastInsets != null) {
            WeakHashMap weakHashMap = N.f16168a;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rectA3.left = this.mLastInsets.b() + rectA3.left;
                rectA3.top = this.mLastInsets.d() + rectA3.top;
                rectA3.right -= this.mLastInsets.c();
                rectA3.bottom -= this.mLastInsets.a();
            }
        }
        Rect rectA4 = a();
        int i15 = cVar3.f15874c;
        if ((i15 & 7) == 0) {
            i15 |= 8388611;
        }
        if ((i15 & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR) == 0) {
            i15 |= 48;
        }
        Gravity.apply(i15, view.getMeasuredWidth(), view.getMeasuredHeight(), rectA3, rectA4, i7);
        view.layout(rectA4.left, rectA4.top, rectA4.right, rectA4.bottom);
        rectA3.setEmpty();
        Pools$Pool<Rect> pools$Pool2 = sRectPool;
        pools$Pool2.release(rectA3);
        rectA4.setEmpty();
        pools$Pool2.release(rectA4);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:46:0x0102  */
    /* JADX WARN: Code duplicated, block: B:48:0x0124  */
    /* JADX WARN: Code duplicated, block: B:49:0x0129  */
    /* JADX WARN: Code duplicated, block: B:50:0x012c  */
    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int iMax;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        Behavior behavior;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        View view;
        View view2;
        int i24;
        int i25;
        int i26;
        CoordinatorLayout coordinatorLayout = this;
        boolean z3 = true;
        coordinatorLayout.g();
        coordinatorLayout.ensurePreDrawListener();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = N.f16168a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z8 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int i27 = paddingLeft + paddingRight;
        int i28 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z10 = coordinatorLayout.mLastInsets != null && coordinatorLayout.getFitsSystemWindows();
        int size3 = coordinatorLayout.mDependencySortedChildren.size();
        int i29 = 0;
        int iCombineMeasuredStates = 0;
        while (i29 < size3) {
            View view3 = coordinatorLayout.mDependencySortedChildren.get(i29);
            boolean z11 = z3;
            if (view3.getVisibility() == 8) {
                i13 = size3;
                i16 = i29;
                i14 = paddingLeft;
                i19 = paddingRight;
                i17 = layoutDirection;
            } else {
                c cVar = (c) view3.getLayoutParams();
                int i30 = cVar.f15876e;
                if (i30 < 0 || mode == 0) {
                    i11 = suggestedMinimumWidth;
                    i12 = suggestedMinimumHeight;
                } else {
                    int iD = coordinatorLayout.d(i30);
                    i11 = suggestedMinimumWidth;
                    int i31 = cVar.f15874c;
                    if (i31 == 0) {
                        i31 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i31, layoutDirection) & 7;
                    i12 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z8) || (absoluteGravity == 5 && z8)) {
                        iMax = Math.max(0, (size - paddingRight) - iD);
                    } else if ((absoluteGravity == 5 && !z8) || (absoluteGravity == 3 && z8)) {
                        iMax = Math.max(0, iD - paddingLeft);
                    }
                    if (z10 || view3.getFitsSystemWindows()) {
                        iMakeMeasureSpec = i7;
                        iMakeMeasureSpec2 = i10;
                    } else {
                        int iC = coordinatorLayout.mLastInsets.c() + coordinatorLayout.mLastInsets.b();
                        int iA = coordinatorLayout.mLastInsets.a() + coordinatorLayout.mLastInsets.d();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                    }
                    behavior = cVar.f15872a;
                    if (behavior != null) {
                        i16 = i29;
                        i24 = iMax;
                        view2 = view3;
                        i25 = iMakeMeasureSpec;
                        i13 = size3;
                        int i32 = i11;
                        i14 = paddingLeft;
                        i15 = i32;
                        i17 = layoutDirection;
                        i18 = i12;
                        i19 = paddingRight;
                        i20 = iCombineMeasuredStates;
                        i26 = iMakeMeasureSpec2;
                        if (behavior.onMeasureChild(this, view2, i25, i24, i26, 0)) {
                            coordinatorLayout = this;
                        } else {
                            view = view2;
                            i22 = i25;
                            i21 = i24;
                            i23 = i26;
                        }
                        suggestedMinimumWidth = Math.max(i15, view2.getMeasuredWidth() + i27 + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin);
                        int iMax2 = Math.max(i18, view2.getMeasuredHeight() + i28 + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i20, view2.getMeasuredState());
                        suggestedMinimumHeight = iMax2;
                    } else {
                        int i33 = iMakeMeasureSpec;
                        i13 = size3;
                        int i34 = i11;
                        i14 = paddingLeft;
                        i15 = i34;
                        i16 = i29;
                        i17 = layoutDirection;
                        i18 = i12;
                        i19 = paddingRight;
                        i20 = iCombineMeasuredStates;
                        i21 = iMax;
                        i22 = i33;
                        i23 = iMakeMeasureSpec2;
                        view = view3;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.onMeasureChild(view, i22, i21, i23, 0);
                    view2 = view;
                    suggestedMinimumWidth = Math.max(i15, view2.getMeasuredWidth() + i27 + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin);
                    int iMax3 = Math.max(i18, view2.getMeasuredHeight() + i28 + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i20, view2.getMeasuredState());
                    suggestedMinimumHeight = iMax3;
                }
                iMax = 0;
                if (z10) {
                    iMakeMeasureSpec = i7;
                    iMakeMeasureSpec2 = i10;
                } else {
                    iMakeMeasureSpec = i7;
                    iMakeMeasureSpec2 = i10;
                }
                behavior = cVar.f15872a;
                if (behavior != null) {
                    i16 = i29;
                    i24 = iMax;
                    view2 = view3;
                    i25 = iMakeMeasureSpec;
                    i13 = size3;
                    int i35 = i11;
                    i14 = paddingLeft;
                    i15 = i35;
                    i17 = layoutDirection;
                    i18 = i12;
                    i19 = paddingRight;
                    i20 = iCombineMeasuredStates;
                    i26 = iMakeMeasureSpec2;
                    if (behavior.onMeasureChild(this, view2, i25, i24, i26, 0)) {
                        view = view2;
                        i22 = i25;
                        i21 = i24;
                        i23 = i26;
                    } else {
                        coordinatorLayout = this;
                    }
                    suggestedMinimumWidth = Math.max(i15, view2.getMeasuredWidth() + i27 + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin);
                    int iMax4 = Math.max(i18, view2.getMeasuredHeight() + i28 + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i20, view2.getMeasuredState());
                    suggestedMinimumHeight = iMax4;
                } else {
                    int i36 = iMakeMeasureSpec;
                    i13 = size3;
                    int i37 = i11;
                    i14 = paddingLeft;
                    i15 = i37;
                    i16 = i29;
                    i17 = layoutDirection;
                    i18 = i12;
                    i19 = paddingRight;
                    i20 = iCombineMeasuredStates;
                    i21 = iMax;
                    i22 = i36;
                    i23 = iMakeMeasureSpec2;
                    view = view3;
                }
                coordinatorLayout = this;
                coordinatorLayout.onMeasureChild(view, i22, i21, i23, 0);
                view2 = view;
                suggestedMinimumWidth = Math.max(i15, view2.getMeasuredWidth() + i27 + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin);
                int iMax5 = Math.max(i18, view2.getMeasuredHeight() + i28 + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i20, view2.getMeasuredState());
                suggestedMinimumHeight = iMax5;
            }
            i29 = i16 + 1;
            size3 = i13;
            z3 = z11;
            paddingLeft = i14;
            paddingRight = i19;
            layoutDirection = i17;
        }
        int i38 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i7, (-16777216) & i38), View.resolveSizeAndState(suggestedMinimumHeight, i10, i38 << 16));
    }

    public void onMeasureChild(View view, int i7, int i10, int i11, int i12) {
        measureChildWithMargins(view, i7, i10, i11, i12);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z3) {
        Behavior behavior;
        View view2;
        float f12;
        float f13;
        boolean z8;
        int childCount = getChildCount();
        int i7 = 0;
        boolean zOnNestedFling = false;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f12 = f10;
                f13 = f11;
                z8 = z3;
            } else {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a(0) && (behavior = cVar.f15872a) != null) {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    z8 = z3;
                    zOnNestedFling |= behavior.onNestedFling(this, childAt, view2, f12, f13, z8);
                } else {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    z8 = z3;
                }
            }
            i7++;
            view = view2;
            f10 = f12;
            f11 = f13;
            z3 = z8;
        }
        if (zOnNestedFling) {
            onChildViewsChanged(1);
        }
        return zOnNestedFling;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        Behavior behavior;
        View view2;
        float f12;
        float f13;
        int childCount = getChildCount();
        int i7 = 0;
        boolean zOnNestedPreFling = false;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f12 = f10;
                f13 = f11;
            } else {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a(0) && (behavior = cVar.f15872a) != null) {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    zOnNestedPreFling |= behavior.onNestedPreFling(this, childAt, view2, f12, f13);
                } else {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                }
            }
            i7++;
            view = view2;
            f10 = f12;
            f11 = f13;
        }
        return zOnNestedPreFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        onNestedPreScroll(view, i7, i10, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        onNestedScroll(view, i7, i10, i11, i12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        onNestedScrollAccepted(view, view2, i7, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray sparseArray = savedState.f15869a;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int id2 = childAt.getId();
            Behavior behavior = getResolvedLayoutParams(childAt).f15872a;
            if (id2 != -1 && behavior != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                behavior.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int id2 = childAt.getId();
            Behavior behavior = ((c) childAt.getLayoutParams()).f15872a;
            if (id2 != -1 && behavior != null && (parcelableOnSaveInstanceState = behavior.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id2, parcelableOnSaveInstanceState);
            }
        }
        savedState.f15869a = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i7) {
        return onStartNestedScroll(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zF;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.mBehaviorTouchView;
        boolean z3 = false;
        if (view != null) {
            Behavior behavior = ((c) view.getLayoutParams()).f15872a;
            zF = behavior != null ? behavior.onTouchEvent(this, this.mBehaviorTouchView, motionEvent) : false;
        } else {
            zF = f(motionEvent, 1);
            if (actionMasked != 0 && zF) {
                z3 = true;
            }
        }
        if (this.mBehaviorTouchView == null || actionMasked == 3) {
            zF |= super.onTouchEvent(motionEvent);
        } else if (z3) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            super.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return zF;
        }
        this.mBehaviorTouchView = null;
        h();
        return zF;
    }

    public void recordLastChildRect(View view, Rect rect) {
        ((c) view.getLayoutParams()).f15888q.set(rect);
    }

    public void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        Behavior behavior = ((c) view.getLayoutParams()).f15872a;
        if (behavior == null || !behavior.onRequestChildRectangleOnScreen(this, view, rect, z3)) {
            return super.requestChildRectangleOnScreen(view, rect, z3);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        super.requestDisallowInterceptTouchEvent(z3);
        if (!z3 || this.mDisallowInterceptReset) {
            return;
        }
        if (this.mBehaviorTouchView == null) {
            int childCount = getChildCount();
            MotionEvent motionEventObtain = null;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                Behavior behavior = ((c) childAt.getLayoutParams()).f15872a;
                if (behavior != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    behavior.onInterceptTouchEvent(this, childAt, motionEventObtain);
                }
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
        }
        h();
        this.mDisallowInterceptReset = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z3) {
        super.setFitsSystemWindows(z3);
        k();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.mStatusBarBackground = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                Drawable drawable3 = this.mStatusBarBackground;
                WeakHashMap weakHashMap = N.f16168a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.mStatusBarBackground.setVisible(getVisibility() == 0, false);
                this.mStatusBarBackground.setCallback(this);
            }
            WeakHashMap weakHashMap2 = N.f16168a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(@ColorInt int i7) {
        setStatusBarBackground(new ColorDrawable(i7));
    }

    public void setStatusBarBackgroundResource(@DrawableRes int i7) {
        setStatusBarBackground(i7 != 0 ? getContext().getDrawable(i7) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z3 = i7 == 0;
        Drawable drawable = this.mStatusBarBackground;
        if (drawable == null || drawable.isVisible() == z3) {
            return;
        }
        this.mStatusBarBackground.setVisible(z3, false);
    }

    public final q0 setWindowInsets(q0 q0Var) {
        Behavior behavior;
        if (!Objects.equals(this.mLastInsets, q0Var)) {
            this.mLastInsets = q0Var;
            boolean z3 = q0Var != null && q0Var.d() > 0;
            this.mDrawStatusBarBackground = z3;
            setWillNotDraw(!z3 && getBackground() == null);
            if (!q0Var.f16277a.n()) {
                int childCount = getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = getChildAt(i7);
                    WeakHashMap weakHashMap = N.f16168a;
                    if (childAt.getFitsSystemWindows() && (behavior = ((c) childAt.getLayoutParams()).f15872a) != null) {
                        q0Var = behavior.onApplyWindowInsets(this, childAt, q0Var);
                        if (q0Var.f16277a.n()) {
                            break;
                        }
                    }
                }
            }
            requestLayout();
        }
        return q0Var;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground;
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, V.a.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    public c generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i7, int i10, int[] iArr, int i11) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z3 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a(i11) && (behavior = cVar.f15872a) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedPreScroll(this, childAt, view, i7, i10, iArr2, i11);
                    iMax = i7 > 0 ? Math.max(iMax, this.mBehaviorConsumed[0]) : Math.min(iMax, this.mBehaviorConsumed[0]);
                    iMax2 = i10 > 0 ? Math.max(iMax2, this.mBehaviorConsumed[1]) : Math.min(iMax2, this.mBehaviorConsumed[1]);
                    z3 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z3) {
            onChildViewsChanged(1);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i7, int i10, int i11, int i12, int i13) {
        onNestedScroll(view, i7, i10, i11, i12, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i7, int i10) {
        Behavior behavior;
        View view3;
        View view4;
        int i11;
        int i12;
        C1066s c1066s = this.mNestedScrollingParentHelper;
        if (i10 == 1) {
            c1066s.f16286b = i7;
        } else {
            c1066s.f16285a = i7;
        }
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.a(i10) && (behavior = cVar.f15872a) != null) {
                view3 = view;
                view4 = view2;
                i11 = i7;
                i12 = i10;
                behavior.onNestedScrollAccepted(this, childAt, view3, view4, i11, i12);
            } else {
                view3 = view;
                view4 = view2;
                i11 = i7;
                i12 = i10;
            }
            i13++;
            view = view3;
            view2 = view4;
            i7 = i11;
            i10 = i12;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i7, int i10) {
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                Behavior behavior = cVar.f15872a;
                if (behavior != null) {
                    boolean zOnStartNestedScroll = behavior.onStartNestedScroll(this, childAt, view, view2, i7, i10);
                    z3 |= zOnStartNestedScroll;
                    if (i10 == 0) {
                        cVar.f15885n = zOnStartNestedScroll;
                    } else if (i10 == 1) {
                        cVar.f15886o = zOnStartNestedScroll;
                    }
                } else if (i10 == 0) {
                    cVar.f15885n = false;
                } else if (i10 == 1) {
                    cVar.f15886o = false;
                }
            }
        }
        return z3;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i7) {
        C1066s c1066s = this.mNestedScrollingParentHelper;
        if (i7 == 1) {
            c1066s.f16286b = 0;
        } else {
            c1066s.f16285a = 0;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.a(i7)) {
                Behavior behavior = cVar.f15872a;
                if (behavior != null) {
                    behavior.onStopNestedScroll(this, childAt, view, i7);
                }
                if (i7 == 0) {
                    cVar.f15885n = false;
                } else if (i7 == 1) {
                    cVar.f15886o = false;
                }
                cVar.f15887p = false;
            }
        }
        this.mNestedScrollingTarget = null;
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i7) {
        TypedArray typedArrayObtainStyledAttributes;
        Context context2;
        CoordinatorLayout coordinatorLayout;
        super(context, attributeSet, i7);
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new f();
        this.mTempList1 = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new C1066s();
        if (i7 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V.c.CoordinatorLayout, 0, V.b.Widget_Support_CoordinatorLayout);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V.c.CoordinatorLayout, i7, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (i7 == 0) {
            coordinatorLayout = this;
            context2 = context;
            N.p(coordinatorLayout, context2, V.c.CoordinatorLayout, attributeSet, typedArray, 0, V.b.Widget_Support_CoordinatorLayout);
        } else {
            context2 = context;
            coordinatorLayout = this;
            N.p(coordinatorLayout, context2, V.c.CoordinatorLayout, attributeSet, typedArray, i7, 0);
        }
        int resourceId = typedArray.getResourceId(V.c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.mKeylines = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.mKeylines.length;
            for (int i10 = 0; i10 < length; i10++) {
                int[] iArr = coordinatorLayout.mKeylines;
                iArr[i10] = (int) (iArr[i10] * f10);
            }
        }
        coordinatorLayout.mStatusBarBackground = typedArray.getDrawable(V.c.CoordinatorLayout_statusBarBackground);
        typedArray.recycle();
        k();
        super.setOnHierarchyChangeListener(new b(this));
        WeakHashMap weakHashMap = N.f16168a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    @Override // android.view.ViewGroup
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NonNull View view, int i7, int i10, int i11, int i12, int i13, @NonNull int[] iArr) {
        Behavior behavior;
        int iMin;
        int iMin2;
        int childCount = getChildCount();
        boolean z3 = false;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a(i13) && (behavior = cVar.f15872a) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedScroll(this, childAt, view, i7, i10, i11, i12, i13, iArr2);
                    if (i11 > 0) {
                        iMin = Math.max(i14, this.mBehaviorConsumed[0]);
                    } else {
                        iMin = Math.min(i14, this.mBehaviorConsumed[0]);
                    }
                    i14 = iMin;
                    if (i12 > 0) {
                        iMin2 = Math.max(i15, this.mBehaviorConsumed[1]);
                    } else {
                        iMin2 = Math.min(i15, this.mBehaviorConsumed[1]);
                    }
                    i15 = iMin2;
                    z3 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i14;
        iArr[1] = iArr[1] + i15;
        if (z3) {
            onChildViewsChanged(1);
        }
    }

    @Override // android.view.ViewGroup
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof c) {
            return new c((c) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }
}
