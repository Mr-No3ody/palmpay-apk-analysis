package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton implements EmojiCompatConfigurationView {
    private static final String ACCESSIBILITY_EVENT_CLASS_NAME = "android.widget.Switch";
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int THUMB_ANIMATION_DURATION = 250;
    private static final int TOUCH_MODE_DOWN = 1;
    private static final int TOUCH_MODE_DRAGGING = 2;
    private static final int TOUCH_MODE_IDLE = 0;

    @NonNull
    private A mAppCompatEmojiTextHelper;

    @Nullable
    private V0 mEmojiCompatInitCallback;
    private boolean mEnforceSwitchWidth;
    private boolean mHasThumbTint;
    private boolean mHasThumbTintMode;
    private boolean mHasTrackTint;
    private boolean mHasTrackTintMode;
    private int mMinFlingVelocity;
    private Layout mOffLayout;
    private Layout mOnLayout;
    ObjectAnimator mPositionAnimator;
    private boolean mShowText;
    private boolean mSplitTrack;
    private int mSwitchBottom;
    private int mSwitchHeight;
    private int mSwitchLeft;
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private int mSwitchRight;
    private int mSwitchTop;

    @Nullable
    private TransformationMethod mSwitchTransformationMethod;
    private int mSwitchWidth;
    private final Rect mTempRect;
    private ColorStateList mTextColors;
    private final V mTextHelper;
    private CharSequence mTextOff;
    private CharSequence mTextOffTransformed;
    private CharSequence mTextOn;
    private CharSequence mTextOnTransformed;
    private final TextPaint mTextPaint;
    private Drawable mThumbDrawable;
    float mThumbPosition;
    private int mThumbTextPadding;
    private ColorStateList mThumbTintList;
    private PorterDuff.Mode mThumbTintMode;
    private int mThumbWidth;
    private int mTouchMode;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private Drawable mTrackDrawable;
    private ColorStateList mTrackTintList;
    private PorterDuff.Mode mTrackTintMode;
    private VelocityTracker mVelocityTracker;
    private static final Property<SwitchCompat, Float> THUMB_POS = new U0(Float.class, "thumbPos");
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};

    public SwitchCompat(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private A getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new A(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    private boolean getTargetCheckedState() {
        return this.mThumbPosition > 0.5f;
    }

    private int getThumbOffset() {
        boolean z3 = p1.f12995a;
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.mThumbPosition : this.mThumbPosition) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.mTrackDrawable;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.mTempRect;
        drawable.getPadding(rect);
        Drawable drawable2 = this.mThumbDrawable;
        Rect rectB = drawable2 != null ? AbstractC0859g0.b(drawable2) : AbstractC0859g0.f12906c;
        return ((((this.mSwitchWidth - this.mThumbWidth) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.mTextOff = charSequence;
        A emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodQ = ((Z4.e) emojiTextViewHelper.f12511b.f42878b).Q(this.mSwitchTransformationMethod);
        if (transformationMethodQ != null) {
            charSequence = transformationMethodQ.getTransformation(charSequence, this);
        }
        this.mTextOffTransformed = charSequence;
        this.mOffLayout = null;
        if (this.mShowText) {
            c();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.mTextOn = charSequence;
        A emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodQ = ((Z4.e) emojiTextViewHelper.f12511b.f42878b).Q(this.mSwitchTransformationMethod);
        if (transformationMethodQ != null) {
            charSequence = transformationMethodQ.getTransformation(charSequence, this);
        }
        this.mTextOnTransformed = charSequence;
        this.mOnLayout = null;
        if (this.mShowText) {
            c();
        }
    }

    public final void a() {
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            if (this.mHasThumbTint || this.mHasThumbTintMode) {
                Drawable drawableMutate = drawable.mutate();
                this.mThumbDrawable = drawableMutate;
                if (this.mHasThumbTint) {
                    drawableMutate.setTintList(this.mThumbTintList);
                }
                if (this.mHasThumbTintMode) {
                    this.mThumbDrawable.setTintMode(this.mThumbTintMode);
                }
                if (this.mThumbDrawable.isStateful()) {
                    this.mThumbDrawable.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            if (this.mHasTrackTint || this.mHasTrackTintMode) {
                Drawable drawableMutate = drawable.mutate();
                this.mTrackDrawable = drawableMutate;
                if (this.mHasTrackTint) {
                    drawableMutate.setTintList(this.mTrackTintList);
                }
                if (this.mHasTrackTintMode) {
                    this.mTrackDrawable.setTintMode(this.mTrackTintMode);
                }
                if (this.mTrackDrawable.isStateful()) {
                    this.mTrackDrawable.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        if (this.mEmojiCompatInitCallback == null && this.mAppCompatEmojiTextHelper.b() && androidx.emoji2.text.i.d()) {
            androidx.emoji2.text.i iVarA = androidx.emoji2.text.i.a();
            int iB = iVarA.b();
            if (iB == 3 || iB == 0) {
                V0 v3 = new V0(this);
                this.mEmojiCompatInitCallback = v3;
                iVarA.h(v3);
            }
        }
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int i7;
        int i10;
        Rect rect = this.mTempRect;
        int i11 = this.mSwitchLeft;
        int i12 = this.mSwitchTop;
        int i13 = this.mSwitchRight;
        int i14 = this.mSwitchBottom;
        int thumbOffset = getThumbOffset() + i11;
        Drawable drawable = this.mThumbDrawable;
        Rect rectB = drawable != null ? AbstractC0859g0.b(drawable) : AbstractC0859g0.f12906c;
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i15 = rect.left;
            thumbOffset += i15;
            if (rectB != null) {
                int i16 = rectB.left;
                if (i16 > i15) {
                    i11 += i16 - i15;
                }
                int i17 = rectB.top;
                int i18 = rect.top;
                i7 = i17 > i18 ? (i17 - i18) + i12 : i12;
                int i19 = rectB.right;
                int i20 = rect.right;
                if (i19 > i20) {
                    i13 -= i19 - i20;
                }
                int i21 = rectB.bottom;
                int i22 = rect.bottom;
                if (i21 > i22) {
                    i10 = i14 - (i21 - i22);
                }
                this.mTrackDrawable.setBounds(i11, i7, i13, i10);
            } else {
                i7 = i12;
            }
            i10 = i14;
            this.mTrackDrawable.setBounds(i11, i7, i13, i10);
        }
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i23 = thumbOffset - rect.left;
            int i24 = thumbOffset + this.mThumbWidth + rect.right;
            this.mThumbDrawable.setBounds(i23, i12, i24, i14);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i23, i12, i24, i14);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.setHotspot(f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mThumbDrawable;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z3 = p1.f12995a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.mSwitchWidth;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.mSwitchPadding : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z3 = p1.f12995a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.mSwitchWidth;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.mSwitchPadding : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return p377z5.l.P(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.mShowText;
    }

    public boolean getSplitTrack() {
        return this.mSplitTrack;
    }

    public int getSwitchMinWidth() {
        return this.mSwitchMinWidth;
    }

    public int getSwitchPadding() {
        return this.mSwitchPadding;
    }

    public CharSequence getTextOff() {
        return this.mTextOff;
    }

    public CharSequence getTextOn() {
        return this.mTextOn;
    }

    public Drawable getThumbDrawable() {
        return this.mThumbDrawable;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getThumbPosition() {
        return this.mThumbPosition;
    }

    public int getThumbTextPadding() {
        return this.mThumbTextPadding;
    }

    @Nullable
    public ColorStateList getThumbTintList() {
        return this.mThumbTintList;
    }

    @Nullable
    public PorterDuff.Mode getThumbTintMode() {
        return this.mThumbTintMode;
    }

    public Drawable getTrackDrawable() {
        return this.mTrackDrawable;
    }

    @Nullable
    public ColorStateList getTrackTintList() {
        return this.mTrackTintList;
    }

    @Nullable
    public PorterDuff.Mode getTrackTintMode() {
        return this.mTrackTintMode;
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.mPositionAnimator.end();
        this.mPositionAnimator = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i7) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.mTempRect;
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i7 = this.mSwitchTop;
        int i10 = this.mSwitchBottom;
        int i11 = i7 + rect.top;
        int i12 = i10 - rect.bottom;
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable != null) {
            if (!this.mSplitTrack || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = AbstractC0859g0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.mOnLayout : this.mOffLayout;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.mTextColors;
            if (colorStateList != null) {
                this.mTextPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.mTextPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i11 + i12) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    public void onEmojiCompatInitializedForSwitchText() {
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        requestLayout();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_EVENT_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_EVENT_CLASS_NAME);
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.mTextOn : this.mTextOff;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z3, i7, i10, i11, i12);
        int iMax2 = 0;
        if (this.mThumbDrawable != null) {
            Rect rect = this.mTempRect;
            Drawable drawable = this.mTrackDrawable;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = AbstractC0859g0.b(this.mThumbDrawable);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z8 = p1.f12995a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.mSwitchWidth + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.mSwitchWidth) + iMax + iMax2;
        }
        int gravity = getGravity() & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i13 = this.mSwitchHeight;
            int i14 = height2 - (i13 / 2);
            height = i13 + i14;
            paddingTop = i14;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.mSwitchHeight + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.mSwitchHeight;
        }
        this.mSwitchLeft = paddingLeft;
        this.mSwitchTop = paddingTop;
        this.mSwitchBottom = height;
        this.mSwitchRight = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i10) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.mShowText) {
            if (this.mOnLayout == null) {
                CharSequence charSequence = this.mTextOnTransformed;
                TextPaint textPaint = this.mTextPaint;
                this.mOnLayout = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.mOffLayout == null) {
                CharSequence charSequence2 = this.mTextOffTransformed;
                TextPaint textPaint2 = this.mTextPaint;
                this.mOffLayout = new StaticLayout(charSequence2, textPaint2, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Rect rect = this.mTempRect;
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.mThumbDrawable.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.mThumbDrawable.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.mShowText) {
            iMax = (this.mThumbTextPadding * 2) + Math.max(this.mOnLayout.getWidth(), this.mOffLayout.getWidth());
        } else {
            iMax = 0;
        }
        this.mThumbWidth = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.mTrackDrawable.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            Rect rectB = AbstractC0859g0.b(drawable3);
            iMax2 = Math.max(iMax2, rectB.left);
            iMax3 = Math.max(iMax3, rectB.right);
        }
        int iMax4 = this.mEnforceSwitchWidth ? Math.max(this.mSwitchMinWidth, (this.mThumbWidth * 2) + iMax2 + iMax3) : this.mSwitchMinWidth;
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.mSwitchWidth = iMax4;
        this.mSwitchHeight = iMax5;
        super.onMeasure(i7, i10);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.mTextOn : this.mTextOff;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x0096  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00da  */
    /* JADX WARN: Code duplicated, block: B:62:0x00df  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f9  */
    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f10;
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            float f11 = 0.0f;
            if (actionMasked == 1) {
                if (this.mTouchMode == 2) {
                    this.mTouchMode = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    zIsChecked = isChecked();
                    if (z3) {
                        this.mVelocityTracker.computeCurrentVelocity(1000);
                        xVelocity = this.mVelocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.mMinFlingVelocity) {
                            boolean z8 = p1.f12995a;
                            targetCheckedState = getLayoutDirection() == 1 ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.mTouchMode = 0;
                this.mVelocityTracker.clear();
            } else if (actionMasked == 2) {
                int i7 = this.mTouchMode;
                if (i7 == 1) {
                    float x3 = motionEvent.getX();
                    float y8 = motionEvent.getY();
                    if (Math.abs(x3 - this.mTouchX) > this.mTouchSlop || Math.abs(y8 - this.mTouchY) > this.mTouchSlop) {
                        this.mTouchMode = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.mTouchX = x3;
                        this.mTouchY = y8;
                        return true;
                    }
                } else if (i7 == 2) {
                    float x7 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f12 = x7 - this.mTouchX;
                    if (thumbScrollRange != 0) {
                        f10 = f12 / thumbScrollRange;
                    } else {
                        f10 = f12 > 0.0f ? 1.0f : -1.0f;
                    }
                    boolean z10 = p1.f12995a;
                    if (getLayoutDirection() == 1) {
                        f10 = -f10;
                    }
                    float f13 = this.mThumbPosition;
                    float f14 = f10 + f13;
                    if (f14 >= 0.0f) {
                        f11 = f14 > 1.0f ? 1.0f : f14;
                    }
                    if (f11 != f13) {
                        this.mTouchX = x7;
                        setThumbPosition(f11);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.mTouchMode == 2) {
                    this.mTouchMode = 0;
                    if (motionEvent.getAction() == 1) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    zIsChecked = isChecked();
                    if (z3) {
                        this.mVelocityTracker.computeCurrentVelocity(1000);
                        xVelocity = this.mVelocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.mMinFlingVelocity) {
                            boolean z11 = p1.f12995a;
                            if (getLayoutDirection() == 1) {
                            }
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.mTouchMode = 0;
                this.mVelocityTracker.clear();
            }
        } else {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (isEnabled() && this.mThumbDrawable != null) {
                int thumbOffset = getThumbOffset();
                this.mThumbDrawable.getPadding(this.mTempRect);
                int i10 = this.mSwitchTop;
                int i11 = this.mTouchSlop;
                int i12 = i10 - i11;
                int i13 = (this.mSwitchLeft + thumbOffset) - i11;
                int i14 = this.mThumbWidth + i13;
                Rect rect = this.mTempRect;
                int i15 = i14 + rect.left + rect.right + i11;
                int i16 = this.mSwitchBottom + i11;
                if (x10 > i13 && x10 < i15 && y10 > i12 && y10 < i16) {
                    this.mTouchMode = 1;
                    this.mTouchX = x10;
                    this.mTouchY = y10;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().d(z3);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        super.setChecked(z3);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.mTextOn;
                if (string == null) {
                    string = getResources().getString(p241q.h.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
                new androidx.core.view.A(W.c.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.mTextOff;
            if (string2 == null) {
                string2 = getResources().getString(p241q.h.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = androidx.core.view.N.f16168a;
            new androidx.core.view.A(W.c.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.mPositionAnimator;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, THUMB_POS, zIsChecked ? 1.0f : 0.0f);
        this.mPositionAnimator = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.mPositionAnimator.setAutoCancel(true);
        this.mPositionAnimator.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(p377z5.l.Q(callback, this));
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().e(z3);
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z3) {
        this.mEnforceSwitchWidth = z3;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z3) {
        if (this.mShowText != z3) {
            this.mShowText = z3;
            requestLayout();
            if (z3) {
                c();
            }
        }
    }

    public void setSplitTrack(boolean z3) {
        this.mSplitTrack = z3;
        invalidate();
    }

    public void setSwitchMinWidth(int i7) {
        this.mSwitchMinWidth = i7;
        requestLayout();
    }

    public void setSwitchPadding(int i7) {
        this.mSwitchPadding = i7;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i7) {
        ColorStateList colorStateList;
        Typeface typeface;
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i7, p241q.j.TextAppearance);
        int i10 = p241q.j.TextAppearance_android_textColor;
        if (!typedArrayObtainStyledAttributes.hasValue(i10) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(i10, 0)) == 0 || (colorStateList = androidx.core.content.d.c(resourceId, context)) == null) {
            colorStateList = typedArrayObtainStyledAttributes.getColorStateList(i10);
        }
        if (colorStateList != null) {
            this.mTextColors = colorStateList;
        } else {
            this.mTextColors = getTextColors();
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(p241q.j.TextAppearance_android_textSize, 0);
        if (dimensionPixelSize != 0) {
            float f10 = dimensionPixelSize;
            if (f10 != this.mTextPaint.getTextSize()) {
                this.mTextPaint.setTextSize(f10);
                requestLayout();
            }
        }
        int i11 = typedArrayObtainStyledAttributes.getInt(p241q.j.TextAppearance_android_typeface, -1);
        int i12 = typedArrayObtainStyledAttributes.getInt(p241q.j.TextAppearance_android_textStyle, -1);
        if (i11 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i11 != 2) {
            typeface = i11 != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        setSwitchTypeface(typeface, i12);
        if (typedArrayObtainStyledAttributes.getBoolean(p241q.j.TextAppearance_textAllCaps, false)) {
            Context context2 = getContext();
            p330w.a aVar = new p330w.a();
            aVar.f43221a = context2.getResources().getConfiguration().locale;
            this.mSwitchTransformationMethod = aVar;
        } else {
            this.mSwitchTransformationMethod = null;
        }
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setSwitchTypeface(Typeface typeface, int i7) {
        if (i7 <= 0) {
            this.mTextPaint.setFakeBoldText(false);
            this.mTextPaint.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i7) : Typeface.create(typeface, i7);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i10 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i7;
            this.mTextPaint.setFakeBoldText((i10 & 1) != 0);
            this.mTextPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.mTextOff;
        if (string == null) {
            string = getResources().getString(p241q.h.abc_capital_off);
        }
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        new androidx.core.view.A(W.c.tag_state_description, CharSequence.class, 64, 30, 2).f(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.mTextOn;
        if (string == null) {
            string = getResources().getString(p241q.h.abc_capital_on);
        }
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        new androidx.core.view.A(W.c.tag_state_description, CharSequence.class, 64, 30, 2).f(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mThumbDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.mThumbPosition = f10;
        invalidate();
    }

    public void setThumbResource(int i7) {
        setThumbDrawable(p264r5.a.q(i7, getContext()));
    }

    public void setThumbTextPadding(int i7) {
        this.mThumbTextPadding = i7;
        requestLayout();
    }

    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.mThumbTintList = colorStateList;
        this.mHasThumbTint = true;
        a();
    }

    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        this.mThumbTintMode = mode;
        this.mHasThumbTintMode = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mTrackDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i7) {
        setTrackDrawable(p264r5.a.q(i7, getContext()));
    }

    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.mTrackTintList = colorStateList;
        this.mHasTrackTint = true;
        b();
    }

    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        this.mTrackTintMode = mode;
        this.mHasTrackTintMode = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mThumbDrawable || drawable == this.mTrackDrawable;
    }

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p241q.a.switchStyle);
    }

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mThumbTintList = null;
        this.mThumbTintMode = null;
        this.mHasThumbTint = false;
        this.mHasThumbTintMode = false;
        this.mTrackTintList = null;
        this.mTrackTintMode = null;
        this.mHasTrackTint = false;
        this.mHasTrackTintMode = false;
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mEnforceSwitchWidth = true;
        this.mTempRect = new Rect();
        W0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.mTextPaint = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        Z0 z0F = Z0.f(context, attributeSet, p241q.j.SwitchCompat, i7, 0);
        androidx.core.view.N.p(this, context, p241q.j.SwitchCompat, attributeSet, z0F.f12863b, i7, 0);
        Drawable drawableB = z0F.b(p241q.j.SwitchCompat_android_thumb);
        this.mThumbDrawable = drawableB;
        if (drawableB != null) {
            drawableB.setCallback(this);
        }
        Drawable drawableB2 = z0F.b(p241q.j.SwitchCompat_track);
        this.mTrackDrawable = drawableB2;
        if (drawableB2 != null) {
            drawableB2.setCallback(this);
        }
        int i10 = p241q.j.SwitchCompat_android_textOn;
        TypedArray typedArray = z0F.f12863b;
        setTextOnInternal(typedArray.getText(i10));
        setTextOffInternal(typedArray.getText(p241q.j.SwitchCompat_android_textOff));
        this.mShowText = typedArray.getBoolean(p241q.j.SwitchCompat_showText, true);
        this.mThumbTextPadding = typedArray.getDimensionPixelSize(p241q.j.SwitchCompat_thumbTextPadding, 0);
        this.mSwitchMinWidth = typedArray.getDimensionPixelSize(p241q.j.SwitchCompat_switchMinWidth, 0);
        this.mSwitchPadding = typedArray.getDimensionPixelSize(p241q.j.SwitchCompat_switchPadding, 0);
        this.mSplitTrack = typedArray.getBoolean(p241q.j.SwitchCompat_splitTrack, false);
        ColorStateList colorStateListA = z0F.a(p241q.j.SwitchCompat_thumbTint);
        if (colorStateListA != null) {
            this.mThumbTintList = colorStateListA;
            this.mHasThumbTint = true;
        }
        PorterDuff.Mode modeC = AbstractC0859g0.c(typedArray.getInt(p241q.j.SwitchCompat_thumbTintMode, -1), null);
        if (this.mThumbTintMode != modeC) {
            this.mThumbTintMode = modeC;
            this.mHasThumbTintMode = true;
        }
        if (this.mHasThumbTint || this.mHasThumbTintMode) {
            a();
        }
        ColorStateList colorStateListA2 = z0F.a(p241q.j.SwitchCompat_trackTint);
        if (colorStateListA2 != null) {
            this.mTrackTintList = colorStateListA2;
            this.mHasTrackTint = true;
        }
        PorterDuff.Mode modeC2 = AbstractC0859g0.c(typedArray.getInt(p241q.j.SwitchCompat_trackTintMode, -1), null);
        if (this.mTrackTintMode != modeC2) {
            this.mTrackTintMode = modeC2;
            this.mHasTrackTintMode = true;
        }
        if (this.mHasTrackTint || this.mHasTrackTintMode) {
            b();
        }
        int resourceId = typedArray.getResourceId(p241q.j.SwitchCompat_switchTextAppearance, 0);
        if (resourceId != 0) {
            setSwitchTextAppearance(context, resourceId);
        }
        V v3 = new V(this);
        this.mTextHelper = v3;
        v3.f(attributeSet, i7);
        z0F.g();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i7);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.mTextPaint.getTypeface() == null || this.mTextPaint.getTypeface().equals(typeface)) && (this.mTextPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        this.mTextPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }
}
