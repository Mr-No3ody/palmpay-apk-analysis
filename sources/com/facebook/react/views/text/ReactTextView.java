package com.facebook.react.views.text;

import H3.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.X0;
import androidx.core.view.C1050b;
import androidx.core.view.N;
import androidx.customview.widget.b;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.internal.SystraceSection;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactCompoundView;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.uimanager.style.Overflow;
import com.facebook.react.views.text.internal.span.ReactTagSpan;
import com.facebook.react.views.text.internal.span.TextInlineImageSpan;
import com.facebook.react.views.text.internal.span.TextInlineViewPlaceholderSpan;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(p245q3.a.f41451a)
public class ReactTextView extends AppCompatTextView implements ReactCompoundView {
    private static final int DEFAULT_GRAVITY = 8388659;
    private static final ViewGroup.LayoutParams EMPTY_LAYOUT_PARAMS = new ViewGroup.LayoutParams(0, 0);
    private boolean mAdjustsFontSizeToFit;
    private boolean mContainsImages;

    @Nullable
    private TextUtils.TruncateAt mEllipsizeLocation;
    private float mFontSize;
    private float mLetterSpacing;
    private int mLinkifyMaskType;
    private float mMinimumFontSize;
    private int mNumberOfLines;
    private Overflow mOverflow;
    private boolean mShouldAdjustSpannableFontSize;

    @Nullable
    private Spannable mSpanned;
    private boolean mTextIsSelectable;

    public ReactTextView(Context context) {
        super(context);
        this.mOverflow = Overflow.VISIBLE;
        initView();
    }

    private void applyTextAttributes() {
        if (!Float.isNaN(this.mFontSize)) {
            setTextSize(0, this.mFontSize);
        }
        if (Float.isNaN(this.mLetterSpacing)) {
            return;
        }
        super.setLetterSpacing(this.mLetterSpacing);
    }

    private ReactContext getReactContext() {
        Context context = getContext();
        return context instanceof X0 ? (ReactContext) ((X0) context).getBaseContext() : (ReactContext) context;
    }

    private void initView() {
        this.mNumberOfLines = Integer.MAX_VALUE;
        this.mAdjustsFontSizeToFit = false;
        this.mLinkifyMaskType = 0;
        this.mTextIsSelectable = false;
        this.mShouldAdjustSpannableFontSize = false;
        this.mEllipsizeLocation = TextUtils.TruncateAt.END;
        this.mFontSize = Float.NaN;
        this.mMinimumFontSize = Float.NaN;
        this.mLetterSpacing = 0.0f;
        this.mOverflow = Overflow.VISIBLE;
        this.mSpanned = null;
    }

