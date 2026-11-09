package com.google.android.material.textfield;

import C0.G;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Z0;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
class EndCompoundLayout extends LinearLayout {

    @Nullable
    private final AccessibilityManager accessibilityManager;
    private EditText editText;
    private final TextWatcher editTextWatcher;
    private final LinkedHashSet<TextInputLayout.OnEndIconChangedListener> endIconChangedListeners;
    private final EndIconDelegates endIconDelegates;

    @NonNull
    private final FrameLayout endIconFrame;
    private int endIconMinSize;
    private int endIconMode;
    private View.OnLongClickListener endIconOnLongClickListener;

    @NonNull
    private ImageView.ScaleType endIconScaleType;
    private ColorStateList endIconTintList;
    private PorterDuff.Mode endIconTintMode;

    @NonNull
    private final CheckableImageButton endIconView;
    private View.OnLongClickListener errorIconOnLongClickListener;
    private ColorStateList errorIconTintList;
    private PorterDuff.Mode errorIconTintMode;

    @NonNull
    private final CheckableImageButton errorIconView;
    private boolean hintExpanded;
    private final TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener;

    @Nullable
    private CharSequence suffixText;

    @NonNull
    private final TextView suffixTextView;
    final TextInputLayout textInputLayout;

    @Nullable
    private AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener;

    public static class EndIconDelegates {
        private final int customEndIconDrawableId;
        private final SparseArray<EndIconDelegate> delegates = new SparseArray<>();
        private final EndCompoundLayout endLayout;
        private final int passwordIconDrawableId;

        public EndIconDelegates(EndCompoundLayout endCompoundLayout, Z0 z3) {
            this.endLayout = endCompoundLayout;
            this.customEndIconDrawableId = z3.f12863b.getResourceId(R.styleable.TextInputLayout_endIconDrawable, 0);
            this.passwordIconDrawableId = z3.f12863b.getResourceId(R.styleable.TextInputLayout_passwordToggleDrawable, 0);
        }

        private EndIconDelegate create(int i7) {
            if (i7 == -1) {
                return new CustomEndIconDelegate(this.endLayout);
            }
            if (i7 == 0) {
                return new NoEndIconDelegate(this.endLayout);
            }
            if (i7 == 1) {
                return new PasswordToggleEndIconDelegate(this.endLayout, this.passwordIconDrawableId);
            }
            if (i7 == 2) {
                return new ClearTextEndIconDelegate(this.endLayout);
            }
            if (i7 == 3) {
                return new DropdownMenuEndIconDelegate(this.endLayout);
            }
            throw new IllegalArgumentException(G.m(i7, "Invalid end icon mode: "));
        }

        public EndIconDelegate get(int i7) {
            EndIconDelegate endIconDelegate = this.delegates.get(i7);
            if (endIconDelegate != null) {
                return endIconDelegate;
            }
            EndIconDelegate endIconDelegateCreate = create(i7);
            this.delegates.append(i7, endIconDelegateCreate);
            return endIconDelegateCreate;
        }
    }

