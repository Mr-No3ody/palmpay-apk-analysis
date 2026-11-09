package com.facebook.react.views.text;

import H3.e;
import H3.j;
import H3.k;
import M.q;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.internal.span.TextInlineViewPlaceholderSpan;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.facebook.yoga.YogaBaselineFunction;
import com.facebook.yoga.YogaMeasureFunction;
import com.palmpay.lib.apm.launchcounter.util.d;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC1859i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u0000 32\u00020\u0001:\u00013B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0016H\u0007¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010#\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\u001f\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/facebook/react/views/text/ReactTextShadowNode;", "Lcom/facebook/react/views/text/ReactBaseTextShadowNode;", "Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "reactTextViewManagerCallback", "<init>", "(Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)V", "", "initMeasureFunction", "()V", "Landroid/text/Spannable;", ReactTextInputShadowNode.PROP_TEXT, "", "width", "LH3/j;", "widthMode", "Landroid/text/Layout;", "measureSpannedText", "(Landroid/text/Spannable;FLH3/j;)Landroid/text/Layout;", "Lcom/facebook/react/uimanager/NativeViewHierarchyOptimizer;", "nativeViewHierarchyOptimizer", "onBeforeLayout", "(Lcom/facebook/react/uimanager/NativeViewHierarchyOptimizer;)V", "", "isVirtualAnchor", "()Z", "hoistNativeChildren", "markUpdated", "Lcom/facebook/react/uimanager/UIViewOperationQueue;", "uiViewOperationQueue", "onCollectExtraUpdates", "(Lcom/facebook/react/uimanager/UIViewOperationQueue;)V", "shouldNotifyOnTextLayout", "setShouldNotifyOnTextLayout", "(Z)V", "", "Lcom/facebook/react/uimanager/ReactShadowNode;", "calculateLayoutOnChildren", "()Ljava/lang/Iterable;", "preparedSpannableText", "Landroid/text/Spannable;", "Z", "Lcom/facebook/yoga/YogaMeasureFunction;", "textMeasureFunction", "Lcom/facebook/yoga/YogaMeasureFunction;", "Lcom/facebook/yoga/YogaBaselineFunction;", "mTextBaselineFunction", "Lcom/facebook/yoga/YogaBaselineFunction;", "", "getTextAlign", "()I", ViewProps.TEXT_ALIGN, "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactTextShadowNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactTextShadowNode.kt\ncom/facebook/react/views/text/ReactTextShadowNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,350:1\n1#2:351\n*E\n"})
public class ReactTextShadowNode extends ReactBaseTextShadowNode {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final TextPaint textPaintInstance = new TextPaint(1);

    @NotNull
    private final YogaBaselineFunction mTextBaselineFunction;

    @Nullable
    private Spannable preparedSpannableText;
    private boolean shouldNotifyOnTextLayout;

    @NotNull
    private final YogaMeasureFunction textMeasureFunction;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/views/text/ReactTextShadowNode$Companion;", "", "<init>", "()V", "textPaintInstance", "Landroid/text/TextPaint;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ReactTextShadowNode() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final int getTextAlign() {
        int i7 = this.mTextAlign;
        if (getLayoutDirection() == e.RTL) {
            if (i7 == 3) {
                return 5;
            }
            if (i7 == 5) {
                return 3;
            }
        }
        return i7;
    }

