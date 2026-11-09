package androidx.viewpager.widget;

import C0.G;
import N8.q0;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.camera.video.u;
import androidx.core.view.C1050b;
import androidx.core.view.E;
import androidx.core.view.N;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.customview.view.AbsSavedState;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private int mActivePointerId;
    a mAdapter;
    private List<OnAdapterChangeListener> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<ItemInfo> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private PagerObserver mObserver;
    private int mOffscreenPageLimit;
    private OnPageChangeListener mOnPageChangeListener;
    private List<OnPageChangeListener> mOnPageChangeListeners;
    private int mPageMargin;
    private PageTransformer mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final ItemInfo mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};
    private static final Comparator<ItemInfo> COMPARATOR = new Comparator<ItemInfo>() { // from class: androidx.viewpager.widget.ViewPager.1
        @Override // java.util.Comparator
        public int compare(ItemInfo itemInfo, ItemInfo itemInfo2) {
            return itemInfo.position - itemInfo2.position;
        }
    };
    private static final Interpolator sInterpolator = new Interpolator() { // from class: androidx.viewpager.widget.ViewPager.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };
    private static final ViewPositionComparator sPositionComparator = new ViewPositionComparator();

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DecorView {
    }

    public static class ItemInfo {
        Object object;
        float offset;
        int position;
        boolean scrolling;
        float widthFactor;
    }

    public class MyAccessibilityDelegate extends C1050b {
        public MyAccessibilityDelegate() {
        }

        private boolean canScroll() {
            a aVar = ViewPager.this.mAdapter;
            return aVar != null && aVar.c() > 1;
        }

        @Override // androidx.core.view.C1050b
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            a aVar;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(canScroll());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = ViewPager.this.mAdapter) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.c());
            accessibilityEvent.setFromIndex(ViewPager.this.mCurItem);
            accessibilityEvent.setToIndex(ViewPager.this.mCurItem);
        }

        @Override // androidx.core.view.C1050b
        public void onInitializeAccessibilityNodeInfo(View view, p074f0.d dVar) {
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            dVar.k(ViewPager.class.getName());
            dVar.r(canScroll());
            if (ViewPager.this.canScrollHorizontally(1)) {
                dVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                dVar.a(UserMetadata.MAX_INTERNAL_KEY_SIZE);
            }
        }

        @Override // androidx.core.view.C1050b
        public boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
            if (super.performAccessibilityAction(view, i7, bundle)) {
                return true;
            }
            if (i7 == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.mCurItem + 1);
                return true;
            }
            if (i7 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.mCurItem - 1);
            return true;
        }
    }

    public interface OnAdapterChangeListener {
        void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable a aVar, @Nullable a aVar2);
    }

    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int i7);

        void onPageScrolled(int i7, float f10, @Px int i10);

        void onPageSelected(int i7);
    }

    public interface PageTransformer {
        void transformPage(@NonNull View view, float f10);
    }

    public class PagerObserver extends DataSetObserver {
        public PagerObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.dataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.dataSetChanged();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.viewpager.widget.ViewPager.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };
        Parcelable adapterState;
        ClassLoader loader;
        int position;

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" position=");
            return G.n(this.position, "}", sb2);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.position);
            parcel.writeParcelable(this.adapterState, i7);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.position = parcel.readInt();
            this.adapterState = parcel.readParcelable(classLoader);
            this.loader = classLoader;
        }
    }

    public static class SimpleOnPageChangeListener implements OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i7) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i7, float f10, int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i7) {
        }
    }

    public static class ViewPositionComparator implements Comparator<View> {
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z3 = layoutParams.isDecor;
            if (z3 != layoutParams2.isDecor) {
                return z3 ? 1 : -1;
            }
            return layoutParams.position - layoutParams2.position;
        }
    }

    public ViewPager(@NonNull Context context) {
        super(context);
        this.mItems = new ArrayList<>();
        this.mTempItem = new ItemInfo();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new Runnable() { // from class: androidx.viewpager.widget.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        initViewPager();
    }

    private void calculatePageOffsets(ItemInfo itemInfo, int i7, ItemInfo itemInfo2) {
        int i10;
        int i11;
        ItemInfo itemInfo3;
        ItemInfo itemInfo4;
        int iC = this.mAdapter.c();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        if (itemInfo2 != null) {
            int i12 = itemInfo2.position;
            int i13 = itemInfo.position;
            if (i12 < i13) {
                float f11 = itemInfo2.offset + itemInfo2.widthFactor + f10;
                int i14 = i12 + 1;
                int i15 = 0;
                while (i14 <= itemInfo.position && i15 < this.mItems.size()) {
                    ItemInfo itemInfo5 = this.mItems.get(i15);
                    while (true) {
                        itemInfo4 = itemInfo5;
                        if (i14 <= itemInfo4.position || i15 >= this.mItems.size() - 1) {
                            break;
                        }
                        i15++;
                        itemInfo5 = this.mItems.get(i15);
                    }
                    while (i14 < itemInfo4.position) {
                        f11 += this.mAdapter.f() + f10;
                        i14++;
                    }
                    itemInfo4.offset = f11;
                    f11 += itemInfo4.widthFactor + f10;
                    i14++;
                }
            } else if (i12 > i13) {
                int size = this.mItems.size() - 1;
                float f12 = itemInfo2.offset;
                while (true) {
                    i12--;
                    if (i12 < itemInfo.position || size < 0) {
                        break;
                    }
                    ItemInfo itemInfo6 = this.mItems.get(size);
                    while (true) {
                        itemInfo3 = itemInfo6;
                        if (i12 >= itemInfo3.position || size <= 0) {
                            break;
                        }
                        size--;
                        itemInfo6 = this.mItems.get(size);
                    }
                    while (i12 > itemInfo3.position) {
                        f12 -= this.mAdapter.f() + f10;
                        i12--;
                    }
                    f12 -= itemInfo3.widthFactor + f10;
                    itemInfo3.offset = f12;
                }
            }
        }
        int size2 = this.mItems.size();
        float f13 = itemInfo.offset;
        int i16 = itemInfo.position;
        int i17 = i16 - 1;
        this.mFirstOffset = i16 == 0 ? f13 : -3.4028235E38f;
        int i18 = iC - 1;
        this.mLastOffset = i16 == i18 ? (itemInfo.widthFactor + f13) - 1.0f : Float.MAX_VALUE;
        int i19 = i7 - 1;
        while (i19 >= 0) {
            ItemInfo itemInfo7 = this.mItems.get(i19);
            while (true) {
                i11 = itemInfo7.position;
                if (i17 <= i11) {
                    break;
                }
                i17--;
                f13 -= this.mAdapter.f() + f10;
            }
            f13 -= itemInfo7.widthFactor + f10;
            itemInfo7.offset = f13;
            if (i11 == 0) {
                this.mFirstOffset = f13;
            }
            i19--;
            i17--;
        }
        float f14 = itemInfo.offset + itemInfo.widthFactor + f10;
        int i20 = itemInfo.position + 1;
        int i21 = i7 + 1;
        while (i21 < size2) {
            ItemInfo itemInfo8 = this.mItems.get(i21);
            while (true) {
                i10 = itemInfo8.position;
                if (i20 >= i10) {
                    break;
                }
                i20++;
                f14 += this.mAdapter.f() + f10;
            }
            if (i10 == i18) {
                this.mLastOffset = (itemInfo8.widthFactor + f14) - 1.0f;
            }
            itemInfo8.offset = f14;
            f14 += itemInfo8.widthFactor + f10;
            i21++;
            i20++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    private void completeScroll(boolean z3) {
        boolean z8 = this.mScrollState == 2;
        if (z8) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i7 = 0; i7 < this.mItems.size(); i7++) {
            ItemInfo itemInfo = this.mItems.get(i7);
            if (itemInfo.scrolling) {
                itemInfo.scrolling = false;
                z8 = true;
            }
        }
        if (z8) {
            if (!z3) {
                this.mEndScrollRunnable.run();
                return;
            }
            Runnable runnable = this.mEndScrollRunnable;
            WeakHashMap weakHashMap = N.f16168a;
            postOnAnimation(runnable);
        }
    }

    private int determineTargetPage(int i7, float f10, int i10, int i11) {
        if (Math.abs(i11) <= this.mFlingDistance || Math.abs(i10) <= this.mMinimumVelocity) {
            i7 += (int) (f10 + (i7 >= this.mCurItem ? 0.4f : 0.6f));
        } else if (i10 <= 0) {
            i7++;
        }
        if (this.mItems.size() > 0) {
            return Math.max(this.mItems.get(0).position, Math.min(i7, ((ItemInfo) q0.i(1, this.mItems)).position));
        }
        return i7;
    }

    private void dispatchOnPageScrolled(int i7, float f10, int i10) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i7, f10, i10);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i11);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrolled(i7, f10, i10);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrolled(i7, f10, i10);
        }
    }

    private void dispatchOnPageSelected(int i7) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i7);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i10);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageSelected(i7);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageSelected(i7);
        }
    }

    private void dispatchOnScrollStateChanged(int i7) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i7);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i10);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrollStateChanged(i7);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrollStateChanged(i7);
        }
    }

    private void enableLayers(boolean z3) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).setLayerType(z3 ? this.mPageTransformerLayerType : 0, null);
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private ItemInfo infoForCurrentScrollPosition() {
        int i7;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        boolean z3 = true;
        int i10 = 0;
        ItemInfo itemInfo = null;
        int i11 = -1;
        float f12 = 0.0f;
        while (i10 < this.mItems.size()) {
            ItemInfo itemInfo2 = this.mItems.get(i10);
            if (!z3 && itemInfo2.position != (i7 = i11 + 1)) {
                itemInfo2 = this.mTempItem;
                itemInfo2.offset = f10 + f12 + f11;
                itemInfo2.position = i7;
                itemInfo2.widthFactor = this.mAdapter.f();
                i10--;
            }
            ItemInfo itemInfo3 = itemInfo2;
            f10 = itemInfo3.offset;
            float f13 = itemInfo3.widthFactor + f10 + f11;
            if (!z3 && scrollX < f10) {
                break;
            }
            if (scrollX < f13 || i10 == this.mItems.size() - 1) {
                return itemInfo3;
            }
            int i12 = itemInfo3.position;
            float f14 = itemInfo3.widthFactor;
            i10++;
            i11 = i12;
            f12 = f14;
            itemInfo = itemInfo3;
            z3 = false;
        }
        return itemInfo;
    }

    private static boolean isDecorView(@NonNull View view) {
        return view.getClass().getAnnotation(DecorView.class) != null;
    }

    private boolean isGutterDrag(float f10, float f11) {
        if (f10 >= this.mGutterSize || f11 <= 0.0f) {
            return f10 > ((float) (getWidth() - this.mGutterSize)) && f11 < 0.0f;
        }
        return true;
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = motionEvent.getX(i7);
            this.mActivePointerId = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean pageScrolled(int i7) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        ItemInfo itemInfoInfoForCurrentScrollPosition = infoForCurrentScrollPosition();
        int clientWidth = getClientWidth();
        int i10 = this.mPageMargin;
        int i11 = clientWidth + i10;
        float f10 = clientWidth;
        int i12 = itemInfoInfoForCurrentScrollPosition.position;
        float f11 = ((i7 / f10) - itemInfoInfoForCurrentScrollPosition.offset) / (itemInfoInfoForCurrentScrollPosition.widthFactor + (i10 / f10));
        this.mCalledSuper = false;
        onPageScrolled(i12, f11, (int) (i11 * f11));
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean performDrag(float f10) {
        boolean z3;
        boolean z8;
        float f11 = this.mLastMotionX - f10;
        this.mLastMotionX = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.mFirstOffset * clientWidth;
        float f13 = this.mLastOffset * clientWidth;
        boolean z10 = false;
        ItemInfo itemInfo = this.mItems.get(0);
        ItemInfo itemInfo2 = (ItemInfo) q0.i(1, this.mItems);
        if (itemInfo.position != 0) {
            f12 = itemInfo.offset * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (itemInfo2.position != this.mAdapter.c() - 1) {
            f13 = itemInfo2.offset * clientWidth;
            z8 = false;
        } else {
            z8 = true;
        }
        if (scrollX < f12) {
            if (z3) {
                this.mLeftEdge.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z10 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z8) {
                this.mRightEdge.onPull(Math.abs(scrollX - f13) / clientWidth);
                z10 = true;
            }
            scrollX = f13;
        }
        int i7 = (int) scrollX;
        this.mLastMotionX = (scrollX - i7) + this.mLastMotionX;
        scrollTo(i7, getScrollY());
        pageScrolled(i7);
        return z10;
    }

    private void recomputeScrollPosition(int i7, int i10, int i11, int i12) {
        if (i10 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)) * (((i7 - getPaddingLeft()) - getPaddingRight()) + i11)), getScrollY());
                return;
            }
        }
        ItemInfo itemInfoInfoForPosition = infoForPosition(this.mCurItem);
        int iMin = (int) ((itemInfoInfoForPosition != null ? Math.min(itemInfoInfoForPosition.offset, this.mLastOffset) : 0.0f) * ((i7 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            completeScroll(false);
            scrollTo(iMin, getScrollY());
        }
    }

    private void removeNonDecorViews() {
        int i7 = 0;
        while (i7 < getChildCount()) {
            if (!((LayoutParams) getChildAt(i7).getLayoutParams()).isDecor) {
                removeViewAt(i7);
                i7--;
            }
            i7++;
        }
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z3) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z3);
        }
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        return this.mLeftEdge.isFinished() || this.mRightEdge.isFinished();
    }

    private void scrollToItem(int i7, boolean z3, int i10, boolean z8) {
        int iMax;
        ItemInfo itemInfoInfoForPosition = infoForPosition(i7);
        if (itemInfoInfoForPosition != null) {
            iMax = (int) (Math.max(this.mFirstOffset, Math.min(itemInfoInfoForPosition.offset, this.mLastOffset)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (z3) {
            smoothScrollTo(iMax, 0, i10);
            if (z8) {
                dispatchOnPageSelected(i7);
                return;
            }
            return;
        }
        if (z8) {
            dispatchOnPageSelected(i7);
        }
        completeScroll(false);
        scrollTo(iMax, 0);
        pageScrolled(iMax);
    }

    private void setScrollingCacheEnabled(boolean z3) {
        if (this.mScrollingCacheEnabled != z3) {
            this.mScrollingCacheEnabled = z3;
        }
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                this.mDrawingOrderedChildren.add(getChildAt(i7));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i7, int i10) {
        ItemInfo itemInfoInfoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() == 0 && (itemInfoInfoForChild = infoForChild(childAt)) != null && itemInfoInfoForChild.position == this.mCurItem) {
                    childAt.addFocusables(arrayList, i7, i10);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i10 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    public ItemInfo addNewItem(int i7, int i10) {
        ItemInfo itemInfo = new ItemInfo();
        itemInfo.position = i7;
        itemInfo.object = this.mAdapter.g(this, i7);
        itemInfo.widthFactor = this.mAdapter.f();
        if (i10 < 0 || i10 >= this.mItems.size()) {
            this.mItems.add(itemInfo);
            return itemInfo;
        }
        this.mItems.add(i10, itemInfo);
        return itemInfo;
    }

    public void addOnAdapterChangeListener(@NonNull OnAdapterChangeListener onAdapterChangeListener) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(onAdapterChangeListener);
    }

    public void addOnPageChangeListener(@NonNull OnPageChangeListener onPageChangeListener) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(onPageChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        ItemInfo itemInfoInfoForChild;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 0 && (itemInfoInfoForChild = infoForChild(childAt)) != null && itemInfoInfoForChild.position == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean zIsDecorView = layoutParams2.isDecor | isDecorView(view);
        layoutParams2.isDecor = zIsDecorView;
        if (!this.mInLayout) {
            super.addView(view, i7, layoutParams);
        } else {
            if (zIsDecorView) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.needsMeasure = true;
            addViewInLayout(view, i7, layoutParams);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    public boolean arrowScroll(int i7) {
        boolean zPageLeft;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb2.append(" => ");
                        sb2.append(parent2.getClass().getSimpleName());
                    }
                    Log.e(TAG, "arrowScroll tried to find focus based on non-child current focused view " + sb2.toString());
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i7);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i7 == 17 || i7 == 1) {
                zPageLeft = pageLeft();
            } else if (i7 == 66 || i7 == 2) {
                zPageLeft = pageRight();
            } else {
                zPageLeft = false;
            }
        } else if (i7 == 17) {
            zPageLeft = (viewFindFocus == null || getChildRectInPagerCoordinates(this.mTempRect, viewFindNextFocus).left < getChildRectInPagerCoordinates(this.mTempRect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : pageLeft();
        } else if (i7 == 66) {
            zPageLeft = (viewFindFocus == null || getChildRectInPagerCoordinates(this.mTempRect, viewFindNextFocus).left > getChildRectInPagerCoordinates(this.mTempRect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : pageRight();
        } else {
            zPageLeft = false;
        }
        if (zPageLeft) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i7));
        }
        return zPageLeft;
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.mFakeDragBeginTime = jUptimeMillis;
        return true;
    }

    public boolean canScroll(View view, boolean z3, int i7, int i10, int i11) {
        int i12;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i13 = i10 + scrollX;
                if (i13 >= childAt.getLeft() && i13 < childAt.getRight() && (i12 = i11 + scrollY) >= childAt.getTop() && i12 < childAt.getBottom() && canScroll(childAt, true, i7, i13 - childAt.getLeft(), i12 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z3 && view.canScrollHorizontally(-i7);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i7) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i7 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.mFirstOffset));
        }
        return i7 > 0 && scrollX < ((int) (((float) clientWidth) * this.mLastOffset));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void clearOnPageChangeListeners() {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            completeScroll(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!pageScrolled(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = N.f16168a;
        postInvalidateOnAnimation();
    }

    public void dataSetChanged() {
        int iC = this.mAdapter.c();
        this.mExpectedAdapterCount = iC;
        boolean z3 = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < iC;
        int iMax = this.mCurItem;
        int i7 = 0;
        boolean z8 = false;
        while (i7 < this.mItems.size()) {
            ItemInfo itemInfo = this.mItems.get(i7);
            a aVar = this.mAdapter;
            Object obj = itemInfo.object;
            int iD = aVar.d();
            if (iD != -1) {
                if (iD == -2) {
                    this.mItems.remove(i7);
                    i7--;
                    if (!z8) {
                        this.mAdapter.m(this);
                        z8 = true;
                    }
                    this.mAdapter.a(this, itemInfo.position, itemInfo.object);
                    int i10 = this.mCurItem;
                    if (i10 == itemInfo.position) {
                        iMax = Math.max(0, Math.min(i10, iC - 1));
                    }
                } else {
                    int i11 = itemInfo.position;
                    if (i11 != iD) {
                        if (i11 == this.mCurItem) {
                            iMax = iD;
                        }
                        itemInfo.position = iD;
                    }
                }
                z3 = true;
            }
            i7++;
        }
        if (z8) {
            this.mAdapter.b();
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z3) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i12).getLayoutParams();
                if (!layoutParams.isDecor) {
                    layoutParams.widthFactor = 0.0f;
                }
            }
            setCurrentItemInternal(iMax, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ItemInfo itemInfoInfoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 0 && (itemInfoInfoForChild = infoForChild(childAt)) != null && itemInfoInfoForChild.position == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public float distanceInfluenceForSnapDuration(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.mAdapter) != null && aVar.c() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                zDraw = this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.mRightEdge.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                zDraw |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        }
        if (zDraw) {
            WeakHashMap weakHashMap = N.f16168a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public void endFakeDrag() {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.mAdapter != null) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            ItemInfo itemInfoInfoForCurrentScrollPosition = infoForCurrentScrollPosition();
            setCurrentItemInternal(determineTargetPage(itemInfoInfoForCurrentScrollPosition.position, ((scrollX / clientWidth) - itemInfoInfoForCurrentScrollPosition.offset) / itemInfoInfoForCurrentScrollPosition.widthFactor, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
        }
        endDrag();
        this.mFakeDragging = false;
    }

    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            return keyEvent.hasModifiers(2) ? pageLeft() : arrowScroll(17);
        }
        if (keyCode == 22) {
            return keyEvent.hasModifiers(2) ? pageRight() : arrowScroll(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return arrowScroll(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return arrowScroll(1);
        }
        return false;
    }

    public void fakeDragBy(float f10) {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.mAdapter == null) {
            return;
        }
        this.mLastMotionX += f10;
        float scrollX = getScrollX() - f10;
        float clientWidth = getClientWidth();
        float f11 = this.mFirstOffset * clientWidth;
        float f12 = this.mLastOffset * clientWidth;
        ItemInfo itemInfo = this.mItems.get(0);
        ItemInfo itemInfo2 = (ItemInfo) q0.i(1, this.mItems);
        if (itemInfo.position != 0) {
            f11 = itemInfo.offset * clientWidth;
        }
        if (itemInfo2.position != this.mAdapter.c() - 1) {
            f12 = itemInfo2.offset * clientWidth;
        }
        if (scrollX < f11) {
            scrollX = f11;
        } else if (scrollX > f12) {
            scrollX = f12;
        }
        int i7 = (int) scrollX;
        this.mLastMotionX = (scrollX - i7) + this.mLastMotionX;
        scrollTo(i7, getScrollY());
        pageScrolled(i7);
        MotionEvent motionEventObtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Nullable
    public a getAdapter() {
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i7, int i10) {
        if (this.mDrawingOrder == 2) {
            i10 = (i7 - 1) - i10;
        }
        return ((LayoutParams) this.mDrawingOrderedChildren.get(i10).getLayoutParams()).childIndex;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public ItemInfo infoForAnyChild(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public ItemInfo infoForChild(View view) {
        for (int i7 = 0; i7 < this.mItems.size(); i7++) {
            ItemInfo itemInfo = this.mItems.get(i7);
            if (this.mAdapter.h(view, itemInfo.object)) {
                return itemInfo;
            }
        }
        return null;
    }

    public ItemInfo infoForPosition(int i7) {
        for (int i10 = 0; i10 < this.mItems.size(); i10++) {
            ItemInfo itemInfo = this.mItems.get(i10);
            if (itemInfo.position == i7) {
                return itemInfo;
            }
        }
        return null;
    }

    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(CodePushConstants.DOWNLOAD_BUFFER_SIZE);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f10);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f10);
        this.mCloseEnough = (int) (2.0f * f10);
        this.mDefaultGutterSize = (int) (f10 * 16.0f);
        N.q(this, new MyAccessibilityDelegate());
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        E.n(this, new OnApplyWindowInsetsListener() { // from class: androidx.viewpager.widget.ViewPager.4
            private final Rect mTempRect = new Rect();

            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public androidx.core.view.q0 onApplyWindowInsets(View view, androidx.core.view.q0 q0Var) {
                androidx.core.view.q0 q0VarL = N.l(view, q0Var);
                if (q0VarL.f16277a.n()) {
                    return q0VarL;
                }
                Rect rect = this.mTempRect;
                rect.left = q0VarL.b();
                rect.top = q0VarL.d();
                rect.right = q0VarL.c();
                rect.bottom = q0VarL.a();
                int childCount = ViewPager.this.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    androidx.core.view.q0 q0VarB = N.b(ViewPager.this.getChildAt(i7), q0VarL);
                    rect.left = Math.min(q0VarB.b(), rect.left);
                    rect.top = Math.min(q0VarB.d(), rect.top);
                    rect.right = Math.min(q0VarB.c(), rect.right);
                    rect.bottom = Math.min(q0VarB.a(), rect.bottom);
                }
                return q0VarL.f(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i7;
        float f10;
        super.onDraw(canvas);
        if (this.mPageMargin <= 0 || this.mMarginDrawable == null || this.mItems.size() <= 0 || this.mAdapter == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f11 = width;
        float f12 = this.mPageMargin / f11;
        int i10 = 0;
        ItemInfo itemInfo = this.mItems.get(0);
        float f13 = itemInfo.offset;
        int size = this.mItems.size();
        int i11 = itemInfo.position;
        int i12 = this.mItems.get(size - 1).position;
        while (i11 < i12) {
            while (true) {
                i7 = itemInfo.position;
                if (i11 <= i7 || i10 >= size) {
                    break;
                }
                i10++;
                itemInfo = this.mItems.get(i10);
            }
            if (i11 == i7) {
                float f14 = itemInfo.offset + itemInfo.widthFactor;
                f10 = f14 * f11;
                f13 = f14 + f12;
            } else {
                float f15 = this.mAdapter.f();
                float f16 = (f13 + f15) * f11;
                f13 = f15 + f12 + f13;
                f10 = f16;
            }
            if (this.mPageMargin + f10 > scrollX) {
                this.mMarginDrawable.setBounds(Math.round(f10), this.mTopPageBounds, Math.round(this.mPageMargin + f10), this.mBottomPageBounds);
                this.mMarginDrawable.draw(canvas);
            }
            if (f10 > scrollX + width) {
                return;
            }
            i11++;
            scrollX = scrollX;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            resetTouch();
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action == 0) {
            float x3 = motionEvent.getX();
            this.mInitialMotionX = x3;
            this.mLastMotionX = x3;
            float y8 = motionEvent.getY();
            this.mInitialMotionY = y8;
            this.mLastMotionY = y8;
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                completeScroll(false);
                this.mIsBeingDragged = false;
            } else {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i7 = this.mActivePointerId;
            if (i7 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i7);
                float x7 = motionEvent.getX(iFindPointerIndex);
                float f10 = x7 - this.mLastMotionX;
                float fAbs = Math.abs(f10);
                float y10 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y10 - this.mInitialMotionY);
                if (f10 != 0.0f && !isGutterDrag(this.mLastMotionX, f10) && canScroll(this, false, (int) f10, (int) x7, (int) y10)) {
                    this.mLastMotionX = x7;
                    this.mLastMotionY = y10;
                    this.mIsUnableToDrag = true;
                    return false;
                }
                int i10 = this.mTouchSlop;
                if (fAbs > i10 && fAbs * 0.5f > fAbs2) {
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                    float f11 = this.mInitialMotionX;
                    float f12 = this.mTouchSlop;
                    this.mLastMotionX = f10 > 0.0f ? f11 + f12 : f11 - f12;
                    this.mLastMotionY = y10;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i10) {
                    this.mIsUnableToDrag = true;
                }
                if (this.mIsBeingDragged && performDrag(x7)) {
                    WeakHashMap weakHashMap = N.f16168a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        return this.mIsBeingDragged;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        boolean z8;
        ItemInfo itemInfoInfoForChild;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isDecor) {
                    int i17 = layoutParams.gravity;
                    int i18 = i17 & 7;
                    int i19 = i17 & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR;
                    if (i18 != 1) {
                        if (i18 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i18 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i13 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i19 != 16) {
                            if (i19 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i19 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i14 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i20 = paddingLeft + scrollX;
                            childAt.layout(i20, paddingTop, childAt.getMeasuredWidth() + i20, childAt.getMeasuredHeight() + paddingTop);
                            i15++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i14 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i21 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i21;
                        int i22 = paddingLeft + scrollX;
                        childAt.layout(i22, paddingTop, childAt.getMeasuredWidth() + i22, childAt.getMeasuredHeight() + paddingTop);
                        i15++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i13 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i23 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i23;
                    if (i19 != 16) {
                        if (i19 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i19 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i14 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i24 = paddingLeft + scrollX;
                        childAt.layout(i24, paddingTop, childAt.getMeasuredWidth() + i24, childAt.getMeasuredHeight() + paddingTop);
                        i15++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i14 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i25 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i25;
                    int i26 = paddingLeft + scrollX;
                    childAt.layout(i26, paddingTop, childAt.getMeasuredWidth() + i26, childAt.getMeasuredHeight() + paddingTop);
                    i15++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i27 = (i13 - paddingLeft) - paddingRight;
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt2 = getChildAt(i28);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.isDecor && (itemInfoInfoForChild = infoForChild(childAt2)) != null) {
                    float f10 = i27;
                    int i29 = ((int) (itemInfoInfoForChild.offset * f10)) + paddingLeft;
                    if (layoutParams2.needsMeasure) {
                        layoutParams2.needsMeasure = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * layoutParams2.widthFactor), 1073741824), View.MeasureSpec.makeMeasureSpec((i14 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i29, paddingTop, childAt2.getMeasuredWidth() + i29, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.mTopPageBounds = paddingTop;
        this.mBottomPageBounds = i14 - paddingBottom;
        this.mDecorChildCount = i15;
        if (this.mFirstLayout) {
            z8 = false;
            scrollToItem(this.mCurItem, false, 0, false);
        } else {
            z8 = false;
        }
        this.mFirstLayout = z8;
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i11;
        setMeasuredDimension(View.getDefaultSize(0, i7), View.getDefaultSize(0, i10));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            boolean z3 = true;
            int i13 = 1073741824;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.isDecor) {
                int i14 = layoutParams2.gravity;
                int i15 = i14 & 7;
                int i16 = i14 & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR;
                boolean z8 = i16 == 48 || i16 == 80;
                if (i15 != 3 && i15 != 5) {
                    z3 = false;
                }
                int i17 = Integer.MIN_VALUE;
                if (z8) {
                    i11 = Integer.MIN_VALUE;
                    i17 = 1073741824;
                } else {
                    i11 = z3 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i18 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i18 != -2) {
                    if (i18 == -1) {
                        i18 = paddingLeft;
                    }
                    i17 = 1073741824;
                } else {
                    i18 = paddingLeft;
                }
                int i19 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i19 == -2) {
                    i19 = measuredHeight;
                    i13 = i11;
                } else if (i19 == -1) {
                    i19 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, i17), View.MeasureSpec.makeMeasureSpec(i19, i13));
                if (z8) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z3) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i12++;
        }
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i20 = 0; i20 < childCount2; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.isDecor)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.widthFactor), 1073741824), this.mChildHeightMeasureSpec);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    @CallSuper
    public void onPageScrolled(int i7, float f10, int i10) {
        int iMax;
        int width;
        int left;
        if (this.mDecorChildCount > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isDecor) {
                    int i12 = layoutParams.gravity & 7;
                    if (i12 != 1) {
                        if (i12 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i12 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i13 = iMax;
                    width = paddingLeft;
                    paddingLeft = i13;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        dispatchOnPageScrolled(i7, f10, i10);
        if (this.mPageTransformer != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = getChildAt(i14);
                if (!((LayoutParams) childAt2.getLayoutParams()).isDecor) {
                    this.mPageTransformer.transformPage(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.mCalledSuper = true;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i7, Rect rect) {
        int i10;
        int i11;
        int i12;
        ItemInfo itemInfoInfoForChild;
        int childCount = getChildCount();
        if ((i7 & 2) != 0) {
            i11 = childCount;
            i10 = 0;
            i12 = 1;
        } else {
            i10 = childCount - 1;
            i11 = -1;
            i12 = -1;
        }
        while (i10 != i11) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (itemInfoInfoForChild = infoForChild(childAt)) != null && itemInfoInfoForChild.position == this.mCurItem && childAt.requestFocus(i7, rect)) {
                return true;
            }
            i10 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        a aVar = this.mAdapter;
        if (aVar != null) {
            aVar.j(savedState.adapterState, savedState.loader);
            setCurrentItemInternal(savedState.position, false, true);
        } else {
            this.mRestoredCurItem = savedState.position;
            this.mRestoredAdapterState = savedState.adapterState;
            this.mRestoredClassLoader = savedState.loader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.position = this.mCurItem;
        a aVar = this.mAdapter;
        if (aVar != null) {
            savedState.adapterState = aVar.k();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 != i11) {
            int i13 = this.mPageMargin;
            recomputeScrollPosition(i7, i11, i13, i13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00de  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (!this.mFakeDragging) {
            boolean zResetTouch = false;
            if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.mAdapter) == null || aVar.c() == 0) {
                return false;
            }
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                float x3 = motionEvent.getX();
                this.mInitialMotionX = x3;
                this.mLastMotionX = x3;
                float y8 = motionEvent.getY();
                this.mInitialMotionY = y8;
                this.mLastMotionY = y8;
                this.mActivePointerId = motionEvent.getPointerId(0);
            } else if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 5) {
                            int actionIndex = motionEvent.getActionIndex();
                            this.mLastMotionX = motionEvent.getX(actionIndex);
                            this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                        } else if (action == 6) {
                            onSecondaryPointerUp(motionEvent);
                            this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                        }
                    } else if (this.mIsBeingDragged) {
                        scrollToItem(this.mCurItem, true, 0, false);
                        zResetTouch = resetTouch();
                    }
                } else if (!this.mIsBeingDragged) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (iFindPointerIndex == -1) {
                        zResetTouch = resetTouch();
                    } else {
                        float x7 = motionEvent.getX(iFindPointerIndex);
                        float fAbs = Math.abs(x7 - this.mLastMotionX);
                        float y10 = motionEvent.getY(iFindPointerIndex);
                        float fAbs2 = Math.abs(y10 - this.mLastMotionY);
                        if (fAbs > this.mTouchSlop && fAbs > fAbs2) {
                            this.mIsBeingDragged = true;
                            requestParentDisallowInterceptTouchEvent(true);
                            float f10 = this.mInitialMotionX;
                            this.mLastMotionX = x7 - f10 > 0.0f ? f10 + this.mTouchSlop : f10 - this.mTouchSlop;
                            this.mLastMotionY = y10;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        if (this.mIsBeingDragged) {
                            zResetTouch = performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                        }
                    }
                } else if (this.mIsBeingDragged) {
                    zResetTouch = performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                }
            } else if (this.mIsBeingDragged) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                ItemInfo itemInfoInfoForCurrentScrollPosition = infoForCurrentScrollPosition();
                float f11 = clientWidth;
                setCurrentItemInternal(determineTargetPage(itemInfoInfoForCurrentScrollPosition.position, ((scrollX / f11) - itemInfoInfoForCurrentScrollPosition.offset) / (itemInfoInfoForCurrentScrollPosition.widthFactor + (this.mPageMargin / f11)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
                zResetTouch = resetTouch();
            }
            if (zResetTouch) {
                WeakHashMap weakHashMap = N.f16168a;
                postInvalidateOnAnimation();
            }
        }
        return true;
    }

    public boolean pageLeft() {
        int i7 = this.mCurItem;
        if (i7 <= 0) {
            return false;
        }
        setCurrentItem(i7 - 1, true);
        return true;
    }

    public boolean pageRight() {
        a aVar = this.mAdapter;
        if (aVar == null || this.mCurItem >= aVar.c() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    public void populate() {
        populate(this.mCurItem);
    }

    public void removeOnAdapterChangeListener(@NonNull OnAdapterChangeListener onAdapterChangeListener) {
        List<OnAdapterChangeListener> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(onAdapterChangeListener);
        }
    }

    public void removeOnPageChangeListener(@NonNull OnPageChangeListener onPageChangeListener) {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(onPageChangeListener);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(@Nullable a aVar) {
        a aVar2 = this.mAdapter;
        if (aVar2 != null) {
            synchronized (aVar2) {
                aVar2.f18254b = null;
            }
            this.mAdapter.m(this);
            for (int i7 = 0; i7 < this.mItems.size(); i7++) {
                ItemInfo itemInfo = this.mItems.get(i7);
                this.mAdapter.a(this, itemInfo.position, itemInfo.object);
            }
            this.mAdapter.b();
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        a aVar3 = this.mAdapter;
        this.mAdapter = aVar;
        this.mExpectedAdapterCount = 0;
        if (aVar != null) {
            if (this.mObserver == null) {
                this.mObserver = new PagerObserver();
            }
            a aVar4 = this.mAdapter;
            PagerObserver pagerObserver = this.mObserver;
            synchronized (aVar4) {
                aVar4.f18254b = pagerObserver;
            }
            this.mPopulatePending = false;
            boolean z3 = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.c();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.j(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (z3) {
                requestLayout();
            } else {
                populate();
            }
        }
        List<OnAdapterChangeListener> list = this.mAdapterChangeListeners;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.mAdapterChangeListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mAdapterChangeListeners.get(i10).onAdapterChanged(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int i7) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i7, !this.mFirstLayout, false);
    }

    public void setCurrentItemInternal(int i7, boolean z3, boolean z8) {
        setCurrentItemInternal(i7, z3, z8, 0);
    }

    public OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener onPageChangeListener) {
        OnPageChangeListener onPageChangeListener2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = onPageChangeListener;
        return onPageChangeListener2;
    }

    public void setOffscreenPageLimit(int i7) {
        if (i7 < 1) {
            i7 = 1;
        }
        if (i7 != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i7;
            populate();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.mOnPageChangeListener = onPageChangeListener;
    }

    public void setPageMargin(int i7) {
        int i10 = this.mPageMargin;
        this.mPageMargin = i7;
        int width = getWidth();
        recomputeScrollPosition(width, width, i7, i10);
        requestLayout();
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z3, @Nullable PageTransformer pageTransformer) {
        setPageTransformer(z3, pageTransformer, 2);
    }

    public void setScrollState(int i7) {
        if (this.mScrollState == i7) {
            return;
        }
        this.mScrollState = i7;
        if (this.mPageTransformer != null) {
            enableLayers(i7 != 0);
        }
        dispatchOnScrollStateChanged(i7);
    }

    public void smoothScrollTo(int i7, int i10) {
        smoothScrollTo(i7, i10, 0);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {
        int childIndex;
        public int gravity;
        public boolean isDecor;
        boolean needsMeasure;
        int position;
        float widthFactor;

        public LayoutParams() {
            super(-1, -1);
            this.widthFactor = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.widthFactor = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.gravity = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00cc A[PHI: r7 r10 r14
      0x00cc: PHI (r7v7 int) = (r7v6 int), (r7v5 int), (r7v10 int) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r14v6 float) = (r14v4 float), (r14v5 float), (r14v3 float) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    public void populate(int i7) {
        ItemInfo itemInfoInfoForPosition;
        String hexString;
        ItemInfo itemInfoAddNewItem;
        ItemInfo itemInfoInfoForChild;
        ItemInfo itemInfo;
        int i10 = this.mCurItem;
        if (i10 != i7) {
            itemInfoInfoForPosition = infoForPosition(i10);
            this.mCurItem = i7;
        } else {
            itemInfoInfoForPosition = null;
        }
        if (this.mAdapter == null) {
            sortChildDrawingOrder();
            return;
        }
        if (this.mPopulatePending) {
            sortChildDrawingOrder();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.mAdapter.m(this);
        int i11 = this.mOffscreenPageLimit;
        int iMax = Math.max(0, this.mCurItem - i11);
        int iC = this.mAdapter.c();
        int iMin = Math.min(iC - 1, this.mCurItem + i11);
        if (iC != this.mExpectedAdapterCount) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb2 = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            u.u(sb2, this.mExpectedAdapterCount, ", found: ", iC, " Pager id: ");
            sb2.append(hexString);
            sb2.append(" Pager class: ");
            sb2.append(getClass());
            sb2.append(" Problematic adapter: ");
            sb2.append(this.mAdapter.getClass());
            throw new IllegalStateException(sb2.toString());
        }
        int i12 = 0;
        while (true) {
            if (i12 < this.mItems.size()) {
                itemInfoAddNewItem = this.mItems.get(i12);
                int i13 = itemInfoAddNewItem.position;
                int i14 = this.mCurItem;
                if (i13 >= i14) {
                    if (i13 != i14) {
                        break;
                    } else {
                        break;
                    }
                }
                i12++;
            }
            itemInfoAddNewItem = null;
            break;
        }
        if (itemInfoAddNewItem == null && iC > 0) {
            itemInfoAddNewItem = addNewItem(this.mCurItem, i12);
        }
        if (itemInfoAddNewItem != null) {
            int i15 = i12 - 1;
            ItemInfo itemInfo2 = i15 >= 0 ? this.mItems.get(i15) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - itemInfoAddNewItem.widthFactor);
            float f10 = 0.0f;
            for (int i16 = this.mCurItem - 1; i16 >= 0; i16--) {
                if (f10 < paddingLeft || i16 >= iMax) {
                    if (itemInfo2 == null || i16 != itemInfo2.position) {
                        f10 += addNewItem(i16, i15 + 1).widthFactor;
                        i12++;
                        if (i15 >= 0) {
                            itemInfo = this.mItems.get(i15);
                        } else {
                            itemInfo = null;
                        }
                    } else {
                        f10 += itemInfo2.widthFactor;
                        i15--;
                        if (i15 >= 0) {
                            itemInfo = this.mItems.get(i15);
                        } else {
                            itemInfo = null;
                        }
                    }
                    itemInfo2 = itemInfo;
                } else {
                    if (itemInfo2 == null) {
                        break;
                    }
                    if (i16 == itemInfo2.position && !itemInfo2.scrolling) {
                        this.mItems.remove(i15);
                        this.mAdapter.a(this, i16, itemInfo2.object);
                        i15--;
                        i12--;
                        if (i15 >= 0) {
                            itemInfo = this.mItems.get(i15);
                        } else {
                            itemInfo = null;
                        }
                        itemInfo2 = itemInfo;
                    }
                }
            }
            float f11 = itemInfoAddNewItem.widthFactor;
            int i17 = i12 + 1;
            if (f11 < 2.0f) {
                ItemInfo itemInfo3 = i17 < this.mItems.size() ? this.mItems.get(i17) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i18 = this.mCurItem;
                while (true) {
                    i18++;
                    if (i18 >= iC) {
                        break;
                    }
                    if (f11 >= paddingRight && i18 > iMin) {
                        if (itemInfo3 == null) {
                            break;
                        }
                        if (i18 == itemInfo3.position && !itemInfo3.scrolling) {
                            this.mItems.remove(i17);
                            this.mAdapter.a(this, i18, itemInfo3.object);
                            if (i17 < this.mItems.size()) {
                                itemInfo3 = this.mItems.get(i17);
                            }
                        }
                    } else if (itemInfo3 == null || i18 != itemInfo3.position) {
                        ItemInfo itemInfoAddNewItem2 = addNewItem(i18, i17);
                        i17++;
                        f11 += itemInfoAddNewItem2.widthFactor;
                        itemInfo3 = i17 < this.mItems.size() ? this.mItems.get(i17) : null;
                    } else {
                        f11 += itemInfo3.widthFactor;
                        i17++;
                        if (i17 < this.mItems.size()) {
                            itemInfo3 = this.mItems.get(i17);
                        }
                    }
                }
            }
            calculatePageOffsets(itemInfoAddNewItem, i12, itemInfoInfoForPosition);
            this.mAdapter.l(itemInfoAddNewItem.object);
        }
        this.mAdapter.b();
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            layoutParams.childIndex = i19;
            if (!layoutParams.isDecor && layoutParams.widthFactor == 0.0f && (itemInfoInfoForChild = infoForChild(childAt)) != null) {
                layoutParams.widthFactor = itemInfoInfoForChild.widthFactor;
                layoutParams.position = itemInfoInfoForChild.position;
            }
        }
        sortChildDrawingOrder();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            ItemInfo itemInfoInfoForAnyChild = viewFindFocus != null ? infoForAnyChild(viewFindFocus) : null;
            if (itemInfoInfoForAnyChild == null || itemInfoInfoForAnyChild.position != this.mCurItem) {
                for (int i20 = 0; i20 < getChildCount(); i20++) {
                    View childAt2 = getChildAt(i20);
                    ItemInfo itemInfoInfoForChild2 = infoForChild(childAt2);
                    if (itemInfoInfoForChild2 != null && itemInfoInfoForChild2.position == this.mCurItem && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public void setCurrentItemInternal(int i7, boolean z3, boolean z8, int i10) {
        a aVar = this.mAdapter;
        if (aVar == null || aVar.c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z8 && this.mCurItem == i7 && this.mItems.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i7 < 0) {
            i7 = 0;
        } else if (i7 >= this.mAdapter.c()) {
            i7 = this.mAdapter.c() - 1;
        }
        int i11 = this.mOffscreenPageLimit;
        int i12 = this.mCurItem;
        if (i7 > i12 + i11 || i7 < i12 - i11) {
            for (int i13 = 0; i13 < this.mItems.size(); i13++) {
                this.mItems.get(i13).scrolling = true;
            }
        }
        boolean z10 = this.mCurItem != i7;
        if (!this.mFirstLayout) {
            populate(i7);
            scrollToItem(i7, z3, i10, z10);
        } else {
            this.mCurItem = i7;
            if (z10) {
                dispatchOnPageSelected(i7);
            }
            requestLayout();
        }
    }

    public void setPageTransformer(boolean z3, @Nullable PageTransformer pageTransformer, int i7) {
        boolean z8 = pageTransformer != null;
        boolean z10 = z8 != (this.mPageTransformer != null);
        this.mPageTransformer = pageTransformer;
        setChildrenDrawingOrderEnabled(z8);
        if (z8) {
            this.mDrawingOrder = z3 ? 2 : 1;
            this.mPageTransformerLayerType = i7;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z10) {
            populate();
        }
    }

    public void smoothScrollTo(int i7, int i10, int i11) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i12 = scrollX;
        int scrollY = getScrollY();
        int i13 = i7 - i12;
        int i14 = i10 - scrollY;
        if (i13 == 0 && i14 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i15 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i15;
        float fDistanceInfluenceForSnapDuration = (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i13) * 1.0f) / f10)) * f11) + f11;
        int iAbs2 = Math.abs(i11);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fDistanceInfluenceForSnapDuration / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i13) / ((this.mAdapter.f() * f10) + this.mPageMargin)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i12, scrollY, i13, i14, iMin);
        WeakHashMap weakHashMap = N.f16168a;
        postInvalidateOnAnimation();
    }

    public void setCurrentItem(int i7, boolean z3) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i7, z3, false);
    }

    public void setPageMarginDrawable(@DrawableRes int i7) {
        setPageMarginDrawable(getContext().getDrawable(i7));
    }

    public ViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new ItemInfo();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new Runnable() { // from class: androidx.viewpager.widget.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        initViewPager();
    }
}
