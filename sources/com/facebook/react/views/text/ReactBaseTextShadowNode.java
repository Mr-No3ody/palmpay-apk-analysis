package com.facebook.react.views.text;

import H3.e;
import H3.o;
import android.graphics.Color;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.internal.ReactTextInlineImageShadowNode;
import com.facebook.react.views.text.internal.span.CustomLetterSpacingSpan;
import com.facebook.react.views.text.internal.span.CustomLineHeightSpan;
import com.facebook.react.views.text.internal.span.CustomStyleSpan;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.internal.span.ReactBackgroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactClickableSpan;
import com.facebook.react.views.text.internal.span.ReactForegroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactSpan;
import com.facebook.react.views.text.internal.span.ReactStrikethroughSpan;
import com.facebook.react.views.text.internal.span.ReactTagSpan;
import com.facebook.react.views.text.internal.span.ReactUnderlineSpan;
import com.facebook.react.views.text.internal.span.SetSpanOperation;
import com.facebook.react.views.text.internal.span.ShadowStyleSpan;
import com.facebook.react.views.text.internal.span.TextInlineImageSpan;
import com.facebook.react.views.text.internal.span.TextInlineViewPlaceholderSpan;
import com.facebook.yoga.YogaValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(p245q3.a.f41451a)
public abstract class ReactBaseTextShadowNode extends LayoutShadowNode {
    public static final int DEFAULT_TEXT_SHADOW_COLOR = 1426063360;
    private static final String INLINE_VIEW_PLACEHOLDER = "0";
    public static final String PROP_SHADOW_COLOR = "textShadowColor";
    public static final String PROP_SHADOW_OFFSET = "textShadowOffset";
    public static final String PROP_SHADOW_OFFSET_HEIGHT = "height";
    public static final String PROP_SHADOW_OFFSET_WIDTH = "width";
    public static final String PROP_SHADOW_RADIUS = "textShadowRadius";
    public static final String PROP_TEXT_TRANSFORM = "textTransform";

    @Nullable
    protected ReactAccessibilityDelegate.AccessibilityRole mAccessibilityRole;
    protected boolean mAdjustsFontSizeToFit;
    protected int mBackgroundColor;
    protected int mColor;
    protected boolean mContainsImages;

    @Nullable
    protected String mFontFamily;

    @Nullable
    protected String mFontFeatureSettings;
    protected int mFontStyle;
    protected int mFontWeight;
    protected int mHyphenationFrequency;
    protected boolean mIncludeFontPadding;

    @Nullable
    protected Map<Integer, ReactShadowNode> mInlineViews;
    protected boolean mIsBackgroundColorSet;
    protected boolean mIsColorSet;
    protected boolean mIsLineThroughTextDecorationSet;
    protected boolean mIsUnderlineTextDecorationSet;
    protected int mJustificationMode;
    protected float mMinimumFontScale;
    protected int mNumberOfLines;

    @Nullable
    protected ReactTextViewManagerCallback mReactTextViewManagerCallback;

    @Nullable
    protected ReactAccessibilityDelegate.Role mRole;
    protected int mTextAlign;
    protected TextAttributes mTextAttributes;
    protected int mTextBreakStrategy;
    protected int mTextShadowColor;
    protected float mTextShadowOffsetDx;
    protected float mTextShadowOffsetDy;
    protected float mTextShadowRadius;

    public ReactBaseTextShadowNode() {
        this(null);
    }

