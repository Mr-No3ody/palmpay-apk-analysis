package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.activity.C0812c;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.menu.MenuBuilder$Callback;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Z0;
import androidx.camera.core.impl.L;
import androidx.core.content.d;
import androidx.core.view.q0;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.drawerlayout.widget.e;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.WindowUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeableDelegate;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Objects;
import p024b9.g;
import p192n.c;
import p241q.a;
import p343x.f;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements MaterialBackHandler {
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    private final DrawerLayout.DrawerListener backDrawerListener;
    private final MaterialBackOrchestrator backOrchestrator;
    private boolean bottomInsetScrimEnabled;

    @Px
    private int drawerLayoutCornerSize;
    private final boolean drawerLayoutCornerSizeBackAnimationEnabled;

    @Px
    private final int drawerLayoutCornerSizeBackAnimationMax;
    private boolean endInsetScrimEnabled;
    OnNavigationItemSelectedListener listener;
    private final int maxWidth;

    @NonNull
    private final NavigationMenu menu;
    private MenuInflater menuInflater;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final NavigationMenuPresenter presenter;
    private final ShapeableDelegate shapeableDelegate;
    private final MaterialSideContainerBackHelper sideContainerBackHelper;
    private boolean startInsetScrimEnabled;
    private final int[] tmpLocation;
    private boolean topInsetScrimEnabled;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_Design_NavigationView;

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem menuItem);
    }

    public NavigationView(@NonNull Context context) {
        this(context, null);
    }

    @Nullable
    private ColorStateList createDefaultColorStateList(int i7) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i7, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListC = d.c(typedValue.resourceId, getContext());
        if (!getContext().getTheme().resolveAttribute(a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i10 = typedValue.data;
        int defaultColor = colorStateListC.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListC.getColorForState(iArr, defaultColor), i10, defaultColor});
    }

    @NonNull
    private Drawable createDefaultItemBackground(@NonNull Z0 z3) {
        return createDefaultItemDrawable(z3, MaterialResources.getColorStateList(getContext(), z3, com.google.android.material.R.styleable.NavigationView_itemShapeFillColor));
    }

    @NonNull
    private Drawable createDefaultItemDrawable(@NonNull Z0 z3, @Nullable ColorStateList colorStateList) {
        int resourceId = z3.f12863b.getResourceId(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance, 0);
        int i7 = com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay;
        TypedArray typedArray = z3.f12863b;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), resourceId, typedArray.getResourceId(i7, 0)).build());
        materialShapeDrawable.setFillColor(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetStart, 0), typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetTop, 0), typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetEnd, 0), typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new f(getContext());
        }
        return this.menuInflater;
    }

    private boolean hasShapeAppearance(@NonNull Z0 z3) {
        if (z3.f12863b.hasValue(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance)) {
            return true;
        }
        return z3.f12863b.hasValue(com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatchDraw$0(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeClearCornerSizeAnimationForDrawerLayout() {
        if (!this.drawerLayoutCornerSizeBackAnimationEnabled || this.drawerLayoutCornerSize == 0) {
            return;
        }
        this.drawerLayoutCornerSize = 0;
        maybeUpdateCornerSizeForDrawerLayout(getWidth(), getHeight());
    }

    private void maybeUpdateCornerSizeForDrawerLayout(@Px int i7, @Px int i10) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.LayoutParams)) {
            if ((this.drawerLayoutCornerSize > 0 || this.drawerLayoutCornerSizeBackAnimationEnabled) && (getBackground() instanceof MaterialShapeDrawable)) {
                boolean z3 = Gravity.getAbsoluteGravity(((DrawerLayout.LayoutParams) getLayoutParams()).f16818a, getLayoutDirection()) == 3;
                MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
                ShapeAppearanceModel.Builder allCornerSizes = materialShapeDrawable.getShapeAppearanceModel().toBuilder().setAllCornerSizes(this.drawerLayoutCornerSize);
                if (z3) {
                    allCornerSizes.setTopLeftCornerSize(0.0f);
                    allCornerSizes.setBottomLeftCornerSize(0.0f);
                } else {
                    allCornerSizes.setTopRightCornerSize(0.0f);
                    allCornerSizes.setBottomRightCornerSize(0.0f);
                }
                ShapeAppearanceModel shapeAppearanceModelBuild = allCornerSizes.build();
                materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModelBuild);
                this.shapeableDelegate.onShapeAppearanceChanged(this, shapeAppearanceModelBuild);
                this.shapeableDelegate.onMaskChanged(this, new RectF(0.0f, 0.0f, i7, i10));
                this.shapeableDelegate.setOffsetZeroCornerEdgeBoundsEnabled(this, true);
            }
        }
    }

    @CanIgnoreReturnValue
    private Pair<DrawerLayout, DrawerLayout.LayoutParams> requireDrawerLayoutParent() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.LayoutParams)) {
            return new Pair<>((DrawerLayout) parent, (DrawerLayout.LayoutParams) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    private void setupInsetScrimsListener() {
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.navigation.NavigationView.3
            /* JADX WARN: Code duplicated, block: B:22:0x005a  */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                boolean z3;
                NavigationView navigationView = NavigationView.this;
                navigationView.getLocationOnScreen(navigationView.tmpLocation);
                boolean z8 = true;
                boolean z10 = NavigationView.this.tmpLocation[1] == 0;
                NavigationView.this.presenter.setBehindStatusBar(z10);
                NavigationView navigationView2 = NavigationView.this;
                navigationView2.setDrawTopInsetForeground(z10 && navigationView2.isTopInsetScrimEnabled());
                boolean z11 = NavigationView.this.getLayoutDirection() == 1;
                if (NavigationView.this.tmpLocation[0] != 0) {
                    if (NavigationView.this.getWidth() + NavigationView.this.tmpLocation[0] == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    z3 = true;
                }
                NavigationView navigationView3 = NavigationView.this;
                navigationView3.setDrawLeftInsetForeground(z3 && (!z11 ? !navigationView3.isStartInsetScrimEnabled() : !navigationView3.isEndInsetScrimEnabled()));
                Activity activity = ContextUtils.getActivity(NavigationView.this.getContext());
                if (activity != null) {
                    Rect currentWindowBounds = WindowUtils.getCurrentWindowBounds(activity);
                    boolean z12 = currentWindowBounds.height() - NavigationView.this.getHeight() == NavigationView.this.tmpLocation[1];
                    boolean z13 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
                    NavigationView navigationView4 = NavigationView.this;
                    navigationView4.setDrawBottomInsetForeground(z12 && z13 && navigationView4.isBottomInsetScrimEnabled());
                    boolean z14 = currentWindowBounds.width() == NavigationView.this.tmpLocation[0] || currentWindowBounds.width() - NavigationView.this.getWidth() == NavigationView.this.tmpLocation[0];
                    NavigationView navigationView5 = NavigationView.this;
                    if (!z14 || (!z11 ? !navigationView5.isEndInsetScrimEnabled() : !navigationView5.isStartInsetScrimEnabled())) {
                        z8 = false;
                    }
                    navigationView5.setDrawRightInsetForeground(z8);
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public void addHeaderView(@NonNull View view) {
        this.presenter.addHeaderView(view);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.cancelBackProgress();
        maybeClearCornerSizeAnimationForDrawerLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        this.shapeableDelegate.maybeClip(canvas, new L(this, 24));
    }

    @VisibleForTesting
    public MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    @Nullable
    public MenuItem getCheckedItem() {
        return this.presenter.getCheckedItem();
    }

    @Px
    public int getDividerInsetEnd() {
        return this.presenter.getDividerInsetEnd();
    }

    @Px
    public int getDividerInsetStart() {
        return this.presenter.getDividerInsetStart();
    }

    public int getHeaderCount() {
        return this.presenter.getHeaderCount();
    }

    public View getHeaderView(int i7) {
        return this.presenter.getHeaderView(i7);
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.presenter.getItemBackground();
    }

    @Dimension
    public int getItemHorizontalPadding() {
        return this.presenter.getItemHorizontalPadding();
    }

    @Dimension
    public int getItemIconPadding() {
        return this.presenter.getItemIconPadding();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.presenter.getItemTintList();
    }

    public int getItemMaxLines() {
        return this.presenter.getItemMaxLines();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.presenter.getItemTextColor();
    }

    @Px
    public int getItemVerticalPadding() {
        return this.presenter.getItemVerticalPadding();
    }

    @NonNull
    public Menu getMenu() {
        return this.menu;
    }

    @Px
    public int getSubheaderInsetEnd() {
        return this.presenter.getSubheaderInsetEnd();
    }

    @Px
    public int getSubheaderInsetStart() {
        return this.presenter.getSubheaderInsetStart();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        Pair<DrawerLayout, DrawerLayout.LayoutParams> pairRequireDrawerLayoutParent = requireDrawerLayoutParent();
        DrawerLayout drawerLayout = (DrawerLayout) pairRequireDrawerLayoutParent.first;
        C0812c c0812cOnHandleBackInvoked = this.sideContainerBackHelper.onHandleBackInvoked();
        if (c0812cOnHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.closeDrawer(this);
            return;
        }
        this.sideContainerBackHelper.finishBackProgress(c0812cOnHandleBackInvoked, ((DrawerLayout.LayoutParams) pairRequireDrawerLayoutParent.second).f16818a, DrawerLayoutUtils.getScrimCloseAnimatorListener(drawerLayout, this), DrawerLayoutUtils.getScrimCloseAnimatorUpdateListener(drawerLayout));
    }

    public View inflateHeaderView(@LayoutRes int i7) {
        return this.presenter.inflateHeaderView(i7);
    }

    public void inflateMenu(int i7) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i7, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(false);
    }

    public boolean isBottomInsetScrimEnabled() {
        return this.bottomInsetScrimEnabled;
    }

    public boolean isEndInsetScrimEnabled() {
        return this.endInsetScrimEnabled;
    }

    public boolean isStartInsetScrimEnabled() {
        return this.startInsetScrimEnabled;
    }

    public boolean isTopInsetScrimEnabled() {
        return this.topInsetScrimEnabled;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        ViewParent parent = getParent();
        if ((parent instanceof DrawerLayout) && this.backOrchestrator.shouldListenForBackCallbacks()) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            drawerLayout.removeDrawerListener(this.backDrawerListener);
            drawerLayout.addDrawerListener(this.backDrawerListener);
            if (drawerLayout.isDrawerOpen(this)) {
                this.backOrchestrator.startListeningForBackCallbacksWithPriorityOverlay();
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            ((DrawerLayout) parent).removeDrawerListener(this.backDrawerListener);
        }
        this.backOrchestrator.stopListeningForBackCallbacks();
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    @RestrictTo({c.f39801b})
    public void onInsetsChanged(@NonNull q0 q0Var) {
        this.presenter.dispatchApplyWindowInsets(q0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        int mode = View.MeasureSpec.getMode(i7);
        if (mode == Integer.MIN_VALUE) {
            i7 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), this.maxWidth), 1073741824);
        } else if (mode == 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(this.maxWidth, 1073741824);
        }
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuState);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        maybeUpdateCornerSizeForDrawerLayout(i7, i10);
    }

    public void removeHeaderView(@NonNull View view) {
        this.presenter.removeHeaderView(view);
    }

    public void setBottomInsetScrimEnabled(boolean z3) {
        this.bottomInsetScrimEnabled = z3;
    }

    public void setCheckedItem(@IdRes int i7) {
        MenuItem menuItemFindItem = this.menu.findItem(i7);
        if (menuItemFindItem != null) {
            this.presenter.setCheckedItem((m) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(@Px int i7) {
        this.presenter.setDividerInsetEnd(i7);
    }

    public void setDividerInsetStart(@Px int i7) {
        this.presenter.setDividerInsetStart(i7);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        MaterialShapeUtils.setElevation(this, f10);
    }

    public void setEndInsetScrimEnabled(boolean z3) {
        this.endInsetScrimEnabled = z3;
    }

    @RestrictTo({c.f39801b})
    @VisibleForTesting
    public void setForceCompatClippingEnabled(boolean z3) {
        this.shapeableDelegate.setForceCompatClippingEnabled(this, z3);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.presenter.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i7) {
        setItemBackground(getContext().getDrawable(i7));
    }

    public void setItemHorizontalPadding(@Dimension int i7) {
        this.presenter.setItemHorizontalPadding(i7);
    }

    public void setItemHorizontalPaddingResource(@DimenRes int i7) {
        this.presenter.setItemHorizontalPadding(getResources().getDimensionPixelSize(i7));
    }

    public void setItemIconPadding(@Dimension int i7) {
        this.presenter.setItemIconPadding(i7);
    }

    public void setItemIconPaddingResource(int i7) {
        this.presenter.setItemIconPadding(getResources().getDimensionPixelSize(i7));
    }

    public void setItemIconSize(@Dimension int i7) {
        this.presenter.setItemIconSize(i7);
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.presenter.setItemIconTintList(colorStateList);
    }

    public void setItemMaxLines(int i7) {
        this.presenter.setItemMaxLines(i7);
    }

    public void setItemTextAppearance(@StyleRes int i7) {
        this.presenter.setItemTextAppearance(i7);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z3) {
        this.presenter.setItemTextAppearanceActiveBoldEnabled(z3);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.presenter.setItemTextColor(colorStateList);
    }

    public void setItemVerticalPadding(@Px int i7) {
        this.presenter.setItemVerticalPadding(i7);
    }

    public void setItemVerticalPaddingResource(@DimenRes int i7) {
        this.presenter.setItemVerticalPadding(getResources().getDimensionPixelSize(i7));
    }

    public void setNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.listener = onNavigationItemSelectedListener;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i7) {
        super.setOverScrollMode(i7);
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(i7);
        }
    }

    public void setStartInsetScrimEnabled(boolean z3) {
        this.startInsetScrimEnabled = z3;
    }

    public void setSubheaderInsetEnd(@Px int i7) {
        this.presenter.setSubheaderInsetEnd(i7);
    }

    public void setSubheaderInsetStart(@Px int i7) {
        this.presenter.setSubheaderInsetStart(i7);
    }

    public void setTopInsetScrimEnabled(boolean z3) {
        this.topInsetScrimEnabled = z3;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull C0812c c0812c) {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.startBackProgress(c0812c);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull C0812c c0812c) {
        this.sideContainerBackHelper.updateBackProgress(c0812c, ((DrawerLayout.LayoutParams) requireDrawerLayoutParent().second).f16818a);
        if (this.drawerLayoutCornerSizeBackAnimationEnabled) {
            this.drawerLayoutCornerSize = AnimationUtils.lerp(0, this.drawerLayoutCornerSizeBackAnimationMax, this.sideContainerBackHelper.interpolateProgress(c0812c.f12022c));
            maybeUpdateCornerSizeForDrawerLayout(getWidth(), getHeight());
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationView.SavedState.1
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
                return new SavedState(parcel, null);
            }
        };

        @Nullable
        public Bundle menuState;

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeBundle(this.menuState);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.navigationViewStyle);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x017c A[PHI: r15
      0x017c: PHI (r15v2 android.graphics.drawable.Drawable) = 
      (r15v1 android.graphics.drawable.Drawable)
      (r15v1 android.graphics.drawable.Drawable)
      (r15v4 android.graphics.drawable.Drawable)
     binds: [B:50:0x0155, B:52:0x015b, B:54:0x0167] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        ColorStateList colorStateListCreateDefaultColorStateList;
        int i10;
        int i11 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i7, i11), attributeSet, i7);
        NavigationMenuPresenter navigationMenuPresenter = new NavigationMenuPresenter();
        this.presenter = navigationMenuPresenter;
        this.tmpLocation = new int[2];
        this.topInsetScrimEnabled = true;
        this.bottomInsetScrimEnabled = true;
        this.startInsetScrimEnabled = true;
        this.endInsetScrimEnabled = true;
        this.drawerLayoutCornerSize = 0;
        this.shapeableDelegate = ShapeableDelegate.create(this);
        this.sideContainerBackHelper = new MaterialSideContainerBackHelper(this);
        this.backOrchestrator = new MaterialBackOrchestrator(this);
        this.backDrawerListener = new e() { // from class: com.google.android.material.navigation.NavigationView.1
            @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
            public void onDrawerClosed(@NonNull View view) {
                NavigationView navigationView = NavigationView.this;
                if (view == navigationView) {
                    navigationView.backOrchestrator.stopListeningForBackCallbacks();
                    NavigationView.this.maybeClearCornerSizeAnimationForDrawerLayout();
                }
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
            public void onDrawerOpened(@NonNull View view) {
                NavigationView navigationView = NavigationView.this;
                if (view == navigationView) {
                    MaterialBackOrchestrator materialBackOrchestrator = navigationView.backOrchestrator;
                    Objects.requireNonNull(materialBackOrchestrator);
                    view.post(new g(materialBackOrchestrator, 21));
                }
            }
        };
        Context context2 = getContext();
        NavigationMenu navigationMenu = new NavigationMenu(context2);
        this.menu = navigationMenu;
        Z0 z0ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.NavigationView, i7, i11, new int[0]);
        if (z0ObtainTintedStyledAttributes.f12863b.hasValue(com.google.android.material.R.styleable.NavigationView_android_background)) {
            setBackground(z0ObtainTintedStyledAttributes.b(com.google.android.material.R.styleable.NavigationView_android_background));
        }
        int i12 = com.google.android.material.R.styleable.NavigationView_drawerLayoutCornerSize;
        TypedArray typedArray = z0ObtainTintedStyledAttributes.f12863b;
        int dimensionPixelSize = typedArray.getDimensionPixelSize(i12, 0);
        this.drawerLayoutCornerSize = dimensionPixelSize;
        this.drawerLayoutCornerSizeBackAnimationEnabled = dimensionPixelSize == 0;
        this.drawerLayoutCornerSizeBackAnimationMax = getResources().getDimensionPixelSize(com.google.android.material.R.dimen.m3_navigation_drawer_layout_corner_size);
        Drawable background = getBackground();
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(background);
        if (background == null || colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i7, i11).build());
            if (colorStateListOrNull != null) {
                materialShapeDrawable.setFillColor(colorStateListOrNull);
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            setBackground(materialShapeDrawable);
        }
        if (typedArray.hasValue(com.google.android.material.R.styleable.NavigationView_elevation)) {
            setElevation(typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_elevation, 0));
        }
        setFitsSystemWindows(typedArray.getBoolean(com.google.android.material.R.styleable.NavigationView_android_fitsSystemWindows, false));
        this.maxWidth = typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_android_maxWidth, 0);
        ColorStateList colorStateListA = typedArray.hasValue(com.google.android.material.R.styleable.NavigationView_subheaderColor) ? z0ObtainTintedStyledAttributes.a(com.google.android.material.R.styleable.NavigationView_subheaderColor) : null;
        int resourceId = typedArray.hasValue(com.google.android.material.R.styleable.NavigationView_subheaderTextAppearance) ? typedArray.getResourceId(com.google.android.material.R.styleable.NavigationView_subheaderTextAppearance, 0) : 0;
        if (resourceId == 0 && colorStateListA == null) {
            colorStateListA = createDefaultColorStateList(R.attr.textColorSecondary);
        }
        if (typedArray.hasValue(com.google.android.material.R.styleable.NavigationView_itemIconTint)) {
            colorStateListCreateDefaultColorStateList = z0ObtainTintedStyledAttributes.a(com.google.android.material.R.styleable.NavigationView_itemIconTint);
        } else {
            colorStateListCreateDefaultColorStateList = createDefaultColorStateList(R.attr.textColorSecondary);
        }
        int resourceId2 = typedArray.hasValue(com.google.android.material.R.styleable.NavigationView_itemTextAppearance) ? typedArray.getResourceId(com.google.android.material.R.styleable.NavigationView_itemTextAppearance, 0) : 0;
        boolean z3 = typedArray.getBoolean(com.google.android.material.R.styleable.NavigationView_itemTextAppearanceActiveBoldEnabled, true);
        if (typedArray.hasValue(com.google.android.material.R.styleable.NavigationView_itemIconSize)) {
            setItemIconSize(typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemIconSize, 0));
        }
        ColorStateList colorStateListA2 = typedArray.hasValue(com.google.android.material.R.styleable.NavigationView_itemTextColor) ? z0ObtainTintedStyledAttributes.a(com.google.android.material.R.styleable.NavigationView_itemTextColor) : null;
        if (resourceId2 == 0 && colorStateListA2 == null) {
            colorStateListA2 = createDefaultColorStateList(R.attr.textColorPrimary);
        }
        Drawable drawableB = z0ObtainTintedStyledAttributes.b(com.google.android.material.R.styleable.NavigationView_itemBackground);
        if (drawableB == null && hasShapeAppearance(z0ObtainTintedStyledAttributes)) {
            drawableB = createDefaultItemBackground(z0ObtainTintedStyledAttributes);
            ColorStateList colorStateList = MaterialResources.getColorStateList(context2, z0ObtainTintedStyledAttributes, com.google.android.material.R.styleable.NavigationView_itemRippleColor);
            if (colorStateList != null) {
                navigationMenuPresenter.setItemForeground(new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(colorStateList), null, createDefaultItemDrawable(z0ObtainTintedStyledAttributes, null)));
            }
        }
        if (typedArray.hasValue(com.google.android.material.R.styleable.NavigationView_itemHorizontalPadding)) {
            setItemHorizontalPadding(typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemHorizontalPadding, 0));
        }
        if (typedArray.hasValue(com.google.android.material.R.styleable.NavigationView_itemVerticalPadding)) {
            i10 = 0;
            setItemVerticalPadding(typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemVerticalPadding, 0));
        } else {
            i10 = 0;
        }
        setDividerInsetStart(typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_dividerInsetStart, i10));
        setDividerInsetEnd(typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_dividerInsetEnd, i10));
        setSubheaderInsetStart(typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_subheaderInsetStart, i10));
        setSubheaderInsetEnd(typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_subheaderInsetEnd, i10));
        setTopInsetScrimEnabled(typedArray.getBoolean(com.google.android.material.R.styleable.NavigationView_topInsetScrimEnabled, this.topInsetScrimEnabled));
        setBottomInsetScrimEnabled(typedArray.getBoolean(com.google.android.material.R.styleable.NavigationView_bottomInsetScrimEnabled, this.bottomInsetScrimEnabled));
        setStartInsetScrimEnabled(typedArray.getBoolean(com.google.android.material.R.styleable.NavigationView_startInsetScrimEnabled, this.startInsetScrimEnabled));
        setEndInsetScrimEnabled(typedArray.getBoolean(com.google.android.material.R.styleable.NavigationView_endInsetScrimEnabled, this.endInsetScrimEnabled));
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(com.google.android.material.R.styleable.NavigationView_itemIconPadding, 0);
        setItemMaxLines(typedArray.getInt(com.google.android.material.R.styleable.NavigationView_itemMaxLines, 1));
        navigationMenu.setCallback(new MenuBuilder$Callback() { // from class: com.google.android.material.navigation.NavigationView.2
            @Override // androidx.appcompat.view.menu.MenuBuilder$Callback
            public boolean onMenuItemSelected(k kVar, MenuItem menuItem) {
                OnNavigationItemSelectedListener onNavigationItemSelectedListener = NavigationView.this.listener;
                return onNavigationItemSelectedListener != null && onNavigationItemSelectedListener.onNavigationItemSelected(menuItem);
            }

            @Override // androidx.appcompat.view.menu.MenuBuilder$Callback
            public void onMenuModeChange(k kVar) {
            }
        });
        navigationMenuPresenter.setId(1);
        navigationMenuPresenter.initForMenu(context2, navigationMenu);
        if (resourceId != 0) {
            navigationMenuPresenter.setSubheaderTextAppearance(resourceId);
        }
        navigationMenuPresenter.setSubheaderColor(colorStateListA);
        navigationMenuPresenter.setItemIconTintList(colorStateListCreateDefaultColorStateList);
        navigationMenuPresenter.setOverScrollMode(getOverScrollMode());
        if (resourceId2 != 0) {
            navigationMenuPresenter.setItemTextAppearance(resourceId2);
        }
        navigationMenuPresenter.setItemTextAppearanceActiveBoldEnabled(z3);
        navigationMenuPresenter.setItemTextColor(colorStateListA2);
        navigationMenuPresenter.setItemBackground(drawableB);
        navigationMenuPresenter.setItemIconPadding(dimensionPixelSize2);
        navigationMenu.addMenuPresenter(navigationMenuPresenter);
        addView((View) navigationMenuPresenter.getMenuView(this));
        if (typedArray.hasValue(com.google.android.material.R.styleable.NavigationView_menu)) {
            inflateMenu(typedArray.getResourceId(com.google.android.material.R.styleable.NavigationView_menu, 0));
        }
        if (typedArray.hasValue(com.google.android.material.R.styleable.NavigationView_headerLayout)) {
            inflateHeaderView(typedArray.getResourceId(com.google.android.material.R.styleable.NavigationView_headerLayout, 0));
        }
        z0ObtainTintedStyledAttributes.g();
        setupInsetScrimsListener();
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem menuItemFindItem = this.menu.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.presenter.setCheckedItem((m) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
