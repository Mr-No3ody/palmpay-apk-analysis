package com.google.android.material.navigation;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.camera.video.u;
import androidx.core.content.d;
import androidx.core.util.Pools$Pool;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionSet;
import androidx.transition.X;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.TextScale;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.HashSet;
import p058e0.b;
import p192n.c;
import p241q.a;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public abstract class NavigationBarMenuView extends ViewGroup implements MenuView {
    private static final int DEFAULT_COLLAPSED_MAX_COUNT = 7;
    private static final int NO_PADDING = -1;
    private static final int NO_SELECTED_ITEM = -1;

    @NonNull
    private final SparseArray<BadgeDrawable> badgeDrawables;

    @Nullable
    private NavigationBarMenuItemView[] buttons;
    private MenuItem checkedItem;
    private int collapsedMaxItemCount;
    private boolean dividersEnabled;
    private boolean expanded;

    @StyleRes
    private int horizontalItemTextAppearanceActive;

    @StyleRes
    private int horizontalItemTextAppearanceInactive;
    private int iconLabelHorizontalSpacing;
    private ColorStateList itemActiveIndicatorColor;
    private boolean itemActiveIndicatorEnabled;
    private int itemActiveIndicatorExpandedHeight;
    private int itemActiveIndicatorExpandedMarginHorizontal;
    private final Rect itemActiveIndicatorExpandedPadding;
    private int itemActiveIndicatorExpandedWidth;
    private int itemActiveIndicatorHeight;
    private int itemActiveIndicatorLabelPadding;
    private int itemActiveIndicatorMarginHorizontal;
    private boolean itemActiveIndicatorResizeable;
    private ShapeAppearanceModel itemActiveIndicatorShapeAppearance;
    private int itemActiveIndicatorWidth;
    private Drawable itemBackground;
    private int itemBackgroundRes;
    private int itemGravity;
    private int itemIconGravity;

    @Dimension
    private int itemIconSize;

    @Nullable
    private ColorStateList itemIconTint;
    private int itemPaddingBottom;
    private int itemPaddingTop;

    @Nullable
    private Pools$Pool<NavigationBarItemView> itemPool;
    private int itemPoolSize;

    @Nullable
    private ColorStateList itemRippleColor;

    @StyleRes
    private int itemTextAppearanceActive;
    private boolean itemTextAppearanceActiveBoldEnabled;

    @StyleRes
    private int itemTextAppearanceInactive;

    @Nullable
    private final ColorStateList itemTextColorDefault;
    private ColorStateList itemTextColorFromUser;
    private int labelMaxLines;
    private int labelVisibilityMode;
    private boolean measurePaddingFromLabelBaseline;
    private NavigationBarMenuBuilder menu;

    @NonNull
    private final View.OnClickListener onClickListener;

    @NonNull
    private final SparseArray<View.OnTouchListener> onTouchListeners;
    private NavigationBarPresenter presenter;
    private boolean scaleLabelWithFont;
    private int selectedItemId;
    private int selectedItemPosition;

    @Nullable
    private final TransitionSet set;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] DISABLED_STATE_SET = {-16842910};

    public NavigationBarMenuView(@NonNull Context context) {
        super(context);
        this.onTouchListeners = new SparseArray<>();
        this.selectedItemId = -1;
        this.selectedItemPosition = -1;
        this.badgeDrawables = new SparseArray<>();
        this.itemPaddingTop = -1;
        this.itemPaddingBottom = -1;
        this.itemActiveIndicatorLabelPadding = -1;
        this.iconLabelHorizontalSpacing = -1;
        this.itemGravity = 49;
        this.itemActiveIndicatorResizeable = false;
        this.labelMaxLines = 1;
        this.itemPoolSize = 0;
        this.checkedItem = null;
        this.collapsedMaxItemCount = 7;
        this.dividersEnabled = false;
        this.itemActiveIndicatorExpandedPadding = new Rect();
        this.itemTextColorDefault = createDefaultColorStateList(R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.set = null;
        } else {
            AutoTransition autoTransition = new AutoTransition();
            this.set = autoTransition;
            autoTransition.k(0);
            autoTransition.excludeTarget(TextView.class, true);
            autoTransition.i(MotionUtils.resolveThemeDuration(getContext(), com.google.android.material.R.attr.motionDurationMedium4, getResources().getInteger(com.google.android.material.R.integer.material_motion_duration_long_1)));
            autoTransition.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), com.google.android.material.R.attr.motionEasingStandard, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            autoTransition.f(new TextScale());
        }
        this.onClickListener = new View.OnClickListener() { // from class: com.google.android.material.navigation.NavigationBarMenuView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                m itemData = ((NavigationBarItemView) view).getItemData();
                boolean zPerformItemAction = NavigationBarMenuView.this.menu.performItemAction(itemData, NavigationBarMenuView.this.presenter, 0);
                if (itemData == null || !itemData.isCheckable()) {
                    return;
                }
                if (!zPerformItemAction || itemData.isChecked()) {
                    NavigationBarMenuView.this.setCheckedItem(itemData);
                }
            }
        };
        setImportantForAccessibility(1);
    }

    @Nullable
    private Drawable createItemActiveIndicatorDrawable() {
        if (this.itemActiveIndicatorShapeAppearance == null || this.itemActiveIndicatorColor == null) {
            return null;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.itemActiveIndicatorShapeAppearance);
        materialShapeDrawable.setFillColor(this.itemActiveIndicatorColor);
        return materialShapeDrawable;
    }

    private NavigationBarItemView createMenuItem(int i7, m mVar, boolean z3, boolean z8) {
        this.presenter.setUpdateSuspended(true);
        mVar.setCheckable(true);
        this.presenter.setUpdateSuspended(false);
        NavigationBarItemView newItem = getNewItem();
        newItem.setShifting(z3);
        newItem.setLabelMaxLines(this.labelMaxLines);
        newItem.setIconTintList(this.itemIconTint);
        newItem.setIconSize(this.itemIconSize);
        newItem.setTextColor(this.itemTextColorDefault);
        newItem.setTextAppearanceInactive(this.itemTextAppearanceInactive);
        newItem.setTextAppearanceActive(this.itemTextAppearanceActive);
        newItem.setHorizontalTextAppearanceInactive(this.horizontalItemTextAppearanceInactive);
        newItem.setHorizontalTextAppearanceActive(this.horizontalItemTextAppearanceActive);
        newItem.setTextAppearanceActiveBoldEnabled(this.itemTextAppearanceActiveBoldEnabled);
        newItem.setTextColor(this.itemTextColorFromUser);
        int i10 = this.itemPaddingTop;
        if (i10 != -1) {
            newItem.setItemPaddingTop(i10);
        }
        int i11 = this.itemPaddingBottom;
        if (i11 != -1) {
            newItem.setItemPaddingBottom(i11);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.measurePaddingFromLabelBaseline);
        newItem.setLabelFontScalingEnabled(this.scaleLabelWithFont);
        int i12 = this.itemActiveIndicatorLabelPadding;
        if (i12 != -1) {
            newItem.setActiveIndicatorLabelPadding(i12);
        }
        int i13 = this.iconLabelHorizontalSpacing;
        if (i13 != -1) {
            newItem.setIconLabelHorizontalSpacing(i13);
        }
        newItem.setActiveIndicatorWidth(this.itemActiveIndicatorWidth);
        newItem.setActiveIndicatorHeight(this.itemActiveIndicatorHeight);
        newItem.setActiveIndicatorExpandedWidth(this.itemActiveIndicatorExpandedWidth);
        newItem.setActiveIndicatorExpandedHeight(this.itemActiveIndicatorExpandedHeight);
        newItem.setActiveIndicatorMarginHorizontal(this.itemActiveIndicatorMarginHorizontal);
        newItem.setItemGravity(this.itemGravity);
        newItem.setActiveIndicatorExpandedPadding(this.itemActiveIndicatorExpandedPadding);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.itemActiveIndicatorExpandedMarginHorizontal);
        newItem.setActiveIndicatorDrawable(createItemActiveIndicatorDrawable());
        newItem.setActiveIndicatorResizeable(this.itemActiveIndicatorResizeable);
        newItem.setActiveIndicatorEnabled(this.itemActiveIndicatorEnabled);
        Drawable drawable = this.itemBackground;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.itemBackgroundRes);
        }
        newItem.setItemRippleColor(this.itemRippleColor);
        newItem.setLabelVisibilityMode(this.labelVisibilityMode);
        newItem.setItemIconGravity(this.itemIconGravity);
        newItem.setOnlyShowWhenExpanded(z8);
        newItem.setExpanded(this.expanded);
        newItem.initialize(mVar, 0);
        newItem.setItemPosition(i7);
        SparseArray<View.OnTouchListener> sparseArray = this.onTouchListeners;
        int i14 = mVar.f12442a;
        newItem.setOnTouchListener(sparseArray.get(i14));
        newItem.setOnClickListener(this.onClickListener);
        int i15 = this.selectedItemId;
        if (i15 != 0 && i14 == i15) {
            this.selectedItemPosition = i7;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.collapsedMaxItemCount, this.menu.getVisibleMainContentItemCount());
    }

    private NavigationBarItemView getNewItem() {
        Pools$Pool<NavigationBarItemView> pools$Pool = this.itemPool;
        NavigationBarItemView navigationBarItemViewAcquire = pools$Pool != null ? pools$Pool.acquire() : null;
        return navigationBarItemViewAcquire == null ? createNavigationBarItemView(getContext()) : navigationBarItemViewAcquire;
    }

    private boolean isMenuStructureSame() {
        NavigationBarMenuBuilder navigationBarMenuBuilder;
        if (this.buttons == null || (navigationBarMenuBuilder = this.menu) == null || navigationBarMenuBuilder.size() != this.buttons.length) {
            return false;
        }
        int i7 = 0;
        while (true) {
            if (i7 >= this.buttons.length) {
                return true;
            }
            if ((this.menu.getItemAt(i7) instanceof DividerMenuItem) && !(this.buttons[i7] instanceof NavigationBarDividerView)) {
                return false;
            }
            boolean z3 = this.menu.getItemAt(i7).hasSubMenu() && !(this.buttons[i7] instanceof NavigationBarSubheaderView);
            boolean z8 = (this.menu.getItemAt(i7).hasSubMenu() || (this.buttons[i7] instanceof NavigationBarItemView)) ? false : true;
            if (!(this.menu.getItemAt(i7) instanceof DividerMenuItem) && (z3 || z8)) {
                break;
            }
            i7++;
        }
        return false;
    }

    private boolean isValidId(int i7) {
        return i7 != -1;
    }

    private void releaseItemPool() {
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr == null || this.itemPool == null) {
            return;
        }
        for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
            if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                NavigationBarItemView navigationBarItemView = (NavigationBarItemView) navigationBarMenuItemView;
                this.itemPool.release(navigationBarItemView);
                navigationBarItemView.clear();
            }
        }
    }

    private void removeUnusedBadges() {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < this.menu.size(); i7++) {
            hashSet.add(Integer.valueOf(this.menu.getItemAt(i7).getItemId()));
        }
        for (int i10 = 0; i10 < this.badgeDrawables.size(); i10++) {
            int iKeyAt = this.badgeDrawables.keyAt(i10);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                this.badgeDrawables.delete(iKeyAt);
            }
        }
    }

    private void setBadgeIfNeeded(@NonNull NavigationBarItemView navigationBarItemView) {
        BadgeDrawable badgeDrawable;
        int id2 = navigationBarItemView.getId();
        if (isValidId(id2) && (badgeDrawable = this.badgeDrawables.get(id2)) != null) {
            navigationBarItemView.setBadge(badgeDrawable);
        }
    }

    private void validateMenuItemId(int i7) {
        if (!isValidId(i7)) {
            throw new IllegalArgumentException(u.g(i7, " is not a valid view id"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ClickableViewAccessibility"})
    public void buildMenuView() {
        NavigationBarItemView navigationBarItemViewCreateMenuItem;
        View viewCreateMenuItem;
        NavigationBarDividerView navigationBarDividerView;
        removeAllViews();
        releaseItemPool();
        this.presenter.setUpdateSuspended(true);
        this.menu.refreshItems();
        this.presenter.setUpdateSuspended(false);
        int contentItemCount = this.menu.getContentItemCount();
        if (contentItemCount == 0) {
            this.selectedItemId = 0;
            this.selectedItemPosition = 0;
            this.buttons = null;
            this.itemPool = null;
            return;
        }
        if (this.itemPool == null || this.itemPoolSize != contentItemCount) {
            this.itemPoolSize = contentItemCount;
            this.itemPool = new b(contentItemCount);
        }
        removeUnusedBadges();
        int size = this.menu.size();
        this.buttons = new NavigationBarMenuItemView[size];
        boolean zIsShifting = isShifting(this.labelVisibilityMode, getCurrentVisibleContentItemCount());
        int size2 = 0;
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem itemAt = this.menu.getItemAt(i10);
            boolean z3 = itemAt instanceof DividerMenuItem;
            if (z3) {
                navigationBarDividerView = new NavigationBarDividerView(getContext());
                navigationBarDividerView.setOnlyShowWhenExpanded(true);
                navigationBarDividerView.setDividersEnabled(this.dividersEnabled);
            } else if (itemAt.hasSubMenu()) {
                if (size2 > 0) {
                    throw new IllegalArgumentException("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                }
                NavigationBarSubheaderView navigationBarSubheaderView = new NavigationBarSubheaderView(getContext());
                int i11 = this.horizontalItemTextAppearanceActive;
                if (i11 == 0) {
                    i11 = this.itemTextAppearanceActive;
                }
                navigationBarSubheaderView.setTextAppearance(i11);
                navigationBarSubheaderView.setTextColor(this.itemTextColorFromUser);
                navigationBarSubheaderView.setOnlyShowWhenExpanded(true);
                navigationBarSubheaderView.initialize((m) itemAt, 0);
                size2 = itemAt.getSubMenu().size();
                viewCreateMenuItem = navigationBarSubheaderView;
            } else if (size2 > 0) {
                navigationBarItemViewCreateMenuItem = createMenuItem(i10, (m) itemAt, zIsShifting, true);
                size2--;
            } else {
                m mVar = (m) itemAt;
                boolean z8 = i7 >= this.collapsedMaxItemCount;
                i7++;
                viewCreateMenuItem = createMenuItem(i10, mVar, zIsShifting, z8);
            }
            if (z3) {
                viewCreateMenuItem = navigationBarItemViewCreateMenuItem;
                viewCreateMenuItem = navigationBarDividerView;
            } else {
                viewCreateMenuItem = navigationBarItemViewCreateMenuItem;
                if (itemAt.isCheckable() && this.selectedItemPosition == -1) {
                    viewCreateMenuItem = navigationBarDividerView;
                    this.selectedItemPosition = i10;
                } else {
                    viewCreateMenuItem = navigationBarDividerView;
                }
            }
            this.buttons[i10] = viewCreateMenuItem;
            addView(viewCreateMenuItem);
        }
        int iMin = Math.min(size - 1, this.selectedItemPosition);
        this.selectedItemPosition = iMin;
        setCheckedItem(this.buttons[iMin].getItemData());
    }

    @Nullable
    public ColorStateList createDefaultColorStateList(int i7) {
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
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListC.getColorForState(iArr, defaultColor), i10, defaultColor});
    }

    @NonNull
    public abstract NavigationBarItemView createNavigationBarItemView(@NonNull Context context);

    @Nullable
    public NavigationBarItemView findItemView(int i7) {
        validateMenuItemId(i7);
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr == null) {
            return null;
        }
        for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
            if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                NavigationBarItemView navigationBarItemView = (NavigationBarItemView) navigationBarMenuItemView;
                if (navigationBarItemView.getId() == i7) {
                    return navigationBarItemView;
                }
            }
        }
        return null;
    }

    @Px
    public int getActiveIndicatorLabelPadding() {
        return this.itemActiveIndicatorLabelPadding;
    }

    @Nullable
    public BadgeDrawable getBadge(int i7) {
        return this.badgeDrawables.get(i7);
    }

    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.badgeDrawables;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.expanded ? this.menu.getVisibleContentItemCount() : getCollapsedVisibleItemCount();
    }

    @StyleRes
    public int getHorizontalItemTextAppearanceActive() {
        return this.horizontalItemTextAppearanceActive;
    }

    @StyleRes
    public int getHorizontalItemTextAppearanceInactive() {
        return this.horizontalItemTextAppearanceInactive;
    }

    @Px
    public int getIconLabelHorizontalSpacing() {
        return this.iconLabelHorizontalSpacing;
    }

    @Nullable
    public ColorStateList getIconTintList() {
        return this.itemIconTint;
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.itemActiveIndicatorColor;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.itemActiveIndicatorEnabled;
    }

    @Px
    public int getItemActiveIndicatorExpandedHeight() {
        return this.itemActiveIndicatorExpandedHeight;
    }

    @Px
    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.itemActiveIndicatorExpandedMarginHorizontal;
    }

    @Px
    public int getItemActiveIndicatorExpandedWidth() {
        return this.itemActiveIndicatorExpandedWidth;
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.itemActiveIndicatorHeight;
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.itemActiveIndicatorMarginHorizontal;
    }

    @Nullable
    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.itemActiveIndicatorShapeAppearance;
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.itemActiveIndicatorWidth;
    }

    @Nullable
    public Drawable getItemBackground() {
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null && navigationBarMenuItemViewArr.length > 0) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    return ((NavigationBarItemView) navigationBarMenuItemView).getBackground();
                }
            }
        }
        return this.itemBackground;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.itemBackgroundRes;
    }

    public int getItemGravity() {
        return this.itemGravity;
    }

    public int getItemIconGravity() {
        return this.itemIconGravity;
    }

    @Dimension
    public int getItemIconSize() {
        return this.itemIconSize;
    }

    @Px
    public int getItemPaddingBottom() {
        return this.itemPaddingBottom;
    }

    @Px
    public int getItemPaddingTop() {
        return this.itemPaddingTop;
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.itemRippleColor;
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.itemTextAppearanceActive;
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.itemTextAppearanceInactive;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.itemTextColorFromUser;
    }

    public int getLabelMaxLines() {
        return this.labelMaxLines;
    }

    public int getLabelVisibilityMode() {
        return this.labelVisibilityMode;
    }

    @Nullable
    public NavigationBarMenuBuilder getMenu() {
        return this.menu;
    }

    public BadgeDrawable getOrCreateBadge(int i7) {
        validateMenuItemId(i7);
        BadgeDrawable badgeDrawableCreate = this.badgeDrawables.get(i7);
        if (badgeDrawableCreate == null) {
            badgeDrawableCreate = BadgeDrawable.create(getContext());
            this.badgeDrawables.put(i7, badgeDrawableCreate);
        }
        NavigationBarItemView navigationBarItemViewFindItemView = findItemView(i7);
        if (navigationBarItemViewFindItemView != null) {
            navigationBarItemViewFindItemView.setBadge(badgeDrawableCreate);
        }
        return badgeDrawableCreate;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.scaleLabelWithFont;
    }

    public int getSelectedItemId() {
        return this.selectedItemId;
    }

    public int getSelectedItemPosition() {
        return this.selectedItemPosition;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void initialize(@NonNull k kVar) {
        this.menu = new NavigationBarMenuBuilder(kVar);
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public boolean isItemActiveIndicatorResizeable() {
        return this.itemActiveIndicatorResizeable;
    }

    public boolean isShifting(int i7, int i10) {
        if (i7 == -1) {
            return i10 > 3;
        }
        return i7 == 0;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) Sd.b.c(1, getCurrentVisibleContentItemCount(), 1, false).f8871b);
    }

    public void removeBadge(int i7) {
        validateMenuItemId(i7);
        NavigationBarItemView navigationBarItemViewFindItemView = findItemView(i7);
        if (navigationBarItemViewFindItemView != null) {
            navigationBarItemViewFindItemView.removeBadge();
        }
        this.badgeDrawables.put(i7, null);
    }

    public void restoreBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            int iKeyAt = sparseArray.keyAt(i7);
            if (this.badgeDrawables.indexOfKey(iKeyAt) < 0) {
                this.badgeDrawables.append(iKeyAt, sparseArray.get(iKeyAt));
            }
        }
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    NavigationBarItemView navigationBarItemView = (NavigationBarItemView) navigationBarMenuItemView;
                    BadgeDrawable badgeDrawable = this.badgeDrawables.get(navigationBarItemView.getId());
                    if (badgeDrawable != null) {
                        navigationBarItemView.setBadge(badgeDrawable);
                    }
                }
            }
        }
    }

    public void setActiveIndicatorLabelPadding(@Px int i7) {
        this.itemActiveIndicatorLabelPadding = i7;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorLabelPadding(i7);
                }
            }
        }
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        if (this.checkedItem == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.checkedItem;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.checkedItem.setChecked(false);
        }
        menuItem.setChecked(true);
        this.checkedItem = menuItem;
    }

    public void setCollapsedMaxItemCount(int i7) {
        this.collapsedMaxItemCount = i7;
    }

    public void setExpanded(boolean z3) {
        this.expanded = z3;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                navigationBarMenuItemView.setExpanded(z3);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(@StyleRes int i7) {
        this.horizontalItemTextAppearanceActive = i7;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setHorizontalTextAppearanceActive(i7);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(@StyleRes int i7) {
        this.horizontalItemTextAppearanceInactive = i7;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setHorizontalTextAppearanceInactive(i7);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(@Px int i7) {
        this.iconLabelHorizontalSpacing = i7;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setIconLabelHorizontalSpacing(i7);
                }
            }
        }
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        this.itemIconTint = colorStateList;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.itemActiveIndicatorColor = colorStateList;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorDrawable(createItemActiveIndicatorDrawable());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z3) {
        this.itemActiveIndicatorEnabled = z3;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorEnabled(z3);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(@Px int i7) {
        this.itemActiveIndicatorExpandedHeight = i7;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorExpandedHeight(i7);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(@Px int i7) {
        this.itemActiveIndicatorExpandedMarginHorizontal = i7;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorExpandedMarginHorizontal(i7);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedPadding(int i7, int i10, int i11, int i12) {
        Rect rect = this.itemActiveIndicatorExpandedPadding;
        rect.left = i7;
        rect.top = i10;
        rect.right = i11;
        rect.bottom = i12;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorExpandedPadding(this.itemActiveIndicatorExpandedPadding);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(@Px int i7) {
        this.itemActiveIndicatorExpandedWidth = i7;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorExpandedWidth(i7);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(@Px int i7) {
        this.itemActiveIndicatorHeight = i7;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorHeight(i7);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int i7) {
        this.itemActiveIndicatorMarginHorizontal = i7;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorMarginHorizontal(i7);
                }
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z3) {
        this.itemActiveIndicatorResizeable = z3;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorResizeable(z3);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.itemActiveIndicatorShapeAppearance = shapeAppearanceModel;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorDrawable(createItemActiveIndicatorDrawable());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(@Px int i7) {
        this.itemActiveIndicatorWidth = i7;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setActiveIndicatorWidth(i7);
                }
            }
        }
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.itemBackground = drawable;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i7) {
        this.itemBackgroundRes = i7;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemBackground(i7);
                }
            }
        }
    }

    public void setItemGravity(int i7) {
        this.itemGravity = i7;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemGravity(i7);
                }
            }
        }
    }

    public void setItemIconGravity(int i7) {
        this.itemIconGravity = i7;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemIconGravity(i7);
                }
            }
        }
    }

    public void setItemIconSize(@Dimension int i7) {
        this.itemIconSize = i7;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setIconSize(i7);
                }
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setItemOnTouchListener(int i7, @Nullable View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.onTouchListeners.remove(i7);
        } else {
            this.onTouchListeners.put(i7, onTouchListener);
        }
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if ((navigationBarMenuItemView instanceof NavigationBarItemView) && navigationBarMenuItemView.getItemData() != null && navigationBarMenuItemView.getItemData().f12442a == i7) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void setItemPaddingBottom(@Px int i7) {
        this.itemPaddingBottom = i7;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemPaddingBottom(this.itemPaddingBottom);
                }
            }
        }
    }

    public void setItemPaddingTop(@Px int i7) {
        this.itemPaddingTop = i7;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemPaddingTop(i7);
                }
            }
        }
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.itemRippleColor = colorStateList;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(@StyleRes int i7) {
        this.itemTextAppearanceActive = i7;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setTextAppearanceActive(i7);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z3) {
        this.itemTextAppearanceActiveBoldEnabled = z3;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setTextAppearanceActiveBoldEnabled(z3);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(@StyleRes int i7) {
        this.itemTextAppearanceInactive = i7;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setTextAppearanceInactive(i7);
                }
            }
        }
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.itemTextColorFromUser = colorStateList;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z3) {
        this.scaleLabelWithFont = z3;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setLabelFontScalingEnabled(z3);
                }
            }
        }
    }

    public void setLabelMaxLines(int i7) {
        this.labelMaxLines = i7;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setLabelMaxLines(i7);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i7) {
        this.labelVisibilityMode = i7;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z3) {
        this.measurePaddingFromLabelBaseline = z3;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).setMeasureBottomPaddingFromLabelBaseline(z3);
                }
            }
        }
    }

    public void setPresenter(@NonNull NavigationBarPresenter navigationBarPresenter) {
        this.presenter = navigationBarPresenter;
    }

    public void setSubmenuDividersEnabled(boolean z3) {
        if (this.dividersEnabled == z3) {
            return;
        }
        this.dividersEnabled = z3;
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarDividerView) {
                    ((NavigationBarDividerView) navigationBarMenuItemView).setDividersEnabled(z3);
                }
            }
        }
    }

    public void tryRestoreSelectedItemId(int i7) {
        int size = this.menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem itemAt = this.menu.getItemAt(i10);
            if (i7 == itemAt.getItemId()) {
                this.selectedItemId = i7;
                this.selectedItemPosition = i10;
                setCheckedItem(itemAt);
                return;
            }
        }
    }

    public void updateActiveIndicator(int i7) {
        NavigationBarMenuItemView[] navigationBarMenuItemViewArr = this.buttons;
        if (navigationBarMenuItemViewArr != null) {
            for (NavigationBarMenuItemView navigationBarMenuItemView : navigationBarMenuItemViewArr) {
                if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) navigationBarMenuItemView).updateActiveIndicatorLayoutParams(i7);
                }
            }
        }
    }

    public void updateMenuView() {
        TransitionSet transitionSet;
        if (this.menu == null || this.buttons == null) {
            return;
        }
        this.presenter.setUpdateSuspended(true);
        this.menu.refreshItems();
        this.presenter.setUpdateSuspended(false);
        if (!isMenuStructureSame()) {
            buildMenuView();
            return;
        }
        int i7 = this.selectedItemId;
        int size = this.menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem itemAt = this.menu.getItemAt(i10);
            if (itemAt.isChecked()) {
                setCheckedItem(itemAt);
                this.selectedItemId = itemAt.getItemId();
                this.selectedItemPosition = i10;
            }
        }
        if (i7 != this.selectedItemId && (transitionSet = this.set) != null) {
            X.a(this, transitionSet);
        }
        boolean zIsShifting = isShifting(this.labelVisibilityMode, getCurrentVisibleContentItemCount());
        for (int i11 = 0; i11 < size; i11++) {
            this.presenter.setUpdateSuspended(true);
            this.buttons[i11].setExpanded(this.expanded);
            NavigationBarMenuItemView navigationBarMenuItemView = this.buttons[i11];
            if (navigationBarMenuItemView instanceof NavigationBarItemView) {
                NavigationBarItemView navigationBarItemView = (NavigationBarItemView) navigationBarMenuItemView;
                navigationBarItemView.setLabelVisibilityMode(this.labelVisibilityMode);
                navigationBarItemView.setItemIconGravity(this.itemIconGravity);
                navigationBarItemView.setItemGravity(this.itemGravity);
                navigationBarItemView.setShifting(zIsShifting);
            }
            if (this.menu.getItemAt(i11) instanceof m) {
                this.buttons[i11].initialize((m) this.menu.getItemAt(i11), 0);
            }
            this.presenter.setUpdateSuspended(false);
        }
    }
}
