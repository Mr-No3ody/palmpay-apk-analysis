package com.facebook.react.views.text;

import android.content.Context;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b(\b'\u0018\u0000*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\fJ\u001d\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\b\u0010J\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0002\b\u0014J\u001d\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\u0017J\u001d\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\b\u001bJ\u001d\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001aH\u0001¢\u0006\u0002\b\u001eJ\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0002\b!J\u001d\u0010\"\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u000bH\u0001¢\u0006\u0002\b$J!\u0010%\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0002\b+J%\u0010,\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u001aH\u0001¢\u0006\u0002\b/J\u001f\u00100\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0002\b2J%\u00103\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u001aH\u0001¢\u0006\u0002\b5J)\u00106\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0004\b7\u00108J\u001d\u00109\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u000bH\u0001¢\u0006\u0002\b;J\u001d\u0010<\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u000bH\u0001¢\u0006\u0002\b>J\u001f\u0010?\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010@\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0002\bA¨\u0006B"}, d2 = {"Lcom/facebook/react/views/text/ReactTextAnchorViewManager;", "C", "Lcom/facebook/react/views/text/ReactBaseTextShadowNode;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/views/text/ReactTextView;", "<init>", "()V", "setAccessible", "", "view", "accessible", "", "setAccessible$ReactAndroid_release", "setNumberOfLines", ViewProps.NUMBER_OF_LINES, "", "setNumberOfLines$ReactAndroid_release", "setEllipsizeMode", ViewProps.ELLIPSIZE_MODE, "", "setEllipsizeMode$ReactAndroid_release", "setAdjustFontSizeToFit", ViewProps.ADJUSTS_FONT_SIZE_TO_FIT, "setAdjustFontSizeToFit$ReactAndroid_release", "setFontSize", ViewProps.FONT_SIZE, "", "setFontSize$ReactAndroid_release", "setLetterSpacing", ViewProps.LETTER_SPACING, "setLetterSpacing$ReactAndroid_release", "setTextAlignVertical", ViewProps.TEXT_ALIGN_VERTICAL, "setTextAlignVertical$ReactAndroid_release", "setSelectable", "isSelectable", "setSelectable$ReactAndroid_release", "setSelectionColor", ViewProps.COLOR, "setSelectionColor$ReactAndroid_release", "(Lcom/facebook/react/views/text/ReactTextView;Ljava/lang/Integer;)V", "setAndroidHyphenationFrequency", "frequency", "setAndroidHyphenationFrequency$ReactAndroid_release", "setBorderRadius", FirebaseAnalytics.Param.INDEX, ViewProps.BORDER_RADIUS, "setBorderRadius$ReactAndroid_release", "setBorderStyle", "borderStyle", "setBorderStyle$ReactAndroid_release", "setBorderWidth", "width", "setBorderWidth$ReactAndroid_release", "setBorderColor", "setBorderColor$ReactAndroid_release", "(Lcom/facebook/react/views/text/ReactTextView;ILjava/lang/Integer;)V", "setIncludeFontPadding", "includepad", "setIncludeFontPadding$ReactAndroid_release", "setDisabled", "disabled", "setDisabled$ReactAndroid_release", "setDataDetectorType", "type", "setDataDetectorType$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@UnstableReactNativeAPI
public abstract class ReactTextAnchorViewManager<C extends ReactBaseTextShadowNode> extends BaseViewManager<ReactTextView, C> {
    @ReactProp(name = "accessible")
    public final void setAccessible$ReactAndroid_release(@NotNull ReactTextView view, boolean accessible) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFocusable(accessible);
    }

    @ReactProp(name = ViewProps.ADJUSTS_FONT_SIZE_TO_FIT)
    public final void setAdjustFontSizeToFit$ReactAndroid_release(@NotNull ReactTextView view, boolean adjustsFontSizeToFit) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setAdjustFontSizeToFit(adjustsFontSizeToFit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r5.equals(com.facebook.react.uimanager.ViewProps.NONE) == false) goto L21;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "android_hyphenationFrequency")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setAndroidHyphenationFrequency$ReactAndroid_release(@org.jetbrains.annotations.NotNull com.facebook.react.views.text.ReactTextView r4, @org.jetbrains.annotations.Nullable java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            if (r5 == 0) goto L50
            int r1 = r5.hashCode()
            r2 = -1039745817(0xffffffffc206bce7, float:-33.684475)
            if (r1 == r2) goto L34
            r2 = 3154575(0x30228f, float:4.420501E-39)
            if (r1 == r2) goto L26
            r2 = 3387192(0x33af38, float:4.746467E-39)
            if (r1 == r2) goto L1d
            goto L3c
        L1d:
            java.lang.String r1 = "none"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L50
            goto L3c
        L26:
            java.lang.String r1 = "full"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L2f
            goto L3c
        L2f:
            r5 = 2
            r4.setHyphenationFrequency(r5)
            return
        L34:
            java.lang.String r1 = "normal"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L4b
        L3c:
            java.lang.String r1 = "Invalid android_hyphenationFrequency: "
            java.lang.String r5 = r1.concat(r5)
            java.lang.String r1 = "ReactNative"
            p229p2.a.v(r1, r5)
            r4.setHyphenationFrequency(r0)
            return
        L4b:
            r5 = 1
            r4.setHyphenationFrequency(r5)
            return
        L50:
            r4.setHyphenationFrequency(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextAnchorViewManager.setAndroidHyphenationFrequency$ReactAndroid_release(com.facebook.react.views.text.ReactTextView, java.lang.String):void");
    }

    @ReactPropGroup(customType = "Color", names = {ViewProps.BORDER_COLOR, ViewProps.BORDER_LEFT_COLOR, ViewProps.BORDER_RIGHT_COLOR, ViewProps.BORDER_TOP_COLOR, ViewProps.BORDER_BOTTOM_COLOR})
    public final void setBorderColor$ReactAndroid_release(@NotNull ReactTextView view, int index, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.values()[index], color);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_RADIUS, ViewProps.BORDER_TOP_LEFT_RADIUS, ViewProps.BORDER_TOP_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_LEFT_RADIUS})
    public final void setBorderRadius$ReactAndroid_release(@NotNull ReactTextView view, int index, float borderRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderRadius(view, BorderRadiusProp.values()[index], Float.isNaN(borderRadius) ? null : new LengthPercentage(borderRadius, LengthPercentageType.POINT));
    }

    @ReactProp(name = "borderStyle")
    public final void setBorderStyle$ReactAndroid_release(@NotNull ReactTextView view, @Nullable String borderStyle) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderStyle(view, borderStyle == null ? null : BorderStyle.INSTANCE.fromString(borderStyle));
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH, ViewProps.BORDER_START_WIDTH, ViewProps.BORDER_END_WIDTH})
    public final void setBorderWidth$ReactAndroid_release(@NotNull ReactTextView view, int index, float width) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderWidth(view, LogicalEdge.values()[index], Float.valueOf(width));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @ReactProp(name = "dataDetectorType")
    public final void setDataDetectorType$ReactAndroid_release(@NotNull ReactTextView view, @Nullable String type) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (type != null) {
            switch (type.hashCode()) {
                case -1192969641:
                    if (type.equals("phoneNumber")) {
                        view.setLinkifyMask(4);
                        return;
                    }
                    break;
                case 96673:
                    if (type.equals("all")) {
                        view.setLinkifyMask(15);
                        return;
                    }
                    break;
                case 3321850:
                    if (type.equals("link")) {
                        view.setLinkifyMask(1);
                        return;
                    }
                    break;
                case 96619420:
                    if (type.equals(Scopes.EMAIL)) {
                        view.setLinkifyMask(2);
                        return;
                    }
                    break;
            }
        }
        view.setLinkifyMask(0);
    }

    @ReactProp(defaultBoolean = false, name = "disabled")
    public final void setDisabled$ReactAndroid_release(@NotNull ReactTextView view, boolean disabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEnabled(!disabled);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r3.equals("tail") == false) goto L22;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @com.facebook.react.uimanager.annotations.ReactProp(name = com.facebook.react.uimanager.ViewProps.ELLIPSIZE_MODE)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setEllipsizeMode$ReactAndroid_release(@org.jetbrains.annotations.NotNull com.facebook.react.views.text.ReactTextView r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r3 == 0) goto L56
            int r0 = r3.hashCode()
            switch(r0) {
                case -1074341483: goto L37;
                case 3056464: goto L29;
                case 3198432: goto L1a;
                case 3552336: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L3f
        L10:
            java.lang.String r0 = "tail"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L56
            goto L3f
        L1a:
            java.lang.String r0 = "head"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L23
            goto L3f
        L23:
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.START
            r2.setEllipsizeLocation(r3)
            return
        L29:
            java.lang.String r0 = "clip"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L32
            goto L3f
        L32:
            r3 = 0
            r2.setEllipsizeLocation(r3)
            return
        L37:
            java.lang.String r0 = "middle"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L50
        L3f:
            java.lang.String r0 = "Invalid ellipsizeMode: "
            java.lang.String r3 = r0.concat(r3)
            java.lang.String r0 = "ReactNative"
            p229p2.a.v(r0, r3)
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.END
            r2.setEllipsizeLocation(r3)
            return
        L50:
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.MIDDLE
            r2.setEllipsizeLocation(r3)
            return
        L56:
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.END
            r2.setEllipsizeLocation(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextAnchorViewManager.setEllipsizeMode$ReactAndroid_release(com.facebook.react.views.text.ReactTextView, java.lang.String):void");
    }

    @ReactProp(name = ViewProps.FONT_SIZE)
    public final void setFontSize$ReactAndroid_release(@NotNull ReactTextView view, float fontSize) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFontSize(fontSize);
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.INCLUDE_FONT_PADDING)
    public final void setIncludeFontPadding$ReactAndroid_release(@NotNull ReactTextView view, boolean includepad) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setIncludeFontPadding(includepad);
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.LETTER_SPACING)
    public final void setLetterSpacing$ReactAndroid_release(@NotNull ReactTextView view, float letterSpacing) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setLetterSpacing(letterSpacing);
    }

    @ReactProp(defaultInt = Integer.MAX_VALUE, name = ViewProps.NUMBER_OF_LINES)
    public final void setNumberOfLines$ReactAndroid_release(@NotNull ReactTextView view, int numberOfLines) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setNumberOfLines(numberOfLines);
    }

    @ReactProp(name = "selectable")
    public final void setSelectable$ReactAndroid_release(@NotNull ReactTextView view, boolean isSelectable) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTextIsSelectable(isSelectable);
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public final void setSelectionColor$ReactAndroid_release(@NotNull ReactTextView view, @Nullable Integer color) {
        int defaultTextColorHighlight;
        Intrinsics.checkNotNullParameter(view, "view");
        if (color != null) {
            defaultTextColorHighlight = color.intValue();
        } else {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            defaultTextColorHighlight = DefaultStyleValuesUtil.getDefaultTextColorHighlight(context);
        }
        view.setHighlightColor(defaultTextColorHighlight);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r4.equals("auto") == false) goto L22;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @com.facebook.react.uimanager.annotations.ReactProp(name = com.facebook.react.uimanager.ViewProps.TEXT_ALIGN_VERTICAL)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setTextAlignVertical$ReactAndroid_release(@org.jetbrains.annotations.NotNull com.facebook.react.views.text.ReactTextView r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            if (r4 == 0) goto L56
            int r1 = r4.hashCode()
            switch(r1) {
                case -1383228885: goto L39;
                case -1364013995: goto L2a;
                case 115029: goto L1a;
                case 3005871: goto L11;
                default: goto L10;
            }
        L10:
            goto L41
        L11:
            java.lang.String r1 = "auto"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L56
            goto L41
        L1a:
            java.lang.String r1 = "top"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L24
            goto L41
        L24:
            r4 = 48
            r3.setGravityVertical(r4)
            return
        L2a:
            java.lang.String r1 = "center"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L33
            goto L41
        L33:
            r4 = 16
            r3.setGravityVertical(r4)
            return
        L39:
            java.lang.String r1 = "bottom"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L50
        L41:
            java.lang.String r1 = "Invalid textAlignVertical: "
            java.lang.String r4 = r1.concat(r4)
            java.lang.String r1 = "ReactNative"
            p229p2.a.v(r1, r4)
            r3.setGravityVertical(r0)
            return
        L50:
            r4 = 80
            r3.setGravityVertical(r4)
            return
        L56:
            r3.setGravityVertical(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextAnchorViewManager.setTextAlignVertical$ReactAndroid_release(com.facebook.react.views.text.ReactTextView, java.lang.String):void");
    }
}