    private static void buildSpannedFromShadowNode(ReactBaseTextShadowNode reactBaseTextShadowNode, SpannableStringBuilder spannableStringBuilder, List<SetSpanOperation> list, @Nullable TextAttributes textAttributes, boolean z3, @Nullable Map<Integer, ReactShadowNode> map, int i7) {
        float layoutWidth;
        float layoutHeight;
        TextAttributes textAttributesApplyChild = textAttributes != null ? textAttributes.applyChild(reactBaseTextShadowNode.mTextAttributes) : reactBaseTextShadowNode.mTextAttributes;
        int childCount = reactBaseTextShadowNode.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ReactShadowNodeImpl childAt = reactBaseTextShadowNode.getChildAt(i10);
            if (childAt instanceof ReactRawTextShadowNode) {
                String text = ((ReactRawTextShadowNode) childAt).getText();
                if (text != null) {
                    spannableStringBuilder.append((CharSequence) TextTransform.apply(text, textAttributesApplyChild.textTransform));
                }
            } else {
                if (childAt instanceof ReactBaseTextShadowNode) {
                    buildSpannedFromShadowNode((ReactBaseTextShadowNode) childAt, spannableStringBuilder, list, textAttributesApplyChild, z3, map, spannableStringBuilder.length());
                } else if (childAt instanceof ReactTextInlineImageShadowNode) {
                    spannableStringBuilder.append("0");
                    list.add(new SetSpanOperation(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((ReactTextInlineImageShadowNode) childAt).buildInlineImageSpan()));
                } else {
                    if (!z3) {
                        throw new IllegalViewOperationException("Unexpected view type nested under a <Text> or <TextInput> node: " + childAt.getClass());
                    }
                    int reactTag = childAt.getReactTag();
                    YogaValue styleWidth = childAt.getStyleWidth();
                    YogaValue styleHeight = childAt.getStyleHeight();
                    o oVar = styleWidth.f21924b;
                    o oVar2 = o.POINT;
                    if (oVar == oVar2 && styleHeight.f21924b == oVar2) {
                        layoutWidth = styleWidth.f21923a;
                        layoutHeight = styleHeight.f21923a;
                    } else {
                        childAt.calculateLayout();
                        layoutWidth = childAt.getLayoutWidth();
                        layoutHeight = childAt.getLayoutHeight();
                    }
                    spannableStringBuilder.append("0");
                    list.add(new SetSpanOperation(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new TextInlineViewPlaceholderSpan(reactTag, (int) layoutWidth, (int) layoutHeight)));
                    p059e1.a.f(map);
                    map.put(Integer.valueOf(reactTag), childAt);
                }
                childAt.markUpdateSeen();
            }
            childAt.markUpdateSeen();
        }
        int length = spannableStringBuilder.length();
        if (length >= i7) {
            if (reactBaseTextShadowNode.mIsColorSet) {
                list.add(new SetSpanOperation(i7, length, new ReactForegroundColorSpan(reactBaseTextShadowNode.mColor)));
            }
            if (reactBaseTextShadowNode.mIsBackgroundColorSet) {
                list.add(new SetSpanOperation(i7, length, new ReactBackgroundColorSpan(reactBaseTextShadowNode.mBackgroundColor)));
            }
            ReactAccessibilityDelegate.Role role = reactBaseTextShadowNode.mRole;
            if (role == null ? reactBaseTextShadowNode.mAccessibilityRole == ReactAccessibilityDelegate.AccessibilityRole.LINK : role == ReactAccessibilityDelegate.Role.LINK) {
                list.add(new SetSpanOperation(i7, length, new ReactClickableSpan(reactBaseTextShadowNode.getReactTag())));
            }
            float effectiveLetterSpacing = textAttributesApplyChild.getEffectiveLetterSpacing();
            if (!Float.isNaN(effectiveLetterSpacing) && (textAttributes == null || textAttributes.getEffectiveLetterSpacing() != effectiveLetterSpacing)) {
                list.add(new SetSpanOperation(i7, length, new CustomLetterSpacingSpan(effectiveLetterSpacing)));
            }
            int effectiveFontSize = textAttributesApplyChild.getEffectiveFontSize();
            if (textAttributes == null || textAttributes.getEffectiveFontSize() != effectiveFontSize) {
                list.add(new SetSpanOperation(i7, length, new ReactAbsoluteSizeSpan(effectiveFontSize)));
            }
            if (reactBaseTextShadowNode.mFontStyle != -1 || reactBaseTextShadowNode.mFontWeight != -1 || reactBaseTextShadowNode.mFontFamily != null) {
                list.add(new SetSpanOperation(i7, length, new CustomStyleSpan(reactBaseTextShadowNode.mFontStyle, reactBaseTextShadowNode.mFontWeight, reactBaseTextShadowNode.mFontFeatureSettings, reactBaseTextShadowNode.mFontFamily, reactBaseTextShadowNode.getThemedContext().getAssets())));
            }
            if (reactBaseTextShadowNode.mIsUnderlineTextDecorationSet) {
                list.add(new SetSpanOperation(i7, length, new ReactUnderlineSpan()));
            }
            if (reactBaseTextShadowNode.mIsLineThroughTextDecorationSet) {
                list.add(new SetSpanOperation(i7, length, new ReactStrikethroughSpan()));
            }
            if ((reactBaseTextShadowNode.mTextShadowOffsetDx != 0.0f || reactBaseTextShadowNode.mTextShadowOffsetDy != 0.0f || reactBaseTextShadowNode.mTextShadowRadius != 0.0f) && Color.alpha(reactBaseTextShadowNode.mTextShadowColor) != 0) {
                list.add(new SetSpanOperation(i7, length, new ShadowStyleSpan(reactBaseTextShadowNode.mTextShadowOffsetDx, reactBaseTextShadowNode.mTextShadowOffsetDy, reactBaseTextShadowNode.mTextShadowRadius, reactBaseTextShadowNode.mTextShadowColor)));
            }
            float effectiveLineHeight = textAttributesApplyChild.getEffectiveLineHeight();
            if (!Float.isNaN(effectiveLineHeight) && (textAttributes == null || textAttributes.getEffectiveLineHeight() != effectiveLineHeight)) {
                list.add(new SetSpanOperation(i7, length, new CustomLineHeightSpan(effectiveLineHeight)));
            }
            list.add(new SetSpanOperation(i7, length, new ReactTagSpan(reactBaseTextShadowNode.getReactTag())));
        }
    }

    private int getTextAlign() {
        int i7 = this.mTextAlign;
        if (getLayoutDirection() == e.RTL) {
            if (i7 == 5) {
                return 3;
            }
            if (i7 == 3) {
                return 5;
            }
        }
        return i7;
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_ROLE)
    public void setAccessibilityRole(@Nullable String str) {
        if (isVirtual()) {
            this.mAccessibilityRole = ReactAccessibilityDelegate.AccessibilityRole.fromValue(str);
            markUpdated();
        }
    }

    @ReactProp(name = ViewProps.ADJUSTS_FONT_SIZE_TO_FIT)
    public void setAdjustFontSizeToFit(boolean z3) {
        if (z3 != this.mAdjustsFontSizeToFit) {
            this.mAdjustsFontSizeToFit = z3;
            markUpdated();
        }
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.ALLOW_FONT_SCALING)
    public void setAllowFontScaling(boolean z3) {
        if (z3 != this.mTextAttributes.getAllowFontScaling()) {
            this.mTextAttributes.setAllowFontScaling(z3);
            markUpdated();
        }
    }

    @ReactProp(customType = "Color", name = ViewProps.BACKGROUND_COLOR)
    public void setBackgroundColor(@Nullable Integer num) {
        if (isVirtual()) {
            if (num != null) {
                this.mIsBackgroundColorSet = true;
                this.mBackgroundColor = num.intValue();
            }
            markUpdated();
        }
    }

    @ReactProp(customType = "Color", name = ViewProps.COLOR)
    public void setColor(@Nullable Integer num) {
        if (num != null) {
            this.mIsColorSet = true;
            this.mColor = num.intValue();
        }
        markUpdated();
    }

    @ReactProp(name = ViewProps.FONT_FAMILY)
    public void setFontFamily(@Nullable String str) {
        this.mFontFamily = str;
        markUpdated();
    }

    @ReactProp(defaultFloat = Float.NaN, name = ViewProps.FONT_SIZE)
    public void setFontSize(float f10) {
        this.mTextAttributes.setFontSize(f10);
        markUpdated();
    }

    @ReactProp(name = ViewProps.FONT_STYLE)
    public void setFontStyle(@Nullable String str) {
        int fontStyle = ReactTypefaceUtils.parseFontStyle(str);
        if (fontStyle != this.mFontStyle) {
            this.mFontStyle = fontStyle;
            markUpdated();
        }
    }

    @ReactProp(name = ViewProps.FONT_VARIANT)
    public void setFontVariant(@Nullable ReadableArray readableArray) {
        String fontVariant = ReactTypefaceUtils.parseFontVariant(readableArray);
        if (TextUtils.equals(fontVariant, this.mFontFeatureSettings)) {
            return;
        }
        this.mFontFeatureSettings = fontVariant;
        markUpdated();
    }

    @ReactProp(name = ViewProps.FONT_WEIGHT)
    public void setFontWeight(@Nullable String str) {
        int fontWeight = ReactTypefaceUtils.parseFontWeight(str);
        if (fontWeight != this.mFontWeight) {
            this.mFontWeight = fontWeight;
            markUpdated();
        }
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.INCLUDE_FONT_PADDING)
    public void setIncludeFontPadding(boolean z3) {
        this.mIncludeFontPadding = z3;
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.LETTER_SPACING)
    public void setLetterSpacing(float f10) {
        this.mTextAttributes.setLetterSpacing(f10);
        markUpdated();
    }

    @ReactProp(defaultFloat = Float.NaN, name = ViewProps.LINE_HEIGHT)
    public void setLineHeight(float f10) {
        this.mTextAttributes.setLineHeight(f10);
        markUpdated();
    }

    @ReactProp(defaultFloat = Float.NaN, name = ViewProps.MAX_FONT_SIZE_MULTIPLIER)
    public void setMaxFontSizeMultiplier(float f10) {
        if (f10 != this.mTextAttributes.getMaxFontSizeMultiplier()) {
            this.mTextAttributes.setMaxFontSizeMultiplier(f10);
            markUpdated();
        }
    }

    @ReactProp(name = ViewProps.MINIMUM_FONT_SCALE)
    public void setMinimumFontScale(float f10) {
        if (f10 != this.mMinimumFontScale) {
            this.mMinimumFontScale = f10;
            markUpdated();
        }
    }

    @ReactProp(defaultInt = -1, name = ViewProps.NUMBER_OF_LINES)
    public void setNumberOfLines(int i7) {
        if (i7 == 0) {
            i7 = -1;
        }
        this.mNumberOfLines = i7;
        markUpdated();
    }

    @ReactProp(name = ViewProps.ROLE)
    public void setRole(@Nullable String str) {
        if (isVirtual()) {
            this.mRole = ReactAccessibilityDelegate.Role.fromValue(str);
            markUpdated();
        }
    }

    @ReactProp(name = ViewProps.TEXT_ALIGN)
    public void setTextAlign(@Nullable String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mJustificationMode = 1;
            }
            this.mTextAlign = 3;
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mJustificationMode = 0;
            }
            if (str == null || "auto".equals(str)) {
                this.mTextAlign = 0;
            } else if (ViewProps.LEFT.equals(str)) {
                this.mTextAlign = 3;
            } else if (ViewProps.RIGHT.equals(str)) {
                this.mTextAlign = 5;
            } else if ("center".equals(str)) {
                this.mTextAlign = 1;
            } else {
                p229p2.a.v("ReactNative", "Invalid textAlign: ".concat(str));
                this.mTextAlign = 0;
            }
        }
        markUpdated();
    }

    @ReactProp(name = ViewProps.TEXT_BREAK_STRATEGY)
    public void setTextBreakStrategy(@Nullable String str) {
        if (str == null || "highQuality".equals(str)) {
            this.mTextBreakStrategy = 1;
        } else if ("simple".equals(str)) {
            this.mTextBreakStrategy = 0;
        } else if ("balanced".equals(str)) {
            this.mTextBreakStrategy = 2;
        } else {
            p229p2.a.v("ReactNative", "Invalid textBreakStrategy: ".concat(str));
            this.mTextBreakStrategy = 1;
        }
        markUpdated();
    }

    @ReactProp(name = ViewProps.TEXT_DECORATION_LINE)
    public void setTextDecorationLine(@Nullable String str) {
        this.mIsUnderlineTextDecorationSet = false;
        this.mIsLineThroughTextDecorationSet = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.mIsUnderlineTextDecorationSet = true;
                } else if ("line-through".equals(str2)) {
                    this.mIsLineThroughTextDecorationSet = true;
                }
            }
        }
        markUpdated();
    }

    @ReactProp(customType = "Color", defaultInt = DEFAULT_TEXT_SHADOW_COLOR, name = PROP_SHADOW_COLOR)
    public void setTextShadowColor(int i7) {
        if (i7 != this.mTextShadowColor) {
            this.mTextShadowColor = i7;
            markUpdated();
        }
    }

    @ReactProp(name = PROP_SHADOW_OFFSET)
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.mTextShadowOffsetDx = 0.0f;
        this.mTextShadowOffsetDy = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.mTextShadowOffsetDx = PixelUtil.toPixelFromDIP(readableMap.getDouble("width"));
            }
            if (readableMap.hasKey("height") && !readableMap.isNull("height")) {
                this.mTextShadowOffsetDy = PixelUtil.toPixelFromDIP(readableMap.getDouble("height"));
            }
        }
        markUpdated();
    }

    @ReactProp(defaultInt = 1, name = PROP_SHADOW_RADIUS)
    public void setTextShadowRadius(float f10) {
        if (f10 != this.mTextShadowRadius) {
            this.mTextShadowRadius = f10;
            markUpdated();
        }
    }

    @ReactProp(name = PROP_TEXT_TRANSFORM)
    public void setTextTransform(@Nullable String str) {
        TextTransform textTransform = TextTransform.UNSET;
        if (str != null) {
            if (ViewProps.NONE.equals(str)) {
                textTransform = TextTransform.NONE;
            } else if ("uppercase".equals(str)) {
                textTransform = TextTransform.UPPERCASE;
            } else if ("lowercase".equals(str)) {
                textTransform = TextTransform.LOWERCASE;
            } else if ("capitalize".equals(str)) {
                textTransform = TextTransform.CAPITALIZE;
            } else {
                p229p2.a.v("ReactNative", "Invalid textTransform: ".concat(str));
            }
        }
        this.mTextAttributes.textTransform = textTransform;
        markUpdated();
    }

    public Spannable spannedFromShadowNode(ReactBaseTextShadowNode reactBaseTextShadowNode, @Nullable String str, boolean z3, @Nullable NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        int height;
        p059e1.a.e((z3 && nativeViewHierarchyOptimizer == null) ? false : true, "nativeViewHierarchyOptimizer is required when inline views are supported");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        HashMap map = z3 ? new HashMap() : null;
        if (str != null) {
            spannableStringBuilder.append((CharSequence) TextTransform.apply(str, reactBaseTextShadowNode.mTextAttributes.textTransform));
        }
        buildSpannedFromShadowNode(reactBaseTextShadowNode, spannableStringBuilder, arrayList, null, z3, map, 0);
        reactBaseTextShadowNode.mContainsImages = false;
        reactBaseTextShadowNode.mInlineViews = map;
        float f10 = Float.NaN;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            SetSpanOperation setSpanOperation = (SetSpanOperation) arrayList.get((arrayList.size() - i7) - 1);
            ReactSpan reactSpan = setSpanOperation.what;
            boolean z8 = reactSpan instanceof TextInlineImageSpan;
            if (z8 || (reactSpan instanceof TextInlineViewPlaceholderSpan)) {
                if (z8) {
                    height = ((TextInlineImageSpan) reactSpan).getHeight();
                    reactBaseTextShadowNode.mContainsImages = true;
                } else {
                    TextInlineViewPlaceholderSpan textInlineViewPlaceholderSpan = (TextInlineViewPlaceholderSpan) reactSpan;
                    int height2 = textInlineViewPlaceholderSpan.getHeight();
                    p059e1.a.f(map);
                    ReactShadowNode reactShadowNode = (ReactShadowNode) map.get(Integer.valueOf(textInlineViewPlaceholderSpan.getReactTag()));
                    p059e1.a.f(reactShadowNode);
                    p059e1.a.f(nativeViewHierarchyOptimizer);
                    nativeViewHierarchyOptimizer.handleForceViewToBeNonLayoutOnly(reactShadowNode);
                    reactShadowNode.setLayoutParent(reactBaseTextShadowNode);
                    height = height2;
                }
                if (Float.isNaN(f10) || height > f10) {
                    f10 = height;
                }
            }
            setSpanOperation.execute(spannableStringBuilder, i7);
        }
        reactBaseTextShadowNode.mTextAttributes.setHeightOfTallestInlineViewOrImage(f10);
        ReactTextViewManagerCallback reactTextViewManagerCallback = this.mReactTextViewManagerCallback;
        if (reactTextViewManagerCallback != null) {
            reactTextViewManagerCallback.onPostProcessSpannable(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    public ReactBaseTextShadowNode(@Nullable ReactTextViewManagerCallback reactTextViewManagerCallback) {
        this.mIsColorSet = false;
        this.mIsBackgroundColorSet = false;
        this.mAccessibilityRole = null;
        this.mRole = null;
        this.mNumberOfLines = -1;
        this.mTextAlign = 0;
        this.mTextBreakStrategy = 1;
        this.mHyphenationFrequency = 0;
        this.mJustificationMode = 0;
        this.mTextShadowOffsetDx = 0.0f;
        this.mTextShadowOffsetDy = 0.0f;
        this.mTextShadowRadius = 0.0f;
        this.mTextShadowColor = DEFAULT_TEXT_SHADOW_COLOR;
        this.mIsUnderlineTextDecorationSet = false;
        this.mIsLineThroughTextDecorationSet = false;
        this.mIncludeFontPadding = true;
        this.mAdjustsFontSizeToFit = false;
        this.mMinimumFontScale = 0.0f;
        this.mFontStyle = -1;
        this.mFontWeight = -1;
        this.mFontFamily = null;
        this.mFontFeatureSettings = null;
        this.mContainsImages = false;
        this.mTextAttributes = new TextAttributes();
        this.mReactTextViewManagerCallback = reactTextViewManagerCallback;
    }
}
