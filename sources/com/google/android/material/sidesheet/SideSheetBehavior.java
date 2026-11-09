package com.google.android.material.sidesheet;

import C0.G;
import Nc.v;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.C0812c;
import androidx.annotation.GravityInt;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.F;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.E;
import androidx.core.view.N;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.f;
import androidx.customview.widget.g;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.microsoft.codepush.react.CodePushConstants;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;
import p074f0.h;

/* JADX INFO: loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements Sheet<SideSheetCallback> {
    private static final int DEFAULT_ACCESSIBILITY_PANE_TITLE = R.string.side_sheet_accessibility_pane_title;
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_SideSheet;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int NO_MAX_SIZE = -1;
    static final int SIGNIFICANT_VEL_THRESHOLD = 500;

    @Nullable
    private ColorStateList backgroundTint;

    @NonNull
    private final Set<SideSheetCallback> callbacks;
    private int childWidth;

    @IdRes
    private int coplanarSiblingViewId;

    @Nullable
    private WeakReference<View> coplanarSiblingViewRef;
    private final f dragCallback;
    private boolean draggable;
    private float elevation;
    private float hideFriction;
    private boolean ignoreEvents;
    private int initialX;
    private int innerMargin;
    private int lastStableState;

    @Nullable
    private MaterialShapeDrawable materialShapeDrawable;
    private float maximumVelocity;
    private int parentInnerEdge;
    private int parentWidth;
    private ShapeAppearanceModel shapeAppearanceModel;
    private SheetDelegate sheetDelegate;

    @Nullable
    private MaterialSideContainerBackHelper sideContainerBackHelper;
    private int state;
    private final SideSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;

    @Nullable
    private VelocityTracker velocityTracker;

    @Nullable
    private g viewDragHelper;

    @Nullable
    private WeakReference<V> viewRef;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.SavedState.1
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        };
        final int state;

        public SavedState(@NonNull Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.state);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, @NonNull SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.state = ((SideSheetBehavior) sideSheetBehavior).state;
        }
    }

    public class StateSettlingTracker {
        private final Runnable continueSettlingRunnable = new Runnable() { // from class: com.google.android.material.sidesheet.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f22575a.lambda$new$0();
            }
        };
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;

        public StateSettlingTracker() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0() {
            this.isContinueSettlingRunnablePosted = false;
            if (SideSheetBehavior.this.viewDragHelper != null && SideSheetBehavior.this.viewDragHelper.h()) {
                continueSettlingToState(this.targetState);
            } else if (SideSheetBehavior.this.state == 2) {
                SideSheetBehavior.this.setStateInternal(this.targetState);
            }
        }

        public void continueSettlingToState(int i7) {
            if (SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() == null) {
                return;
            }
            this.targetState = i7;
            if (this.isContinueSettlingRunnablePosted) {
                return;
            }
            ((View) SideSheetBehavior.this.viewRef.get()).postOnAnimation(this.continueSettlingRunnable);
            this.isContinueSettlingRunnablePosted = true;
        }
    }

    public SideSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.stateSettlingTracker = new StateSettlingTracker();
        this.draggable = true;
        this.state = 5;
        this.lastStableState = 5;
        this.hideFriction = HIDE_FRICTION;
        this.coplanarSiblingViewId = -1;
        this.callbacks = new LinkedHashSet();
        this.dragCallback = new f() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // androidx.customview.widget.f
            public int clampViewPositionHorizontal(@NonNull View view, int i7, int i10) {
                return p118hf.a.m(i7, SideSheetBehavior.this.sheetDelegate.getMinViewPositionHorizontal(), SideSheetBehavior.this.sheetDelegate.getMaxViewPositionHorizontal());
            }

            @Override // androidx.customview.widget.f
            public int clampViewPositionVertical(@NonNull View view, int i7, int i10) {
                return view.getTop();
            }

            @Override // androidx.customview.widget.f
            public int getViewHorizontalDragRange(@NonNull View view) {
                return SideSheetBehavior.this.getInnerMargin() + SideSheetBehavior.this.childWidth;
            }

            @Override // androidx.customview.widget.f
            public void onViewDragStateChanged(int i7) {
                if (i7 == 1 && SideSheetBehavior.this.draggable) {
                    SideSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.f
            public void onViewPositionChanged(@NonNull View view, int i7, int i10, int i11, int i12) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View coplanarSiblingView = SideSheetBehavior.this.getCoplanarSiblingView();
                if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                    SideSheetBehavior.this.sheetDelegate.updateCoplanarSiblingLayoutParams(marginLayoutParams, view.getLeft(), view.getRight());
                    coplanarSiblingView.setLayoutParams(marginLayoutParams);
                }
                SideSheetBehavior.this.dispatchOnSlide(view, i7);
            }

            @Override // androidx.customview.widget.f
            public void onViewReleased(@NonNull View view, float f10, float f11) {
                int iCalculateTargetStateOnViewReleased = SideSheetBehavior.this.calculateTargetStateOnViewReleased(view, f10, f11);
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                sideSheetBehavior.startSettling(view, iCalculateTargetStateOnViewReleased, sideSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.f
            public boolean tryCaptureView(@NonNull View view, int i7) {
                return (SideSheetBehavior.this.state == 1 || SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() != view) ? false : true;
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SideSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_backgroundTint)) {
            this.backgroundTint = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.SideSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.shapeAppearanceModel = ShapeAppearanceModel.builder(context, attributeSet, 0, DEF_STYLE_RES).build();
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            setCoplanarSiblingViewId(typedArrayObtainStyledAttributes.getResourceId(R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId, -1));
        }
        createMaterialShapeDrawableIfNeeded(context);
        this.elevation = typedArrayObtainStyledAttributes.getDimension(R.styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        setDraggable(typedArrayObtainStyledAttributes.getBoolean(R.styleable.SideSheetBehavior_Layout_behavior_draggable, true));
        typedArrayObtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private int calculateCurrentOffset(int i7, V v3) {
        int i10 = this.state;
        if (i10 == 1 || i10 == 2) {
            return i7 - this.sheetDelegate.getOuterEdge(v3);
        }
        if (i10 == 3) {
            return 0;
        }
        if (i10 == 5) {
            return this.sheetDelegate.getHiddenOffset();
        }
        throw new IllegalStateException("Unexpected value: " + this.state);
    }

    private float calculateDragDistance(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int calculateTargetStateOnViewReleased(@NonNull View view, float f10, float f11) {
        if (isExpandingOutwards(f10)) {
            return 3;
        }
        if (shouldHide(view, f10)) {
            return (this.sheetDelegate.isSwipeSignificant(f10, f11) || this.sheetDelegate.isReleasedCloseToInnerEdge(view)) ? 5 : 3;
        }
        if (f10 != 0.0f && SheetUtils.isSwipeMostlyHorizontal(f10, f11)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - getExpandedOffset()) < Math.abs(left - this.sheetDelegate.getHiddenOffset()) ? 3 : 5;
    }

    private void clearCoplanarSiblingView() {
        WeakReference<View> weakReference = this.coplanarSiblingViewRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.coplanarSiblingViewRef = null;
    }

    private AccessibilityViewCommand createAccessibilityViewCommandForState(int i7) {
        return new v(this, i7);
    }

    private void createMaterialShapeDrawableIfNeeded(@NonNull Context context) {
        if (this.shapeAppearanceModel == null) {
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModel);
        this.materialShapeDrawable = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(context);
        ColorStateList colorStateList = this.backgroundTint;
        if (colorStateList != null) {
            this.materialShapeDrawable.setFillColor(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
        this.materialShapeDrawable.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchOnSlide(@NonNull View view, int i7) {
        if (this.callbacks.isEmpty()) {
            return;
        }
        float fCalculateSlideOffset = this.sheetDelegate.calculateSlideOffset(i7);
        Iterator<SideSheetCallback> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().onSlide(view, fCalculateSlideOffset);
        }
    }

    private void ensureAccessibilityPaneTitleIsSet(View view) {
        if (N.f(view) == null) {
            N.r(view, view.getResources().getString(DEFAULT_ACCESSIBILITY_PANE_TITLE));
        }
    }

    @NonNull
    public static <V extends View> SideSheetBehavior<V> from(@NonNull V v3) {
        ViewGroup.LayoutParams layoutParams = v3.getLayoutParams();
        if (!(layoutParams instanceof androidx.coordinatorlayout.widget.c)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.c) layoutParams).f15872a;
        if (behavior instanceof SideSheetBehavior) {
            return (SideSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
    }

    private int getChildMeasureSpec(int i7, int i10, int i11, int i12) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i10, i12);
        if (i11 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i11), 1073741824);
        }
        if (size != 0) {
            i11 = Math.min(size, i11);
        }
        return View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    @Nullable
    private ValueAnimator.AnimatorUpdateListener getCoplanarFinishAnimatorUpdateListener() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View coplanarSiblingView = getCoplanarSiblingView();
        if (coplanarSiblingView == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
            return null;
        }
        final int coplanarSiblingAdjacentMargin = this.sheetDelegate.getCoplanarSiblingAdjacentMargin(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.sidesheet.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f22571a.lambda$getCoplanarFinishAnimatorUpdateListener$1(marginLayoutParams, coplanarSiblingAdjacentMargin, coplanarSiblingView, valueAnimator);
            }
        };
    }

    @GravityInt
    private int getGravityFromSheetEdge() {
        SheetDelegate sheetDelegate = this.sheetDelegate;
        return (sheetDelegate == null || sheetDelegate.getSheetEdge() == 0) ? 5 : 3;
    }

    @Nullable
    private androidx.coordinatorlayout.widget.c getViewLayoutParams() {
        V v3;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v3 = weakReference.get()) == null || !(v3.getLayoutParams() instanceof androidx.coordinatorlayout.widget.c)) {
            return null;
        }
        return (androidx.coordinatorlayout.widget.c) v3.getLayoutParams();
    }

    private boolean hasLeftMargin() {
        androidx.coordinatorlayout.widget.c viewLayoutParams = getViewLayoutParams();
        return viewLayoutParams != null && ((ViewGroup.MarginLayoutParams) viewLayoutParams).leftMargin > 0;
    }

    private boolean hasRightMargin() {
        androidx.coordinatorlayout.widget.c viewLayoutParams = getViewLayoutParams();
        return viewLayoutParams != null && ((ViewGroup.MarginLayoutParams) viewLayoutParams).rightMargin > 0;
    }

    private boolean isDraggedFarEnough(@NonNull MotionEvent motionEvent) {
        return shouldHandleDraggingWithHelper() && calculateDragDistance((float) this.initialX, motionEvent.getX()) > ((float) this.viewDragHelper.f16392b);
    }

    private boolean isExpandingOutwards(float f10) {
        return this.sheetDelegate.isExpandingOutwards(f10);
    }

    private boolean isLayingOut(@NonNull V v3) {
        ViewParent parent = v3.getParent();
        return parent != null && parent.isLayoutRequested() && v3.isAttachedToWindow();
    }

    private boolean isSettling(View view, int i7, boolean z3) {
        int outerEdgeOffsetForState = getOuterEdgeOffsetForState(i7);
        g viewDragHelper = getViewDragHelper();
        if (viewDragHelper == null) {
            return false;
        }
        if (z3) {
            return viewDragHelper.t(outerEdgeOffsetForState, view.getTop());
        }
        return viewDragHelper.v(view, outerEdgeOffsetForState, view.getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$createAccessibilityViewCommandForState$2(int i7, View view, h hVar) {
        setState(i7);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getCoplanarFinishAnimatorUpdateListener$1(ViewGroup.MarginLayoutParams marginLayoutParams, int i7, View view, ValueAnimator valueAnimator) {
        this.sheetDelegate.updateCoplanarSiblingAdjacentMargin(marginLayoutParams, AnimationUtils.lerp(i7, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setState$0(int i7) {
        V v3 = this.viewRef.get();
        if (v3 != null) {
            startSettling(v3, i7, false);
        }
    }

    private void maybeAssignCoplanarSiblingViewBasedId(@NonNull CoordinatorLayout coordinatorLayout) {
        int i7;
        View viewFindViewById;
        if (this.coplanarSiblingViewRef != null || (i7 = this.coplanarSiblingViewId) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i7)) == null) {
            return;
        }
        this.coplanarSiblingViewRef = new WeakReference<>(viewFindViewById);
    }

    private void replaceAccessibilityActionForState(V v3, p074f0.c cVar, int i7) {
        N.o(v3, cVar, null, createAccessibilityViewCommandForState(i7));
    }

    private void resetVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void runAfterLayout(@NonNull V v3, Runnable runnable) {
        if (isLayingOut(v3)) {
            v3.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void setSheetEdge(@NonNull V v3, int i7) {
        setSheetEdge(Gravity.getAbsoluteGravity(((androidx.coordinatorlayout.widget.c) v3.getLayoutParams()).f15874c, i7) == 3 ? 1 : 0);
    }

    private boolean shouldHandleDraggingWithHelper() {
        if (this.viewDragHelper != null) {
            return this.draggable || this.state == 1;
        }
        return false;
    }

    private boolean shouldInterceptTouchEvent(@NonNull V v3) {
        return (v3.isShown() || N.f(v3) != null) && this.draggable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSettling(View view, int i7, boolean z3) {
        if (!isSettling(view, i7, z3)) {
            setStateInternal(i7);
        } else {
            setStateInternal(2);
            this.stateSettlingTracker.continueSettlingToState(i7);
        }
    }

    private void updateAccessibilityActions() {
        V v3;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v3 = weakReference.get()) == null) {
            return;
        }
        N.n(CodePushConstants.DOWNLOAD_BUFFER_SIZE, v3);
        N.k(0, v3);
        N.n(1048576, v3);
        N.k(0, v3);
        if (this.state != 5) {
            replaceAccessibilityActionForState(v3, p074f0.c.f36351m, 5);
        }
        if (this.state != 3) {
            replaceAccessibilityActionForState(v3, p074f0.c.f36349k, 3);
        }
    }

    private void updateCoplanarSiblingBackProgress() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v3 = this.viewRef.get();
        View coplanarSiblingView = getCoplanarSiblingView();
        if (coplanarSiblingView == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
            return;
        }
        this.sheetDelegate.updateCoplanarSiblingAdjacentMargin(marginLayoutParams, (int) ((v3.getScaleX() * this.childWidth) + this.innerMargin));
        coplanarSiblingView.requestLayout();
    }

    private void updateMaterialShapeDrawable(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    private void updateSheetVisibility(@NonNull View view) {
        int i7 = this.state == 5 ? 4 : 0;
        if (view.getVisibility() != i7) {
            view.setVisibility(i7);
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.cancelBackProgress();
    }

    public void expand() {
        setState(3);
    }

    @Nullable
    @VisibleForTesting
    public MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    public int getChildWidth() {
        return this.childWidth;
    }

    @Nullable
    public View getCoplanarSiblingView() {
        WeakReference<View> weakReference = this.coplanarSiblingViewRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getExpandedOffset() {
        return this.sheetDelegate.getExpandedOffset();
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    public float getHideThreshold() {
        return HIDE_THRESHOLD;
    }

    public int getInnerMargin() {
        return this.innerMargin;
    }

    @RestrictTo({p192n.c.f39801b})
    public int getLastStableState() {
        return this.lastStableState;
    }

    public int getOuterEdgeOffsetForState(int i7) {
        if (i7 == 3) {
            return getExpandedOffset();
        }
        if (i7 == 5) {
            return this.sheetDelegate.getHiddenOffset();
        }
        throw new IllegalArgumentException(G.m(i7, "Invalid state to get outer edge offset: "));
    }

    public int getParentInnerEdge() {
        return this.parentInnerEdge;
    }

    public int getParentWidth() {
        return this.parentWidth;
    }

    public int getSignificantVelocityThreshold() {
        return 500;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public int getState() {
        return this.state;
    }

    @Nullable
    public g getViewDragHelper() {
        return this.viewDragHelper;
    }

    public float getXVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getXVelocity();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        C0812c c0812cOnHandleBackInvoked = materialSideContainerBackHelper.onHandleBackInvoked();
        if (c0812cOnHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            setState(5);
        } else {
            this.sideContainerBackHelper.finishBackProgress(c0812cOnHandleBackInvoked, getGravityFromSheetEdge(), new AnimatorListenerAdapter() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    SideSheetBehavior.this.setStateInternal(5);
                    if (SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() == null) {
                        return;
                    }
                    ((View) SideSheetBehavior.this.viewRef.get()).requestLayout();
                }
            }, getCoplanarFinishAnimatorUpdateListener());
        }
    }

    public void hide() {
        setState(5);
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(@NonNull androidx.coordinatorlayout.widget.c cVar) {
        super.onAttachedToLayoutParams(cVar);
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
        this.sideContainerBackHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull MotionEvent motionEvent) {
        g gVar;
        if (!shouldInterceptTouchEvent(v3)) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetVelocity();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.initialX = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.ignoreEvents) {
            this.ignoreEvents = false;
            return false;
        }
        return (this.ignoreEvents || (gVar = this.viewDragHelper) == null || !gVar.u(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, int i7) {
        if (coordinatorLayout.getFitsSystemWindows() && !v3.getFitsSystemWindows()) {
            v3.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.viewRef = new WeakReference<>(v3);
            this.sideContainerBackHelper = new MaterialSideContainerBackHelper(v3);
            MaterialShapeDrawable materialShapeDrawable = this.materialShapeDrawable;
            if (materialShapeDrawable != null) {
                v3.setBackground(materialShapeDrawable);
                MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
                float elevation = this.elevation;
                if (elevation == -1.0f) {
                    elevation = v3.getElevation();
                }
                materialShapeDrawable2.setElevation(elevation);
            } else {
                ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = N.f16168a;
                    E.j(v3, colorStateList);
                }
            }
            updateSheetVisibility(v3);
            updateAccessibilityActions();
            if (v3.getImportantForAccessibility() == 0) {
                v3.setImportantForAccessibility(1);
            }
            ensureAccessibilityPaneTitleIsSet(v3);
        }
        setSheetEdge(v3, i7);
        if (this.viewDragHelper == null) {
            this.viewDragHelper = new g(coordinatorLayout.getContext(), coordinatorLayout, this.dragCallback);
        }
        int outerEdge = this.sheetDelegate.getOuterEdge(v3);
        coordinatorLayout.onLayoutChild(v3, i7);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentInnerEdge = this.sheetDelegate.getParentInnerEdge(coordinatorLayout);
        this.childWidth = v3.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v3.getLayoutParams();
        this.innerMargin = marginLayoutParams != null ? this.sheetDelegate.calculateInnerMargin(marginLayoutParams) : 0;
        int iCalculateCurrentOffset = calculateCurrentOffset(outerEdge, v3);
        WeakHashMap weakHashMap2 = N.f16168a;
        v3.offsetLeftAndRight(iCalculateCurrentOffset);
        maybeAssignCoplanarSiblingViewBasedId(coordinatorLayout);
        for (SideSheetCallback sideSheetCallback : this.callbacks) {
            if (sideSheetCallback instanceof SideSheetCallback) {
                sideSheetCallback.onLayout(v3);
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, int i7, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v3.getLayoutParams();
        v3.measure(getChildMeasureSpec(i7, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, -1, marginLayoutParams.width), getChildMeasureSpec(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, -1, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.getSuperState() != null) {
            super.onRestoreInstanceState(coordinatorLayout, v3, savedState.getSuperState());
        }
        int i7 = savedState.state;
        if (i7 == 1 || i7 == 2) {
            i7 = 5;
        }
        this.state = i7;
        this.lastStableState = i7;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v3), (SideSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v3, @NonNull MotionEvent motionEvent) {
        if (!v3.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.viewDragHelper.n(motionEvent);
        }
        if (actionMasked == 0) {
            resetVelocity();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents && isDraggedFarEnough(motionEvent)) {
            this.viewDragHelper.c(motionEvent.getPointerId(motionEvent.getActionIndex()), v3);
        }
        return !this.ignoreEvents;
    }

    public void setCoplanarSiblingView(@Nullable View view) {
        this.coplanarSiblingViewId = -1;
        if (view == null) {
            clearCoplanarSiblingView();
            return;
        }
        this.coplanarSiblingViewRef = new WeakReference<>(view);
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            V v3 = weakReference.get();
            if (v3.isLaidOut()) {
                v3.requestLayout();
            }
        }
    }

    public void setCoplanarSiblingViewId(@IdRes int i7) {
        this.coplanarSiblingViewId = i7;
        clearCoplanarSiblingView();
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            V v3 = weakReference.get();
            if (i7 == -1 || !v3.isLaidOut()) {
                return;
            }
            v3.requestLayout();
        }
    }

    public void setDraggable(boolean z3) {
        this.draggable = z3;
    }

    public void setHideFriction(float f10) {
        this.hideFriction = f10;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void setState(int i7) {
        if (i7 == 1 || i7 == 2) {
            throw new IllegalArgumentException(G.r(new StringBuilder("STATE_"), i7 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            setStateInternal(i7);
        } else {
            runAfterLayout(this.viewRef.get(), new B3.a(this, i7, 13));
        }
    }

    public void setStateInternal(int i7) {
        V v3;
        if (this.state == i7) {
            return;
        }
        this.state = i7;
        if (i7 == 3 || i7 == 5) {
            this.lastStableState = i7;
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v3 = weakReference.get()) == null) {
            return;
        }
        updateSheetVisibility(v3);
        Iterator<SideSheetCallback> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(v3, i7);
        }
        updateAccessibilityActions();
    }

    public boolean shouldHide(@NonNull View view, float f10) {
        return this.sheetDelegate.shouldHide(view, f10);
    }

    @RestrictTo({p192n.c.f39801b})
    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull C0812c c0812c) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.startBackProgress(c0812c);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull C0812c c0812c) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.sideContainerBackHelper;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.updateBackProgress(c0812c, getGravityFromSheetEdge());
        updateCoplanarSiblingBackProgress();
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void addCallback(@NonNull SideSheetCallback sideSheetCallback) {
        this.callbacks.add(sideSheetCallback);
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public void removeCallback(@NonNull SideSheetCallback sideSheetCallback) {
        this.callbacks.remove(sideSheetCallback);
    }

    private void setSheetEdge(int i7) {
        SheetDelegate sheetDelegate = this.sheetDelegate;
        if (sheetDelegate == null || sheetDelegate.getSheetEdge() != i7) {
            if (i7 == 0) {
                this.sheetDelegate = new RightSheetDelegate(this);
                if (this.shapeAppearanceModel == null || hasRightMargin()) {
                    return;
                }
                ShapeAppearanceModel.Builder builder = this.shapeAppearanceModel.toBuilder();
                builder.setTopRightCornerSize(0.0f).setBottomRightCornerSize(0.0f);
                updateMaterialShapeDrawable(builder.build());
                return;
            }
            if (i7 == 1) {
                this.sheetDelegate = new LeftSheetDelegate(this);
                if (this.shapeAppearanceModel == null || hasLeftMargin()) {
                    return;
                }
                ShapeAppearanceModel.Builder builder2 = this.shapeAppearanceModel.toBuilder();
                builder2.setTopLeftCornerSize(0.0f).setBottomLeftCornerSize(0.0f);
                updateMaterialShapeDrawable(builder2.build());
                return;
            }
            throw new IllegalArgumentException(F.c(i7, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
        }
    }

    public SideSheetBehavior() {
        this.stateSettlingTracker = new StateSettlingTracker();
        this.draggable = true;
        this.state = 5;
        this.lastStableState = 5;
        this.hideFriction = HIDE_FRICTION;
        this.coplanarSiblingViewId = -1;
        this.callbacks = new LinkedHashSet();
        this.dragCallback = new f() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // androidx.customview.widget.f
            public int clampViewPositionHorizontal(@NonNull View view, int i7, int i10) {
                return p118hf.a.m(i7, SideSheetBehavior.this.sheetDelegate.getMinViewPositionHorizontal(), SideSheetBehavior.this.sheetDelegate.getMaxViewPositionHorizontal());
            }

            @Override // androidx.customview.widget.f
            public int clampViewPositionVertical(@NonNull View view, int i7, int i10) {
                return view.getTop();
            }

            @Override // androidx.customview.widget.f
            public int getViewHorizontalDragRange(@NonNull View view) {
                return SideSheetBehavior.this.getInnerMargin() + SideSheetBehavior.this.childWidth;
            }

            @Override // androidx.customview.widget.f
            public void onViewDragStateChanged(int i7) {
                if (i7 == 1 && SideSheetBehavior.this.draggable) {
                    SideSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // androidx.customview.widget.f
            public void onViewPositionChanged(@NonNull View view, int i7, int i10, int i11, int i12) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View coplanarSiblingView = SideSheetBehavior.this.getCoplanarSiblingView();
                if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
                    SideSheetBehavior.this.sheetDelegate.updateCoplanarSiblingLayoutParams(marginLayoutParams, view.getLeft(), view.getRight());
                    coplanarSiblingView.setLayoutParams(marginLayoutParams);
                }
                SideSheetBehavior.this.dispatchOnSlide(view, i7);
            }

            @Override // androidx.customview.widget.f
            public void onViewReleased(@NonNull View view, float f10, float f11) {
                int iCalculateTargetStateOnViewReleased = SideSheetBehavior.this.calculateTargetStateOnViewReleased(view, f10, f11);
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                sideSheetBehavior.startSettling(view, iCalculateTargetStateOnViewReleased, sideSheetBehavior.shouldSkipSmoothAnimation());
            }

            @Override // androidx.customview.widget.f
            public boolean tryCaptureView(@NonNull View view, int i7) {
                return (SideSheetBehavior.this.state == 1 || SideSheetBehavior.this.viewRef == null || SideSheetBehavior.this.viewRef.get() != view) ? false : true;
            }
        };
    }
}
