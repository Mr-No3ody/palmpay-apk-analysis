package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Z0;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
class StartCompoundLayout extends LinearLayout {
    private boolean hintExpanded;

    @Nullable
    private CharSequence prefixText;
    private final TextView prefixTextView;
    private int startIconMinSize;
    private View.OnLongClickListener startIconOnLongClickListener;

    @NonNull
    private ImageView.ScaleType startIconScaleType;
    private ColorStateList startIconTintList;
    private PorterDuff.Mode startIconTintMode;
    private final CheckableImageButton startIconView;
    private final TextInputLayout textInputLayout;

    public StartCompoundLayout(TextInputLayout textInputLayout, Z0 z3) {
        super(textInputLayout.getContext());
        this.textInputLayout = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.startIconView = checkableImageButton;
        IconHelper.setCompatRippleBackgroundIfNeeded(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.prefixTextView = appCompatTextView;
        initStartIconView(z3);
        initPrefixTextView(z3);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void initPrefixTextView(Z0 z3) {
        this.prefixTextView.setVisibility(8);
        this.prefixTextView.setId(R.id.textinput_prefix_text);
        this.prefixTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.prefixTextView.setAccessibilityLiveRegion(1);
        setPrefixTextAppearance(z3.f12863b.getResourceId(R.styleable.TextInputLayout_prefixTextAppearance, 0));
        int i7 = R.styleable.TextInputLayout_prefixTextColor;
        TypedArray typedArray = z3.f12863b;
        if (typedArray.hasValue(i7)) {
            setPrefixTextColor(z3.a(R.styleable.TextInputLayout_prefixTextColor));
        }
        setPrefixText(typedArray.getText(R.styleable.TextInputLayout_prefixText));
    }

    private void initStartIconView(Z0 z3) {
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            ((ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams()).setMarginEnd(0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (z3.f12863b.hasValue(R.styleable.TextInputLayout_startIconTint)) {
            this.startIconTintList = MaterialResources.getColorStateList(getContext(), z3, R.styleable.TextInputLayout_startIconTint);
        }
        int i7 = R.styleable.TextInputLayout_startIconTintMode;
        TypedArray typedArray = z3.f12863b;
        if (typedArray.hasValue(i7)) {
            this.startIconTintMode = ViewUtils.parseTintMode(typedArray.getInt(R.styleable.TextInputLayout_startIconTintMode, -1), null);
        }
        if (typedArray.hasValue(R.styleable.TextInputLayout_startIconDrawable)) {
            setStartIconDrawable(z3.b(R.styleable.TextInputLayout_startIconDrawable));
            if (typedArray.hasValue(R.styleable.TextInputLayout_startIconContentDescription)) {
                setStartIconContentDescription(typedArray.getText(R.styleable.TextInputLayout_startIconContentDescription));
            }
            setStartIconCheckable(typedArray.getBoolean(R.styleable.TextInputLayout_startIconCheckable, true));
        }
        setStartIconMinSize(typedArray.getDimensionPixelSize(R.styleable.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size)));
        if (typedArray.hasValue(R.styleable.TextInputLayout_startIconScaleType)) {
            setStartIconScaleType(IconHelper.convertScaleType(typedArray.getInt(R.styleable.TextInputLayout_startIconScaleType, -1)));
        }
    }

    private void updateVisibility() {
        int i7 = (this.prefixText == null || this.hintExpanded) ? 8 : 0;
        setVisibility((this.startIconView.getVisibility() == 0 || i7 == 0) ? 0 : 8);
        this.prefixTextView.setVisibility(i7);
        this.textInputLayout.updateDummyDrawables();
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.prefixText;
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.prefixTextView.getTextColors();
    }

    public int getPrefixTextStartOffset() {
        int marginEnd;
        if (isStartIconVisible()) {
            marginEnd = ((ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams()).getMarginEnd() + this.startIconView.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.prefixTextView.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.prefixTextView;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.startIconView.getContentDescription();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.startIconView.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.startIconMinSize;
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.startIconScaleType;
    }

    public boolean isStartIconCheckable() {
        return this.startIconView.isCheckable();
    }

    public boolean isStartIconVisible() {
        return this.startIconView.getVisibility() == 0;
    }

    public void onHintStateChanged(boolean z3) {
        this.hintExpanded = z3;
        updateVisibility();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        updatePrefixTextViewPadding();
    }

    public void refreshStartIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.startIconView, this.startIconTintList);
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        this.prefixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.prefixTextView.setText(charSequence);
        updateVisibility();
    }

    public void setPrefixTextAppearance(@StyleRes int i7) {
        this.prefixTextView.setTextAppearance(i7);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.prefixTextView.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z3) {
        this.startIconView.setCheckable(z3);
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.startIconView.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.startIconView.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, this.startIconTintMode);
            setStartIconVisible(true);
            refreshStartIconDrawableState();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription(null);
        }
    }

    public void setStartIconMinSize(@Px int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i7 != this.startIconMinSize) {
            this.startIconMinSize = i7;
            IconHelper.setIconMinSize(this.startIconView, i7);
        }
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.startIconView, onClickListener, this.startIconOnLongClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.startIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.startIconView, onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.startIconScaleType = scaleType;
        IconHelper.setIconScaleType(this.startIconView, scaleType);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.startIconTintList != colorStateList) {
            this.startIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, colorStateList, this.startIconTintMode);
        }
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.startIconTintMode != mode) {
            this.startIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, mode);
        }
    }

    public void setStartIconVisible(boolean z3) {
        if (isStartIconVisible() != z3) {
            this.startIconView.setVisibility(z3 ? 0 : 8);
            updatePrefixTextViewPadding();
            updateVisibility();
        }
    }

    public void setupAccessibilityNodeInfo(@NonNull p074f0.d dVar) {
        if (this.prefixTextView.getVisibility() != 0) {
            dVar.f36360a.setTraversalAfter(this.startIconView);
        } else {
            dVar.f36360a.setLabelFor(this.prefixTextView);
            dVar.f36360a.setTraversalAfter(this.prefixTextView);
        }
    }

    public void updatePrefixTextViewPadding() {
        EditText editText = this.textInputLayout.editText;
        if (editText == null) {
            return;
        }
        this.prefixTextView.setPaddingRelative(isStartIconVisible() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }
}
