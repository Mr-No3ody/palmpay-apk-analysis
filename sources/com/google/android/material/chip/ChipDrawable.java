package com.google.android.material.chip;

import C9.N;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.AnimatorRes;
import androidx.annotation.AttrRes;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.XmlRes;
import androidx.core.graphics.d;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.text.f;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import org.chromium.support_lib_boundary.util.b;
import p264r5.a;

/* JADX INFO: loaded from: classes2.dex */
public class ChipDrawable extends MaterialShapeDrawable implements TintAwareDrawable, Drawable.Callback, TextDrawableHelper.TextDrawableDelegate {
    private static final boolean DEBUG = false;
    private static final int MAX_CHIP_ICON_HEIGHT = 24;
    private static final String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";
    private int alpha;
    private boolean checkable;

    @Nullable
    private Drawable checkedIcon;

    @Nullable
    private ColorStateList checkedIconTint;
    private boolean checkedIconVisible;

    @Nullable
    private ColorStateList chipBackgroundColor;
    private float chipCornerRadius;
    private float chipEndPadding;

    @Nullable
    private Drawable chipIcon;
    private float chipIconSize;

    @Nullable
    private ColorStateList chipIconTint;
    private boolean chipIconVisible;
    private float chipMinHeight;
    private final Paint chipPaint;
    private float chipStartPadding;

    @Nullable
    private ColorStateList chipStrokeColor;
    private float chipStrokeWidth;

    @Nullable
    private ColorStateList chipSurfaceColor;

    @Nullable
    private Drawable closeIcon;

    @Nullable
    private CharSequence closeIconContentDescription;
    private float closeIconEndPadding;

    @Nullable
    private Drawable closeIconRipple;
    private float closeIconSize;
    private float closeIconStartPadding;
    private int[] closeIconStateSet;

    @Nullable
    private ColorStateList closeIconTint;
    private boolean closeIconVisible;

    @Nullable
    private ColorFilter colorFilter;

    @Nullable
    private ColorStateList compatRippleColor;

    @NonNull
    private final Context context;
    private boolean currentChecked;

    @ColorInt
    private int currentChipBackgroundColor;

    @ColorInt
    private int currentChipStrokeColor;

    @ColorInt
    private int currentChipSurfaceColor;

    @ColorInt
    private int currentCompatRippleColor;

    @ColorInt
    private int currentCompositeSurfaceBackgroundColor;

    @ColorInt
    private int currentTextColor;

    @ColorInt
    private int currentTint;

    @Nullable
    private final Paint debugPaint;

    @NonNull
    private WeakReference<Delegate> delegate;
    private final Paint.FontMetrics fontMetrics;
    private boolean hasChipIconTint;

    @Nullable
    private MotionSpec hideMotionSpec;
    private float iconEndPadding;
    private float iconStartPadding;
    private boolean isShapeThemingEnabled;
    private int maxWidth;
    private final PointF pointF;
    private final RectF rectF;

    @Nullable
    private ColorStateList rippleColor;
    private final Path shapePath;
    private boolean shouldDrawText;

    @Nullable
    private MotionSpec showMotionSpec;

    @Nullable
    private CharSequence text;

    @NonNull
    private final TextDrawableHelper textDrawableHelper;
    private float textEndPadding;
    private float textStartPadding;

    @Nullable
    private ColorStateList tint;

    @Nullable
    private PorterDuffColorFilter tintFilter;

    @Nullable
    private PorterDuff.Mode tintMode;
    private TextUtils.TruncateAt truncateAt;
    private boolean useCompatRipple;
    private static final int[] DEFAULT_STATE = {R.attr.state_enabled};
    private static final ShapeDrawable closeIconRippleMask = new ShapeDrawable(new OvalShape());

    public interface Delegate {
        void onChipDrawableSizeChange();
    }

    private ChipDrawable(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i7, @StyleRes int i10) {
        super(context, attributeSet, i7, i10);
        this.chipCornerRadius = -1.0f;
        this.chipPaint = new Paint(1);
        this.fontMetrics = new Paint.FontMetrics();
        this.rectF = new RectF();
        this.pointF = new PointF();
        this.shapePath = new Path();
        this.alpha = 255;
        this.tintMode = PorterDuff.Mode.SRC_IN;
        this.delegate = new WeakReference<>(null);
        initializeElevationOverlay(context);
        this.context = context;
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.textDrawableHelper = textDrawableHelper;
        this.text = "";
        textDrawableHelper.getTextPaint().density = context.getResources().getDisplayMetrics().density;
        this.debugPaint = null;
        int[] iArr = DEFAULT_STATE;
        setState(iArr);
        setCloseIconState(iArr);
        this.shouldDrawText = true;
        closeIconRippleMask.setTint(-1);
    }