    private static WritableMap inlineViewJson(int i7, int i10, int i11, int i12, int i13, int i14) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (i7 == 8) {
            writableMapCreateMap.putString("visibility", "gone");
            writableMapCreateMap.putInt(FirebaseAnalytics.Param.INDEX, i10);
            return writableMapCreateMap;
        }
        if (i7 != 0) {
            writableMapCreateMap.putString("visibility", "unknown");
            writableMapCreateMap.putInt(FirebaseAnalytics.Param.INDEX, i10);
            return writableMapCreateMap;
        }
        writableMapCreateMap.putString("visibility", ViewProps.VISIBLE);
        writableMapCreateMap.putInt(FirebaseAnalytics.Param.INDEX, i10);
        writableMapCreateMap.putDouble(ViewProps.LEFT, PixelUtil.toDIPFromPixel(i11));
        writableMapCreateMap.putDouble(ViewProps.TOP, PixelUtil.toDIPFromPixel(i12));
        writableMapCreateMap.putDouble(ViewProps.RIGHT, PixelUtil.toDIPFromPixel(i13));
        writableMapCreateMap.putDouble(ViewProps.BOTTOM, PixelUtil.toDIPFromPixel(i14));
        return writableMapCreateMap;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (N.j(this)) {
            C1050b c1050bD = N.d(this);
            if (c1050bD instanceof b) {
                return ((b) c1050bD).dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C1050b c1050bD = N.d(this);
        return (c1050bD != null && getMovementMethod() == null && (c1050bD instanceof ReactTextViewAccessibilityDelegate) && ((ReactTextViewAccessibilityDelegate) c1050bD).dispatchKeyEvent(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public int getGravityHorizontal() {
        return getGravity() & 8388615;
    }

    @Nullable
    public Spannable getSpanned() {
        return this.mSpanned;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                if (textInlineImageSpan.getDrawable() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mTextIsSelectable) {
            setTextIsSelectable(false);
            setTextIsSelectable(true);
        } else {
            setTextIsSelectable(false);
        }
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onAttachedToWindow();
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onDetachedFromWindow();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        SystraceSection systraceSection = new SystraceSection("ReactTextView.onDraw");
        try {
            Spannable spanned = getSpanned();
            if (this.mAdjustsFontSizeToFit && spanned != null && this.mShouldAdjustSpannableFontSize) {
                this.mShouldAdjustSpannableFontSize = false;
                float width = getWidth();
                j jVar = j.f3659b;
                TextLayoutManager.adjustSpannableFontToFit(spanned, width, jVar, getHeight(), jVar, this.mMinimumFontSize, this.mNumberOfLines, getIncludeFontPadding(), getBreakStrategy(), getHyphenationFrequency(), Layout.Alignment.ALIGN_NORMAL, Build.VERSION.SDK_INT < 26 ? -1 : getJustificationMode(), getPaint());
                setText(spanned);
            }
            if (this.mOverflow != Overflow.VISIBLE) {
                BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
            }
            super.onDraw(canvas);
            systraceSection.close();
        } catch (Throwable th) {
            try {
                systraceSection.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onFinishTemporaryDetach();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z3, int i7, @Nullable Rect rect) {
        super.onFocusChanged(z3, i7, rect);
        C1050b c1050bD = N.d(this);
        if (c1050bD != null && (c1050bD instanceof ReactTextViewAccessibilityDelegate) && getMovementMethod() == null) {
            ((ReactTextViewAccessibilityDelegate) c1050bD).onFocusChanged(z3, i7, rect);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        int lineRight;
        int id2 = getId();
        if ((getText() instanceof Spanned) && ViewUtil.getUIManagerType(id2) != 2 && !ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            UIManagerModule uIManagerModule = (UIManagerModule) getReactContext().getNativeModule(UIManagerModule.class);
            p059e1.a.f(uIManagerModule);
            Spanned spanned = (Spanned) getText();
            Layout layout = getLayout();
            if (layout != null) {
                TextInlineViewPlaceholderSpan[] textInlineViewPlaceholderSpanArr = (TextInlineViewPlaceholderSpan[]) spanned.getSpans(0, spanned.length(), TextInlineViewPlaceholderSpan.class);
                int i13 = i11 - i7;
                int i14 = i12 - i10;
                int length = textInlineViewPlaceholderSpanArr.length;
                int i15 = 0;
                while (i15 < length) {
                    TextInlineViewPlaceholderSpan textInlineViewPlaceholderSpan = textInlineViewPlaceholderSpanArr[i15];
                    View viewResolveView = uIManagerModule.resolveView(textInlineViewPlaceholderSpan.getReactTag());
                    int spanStart = spanned.getSpanStart(textInlineViewPlaceholderSpan);
                    int lineForOffset = layout.getLineForOffset(spanStart);
                    if (layout.getEllipsisCount(lineForOffset) > 0) {
                        if (spanStart < layout.getEllipsisStart(lineForOffset) + layout.getLineStart(lineForOffset)) {
                            if (lineForOffset >= this.mNumberOfLines && spanStart < layout.getLineEnd(lineForOffset)) {
                                int width = textInlineViewPlaceholderSpan.getWidth();
                                int height = textInlineViewPlaceholderSpan.getHeight();
                                boolean zIsRtlCharAt = layout.isRtlCharAt(spanStart);
                                boolean z8 = layout.getParagraphDirection(lineForOffset) == -1;
                                if (spanStart == spanned.length() - 1) {
                                    float lineWidth = (spanned.length() <= 0 || spanned.charAt(layout.getLineEnd(lineForOffset) + (-1)) != '\n') ? layout.getLineWidth(lineForOffset) : layout.getLineMax(lineForOffset);
                                    if (z8) {
                                        lineRight = i13 - ((int) lineWidth);
                                    } else {
                                        lineRight = (int) layout.getLineRight(lineForOffset);
                                        lineRight -= width;
                                    }
                                } else {
                                    int primaryHorizontal = (int) (z8 == zIsRtlCharAt ? layout.getPrimaryHorizontal(spanStart) : layout.getSecondaryHorizontal(spanStart));
                                    lineRight = z8 ? i13 - (((int) layout.getLineRight(lineForOffset)) - primaryHorizontal) : primaryHorizontal;
                                    if (zIsRtlCharAt) {
                                        lineRight -= width;
                                    }
                                }
                                int totalPaddingRight = (zIsRtlCharAt ? getTotalPaddingRight() : getTotalPaddingLeft()) + lineRight;
                                int i16 = i7 + totalPaddingRight;
                                int lineBaseline = (layout.getLineBaseline(lineForOffset) + getTotalPaddingTop()) - height;
                                int i17 = i10 + lineBaseline;
                                viewResolveView.setVisibility((i13 <= totalPaddingRight || i14 <= lineBaseline) ? 8 : 0);
                                viewResolveView.layout(i16, i17, width + i16, height + i17);
                            }
                        }
                        viewResolveView.setVisibility(8);
                    } else if (lineForOffset >= this.mNumberOfLines) {
                        viewResolveView.setVisibility(8);
                    } else {
                        viewResolveView.setVisibility(8);
                    }
                    i15++;
                    uIManagerModule = uIManagerModule;
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i10) {
        SystraceSection systraceSection = new SystraceSection("ReactTextView.onMeasure");
        try {
            super.onMeasure(i7, i10);
            systraceSection.close();
        } catch (Throwable th) {
            try {
                systraceSection.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onStartTemporaryDetach();
            }
        }
    }

    @Override // com.facebook.react.uimanager.ReactCompoundView
    public int reactTagForTouch(float f10, float f11) {
        int i7;
        CharSequence text = getText();
        int id2 = getId();
        int i10 = (int) f10;
        int i11 = (int) f11;
        Layout layout = getLayout();
        if (layout != null) {
            int lineForVertical = layout.getLineForVertical(i11);
            int lineLeft = (int) layout.getLineLeft(lineForVertical);
            int lineRight = (int) layout.getLineRight(lineForVertical);
            if ((text instanceof Spanned) && i10 >= lineLeft && i10 <= lineRight) {
                Spanned spanned = (Spanned) text;
                try {
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, i10);
                    ReactTagSpan[] reactTagSpanArr = (ReactTagSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, ReactTagSpan.class);
                    if (reactTagSpanArr != null) {
                        int length = text.length();
                        for (int i12 = 0; i12 < reactTagSpanArr.length; i12++) {
                            int spanStart = spanned.getSpanStart(reactTagSpanArr[i12]);
                            int spanEnd = spanned.getSpanEnd(reactTagSpanArr[i12]);
                            if (spanEnd >= offsetForHorizontal && (i7 = spanEnd - spanStart) <= length) {
                                id2 = reactTagSpanArr[i12].getReactTag();
                                length = i7;
                            }
                        }
                        return id2;
                    }
                } catch (ArrayIndexOutOfBoundsException e10) {
                    p229p2.a.h("ReactNative", "Crash in HorizontalMeasurementProvider: " + e10.getMessage());
                }
            }
        }
        return id2;
    }

    public void recycleView() {
        initView();
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        BackgroundStyleApplicator.reset(this);
        setBreakStrategy(0);
        setMovementMethod(getDefaultMovementMethod());
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            setJustificationMode(0);
        }
        setLayoutParams(EMPTY_LAYOUT_PARAMS);
        super.setText((CharSequence) null);
        applyTextAttributes();
        setGravity(8388659);
        setNumberOfLines(this.mNumberOfLines);
        setAdjustFontSizeToFit(this.mAdjustsFontSizeToFit);
        setLinkifyMask(this.mLinkifyMaskType);
        setTextIsSelectable(this.mTextIsSelectable);
        setIncludeFontPadding(true);
        setEnabled(true);
        setLinkifyMask(0);
        setEllipsizeLocation(this.mEllipsizeLocation);
        setEnabled(true);
        if (i7 >= 26) {
            setFocusable(16);
        }
        setHyphenationFrequency(0);
        updateView();
    }

    public void setAdjustFontSizeToFit(boolean z3) {
        this.mAdjustsFontSizeToFit = z3;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        BackgroundStyleApplicator.setBackgroundColor(this, Integer.valueOf(i7));
    }

    public void setBorderColor(int i7, @Nullable Integer num) {
        BackgroundStyleApplicator.setBorderColor(this, LogicalEdge.values()[i7], num);
    }

    public void setBorderRadius(float f10) {
        setBorderRadius(f10, BorderRadiusProp.BORDER_RADIUS.ordinal());
    }

    public void setBorderStyle(@Nullable String str) {
        BackgroundStyleApplicator.setBorderStyle(this, str == null ? null : BorderStyle.fromString(str));
    }

    public void setBorderWidth(int i7, float f10) {
        BackgroundStyleApplicator.setBorderWidth(this, LogicalEdge.values()[i7], Float.valueOf(PixelUtil.toDIPFromPixel(f10)));
    }

    @Override // android.widget.TextView
    public void setBreakStrategy(int i7) {
        super.setBreakStrategy(i7);
        this.mShouldAdjustSpannableFontSize = true;
    }

    public void setEllipsizeLocation(@Nullable TextUtils.TruncateAt truncateAt) {
        this.mEllipsizeLocation = truncateAt;
    }

    public void setFontSize(float f10) {
        this.mFontSize = (float) (this.mAdjustsFontSizeToFit ? Math.ceil(PixelUtil.toPixelFromSP(f10)) : Math.ceil(PixelUtil.toPixelFromDIP(f10)));
        applyTextAttributes();
    }

    public void setGravityHorizontal(int i7) {
        if (i7 == 0) {
            i7 = 8388611;
        }
        setGravity(i7 | (getGravity() & (-8388616)));
    }

    public void setGravityVertical(int i7) {
        if (i7 == 0) {
            i7 = 48;
        }
        setGravity(i7 | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setHyphenationFrequency(int i7) {
        super.setHyphenationFrequency(i7);
        this.mShouldAdjustSpannableFontSize = true;
    }

    @Override // android.widget.TextView
    public void setIncludeFontPadding(boolean z3) {
        super.setIncludeFontPadding(z3);
        this.mShouldAdjustSpannableFontSize = true;
    }

    @Override // android.widget.TextView
    public void setLetterSpacing(float f10) {
        if (Float.isNaN(f10)) {
            return;
        }
        this.mLetterSpacing = PixelUtil.toPixelFromDIP(f10) / this.mFontSize;
        applyTextAttributes();
    }

    public void setLinkifyMask(int i7) {
        this.mLinkifyMaskType = i7;
    }

    public void setMinimumFontSize(float f10) {
        this.mMinimumFontSize = f10;
        this.mShouldAdjustSpannableFontSize = true;
    }

    public void setNumberOfLines(int i7) {
        if (i7 == 0) {
            i7 = Integer.MAX_VALUE;
        }
        this.mNumberOfLines = i7;
        setMaxLines(i7);
        this.mShouldAdjustSpannableFontSize = true;
    }

    public void setOverflow(@Nullable String str) {
        if (str == null) {
            this.mOverflow = Overflow.VISIBLE;
        } else {
            Overflow overflowFromString = Overflow.fromString(str);
            if (overflowFromString == null) {
                overflowFromString = Overflow.VISIBLE;
            }
            this.mOverflow = overflowFromString;
        }
        invalidate();
    }

    public void setSpanned(Spannable spannable) {
        this.mSpanned = spannable;
        this.mShouldAdjustSpannableFontSize = true;
    }

    public void setText(ReactTextUpdate reactTextUpdate) {
        SystraceSection systraceSection = new SystraceSection("ReactTextView.setText(ReactTextUpdate)");
        try {
            this.mContainsImages = reactTextUpdate.getContainsImages();
            if (getLayoutParams() == null) {
                setLayoutParams(EMPTY_LAYOUT_PARAMS);
            }
            Spannable text = reactTextUpdate.getText();
            int i7 = this.mLinkifyMaskType;
            if (i7 > 0) {
                Linkify.addLinks(text, i7);
                setMovementMethod(LinkMovementMethod.getInstance());
            }
            setText(text);
            float paddingLeft = reactTextUpdate.getPaddingLeft();
            float paddingTop = reactTextUpdate.getPaddingTop();
            float paddingRight = reactTextUpdate.getPaddingRight();
            float paddingBottom = reactTextUpdate.getPaddingBottom();
            if (paddingLeft != -1.0f && paddingTop != -1.0f && paddingRight != -1.0f && paddingBottom != -1.0f) {
                setPadding((int) Math.floor(paddingLeft), (int) Math.floor(paddingTop), (int) Math.floor(paddingRight), (int) Math.floor(paddingBottom));
            }
            int textAlign = reactTextUpdate.getTextAlign();
            if (textAlign != getGravityHorizontal()) {
                setGravityHorizontal(textAlign);
            }
            if (getBreakStrategy() != reactTextUpdate.getTextBreakStrategy()) {
                setBreakStrategy(reactTextUpdate.getTextBreakStrategy());
            }
            if (Build.VERSION.SDK_INT >= 26 && getJustificationMode() != reactTextUpdate.getJustificationMode()) {
                setJustificationMode(reactTextUpdate.getJustificationMode());
            }
            requestLayout();
            systraceSection.close();
        } catch (Throwable th) {
            try {
                systraceSection.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.widget.TextView
    public void setTextIsSelectable(boolean z3) {
        this.mTextIsSelectable = z3;
        super.setTextIsSelectable(z3);
    }

    public void updateView() {
        setEllipsize((this.mNumberOfLines == Integer.MAX_VALUE || this.mAdjustsFontSizeToFit) ? null : this.mEllipsizeLocation);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                if (textInlineImageSpan.getDrawable() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    public void setBorderRadius(float f10, int i7) {
        BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.values()[i7], Float.isNaN(f10) ? null : new LengthPercentage(PixelUtil.toDIPFromPixel(f10), LengthPercentageType.POINT));
    }
}