    public EndCompoundLayout(TextInputLayout textInputLayout, Z0 z3) {
        super(textInputLayout.getContext());
        this.endIconMode = 0;
        this.endIconChangedListeners = new LinkedHashSet<>();
        this.editTextWatcher = new TextWatcherAdapter() { // from class: com.google.android.material.textfield.EndCompoundLayout.1
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                EndCompoundLayout.this.getEndIconDelegate().afterEditTextChanged(editable);
            }

            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
                EndCompoundLayout.this.getEndIconDelegate().beforeEditTextChanged(charSequence, i7, i10, i11);
            }
        };
        TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener = new TextInputLayout.OnEditTextAttachedListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.2
            @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
            public void onEditTextAttached(@NonNull TextInputLayout textInputLayout2) {
                if (EndCompoundLayout.this.editText == textInputLayout2.getEditText()) {
                    return;
                }
                if (EndCompoundLayout.this.editText != null) {
                    EndCompoundLayout.this.editText.removeTextChangedListener(EndCompoundLayout.this.editTextWatcher);
                    if (EndCompoundLayout.this.editText.getOnFocusChangeListener() == EndCompoundLayout.this.getEndIconDelegate().getOnEditTextFocusChangeListener()) {
                        EndCompoundLayout.this.editText.setOnFocusChangeListener(null);
                    }
                }
                EndCompoundLayout.this.editText = textInputLayout2.getEditText();
                if (EndCompoundLayout.this.editText != null) {
                    EndCompoundLayout.this.editText.addTextChangedListener(EndCompoundLayout.this.editTextWatcher);
                }
                EndCompoundLayout.this.getEndIconDelegate().onEditTextAttached(EndCompoundLayout.this.editText);
                EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
                endCompoundLayout.setOnFocusChangeListenersIfNeeded(endCompoundLayout.getEndIconDelegate());
            }
        };
        this.onEditTextAttachedListener = onEditTextAttachedListener;
        this.accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.textInputLayout = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.endIconFrame = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonCreateIconView = createIconView(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.errorIconView = checkableImageButtonCreateIconView;
        CheckableImageButton checkableImageButtonCreateIconView2 = createIconView(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.endIconView = checkableImageButtonCreateIconView2;
        this.endIconDelegates = new EndIconDelegates(this, z3);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.suffixTextView = appCompatTextView;
        initErrorIconView(z3);
        initEndIconView(z3);
        initSuffixTextView(z3);
        frameLayout.addView(checkableImageButtonCreateIconView2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonCreateIconView);
        textInputLayout.addOnEditTextAttachedListener(onEditTextAttachedListener);
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.3
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                EndCompoundLayout.this.addTouchExplorationStateChangeListenerIfNeeded();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                EndCompoundLayout.this.removeTouchExplorationStateChangeListenerIfNeeded();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTouchExplorationStateChangeListenerIfNeeded() {
        if (this.touchExplorationStateChangeListener == null || this.accessibilityManager == null || !isAttachedToWindow()) {
            return;
        }
        this.accessibilityManager.addTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
    }

    private CheckableImageButton createIconView(ViewGroup viewGroup, LayoutInflater layoutInflater, @IdRes int i7) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i7);
        IconHelper.setCompatRippleBackgroundIfNeeded(checkableImageButton);
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    private void dispatchOnEndIconChanged(int i7) {
        Iterator<TextInputLayout.OnEndIconChangedListener> it = this.endIconChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onEndIconChanged(this.textInputLayout, i7);
        }
    }

    private int getIconResId(EndIconDelegate endIconDelegate) {
        int i7 = this.endIconDelegates.customEndIconDrawableId;
        return i7 == 0 ? endIconDelegate.getIconDrawableResId() : i7;
    }

    private void initEndIconView(Z0 z3) {
        boolean zHasValue = z3.f12863b.hasValue(R.styleable.TextInputLayout_passwordToggleEnabled);
        TypedArray typedArray = z3.f12863b;
        if (!zHasValue) {
            if (typedArray.hasValue(R.styleable.TextInputLayout_endIconTint)) {
                this.endIconTintList = MaterialResources.getColorStateList(getContext(), z3, R.styleable.TextInputLayout_endIconTint);
            }
            if (typedArray.hasValue(R.styleable.TextInputLayout_endIconTintMode)) {
                this.endIconTintMode = ViewUtils.parseTintMode(typedArray.getInt(R.styleable.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (typedArray.hasValue(R.styleable.TextInputLayout_endIconMode)) {
            setEndIconMode(typedArray.getInt(R.styleable.TextInputLayout_endIconMode, 0));
            if (typedArray.hasValue(R.styleable.TextInputLayout_endIconContentDescription)) {
                setEndIconContentDescription(typedArray.getText(R.styleable.TextInputLayout_endIconContentDescription));
            }
            setEndIconCheckable(typedArray.getBoolean(R.styleable.TextInputLayout_endIconCheckable, true));
        } else if (typedArray.hasValue(R.styleable.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray.hasValue(R.styleable.TextInputLayout_passwordToggleTint)) {
                this.endIconTintList = MaterialResources.getColorStateList(getContext(), z3, R.styleable.TextInputLayout_passwordToggleTint);
            }
            if (typedArray.hasValue(R.styleable.TextInputLayout_passwordToggleTintMode)) {
                this.endIconTintMode = ViewUtils.parseTintMode(typedArray.getInt(R.styleable.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            setEndIconMode(typedArray.getBoolean(R.styleable.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            setEndIconContentDescription(typedArray.getText(R.styleable.TextInputLayout_passwordToggleContentDescription));
        }
        setEndIconMinSize(typedArray.getDimensionPixelSize(R.styleable.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size)));
        if (typedArray.hasValue(R.styleable.TextInputLayout_endIconScaleType)) {
            setEndIconScaleType(IconHelper.convertScaleType(typedArray.getInt(R.styleable.TextInputLayout_endIconScaleType, -1)));
        }
    }

    private void initErrorIconView(Z0 z3) {
        if (z3.f12863b.hasValue(R.styleable.TextInputLayout_errorIconTint)) {
            this.errorIconTintList = MaterialResources.getColorStateList(getContext(), z3, R.styleable.TextInputLayout_errorIconTint);
        }
        int i7 = R.styleable.TextInputLayout_errorIconTintMode;
        TypedArray typedArray = z3.f12863b;
        if (typedArray.hasValue(i7)) {
            this.errorIconTintMode = ViewUtils.parseTintMode(typedArray.getInt(R.styleable.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (typedArray.hasValue(R.styleable.TextInputLayout_errorIconDrawable)) {
            setErrorIconDrawable(z3.b(R.styleable.TextInputLayout_errorIconDrawable));
        }
        this.errorIconView.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        this.errorIconView.setImportantForAccessibility(2);
        this.errorIconView.setClickable(false);
        this.errorIconView.setPressable(false);
        this.errorIconView.setCheckable(false);
        this.errorIconView.setFocusable(false);
    }

    private void initSuffixTextView(Z0 z3) {
        this.suffixTextView.setVisibility(8);
        this.suffixTextView.setId(R.id.textinput_suffix_text);
        this.suffixTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        this.suffixTextView.setAccessibilityLiveRegion(1);
        setSuffixTextAppearance(z3.f12863b.getResourceId(R.styleable.TextInputLayout_suffixTextAppearance, 0));
        int i7 = R.styleable.TextInputLayout_suffixTextColor;
        TypedArray typedArray = z3.f12863b;
        if (typedArray.hasValue(i7)) {
            setSuffixTextColor(z3.a(R.styleable.TextInputLayout_suffixTextColor));
        }
        setSuffixText(typedArray.getText(R.styleable.TextInputLayout_suffixText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTouchExplorationStateChangeListenerIfNeeded() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.touchExplorationStateChangeListener;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.accessibilityManager) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnFocusChangeListenersIfNeeded(EndIconDelegate endIconDelegate) {
        if (this.editText == null) {
            return;
        }
        if (endIconDelegate.getOnEditTextFocusChangeListener() != null) {
            this.editText.setOnFocusChangeListener(endIconDelegate.getOnEditTextFocusChangeListener());
        }
        if (endIconDelegate.getOnIconViewFocusChangeListener() != null) {
            this.endIconView.setOnFocusChangeListener(endIconDelegate.getOnIconViewFocusChangeListener());
        }
    }

    private void setUpDelegate(@NonNull EndIconDelegate endIconDelegate) {
        endIconDelegate.setUp();
        this.touchExplorationStateChangeListener = endIconDelegate.getTouchExplorationStateChangeListener();
        addTouchExplorationStateChangeListenerIfNeeded();
    }

    private void tearDownDelegate(@NonNull EndIconDelegate endIconDelegate) {
        removeTouchExplorationStateChangeListenerIfNeeded();
        this.touchExplorationStateChangeListener = null;
        endIconDelegate.tearDown();
    }

    private void tintEndIconOnError(boolean z3) {
        if (!z3 || getEndIconDrawable() == null) {
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
            return;
        }
        Drawable drawableMutate = getEndIconDrawable().mutate();
        drawableMutate.setTint(this.textInputLayout.getErrorCurrentTextColors());
        this.endIconView.setImageDrawable(drawableMutate);
    }

    private void updateEndLayoutVisibility() {
        this.endIconFrame.setVisibility((this.endIconView.getVisibility() != 0 || isErrorIconVisible()) ? 8 : 0);
        setVisibility((isEndIconVisible() || isErrorIconVisible() || ((this.suffixText == null || this.hintExpanded) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    private void updateErrorIconVisibility() {
        this.errorIconView.setVisibility(getErrorIconDrawable() != null && this.textInputLayout.isErrorEnabled() && this.textInputLayout.shouldShowError() ? 0 : 8);
        updateEndLayoutVisibility();
        updateSuffixTextViewPadding();
        if (hasEndIcon()) {
            return;
        }
        this.textInputLayout.updateDummyDrawables();
    }

    private void updateSuffixTextVisibility() {
        int visibility = this.suffixTextView.getVisibility();
        int i7 = (this.suffixText == null || this.hintExpanded) ? 8 : 0;
        if (visibility != i7) {
            getEndIconDelegate().onSuffixVisibilityChanged(i7 == 0);
        }
        updateEndLayoutVisibility();
        this.suffixTextView.setVisibility(i7);
        this.textInputLayout.updateDummyDrawables();
    }

    public void addOnEndIconChangedListener(@NonNull TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.add(onEndIconChangedListener);
    }

    public void checkEndIcon() {
        this.endIconView.performClick();
        this.endIconView.jumpDrawablesToCurrentState();
    }

    public void clearOnEndIconChangedListeners() {
        this.endIconChangedListeners.clear();
    }

    @Nullable
    public CheckableImageButton getCurrentEndIconView() {
        if (isErrorIconVisible()) {
            return this.errorIconView;
        }
        if (hasEndIcon() && isEndIconVisible()) {
            return this.endIconView;
        }
        return null;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.endIconView.getContentDescription();
    }

    public EndIconDelegate getEndIconDelegate() {
        return this.endIconDelegates.get(this.endIconMode);
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.endIconView.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.endIconMinSize;
    }

    public int getEndIconMode() {
        return this.endIconMode;
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.endIconScaleType;
    }

    public CheckableImageButton getEndIconView() {
        return this.endIconView;
    }

    public Drawable getErrorIconDrawable() {
        return this.errorIconView.getDrawable();
    }

    @Nullable
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endIconView.getContentDescription();
    }

    @Nullable
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endIconView.getDrawable();
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.suffixText;
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.suffixTextView.getTextColors();
    }

    public int getSuffixTextEndOffset() {
        return this.suffixTextView.getPaddingEnd() + getPaddingEnd() + ((isEndIconVisible() || isErrorIconVisible()) ? this.endIconView.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.endIconView.getLayoutParams()).getMarginStart() : 0);
    }

    public TextView getSuffixTextView() {
        return this.suffixTextView;
    }

    public boolean hasEndIcon() {
        return this.endIconMode != 0;
    }

    public boolean isEndIconCheckable() {
        return this.endIconView.isCheckable();
    }

    public boolean isEndIconChecked() {
        return hasEndIcon() && this.endIconView.isChecked();
    }

    public boolean isEndIconVisible() {
        return this.endIconFrame.getVisibility() == 0 && this.endIconView.getVisibility() == 0;
    }

    public boolean isErrorIconVisible() {
        return this.errorIconView.getVisibility() == 0;
    }

    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endIconMode == 1;
    }

    public void onHintStateChanged(boolean z3) {
        this.hintExpanded = z3;
        updateSuffixTextVisibility();
    }

    public void onTextInputBoxStateUpdated() {
        updateErrorIconVisibility();
        refreshErrorIconDrawableState();
        refreshEndIconDrawableState();
        if (getEndIconDelegate().shouldTintIconOnError()) {
            tintEndIconOnError(this.textInputLayout.shouldShowError());
        }
    }

    public void refreshEndIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.endIconView, this.endIconTintList);
    }

    public void refreshErrorIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.errorIconView, this.errorIconTintList);
    }

    public void refreshIconState(boolean z3) {
        boolean z8;
        boolean zIsActivated;
        boolean zIsChecked;
        EndIconDelegate endIconDelegate = getEndIconDelegate();
        boolean z10 = true;
        if (!endIconDelegate.isIconCheckable() || (zIsChecked = this.endIconView.isChecked()) == endIconDelegate.isIconChecked()) {
            z8 = false;
        } else {
            this.endIconView.setChecked(!zIsChecked);
            z8 = true;
        }
        if (!endIconDelegate.isIconActivable() || (zIsActivated = this.endIconView.isActivated()) == endIconDelegate.isIconActivated()) {
            z10 = z8;
        } else {
            setEndIconActivated(!zIsActivated);
        }
        if (z3 || z10) {
            refreshEndIconDrawableState();
        }
    }

    public void removeOnEndIconChangedListener(@NonNull TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.remove(onEndIconChangedListener);
    }

    public void setEndIconActivated(boolean z3) {
        this.endIconView.setActivated(z3);
    }

    public void setEndIconCheckable(boolean z3) {
        this.endIconView.setCheckable(z3);
    }

    public void setEndIconContentDescription(@StringRes int i7) {
        setEndIconContentDescription(i7 != 0 ? getResources().getText(i7) : null);
    }

    public void setEndIconDrawable(@DrawableRes int i7) {
        setEndIconDrawable(i7 != 0 ? p264r5.a.q(i7, getContext()) : null);
    }

    public void setEndIconMinSize(@Px int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i7 != this.endIconMinSize) {
            this.endIconMinSize = i7;
            IconHelper.setIconMinSize(this.endIconView, i7);
            IconHelper.setIconMinSize(this.errorIconView, i7);
        }
    }

    public void setEndIconMode(int i7) {
        if (this.endIconMode == i7) {
            return;
        }
        tearDownDelegate(getEndIconDelegate());
        int i10 = this.endIconMode;
        this.endIconMode = i7;
        dispatchOnEndIconChanged(i10);
        setEndIconVisible(i7 != 0);
        EndIconDelegate endIconDelegate = getEndIconDelegate();
        setEndIconDrawable(getIconResId(endIconDelegate));
        setEndIconContentDescription(endIconDelegate.getIconContentDescriptionResId());
        setEndIconCheckable(endIconDelegate.isIconCheckable());
        if (!endIconDelegate.isBoxBackgroundModeSupported(this.textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i7);
        }
        setUpDelegate(endIconDelegate);
        setEndIconOnClickListener(endIconDelegate.getOnIconClickListener());
        EditText editText = this.editText;
        if (editText != null) {
            endIconDelegate.onEditTextAttached(editText);
            setOnFocusChangeListenersIfNeeded(endIconDelegate);
        }
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
        refreshIconState(true);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.endIconView, onClickListener, this.endIconOnLongClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.endIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.endIconView, onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.endIconScaleType = scaleType;
        IconHelper.setIconScaleType(this.endIconView, scaleType);
        IconHelper.setIconScaleType(this.errorIconView, scaleType);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.endIconTintList != colorStateList) {
            this.endIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, colorStateList, this.endIconTintMode);
        }
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.endIconTintMode != mode) {
            this.endIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, mode);
        }
    }

    public void setEndIconVisible(boolean z3) {
        if (isEndIconVisible() != z3) {
            this.endIconView.setVisibility(z3 ? 0 : 8);
            updateEndLayoutVisibility();
            updateSuffixTextViewPadding();
            this.textInputLayout.updateDummyDrawables();
        }
    }

    public void setErrorIconDrawable(@DrawableRes int i7) {
        setErrorIconDrawable(i7 != 0 ? p264r5.a.q(i7, getContext()) : null);
        refreshErrorIconDrawableState();
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.errorIconView, onClickListener, this.errorIconOnLongClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.errorIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.errorIconView, onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.errorIconTintList != colorStateList) {
            this.errorIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, colorStateList, this.errorIconTintMode);
        }
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.errorIconTintMode != mode) {
            this.errorIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, this.errorIconTintList, mode);
        }
    }

    public void setPasswordVisibilityToggleContentDescription(@StringRes int i7) {
        setPasswordVisibilityToggleContentDescription(i7 != 0 ? getResources().getText(i7) : null);
    }

    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i7) {
        setPasswordVisibilityToggleDrawable(i7 != 0 ? p264r5.a.q(i7, getContext()) : null);
    }

    public void setPasswordVisibilityToggleEnabled(boolean z3) {
        if (z3 && this.endIconMode != 1) {
            setEndIconMode(1);
        } else {
            if (z3) {
                return;
            }
            setEndIconMode(0);
        }
    }

    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        this.endIconTintList = colorStateList;
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, colorStateList, this.endIconTintMode);
    }

    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        this.endIconTintMode = mode;
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, mode);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        this.suffixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.suffixTextView.setText(charSequence);
        updateSuffixTextVisibility();
    }

    public void setSuffixTextAppearance(@StyleRes int i7) {
        this.suffixTextView.setTextAppearance(i7);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.suffixTextView.setTextColor(colorStateList);
    }

    public void togglePasswordVisibilityToggle(boolean z3) {
        if (this.endIconMode == 1) {
            this.endIconView.performClick();
            if (z3) {
                this.endIconView.jumpDrawablesToCurrentState();
            }
        }
    }

    public void updateSuffixTextViewPadding() {
        if (this.textInputLayout.editText == null) {
            return;
        }
        this.suffixTextView.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), this.textInputLayout.editText.getPaddingTop(), (isEndIconVisible() || isErrorIconVisible()) ? 0 : this.textInputLayout.editText.getPaddingEnd(), this.textInputLayout.editText.getPaddingBottom());
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.endIconView.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
            refreshEndIconDrawableState();
        }
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.errorIconView.setImageDrawable(drawable);
        updateErrorIconVisibility();
        IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, this.errorIconTintList, this.errorIconTintMode);
    }

    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.endIconView.setContentDescription(charSequence);
    }

    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
    }
}
