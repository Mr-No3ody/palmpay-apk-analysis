package com.google.android.material.slider;

import N8.q0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.K;
import androidx.core.view.N;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.android.material.tooltip.TooltipDrawable;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.horcrux.svg.d0;
import face.security.device.api.FaceSecCode;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends BaseOnChangeListener<S>, T extends BaseOnSliderTouchListener<S>> extends View {
    private static final int DEFAULT_LABEL_ANIMATION_ENTER_DURATION = 83;
    private static final int DEFAULT_LABEL_ANIMATION_EXIT_DURATION = 117;
    private static final String EXCEPTION_ILLEGAL_DISCRETE_VALUE = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION = "minSeparation(%s) must be greater or equal to 0";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE_UNIT = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";
    private static final String EXCEPTION_ILLEGAL_STEP_SIZE = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    private static final String EXCEPTION_ILLEGAL_VALUE = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    private static final String EXCEPTION_ILLEGAL_VALUE_FROM = "valueFrom(%s) must be smaller than valueTo(%s)";
    private static final int HALO_ALPHA = 63;
    private static final float LEFT_LABEL_PIVOT_X = 1.2f;
    private static final float LEFT_LABEL_PIVOT_Y = 0.5f;
    private static final int MAX_TIMEOUT_TOOLTIP_WITH_ACCESSIBILITY = 120000;
    private static final int MIN_TIMEOUT_TOOLTIP_WITH_ACCESSIBILITY = 10000;
    private static final float RIGHT_LABEL_PIVOT_X = -0.2f;
    private static final float RIGHT_LABEL_PIVOT_Y = 0.5f;
    private static final String TAG = "BaseSlider";
    private static final double THRESHOLD = 1.0E-4d;
    private static final float THUMB_WIDTH_PRESSED_RATIO = 0.5f;
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
    private static final float TOP_LABEL_PIVOT_X = 0.5f;
    private static final float TOP_LABEL_PIVOT_Y = 1.2f;
    private static final float TOUCH_SLOP_RATIO = 0.8f;
    private static final int TRACK_CORNER_SIZE_UNSET = -1;
    static final int UNIT_PX = 0;
    static final int UNIT_VALUE = 1;
    private static final String WARNING_FLOATING_POINT_ERROR = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";
    private static final String WARNING_PARSE_ERROR = "Error parsing value(%s), valueFrom(%s), and valueTo(%s) into a float.";
    private BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender;

    @NonNull
    private final AccessibilityHelper accessibilityHelper;
    private final AccessibilityManager accessibilityManager;
    private int activeThumbIdx;

    @NonNull
    private final Paint activeTicksPaint;

    @NonNull
    private final Paint activeTrackPaint;

    @NonNull
    private final RectF activeTrackRect;
    private boolean centered;

    @NonNull
    private final List<L> changeListeners;

    @NonNull
    private final RectF cornerRect;

    @Nullable
    private Drawable customThumbDrawable;

    @NonNull
    private List<Drawable> customThumbDrawablesForValues;

    @NonNull
    private final MaterialShapeDrawable defaultThumbDrawable;
    private int defaultThumbRadius;
    private int defaultThumbTrackGapSize;
    private int defaultThumbWidth;
    private int defaultTickActiveRadius;
    private int defaultTickInactiveRadius;
    private int defaultTrackThickness;
    private boolean dirtyConfig;
    private int focusedThumbIdx;
    private boolean forceDrawCompatHalo;
    private LabelFormatter formatter;

    @NonNull
    private ColorStateList haloColor;

    @NonNull
    private final Paint haloPaint;
    private int haloRadius;

    @NonNull
    private final Rect iconRect;

    @NonNull
    private final RectF iconRectF;

    @NonNull
    private final Paint inactiveTicksPaint;

    @NonNull
    private final RectF inactiveTrackLeftRect;

    @NonNull
    private final Paint inactiveTrackPaint;

    @NonNull
    private final RectF inactiveTrackRightRect;
    private boolean isLongPress;
    private int labelBehavior;
    private int labelPadding;

    @NonNull
    private final Rect labelRect;
    private int labelStyle;

    @NonNull
    private final List<TooltipDrawable> labels;
    private boolean labelsAreAnimatedIn;
    private ValueAnimator labelsInAnimator;
    private ValueAnimator labelsOutAnimator;
    private MotionEvent lastEvent;
    private int minTickSpacing;

    @Px
    private int minTouchTargetSize;
    private int minTrackSidePadding;
    private int minWidgetThickness;

    @NonNull
    private final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;

    @NonNull
    private final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;

    @NonNull
    private final Runnable resetActiveThumbIndex;

    @NonNull
    private final Matrix rotationMatrix;
    private final int scaledTouchSlop;
    private int separationUnit;
    private float stepSize;

    @NonNull
    private final Paint stopIndicatorPaint;
    private boolean thisAndAncestorsVisible;
    private int thumbHeight;
    private boolean thumbIsPressed;

    @NonNull
    private final Paint thumbPaint;
    private int thumbTrackGapSize;
    private int thumbWidth;
    private int tickActiveRadius;

    @NonNull
    private ColorStateList tickColorActive;

    @NonNull
    private ColorStateList tickColorInactive;
    private int tickInactiveRadius;
    private int tickVisibilityMode;
    private float[] ticksCoordinates;
    private final int tooltipTimeoutMillis;
    private float touchDownAxis1;
    private float touchDownAxis2;

    @NonNull
    private final List<T> touchListeners;
    private float touchPosition;

    @NonNull
    private ColorStateList trackColorActive;

    @NonNull
    private ColorStateList trackColorInactive;
    private int trackCornerSize;

    @Nullable
    private ColorStateList trackIconActiveColor;

    @Nullable
    private Drawable trackIconActiveEnd;
    private boolean trackIconActiveEndMutated;

    @Nullable
    private Drawable trackIconActiveStart;
    private boolean trackIconActiveStartMutated;

    @Nullable
    private ColorStateList trackIconInactiveColor;

    @Nullable
    private Drawable trackIconInactiveEnd;
    private boolean trackIconInactiveEndMutated;

    @Nullable
    private Drawable trackIconInactiveStart;
    private boolean trackIconInactiveStartMutated;

    @Px
    private int trackIconPadding;

    @Px
    private int trackIconSize;
    private int trackInsideCornerSize;

    @NonNull
    private final Path trackPath;
    private int trackSidePadding;
    private int trackStopIndicatorSize;
    private int trackThickness;
    private int trackWidth;
    private float valueFrom;
    private float valueTo;
    private ArrayList<Float> values;
    private int widgetOrientation;
    private int widgetThickness;
    static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_Slider;
    private static final int LABEL_ANIMATION_ENTER_DURATION_ATTR = R.attr.motionDurationMedium4;
    private static final int LABEL_ANIMATION_EXIT_DURATION_ATTR = R.attr.motionDurationShort3;
    private static final int LABEL_ANIMATION_ENTER_EASING_ATTR = R.attr.motionEasingEmphasizedInterpolator;
    private static final int LABEL_ANIMATION_EXIT_EASING_ATTR = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    public class AccessibilityEventSender implements Runnable {
        int virtualViewId;

        private AccessibilityEventSender() {
            this.virtualViewId = -1;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.accessibilityHelper.sendEventForVirtualView(this.virtualViewId, 4);
        }

        public void setVirtualViewId(int i7) {
            this.virtualViewId = i7;
        }
    }

    public static class AccessibilityHelper extends androidx.customview.widget.b {
        private final BaseSlider<?, ?, ?> slider;
        final Rect virtualViewBounds;

        public AccessibilityHelper(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.virtualViewBounds = new Rect();
            this.slider = baseSlider;
        }

        @NonNull
        private String startOrEndDescription(int i7) {
            if (i7 == this.slider.getValues().size() - 1) {
                return this.slider.getContext().getString(R.string.material_slider_range_end);
            }
            return i7 == 0 ? this.slider.getContext().getString(R.string.material_slider_range_start) : "";
        }

        @Override // androidx.customview.widget.b
        public int getVirtualViewAt(float f10, float f11) {
            for (int i7 = 0; i7 < this.slider.getValues().size(); i7++) {
                this.slider.updateBoundsForVirtualViewId(i7, this.virtualViewBounds);
                if (this.virtualViewBounds.contains((int) f10, (int) f11)) {
                    return i7;
                }
            }
            return -1;
        }

        @Override // androidx.customview.widget.b
        public void getVisibleVirtualViews(@NonNull List<Integer> list) {
            for (int i7 = 0; i7 < this.slider.getValues().size(); i7++) {
                list.add(Integer.valueOf(i7));
            }
        }

        @Override // androidx.customview.widget.b
        public boolean onPerformActionForVirtualView(int i7, int i10, @Nullable Bundle bundle) {
            if (!this.slider.isEnabled()) {
                return false;
            }
            if (i10 != 4096 && i10 != 8192) {
                if (i10 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    if (this.slider.snapThumbToValue(i7, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                        this.slider.updateHaloHotspot();
                        this.slider.postInvalidate();
                        invalidateVirtualView(i7);
                        return true;
                    }
                }
                return false;
            }
            float fCalculateStepIncrement = this.slider.calculateStepIncrement(20);
            if (i10 == 8192) {
                fCalculateStepIncrement = -fCalculateStepIncrement;
            }
            if (this.slider.isRtl()) {
                fCalculateStepIncrement = -fCalculateStepIncrement;
            }
            if (!this.slider.snapThumbToValue(i7, p118hf.a.l(this.slider.getValues().get(i7).floatValue() + fCalculateStepIncrement, this.slider.getValueFrom(), this.slider.getValueTo()))) {
                return false;
            }
            this.slider.setActiveThumbIndex(i7);
            this.slider.scheduleTooltipTimeout();
            this.slider.updateHaloHotspot();
            this.slider.postInvalidate();
            invalidateVirtualView(i7);
            return true;
        }

        @Override // androidx.customview.widget.b
        public void onPopulateNodeForVirtualView(int i7, @NonNull p074f0.d dVar) {
            Object tag;
            dVar.b(p074f0.c.f36354p);
            List<Float> values = this.slider.getValues();
            float fFloatValue = values.get(i7).floatValue();
            float valueFrom = this.slider.getValueFrom();
            float valueTo = this.slider.getValueTo();
            if (this.slider.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    dVar.a(UserMetadata.MAX_INTERNAL_KEY_SIZE);
                }
                if (fFloatValue < valueTo) {
                    dVar.a(4096);
                }
            }
            NumberFormat numberInstance = NumberFormat.getNumberInstance();
            numberInstance.setMaximumFractionDigits(2);
            try {
                valueFrom = numberInstance.parse(numberInstance.format(valueFrom)).floatValue();
                valueTo = numberInstance.parse(numberInstance.format(valueTo)).floatValue();
                fFloatValue = numberInstance.parse(numberInstance.format(fFloatValue)).floatValue();
            } catch (ParseException unused) {
                String unused2 = BaseSlider.TAG;
            }
            AccessibilityNodeInfo.RangeInfo rangeInfoObtain = AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, fFloatValue);
            AccessibilityNodeInfo accessibilityNodeInfo = dVar.f36360a;
            accessibilityNodeInfo.setRangeInfo(rangeInfoObtain);
            dVar.k(SeekBar.class.getName());
            StringBuilder sb2 = new StringBuilder();
            if (this.slider.getContentDescription() != null) {
                sb2.append(this.slider.getContentDescription());
                sb2.append(",");
            }
            String value = this.slider.formatValue(fFloatValue);
            String string = this.slider.getContext().getString(R.string.material_slider_value);
            if (values.size() > 1) {
                string = startOrEndDescription(i7);
            }
            BaseSlider<?, ?, ?> baseSlider = this.slider;
            WeakHashMap weakHashMap = N.f16168a;
            int i10 = W.c.tag_state_description;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                tag = K.a(baseSlider);
            } else {
                tag = baseSlider.getTag(i10);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            CharSequence charSequence = (CharSequence) tag;
            if (TextUtils.isEmpty(charSequence)) {
                Locale.getDefault();
                sb2.append(string + ", " + value);
            } else if (i11 >= 30) {
                Z.b.g(accessibilityNodeInfo, charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
            }
            dVar.o(sb2.toString());
            this.slider.updateBoundsForVirtualViewId(i7, this.virtualViewBounds);
            dVar.j(this.virtualViewBounds);
        }
    }

    public enum FullCornerDirection {
        BOTH,
        LEFT,
        RIGHT,
        NONE
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Orientation {
    }

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new Parcelable.Creator<SliderState>() { // from class: com.google.android.material.slider.BaseSlider.SliderState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SliderState createFromParcel(@NonNull Parcel parcel) {
                return new SliderState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SliderState[] newArray(int i7) {
                return new SliderState[i7];
            }
        };
        boolean hasFocus;
        float stepSize;
        float valueFrom;
        float valueTo;
        ArrayList<Float> values;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeFloat(this.valueFrom);
            parcel.writeFloat(this.valueTo);
            parcel.writeList(this.values);
            parcel.writeFloat(this.stepSize);
            parcel.writeBooleanArray(new boolean[]{this.hasFocus});
        }

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(@NonNull Parcel parcel) {
            super(parcel);
            this.valueFrom = parcel.readFloat();
            this.valueTo = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.values = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.stepSize = parcel.readFloat();
            this.hasFocus = parcel.createBooleanArray()[0];
        }
    }

    public BaseSlider(@NonNull Context context) {
        this(context, null);
    }

    private void adjustCustomThumbDrawableBounds(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.thumbWidth, this.thumbHeight);
        } else {
            float fMax = Math.max(this.thumbWidth, this.thumbHeight) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    private void attachLabelToContentView(TooltipDrawable tooltipDrawable) {
        tooltipDrawable.setRelativeToView(ViewUtils.getContentView(this));
    }

    private void calculateBoundsAndDrawTrackIcon(@NonNull Canvas canvas, @NonNull RectF rectF, @Nullable Drawable drawable, boolean z3) {
        if (drawable != null) {
            calculateTrackIconBounds(rectF, this.iconRectF, this.trackIconSize, this.trackIconPadding, z3);
            if (this.iconRectF.isEmpty()) {
                return;
            }
            drawTrackIcon(canvas, this.iconRectF, drawable);
        }
    }

    private float calculateEndTrackCornerSize(float f10) {
        if (this.values.isEmpty() || !hasGapBetweenThumbAndTrack()) {
            return f10;
        }
        float fValueToX = valueToX(this.values.get((isRtl() || isVertical()) ? 0 : this.values.size() - 1).floatValue()) - this.trackSidePadding;
        int i7 = this.trackWidth;
        return fValueToX > ((float) i7) - f10 ? Math.max(i7 - fValueToX, this.trackInsideCornerSize) : f10;
    }

    @Nullable
    private Float calculateIncrementForKey(int i7) {
        float fCalculateStepIncrement = this.isLongPress ? calculateStepIncrement(20) : calculateStepIncrement();
        if (i7 == 69) {
            return Float.valueOf(-fCalculateStepIncrement);
        }
        if (i7 == 70 || i7 == 81) {
            return Float.valueOf(fCalculateStepIncrement);
        }
        switch (i7) {
            case 19:
                if (isVertical()) {
                    return Float.valueOf(fCalculateStepIncrement);
                }
                return null;
            case 20:
                if (isVertical()) {
                    return Float.valueOf(-fCalculateStepIncrement);
                }
                return null;
            case 21:
                if (!isRtl()) {
                    fCalculateStepIncrement = -fCalculateStepIncrement;
                }
                return Float.valueOf(fCalculateStepIncrement);
            case 22:
                if (isRtl()) {
                    fCalculateStepIncrement = -fCalculateStepIncrement;
                }
                return Float.valueOf(fCalculateStepIncrement);
            default:
                return null;
        }
    }

    private void calculateLabelBounds(TooltipDrawable tooltipDrawable, float f10) {
        int iNormalizeValue;
        int intrinsicWidth;
        int iCalculateTrackCenter;
        int intrinsicHeight;
        int i7;
        if (isVertical()) {
            iNormalizeValue = (this.trackSidePadding + ((int) (normalizeValue(f10) * this.trackWidth))) - (tooltipDrawable.getIntrinsicHeight() / 2);
            intrinsicWidth = tooltipDrawable.getIntrinsicHeight() + iNormalizeValue;
            if (isRtl()) {
                iCalculateTrackCenter = calculateTrackCenter() - ((this.thumbHeight / 2) + this.labelPadding);
                intrinsicHeight = tooltipDrawable.getIntrinsicWidth();
            } else {
                int iCalculateTrackCenter2 = calculateTrackCenter() + (this.thumbHeight / 2) + this.labelPadding;
                iCalculateTrackCenter = tooltipDrawable.getIntrinsicWidth() + iCalculateTrackCenter2;
                i7 = iCalculateTrackCenter2;
            }
            this.labelRect.set(iNormalizeValue, i7, intrinsicWidth, iCalculateTrackCenter);
        }
        iNormalizeValue = (this.trackSidePadding + ((int) (normalizeValue(f10) * this.trackWidth))) - (tooltipDrawable.getIntrinsicWidth() / 2);
        intrinsicWidth = tooltipDrawable.getIntrinsicWidth() + iNormalizeValue;
        iCalculateTrackCenter = calculateTrackCenter() - ((this.thumbHeight / 2) + this.labelPadding);
        intrinsicHeight = tooltipDrawable.getIntrinsicHeight();
        i7 = iCalculateTrackCenter - intrinsicHeight;
        this.labelRect.set(iNormalizeValue, i7, intrinsicWidth, iCalculateTrackCenter);
    }

    private float calculateStartTrackCornerSize(float f10) {
        if (this.values.isEmpty() || !hasGapBetweenThumbAndTrack()) {
            return f10;
        }
        float fValueToX = valueToX(this.values.get((isRtl() || isVertical()) ? this.values.size() - 1 : 0).floatValue()) - this.trackSidePadding;
        return fValueToX < f10 ? Math.max(fValueToX, this.trackInsideCornerSize) : f10;
    }

    private float calculateStepIncrement() {
        float f10 = this.stepSize;
        if (f10 == 0.0f) {
            return 1.0f;
        }
        return f10;
    }

    private int calculateTrackCenter() {
        return (this.widgetThickness / 2) + ((this.labelBehavior == 1 || shouldAlwaysShowLabel()) ? this.labels.get(0).getIntrinsicHeight() : 0);
    }

    private void calculateTrackIconBounds(@NonNull RectF rectF, @NonNull RectF rectF2, @Px int i7, @Px int i10, boolean z3) {
        if (rectF.right - rectF.left < (i10 * 2) + i7) {
            rectF2.setEmpty();
            return;
        }
        float f10 = z3 ^ (isRtl() || isVertical()) ? rectF.left + i10 : (rectF.right - i10) - i7;
        float f11 = i7;
        float fCalculateTrackCenter = calculateTrackCenter() - (f11 / 2.0f);
        rectF2.set(f10, fCalculateTrackCenter, f10 + f11, f11 + fCalculateTrackCenter);
    }

    private int convertToTickVisibilityMode(boolean z3) {
        return z3 ? 0 : 2;
    }

    private ValueAnimator createLabelAnimator(boolean z3) {
        int iResolveThemeDuration;
        TimeInterpolator timeInterpolatorResolveThemeInterpolator;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getAnimatorCurrentValueOrDefault(z3 ? this.labelsOutAnimator : this.labelsInAnimator, z3 ? 0.0f : 1.0f), z3 ? 1.0f : 0.0f);
        if (z3) {
            iResolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), LABEL_ANIMATION_ENTER_DURATION_ATTR, DEFAULT_LABEL_ANIMATION_ENTER_DURATION);
            timeInterpolatorResolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), LABEL_ANIMATION_ENTER_EASING_ATTR, AnimationUtils.DECELERATE_INTERPOLATOR);
        } else {
            iResolveThemeDuration = MotionUtils.resolveThemeDuration(getContext(), LABEL_ANIMATION_EXIT_DURATION_ATTR, DEFAULT_LABEL_ANIMATION_EXIT_DURATION);
            timeInterpolatorResolveThemeInterpolator = MotionUtils.resolveThemeInterpolator(getContext(), LABEL_ANIMATION_EXIT_EASING_ATTR, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        }
        valueAnimatorOfFloat.setDuration(iResolveThemeDuration);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorResolveThemeInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.slider.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f22576a.lambda$createLabelAnimator$1(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void createLabelPool() {
        if (this.labels.size() > this.values.size()) {
            List<TooltipDrawable> listSubList = this.labels.subList(this.values.size(), this.labels.size());
            for (TooltipDrawable tooltipDrawable : listSubList) {
                if (isAttachedToWindow()) {
                    detachLabelFromContentView(tooltipDrawable);
                }
            }
            listSubList.clear();
        }
        while (true) {
            if (this.labels.size() >= this.values.size()) {
                break;
            }
            TooltipDrawable tooltipDrawableCreateFromAttributes = TooltipDrawable.createFromAttributes(getContext(), null, 0, this.labelStyle);
            this.labels.add(tooltipDrawableCreateFromAttributes);
            if (isAttachedToWindow()) {
                attachLabelToContentView(tooltipDrawableCreateFromAttributes);
            }
        }
        int i7 = this.labels.size() != 1 ? 1 : 0;
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            it.next().setStrokeWidth(i7);
        }
    }

    private void detachLabelFromContentView(TooltipDrawable tooltipDrawable) {
        ViewGroup contentView = ViewUtils.getContentView(this);
        if (contentView == null) {
            return;
        }
        contentView.getOverlay().remove(tooltipDrawable);
        tooltipDrawable.detachView(contentView);
    }

    private float dimenToValue(float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        float f11 = (f10 - this.trackSidePadding) / this.trackWidth;
        float f12 = this.valueFrom;
        return d0.e(f12, this.valueTo, f11, f12);
    }

    private void dispatchOnChangedFromUser(int i7) {
        Iterator<L> it = this.changeListeners.iterator();
        while (it.hasNext()) {
            it.next().onValueChange(this, this.values.get(i7).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        scheduleAccessibilityEventSender(i7);
    }

    private void dispatchOnChangedProgrammatically() {
        for (L l5 : this.changeListeners) {
            Iterator<Float> it = this.values.iterator();
            while (it.hasNext()) {
                l5.onValueChange(this, it.next().floatValue(), false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    private void drawActiveTracks(@NonNull Canvas canvas, int i7, int i10) {
        int i11;
        Canvas canvas2;
        float[] activeRange = getActiveRange();
        int i12 = this.trackSidePadding;
        float f10 = i7;
        float fValueToX = (activeRange[1] * f10) + i12;
        float f11 = (activeRange[0] * f10) + i12;
        if (f11 >= fValueToX) {
            this.activeTrackRect.setEmpty();
            return;
        }
        FullCornerDirection fullCornerDirection = FullCornerDirection.NONE;
        if (this.values.size() == 1 && !isCentered()) {
            fullCornerDirection = (isRtl() || isVertical()) ? FullCornerDirection.RIGHT : FullCornerDirection.LEFT;
        }
        FullCornerDirection fullCornerDirection2 = fullCornerDirection;
        int i13 = 0;
        while (i13 < this.values.size()) {
            if (this.values.size() > 1) {
                fValueToX = i13 > 0 ? valueToX(this.values.get(i13 - 1).floatValue()) : f11;
                float fValueToX2 = valueToX(this.values.get(i13).floatValue());
                if (isRtl() || isVertical()) {
                    f11 = fValueToX2;
                } else {
                    f11 = fValueToX;
                    fValueToX = fValueToX2;
                }
            }
            int trackCornerSize = getTrackCornerSize();
            int iOrdinal = fullCornerDirection2.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    f11 += this.thumbTrackGapSize;
                    fValueToX += trackCornerSize;
                } else if (iOrdinal == 3) {
                    if (!isCentered()) {
                        i11 = this.thumbTrackGapSize;
                        f11 += i11;
                    } else if (activeRange[1] == 0.5f) {
                        f11 += this.thumbTrackGapSize;
                    } else if (activeRange[0] == 0.5f) {
                        i11 = this.thumbTrackGapSize;
                    }
                }
                if (f11 >= fValueToX) {
                    this.activeTrackRect.setEmpty();
                    canvas2 = canvas;
                } else {
                    RectF rectF = this.activeTrackRect;
                    float f12 = i10;
                    int i14 = this.trackThickness;
                    rectF.set(f11, f12 - (i14 / 2.0f), fValueToX, (i14 / 2.0f) + f12);
                    canvas2 = canvas;
                    updateTrack(canvas2, this.activeTrackPaint, this.activeTrackRect, trackCornerSize, fullCornerDirection2);
                }
                i13++;
                canvas = canvas2;
            } else {
                f11 -= trackCornerSize;
                i11 = this.thumbTrackGapSize;
            }
            fValueToX -= i11;
            if (f11 >= fValueToX) {
                this.activeTrackRect.setEmpty();
                canvas2 = canvas;
            } else {
                RectF rectF2 = this.activeTrackRect;
                float f13 = i10;
                int i15 = this.trackThickness;
                rectF2.set(f11, f13 - (i15 / 2.0f), fValueToX, (i15 / 2.0f) + f13);
                canvas2 = canvas;
                updateTrack(canvas2, this.activeTrackPaint, this.activeTrackRect, trackCornerSize, fullCornerDirection2);
            }
            i13++;
            canvas = canvas2;
        }
    }

    private void drawInactiveTrackSection(float f10, float f11, float f12, float f13, @NonNull Canvas canvas, RectF rectF, FullCornerDirection fullCornerDirection) {
        if (f11 - f10 > getTrackCornerSize() - this.thumbTrackGapSize) {
            rectF.set(f10, f12, f11, f13);
        } else {
            rectF.setEmpty();
        }
        updateTrack(canvas, this.inactiveTrackPaint, rectF, getTrackCornerSize(), fullCornerDirection);
    }

    private void drawInactiveTracks(@NonNull Canvas canvas, int i7, int i10) {
        float[] activeRange = getActiveRange();
        float f10 = i10;
        int i11 = this.trackThickness;
        float f11 = f10 - (i11 / 2.0f);
        float f12 = (i11 / 2.0f) + f10;
        float f13 = i7;
        drawInactiveTrackSection(this.trackSidePadding - getTrackCornerSize(), ((activeRange[0] * f13) + this.trackSidePadding) - this.thumbTrackGapSize, f11, f12, canvas, this.inactiveTrackLeftRect, FullCornerDirection.LEFT);
        int i12 = this.trackSidePadding;
        drawInactiveTrackSection((activeRange[1] * f13) + i12 + this.thumbTrackGapSize, i12 + i7 + getTrackCornerSize(), f11, f12, canvas, this.inactiveTrackRightRect, FullCornerDirection.RIGHT);
    }

    private void drawStopIndicator(@NonNull Canvas canvas, float f10, float f11) {
        Iterator<Float> it = this.values.iterator();
        while (it.hasNext()) {
            float fValueToX = valueToX(it.next().floatValue());
            float f12 = (this.thumbWidth / 2.0f) + this.thumbTrackGapSize;
            if (f10 >= fValueToX - f12 && f10 <= fValueToX + f12) {
                return;
            }
        }
        if (isVertical()) {
            canvas.drawPoint(f11, f10, this.stopIndicatorPaint);
        } else {
            canvas.drawPoint(f10, f11, this.stopIndicatorPaint);
        }
    }

    private void drawThumbDrawable(@NonNull Canvas canvas, int i7, int i10, float f10, @NonNull Drawable drawable) {
        canvas.save();
        if (isVertical()) {
            canvas.concat(this.rotationMatrix);
        }
        canvas.translate((this.trackSidePadding + ((int) (normalizeValue(f10) * i7))) - (drawable.getBounds().width() / 2.0f), i10 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    private void drawThumbs(@NonNull Canvas canvas, int i7, int i10) {
        Canvas canvas2;
        int i11;
        int i12;
        int i13 = 0;
        while (i13 < this.values.size()) {
            float fFloatValue = this.values.get(i13).floatValue();
            Drawable drawable = this.customThumbDrawable;
            if (drawable != null) {
                canvas2 = canvas;
                i11 = i7;
                i12 = i10;
                drawThumbDrawable(canvas2, i11, i12, fFloatValue, drawable);
            } else {
                canvas2 = canvas;
                i11 = i7;
                i12 = i10;
                if (i13 < this.customThumbDrawablesForValues.size()) {
                    drawThumbDrawable(canvas2, i11, i12, fFloatValue, this.customThumbDrawablesForValues.get(i13));
                } else {
                    if (!isEnabled()) {
                        canvas2.drawCircle((normalizeValue(fFloatValue) * i11) + this.trackSidePadding, i12, getThumbRadius(), this.thumbPaint);
                    }
                    drawThumbDrawable(canvas2, i11, i12, fFloatValue, this.defaultThumbDrawable);
                }
            }
            i13++;
            canvas = canvas2;
            i7 = i11;
            i10 = i12;
        }
    }

    private void drawTicks(int i7, int i10, Canvas canvas, Paint paint) {
        while (i7 < i10) {
            float f10 = isVertical() ? this.ticksCoordinates[i7 + 1] : this.ticksCoordinates[i7];
            if (!isOverlappingThumb(f10) && (!isCentered() || !isOverlappingCenterGap(f10))) {
                float[] fArr = this.ticksCoordinates;
                canvas.drawPoint(fArr[i7], fArr[i7 + 1], paint);
            }
            i7 += 2;
        }
    }

    private void drawTrackIcon(@NonNull Canvas canvas, @NonNull RectF rectF, @NonNull Drawable drawable) {
        if (isVertical()) {
            this.rotationMatrix.mapRect(rectF);
        }
        rectF.round(this.iconRect);
        drawable.setBounds(this.iconRect);
        drawable.draw(canvas);
    }

    private void drawTrackIcons(@NonNull Canvas canvas, @NonNull RectF rectF, @NonNull RectF rectF2) {
        if (hasTrackIcons()) {
            this.values.size();
            calculateBoundsAndDrawTrackIcon(canvas, rectF, this.trackIconActiveStart, true);
            calculateBoundsAndDrawTrackIcon(canvas, rectF2, this.trackIconInactiveStart, true);
            calculateBoundsAndDrawTrackIcon(canvas, rectF, this.trackIconActiveEnd, false);
            calculateBoundsAndDrawTrackIcon(canvas, rectF2, this.trackIconInactiveEnd, false);
        }
    }

    private void ensureLabelsAdded() {
        if (!this.labelsAreAnimatedIn) {
            this.labelsAreAnimatedIn = true;
            ValueAnimator valueAnimatorCreateLabelAnimator = createLabelAnimator(true);
            this.labelsInAnimator = valueAnimatorCreateLabelAnimator;
            this.labelsOutAnimator = null;
            valueAnimatorCreateLabelAnimator.start();
        }
        Iterator<TooltipDrawable> it = this.labels.iterator();
        for (int i7 = 0; i7 < this.values.size() && it.hasNext(); i7++) {
            if (i7 != this.focusedThumbIdx) {
                setValueForLabel(it.next(), this.values.get(i7).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.labels.size()), Integer.valueOf(this.values.size())));
        }
        setValueForLabel(it.next(), this.values.get(this.focusedThumbIdx).floatValue());
    }

    private void ensureLabelsRemoved() {
        if (this.labelsAreAnimatedIn) {
            this.labelsAreAnimatedIn = false;
            ValueAnimator valueAnimatorCreateLabelAnimator = createLabelAnimator(false);
            this.labelsOutAnimator = valueAnimatorCreateLabelAnimator;
            this.labelsInAnimator = null;
            valueAnimatorCreateLabelAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.slider.BaseSlider.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ViewOverlay contentViewOverlay = BaseSlider.this.getContentViewOverlay();
                    if (contentViewOverlay == null) {
                        return;
                    }
                    Iterator it = BaseSlider.this.labels.iterator();
                    while (it.hasNext()) {
                        contentViewOverlay.remove((TooltipDrawable) it.next());
                    }
                }
            });
            this.labelsOutAnimator.start();
        }
    }

    private void focusThumbOnFocusGained(int i7) {
        if (i7 == 1) {
            moveFocus(Integer.MAX_VALUE);
            return;
        }
        if (i7 == 2) {
            moveFocus(Integer.MIN_VALUE);
        } else if (i7 == 17) {
            moveFocusInAbsoluteDirection(Integer.MAX_VALUE);
        } else {
            if (i7 != 66) {
                return;
            }
            moveFocusInAbsoluteDirection(Integer.MIN_VALUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String formatValue(float f10) {
        if (hasLabelFormatter()) {
            return this.formatter.getFormattedValue(f10);
        }
        return String.format(((float) ((int) f10)) == f10 ? "%.0f" : "%.2f", Float.valueOf(f10));
    }

    private float[] getActiveRange() {
        float fFloatValue = this.values.get(0).floatValue();
        float fFloatValue2 = ((Float) q0.i(1, this.values)).floatValue();
        if (this.values.size() == 1) {
            fFloatValue = this.valueFrom;
        }
        float fNormalizeValue = normalizeValue(fFloatValue);
        float fNormalizeValue2 = normalizeValue(fFloatValue2);
        if (isCentered()) {
            float fMin = Math.min(0.5f, fNormalizeValue2);
            fNormalizeValue2 = Math.max(0.5f, fNormalizeValue2);
            fNormalizeValue = fMin;
        }
        return (isCentered() || !(isRtl() || isVertical())) ? new float[]{fNormalizeValue, fNormalizeValue2} : new float[]{fNormalizeValue2, fNormalizeValue};
    }

    private static float getAnimatorCurrentValueOrDefault(ValueAnimator valueAnimator, float f10) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f10;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return fFloatValue;
    }

    private float getClampedValue(int i7, float f10) {
        float minSeparation = getMinSeparation();
        if (this.separationUnit == 0) {
            minSeparation = dimenToValue(minSeparation);
        }
        if (isRtl() || isVertical()) {
            minSeparation = -minSeparation;
        }
        int i10 = i7 + 1;
        int i11 = i7 - 1;
        return p118hf.a.l(f10, i11 < 0 ? this.valueFrom : this.values.get(i11).floatValue() + minSeparation, i10 >= this.values.size() ? this.valueTo : this.values.get(i10).floatValue() - minSeparation);
    }

    @ColorInt
    private int getColorForState(@NonNull ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public ViewOverlay getContentViewOverlay() {
        ViewGroup contentView = ViewUtils.getContentView(this);
        if (contentView == null) {
            return null;
        }
        return contentView.getOverlay();
    }

    private float[] getCornerRadii(float f10, float f11) {
        return isVertical() ? new float[]{f10, f10, f10, f10, f11, f11, f11, f11} : new float[]{f10, f10, f11, f11, f11, f11, f10, f10};
    }

    private int getDesiredTickCount() {
        return (int) (((this.valueTo - this.valueFrom) / this.stepSize) + 1.0f);
    }

    private int getMaxTickCount() {
        return (this.trackWidth / this.minTickSpacing) + 1;
    }

    private float getValueOfTouchPosition() {
        double dSnapPosition = snapPosition(this.touchPosition);
        if (isRtl() || isVertical()) {
            dSnapPosition = 1.0d - dSnapPosition;
        }
        float f10 = this.valueTo;
        float f11 = this.valueFrom;
        return (float) ((dSnapPosition * ((double) (f10 - f11))) + ((double) f11));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f10 = this.touchPosition;
        if (isRtl() || isVertical()) {
            f10 = 1.0f - f10;
        }
        float f11 = this.valueTo;
        float f12 = this.valueFrom;
        return d0.e(f11, f12, f10, f12);
    }

    private boolean hasGapBetweenThumbAndTrack() {
        return this.thumbTrackGapSize > 0;
    }

    private boolean hasTrackIcons() {
        return (this.trackIconActiveStart == null && this.trackIconActiveEnd == null && this.trackIconInactiveStart == null && this.trackIconInactiveEnd == null) ? false : true;
    }

    private Drawable initializeCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        adjustCustomThumbDrawableBounds(drawableNewDrawable);
        return drawableNewDrawable;
    }

    private void invalidateTrack() {
        this.inactiveTrackPaint.setStrokeWidth(this.trackThickness);
        this.activeTrackPaint.setStrokeWidth(this.trackThickness);
    }

    private boolean isInHorizontalScrollingContainer() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private boolean isInVerticalScrollingContainer() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private static boolean isMouseEvent(MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 3;
    }

    private boolean isMultipleOfStepSize(double d2) {
        double dDoubleValue = new BigDecimal(Double.toString(d2)).divide(new BigDecimal(Float.toString(this.stepSize)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < THRESHOLD;
    }

    private boolean isOverlappingCenterGap(float f10) {
        float f11 = (this.thumbWidth / 2.0f) + this.thumbTrackGapSize;
        float f12 = ((this.trackSidePadding * 2) + this.trackWidth) / 2.0f;
        return f10 >= f12 - f11 && f10 <= f12 + f11;
    }

    private boolean isOverlappingThumb(float f10) {
        float f11 = (this.thumbWidth / 2.0f) + this.thumbTrackGapSize;
        Iterator<Float> it = this.values.iterator();
        if (it.hasNext()) {
            float fValueToX = valueToX(it.next().floatValue());
            if (f10 >= fValueToX - f11 && f10 <= fValueToX + f11) {
                return true;
            }
        }
        return false;
    }

    private boolean isPotentialHorizontalScroll(MotionEvent motionEvent) {
        return !isMouseEvent(motionEvent) && isInHorizontalScrollingContainer();
    }

    private boolean isPotentialVerticalScroll(MotionEvent motionEvent) {
        return !isMouseEvent(motionEvent) && isInVerticalScrollingContainer();
    }

    private boolean isSliderVisibleOnScreen() {
        Rect rect = new Rect();
        ViewUtils.getContentView(this).getHitRect(rect);
        return getLocalVisibleRect(rect) && isThisAndAncestorsVisible();
    }

    private boolean isThisAndAncestorsVisible() {
        return this.thisAndAncestorsVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createLabelAnimator$1(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            it.next().setRevealFraction(fFloatValue);
        }
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        setActiveThumbIndex(-1);
        invalidate();
    }

    private void loadResources(@NonNull Resources resources) {
        this.minWidgetThickness = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.minTrackSidePadding = dimensionPixelOffset;
        this.trackSidePadding = dimensionPixelOffset;
        this.defaultThumbRadius = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.defaultTrackThickness = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.defaultTickActiveRadius = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.defaultTickInactiveRadius = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.minTickSpacing = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.labelPadding = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        this.trackIconPadding = resources.getDimensionPixelOffset(R.dimen.m3_slider_track_icon_padding);
    }

    private void maybeDrawCompatHalo(@NonNull Canvas canvas, int i7, int i10) {
        Canvas canvas2;
        if (shouldDrawCompatHalo()) {
            float[] fArr = {(normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * i7) + this.trackSidePadding, i10};
            if (isVertical()) {
                this.rotationMatrix.mapPoints(fArr);
            }
            if (Build.VERSION.SDK_INT < 28) {
                float f10 = fArr[0];
                int i11 = this.haloRadius;
                float f11 = fArr[1];
                canvas2 = canvas;
                canvas2.clipRect(f10 - i11, f11 - i11, f10 + i11, f11 + i11, Region.Op.UNION);
            } else {
                canvas2 = canvas;
            }
            canvas2.drawCircle(fArr[0], fArr[1], this.haloRadius, this.haloPaint);
        }
    }

    private void maybeDrawStopIndicator(@NonNull Canvas canvas, int i7) {
        if (this.trackStopIndicatorSize <= 0 || this.values.isEmpty()) {
            return;
        }
        float fFloatValue = ((Float) q0.i(1, this.values)).floatValue();
        float f10 = this.valueTo;
        if (fFloatValue < f10) {
            drawStopIndicator(canvas, valueToX(f10), i7);
        }
        if (isCentered() || (this.values.size() > 1 && this.values.get(0).floatValue() > this.valueFrom)) {
            drawStopIndicator(canvas, valueToX(this.valueFrom), i7);
        }
    }

    private void maybeDrawTicks(@NonNull Canvas canvas) {
        float[] fArr = this.ticksCoordinates;
        if (fArr == null || fArr.length == 0) {
            return;
        }
        float[] activeRange = getActiveRange();
        int iCeil = (int) Math.ceil(((this.ticksCoordinates.length / 2.0f) - 1.0f) * activeRange[0]);
        int iFloor = (int) Math.floor(((this.ticksCoordinates.length / 2.0f) - 1.0f) * activeRange[1]);
        if (iCeil > 0) {
            drawTicks(0, iCeil * 2, canvas, this.inactiveTicksPaint);
        }
        if (iCeil <= iFloor) {
            drawTicks(iCeil * 2, (iFloor + 1) * 2, canvas, this.activeTicksPaint);
        }
        int i7 = (iFloor + 1) * 2;
        float[] fArr2 = this.ticksCoordinates;
        if (i7 < fArr2.length) {
            drawTicks(i7, fArr2.length, canvas, this.inactiveTicksPaint);
        }
    }

    private boolean maybeIncreaseTrackSidePadding() {
        int iMax = Math.max(Math.max(Math.max((this.thumbWidth / 2) - this.defaultThumbRadius, 0), Math.max((this.trackThickness - this.defaultTrackThickness) / 2, 0)), Math.max(Math.max(this.tickActiveRadius - this.defaultTickActiveRadius, 0), Math.max(this.tickInactiveRadius - this.defaultTickInactiveRadius, 0))) + this.minTrackSidePadding;
        if (this.trackSidePadding == iMax) {
            return false;
        }
        this.trackSidePadding = iMax;
        if (!isLaidOut()) {
            return true;
        }
        updateTrackWidth(isVertical() ? getHeight() : getWidth());
        return true;
    }

    private boolean maybeIncreaseWidgetThickness() {
        int paddingTop;
        int paddingBottom;
        if (isVertical()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i7 = paddingBottom + paddingTop;
        int iMax = Math.max(this.minWidgetThickness, Math.max(this.trackThickness + i7, this.thumbHeight + i7));
        if (iMax == this.widgetThickness) {
            return false;
        }
        this.widgetThickness = iMax;
        return true;
    }

    private boolean moveFocus(int i7) {
        int i10 = this.focusedThumbIdx;
        long j6 = ((long) i10) + ((long) i7);
        long size = this.values.size() - 1;
        if (j6 < 0) {
            j6 = 0;
        } else if (j6 > size) {
            j6 = size;
        }
        int i11 = (int) j6;
        this.focusedThumbIdx = i11;
        if (i11 == i10) {
            return false;
        }
        if (this.activeThumbIdx != -1) {
            this.activeThumbIdx = i11;
        }
        updateHaloHotspot();
        postInvalidate();
        return true;
    }

    private boolean moveFocusInAbsoluteDirection(int i7) {
        if (isRtl() || isVertical()) {
            i7 = i7 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i7;
        }
        return moveFocus(i7);
    }

    private float normalizeValue(float f10) {
        float f11 = this.valueFrom;
        float f12 = (f10 - f11) / (this.valueTo - f11);
        return (isRtl() || isVertical()) ? 1.0f - f12 : f12;
    }

    @Nullable
    private Boolean onKeyDownNoActiveThumb(int i7, @NonNull KeyEvent keyEvent) {
        if (i7 == 61) {
            if (keyEvent.hasNoModifiers()) {
                return Boolean.valueOf(moveFocus(1));
            }
            return keyEvent.isShiftPressed() ? Boolean.valueOf(moveFocus(-1)) : Boolean.FALSE;
        }
        if (i7 != 66) {
            if (i7 != 81) {
                if (i7 == 69) {
                    moveFocus(-1);
                    return Boolean.TRUE;
                }
                if (i7 != 70) {
                    switch (i7) {
                        case 21:
                            moveFocusInAbsoluteDirection(-1);
                            return Boolean.TRUE;
                        case 22:
                            moveFocusInAbsoluteDirection(1);
                            return Boolean.TRUE;
                        case 23:
                            break;
                        default:
                            return null;
                    }
                }
            }
            moveFocus(1);
            return Boolean.TRUE;
        }
        this.activeThumbIdx = this.focusedThumbIdx;
        postInvalidate();
        return Boolean.TRUE;
    }

    private void onStartTrackingTouch() {
        Iterator<T> it = this.touchListeners.iterator();
        while (it.hasNext()) {
            it.next().onStartTrackingTouch(this);
        }
    }

    private void onStopTrackingTouch() {
        Iterator<T> it = this.touchListeners.iterator();
        while (it.hasNext()) {
            it.next().onStopTrackingTouch(this);
        }
    }

    private void positionLabel(TooltipDrawable tooltipDrawable, float f10) {
        calculateLabelBounds(tooltipDrawable, f10);
        if (isVertical()) {
            RectF rectF = new RectF(this.labelRect);
            this.rotationMatrix.mapRect(rectF);
            rectF.round(this.labelRect);
        }
        DescendantOffsetUtils.offsetDescendantRect(ViewUtils.getContentView(this), this, this.labelRect);
        tooltipDrawable.setBounds(this.labelRect);
    }

    private void processAttributes(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.Slider, i7, DEF_STYLE_RES, new int[0]);
        setOrientation(typedArrayObtainStyledAttributes.getInt(R.styleable.Slider_android_orientation, 0));
        this.labelStyle = typedArrayObtainStyledAttributes.getResourceId(R.styleable.Slider_labelStyle, R.style.Widget_MaterialComponents_Tooltip);
        this.valueFrom = typedArrayObtainStyledAttributes.getFloat(R.styleable.Slider_android_valueFrom, 0.0f);
        this.valueTo = typedArrayObtainStyledAttributes.getFloat(R.styleable.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.valueFrom));
        setCentered(typedArrayObtainStyledAttributes.getBoolean(R.styleable.Slider_centered, false));
        this.stepSize = typedArrayObtainStyledAttributes.getFloat(R.styleable.Slider_android_stepSize, 0.0f);
        this.minTouchTargetSize = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(R.styleable.Slider_minTouchTargetSize, MaterialAttributes.resolveMinimumAccessibleTouchTarget(context)));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R.styleable.Slider_trackColor);
        int i10 = zHasValue ? R.styleable.Slider_trackColor : R.styleable.Slider_trackColorInactive;
        int i11 = zHasValue ? R.styleable.Slider_trackColor : R.styleable.Slider_trackColorActive;
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i10);
        if (colorStateList == null) {
            colorStateList = androidx.core.content.d.c(R.color.material_slider_inactive_track_color, context);
        }
        setTrackInactiveTintList(colorStateList);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i11);
        if (colorStateList2 == null) {
            colorStateList2 = androidx.core.content.d.c(R.color.material_slider_active_track_color, context);
        }
        setTrackActiveTintList(colorStateList2);
        this.defaultThumbDrawable.setFillColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.Slider_thumbColor));
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.Slider_thumbStrokeColor)) {
            setThumbStrokeColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.Slider_thumbStrokeColor));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(R.styleable.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.Slider_haloColor);
        if (colorStateList3 == null) {
            colorStateList3 = androidx.core.content.d.c(R.color.material_slider_halo_color, context);
        }
        setHaloTintList(colorStateList3);
        this.tickVisibilityMode = typedArrayObtainStyledAttributes.hasValue(R.styleable.Slider_tickVisibilityMode) ? typedArrayObtainStyledAttributes.getInt(R.styleable.Slider_tickVisibilityMode, -1) : convertToTickVisibilityMode(typedArrayObtainStyledAttributes.getBoolean(R.styleable.Slider_tickVisible, true));
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(R.styleable.Slider_tickColor);
        int i12 = zHasValue2 ? R.styleable.Slider_tickColor : R.styleable.Slider_tickColorInactive;
        int i13 = zHasValue2 ? R.styleable.Slider_tickColor : R.styleable.Slider_tickColorActive;
        ColorStateList colorStateList4 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i12);
        if (colorStateList4 == null) {
            colorStateList4 = androidx.core.content.d.c(R.color.material_slider_inactive_tick_marks_color, context);
        }
        setTickInactiveTintList(colorStateList4);
        ColorStateList colorStateList5 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i13);
        if (colorStateList5 == null) {
            colorStateList5 = androidx.core.content.d.c(R.color.material_slider_active_tick_marks_color, context);
        }
        setTickActiveTintList(colorStateList5);
        setThumbTrackGapSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbTrackGapSize, 0));
        setTrackStopIndicatorSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackStopIndicatorSize, 0));
        setTrackCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackCornerSize, -1));
        setTrackInsideCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackInsideCornerSize, 0));
        setTrackIconActiveStart(MaterialResources.getDrawable(context, typedArrayObtainStyledAttributes, R.styleable.Slider_trackIconActiveStart));
        setTrackIconActiveEnd(MaterialResources.getDrawable(context, typedArrayObtainStyledAttributes, R.styleable.Slider_trackIconActiveEnd));
        setTrackIconActiveColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.Slider_trackIconActiveColor));
        setTrackIconInactiveStart(MaterialResources.getDrawable(context, typedArrayObtainStyledAttributes, R.styleable.Slider_trackIconInactiveStart));
        setTrackIconInactiveEnd(MaterialResources.getDrawable(context, typedArrayObtainStyledAttributes, R.styleable.Slider_trackIconInactiveEnd));
        setTrackIconInactiveColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.Slider_trackIconInactiveColor));
        setTrackIconSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackIconSize, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbRadius, 0) * 2;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbWidth, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_thumbHeight, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_haloRadius, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(R.styleable.Slider_thumbElevation, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_trackHeight, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_tickRadiusActive, this.trackStopIndicatorSize / 2));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Slider_tickRadiusInactive, this.trackStopIndicatorSize / 2));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(R.styleable.Slider_labelBehavior, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(R.styleable.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void scheduleAccessibilityEventSender(int i7) {
        BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender = this.accessibilityEventSender;
        if (accessibilityEventSender == null) {
            this.accessibilityEventSender = new AccessibilityEventSender();
        } else {
            removeCallbacks(accessibilityEventSender);
        }
        this.accessibilityEventSender.setVirtualViewId(i7);
        postDelayed(this.accessibilityEventSender, 200L);
    }

    private void setValueForLabel(TooltipDrawable tooltipDrawable, float f10) {
        tooltipDrawable.setText(formatValue(f10));
        positionLabel(tooltipDrawable, f10);
        ViewOverlay contentViewOverlay = getContentViewOverlay();
        if (contentViewOverlay == null) {
            return;
        }
        contentViewOverlay.add(tooltipDrawable);
    }

    private void setValuesInternal(@NonNull ArrayList<Float> arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.values.size() == arrayList.size() && this.values.equals(arrayList)) {
            return;
        }
        this.values = arrayList;
        this.dirtyConfig = true;
        this.focusedThumbIdx = 0;
        updateHaloHotspot();
        createLabelPool();
        dispatchOnChangedProgrammatically();
        postInvalidate();
    }

    private boolean shouldAlwaysShowLabel() {
        return this.labelBehavior == 3;
    }

    private boolean shouldDrawCompatHalo() {
        return this.forceDrawCompatHalo || !(getBackground() instanceof RippleDrawable);
    }

    private boolean snapActiveThumbToValue(float f10) {
        return snapThumbToValue(this.activeThumbIdx, f10);
    }

    private double snapPosition(float f10) {
        float f11 = this.stepSize;
        if (f11 <= 0.0f) {
            return f10;
        }
        int i7 = (int) ((this.valueTo - this.valueFrom) / f11);
        return ((double) Math.round(f10 * i7)) / ((double) i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean snapThumbToValue(int i7, float f10) {
        this.focusedThumbIdx = i7;
        if (Math.abs(f10 - this.values.get(i7).floatValue()) < THRESHOLD) {
            return false;
        }
        this.values.set(i7, Float.valueOf(getClampedValue(i7, f10)));
        dispatchOnChangedFromUser(i7);
        return true;
    }

    private boolean snapTouchPosition() {
        return snapActiveThumbToValue(getValueOfTouchPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHaloHotspot() {
        if (shouldDrawCompatHalo() || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            float fNormalizeValue = (normalizeValue(this.values.get(this.focusedThumbIdx).floatValue()) * this.trackWidth) + this.trackSidePadding;
            int iCalculateTrackCenter = calculateTrackCenter();
            int i7 = this.haloRadius;
            float[] fArr = {fNormalizeValue - i7, iCalculateTrackCenter - i7, fNormalizeValue + i7, iCalculateTrackCenter + i7};
            if (isVertical()) {
                this.rotationMatrix.mapPoints(fArr);
            }
            background.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        }
    }

    private void updateLabelPivots() {
        float f10;
        boolean zIsVertical = isVertical();
        boolean zIsRtl = isRtl();
        float f11 = 0.5f;
        if (zIsVertical && zIsRtl) {
            f10 = 0.5f;
            f11 = -0.2f;
        } else {
            f10 = 1.2f;
            if (zIsVertical) {
                f11 = 1.2f;
                f10 = 0.5f;
            }
        }
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            it.next().setPivots(f11, f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLabels() {
        updateLabelPivots();
        int i7 = this.labelBehavior;
        if (i7 == 0 || i7 == 1) {
            if (this.activeThumbIdx == -1 || !isEnabled()) {
                ensureLabelsRemoved();
                return;
            } else {
                ensureLabelsAdded();
                return;
            }
        }
        if (i7 == 2) {
            ensureLabelsRemoved();
            return;
        }
        if (i7 != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.labelBehavior);
        }
        if (isEnabled() && isSliderVisibleOnScreen()) {
            ensureLabelsAdded();
        } else {
            ensureLabelsRemoved();
        }
    }

    private void updateRotationMatrix() {
        float fCalculateTrackCenter = calculateTrackCenter();
        this.rotationMatrix.reset();
        this.rotationMatrix.setRotate(90.0f, fCalculateTrackCenter, fCalculateTrackCenter);
    }

    private void updateThumbWidthWhenPressed() {
        if (hasGapBetweenThumbAndTrack()) {
            int i7 = this.thumbWidth;
            this.defaultThumbWidth = i7;
            this.defaultThumbTrackGapSize = this.thumbTrackGapSize;
            int iRound = Math.round(i7 * 0.5f);
            int i10 = this.thumbWidth - iRound;
            setThumbWidth(iRound);
            setThumbTrackGapSize(this.thumbTrackGapSize - (i10 / 2));
        }
    }

    private void updateTicksCoordinates() {
        validateConfigurationIfDirty();
        int iMin = 0;
        if (this.stepSize <= 0.0f) {
            updateTicksCoordinates(0);
            return;
        }
        int i7 = this.tickVisibilityMode;
        if (i7 == 0) {
            iMin = Math.min(getDesiredTickCount(), getMaxTickCount());
        } else if (i7 == 1) {
            int desiredTickCount = getDesiredTickCount();
            if (desiredTickCount <= getMaxTickCount()) {
                iMin = desiredTickCount;
            }
        } else if (i7 != 2) {
            throw new IllegalStateException("Unexpected tickVisibilityMode: " + this.tickVisibilityMode);
        }
        updateTicksCoordinates(iMin);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c3  */
    private void updateTrack(Canvas canvas, Paint paint, RectF rectF, float f10, FullCornerDirection fullCornerDirection) {
        int i7;
        RectF rectF2;
        float fMax;
        int iOrdinal;
        if (rectF.isEmpty()) {
            return;
        }
        float fCalculateStartTrackCornerSize = calculateStartTrackCornerSize(f10);
        float fCalculateEndTrackCornerSize = calculateEndTrackCornerSize(f10);
        int iOrdinal2 = fullCornerDirection.ordinal();
        if (iOrdinal2 != 1) {
            if (iOrdinal2 == 2) {
                fCalculateStartTrackCornerSize = this.trackInsideCornerSize;
            } else if (iOrdinal2 == 3) {
                i7 = this.trackInsideCornerSize;
                fCalculateStartTrackCornerSize = i7;
            }
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeCap(Paint.Cap.BUTT);
            if (hasGapBetweenThumbAndTrack()) {
                paint.setAntiAlias(true);
            }
            rectF2 = new RectF(rectF);
            if (isVertical()) {
                this.rotationMatrix.mapRect(rectF2);
            }
            this.trackPath.reset();
            if (rectF.width() >= fCalculateStartTrackCornerSize + fCalculateEndTrackCornerSize) {
                this.trackPath.addRoundRect(rectF2, getCornerRadii(fCalculateStartTrackCornerSize, fCalculateEndTrackCornerSize), Path.Direction.CW);
                canvas.drawPath(this.trackPath, paint);
                return;
            }
            float fMin = Math.min(fCalculateStartTrackCornerSize, fCalculateEndTrackCornerSize);
            fMax = Math.max(fCalculateStartTrackCornerSize, fCalculateEndTrackCornerSize);
            canvas.save();
            this.trackPath.addRoundRect(rectF2, fMin, fMin, Path.Direction.CW);
            canvas.clipPath(this.trackPath);
            iOrdinal = fullCornerDirection.ordinal();
            if (iOrdinal != 1) {
                RectF rectF3 = this.cornerRect;
                float f11 = rectF.left;
                rectF3.set(f11, rectF.top, (2.0f * fMax) + f11, rectF.bottom);
            } else if (iOrdinal != 2) {
                this.cornerRect.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
            } else {
                RectF rectF4 = this.cornerRect;
                float f12 = rectF.right;
                rectF4.set(f12 - (2.0f * fMax), rectF.top, f12, rectF.bottom);
            }
            if (isVertical()) {
                this.rotationMatrix.mapRect(this.cornerRect);
            }
            canvas.drawRoundRect(this.cornerRect, fMax, fMax, paint);
            canvas.restore();
        }
        i7 = this.trackInsideCornerSize;
        fCalculateEndTrackCornerSize = i7;
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        if (hasGapBetweenThumbAndTrack()) {
            paint.setAntiAlias(true);
        }
        rectF2 = new RectF(rectF);
        if (isVertical()) {
            this.rotationMatrix.mapRect(rectF2);
        }
        this.trackPath.reset();
        if (rectF.width() >= fCalculateStartTrackCornerSize + fCalculateEndTrackCornerSize) {
            this.trackPath.addRoundRect(rectF2, getCornerRadii(fCalculateStartTrackCornerSize, fCalculateEndTrackCornerSize), Path.Direction.CW);
            canvas.drawPath(this.trackPath, paint);
            return;
        }
        float fMin2 = Math.min(fCalculateStartTrackCornerSize, fCalculateEndTrackCornerSize);
        fMax = Math.max(fCalculateStartTrackCornerSize, fCalculateEndTrackCornerSize);
        canvas.save();
        this.trackPath.addRoundRect(rectF2, fMin2, fMin2, Path.Direction.CW);
        canvas.clipPath(this.trackPath);
        iOrdinal = fullCornerDirection.ordinal();
        if (iOrdinal != 1) {
            RectF rectF5 = this.cornerRect;
            float f13 = rectF.left;
            rectF5.set(f13, rectF.top, (2.0f * fMax) + f13, rectF.bottom);
        } else if (iOrdinal != 2) {
            this.cornerRect.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
        } else {
            RectF rectF6 = this.cornerRect;
            float f14 = rectF.right;
            rectF6.set(f14 - (2.0f * fMax), rectF.top, f14, rectF.bottom);
        }
        if (isVertical()) {
            this.rotationMatrix.mapRect(this.cornerRect);
        }
        canvas.drawRoundRect(this.cornerRect, fMax, fMax, paint);
        canvas.restore();
    }

    private void updateTrackIconActiveEnd() {
        Drawable drawable = this.trackIconActiveEnd;
        if (drawable != null) {
            if (!this.trackIconActiveEndMutated && this.trackIconActiveColor != null) {
                this.trackIconActiveEnd = drawable.mutate();
                this.trackIconActiveEndMutated = true;
            }
            if (this.trackIconActiveEndMutated) {
                this.trackIconActiveEnd.setTintList(this.trackIconActiveColor);
            }
        }
    }

    private void updateTrackIconActiveStart() {
        Drawable drawable = this.trackIconActiveStart;
        if (drawable != null) {
            if (!this.trackIconActiveStartMutated && this.trackIconActiveColor != null) {
                this.trackIconActiveStart = drawable.mutate();
                this.trackIconActiveStartMutated = true;
            }
            if (this.trackIconActiveStartMutated) {
                this.trackIconActiveStart.setTintList(this.trackIconActiveColor);
            }
        }
    }

    private void updateTrackIconInactiveEnd() {
        Drawable drawable = this.trackIconInactiveEnd;
        if (drawable != null) {
            if (!this.trackIconInactiveEndMutated && this.trackIconInactiveColor != null) {
                this.trackIconInactiveEnd = drawable.mutate();
                this.trackIconInactiveEndMutated = true;
            }
            if (this.trackIconInactiveEndMutated) {
                this.trackIconInactiveEnd.setTintList(this.trackIconInactiveColor);
            }
        }
    }

    private void updateTrackIconInactiveStart() {
        Drawable drawable = this.trackIconInactiveStart;
        if (drawable != null) {
            if (!this.trackIconInactiveStartMutated && this.trackIconInactiveColor != null) {
                this.trackIconInactiveStart = drawable.mutate();
                this.trackIconInactiveStartMutated = true;
            }
            if (this.trackIconInactiveStartMutated) {
                this.trackIconInactiveStart.setTintList(this.trackIconInactiveColor);
            }
        }
    }

    private void updateTrackWidth(int i7) {
        this.trackWidth = Math.max(i7 - (this.trackSidePadding * 2), 0);
        updateTicksCoordinates();
    }

    private void updateWidgetLayout(boolean z3) {
        boolean zMaybeIncreaseWidgetThickness = maybeIncreaseWidgetThickness();
        boolean zMaybeIncreaseTrackSidePadding = maybeIncreaseTrackSidePadding();
        if (isVertical()) {
            updateRotationMatrix();
        }
        if (zMaybeIncreaseWidgetThickness || z3) {
            requestLayout();
        } else if (zMaybeIncreaseTrackSidePadding) {
            postInvalidate();
        }
    }

    private void validateConfigurationIfDirty() {
        if (this.dirtyConfig) {
            validateValues();
            validateStepSize();
            validateMinSeparation();
            warnAboutFloatingPointError();
            this.dirtyConfig = false;
        }
    }

    private void validateMinSeparation() {
        float minSeparation = getMinSeparation();
        if (minSeparation < 0.0f) {
            throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
        }
        float f10 = this.stepSize;
        if (f10 <= 0.0f || minSeparation <= 0.0f) {
            return;
        }
        if (this.separationUnit != 1) {
            throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + this.stepSize + ")");
        }
        if (minSeparation < f10 || !isMultipleOfStepSize(minSeparation)) {
            throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal and a multiple of stepSize(" + this.stepSize + ") when using stepSize(" + this.stepSize + ")");
        }
    }

    private void validateStepSize() {
        if (this.stepSize <= 0.0f || valueLandsOnTick(this.valueTo)) {
            return;
        }
        throw new IllegalStateException("The stepSize(" + this.stepSize + ") must be 0, or a factor of the valueFrom(" + this.valueFrom + ")-valueTo(" + this.valueTo + ") range");
    }

    private void validateValues() {
        if (this.valueFrom >= this.valueTo) {
            throw new IllegalStateException("valueFrom(" + this.valueFrom + ") must be smaller than valueTo(" + this.valueTo + ")");
        }
        for (Float f10 : this.values) {
            if (f10.floatValue() < this.valueFrom || f10.floatValue() > this.valueTo) {
                throw new IllegalStateException("Slider value(" + f10 + ") must be greater or equal to valueFrom(" + this.valueFrom + "), and lower or equal to valueTo(" + this.valueTo + ")");
            }
            if (this.stepSize > 0.0f && !valueLandsOnTick(f10.floatValue())) {
                throw new IllegalStateException("Value(" + f10 + ") must be equal to valueFrom(" + this.valueFrom + ") plus a multiple of stepSize(" + this.stepSize + ") when using stepSize(" + this.stepSize + ")");
            }
        }
    }

    private boolean valueLandsOnTick(float f10) {
        return isMultipleOfStepSize(new BigDecimal(Float.toString(f10)).subtract(new BigDecimal(Float.toString(this.valueFrom)), MathContext.DECIMAL64).doubleValue());
    }

    private float valueToX(float f10) {
        return (normalizeValue(f10) * this.trackWidth) + this.trackSidePadding;
    }

    private void warnAboutFloatingPointError() {
        float f10 = this.stepSize;
        if (f10 == 0.0f) {
            return;
        }
        if (((int) f10) != f10) {
            StringBuilder sb2 = new StringBuilder("Floating point value used for stepSize(");
            sb2.append(f10);
            sb2.append("). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
        }
        float f11 = this.valueFrom;
        if (((int) f11) != f11) {
            StringBuilder sb3 = new StringBuilder("Floating point value used for valueFrom(");
            sb3.append(f11);
            sb3.append("). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
        }
        float f12 = this.valueTo;
        if (((int) f12) != f12) {
            StringBuilder sb4 = new StringBuilder("Floating point value used for valueTo(");
            sb4.append(f12);
            sb4.append("). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
        }
    }

    public void addOnChangeListener(@NonNull L l5) {
        this.changeListeners.add(l5);
    }

    public void addOnSliderTouchListener(@NonNull T t) {
        this.touchListeners.add(t);
    }

    public void clearOnChangeListeners() {
        this.changeListeners.clear();
    }

    public void clearOnSliderTouchListeners() {
        this.touchListeners.clear();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return this.accessibilityHelper.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.inactiveTrackPaint.setColor(getColorForState(this.trackColorInactive));
        this.activeTrackPaint.setColor(getColorForState(this.trackColorActive));
        this.inactiveTicksPaint.setColor(getColorForState(this.tickColorInactive));
        this.activeTicksPaint.setColor(getColorForState(this.tickColorActive));
        this.stopIndicatorPaint.setColor(getColorForState(this.tickColorInactive));
        for (TooltipDrawable tooltipDrawable : this.labels) {
            if (tooltipDrawable.isStateful()) {
                tooltipDrawable.setState(getDrawableState());
            }
        }
        if (this.defaultThumbDrawable.isStateful()) {
            this.defaultThumbDrawable.setState(getDrawableState());
        }
        this.haloPaint.setColor(getColorForState(this.haloColor));
        this.haloPaint.setAlpha(63);
    }

    @VisibleForTesting
    public void forceDrawCompatHalo(boolean z3) {
        this.forceDrawCompatHalo = z3;
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @VisibleForTesting
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.accessibilityHelper.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.activeThumbIdx;
    }

    public int getFocusedThumbIndex() {
        return this.focusedThumbIdx;
    }

    @Px
    public int getHaloRadius() {
        return this.haloRadius;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.haloColor;
    }

    public int getLabelBehavior() {
        return this.labelBehavior;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.stepSize;
    }

    public float getThumbElevation() {
        return this.defaultThumbDrawable.getElevation();
    }

    @Px
    public int getThumbHeight() {
        return this.thumbHeight;
    }

    @Px
    public int getThumbRadius() {
        return this.thumbWidth / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.defaultThumbDrawable.getStrokeColor();
    }

    public float getThumbStrokeWidth() {
        return this.defaultThumbDrawable.getStrokeWidth();
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        return this.defaultThumbDrawable.getFillColor();
    }

    public int getThumbTrackGapSize() {
        return this.thumbTrackGapSize;
    }

    @Px
    public int getThumbWidth() {
        return this.thumbWidth;
    }

    @Px
    public int getTickActiveRadius() {
        return this.tickActiveRadius;
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.tickColorActive;
    }

    @Px
    public int getTickInactiveRadius() {
        return this.tickInactiveRadius;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.tickColorInactive;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if (this.tickColorInactive.equals(this.tickColorActive)) {
            return this.tickColorActive;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public int getTickVisibilityMode() {
        return this.tickVisibilityMode;
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.trackColorActive;
    }

    @Px
    public int getTrackCornerSize() {
        int i7 = this.trackCornerSize;
        return i7 == -1 ? this.trackThickness / 2 : i7;
    }

    @Px
    public int getTrackHeight() {
        return this.trackThickness;
    }

    @Nullable
    public ColorStateList getTrackIconActiveColor() {
        return this.trackIconActiveColor;
    }

    @Nullable
    public Drawable getTrackIconActiveEnd() {
        return this.trackIconActiveEnd;
    }

    @Nullable
    public Drawable getTrackIconActiveStart() {
        return this.trackIconActiveStart;
    }

    @Nullable
    public ColorStateList getTrackIconInactiveColor() {
        return this.trackIconInactiveColor;
    }

    @Nullable
    public Drawable getTrackIconInactiveEnd() {
        return this.trackIconInactiveEnd;
    }

    @Nullable
    public Drawable getTrackIconInactiveStart() {
        return this.trackIconInactiveStart;
    }

    public int getTrackIconSize() {
        return this.trackIconSize;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.trackColorInactive;
    }

    public int getTrackInsideCornerSize() {
        return this.trackInsideCornerSize;
    }

    @Px
    public int getTrackSidePadding() {
        return this.trackSidePadding;
    }

    public int getTrackStopIndicatorSize() {
        return this.trackStopIndicatorSize;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if (this.trackColorInactive.equals(this.trackColorActive)) {
            return this.trackColorActive;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @Px
    public int getTrackWidth() {
        return this.trackWidth;
    }

    public float getValueFrom() {
        return this.valueFrom;
    }

    public float getValueTo() {
        return this.valueTo;
    }

    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.values);
    }

    public boolean hasLabelFormatter() {
        return this.formatter != null;
    }

    public boolean isCentered() {
        return this.centered;
    }

    public final boolean isRtl() {
        return getLayoutDirection() == 1;
    }

    public boolean isTickVisible() {
        int i7 = this.tickVisibilityMode;
        if (i7 == 0) {
            return true;
        }
        if (i7 == 1) {
            return getDesiredTickCount() <= getMaxTickCount();
        }
        if (i7 == 2) {
            return false;
        }
        throw new IllegalStateException("Unexpected tickVisibilityMode: " + this.tickVisibilityMode);
    }

    public boolean isVertical() {
        return this.widgetOrientation == 1;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.thisAndAncestorsVisible = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.onScrollChangedListener);
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            attachLabelToContentView(it.next());
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender = this.accessibilityEventSender;
        if (accessibilityEventSender != null) {
            removeCallbacks(accessibilityEventSender);
        }
        this.labelsAreAnimatedIn = false;
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            detachLabelFromContentView(it.next());
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.onScrollChangedListener);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (this.dirtyConfig) {
            validateConfigurationIfDirty();
            updateTicksCoordinates();
        }
        super.onDraw(canvas);
        int iCalculateTrackCenter = calculateTrackCenter();
        drawInactiveTracks(canvas, this.trackWidth, iCalculateTrackCenter);
        drawActiveTracks(canvas, this.trackWidth, iCalculateTrackCenter);
        if (isRtl() || isVertical()) {
            drawTrackIcons(canvas, this.activeTrackRect, this.inactiveTrackLeftRect);
        } else {
            drawTrackIcons(canvas, this.activeTrackRect, this.inactiveTrackRightRect);
        }
        maybeDrawTicks(canvas);
        maybeDrawStopIndicator(canvas, iCalculateTrackCenter);
        if ((this.thumbIsPressed || isFocused()) && isEnabled()) {
            maybeDrawCompatHalo(canvas, this.trackWidth, iCalculateTrackCenter);
        }
        updateLabels();
        drawThumbs(canvas, this.trackWidth, iCalculateTrackCenter);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z3, int i7, @Nullable Rect rect) {
        super.onFocusChanged(z3, i7, rect);
        if (z3) {
            focusThumbOnFocusGained(i7);
            this.accessibilityHelper.requestKeyboardFocusForVirtualView(this.focusedThumbIdx);
        } else {
            this.activeThumbIdx = -1;
            this.accessibilityHelper.clearKeyboardFocusForVirtualView(this.focusedThumbIdx);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, @NonNull KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i7, keyEvent);
        }
        if (this.values.size() == 1) {
            this.activeThumbIdx = 0;
        }
        if (this.activeThumbIdx == -1) {
            Boolean boolOnKeyDownNoActiveThumb = onKeyDownNoActiveThumb(i7, keyEvent);
            return boolOnKeyDownNoActiveThumb != null ? boolOnKeyDownNoActiveThumb.booleanValue() : super.onKeyDown(i7, keyEvent);
        }
        this.isLongPress |= keyEvent.isLongPress();
        Float fCalculateIncrementForKey = calculateIncrementForKey(i7);
        if (fCalculateIncrementForKey != null) {
            if (snapActiveThumbToValue(fCalculateIncrementForKey.floatValue() + this.values.get(this.activeThumbIdx).floatValue())) {
                updateHaloHotspot();
                postInvalidate();
            }
            return true;
        }
        if (i7 != 23) {
            if (i7 == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return moveFocus(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return moveFocus(-1);
                }
                return false;
            }
            if (i7 != 66) {
                return super.onKeyDown(i7, keyEvent);
            }
        }
        this.activeThumbIdx = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i7, @NonNull KeyEvent keyEvent) {
        this.isLongPress = false;
        return super.onKeyUp(i7, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.widgetThickness + ((this.labelBehavior == 1 || shouldAlwaysShowLabel()) ? this.labels.get(0).getIntrinsicHeight() : 0), 1073741824);
        if (isVertical()) {
            super.onMeasure(iMakeMeasureSpec, i10);
        } else {
            super.onMeasure(i7, iMakeMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.valueFrom = sliderState.valueFrom;
        this.valueTo = sliderState.valueTo;
        setValuesInternal(sliderState.values);
        this.stepSize = sliderState.stepSize;
        if (sliderState.hasFocus) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.valueFrom = this.valueFrom;
        sliderState.valueTo = this.valueTo;
        sliderState.values = new ArrayList<>(this.values);
        sliderState.stepSize = this.stepSize;
        sliderState.hasFocus = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        if (isVertical()) {
            i7 = i10;
        }
        updateTrackWidth(i7);
        updateHaloHotspot();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7  */
    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        int i7;
        if (!isEnabled()) {
            return false;
        }
        float y8 = isVertical() ? motionEvent.getY() : motionEvent.getX();
        float x3 = isVertical() ? motionEvent.getX() : motionEvent.getY();
        float f10 = (y8 - this.trackSidePadding) / this.trackWidth;
        this.touchPosition = f10;
        float fMax = Math.max(0.0f, f10);
        this.touchPosition = fMax;
        this.touchPosition = Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.touchDownAxis1 = y8;
            this.touchDownAxis2 = x3;
            if ((isVertical() || !isPotentialVerticalScroll(motionEvent)) && (!isVertical() || !isPotentialHorizontalScroll(motionEvent))) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (pickActiveThumb()) {
                    requestFocus();
                    this.thumbIsPressed = true;
                    updateThumbWidthWhenPressed();
                    onStartTrackingTouch();
                    snapTouchPosition();
                    updateHaloHotspot();
                    invalidate();
                }
            }
        } else if (actionMasked == 1) {
            this.thumbIsPressed = false;
            motionEvent2 = this.lastEvent;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.lastEvent.getX() - motionEvent.getX()) <= this.scaledTouchSlop && Math.abs(this.lastEvent.getY() - motionEvent.getY()) <= this.scaledTouchSlop && pickActiveThumb()) {
                onStartTrackingTouch();
            }
            if (this.activeThumbIdx != -1) {
                snapTouchPosition();
                updateHaloHotspot();
                if (hasGapBetweenThumbAndTrack() && (i7 = this.defaultThumbWidth) != -1 && this.defaultThumbTrackGapSize != -1) {
                    setThumbWidth(i7);
                    setThumbTrackGapSize(this.defaultThumbTrackGapSize);
                }
                this.activeThumbIdx = -1;
                onStopTrackingTouch();
            }
            invalidate();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                this.thumbIsPressed = false;
                motionEvent2 = this.lastEvent;
                if (motionEvent2 != null) {
                    onStartTrackingTouch();
                }
                if (this.activeThumbIdx != -1) {
                    snapTouchPosition();
                    updateHaloHotspot();
                    if (hasGapBetweenThumbAndTrack()) {
                        setThumbWidth(i7);
                        setThumbTrackGapSize(this.defaultThumbTrackGapSize);
                    }
                    this.activeThumbIdx = -1;
                    onStopTrackingTouch();
                }
                invalidate();
            }
        } else if (this.thumbIsPressed) {
            snapTouchPosition();
            updateHaloHotspot();
            invalidate();
        } else {
            if (!isVertical() && isPotentialVerticalScroll(motionEvent) && Math.abs(y8 - this.touchDownAxis1) < this.scaledTouchSlop) {
                return false;
            }
            if (isVertical() && isPotentialHorizontalScroll(motionEvent) && Math.abs(x3 - this.touchDownAxis2) < this.scaledTouchSlop * TOUCH_SLOP_RATIO) {
                return false;
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            if (pickActiveThumb()) {
                this.thumbIsPressed = true;
                updateThumbWidthWhenPressed();
                onStartTrackingTouch();
                snapTouchPosition();
                updateHaloHotspot();
                invalidate();
            }
        }
        setPressed(this.thumbIsPressed);
        this.lastEvent = MotionEvent.obtain(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z3) {
        super.onVisibilityAggregated(z3);
        this.thisAndAncestorsVisible = z3;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i7) {
        ViewOverlay contentViewOverlay;
        super.onVisibilityChanged(view, i7);
        if (i7 == 0 || (contentViewOverlay = getContentViewOverlay()) == null) {
            return;
        }
        Iterator<TooltipDrawable> it = this.labels.iterator();
        while (it.hasNext()) {
            contentViewOverlay.remove(it.next());
        }
    }

    public boolean pickActiveThumb() {
        if (this.activeThumbIdx != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float fValueToX = valueToX(valueOfTouchPositionAbsolute);
        this.activeThumbIdx = 0;
        float fAbs = Math.abs(this.values.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i7 = 1; i7 < this.values.size(); i7++) {
            float fAbs2 = Math.abs(this.values.get(i7).floatValue() - valueOfTouchPositionAbsolute);
            float fValueToX2 = valueToX(this.values.get(i7).floatValue());
            if (Float.compare(fAbs2, fAbs) > 0) {
                break;
            }
            boolean z3 = isRtl() || isVertical() ? fValueToX2 - fValueToX > 0.0f : fValueToX2 - fValueToX < 0.0f;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.activeThumbIdx = i7;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fValueToX2 - fValueToX) < this.scaledTouchSlop) {
                        this.activeThumbIdx = -1;
                        return false;
                    }
                    if (z3) {
                        this.activeThumbIdx = i7;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.activeThumbIdx != -1;
    }

    public void removeOnChangeListener(@NonNull L l5) {
        this.changeListeners.remove(l5);
    }

    public void removeOnSliderTouchListener(@NonNull T t) {
        this.touchListeners.remove(t);
    }

    public void scheduleTooltipTimeout() {
        removeCallbacks(this.resetActiveThumbIndex);
        postDelayed(this.resetActiveThumbIndex, this.tooltipTimeoutMillis);
    }

    public void setActiveThumbIndex(int i7) {
        this.activeThumbIdx = i7;
    }

    public void setCentered(boolean z3) {
        if (this.centered == z3) {
            return;
        }
        this.centered = z3;
        if (z3) {
            setValues(Float.valueOf((this.valueFrom + this.valueTo) / 2.0f));
        } else {
            setValues(Float.valueOf(this.valueFrom));
        }
        updateWidgetLayout(true);
    }

    public void setCustomThumbDrawable(@DrawableRes int i7) {
        setCustomThumbDrawable(getResources().getDrawable(i7));
    }

    public void setCustomThumbDrawablesForValues(@NonNull @DrawableRes int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            drawableArr[i7] = getResources().getDrawable(iArr[i7]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        setLayerType(z3 ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i7) {
        if (i7 < 0 || i7 >= this.values.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.focusedThumbIdx = i7;
        this.accessibilityHelper.requestKeyboardFocusForVirtualView(i7);
        postInvalidate();
    }

    public void setHaloRadius(@IntRange(from = 0) @Px int i7) {
        if (i7 == this.haloRadius) {
            return;
        }
        this.haloRadius = i7;
        Drawable background = getBackground();
        if (shouldDrawCompatHalo() || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            DrawableUtils.setRippleDrawableRadius((RippleDrawable) background, this.haloRadius);
        }
    }

    public void setHaloRadiusResource(@DimenRes int i7) {
        setHaloRadius(getResources().getDimensionPixelSize(i7));
    }

    public void setHaloTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.haloColor)) {
            return;
        }
        this.haloColor = colorStateList;
        Drawable background = getBackground();
        if (!shouldDrawCompatHalo() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.haloPaint.setColor(getColorForState(colorStateList));
        this.haloPaint.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i7) {
        if (this.labelBehavior != i7) {
            this.labelBehavior = i7;
            updateWidgetLayout(true);
        }
    }

    public void setLabelFormatter(@Nullable LabelFormatter labelFormatter) {
        this.formatter = labelFormatter;
    }

    public void setOrientation(int i7) {
        if (this.widgetOrientation == i7) {
            return;
        }
        this.widgetOrientation = i7;
        updateWidgetLayout(true);
    }

    public void setSeparationUnit(int i7) {
        this.separationUnit = i7;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setStepSize(float f10) {
        if (f10 >= 0.0f) {
            if (this.stepSize != f10) {
                this.stepSize = f10;
                this.dirtyConfig = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The stepSize(" + f10 + ") must be 0, or a factor of the valueFrom(" + this.valueFrom + ")-valueTo(" + this.valueTo + ") range");
    }

    public void setThumbElevation(float f10) {
        this.defaultThumbDrawable.setElevation(f10);
    }

    public void setThumbElevationResource(@DimenRes int i7) {
        setThumbElevation(getResources().getDimension(i7));
    }

    public void setThumbHeight(@IntRange(from = 0) @Px int i7) {
        if (i7 == this.thumbHeight) {
            return;
        }
        this.thumbHeight = i7;
        this.defaultThumbDrawable.setBounds(0, 0, this.thumbWidth, i7);
        Drawable drawable = this.customThumbDrawable;
        if (drawable != null) {
            adjustCustomThumbDrawableBounds(drawable);
        }
        Iterator<Drawable> it = this.customThumbDrawablesForValues.iterator();
        while (it.hasNext()) {
            adjustCustomThumbDrawableBounds(it.next());
        }
        updateWidgetLayout(false);
    }

    public void setThumbHeightResource(@DimenRes int i7) {
        setThumbHeight(getResources().getDimensionPixelSize(i7));
    }

    public void setThumbRadius(@IntRange(from = 0) @Px int i7) {
        int i10 = i7 * 2;
        setThumbWidth(i10);
        setThumbHeight(i10);
    }

    public void setThumbRadiusResource(@DimenRes int i7) {
        setThumbRadius(getResources().getDimensionPixelSize(i7));
    }

    public void setThumbStrokeColor(@Nullable ColorStateList colorStateList) {
        this.defaultThumbDrawable.setStrokeColor(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@ColorRes int i7) {
        if (i7 != 0) {
            setThumbStrokeColor(androidx.core.content.d.c(i7, getContext()));
        }
    }

    public void setThumbStrokeWidth(float f10) {
        this.defaultThumbDrawable.setStrokeWidth(f10);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@DimenRes int i7) {
        if (i7 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i7));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.defaultThumbDrawable.getFillColor())) {
            return;
        }
        this.defaultThumbDrawable.setFillColor(colorStateList);
        invalidate();
    }

    public void setThumbTrackGapSize(@Px int i7) {
        if (this.thumbTrackGapSize == i7) {
            return;
        }
        this.thumbTrackGapSize = i7;
        invalidate();
    }

    public void setThumbWidth(@IntRange(from = 0) @Px int i7) {
        if (i7 == this.thumbWidth) {
            return;
        }
        this.thumbWidth = i7;
        this.defaultThumbDrawable.setShapeAppearanceModel(ShapeAppearanceModel.builder().setAllCorners(0, this.thumbWidth / 2.0f).build());
        this.defaultThumbDrawable.setBounds(0, 0, this.thumbWidth, this.thumbHeight);
        Drawable drawable = this.customThumbDrawable;
        if (drawable != null) {
            adjustCustomThumbDrawableBounds(drawable);
        }
        Iterator<Drawable> it = this.customThumbDrawablesForValues.iterator();
        while (it.hasNext()) {
            adjustCustomThumbDrawableBounds(it.next());
        }
        updateWidgetLayout(false);
    }

    public void setThumbWidthResource(@DimenRes int i7) {
        setThumbWidth(getResources().getDimensionPixelSize(i7));
    }

    public void setTickActiveRadius(@IntRange(from = 0) @Px int i7) {
        if (this.tickActiveRadius != i7) {
            this.tickActiveRadius = i7;
            this.activeTicksPaint.setStrokeWidth(i7 * 2);
            updateWidgetLayout(false);
        }
    }

    public void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.tickColorActive)) {
            return;
        }
        this.tickColorActive = colorStateList;
        this.activeTicksPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(@IntRange(from = 0) @Px int i7) {
        if (this.tickInactiveRadius != i7) {
            this.tickInactiveRadius = i7;
            this.inactiveTicksPaint.setStrokeWidth(i7 * 2);
            updateWidgetLayout(false);
        }
    }

    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.tickColorInactive)) {
            return;
        }
        this.tickColorInactive = colorStateList;
        this.inactiveTicksPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisibilityMode(int i7) {
        if (this.tickVisibilityMode != i7) {
            this.tickVisibilityMode = i7;
            postInvalidate();
        }
    }

    @Deprecated
    public void setTickVisible(boolean z3) {
        setTickVisibilityMode(convertToTickVisibilityMode(z3));
    }

    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.trackColorActive)) {
            return;
        }
        this.trackColorActive = colorStateList;
        this.activeTrackPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTrackCornerSize(@Px int i7) {
        if (this.trackCornerSize == i7) {
            return;
        }
        this.trackCornerSize = i7;
        invalidate();
    }

    public void setTrackHeight(@IntRange(from = 0) @Px int i7) {
        if (this.trackThickness != i7) {
            this.trackThickness = i7;
            invalidateTrack();
            updateWidgetLayout(false);
        }
    }

    public void setTrackIconActiveColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList == this.trackIconActiveColor) {
            return;
        }
        this.trackIconActiveColor = colorStateList;
        updateTrackIconActiveStart();
        updateTrackIconActiveEnd();
        invalidate();
    }

    public void setTrackIconActiveEnd(@Nullable Drawable drawable) {
        if (drawable == this.trackIconActiveEnd) {
            return;
        }
        this.trackIconActiveEnd = drawable;
        this.trackIconActiveEndMutated = false;
        updateTrackIconActiveEnd();
        invalidate();
    }

    public void setTrackIconActiveStart(@Nullable Drawable drawable) {
        if (drawable == this.trackIconActiveStart) {
            return;
        }
        this.trackIconActiveStart = drawable;
        this.trackIconActiveStartMutated = false;
        updateTrackIconActiveStart();
        invalidate();
    }

    public void setTrackIconInactiveColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList == this.trackIconInactiveColor) {
            return;
        }
        this.trackIconInactiveColor = colorStateList;
        updateTrackIconInactiveStart();
        updateTrackIconInactiveEnd();
        invalidate();
    }

    public void setTrackIconInactiveEnd(@Nullable Drawable drawable) {
        if (drawable == this.trackIconInactiveEnd) {
            return;
        }
        this.trackIconInactiveEnd = drawable;
        this.trackIconInactiveEndMutated = false;
        updateTrackIconInactiveEnd();
        invalidate();
    }

    public void setTrackIconInactiveStart(@Nullable Drawable drawable) {
        if (drawable == this.trackIconInactiveStart) {
            return;
        }
        this.trackIconInactiveStart = drawable;
        this.trackIconInactiveStartMutated = false;
        updateTrackIconInactiveStart();
        invalidate();
    }

    public void setTrackIconSize(@Px int i7) {
        if (this.trackIconSize == i7) {
            return;
        }
        this.trackIconSize = i7;
        invalidate();
    }

    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.trackColorInactive)) {
            return;
        }
        this.trackColorInactive = colorStateList;
        this.inactiveTrackPaint.setColor(getColorForState(colorStateList));
        invalidate();
    }

    public void setTrackInsideCornerSize(@Px int i7) {
        if (this.trackInsideCornerSize == i7) {
            return;
        }
        this.trackInsideCornerSize = i7;
        invalidate();
    }

    public void setTrackStopIndicatorSize(@Px int i7) {
        if (this.trackStopIndicatorSize == i7) {
            return;
        }
        this.trackStopIndicatorSize = i7;
        this.stopIndicatorPaint.setStrokeWidth(i7);
        invalidate();
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f10) {
        this.valueFrom = f10;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setValueTo(float f10) {
        this.valueTo = f10;
        this.dirtyConfig = true;
        postInvalidate();
    }

    public void setValues(@NonNull Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    public void updateBoundsForVirtualViewId(int i7, Rect rect) {
        int iNormalizeValue = this.trackSidePadding + ((int) (normalizeValue(getValues().get(i7).floatValue()) * this.trackWidth));
        int iCalculateTrackCenter = calculateTrackCenter();
        int iMax = Math.max(this.thumbWidth / 2, this.minTouchTargetSize / 2);
        int iMax2 = Math.max(this.thumbHeight / 2, this.minTouchTargetSize / 2);
        RectF rectF = new RectF(iNormalizeValue - iMax, iCalculateTrackCenter - iMax2, iNormalizeValue + iMax, iCalculateTrackCenter + iMax2);
        if (isVertical()) {
            this.rotationMatrix.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float calculateStepIncrement(int i7) {
        float fCalculateStepIncrement = calculateStepIncrement();
        float f10 = (this.valueTo - this.valueFrom) / fCalculateStepIncrement;
        float f11 = i7;
        return f10 <= f11 ? fCalculateStepIncrement : Math.round(f10 / f11) * fCalculateStepIncrement;
    }

    public void setCustomThumbDrawable(@NonNull Drawable drawable) {
        this.customThumbDrawable = initializeCustomThumbDrawable(drawable);
        this.customThumbDrawablesForValues.clear();
        postInvalidate();
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i7, DEF_STYLE_RES), attributeSet, i7);
        this.labels = new ArrayList();
        this.changeListeners = new ArrayList();
        this.touchListeners = new ArrayList();
        this.labelsAreAnimatedIn = false;
        this.defaultThumbWidth = -1;
        this.defaultThumbTrackGapSize = -1;
        this.centered = false;
        this.trackIconActiveStartMutated = false;
        this.trackIconActiveEndMutated = false;
        this.trackIconInactiveStartMutated = false;
        this.trackIconInactiveEndMutated = false;
        this.thumbIsPressed = false;
        this.values = new ArrayList<>();
        this.activeThumbIdx = -1;
        this.focusedThumbIdx = -1;
        this.stepSize = 0.0f;
        this.isLongPress = false;
        this.trackPath = new Path();
        this.activeTrackRect = new RectF();
        this.inactiveTrackLeftRect = new RectF();
        this.inactiveTrackRightRect = new RectF();
        this.cornerRect = new RectF();
        this.labelRect = new Rect();
        this.iconRectF = new RectF();
        this.iconRect = new Rect();
        this.rotationMatrix = new Matrix();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.defaultThumbDrawable = materialShapeDrawable;
        this.customThumbDrawablesForValues = Collections.EMPTY_LIST;
        this.separationUnit = 0;
        this.onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.slider.b
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f22577a.updateLabels();
            }
        };
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.slider.c
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f22578a.updateLabels();
            }
        };
        this.resetActiveThumbIndex = new Runnable() { // from class: com.google.android.material.slider.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f22579a.lambda$new$0();
            }
        };
        Context context2 = getContext();
        this.thisAndAncestorsVisible = isShown();
        this.inactiveTrackPaint = new Paint();
        this.activeTrackPaint = new Paint();
        Paint paint = new Paint(1);
        this.thumbPaint = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.haloPaint = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.inactiveTicksPaint = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.activeTicksPaint = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.stopIndicatorPaint = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        loadResources(context2.getResources());
        processAttributes(context2, attributeSet, i7);
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.setShadowCompatibilityMode(2);
        this.scaledTouchSlop = ViewConfiguration.get(context2).getScaledTouchSlop();
        AccessibilityHelper accessibilityHelper = new AccessibilityHelper(this);
        this.accessibilityHelper = accessibilityHelper;
        N.q(this, accessibilityHelper);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.accessibilityManager = accessibilityManager;
        if (Build.VERSION.SDK_INT >= 29) {
            this.tooltipTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(FaceSecCode.SC_SUCCESS, 6);
        } else {
            this.tooltipTimeoutMillis = MAX_TIMEOUT_TOOLTIP_WITH_ACCESSIBILITY;
        }
    }

    public void setValues(@NonNull List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    public void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.customThumbDrawable = null;
        this.customThumbDrawablesForValues = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.customThumbDrawablesForValues.add(initializeCustomThumbDrawable(drawable));
        }
        postInvalidate();
    }

    public void setTrackIconActiveEnd(@DrawableRes int i7) {
        setTrackIconActiveEnd(i7 != 0 ? p264r5.a.q(i7, getContext()) : null);
    }

    public void setTrackIconActiveStart(@DrawableRes int i7) {
        setTrackIconActiveStart(i7 != 0 ? p264r5.a.q(i7, getContext()) : null);
    }

    public void setTrackIconInactiveEnd(@DrawableRes int i7) {
        setTrackIconInactiveEnd(i7 != 0 ? p264r5.a.q(i7, getContext()) : null);
    }

    public void setTrackIconInactiveStart(@DrawableRes int i7) {
        setTrackIconInactiveStart(i7 != 0 ? p264r5.a.q(i7, getContext()) : null);
    }

    private void updateTicksCoordinates(int i7) {
        if (i7 == 0) {
            this.ticksCoordinates = null;
            return;
        }
        float[] fArr = this.ticksCoordinates;
        if (fArr == null || fArr.length != i7 * 2) {
            this.ticksCoordinates = new float[i7 * 2];
        }
        float f10 = this.trackWidth / (i7 - 1);
        float fCalculateTrackCenter = calculateTrackCenter();
        for (int i10 = 0; i10 < i7 * 2; i10 += 2) {
            float[] fArr2 = this.ticksCoordinates;
            fArr2[i10] = ((i10 / 2.0f) * f10) + this.trackSidePadding;
            fArr2[i10 + 1] = fCalculateTrackCenter;
        }
        if (isVertical()) {
            this.rotationMatrix.mapPoints(this.ticksCoordinates);
        }
    }
}