    private void applyChildDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.closeIcon) {
            if (drawable.isStateful()) {
                drawable.setState(getCloseIconState());
            }
            drawable.setTintList(this.closeIconTint);
            return;
        }
        Drawable drawable2 = this.chipIcon;
        if (drawable == drawable2 && this.hasChipIconTint) {
            drawable2.setTintList(this.chipIconTint);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void calculateChipIconBounds(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (showsChipIcon() || showsCheckedIcon()) {
            float f10 = this.chipStartPadding + this.iconStartPadding;
            float currentChipIconWidth = getCurrentChipIconWidth();
            if (getLayoutDirection() == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + currentChipIconWidth;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - currentChipIconWidth;
            }
            float currentChipIconHeight = getCurrentChipIconHeight();
            float fExactCenterY = rect.exactCenterY() - (currentChipIconHeight / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + currentChipIconHeight;
        }
    }

    private void calculateChipTouchBounds(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.set(rect);
        if (showsCloseIcon()) {
            float f10 = this.chipEndPadding + this.closeIconEndPadding + this.closeIconSize + this.closeIconStartPadding + this.textEndPadding;
            if (getLayoutDirection() == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    private void calculateCloseIconBounds(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (showsCloseIcon()) {
            float f10 = this.chipEndPadding + this.closeIconEndPadding;
            if (getLayoutDirection() == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.closeIconSize;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.closeIconSize;
            }
            float fExactCenterY = rect.exactCenterY();
            float f13 = this.closeIconSize;
            float f14 = fExactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    private void calculateCloseIconTouchBounds(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (showsCloseIcon()) {
            float f10 = this.chipEndPadding + this.closeIconEndPadding + this.closeIconSize + this.closeIconStartPadding + this.textEndPadding;
            if (getLayoutDirection() == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i7 = rect.left;
                rectF.left = i7;
                rectF.right = i7 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void calculateTextBounds(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (this.text != null) {
            float fCalculateChipIconWidth = calculateChipIconWidth() + this.chipStartPadding + this.textStartPadding;
            float fCalculateCloseIconWidth = calculateCloseIconWidth() + this.chipEndPadding + this.textEndPadding;
            if (getLayoutDirection() == 0) {
                rectF.left = rect.left + fCalculateChipIconWidth;
                rectF.right = rect.right - fCalculateCloseIconWidth;
            } else {
                rectF.left = rect.left + fCalculateCloseIconWidth;
                rectF.right = rect.right - fCalculateChipIconWidth;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private float calculateTextCenterFromBaseline() {
        this.textDrawableHelper.getTextPaint().getFontMetrics(this.fontMetrics);
        Paint.FontMetrics fontMetrics = this.fontMetrics;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private boolean canShowCheckedIcon() {
        return this.checkedIconVisible && this.checkedIcon != null && this.checkable;
    }

    @NonNull
    public static ChipDrawable createFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i7, @StyleRes int i10) {
        ChipDrawable chipDrawable = new ChipDrawable(context, attributeSet, i7, i10);
        chipDrawable.loadFromAttributes(attributeSet, i7, i10);
        return chipDrawable;
    }

    @NonNull
    public static ChipDrawable createFromResource(@NonNull Context context, @XmlRes int i7) {
        AttributeSet drawableXml = DrawableUtils.parseDrawableXml(context, i7, "chip");
        int styleAttribute = drawableXml.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = com.google.android.material.R.style.Widget_MaterialComponents_Chip_Entry;
        }
        return createFromAttributes(context, drawableXml, com.google.android.material.R.attr.chipStandaloneStyle, styleAttribute);
    }

    private void drawCheckedIcon(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (showsCheckedIcon()) {
            calculateChipIconBounds(rect, this.rectF);
            RectF rectF = this.rectF;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.checkedIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            this.checkedIcon.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void drawChipBackground(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.isShapeThemingEnabled) {
            return;
        }
        this.chipPaint.setColor(this.currentChipBackgroundColor);
        this.chipPaint.setStyle(Paint.Style.FILL);
        this.chipPaint.setColorFilter(getTintColorFilter());
        this.rectF.set(rect);
        canvas.drawRoundRect(this.rectF, getChipCornerRadius(), getChipCornerRadius(), this.chipPaint);
    }

    private void drawChipIcon(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (showsChipIcon()) {
            calculateChipIconBounds(rect, this.rectF);
            RectF rectF = this.rectF;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.chipIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            this.chipIcon.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void drawChipStroke(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.chipStrokeWidth <= 0.0f || this.isShapeThemingEnabled) {
            return;
        }
        this.chipPaint.setColor(this.currentChipStrokeColor);
        this.chipPaint.setStyle(Paint.Style.STROKE);
        if (!this.isShapeThemingEnabled) {
            this.chipPaint.setColorFilter(getTintColorFilter());
        }
        RectF rectF = this.rectF;
        float f10 = rect.left;
        float f11 = this.chipStrokeWidth;
        rectF.set((f11 / 2.0f) + f10, (f11 / 2.0f) + rect.top, rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
        float f12 = this.chipCornerRadius - (this.chipStrokeWidth / 2.0f);
        canvas.drawRoundRect(this.rectF, f12, f12, this.chipPaint);
    }

    private void drawChipSurface(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.isShapeThemingEnabled) {
            return;
        }
        this.chipPaint.setColor(this.currentChipSurfaceColor);
        this.chipPaint.setStyle(Paint.Style.FILL);
        this.rectF.set(rect);
        canvas.drawRoundRect(this.rectF, getChipCornerRadius(), getChipCornerRadius(), this.chipPaint);
    }

    private void drawCloseIcon(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (showsCloseIcon()) {
            calculateCloseIconBounds(rect, this.rectF);
            RectF rectF = this.rectF;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.closeIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            this.closeIconRipple.setBounds(this.closeIcon.getBounds());
            this.closeIconRipple.jumpToCurrentState();
            this.closeIconRipple.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void drawCompatRipple(@NonNull Canvas canvas, @NonNull Rect rect) {
        this.chipPaint.setColor(this.currentCompatRippleColor);
        this.chipPaint.setStyle(Paint.Style.FILL);
        this.rectF.set(rect);
        if (!this.isShapeThemingEnabled) {
            canvas.drawRoundRect(this.rectF, getChipCornerRadius(), getChipCornerRadius(), this.chipPaint);
        } else {
            calculatePathForSize(new RectF(rect), this.shapePath);
            super.drawShape(canvas, this.chipPaint, this.shapePath, getBoundsAsRectF());
        }
    }

    private void drawDebug(@NonNull Canvas canvas, @NonNull Rect rect) {
        Canvas canvas2;
        Paint paint = this.debugPaint;
        if (paint != null) {
            paint.setColor(d.e(-16777216, 127));
            canvas.drawRect(rect, this.debugPaint);
            if (showsChipIcon() || showsCheckedIcon()) {
                calculateChipIconBounds(rect, this.rectF);
                canvas.drawRect(this.rectF, this.debugPaint);
            }
            if (this.text != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.debugPaint);
            } else {
                canvas2 = canvas;
            }
            if (showsCloseIcon()) {
                calculateCloseIconBounds(rect, this.rectF);
                canvas2.drawRect(this.rectF, this.debugPaint);
            }
            this.debugPaint.setColor(d.e(-65536, 127));
            calculateChipTouchBounds(rect, this.rectF);
            canvas2.drawRect(this.rectF, this.debugPaint);
            this.debugPaint.setColor(d.e(-16711936, 127));
            calculateCloseIconTouchBounds(rect, this.rectF);
            canvas2.drawRect(this.rectF, this.debugPaint);
        }
    }

    private void drawText(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.text != null) {
            Paint.Align alignCalculateTextOriginAndAlignment = calculateTextOriginAndAlignment(rect, this.pointF);
            calculateTextBounds(rect, this.rectF);
            if (this.textDrawableHelper.getTextAppearance() != null) {
                this.textDrawableHelper.getTextPaint().drawableState = getState();
                this.textDrawableHelper.updateTextPaintDrawState(this.context);
            }
            this.textDrawableHelper.getTextPaint().setTextAlign(alignCalculateTextOriginAndAlignment);
            int iSave = 0;
            boolean z3 = Math.round(this.textDrawableHelper.getTextWidth(getText().toString())) > Math.round(this.rectF.width());
            if (z3) {
                iSave = canvas.save();
                canvas.clipRect(this.rectF);
            }
            CharSequence charSequenceEllipsize = this.text;
            if (z3 && this.truncateAt != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.textDrawableHelper.getTextPaint(), this.rectF.width(), this.truncateAt);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.pointF;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.textDrawableHelper.getTextPaint());
            if (z3) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private float getCurrentChipIconHeight() {
        Drawable drawable = this.currentChecked ? this.checkedIcon : this.chipIcon;
        float fCeil = this.chipIconSize;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(ViewUtils.dpToPx(this.context, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private float getCurrentChipIconWidth() {
        Drawable drawable = this.currentChecked ? this.checkedIcon : this.chipIcon;
        float f10 = this.chipIconSize;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    @Nullable
    private ColorFilter getTintColorFilter() {
        ColorFilter colorFilter = this.colorFilter;
        return colorFilter != null ? colorFilter : this.tintFilter;
    }

    private static boolean hasState(@Nullable int[] iArr, @AttrRes int i7) {
        if (iArr == null) {
            return false;
        }
        for (int i10 : iArr) {
            if (i10 == i7) {
                return true;
            }
        }
        return false;
    }

    private void loadFromAttributes(@Nullable AttributeSet attributeSet, @AttrRes int i7, @StyleRes int i10) {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(this.context, attributeSet, com.google.android.material.R.styleable.Chip, i7, i10, new int[0]);
        this.isShapeThemingEnabled = typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.Chip_shapeAppearance);
        setChipSurfaceColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipSurfaceColor));
        setChipBackgroundColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipBackgroundColor));
        setChipMinHeight(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipMinHeight, 0.0f));
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.Chip_chipCornerRadius)) {
            setChipCornerRadius(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipCornerRadius, 0.0f));
        }
        setChipStrokeColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipStrokeColor));
        setChipStrokeWidth(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipStrokeWidth, 0.0f));
        setRippleColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_rippleColor));
        setText(typedArrayObtainStyledAttributes.getText(com.google.android.material.R.styleable.Chip_android_text));
        TextAppearance textAppearance = MaterialResources.getTextAppearance(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_android_textAppearance);
        textAppearance.setTextSize(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_android_textSize, textAppearance.getTextSize()));
        setTextAppearance(textAppearance);
        int i11 = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.Chip_android_ellipsize, 0);
        if (i11 == 1) {
            setEllipsize(TextUtils.TruncateAt.START);
        } else if (i11 == 2) {
            setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if (i11 == 3) {
            setEllipsize(TextUtils.TruncateAt.END);
        }
        setChipIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(NAMESPACE_APP, "chipIconEnabled") != null && attributeSet.getAttributeValue(NAMESPACE_APP, "chipIconVisible") == null) {
            setChipIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_chipIconEnabled, false));
        }
        setChipIcon(MaterialResources.getDrawable(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipIcon));
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.Chip_chipIconTint)) {
            setChipIconTint(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipIconTint));
        }
        setChipIconSize(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipIconSize, -1.0f));
        setCloseIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(NAMESPACE_APP, "closeIconEnabled") != null && attributeSet.getAttributeValue(NAMESPACE_APP, "closeIconVisible") == null) {
            setCloseIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_closeIconEnabled, false));
        }
        setCloseIcon(MaterialResources.getDrawable(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_closeIcon));
        setCloseIconTint(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_closeIconTint));
        setCloseIconSize(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_closeIconSize, 0.0f));
        setCheckable(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_android_checkable, false));
        setCheckedIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(NAMESPACE_APP, "checkedIconEnabled") != null && attributeSet.getAttributeValue(NAMESPACE_APP, "checkedIconVisible") == null) {
            setCheckedIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_checkedIconEnabled, false));
        }
        setCheckedIcon(MaterialResources.getDrawable(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_checkedIcon));
        if (typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.Chip_checkedIconTint)) {
            setCheckedIconTint(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_checkedIconTint));
        }
        setShowMotionSpec(MotionSpec.createFromAttribute(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_showMotionSpec));
        setHideMotionSpec(MotionSpec.createFromAttribute(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_hideMotionSpec));
        setChipStartPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipStartPadding, 0.0f));
        setIconStartPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_iconStartPadding, 0.0f));
        setIconEndPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_iconEndPadding, 0.0f));
        setTextStartPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_textStartPadding, 0.0f));
        setTextEndPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_textEndPadding, 0.0f));
        setCloseIconStartPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_closeIconStartPadding, 0.0f));
        setCloseIconEndPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_closeIconEndPadding, 0.0f));
        setChipEndPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipEndPadding, 0.0f));
        setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.Chip_android_maxWidth, Integer.MAX_VALUE));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setChipSurfaceColor(@Nullable ColorStateList colorStateList) {
        if (this.chipSurfaceColor != colorStateList) {
            this.chipSurfaceColor = colorStateList;
            onStateChange(getState());
        }
    }

    private boolean showsCheckedIcon() {
        return this.checkedIconVisible && this.checkedIcon != null && this.currentChecked;
    }

    private boolean showsChipIcon() {
        return this.chipIconVisible && this.chipIcon != null;
    }

    private boolean showsCloseIcon() {
        return this.closeIconVisible && this.closeIcon != null;
    }

    private void unapplyChildDrawable(@Nullable Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void updateCompatRippleColor() {
        this.compatRippleColor = this.useCompatRipple ? RippleUtils.sanitizeRippleDrawableColor(this.rippleColor) : null;
    }

    private void updateFrameworkCloseIconRipple() {
        this.closeIconRipple = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(getRippleColor()), this.closeIcon, closeIconRippleMask);
    }

    public float calculateChipIconWidth() {
        if (showsChipIcon() || showsCheckedIcon()) {
            return this.iconStartPadding + getCurrentChipIconWidth() + this.iconEndPadding;
        }
        return 0.0f;
    }

    public float calculateCloseIconWidth() {
        if (showsCloseIcon()) {
            return this.closeIconStartPadding + this.closeIconSize + this.closeIconEndPadding;
        }
        return 0.0f;
    }

    @NonNull
    public Paint.Align calculateTextOriginAndAlignment(@NonNull Rect rect, @NonNull PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.text != null) {
            float fCalculateChipIconWidth = calculateChipIconWidth() + this.chipStartPadding + this.textStartPadding;
            if (getLayoutDirection() == 0) {
                pointF.x = rect.left + fCalculateChipIconWidth;
            } else {
                pointF.x = rect.right - fCalculateChipIconWidth;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - calculateTextCenterFromBaseline();
        }
        return align;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Canvas canvas2;
        int iSaveLayerAlpha;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i7 = this.alpha;
        if (i7 < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = CanvasCompat.saveLayerAlpha(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i7);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        drawChipSurface(canvas2, bounds);
        drawChipBackground(canvas2, bounds);
        if (this.isShapeThemingEnabled) {
            super.draw(canvas2);
        }
        drawChipStroke(canvas2, bounds);
        drawCompatRipple(canvas2, bounds);
        drawChipIcon(canvas2, bounds);
        drawCheckedIcon(canvas2, bounds);
        if (this.shouldDrawText) {
            drawText(canvas2, bounds);
        }
        drawCloseIcon(canvas2, bounds);
        drawDebug(canvas2, bounds);
        if (this.alpha < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.alpha;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.checkedIcon;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.checkedIconTint;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        return this.chipBackgroundColor;
    }

    public float getChipCornerRadius() {
        return this.isShapeThemingEnabled ? getTopLeftCornerResolvedSize() : this.chipCornerRadius;
    }

    public float getChipEndPadding() {
        return this.chipEndPadding;
    }

    @Nullable
    public Drawable getChipIcon() {
        Drawable drawable = this.chipIcon;
        if (drawable != null) {
            return b.p0(drawable);
        }
        return null;
    }

    public float getChipIconSize() {
        return this.chipIconSize;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        return this.chipIconTint;
    }

    public float getChipMinHeight() {
        return this.chipMinHeight;
    }

    public float getChipStartPadding() {
        return this.chipStartPadding;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        return this.chipStrokeColor;
    }

    public float getChipStrokeWidth() {
        return this.chipStrokeWidth;
    }

    public void getChipTouchBounds(@NonNull RectF rectF) {
        calculateChipTouchBounds(getBounds(), rectF);
    }

    @Nullable
    public Drawable getCloseIcon() {
        Drawable drawable = this.closeIcon;
        if (drawable != null) {
            return b.p0(drawable);
        }
        return null;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        return this.closeIconContentDescription;
    }

    public float getCloseIconEndPadding() {
        return this.closeIconEndPadding;
    }

    public float getCloseIconSize() {
        return this.closeIconSize;
    }

    public float getCloseIconStartPadding() {
        return this.closeIconStartPadding;
    }

    @NonNull
    public int[] getCloseIconState() {
        return this.closeIconStateSet;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        return this.closeIconTint;
    }

    public void getCloseIconTouchBounds(@NonNull RectF rectF) {
        calculateCloseIconTouchBounds(getBounds(), rectF);
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public TextUtils.TruncateAt getEllipsize() {
        return this.truncateAt;
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        return this.hideMotionSpec;
    }

    public float getIconEndPadding() {
        return this.iconEndPadding;
    }

    public float getIconStartPadding() {
        return this.iconStartPadding;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.chipMinHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(calculateCloseIconWidth() + this.textDrawableHelper.getTextWidth(getText().toString()) + calculateChipIconWidth() + this.chipStartPadding + this.textStartPadding + this.textEndPadding + this.chipEndPadding), this.maxWidth);
    }

    @Px
    public int getMaxWidth() {
        return this.maxWidth;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void getOutline(@NonNull Outline outline) {
        Outline outline2;
        if (this.isShapeThemingEnabled) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.chipCornerRadius);
        } else {
            outline.setRoundRect(bounds, this.chipCornerRadius);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    @Nullable
    public ColorStateList getRippleColor() {
        return this.rippleColor;
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        return this.showMotionSpec;
    }

    @Nullable
    public CharSequence getText() {
        return this.text;
    }

    @Nullable
    public TextAppearance getTextAppearance() {
        return this.textDrawableHelper.getTextAppearance();
    }

    public float getTextEndPadding() {
        return this.textEndPadding;
    }

    public float getTextStartPadding() {
        return this.textStartPadding;
    }

    public boolean getUseCompatRipple() {
        return this.useCompatRipple;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isCheckable() {
        return this.checkable;
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        return isCheckedIconVisible();
    }

    public boolean isCheckedIconVisible() {
        return this.checkedIconVisible;
    }

    @Deprecated
    public boolean isChipIconEnabled() {
        return isChipIconVisible();
    }

    public boolean isChipIconVisible() {
        return this.chipIconVisible;
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        return isCloseIconVisible();
    }

    public boolean isCloseIconStateful() {
        return isStateful(this.closeIcon);
    }

    public boolean isCloseIconVisible() {
        return this.closeIconVisible;
    }

    public boolean isShapeThemingEnabled() {
        return this.isShapeThemingEnabled;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (isStateful(this.chipSurfaceColor) || isStateful(this.chipBackgroundColor) || isStateful(this.chipStrokeColor)) {
            return true;
        }
        return (this.useCompatRipple && isStateful(this.compatRippleColor)) || isStateful(this.textDrawableHelper.getTextAppearance()) || canShowCheckedIcon() || isStateful(this.chipIcon) || isStateful(this.checkedIcon) || isStateful(this.tint);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i7) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i7);
        if (showsChipIcon()) {
            zOnLayoutDirectionChanged |= this.chipIcon.setLayoutDirection(i7);
        }
        if (showsCheckedIcon()) {
            zOnLayoutDirectionChanged |= this.checkedIcon.setLayoutDirection(i7);
        }
        if (showsCloseIcon()) {
            zOnLayoutDirectionChanged |= this.closeIcon.setLayoutDirection(i7);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i7) {
        boolean zOnLevelChange = super.onLevelChange(i7);
        if (showsChipIcon()) {
            zOnLevelChange |= this.chipIcon.setLevel(i7);
        }
        if (showsCheckedIcon()) {
            zOnLevelChange |= this.checkedIcon.setLevel(i7);
        }
        if (showsCloseIcon()) {
            zOnLevelChange |= this.closeIcon.setLevel(i7);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    public void onSizeChange() {
        Delegate delegate = this.delegate.get();
        if (delegate != null) {
            delegate.onChipDrawableSizeChange();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(@NonNull int[] iArr) {
        if (this.isShapeThemingEnabled) {
            super.onStateChange(iArr);
        }
        return onStateChange(iArr, getCloseIconState());
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
        onSizeChange();
        invalidateSelf();
    }

    public boolean refreshCloseIconFocus(boolean z3) {
        if (this.closeIcon != null) {
            return setCloseIconState(z3 ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : DEFAULT_STATE);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j6) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j6);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        if (this.alpha != i7) {
            this.alpha = i7;
            invalidateSelf();
        }
    }

    public void setCheckable(boolean z3) {
        if (this.checkable != z3) {
            this.checkable = z3;
            float fCalculateChipIconWidth = calculateChipIconWidth();
            if (!z3 && this.currentChecked) {
                this.currentChecked = false;
            }
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setCheckableResource(@BoolRes int i7) {
        setCheckable(this.context.getResources().getBoolean(i7));
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        if (this.checkedIcon != drawable) {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.checkedIcon = drawable;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            unapplyChildDrawable(this.checkedIcon);
            applyChildDrawable(this.checkedIcon);
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z3) {
        setCheckedIconVisible(z3);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i7) {
        setCheckedIconVisible(this.context.getResources().getBoolean(i7));
    }

    public void setCheckedIconResource(@DrawableRes int i7) {
        setCheckedIcon(a.q(i7, this.context));
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        if (this.checkedIconTint != colorStateList) {
            this.checkedIconTint = colorStateList;
            if (canShowCheckedIcon()) {
                this.checkedIcon.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setCheckedIconTintResource(@ColorRes int i7) {
        setCheckedIconTint(androidx.core.content.d.c(i7, this.context));
    }

    public void setCheckedIconVisible(@BoolRes int i7) {
        setCheckedIconVisible(this.context.getResources().getBoolean(i7));
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        if (this.chipBackgroundColor != colorStateList) {
            this.chipBackgroundColor = colorStateList;
            onStateChange(getState());
        }
    }

    public void setChipBackgroundColorResource(@ColorRes int i7) {
        setChipBackgroundColor(androidx.core.content.d.c(i7, this.context));
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        if (this.chipCornerRadius != f10) {
            this.chipCornerRadius = f10;
            setShapeAppearanceModel(getShapeAppearanceModel().withCornerSize(f10));
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int i7) {
        setChipCornerRadius(this.context.getResources().getDimension(i7));
    }

    public void setChipEndPadding(float f10) {
        if (this.chipEndPadding != f10) {
            this.chipEndPadding = f10;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipEndPaddingResource(@DimenRes int i7) {
        setChipEndPadding(this.context.getResources().getDimension(i7));
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        Drawable chipIcon = getChipIcon();
        if (chipIcon != drawable) {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.chipIcon = drawable != null ? drawable.mutate() : null;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            unapplyChildDrawable(chipIcon);
            if (showsChipIcon()) {
                applyChildDrawable(this.chipIcon);
            }
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z3) {
        setChipIconVisible(z3);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i7) {
        setChipIconVisible(i7);
    }

    public void setChipIconResource(@DrawableRes int i7) {
        setChipIcon(a.q(i7, this.context));
    }

    public void setChipIconSize(float f10) {
        if (this.chipIconSize != f10) {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.chipIconSize = f10;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setChipIconSizeResource(@DimenRes int i7) {
        setChipIconSize(this.context.getResources().getDimension(i7));
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        this.hasChipIconTint = true;
        if (this.chipIconTint != colorStateList) {
            this.chipIconTint = colorStateList;
            if (showsChipIcon()) {
                this.chipIcon.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setChipIconTintResource(@ColorRes int i7) {
        setChipIconTint(androidx.core.content.d.c(i7, this.context));
    }

    public void setChipIconVisible(@BoolRes int i7) {
        setChipIconVisible(this.context.getResources().getBoolean(i7));
    }

    public void setChipMinHeight(float f10) {
        if (this.chipMinHeight != f10) {
            this.chipMinHeight = f10;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipMinHeightResource(@DimenRes int i7) {
        setChipMinHeight(this.context.getResources().getDimension(i7));
    }

    public void setChipStartPadding(float f10) {
        if (this.chipStartPadding != f10) {
            this.chipStartPadding = f10;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipStartPaddingResource(@DimenRes int i7) {
        setChipStartPadding(this.context.getResources().getDimension(i7));
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        if (this.chipStrokeColor != colorStateList) {
            this.chipStrokeColor = colorStateList;
            if (this.isShapeThemingEnabled) {
                setStrokeColor(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setChipStrokeColorResource(@ColorRes int i7) {
        setChipStrokeColor(androidx.core.content.d.c(i7, this.context));
    }

    public void setChipStrokeWidth(float f10) {
        if (this.chipStrokeWidth != f10) {
            this.chipStrokeWidth = f10;
            this.chipPaint.setStrokeWidth(f10);
            if (this.isShapeThemingEnabled) {
                super.setStrokeWidth(f10);
            }
            invalidateSelf();
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int i7) {
        setChipStrokeWidth(this.context.getResources().getDimension(i7));
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        Drawable closeIcon = getCloseIcon();
        if (closeIcon != drawable) {
            float fCalculateCloseIconWidth = calculateCloseIconWidth();
            this.closeIcon = drawable != null ? drawable.mutate() : null;
            updateFrameworkCloseIconRipple();
            float fCalculateCloseIconWidth2 = calculateCloseIconWidth();
            unapplyChildDrawable(closeIcon);
            if (showsCloseIcon()) {
                applyChildDrawable(this.closeIcon);
            }
            invalidateSelf();
            if (fCalculateCloseIconWidth != fCalculateCloseIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        if (this.closeIconContentDescription != charSequence) {
            String str = androidx.core.text.b.f16143b;
            androidx.core.text.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? androidx.core.text.b.f16146e : androidx.core.text.b.f16145d;
            bVar.getClass();
            N n10 = f.f16153a;
            this.closeIconContentDescription = bVar.c(charSequence);
            invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z3) {
        setCloseIconVisible(z3);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i7) {
        setCloseIconVisible(i7);
    }

    public void setCloseIconEndPadding(float f10) {
        if (this.closeIconEndPadding != f10) {
            this.closeIconEndPadding = f10;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i7) {
        setCloseIconEndPadding(this.context.getResources().getDimension(i7));
    }

    public void setCloseIconResource(@DrawableRes int i7) {
        setCloseIcon(a.q(i7, this.context));
    }

    public void setCloseIconSize(float f10) {
        if (this.closeIconSize != f10) {
            this.closeIconSize = f10;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconSizeResource(@DimenRes int i7) {
        setCloseIconSize(this.context.getResources().getDimension(i7));
    }

    public void setCloseIconStartPadding(float f10) {
        if (this.closeIconStartPadding != f10) {
            this.closeIconStartPadding = f10;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i7) {
        setCloseIconStartPadding(this.context.getResources().getDimension(i7));
    }

    public boolean setCloseIconState(@NonNull int[] iArr) {
        if (Arrays.equals(this.closeIconStateSet, iArr)) {
            return false;
        }
        this.closeIconStateSet = iArr;
        if (showsCloseIcon()) {
            return onStateChange(getState(), iArr);
        }
        return false;
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        if (this.closeIconTint != colorStateList) {
            this.closeIconTint = colorStateList;
            if (showsCloseIcon()) {
                this.closeIcon.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setCloseIconTintResource(@ColorRes int i7) {
        setCloseIconTint(androidx.core.content.d.c(i7, this.context));
    }

    public void setCloseIconVisible(@BoolRes int i7) {
        setCloseIconVisible(this.context.getResources().getBoolean(i7));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        if (this.colorFilter != colorFilter) {
            this.colorFilter = colorFilter;
            invalidateSelf();
        }
    }

    public void setDelegate(@Nullable Delegate delegate) {
        this.delegate = new WeakReference<>(delegate);
    }

    public void setEllipsize(@Nullable TextUtils.TruncateAt truncateAt) {
        this.truncateAt = truncateAt;
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        this.hideMotionSpec = motionSpec;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i7) {
        setHideMotionSpec(MotionSpec.createFromResource(this.context, i7));
    }

    public void setIconEndPadding(float f10) {
        if (this.iconEndPadding != f10) {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.iconEndPadding = f10;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setIconEndPaddingResource(@DimenRes int i7) {
        setIconEndPadding(this.context.getResources().getDimension(i7));
    }

    public void setIconStartPadding(float f10) {
        if (this.iconStartPadding != f10) {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.iconStartPadding = f10;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setIconStartPaddingResource(@DimenRes int i7) {
        setIconStartPadding(this.context.getResources().getDimension(i7));
    }

    public void setMaxWidth(@Px int i7) {
        this.maxWidth = i7;
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.rippleColor != colorStateList) {
            this.rippleColor = colorStateList;
            updateCompatRippleColor();
            onStateChange(getState());
        }
    }

    public void setRippleColorResource(@ColorRes int i7) {
        setRippleColor(androidx.core.content.d.c(i7, this.context));
    }

    public void setShouldDrawText(boolean z3) {
        this.shouldDrawText = z3;
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        this.showMotionSpec = motionSpec;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i7) {
        setShowMotionSpec(MotionSpec.createFromResource(this.context, i7));
    }

    public void setText(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.text, charSequence)) {
            return;
        }
        this.text = charSequence;
        this.textDrawableHelper.setTextWidthDirty(true);
        invalidateSelf();
        onSizeChange();
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance) {
        this.textDrawableHelper.setTextAppearance(textAppearance, this.context);
    }

    public void setTextAppearanceResource(@StyleRes int i7) {
        setTextAppearance(new TextAppearance(this.context, i7));
    }

    public void setTextColor(@ColorInt int i7) {
        setTextColor(ColorStateList.valueOf(i7));
    }

    public void setTextEndPadding(float f10) {
        if (this.textEndPadding != f10) {
            this.textEndPadding = f10;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setTextEndPaddingResource(@DimenRes int i7) {
        setTextEndPadding(this.context.getResources().getDimension(i7));
    }

    public void setTextResource(@StringRes int i7) {
        setText(this.context.getResources().getString(i7));
    }

    public void setTextSize(@Dimension float f10) {
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.setTextSize(f10);
            this.textDrawableHelper.getTextPaint().setTextSize(f10);
            onTextSizeChange();
        }
    }

    public void setTextStartPadding(float f10) {
        if (this.textStartPadding != f10) {
            this.textStartPadding = f10;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setTextStartPaddingResource(@DimenRes int i7) {
        setTextStartPadding(this.context.getResources().getDimension(i7));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        if (this.tint != colorStateList) {
            this.tint = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.tintMode != mode) {
            this.tintMode = mode;
            this.tintFilter = DrawableUtils.updateTintFilter(this, this.tint, mode);
            invalidateSelf();
        }
    }

    public void setUseCompatRipple(boolean z3) {
        if (this.useCompatRipple != z3) {
            this.useCompatRipple = z3;
            updateCompatRippleColor();
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z8) {
        boolean visible = super.setVisible(z3, z8);
        if (showsChipIcon()) {
            visible |= this.chipIcon.setVisible(z3, z8);
        }
        if (showsCheckedIcon()) {
            visible |= this.checkedIcon.setVisible(z3, z8);
        }
        if (showsCloseIcon()) {
            visible |= this.closeIcon.setVisible(z3, z8);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public boolean shouldDrawText() {
        return this.shouldDrawText;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void setCheckedIconVisible(boolean z3) {
        if (this.checkedIconVisible != z3) {
            boolean zShowsCheckedIcon = showsCheckedIcon();
            this.checkedIconVisible = z3;
            boolean zShowsCheckedIcon2 = showsCheckedIcon();
            if (zShowsCheckedIcon != zShowsCheckedIcon2) {
                if (zShowsCheckedIcon2) {
                    applyChildDrawable(this.checkedIcon);
                } else {
                    unapplyChildDrawable(this.checkedIcon);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    public void setChipIconVisible(boolean z3) {
        if (this.chipIconVisible != z3) {
            boolean zShowsChipIcon = showsChipIcon();
            this.chipIconVisible = z3;
            boolean zShowsChipIcon2 = showsChipIcon();
            if (zShowsChipIcon != zShowsChipIcon2) {
                if (zShowsChipIcon2) {
                    applyChildDrawable(this.chipIcon);
                } else {
                    unapplyChildDrawable(this.chipIcon);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    public void setCloseIconVisible(boolean z3) {
        if (this.closeIconVisible != z3) {
            boolean zShowsCloseIcon = showsCloseIcon();
            this.closeIconVisible = z3;
            boolean zShowsCloseIcon2 = showsCloseIcon();
            if (zShowsCloseIcon != zShowsCloseIcon2) {
                if (zShowsCloseIcon2) {
                    applyChildDrawable(this.closeIcon);
                } else {
                    unapplyChildDrawable(this.closeIcon);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.setTextColor(colorStateList);
            invalidateSelf();
        }
    }

    private boolean onStateChange(@NonNull int[] iArr, @NonNull int[] iArr2) {
        boolean z3;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.chipSurfaceColor;
        int iCompositeElevationOverlayIfNeeded = compositeElevationOverlayIfNeeded(colorStateList != null ? colorStateList.getColorForState(iArr, this.currentChipSurfaceColor) : 0);
        boolean state = true;
        if (this.currentChipSurfaceColor != iCompositeElevationOverlayIfNeeded) {
            this.currentChipSurfaceColor = iCompositeElevationOverlayIfNeeded;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.chipBackgroundColor;
        int iCompositeElevationOverlayIfNeeded2 = compositeElevationOverlayIfNeeded(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.currentChipBackgroundColor) : 0);
        if (this.currentChipBackgroundColor != iCompositeElevationOverlayIfNeeded2) {
            this.currentChipBackgroundColor = iCompositeElevationOverlayIfNeeded2;
            zOnStateChange = true;
        }
        int iLayer = MaterialColors.layer(iCompositeElevationOverlayIfNeeded, iCompositeElevationOverlayIfNeeded2);
        if ((this.currentCompositeSurfaceBackgroundColor != iLayer) | (getFillColor() == null)) {
            this.currentCompositeSurfaceBackgroundColor = iLayer;
            setFillColor(ColorStateList.valueOf(iLayer));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.chipStrokeColor;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.currentChipStrokeColor) : 0;
        if (this.currentChipStrokeColor != colorForState) {
            this.currentChipStrokeColor = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.compatRippleColor == null || !RippleUtils.shouldDrawRippleCompat(iArr)) ? 0 : this.compatRippleColor.getColorForState(iArr, this.currentCompatRippleColor);
        if (this.currentCompatRippleColor != colorForState2) {
            this.currentCompatRippleColor = colorForState2;
            if (this.useCompatRipple) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.textDrawableHelper.getTextAppearance() == null || this.textDrawableHelper.getTextAppearance().getTextColor() == null) ? 0 : this.textDrawableHelper.getTextAppearance().getTextColor().getColorForState(iArr, this.currentTextColor);
        if (this.currentTextColor != colorForState3) {
            this.currentTextColor = colorForState3;
            zOnStateChange = true;
        }
        boolean z8 = hasState(getState(), R.attr.state_checked) && this.checkable;
        if (this.currentChecked == z8 || this.checkedIcon == null) {
            z3 = false;
        } else {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.currentChecked = z8;
            if (fCalculateChipIconWidth != calculateChipIconWidth()) {
                zOnStateChange = true;
                z3 = true;
            } else {
                z3 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.tint;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.currentTint) : 0;
        if (this.currentTint != colorForState4) {
            this.currentTint = colorForState4;
            this.tintFilter = DrawableUtils.updateTintFilter(this, this.tint, this.tintMode);
        } else {
            state = zOnStateChange;
        }
        if (isStateful(this.chipIcon)) {
            state |= this.chipIcon.setState(iArr);
        }
        if (isStateful(this.checkedIcon)) {
            state |= this.checkedIcon.setState(iArr);
        }
        if (isStateful(this.closeIcon)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.closeIcon.setState(iArr3);
        }
        if (isStateful(this.closeIconRipple)) {
            state |= this.closeIconRipple.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z3) {
            onSizeChange();
        }
        return state;
    }

    private static boolean isStateful(@Nullable ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private static boolean isStateful(@Nullable Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean isStateful(@Nullable TextAppearance textAppearance) {
        return (textAppearance == null || textAppearance.getTextColor() == null || !textAppearance.getTextColor().isStateful()) ? false : true;
    }
}
