package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.C0812c;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.E;
import androidx.core.view.N;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.q0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.AttachedBehavior, MaterialBackHandler {
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_SearchView;
    private static final long TALKBACK_FOCUS_CHANGE_DELAY_MS = 100;
    private boolean animatedMenuItems;
    private boolean animatedNavigationIcon;
    private boolean autoShowKeyboard;
    private final boolean backHandlingEnabled;

    @NonNull
    private final MaterialBackOrchestrator backOrchestrator;

    @ColorInt
    private final int backgroundColor;
    final View backgroundView;
    private Map<View, Integer> childImportantForAccessibilityMap;
    final ImageButton clearButton;
    final TouchObserverFrameLayout contentContainer;

    @NonNull
    private TransitionState currentTransitionState;
    final View divider;
    final Toolbar dummyToolbar;
    final EditText editText;
    private final ElevationOverlayProvider elevationOverlayProvider;
    final FrameLayout headerContainer;
    private final boolean layoutInflated;
    final ClippableRoundedCornerLayout rootView;
    final View scrim;

    @Nullable
    private SearchBar searchBar;
    final TextView searchPrefix;
    private final SearchViewAnimationHelper searchViewAnimationHelper;
    private int softInputMode;
    final View statusBarSpacer;
    private boolean statusBarSpacerEnabledOverride;
    final LinearLayout textContainer;
    final MaterialToolbar toolbar;
    final FrameLayout toolbarContainer;
    private final Set<TransitionListener> transitionListeners;
    private boolean useWindowInsetsController;

    public static class Behavior extends CoordinatorLayout.Behavior<SearchView> {
        public Behavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull SearchView searchView, @NonNull View view) {
            if (searchView.isSetupWithSearchBar() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.search.SearchView.SavedState.1
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
                return new SavedState(parcel);
            }
        };
        String text;
        int visibility;

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeString(this.text);
            parcel.writeInt(this.visibility);
        }

        public SavedState(Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.text = parcel.readString();
            this.visibility = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public interface TransitionListener {
        void onStateChanged(@NonNull SearchView searchView, @NonNull TransitionState transitionState, @NonNull TransitionState transitionState2);
    }

    public enum TransitionState {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    @Nullable
    private Window getActivityWindow() {
        Activity activity = ContextUtils.getActivity(getContext());
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.searchBar;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    @Px
    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private boolean isHiddenOrHiding() {
        return this.currentTransitionState.equals(TransitionState.HIDDEN) || this.currentTransitionState.equals(TransitionState.HIDING);
    }

    private boolean isNavigationIconDrawerArrowDrawable(@NonNull Toolbar toolbar) {
        return org.chromium.support_lib_boundary.util.b.p0(toolbar.getNavigationIcon()) instanceof p300u.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearFocusAndHideKeyboard$9() {
        this.editText.clearFocus();
        ViewUtils.hideKeyboard(this.editText, this.useWindowInsetsController);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestFocusAndShowKeyboard$8() {
        if (this.editText.requestFocus()) {
            this.editText.sendAccessibilityEvent(8);
        }
        ViewUtils.showKeyboard(this.editText, this.useWindowInsetsController);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpBackButton$1(View view) {
        hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpClearButton$2(View view) {
        clearText();
        requestFocusAndShowKeyboardIfNeeded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setUpContentOnTouchListener$3(View view, MotionEvent motionEvent) {
        if (!isAdjustNothingSoftInputMode()) {
            return false;
        }
        clearFocusAndHideKeyboard();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static q0 lambda$setUpDividerInsetListener$6(ViewGroup.MarginLayoutParams marginLayoutParams, int i7, int i10, View view, q0 q0Var) {
        androidx.core.graphics.e eVarG = q0Var.f16277a.g(135);
        marginLayoutParams.leftMargin = i7 + eVarG.f16058a;
        marginLayoutParams.rightMargin = i10 + eVarG.f16060c;
        return q0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$setUpRootView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public q0 lambda$setUpStatusBarSpacerInsetListener$5(View view, q0 q0Var) {
        int i7 = q0Var.f16277a.g(135).f16059b;
        setUpStatusBarSpacer(i7);
        if (!this.statusBarSpacerEnabledOverride) {
            setStatusBarSpacerEnabledInternal(i7 > 0);
        }
        return q0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public q0 lambda$setUpToolbarInsetListener$4(View view, q0 q0Var, ViewUtils.RelativePadding relativePadding) {
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this.toolbar);
        int i7 = zIsLayoutRtl ? relativePadding.end : relativePadding.start;
        int i10 = zIsLayoutRtl ? relativePadding.start : relativePadding.end;
        androidx.core.graphics.e eVarG = q0Var.f16277a.g(135);
        this.toolbar.setPadding(i7 + eVarG.f16058a, relativePadding.f22536top, i10 + eVarG.f16060c, relativePadding.bottom);
        return q0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupWithSearchBar$7(View view) {
        show();
    }

    private void setStatusBarSpacerEnabledInternal(boolean z3) {
        this.statusBarSpacer.setVisibility(z3 ? 0 : 8);
    }

    private void setUpBackButton(boolean z3, boolean z8) {
        if (z8) {
            this.toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        this.toolbar.setNavigationOnClickListener(new f(this, 0));
        if (z3) {
            p300u.b bVar = new p300u.b(getContext());
            int color = MaterialColors.getColor(this, R.attr.colorOnSurface);
            Paint paint = bVar.f42668a;
            if (color != paint.getColor()) {
                paint.setColor(color);
                bVar.invalidateSelf();
            }
            this.toolbar.setNavigationIcon(bVar);
        }
    }

    private void setUpBackgroundViewElevationOverlay() {
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    private void setUpClearButton() {
        this.clearButton.setOnClickListener(new f(this, 1));
        this.editText.addTextChangedListener(new TextWatcher() { // from class: com.google.android.material.search.SearchView.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
                SearchView.this.clearButton.setVisibility(charSequence.length() > 0 ? 0 : 8);
            }
        });
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setUpContentOnTouchListener() {
        this.contentContainer.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.l
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f22562a.lambda$setUpContentOnTouchListener$3(view, motionEvent);
            }
        });
    }

    private void setUpDividerInsetListener() {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.divider.getLayoutParams();
        final int i7 = marginLayoutParams.leftMargin;
        final int i10 = marginLayoutParams.rightMargin;
        View view = this.divider;
        OnApplyWindowInsetsListener onApplyWindowInsetsListener = new OnApplyWindowInsetsListener() { // from class: com.google.android.material.search.i
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final q0 onApplyWindowInsets(View view2, q0 q0Var) {
                return SearchView.lambda$setUpDividerInsetListener$6(marginLayoutParams, i7, i10, view2, q0Var);
            }
        };
        WeakHashMap weakHashMap = N.f16168a;
        E.n(view, onApplyWindowInsetsListener);
    }

    private void setUpEditText(@StyleRes int i7, String str, String str2) {
        if (i7 != -1) {
            this.editText.setTextAppearance(i7);
        }
        this.editText.setText(str);
        this.editText.setHint(str2);
    }

    private void setUpHeaderLayout(int i7) {
        if (i7 != -1) {
            addHeaderView(LayoutInflater.from(getContext()).inflate(i7, (ViewGroup) this.headerContainer, false));
        }
    }

    private void setUpInsetListeners() {
        setUpToolbarInsetListener();
        setUpDividerInsetListener();
        setUpStatusBarSpacerInsetListener();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setUpRootView() {
        this.rootView.setOnTouchListener(new k());
    }

    private void setUpStatusBarSpacer(@Px int i7) {
        if (this.statusBarSpacer.getLayoutParams().height != i7) {
            this.statusBarSpacer.getLayoutParams().height = i7;
            this.statusBarSpacer.requestLayout();
        }
    }

    private void setUpStatusBarSpacerInsetListener() {
        setUpStatusBarSpacer(getStatusBarHeight());
        View view = this.statusBarSpacer;
        OnApplyWindowInsetsListener onApplyWindowInsetsListener = new OnApplyWindowInsetsListener() { // from class: com.google.android.material.search.j
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final q0 onApplyWindowInsets(View view2, q0 q0Var) {
                return this.f22561a.lambda$setUpStatusBarSpacerInsetListener$5(view2, q0Var);
            }
        };
        WeakHashMap weakHashMap = N.f16168a;
        E.n(view, onApplyWindowInsetsListener);
    }

    private void setUpToolbarInsetListener() {
        ViewUtils.doOnApplyWindowInsets(this.toolbar, new c(this));
    }

    @SuppressLint({"InlinedApi"})
    private void updateChildImportantForAccessibility(ViewGroup viewGroup, boolean z3) {
        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt != this) {
                if (childAt.findViewById(this.rootView.getId()) != null) {
                    updateChildImportantForAccessibility((ViewGroup) childAt, z3);
                } else if (z3) {
                    this.childImportantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    childAt.setImportantForAccessibility(4);
                } else {
                    Map<View, Integer> map = this.childImportantForAccessibilityMap;
                    if (map != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(this.childImportantForAccessibilityMap.get(childAt).intValue());
                    }
                }
            }
        }
    }

    private void updateListeningForBackCallbacks(@NonNull TransitionState transitionState) {
        if (this.searchBar == null || !this.backHandlingEnabled) {
            return;
        }
        if (transitionState.equals(TransitionState.SHOWN)) {
            this.backOrchestrator.startListeningForBackCallbacks();
        } else if (transitionState.equals(TransitionState.HIDDEN)) {
            this.backOrchestrator.stopListeningForBackCallbacks();
        }
    }

    private void updateModalForAccessibility(@NonNull TransitionState transitionState) {
        if (transitionState == TransitionState.SHOWN) {
            setModalForAccessibility(true);
        } else if (transitionState == TransitionState.HIDDEN) {
            setModalForAccessibility(false);
        }
    }

    private void updateNavigationIconIfNeeded() {
        MaterialToolbar materialToolbar = this.toolbar;
        if (materialToolbar == null || isNavigationIconDrawerArrowDrawable(materialToolbar)) {
            return;
        }
        int defaultNavigationIconResource = getDefaultNavigationIconResource();
        if (this.searchBar == null) {
            this.toolbar.setNavigationIcon(defaultNavigationIconResource);
            return;
        }
        Drawable drawableMutate = p264r5.a.q(defaultNavigationIconResource, getContext()).mutate();
        if (this.toolbar.getNavigationIconTint() != null) {
            drawableMutate.setTint(this.toolbar.getNavigationIconTint().intValue());
        }
        drawableMutate.setLayoutDirection(getLayoutDirection());
        this.toolbar.setNavigationIcon(new FadeThroughDrawable(this.searchBar.getNavigationIcon(), drawableMutate));
        updateNavigationIconProgressIfNeeded();
    }

    private void updateNavigationIconProgressIfNeeded() {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.toolbar);
        if (navigationIconButton == null) {
            return;
        }
        int i7 = this.rootView.getVisibility() == 0 ? 1 : 0;
        Drawable drawableP0 = org.chromium.support_lib_boundary.util.b.p0(navigationIconButton.getDrawable());
        if (drawableP0 instanceof p300u.b) {
            ((p300u.b) drawableP0).setProgress(i7);
        }
        if (drawableP0 instanceof FadeThroughDrawable) {
            ((FadeThroughDrawable) drawableP0).setProgress(i7);
        }
    }

    public void addHeaderView(@NonNull View view) {
        this.headerContainer.addView(view);
        this.headerContainer.setVisibility(0);
    }

    public void addTransitionListener(@NonNull TransitionListener transitionListener) {
        this.transitionListeners.add(transitionListener);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (this.layoutInflated) {
            this.contentContainer.addView(view, i7, layoutParams);
        } else {
            super.addView(view, i7, layoutParams);
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        if (isHiddenOrHiding() || this.searchBar == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.searchViewAnimationHelper.cancelBackProgress();
    }

    public void clearFocusAndHideKeyboard() {
        this.editText.post(new g(this, 0));
    }

    public void clearText() {
        this.editText.setText("");
    }

    @VisibleForTesting
    public MaterialMainContainerBackHelper getBackHelper() {
        return this.searchViewAnimationHelper.getBackHelper();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<SearchView> getBehavior() {
        return new Behavior();
    }

    @NonNull
    public TransitionState getCurrentTransitionState() {
        return this.currentTransitionState;
    }

    @DrawableRes
    @RestrictTo({p192n.c.f39801b})
    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_arrow_back_black_24;
    }

    @NonNull
    public EditText getEditText() {
        return this.editText;
    }

    @Nullable
    public CharSequence getHint() {
        return this.editText.getHint();
    }

    @NonNull
    public TextView getSearchPrefix() {
        return this.searchPrefix;
    }

    @Nullable
    public CharSequence getSearchPrefixText() {
        return this.searchPrefix.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.softInputMode;
    }

    @NonNull
    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.editText.getText();
    }

    @NonNull
    public Toolbar getToolbar() {
        return this.toolbar;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        if (isHiddenOrHiding()) {
            return;
        }
        C0812c c0812cOnHandleBackInvoked = this.searchViewAnimationHelper.onHandleBackInvoked();
        if (Build.VERSION.SDK_INT < 34 || this.searchBar == null || c0812cOnHandleBackInvoked == null) {
            hide();
        } else {
            this.searchViewAnimationHelper.finishBackProgress();
        }
    }

    public void hide() {
        if (this.currentTransitionState.equals(TransitionState.HIDDEN) || this.currentTransitionState.equals(TransitionState.HIDING)) {
            return;
        }
        SearchBar searchBar = this.searchBar;
        if (searchBar == null || !searchBar.isAttachedToWindow()) {
            this.searchViewAnimationHelper.hide();
            return;
        }
        this.searchBar.setPlaceholderText(this.editText.getText().toString());
        SearchBar searchBar2 = this.searchBar;
        SearchViewAnimationHelper searchViewAnimationHelper = this.searchViewAnimationHelper;
        Objects.requireNonNull(searchViewAnimationHelper);
        searchBar2.post(new h(searchViewAnimationHelper, 0));
    }

    public void inflateMenu(@MenuRes int i7) {
        this.toolbar.inflateMenu(i7);
    }

    public boolean isAdjustNothingSoftInputMode() {
        return this.softInputMode == 48;
    }

    public boolean isAnimatedNavigationIcon() {
        return this.animatedNavigationIcon;
    }

    public boolean isAutoShowKeyboard() {
        return this.autoShowKeyboard;
    }

    public boolean isMenuItemsAnimated() {
        return this.animatedMenuItems;
    }

    public boolean isSetupWithSearchBar() {
        return this.searchBar != null;
    }

    public boolean isShowing() {
        return this.currentTransitionState.equals(TransitionState.SHOWN) || this.currentTransitionState.equals(TransitionState.SHOWING);
    }

    @RestrictTo({p192n.c.f39801b})
    public boolean isUseWindowInsetsController() {
        return this.useWindowInsetsController;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        TransitionState currentTransitionState = getCurrentTransitionState();
        updateModalForAccessibility(currentTransitionState);
        updateListeningForBackCallbacks(currentTransitionState);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setModalForAccessibility(false);
        this.backOrchestrator.stopListeningForBackCallbacks();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        updateSoftInputMode();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.text);
        setVisible(savedState.visibility == 0);
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.text = text == null ? null : text.toString();
        savedState.visibility = this.rootView.getVisibility();
        return savedState;
    }

    public void removeAllHeaderViews() {
        this.headerContainer.removeAllViews();
        this.headerContainer.setVisibility(8);
    }

    public void removeHeaderView(@NonNull View view) {
        this.headerContainer.removeView(view);
        if (this.headerContainer.getChildCount() == 0) {
            this.headerContainer.setVisibility(8);
        }
    }

    public void removeTransitionListener(@NonNull TransitionListener transitionListener) {
        this.transitionListeners.remove(transitionListener);
    }

    public void requestFocusAndShowKeyboard() {
        this.editText.postDelayed(new g(this, 1), TALKBACK_FOCUS_CHANGE_DELAY_MS);
    }

    public void requestFocusAndShowKeyboardIfNeeded() {
        if (this.autoShowKeyboard) {
            requestFocusAndShowKeyboard();
        }
    }

    public void setAnimatedNavigationIcon(boolean z3) {
        this.animatedNavigationIcon = z3;
    }

    public void setAutoShowKeyboard(boolean z3) {
        this.autoShowKeyboard = z3;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        setUpBackgroundViewElevationOverlay(f10);
    }

    public void setHint(@Nullable CharSequence charSequence) {
        this.editText.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z3) {
        this.animatedMenuItems = z3;
    }

    public void setModalForAccessibility(boolean z3) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z3) {
            this.childImportantForAccessibilityMap = new HashMap(viewGroup.getChildCount());
        }
        updateChildImportantForAccessibility(viewGroup, z3);
        if (z3) {
            return;
        }
        this.childImportantForAccessibilityMap = null;
    }

    public void setOnMenuItemClickListener(@Nullable Toolbar.OnMenuItemClickListener onMenuItemClickListener) {
        this.toolbar.setOnMenuItemClickListener(onMenuItemClickListener);
    }

    public void setSearchPrefixText(@Nullable CharSequence charSequence) {
        this.searchPrefix.setText(charSequence);
        this.searchPrefix.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @RestrictTo({p192n.c.f39801b})
    public void setStatusBarSpacerEnabled(boolean z3) {
        this.statusBarSpacerEnabledOverride = true;
        setStatusBarSpacerEnabledInternal(z3);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(@Nullable CharSequence charSequence) {
        this.editText.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z3) {
        this.toolbar.setTouchscreenBlocksFocus(z3);
    }

    public void setTransitionState(@NonNull TransitionState transitionState) {
        setTransitionState(transitionState, true);
    }

    @RestrictTo({p192n.c.f39801b})
    public void setUseWindowInsetsController(boolean z3) {
        this.useWindowInsetsController = z3;
    }

    public void setVisible(boolean z3) {
        boolean z8 = this.rootView.getVisibility() == 0;
        this.rootView.setVisibility(z3 ? 0 : 8);
        updateNavigationIconProgressIfNeeded();
        setTransitionState(z3 ? TransitionState.SHOWN : TransitionState.HIDDEN, z8 != z3);
    }

    public void setupWithSearchBar(@Nullable SearchBar searchBar) {
        this.searchBar = searchBar;
        this.searchViewAnimationHelper.setSearchBar(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new f(this, 2));
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new g(this, 2));
                    this.editText.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        updateNavigationIconIfNeeded();
        setUpBackgroundViewElevationOverlay();
        updateListeningForBackCallbacks(getCurrentTransitionState());
    }

    public void show() {
        if (this.currentTransitionState.equals(TransitionState.SHOWN) || this.currentTransitionState.equals(TransitionState.SHOWING)) {
            return;
        }
        this.searchViewAnimationHelper.show();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@NonNull C0812c c0812c) {
        SearchBar searchBar;
        if (isHiddenOrHiding() || (searchBar = this.searchBar) == null) {
            return;
        }
        if (searchBar != null) {
            searchBar.setPlaceholderText(this.editText.getText().toString());
        }
        this.searchViewAnimationHelper.startBackProgress(c0812c);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@NonNull C0812c c0812c) {
        if (isHiddenOrHiding() || this.searchBar == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.searchViewAnimationHelper.updateBackProgress(c0812c);
    }

    public void updateSoftInputMode() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.softInputMode = activityWindow.getAttributes().softInputMode;
        }
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    private void setTransitionState(@NonNull TransitionState transitionState, boolean z3) {
        if (this.currentTransitionState.equals(transitionState)) {
            return;
        }
        if (z3) {
            updateModalForAccessibility(transitionState);
        }
        TransitionState transitionState2 = this.currentTransitionState;
        this.currentTransitionState = transitionState;
        Iterator it = new LinkedHashSet(this.transitionListeners).iterator();
        while (it.hasNext()) {
            ((TransitionListener) it.next()).onStateChanged(this, transitionState2, transitionState);
        }
        updateListeningForBackCallbacks(transitionState);
        SearchBar searchBar = this.searchBar;
        if (searchBar == null || transitionState != TransitionState.HIDDEN) {
            return;
        }
        searchBar.sendAccessibilityEvent(8);
    }

    private void setUpBackgroundViewElevationOverlay(float f10) {
        ElevationOverlayProvider elevationOverlayProvider = this.elevationOverlayProvider;
        if (elevationOverlayProvider == null || this.backgroundView == null) {
            return;
        }
        this.backgroundView.setBackgroundColor(elevationOverlayProvider.compositeOverlayIfNeeded(this.backgroundColor, f10));
    }

    public void setHint(@StringRes int i7) {
        this.editText.setHint(i7);
    }

    public void setText(@StringRes int i7) {
        this.editText.setText(i7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        int i10 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i7, i10), attributeSet, i7);
        this.backOrchestrator = new MaterialBackOrchestrator(this);
        this.transitionListeners = new LinkedHashSet();
        this.softInputMode = 16;
        this.currentTransitionState = TransitionState.HIDDEN;
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.SearchView, i7, i10, new int[0]);
        this.backgroundColor = typedArrayObtainStyledAttributes.getColor(R.styleable.SearchView_backgroundTint, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SearchView_headerLayout, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SearchView_android_textAppearance, -1);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.SearchView_android_text);
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.SearchView_android_hint);
        String string3 = typedArrayObtainStyledAttributes.getString(R.styleable.SearchView_searchPrefixText);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchView_useDrawerArrowDrawable, false);
        this.animatedNavigationIcon = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchView_animateNavigationIcon, true);
        this.animatedMenuItems = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchView_animateMenuItems, true);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchView_hideNavigationIcon, false);
        this.autoShowKeyboard = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchView_autoShowKeyboard, true);
        this.backHandlingEnabled = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SearchView_backHandlingEnabled, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_view, this);
        this.layoutInflated = true;
        this.scrim = findViewById(R.id.open_search_view_scrim);
        this.rootView = (ClippableRoundedCornerLayout) findViewById(R.id.open_search_view_root);
        this.backgroundView = findViewById(R.id.open_search_view_background);
        this.statusBarSpacer = findViewById(R.id.open_search_view_status_bar_spacer);
        this.headerContainer = (FrameLayout) findViewById(R.id.open_search_view_header_container);
        this.toolbarContainer = (FrameLayout) findViewById(R.id.open_search_view_toolbar_container);
        this.toolbar = (MaterialToolbar) findViewById(R.id.open_search_view_toolbar);
        this.dummyToolbar = (Toolbar) findViewById(R.id.open_search_view_dummy_toolbar);
        this.searchPrefix = (TextView) findViewById(R.id.open_search_view_search_prefix);
        this.textContainer = (LinearLayout) findViewById(R.id.open_search_view_text_container);
        this.editText = (EditText) findViewById(R.id.open_search_view_edit_text);
        this.clearButton = (ImageButton) findViewById(R.id.open_search_view_clear_button);
        this.divider = findViewById(R.id.open_search_view_divider);
        this.contentContainer = (TouchObserverFrameLayout) findViewById(R.id.open_search_view_content_container);
        this.searchViewAnimationHelper = new SearchViewAnimationHelper(this);
        this.elevationOverlayProvider = new ElevationOverlayProvider(context2);
        setUpRootView();
        setUpBackgroundViewElevationOverlay();
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        setUpEditText(resourceId2, string, string2);
        setUpBackButton(z3, z8);
        setUpClearButton();
        setUpContentOnTouchListener();
        setUpInsetListeners();
    }
}
