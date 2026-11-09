package com.google.android.material.button;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatButton;
import androidx.camera.core.impl.L;
import androidx.core.content.d;
import androidx.customview.view.AbsSavedState;
import androidx.dynamicanimation.animation.h;
import androidx.dynamicanimation.animation.j;
import androidx.dynamicanimation.animation.k;
import com.facebook.react.uimanager.b;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.shape.StateListShapeAppearanceModel;
import com.google.android.material.shape.StateListSizeChange;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p024b9.g;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, Shapeable {
    public static final int ICON_GRAVITY_END = 3;
    public static final int ICON_GRAVITY_START = 1;
    public static final int ICON_GRAVITY_TEXT_END = 4;
    public static final int ICON_GRAVITY_TEXT_START = 2;
    public static final int ICON_GRAVITY_TEXT_TOP = 32;
    public static final int ICON_GRAVITY_TOP = 16;
    private static final String LOG_TAG = "MaterialButton";
    private static final float OPTICAL_CENTER_RATIO = 0.11f;
    private static final int UNSET = -1;

    @Nullable
    private String accessibilityClassName;

    @Px
    int allowedWidthDecrease;
    private boolean broadcasting;
    private boolean checked;
    private float displayedWidthDecrease;
    private float displayedWidthIncrease;

    @Nullable
    private Drawable icon;
    private int iconGravity;

    @Px
    private int iconLeft;

    @Px
    private int iconPadding;

    @Px
    private int iconSize;

    @Nullable
    private ColorStateList iconTint;

    @Nullable
    private PorterDuff.Mode iconTintMode;

    @Px
    private int iconTop;
    private boolean isInHorizontalButtonGroup;

    @NonNull
    private final MaterialButtonHelper materialButtonHelper;

    @NonNull
    private final LinkedHashSet<OnCheckedChangeListener> onCheckedChangeListeners;

    @Nullable
    private OnPressedChangeListener onPressedChangeListenerInternal;
    private boolean opticalCenterEnabled;
    private int opticalCenterShift;
    private int orientation;

    @Nullable
    private LinearLayout.LayoutParams originalLayoutParams;

    @Px
    private int originalPaddingEnd;

    @Px
    private int originalPaddingStart;
    private float originalWidth;

    @Nullable
    StateListSizeChange sizeChange;

    @Px
    int widthChangeMax;

    @Nullable
    private j widthIncreaseSpringAnimation;
    private static final int[] CHECKABLE_STATE_SET = {R.attr.state_checkable};
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_Button;

    @AttrRes
    private static final int MATERIAL_SIZE_OVERLAY_ATTR = com.google.android.material.R.attr.materialSizeOverlay;
    private static final h WIDTH_INCREASE = new h("widthIncrease") { // from class: com.google.android.material.button.MaterialButton.1
        @Override // androidx.dynamicanimation.animation.h
        public float getValue(MaterialButton materialButton) {
            return materialButton.getDisplayedWidthIncrease();
        }

        @Override // androidx.dynamicanimation.animation.h
        public void setValue(MaterialButton materialButton, float f10) {
            materialButton.setDisplayedWidthIncrease(f10);
        }
    };

    @Retention(RetentionPolicy.SOURCE)
    public @interface IconGravity {
    }

    @RequiresApi(29)
    @RestrictTo({c.f39800a})
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {
        private int mIconPaddingId;
        private boolean mPropertiesMapped = false;

        public void mapProperties(@NonNull PropertyMapper propertyMapper) {
            this.mIconPaddingId = propertyMapper.mapInt("iconPadding", com.google.android.material.R.attr.iconPadding);
            this.mPropertiesMapped = true;
        }

        public void readProperties(@NonNull MaterialButton materialButton, @NonNull PropertyReader propertyReader) {
            if (!this.mPropertiesMapped) {
                throw b.i();
            }
            propertyReader.readInt(this.mIconPaddingId, materialButton.getIconPadding());
        }
    }

    public interface OnCheckedChangeListener {
        void onCheckedChanged(MaterialButton materialButton, boolean z3);
    }

    public interface OnPressedChangeListener {
        void onPressedChanged(MaterialButton materialButton, boolean z3);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.button.MaterialButton.SavedState.1
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
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };
        boolean checked;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void readFromParcel(@NonNull Parcel parcel) {
            this.checked = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.checked ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            readFromParcel(parcel);
        }
    }

    public MaterialButton(@NonNull Context context) {
        this(context, null);
    }

    private k createSpringForce() {
        return MotionUtils.resolveThemeSpringForce(getContext(), com.google.android.material.R.attr.motionSpringFastSpatial, com.google.android.material.R.style.Motion_Material3_Spring_Standard_Fast_Spatial);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.displayedWidthIncrease;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        MaterialShapeDrawable materialShapeDrawable;
        if (this.opticalCenterEnabled && this.isInHorizontalButtonGroup && (materialShapeDrawable = this.materialButtonHelper.getMaterialShapeDrawable()) != null) {
            return (int) (materialShapeDrawable.getCornerSizeDiffX() * OPTICAL_CENTER_RATIO);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i7 = 0; i7 < lineCount; i7++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i7));
        }
        return (int) Math.ceil(fMax);
    }

    private void initializeSizeAnimation() {
        j jVar = new j(this, WIDTH_INCREASE);
        this.widthIncreaseSpringAnimation = jVar;
        jVar.f16867s = createSpringForce();
    }

    private boolean isIconEnd() {
        int i7 = this.iconGravity;
        return i7 == 3 || i7 == 4;
    }

    private boolean isIconStart() {
        int i7 = this.iconGravity;
        return i7 == 1 || i7 == 2;
    }

    private boolean isIconTop() {
        int i7 = this.iconGravity;
        return i7 == 16 || i7 == 32;
    }

    private boolean isInHorizontalButtonGroup() {
        return (getParent() instanceof MaterialButtonGroup) && ((MaterialButtonGroup) getParent()).getOrientation() == 0;
    }

    private boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    private boolean isUsingOriginalBackground() {
        MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        return (materialButtonHelper == null || materialButtonHelper.isBackgroundOverwritten()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOpticalCenterEnabled$0(float f10) {
        int i7 = (int) (f10 * OPTICAL_CENTER_RATIO);
        if (this.opticalCenterShift != i7) {
            this.opticalCenterShift = i7;
            updatePaddingsAndSizeForWidthAnimation();
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOpticalCenterEnabled$1() {
        this.opticalCenterShift = getOpticalCenterShift();
        updatePaddingsAndSizeForWidthAnimation();
        invalidate();
    }

    private void maybeAnimateSize(boolean z3) {
        if (this.sizeChange == null) {
            return;
        }
        if (this.widthIncreaseSpringAnimation == null) {
            initializeSizeAnimation();
        }
        if (this.isInHorizontalButtonGroup) {
            this.widthIncreaseSpringAnimation.c(Math.min(this.widthChangeMax, this.sizeChange.getSizeChangeForState(getDrawableState()).widthChange.getChange(getWidth())));
            if (z3) {
                this.widthIncreaseSpringAnimation.d();
            }
        }
    }

    private void resetIconDrawable() {
        if (isIconStart()) {
            setCompoundDrawablesRelative(this.icon, null, null, null);
        } else if (isIconEnd()) {
            setCompoundDrawablesRelative(null, null, this.icon, null);
        } else if (isIconTop()) {
            setCompoundDrawablesRelative(null, this.icon, null, null);
        }
    }

    private void setCheckedInternal(boolean z3) {
        if (!isCheckable() || this.checked == z3) {
            return;
        }
        this.checked = z3;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            ((MaterialButtonToggleGroup) getParent()).onButtonCheckedStateChanged(this, this.checked);
        }
        if (this.broadcasting) {
            return;
        }
        this.broadcasting = true;
        Iterator<OnCheckedChangeListener> it = this.onCheckedChangeListeners.iterator();
        while (it.hasNext()) {
            it.next().onCheckedChanged(this, this.checked);
        }
        this.broadcasting = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f10) {
        if (this.displayedWidthIncrease != f10) {
            this.displayedWidthIncrease = f10;
            updatePaddingsAndSizeForWidthAnimation();
            invalidate();
            if (getParent() instanceof MaterialButtonGroup) {
                ((MaterialButtonGroup) getParent()).onButtonWidthChanged(this, (int) this.displayedWidthIncrease);
            }
        }
    }

    private void updateIcon(boolean z3) {
        Drawable drawable = this.icon;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.icon = drawableMutate;
            drawableMutate.setTintList(this.iconTint);
            PorterDuff.Mode mode = this.iconTintMode;
            if (mode != null) {
                this.icon.setTintMode(mode);
            }
            int intrinsicWidth = this.iconSize;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.icon.getIntrinsicWidth();
            }
            int intrinsicHeight = this.iconSize;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.icon.getIntrinsicHeight();
            }
            Drawable drawable2 = this.icon;
            int i7 = this.iconLeft;
            int i10 = this.iconTop;
            drawable2.setBounds(i7, i10, intrinsicWidth + i7, intrinsicHeight + i10);
            this.icon.setVisible(true, z3);
        }
        if (z3) {
            resetIconDrawable();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!isIconStart() || drawable3 == this.icon) && ((!isIconEnd() || drawable5 == this.icon) && (!isIconTop() || drawable4 == this.icon))) {
            return;
        }
        resetIconDrawable();
    }

    private void updateIconPosition(int i7, int i10) {
        if (this.icon == null || getLayout() == null) {
            return;
        }
        if (!isIconStart() && !isIconEnd()) {
            if (isIconTop()) {
                this.iconLeft = 0;
                if (this.iconGravity == 16) {
                    this.iconTop = 0;
                    updateIcon(false);
                    return;
                }
                int intrinsicHeight = this.iconSize;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.icon.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i10 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.iconPadding) - getPaddingBottom()) / 2);
                if (this.iconTop != iMax) {
                    this.iconTop = iMax;
                    updateIcon(false);
                    return;
                }
                return;
            }
            return;
        }
        this.iconTop = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i11 = this.iconGravity;
        if (i11 == 1 || i11 == 3 || ((i11 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i11 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.iconLeft = 0;
            updateIcon(false);
            return;
        }
        int intrinsicWidth = this.iconSize;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.icon.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i7 - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.iconPadding) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (isLayoutRTL() != (this.iconGravity == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.iconLeft != textLayoutWidth) {
            this.iconLeft = textLayoutWidth;
            updateIcon(false);
        }
    }

    private void updatePaddingsAndSizeForWidthAnimation() {
        int i7 = (int) (this.displayedWidthIncrease - this.displayedWidthDecrease);
        int i10 = (i7 / 2) + this.opticalCenterShift;
        getLayoutParams().width = (int) (this.originalWidth + i7);
        setPaddingRelative(this.originalPaddingStart + i10, getPaddingTop(), (this.originalPaddingEnd + i7) - i10, getPaddingBottom());
    }

    public void addOnCheckedChangeListener(@NonNull OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListeners.add(onCheckedChangeListener);
    }

    public void clearOnCheckedChangeListeners() {
        this.onCheckedChangeListeners.clear();
    }

    @NonNull
    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.accessibilityClassName)) {
            return (isCheckable() ? CompoundButton.class : Button.class).getName();
        }
        return this.accessibilityClassName;
    }

    @Px
    public int getAllowedWidthDecrease() {
        return this.allowedWidthDecrease;
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @Px
    public int getCornerRadius() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.getCornerRadius();
        }
        return 0;
    }

    @Nullable
    @RestrictTo({c.f39801b})
    public k getCornerSpringForce() {
        return this.materialButtonHelper.getCornerSpringForce();
    }

    public Drawable getIcon() {
        return this.icon;
    }

    public int getIconGravity() {
        return this.iconGravity;
    }

    @Px
    public int getIconPadding() {
        return this.iconPadding;
    }

    @Px
    public int getIconSize() {
        return this.iconSize;
    }

    public ColorStateList getIconTint() {
        return this.iconTint;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.iconTintMode;
    }

    @Dimension
    public int getInsetBottom() {
        return this.materialButtonHelper.getInsetBottom();
    }

    @Dimension
    public int getInsetTop() {
        return this.materialButtonHelper.getInsetTop();
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.getRippleColor();
        }
        return null;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.getShapeAppearanceModel();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    @Nullable
    @RestrictTo({c.f39801b})
    public StateListShapeAppearanceModel getStateListShapeAppearanceModel() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.getStateListShapeAppearanceModel();
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.getStrokeColor();
        }
        return null;
    }

    @Px
    public int getStrokeWidth() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.getStrokeWidth();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({c.f39801b})
    public ColorStateList getSupportBackgroundTintList() {
        return isUsingOriginalBackground() ? this.materialButtonHelper.getSupportBackgroundTintList() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({c.f39801b})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return isUsingOriginalBackground() ? this.materialButtonHelper.getSupportBackgroundTintMode() : super.getSupportBackgroundTintMode();
    }

    public boolean isCheckable() {
        MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        return materialButtonHelper != null && materialButtonHelper.isCheckable();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.checked;
    }

    public boolean isOpticalCenterEnabled() {
        return this.opticalCenterEnabled;
    }

    public boolean isToggleCheckedStateOnClick() {
        return this.materialButtonHelper.isToggleCheckedStateOnClick();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isUsingOriginalBackground()) {
            MaterialShapeUtils.setParentAbsoluteElevation(this, this.materialButtonHelper.getMaterialShapeDrawable());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 2);
        if (isCheckable()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKABLE_STATE_SET);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z3, i7, i10, i11, i12);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        int i14 = getResources().getConfiguration().orientation;
        if (this.orientation != i14) {
            this.orientation = i14;
            this.originalWidth = -1.0f;
        }
        if (this.originalWidth == -1.0f) {
            this.originalWidth = getMeasuredWidth();
            if (this.originalLayoutParams == null && (getParent() instanceof MaterialButtonGroup) && ((MaterialButtonGroup) getParent()).getButtonSizeChange() != null) {
                this.originalLayoutParams = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.originalLayoutParams);
                layoutParams.width = (int) this.originalWidth;
                setLayoutParams(layoutParams);
            }
        }
        if (this.allowedWidthDecrease == -1) {
            if (this.icon == null) {
                i13 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.iconSize;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.icon.getIntrinsicWidth();
                }
                i13 = iconPadding + intrinsicWidth;
            }
            this.allowedWidthDecrease = (getMeasuredWidth() - getTextLayoutWidth()) - i13;
        }
        if (this.originalPaddingStart == -1) {
            this.originalPaddingStart = getPaddingStart();
        }
        if (this.originalPaddingEnd == -1) {
            this.originalPaddingEnd = getPaddingEnd();
        }
        this.isInHorizontalButtonGroup = isInHorizontalButtonGroup();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.checked);
    }

    @Override // android.widget.TextView, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.checked = this.checked;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (isEnabled() && this.materialButtonHelper.isToggleCheckedStateOnClick()) {
            toggle();
        }
        return super.performClick();
    }

    public void recoverOriginalLayoutParams() {
        LinearLayout.LayoutParams layoutParams = this.originalLayoutParams;
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
            this.originalLayoutParams = null;
            this.originalWidth = -1.0f;
        }
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.icon != null) {
            if (this.icon.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void removeOnCheckedChangeListener(@NonNull OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListeners.remove(onCheckedChangeListener);
    }

    @RestrictTo({c.f39801b})
    public void setA11yClassName(@Nullable String str) {
        this.accessibilityClassName = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i7) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setBackgroundColor(i7);
        } else {
            super.setBackgroundColor(i7);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!isUsingOriginalBackground()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
        } else {
            this.materialButtonHelper.setBackgroundOverwritten();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@DrawableRes int i7) {
        setBackgroundDrawable(i7 != 0 ? p264r5.a.q(i7, getContext()) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z3) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setCheckable(z3);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        setCheckedInternal(z3);
    }

    public void setCornerRadius(@Px int i7) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setCornerRadius(i7);
        }
    }

    public void setCornerRadiusResource(@DimenRes int i7) {
        if (isUsingOriginalBackground()) {
            setCornerRadius(getResources().getDimensionPixelSize(i7));
        }
    }

    @RestrictTo({c.f39801b})
    public void setCornerSpringForce(@NonNull k kVar) {
        this.materialButtonHelper.setCornerSpringForce(kVar);
    }

    public void setDisplayedWidthDecrease(int i7) {
        this.displayedWidthDecrease = Math.min(i7, this.allowedWidthDecrease);
        updatePaddingsAndSizeForWidthAnimation();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.getMaterialShapeDrawable().setElevation(f10);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.icon != drawable) {
            this.icon = drawable;
            updateIcon(true);
            updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i7) {
        if (this.iconGravity != i7) {
            this.iconGravity = i7;
            updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@Px int i7) {
        if (this.iconPadding != i7) {
            this.iconPadding = i7;
            setCompoundDrawablePadding(i7);
        }
    }

    public void setIconResource(@DrawableRes int i7) {
        setIcon(i7 != 0 ? p264r5.a.q(i7, getContext()) : null);
    }

    public void setIconSize(@Px int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.iconSize != i7) {
            this.iconSize = i7;
            updateIcon(true);
        }
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.iconTint != colorStateList) {
            this.iconTint = colorStateList;
            updateIcon(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.iconTintMode != mode) {
            this.iconTintMode = mode;
            updateIcon(false);
        }
    }

    public void setIconTintResource(@ColorRes int i7) {
        setIconTint(d.c(i7, getContext()));
    }

    public void setInsetBottom(@Dimension int i7) {
        this.materialButtonHelper.setInsetBottom(i7);
    }

    public void setInsetTop(@Dimension int i7) {
        this.materialButtonHelper.setInsetTop(i7);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@Nullable OnPressedChangeListener onPressedChangeListener) {
        this.onPressedChangeListenerInternal = onPressedChangeListener;
    }

    public void setOpticalCenterEnabled(boolean z3) {
        if (this.opticalCenterEnabled != z3) {
            this.opticalCenterEnabled = z3;
            if (z3) {
                this.materialButtonHelper.setCornerSizeChangeListener(new L(this, 22));
            } else {
                this.materialButtonHelper.setCornerSizeChangeListener(null);
            }
            post(new g(this, 18));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        OnPressedChangeListener onPressedChangeListener = this.onPressedChangeListenerInternal;
        if (onPressedChangeListener != null) {
            onPressedChangeListener.onPressedChanged(this, z3);
        }
        super.setPressed(z3);
        maybeAnimateSize(false);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setRippleColor(colorStateList);
        }
    }

    public void setRippleColorResource(@ColorRes int i7) {
        if (isUsingOriginalBackground()) {
            setRippleColor(d.c(i7, getContext()));
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (!isUsingOriginalBackground()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.materialButtonHelper.setShapeAppearanceModel(shapeAppearanceModel);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z3) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setShouldDrawSurfaceColorStroke(z3);
        }
    }

    public void setSizeChange(@NonNull StateListSizeChange stateListSizeChange) {
        if (this.sizeChange != stateListSizeChange) {
            this.sizeChange = stateListSizeChange;
            maybeAnimateSize(true);
        }
    }

    @RestrictTo({c.f39801b})
    public void setStateListShapeAppearanceModel(@NonNull StateListShapeAppearanceModel stateListShapeAppearanceModel) {
        if (!isUsingOriginalBackground()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        if (this.materialButtonHelper.getCornerSpringForce() == null && stateListShapeAppearanceModel.isStateful()) {
            this.materialButtonHelper.setCornerSpringForce(createSpringForce());
        }
        this.materialButtonHelper.setStateListShapeAppearanceModel(stateListShapeAppearanceModel);
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setStrokeColor(colorStateList);
        }
    }

    public void setStrokeColorResource(@ColorRes int i7) {
        if (isUsingOriginalBackground()) {
            setStrokeColor(d.c(i7, getContext()));
        }
    }

    public void setStrokeWidth(@Px int i7) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setStrokeWidth(i7);
        }
    }

    public void setStrokeWidthResource(@DimenRes int i7) {
        if (isUsingOriginalBackground()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i7));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @RestrictTo({c.f39801b})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setSupportBackgroundTintList(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @RestrictTo({c.f39801b})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setSupportBackgroundTintMode(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i7) {
        super.setTextAlignment(i7);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z3) {
        this.materialButtonHelper.setToggleCheckedStateOnClick(z3);
    }

    @Override // android.widget.TextView
    public void setWidth(@Px int i7) {
        this.originalWidth = -1.0f;
        super.setWidth(i7);
    }

    public void setWidthChangeMax(@Px int i7) {
        if (this.widthChangeMax != i7) {
            this.widthChangeMax = i7;
            maybeAnimateSize(true);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.checked);
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        ShapeAppearanceModel shapeAppearanceModelBuild;
        int i10 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i7, i10, new int[]{MATERIAL_SIZE_OVERLAY_ATTR}), attributeSet, i7);
        this.onCheckedChangeListeners = new LinkedHashSet<>();
        this.checked = false;
        this.broadcasting = false;
        this.orientation = -1;
        this.originalWidth = -1.0f;
        this.originalPaddingStart = -1;
        this.originalPaddingEnd = -1;
        this.allowedWidthDecrease = -1;
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.MaterialButton, i7, i10, new int[0]);
        this.iconPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_iconPadding, 0);
        this.iconTintMode = ViewUtils.parseTintMode(typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.iconTint = MaterialResources.getColorStateList(getContext(), typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialButton_iconTint);
        this.icon = MaterialResources.getDrawable(getContext(), typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialButton_icon);
        this.iconGravity = typedArrayObtainStyledAttributes.getInteger(com.google.android.material.R.styleable.MaterialButton_iconGravity, 1);
        this.iconSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_iconSize, 0);
        StateListShapeAppearanceModel stateListShapeAppearanceModelCreate = StateListShapeAppearanceModel.create(context2, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialButton_shapeAppearance);
        if (stateListShapeAppearanceModelCreate != null) {
            shapeAppearanceModelBuild = stateListShapeAppearanceModelCreate.getDefaultShape(true);
        } else {
            shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context2, attributeSet, i7, i10).build();
        }
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.MaterialButton_opticalCenterEnabled, false);
        MaterialButtonHelper materialButtonHelper = new MaterialButtonHelper(this, shapeAppearanceModelBuild);
        this.materialButtonHelper = materialButtonHelper;
        materialButtonHelper.loadFromAttributes(typedArrayObtainStyledAttributes);
        setCheckedInternal(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.MaterialButton_android_checked, false));
        if (stateListShapeAppearanceModelCreate != null) {
            materialButtonHelper.setCornerSpringForce(createSpringForce());
            materialButtonHelper.setStateListShapeAppearanceModel(stateListShapeAppearanceModelCreate);
        }
        setOpticalCenterEnabled(z3);
        typedArrayObtainStyledAttributes.recycle();
        setCompoundDrawablePadding(this.iconPadding);
        updateIcon(this.icon != null);
    }
}
