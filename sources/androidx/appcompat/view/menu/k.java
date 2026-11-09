package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.AbstractC1051c;
import androidx.core.view.O;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class k implements SupportMenu {
    private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final String PRESENTER_KEY = "android:menu:presenters";
    private static final String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder = {1, 4, 5, 3, 2, 0};
    private MenuBuilder$Callback mCallback;
    private final Context mContext;
    private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private m mExpandedItem;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mOverrideVisibleItems;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private int mDefaultShowAsAction = 0;
    private boolean mPreventDispatchingItemsChanged = false;
    private boolean mItemsChangedWhileDispatchPrevented = false;
    private boolean mStructureChangedWhileDispatchPrevented = false;
    private boolean mOptionalIconsVisible = false;
    private boolean mIsClosing = false;
    private ArrayList<m> mTempShortcutItemList = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<MenuPresenter>> mPresenters = new CopyOnWriteArrayList<>();
    private boolean mGroupDividerEnabled = false;
    private ArrayList<m> mItems = new ArrayList<>();
    private ArrayList<m> mVisibleItems = new ArrayList<>();
    private boolean mIsVisibleItemsStale = true;
    private ArrayList<m> mActionItems = new ArrayList<>();
    private ArrayList<m> mNonActionItems = new ArrayList<>();
    private boolean mIsActionItemsStale = true;

    public k(Context context) {
        this.mContext = context;
        this.mResources = context.getResources();
        c(true);
    }

    public final void a(int i7, boolean z3) {
        if (i7 < 0 || i7 >= this.mItems.size()) {
            return;
        }
        this.mItems.remove(i7);
        if (z3) {
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i7, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        int i13;
        PackageManager packageManager = this.mContext.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i12 & 1) == 0) {
            removeGroup(i7);
        }
        for (int i14 = 0; i14 < size; i14++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i14);
            int i15 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i15 < 0 ? intent : intentArr[i15]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i7, i10, i11, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i13 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i13] = intent3;
            }
        }
        return size;
    }

    public MenuItem addInternal(int i7, int i10, int i11, CharSequence charSequence) {
        int i12;
        int i13 = ((-65536) & i11) >> 16;
        if (i13 >= 0) {
            int[] iArr = sCategoryToOrder;
            if (i13 < iArr.length) {
                int i14 = (iArr[i13] << 16) | (65535 & i11);
                m mVar = new m(this, i7, i10, i11, i14, charSequence, this.mDefaultShowAsAction);
                ContextMenu.ContextMenuInfo contextMenuInfo = this.mCurrentMenuInfo;
                if (contextMenuInfo != null) {
                    mVar.f12441D = contextMenuInfo;
                }
                ArrayList<m> arrayList = this.mItems;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size).f12445d <= i14) {
                        i12 = size + 1;
                        arrayList.add(i12, mVar);
                        onItemsChanged(true);
                        return mVar;
                    }
                }
                i12 = 0;
                arrayList.add(i12, mVar);
                onItemsChanged(true);
                return mVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public void addMenuPresenter(MenuPresenter menuPresenter) {
        addMenuPresenter(menuPresenter, this.mContext);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(int i7, CharSequence charSequence, int i10, Drawable drawable, View view) {
        Resources resources = getResources();
        if (view != null) {
            this.mHeaderView = view;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        } else {
            if (i7 > 0) {
                this.mHeaderTitle = resources.getText(i7);
            } else if (charSequence != null) {
                this.mHeaderTitle = charSequence;
            }
            if (i10 > 0) {
                this.mHeaderIcon = getContext().getDrawable(i10);
            } else if (drawable != null) {
                this.mHeaderIcon = drawable;
            }
            this.mHeaderView = null;
        }
        onItemsChanged(false);
    }

    public final void c(boolean z3) {
        boolean zR;
        boolean z8 = false;
        if (z3 && this.mResources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(this.mContext);
            Context context = this.mContext;
            Method method = O.f16174a;
            if (Build.VERSION.SDK_INT >= 28) {
                zR = X.a.r(viewConfiguration);
            } else {
                Resources resources = context.getResources();
                int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zR = identifier != 0 && resources.getBoolean(identifier);
            }
            if (zR) {
                z8 = true;
            }
        }
        this.mShortcutsVisible = z8;
    }

    public void changeMenuMode() {
        MenuBuilder$Callback menuBuilder$Callback = this.mCallback;
        if (menuBuilder$Callback != null) {
            menuBuilder$Callback.onMenuModeChange(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        m mVar = this.mExpandedItem;
        if (mVar != null) {
            collapseItemActionView(mVar);
        }
        this.mItems.clear();
        onItemsChanged(true);
    }

    public void clearAll() {
        this.mPreventDispatchingItemsChanged = true;
        clear();
        clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        onItemsChanged(true);
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    public final void close(boolean z3) {
        if (this.mIsClosing) {
            return;
        }
        this.mIsClosing = true;
        for (WeakReference<MenuPresenter> weakReference : this.mPresenters) {
            MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter == null) {
                this.mPresenters.remove(weakReference);
            } else {
                menuPresenter.onCloseMenu(this, z3);
            }
        }
        this.mIsClosing = false;
    }

    public boolean collapseItemActionView(m mVar) {
        boolean zCollapseItemActionView = false;
        if (!this.mPresenters.isEmpty() && this.mExpandedItem == mVar) {
            stopDispatchingItemsChanged();
            for (WeakReference<MenuPresenter> weakReference : this.mPresenters) {
                MenuPresenter menuPresenter = weakReference.get();
                if (menuPresenter != null) {
                    zCollapseItemActionView = menuPresenter.collapseItemActionView(this, mVar);
                    if (zCollapseItemActionView) {
                        break;
                    }
                } else {
                    this.mPresenters.remove(weakReference);
                }
            }
            startDispatchingItemsChanged();
            if (zCollapseItemActionView) {
                this.mExpandedItem = null;
            }
        }
        return zCollapseItemActionView;
    }

    public boolean dispatchMenuItemSelected(@NonNull k kVar, @NonNull MenuItem menuItem) {
        MenuBuilder$Callback menuBuilder$Callback = this.mCallback;
        return menuBuilder$Callback != null && menuBuilder$Callback.onMenuItemSelected(kVar, menuItem);
    }

    public boolean expandItemActionView(m mVar) {
        boolean zExpandItemActionView = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        for (WeakReference<MenuPresenter> weakReference : this.mPresenters) {
            MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter != null) {
                zExpandItemActionView = menuPresenter.expandItemActionView(this, mVar);
                if (zExpandItemActionView) {
                    break;
                }
            } else {
                this.mPresenters.remove(weakReference);
            }
        }
        startDispatchingItemsChanged();
        if (zExpandItemActionView) {
            this.mExpandedItem = mVar;
        }
        return zExpandItemActionView;
    }

    public int findGroupIndex(int i7) {
        return findGroupIndex(i7, 0);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i7) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = this.mItems.get(i10);
            if (mVar.f12442a == i7) {
                return mVar;
            }
            if (mVar.hasSubMenu() && (menuItemFindItem = mVar.f12456o.findItem(i7)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i7) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.mItems.get(i10).f12442a == i7) {
                return i10;
            }
        }
        return -1;
    }

    public m findItemWithShortcutForKey(int i7, KeyEvent keyEvent) {
        ArrayList<m> arrayList = this.mTempShortcutItemList;
        arrayList.clear();
        findItemsWithShortcutForKey(arrayList, i7, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zIsQwertyMode = isQwertyMode();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = arrayList.get(i10);
            char c6 = zIsQwertyMode ? mVar.f12451j : mVar.f12449h;
            char[] cArr = keyData.meta;
            if ((c6 == cArr[0] && (metaState & 2) == 0) || ((c6 == cArr[2] && (metaState & 2) != 0) || (zIsQwertyMode && c6 == '\b' && i7 == 67))) {
                return mVar;
            }
        }
        return null;
    }

    public void findItemsWithShortcutForKey(List<m> list, int i7, KeyEvent keyEvent) {
        boolean zIsQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i7 == 67) {
            int size = this.mItems.size();
            for (int i10 = 0; i10 < size; i10++) {
                m mVar = this.mItems.get(i10);
                if (mVar.hasSubMenu()) {
                    mVar.f12456o.findItemsWithShortcutForKey(list, i7, keyEvent);
                }
                char c6 = zIsQwertyMode ? mVar.f12451j : mVar.f12449h;
                if ((modifiers & 69647) == ((zIsQwertyMode ? mVar.f12452k : mVar.f12450i) & 69647) && c6 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c6 == cArr[0] || c6 == cArr[2] || (zIsQwertyMode && c6 == '\b' && i7 == 67)) && mVar.isEnabled()) {
                        list.add(mVar);
                    }
                }
            }
        }
    }

    public void flagActionItems() {
        ArrayList<m> visibleItems = getVisibleItems();
        if (this.mIsActionItemsStale) {
            boolean zFlagActionItems = false;
            for (WeakReference<MenuPresenter> weakReference : this.mPresenters) {
                MenuPresenter menuPresenter = weakReference.get();
                if (menuPresenter == null) {
                    this.mPresenters.remove(weakReference);
                } else {
                    zFlagActionItems |= menuPresenter.flagActionItems();
                }
            }
            if (zFlagActionItems) {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                int size = visibleItems.size();
                for (int i7 = 0; i7 < size; i7++) {
                    m mVar = visibleItems.get(i7);
                    if ((mVar.f12464x & 32) == 32) {
                        this.mActionItems.add(mVar);
                    } else {
                        this.mNonActionItems.add(mVar);
                    }
                }
            } else {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                this.mNonActionItems.addAll(getVisibleItems());
            }
            this.mIsActionItemsStale = false;
        }
    }

    public ArrayList<m> getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    public String getActionViewStatesKey() {
        return ACTION_VIEW_STATES_KEY;
    }

    public Context getContext() {
        return this.mContext;
    }

    public m getExpandedItem() {
        return this.mExpandedItem;
    }

    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i7) {
        return this.mItems.get(i7);
    }

    public ArrayList<m> getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    public boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    public Resources getResources() {
        return this.mResources;
    }

    public k getRootMenu() {
        return this;
    }

    @NonNull
    public ArrayList<m> getVisibleItems() {
        if (!this.mIsVisibleItemsStale) {
            return this.mVisibleItems;
        }
        this.mVisibleItems.clear();
        int size = this.mItems.size();
        for (int i7 = 0; i7 < size; i7++) {
            m mVar = this.mItems.get(i7);
            if (mVar.isVisible()) {
                this.mVisibleItems.add(mVar);
            }
        }
        this.mIsVisibleItemsStale = false;
        this.mIsActionItemsStale = true;
        return this.mVisibleItems;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.mItems.get(i7).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isDispatchingItemsChanged() {
        return !this.mPreventDispatchingItemsChanged;
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    public boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return findItemWithShortcutForKey(i7, keyEvent) != null;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    public void onItemActionRequestChanged(m mVar) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemVisibleChanged(m mVar) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemsChanged(boolean z3) {
        if (this.mPreventDispatchingItemsChanged) {
            this.mItemsChangedWhileDispatchPrevented = true;
            if (z3) {
                this.mStructureChangedWhileDispatchPrevented = true;
                return;
            }
            return;
        }
        if (z3) {
            this.mIsVisibleItemsStale = true;
            this.mIsActionItemsStale = true;
        }
        if (this.mPresenters.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        for (WeakReference<MenuPresenter> weakReference : this.mPresenters) {
            MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter == null) {
                this.mPresenters.remove(weakReference);
            } else {
                menuPresenter.updateMenuView(z3);
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i7, int i10) {
        return performItemAction(findItem(i7), i10);
    }

    public boolean performItemAction(MenuItem menuItem, int i7) {
        return performItemAction(menuItem, null, i7);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i7, KeyEvent keyEvent, int i10) {
        m mVarFindItemWithShortcutForKey = findItemWithShortcutForKey(i7, keyEvent);
        boolean zPerformItemAction = mVarFindItemWithShortcutForKey != null ? performItemAction(mVarFindItemWithShortcutForKey, i10) : false;
        if ((i10 & 2) != 0) {
            close(true);
        }
        return zPerformItemAction;
    }

    @Override // android.view.Menu
    public void removeGroup(int i7) {
        int iFindGroupIndex = findGroupIndex(i7);
        if (iFindGroupIndex >= 0) {
            int size = this.mItems.size() - iFindGroupIndex;
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i10 >= size || this.mItems.get(iFindGroupIndex).f12443b != i7) {
                    break;
                }
                a(iFindGroupIndex, false);
                i10 = i11;
            }
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i7) {
        a(findItemIndex(i7), true);
    }

    public void removeItemAt(int i7) {
        a(i7, true);
    }

    public void removeMenuPresenter(MenuPresenter menuPresenter) {
        for (WeakReference<MenuPresenter> weakReference : this.mPresenters) {
            MenuPresenter menuPresenter2 = weakReference.get();
            if (menuPresenter2 == null || menuPresenter2 == menuPresenter) {
                this.mPresenters.remove(weakReference);
            }
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((w) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i10 = bundle.getInt(EXPANDED_ACTION_VIEW_ID);
        if (i10 <= 0 || (menuItemFindItem = findItem(i10)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void restorePresenterStates(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(PRESENTER_KEY);
        if (sparseParcelableArray == null || this.mPresenters.isEmpty()) {
            return;
        }
        for (WeakReference<MenuPresenter> weakReference : this.mPresenters) {
            MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter == null) {
                this.mPresenters.remove(weakReference);
            } else {
                int id2 = menuPresenter.getId();
                if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                    menuPresenter.onRestoreInstanceState(parcelable);
                }
            }
        }
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(EXPANDED_ACTION_VIEW_ID, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((w) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void savePresenterStates(Bundle bundle) {
        Parcelable parcelableOnSaveInstanceState;
        if (this.mPresenters.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<MenuPresenter> weakReference : this.mPresenters) {
            MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter == null) {
                this.mPresenters.remove(weakReference);
            } else {
                int id2 = menuPresenter.getId();
                if (id2 > 0 && (parcelableOnSaveInstanceState = menuPresenter.onSaveInstanceState()) != null) {
                    sparseArray.put(id2, parcelableOnSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray(PRESENTER_KEY, sparseArray);
    }

    public void setCallback(MenuBuilder$Callback menuBuilder$Callback) {
        this.mCallback = menuBuilder$Callback;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mCurrentMenuInfo = contextMenuInfo;
    }

    public k setDefaultShowAsAction(int i7) {
        this.mDefaultShowAsAction = i7;
        return this;
    }

    public void setExclusiveItemChecked(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        stopDispatchingItemsChanged();
        for (int i7 = 0; i7 < size; i7++) {
            m mVar = this.mItems.get(i7);
            if (mVar.f12443b == groupId && (mVar.f12464x & 4) != 0 && mVar.isCheckable()) {
                boolean z3 = mVar == menuItem;
                int i10 = mVar.f12464x;
                int i11 = (z3 ? 2 : 0) | (i10 & (-3));
                mVar.f12464x = i11;
                if (i10 != i11) {
                    mVar.f12455n.onItemsChanged(false);
                }
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i7, boolean z3, boolean z8) {
        int size = this.mItems.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = this.mItems.get(i10);
            if (mVar.f12443b == i7) {
                mVar.d(z8);
                mVar.setCheckable(z3);
            }
        }
    }

    @Override // androidx.core.internal.view.SupportMenu, android.view.Menu
    public void setGroupDividerEnabled(boolean z3) {
        this.mGroupDividerEnabled = z3;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i7, boolean z3) {
        int size = this.mItems.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = this.mItems.get(i10);
            if (mVar.f12443b == i7) {
                mVar.setEnabled(z3);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i7, boolean z3) {
        int size = this.mItems.size();
        boolean z8 = false;
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = this.mItems.get(i10);
            if (mVar.f12443b == i7) {
                int i11 = mVar.f12464x;
                int i12 = (i11 & (-9)) | (z3 ? 0 : 8);
                mVar.f12464x = i12;
                if (i11 != i12) {
                    z8 = true;
                }
            }
        }
        if (z8) {
            onItemsChanged(true);
        }
    }

    public k setHeaderIconInt(Drawable drawable) {
        b(0, null, 0, drawable, null);
        return this;
    }

    public k setHeaderTitleInt(CharSequence charSequence) {
        b(0, charSequence, 0, null, null);
        return this;
    }

    public k setHeaderViewInt(View view) {
        b(0, null, 0, null, view);
        return this;
    }

    public void setOptionalIconsVisible(boolean z3) {
        this.mOptionalIconsVisible = z3;
    }

    public void setOverrideVisibleItems(boolean z3) {
        this.mOverrideVisibleItems = z3;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.mQwertyMode = z3;
        onItemsChanged(false);
    }

    public void setShortcutsVisible(boolean z3) {
        if (this.mShortcutsVisible == z3) {
            return;
        }
        c(z3);
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.mItems.size();
    }

    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }

    public void stopDispatchingItemsChanged() {
        if (this.mPreventDispatchingItemsChanged) {
            return;
        }
        this.mPreventDispatchingItemsChanged = true;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
    }

    @Override // android.view.Menu
    public MenuItem add(int i7) {
        return addInternal(0, 0, 0, this.mResources.getString(i7));
    }

    public void addMenuPresenter(MenuPresenter menuPresenter, Context context) {
        this.mPresenters.add(new WeakReference<>(menuPresenter));
        menuPresenter.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7) {
        return addSubMenu(0, 0, 0, this.mResources.getString(i7));
    }

    public int findGroupIndex(int i7, int i10) {
        int size = size();
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < size) {
            if (this.mItems.get(i10).f12443b == i7) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00c1 A[SYNTHETIC] */
    public boolean performItemAction(MenuItem menuItem, MenuPresenter menuPresenter, int i7) {
        AbstractC1051c abstractC1051c;
        boolean zExpandActionView;
        AbstractC1051c abstractC1051c2;
        boolean z3;
        w wVar;
        MenuPresenter menuPresenter2;
        m mVar = (m) menuItem;
        boolean zOnSubMenuSelected = false;
        if (mVar == null || !mVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = mVar.f12457p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(mVar)) {
            k kVar = mVar.f12455n;
            if (kVar.dispatchMenuItemSelected(kVar, mVar)) {
                zExpandActionView = true;
            } else if (mVar.f12448g != null) {
                try {
                    kVar.getContext().startActivity(mVar.f12448g);
                } catch (ActivityNotFoundException e10) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
                    abstractC1051c = mVar.f12438A;
                    if (abstractC1051c == null) {
                    }
                    zExpandActionView = false;
                    abstractC1051c2 = mVar.f12438A;
                    if (abstractC1051c2 == null) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (mVar.c()) {
                        zExpandActionView |= mVar.expandActionView();
                        if (zExpandActionView) {
                            close(true);
                        }
                    } else if (mVar.hasSubMenu()) {
                        if ((i7 & 4) == 0) {
                            close(false);
                        }
                        if (!mVar.hasSubMenu()) {
                            w wVar2 = new w(getContext(), this, mVar);
                            mVar.f12456o = wVar2;
                            wVar2.setHeaderTitle(mVar.f12446e);
                        }
                        wVar = mVar.f12456o;
                        if (z3) {
                            n nVar = (n) abstractC1051c2;
                            nVar.f12468c.onPrepareSubMenu(nVar.f12469d.d(wVar));
                        }
                        if (!this.mPresenters.isEmpty()) {
                            if (menuPresenter != null) {
                            }
                            for (WeakReference<MenuPresenter> weakReference : this.mPresenters) {
                                menuPresenter2 = weakReference.get();
                                if (menuPresenter2 == null) {
                                    this.mPresenters.remove(weakReference);
                                } else if (!zOnSubMenuSelected) {
                                    zOnSubMenuSelected = menuPresenter2.onSubMenuSelected(wVar);
                                }
                            }
                        }
                        zExpandActionView |= zOnSubMenuSelected;
                        if (!zExpandActionView) {
                            close(true);
                        }
                    } else {
                        if ((i7 & 4) == 0) {
                            close(false);
                        }
                        if (!mVar.hasSubMenu()) {
                            w wVar3 = new w(getContext(), this, mVar);
                            mVar.f12456o = wVar3;
                            wVar3.setHeaderTitle(mVar.f12446e);
                        }
                        wVar = mVar.f12456o;
                        if (z3) {
                            n nVar2 = (n) abstractC1051c2;
                            nVar2.f12468c.onPrepareSubMenu(nVar2.f12469d.d(wVar));
                        }
                        if (!this.mPresenters.isEmpty()) {
                            zOnSubMenuSelected = menuPresenter != null ? menuPresenter.onSubMenuSelected(wVar) : false;
                            while (r8.hasNext()) {
                                menuPresenter2 = weakReference.get();
                                if (menuPresenter2 == null) {
                                    this.mPresenters.remove(weakReference);
                                } else if (!zOnSubMenuSelected) {
                                    zOnSubMenuSelected = menuPresenter2.onSubMenuSelected(wVar);
                                }
                            }
                        }
                        zExpandActionView |= zOnSubMenuSelected;
                        if (!zExpandActionView) {
                            close(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                abstractC1051c = mVar.f12438A;
                if (abstractC1051c == null && ((n) abstractC1051c).f12468c.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        abstractC1051c2 = mVar.f12438A;
        if (abstractC1051c2 == null && ((n) abstractC1051c2).f12468c.hasSubMenu()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (mVar.c()) {
            zExpandActionView |= mVar.expandActionView();
            if (zExpandActionView) {
                close(true);
            }
        } else if (mVar.hasSubMenu() || z3) {
            if ((i7 & 4) == 0) {
                close(false);
            }
            if (!mVar.hasSubMenu()) {
                w wVar4 = new w(getContext(), this, mVar);
                mVar.f12456o = wVar4;
                wVar4.setHeaderTitle(mVar.f12446e);
            }
            wVar = mVar.f12456o;
            if (z3) {
                n nVar3 = (n) abstractC1051c2;
                nVar3.f12468c.onPrepareSubMenu(nVar3.f12469d.d(wVar));
            }
            if (!this.mPresenters.isEmpty()) {
                if (menuPresenter != null) {
                }
                while (r8.hasNext()) {
                    menuPresenter2 = weakReference.get();
                    if (menuPresenter2 == null) {
                        this.mPresenters.remove(weakReference);
                    } else if (!zOnSubMenuSelected) {
                        zOnSubMenuSelected = menuPresenter2.onSubMenuSelected(wVar);
                    }
                }
            }
            zExpandActionView |= zOnSubMenuSelected;
            if (!zExpandActionView) {
                close(true);
            }
        } else if ((i7 & 1) == 0) {
            close(true);
        }
        return zExpandActionView;
    }

    public k setHeaderIconInt(int i7) {
        b(0, null, i7, null, null);
        return this;
    }

    public k setHeaderTitleInt(int i7) {
        b(i7, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(int i7, int i10, int i11, CharSequence charSequence) {
        return addInternal(i7, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7, int i10, int i11, CharSequence charSequence) {
        m mVar = (m) addInternal(i7, i10, i11, charSequence);
        w wVar = new w(this.mContext, this, mVar);
        mVar.f12456o = wVar;
        wVar.setHeaderTitle(mVar.f12446e);
        return wVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i7, int i10, int i11, int i12) {
        return addInternal(i7, i10, i11, this.mResources.getString(i12));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7, int i10, int i11, int i12) {
        return addSubMenu(i7, i10, i11, this.mResources.getString(i12));
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }
}
