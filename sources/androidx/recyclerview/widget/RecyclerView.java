package androidx.recyclerview.widget;

import C0.G;
import I0.d;
import N8.q0;
import Sd.b;
import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import androidx.core.os.j;
import androidx.core.view.C1050b;
import androidx.core.view.H;
import androidx.core.view.N;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.O;
import androidx.core.view.P;
import androidx.core.view.Q;
import androidx.core.view.ScrollingView;
import androidx.core.view.r;
import androidx.customview.poolingcontainer.PoolingContainerListener;
import androidx.customview.view.AbsSavedState;
import com.alibaba.android.arouter.utils.Consts;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.account.ui.activity.SetUserPhotoActivity;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import p090g0.a;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, NestedScrollingChild2, NestedScrollingChild3 {
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static boolean sDebugAssertionsEnabled = false;
    static final StretchEdgeEffectFactory sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled = false;
    RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    Adapter mAdapter;
    AdapterHelper mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private ChildDrawingOrderCallback mChildDrawingOrderCallback;
    ChildHelper mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;

    @NonNull
    private EdgeEffectFactory mEdgeEffectFactory;
    boolean mEnableFastScroller;

    @VisibleForTesting
    boolean mFirstLayoutComplete;
    GapWorker mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private OnItemTouchListener mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    ItemAnimator mItemAnimator;
    private ItemAnimator.ItemAnimatorListener mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<ItemDecoration> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;

    @VisibleForTesting
    LayoutManager mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final RecyclerViewDataObserver mObserver;
    private List<OnChildAttachStateChangeListener> mOnChildAttachStateListeners;
    private OnFlingListener mOnFlingListener;
    private final ArrayList<OnItemTouchListener> mOnItemTouchListeners;

    @VisibleForTesting
    final List<ViewHolder> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    GapWorker.LayoutPrefetchRegistryImpl mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final Recycler mRecycler;
    RecyclerListener mRecyclerListener;
    final List<RecyclerListener> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private OnScrollListener mScrollListener;
    private List<OnScrollListener> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private r mScrollingChildHelper;
    final State mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final ViewFlinger mViewFlinger;
    private final ViewInfoStore.ProcessCallback mViewInfoProcessCallback;
    final ViewInfoStore mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$7, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$androidx$recyclerview$widget$RecyclerView$Adapter$StateRestorationPolicy;

        static {
            int[] iArr = new int[Adapter.StateRestorationPolicy.values().length];
            $SwitchMap$androidx$recyclerview$widget$RecyclerView$Adapter$StateRestorationPolicy = iArr;
            try {
                iArr[Adapter.StateRestorationPolicy.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$recyclerview$widget$RecyclerView$Adapter$StateRestorationPolicy[Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class Adapter<VH extends ViewHolder> {
        private final AdapterDataObservable mObservable = new AdapterDataObservable();
        private boolean mHasStableIds = false;
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;

        public enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(@NonNull VH vh2, int i7) {
            boolean z3 = vh2.mBindingAdapter == null;
            if (z3) {
                vh2.mPosition = i7;
                if (hasStableIds()) {
                    vh2.mItemId = getItemId(i7);
                }
                vh2.setFlags(1, MessageEvent.EVENT_BALANCE_SECURITY_STATE_CHANGE);
                int i10 = j.f16100a;
                Trace.beginSection(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh2.mBindingAdapter = this;
            if (RecyclerView.sDebugAssertionsEnabled) {
                if (vh2.itemView.getParent() == null) {
                    View view = vh2.itemView;
                    WeakHashMap weakHashMap = N.f16168a;
                    if (view.isAttachedToWindow() != vh2.isTmpDetached()) {
                        throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + vh2.isTmpDetached() + ", attached to window: " + vh2.itemView.isAttachedToWindow() + ", holder: " + vh2);
                    }
                }
                if (vh2.itemView.getParent() == null) {
                    View view2 = vh2.itemView;
                    WeakHashMap weakHashMap2 = N.f16168a;
                    if (view2.isAttachedToWindow()) {
                        throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + vh2);
                    }
                }
            }
            onBindViewHolder(vh2, i7, vh2.getUnmodifiedPayloads());
            if (z3) {
                vh2.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh2.itemView.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).mInsetsDirty = true;
                }
                int i11 = j.f16100a;
                Trace.endSection();
            }
        }

        public boolean canRestoreState() {
            int i7 = AnonymousClass7.$SwitchMap$androidx$recyclerview$widget$RecyclerView$Adapter$StateRestorationPolicy[this.mStateRestorationPolicy.ordinal()];
            return i7 != 1 && (i7 != 2 || getItemCount() > 0);
        }

        @NonNull
        public final VH createViewHolder(@NonNull ViewGroup viewGroup, int i7) {
            try {
                int i10 = j.f16100a;
                Trace.beginSection(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH vh2 = (VH) onCreateViewHolder(viewGroup, i7);
                if (vh2.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh2.mItemViewType = i7;
                Trace.endSection();
                return vh2;
            } catch (Throwable th) {
                int i11 = j.f16100a;
                Trace.endSection();
                throw th;
            }
        }

        public int findRelativeAdapterPositionIn(@NonNull Adapter<? extends ViewHolder> adapter, @NonNull ViewHolder viewHolder, int i7) {
            if (adapter == this) {
                return i7;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i7) {
            return -1L;
        }

        public int getItemViewType(int i7) {
            return 0;
        }

        @NonNull
        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.hasObservers();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.notifyChanged();
        }

        public void notifyDatasetChanged() {
            notifyDataSetChanged();
        }

        public final void notifyItemChanged(int i7) {
            this.mObservable.notifyItemRangeChanged(i7, 1);
        }

        public final void notifyItemInserted(int i7) {
            this.mObservable.notifyItemRangeInserted(i7, 1);
        }

        public final void notifyItemMoved(int i7, int i10) {
            this.mObservable.notifyItemMoved(i7, i10);
        }

        public final void notifyItemRangeChanged(int i7, int i10) {
            this.mObservable.notifyItemRangeChanged(i7, i10);
        }

        public final void notifyItemRangeInserted(int i7, int i10) {
            this.mObservable.notifyItemRangeInserted(i7, i10);
        }

        public final void notifyItemRangeRemoved(int i7, int i10) {
            this.mObservable.notifyItemRangeRemoved(i7, i10);
        }

        public final void notifyItemRemoved(int i7) {
            this.mObservable.notifyItemRangeRemoved(i7, 1);
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(@NonNull VH vh2, int i7);

        public void onBindViewHolder(@NonNull VH vh2, int i7, @NonNull List<Object> list) {
            onBindViewHolder(vh2, i7);
        }

        @NonNull
        public abstract VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i7);

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@NonNull VH vh2) {
            return false;
        }

        public void onViewAttachedToWindow(@NonNull VH vh2) {
        }

        public void onViewDetachedFromWindow(@NonNull VH vh2) {
        }

        public void onViewRecycled(@NonNull VH vh2) {
        }

        public void registerAdapterDataObserver(@NonNull AdapterDataObserver adapterDataObserver) {
            this.mObservable.registerObserver(adapterDataObserver);
        }

        public void setHasStableIds(boolean z3) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z3;
        }

        public void setStateRestorationPolicy(@NonNull StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.notifyStateRestorationPolicyChanged();
        }

        public void unregisterAdapterDataObserver(@NonNull AdapterDataObserver adapterDataObserver) {
            this.mObservable.unregisterObserver(adapterDataObserver);
        }

        public final void notifyItemChanged(int i7, @Nullable Object obj) {
            this.mObservable.notifyItemRangeChanged(i7, 1, obj);
        }

        public final void notifyItemRangeChanged(int i7, int i10, @Nullable Object obj) {
            this.mObservable.notifyItemRangeChanged(i7, i10, obj);
        }
    }

    public static class AdapterDataObservable extends Observable<AdapterDataObserver> {
        public boolean hasObservers() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void notifyChanged() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        public void notifyItemMoved(int i7, int i10) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i7, i10, 1);
            }
        }

        public void notifyItemRangeChanged(int i7, int i10) {
            notifyItemRangeChanged(i7, i10, null);
        }

        public void notifyItemRangeInserted(int i7, int i10) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i7, i10);
            }
        }

        public void notifyItemRangeRemoved(int i7, int i10) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i7, i10);
            }
        }

        public void notifyStateRestorationPolicyChanged() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }

        public void notifyItemRangeChanged(int i7, int i10, @Nullable Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AdapterDataObserver) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i7, i10, obj);
            }
        }
    }

    public static abstract class AdapterDataObserver {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i7, int i10) {
        }

        public void onItemRangeInserted(int i7, int i10) {
        }

        public void onItemRangeMoved(int i7, int i10, int i11) {
        }

        public void onItemRangeRemoved(int i7, int i10) {
        }

        public void onStateRestorationPolicyChanged() {
        }

        public void onItemRangeChanged(int i7, int i10, @Nullable Object obj) {
            onItemRangeChanged(i7, i10);
        }
    }

    public interface ChildDrawingOrderCallback {
        int onGetChildDrawingOrder(int i7, int i10);
    }

    public static class EdgeEffectFactory {
        public static final int DIRECTION_BOTTOM = 3;
        public static final int DIRECTION_LEFT = 0;
        public static final int DIRECTION_RIGHT = 2;
        public static final int DIRECTION_TOP = 1;

        @Retention(RetentionPolicy.SOURCE)
        public @interface EdgeDirection {
        }

        @NonNull
        public EdgeEffect createEdgeEffect(@NonNull RecyclerView recyclerView, int i7) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class ItemAnimator {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private ItemAnimatorListener mListener = null;
        private ArrayList<ItemAnimatorFinishedListener> mFinishedListeners = new ArrayList<>();
        private long mAddDuration = 120;
        private long mRemoveDuration = 120;
        private long mMoveDuration = 250;
        private long mChangeDuration = 250;

        @Retention(RetentionPolicy.SOURCE)
        public @interface AdapterChanges {
        }

        public interface ItemAnimatorFinishedListener {
            void onAnimationsFinished();
        }

        public interface ItemAnimatorListener {
            void onAnimationFinished(@NonNull ViewHolder viewHolder);
        }

        public static class ItemHolderInfo {
            public int bottom;
            public int changeFlags;
            public int left;
            public int right;

            /* JADX INFO: renamed from: top, reason: collision with root package name */
            public int f17680top;

            @NonNull
            public ItemHolderInfo setFrom(@NonNull ViewHolder viewHolder) {
                return setFrom(viewHolder, 0);
            }

            @NonNull
            public ItemHolderInfo setFrom(@NonNull ViewHolder viewHolder, int i7) {
                View view = viewHolder.itemView;
                this.left = view.getLeft();
                this.f17680top = view.getTop();
                this.right = view.getRight();
                this.bottom = view.getBottom();
                return this;
            }
        }

        public static int buildAdapterChangeFlagsForAnimations(ViewHolder viewHolder) {
            int i7 = viewHolder.mFlags;
            int i10 = i7 & 14;
            if (viewHolder.isInvalid()) {
                return 4;
            }
            if ((i7 & 4) == 0) {
                int oldPosition = viewHolder.getOldPosition();
                int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i10 | 2048;
                }
            }
            return i10;
        }

        public abstract boolean animateAppearance(@NonNull ViewHolder viewHolder, @Nullable ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2);

        public abstract boolean animateChange(@NonNull ViewHolder viewHolder, @NonNull ViewHolder viewHolder2, @NonNull ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2);

        public abstract boolean animateDisappearance(@NonNull ViewHolder viewHolder, @NonNull ItemHolderInfo itemHolderInfo, @Nullable ItemHolderInfo itemHolderInfo2);

        public abstract boolean animatePersistence(@NonNull ViewHolder viewHolder, @NonNull ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2);

        public boolean canReuseUpdatedViewHolder(@NonNull ViewHolder viewHolder) {
            return true;
        }

        public final void dispatchAnimationFinished(@NonNull ViewHolder viewHolder) {
            onAnimationFinished(viewHolder);
            ItemAnimatorListener itemAnimatorListener = this.mListener;
            if (itemAnimatorListener != null) {
                itemAnimatorListener.onAnimationFinished(viewHolder);
            }
        }

        public final void dispatchAnimationStarted(@NonNull ViewHolder viewHolder) {
            onAnimationStarted(viewHolder);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            for (int i7 = 0; i7 < size; i7++) {
                this.mFinishedListeners.get(i7).onAnimationsFinished();
            }
            this.mFinishedListeners.clear();
        }

        public abstract void endAnimation(@NonNull ViewHolder viewHolder);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(@Nullable ItemAnimatorFinishedListener itemAnimatorFinishedListener) {
            boolean zIsRunning = isRunning();
            if (itemAnimatorFinishedListener != null) {
                if (!zIsRunning) {
                    itemAnimatorFinishedListener.onAnimationsFinished();
                    return zIsRunning;
                }
                this.mFinishedListeners.add(itemAnimatorFinishedListener);
            }
            return zIsRunning;
        }

        @NonNull
        public ItemHolderInfo obtainHolderInfo() {
            return new ItemHolderInfo();
        }

        public void onAnimationFinished(@NonNull ViewHolder viewHolder) {
        }

        public void onAnimationStarted(@NonNull ViewHolder viewHolder) {
        }

        @NonNull
        public ItemHolderInfo recordPostLayoutInformation(@NonNull State state, @NonNull ViewHolder viewHolder) {
            return obtainHolderInfo().setFrom(viewHolder);
        }

        @NonNull
        public ItemHolderInfo recordPreLayoutInformation(@NonNull State state, @NonNull ViewHolder viewHolder, int i7, @NonNull List<Object> list) {
            return obtainHolderInfo().setFrom(viewHolder);
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long j6) {
            this.mAddDuration = j6;
        }

        public void setChangeDuration(long j6) {
            this.mChangeDuration = j6;
        }

        public void setListener(ItemAnimatorListener itemAnimatorListener) {
            this.mListener = itemAnimatorListener;
        }

        public void setMoveDuration(long j6) {
            this.mMoveDuration = j6;
        }

        public void setRemoveDuration(long j6) {
            this.mRemoveDuration = j6;
        }

        public boolean canReuseUpdatedViewHolder(@NonNull ViewHolder viewHolder, @NonNull List<Object> list) {
            return canReuseUpdatedViewHolder(viewHolder);
        }
    }

    public class ItemAnimatorRestoreListener implements ItemAnimator.ItemAnimatorListener {
        public ItemAnimatorRestoreListener() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorListener
        public void onAnimationFinished(ViewHolder viewHolder) {
            viewHolder.setIsRecyclable(true);
            if (viewHolder.mShadowedHolder != null && viewHolder.mShadowingHolder == null) {
                viewHolder.mShadowedHolder = null;
            }
            viewHolder.mShadowingHolder = null;
            if (viewHolder.shouldBeKeptAsChild() || RecyclerView.this.removeAnimatingView(viewHolder.itemView) || !viewHolder.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
        }
    }

    public static abstract class ItemDecoration {
        @Deprecated
        public void getItemOffsets(@NonNull Rect rect, int i7, @NonNull RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull State state) {
            getItemOffsets(rect, ((LayoutParams) view.getLayoutParams()).getViewLayoutPosition(), recyclerView);
        }

        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull State state) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull State state) {
            onDrawOver(canvas, recyclerView);
        }
    }

    public static abstract class LayoutManager {
        boolean mAutoMeasure;
        ChildHelper mChildHelper;
        private int mHeight;
        private int mHeightMode;
        ViewBoundsCheck mHorizontalBoundCheck;
        private final ViewBoundsCheck.Callback mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;

        @Nullable
        SmoothScroller mSmoothScroller;
        ViewBoundsCheck mVerticalBoundCheck;
        private final ViewBoundsCheck.Callback mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        public interface LayoutPrefetchRegistry {
            void addPosition(int i7, int i10);
        }

        public static class Properties {
            public int orientation;
            public boolean reverseLayout;
            public int spanCount;
            public boolean stackFromEnd;
        }

        public LayoutManager() {
            ViewBoundsCheck.Callback callback = new ViewBoundsCheck.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.LayoutManager.1
                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public View getChildAt(int i7) {
                    return LayoutManager.this.getChildAt(i7);
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getChildEnd(View view) {
                    return LayoutManager.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).rightMargin;
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getChildStart(View view) {
                    return LayoutManager.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).leftMargin;
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getParentEnd() {
                    return LayoutManager.this.getWidth() - LayoutManager.this.getPaddingRight();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getParentStart() {
                    return LayoutManager.this.getPaddingLeft();
                }
            };
            this.mHorizontalBoundCheckCallback = callback;
            ViewBoundsCheck.Callback callback2 = new ViewBoundsCheck.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.LayoutManager.2
                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public View getChildAt(int i7) {
                    return LayoutManager.this.getChildAt(i7);
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getChildEnd(View view) {
                    return LayoutManager.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getChildStart(View view) {
                    return LayoutManager.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).topMargin;
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getParentEnd() {
                    return LayoutManager.this.getHeight() - LayoutManager.this.getPaddingBottom();
                }

                @Override // androidx.recyclerview.widget.ViewBoundsCheck.Callback
                public int getParentStart() {
                    return LayoutManager.this.getPaddingTop();
                }
            };
            this.mVerticalBoundCheckCallback = callback2;
            this.mHorizontalBoundCheck = new ViewBoundsCheck(callback);
            this.mVerticalBoundCheck = new ViewBoundsCheck(callback2);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        private void addViewInt(View view, int i7, boolean z3) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z3 || childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.addToDisappearedInLayout(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(childViewHolderInt);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.attachViewToParent(view, i7, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int iIndexOfChild = this.mChildHelper.indexOfChild(view);
                if (i7 == -1) {
                    i7 = this.mChildHelper.getChildCount();
                }
                if (iIndexOfChild == -1) {
                    StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb2.append(this.mRecyclerView.indexOfChild(view));
                    throw new IllegalStateException(u.j(this.mRecyclerView, sb2));
                }
                if (iIndexOfChild != i7) {
                    this.mRecyclerView.mLayout.moveView(iIndexOfChild, i7);
                }
            } else {
                this.mChildHelper.addView(view, i7, false);
                layoutParams.mInsetsDirty = true;
                SmoothScroller smoothScroller = this.mSmoothScroller;
                if (smoothScroller != null && smoothScroller.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (layoutParams.mPendingInvalidate) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Objects.toString(layoutParams.mViewHolder);
                }
                childViewHolderInt.itemView.invalidate();
                layoutParams.mPendingInvalidate = false;
            }
        }

        public static int chooseSize(int i7, int i10, int i11) {
            int mode = View.MeasureSpec.getMode(i7);
            int size = View.MeasureSpec.getSize(i7);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i10, i11) : size;
            }
            return Math.min(size, Math.max(i10, i11));
        }

        private void detachViewInternal(int i7, @NonNull View view) {
            this.mChildHelper.detachViewFromParent(i7);
        }

        /* JADX WARN: Code duplicated, block: B:5:0x000c A[PHI: r3
          0x000c: PHI (r3v5 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x0010, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:6:0x000e  */
        @Deprecated
        public static int getChildMeasureSpec(int i7, int i10, int i11, boolean z3) {
            int i12 = i7 - i10;
            int i13 = 0;
            int iMax = Math.max(0, i12);
            if (z3) {
                if (i11 >= 0) {
                    i13 = 1073741824;
                } else {
                    i11 = 0;
                }
            } else if (i11 >= 0) {
                i13 = 1073741824;
            } else if (i11 == -1) {
                i11 = iMax;
                i13 = 1073741824;
            } else if (i11 == -2) {
                i13 = Integer.MIN_VALUE;
                i11 = iMax;
            } else {
                i11 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i11, i13);
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top2 = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top2;
            int i7 = left - paddingLeft;
            int iMin = Math.min(0, i7);
            int i10 = top2 - paddingTop;
            int iMin2 = Math.min(0, i10);
            int i11 = iWidth - width;
            int iMax = Math.max(0, i11);
            int iMax2 = Math.max(0, iHeight - height);
            if (getLayoutDirection() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i7, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i11);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i10, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        public static Properties getProperties(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7, int i10) {
            Properties properties = new Properties();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.RecyclerView, i7, i10);
            properties.orientation = typedArrayObtainStyledAttributes.getInt(d.RecyclerView_android_orientation, 1);
            properties.spanCount = typedArrayObtainStyledAttributes.getInt(d.RecyclerView_spanCount, 1);
            properties.reverseLayout = typedArrayObtainStyledAttributes.getBoolean(d.RecyclerView_reverseLayout, false);
            properties.stackFromEnd = typedArrayObtainStyledAttributes.getBoolean(d.RecyclerView_stackFromEnd, false);
            typedArrayObtainStyledAttributes.recycle();
            return properties;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i7, int i10) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i7 < width && rect.right - i7 > paddingLeft && rect.top - i10 < height && rect.bottom - i10 > paddingTop;
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

        private void scrapOrRecycleView(Recycler recycler, int i7, View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
            } else if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i7);
                recycler.recycleViewHolderInternal(childViewHolderInt);
            } else {
                detachViewAt(i7);
                recycler.scrapView(view);
                this.mRecyclerView.mViewInfoStore.onViewDetached(childViewHolderInt);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(@NonNull View view, int i7, LayoutParams layoutParams) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.addToDisappearedInLayout(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(childViewHolderInt);
            }
            this.mChildHelper.attachViewToParent(view, i7, layoutParams, childViewHolderInt.isRemoved());
        }

        public void calculateItemDecorationsForChild(@NonNull View view, @NonNull Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        @SuppressLint({"UnknownNullness"})
        public void collectAdjacentPrefetchPositions(int i7, int i10, State state, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        @SuppressLint({"UnknownNullness"})
        public void collectInitialPrefetchPositions(int i7, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        }

        public int computeHorizontalScrollExtent(@NonNull State state) {
            return 0;
        }

        public int computeHorizontalScrollOffset(@NonNull State state) {
            return 0;
        }

        public int computeHorizontalScrollRange(@NonNull State state) {
            return 0;
        }

        public int computeVerticalScrollExtent(@NonNull State state) {
            return 0;
        }

        public int computeVerticalScrollOffset(@NonNull State state) {
            return 0;
        }

        public int computeVerticalScrollRange(@NonNull State state) {
            return 0;
        }

        public void detachAndScrapAttachedViews(@NonNull Recycler recycler) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(recycler, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(@NonNull View view, @NonNull Recycler recycler) {
            scrapOrRecycleView(recycler, this.mChildHelper.indexOfChild(view), view);
        }

        public void detachAndScrapViewAt(int i7, @NonNull Recycler recycler) {
            scrapOrRecycleView(recycler, i7, getChildAt(i7));
        }

        public void detachView(@NonNull View view) {
            int iIndexOfChild = this.mChildHelper.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                detachViewInternal(iIndexOfChild, view);
            }
        }

        public void detachViewAt(int i7) {
            detachViewInternal(i7, getChildAt(i7));
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, recycler);
        }

        @SuppressLint({"UnknownNullness"})
        public void endAnimation(View view) {
            ItemAnimator itemAnimator = this.mRecyclerView.mItemAnimator;
            if (itemAnimator != null) {
                itemAnimator.endAnimation(RecyclerView.getChildViewHolderInt(view));
            }
        }

        @Nullable
        public View findContainingItemView(@NonNull View view) {
            View viewFindContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.isHidden(viewFindContainingItemView)) {
                return null;
            }
            return viewFindContainingItemView;
        }

        @Nullable
        public View findViewByPosition(int i7) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i7 && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.isPreLayout() || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public abstract LayoutParams generateDefaultLayoutParams();

        @SuppressLint({"UnknownNullness"})
        public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.bottom;
        }

        @Nullable
        public View getChildAt(int i7) {
            ChildHelper childHelper = this.mChildHelper;
            if (childHelper != null) {
                return childHelper.getChildAt(i7);
            }
            return null;
        }

        public int getChildCount() {
            ChildHelper childHelper = this.mChildHelper;
            if (childHelper != null) {
                return childHelper.getChildCount();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
            return -1;
        }

        public int getDecoratedBottom(@NonNull View view) {
            return getBottomDecorationHeight(view) + view.getBottom();
        }

        public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(@NonNull View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(@NonNull View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(@NonNull View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(@NonNull View view) {
            return getRightDecorationWidth(view) + view.getRight();
        }

        public int getDecoratedTop(@NonNull View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        @Nullable
        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.isHidden(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        @Px
        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(@NonNull View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap weakHashMap = N.f16168a;
            return recyclerView.getLayoutDirection();
        }

        public int getLeftDecorationWidth(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.left;
        }

        @Px
        public int getMinimumHeight() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap weakHashMap = N.f16168a;
            return recyclerView.getMinimumHeight();
        }

        @Px
        public int getMinimumWidth() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap weakHashMap = N.f16168a;
            return recyclerView.getMinimumWidth();
        }

        @Px
        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @Px
        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap weakHashMap = N.f16168a;
            return recyclerView.getPaddingEnd();
        }

        @Px
        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        @Px
        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        @Px
        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap weakHashMap = N.f16168a;
            return recyclerView.getPaddingStart();
        }

        @Px
        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
        }

        public int getRightDecorationWidth(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.right;
        }

        public int getRowCountForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
            return -1;
        }

        public int getSelectionModeForAccessibility(@NonNull Recycler recycler, @NonNull State state) {
            return 0;
        }

        public int getTopDecorationHeight(@NonNull View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.top;
        }

        public void getTransformedBoundingBox(@NonNull View view, boolean z3, @NonNull Rect rect) {
            Matrix matrix;
            if (z3) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        @Px
        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i7).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(@NonNull View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException(u.j(this.mRecyclerView, new StringBuilder("View should be fully attached to be ignored")));
            }
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.removeViewHolder(childViewHolderInt);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(@NonNull Recycler recycler, @NonNull State state) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            SmoothScroller smoothScroller = this.mSmoothScroller;
            return smoothScroller != null && smoothScroller.isRunning();
        }

        public boolean isViewPartiallyVisible(@NonNull View view, boolean z3, boolean z8) {
            boolean z10 = this.mHorizontalBoundCheck.isViewWithinBoundFlags(view, 24579) && this.mVerticalBoundCheck.isViewWithinBoundFlags(view, 24579);
            return z3 ? z10 : !z10;
        }

        public void layoutDecorated(@NonNull View view, int i7, int i10, int i11, int i12) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
            view.layout(i7 + rect.left, i10 + rect.top, i11 - rect.right, i12 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(@NonNull View view, int i7, int i10, int i11, int i12) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.mDecorInsets;
            view.layout(i7 + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        public void measureChild(@NonNull View view, int i7, int i10) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i11 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i7;
            int i12 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i10;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i11, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i12, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(@NonNull View view, int i7, int i10) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i11 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i7;
            int i12 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i10;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i11, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i12, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i7, int i10) {
            View childAt = getChildAt(i7);
            if (childAt != null) {
                detachViewAt(i7);
                attachView(childAt, i10);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i7 + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(@Px int i7) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i7);
            }
        }

        public void offsetChildrenVertical(@Px int i7) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i7);
            }
        }

        public void onAdapterChanged(@Nullable Adapter adapter, @Nullable Adapter adapter2) {
        }

        public boolean onAddFocusables(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i7, int i10) {
            return false;
        }

        @CallSuper
        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        @Nullable
        public View onFocusSearchFailed(@NonNull View view, int i7, @NonNull Recycler recycler, @NonNull State state) {
            return null;
        }

        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(p074f0.d dVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, dVar);
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, p074f0.d dVar) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.isHidden(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, dVar);
        }

        @Nullable
        public View onInterceptFocusSearch(@NonNull View view, int i7) {
            return null;
        }

        public void onItemsAdded(@NonNull RecyclerView recyclerView, int i7, int i10) {
        }

        public void onItemsChanged(@NonNull RecyclerView recyclerView) {
        }

        public void onItemsMoved(@NonNull RecyclerView recyclerView, int i7, int i10, int i11) {
        }

        public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i7, int i10) {
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i7, int i10) {
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutChildren(Recycler recycler, State state) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        @SuppressLint({"UnknownNullness"})
        public void onLayoutCompleted(State state) {
        }

        public void onMeasure(@NonNull Recycler recycler, @NonNull State state, int i7, int i10) {
            this.mRecyclerView.defaultOnMeasure(i7, i10);
        }

        @Deprecated
        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull View view, @Nullable View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        @SuppressLint({"UnknownNullness"})
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        @Nullable
        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i7) {
        }

        public void onSmoothScrollerStopped(SmoothScroller smoothScroller) {
            if (this.mSmoothScroller == smoothScroller) {
                this.mSmoothScroller = null;
            }
        }

        public boolean performAccessibilityAction(int i7, @Nullable Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i7, bundle);
        }

        public boolean performAccessibilityActionForItem(@NonNull Recycler recycler, @NonNull State state, @NonNull View view, int i7, @Nullable Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                WeakHashMap weakHashMap = N.f16168a;
                recyclerView.postOnAnimation(runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.removeViewAt(childCount);
            }
        }

        public void removeAndRecycleAllViews(@NonNull Recycler recycler) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, recycler);
                }
            }
        }

        public void removeAndRecycleScrapInt(Recycler recycler) {
            int scrapCount = recycler.getScrapCount();
            for (int i7 = scrapCount - 1; i7 >= 0; i7--) {
                View scrapViewAt = recycler.getScrapViewAt(i7);
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(scrapViewAt);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(scrapViewAt, false);
                    }
                    ItemAnimator itemAnimator = this.mRecyclerView.mItemAnimator;
                    if (itemAnimator != null) {
                        itemAnimator.endAnimation(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    recycler.quickRecycleScrapView(scrapViewAt);
                }
            }
            recycler.clearScrap();
            if (scrapCount > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(@NonNull View view, @NonNull Recycler recycler) {
            removeView(view);
            recycler.recycleView(view);
        }

        public void removeAndRecycleViewAt(int i7, @NonNull Recycler recycler) {
            View childAt = getChildAt(i7);
            removeViewAt(i7);
            recycler.recycleView(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(@NonNull View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        @SuppressLint({"UnknownNullness"})
        public void removeView(View view) {
            this.mChildHelper.removeView(view);
        }

        public void removeViewAt(int i7) {
            if (getChildAt(i7) != null) {
                this.mChildHelper.removeViewAt(i7);
            }
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z3) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z3, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollHorizontallyBy(int i7, Recycler recycler, State state) {
            return 0;
        }

        public void scrollToPosition(int i7) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.e(RecyclerView.TAG, "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        @SuppressLint({"UnknownNullness"})
        public int scrollVerticallyBy(int i7, Recycler recycler, State state) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z3) {
            this.mAutoMeasure = z3;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z3) {
            if (z3 != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z3;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.updateViewCacheSize();
                }
            }
        }

        public void setMeasureSpecs(int i7, int i10) {
            this.mWidth = View.MeasureSpec.getSize(i7);
            int mode = View.MeasureSpec.getMode(i7);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i10);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i7, int i10) {
            setMeasuredDimension(chooseSize(i7, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i10, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
        }

        public void setMeasuredDimensionFromChildren(int i7, int i10) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i7, i10);
                return;
            }
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MAX_VALUE;
            int i13 = Integer.MIN_VALUE;
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt(i15);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i16 = rect.left;
                if (i16 < i14) {
                    i14 = i16;
                }
                int i17 = rect.right;
                if (i17 > i11) {
                    i11 = i17;
                }
                int i18 = rect.top;
                if (i18 < i12) {
                    i12 = i18;
                }
                int i19 = rect.bottom;
                if (i19 > i13) {
                    i13 = i19;
                }
            }
            this.mRecyclerView.mTempRect.set(i14, i12, i11, i13);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i7, i10);
        }

        public void setMeasurementCacheEnabled(boolean z3) {
            this.mMeasurementCacheEnabled = z3;
        }

        public void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public boolean shouldMeasureChild(View view, int i7, int i10, LayoutParams layoutParams) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i7, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean shouldReMeasureChild(View view, int i7, int i10, LayoutParams layoutParams) {
            return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i7, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        @SuppressLint({"UnknownNullness"})
        public void smoothScrollToPosition(RecyclerView recyclerView, State state, int i7) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        @SuppressLint({"UnknownNullness"})
        public void startSmoothScroll(SmoothScroller smoothScroller) {
            SmoothScroller smoothScroller2 = this.mSmoothScroller;
            if (smoothScroller2 != null && smoothScroller != smoothScroller2 && smoothScroller2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = smoothScroller;
            smoothScroller.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(@NonNull View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        public void stopSmoothScroller() {
            SmoothScroller smoothScroller = this.mSmoothScroller;
            if (smoothScroller != null) {
                smoothScroller.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void addDisappearingView(View view, int i7) {
            addViewInt(view, i7, true);
        }

        @SuppressLint({"UnknownNullness"})
        public void addView(View view, int i7) {
            addViewInt(view, i7, false);
        }

        @SuppressLint({"UnknownNullness"})
        @CallSuper
        public void onDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityEvent(@NonNull Recycler recycler, @NonNull State state, @NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z3 = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z3 = false;
            }
            accessibilityEvent.setScrollable(z3);
            Adapter adapter = this.mRecyclerView.mAdapter;
            if (adapter != null) {
                accessibilityEvent.setItemCount(adapter.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(@NonNull Recycler recycler, @NonNull State state, @NonNull p074f0.d dVar) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                dVar.a(UserMetadata.MAX_INTERNAL_KEY_SIZE);
                dVar.r(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                dVar.a(4096);
                dVar.r(true);
            }
            dVar.m(b.c(getRowCountForAccessibility(recycler, state), getColumnCountForAccessibility(recycler, state), getSelectionModeForAccessibility(recycler, state), isLayoutHierarchical(recycler, state)));
        }

        public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i7, int i10, @Nullable Object obj) {
            onItemsUpdated(recyclerView, i7, i10);
        }

        public boolean onRequestChildFocus(@NonNull RecyclerView recyclerView, @NonNull State state, @NonNull View view, @Nullable View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0067 A[PHI: r9
          0x0067: PHI (r9v8 int) = (r9v5 int), (r9v11 int) binds: [B:29:0x0084, B:20:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean performAccessibilityAction(@NonNull Recycler recycler, @NonNull State state, int i7, @Nullable Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            int i10;
            int i11;
            if (this.mRecyclerView == null) {
                return false;
            }
            int height = getHeight();
            int width = getWidth();
            Rect rect = new Rect();
            if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
                height = rect.height();
                width = rect.width();
            }
            if (i7 == 4096) {
                paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                    i10 = paddingTop;
                    i11 = paddingLeft;
                } else {
                    i10 = paddingTop;
                    i11 = 0;
                }
            } else if (i7 != 8192) {
                i11 = 0;
                i10 = 0;
            } else {
                paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                    i10 = paddingTop;
                    i11 = paddingLeft;
                } else {
                    i10 = paddingTop;
                    i11 = 0;
                }
            }
            if (i10 == 0 && i11 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i11, i10, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean performAccessibilityActionForItem(@NonNull View view, int i7, @Nullable Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i7, bundle);
        }

        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z3, boolean z8) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i7 = childRectangleOnScreenScrollAmount[0];
            int i10 = childRectangleOnScreenScrollAmount[1];
            if ((z8 && !isFocusedChildVisibleAfterScrolling(recyclerView, i7, i10)) || (i7 == 0 && i10 == 0)) {
                return false;
            }
            if (z3) {
                recyclerView.scrollBy(i7, i10);
            } else {
                recyclerView.smoothScrollBy(i7, i10);
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a  */
        /* JADX WARN: Code duplicated, block: B:14:0x0022  */
        /* JADX WARN: Code duplicated, block: B:5:0x0010  */
        public static int getChildMeasureSpec(int i7, int i10, int i11, int i12, boolean z3) {
            int iMax = Math.max(0, i7 - i11);
            if (z3) {
                if (i12 >= 0) {
                    i10 = 1073741824;
                } else if (i12 != -1 || (i10 != Integer.MIN_VALUE && (i10 == 0 || i10 != 1073741824))) {
                    i10 = 0;
                    i12 = 0;
                } else {
                    i12 = iMax;
                }
            } else if (i12 >= 0) {
                i10 = 1073741824;
            } else if (i12 == -1) {
                i12 = iMax;
            } else if (i12 != -2) {
                i10 = 0;
                i12 = 0;
            } else if (i10 == Integer.MIN_VALUE || i10 == 1073741824) {
                i12 = iMax;
                i10 = Integer.MIN_VALUE;
            } else {
                i12 = iMax;
                i10 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i12, i10);
        }

        public void onInitializeAccessibilityNodeInfoForItem(@NonNull Recycler recycler, @NonNull State state, @NonNull View view, @NonNull p074f0.d dVar) {
        }

        public void attachView(@NonNull View view, int i7) {
            attachView(view, i7, (LayoutParams) view.getLayoutParams());
        }

        @SuppressLint({"UnknownNullness"})
        public LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void setMeasuredDimension(int i7, int i10) {
            this.mRecyclerView.setMeasuredDimension(i7, i10);
        }

        public void attachView(@NonNull View view) {
            attachView(view, -1);
        }
    }

    public interface OnChildAttachStateChangeListener {
        void onChildViewAttachedToWindow(@NonNull View view);

        void onChildViewDetachedFromWindow(@NonNull View view);
    }

    public static abstract class OnFlingListener {
        public abstract boolean onFling(int i7, int i10);
    }

    public interface OnItemTouchListener {
        boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        void onRequestDisallowInterceptTouchEvent(boolean z3);

        void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);
    }

    public static abstract class OnScrollListener {
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i7) {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i7, int i10) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({c.f39802c})
    public @interface Orientation {
    }

    public static class RecycledViewPool {
        private static final int DEFAULT_MAX_SCRAP = 5;
        SparseArray<ScrapData> mScrap = new SparseArray<>();
        int mAttachCountForClearing = 0;
        Set<Adapter<?>> mAttachedAdaptersForPoolingContainer = Collections.newSetFromMap(new IdentityHashMap());

        public static class ScrapData {
            final ArrayList<ViewHolder> mScrapHeap = new ArrayList<>();
            int mMaxScrap = 5;
            long mCreateRunningAverageNs = 0;
            long mBindRunningAverageNs = 0;
        }

        private ScrapData getScrapDataForType(int i7) {
            ScrapData scrapData = this.mScrap.get(i7);
            if (scrapData != null) {
                return scrapData;
            }
            ScrapData scrapData2 = new ScrapData();
            this.mScrap.put(i7, scrapData2);
            return scrapData2;
        }

        public void attach() {
            this.mAttachCountForClearing++;
        }

        public void attachForPoolingContainer(@NonNull Adapter<?> adapter) {
            this.mAttachedAdaptersForPoolingContainer.add(adapter);
        }

        public void clear() {
            for (int i7 = 0; i7 < this.mScrap.size(); i7++) {
                ScrapData scrapDataValueAt = this.mScrap.valueAt(i7);
                Iterator<ViewHolder> it = scrapDataValueAt.mScrapHeap.iterator();
                while (it.hasNext()) {
                    a.a(it.next().itemView);
                }
                scrapDataValueAt.mScrapHeap.clear();
            }
        }

        public void detach() {
            this.mAttachCountForClearing--;
        }

        public void detachForPoolingContainer(@NonNull Adapter<?> adapter, boolean z3) {
            this.mAttachedAdaptersForPoolingContainer.remove(adapter);
            if (this.mAttachedAdaptersForPoolingContainer.size() != 0 || z3) {
                return;
            }
            for (int i7 = 0; i7 < this.mScrap.size(); i7++) {
                SparseArray<ScrapData> sparseArray = this.mScrap;
                ArrayList<ViewHolder> arrayList = sparseArray.get(sparseArray.keyAt(i7)).mScrapHeap;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    a.a(arrayList.get(i10).itemView);
                }
            }
        }

        public void factorInBindTime(int i7, long j6) {
            ScrapData scrapDataForType = getScrapDataForType(i7);
            scrapDataForType.mBindRunningAverageNs = runningAverage(scrapDataForType.mBindRunningAverageNs, j6);
        }

        public void factorInCreateTime(int i7, long j6) {
            ScrapData scrapDataForType = getScrapDataForType(i7);
            scrapDataForType.mCreateRunningAverageNs = runningAverage(scrapDataForType.mCreateRunningAverageNs, j6);
        }

        @Nullable
        public ViewHolder getRecycledView(int i7) {
            ScrapData scrapData = this.mScrap.get(i7);
            if (scrapData == null || scrapData.mScrapHeap.isEmpty()) {
                return null;
            }
            ArrayList<ViewHolder> arrayList = scrapData.mScrapHeap;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public int getRecycledViewCount(int i7) {
            return getScrapDataForType(i7).mScrapHeap.size();
        }

        public void onAdapterChanged(Adapter<?> adapter, Adapter<?> adapter2, boolean z3) {
            if (adapter != null) {
                detach();
            }
            if (!z3 && this.mAttachCountForClearing == 0) {
                clear();
            }
            if (adapter2 != null) {
                attach();
            }
        }

        public void putRecycledView(ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            ArrayList<ViewHolder> arrayList = getScrapDataForType(itemViewType).mScrapHeap;
            if (this.mScrap.get(itemViewType).mMaxScrap <= arrayList.size()) {
                a.a(viewHolder.itemView);
            } else {
                if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(viewHolder)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                viewHolder.resetInternal();
                arrayList.add(viewHolder);
            }
        }

        public long runningAverage(long j6, long j10) {
            if (j6 == 0) {
                return j10;
            }
            return (j10 / 4) + ((j6 / 4) * 3);
        }

        public void setMaxRecycledViews(int i7, int i10) {
            ScrapData scrapDataForType = getScrapDataForType(i7);
            scrapDataForType.mMaxScrap = i10;
            ArrayList<ViewHolder> arrayList = scrapDataForType.mScrapHeap;
            while (arrayList.size() > i10) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        public int size() {
            int size = 0;
            for (int i7 = 0; i7 < this.mScrap.size(); i7++) {
                ArrayList<ViewHolder> arrayList = this.mScrap.valueAt(i7).mScrapHeap;
                if (arrayList != null) {
                    size = arrayList.size() + size;
                }
            }
            return size;
        }

        public boolean willBindInTime(int i7, long j6, long j10) {
            long j11 = getScrapDataForType(i7).mBindRunningAverageNs;
            return j11 == 0 || j6 + j11 < j10;
        }

        public boolean willCreateInTime(int i7, long j6, long j10) {
            long j11 = getScrapDataForType(i7).mCreateRunningAverageNs;
            return j11 == 0 || j6 + j11 < j10;
        }
    }

    public final class Recycler {
        static final int DEFAULT_CACHE_SIZE = 2;
        final ArrayList<ViewHolder> mAttachedScrap;
        final ArrayList<ViewHolder> mCachedViews;
        ArrayList<ViewHolder> mChangedScrap;
        RecycledViewPool mRecyclerPool;
        private int mRequestedCacheMax;
        private final List<ViewHolder> mUnmodifiableAttachedScrap;
        private ViewCacheExtension mViewCacheExtension;
        int mViewCacheMax;

        public Recycler() {
            ArrayList<ViewHolder> arrayList = new ArrayList<>();
            this.mAttachedScrap = arrayList;
            this.mChangedScrap = null;
            this.mCachedViews = new ArrayList<>();
            this.mUnmodifiableAttachedScrap = Collections.unmodifiableList(arrayList);
            this.mRequestedCacheMax = 2;
            this.mViewCacheMax = 2;
        }

        private void attachAccessibilityDelegateOnBind(ViewHolder viewHolder) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = viewHolder.itemView;
                WeakHashMap weakHashMap = N.f16168a;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = RecyclerView.this.mAccessibilityDelegate;
                if (recyclerViewAccessibilityDelegate == null) {
                    return;
                }
                C1050b itemDelegate = recyclerViewAccessibilityDelegate.getItemDelegate();
                if (itemDelegate instanceof RecyclerViewAccessibilityDelegate.ItemDelegate) {
                    ((RecyclerViewAccessibilityDelegate.ItemDelegate) itemDelegate).saveOriginalDelegate(view);
                }
                N.q(view, itemDelegate);
            }
        }

        private void invalidateDisplayListInt(ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ViewGroup) {
                invalidateDisplayListInt((ViewGroup) view, false);
            }
        }

        private void maybeSendPoolingContainerAttach() {
            if (this.mRecyclerPool != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.mRecyclerPool.attachForPoolingContainer(RecyclerView.this.mAdapter);
            }
        }

        private void poolingContainerDetach(Adapter<?> adapter) {
            poolingContainerDetach(adapter, false);
        }

        private boolean tryBindViewHolderByDeadline(@NonNull ViewHolder viewHolder, int i7, int i10, long j6) {
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = viewHolder.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z3 = false;
            if (j6 != RecyclerView.FOREVER_NS && !this.mRecyclerPool.willBindInTime(itemViewType, nanoTime, j6)) {
                return false;
            }
            if (viewHolder.isTmpDetached()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(viewHolder.itemView, recyclerView.getChildCount(), viewHolder.itemView.getLayoutParams());
                z3 = true;
            }
            RecyclerView.this.mAdapter.bindViewHolder(viewHolder, i7);
            if (z3) {
                RecyclerView.this.detachViewFromParent(viewHolder.itemView);
            }
            this.mRecyclerPool.factorInBindTime(viewHolder.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            attachAccessibilityDelegateOnBind(viewHolder);
            if (RecyclerView.this.mState.isPreLayout()) {
                viewHolder.mPreLayoutPosition = i10;
            }
            return true;
        }

        public void addViewHolderToRecycledViewPool(@NonNull ViewHolder viewHolder, boolean z3) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(viewHolder);
            View view = viewHolder.itemView;
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = RecyclerView.this.mAccessibilityDelegate;
            if (recyclerViewAccessibilityDelegate != null) {
                C1050b itemDelegate = recyclerViewAccessibilityDelegate.getItemDelegate();
                N.q(view, itemDelegate instanceof RecyclerViewAccessibilityDelegate.ItemDelegate ? ((RecyclerViewAccessibilityDelegate.ItemDelegate) itemDelegate).getAndRemoveOriginalDelegateForItem(view) : null);
            }
            if (z3) {
                dispatchViewRecycled(viewHolder);
            }
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
            getRecycledViewPool().putRecycledView(viewHolder);
        }

        public void bindViewToPosition(@NonNull View view, int i7) {
            LayoutParams layoutParams;
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null) {
                throw new IllegalArgumentException(u.j(RecyclerView.this, new StringBuilder("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter")));
            }
            int iFindPositionOffset = RecyclerView.this.mAdapterHelper.findPositionOffset(i7);
            if (iFindPositionOffset < 0 || iFindPositionOffset >= RecyclerView.this.mAdapter.getItemCount()) {
                StringBuilder sbP = q0.p(i7, "Inconsistency detected. Invalid item position ", iFindPositionOffset, "(offset:", ").state:");
                sbP.append(RecyclerView.this.mState.getItemCount());
                throw new IndexOutOfBoundsException(u.j(RecyclerView.this, sbP));
            }
            tryBindViewHolderByDeadline(childViewHolderInt, iFindPositionOffset, i7, RecyclerView.FOREVER_NS);
            ViewGroup.LayoutParams layoutParams2 = childViewHolderInt.itemView.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams = (LayoutParams) RecyclerView.this.generateDefaultLayoutParams();
                childViewHolderInt.itemView.setLayoutParams(layoutParams);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams2)) {
                layoutParams = (LayoutParams) layoutParams2;
            } else {
                layoutParams = (LayoutParams) RecyclerView.this.generateLayoutParams(layoutParams2);
                childViewHolderInt.itemView.setLayoutParams(layoutParams);
            }
            layoutParams.mInsetsDirty = true;
            layoutParams.mViewHolder = childViewHolderInt;
            layoutParams.mPendingInvalidate = childViewHolderInt.itemView.getParent() == null;
        }

        public void clear() {
            this.mAttachedScrap.clear();
            recycleAndClearCachedViews();
        }

        public void clearOldPositions() {
            int size = this.mCachedViews.size();
            for (int i7 = 0; i7 < size; i7++) {
                this.mCachedViews.get(i7).clearOldPosition();
            }
            int size2 = this.mAttachedScrap.size();
            for (int i10 = 0; i10 < size2; i10++) {
                this.mAttachedScrap.get(i10).clearOldPosition();
            }
            ArrayList<ViewHolder> arrayList = this.mChangedScrap;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    this.mChangedScrap.get(i11).clearOldPosition();
                }
            }
        }

        public void clearScrap() {
            this.mAttachedScrap.clear();
            ArrayList<ViewHolder> arrayList = this.mChangedScrap;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int convertPreLayoutPositionToPostLayout(int i7) {
            if (i7 >= 0 && i7 < RecyclerView.this.mState.getItemCount()) {
                return !RecyclerView.this.mState.isPreLayout() ? i7 : RecyclerView.this.mAdapterHelper.findPositionOffset(i7);
            }
            StringBuilder sbE = F.e(i7, "invalid position ", ". State item count is ");
            sbE.append(RecyclerView.this.mState.getItemCount());
            throw new IndexOutOfBoundsException(u.j(RecyclerView.this, sbE));
        }

        public void dispatchViewRecycled(@NonNull ViewHolder viewHolder) {
            RecyclerListener recyclerListener = RecyclerView.this.mRecyclerListener;
            if (recyclerListener != null) {
                recyclerListener.onViewRecycled(viewHolder);
            }
            int size = RecyclerView.this.mRecyclerListeners.size();
            for (int i7 = 0; i7 < size; i7++) {
                RecyclerView.this.mRecyclerListeners.get(i7).onViewRecycled(viewHolder);
            }
            Adapter adapter = RecyclerView.this.mAdapter;
            if (adapter != null) {
                adapter.onViewRecycled(viewHolder);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.removeViewHolder(viewHolder);
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Objects.toString(viewHolder);
            }
        }

        public ViewHolder getChangedScrapViewForPosition(int i7) {
            int size;
            int iFindPositionOffset;
            ArrayList<ViewHolder> arrayList = this.mChangedScrap;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i10 = 0; i10 < size; i10++) {
                    ViewHolder viewHolder = this.mChangedScrap.get(i10);
                    if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == i7) {
                        viewHolder.addFlags(32);
                        return viewHolder;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (iFindPositionOffset = RecyclerView.this.mAdapterHelper.findPositionOffset(i7)) > 0 && iFindPositionOffset < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(iFindPositionOffset);
                    for (int i11 = 0; i11 < size; i11++) {
                        ViewHolder viewHolder2 = this.mChangedScrap.get(i11);
                        if (!viewHolder2.wasReturnedFromScrap() && viewHolder2.getItemId() == itemId) {
                            viewHolder2.addFlags(32);
                            return viewHolder2;
                        }
                    }
                }
            }
            return null;
        }

        public RecycledViewPool getRecycledViewPool() {
            if (this.mRecyclerPool == null) {
                this.mRecyclerPool = new RecycledViewPool();
                maybeSendPoolingContainerAttach();
            }
            return this.mRecyclerPool;
        }

        public int getScrapCount() {
            return this.mAttachedScrap.size();
        }

        @NonNull
        public List<ViewHolder> getScrapList() {
            return this.mUnmodifiableAttachedScrap;
        }

        public ViewHolder getScrapOrCachedViewForId(long j6, int i7, boolean z3) {
            for (int size = this.mAttachedScrap.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = this.mAttachedScrap.get(size);
                if (viewHolder.getItemId() == j6 && !viewHolder.wasReturnedFromScrap()) {
                    if (i7 == viewHolder.getItemViewType()) {
                        viewHolder.addFlags(32);
                        if (viewHolder.isRemoved() && !RecyclerView.this.mState.isPreLayout()) {
                            viewHolder.setFlags(2, 14);
                        }
                        return viewHolder;
                    }
                    if (!z3) {
                        this.mAttachedScrap.remove(size);
                        RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
                        quickRecycleScrapView(viewHolder.itemView);
                    }
                }
            }
            int size2 = this.mCachedViews.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                ViewHolder viewHolder2 = this.mCachedViews.get(size2);
                if (viewHolder2.getItemId() == j6 && !viewHolder2.isAttachedToTransitionOverlay()) {
                    if (i7 == viewHolder2.getItemViewType()) {
                        if (!z3) {
                            this.mCachedViews.remove(size2);
                        }
                        return viewHolder2;
                    }
                    if (!z3) {
                        recycleCachedViewAt(size2);
                        return null;
                    }
                }
            }
        }

        public ViewHolder getScrapOrHiddenOrCachedHolderForPosition(int i7, boolean z3) {
            View viewFindHiddenNonRemovedView;
            int size = this.mAttachedScrap.size();
            for (int i10 = 0; i10 < size; i10++) {
                ViewHolder viewHolder = this.mAttachedScrap.get(i10);
                if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == i7 && !viewHolder.isInvalid() && (RecyclerView.this.mState.mInPreLayout || !viewHolder.isRemoved())) {
                    viewHolder.addFlags(32);
                    return viewHolder;
                }
            }
            if (!z3 && (viewFindHiddenNonRemovedView = RecyclerView.this.mChildHelper.findHiddenNonRemovedView(i7)) != null) {
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(viewFindHiddenNonRemovedView);
                RecyclerView.this.mChildHelper.unhide(viewFindHiddenNonRemovedView);
                int iIndexOfChild = RecyclerView.this.mChildHelper.indexOfChild(viewFindHiddenNonRemovedView);
                if (iIndexOfChild == -1) {
                    StringBuilder sb2 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                    sb2.append(childViewHolderInt);
                    throw new IllegalStateException(u.j(RecyclerView.this, sb2));
                }
                RecyclerView.this.mChildHelper.detachViewFromParent(iIndexOfChild);
                scrapView(viewFindHiddenNonRemovedView);
                childViewHolderInt.addFlags(8224);
                return childViewHolderInt;
            }
            int size2 = this.mCachedViews.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ViewHolder viewHolder2 = this.mCachedViews.get(i11);
                if (!viewHolder2.isInvalid() && viewHolder2.getLayoutPosition() == i7 && !viewHolder2.isAttachedToTransitionOverlay()) {
                    if (!z3) {
                        this.mCachedViews.remove(i11);
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        viewHolder2.toString();
                    }
                    return viewHolder2;
                }
            }
            return null;
        }

        public View getScrapViewAt(int i7) {
            return this.mAttachedScrap.get(i7).itemView;
        }

        @NonNull
        public View getViewForPosition(int i7) {
            return getViewForPosition(i7, false);
        }

        public void markItemDecorInsetsDirty() {
            int size = this.mCachedViews.size();
            for (int i7 = 0; i7 < size; i7++) {
                LayoutParams layoutParams = (LayoutParams) this.mCachedViews.get(i7).itemView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.mInsetsDirty = true;
                }
            }
        }

        public void markKnownViewsInvalid() {
            int size = this.mCachedViews.size();
            for (int i7 = 0; i7 < size; i7++) {
                ViewHolder viewHolder = this.mCachedViews.get(i7);
                if (viewHolder != null) {
                    viewHolder.addFlags(6);
                    viewHolder.addChangePayload(null);
                }
            }
            Adapter adapter = RecyclerView.this.mAdapter;
            if (adapter == null || !adapter.hasStableIds()) {
                recycleAndClearCachedViews();
            }
        }

        public void offsetPositionRecordsForInsert(int i7, int i10) {
            int size = this.mCachedViews.size();
            for (int i11 = 0; i11 < size; i11++) {
                ViewHolder viewHolder = this.mCachedViews.get(i11);
                if (viewHolder != null && viewHolder.mPosition >= i7) {
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        viewHolder.toString();
                    }
                    viewHolder.offsetPosition(i10, false);
                }
            }
        }

        public void offsetPositionRecordsForMove(int i7, int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (i7 < i10) {
                i11 = -1;
                i13 = i7;
                i12 = i10;
            } else {
                i11 = 1;
                i12 = i7;
                i13 = i10;
            }
            int size = this.mCachedViews.size();
            for (int i15 = 0; i15 < size; i15++) {
                ViewHolder viewHolder = this.mCachedViews.get(i15);
                if (viewHolder != null && (i14 = viewHolder.mPosition) >= i13 && i14 <= i12) {
                    if (i14 == i7) {
                        viewHolder.offsetPosition(i10 - i7, false);
                    } else {
                        viewHolder.offsetPosition(i11, false);
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        viewHolder.toString();
                    }
                }
            }
        }

        public void offsetPositionRecordsForRemove(int i7, int i10, boolean z3) {
            int i11 = i7 + i10;
            for (int size = this.mCachedViews.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = this.mCachedViews.get(size);
                if (viewHolder != null) {
                    int i12 = viewHolder.mPosition;
                    if (i12 >= i11) {
                        if (RecyclerView.sVerboseLoggingEnabled) {
                            viewHolder.toString();
                        }
                        viewHolder.offsetPosition(-i10, z3);
                    } else if (i12 >= i7) {
                        viewHolder.addFlags(8);
                        recycleCachedViewAt(size);
                    }
                }
            }
        }

        public void onAdapterChanged(Adapter<?> adapter, Adapter<?> adapter2, boolean z3) {
            clear();
            poolingContainerDetach(adapter, true);
            getRecycledViewPool().onAdapterChanged(adapter, adapter2, z3);
            maybeSendPoolingContainerAttach();
        }

        public void onAttachedToWindow() {
            maybeSendPoolingContainerAttach();
        }

        public void onDetachedFromWindow() {
            for (int i7 = 0; i7 < this.mCachedViews.size(); i7++) {
                a.a(this.mCachedViews.get(i7).itemView);
            }
            poolingContainerDetach(RecyclerView.this.mAdapter);
        }

        public void quickRecycleScrapView(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            recycleViewHolderInternal(childViewHolderInt);
        }

        public void recycleAndClearCachedViews() {
            for (int size = this.mCachedViews.size() - 1; size >= 0; size--) {
                recycleCachedViewAt(size);
            }
            this.mCachedViews.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.clearPrefetchPositions();
            }
        }

        public void recycleCachedViewAt(int i7) {
            int i10 = RecyclerView.HORIZONTAL;
            ViewHolder viewHolder = this.mCachedViews.get(i7);
            if (RecyclerView.sVerboseLoggingEnabled) {
                Objects.toString(viewHolder);
            }
            addViewHolderToRecycledViewPool(viewHolder, true);
            this.mCachedViews.remove(i7);
        }

        public void recycleView(@NonNull View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            recycleViewHolderInternal(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            RecyclerView.this.mItemAnimator.endAnimation(childViewHolderInt);
        }

        public void recycleViewHolderInternal(ViewHolder viewHolder) {
            boolean z3;
            boolean z8 = false;
            boolean z10 = true;
            if (viewHolder.isScrap() || viewHolder.itemView.getParent() != null) {
                StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(viewHolder.isScrap());
                sb2.append(" isAttached:");
                sb2.append(viewHolder.itemView.getParent() != null);
                throw new IllegalArgumentException(u.j(RecyclerView.this, sb2));
            }
            if (viewHolder.isTmpDetached()) {
                StringBuilder sb3 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb3.append(viewHolder);
                throw new IllegalArgumentException(u.j(RecyclerView.this, sb3));
            }
            if (viewHolder.shouldIgnore()) {
                throw new IllegalArgumentException(u.j(RecyclerView.this, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
            boolean zDoesTransientStatePreventRecycling = viewHolder.doesTransientStatePreventRecycling();
            Adapter adapter = RecyclerView.this.mAdapter;
            boolean z11 = adapter != null && zDoesTransientStatePreventRecycling && adapter.onFailedToRecycleView(viewHolder);
            if (RecyclerView.sDebugAssertionsEnabled && this.mCachedViews.contains(viewHolder)) {
                StringBuilder sb4 = new StringBuilder("cached view received recycle internal? ");
                sb4.append(viewHolder);
                throw new IllegalArgumentException(u.j(RecyclerView.this, sb4));
            }
            if (z11 || viewHolder.isRecyclable()) {
                if (this.mViewCacheMax <= 0 || viewHolder.hasAnyOfTheFlags(SetUserPhotoActivity.REQUEST_CODE_SET_AVATAR_OF_URI)) {
                    z3 = false;
                } else {
                    int size = this.mCachedViews.size();
                    if (size >= this.mViewCacheMax && size > 0) {
                        recycleCachedViewAt(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.lastPrefetchIncludedPosition(viewHolder.mPosition)) {
                        int i7 = size - 1;
                        while (i7 >= 0) {
                            if (!RecyclerView.this.mPrefetchRegistry.lastPrefetchIncludedPosition(this.mCachedViews.get(i7).mPosition)) {
                                break;
                            } else {
                                i7--;
                            }
                        }
                        size = i7 + 1;
                    }
                    this.mCachedViews.add(size, viewHolder);
                    z3 = true;
                }
                if (z3) {
                    z10 = false;
                } else {
                    addViewHolderToRecycledViewPool(viewHolder, true);
                }
                z8 = z3;
            } else {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    RecyclerView.this.exceptionLabel();
                }
                z10 = false;
            }
            RecyclerView.this.mViewInfoStore.removeViewHolder(viewHolder);
            if (z8 || z10 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            a.a(viewHolder.itemView);
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
        }

        public void scrapView(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.mChangedScrap == null) {
                    this.mChangedScrap = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.mChangedScrap.add(childViewHolderInt);
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !RecyclerView.this.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException(u.j(RecyclerView.this, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            childViewHolderInt.setScrapContainer(this, false);
            this.mAttachedScrap.add(childViewHolderInt);
        }

        public void setRecycledViewPool(RecycledViewPool recycledViewPool) {
            poolingContainerDetach(RecyclerView.this.mAdapter);
            RecycledViewPool recycledViewPool2 = this.mRecyclerPool;
            if (recycledViewPool2 != null) {
                recycledViewPool2.detach();
            }
            this.mRecyclerPool = recycledViewPool;
            if (recycledViewPool != null && RecyclerView.this.getAdapter() != null) {
                this.mRecyclerPool.attach();
            }
            maybeSendPoolingContainerAttach();
        }

        public void setViewCacheExtension(ViewCacheExtension viewCacheExtension) {
            this.mViewCacheExtension = viewCacheExtension;
        }

        public void setViewCacheSize(int i7) {
            this.mRequestedCacheMax = i7;
            updateViewCacheSize();
        }

        /* JADX WARN: Code duplicated, block: B:105:0x01ee  */
        /* JADX WARN: Code duplicated, block: B:106:0x01fc  */
        /* JADX WARN: Code duplicated, block: B:108:0x0204  */
        /* JADX WARN: Code duplicated, block: B:109:0x0212  */
        /* JADX WARN: Code duplicated, block: B:112:0x0218 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:114:0x021b  */
        /* JADX WARN: Code duplicated, block: B:18:0x0037 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:19:0x0039  */
        /* JADX WARN: Code duplicated, block: B:21:0x0043  */
        /* JADX WARN: Code duplicated, block: B:22:0x004e  */
        /* JADX WARN: Code duplicated, block: B:24:0x0054  */
        /* JADX WARN: Code duplicated, block: B:27:0x005c  */
        /* JADX WARN: Code duplicated, block: B:29:0x005f  */
        /* JADX WARN: Code duplicated, block: B:81:0x0176  */
        /* JADX WARN: Code duplicated, block: B:87:0x01a2  */
        /* JADX WARN: Code duplicated, block: B:89:0x01a8  */
        /* JADX WARN: Code duplicated, block: B:97:0x01bb  */
        @Nullable
        public ViewHolder tryGetViewHolderForPositionByDeadline(int i7, boolean z3, long j6) {
            ViewHolder viewHolderCreateViewHolder;
            boolean z8;
            ViewHolder viewHolder;
            boolean z10;
            boolean zTryBindViewHolderByDeadline;
            ViewGroup.LayoutParams layoutParams;
            LayoutParams layoutParams2;
            int iFindPositionOffset;
            RecyclerView recyclerViewFindNestedRecyclerView;
            ViewCacheExtension viewCacheExtension;
            View viewForPositionAndType;
            if (i7 < 0 || i7 >= RecyclerView.this.mState.getItemCount()) {
                StringBuilder sbP = q0.p(i7, "Invalid item position ", i7, "(", "). Item count:");
                sbP.append(RecyclerView.this.mState.getItemCount());
                throw new IndexOutOfBoundsException(u.j(RecyclerView.this, sbP));
            }
            if (RecyclerView.this.mState.isPreLayout()) {
                viewHolderCreateViewHolder = getChangedScrapViewForPosition(i7);
                if (viewHolderCreateViewHolder != null) {
                    z8 = true;
                }
                if (viewHolderCreateViewHolder == null && (viewHolderCreateViewHolder = getScrapOrHiddenOrCachedHolderForPosition(i7, z3)) != null) {
                    if (validateViewHolderForOffsetPosition(viewHolderCreateViewHolder)) {
                        z8 = true;
                    } else {
                        if (!z3) {
                            viewHolderCreateViewHolder.addFlags(4);
                            if (viewHolderCreateViewHolder.isScrap()) {
                                RecyclerView.this.removeDetachedView(viewHolderCreateViewHolder.itemView, false);
                                viewHolderCreateViewHolder.unScrap();
                            } else if (viewHolderCreateViewHolder.wasReturnedFromScrap()) {
                                viewHolderCreateViewHolder.clearReturnedFromScrapFlag();
                            }
                            recycleViewHolderInternal(viewHolderCreateViewHolder);
                        }
                        viewHolderCreateViewHolder = null;
                    }
                }
                if (viewHolderCreateViewHolder == null) {
                    iFindPositionOffset = RecyclerView.this.mAdapterHelper.findPositionOffset(i7);
                    if (iFindPositionOffset >= 0 || iFindPositionOffset >= RecyclerView.this.mAdapter.getItemCount()) {
                        StringBuilder sbP2 = q0.p(i7, "Inconsistency detected. Invalid item position ", iFindPositionOffset, "(offset:", ").state:");
                        sbP2.append(RecyclerView.this.mState.getItemCount());
                        throw new IndexOutOfBoundsException(u.j(RecyclerView.this, sbP2));
                    }
                    int itemViewType = RecyclerView.this.mAdapter.getItemViewType(iFindPositionOffset);
                    if (RecyclerView.this.mAdapter.hasStableIds() && (viewHolderCreateViewHolder = getScrapOrCachedViewForId(RecyclerView.this.mAdapter.getItemId(iFindPositionOffset), itemViewType, z3)) != null) {
                        viewHolderCreateViewHolder.mPosition = iFindPositionOffset;
                        z8 = true;
                    }
                    if (viewHolderCreateViewHolder == null && (viewCacheExtension = this.mViewCacheExtension) != null && (viewForPositionAndType = viewCacheExtension.getViewForPositionAndType(this, i7, itemViewType)) != null) {
                        viewHolderCreateViewHolder = RecyclerView.this.getChildViewHolder(viewForPositionAndType);
                        if (viewHolderCreateViewHolder == null) {
                            throw new IllegalArgumentException(u.j(RecyclerView.this, new StringBuilder("getViewForPositionAndType returned a view which does not have a ViewHolder")));
                        }
                        if (viewHolderCreateViewHolder.shouldIgnore()) {
                            throw new IllegalArgumentException(u.j(RecyclerView.this, new StringBuilder("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.")));
                        }
                    }
                    if (viewHolderCreateViewHolder == null) {
                        int i10 = RecyclerView.HORIZONTAL;
                        ViewHolder recycledView = getRecycledViewPool().getRecycledView(itemViewType);
                        if (recycledView != null) {
                            recycledView.resetInternal();
                            if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                invalidateDisplayListInt(recycledView);
                            }
                        }
                        viewHolderCreateViewHolder = recycledView;
                    }
                    if (viewHolderCreateViewHolder == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j6 != RecyclerView.FOREVER_NS && !this.mRecyclerPool.willCreateInTime(itemViewType, nanoTime, j6)) {
                            return null;
                        }
                        RecyclerView recyclerView = RecyclerView.this;
                        viewHolderCreateViewHolder = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType);
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && (recyclerViewFindNestedRecyclerView = RecyclerView.findNestedRecyclerView(viewHolderCreateViewHolder.itemView)) != null) {
                            viewHolderCreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewFindNestedRecyclerView);
                        }
                        this.mRecyclerPool.factorInCreateTime(itemViewType, RecyclerView.this.getNanoTime() - nanoTime);
                    }
                }
                viewHolder = viewHolderCreateViewHolder;
                z10 = z8;
                if (z10 && !RecyclerView.this.mState.isPreLayout() && viewHolder.hasAnyOfTheFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE)) {
                    viewHolder.setFlags(0, UserMetadata.MAX_INTERNAL_KEY_SIZE);
                    if (RecyclerView.this.mState.mRunSimpleAnimations) {
                        int iBuildAdapterChangeFlagsForAnimations = ItemAnimator.buildAdapterChangeFlagsForAnimations(viewHolder) | 4096;
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(viewHolder, recyclerView2.mItemAnimator.recordPreLayoutInformation(recyclerView2.mState, viewHolder, iBuildAdapterChangeFlagsForAnimations, viewHolder.getUnmodifiedPayloads()));
                    }
                }
                if (RecyclerView.this.mState.isPreLayout() || !viewHolder.isBound()) {
                    if (viewHolder.isBound() || viewHolder.needsUpdate() || viewHolder.isInvalid()) {
                        if (!RecyclerView.sDebugAssertionsEnabled && viewHolder.isRemoved()) {
                            StringBuilder sb2 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                            sb2.append(viewHolder);
                            throw new IllegalStateException(u.j(RecyclerView.this, sb2));
                        }
                        zTryBindViewHolderByDeadline = tryBindViewHolderByDeadline(viewHolder, RecyclerView.this.mAdapterHelper.findPositionOffset(i7), i7, j6);
                    }
                    layoutParams = viewHolder.itemView.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams2 = (LayoutParams) RecyclerView.this.generateDefaultLayoutParams();
                        viewHolder.itemView.setLayoutParams(layoutParams2);
                    } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                        layoutParams2 = (LayoutParams) layoutParams;
                    } else {
                        layoutParams2 = (LayoutParams) RecyclerView.this.generateLayoutParams(layoutParams);
                        viewHolder.itemView.setLayoutParams(layoutParams2);
                    }
                    layoutParams2.mViewHolder = viewHolder;
                    layoutParams2.mPendingInvalidate = !z10 && zTryBindViewHolderByDeadline;
                    return viewHolder;
                }
                viewHolder.mPreLayoutPosition = i7;
                zTryBindViewHolderByDeadline = false;
                layoutParams = viewHolder.itemView.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams2 = (LayoutParams) RecyclerView.this.generateDefaultLayoutParams();
                    viewHolder.itemView.setLayoutParams(layoutParams2);
                } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                    layoutParams2 = (LayoutParams) RecyclerView.this.generateLayoutParams(layoutParams);
                    viewHolder.itemView.setLayoutParams(layoutParams2);
                } else {
                    layoutParams2 = (LayoutParams) layoutParams;
                }
                layoutParams2.mViewHolder = viewHolder;
                layoutParams2.mPendingInvalidate = !z10 && zTryBindViewHolderByDeadline;
                return viewHolder;
            }
            viewHolderCreateViewHolder = null;
            z8 = false;
            if (viewHolderCreateViewHolder == null) {
                if (validateViewHolderForOffsetPosition(viewHolderCreateViewHolder)) {
                    if (!z3) {
                        viewHolderCreateViewHolder.addFlags(4);
                        if (viewHolderCreateViewHolder.isScrap()) {
                            RecyclerView.this.removeDetachedView(viewHolderCreateViewHolder.itemView, false);
                            viewHolderCreateViewHolder.unScrap();
                        } else if (viewHolderCreateViewHolder.wasReturnedFromScrap()) {
                            viewHolderCreateViewHolder.clearReturnedFromScrapFlag();
                        }
                        recycleViewHolderInternal(viewHolderCreateViewHolder);
                    }
                    viewHolderCreateViewHolder = null;
                } else {
                    z8 = true;
                }
            }
            if (viewHolderCreateViewHolder == null) {
                iFindPositionOffset = RecyclerView.this.mAdapterHelper.findPositionOffset(i7);
                if (iFindPositionOffset >= 0) {
                }
                StringBuilder sbP3 = q0.p(i7, "Inconsistency detected. Invalid item position ", iFindPositionOffset, "(offset:", ").state:");
                sbP3.append(RecyclerView.this.mState.getItemCount());
                throw new IndexOutOfBoundsException(u.j(RecyclerView.this, sbP3));
            }
            viewHolder = viewHolderCreateViewHolder;
            z10 = z8;
            if (z10) {
                viewHolder.setFlags(0, UserMetadata.MAX_INTERNAL_KEY_SIZE);
                if (RecyclerView.this.mState.mRunSimpleAnimations) {
                    int iBuildAdapterChangeFlagsForAnimations2 = ItemAnimator.buildAdapterChangeFlagsForAnimations(viewHolder) | 4096;
                    RecyclerView recyclerView3 = RecyclerView.this;
                    RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(viewHolder, recyclerView3.mItemAnimator.recordPreLayoutInformation(recyclerView3.mState, viewHolder, iBuildAdapterChangeFlagsForAnimations2, viewHolder.getUnmodifiedPayloads()));
                }
            }
            if (RecyclerView.this.mState.isPreLayout()) {
                if (viewHolder.isBound()) {
                }
                if (!RecyclerView.sDebugAssertionsEnabled) {
                }
                zTryBindViewHolderByDeadline = tryBindViewHolderByDeadline(viewHolder, RecyclerView.this.mAdapterHelper.findPositionOffset(i7), i7, j6);
            } else {
                if (viewHolder.isBound()) {
                }
                if (!RecyclerView.sDebugAssertionsEnabled) {
                }
                zTryBindViewHolderByDeadline = tryBindViewHolderByDeadline(viewHolder, RecyclerView.this.mAdapterHelper.findPositionOffset(i7), i7, j6);
            }
            layoutParams = viewHolder.itemView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams2 = (LayoutParams) RecyclerView.this.generateDefaultLayoutParams();
                viewHolder.itemView.setLayoutParams(layoutParams2);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                layoutParams2 = (LayoutParams) RecyclerView.this.generateLayoutParams(layoutParams);
                viewHolder.itemView.setLayoutParams(layoutParams2);
            } else {
                layoutParams2 = (LayoutParams) layoutParams;
            }
            layoutParams2.mViewHolder = viewHolder;
            layoutParams2.mPendingInvalidate = !z10 && zTryBindViewHolderByDeadline;
            return viewHolder;
        }

        public void unscrapView(ViewHolder viewHolder) {
            if (viewHolder.mInChangeScrap) {
                this.mChangedScrap.remove(viewHolder);
            } else {
                this.mAttachedScrap.remove(viewHolder);
            }
            viewHolder.mScrapContainer = null;
            viewHolder.mInChangeScrap = false;
            viewHolder.clearReturnedFromScrapFlag();
        }

        public void updateViewCacheSize() {
            LayoutManager layoutManager = RecyclerView.this.mLayout;
            this.mViewCacheMax = this.mRequestedCacheMax + (layoutManager != null ? layoutManager.mPrefetchMaxCountObserved : 0);
            for (int size = this.mCachedViews.size() - 1; size >= 0 && this.mCachedViews.size() > this.mViewCacheMax; size--) {
                recycleCachedViewAt(size);
            }
        }

        public boolean validateViewHolderForOffsetPosition(ViewHolder viewHolder) {
            if (viewHolder.isRemoved()) {
                if (!RecyclerView.sDebugAssertionsEnabled || RecyclerView.this.mState.isPreLayout()) {
                    return RecyclerView.this.mState.isPreLayout();
                }
                throw new IllegalStateException(u.j(RecyclerView.this, new StringBuilder("should not receive a removed view unless it is pre layout")));
            }
            int i7 = viewHolder.mPosition;
            if (i7 < 0 || i7 >= RecyclerView.this.mAdapter.getItemCount()) {
                StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                sb2.append(viewHolder);
                throw new IndexOutOfBoundsException(u.j(RecyclerView.this, sb2));
            }
            if (RecyclerView.this.mState.isPreLayout() || RecyclerView.this.mAdapter.getItemViewType(viewHolder.mPosition) == viewHolder.getItemViewType()) {
                return !RecyclerView.this.mAdapter.hasStableIds() || viewHolder.getItemId() == RecyclerView.this.mAdapter.getItemId(viewHolder.mPosition);
            }
            return false;
        }

        public void viewRangeUpdate(int i7, int i10) {
            int i11;
            int i12 = i10 + i7;
            for (int size = this.mCachedViews.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = this.mCachedViews.get(size);
                if (viewHolder != null && (i11 = viewHolder.mPosition) >= i7 && i11 < i12) {
                    viewHolder.addFlags(2);
                    recycleCachedViewAt(size);
                }
            }
        }

        private void poolingContainerDetach(Adapter<?> adapter, boolean z3) {
            RecycledViewPool recycledViewPool = this.mRecyclerPool;
            if (recycledViewPool != null) {
                recycledViewPool.detachForPoolingContainer(adapter, z3);
            }
        }

        public View getViewForPosition(int i7, boolean z3) {
            return tryGetViewHolderForPositionByDeadline(i7, z3, RecyclerView.FOREVER_NS).itemView;
        }

        private void invalidateDisplayListInt(ViewGroup viewGroup, boolean z3) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    invalidateDisplayListInt((ViewGroup) childAt, true);
                }
            }
            if (z3) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }
    }

    public interface RecyclerListener {
        void onViewRecycled(@NonNull ViewHolder viewHolder);
    }

    public class RecyclerViewDataObserver extends AdapterDataObserver {
        public RecyclerViewDataObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.mStructureChanged = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.hasPendingUpdates()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i7, int i10, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.onItemRangeChanged(i7, i10, obj)) {
                triggerUpdateProcessor();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i7, int i10) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.onItemRangeInserted(i7, i10)) {
                triggerUpdateProcessor();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i7, int i10, int i11) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.onItemRangeMoved(i7, i10, i11)) {
                triggerUpdateProcessor();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i7, int i10) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.onItemRangeRemoved(i7, i10)) {
                triggerUpdateProcessor();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onStateRestorationPolicyChanged() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState == null || (adapter = recyclerView.mAdapter) == null || !adapter.canRestoreState()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        public void triggerUpdateProcessor() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
                    WeakHashMap weakHashMap = N.f16168a;
                    recyclerView.postOnAnimation(runnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }
    }

    public static class SimpleOnItemTouchListener implements OnItemTouchListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z3) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        }
    }

    public static abstract class SmoothScroller {
        private LayoutManager mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final Action mRecyclingAction = new Action(0, 0);

        public static class Action {
            public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
            private boolean mChanged;
            private int mConsecutiveUpdates;
            private int mDuration;
            private int mDx;
            private int mDy;
            private Interpolator mInterpolator;
            private int mJumpToPosition;

            public Action(@Px int i7, @Px int i10) {
                this(i7, i10, Integer.MIN_VALUE, null);
            }

            private void validate() {
                if (this.mInterpolator != null && this.mDuration < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.mDuration < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public int getDuration() {
                return this.mDuration;
            }

            @Px
            public int getDx() {
                return this.mDx;
            }

            @Px
            public int getDy() {
                return this.mDy;
            }

            @Nullable
            public Interpolator getInterpolator() {
                return this.mInterpolator;
            }

            public boolean hasJumpTarget() {
                return this.mJumpToPosition >= 0;
            }

            public void jumpTo(int i7) {
                this.mJumpToPosition = i7;
            }

            public void runIfNecessary(RecyclerView recyclerView) {
                int i7 = this.mJumpToPosition;
                if (i7 >= 0) {
                    this.mJumpToPosition = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i7);
                    this.mChanged = false;
                } else {
                    if (!this.mChanged) {
                        this.mConsecutiveUpdates = 0;
                        return;
                    }
                    validate();
                    recyclerView.mViewFlinger.smoothScrollBy(this.mDx, this.mDy, this.mDuration, this.mInterpolator);
                    int i10 = this.mConsecutiveUpdates + 1;
                    this.mConsecutiveUpdates = i10;
                    if (i10 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.mChanged = false;
                }
            }

            public void setDuration(int i7) {
                this.mChanged = true;
                this.mDuration = i7;
            }

            public void setDx(@Px int i7) {
                this.mChanged = true;
                this.mDx = i7;
            }

            public void setDy(@Px int i7) {
                this.mChanged = true;
                this.mDy = i7;
            }

            public void setInterpolator(@Nullable Interpolator interpolator) {
                this.mChanged = true;
                this.mInterpolator = interpolator;
            }

            public void update(@Px int i7, @Px int i10, int i11, @Nullable Interpolator interpolator) {
                this.mDx = i7;
                this.mDy = i10;
                this.mDuration = i11;
                this.mInterpolator = interpolator;
                this.mChanged = true;
            }

            public Action(@Px int i7, @Px int i10, int i11) {
                this(i7, i10, i11, null);
            }

            public Action(@Px int i7, @Px int i10, int i11, @Nullable Interpolator interpolator) {
                this.mJumpToPosition = -1;
                this.mChanged = false;
                this.mConsecutiveUpdates = 0;
                this.mDx = i7;
                this.mDy = i10;
                this.mDuration = i11;
                this.mInterpolator = interpolator;
            }
        }

        public interface ScrollVectorProvider {
            @Nullable
            PointF computeScrollVectorForPosition(int i7);
        }

        @Nullable
        public PointF computeScrollVectorForPosition(int i7) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof ScrollVectorProvider) {
                return ((ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(i7);
            }
            return null;
        }

        public View findViewByPosition(int i7) {
            return this.mRecyclerView.mLayout.findViewByPosition(i7);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        @Nullable
        public LayoutManager getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i7) {
            this.mRecyclerView.scrollToPosition(i7);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public void normalize(@NonNull PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        public void onAnimation(int i7, int i10) {
            PointF pointFComputeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f10 = pointFComputeScrollVectorForPosition.x;
                if (f10 != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f10), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.runIfNecessary(recyclerView);
                    stop();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i7, i10, recyclerView.mState, this.mRecyclingAction);
                boolean zHasJumpTarget = this.mRecyclingAction.hasJumpTarget();
                this.mRecyclingAction.runIfNecessary(recyclerView);
                if (zHasJumpTarget && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.postOnAnimation();
                }
            }
        }

        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
                int i7 = RecyclerView.HORIZONTAL;
            }
        }

        public abstract void onSeekTargetStep(@Px int i7, @Px int i10, @NonNull State state, @NonNull Action action);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(@NonNull View view, @NonNull State state, @NonNull Action action);

        public void setTargetPosition(int i7) {
            this.mTargetPosition = i7;
        }

        public void start(RecyclerView recyclerView, LayoutManager layoutManager) {
            recyclerView.mViewFlinger.stop();
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = layoutManager;
            int i7 = this.mTargetPosition;
            if (i7 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.mTargetPosition = i7;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.postOnAnimation();
            this.mStarted = true;
        }

        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.mTargetPosition = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    public static class State {
        static final int STEP_ANIMATIONS = 4;
        static final int STEP_LAYOUT = 2;
        static final int STEP_START = 1;
        private SparseArray<Object> mData;
        long mFocusedItemId;
        int mFocusedItemPosition;
        int mFocusedSubChildId;
        int mRemainingScrollHorizontal;
        int mRemainingScrollVertical;
        int mTargetPosition = -1;
        int mPreviousLayoutItemCount = 0;
        int mDeletedInvisibleItemCountSincePreviousLayout = 0;
        int mLayoutStep = 1;
        int mItemCount = 0;
        boolean mStructureChanged = false;
        boolean mInPreLayout = false;
        boolean mTrackOldChangeHolders = false;
        boolean mIsMeasuring = false;
        boolean mRunSimpleAnimations = false;
        boolean mRunPredictiveAnimations = false;

        public void assertLayoutStep(int i7) {
            if ((this.mLayoutStep & i7) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.mLayoutStep));
        }

        public boolean didStructureChange() {
            return this.mStructureChanged;
        }

        public <T> T get(int i7) {
            SparseArray<Object> sparseArray = this.mData;
            if (sparseArray == null) {
                return null;
            }
            return (T) sparseArray.get(i7);
        }

        public int getItemCount() {
            return this.mInPreLayout ? this.mPreviousLayoutItemCount - this.mDeletedInvisibleItemCountSincePreviousLayout : this.mItemCount;
        }

        public int getRemainingScrollHorizontal() {
            return this.mRemainingScrollHorizontal;
        }

        public int getRemainingScrollVertical() {
            return this.mRemainingScrollVertical;
        }

        public int getTargetScrollPosition() {
            return this.mTargetPosition;
        }

        public boolean hasTargetScrollPosition() {
            return this.mTargetPosition != -1;
        }

        public boolean isMeasuring() {
            return this.mIsMeasuring;
        }

        public boolean isPreLayout() {
            return this.mInPreLayout;
        }

        public void prepareForNestedPrefetch(Adapter adapter) {
            this.mLayoutStep = 1;
            this.mItemCount = adapter.getItemCount();
            this.mInPreLayout = false;
            this.mTrackOldChangeHolders = false;
            this.mIsMeasuring = false;
        }

        public void put(int i7, Object obj) {
            if (this.mData == null) {
                this.mData = new SparseArray<>();
            }
            this.mData.put(i7, obj);
        }

        public void remove(int i7) {
            SparseArray<Object> sparseArray = this.mData;
            if (sparseArray == null) {
                return;
            }
            sparseArray.remove(i7);
        }

        public String toString() {
            return "State{mTargetPosition=" + this.mTargetPosition + ", mData=" + this.mData + ", mItemCount=" + this.mItemCount + ", mIsMeasuring=" + this.mIsMeasuring + ", mPreviousLayoutItemCount=" + this.mPreviousLayoutItemCount + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.mDeletedInvisibleItemCountSincePreviousLayout + ", mStructureChanged=" + this.mStructureChanged + ", mInPreLayout=" + this.mInPreLayout + ", mRunSimpleAnimations=" + this.mRunSimpleAnimations + ", mRunPredictiveAnimations=" + this.mRunPredictiveAnimations + '}';
        }

        public boolean willRunPredictiveAnimations() {
            return this.mRunPredictiveAnimations;
        }

        public boolean willRunSimpleAnimations() {
            return this.mRunSimpleAnimations;
        }
    }

    public static class StretchEdgeEffectFactory extends EdgeEffectFactory {
        @Override // androidx.recyclerview.widget.RecyclerView.EdgeEffectFactory
        @NonNull
        public EdgeEffect createEdgeEffect(@NonNull RecyclerView recyclerView, int i7) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class ViewCacheExtension {
        @Nullable
        public abstract View getViewForPositionAndType(@NonNull Recycler recycler, int i7, int i10);
    }

    public class ViewFlinger implements Runnable {
        private boolean mEatRunOnAnimationRequest;
        Interpolator mInterpolator;
        private int mLastFlingX;
        private int mLastFlingY;
        OverScroller mOverScroller;
        private boolean mReSchedulePostAnimationCallback;

        public ViewFlinger() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.mInterpolator = interpolator;
            this.mEatRunOnAnimationRequest = false;
            this.mReSchedulePostAnimationCallback = false;
            this.mOverScroller = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int computeScrollDuration(int i7, int i10) {
            int iAbs = Math.abs(i7);
            int iAbs2 = Math.abs(i10);
            boolean z3 = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z3 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z3) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        private void internalPostOnAnimation() {
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            WeakHashMap weakHashMap = N.f16168a;
            recyclerView.postOnAnimation(this);
        }

        public void fling(int i7, int i10) {
            RecyclerView.this.setScrollState(2);
            this.mLastFlingY = 0;
            this.mLastFlingX = 0;
            Interpolator interpolator = this.mInterpolator;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.mInterpolator = interpolator2;
                this.mOverScroller = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.mOverScroller.fling(0, 0, i7, i10, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            postOnAnimation();
        }

        public void postOnAnimation() {
            if (this.mEatRunOnAnimationRequest) {
                this.mReSchedulePostAnimationCallback = true;
            } else {
                internalPostOnAnimation();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            int i7;
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                stop();
                return;
            }
            this.mReSchedulePostAnimationCallback = false;
            this.mEatRunOnAnimationRequest = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.mOverScroller;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.mLastFlingX;
                int i13 = currY - this.mLastFlingY;
                this.mLastFlingX = currX;
                this.mLastFlingY = currY;
                int iConsumeFlingInHorizontalStretch = RecyclerView.this.consumeFlingInHorizontalStretch(i12);
                int iConsumeFlingInVerticalStretch = RecyclerView.this.consumeFlingInVerticalStretch(i13);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    iConsumeFlingInHorizontalStretch -= iArr2[0];
                    iConsumeFlingInVerticalStretch -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    int i14 = iArr4[0];
                    int i15 = iArr4[1];
                    iConsumeFlingInHorizontalStretch -= i14;
                    iConsumeFlingInVerticalStretch -= i15;
                    SmoothScroller smoothScroller = recyclerView4.mLayout.mSmoothScroller;
                    if (smoothScroller != null && !smoothScroller.isPendingInitialRun() && smoothScroller.isRunning()) {
                        int itemCount = RecyclerView.this.mState.getItemCount();
                        if (itemCount == 0) {
                            smoothScroller.stop();
                        } else if (smoothScroller.getTargetPosition() >= itemCount) {
                            smoothScroller.setTargetPosition(itemCount - 1);
                            smoothScroller.onAnimation(i14, i15);
                        } else {
                            smoothScroller.onAnimation(i14, i15);
                        }
                    }
                    i10 = i15;
                    i7 = i14;
                } else {
                    i7 = 0;
                    i10 = 0;
                }
                int i16 = iConsumeFlingInHorizontalStretch;
                int i17 = iConsumeFlingInVerticalStretch;
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i7, i10, i16, i17, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i18 = i16 - iArr6[0];
                int i19 = i17 - iArr6[1];
                if (i7 != 0 || i10 != 0) {
                    recyclerView6.dispatchOnScrolled(i7, i10);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z3 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i18 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i19 != 0));
                SmoothScroller smoothScroller2 = RecyclerView.this.mLayout.mSmoothScroller;
                if ((smoothScroller2 == null || !smoothScroller2.isPendingInitialRun()) && z3) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i18 < 0) {
                            i11 = -currVelocity;
                        } else {
                            i11 = i18 > 0 ? currVelocity : 0;
                        }
                        if (i19 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i19 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i11, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.clearPrefetchPositions();
                    }
                } else {
                    postOnAnimation();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    GapWorker gapWorker = recyclerView7.mGapWorker;
                    if (gapWorker != null) {
                        gapWorker.postFromTraversal(recyclerView7, i7, i10);
                    }
                }
            }
            SmoothScroller smoothScroller3 = RecyclerView.this.mLayout.mSmoothScroller;
            if (smoothScroller3 != null && smoothScroller3.isPendingInitialRun()) {
                smoothScroller3.onAnimation(0, 0);
            }
            this.mEatRunOnAnimationRequest = false;
            if (this.mReSchedulePostAnimationCallback) {
                internalPostOnAnimation();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.stopNestedScroll(1);
            }
        }

        public void smoothScrollBy(int i7, int i10, int i11, @Nullable Interpolator interpolator) {
            if (i11 == Integer.MIN_VALUE) {
                i11 = computeScrollDuration(i7, i10);
            }
            int i12 = i11;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.mInterpolator != interpolator) {
                this.mInterpolator = interpolator;
                this.mOverScroller = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.mLastFlingY = 0;
            this.mLastFlingX = 0;
            RecyclerView.this.setScrollState(2);
            this.mOverScroller.startScroll(0, 0, i7, i10, i12);
            postOnAnimation();
        }

        public void stop() {
            RecyclerView.this.removeCallbacks(this);
            this.mOverScroller.abortAnimation();
        }
    }

    public static abstract class ViewHolder {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        @NonNull
        public final View itemView;
        Adapter<? extends ViewHolder> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        ViewHolder mShadowedHolder = null;
        ViewHolder mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        Recycler mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        @VisibleForTesting
        int mPendingAccessibilityState = -1;

        public ViewHolder(@NonNull View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i7) {
            this.mFlags = i7 | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) != 0) {
                return false;
            }
            View view = this.itemView;
            WeakHashMap weakHashMap = N.f16168a;
            return view.hasTransientState();
        }

        public void flagRemovedAndOffsetPosition(int i7, int i10, boolean z3) {
            addFlags(8);
            offsetPosition(i10, z3);
            this.mPosition = i7;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        @Nullable
        public final Adapter<? extends ViewHolder> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i7 = this.mPreLayoutPosition;
            return i7 == -1 ? this.mPosition : i7;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i7 = this.mPreLayoutPosition;
            return i7 == -1 ? this.mPosition : i7;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i7) {
            return (i7 & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) != 0) {
                return false;
            }
            View view = this.itemView;
            WeakHashMap weakHashMap = N.f16168a;
            return !view.hasTransientState();
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i7, boolean z3) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z3) {
                this.mPreLayoutPosition += i7;
            }
            this.mPosition += i7;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).mInsetsDirty = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i7 = this.mPendingAccessibilityState;
            if (i7 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i7;
            } else {
                View view = this.itemView;
                WeakHashMap weakHashMap = N.f16168a;
                this.mWasImportantForAccessibilityBeforeHidden = view.getImportantForAccessibility();
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            if (RecyclerView.sDebugAssertionsEnabled && isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i7, int i10) {
            this.mFlags = (i7 & i10) | (this.mFlags & (~i10));
        }

        public final void setIsRecyclable(boolean z3) {
            int i7 = this.mIsRecyclableCount;
            int i10 = z3 ? i7 - 1 : i7 + 1;
            this.mIsRecyclableCount = i10;
            if (i10 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.sDebugAssertionsEnabled) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z3 && i10 == 1) {
                this.mFlags |= 16;
            } else if (z3 && i10 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                toString();
            }
        }

        public void setScrapContainer(Recycler recycler, boolean z3) {
            this.mScrapContainer = recycler;
            this.mInChangeScrap = z3;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sbT = G.t(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            sbT.append(Integer.toHexString(hashCode()));
            sbT.append(" position=");
            sbT.append(this.mPosition);
            sbT.append(" id=");
            sbT.append(this.mItemId);
            sbT.append(", oldPos=");
            sbT.append(this.mOldPosition);
            sbT.append(", pLpos:");
            sbT.append(this.mPreLayoutPosition);
            StringBuilder sb2 = new StringBuilder(sbT.toString());
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public void unScrap() {
            this.mScrapContainer.unscrapView(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new Interpolator() { // from class: androidx.recyclerview.widget.RecyclerView.3
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        };
        sDefaultEdgeEffectFactory = new StretchEdgeEffectFactory();
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }

    private void addAnimatingView(ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        boolean z3 = view.getParent() == this;
        this.mRecycler.unscrapView(getChildViewHolder(view));
        if (viewHolder.isTmpDetached()) {
            this.mChildHelper.attachViewToParent(view, -1, view.getLayoutParams(), true);
        } else if (z3) {
            this.mChildHelper.hide(view);
        } else {
            this.mChildHelper.addView(view, true);
        }
    }

    private void animateChange(@NonNull ViewHolder viewHolder, @NonNull ViewHolder viewHolder2, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo2, boolean z3, boolean z8) {
        viewHolder.setIsRecyclable(false);
        if (z3) {
            addAnimatingView(viewHolder);
        }
        if (viewHolder != viewHolder2) {
            if (z8) {
                addAnimatingView(viewHolder2);
            }
            viewHolder.mShadowedHolder = viewHolder2;
            addAnimatingView(viewHolder);
            this.mRecycler.unscrapView(viewHolder);
            viewHolder2.setIsRecyclable(false);
            viewHolder2.mShadowingHolder = viewHolder;
        }
        if (this.mItemAnimator.animateChange(viewHolder, viewHolder2, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(@NonNull ViewHolder viewHolder) {
        WeakReference<RecyclerView> weakReference = viewHolder.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == viewHolder.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            viewHolder.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i7, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i10) {
        if (i7 > 0 && edgeEffect != null && p264r5.a.p(edgeEffect) != 0.0f) {
            int iRound = Math.round(p264r5.a.C(edgeEffect, ((-i7) * FLING_DESTRETCH_FACTOR) / i10, 0.5f) * ((-i10) / FLING_DESTRETCH_FACTOR));
            if (iRound != i7) {
                edgeEffect.finish();
            }
            return i7 - iRound;
        }
        if (i7 >= 0 || edgeEffect2 == null || p264r5.a.p(edgeEffect2) == 0.0f) {
            return i7;
        }
        float f10 = i10;
        int iRound2 = Math.round(p264r5.a.C(edgeEffect2, (i7 * FLING_DESTRETCH_FACTOR) / f10, 0.5f) * (f10 / FLING_DESTRETCH_FACTOR));
        if (iRound2 != i7) {
            edgeEffect2.finish();
        }
        return i7 - iRound2;
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i7, int i10) {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(LayoutManager.class);
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i7), Integer.valueOf(i10)};
                } catch (NoSuchMethodException e10) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((LayoutManager) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e16);
            }
        }
    }

    private boolean didChildRangeChange(int i7, int i10) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i7 && iArr[1] == i10) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i7 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i7 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        accessibilityEventObtain.setContentChangeTypes(i7);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void dispatchLayoutStep1() {
        this.mState.assertLayoutStep(1);
        fillRemainingScrollValues(this.mState);
        this.mState.mIsMeasuring = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.clear();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        State state = this.mState;
        state.mTrackOldChangeHolders = state.mRunSimpleAnimations && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        state.mInPreLayout = state.mRunPredictiveAnimations;
        state.mItemCount = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.mRunSimpleAnimations) {
            int childCount = this.mChildHelper.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getChildAt(i7));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.addToPreLayout(childViewHolderInt, this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt, ItemAnimator.buildAdapterChangeFlagsForAnimations(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.mTrackOldChangeHolders && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.addToOldChangeHolders(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.mRunPredictiveAnimations) {
            saveOldPositions();
            State state2 = this.mState;
            boolean z3 = state2.mStructureChanged;
            state2.mStructureChanged = false;
            this.mLayout.onLayoutChildren(this.mRecycler, state2);
            this.mState.mStructureChanged = z3;
            for (int i10 = 0; i10 < this.mChildHelper.getChildCount(); i10++) {
                ViewHolder childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.getChildAt(i10));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.isInPreLayout(childViewHolderInt2)) {
                    int iBuildAdapterChangeFlagsForAnimations = ItemAnimator.buildAdapterChangeFlagsForAnimations(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE);
                    if (!zHasAnyOfTheFlags) {
                        iBuildAdapterChangeFlagsForAnimations |= 4096;
                    }
                    ItemAnimator.ItemHolderInfo itemHolderInfoRecordPreLayoutInformation = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt2, iBuildAdapterChangeFlagsForAnimations, childViewHolderInt2.getUnmodifiedPayloads());
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, itemHolderInfoRecordPreLayoutInformation);
                    } else {
                        this.mViewInfoStore.addToAppearedInPreLayoutHolders(childViewHolderInt2, itemHolderInfoRecordPreLayoutInformation);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.mLayoutStep = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.assertLayoutStep(6);
        this.mAdapterHelper.consumeUpdatesInOnePass();
        this.mState.mItemCount = this.mAdapter.getItemCount();
        this.mState.mDeletedInvisibleItemCountSincePreviousLayout = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.mLayoutState;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        State state = this.mState;
        state.mInPreLayout = false;
        this.mLayout.onLayoutChildren(this.mRecycler, state);
        State state2 = this.mState;
        state2.mStructureChanged = false;
        state2.mRunSimpleAnimations = state2.mRunSimpleAnimations && this.mItemAnimator != null;
        state2.mLayoutStep = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        RecyclerView recyclerView;
        this.mState.assertLayoutStep(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        State state = this.mState;
        state.mLayoutStep = 1;
        if (state.mRunSimpleAnimations) {
            for (int childCount = this.mChildHelper.getChildCount() - 1; childCount >= 0; childCount--) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getChildAt(childCount));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    ItemAnimator.ItemHolderInfo itemHolderInfoRecordPostLayoutInformation = this.mItemAnimator.recordPostLayoutInformation(this.mState, childViewHolderInt);
                    ViewHolder fromOldChangeHolders = this.mViewInfoStore.getFromOldChangeHolders(changedHolderKey);
                    if (fromOldChangeHolders == null || fromOldChangeHolders.shouldIgnore()) {
                        this.mViewInfoStore.addToPostLayout(childViewHolderInt, itemHolderInfoRecordPostLayoutInformation);
                    } else {
                        boolean zIsDisappearing = this.mViewInfoStore.isDisappearing(fromOldChangeHolders);
                        boolean zIsDisappearing2 = this.mViewInfoStore.isDisappearing(childViewHolderInt);
                        if (zIsDisappearing && fromOldChangeHolders == childViewHolderInt) {
                            this.mViewInfoStore.addToPostLayout(childViewHolderInt, itemHolderInfoRecordPostLayoutInformation);
                        } else {
                            ItemAnimator.ItemHolderInfo itemHolderInfoPopFromPreLayout = this.mViewInfoStore.popFromPreLayout(fromOldChangeHolders);
                            this.mViewInfoStore.addToPostLayout(childViewHolderInt, itemHolderInfoRecordPostLayoutInformation);
                            ItemAnimator.ItemHolderInfo itemHolderInfoPopFromPostLayout = this.mViewInfoStore.popFromPostLayout(childViewHolderInt);
                            if (itemHolderInfoPopFromPreLayout == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, fromOldChangeHolders);
                            } else {
                                animateChange(fromOldChangeHolders, childViewHolderInt, itemHolderInfoPopFromPreLayout, itemHolderInfoPopFromPostLayout, zIsDisappearing, zIsDisappearing2);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.mViewInfoStore.process(recyclerView.mViewInfoProcessCallback);
        } else {
            recyclerView = this;
        }
        recyclerView.mLayout.removeAndRecycleScrapInt(recyclerView.mRecycler);
        State state2 = recyclerView.mState;
        state2.mPreviousLayoutItemCount = state2.mItemCount;
        recyclerView.mDataSetHasChangedAfterLayout = false;
        recyclerView.mDispatchItemsChangedEvent = false;
        state2.mRunSimpleAnimations = false;
        state2.mRunPredictiveAnimations = false;
        recyclerView.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<ViewHolder> arrayList = recyclerView.mRecycler.mChangedScrap;
        if (arrayList != null) {
            arrayList.clear();
        }
        LayoutManager layoutManager = recyclerView.mLayout;
        if (layoutManager.mPrefetchMaxObservedInInitialPrefetch) {
            layoutManager.mPrefetchMaxCountObserved = 0;
            layoutManager.mPrefetchMaxObservedInInitialPrefetch = false;
            recyclerView.mRecycler.updateViewCacheSize();
        }
        recyclerView.mLayout.onLayoutCompleted(recyclerView.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        recyclerView.mViewInfoStore.clear();
        int[] iArr = recyclerView.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        OnItemTouchListener onItemTouchListener = this.mInterceptingOnItemTouchListener;
        if (onItemTouchListener == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        onItemTouchListener.onTouchEvent(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i7 = 0; i7 < size; i7++) {
            OnItemTouchListener onItemTouchListener = this.mOnItemTouchListeners.get(i7);
            if (onItemTouchListener.onInterceptTouchEvent(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = onItemTouchListener;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int childCount = this.mChildHelper.getChildCount();
        if (childCount == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i7 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getChildAt(i11));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i7) {
                    i7 = layoutPosition;
                }
                if (layoutPosition > i10) {
                    i10 = layoutPosition;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i10;
    }

    @Nullable
    public static RecyclerView findNestedRecyclerView(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i7));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    @Nullable
    private View findNextViewToFocus() {
        ViewHolder viewHolderFindViewHolderForAdapterPosition;
        State state = this.mState;
        int i7 = state.mFocusedItemPosition;
        if (i7 == -1) {
            i7 = 0;
        }
        int itemCount = state.getItemCount();
        for (int i10 = i7; i10 < itemCount; i10++) {
            ViewHolder viewHolderFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i10);
            if (viewHolderFindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (viewHolderFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return viewHolderFindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(itemCount, i7);
        do {
            iMin--;
            if (iMin < 0 || (viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!viewHolderFindViewHolderForAdapterPosition.itemView.hasFocusable());
        return viewHolderFindViewHolderForAdapterPosition.itemView;
    }

    public static ViewHolder getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).mViewHolder;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.mDecorInsets;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(Consts.DOT)) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private r getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new r(this);
        }
        return this.mScrollingChildHelper;
    }

    private float getSplineFlingDistance(int i7) {
        double dLog = Math.log((Math.abs(i7) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f10 = DECELERATION_RATE;
        return (float) (Math.exp((((double) f10) / (((double) f10) - 1.0d)) * dLog) * ((double) (this.mPhysicalCoef * SCROLL_FRICTION)));
    }

    private void handleMissingPreInfoForChangeError(long j6, ViewHolder viewHolder, ViewHolder viewHolder2) {
        int childCount = this.mChildHelper.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getChildAt(i7));
            if (childViewHolderInt != viewHolder && getChangedHolderKey(childViewHolderInt) == j6) {
                Adapter adapter = this.mAdapter;
                if (adapter == null || !adapter.hasStableIds()) {
                    StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb2.append(childViewHolderInt);
                    sb2.append(" \n View Holder 2:");
                    sb2.append(viewHolder);
                    throw new IllegalStateException(u.j(this, sb2));
                }
                StringBuilder sb3 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb3.append(childViewHolderInt);
                sb3.append(" \n View Holder 2:");
                sb3.append(viewHolder);
                throw new IllegalStateException(u.j(this, sb3));
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + viewHolder2 + " cannot be found but it is necessary for " + viewHolder + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int childCount = this.mChildHelper.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getChildAt(i7));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        WeakHashMap weakHashMap = N.f16168a;
        if ((Build.VERSION.SDK_INT >= 26 ? H.a(this) : 0) == 0) {
            N.s(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new ChildHelper(new ChildHelper.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.5
            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void addView(View view, int i7) {
                RecyclerView.this.addView(view, i7);
                RecyclerView.this.dispatchChildAttached(view);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void attachViewToParent(View view, int i7, ViewGroup.LayoutParams layoutParams) {
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                        StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                        sb2.append(childViewHolderInt);
                        throw new IllegalArgumentException(u.j(RecyclerView.this, sb2));
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.clearTmpDetachFlag();
                } else if (RecyclerView.sDebugAssertionsEnabled) {
                    StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
                    sb3.append(view);
                    sb3.append(", index: ");
                    sb3.append(i7);
                    throw new IllegalArgumentException(u.j(RecyclerView.this, sb3));
                }
                RecyclerView.this.attachViewToParent(view, i7, layoutParams);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void detachViewFromParent(int i7) {
                View childAt = getChildAt(i7);
                if (childAt != null) {
                    ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                    if (childViewHolderInt != null) {
                        if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                            StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                            sb2.append(childViewHolderInt);
                            throw new IllegalArgumentException(u.j(RecyclerView.this, sb2));
                        }
                        if (RecyclerView.sVerboseLoggingEnabled) {
                            childViewHolderInt.toString();
                        }
                        childViewHolderInt.addFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
                    }
                } else if (RecyclerView.sDebugAssertionsEnabled) {
                    StringBuilder sb3 = new StringBuilder("No view at offset ");
                    sb3.append(i7);
                    throw new IllegalArgumentException(u.j(RecyclerView.this, sb3));
                }
                RecyclerView.this.detachViewFromParent(i7);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public View getChildAt(int i7) {
                return RecyclerView.this.getChildAt(i7);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public int getChildCount() {
                return RecyclerView.this.getChildCount();
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public ViewHolder getChildViewHolder(View view) {
                return RecyclerView.getChildViewHolderInt(view);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public int indexOfChild(View view) {
                return RecyclerView.this.indexOfChild(view);
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void onEnteredHiddenState(View view) {
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
                }
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void onLeftHiddenState(View view) {
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    childViewHolderInt.onLeftHiddenState(RecyclerView.this);
                }
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void removeAllViews() {
                int childCount = getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = getChildAt(i7);
                    RecyclerView.this.dispatchChildDetached(childAt);
                    childAt.clearAnimation();
                }
                RecyclerView.this.removeAllViews();
            }

            @Override // androidx.recyclerview.widget.ChildHelper.Callback
            public void removeViewAt(int i7) {
                View childAt = RecyclerView.this.getChildAt(i7);
                if (childAt != null) {
                    RecyclerView.this.dispatchChildDetached(childAt);
                    childAt.clearAnimation();
                }
                RecyclerView.this.removeViewAt(i7);
            }
        });
    }

    private boolean isPreferredNextFocus(View view, View view2, int i7) {
        int i10;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        byte b7 = -1;
        int i11 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i12 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i13 = rect2.left;
        if ((i12 < i13 || rect.right <= i13) && rect.right < rect2.right) {
            i10 = 1;
        } else {
            int i14 = rect.right;
            int i15 = rect2.right;
            i10 = ((i14 > i15 || i12 >= i15) && i12 > i13) ? -1 : 0;
        }
        int i16 = rect.top;
        int i17 = rect2.top;
        if ((i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom) {
            b7 = 1;
        } else {
            int i18 = rect.bottom;
            int i19 = rect2.bottom;
            if ((i18 <= i19 && i16 < i19) || i16 <= i17) {
                b7 = 0;
            }
        }
        if (i7 == 1) {
            return b7 < 0 || (b7 == 0 && i10 * i11 < 0);
        }
        if (i7 == 2) {
            return b7 > 0 || (b7 == 0 && i10 * i11 > 0);
        }
        if (i7 == 17) {
            return i10 < 0;
        }
        if (i7 == 33) {
            return b7 < 0;
        }
        if (i7 == 66) {
            return i10 > 0;
        }
        if (i7 == 130) {
            return b7 > 0;
        }
        StringBuilder sb2 = new StringBuilder("Invalid direction: ");
        sb2.append(i7);
        throw new IllegalArgumentException(u.j(this, sb2));
    }

    private void nestedScrollByInternal(int i7, int i10, @Nullable MotionEvent motionEvent, int i11) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        int i12 = zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iReleaseHorizontalGlow = i7 - releaseHorizontalGlow(i7, height);
        int iReleaseVerticalGlow = i10 - releaseVerticalGlow(i10, width);
        startNestedScroll(i12, i11);
        if (dispatchNestedPreScroll(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, i11)) {
            int[] iArr2 = this.mReusableIntPair;
            iReleaseHorizontalGlow -= iArr2[0];
            iReleaseVerticalGlow -= iArr2[1];
        }
        scrollByInternal(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, motionEvent, i11);
        GapWorker gapWorker = this.mGapWorker;
        if (gapWorker != null && (iReleaseHorizontalGlow != 0 || iReleaseVerticalGlow != 0)) {
            gapWorker.postFromTraversal(this, iReleaseHorizontalGlow, iReleaseVerticalGlow);
        }
        stopNestedScroll(i11);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i7);
            int x3 = (int) (motionEvent.getX(i7) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y8 = (int) (motionEvent.getY(i7) + 0.5f);
            this.mLastTouchY = y8;
            this.mInitialTouchY = y8;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z3;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.reset();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.preProcess();
        } else {
            this.mAdapterHelper.consumeUpdatesInOnePass();
        }
        boolean z8 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.mRunSimpleAnimations = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z3 = this.mDataSetHasChangedAfterLayout) || z8 || this.mLayout.mRequestedSimpleAnimations) && (!z3 || this.mAdapter.hasStableIds());
        State state = this.mState;
        state.mRunPredictiveAnimations = state.mRunSimpleAnimations && z8 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    private void pullGlows(float f10, float f11, float f12, float f13) {
        boolean z3;
        boolean z8 = true;
        if (f11 >= 0.0f) {
            if (f11 > 0.0f) {
                ensureRightGlow();
                p264r5.a.C(this.mRightGlow, f11 / getWidth(), f12 / getHeight());
            } else {
                z3 = false;
            }
            if (f13 < 0.0f) {
                ensureTopGlow();
                p264r5.a.C(this.mTopGlow, (-f13) / getHeight(), f10 / getWidth());
            } else if (f13 > 0.0f) {
                ensureBottomGlow();
                p264r5.a.C(this.mBottomGlow, f13 / getHeight(), 1.0f - (f10 / getWidth()));
            } else {
                z8 = z3;
            }
            if (z8 && f11 == 0.0f && f13 == 0.0f) {
                return;
            }
            WeakHashMap weakHashMap = N.f16168a;
            postInvalidateOnAnimation();
        }
        ensureLeftGlow();
        p264r5.a.C(this.mLeftGlow, (-f11) / getWidth(), 1.0f - (f12 / getHeight()));
        z3 = true;
        if (f13 < 0.0f) {
            ensureTopGlow();
            p264r5.a.C(this.mTopGlow, (-f13) / getHeight(), f10 / getWidth());
        } else if (f13 > 0.0f) {
            ensureBottomGlow();
            p264r5.a.C(this.mBottomGlow, f13 / getHeight(), 1.0f - (f10 / getWidth()));
        } else {
            z8 = z3;
        }
        if (z8) {
        }
        WeakHashMap weakHashMap2 = N.f16168a;
        postInvalidateOnAnimation();
    }

    private void recoverFocusFromState() {
        View viewFindViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.isHidden(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.getChildCount() == 0) {
                requestFocus();
                return;
            }
        }
        View viewFindNextViewToFocus = null;
        ViewHolder viewHolderFindViewHolderForItemId = (this.mState.mFocusedItemId == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.mFocusedItemId);
        if (viewHolderFindViewHolderForItemId != null && !this.mChildHelper.isHidden(viewHolderFindViewHolderForItemId.itemView) && viewHolderFindViewHolderForItemId.itemView.hasFocusable()) {
            viewFindNextViewToFocus = viewHolderFindViewHolderForItemId.itemView;
        } else if (this.mChildHelper.getChildCount() > 0) {
            viewFindNextViewToFocus = findNextViewToFocus();
        }
        if (viewFindNextViewToFocus != null) {
            int i7 = this.mState.mFocusedSubChildId;
            if (i7 != -1 && (viewFindViewById = viewFindNextViewToFocus.findViewById(i7)) != null && viewFindViewById.isFocusable()) {
                viewFindNextViewToFocus = viewFindViewById;
            }
            viewFindNextViewToFocus.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = N.f16168a;
            postInvalidateOnAnimation();
        }
    }

    private int releaseHorizontalGlow(int i7, float f10) {
        float height = f10 / getHeight();
        float width = i7 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f11 = 0.0f;
        if (edgeEffect == null || p264r5.a.p(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && p264r5.a.p(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float fC = p264r5.a.C(this.mRightGlow, width, height);
                    if (p264r5.a.p(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f11 = fC;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f12 = -p264r5.a.C(this.mLeftGlow, -width, 1.0f - height);
                if (p264r5.a.p(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    private int releaseVerticalGlow(int i7, float f10) {
        float width = f10 / getWidth();
        float height = i7 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f11 = 0.0f;
        if (edgeEffect == null || p264r5.a.p(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && p264r5.a.p(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float fC = p264r5.a.C(this.mBottomGlow, height, 1.0f - width);
                    if (p264r5.a.p(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f11 = fC;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f12 = -p264r5.a.C(this.mTopGlow, -height, width);
                if (p264r5.a.p(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    private void requestChildOnScreen(@NonNull View view, @Nullable View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.mInsetsDirty) {
                Rect rect = layoutParams2.mDecorInsets;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        State state = this.mState;
        state.mFocusedItemId = -1L;
        state.mFocusedItemPosition = -1;
        state.mFocusedSubChildId = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        int absoluteAdapterPosition;
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        ViewHolder viewHolderFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (viewHolderFindContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.mFocusedItemId = this.mAdapter.hasStableIds() ? viewHolderFindContainingViewHolder.getItemId() : -1L;
        State state = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = viewHolderFindContainingViewHolder.isRemoved() ? viewHolderFindContainingViewHolder.mOldPosition : viewHolderFindContainingViewHolder.getAbsoluteAdapterPosition();
        }
        state.mFocusedItemPosition = absoluteAdapterPosition;
        this.mState.mFocusedSubChildId = getDeepestFocusedViewWithId(viewHolderFindContainingViewHolder.itemView);
    }

    private void setAdapterInternal(@Nullable Adapter<?> adapter, boolean z3, boolean z8) {
        Adapter adapter2 = this.mAdapter;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z3 || z8) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.reset();
        Adapter<?> adapter3 = this.mAdapter;
        this.mAdapter = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mObserver);
            adapter.onAttachedToRecyclerView(this);
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.onAdapterChanged(adapter3, this.mAdapter);
        }
        this.mRecycler.onAdapterChanged(adapter3, this.mAdapter, z3);
        this.mState.mStructureChanged = true;
    }

    public static void setDebugAssertionsEnabled(boolean z3) {
        sDebugAssertionsEnabled = z3;
    }

    public static void setVerboseLoggingEnabled(boolean z3) {
        sVerboseLoggingEnabled = z3;
    }

    private boolean shouldAbsorb(@NonNull EdgeEffect edgeEffect, int i7, int i10) {
        if (i7 > 0) {
            return true;
        }
        return getSplineFlingDistance(-i7) < p264r5.a.p(edgeEffect) * ((float) i10);
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z3;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || p264r5.a.p(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z3 = false;
        } else {
            p264r5.a.C(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z3 = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && p264r5.a.p(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            p264r5.a.C(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
            z3 = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && p264r5.a.p(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            p264r5.a.C(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
            z3 = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || p264r5.a.p(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z3;
        }
        p264r5.a.C(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.stop();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.stopSmoothScroller();
        }
    }

    public void absorbGlows(int i7, int i10) {
        if (i7 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i7);
            }
        } else if (i7 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i7);
            }
        }
        if (i10 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i10);
            }
        }
        if (i7 == 0 && i10 == 0) {
            return;
        }
        WeakHashMap weakHashMap = N.f16168a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i7, int i10) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || !layoutManager.onAddFocusables(this, arrayList, i7, i10)) {
            super.addFocusables(arrayList, i7, i10);
        }
    }

    public void addItemDecoration(@NonNull ItemDecoration itemDecoration, int i7) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i7 < 0) {
            this.mItemDecorations.add(itemDecoration);
        } else {
            this.mItemDecorations.add(i7, itemDecoration);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(onChildAttachStateChangeListener);
    }

    public void addOnItemTouchListener(@NonNull OnItemTouchListener onItemTouchListener) {
        this.mOnItemTouchListeners.add(onItemTouchListener);
    }

    public void addOnScrollListener(@NonNull OnScrollListener onScrollListener) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(onScrollListener);
    }

    public void addRecyclerListener(@NonNull RecyclerListener recyclerListener) {
        p118hf.a.g(recyclerListener != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(recyclerListener);
    }

    public void animateAppearance(@NonNull ViewHolder viewHolder, @Nullable ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        viewHolder.setIsRecyclable(false);
        if (this.mItemAnimator.animateAppearance(viewHolder, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(@NonNull ViewHolder viewHolder, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo, @Nullable ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        addAnimatingView(viewHolder);
        viewHolder.setIsRecyclable(false);
        if (this.mItemAnimator.animateDisappearance(viewHolder, itemHolderInfo, itemHolderInfo2)) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str != null) {
            throw new IllegalStateException(u.j(this, u.s(str)));
        }
        throw new IllegalStateException(u.j(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(u.j(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.mDispatchScrollCounter > 0) {
            new IllegalStateException(u.j(this, new StringBuilder("")));
        }
    }

    public boolean canReuseUpdatedViewHolder(ViewHolder viewHolder) {
        ItemAnimator itemAnimator = this.mItemAnimator;
        return itemAnimator == null || itemAnimator.canReuseUpdatedViewHolder(viewHolder, viewHolder.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.mLayout.checkLayoutParams((LayoutParams) layoutParams);
    }

    public void clearOldPositions() {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i7 = 0; i7 < unfilteredChildCount; i7++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i7));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.clearOldPositions();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i7, int i10) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i7 <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i7 < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i10 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i10 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = N.f16168a;
            postInvalidateOnAnimation();
        }
    }

    public int consumeFlingInHorizontalStretch(int i7) {
        return consumeFlingInStretch(i7, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i7) {
        return consumeFlingInStretch(i7, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            int i7 = j.f16100a;
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.hasPendingUpdates()) {
            if (!this.mAdapterHelper.hasAnyUpdateTypes(4) || this.mAdapterHelper.hasAnyUpdateTypes(11)) {
                if (this.mAdapterHelper.hasPendingUpdates()) {
                    int i10 = j.f16100a;
                    Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i11 = j.f16100a;
            Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.preProcess();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.consumePostponedUpdates();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            Trace.endSection();
        }
    }

    public void defaultOnMeasure(int i7, int i10) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = N.f16168a;
        setMeasuredDimension(LayoutManager.chooseSize(i7, paddingRight, getMinimumWidth()), LayoutManager.chooseSize(i10, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewAttachedToWindow(childViewHolderInt);
        }
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewAttachedToWindow(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        Adapter adapter = this.mAdapter;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewDetachedFromWindow(view);
            }
        }
    }

    public void dispatchLayout() {
        if (this.mAdapter == null) {
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        this.mState.mIsMeasuring = false;
        boolean z3 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.mLayoutStep == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else if (this.mAdapterHelper.hasUpdates() || z3 || this.mLayout.getWidth() != getWidth() || this.mLayout.getHeight() != getHeight()) {
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            this.mLayout.setExactMeasureSpecsFrom(this);
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f10, float f11, boolean z3) {
        return getScrollingChildHelper().a(f10, f11, z3);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i7, int i10, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i7, i10, iArr, iArr2, 0);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i7, int i10, int i11, int i12, int[] iArr) {
        return getScrollingChildHelper().d(i7, i10, i11, i12, iArr, 0, null);
    }

    public void dispatchOnScrollStateChanged(int i7) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.onScrollStateChanged(i7);
        }
        onScrollStateChanged(i7);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(this, i7);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i7);
            }
        }
    }

    public void dispatchOnScrolled(int i7, int i10) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i7, scrollY - i10);
        onScrolled(i7, i10);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrolled(this, i7, i10);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i7, i10);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i7;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = this.mPendingAccessibilityImportanceChange.get(size);
            if (viewHolder.itemView.getParent() == this && !viewHolder.shouldIgnore() && (i7 = viewHolder.mPendingAccessibilityState) != -1) {
                View view = viewHolder.itemView;
                WeakHashMap weakHashMap = N.f16168a;
                view.setImportantForAccessibility(i7);
                viewHolder.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z3;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z8 = false;
        for (int i7 = 0; i7 < size; i7++) {
            this.mItemDecorations.get(i7).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z3 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z3 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z3 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z3 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z8 = true;
            }
            z3 |= z8;
            canvas.restoreToCount(iSave4);
        }
        if ((z3 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.isRunning()) ? z3 : true) {
            WeakHashMap weakHashMap = N.f16168a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j6) {
        return super.drawChild(canvas, view, j6);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 3);
        this.mBottomGlow = edgeEffectCreateEdgeEffect;
        if (this.mClipToPadding) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 0);
        this.mLeftGlow = edgeEffectCreateEdgeEffect;
        if (this.mClipToPadding) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 2);
        this.mRightGlow = edgeEffectCreateEdgeEffect;
        if (this.mClipToPadding) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect edgeEffectCreateEdgeEffect = this.mEdgeEffectFactory.createEdgeEffect(this, 1);
        this.mTopGlow = edgeEffectCreateEdgeEffect;
        if (this.mClipToPadding) {
            edgeEffectCreateEdgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectCreateEdgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(State state) {
        if (getScrollState() != 2) {
            state.mRemainingScrollHorizontal = 0;
            state.mRemainingScrollVertical = 0;
        } else {
            OverScroller overScroller = this.mViewFlinger.mOverScroller;
            state.mRemainingScrollHorizontal = overScroller.getFinalX() - overScroller.getCurrX();
            state.mRemainingScrollVertical = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    @Nullable
    public View findChildViewUnder(float f10, float f11) {
        for (int childCount = this.mChildHelper.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.mChildHelper.getChildAt(childCount);
            float translationX = childAt.getTranslationX();
            float translationY = childAt.getTranslationY();
            if (f10 >= childAt.getLeft() + translationX && f10 <= childAt.getRight() + translationX && f11 >= childAt.getTop() + translationY && f11 <= childAt.getBottom() + translationY) {
                return childAt;
            }
        }
        return null;
    }

    @Nullable
    public View findContainingItemView(@NonNull View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    @Nullable
    public ViewHolder findContainingViewHolder(@NonNull View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    @Nullable
    public ViewHolder findViewHolderForAdapterPosition(int i7) {
        ViewHolder viewHolder = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i10 = 0; i10 < unfilteredChildCount; i10++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i10));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i7) {
                if (!this.mChildHelper.isHidden(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                viewHolder = childViewHolderInt;
            }
        }
        return viewHolder;
    }

    public ViewHolder findViewHolderForItemId(long j6) {
        Adapter adapter = this.mAdapter;
        ViewHolder viewHolder = null;
        if (adapter != null && adapter.hasStableIds()) {
            int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
            for (int i7 = 0; i7 < unfilteredChildCount; i7++) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i7));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j6) {
                    if (!this.mChildHelper.isHidden(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    viewHolder = childViewHolderInt;
                }
            }
        }
        return viewHolder;
    }

    @Nullable
    public ViewHolder findViewHolderForLayoutPosition(int i7) {
        return findViewHolderForPosition(i7, false);
    }

    @Nullable
    @Deprecated
    public ViewHolder findViewHolderForPosition(int i7) {
        return findViewHolderForPosition(i7, false);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean fling(int i7, int i10) {
        int iMax;
        int i11;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        int iCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (iCanScrollHorizontally == 0 || Math.abs(i7) < this.mMinFlingVelocity) {
            i7 = 0;
        }
        if (!zCanScrollVertically || Math.abs(i10) < this.mMinFlingVelocity) {
            i10 = 0;
        }
        if (i7 == 0 && i10 == 0) {
            return false;
        }
        if (i7 == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect == null || p264r5.a.p(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 == null || p264r5.a.p(edgeEffect2) == 0.0f) {
                    iMax = 0;
                } else if (shouldAbsorb(this.mRightGlow, i7, getWidth())) {
                    this.mRightGlow.onAbsorb(i7);
                    i7 = 0;
                }
            } else {
                int i12 = -i7;
                if (shouldAbsorb(this.mLeftGlow, i12, getWidth())) {
                    this.mLeftGlow.onAbsorb(i12);
                    i7 = 0;
                }
            }
            iMax = i7;
            i7 = 0;
        }
        if (i10 == 0) {
            i11 = i10;
            i10 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.mTopGlow;
            if (edgeEffect3 == null || p264r5.a.p(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.mBottomGlow;
                if (edgeEffect4 == null || p264r5.a.p(edgeEffect4) == 0.0f) {
                    i11 = i10;
                    i10 = 0;
                } else if (shouldAbsorb(this.mBottomGlow, i10, getHeight())) {
                    this.mBottomGlow.onAbsorb(i10);
                    i10 = 0;
                }
            } else {
                int i13 = -i10;
                if (shouldAbsorb(this.mTopGlow, i13, getHeight())) {
                    this.mTopGlow.onAbsorb(i13);
                    i10 = 0;
                }
            }
            i11 = 0;
        }
        if (iMax != 0 || i10 != 0) {
            int i14 = this.mMaxFlingVelocity;
            iMax = Math.max(-i14, Math.min(iMax, i14));
            int i15 = this.mMaxFlingVelocity;
            i10 = Math.max(-i15, Math.min(i10, i15));
            this.mViewFlinger.fling(iMax, i10);
        }
        if (i7 == 0 && i11 == 0) {
            return (iMax == 0 && i10 == 0) ? false : true;
        }
        float f10 = i7;
        float f11 = i11;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z3 = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f10, f11, z3);
            OnFlingListener onFlingListener = this.mOnFlingListener;
            if (onFlingListener != null && onFlingListener.onFling(i7, i11)) {
                return true;
            }
            if (z3) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i16 = this.mMaxFlingVelocity;
                int iMax2 = Math.max(-i16, Math.min(i7, i16));
                int i17 = this.mMaxFlingVelocity;
                this.mViewFlinger.fling(iMax2, Math.max(-i17, Math.min(i11, i17)));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i7) {
        View viewOnFocusSearchFailed;
        boolean z3;
        View viewOnInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i7);
        if (viewOnInterceptFocusSearch != null) {
            return viewOnInterceptFocusSearch;
        }
        boolean z8 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z8 && (i7 == 2 || i7 == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i10 = i7 == 2 ? 130 : 33;
                z3 = focusFinder.findNextFocus(this, view, i10) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i7 = i10;
                }
            } else {
                z3 = false;
            }
            if (!z3 && this.mLayout.canScrollHorizontally()) {
                int i11 = (this.mLayout.getLayoutDirection() == 1) ^ (i7 == 2) ? 66 : 17;
                boolean z10 = focusFinder.findNextFocus(this, view, i11) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i7 = i11;
                }
                z3 = z10;
            }
            if (z3) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i7, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            viewOnFocusSearchFailed = focusFinder.findNextFocus(this, view, i7);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i7);
            if (viewFindNextFocus == null && z8) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                viewOnFocusSearchFailed = this.mLayout.onFocusSearchFailed(view, i7, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                viewOnFocusSearchFailed = viewFindNextFocus;
            }
        }
        if (viewOnFocusSearchFailed == null || viewOnFocusSearchFailed.hasFocusable()) {
            return isPreferredNextFocus(view, viewOnFocusSearchFailed, i7) ? viewOnFocusSearchFailed : super.focusSearch(view, i7);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i7);
        }
        requestChildOnScreen(viewOnFocusSearchFailed, null);
        return view;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(u.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(u.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Nullable
    public Adapter getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(ViewHolder viewHolder) {
        if (viewHolder.hasAnyOfTheFlags(SetUserPhotoActivity.REQUEST_CODE_CAPTURE_FACE) || !viewHolder.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.applyPendingUpdatesToPosition(viewHolder.mPosition);
    }

    @Override // android.view.View
    public int getBaseline() {
        LayoutManager layoutManager = this.mLayout;
        return layoutManager != null ? layoutManager.getBaseline() : super.getBaseline();
    }

    public long getChangedHolderKey(ViewHolder viewHolder) {
        return this.mAdapter.hasStableIds() ? viewHolder.getItemId() : viewHolder.mPosition;
    }

    public int getChildAdapterPosition(@NonNull View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i7, int i10) {
        ChildDrawingOrderCallback childDrawingOrderCallback = this.mChildDrawingOrderCallback;
        return childDrawingOrderCallback == null ? super.getChildDrawingOrder(i7, i10) : childDrawingOrderCallback.onGetChildDrawingOrder(i7, i10);
    }

    public long getChildItemId(@NonNull View view) {
        ViewHolder childViewHolderInt;
        Adapter adapter = this.mAdapter;
        if (adapter == null || !adapter.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(@NonNull View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(@NonNull View view) {
        return getChildAdapterPosition(view);
    }

    public ViewHolder getChildViewHolder(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    @Nullable
    public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    @NonNull
    public EdgeEffectFactory getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @Nullable
    public ItemAnimator getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.mInsetsDirty) {
            return layoutParams.mDecorInsets;
        }
        if (this.mState.isPreLayout() && (layoutParams.isItemChanged() || layoutParams.isViewInvalid())) {
            return layoutParams.mDecorInsets;
        }
        Rect rect = layoutParams.mDecorInsets;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i7).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i10 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i10 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.mInsetsDirty = false;
        return rect;
    }

    @NonNull
    public ItemDecoration getItemDecorationAt(int i7) {
        int itemDecorationCount = getItemDecorationCount();
        if (i7 >= 0 && i7 < itemDecorationCount) {
            return this.mItemDecorations.get(i7);
        }
        throw new IndexOutOfBoundsException(i7 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    @Nullable
    public LayoutManager getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    @Nullable
    public OnFlingListener getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    @NonNull
    public RecycledViewPool getRecycledViewPool() {
        return this.mRecycler.getRecycledViewPool();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.hasPendingUpdates();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new AdapterHelper(new AdapterHelper.Callback() { // from class: androidx.recyclerview.widget.RecyclerView.6
            public void dispatchUpdate(AdapterHelper.UpdateOp updateOp) {
                int i7 = updateOp.cmd;
                if (i7 == 1) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.mLayout.onItemsAdded(recyclerView, updateOp.positionStart, updateOp.itemCount);
                    return;
                }
                if (i7 == 2) {
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.mLayout.onItemsRemoved(recyclerView2, updateOp.positionStart, updateOp.itemCount);
                } else if (i7 == 4) {
                    RecyclerView recyclerView3 = RecyclerView.this;
                    recyclerView3.mLayout.onItemsUpdated(recyclerView3, updateOp.positionStart, updateOp.itemCount, updateOp.payload);
                } else {
                    if (i7 != 8) {
                        return;
                    }
                    RecyclerView recyclerView4 = RecyclerView.this;
                    recyclerView4.mLayout.onItemsMoved(recyclerView4, updateOp.positionStart, updateOp.itemCount, 1);
                }
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public ViewHolder findViewHolder(int i7) {
                ViewHolder viewHolderFindViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i7, true);
                if (viewHolderFindViewHolderForPosition == null) {
                    return null;
                }
                if (!RecyclerView.this.mChildHelper.isHidden(viewHolderFindViewHolderForPosition.itemView)) {
                    return viewHolderFindViewHolderForPosition;
                }
                int i10 = RecyclerView.HORIZONTAL;
                return null;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void markViewHoldersUpdated(int i7, int i10, Object obj) {
                RecyclerView.this.viewRangeUpdate(i7, i10, obj);
                RecyclerView.this.mItemsChanged = true;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void offsetPositionsForAdd(int i7, int i10) {
                RecyclerView.this.offsetPositionRecordsForInsert(i7, i10);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void offsetPositionsForMove(int i7, int i10) {
                RecyclerView.this.offsetPositionRecordsForMove(i7, i10);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void offsetPositionsForRemovingInvisible(int i7, int i10) {
                RecyclerView.this.offsetPositionRecordsForRemove(i7, i10, true);
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mItemsAddedOrRemoved = true;
                recyclerView.mState.mDeletedInvisibleItemCountSincePreviousLayout += i10;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void offsetPositionsForRemovingLaidOutOrNewView(int i7, int i10) {
                RecyclerView.this.offsetPositionRecordsForRemove(i7, i10, false);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void onDispatchFirstPass(AdapterHelper.UpdateOp updateOp) {
                dispatchUpdate(updateOp);
            }

            @Override // androidx.recyclerview.widget.AdapterHelper.Callback
            public void onDispatchSecondPass(AdapterHelper.UpdateOp updateOp) {
                dispatchUpdate(updateOp);
            }
        });
    }

    @VisibleForTesting
    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(u.j(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new FastScroller(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(I0.b.fastscroll_default_thickness), resources.getDimensionPixelSize(I0.b.fastscroll_minimum_range), resources.getDimensionPixelOffset(I0.b.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        ItemAnimator itemAnimator = this.mItemAnimator;
        return itemAnimator != null && itemAnimator.isRunning();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f16281d;
    }

    public void jumpToPositionForSmoothScroller(int i7) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i7);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i7 = 0; i7 < unfilteredChildCount; i7++) {
            ((LayoutParams) this.mChildHelper.getUnfilteredChildAt(i7).getLayoutParams()).mInsetsDirty = true;
        }
        this.mRecycler.markItemDecorInsetsDirty();
    }

    public void markKnownViewsInvalid() {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i7 = 0; i7 < unfilteredChildCount; i7++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i7));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.markKnownViewsInvalid();
    }

    public void nestedScrollBy(int i7, int i10) {
        nestedScrollByInternal(i7, i10, null, 1);
    }

    public void offsetChildrenHorizontal(@Px int i7) {
        int childCount = this.mChildHelper.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            this.mChildHelper.getChildAt(i10).offsetLeftAndRight(i7);
        }
    }

    public void offsetChildrenVertical(@Px int i7) {
        int childCount = this.mChildHelper.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            this.mChildHelper.getChildAt(i10).offsetTopAndBottom(i7);
        }
    }

    public void offsetPositionRecordsForInsert(int i7, int i10) {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i11 = 0; i11 < unfilteredChildCount; i11++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i11));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i7) {
                if (sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
                childViewHolderInt.offsetPosition(i10, false);
                this.mState.mStructureChanged = true;
            }
        }
        this.mRecycler.offsetPositionRecordsForInsert(i7, i10);
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        if (i7 < i10) {
            i13 = -1;
            i12 = i7;
            i11 = i10;
        } else {
            i11 = i7;
            i12 = i10;
            i13 = 1;
        }
        for (int i15 = 0; i15 < unfilteredChildCount; i15++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i15));
            if (childViewHolderInt != null && (i14 = childViewHolderInt.mPosition) >= i12 && i14 <= i11) {
                if (sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
                if (childViewHolderInt.mPosition == i7) {
                    childViewHolderInt.offsetPosition(i10 - i7, false);
                } else {
                    childViewHolderInt.offsetPosition(i13, false);
                }
                this.mState.mStructureChanged = true;
            }
        }
        this.mRecycler.offsetPositionRecordsForMove(i7, i10);
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i7, int i10, boolean z3) {
        int i11 = i7 + i10;
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i12 = 0; i12 < unfilteredChildCount; i12++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i12));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i13 = childViewHolderInt.mPosition;
                if (i13 >= i11) {
                    if (sVerboseLoggingEnabled) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.offsetPosition(-i10, z3);
                    this.mState.mStructureChanged = true;
                } else if (i13 >= i7) {
                    if (sVerboseLoggingEnabled) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i7 - 1, -i10, z3);
                    this.mState.mStructureChanged = true;
                }
            }
        }
        this.mRecycler.offsetPositionRecordsForRemove(i7, i10, z3);
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        this.mRecycler.onAttachedToWindow();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<GapWorker> threadLocal = GapWorker.sGapWorker;
            GapWorker gapWorker = threadLocal.get();
            this.mGapWorker = gapWorker;
            if (gapWorker == null) {
                this.mGapWorker = new GapWorker();
                WeakHashMap weakHashMap = N.f16168a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                GapWorker gapWorker2 = this.mGapWorker;
                gapWorker2.mFrameIntervalNs = (long) (1.0E9f / refreshRate);
                threadLocal.set(gapWorker2);
            }
            this.mGapWorker.add(this);
        }
    }

    public void onChildAttachedToWindow(@NonNull View view) {
    }

    public void onChildDetachedFromWindow(@NonNull View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        GapWorker gapWorker;
        super.onDetachedFromWindow();
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        stopScroll();
        this.mIsAttached = false;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.onDetach();
        this.mRecycler.onDetachedFromWindow();
        int i7 = a.f36805a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Iterator it = new P(this).iterator();
        while (true) {
            Q q10 = (Q) it;
            if (!q10.hasNext()) {
                break;
            }
            View view = (View) q10.next();
            int i10 = a.f36805a;
            p090g0.b bVar = (p090g0.b) view.getTag(i10);
            if (bVar == null) {
                bVar = new p090g0.b();
                view.setTag(i10, bVar);
            }
            ArrayList arrayList = bVar.f36807a;
            for (int iG = C1850q.g(arrayList); -1 < iG; iG--) {
                ((PoolingContainerListener) arrayList.get(iG)).onRelease();
            }
        }
        if (!ALLOW_THREAD_GAP_WORK || (gapWorker = this.mGapWorker) == null) {
            return;
        }
        gapWorker.remove(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.mItemDecorations.get(i7).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float axisValue;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f10 = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.mLayout.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.mLayout.canScrollVertically()) {
                    f10 = -axisValue2;
                } else if (this.mLayout.canScrollHorizontally()) {
                    axisValue = axisValue2;
                    f10 = 0.0f;
                } else {
                    f10 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f10 = 0.0f;
                axisValue = 0.0f;
            }
            if (f10 != 0.0f || axisValue != 0.0f) {
                nestedScrollByInternal((int) (axisValue * this.mScaledHorizontalScrollFactor), (int) (f10 * this.mScaledVerticalScrollFactor), motionEvent, 1);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return false;
        }
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y8 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y8;
            this.mInitialTouchY = y8;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i7 = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i7 = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i7, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x7 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y10 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i10 = x7 - this.mInitialTouchX;
                int i11 = y10 - this.mInitialTouchY;
                if (!zCanScrollHorizontally || Math.abs(i10) <= this.mTouchSlop) {
                    z3 = false;
                } else {
                    this.mLastTouchX = x7;
                    z3 = true;
                }
                if (zCanScrollVertically && Math.abs(i11) > this.mTouchSlop) {
                    this.mLastTouchY = y10;
                    z3 = true;
                }
                if (z3) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x10 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y11;
            this.mInitialTouchY = y11;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        int i13 = j.f16100a;
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            defaultOnMeasure(i7, i10);
            return;
        }
        boolean z3 = false;
        if (layoutManager.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i7);
            int mode2 = View.MeasureSpec.getMode(i10);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i7, i10);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z3 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z3;
            if (z3 || this.mAdapter == null) {
                return;
            }
            if (this.mState.mLayoutStep == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i7, i10);
            this.mState.mIsMeasuring = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i7, i10);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.mIsMeasuring = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i7, i10);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i7, i10);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            State state = this.mState;
            if (state.mRunPredictiveAnimations) {
                state.mInPreLayout = true;
            } else {
                this.mAdapterHelper.consumeUpdatesInOnePass();
                this.mState.mInPreLayout = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.mRunPredictiveAnimations) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        Adapter adapter = this.mAdapter;
        if (adapter != null) {
            this.mState.mItemCount = adapter.getItemCount();
        } else {
            this.mState.mItemCount = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i7, i10);
        stopInterceptRequestLayout(false);
        this.mState.mInPreLayout = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i7, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.getSuperState());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.copyFrom(savedState2);
            return savedState;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            savedState.mLayoutState = layoutManager.onSaveInstanceState();
            return savedState;
        }
        savedState.mLayoutState = null;
        return savedState;
    }

    public void onScrollStateChanged(int i7) {
    }

    public void onScrolled(@Px int i7, @Px int i10) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 == i11 && i10 == i12) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00dc A[PHI: r1
      0x00dc: PHI (r1v46 int) = (r1v26 int), (r1v50 int) binds: [B:41:0x00c5, B:45:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        boolean z3;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return false;
        }
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.mVelocityTracker.addMovement(motionEventObtain);
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                float f10 = zCanScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                float f11 = zCanScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                if ((f10 == 0.0f && f11 == 0.0f) || !fling((int) f10, (int) f11)) {
                    setScrollState(0);
                }
                resetScroll();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                if (iFindPointerIndex < 0) {
                    Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y8 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax = this.mLastTouchX - x3;
                int iMax2 = this.mLastTouchY - y8;
                if (this.mScrollState != 1) {
                    if (zCanScrollHorizontally) {
                        iMax = iMax > 0 ? Math.max(0, iMax - this.mTouchSlop) : Math.min(0, iMax + this.mTouchSlop);
                        if (iMax != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else {
                        z3 = false;
                    }
                    if (zCanScrollVertically) {
                        iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.mTouchSlop) : Math.min(0, iMax2 + this.mTouchSlop);
                        if (iMax2 != 0) {
                            z3 = true;
                        }
                    }
                    if (z3) {
                        setScrollState(1);
                    }
                }
                if (this.mScrollState == 1) {
                    int[] iArr3 = this.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int iReleaseHorizontalGlow = iMax - releaseHorizontalGlow(iMax, motionEvent.getY());
                    int iReleaseVerticalGlow = iMax2 - releaseVerticalGlow(iMax2, motionEvent.getX());
                    if (dispatchNestedPreScroll(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                        int[] iArr4 = this.mReusableIntPair;
                        iReleaseHorizontalGlow -= iArr4[0];
                        iReleaseVerticalGlow -= iArr4[1];
                        int[] iArr5 = this.mNestedOffsets;
                        int i10 = iArr5[0];
                        int[] iArr6 = this.mScrollOffset;
                        iArr5[0] = i10 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr7 = this.mScrollOffset;
                    this.mLastTouchX = x3 - iArr7[0];
                    this.mLastTouchY = y8 - iArr7[1];
                    if (scrollByInternal(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    GapWorker gapWorker = this.mGapWorker;
                    if (gapWorker != null && (iReleaseHorizontalGlow != 0 || iReleaseVerticalGlow != 0)) {
                        gapWorker.postFromTraversal(this, iReleaseHorizontalGlow, iReleaseVerticalGlow);
                    }
                }
            } else if (actionMasked == 3) {
                cancelScroll();
            } else if (actionMasked == 5) {
                this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                int x7 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.mLastTouchX = x7;
                this.mInitialTouchX = x7;
                int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.mLastTouchY = y10;
                this.mInitialTouchY = y10;
            } else if (actionMasked == 6) {
                onPointerUp(motionEvent);
            }
            motionEventObtain.recycle();
            return true;
        }
        this.mScrollPointerId = motionEvent.getPointerId(0);
        int x10 = (int) (motionEvent.getX() + 0.5f);
        this.mLastTouchX = x10;
        this.mInitialTouchX = x10;
        int y11 = (int) (motionEvent.getY() + 0.5f);
        this.mLastTouchY = y11;
        this.mInitialTouchY = y11;
        if (zCanScrollVertically) {
            i7 = zCanScrollHorizontally;
            i7 = (zCanScrollHorizontally ? 1 : 0) | 2;
        }
        i7 = zCanScrollHorizontally;
        startNestedScroll(i7, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        WeakHashMap weakHashMap = N.f16168a;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z3) {
        this.mDispatchItemsChangedEvent = z3 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo) {
        viewHolder.setFlags(0, UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (this.mState.mTrackOldChangeHolders && viewHolder.isUpdated() && !viewHolder.isRemoved() && !viewHolder.shouldIgnore()) {
            this.mViewInfoStore.addToOldChangeHolders(getChangedHolderKey(viewHolder), viewHolder);
        }
        this.mViewInfoStore.addToPreLayout(viewHolder, itemHolderInfo);
    }

    public void removeAndRecycleViews() {
        ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator != null) {
            itemAnimator.endAnimations();
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.clear();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean zRemoveViewIfHidden = this.mChildHelper.removeViewIfHidden(view);
        if (zRemoveViewIfHidden) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.unscrapView(childViewHolderInt);
            this.mRecycler.recycleViewHolderInternal(childViewHolderInt);
            if (sVerboseLoggingEnabled) {
                Objects.toString(view);
                toString();
            }
        }
        stopInterceptRequestLayout(!zRemoveViewIfHidden);
        return zRemoveViewIfHidden;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z3) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(u.j(this, sb2));
            }
        } else if (sDebugAssertionsEnabled) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            throw new IllegalArgumentException(u.j(this, sb3));
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z3);
    }

    public void removeItemDecoration(@NonNull ItemDecoration itemDecoration) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(itemDecoration);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i7) {
        int itemDecorationCount = getItemDecorationCount();
        if (i7 >= 0 && i7 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i7));
            return;
        }
        throw new IndexOutOfBoundsException(i7 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(@NonNull OnChildAttachStateChangeListener onChildAttachStateChangeListener) {
        List<OnChildAttachStateChangeListener> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(onChildAttachStateChangeListener);
    }

    public void removeOnItemTouchListener(@NonNull OnItemTouchListener onItemTouchListener) {
        this.mOnItemTouchListeners.remove(onItemTouchListener);
        if (this.mInterceptingOnItemTouchListener == onItemTouchListener) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@NonNull OnScrollListener onScrollListener) {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.remove(onScrollListener);
        }
    }

    public void removeRecyclerListener(@NonNull RecyclerListener recyclerListener) {
        this.mRecyclerListeners.remove(recyclerListener);
    }

    public void repositionShadowingViews() {
        ViewHolder viewHolder;
        int childCount = this.mChildHelper.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = this.mChildHelper.getChildAt(i7);
            ViewHolder childViewHolder = getChildViewHolder(childAt);
            if (childViewHolder != null && (viewHolder = childViewHolder.mShadowingHolder) != null) {
                View view = viewHolder.itemView;
                int left = childAt.getLeft();
                int top2 = childAt.getTop();
                if (left != view.getLeft() || top2 != view.getTop()) {
                    view.layout(left, top2, view.getWidth() + left, view.getHeight() + top2);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        int size = this.mOnItemTouchListeners.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.mOnItemTouchListeners.get(i7).onRequestDisallowInterceptTouchEvent(z3);
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i7 = 0; i7 < unfilteredChildCount; i7++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i7));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                throw new IllegalStateException(u.j(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
            }
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i7, int i10) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i7 = 0;
            }
            if (!zCanScrollVertically) {
                i10 = 0;
            }
            scrollByInternal(i7, i10, null, 0);
        }
    }

    public boolean scrollByInternal(int i7, int i10, MotionEvent motionEvent, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i7, i10, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i16 = iArr2[0];
            int i17 = iArr2[1];
            i14 = i7 - i16;
            i15 = i10 - i17;
            i13 = i17;
            i12 = i16;
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i12, i13, i14, i15, this.mScrollOffset, i11, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i18 = iArr4[0];
        int i19 = i14 - i18;
        int i20 = iArr4[1];
        int i21 = i15 - i20;
        boolean z3 = (i18 == 0 && i20 == 0) ? false : true;
        int i22 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i23 = iArr5[0];
        this.mLastTouchX = i22 - i23;
        int i24 = this.mLastTouchY;
        int i25 = iArr5[1];
        this.mLastTouchY = i24 - i25;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i23;
        iArr6[1] = iArr6[1] + i25;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                pullGlows(motionEvent.getX(), i19, motionEvent.getY(), i21);
            }
            considerReleasingGlowsOnScroll(i7, i10);
        }
        if (i12 != 0 || i13 != 0) {
            dispatchOnScrolled(i12, i13);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z3 && i12 == 0 && i13 == 0) ? false : true;
    }

    public void scrollStep(int i7, int i10, @Nullable int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i11 = j.f16100a;
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iScrollHorizontallyBy = i7 != 0 ? this.mLayout.scrollHorizontallyBy(i7, this.mRecycler, this.mState) : 0;
        int iScrollVerticallyBy = i10 != 0 ? this.mLayout.scrollVerticallyBy(i10, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i7, int i10) {
    }

    public void scrollToPosition(int i7) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.scrollToPosition(i7);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(@Nullable RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
        this.mAccessibilityDelegate = recyclerViewAccessibilityDelegate;
        N.q(this, recyclerViewAccessibilityDelegate);
    }

    public void setAdapter(@Nullable Adapter adapter) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@Nullable ChildDrawingOrderCallback childDrawingOrderCallback) {
        if (childDrawingOrderCallback == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = childDrawingOrderCallback;
        setChildrenDrawingOrderEnabled(childDrawingOrderCallback != null);
    }

    @VisibleForTesting
    public boolean setChildImportantForAccessibilityInternal(ViewHolder viewHolder, int i7) {
        if (isComputingLayout()) {
            viewHolder.mPendingAccessibilityState = i7;
            this.mPendingAccessibilityImportanceChange.add(viewHolder);
            return false;
        }
        View view = viewHolder.itemView;
        WeakHashMap weakHashMap = N.f16168a;
        view.setImportantForAccessibility(i7);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z3) {
        if (z3 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z3;
        super.setClipToPadding(z3);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull EdgeEffectFactory edgeEffectFactory) {
        edgeEffectFactory.getClass();
        this.mEdgeEffectFactory = edgeEffectFactory;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z3) {
        this.mHasFixedSize = z3;
    }

    public void setItemAnimator(@Nullable ItemAnimator itemAnimator) {
        ItemAnimator itemAnimator2 = this.mItemAnimator;
        if (itemAnimator2 != null) {
            itemAnimator2.endAnimations();
            this.mItemAnimator.setListener(null);
        }
        this.mItemAnimator = itemAnimator;
        if (itemAnimator != null) {
            itemAnimator.setListener(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i7) {
        this.mRecycler.setViewCacheSize(i7);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z3) {
        suppressLayout(z3);
    }

    public void setLayoutManager(@Nullable LayoutManager layoutManager) {
        if (layoutManager == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            ItemAnimator itemAnimator = this.mItemAnimator;
            if (itemAnimator != null) {
                itemAnimator.endAnimations();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.clear();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.clear();
        }
        this.mChildHelper.removeAllViewsUnfiltered();
        this.mLayout = layoutManager;
        if (layoutManager != null) {
            if (layoutManager.mRecyclerView != null) {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(layoutManager);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(u.j(layoutManager.mRecyclerView, sb2));
            }
            layoutManager.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.updateViewCacheSize();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z3) {
        getScrollingChildHelper().g(z3);
    }

    public void setOnFlingListener(@Nullable OnFlingListener onFlingListener) {
        this.mOnFlingListener = onFlingListener;
    }

    @Deprecated
    public void setOnScrollListener(@Nullable OnScrollListener onScrollListener) {
        this.mScrollListener = onScrollListener;
    }

    public void setPreserveFocusAfterLayout(boolean z3) {
        this.mPreserveFocusAfterLayout = z3;
    }

    public void setRecycledViewPool(@Nullable RecycledViewPool recycledViewPool) {
        this.mRecycler.setRecycledViewPool(recycledViewPool);
    }

    @Deprecated
    public void setRecyclerListener(@Nullable RecyclerListener recyclerListener) {
        this.mRecyclerListener = recyclerListener;
    }

    public void setScrollState(int i7) {
        if (i7 == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            new Exception();
        }
        this.mScrollState = i7;
        if (i7 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i7);
    }

    public void setScrollingTouchSlop(int i7) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i7 != 1) {
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(@Nullable ViewCacheExtension viewCacheExtension) {
        this.mRecycler.setViewCacheExtension(viewCacheExtension);
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    public void smoothScrollBy(@Px int i7, @Px int i10) {
        smoothScrollBy(i7, i10, null);
    }

    public void smoothScrollToPosition(int i7) {
        if (this.mLayoutSuppressed) {
            return;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            layoutManager.smoothScrollToPosition(this, this.mState, i7);
        }
    }

    public void startInterceptRequestLayout() {
        int i7 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i7;
        if (i7 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i7) {
        return getScrollingChildHelper().h(i7, 0);
    }

    public void stopInterceptRequestLayout(boolean z3) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (sDebugAssertionsEnabled) {
                throw new IllegalStateException(u.j(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z3 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z3 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z3) {
        if (z3 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z3) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(@Nullable Adapter adapter, boolean z3) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, true, z3);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i7, int i10, Object obj) {
        int i11;
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        int i12 = i7 + i10;
        for (int i13 = 0; i13 < unfilteredChildCount; i13++) {
            View unfilteredChildAt = this.mChildHelper.getUnfilteredChildAt(i13);
            ViewHolder childViewHolderInt = getChildViewHolderInt(unfilteredChildAt);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i11 = childViewHolderInt.mPosition) >= i7 && i11 < i12) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((LayoutParams) unfilteredChildAt.getLayoutParams()).mInsetsDirty = true;
            }
        }
        this.mRecycler.viewRangeUpdate(i7, i10);
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, I0.a.recyclerViewStyle);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[SYNTHETIC] */
    @Nullable
    public ViewHolder findViewHolderForPosition(int i7, boolean z3) {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        ViewHolder viewHolder = null;
        for (int i10 = 0; i10 < unfilteredChildCount; i10++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i10));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z3) {
                    if (childViewHolderInt.mPosition != i7) {
                        continue;
                    } else {
                        if (this.mChildHelper.isHidden(childViewHolderInt.itemView)) {
                            return childViewHolderInt;
                        }
                        viewHolder = childViewHolderInt;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i7) {
                    continue;
                } else {
                    if (this.mChildHelper.isHidden(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    viewHolder = childViewHolderInt;
                }
            }
        }
        return viewHolder;
    }

    public void onExitLayoutOrScroll(boolean z3) {
        int i7 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i7;
        if (i7 < 1) {
            if (sDebugAssertionsEnabled && i7 < 0) {
                throw new IllegalStateException(u.j(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.mLayoutOrScrollCounter = 0;
            if (z3) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(@Px int i7, @Px int i10, @Nullable Interpolator interpolator) {
        smoothScrollBy(i7, i10, interpolator, Integer.MIN_VALUE);
    }

    @RestrictTo({c.f39800a})
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.recyclerview.widget.RecyclerView.SavedState.1
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
        Parcelable mLayoutState;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.mLayoutState = parcel.readParcelable(classLoader == null ? LayoutManager.class.getClassLoader() : classLoader);
        }

        public void copyFrom(SavedState savedState) {
            this.mLayoutState = savedState.mLayoutState;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeParcelable(this.mLayoutState, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        float fA;
        float fA2;
        super(context, attributeSet, i7);
        this.mObserver = new RecyclerViewDataObserver();
        this.mRecycler = new Recycler();
        this.mViewInfoStore = new ViewInfoStore();
        this.mUpdateChildViewsRunnable = new Runnable() { // from class: androidx.recyclerview.widget.RecyclerView.1
            @Override // java.lang.Runnable
            public void run() {
                RecyclerView recyclerView = RecyclerView.this;
                if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                    return;
                }
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.mIsAttached) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.mLayoutSuppressed) {
                    recyclerView2.mLayoutWasDefered = true;
                } else {
                    recyclerView2.consumePendingUpdateOperations();
                }
            }
        };
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new DefaultItemAnimator();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new ViewFlinger();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new GapWorker.LayoutPrefetchRegistryImpl() : null;
        this.mState = new State();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new ItemAnimatorRestoreListener();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new Runnable() { // from class: androidx.recyclerview.widget.RecyclerView.2
            @Override // java.lang.Runnable
            public void run() {
                ItemAnimator itemAnimator = RecyclerView.this.mItemAnimator;
                if (itemAnimator != null) {
                    itemAnimator.runPendingAnimations();
                }
                RecyclerView.this.mPostedAnimatorRunner = false;
            }
        };
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new ViewInfoStore.ProcessCallback() { // from class: androidx.recyclerview.widget.RecyclerView.4
            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public void processAppeared(ViewHolder viewHolder, ItemAnimator.ItemHolderInfo itemHolderInfo, ItemAnimator.ItemHolderInfo itemHolderInfo2) {
                RecyclerView.this.animateAppearance(viewHolder, itemHolderInfo, itemHolderInfo2);
            }

            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public void processDisappeared(ViewHolder viewHolder, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo, @Nullable ItemAnimator.ItemHolderInfo itemHolderInfo2) {
                RecyclerView.this.mRecycler.unscrapView(viewHolder);
                RecyclerView.this.animateDisappearance(viewHolder, itemHolderInfo, itemHolderInfo2);
            }

            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public void processPersistent(ViewHolder viewHolder, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull ItemAnimator.ItemHolderInfo itemHolderInfo2) {
                viewHolder.setIsRecyclable(false);
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mDataSetHasChangedAfterLayout) {
                    if (recyclerView.mItemAnimator.animateChange(viewHolder, viewHolder, itemHolderInfo, itemHolderInfo2)) {
                        RecyclerView.this.postAnimationRunner();
                    }
                } else if (recyclerView.mItemAnimator.animatePersistence(viewHolder, itemHolderInfo, itemHolderInfo2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            }

            @Override // androidx.recyclerview.widget.ViewInfoStore.ProcessCallback
            public void unused(ViewHolder viewHolder) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.removeAndRecycleView(viewHolder.itemView, recyclerView.mRecycler);
            }
        };
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            Method method = O.f16174a;
            fA = Z.a.c(viewConfiguration);
        } else {
            fA = O.a(viewConfiguration, context);
        }
        this.mScaledHorizontalScrollFactor = fA;
        if (i10 >= 26) {
            fA2 = Z.a.d(viewConfiguration);
        } else {
            fA2 = O.a(viewConfiguration, context);
        }
        this.mScaledVerticalScrollFactor = fA2;
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.setListener(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        WeakHashMap weakHashMap = N.f16168a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.RecyclerView, i7, 0);
        N.p(this, context, d.RecyclerView, attributeSet, typedArrayObtainStyledAttributes, i7, 0);
        String string = typedArrayObtainStyledAttributes.getString(d.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(d.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(CodePushConstants.DOWNLOAD_BUFFER_SIZE);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(d.RecyclerView_android_clipToPadding, true);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(d.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z3;
        if (z3) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(d.RecyclerView_fastScrollVerticalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(d.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(d.RecyclerView_fastScrollHorizontalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(d.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        typedArrayObtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i7, 0);
        int[] iArr = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i7, 0);
        N.p(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i7, 0);
        boolean z8 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z8);
        int i11 = a.f36805a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        setTag(a.f36806b, Boolean.TRUE);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i7, int i10, int[] iArr, int[] iArr2, int i11) {
        return getScrollingChildHelper().c(i7, i10, iArr, iArr2, i11);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i7, int i10, int i11, int i12, int[] iArr, int i13) {
        return getScrollingChildHelper().d(i7, i10, i11, i12, iArr, i13, null);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i7) {
        return getScrollingChildHelper().f(i7);
    }

    public void smoothScrollBy(@Px int i7, @Px int i10, @Nullable Interpolator interpolator, int i11) {
        smoothScrollBy(i7, i10, interpolator, i11, false);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i7, int i10) {
        return getScrollingChildHelper().h(i7, i10);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i7) {
        getScrollingChildHelper().i(i7);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        final Rect mDecorInsets;
        boolean mInsetsDirty;
        boolean mPendingInvalidate;
        ViewHolder mViewHolder;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public int getAbsoluteAdapterPosition() {
            return this.mViewHolder.getAbsoluteAdapterPosition();
        }

        public int getBindingAdapterPosition() {
            return this.mViewHolder.getBindingAdapterPosition();
        }

        @Deprecated
        public int getViewAdapterPosition() {
            return this.mViewHolder.getBindingAdapterPosition();
        }

        public int getViewLayoutPosition() {
            return this.mViewHolder.getLayoutPosition();
        }

        @Deprecated
        public int getViewPosition() {
            return this.mViewHolder.getPosition();
        }

        public boolean isItemChanged() {
            return this.mViewHolder.isUpdated();
        }

        public boolean isItemRemoved() {
            return this.mViewHolder.isRemoved();
        }

        public boolean isViewInvalid() {
            return this.mViewHolder.isInvalid();
        }

        public boolean viewNeedsUpdate() {
            return this.mViewHolder.needsUpdate();
        }

        public LayoutParams(int i7, int i10) {
            super(i7, i10);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }
    }

    public void smoothScrollBy(@Px int i7, @Px int i10, @Nullable Interpolator interpolator, int i11, boolean z3) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!layoutManager.canScrollHorizontally()) {
            i7 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i10 = 0;
        }
        if (i7 == 0 && i10 == 0) {
            return;
        }
        if (i11 != Integer.MIN_VALUE && i11 <= 0) {
            scrollBy(i7, i10);
            return;
        }
        if (z3) {
            int i12 = i7 != 0 ? 1 : 0;
            if (i10 != 0) {
                i12 |= 2;
            }
            startNestedScroll(i12, 1);
        }
        this.mViewFlinger.smoothScrollBy(i7, i10, i11, interpolator);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public final void dispatchNestedScroll(int i7, int i10, int i11, int i12, int[] iArr, int i13, @NonNull int[] iArr2) {
        getScrollingChildHelper().d(i7, i10, i11, i12, iArr, i13, iArr2);
    }

    public void addItemDecoration(@NonNull ItemDecoration itemDecoration) {
        addItemDecoration(itemDecoration, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(u.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
