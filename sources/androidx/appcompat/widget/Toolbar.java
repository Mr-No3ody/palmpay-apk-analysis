package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.MainThread;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.ActionBar$LayoutParams;
import androidx.appcompat.view.menu.MenuBuilder$Callback;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.view.C1063o;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.customview.view.AbsSavedState;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.material.navigation.NavigationBarView;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements MenuHost {
    private static final String TAG = "Toolbar";
    private MenuPresenter.Callback mActionMenuPresenterCallback;
    private OnBackInvokedCallback mBackInvokedCallback;
    private boolean mBackInvokedCallbackEnabled;
    private OnBackInvokedDispatcher mBackInvokedDispatcher;
    int mButtonGravity;
    ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private D0 mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private e1 mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    MenuBuilder$Callback mMenuBuilderCallback;
    final C1063o mMenuHostHelper;
    ActionMenuView mMenuView;
    private final ActionMenuView.OnMenuItemClickListener mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    OnMenuItemClickListener mOnMenuItemClickListener;
    private C0868l mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private ArrayList<MenuItem> mProvidedMenuItems;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private ColorStateList mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private ColorStateList mTitleTextColor;
    private TextView mTitleTextView;
    private i1 mWrapper;

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new f1();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f12831b;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12830a = parcel.readInt();
            this.f12831b = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f12830a);
            parcel.writeInt(this.f12831b ? 1 : 0);
        }
    }

    public Toolbar(@NonNull Context context) {
        this(context, null);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i7 = 0; i7 < menu.size(); i7++) {
            arrayList.add(menu.getItem(i7));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new p343x.f(getContext());
    }

    public static int h(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i7, List list) {
        boolean z3 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, getLayoutDirection());
        list.clear();
        if (!z3) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f12829b == 0 && o(childAt)) {
                    int i11 = layoutParams.f12075a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        list.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f12829b == 0 && o(childAt2)) {
                int i13 = layoutParams2.f12075a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i13, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    list.add(childAt2);
                }
            }
        }
    }

    public void addChildrenForExpandedActionView() {
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            addView(this.mHiddenViews.get(size));
        }
        this.mHiddenViews.clear();
    }

    @Override // androidx.core.view.MenuHost
    @MainThread
    public void addMenuProvider(@NonNull MenuProvider menuProvider) {
        C1063o c1063o = this.mMenuHostHelper;
        c1063o.f16269b.add(menuProvider);
        c1063o.f16268a.run();
    }

    public final void b(View view, boolean z3) {
        LayoutParams layoutParamsGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParamsGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            layoutParamsGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (LayoutParams) layoutParams;
        }
        layoutParamsGenerateLayoutParams.f12829b = 1;
        if (!z3 || this.mExpandedActionView == null) {
            addView(view, layoutParamsGenerateLayoutParams);
        } else {
            view.setLayoutParams(layoutParamsGenerateLayoutParams);
            this.mHiddenViews.add(view);
        }
    }

    public final void c() {
        if (this.mContentInsets == null) {
            D0 d1 = new D0();
            d1.f12650a = 0;
            d1.f12651b = 0;
            d1.f12652c = Integer.MIN_VALUE;
            d1.f12653d = Integer.MIN_VALUE;
            d1.f12654e = 0;
            d1.f12655f = 0;
            d1.f12656g = false;
            d1.f12657h = false;
            this.mContentInsets = d1;
        }
    }

    @RestrictTo({p192n.c.f39802c})
    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.mMenuView) != null && actionMenuView.f12576d;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public void collapseActionView() {
        e1 e1Var = this.mExpandedMenuPresenter;
        androidx.appcompat.view.menu.m mVar = e1Var == null ? null : e1Var.f12898b;
        if (mVar != null) {
            mVar.collapseActionView();
        }
    }

    public final void d() {
        e();
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView.f12573a == null) {
            androidx.appcompat.view.menu.k kVar = (androidx.appcompat.view.menu.k) actionMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new e1(this);
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            kVar.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    public void dismissPopupMenus() {
        C0868l c0868l;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || (c0868l = actionMenuView.f12577e) == null) {
            return;
        }
        c0868l.b();
        C0854e c0854e = c0868l.f12948Q;
        if (c0854e != null) {
            c0854e.dismiss();
        }
    }

    public final void e() {
        if (this.mMenuView == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.mMenuView = actionMenuView;
            actionMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            ActionMenuView actionMenuView2 = this.mMenuView;
            MenuPresenter.Callback callback = this.mActionMenuPresenterCallback;
            c1 c1Var = new c1(this);
            actionMenuView2.f12578f = callback;
            actionMenuView2.f12579g = c1Var;
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.f12075a = (this.mButtonGravity & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR) | 8388613;
            this.mMenuView.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            b(this.mMenuView, false);
        }
    }

    public void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, p241q.a.toolbarNavigationButtonStyle);
            this.mCollapseButtonView = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.f12075a = (this.mButtonGravity & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR) | 8388611;
            layoutParamsGenerateDefaultLayoutParams.f12829b = 2;
            this.mCollapseButtonView.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new ViewOnClickListenerC0850c(this, 1));
        }
    }

    public final void f() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new AppCompatImageButton(getContext(), null, p241q.a.toolbarNavigationButtonStyle);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.f12075a = (this.mButtonGravity & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR) | 8388611;
            this.mNavButtonView.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
        }
    }

    public final int g(int i7, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i7 > 0 ? (measuredHeight - i7) / 2 : 0;
        int i11 = layoutParams.f12075a & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR;
        if (i11 != 16 && i11 != 48 && i11 != 80) {
            i11 = this.mGravity & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR;
        }
        if (i11 == 48) {
            return getPaddingTop() - i10;
        }
        if (i11 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i10;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    @Nullable
    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        D0 d1 = this.mContentInsets;
        if (d1 != null) {
            return d1.f12656g ? d1.f12650a : d1.f12651b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i7 = this.mContentInsetEndWithActions;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        D0 d1 = this.mContentInsets;
        if (d1 != null) {
            return d1.f12650a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        D0 d1 = this.mContentInsets;
        if (d1 != null) {
            return d1.f12651b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        D0 d1 = this.mContentInsets;
        if (d1 != null) {
            return d1.f12656g ? d1.f12651b : d1.f12650a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i7 = this.mContentInsetStartWithNavigation;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.k kVar;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (kVar = actionMenuView.f12573a) == null || !kVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        d();
        return this.mMenuView.getMenu();
    }

    @Nullable
    @VisibleForTesting
    public View getNavButtonView() {
        return this.mNavButtonView;
    }

    @Nullable
    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public C0868l getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        d();
        return this.mMenuView.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.mPopupContext;
    }

    @StyleRes
    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    @Nullable
    @VisibleForTesting
    public final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    @Nullable
    @VisibleForTesting
    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    @RestrictTo({p192n.c.f39802c})
    public DecorToolbar getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new i1(this, true);
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        e1 e1Var = this.mExpandedMenuPresenter;
        return (e1Var == null || e1Var.f12898b == null) ? false : true;
    }

    public boolean hideOverflowMenu() {
        C0868l c0868l;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (c0868l = actionMenuView.f12577e) == null || !c0868l.b()) ? false : true;
    }

    public void inflateMenu(@MenuRes int i7) {
        getMenuInflater().inflate(i7, getMenu());
    }

    @Override // androidx.core.view.MenuHost
    @MainThread
    public void invalidateMenu() {
        Iterator<MenuItem> it = this.mProvidedMenuItems.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        C1063o c1063o = this.mMenuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = c1063o.f16269b.iterator();
        while (it2.hasNext()) {
            ((MenuProvider) it2.next()).onCreateMenu(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.mProvidedMenuItems = currentMenuItems2;
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.mBackInvokedCallbackEnabled;
    }

    @RestrictTo({p192n.c.f39802c})
    public boolean isOverflowMenuShowPending() {
        C0868l c0868l;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || (c0868l = actionMenuView.f12577e) == null) {
            return false;
        }
        return c0868l.f12949X != null || c0868l.c();
    }

    public boolean isOverflowMenuShowing() {
        C0868l c0868l;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (c0868l = actionMenuView.f12577e) == null || !c0868l.c()) ? false : true;
    }

    @RestrictTo({p192n.c.f39802c})
    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i7 = 0; i7 < lineCount; i7++) {
            if (layout.getEllipsisCount(i7) > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    public final int k(View view, int i7, int i10, int[] iArr) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int iMax = Math.max(0, i11) + i7;
        iArr[0] = Math.max(0, -i11);
        int iG = g(i10, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iG, iMax + measuredWidth, view.getMeasuredHeight() + iG);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + iMax;
    }

    public final int l(View view, int i7, int i10, int[] iArr) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int iMax = i7 - Math.max(0, i11);
        iArr[1] = Math.max(0, -i11);
        int iG = g(i10, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iG, iMax, view.getMeasuredHeight() + iG);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    public final int m(View view, int i7, int i10, int i11, int i12, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = marginLayoutParams.leftMargin - iArr[0];
        int i14 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i13);
        iArr[1] = Math.max(0, -i14);
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + iMax + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void n(View view, int i7, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean o(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBackInvokedCallbackState();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
        updateBackInvokedCallbackState();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0280  */
    /* JADX WARN: Code duplicated, block: B:103:0x0293 A[LOOP:0: B:102:0x0291->B:103:0x0293, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02b1 A[LOOP:1: B:105:0x02af->B:106:0x02b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02d8 A[LOOP:2: B:108:0x02d6->B:109:0x02d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x031b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x031d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0321  */
    /* JADX WARN: Code duplicated, block: B:118:0x032b A[LOOP:3: B:117:0x0329->B:118:0x032b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:54:0x0143  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x017b  */
    /* JADX WARN: Code duplicated, block: B:68:0x017e  */
    /* JADX WARN: Code duplicated, block: B:70:0x018a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0196  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01af  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x0210  */
    /* JADX WARN: Code duplicated, block: B:86:0x0213  */
    /* JADX WARN: Code duplicated, block: B:88:0x021b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x021d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0221  */
    /* JADX WARN: Code duplicated, block: B:94:0x0235  */
    /* JADX WARN: Code duplicated, block: B:95:0x0258  */
    /* JADX WARN: Code duplicated, block: B:97:0x025b  */
    /* JADX WARN: Code duplicated, block: B:98:0x027d  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        int iK;
        int iL;
        int iMax;
        int iMin;
        boolean zO;
        boolean zO2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i13;
        boolean z8;
        int i14;
        int i15;
        int paddingTop;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int iMax2;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int size;
        int i27;
        int size2;
        int i28;
        ArrayList<View> arrayList;
        int size3;
        int i29;
        int i30;
        int i31;
        int measuredWidth;
        int i32;
        int i33;
        int size4;
        int i34;
        boolean z10 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i35 = width - paddingRight;
        int[] iArr = this.mTempMargins;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i12 - i10) : 0;
        if (o(this.mNavButtonView)) {
            if (z10) {
                iL = l(this.mNavButtonView, i35, iMin2, iArr);
                iK = paddingLeft;
            } else {
                iK = k(this.mNavButtonView, paddingLeft, iMin2, iArr);
            }
            if (o(this.mCollapseButtonView)) {
                if (z10) {
                    iL = l(this.mCollapseButtonView, iL, iMin2, iArr);
                } else {
                    iK = k(this.mCollapseButtonView, iK, iMin2, iArr);
                }
            }
            if (o(this.mMenuView)) {
                if (z10) {
                    iK = k(this.mMenuView, iK, iMin2, iArr);
                } else {
                    iL = l(this.mMenuView, iL, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iK);
            iArr[1] = Math.max(0, currentContentInsetRight - (i35 - iL));
            iMax = Math.max(iK, currentContentInsetLeft);
            iMin = Math.min(iL, i35 - currentContentInsetRight);
            if (o(this.mExpandedActionView)) {
                if (z10) {
                    iMin = l(this.mExpandedActionView, iMin, iMin2, iArr);
                } else {
                    iMax = k(this.mExpandedActionView, iMax, iMin2, iArr);
                }
            }
            if (o(this.mLogoView)) {
                if (z10) {
                    iMin = l(this.mLogoView, iMin, iMin2, iArr);
                } else {
                    iMax = k(this.mLogoView, iMax, iMin2, iArr);
                }
            }
            zO = o(this.mTitleTextView);
            zO2 = o(this.mSubtitleTextView);
            if (zO) {
                LayoutParams layoutParams3 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                measuredHeight = this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zO2) {
                LayoutParams layoutParams4 = (LayoutParams) this.mSubtitleTextView.getLayoutParams();
                measuredHeight = this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin + measuredHeight;
            }
            if (zO || zO2) {
                if (zO) {
                    textView = this.mTitleTextView;
                } else {
                    textView = this.mSubtitleTextView;
                }
                if (zO2) {
                    textView2 = this.mSubtitleTextView;
                } else {
                    textView2 = this.mTitleTextView;
                }
                layoutParams = (LayoutParams) textView.getLayoutParams();
                layoutParams2 = (LayoutParams) textView2.getLayoutParams();
                i13 = measuredHeight;
                z8 = (!zO && this.mTitleTextView.getMeasuredWidth() > 0) || (zO2 && this.mSubtitleTextView.getMeasuredWidth() > 0);
                i14 = this.mGravity & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR;
                i15 = iMax;
                if (i14 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.mTitleMarginTop;
                } else if (i14 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i13) / 2;
                    i22 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    i23 = this.mTitleMarginTop;
                    if (iMax2 < i22 + i23) {
                        iMax2 = i22 + i23;
                    } else {
                        i24 = (((height - paddingBottom) - i13) - iMax2) - paddingTop2;
                        i25 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        i26 = this.mTitleMarginBottom;
                        if (i24 < i25 + i26) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i26) - i24));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.mTitleMarginBottom) - i13;
                }
                if (z10) {
                    if (z8) {
                        i19 = this.mTitleMarginStart;
                    } else {
                        i19 = 0;
                    }
                    int i36 = i19 - iArr[1];
                    iMin -= Math.max(0, i36);
                    iArr[1] = Math.max(0, -i36);
                    if (zO) {
                        LayoutParams layoutParams5 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                        int measuredWidth2 = iMin - this.mTitleTextView.getMeasuredWidth();
                        int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i20 = measuredWidth2 - this.mTitleMarginEnd;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin;
                    } else {
                        i20 = iMin;
                    }
                    if (zO2) {
                        int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i37, iMin, this.mSubtitleTextView.getMeasuredHeight() + i37);
                        i21 = iMin - this.mTitleMarginEnd;
                    } else {
                        i21 = iMin;
                    }
                    if (z8) {
                        iMin = Math.min(i20, i21);
                    }
                    iMax = i15;
                } else {
                    if (z8) {
                        i16 = this.mTitleMarginStart;
                    } else {
                        i16 = 0;
                    }
                    int i38 = i16 - iArr[0];
                    iMax = Math.max(0, i38) + i15;
                    iArr[0] = Math.max(0, -i38);
                    if (zO) {
                        LayoutParams layoutParams6 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                        int measuredWidth3 = this.mTitleTextView.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i17 = measuredWidth3 + this.mTitleMarginEnd;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin;
                    } else {
                        i17 = iMax;
                    }
                    if (zO2) {
                        int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.mSubtitleTextView.getMeasuredWidth() + iMax;
                        this.mSubtitleTextView.layout(iMax, i39, measuredWidth4, this.mSubtitleTextView.getMeasuredHeight() + i39);
                        i18 = measuredWidth4 + this.mTitleMarginEnd;
                    } else {
                        i18 = iMax;
                    }
                    if (z8) {
                        iMax = Math.max(i17, i18);
                    }
                }
            }
            a(3, this.mTempViews);
            size = this.mTempViews.size();
            for (i27 = 0; i27 < size; i27++) {
                iMax = k(this.mTempViews.get(i27), iMax, iMin2, iArr);
            }
            a(5, this.mTempViews);
            size2 = this.mTempViews.size();
            for (i28 = 0; i28 < size2; i28++) {
                iMin = l(this.mTempViews.get(i28), iMin, iMin2, iArr);
            }
            a(1, this.mTempViews);
            arrayList = this.mTempViews;
            int i40 = iArr[0];
            int i41 = iArr[1];
            size3 = arrayList.size();
            i29 = i41;
            i30 = i40;
            i31 = 0;
            measuredWidth = 0;
            while (i31 < size3) {
                View view = arrayList.get(i31);
                LayoutParams layoutParams7 = (LayoutParams) view.getLayoutParams();
                ArrayList<View> arrayList2 = arrayList;
                int i42 = ((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin - i30;
                int i43 = ((ViewGroup.MarginLayoutParams) layoutParams7).rightMargin - i29;
                int iMax3 = Math.max(0, i42);
                int iMax4 = Math.max(0, i43);
                int iMax5 = Math.max(0, -i42);
                int iMax6 = Math.max(0, -i43);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i31++;
                i29 = iMax6;
                i30 = iMax5;
                arrayList = arrayList2;
            }
            i32 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i33 = measuredWidth + i32;
            if (i32 >= iMax) {
                if (i33 > iMin) {
                    iMax = i32 - (i33 - iMin);
                } else {
                    iMax = i32;
                }
            }
            size4 = this.mTempViews.size();
            for (i34 = 0; i34 < size4; i34++) {
                iMax = k(this.mTempViews.get(i34), iMax, iMin2, iArr);
            }
            this.mTempViews.clear();
        }
        iK = paddingLeft;
        iL = i35;
        if (o(this.mCollapseButtonView)) {
            if (z10) {
                iL = l(this.mCollapseButtonView, iL, iMin2, iArr);
            } else {
                iK = k(this.mCollapseButtonView, iK, iMin2, iArr);
            }
        }
        if (o(this.mMenuView)) {
            if (z10) {
                iK = k(this.mMenuView, iK, iMin2, iArr);
            } else {
                iL = l(this.mMenuView, iL, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iK);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i35 - iL));
        iMax = Math.max(iK, currentContentInsetLeft2);
        iMin = Math.min(iL, i35 - currentContentInsetRight2);
        if (o(this.mExpandedActionView)) {
            if (z10) {
                iMin = l(this.mExpandedActionView, iMin, iMin2, iArr);
            } else {
                iMax = k(this.mExpandedActionView, iMax, iMin2, iArr);
            }
        }
        if (o(this.mLogoView)) {
            if (z10) {
                iMin = l(this.mLogoView, iMin, iMin2, iArr);
            } else {
                iMax = k(this.mLogoView, iMax, iMin2, iArr);
            }
        }
        zO = o(this.mTitleTextView);
        zO2 = o(this.mSubtitleTextView);
        if (zO) {
            LayoutParams layoutParams8 = (LayoutParams) this.mTitleTextView.getLayoutParams();
            measuredHeight = this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zO2) {
            LayoutParams layoutParams9 = (LayoutParams) this.mSubtitleTextView.getLayoutParams();
            measuredHeight = this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams9).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams9).bottomMargin + measuredHeight;
        }
        if (zO) {
            if (zO) {
                textView = this.mTitleTextView;
            } else {
                textView = this.mSubtitleTextView;
            }
            if (zO2) {
                textView2 = this.mSubtitleTextView;
            } else {
                textView2 = this.mTitleTextView;
            }
            layoutParams = (LayoutParams) textView.getLayoutParams();
            layoutParams2 = (LayoutParams) textView2.getLayoutParams();
            i13 = measuredHeight;
            if (zO) {
            }
            i14 = this.mGravity & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR;
            i15 = iMax;
            if (i14 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.mTitleMarginTop;
            } else if (i14 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i13) / 2;
                i22 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                i23 = this.mTitleMarginTop;
                if (iMax2 < i22 + i23) {
                    iMax2 = i22 + i23;
                } else {
                    i24 = (((height - paddingBottom) - i13) - iMax2) - paddingTop2;
                    i25 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    i26 = this.mTitleMarginBottom;
                    if (i24 < i25 + i26) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i26) - i24));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.mTitleMarginBottom) - i13;
            }
            if (z10) {
                if (z8) {
                    i19 = this.mTitleMarginStart;
                } else {
                    i19 = 0;
                }
                int i310 = i19 - iArr[1];
                iMin -= Math.max(0, i310);
                iArr[1] = Math.max(0, -i310);
                if (zO) {
                    LayoutParams layoutParams10 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                    int measuredWidth5 = iMin - this.mTitleTextView.getMeasuredWidth();
                    int measuredHeight4 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i20 = measuredWidth5 - this.mTitleMarginEnd;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) layoutParams10).bottomMargin;
                } else {
                    i20 = iMin;
                }
                if (zO2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i311, iMin, this.mSubtitleTextView.getMeasuredHeight() + i311);
                    i21 = iMin - this.mTitleMarginEnd;
                } else {
                    i21 = iMin;
                }
                if (z8) {
                    iMin = Math.min(i20, i21);
                }
                iMax = i15;
            } else {
                if (z8) {
                    i16 = this.mTitleMarginStart;
                } else {
                    i16 = 0;
                }
                int i312 = i16 - iArr[0];
                iMax = Math.max(0, i312) + i15;
                iArr[0] = Math.max(0, -i312);
                if (zO) {
                    LayoutParams layoutParams11 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                    int measuredWidth6 = this.mTitleTextView.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i17 = measuredWidth6 + this.mTitleMarginEnd;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) layoutParams11).bottomMargin;
                } else {
                    i17 = iMax;
                }
                if (zO2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.mSubtitleTextView.getMeasuredWidth() + iMax;
                    this.mSubtitleTextView.layout(iMax, i313, measuredWidth7, this.mSubtitleTextView.getMeasuredHeight() + i313);
                    i18 = measuredWidth7 + this.mTitleMarginEnd;
                } else {
                    i18 = iMax;
                }
                if (z8) {
                    iMax = Math.max(i17, i18);
                }
            }
        } else {
            if (zO) {
                textView = this.mTitleTextView;
            } else {
                textView = this.mSubtitleTextView;
            }
            if (zO2) {
                textView2 = this.mSubtitleTextView;
            } else {
                textView2 = this.mTitleTextView;
            }
            layoutParams = (LayoutParams) textView.getLayoutParams();
            layoutParams2 = (LayoutParams) textView2.getLayoutParams();
            i13 = measuredHeight;
            if (zO) {
            }
            i14 = this.mGravity & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR;
            i15 = iMax;
            if (i14 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.mTitleMarginTop;
            } else if (i14 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i13) / 2;
                i22 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                i23 = this.mTitleMarginTop;
                if (iMax2 < i22 + i23) {
                    iMax2 = i22 + i23;
                } else {
                    i24 = (((height - paddingBottom) - i13) - iMax2) - paddingTop2;
                    i25 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    i26 = this.mTitleMarginBottom;
                    if (i24 < i25 + i26) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i26) - i24));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin) - this.mTitleMarginBottom) - i13;
            }
            if (z10) {
                if (z8) {
                    i19 = this.mTitleMarginStart;
                } else {
                    i19 = 0;
                }
                int i314 = i19 - iArr[1];
                iMin -= Math.max(0, i314);
                iArr[1] = Math.max(0, -i314);
                if (zO) {
                    LayoutParams layoutParams12 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                    int measuredWidth8 = iMin - this.mTitleTextView.getMeasuredWidth();
                    int measuredHeight6 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i20 = measuredWidth8 - this.mTitleMarginEnd;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) layoutParams12).bottomMargin;
                } else {
                    i20 = iMin;
                }
                if (zO2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i315, iMin, this.mSubtitleTextView.getMeasuredHeight() + i315);
                    i21 = iMin - this.mTitleMarginEnd;
                } else {
                    i21 = iMin;
                }
                if (z8) {
                    iMin = Math.min(i20, i21);
                }
                iMax = i15;
            } else {
                if (z8) {
                    i16 = this.mTitleMarginStart;
                } else {
                    i16 = 0;
                }
                int i316 = i16 - iArr[0];
                iMax = Math.max(0, i316) + i15;
                iArr[0] = Math.max(0, -i316);
                if (zO) {
                    LayoutParams layoutParams13 = (LayoutParams) this.mTitleTextView.getLayoutParams();
                    int measuredWidth9 = this.mTitleTextView.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i17 = measuredWidth9 + this.mTitleMarginEnd;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) layoutParams13).bottomMargin;
                } else {
                    i17 = iMax;
                }
                if (zO2) {
                    int i317 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.mSubtitleTextView.getMeasuredWidth() + iMax;
                    this.mSubtitleTextView.layout(iMax, i317, measuredWidth10, this.mSubtitleTextView.getMeasuredHeight() + i317);
                    i18 = measuredWidth10 + this.mTitleMarginEnd;
                } else {
                    i18 = iMax;
                }
                if (z8) {
                    iMax = Math.max(i17, i18);
                }
            }
        }
        a(3, this.mTempViews);
        size = this.mTempViews.size();
        while (i27 < size) {
            iMax = k(this.mTempViews.get(i27), iMax, iMin2, iArr);
        }
        a(5, this.mTempViews);
        size2 = this.mTempViews.size();
        while (i28 < size2) {
            iMin = l(this.mTempViews.get(i28), iMin, iMin2, iArr);
        }
        a(1, this.mTempViews);
        arrayList = this.mTempViews;
        int i44 = iArr[0];
        int i45 = iArr[1];
        size3 = arrayList.size();
        i29 = i45;
        i30 = i44;
        i31 = 0;
        measuredWidth = 0;
        while (i31 < size3) {
            View view2 = arrayList.get(i31);
            LayoutParams layoutParams14 = (LayoutParams) view2.getLayoutParams();
            ArrayList<View> arrayList3 = arrayList;
            int i46 = ((ViewGroup.MarginLayoutParams) layoutParams14).leftMargin - i30;
            int i47 = ((ViewGroup.MarginLayoutParams) layoutParams14).rightMargin - i29;
            int iMax7 = Math.max(0, i46);
            int iMax8 = Math.max(0, i47);
            int iMax9 = Math.max(0, -i46);
            int iMax10 = Math.max(0, -i47);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i31++;
            i29 = iMax10;
            i30 = iMax9;
            arrayList = arrayList3;
        }
        i32 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i33 = measuredWidth + i32;
        if (i32 >= iMax) {
            if (i33 > iMin) {
                iMax = i32 - (i33 - iMin);
            } else {
                iMax = i32;
            }
        }
        size4 = this.mTempViews.size();
        while (i34 < size4) {
            iMax = k(this.mTempViews.get(i34), iMax, iMin2, iArr);
        }
        this.mTempViews.clear();
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        char c6;
        char c10;
        int iH;
        int iMax;
        int iCombineMeasuredStates;
        int iH2;
        int iMax2;
        int iCombineMeasuredStates2;
        int i11;
        int[] iArr = this.mTempMargins;
        boolean z3 = p1.f12995a;
        int i12 = 0;
        if (getLayoutDirection() == 1) {
            c10 = 1;
            c6 = 0;
        } else {
            c6 = 1;
            c10 = 0;
        }
        if (o(this.mNavButtonView)) {
            n(this.mNavButtonView, i7, 0, i10, this.mMaxButtonHeight);
            iH = h(this.mNavButtonView) + this.mNavButtonView.getMeasuredWidth();
            iMax = Math.max(0, i(this.mNavButtonView) + this.mNavButtonView.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            iH = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (o(this.mCollapseButtonView)) {
            n(this.mCollapseButtonView, i7, 0, i10, this.mMaxButtonHeight);
            iH = h(this.mCollapseButtonView) + this.mCollapseButtonView.getMeasuredWidth();
            iMax = Math.max(iMax, i(this.mCollapseButtonView) + this.mCollapseButtonView.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iH);
        iArr[c10] = Math.max(0, currentContentInsetStart - iH);
        if (o(this.mMenuView)) {
            n(this.mMenuView, i7, iMax3, i10, this.mMaxButtonHeight);
            iH2 = h(this.mMenuView) + this.mMenuView.getMeasuredWidth();
            iMax = Math.max(iMax, i(this.mMenuView) + this.mMenuView.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mMenuView.getMeasuredState());
        } else {
            iH2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, iH2);
        iArr[c6] = Math.max(0, currentContentInsetEnd - iH2);
        if (o(this.mExpandedActionView)) {
            iMax4 += m(this.mExpandedActionView, i7, iMax4, i10, 0, iArr);
            iMax = Math.max(iMax, i(this.mExpandedActionView) + this.mExpandedActionView.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mExpandedActionView.getMeasuredState());
        }
        if (o(this.mLogoView)) {
            iMax4 += m(this.mLogoView, i7, iMax4, i10, 0, iArr);
            iMax = Math.max(iMax, i(this.mLogoView) + this.mLogoView.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((LayoutParams) childAt.getLayoutParams()).f12829b == 0 && o(childAt)) {
                iMax4 += m(childAt, i7, iMax4, i10, 0, iArr);
                int iMax5 = Math.max(iMax, i(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i14 = iMax4;
        int i15 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i16 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (o(this.mTitleTextView)) {
            m(this.mTitleTextView, i7, i14 + i16, i10, i15, iArr);
            int iH3 = h(this.mTitleTextView) + this.mTitleTextView.getMeasuredWidth();
            int i17 = i(this.mTitleTextView) + this.mTitleTextView.getMeasuredHeight();
            iMax2 = iH3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.mTitleTextView.getMeasuredState());
            i11 = i17;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            i11 = 0;
        }
        if (o(this.mSubtitleTextView)) {
            iMax2 = Math.max(iMax2, m(this.mSubtitleTextView, i7, i14 + i16, i10, i15 + i11, iArr));
            i11 += i(this.mSubtitleTextView) + this.mSubtitleTextView.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.mSubtitleTextView.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, i11);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i14 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i7, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, iCombineMeasuredStates2 << 16);
        if (!this.mCollapsible) {
            i12 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i18 = 0; i18 < childCount2; i18++) {
            View childAt2 = getChildAt(i18);
            if (o(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i12 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i12);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        ActionMenuView actionMenuView = this.mMenuView;
        androidx.appcompat.view.menu.k kVar = actionMenuView != null ? actionMenuView.f12573a : null;
        int i7 = savedState.f12830a;
        if (i7 != 0 && this.mExpandedMenuPresenter != null && kVar != null && (menuItemFindItem = kVar.findItem(i7)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f12831b) {
            removeCallbacks(this.mShowOverflowMenuRunnable);
            post(this.mShowOverflowMenuRunnable);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        c();
        D0 d1 = this.mContentInsets;
        boolean z3 = i7 == 1;
        if (z3 == d1.f12656g) {
            return;
        }
        d1.f12656g = z3;
        if (!d1.f12657h) {
            d1.f12650a = d1.f12654e;
            d1.f12651b = d1.f12655f;
            return;
        }
        if (z3) {
            int i10 = d1.f12653d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = d1.f12654e;
            }
            d1.f12650a = i10;
            int i11 = d1.f12652c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = d1.f12655f;
            }
            d1.f12651b = i11;
            return;
        }
        int i12 = d1.f12652c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = d1.f12654e;
        }
        d1.f12650a = i12;
        int i13 = d1.f12653d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = d1.f12655f;
        }
        d1.f12651b = i13;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.m mVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        e1 e1Var = this.mExpandedMenuPresenter;
        if (e1Var != null && (mVar = e1Var.f12898b) != null) {
            savedState.f12830a = mVar.f12442a;
        }
        savedState.f12831b = isOverflowMenuShowing();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    public void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((LayoutParams) childAt.getLayoutParams()).f12829b != 2 && childAt != this.mMenuView) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    @Override // androidx.core.view.MenuHost
    @MainThread
    public void removeMenuProvider(@NonNull MenuProvider menuProvider) {
        this.mMenuHostHelper.c(menuProvider);
    }

    public void setBackInvokedCallbackEnabled(boolean z3) {
        if (this.mBackInvokedCallbackEnabled != z3) {
            this.mBackInvokedCallbackEnabled = z3;
            updateBackInvokedCallbackState();
        }
    }

    public void setCollapseContentDescription(@StringRes int i7) {
        setCollapseContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setCollapseIcon(@DrawableRes int i7) {
        setCollapseIcon(p264r5.a.q(i7, getContext()));
    }

    @RestrictTo({p192n.c.f39802c})
    public void setCollapsible(boolean z3) {
        this.mCollapsible = z3;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i7, int i10) {
        c();
        D0 d1 = this.mContentInsets;
        d1.f12657h = false;
        if (i7 != Integer.MIN_VALUE) {
            d1.f12654e = i7;
            d1.f12650a = i7;
        }
        if (i10 != Integer.MIN_VALUE) {
            d1.f12655f = i10;
            d1.f12651b = i10;
        }
    }

    public void setContentInsetsRelative(int i7, int i10) {
        c();
        this.mContentInsets.a(i7, i10);
    }

    public void setLogo(@DrawableRes int i7) {
        setLogo(p264r5.a.q(i7, getContext()));
    }

    public void setLogoDescription(@StringRes int i7) {
        setLogoDescription(getContext().getText(i7));
    }

    @RestrictTo({p192n.c.f39800a})
    public void setMenu(androidx.appcompat.view.menu.k kVar, C0868l c0868l) {
        if (kVar == null && this.mMenuView == null) {
            return;
        }
        e();
        androidx.appcompat.view.menu.k kVar2 = this.mMenuView.f12573a;
        if (kVar2 == kVar) {
            return;
        }
        if (kVar2 != null) {
            kVar2.removeMenuPresenter(this.mOuterActionMenuPresenter);
            kVar2.removeMenuPresenter(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new e1(this);
        }
        c0868l.f12945H = true;
        if (kVar != null) {
            kVar.addMenuPresenter(c0868l, this.mPopupContext);
            kVar.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            c0868l.initForMenu(this.mPopupContext, null);
            this.mExpandedMenuPresenter.initForMenu(this.mPopupContext, null);
            c0868l.updateMenuView(true);
            this.mExpandedMenuPresenter.updateMenuView(true);
        }
        this.mMenuView.setPopupTheme(this.mPopupTheme);
        this.mMenuView.setPresenter(c0868l);
        this.mOuterActionMenuPresenter = c0868l;
        updateBackInvokedCallbackState();
    }

    @RestrictTo({p192n.c.f39802c})
    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder$Callback menuBuilder$Callback) {
        this.mActionMenuPresenterCallback = callback;
        this.mMenuBuilderCallback = menuBuilder$Callback;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.f12578f = callback;
            actionMenuView.f12579g = menuBuilder$Callback;
        }
    }

    public void setNavigationContentDescription(@StringRes int i7) {
        setNavigationContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setNavigationIcon(@DrawableRes int i7) {
        setNavigationIcon(p264r5.a.q(i7, getContext()));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        d();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@StyleRes int i7) {
        if (this.mPopupTheme != i7) {
            this.mPopupTheme = i7;
            if (i7 == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setSubtitle(@StringRes int i7) {
        setSubtitle(getContext().getText(i7));
    }

    public void setSubtitleTextAppearance(Context context, @StyleRes int i7) {
        this.mSubtitleTextAppearance = i7;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i7);
        }
    }

    public void setSubtitleTextColor(@ColorInt int i7) {
        setSubtitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setTitle(@StringRes int i7) {
        setTitle(getContext().getText(i7));
    }

    public void setTitleMargin(int i7, int i10, int i11, int i12) {
        this.mTitleMarginStart = i7;
        this.mTitleMarginTop = i10;
        this.mTitleMarginEnd = i11;
        this.mTitleMarginBottom = i12;
        requestLayout();
    }

    public void setTitleMarginBottom(int i7) {
        this.mTitleMarginBottom = i7;
        requestLayout();
    }

    public void setTitleMarginEnd(int i7) {
        this.mTitleMarginEnd = i7;
        requestLayout();
    }

    public void setTitleMarginStart(int i7) {
        this.mTitleMarginStart = i7;
        requestLayout();
    }

    public void setTitleMarginTop(int i7) {
        this.mTitleMarginTop = i7;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, @StyleRes int i7) {
        this.mTitleTextAppearance = i7;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i7);
        }
    }

    public void setTitleTextColor(@ColorInt int i7) {
        setTitleTextColor(ColorStateList.valueOf(i7));
    }

    public boolean showOverflowMenu() {
        C0868l c0868l;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (c0868l = actionMenuView.f12577e) == null || !c0868l.d()) ? false : true;
    }

    public void updateBackInvokedCallbackState() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = d1.a(this);
            boolean z3 = hasExpandedActionView() && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.mBackInvokedCallbackEnabled;
            if (z3 && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = d1.b(new a1(this, 0));
                }
                d1.c(onBackInvokedDispatcherA, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = onBackInvokedDispatcherA;
                return;
            }
            if (z3 || (onBackInvokedDispatcher = this.mBackInvokedDispatcher) == null) {
                return;
            }
            d1.d(onBackInvokedDispatcher, this.mBackInvokedCallback);
            this.mBackInvokedDispatcher = null;
        }
    }

    public static class LayoutParams extends ActionBar$LayoutParams {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12829b;

        public LayoutParams(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12829b = 0;
        }

        public LayoutParams(int i7) {
            super(i7);
            this.f12829b = 0;
            this.f12075a = NavigationBarView.ITEM_GRAVITY_START_CENTER;
        }
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p241q.a.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2);
    }

    public void setCollapseContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.mCollapseButtonView;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.mCollapseIcon);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.mLogoView == null) {
                this.mLogoView = new AppCompatImageView(getContext());
            }
            if (!j(this.mLogoView)) {
                b(this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && j(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.mLogoView == null) {
            this.mLogoView = new AppCompatImageView(getContext());
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            com.facebook.imagepipeline.nativecode.b.S(this.mNavButtonView, charSequence);
        }
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            f();
            if (!j(this.mNavButtonView)) {
                b(this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && j(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && j(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        } else {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mSubtitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.mSubtitleTextAppearance;
                if (i7 != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!j(this.mSubtitleTextView)) {
                b(this.mSubtitleTextView, true);
            }
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mTitleTextView;
            if (textView != null && j(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        } else {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mTitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.mTitleTextAppearance;
                if (i7 != 0) {
                    this.mTitleTextView.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!j(this.mTitleTextView)) {
                b(this.mTitleTextView, true);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mGravity = NavigationBarView.ITEM_GRAVITY_START_CENTER;
        this.mTempViews = new ArrayList<>();
        this.mHiddenViews = new ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new C1063o(new a1(this, 1));
        this.mProvidedMenuItems = new ArrayList<>();
        this.mMenuViewItemClickListener = new b1(this);
        this.mShowOverflowMenuRunnable = new RunnableC0871m0(this, 1);
        Z0 z0F = Z0.f(getContext(), attributeSet, p241q.j.Toolbar, i7, 0);
        androidx.core.view.N.p(this, context, p241q.j.Toolbar, attributeSet, z0F.f12863b, i7, 0);
        int i10 = p241q.j.Toolbar_titleTextAppearance;
        TypedArray typedArray = z0F.f12863b;
        this.mTitleTextAppearance = typedArray.getResourceId(i10, 0);
        this.mSubtitleTextAppearance = typedArray.getResourceId(p241q.j.Toolbar_subtitleTextAppearance, 0);
        this.mGravity = typedArray.getInteger(p241q.j.Toolbar_android_gravity, this.mGravity);
        this.mButtonGravity = typedArray.getInteger(p241q.j.Toolbar_buttonGravity, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(p241q.j.Toolbar_titleMargin, 0);
        dimensionPixelOffset = typedArray.hasValue(p241q.j.Toolbar_titleMargins) ? typedArray.getDimensionPixelOffset(p241q.j.Toolbar_titleMargins, dimensionPixelOffset) : dimensionPixelOffset;
        this.mTitleMarginBottom = dimensionPixelOffset;
        this.mTitleMarginTop = dimensionPixelOffset;
        this.mTitleMarginEnd = dimensionPixelOffset;
        this.mTitleMarginStart = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(p241q.j.Toolbar_titleMarginStart, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.mTitleMarginStart = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(p241q.j.Toolbar_titleMarginEnd, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.mTitleMarginEnd = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(p241q.j.Toolbar_titleMarginTop, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.mTitleMarginTop = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(p241q.j.Toolbar_titleMarginBottom, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.mTitleMarginBottom = dimensionPixelOffset5;
        }
        this.mMaxButtonHeight = typedArray.getDimensionPixelSize(p241q.j.Toolbar_maxButtonHeight, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(p241q.j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(p241q.j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(p241q.j.Toolbar_contentInsetLeft, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(p241q.j.Toolbar_contentInsetRight, 0);
        c();
        D0 d1 = this.mContentInsets;
        d1.f12657h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            d1.f12654e = dimensionPixelSize;
            d1.f12650a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            d1.f12655f = dimensionPixelSize2;
            d1.f12651b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            d1.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.mContentInsetStartWithNavigation = typedArray.getDimensionPixelOffset(p241q.j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = typedArray.getDimensionPixelOffset(p241q.j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.mCollapseIcon = z0F.b(p241q.j.Toolbar_collapseIcon);
        this.mCollapseDescription = typedArray.getText(p241q.j.Toolbar_collapseContentDescription);
        CharSequence text = typedArray.getText(p241q.j.Toolbar_title);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(p241q.j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.mPopupContext = getContext();
        setPopupTheme(typedArray.getResourceId(p241q.j.Toolbar_popupTheme, 0));
        Drawable drawableB = z0F.b(p241q.j.Toolbar_navigationIcon);
        if (drawableB != null) {
            setNavigationIcon(drawableB);
        }
        CharSequence text3 = typedArray.getText(p241q.j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableB2 = z0F.b(p241q.j.Toolbar_logo);
        if (drawableB2 != null) {
            setLogo(drawableB2);
        }
        CharSequence text4 = typedArray.getText(p241q.j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(p241q.j.Toolbar_titleTextColor)) {
            setTitleTextColor(z0F.a(p241q.j.Toolbar_titleTextColor));
        }
        if (typedArray.hasValue(p241q.j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(z0F.a(p241q.j.Toolbar_subtitleTextColor));
        }
        if (typedArray.hasValue(p241q.j.Toolbar_menu)) {
            inflateMenu(typedArray.getResourceId(p241q.j.Toolbar_menu, 0));
        }
        z0F.g();
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.f12829b = 0;
            layoutParams3.f12829b = layoutParams2.f12829b;
            return layoutParams3;
        }
        if (layoutParams instanceof ActionBar$LayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ActionBar$LayoutParams) layoutParams);
            layoutParams4.f12829b = 0;
            return layoutParams4;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            LayoutParams layoutParams5 = new LayoutParams(marginLayoutParams);
            layoutParams5.f12829b = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams5).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = marginLayoutParams.bottomMargin;
            return layoutParams5;
        }
        LayoutParams layoutParams6 = new LayoutParams(layoutParams);
        layoutParams6.f12829b = 0;
        return layoutParams6;
    }

    @Override // androidx.core.view.MenuHost
    @MainThread
    public void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner) {
        this.mMenuHostHelper.a(menuProvider, lifecycleOwner);
    }

    @Override // androidx.core.view.MenuHost
    @SuppressLint({"LambdaLast"})
    @MainThread
    public void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner, @NonNull EnumC1204n enumC1204n) {
        this.mMenuHostHelper.b(menuProvider, lifecycleOwner, enumC1204n);
    }
}
