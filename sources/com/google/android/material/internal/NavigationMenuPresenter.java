package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Dimension;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.w;
import androidx.core.view.C1050b;
import androidx.core.view.N;
import androidx.core.view.q0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import com.google.android.material.R;
import java.util.ArrayList;
import p074f0.d;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class NavigationMenuPresenter implements MenuPresenter {
    public static final int NO_TEXT_APPEARANCE_SET = 0;
    private static final String STATE_ADAPTER = "android:menu:adapter";
    private static final String STATE_HEADER = "android:menu:header";
    private static final String STATE_HIERARCHY = "android:menu:list";
    NavigationMenuAdapter adapter;
    private MenuPresenter.Callback callback;

    @Px
    int dividerInsetEnd;

    @Px
    int dividerInsetStart;
    boolean hasCustomItemIconSize;
    LinearLayout headerLayout;
    ColorStateList iconTintList;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f22535id;
    Drawable itemBackground;
    RippleDrawable itemForeground;
    int itemHorizontalPadding;
    int itemIconPadding;
    int itemIconSize;
    private int itemMaxLines;

    @Px
    int itemVerticalPadding;
    LayoutInflater layoutInflater;
    k menu;
    private NavigationMenuView menuView;
    int paddingSeparator;
    private int paddingTopDefault;

    @Nullable
    ColorStateList subheaderColor;

    @Px
    int subheaderInsetEnd;

    @Px
    int subheaderInsetStart;
    ColorStateList textColor;
    int subheaderTextAppearance = 0;
    int textAppearance = 0;
    boolean textAppearanceActiveBoldEnabled = true;
    boolean isBehindStatusBar = true;
    private int overScrollMode = -1;
    final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.material.internal.NavigationMenuPresenter.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z3 = true;
            NavigationMenuPresenter.this.setUpdateSuspended(true);
            m itemData = ((NavigationMenuItemView) view).getItemData();
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            boolean zPerformItemAction = navigationMenuPresenter.menu.performItemAction(itemData, navigationMenuPresenter, 0);
            if (itemData != null && itemData.isCheckable() && zPerformItemAction) {
                NavigationMenuPresenter.this.adapter.setCheckedItem(itemData);
            } else {
                z3 = false;
            }
            NavigationMenuPresenter.this.setUpdateSuspended(false);
            if (z3) {
                NavigationMenuPresenter.this.updateMenuView(false);
            }
        }
    };

    public static class HeaderViewHolder extends ViewHolder {
        public HeaderViewHolder(View view) {
            super(view);
        }
    }

    public class NavigationMenuAdapter extends RecyclerView.Adapter<ViewHolder> {
        private static final String STATE_ACTION_VIEWS = "android:menu:action_views";
        private static final String STATE_CHECKED_ITEM = "android:menu:checked";
        private static final int VIEW_TYPE_HEADER = 3;
        private static final int VIEW_TYPE_NORMAL = 0;
        private static final int VIEW_TYPE_SEPARATOR = 2;
        private static final int VIEW_TYPE_SUBHEADER = 1;
        private m checkedItem;
        private final ArrayList<NavigationMenuItem> items = new ArrayList<>();
        private boolean updateSuspended;

        public NavigationMenuAdapter() {
            prepareMenuItems();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int adjustItemPositionForA11yDelegate(int i7) {
            int i10 = i7;
            for (int i11 = 0; i11 < i7; i11++) {
                if (NavigationMenuPresenter.this.adapter.getItemViewType(i11) == 2 || NavigationMenuPresenter.this.adapter.getItemViewType(i11) == 3) {
                    i10--;
                }
            }
            return i10;
        }

        private void appendTransparentIconIfMissing(int i7, int i10) {
            while (i7 < i10) {
                ((NavigationMenuTextItem) this.items.get(i7)).needsEmptyIcon = true;
                i7++;
            }
        }

        private void prepareMenuItems() {
            if (this.updateSuspended) {
                return;
            }
            this.updateSuspended = true;
            this.items.clear();
            this.items.add(new NavigationMenuHeaderItem());
            int size = NavigationMenuPresenter.this.menu.getVisibleItems().size();
            int i7 = -1;
            boolean z3 = false;
            int size2 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                m mVar = NavigationMenuPresenter.this.menu.getVisibleItems().get(i10);
                if (mVar.isChecked()) {
                    setCheckedItem(mVar);
                }
                if (mVar.isCheckable()) {
                    mVar.d(false);
                }
                if (mVar.hasSubMenu()) {
                    w wVar = mVar.f12456o;
                    if (wVar.hasVisibleItems()) {
                        if (i10 != 0) {
                            this.items.add(new NavigationMenuSeparatorItem(NavigationMenuPresenter.this.paddingSeparator, 0));
                        }
                        this.items.add(new NavigationMenuTextItem(mVar));
                        int size3 = this.items.size();
                        int size4 = wVar.size();
                        boolean z8 = false;
                        for (int i11 = 0; i11 < size4; i11++) {
                            m mVar2 = (m) wVar.getItem(i11);
                            if (mVar2.isVisible()) {
                                if (!z8 && mVar2.getIcon() != null) {
                                    z8 = true;
                                }
                                if (mVar2.isCheckable()) {
                                    mVar2.d(false);
                                }
                                if (mVar2.isChecked()) {
                                    setCheckedItem(mVar2);
                                }
                                this.items.add(new NavigationMenuTextItem(mVar2));
                            }
                        }
                        if (z8) {
                            appendTransparentIconIfMissing(size3, this.items.size());
                        }
                    }
                } else {
                    int i12 = mVar.f12443b;
                    if (i12 != i7) {
                        size2 = this.items.size();
                        z3 = mVar.getIcon() != null;
                        if (i10 != 0) {
                            size2++;
                            ArrayList<NavigationMenuItem> arrayList = this.items;
                            int i13 = NavigationMenuPresenter.this.paddingSeparator;
                            arrayList.add(new NavigationMenuSeparatorItem(i13, i13));
                        }
                    } else if (!z3 && mVar.getIcon() != null) {
                        appendTransparentIconIfMissing(size2, this.items.size());
                        z3 = true;
                    }
                    NavigationMenuTextItem navigationMenuTextItem = new NavigationMenuTextItem(mVar);
                    navigationMenuTextItem.needsEmptyIcon = z3;
                    this.items.add(navigationMenuTextItem);
                    i7 = i12;
                }
            }
            this.updateSuspended = false;
        }

        private void setAccessibilityDelegate(View view, final int i7, final boolean z3) {
            N.q(view, new C1050b() { // from class: com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuAdapter.1
                @Override // androidx.core.view.C1050b
                public void onInitializeAccessibilityNodeInfo(@NonNull View view2, @NonNull d dVar) {
                    super.onInitializeAccessibilityNodeInfo(view2, dVar);
                    dVar.n(p045d3.k.h(NavigationMenuAdapter.this.adjustItemPositionForA11yDelegate(i7), 1, 1, 1, z3, view2.isSelected()));
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateAllDividerMenuItems() {
            for (int i7 = 0; i7 < this.items.size(); i7++) {
                if (this.items.get(i7) instanceof NavigationMenuSeparatorItem) {
                    notifyItemChanged(i7);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateAllSubHeaderMenuItems() {
            for (int i7 = 0; i7 < this.items.size(); i7++) {
                if ((this.items.get(i7) instanceof NavigationMenuTextItem) && getItemViewType(i7) == 1) {
                    notifyItemChanged(i7);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateAllTextMenuItems() {
            for (int i7 = 0; i7 < this.items.size(); i7++) {
                if ((this.items.get(i7) instanceof NavigationMenuTextItem) && getItemViewType(i7) == 0) {
                    notifyItemChanged(i7);
                }
            }
        }

        @NonNull
        public Bundle createInstanceState() {
            Bundle bundle = new Bundle();
            m mVar = this.checkedItem;
            if (mVar != null) {
                bundle.putInt(STATE_CHECKED_ITEM, mVar.f12442a);
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.items.size();
            for (int i7 = 0; i7 < size; i7++) {
                NavigationMenuItem navigationMenuItem = this.items.get(i7);
                if (navigationMenuItem instanceof NavigationMenuTextItem) {
                    m menuItem = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem();
                    View actionView = menuItem != null ? menuItem.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(menuItem.f12442a, parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray(STATE_ACTION_VIEWS, sparseArray);
            return bundle;
        }

        public m getCheckedItem() {
            return this.checkedItem;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.items.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i7) {
            return i7;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i7) {
            NavigationMenuItem navigationMenuItem = this.items.get(i7);
            if (navigationMenuItem instanceof NavigationMenuSeparatorItem) {
                return 2;
            }
            if (navigationMenuItem instanceof NavigationMenuHeaderItem) {
                return 3;
            }
            if (navigationMenuItem instanceof NavigationMenuTextItem) {
                return ((NavigationMenuTextItem) navigationMenuItem).getMenuItem().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public int getRowCount() {
            int i7 = 0;
            for (int i10 = 0; i10 < NavigationMenuPresenter.this.adapter.getItemCount(); i10++) {
                int itemViewType = NavigationMenuPresenter.this.adapter.getItemViewType(i10);
                if (itemViewType == 0 || itemViewType == 1) {
                    i7++;
                }
            }
            return i7;
        }

        public void restoreInstanceState(@NonNull Bundle bundle) {
            m menuItem;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            m menuItem2;
            int i7 = bundle.getInt(STATE_CHECKED_ITEM, 0);
            if (i7 != 0) {
                this.updateSuspended = true;
                int size = this.items.size();
                for (int i10 = 0; i10 < size; i10++) {
                    NavigationMenuItem navigationMenuItem = this.items.get(i10);
                    if ((navigationMenuItem instanceof NavigationMenuTextItem) && (menuItem2 = ((NavigationMenuTextItem) navigationMenuItem).getMenuItem()) != null && menuItem2.f12442a == i7) {
                        setCheckedItem(menuItem2);
                        break;
                    }
                }
                this.updateSuspended = false;
                prepareMenuItems();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(STATE_ACTION_VIEWS);
            if (sparseParcelableArray != null) {
                int size2 = this.items.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    NavigationMenuItem navigationMenuItem2 = this.items.get(i11);
                    if ((navigationMenuItem2 instanceof NavigationMenuTextItem) && (menuItem = ((NavigationMenuTextItem) navigationMenuItem2).getMenuItem()) != null && (actionView = menuItem.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(menuItem.f12442a)) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void setCheckedItem(@NonNull m mVar) {
            if (this.checkedItem == mVar || !mVar.isCheckable()) {
                return;
            }
            m mVar2 = this.checkedItem;
            if (mVar2 != null) {
                mVar2.setChecked(false);
            }
            this.checkedItem = mVar;
            mVar.setChecked(true);
        }

        public void setUpdateSuspended(boolean z3) {
            this.updateSuspended = z3;
        }

        public void update() {
            int size = this.items.size();
            prepareMenuItems();
            notifyDataSetChanged();
            if (size == this.items.size()) {
                notifyItemRangeChanged(0, this.items.size());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i7) {
            int itemViewType = getItemViewType(i7);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    NavigationMenuSeparatorItem navigationMenuSeparatorItem = (NavigationMenuSeparatorItem) this.items.get(i7);
                    viewHolder.itemView.setPaddingRelative(NavigationMenuPresenter.this.dividerInsetStart, navigationMenuSeparatorItem.getPaddingTop(), NavigationMenuPresenter.this.dividerInsetEnd, navigationMenuSeparatorItem.getPaddingBottom());
                    return;
                }
                TextView textView = (TextView) viewHolder.itemView;
                textView.setText(((NavigationMenuTextItem) this.items.get(i7)).getMenuItem().f12446e);
                textView.setTextAppearance(NavigationMenuPresenter.this.subheaderTextAppearance);
                textView.setPaddingRelative(NavigationMenuPresenter.this.subheaderInsetStart, textView.getPaddingTop(), NavigationMenuPresenter.this.subheaderInsetEnd, textView.getPaddingBottom());
                ColorStateList colorStateList = NavigationMenuPresenter.this.subheaderColor;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                setAccessibilityDelegate(textView, i7, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder.itemView;
            navigationMenuItemView.setIconTintList(NavigationMenuPresenter.this.iconTintList);
            navigationMenuItemView.setTextAppearance(NavigationMenuPresenter.this.textAppearance);
            ColorStateList colorStateList2 = NavigationMenuPresenter.this.textColor;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = NavigationMenuPresenter.this.itemBackground;
            navigationMenuItemView.setBackground(drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = NavigationMenuPresenter.this.itemForeground;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            NavigationMenuTextItem navigationMenuTextItem = (NavigationMenuTextItem) this.items.get(i7);
            navigationMenuItemView.setNeedsEmptyIcon(navigationMenuTextItem.needsEmptyIcon);
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            int i10 = navigationMenuPresenter.itemHorizontalPadding;
            int i11 = navigationMenuPresenter.itemVerticalPadding;
            navigationMenuItemView.setPadding(i10, i11, i10, i11);
            navigationMenuItemView.setIconPadding(NavigationMenuPresenter.this.itemIconPadding);
            NavigationMenuPresenter navigationMenuPresenter2 = NavigationMenuPresenter.this;
            if (navigationMenuPresenter2.hasCustomItemIconSize) {
                navigationMenuItemView.setIconSize(navigationMenuPresenter2.itemIconSize);
            }
            navigationMenuItemView.setMaxLines(NavigationMenuPresenter.this.itemMaxLines);
            navigationMenuItemView.initialize(navigationMenuTextItem.getMenuItem(), NavigationMenuPresenter.this.textAppearanceActiveBoldEnabled);
            setAccessibilityDelegate(navigationMenuItemView, i7, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @Nullable
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            if (i7 == 0) {
                NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
                return new NormalViewHolder(navigationMenuPresenter.layoutInflater, viewGroup, navigationMenuPresenter.onClickListener);
            }
            if (i7 == 1) {
                return new SubheaderViewHolder(NavigationMenuPresenter.this.layoutInflater, viewGroup);
            }
            if (i7 == 2) {
                return new SeparatorViewHolder(NavigationMenuPresenter.this.layoutInflater, viewGroup);
            }
            if (i7 != 3) {
                return null;
            }
            return new HeaderViewHolder(NavigationMenuPresenter.this.headerLayout);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(ViewHolder viewHolder) {
            if (viewHolder instanceof NormalViewHolder) {
                ((NavigationMenuItemView) viewHolder.itemView).recycle();
            }
        }
    }

    public static class NavigationMenuHeaderItem implements NavigationMenuItem {
    }

    public interface NavigationMenuItem {
    }

    public static class NavigationMenuSeparatorItem implements NavigationMenuItem {
        private final int paddingBottom;
        private final int paddingTop;

        public NavigationMenuSeparatorItem(int i7, int i10) {
            this.paddingTop = i7;
            this.paddingBottom = i10;
        }

        public int getPaddingBottom() {
            return this.paddingBottom;
        }

        public int getPaddingTop() {
            return this.paddingTop;
        }
    }

    public static class NavigationMenuTextItem implements NavigationMenuItem {
        private final m menuItem;
        boolean needsEmptyIcon;

        public NavigationMenuTextItem(m mVar) {
            this.menuItem = mVar;
        }

        public m getMenuItem() {
            return this.menuItem;
        }
    }

    public class NavigationMenuViewAccessibilityDelegate extends RecyclerViewAccessibilityDelegate {
        public NavigationMenuViewAccessibilityDelegate(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.C1050b
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull d dVar) {
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            AccessibilityNodeInfo.CollectionInfo collectionInfoObtain = AccessibilityNodeInfo.CollectionInfo.obtain(NavigationMenuPresenter.this.adapter.getRowCount(), 1, false);
            dVar.getClass();
            dVar.f36360a.setCollectionInfo(collectionInfoObtain);
        }
    }

    public static class NormalViewHolder extends ViewHolder {
        public NormalViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    public static class SeparatorViewHolder extends ViewHolder {
        public SeparatorViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    public static class SubheaderViewHolder extends ViewHolder {
        public SubheaderViewHolder(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    public static abstract class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View view) {
            super(view);
        }
    }

    private boolean hasHeader() {
        return getHeaderCount() > 0;
    }

    private void updateAllDividerMenuItems() {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.updateAllDividerMenuItems();
        }
    }

    private void updateAllSubHeaderMenuItems() {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.updateAllSubHeaderMenuItems();
        }
    }

    private void updateAllTextMenuItems() {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.updateAllTextMenuItems();
        }
    }

    private void updateTopPadding() {
        int i7 = (hasHeader() || !this.isBehindStatusBar) ? 0 : this.paddingTopDefault;
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, i7, 0, navigationMenuView.getPaddingBottom());
    }

    public void addHeaderView(@NonNull View view) {
        this.headerLayout.addView(view);
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(k kVar, m mVar) {
        return false;
    }

    public void dispatchApplyWindowInsets(@NonNull q0 q0Var) {
        int iD = q0Var.d();
        if (this.paddingTopDefault != iD) {
            this.paddingTopDefault = iD;
            updateTopPadding();
        }
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, q0Var.a());
        N.b(this.headerLayout, q0Var);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(k kVar, m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    @Nullable
    public m getCheckedItem() {
        return this.adapter.getCheckedItem();
    }

    @Px
    public int getDividerInsetEnd() {
        return this.dividerInsetEnd;
    }

    @Px
    public int getDividerInsetStart() {
        return this.dividerInsetStart;
    }

    public int getHeaderCount() {
        return this.headerLayout.getChildCount();
    }

    public View getHeaderView(int i7) {
        return this.headerLayout.getChildAt(i7);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.f22535id;
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.itemBackground;
    }

    public int getItemHorizontalPadding() {
        return this.itemHorizontalPadding;
    }

    public int getItemIconPadding() {
        return this.itemIconPadding;
    }

    public int getItemMaxLines() {
        return this.itemMaxLines;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.textColor;
    }

    @Nullable
    public ColorStateList getItemTintList() {
        return this.iconTintList;
    }

    @Px
    public int getItemVerticalPadding() {
        return this.itemVerticalPadding;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public MenuView getMenuView(ViewGroup viewGroup) {
        if (this.menuView == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.layoutInflater.inflate(R.layout.design_navigation_menu, viewGroup, false);
            this.menuView = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new NavigationMenuViewAccessibilityDelegate(this.menuView));
            if (this.adapter == null) {
                NavigationMenuAdapter navigationMenuAdapter = new NavigationMenuAdapter();
                this.adapter = navigationMenuAdapter;
                navigationMenuAdapter.setHasStableIds(true);
            }
            int i7 = this.overScrollMode;
            if (i7 != -1) {
                this.menuView.setOverScrollMode(i7);
            }
            LinearLayout linearLayout = (LinearLayout) this.layoutInflater.inflate(R.layout.design_navigation_item_header, (ViewGroup) this.menuView, false);
            this.headerLayout = linearLayout;
            linearLayout.setImportantForAccessibility(2);
            this.menuView.setAdapter(this.adapter);
        }
        return this.menuView;
    }

    @Px
    public int getSubheaderInsetEnd() {
        return this.subheaderInsetEnd;
    }

    @Px
    public int getSubheaderInsetStart() {
        return this.subheaderInsetStart;
    }

    public View inflateHeaderView(@LayoutRes int i7) {
        View viewInflate = this.layoutInflater.inflate(i7, (ViewGroup) this.headerLayout, false);
        addHeaderView(viewInflate);
        return viewInflate;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(@NonNull Context context, @NonNull k kVar) {
        this.layoutInflater = LayoutInflater.from(context);
        this.menu = kVar;
        this.paddingSeparator = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    public boolean isBehindStatusBar() {
        return this.isBehindStatusBar;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(k kVar, boolean z3) {
        MenuPresenter.Callback callback = this.callback;
        if (callback != null) {
            callback.onCloseMenu(kVar, z3);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(STATE_HIERARCHY);
            if (sparseParcelableArray != null) {
                this.menuView.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(STATE_ADAPTER);
            if (bundle2 != null) {
                this.adapter.restoreInstanceState(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray(STATE_HEADER);
            if (sparseParcelableArray2 != null) {
                this.headerLayout.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    @NonNull
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.menuView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.menuView.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray(STATE_HIERARCHY, sparseArray);
        }
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            bundle.putBundle(STATE_ADAPTER, navigationMenuAdapter.createInstanceState());
        }
        if (this.headerLayout != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.headerLayout.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(STATE_HEADER, sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(w wVar) {
        return false;
    }

    public void removeHeaderView(@NonNull View view) {
        this.headerLayout.removeView(view);
        if (hasHeader()) {
            return;
        }
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, this.paddingTopDefault, 0, navigationMenuView.getPaddingBottom());
    }

    public void setBehindStatusBar(boolean z3) {
        if (this.isBehindStatusBar != z3) {
            this.isBehindStatusBar = z3;
            updateTopPadding();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(MenuPresenter.Callback callback) {
        this.callback = callback;
    }

    public void setCheckedItem(@NonNull m mVar) {
        this.adapter.setCheckedItem(mVar);
    }

    public void setDividerInsetEnd(@Px int i7) {
        this.dividerInsetEnd = i7;
        updateAllDividerMenuItems();
    }

    public void setDividerInsetStart(@Px int i7) {
        this.dividerInsetStart = i7;
        updateAllDividerMenuItems();
    }

    public void setId(int i7) {
        this.f22535id = i7;
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.itemBackground = drawable;
        updateAllTextMenuItems();
    }

    public void setItemForeground(@Nullable RippleDrawable rippleDrawable) {
        this.itemForeground = rippleDrawable;
        updateAllTextMenuItems();
    }

    public void setItemHorizontalPadding(int i7) {
        this.itemHorizontalPadding = i7;
        updateAllTextMenuItems();
    }

    public void setItemIconPadding(int i7) {
        this.itemIconPadding = i7;
        updateAllTextMenuItems();
    }

    public void setItemIconSize(@Dimension int i7) {
        if (this.itemIconSize != i7) {
            this.itemIconSize = i7;
            this.hasCustomItemIconSize = true;
            updateAllTextMenuItems();
        }
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        updateAllTextMenuItems();
    }

    public void setItemMaxLines(int i7) {
        this.itemMaxLines = i7;
        updateAllTextMenuItems();
    }

    public void setItemTextAppearance(@StyleRes int i7) {
        this.textAppearance = i7;
        updateAllTextMenuItems();
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z3) {
        this.textAppearanceActiveBoldEnabled = z3;
        updateAllTextMenuItems();
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.textColor = colorStateList;
        updateAllTextMenuItems();
    }

    public void setItemVerticalPadding(@Px int i7) {
        this.itemVerticalPadding = i7;
        updateAllTextMenuItems();
    }

    public void setOverScrollMode(int i7) {
        this.overScrollMode = i7;
        NavigationMenuView navigationMenuView = this.menuView;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i7);
        }
    }

    public void setSubheaderColor(@Nullable ColorStateList colorStateList) {
        this.subheaderColor = colorStateList;
        updateAllSubHeaderMenuItems();
    }

    public void setSubheaderInsetEnd(@Px int i7) {
        this.subheaderInsetEnd = i7;
        updateAllSubHeaderMenuItems();
    }

    public void setSubheaderInsetStart(@Px int i7) {
        this.subheaderInsetStart = i7;
        updateAllSubHeaderMenuItems();
    }

    public void setSubheaderTextAppearance(@StyleRes int i7) {
        this.subheaderTextAppearance = i7;
        updateAllSubHeaderMenuItems();
    }

    public void setUpdateSuspended(boolean z3) {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.setUpdateSuspended(z3);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z3) {
        NavigationMenuAdapter navigationMenuAdapter = this.adapter;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.update();
        }
    }
}