    private final void initMeasureFunction() {
        if (isVirtual()) {
            return;
        }
        setMeasureFunction(this.textMeasureFunction);
        setBaselineFunction(this.mTextBaselineFunction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float mTextBaselineFunction$lambda$4(ReactTextShadowNode reactTextShadowNode, k kVar, float f10, float f11) {
        Spannable spannable = reactTextShadowNode.preparedSpannableText;
        if (spannable == null) {
            throw new IllegalStateException("Spannable element has not been prepared in onBeforeLayout");
        }
        Layout layoutMeasureSpannedText = reactTextShadowNode.measureSpannedText(spannable, f10, j.f3659b);
        return layoutMeasureSpannedText.getLineBaseline(layoutMeasureSpannedText.getLineCount() - 1);
    }

    private final Layout measureSpannedText(Spannable text, float width, j widthMode) {
        Layout.Alignment alignment;
        TextPaint textPaint = textPaintInstance;
        textPaint.setTextSize(this.mTextAttributes.getEffectiveFontSize());
        BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(text, textPaint);
        float desiredWidth = metricsIsBoring == null ? Layout.getDesiredWidth(text, textPaint) : Float.NaN;
        boolean z3 = widthMode == j.f3658a || width < 0.0f;
        int textAlign = getTextAlign();
        if (textAlign != 1) {
            alignment = (textAlign == 3 || textAlign != 5) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        if (metricsIsBoring == null && (z3 || (!d.C(desiredWidth) && desiredWidth <= width))) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(text, 0, text.length(), textPaint, (int) Math.ceil(desiredWidth)).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(this.mIncludeFontPadding).setBreakStrategy(this.mTextBreakStrategy).setHyphenationFrequency(this.mHyphenationFrequency);
            Intrinsics.checkNotNullExpressionValue(hyphenationFrequency, "setHyphenationFrequency(...)");
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 26) {
                hyphenationFrequency.setJustificationMode(this.mJustificationMode);
            }
            if (i7 >= 28) {
                hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
            }
            StaticLayout staticLayoutBuild = hyphenationFrequency.build();
            Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
            return staticLayoutBuild;
        }
        if (metricsIsBoring != null && (z3 || metricsIsBoring.width <= width)) {
            BoringLayout boringLayoutMake = BoringLayout.make(text, textPaint, (int) Math.max(metricsIsBoring.width, 0.0d), alignment, 1.0f, 0.0f, metricsIsBoring, this.mIncludeFontPadding);
            Intrinsics.checkNotNullExpressionValue(boringLayoutMake, "make(...)");
            return boringLayoutMake;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 29) {
            width = (float) Math.ceil(width);
        }
        StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(text, 0, text.length(), textPaint, (int) width).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(this.mIncludeFontPadding).setBreakStrategy(this.mTextBreakStrategy).setHyphenationFrequency(this.mHyphenationFrequency);
        Intrinsics.checkNotNullExpressionValue(hyphenationFrequency2, "setHyphenationFrequency(...)");
        if (i10 >= 26) {
            hyphenationFrequency2.setJustificationMode(this.mJustificationMode);
        }
        if (i10 >= 28) {
            hyphenationFrequency2.setUseLineSpacingFromFallbacks(true);
        }
        StaticLayout staticLayoutBuild2 = hyphenationFrequency2.build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild2, "build(...)");
        return staticLayoutBuild2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:59:0x0161  */
    public static final long textMeasureFunction$lambda$2(ReactTextShadowNode reactTextShadowNode, k kVar, float f10, j jVar, float f11, j jVar2) {
        float lineBottom;
        float fCeil = f10;
        Spannable spannable = reactTextShadowNode.preparedSpannableText;
        if (spannable == null) {
            throw new IllegalArgumentException("Spannable element has not been prepared in onBeforeLayout");
        }
        Intrinsics.e(jVar);
        Layout layoutMeasureSpannedText = reactTextShadowNode.measureSpannedText(spannable, fCeil, jVar);
        int i7 = 1;
        int i10 = 0;
        if (reactTextShadowNode.mAdjustsFontSizeToFit) {
            int effectiveFontSize = reactTextShadowNode.mTextAttributes.getEffectiveFontSize();
            int effectiveFontSize2 = reactTextShadowNode.mTextAttributes.getEffectiveFontSize();
            float f12 = effectiveFontSize;
            int iMax = (int) Math.max(reactTextShadowNode.mMinimumFontScale * f12, PixelUtil.toPixelFromDIP(4.0f));
            for (int i11 = -1; effectiveFontSize2 > iMax && ((reactTextShadowNode.mNumberOfLines != i11 && layoutMeasureSpannedText.getLineCount() > reactTextShadowNode.mNumberOfLines) || (jVar2 != j.f3658a && layoutMeasureSpannedText.getHeight() > f11)); i11 = -1) {
                effectiveFontSize2 -= Math.max(i7, (int) PixelUtil.toPixelFromDIP(1.0f));
                float f13 = effectiveFontSize2 / f12;
                q qVarA = AbstractC1859i.a((ReactAbsoluteSizeSpan[]) spannable.getSpans(i10, spannable.length(), ReactAbsoluteSizeSpan.class));
                while (qVarA.hasNext()) {
                    ReactAbsoluteSizeSpan reactAbsoluteSizeSpan = (ReactAbsoluteSizeSpan) qVarA.next();
                    spannable.setSpan(new ReactAbsoluteSizeSpan((int) Math.max(reactAbsoluteSizeSpan.getSize() * f13, iMax)), spannable.getSpanStart(reactAbsoluteSizeSpan), spannable.getSpanEnd(reactAbsoluteSizeSpan), spannable.getSpanFlags(reactAbsoluteSizeSpan));
                    spannable.removeSpan(reactAbsoluteSizeSpan);
                    i7 = i7;
                    effectiveFontSize2 = effectiveFontSize2;
                }
                layoutMeasureSpannedText = reactTextShadowNode.measureSpannedText(spannable, fCeil, jVar);
                i10 = 0;
            }
        }
        if (reactTextShadowNode.shouldNotifyOnTextLayout) {
            ThemedReactContext themedContext = reactTextShadowNode.getThemedContext();
            Intrinsics.e(themedContext);
            WritableArray fontMetrics = FontMetricsUtil.getFontMetrics(spannable, layoutMeasureSpannedText, themedContext);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putArray("lines", fontMetrics);
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
            if (themedContext.hasActiveReactInstance()) {
                ((RCTEventEmitter) themedContext.getJSModule(RCTEventEmitter.class)).receiveEvent(reactTextShadowNode.getReactTag(), "topTextLayout", writableMapCreateMap);
            } else {
                ReactSoftExceptionLogger.logSoftException("ReactTextShadowNode", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
            }
        }
        int i12 = reactTextShadowNode.mNumberOfLines;
        int lineCount = i12 == -1 ? layoutMeasureSpannedText.getLineCount() : (int) Math.min(i12, layoutMeasureSpannedText.getLineCount());
        j jVar3 = j.f3659b;
        j jVar4 = j.f3660c;
        if (jVar != jVar3) {
            float f14 = 0.0f;
            for (int i13 = 0; i13 < lineCount; i13++) {
                float lineWidth = (spannable.length() <= 0 || spannable.charAt(layoutMeasureSpannedText.getLineEnd(i13) + (-1)) != '\n') ? layoutMeasureSpannedText.getLineWidth(i13) : layoutMeasureSpannedText.getLineMax(i13);
                if (lineWidth > f14) {
                    f14 = lineWidth;
                }
            }
            if (jVar != jVar4 || f14 <= fCeil) {
                fCeil = f14;
            }
        }
        if (Build.VERSION.SDK_INT > 29) {
            fCeil = (float) Math.ceil(fCeil);
        }
        if (jVar2 != jVar3) {
            lineBottom = layoutMeasureSpannedText.getLineBottom(lineCount - 1);
            if (jVar2 == jVar4 && lineBottom > f11) {
                lineBottom = f11;
            }
        } else {
            lineBottom = f11;
        }
        return p059e1.a.O(fCeil, lineBottom);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @Nullable
    public Iterable<ReactShadowNode<?>> calculateLayoutOnChildren() {
        Map<Integer, ReactShadowNode> map = this.mInlineViews;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Spannable spannable = this.preparedSpannableText;
        if (spannable == null) {
            throw new IllegalStateException("Spannable element has not been prepared in onBeforeLayout");
        }
        TextInlineViewPlaceholderSpan[] textInlineViewPlaceholderSpanArr = (TextInlineViewPlaceholderSpan[]) spannable.getSpans(0, spannable.length(), TextInlineViewPlaceholderSpan.class);
        ArrayList arrayList = new ArrayList();
        q qVarA = AbstractC1859i.a(textInlineViewPlaceholderSpanArr);
        while (qVarA.hasNext()) {
            TextInlineViewPlaceholderSpan textInlineViewPlaceholderSpan = (TextInlineViewPlaceholderSpan) qVarA.next();
            Map<Integer, ReactShadowNode> map2 = this.mInlineViews;
            ReactShadowNode reactShadowNode = map2 != null ? map2.get(Integer.valueOf(textInlineViewPlaceholderSpan.getReactTag())) : null;
            if (reactShadowNode == null) {
                throw new IllegalStateException("Child is null");
            }
            reactShadowNode.calculateLayout();
            arrayList.add(reactShadowNode);
        }
        return arrayList;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean hoistNativeChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtualAnchor() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void markUpdated() {
        super.markUpdated();
        super.dirty();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onBeforeLayout(@NotNull NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        Intrinsics.checkNotNullParameter(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        this.preparedSpannableText = spannedFromShadowNode(this, null, true, nativeViewHierarchyOptimizer);
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onCollectExtraUpdates(@NotNull UIViewOperationQueue uiViewOperationQueue) {
        Intrinsics.checkNotNullParameter(uiViewOperationQueue, "uiViewOperationQueue");
        super.onCollectExtraUpdates(uiViewOperationQueue);
        Spannable spannable = this.preparedSpannableText;
        if (spannable == null) {
            return;
        }
        uiViewOperationQueue.enqueueUpdateExtraData(getReactTag(), new ReactTextUpdate(spannable, -1, this.mContainsImages, getPadding(4), getPadding(1), getPadding(5), getPadding(3), getTextAlign(), this.mTextBreakStrategy, this.mJustificationMode));
    }

    @ReactProp(name = "onTextLayout")
    public final void setShouldNotifyOnTextLayout(boolean shouldNotifyOnTextLayout) {
        this.shouldNotifyOnTextLayout = shouldNotifyOnTextLayout;
    }

    public /* synthetic */ ReactTextShadowNode(ReactTextViewManagerCallback reactTextViewManagerCallback, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : reactTextViewManagerCallback);
    }

    @JvmOverloads
    public ReactTextShadowNode(@Nullable ReactTextViewManagerCallback reactTextViewManagerCallback) {
        super(reactTextViewManagerCallback);
        this.textMeasureFunction = new a(this);
        this.mTextBaselineFunction = new a(this);
        initMeasureFunction();
    }
}
