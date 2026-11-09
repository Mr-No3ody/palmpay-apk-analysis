package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuBuilder$Callback;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.Z0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p192n.c;
import p343x.f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NavigationBarView extends FrameLayout {
    public static final int ACTIVE_INDICATOR_WIDTH_MATCH_PARENT = -1;
    public static final int ACTIVE_INDICATOR_WIDTH_WRAP_CONTENT = -2;
    public static final int ITEM_GRAVITY_CENTER = 17;
    public static final int ITEM_GRAVITY_START_CENTER = 8388627;
    public static final int ITEM_GRAVITY_TOP_CENTER = 49;
    public static final int ITEM_ICON_GRAVITY_START = 1;
    public static final int ITEM_ICON_GRAVITY_TOP = 0;
    public static final int LABEL_VISIBILITY_AUTO = -1;
    public static final int LABEL_VISIBILITY_LABELED = 1;
    public static final int LABEL_VISIBILITY_SELECTED = 0;
    public static final int LABEL_VISIBILITY_UNLABELED = 2;
    private static final int MENU_PRESENTER_ID = 1;

    @NonNull
    private final NavigationBarMenu menu;
    private MenuInflater menuInflater;

    @NonNull
    private final NavigationBarMenuView menuView;

    @NonNull
    private final NavigationBarPresenter presenter;
    private OnItemReselectedListener reselectedListener;
    private OnItemSelectedListener selectedListener;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({c.f39801b})
    public @interface ItemGravity {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({c.f39801b})
    public @interface ItemIconGravity {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({c.f39801b})
    public @interface LabelVisibility {
    }

    public interface OnItemReselectedListener {
        void onNavigationItemReselected(@NonNull MenuItem menuItem);
    }

    public interface OnItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem menuItem);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationBarView.SavedState.1
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
        Bundle menuPresenterState;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void readFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
            this.menuPresenterState = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeBundle(this.menuPresenterState);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readFromParcel(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0213  */
    public NavigationBarView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i7, @StyleRes int i10) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i7, i10), attributeSet, i7);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.presenter = navigationBarPresenter;
        Context context2 = getContext();
        Z0 z0ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.NavigationBarView, i7, i10, R.styleable.NavigationBarView_itemTextAppearanceInactive, R.styleable.NavigationBarView_itemTextAppearanceActive);
        NavigationBarMenu navigationBarMenu = new NavigationBarMenu(context2, getClass(), getMaxItemCount(), isSubMenuSupported());
        this.menu = navigationBarMenu;
        NavigationBarMenuView navigationBarMenuViewCreateNavigationBarMenuView = createNavigationBarMenuView(context2);
        this.menuView = navigationBarMenuViewCreateNavigationBarMenuView;
        navigationBarMenuViewCreateNavigationBarMenuView.setMinimumHeight(getSuggestedMinimumHeight());
        navigationBarMenuViewCreateNavigationBarMenuView.setCollapsedMaxItemCount(getCollapsedMaxItemCount());
        navigationBarPresenter.setMenuView(navigationBarMenuViewCreateNavigationBarMenuView);
        navigationBarPresenter.setId(1);
        navigationBarMenuViewCreateNavigationBarMenuView.setPresenter(navigationBarPresenter);
        navigationBarMenu.addMenuPresenter(navigationBarPresenter);
        navigationBarPresenter.initForMenu(getContext(), navigationBarMenu);
        if (z0ObtainTintedStyledAttributes.f12863b.hasValue(R.styleable.NavigationBarView_itemIconTint)) {
            navigationBarMenuViewCreateNavigationBarMenuView.setIconTintList(z0ObtainTintedStyledAttributes.a(R.styleable.NavigationBarView_itemIconTint));
        } else {
            navigationBarMenuViewCreateNavigationBarMenuView.setIconTintList(navigationBarMenuViewCreateNavigationBarMenuView.createDefaultColorStateList(android.R.attr.textColorSecondary));
        }
        int i11 = R.styleable.NavigationBarView_itemIconSize;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size);
        TypedArray typedArray = z0ObtainTintedStyledAttributes.f12863b;
        setItemIconSize(typedArray.getDimensionPixelSize(i11, dimensionPixelSize));
        if (typedArray.hasValue(R.styleable.NavigationBarView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(R.styleable.NavigationBarView_itemTextAppearanceInactive, 0));
        }
        if (typedArray.hasValue(R.styleable.NavigationBarView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(typedArray.getResourceId(R.styleable.NavigationBarView_itemTextAppearanceActive, 0));
        }
        if (typedArray.hasValue(R.styleable.NavigationBarView_horizontalItemTextAppearanceInactive)) {
            setHorizontalItemTextAppearanceInactive(typedArray.getResourceId(R.styleable.NavigationBarView_horizontalItemTextAppearanceInactive, 0));
        }
        if (typedArray.hasValue(R.styleable.NavigationBarView_horizontalItemTextAppearanceActive)) {
            setHorizontalItemTextAppearanceActive(typedArray.getResourceId(R.styleable.NavigationBarView_horizontalItemTextAppearanceActive, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(R.styleable.NavigationBarView_itemTextAppearanceActiveBoldEnabled, true));
        if (typedArray.hasValue(R.styleable.NavigationBarView_itemTextColor)) {
            setItemTextColor(z0ObtainTintedStyledAttributes.a(R.styleable.NavigationBarView_itemTextColor));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(background);
        if (background == null || colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i7, i10).build());
            if (colorStateListOrNull != null) {
                materialShapeDrawable.setFillColor(colorStateListOrNull);
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            setBackground(materialShapeDrawable);
        }
        if (typedArray.hasValue(R.styleable.NavigationBarView_itemPaddingTop)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(R.styleable.NavigationBarView_itemPaddingTop, 0));
        }
        if (typedArray.hasValue(R.styleable.NavigationBarView_itemPaddingBottom)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(R.styleable.NavigationBarView_itemPaddingBottom, 0));
        }
        if (typedArray.hasValue(R.styleable.NavigationBarView_activeIndicatorLabelPadding)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(R.styleable.NavigationBarView_activeIndicatorLabelPadding, 0));
        }
        if (typedArray.hasValue(R.styleable.NavigationBarView_iconLabelHorizontalSpacing)) {
            setIconLabelHorizontalSpacing(typedArray.getDimensionPixelSize(R.styleable.NavigationBarView_iconLabelHorizontalSpacing, 0));
        }
        if (typedArray.hasValue(R.styleable.NavigationBarView_elevation)) {
            setElevation(typedArray.getDimensionPixelSize(R.styleable.NavigationBarView_elevation, 0));
        }
        getBackground().mutate().setTintList(MaterialResources.getColorStateList(context2, z0ObtainTintedStyledAttributes, R.styleable.NavigationBarView_backgroundTint));
        int dimensionPixelSize2 = -1;
        setLabelVisibilityMode(typedArray.getInteger(R.styleable.NavigationBarView_labelVisibilityMode, -1));
        setItemIconGravity(typedArray.getInteger(R.styleable.NavigationBarView_itemIconGravity, 0));
        setItemGravity(typedArray.getInteger(R.styleable.NavigationBarView_itemGravity, 49));
        int resourceId = typedArray.getResourceId(R.styleable.NavigationBarView_itemBackground, 0);
        if (resourceId != 0) {
            navigationBarMenuViewCreateNavigationBarMenuView.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(MaterialResources.getColorStateList(context2, z0ObtainTintedStyledAttributes, R.styleable.NavigationBarView_itemRippleColor));
        }
        setMeasureBottomPaddingFromLabelBaseline(typedArray.getBoolean(R.styleable.NavigationBarView_measureBottomPaddingFromLabelBaseline, true));
        setLabelFontScalingEnabled(typedArray.getBoolean(R.styleable.NavigationBarView_labelFontScalingEnabled, false));
        setLabelMaxLines(typedArray.getInteger(R.styleable.NavigationBarView_labelMaxLines, 1));
        int resourceId2 = typedArray.getResourceId(R.styleable.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, R.styleable.NavigationBarActiveIndicator);
            int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarActiveIndicator_android_width, 0);
            setItemActiveIndicatorWidth(dimensionPixelSize3);
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarActiveIndicator_android_height, 0));
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_marginHorizontal, 0);
            setItemActiveIndicatorMarginHorizontal(dimensionPixelOffset);
            String string = typedArrayObtainStyledAttributes.getString(R.styleable.NavigationBarActiveIndicator_expandedWidth);
            if (string == null) {
                dimensionPixelSize2 = -2;
            } else if (!String.valueOf(-1).equals(string)) {
                if (String.valueOf(-2).equals(string)) {
                    dimensionPixelSize2 = -2;
                } else {
                    dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarActiveIndicator_expandedWidth, -2);
                }
            }
            setItemActiveIndicatorExpandedWidth(dimensionPixelSize2);
            setItemActiveIndicatorExpandedHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarActiveIndicator_expandedHeight, dimensionPixelSize3));
            setItemActiveIndicatorExpandedMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_expandedMarginHorizontal, dimensionPixelOffset));
            int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.m3_navigation_item_leading_trailing_space);
            int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingStart, dimensionPixelSize4);
            int dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingEnd, dimensionPixelSize4);
            setItemActiveIndicatorExpandedPadding(getLayoutDirection() == 1 ? dimensionPixelOffset3 : dimensionPixelOffset2, typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingTop, 0), getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2, typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingBottom, 0));
            setItemActiveIndicatorColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, R.styleable.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel.builder(context2, typedArrayObtainStyledAttributes.getResourceId(R.styleable.NavigationBarActiveIndicator_shapeAppearance, 0), 0).build());
            typedArrayObtainStyledAttributes.recycle();
        }
        if (typedArray.hasValue(R.styleable.NavigationBarView_menu)) {
            inflateMenu(typedArray.getResourceId(R.styleable.NavigationBarView_menu, 0));
        }
        z0ObtainTintedStyledAttributes.g();
        if (!shouldAddMenuView()) {
            addView(navigationBarMenuViewCreateNavigationBarMenuView);
        }
        navigationBarMenu.setCallback(new MenuBuilder$Callback() { // from class: com.google.android.material.navigation.NavigationBarView.1
            @Override // androidx.appcompat.view.menu.MenuBuilder$Callback
            public boolean onMenuItemSelected(k kVar, @NonNull MenuItem menuItem) {
                if (NavigationBarView.this.reselectedListener == null || menuItem.getItemId() != NavigationBarView.this.getSelectedItemId()) {
                    return (NavigationBarView.this.selectedListener == null || NavigationBarView.this.selectedListener.onNavigationItemSelected(menuItem)) ? false : true;
                }
                NavigationBarView.this.reselectedListener.onNavigationItemReselected(menuItem);
                return true;
            }

            @Override // androidx.appcompat.view.menu.MenuBuilder$Callback
            public void onMenuModeChange(k kVar) {
            }
        });
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new f(getContext());
        }
        return this.menuInflater;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z3) {
        this.menuView.setMeasurePaddingFromLabelBaseline(z3);
    }

    @NonNull
    @RestrictTo({c.f39801b})
    public abstract NavigationBarMenuView createNavigationBarMenuView(@NonNull Context context);

    @Px
    public int getActiveIndicatorLabelPadding() {
        return this.menuView.getActiveIndicatorLabelPadding();
    }

    @Nullable
    public BadgeDrawable getBadge(int i7) {
        return this.menuView.getBadge(i7);
    }

    @RestrictTo({c.f39801b})
    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    @StyleRes
    public int getHorizontalItemTextAppearanceActive() {
        return this.menuView.getHorizontalItemTextAppearanceActive();
    }

    @StyleRes
    public int getHorizontalItemTextAppearanceInactive() {
        return this.menuView.getHorizontalItemTextAppearanceInactive();
    }

    @Px
    public int getIconLabelHorizontalSpacing() {
        return this.menuView.getIconLabelHorizontalSpacing();
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.menuView.getItemActiveIndicatorColor();
    }

    @Px
    public int getItemActiveIndicatorExpandedHeight() {
        return this.menuView.getItemActiveIndicatorExpandedHeight();
    }

    @Px
    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.menuView.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    @Px
    public int getItemActiveIndicatorExpandedWidth() {
        return this.menuView.getItemActiveIndicatorExpandedWidth();
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.menuView.getItemActiveIndicatorHeight();
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.menuView.getItemActiveIndicatorMarginHorizontal();
    }

    @Nullable
    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.menuView.getItemActiveIndicatorShapeAppearance();
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.menuView.getItemActiveIndicatorWidth();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.menuView.getItemBackground();
    }

    @DrawableRes
    @Deprecated
    public int getItemBackgroundResource() {
        return this.menuView.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.menuView.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.menuView.getItemIconGravity();
    }

    @Dimension
    public int getItemIconSize() {
        return this.menuView.getItemIconSize();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.menuView.getIconTintList();
    }

    @Px
    public int getItemPaddingBottom() {
        return this.menuView.getItemPaddingBottom();
    }

    @Px
    public int getItemPaddingTop() {
        return this.menuView.getItemPaddingTop();
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.menuView.getItemRippleColor();
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.menuView.getItemTextAppearanceActive();
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.menuView.getItemTextAppearanceInactive();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.menuView.getItemTextColor();
    }

    public int getLabelMaxLines(int i7) {
        return this.menuView.getLabelMaxLines();
    }

    public int getLabelVisibilityMode() {
        return this.menuView.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @NonNull
    public Menu getMenu() {
        return this.menu;
    }

    @NonNull
    @RestrictTo({c.f39801b})
    public MenuView getMenuView() {
        return this.menuView;
    }

    @NonNull
    public ViewGroup getMenuViewGroup() {
        return this.menuView;
    }

    @NonNull
    public BadgeDrawable getOrCreateBadge(int i7) {
        return this.menuView.getOrCreateBadge(i7);
    }

    @NonNull
    @RestrictTo({c.f39801b})
    public NavigationBarPresenter getPresenter() {
        return this.presenter;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.menuView.getScaleLabelTextWithFont();
    }

    @IdRes
    public int getSelectedItemId() {
        return this.menuView.getSelectedItemId();
    }

    public void inflateMenu(int i7) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i7, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(true);
    }

    public boolean isItemActiveIndicatorEnabled() {
        return this.menuView.getItemActiveIndicatorEnabled();
    }

    public boolean isSubMenuSupported() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuPresenterState);
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuPresenterState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    public void removeBadge(int i7) {
        this.menuView.removeBadge(i7);
    }

    public void setActiveIndicatorLabelPadding(@Px int i7) {
        this.menuView.setActiveIndicatorLabelPadding(i7);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        MaterialShapeUtils.setElevation(this, f10);
    }

    public void setHorizontalItemTextAppearanceActive(@StyleRes int i7) {
        this.menuView.setHorizontalItemTextAppearanceActive(i7);
    }

    public void setHorizontalItemTextAppearanceInactive(@StyleRes int i7) {
        this.menuView.setHorizontalItemTextAppearanceInactive(i7);
    }

    public void setIconLabelHorizontalSpacing(@Px int i7) {
        this.menuView.setIconLabelHorizontalSpacing(i7);
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.menuView.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z3) {
        this.menuView.setItemActiveIndicatorEnabled(z3);
    }

    public void setItemActiveIndicatorExpandedHeight(@Px int i7) {
        this.menuView.setItemActiveIndicatorExpandedHeight(i7);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(@Px int i7) {
        this.menuView.setItemActiveIndicatorExpandedMarginHorizontal(i7);
    }

    public void setItemActiveIndicatorExpandedPadding(@Px int i7, @Px int i10, @Px int i11, @Px int i12) {
        this.menuView.setItemActiveIndicatorExpandedPadding(i7, i10, i11, i12);
    }

    public void setItemActiveIndicatorExpandedWidth(@Px int i7) {
        this.menuView.setItemActiveIndicatorExpandedWidth(i7);
    }

    public void setItemActiveIndicatorHeight(@Px int i7) {
        this.menuView.setItemActiveIndicatorHeight(i7);
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int i7) {
        this.menuView.setItemActiveIndicatorMarginHorizontal(i7);
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.menuView.setItemActiveIndicatorShapeAppearance(shapeAppearanceModel);
    }

    public void setItemActiveIndicatorWidth(@Px int i7) {
        this.menuView.setItemActiveIndicatorWidth(i7);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.menuView.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i7) {
        this.menuView.setItemBackgroundRes(i7);
    }

    public void setItemGravity(int i7) {
        if (this.menuView.getItemGravity() != i7) {
            this.menuView.setItemGravity(i7);
            this.presenter.updateMenuView(false);
        }
    }

    public void setItemIconGravity(int i7) {
        if (this.menuView.getItemIconGravity() != i7) {
            this.menuView.setItemIconGravity(i7);
            this.presenter.updateMenuView(false);
        }
    }

    public void setItemIconSize(@Dimension int i7) {
        this.menuView.setItemIconSize(i7);
    }

    public void setItemIconSizeRes(@DimenRes int i7) {
        setItemIconSize(getResources().getDimensionPixelSize(i7));
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.menuView.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int i7, @Nullable View.OnTouchListener onTouchListener) {
        this.menuView.setItemOnTouchListener(i7, onTouchListener);
    }

    public void setItemPaddingBottom(@Px int i7) {
        this.menuView.setItemPaddingBottom(i7);
    }

    public void setItemPaddingTop(@Px int i7) {
        this.menuView.setItemPaddingTop(i7);
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.menuView.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(@StyleRes int i7) {
        this.menuView.setItemTextAppearanceActive(i7);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z3) {
        this.menuView.setItemTextAppearanceActiveBoldEnabled(z3);
    }

    public void setItemTextAppearanceInactive(@StyleRes int i7) {
        this.menuView.setItemTextAppearanceInactive(i7);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.menuView.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z3) {
        this.menuView.setLabelFontScalingEnabled(z3);
    }

    public void setLabelMaxLines(int i7) {
        this.menuView.setLabelMaxLines(i7);
    }

    public void setLabelVisibilityMode(int i7) {
        if (this.menuView.getLabelVisibilityMode() != i7) {
            this.menuView.setLabelVisibilityMode(i7);
            this.presenter.updateMenuView(false);
        }
    }

    public void setOnItemReselectedListener(@Nullable OnItemReselectedListener onItemReselectedListener) {
        this.reselectedListener = onItemReselectedListener;
    }

    public void setOnItemSelectedListener(@Nullable OnItemSelectedListener onItemSelectedListener) {
        this.selectedListener = onItemSelectedListener;
    }

    public void setSelectedItemId(@IdRes int i7) {
        MenuItem menuItemFindItem = this.menu.findItem(i7);
        if (menuItemFindItem != null) {
            boolean zPerformItemAction = this.menu.performItemAction(menuItemFindItem, this.presenter, 0);
            if (menuItemFindItem.isCheckable()) {
                if (!zPerformItemAction || menuItemFindItem.isChecked()) {
                    this.menuView.setCheckedItem(menuItemFindItem);
                }
            }
        }
    }

    @RestrictTo({c.f39801b})
    public boolean shouldAddMenuView() {
        return false;
    }
}
