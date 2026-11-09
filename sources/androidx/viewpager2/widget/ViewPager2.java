package androidx.viewpager2.widget;

import Sd.b;
import U0.a;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.N;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.StatefulAdapter;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p045d3.k;
import p074f0.c;
import p074f0.d;
import p074f0.h;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public static final int OFFSCREEN_PAGE_LIMIT_DEFAULT = -1;
    public static final int ORIENTATION_HORIZONTAL = 0;
    public static final int ORIENTATION_VERTICAL = 1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static boolean sFeatureEnhancedA11yEnabled = true;
    AccessibilityProvider mAccessibilityProvider;
    int mCurrentItem;
    private RecyclerView.AdapterDataObserver mCurrentItemDataSetChangeObserver;
    boolean mCurrentItemDirty;
    private CompositeOnPageChangeCallback mExternalPageChangeCallbacks;
    private FakeDrag mFakeDragger;
    LinearLayoutManager mLayoutManager;
    private int mOffscreenPageLimit;
    private CompositeOnPageChangeCallback mPageChangeEventDispatcher;
    private PageTransformerAdapter mPageTransformerAdapter;
    private PagerSnapHelper mPagerSnapHelper;
    private Parcelable mPendingAdapterState;
    private int mPendingCurrentItem;
    RecyclerView mRecyclerView;
    private RecyclerView.ItemAnimator mSavedItemAnimator;
    private boolean mSavedItemAnimatorPresent;
    ScrollEventAdapter mScrollEventAdapter;
    private final Rect mTmpChildRect;
    private final Rect mTmpContainerRect;
    private boolean mUserInputEnabled;

    public class BasicAccessibilityProvider extends AccessibilityProvider {
        public BasicAccessibilityProvider() {
            super();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean handlesLmPerformAccessibilityAction(int i7) {
            return (i7 == 8192 || i7 == 4096) && !ViewPager2.this.isUserInputEnabled();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean handlesRvGetAccessibilityClassName() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onLmInitializeAccessibilityNodeInfo(@NonNull d dVar) {
            if (ViewPager2.this.isUserInputEnabled()) {
                return;
            }
            c cVar = c.f36348j;
            dVar.getClass();
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = (AccessibilityNodeInfo.AccessibilityAction) cVar.f36355a;
            AccessibilityNodeInfo accessibilityNodeInfo = dVar.f36360a;
            accessibilityNodeInfo.removeAction(accessibilityAction);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) c.f36347i.f36355a);
            dVar.r(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean onLmPerformAccessibilityAction(int i7) {
            if (handlesLmPerformAccessibilityAction(i7)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public CharSequence onRvGetAccessibilityClassName() {
            if (handlesRvGetAccessibilityClassName()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    public static abstract class DataSetChangeObserver extends RecyclerView.AdapterDataObserver {
        private DataSetChangeObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i7, int i10) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i7, int i10) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i7, int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i7, int i10) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i7, int i10, @Nullable Object obj) {
            onChanged();
        }
    }

    public class LinearLayoutManagerImpl extends LinearLayoutManager {
        public LinearLayoutManagerImpl(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(state, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, @NonNull d dVar) {
            super.onInitializeAccessibilityNodeInfo(recycler, state, dVar);
            ViewPager2.this.mAccessibilityProvider.onLmInitializeAccessibilityNodeInfo(dVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onInitializeAccessibilityNodeInfoForItem(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, @NonNull View view, @NonNull d dVar) {
            ViewPager2.this.mAccessibilityProvider.onLmInitializeAccessibilityNodeInfoForItem(view, dVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean performAccessibilityAction(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, int i7, @Nullable Bundle bundle) {
            return ViewPager2.this.mAccessibilityProvider.handlesLmPerformAccessibilityAction(i7) ? ViewPager2.this.mAccessibilityProvider.onLmPerformAccessibilityAction(i7) : super.performAccessibilityAction(recycler, state, i7, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z3, boolean z8) {
            return false;
        }
    }

    @IntRange(from = 1)
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({p192n.c.f39802c})
    public @interface OffscreenPageLimit {
    }

    public static abstract class OnPageChangeCallback {
        public void onPageScrollStateChanged(int i7) {
        }

        public void onPageScrolled(int i7, float f10, @Px int i10) {
        }

        public void onPageSelected(int i7) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({p192n.c.f39802c})
    public @interface Orientation {
    }

    public class PageAwareAccessibilityProvider extends AccessibilityProvider {
        private final AccessibilityViewCommand mActionPageBackward;
        private final AccessibilityViewCommand mActionPageForward;
        private RecyclerView.AdapterDataObserver mAdapterDataObserver;

        public PageAwareAccessibilityProvider() {
            super();
            this.mActionPageForward = new AccessibilityViewCommand() { // from class: androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.1
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public boolean perform(@NonNull View view, @Nullable h hVar) {
                    PageAwareAccessibilityProvider.this.setCurrentItemFromAccessibilityCommand(((ViewPager2) view).getCurrentItem() + 1);
                    return true;
                }
            };
            this.mActionPageBackward = new AccessibilityViewCommand() { // from class: androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.2
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public boolean perform(@NonNull View view, @Nullable h hVar) {
                    PageAwareAccessibilityProvider.this.setCurrentItemFromAccessibilityCommand(((ViewPager2) view).getCurrentItem() - 1);
                    return true;
                }
            };
        }

        private void addCollectionInfo(d dVar) {
            int itemCount;
            int itemCount2;
            if (ViewPager2.this.getAdapter() != null) {
                itemCount2 = 1;
                if (ViewPager2.this.getOrientation() == 1) {
                    itemCount2 = ViewPager2.this.getAdapter().getItemCount();
                    itemCount = 1;
                } else {
                    itemCount = ViewPager2.this.getAdapter().getItemCount();
                }
            } else {
                itemCount = 0;
                itemCount2 = 0;
            }
            dVar.m(b.c(itemCount2, itemCount, 0, false));
        }

        private void addCollectionItemInfo(View view, d dVar) {
            dVar.n(k.h(ViewPager2.this.getOrientation() == 1 ? ViewPager2.this.mLayoutManager.getPosition(view) : 0, 1, ViewPager2.this.getOrientation() == 0 ? ViewPager2.this.mLayoutManager.getPosition(view) : 0, 1, false, false));
        }

        private void addScrollActions(d dVar) {
            int itemCount;
            RecyclerView.Adapter adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !ViewPager2.this.isUserInputEnabled()) {
                return;
            }
            if (ViewPager2.this.mCurrentItem > 0) {
                dVar.a(UserMetadata.MAX_INTERNAL_KEY_SIZE);
            }
            if (ViewPager2.this.mCurrentItem < itemCount - 1) {
                dVar.a(4096);
            }
            dVar.r(true);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean handlesGetAccessibilityClassName() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean handlesPerformAccessibilityAction(int i7, Bundle bundle) {
            return i7 == 8192 || i7 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onAttachAdapter(@Nullable RecyclerView.Adapter<?> adapter) {
            updatePageAccessibilityActions();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.mAdapterDataObserver);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onDetachAdapter(@Nullable RecyclerView.Adapter<?> adapter) {
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(this.mAdapterDataObserver);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public String onGetAccessibilityClassName() {
            if (handlesGetAccessibilityClassName()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onInitialize(@NonNull CompositeOnPageChangeCallback compositeOnPageChangeCallback, @NonNull RecyclerView recyclerView) {
            recyclerView.setImportantForAccessibility(2);
            this.mAdapterDataObserver = new DataSetChangeObserver() { // from class: androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.3
                @Override // androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onChanged() {
                    PageAwareAccessibilityProvider.this.updatePageAccessibilityActions();
                }
            };
            if (ViewPager2.this.getImportantForAccessibility() == 0) {
                ViewPager2.this.setImportantForAccessibility(1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            d dVar = new d(accessibilityNodeInfo);
            addCollectionInfo(dVar);
            addScrollActions(dVar);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onLmInitializeAccessibilityNodeInfoForItem(@NonNull View view, @NonNull d dVar) {
            addCollectionItemInfo(view, dVar);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean onPerformAccessibilityAction(int i7, Bundle bundle) {
            if (!handlesPerformAccessibilityAction(i7, bundle)) {
                throw new IllegalStateException();
            }
            setCurrentItemFromAccessibilityCommand(i7 == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onRestorePendingState() {
            updatePageAccessibilityActions();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onRvInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(onGetAccessibilityClassName());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onSetLayoutDirection() {
            updatePageAccessibilityActions();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onSetNewCurrentItem() {
            updatePageAccessibilityActions();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onSetOrientation() {
            updatePageAccessibilityActions();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onSetUserInputEnabled() {
            updatePageAccessibilityActions();
        }

        public void setCurrentItemFromAccessibilityCommand(int i7) {
            if (ViewPager2.this.isUserInputEnabled()) {
                ViewPager2.this.setCurrentItemInternal(i7, true);
            }
        }

        public void updatePageAccessibilityActions() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i7 = R.id.accessibilityActionPageLeft;
            N.n(R.id.accessibilityActionPageLeft, viewPager2);
            N.k(0, viewPager2);
            N.n(R.id.accessibilityActionPageRight, viewPager2);
            N.k(0, viewPager2);
            N.n(R.id.accessibilityActionPageUp, viewPager2);
            N.k(0, viewPager2);
            N.n(R.id.accessibilityActionPageDown, viewPager2);
            N.k(0, viewPager2);
            if (ViewPager2.this.getAdapter() == null || (itemCount = ViewPager2.this.getAdapter().getItemCount()) == 0 || !ViewPager2.this.isUserInputEnabled()) {
                return;
            }
            if (ViewPager2.this.getOrientation() != 0) {
                if (ViewPager2.this.mCurrentItem < itemCount - 1) {
                    N.o(viewPager2, new c(R.id.accessibilityActionPageDown, (String) null), null, this.mActionPageForward);
                }
                if (ViewPager2.this.mCurrentItem > 0) {
                    N.o(viewPager2, new c(R.id.accessibilityActionPageUp, (String) null), null, this.mActionPageBackward);
                    return;
                }
                return;
            }
            boolean zIsRtl = ViewPager2.this.isRtl();
            int i10 = zIsRtl ? 16908360 : 16908361;
            if (zIsRtl) {
                i7 = 16908361;
            }
            if (ViewPager2.this.mCurrentItem < itemCount - 1) {
                N.o(viewPager2, new c(i10, (String) null), null, this.mActionPageForward);
            }
            if (ViewPager2.this.mCurrentItem > 0) {
                N.o(viewPager2, new c(i7, (String) null), null, this.mActionPageBackward);
            }
        }
    }

    public interface PageTransformer {
        void transformPage(@NonNull View view, float f10);
    }

    public class PagerSnapHelperImpl extends PagerSnapHelper {
        public PagerSnapHelperImpl() {
        }

        @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
        @Nullable
        public View findSnapView(RecyclerView.LayoutManager layoutManager) {
            if (ViewPager2.this.isFakeDragging()) {
                return null;
            }
            return super.findSnapView(layoutManager);
        }
    }

    public class RecyclerViewImpl extends RecyclerView {
        public RecyclerViewImpl(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        @RequiresApi(23)
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.mAccessibilityProvider.handlesRvGetAccessibilityClassName() ? ViewPager2.this.mAccessibilityProvider.onRvGetAccessibilityClassName() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.mCurrentItem);
            accessibilityEvent.setToIndex(ViewPager2.this.mCurrentItem);
            ViewPager2.this.mAccessibilityProvider.onRvInitializeAccessibilityEvent(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.isUserInputEnabled() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.isUserInputEnabled() && super.onTouchEvent(motionEvent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({p192n.c.f39802c})
    public @interface ScrollState {
    }

    public static class SmoothScrollToPosition implements Runnable {
        private final int mPosition;
        private final RecyclerView mRecyclerView;

        public SmoothScrollToPosition(int i7, RecyclerView recyclerView) {
            this.mPosition = i7;
            this.mRecyclerView = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.mRecyclerView.smoothScrollToPosition(this.mPosition);
        }
    }

    public ViewPager2(@NonNull Context context) {
        super(context);
        this.mTmpContainerRect = new Rect();
        this.mTmpChildRect = new Rect();
        this.mExternalPageChangeCallbacks = new CompositeOnPageChangeCallback(3);
        this.mCurrentItemDirty = false;
        this.mCurrentItemDataSetChangeObserver = new DataSetChangeObserver() { // from class: androidx.viewpager2.widget.ViewPager2.1
            @Override // androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                ViewPager2 viewPager2 = ViewPager2.this;
                viewPager2.mCurrentItemDirty = true;
                viewPager2.mScrollEventAdapter.notifyDataSetChangeHappened();
            }
        };
        this.mPendingCurrentItem = -1;
        this.mSavedItemAnimator = null;
        this.mSavedItemAnimatorPresent = false;
        this.mUserInputEnabled = true;
        this.mOffscreenPageLimit = -1;
        initialize(context, null);
    }

    private RecyclerView.OnChildAttachStateChangeListener enforceChildFillListener() {
        return new RecyclerView.OnChildAttachStateChangeListener() { // from class: androidx.viewpager2.widget.ViewPager2.4
            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewAttachedToWindow(@NonNull View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) layoutParams).width != -1 || ((ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewDetachedFromWindow(@NonNull View view) {
            }
        };
    }

    private void initialize(Context context, AttributeSet attributeSet) {
        this.mAccessibilityProvider = sFeatureEnhancedA11yEnabled ? new PageAwareAccessibilityProvider() : new BasicAccessibilityProvider();
        RecyclerViewImpl recyclerViewImpl = new RecyclerViewImpl(context);
        this.mRecyclerView = recyclerViewImpl;
        recyclerViewImpl.setId(View.generateViewId());
        this.mRecyclerView.setDescendantFocusability(131072);
        LinearLayoutManagerImpl linearLayoutManagerImpl = new LinearLayoutManagerImpl(context);
        this.mLayoutManager = linearLayoutManagerImpl;
        this.mRecyclerView.setLayoutManager(linearLayoutManagerImpl);
        this.mRecyclerView.setScrollingTouchSlop(1);
        setOrientation(context, attributeSet);
        this.mRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mRecyclerView.addOnChildAttachStateChangeListener(enforceChildFillListener());
        ScrollEventAdapter scrollEventAdapter = new ScrollEventAdapter(this);
        this.mScrollEventAdapter = scrollEventAdapter;
        this.mFakeDragger = new FakeDrag(this, scrollEventAdapter, this.mRecyclerView);
        PagerSnapHelperImpl pagerSnapHelperImpl = new PagerSnapHelperImpl();
        this.mPagerSnapHelper = pagerSnapHelperImpl;
        pagerSnapHelperImpl.attachToRecyclerView(this.mRecyclerView);
        this.mRecyclerView.addOnScrollListener(this.mScrollEventAdapter);
        CompositeOnPageChangeCallback compositeOnPageChangeCallback = new CompositeOnPageChangeCallback(3);
        this.mPageChangeEventDispatcher = compositeOnPageChangeCallback;
        this.mScrollEventAdapter.setOnPageChangeCallback(compositeOnPageChangeCallback);
        OnPageChangeCallback onPageChangeCallback = new OnPageChangeCallback() { // from class: androidx.viewpager2.widget.ViewPager2.2
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int i7) {
                if (i7 == 0) {
                    ViewPager2.this.updateCurrentItem();
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i7) {
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.mCurrentItem != i7) {
                    viewPager2.mCurrentItem = i7;
                    viewPager2.mAccessibilityProvider.onSetNewCurrentItem();
                }
            }
        };
        OnPageChangeCallback onPageChangeCallback2 = new OnPageChangeCallback() { // from class: androidx.viewpager2.widget.ViewPager2.3
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i7) {
                ViewPager2.this.clearFocus();
                if (ViewPager2.this.hasFocus()) {
                    ViewPager2.this.mRecyclerView.requestFocus(2);
                }
            }
        };
        this.mPageChangeEventDispatcher.addOnPageChangeCallback(onPageChangeCallback);
        this.mPageChangeEventDispatcher.addOnPageChangeCallback(onPageChangeCallback2);
        this.mAccessibilityProvider.onInitialize(this.mPageChangeEventDispatcher, this.mRecyclerView);
        this.mPageChangeEventDispatcher.addOnPageChangeCallback(this.mExternalPageChangeCallbacks);
        PageTransformerAdapter pageTransformerAdapter = new PageTransformerAdapter(this.mLayoutManager);
        this.mPageTransformerAdapter = pageTransformerAdapter;
        this.mPageChangeEventDispatcher.addOnPageChangeCallback(pageTransformerAdapter);
        RecyclerView recyclerView = this.mRecyclerView;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void registerCurrentItemDataSetTracker(@Nullable RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mCurrentItemDataSetChangeObserver);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void restorePendingState() {
        RecyclerView.Adapter adapter;
        if (this.mPendingCurrentItem == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.mPendingAdapterState;
        if (parcelable != null) {
            if (adapter instanceof StatefulAdapter) {
                ((StatefulAdapter) adapter).restoreState(parcelable);
            }
            this.mPendingAdapterState = null;
        }
        int iMax = Math.max(0, Math.min(this.mPendingCurrentItem, adapter.getItemCount() - 1));
        this.mCurrentItem = iMax;
        this.mPendingCurrentItem = -1;
        this.mRecyclerView.scrollToPosition(iMax);
        this.mAccessibilityProvider.onRestorePendingState();
    }

    private void setOrientation(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.ViewPager2);
        N.p(this, context, a.ViewPager2, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(a.ViewPager2_android_orientation, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void unregisterCurrentItemDataSetTracker(@Nullable RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.mCurrentItemDataSetChangeObserver);
        }
    }

    public void addItemDecoration(@NonNull RecyclerView.ItemDecoration itemDecoration) {
        this.mRecyclerView.addItemDecoration(itemDecoration);
    }

    public boolean beginFakeDrag() {
        return this.mFakeDragger.beginFakeDrag();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i7) {
        return this.mRecyclerView.canScrollHorizontally(i7);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i7) {
        return this.mRecyclerView.canScrollVertically(i7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i7 = ((SavedState) parcelable).mRecyclerViewId;
            sparseArray.put(this.mRecyclerView.getId(), sparseArray.get(i7));
            sparseArray.remove(i7);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        restorePendingState();
    }

    public boolean endFakeDrag() {
        return this.mFakeDragger.endFakeDrag();
    }

    public boolean fakeDragBy(@Px @SuppressLint({"SupportAnnotationUsage"}) float f10) {
        return this.mFakeDragger.fakeDragBy(f10);
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi(23)
    public CharSequence getAccessibilityClassName() {
        return this.mAccessibilityProvider.handlesGetAccessibilityClassName() ? this.mAccessibilityProvider.onGetAccessibilityClassName() : super.getAccessibilityClassName();
    }

    @Nullable
    public RecyclerView.Adapter getAdapter() {
        return this.mRecyclerView.getAdapter();
    }

    public int getCurrentItem() {
        return this.mCurrentItem;
    }

    @NonNull
    public RecyclerView.ItemDecoration getItemDecorationAt(int i7) {
        return this.mRecyclerView.getItemDecorationAt(i7);
    }

    public int getItemDecorationCount() {
        return this.mRecyclerView.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getOrientation() {
        return this.mLayoutManager.getOrientation() == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.mRecyclerView;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.mScrollEventAdapter.getScrollState();
    }

    public void invalidateItemDecorations() {
        this.mRecyclerView.invalidateItemDecorations();
    }

    public boolean isFakeDragging() {
        return this.mFakeDragger.isFakeDragging();
    }

    public boolean isRtl() {
        return this.mLayoutManager.getLayoutDirection() == 1;
    }

    public boolean isUserInputEnabled() {
        return this.mUserInputEnabled;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.mAccessibilityProvider.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        int measuredWidth = this.mRecyclerView.getMeasuredWidth();
        int measuredHeight = this.mRecyclerView.getMeasuredHeight();
        this.mTmpContainerRect.left = getPaddingLeft();
        this.mTmpContainerRect.right = (i11 - i7) - getPaddingRight();
        this.mTmpContainerRect.top = getPaddingTop();
        this.mTmpContainerRect.bottom = (i12 - i10) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.mTmpContainerRect, this.mTmpChildRect);
        RecyclerView recyclerView = this.mRecyclerView;
        Rect rect = this.mTmpChildRect;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.mCurrentItemDirty) {
            updateCurrentItem();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        measureChild(this.mRecyclerView, i7, i10);
        int measuredWidth = this.mRecyclerView.getMeasuredWidth();
        int measuredHeight = this.mRecyclerView.getMeasuredHeight();
        int measuredState = this.mRecyclerView.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i7, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mPendingCurrentItem = savedState.mCurrentItem;
        this.mPendingAdapterState = savedState.mAdapterState;
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.mRecyclerViewId = this.mRecyclerView.getId();
        int i7 = this.mPendingCurrentItem;
        if (i7 == -1) {
            i7 = this.mCurrentItem;
        }
        savedState.mCurrentItem = i7;
        Parcelable parcelable = this.mPendingAdapterState;
        if (parcelable != null) {
            savedState.mAdapterState = parcelable;
            return savedState;
        }
        Object adapter = this.mRecyclerView.getAdapter();
        if (adapter instanceof StatefulAdapter) {
            savedState.mAdapterState = ((StatefulAdapter) adapter).saveState();
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i7, @Nullable Bundle bundle) {
        return this.mAccessibilityProvider.handlesPerformAccessibilityAction(i7, bundle) ? this.mAccessibilityProvider.onPerformAccessibilityAction(i7, bundle) : super.performAccessibilityAction(i7, bundle);
    }

    public void registerOnPageChangeCallback(@NonNull OnPageChangeCallback onPageChangeCallback) {
        this.mExternalPageChangeCallbacks.addOnPageChangeCallback(onPageChangeCallback);
    }

    public void removeItemDecoration(@NonNull RecyclerView.ItemDecoration itemDecoration) {
        this.mRecyclerView.removeItemDecoration(itemDecoration);
    }

    public void removeItemDecorationAt(int i7) {
        this.mRecyclerView.removeItemDecorationAt(i7);
    }

    public void requestTransform() {
        if (this.mPageTransformerAdapter.getPageTransformer() == null) {
            return;
        }
        double relativeScrollPosition = this.mScrollEventAdapter.getRelativeScrollPosition();
        int i7 = (int) relativeScrollPosition;
        float f10 = (float) (relativeScrollPosition - ((double) i7));
        this.mPageTransformerAdapter.onPageScrolled(i7, f10, Math.round(getPageSize() * f10));
    }

    public void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.mRecyclerView.getAdapter();
        this.mAccessibilityProvider.onDetachAdapter(adapter2);
        unregisterCurrentItemDataSetTracker(adapter2);
        this.mRecyclerView.setAdapter(adapter);
        this.mCurrentItem = 0;
        restorePendingState();
        this.mAccessibilityProvider.onAttachAdapter(adapter);
        registerCurrentItemDataSetTracker(adapter);
    }

    public void setCurrentItem(int i7) {
        setCurrentItem(i7, true);
    }

    public void setCurrentItemInternal(int i7, boolean z3) {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.mPendingCurrentItem != -1) {
                this.mPendingCurrentItem = Math.max(i7, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i7, 0), adapter.getItemCount() - 1);
        if (iMin == this.mCurrentItem && this.mScrollEventAdapter.isIdle()) {
            return;
        }
        int i10 = this.mCurrentItem;
        if (iMin == i10 && z3) {
            return;
        }
        double relativeScrollPosition = i10;
        this.mCurrentItem = iMin;
        this.mAccessibilityProvider.onSetNewCurrentItem();
        if (!this.mScrollEventAdapter.isIdle()) {
            relativeScrollPosition = this.mScrollEventAdapter.getRelativeScrollPosition();
        }
        this.mScrollEventAdapter.notifyProgrammaticScroll(iMin, z3);
        if (!z3) {
            this.mRecyclerView.scrollToPosition(iMin);
            return;
        }
        double d2 = iMin;
        if (Math.abs(d2 - relativeScrollPosition) <= 3.0d) {
            this.mRecyclerView.smoothScrollToPosition(iMin);
            return;
        }
        this.mRecyclerView.scrollToPosition(d2 > relativeScrollPosition ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.mRecyclerView;
        recyclerView.post(new SmoothScrollToPosition(iMin, recyclerView));
    }

    @Override // android.view.View
    public void setLayoutDirection(int i7) {
        super.setLayoutDirection(i7);
        this.mAccessibilityProvider.onSetLayoutDirection();
    }

    public void setOffscreenPageLimit(int i7) {
        if (i7 < 1 && i7 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.mOffscreenPageLimit = i7;
        this.mRecyclerView.requestLayout();
    }

    public void setPageTransformer(@Nullable PageTransformer pageTransformer) {
        if (pageTransformer != null) {
            if (!this.mSavedItemAnimatorPresent) {
                this.mSavedItemAnimator = this.mRecyclerView.getItemAnimator();
                this.mSavedItemAnimatorPresent = true;
            }
            this.mRecyclerView.setItemAnimator(null);
        } else if (this.mSavedItemAnimatorPresent) {
            this.mRecyclerView.setItemAnimator(this.mSavedItemAnimator);
            this.mSavedItemAnimator = null;
            this.mSavedItemAnimatorPresent = false;
        }
        if (pageTransformer == this.mPageTransformerAdapter.getPageTransformer()) {
            return;
        }
        this.mPageTransformerAdapter.setPageTransformer(pageTransformer);
        requestTransform();
    }

    public void setUserInputEnabled(boolean z3) {
        this.mUserInputEnabled = z3;
        this.mAccessibilityProvider.onSetUserInputEnabled();
    }

    public void snapToPage() {
        View viewFindSnapView = this.mPagerSnapHelper.findSnapView(this.mLayoutManager);
        if (viewFindSnapView == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = this.mPagerSnapHelper.calculateDistanceToFinalSnap(this.mLayoutManager, viewFindSnapView);
        int i7 = iArrCalculateDistanceToFinalSnap[0];
        if (i7 == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.smoothScrollBy(i7, iArrCalculateDistanceToFinalSnap[1]);
    }

    public void unregisterOnPageChangeCallback(@NonNull OnPageChangeCallback onPageChangeCallback) {
        this.mExternalPageChangeCallbacks.removeOnPageChangeCallback(onPageChangeCallback);
    }

    public void updateCurrentItem() {
        PagerSnapHelper pagerSnapHelper = this.mPagerSnapHelper;
        if (pagerSnapHelper == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewFindSnapView = pagerSnapHelper.findSnapView(this.mLayoutManager);
        if (viewFindSnapView == null) {
            return;
        }
        int position = this.mLayoutManager.getPosition(viewFindSnapView);
        if (position != this.mCurrentItem && getScrollState() == 0) {
            this.mPageChangeEventDispatcher.onPageSelected(position);
        }
        this.mCurrentItemDirty = false;
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.viewpager2.widget.ViewPager2.SavedState.1
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
                return createFromParcel(parcel, (ClassLoader) null);
            }
        };
        Parcelable mAdapterState;
        int mCurrentItem;
        int mRecyclerViewId;

        @RequiresApi(24)
        @SuppressLint({"ClassVerificationFailure"})
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readValues(parcel, classLoader);
        }

        private void readValues(Parcel parcel, ClassLoader classLoader) {
            this.mRecyclerViewId = parcel.readInt();
            this.mCurrentItem = parcel.readInt();
            this.mAdapterState = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.mRecyclerViewId);
            parcel.writeInt(this.mCurrentItem);
            parcel.writeParcelable(this.mAdapterState, i7);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            readValues(parcel, null);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void addItemDecoration(@NonNull RecyclerView.ItemDecoration itemDecoration, int i7) {
        this.mRecyclerView.addItemDecoration(itemDecoration, i7);
    }

    public void setCurrentItem(int i7, boolean z3) {
        if (isFakeDragging()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        setCurrentItemInternal(i7, z3);
    }

    public void setOrientation(int i7) {
        this.mLayoutManager.setOrientation(i7);
        this.mAccessibilityProvider.onSetOrientation();
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTmpContainerRect = new Rect();
        this.mTmpChildRect = new Rect();
        this.mExternalPageChangeCallbacks = new CompositeOnPageChangeCallback(3);
        this.mCurrentItemDirty = false;
        this.mCurrentItemDataSetChangeObserver = new DataSetChangeObserver() { // from class: androidx.viewpager2.widget.ViewPager2.1
            @Override // androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                ViewPager2 viewPager2 = ViewPager2.this;
                viewPager2.mCurrentItemDirty = true;
                viewPager2.mScrollEventAdapter.notifyDataSetChangeHappened();
            }
        };
        this.mPendingCurrentItem = -1;
        this.mSavedItemAnimator = null;
        this.mSavedItemAnimatorPresent = false;
        this.mUserInputEnabled = true;
        this.mOffscreenPageLimit = -1;
        initialize(context, attributeSet);
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mTmpContainerRect = new Rect();
        this.mTmpChildRect = new Rect();
        this.mExternalPageChangeCallbacks = new CompositeOnPageChangeCallback(3);
        this.mCurrentItemDirty = false;
        this.mCurrentItemDataSetChangeObserver = new DataSetChangeObserver() { // from class: androidx.viewpager2.widget.ViewPager2.1
            @Override // androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                ViewPager2 viewPager2 = ViewPager2.this;
                viewPager2.mCurrentItemDirty = true;
                viewPager2.mScrollEventAdapter.notifyDataSetChangeHappened();
            }
        };
        this.mPendingCurrentItem = -1;
        this.mSavedItemAnimator = null;
        this.mSavedItemAnimatorPresent = false;
        this.mUserInputEnabled = true;
        this.mOffscreenPageLimit = -1;
        initialize(context, attributeSet);
    }

    public abstract class AccessibilityProvider {
        private AccessibilityProvider() {
        }

        public boolean handlesGetAccessibilityClassName() {
            return false;
        }

        public boolean handlesLmPerformAccessibilityAction(int i7) {
            return false;
        }

        public boolean handlesPerformAccessibilityAction(int i7, Bundle bundle) {
            return false;
        }

        public boolean handlesRvGetAccessibilityClassName() {
            return false;
        }

        public void onAttachAdapter(@Nullable RecyclerView.Adapter<?> adapter) {
        }

        public void onDetachAdapter(@Nullable RecyclerView.Adapter<?> adapter) {
        }

        public String onGetAccessibilityClassName() {
            throw new IllegalStateException("Not implemented.");
        }

        public void onInitialize(@NonNull CompositeOnPageChangeCallback compositeOnPageChangeCallback, @NonNull RecyclerView recyclerView) {
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        public boolean onLmPerformAccessibilityAction(int i7) {
            throw new IllegalStateException("Not implemented.");
        }

        public boolean onPerformAccessibilityAction(int i7, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        public void onRestorePendingState() {
        }

        public CharSequence onRvGetAccessibilityClassName() {
            throw new IllegalStateException("Not implemented.");
        }

        public void onRvInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        }

        public void onSetLayoutDirection() {
        }

        public void onSetNewCurrentItem() {
        }

        public void onSetOrientation() {
        }

        public void onSetUserInputEnabled() {
        }

        public void onLmInitializeAccessibilityNodeInfo(@NonNull d dVar) {
        }

        public void onLmInitializeAccessibilityNodeInfoForItem(@NonNull View view, @NonNull d dVar) {
        }
    }

    @RequiresApi(21)
    @SuppressLint({"ClassVerificationFailure"})
    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7, int i10) {
        super(context, attributeSet, i7, i10);
        this.mTmpContainerRect = new Rect();
        this.mTmpChildRect = new Rect();
        this.mExternalPageChangeCallbacks = new CompositeOnPageChangeCallback(3);
        this.mCurrentItemDirty = false;
        this.mCurrentItemDataSetChangeObserver = new DataSetChangeObserver() { // from class: androidx.viewpager2.widget.ViewPager2.1
            @Override // androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                ViewPager2 viewPager2 = ViewPager2.this;
                viewPager2.mCurrentItemDirty = true;
                viewPager2.mScrollEventAdapter.notifyDataSetChangeHappened();
            }
        };
        this.mPendingCurrentItem = -1;
        this.mSavedItemAnimator = null;
        this.mSavedItemAnimatorPresent = false;
        this.mUserInputEnabled = true;
        this.mOffscreenPageLimit = -1;
        initialize(context, attributeSet);
    }
}
