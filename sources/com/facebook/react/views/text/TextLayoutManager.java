package com.facebook.react.views.text;

import H3.j;
import M.q;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.text.internal.span.CustomLetterSpacingSpan;
import com.facebook.react.views.text.internal.span.CustomLineHeightSpan;
import com.facebook.react.views.text.internal.span.CustomStyleSpan;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.internal.span.ReactBackgroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactClickableSpan;
import com.facebook.react.views.text.internal.span.ReactForegroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactOpacitySpan;
import com.facebook.react.views.text.internal.span.ReactStrikethroughSpan;
import com.facebook.react.views.text.internal.span.ReactTagSpan;
import com.facebook.react.views.text.internal.span.ReactTextPaintHolderSpan;
import com.facebook.react.views.text.internal.span.ReactUnderlineSpan;
import com.facebook.react.views.text.internal.span.SetSpanOperation;
import com.facebook.react.views.text.internal.span.ShadowStyleSpan;
import com.facebook.react.views.text.internal.span.TextInlineViewPlaceholderSpan;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC1859i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0004\u0098\u0001\u0099\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J)\u0010#\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$Js\u00108\u001a\u0002072\u0006\u0010%\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\n2\b\u00103\u001a\u0004\u0018\u0001022\u0006\u00104\u001a\u00020\n2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b8\u00109J'\u0010<\u001a\u00020\u001c2\u0006\u00106\u001a\u0002052\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u0002052\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u0002052\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b@\u0010?JQ\u0010D\u001a\u0002072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010B\u001a\u00020(2\u0006\u0010C\u001a\u00020*2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\bD\u0010EJO\u00108\u001a\u0002072\u0006\u0010%\u001a\u00020\r2\u0006\u00106\u001a\u0002052\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010B\u001a\u00020(2\u0006\u0010C\u001a\u00020*H\u0002¢\u0006\u0004\b8\u0010FJQ\u0010I\u001a\u00020H2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020G2\u0006\u0010A\u001a\u00020G2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010B\u001a\u00020(2\u0006\u0010C\u001a\u00020*2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0004\bI\u0010JJw\u0010M\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\r2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010B\u001a\u00020(2\u0006\u0010C\u001a\u00020*2\u0006\u0010K\u001a\u00020(2\u0006\u0010L\u001a\u00020\n2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\n2\u0006\u00106\u001a\u000205H\u0007¢\u0006\u0004\bM\u0010NJ[\u0010R\u001a\u00020Q2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010B\u001a\u00020(2\u0006\u0010C\u001a\u00020*2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010P\u001a\u0004\u0018\u00010OH\u0007¢\u0006\u0004\bR\u0010SJ7\u0010U\u001a\u00020O2\u0006\u0010T\u001a\u00020H2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010B\u001a\u00020(2\u0006\u0010C\u001a\u00020*H\u0007¢\u0006\u0004\bU\u0010VJ7\u0010Y\u001a\u00020(2\u0006\u0010W\u001a\u0002072\u0006\u0010A\u001a\u00020G2\u0006\u0010B\u001a\u00020(2\u0006\u0010X\u001a\u00020*2\u0006\u0010L\u001a\u00020\nH\u0002¢\u0006\u0004\bY\u0010ZJ\u001f\u0010[\u001a\u00020\n2\u0006\u0010W\u001a\u0002072\u0006\u0010L\u001a\u00020\nH\u0002¢\u0006\u0004\b[\u0010\\J7\u0010_\u001a\u00020(2\u0006\u0010W\u001a\u0002072\u0006\u0010%\u001a\u00020]2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010^\u001a\u00020\nH\u0002¢\u0006\u0004\b_\u0010`J/\u0010a\u001a\u00020(2\u0006\u0010W\u001a\u0002072\u0006\u0010B\u001a\u00020(2\u0006\u0010C\u001a\u00020*2\u0006\u0010^\u001a\u00020\nH\u0002¢\u0006\u0004\ba\u0010bJG\u0010h\u001a\u00020\n2\u0006\u0010W\u001a\u0002072\u0006\u0010%\u001a\u00020]2\u0006\u0010c\u001a\u00020(2\u0006\u0010^\u001a\u00020\n2\u0006\u0010d\u001a\u00020\n2\u0006\u0010e\u001a\u00020(2\u0006\u0010g\u001a\u00020fH\u0002¢\u0006\u0004\bh\u0010iJA\u0010k\u001a\u00020j2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(2\u0006\u0010B\u001a\u00020(2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0004\bk\u0010lJ!\u0010m\u001a\u0004\u0018\u00010&2\u0006\u0010%\u001a\u00020\r2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\bm\u0010nJ\u001d\u0010q\u001a\u00020\u001c2\u0006\u0010o\u001a\u00020\n2\u0006\u0010p\u001a\u00020\r¢\u0006\u0004\bq\u0010rJ\u0015\u0010s\u001a\u00020\u001c2\u0006\u0010o\u001a\u00020\n¢\u0006\u0004\bs\u0010tJ\u0015\u0010u\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bu\u0010vJ'\u0010w\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\bw\u0010$R\u0014\u0010x\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010z\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\bz\u0010yR\u0014\u0010{\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b{\u0010yR\u0014\u0010|\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b|\u0010yR\u0014\u0010}\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b}\u0010yR\u0014\u0010~\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b~\u0010yR\u0014\u0010\u007f\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u007f\u0010yR\u0016\u0010\u0080\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010yR\u0016\u0010\u0081\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010yR\u0016\u0010\u0082\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010yR\u0016\u0010\u0083\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010yR\u0016\u0010\u0084\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010yR\u0016\u0010\u0085\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010yR\u0016\u0010\u0086\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010yR\u0016\u0010\u0087\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010yR\u0016\u0010\u0088\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010yR\u0016\u0010\u0089\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010yR\u0016\u0010\u008a\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010yR\u0016\u0010\u008b\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010yR\u0016\u0010\u008c\u0001\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010yR\u0017\u0010\u008d\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001e\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u0002050\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0017\u0010\u0092\u0001\u001a\u00020,8\u0002X\u0082T¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0017\u0010\u0094\u0001\u001a\u00020,8\u0002X\u0082T¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0093\u0001R$\u0010\u0096\u0001\u001a\u000f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001¨\u0006\u009a\u0001"}, d2 = {"Lcom/facebook/react/views/text/TextLayoutManager;", "", "<init>", "()V", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "attributedString", "", "getTextAlignmentAttr", "(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Ljava/lang/String;", "alignmentAttr", "", "getTextJustificationMode", "(Ljava/lang/String;)I", "Landroid/text/Spannable;", "spanned", "Landroid/text/Layout$Alignment;", "getTextAlignment", "(Lcom/facebook/react/common/mapbuffer/MapBuffer;Landroid/text/Spannable;Ljava/lang/String;)Landroid/text/Layout$Alignment;", "getTextGravity", "(Lcom/facebook/react/common/mapbuffer/MapBuffer;Landroid/text/Spannable;)I", "Landroid/content/Context;", "context", "fragments", "Landroid/text/SpannableStringBuilder;", "sb", "", "Lcom/facebook/react/views/text/internal/span/SetSpanOperation;", "ops", "", "buildSpannableFromFragments", "(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V", "buildSpannableFromFragmentsOptimized", "(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;)Landroid/text/Spannable;", "Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "reactTextViewManagerCallback", "createSpannableFromAttributedString", "(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Spannable;", ReactTextInputShadowNode.PROP_TEXT, "Landroid/text/BoringLayout$Metrics;", "boring", "", "width", "LH3/j;", "widthYogaMeasureMode", "", ViewProps.INCLUDE_FONT_PADDING, ViewProps.TEXT_BREAK_STRATEGY, "hyphenationFrequency", "alignment", "justificationMode", "Landroid/text/TextUtils$TruncateAt;", ViewProps.ELLIPSIZE_MODE, "maxNumberOfLines", "Landroid/text/TextPaint;", "paint", "Landroid/text/Layout;", "createLayout", "(Landroid/text/Spannable;Landroid/text/BoringLayout$Metrics;FLH3/j;ZIILandroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;ILandroid/text/TextPaint;)Landroid/text/Layout;", "Lcom/facebook/react/views/text/TextAttributeProps;", "baseTextAttributes", "updateTextPaint", "(Landroid/text/TextPaint;Lcom/facebook/react/views/text/TextAttributeProps;Landroid/content/Context;)V", "scratchPaintWithAttributes", "(Lcom/facebook/react/views/text/TextAttributeProps;Landroid/content/Context;)Landroid/text/TextPaint;", "newPaintWithAttributes", "paragraphAttributes", "height", "heightYogaMeasureMode", "createLayoutForMeasurement", "(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLH3/j;FLH3/j;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Layout;", "(Landroid/text/Spannable;Landroid/text/TextPaint;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLH3/j;FLH3/j;)Landroid/text/Layout;", "Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;", "Lcom/facebook/react/views/text/PreparedLayout;", "createPreparedLayout", "(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;FLH3/j;FLH3/j;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Lcom/facebook/react/views/text/PreparedLayout;", "minimumFontSizeAttr", "maximumNumberOfLines", "adjustSpannableFontToFit", "(Landroid/text/Spannable;FLH3/j;FLH3/j;FIZIILandroid/text/Layout$Alignment;ILandroid/text/TextPaint;)V", "", "attachmentsPositions", "", "measureText", "(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLH3/j;FLH3/j;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;[F)J", "preparedLayout", "measurePreparedLayout", "(Lcom/facebook/react/views/text/PreparedLayout;FLH3/j;FLH3/j;)[F", "layout", "heightMeasureMode", "getVerticalOffset", "(Landroid/text/Layout;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;FLH3/j;I)F", "calculateLineCount", "(Landroid/text/Layout;I)I", "Landroid/text/Spanned;", "calculatedLineCount", "calculateWidth", "(Landroid/text/Layout;Landroid/text/Spanned;FLH3/j;I)F", "calculateHeight", "(Landroid/text/Layout;FLH3/j;I)F", "calculatedWidth", "i", "verticalOffset", "Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;", "metrics", "nextAttachmentMetrics", "(Landroid/text/Layout;Landroid/text/Spanned;FIIFLcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;)I", "Lcom/facebook/react/bridge/WritableArray;", "measureLines", "(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FFLcom/facebook/react/views/text/ReactTextViewManagerCallback;)Lcom/facebook/react/bridge/WritableArray;", "isBoring", "(Landroid/text/Spannable;Landroid/text/TextPaint;)Landroid/text/BoringLayout$Metrics;", "reactTag", "sp", "setCachedSpannableForTag", "(ILandroid/text/Spannable;)V", "deleteCachedSpannableForTag", "(I)V", "isRTL", "(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Z", "getOrCreateSpannableForText", "AS_KEY_HASH", "I", "AS_KEY_STRING", "AS_KEY_FRAGMENTS", "AS_KEY_CACHE_ID", "AS_KEY_BASE_ATTRIBUTES", "FR_KEY_STRING", "FR_KEY_REACT_TAG", "FR_KEY_IS_ATTACHMENT", "FR_KEY_WIDTH", "FR_KEY_HEIGHT", "FR_KEY_TEXT_ATTRIBUTES", "PA_KEY_MAX_NUMBER_OF_LINES", "PA_KEY_ELLIPSIZE_MODE", "PA_KEY_TEXT_BREAK_STRATEGY", "PA_KEY_ADJUST_FONT_SIZE_TO_FIT", "PA_KEY_INCLUDE_FONT_PADDING", "PA_KEY_HYPHENATION_FREQUENCY", "PA_KEY_MINIMUM_FONT_SIZE", "PA_KEY_MAXIMUM_FONT_SIZE", "PA_KEY_TEXT_ALIGN_VERTICAL", "TAG", "Ljava/lang/String;", "Ljava/lang/ThreadLocal;", "textPaintInstance", "Ljava/lang/ThreadLocal;", "DEFAULT_INCLUDE_FONT_PADDING", "Z", "DEFAULT_ADJUST_FONT_SIZE_TO_FIT", "Ljava/util/concurrent/ConcurrentHashMap;", "tagToSpannableCache", "Ljava/util/concurrent/ConcurrentHashMap;", "FragmentAttributes", "AttachmentMetrics", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextLayoutManager {
    public static final int AS_KEY_BASE_ATTRIBUTES = 4;
    public static final int AS_KEY_CACHE_ID = 3;
    public static final int AS_KEY_FRAGMENTS = 2;
    public static final int AS_KEY_HASH = 0;
    public static final int AS_KEY_STRING = 1;
    private static final boolean DEFAULT_ADJUST_FONT_SIZE_TO_FIT = false;
    private static final boolean DEFAULT_INCLUDE_FONT_PADDING = true;
    public static final int FR_KEY_HEIGHT = 4;
    public static final int FR_KEY_IS_ATTACHMENT = 2;
    public static final int FR_KEY_REACT_TAG = 1;
    public static final int FR_KEY_STRING = 0;
    public static final int FR_KEY_TEXT_ATTRIBUTES = 5;
    public static final int FR_KEY_WIDTH = 3;

    @NotNull
    public static final TextLayoutManager INSTANCE = new TextLayoutManager();
    public static final int PA_KEY_ADJUST_FONT_SIZE_TO_FIT = 3;
    public static final int PA_KEY_ELLIPSIZE_MODE = 1;
    public static final int PA_KEY_HYPHENATION_FREQUENCY = 5;
    public static final int PA_KEY_INCLUDE_FONT_PADDING = 4;
    public static final int PA_KEY_MAXIMUM_FONT_SIZE = 7;
    public static final int PA_KEY_MAX_NUMBER_OF_LINES = 0;
    public static final int PA_KEY_MINIMUM_FONT_SIZE = 6;
    public static final int PA_KEY_TEXT_ALIGN_VERTICAL = 8;
    public static final int PA_KEY_TEXT_BREAK_STRATEGY = 2;

    @NotNull
    private static final String TAG;

    @NotNull
    private static final ConcurrentHashMap<Integer, Spannable> tagToSpannableCache;

    @NotNull
    private static final ThreadLocal<TextPaint> textPaintInstance;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/facebook/react/views/text/TextLayoutManager$AttachmentMetrics;", "", "<init>", "()V", "wasFound", "", "getWasFound", "()Z", "setWasFound", "(Z)V", ViewProps.TOP, "", "getTop", "()F", "setTop", "(F)V", ViewProps.LEFT, "getLeft", "setLeft", "width", "getWidth", "setWidth", "height", "getHeight", "setHeight", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AttachmentMetrics {
        private float height;
        private float left;
        private float top;
        private boolean wasFound;
        private float width;

        public final float getHeight() {
            return this.height;
        }

        public final float getLeft() {
            return this.left;
        }

        public final float getTop() {
            return this.top;
        }

        public final boolean getWasFound() {
            return this.wasFound;
        }

        public final float getWidth() {
            return this.width;
        }

        public final void setHeight(float f10) {
            this.height = f10;
        }

        public final void setLeft(float f10) {
            this.left = f10;
        }

        public final void setTop(float f10) {
            this.top = f10;
        }

        public final void setWasFound(boolean z3) {
            this.wasFound = z3;
        }

        public final void setWidth(float f10) {
            this.width = f10;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/views/text/TextLayoutManager$FragmentAttributes;", "", "props", "Lcom/facebook/react/views/text/TextAttributeProps;", "length", "", "reactTag", "isAttachment", "", "width", "", "height", "<init>", "(Lcom/facebook/react/views/text/TextAttributeProps;IIZDD)V", "getProps", "()Lcom/facebook/react/views/text/TextAttributeProps;", "getLength", "()I", "getReactTag", "()Z", "getWidth", "()D", "getHeight", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FragmentAttributes {
        private final double height;
        private final boolean isAttachment;
        private final int length;

        @NotNull
        private final TextAttributeProps props;
        private final int reactTag;
        private final double width;

        public FragmentAttributes(@NotNull TextAttributeProps props, int i7, int i10, boolean z3, double d2, double d10) {
            Intrinsics.checkNotNullParameter(props, "props");
            this.props = props;
            this.length = i7;
            this.reactTag = i10;
            this.isAttachment = z3;
            this.width = d2;
            this.height = d10;
        }

        public final double getHeight() {
            return this.height;
        }

        public final int getLength() {
            return this.length;
        }

        @NotNull
        public final TextAttributeProps getProps() {
            return this.props;
        }

        public final int getReactTag() {
            return this.reactTag;
        }

        public final double getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: isAttachment, reason: from getter */
        public final boolean getIsAttachment() {
            return this.isAttachment;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[j.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("TextLayoutManager", "getSimpleName(...)");
        TAG = "TextLayoutManager";
        textPaintInstance = new ThreadLocal<TextPaint>() { // from class: com.facebook.react.views.text.TextLayoutManager$textPaintInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.lang.ThreadLocal
            public TextPaint initialValue() {
                return new TextPaint(1);
            }
        };
        tagToSpannableCache = new ConcurrentHashMap<>();
    }

    private TextLayoutManager() {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @JvmStatic
    public static final void adjustSpannableFontToFit(@NotNull Spannable text, float width, @NotNull j widthYogaMeasureMode, float height, @NotNull j heightYogaMeasureMode, float minimumFontSizeAttr, int maximumNumberOfLines, boolean includeFontPadding, int textBreakStrategy, int hyphenationFrequency, @NotNull Layout.Alignment alignment, int justificationMode, @NotNull TextPaint paint) {
        Spannable text2 = text;
        TextPaint paint2 = paint;
        Intrinsics.checkNotNullParameter(text2, "text");
        Intrinsics.checkNotNullParameter(widthYogaMeasureMode, "widthYogaMeasureMode");
        Intrinsics.checkNotNullParameter(heightYogaMeasureMode, "heightYogaMeasureMode");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(paint2, "paint");
        TextLayoutManager textLayoutManager = INSTANCE;
        BoringLayout.Metrics metricsIsBoring = textLayoutManager.isBoring(text2, paint2);
        Layout layoutCreateLayout = textLayoutManager.createLayout(text2, metricsIsBoring, width, widthYogaMeasureMode, includeFontPadding, textBreakStrategy, hyphenationFrequency, alignment, justificationMode, null, -1, paint2);
        int iDpToPx = (int) (Float.isNaN(minimumFontSizeAttr) ? PixelUtil.INSTANCE.dpToPx(4) : minimumFontSizeAttr);
        int i7 = 0;
        Class<ReactAbsoluteSizeSpan> cls = ReactAbsoluteSizeSpan.class;
        q qVarA = AbstractC1859i.a((ReactAbsoluteSizeSpan[]) text2.getSpans(0, text2.length(), cls));
        int iMax = iDpToPx;
        while (qVarA.hasNext()) {
            iMax = Math.max(iMax, ((ReactAbsoluteSizeSpan) qVarA.next()).getSize());
        }
        int i10 = iMax;
        while (i10 > iDpToPx) {
            if ((maximumNumberOfLines == -1 || maximumNumberOfLines == 0 || layoutCreateLayout.getLineCount() <= maximumNumberOfLines) && ((heightYogaMeasureMode == j.f3658a || layoutCreateLayout.getHeight() <= height) && (text2.length() != 1 || layoutCreateLayout.getLineWidth(i7) <= width))) {
                return;
            }
            int iMax2 = i10 - Math.max(1, (int) PixelUtil.INSTANCE.dpToPx(1));
            float f10 = iMax2 / iMax;
            paint2.setTextSize(Math.max((int) (paint2.getTextSize() * f10), iDpToPx));
            q qVarA2 = AbstractC1859i.a((ReactAbsoluteSizeSpan[]) text2.getSpans(i7, text2.length(), cls));
            while (qVarA2.hasNext()) {
                ReactAbsoluteSizeSpan reactAbsoluteSizeSpan = (ReactAbsoluteSizeSpan) qVarA2.next();
                text2.setSpan(new ReactAbsoluteSizeSpan(Math.max((int) (reactAbsoluteSizeSpan.getSize() * f10), iDpToPx)), text2.getSpanStart(reactAbsoluteSizeSpan), text2.getSpanEnd(reactAbsoluteSizeSpan), text2.getSpanFlags(reactAbsoluteSizeSpan));
                text2.removeSpan(reactAbsoluteSizeSpan);
            }
            if (metricsIsBoring != null) {
                metricsIsBoring = INSTANCE.isBoring(text2, paint2);
            }
            layoutCreateLayout = INSTANCE.createLayout(text2, metricsIsBoring, width, widthYogaMeasureMode, includeFontPadding, textBreakStrategy, hyphenationFrequency, alignment, justificationMode, null, -1, paint2);
            text2 = text;
            paint2 = paint;
            i10 = iMax2;
            i7 = 0;
            cls = cls;
            iMax = iMax;
        }
    }

    private final void buildSpannableFromFragments(Context context, MapBuffer fragments, SpannableStringBuilder sb2, List<SetSpanOperation> ops) {
        int count = fragments.getCount();
        int i7 = 0;
        int i10 = 0;
        while (i10 < count) {
            MapBuffer mapBuffer = fragments.getMapBuffer(i10);
            int length = sb2.length();
            TextAttributeProps textAttributePropsFromMapBuffer = TextAttributeProps.fromMapBuffer(mapBuffer.getMapBuffer(5));
            Intrinsics.checkNotNullExpressionValue(textAttributePropsFromMapBuffer, "fromMapBuffer(...)");
            sb2.append((CharSequence) TextTransform.INSTANCE.apply(mapBuffer.getString(i7), textAttributePropsFromMapBuffer.mTextTransform));
            int length2 = sb2.length();
            int i11 = mapBuffer.contains(1) ? mapBuffer.getInt(1) : -1;
            if (mapBuffer.contains(2) && mapBuffer.getBoolean(2)) {
                ops.add(new SetSpanOperation(sb2.length() - 1, sb2.length(), new TextInlineViewPlaceholderSpan(i11, (int) PixelUtil.toPixelFromSP(mapBuffer.getDouble(3)), (int) PixelUtil.toPixelFromSP(mapBuffer.getDouble(4)))));
            } else {
                if (length2 >= length) {
                    ReactAccessibilityDelegate.Role role = textAttributePropsFromMapBuffer.mRole;
                    if (role == null ? textAttributePropsFromMapBuffer.mAccessibilityRole == ReactAccessibilityDelegate.AccessibilityRole.LINK : role == ReactAccessibilityDelegate.Role.LINK) {
                        ops.add(new SetSpanOperation(length, length2, new ReactClickableSpan(i11)));
                    }
                    if (textAttributePropsFromMapBuffer.mIsColorSet) {
                        ops.add(new SetSpanOperation(length, length2, new ReactForegroundColorSpan(textAttributePropsFromMapBuffer.mColor)));
                    }
                    if (textAttributePropsFromMapBuffer.mIsBackgroundColorSet) {
                        ops.add(new SetSpanOperation(length, length2, new ReactBackgroundColorSpan(textAttributePropsFromMapBuffer.mBackgroundColor)));
                    }
                    if (!Float.isNaN(textAttributePropsFromMapBuffer.getOpacity())) {
                        ops.add(new SetSpanOperation(length, length2, new ReactOpacitySpan(textAttributePropsFromMapBuffer.getOpacity())));
                    }
                    if (!Float.isNaN(textAttributePropsFromMapBuffer.getLetterSpacing())) {
                        ops.add(new SetSpanOperation(length, length2, new CustomLetterSpacingSpan(textAttributePropsFromMapBuffer.getLetterSpacing())));
                    }
                    ops.add(new SetSpanOperation(length, length2, new ReactAbsoluteSizeSpan(textAttributePropsFromMapBuffer.mFontSize)));
                    if (textAttributePropsFromMapBuffer.mFontStyle != -1 || textAttributePropsFromMapBuffer.mFontWeight != -1 || textAttributePropsFromMapBuffer.mFontFamily != null) {
                        int i12 = textAttributePropsFromMapBuffer.mFontStyle;
                        int i13 = textAttributePropsFromMapBuffer.mFontWeight;
                        String str = textAttributePropsFromMapBuffer.mFontFeatureSettings;
                        String str2 = textAttributePropsFromMapBuffer.mFontFamily;
                        AssetManager assets = context.getAssets();
                        Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
                        ops.add(new SetSpanOperation(length, length2, new CustomStyleSpan(i12, i13, str, str2, assets)));
                    }
                    if (textAttributePropsFromMapBuffer.mIsUnderlineTextDecorationSet) {
                        ops.add(new SetSpanOperation(length, length2, new ReactUnderlineSpan()));
                    }
                    if (textAttributePropsFromMapBuffer.mIsLineThroughTextDecorationSet) {
                        ops.add(new SetSpanOperation(length, length2, new ReactStrikethroughSpan()));
                    }
                    if ((textAttributePropsFromMapBuffer.mTextShadowOffsetDx != 0.0f || textAttributePropsFromMapBuffer.mTextShadowOffsetDy != 0.0f || textAttributePropsFromMapBuffer.mTextShadowRadius != 0.0f) && Color.alpha(textAttributePropsFromMapBuffer.mTextShadowColor) != 0) {
                        ops.add(new SetSpanOperation(length, length2, new ShadowStyleSpan(textAttributePropsFromMapBuffer.mTextShadowOffsetDx, textAttributePropsFromMapBuffer.mTextShadowOffsetDy, textAttributePropsFromMapBuffer.mTextShadowRadius, textAttributePropsFromMapBuffer.mTextShadowColor)));
                    }
                    if (!Float.isNaN(textAttributePropsFromMapBuffer.getEffectiveLineHeight())) {
                        ops.add(new SetSpanOperation(length, length2, new CustomLineHeightSpan(textAttributePropsFromMapBuffer.getEffectiveLineHeight())));
                    }
                    ops.add(new SetSpanOperation(length, length2, new ReactTagSpan(i11)));
                }
                i10++;
                count = count;
                i7 = 0;
            }
            count = count;
            i10++;
            count = count;
            i7 = 0;
        }
    }

    private final Spannable buildSpannableFromFragmentsOptimized(Context context, MapBuffer fragments) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList(fragments.getCount());
        int count = fragments.getCount();
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= count) {
                break;
            }
            MapBuffer mapBuffer = fragments.getMapBuffer(i10);
            TextAttributeProps textAttributePropsFromMapBuffer = TextAttributeProps.fromMapBuffer(mapBuffer.getMapBuffer(5));
            Intrinsics.checkNotNullExpressionValue(textAttributePropsFromMapBuffer, "fromMapBuffer(...)");
            String strApply = TextTransform.INSTANCE.apply(mapBuffer.getString(0), textAttributePropsFromMapBuffer.getTextTransform());
            sb2.append(strApply);
            int length = strApply.length();
            int i11 = mapBuffer.contains(1) ? mapBuffer.getInt(1) : -1;
            boolean z3 = mapBuffer.contains(2) && mapBuffer.getBoolean(2);
            double d2 = Double.NaN;
            double d10 = mapBuffer.contains(3) ? mapBuffer.getDouble(3) : Double.NaN;
            if (mapBuffer.contains(4)) {
                d2 = mapBuffer.getDouble(4);
            }
            arrayList.add(new FragmentAttributes(textAttributePropsFromMapBuffer, length, i11, z3, d10, d2));
            i10++;
        }
        SpannableString spannableString = new SpannableString(sb2);
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            FragmentAttributes fragmentAttributes = (FragmentAttributes) next;
            int length2 = fragmentAttributes.getLength() + i7;
            int i12 = i7 == 0 ? 18 : 34;
            if (fragmentAttributes.getIsAttachment()) {
                spannableString.setSpan(new TextInlineViewPlaceholderSpan(fragmentAttributes.getReactTag(), (int) PixelUtil.toPixelFromSP(fragmentAttributes.getWidth()), (int) PixelUtil.toPixelFromSP(fragmentAttributes.getHeight())), i7, length2, i12);
            } else {
                if (fragmentAttributes.getProps().getRole() == null ? fragmentAttributes.getProps().getAccessibilityRole() == ReactAccessibilityDelegate.AccessibilityRole.LINK : fragmentAttributes.getProps().getRole() == ReactAccessibilityDelegate.Role.LINK) {
                    spannableString.setSpan(new ReactClickableSpan(fragmentAttributes.getReactTag()), i7, length2, i12);
                }
                if (fragmentAttributes.getProps().isColorSet()) {
                    spannableString.setSpan(new ReactForegroundColorSpan(fragmentAttributes.getProps().getColor()), i7, length2, i12);
                }
                if (fragmentAttributes.getProps().isBackgroundColorSet()) {
                    spannableString.setSpan(new ReactBackgroundColorSpan(fragmentAttributes.getProps().getBackgroundColor()), i7, length2, i12);
                }
                if (!Float.isNaN(fragmentAttributes.getProps().getOpacity())) {
                    spannableString.setSpan(new ReactOpacitySpan(fragmentAttributes.getProps().getOpacity()), i7, length2, i12);
                }
                if (!Float.isNaN(fragmentAttributes.getProps().getLetterSpacing())) {
                    spannableString.setSpan(new CustomLetterSpacingSpan(fragmentAttributes.getProps().getLetterSpacing()), i7, length2, i12);
                }
                spannableString.setSpan(new ReactAbsoluteSizeSpan(fragmentAttributes.getProps().mFontSize), i7, length2, i12);
                if (fragmentAttributes.getProps().getFontStyle() != -1 || fragmentAttributes.getProps().getFontWeight() != -1 || fragmentAttributes.getProps().getFontFamily() != null) {
                    int fontStyle = fragmentAttributes.getProps().getFontStyle();
                    int fontWeight = fragmentAttributes.getProps().getFontWeight();
                    String fontFeatureSettings = fragmentAttributes.getProps().getFontFeatureSettings();
                    String fontFamily = fragmentAttributes.getProps().getFontFamily();
                    AssetManager assets = context.getAssets();
                    Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
                    spannableString.setSpan(new CustomStyleSpan(fontStyle, fontWeight, fontFeatureSettings, fontFamily, assets), i7, length2, i12);
                }
                if (fragmentAttributes.getProps().isUnderlineTextDecorationSet()) {
                    spannableString.setSpan(new ReactUnderlineSpan(), i7, length2, i12);
                }
                if (fragmentAttributes.getProps().isLineThroughTextDecorationSet()) {
                    spannableString.setSpan(new ReactStrikethroughSpan(), i7, length2, i12);
                }
                if ((fragmentAttributes.getProps().getTextShadowOffsetDx() != 0.0f || fragmentAttributes.getProps().getTextShadowOffsetDy() != 0.0f || fragmentAttributes.getProps().getTextShadowRadius() != 0.0f) && Color.alpha(fragmentAttributes.getProps().getTextShadowColor()) != 0) {
                    spannableString.setSpan(new ShadowStyleSpan(fragmentAttributes.getProps().getTextShadowOffsetDx(), fragmentAttributes.getProps().getTextShadowOffsetDy(), fragmentAttributes.getProps().getTextShadowRadius(), fragmentAttributes.getProps().getTextShadowColor()), i7, length2, i12);
                }
                if (!Float.isNaN(fragmentAttributes.getProps().getEffectiveLineHeight())) {
                    spannableString.setSpan(new CustomLineHeightSpan(fragmentAttributes.getProps().getEffectiveLineHeight()), i7, length2, i12);
                }
                spannableString.setSpan(new ReactTagSpan(fragmentAttributes.getReactTag()), i7, length2, i12);
            }
            i7 = length2;
        }
        return spannableString;
    }

    private final float calculateHeight(Layout layout, float height, j heightYogaMeasureMode, int calculatedLineCount) {
        if (heightYogaMeasureMode != j.f3659b) {
            float lineBottom = layout.getLineBottom(calculatedLineCount - 1);
            if (heightYogaMeasureMode != j.f3660c || lineBottom <= height) {
                return lineBottom;
            }
        }
        return height;
    }

    private final int calculateLineCount(Layout layout, int maximumNumberOfLines) {
        return (maximumNumberOfLines == -1 || maximumNumberOfLines == 0) ? layout.getLineCount() : Math.min(maximumNumberOfLines, layout.getLineCount());
    }

    private final float calculateWidth(Layout layout, Spanned text, float width, j widthYogaMeasureMode, int calculatedLineCount) {
        return widthYogaMeasureMode == j.f3659b ? width : layout.getWidth();
    }

    private final Layout createLayout(Spannable text, BoringLayout.Metrics boring, float width, j widthYogaMeasureMode, boolean includeFontPadding, int textBreakStrategy, int hyphenationFrequency, Layout.Alignment alignment, int justificationMode, TextUtils.TruncateAt ellipsizeMode, int maxNumberOfLines, TextPaint paint) {
        if (boring != null && (widthYogaMeasureMode == j.f3658a || boring.width <= ((float) Math.floor(width)))) {
            BoringLayout boringLayoutMake = BoringLayout.make(text, paint, widthYogaMeasureMode == j.f3659b ? (int) Math.floor(width) : boring.width, alignment, 1.0f, 0.0f, boring, includeFontPadding);
            Intrinsics.checkNotNullExpressionValue(boringLayoutMake, "make(...)");
            return boringLayoutMake;
        }
        int iCeil = (int) Math.ceil(Layout.getDesiredWidth(text, paint));
        int iOrdinal = widthYogaMeasureMode.ordinal();
        if (iOrdinal == 1) {
            iCeil = (int) Math.floor(width);
        } else if (iOrdinal == 2) {
            iCeil = Math.min(iCeil, (int) Math.floor(width));
        }
        StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(text, 0, text.length(), paint, iCeil).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(includeFontPadding).setBreakStrategy(textBreakStrategy).setHyphenationFrequency(hyphenationFrequency);
        Intrinsics.checkNotNullExpressionValue(hyphenationFrequency2, "setHyphenationFrequency(...)");
        if (maxNumberOfLines != -1 && maxNumberOfLines != 0) {
            hyphenationFrequency2.setEllipsize(ellipsizeMode).setMaxLines(maxNumberOfLines);
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            hyphenationFrequency2.setJustificationMode(justificationMode);
        }
        if (i7 >= 28) {
            hyphenationFrequency2.setUseLineSpacingFromFallbacks(true);
        }
        StaticLayout staticLayoutBuild = hyphenationFrequency2.build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
        return staticLayoutBuild;
    }

    private final Layout createLayoutForMeasurement(Context context, MapBuffer attributedString, MapBuffer paragraphAttributes, float width, j widthYogaMeasureMode, float height, j heightYogaMeasureMode, ReactTextViewManagerCallback reactTextViewManagerCallback) {
        TextPaint textPaintScratchPaintWithAttributes;
        Spannable orCreateSpannableForText = getOrCreateSpannableForText(context, attributedString, reactTextViewManagerCallback);
        if (attributedString.contains(3)) {
            textPaintScratchPaintWithAttributes = ((ReactTextPaintHolderSpan[]) orCreateSpannableForText.getSpans(0, 0, ReactTextPaintHolderSpan.class))[0].getTextPaint();
        } else {
            TextAttributeProps textAttributePropsFromMapBuffer = TextAttributeProps.fromMapBuffer(attributedString.getMapBuffer(4));
            Intrinsics.checkNotNullExpressionValue(textAttributePropsFromMapBuffer, "fromMapBuffer(...)");
            textPaintScratchPaintWithAttributes = scratchPaintWithAttributes(textAttributePropsFromMapBuffer, context);
        }
        return createLayout(orCreateSpannableForText, textPaintScratchPaintWithAttributes, attributedString, paragraphAttributes, width, widthYogaMeasureMode, height, heightYogaMeasureMode);
    }

    @JvmStatic
    @NotNull
    public static final PreparedLayout createPreparedLayout(@NotNull Context context, @NotNull ReadableMapBuffer attributedString, @NotNull ReadableMapBuffer paragraphAttributes, float width, @NotNull j widthYogaMeasureMode, float height, @NotNull j heightYogaMeasureMode, @Nullable ReactTextViewManagerCallback reactTextViewManagerCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributedString, "attributedString");
        Intrinsics.checkNotNullParameter(paragraphAttributes, "paragraphAttributes");
        Intrinsics.checkNotNullParameter(widthYogaMeasureMode, "widthYogaMeasureMode");
        Intrinsics.checkNotNullParameter(heightYogaMeasureMode, "heightYogaMeasureMode");
        TextLayoutManager textLayoutManager = INSTANCE;
        Spannable orCreateSpannableForText = textLayoutManager.getOrCreateSpannableForText(context, attributedString, reactTextViewManagerCallback);
        TextAttributeProps textAttributePropsFromMapBuffer = TextAttributeProps.fromMapBuffer(attributedString.getMapBuffer(4));
        Intrinsics.checkNotNullExpressionValue(textAttributePropsFromMapBuffer, "fromMapBuffer(...)");
        Layout layoutCreateLayout = textLayoutManager.createLayout(orCreateSpannableForText, textLayoutManager.newPaintWithAttributes(textAttributePropsFromMapBuffer, context), attributedString, paragraphAttributes, width, widthYogaMeasureMode, height, heightYogaMeasureMode);
        int i7 = paragraphAttributes.contains(0) ? paragraphAttributes.getInt(0) : -1;
        return new PreparedLayout(layoutCreateLayout, i7, textLayoutManager.getVerticalOffset(layoutCreateLayout, paragraphAttributes, height, heightYogaMeasureMode, i7));
    }

    private final Spannable createSpannableFromAttributedString(Context context, MapBuffer attributedString, ReactTextViewManagerCallback reactTextViewManagerCallback) {
        if (ReactNativeFeatureFlags.enableAndroidTextMeasurementOptimizations()) {
            Spannable spannableBuildSpannableFromFragmentsOptimized = buildSpannableFromFragmentsOptimized(context, attributedString.getMapBuffer(2));
            if (reactTextViewManagerCallback != null) {
                reactTextViewManagerCallback.onPostProcessSpannable(spannableBuildSpannableFromFragmentsOptimized);
            }
            return spannableBuildSpannableFromFragmentsOptimized;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        buildSpannableFromFragments(context, attributedString.getMapBuffer(2), spannableStringBuilder, arrayList);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.get((arrayList.size() - i7) - 1).execute(spannableStringBuilder, i7);
        }
        if (reactTextViewManagerCallback != null) {
            reactTextViewManagerCallback.onPostProcessSpannable(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    private final Layout.Alignment getTextAlignment(MapBuffer attributedString, Spannable spanned, String alignmentAttr) {
        boolean z3 = isRTL(attributedString) != TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spanned, 0, spanned.length());
        Layout.Alignment alignment = z3 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        if (alignmentAttr == null) {
            return alignment;
        }
        if (alignmentAttr.equals("center")) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (alignmentAttr.equals(ViewProps.RIGHT)) {
            return z3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        }
        return alignment;
    }

    private final String getTextAlignmentAttr(MapBuffer attributedString) {
        if (!attributedString.contains(2)) {
            return null;
        }
        MapBuffer mapBuffer = attributedString.getMapBuffer(2);
        if (mapBuffer.getCount() != 0) {
            MapBuffer mapBuffer2 = mapBuffer.getMapBuffer(0).getMapBuffer(5);
            if (mapBuffer2.contains(12)) {
                return mapBuffer2.getString(12);
            }
        }
        return null;
    }

    @JvmStatic
    public static final int getTextGravity(@NotNull MapBuffer attributedString, @NotNull Spannable spanned) {
        Intrinsics.checkNotNullParameter(attributedString, "attributedString");
        Intrinsics.checkNotNullParameter(spanned, "spanned");
        TextLayoutManager textLayoutManager = INSTANCE;
        Layout.Alignment textAlignment = textLayoutManager.getTextAlignment(attributedString, spanned, textLayoutManager.getTextAlignmentAttr(attributedString));
        boolean zIsRtl = TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spanned, 0, spanned.length());
        int i7 = WhenMappings.$EnumSwitchMapping$0[textAlignment.ordinal()];
        if (i7 == 1) {
            return zIsRtl ? 5 : 3;
        }
        if (i7 == 2) {
            return zIsRtl ? 3 : 5;
        }
        if (i7 == 3) {
            return 1;
        }
        throw new l();
    }

    private final int getTextJustificationMode(String alignmentAttr) {
        if (Build.VERSION.SDK_INT < 26) {
            return -1;
        }
        return (alignmentAttr == null || !alignmentAttr.equals("justified")) ? 0 : 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r4.equals("auto") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (r4.equals(com.facebook.react.uimanager.ViewProps.TOP) == false) goto L29;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final float getVerticalOffset(android.text.Layout r3, com.facebook.react.common.mapbuffer.ReadableMapBuffer r4, float r5, H3.j r6, int r7) {
        /*
            r2 = this;
            r0 = 8
            boolean r1 = r4.contains(r0)
            if (r1 == 0) goto Ld
            java.lang.String r4 = r4.getString(r0)
            goto Le
        Ld:
            r4 = 0
        Le:
            r0 = 0
            if (r4 != 0) goto L12
            goto L3f
        L12:
            int r1 = r3.getHeight()
            int r7 = r2.calculateLineCount(r3, r7)
            float r3 = r2.calculateHeight(r3, r5, r6, r7)
            float r5 = (float) r1
            int r6 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r6 <= 0) goto L24
            goto L3f
        L24:
            int r6 = r4.hashCode()
            switch(r6) {
                case -1383228885: goto L4e;
                case -1364013995: goto L40;
                case 115029: goto L35;
                case 3005871: goto L2c;
                default: goto L2b;
            }
        L2b:
            goto L56
        L2c:
            java.lang.String r3 = "auto"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L3f
            goto L56
        L35:
            java.lang.String r3 = "top"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L3f
            goto L56
        L3f:
            return r0
        L40:
            java.lang.String r6 = "center"
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L49
            goto L56
        L49:
            float r3 = r3 - r5
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            return r3
        L4e:
            java.lang.String r6 = "bottom"
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L62
        L56:
            java.lang.String r3 = "Invalid textAlignVertical: "
            java.lang.String r3 = r3.concat(r4)
            java.lang.String r4 = "ReactNative"
            p229p2.a.v(r4, r3)
            return r0
        L62:
            float r3 = r3 - r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.TextLayoutManager.getVerticalOffset(android.text.Layout, com.facebook.react.common.mapbuffer.ReadableMapBuffer, float, H3.j, int):float");
    }

    private final BoringLayout.Metrics isBoring(Spannable text, TextPaint paint) {
        if (Build.VERSION.SDK_INT < 33) {
            return BoringLayout.isBoring(text, paint);
        }
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        return BoringLayout.isBoring(text, paint, TextDirectionHeuristics.FIRSTSTRONG_LTR, true, null);
    }

    @JvmStatic
    @NotNull
    public static final WritableArray measureLines(@NotNull Context context, @NotNull MapBuffer attributedString, @NotNull MapBuffer paragraphAttributes, float width, float height, @Nullable ReactTextViewManagerCallback reactTextViewManagerCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributedString, "attributedString");
        Intrinsics.checkNotNullParameter(paragraphAttributes, "paragraphAttributes");
        TextLayoutManager textLayoutManager = INSTANCE;
        j jVar = j.f3659b;
        Layout layoutCreateLayoutForMeasurement = textLayoutManager.createLayoutForMeasurement(context, attributedString, paragraphAttributes, width, jVar, height, jVar, reactTextViewManagerCallback);
        CharSequence text = layoutCreateLayoutForMeasurement.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return FontMetricsUtil.getFontMetrics(text, layoutCreateLayoutForMeasurement, context);
    }

    @JvmStatic
    @NotNull
    public static final float[] measurePreparedLayout(@NotNull PreparedLayout preparedLayout, float width, @NotNull j widthYogaMeasureMode, float height, @NotNull j heightYogaMeasureMode) {
        Intrinsics.checkNotNullParameter(preparedLayout, "preparedLayout");
        Intrinsics.checkNotNullParameter(widthYogaMeasureMode, "widthYogaMeasureMode");
        Intrinsics.checkNotNullParameter(heightYogaMeasureMode, "heightYogaMeasureMode");
        Layout layout = preparedLayout.getLayout();
        CharSequence text = layout.getText();
        Intrinsics.f(text, "null cannot be cast to non-null type android.text.Spanned");
        Spanned spanned = (Spanned) text;
        int maximumNumberOfLines = preparedLayout.getMaximumNumberOfLines();
        TextLayoutManager textLayoutManager = INSTANCE;
        int iCalculateLineCount = textLayoutManager.calculateLineCount(layout, maximumNumberOfLines);
        float fCalculateWidth = textLayoutManager.calculateWidth(layout, spanned, width, widthYogaMeasureMode, iCalculateLineCount);
        float fCalculateHeight = textLayoutManager.calculateHeight(layout, height, heightYogaMeasureMode, iCalculateLineCount);
        ArrayList arrayList = new ArrayList();
        PixelUtil pixelUtil = PixelUtil.INSTANCE;
        arrayList.add(Float.valueOf(pixelUtil.pxToDp(fCalculateWidth)));
        arrayList.add(Float.valueOf(pixelUtil.pxToDp(fCalculateHeight)));
        AttachmentMetrics attachmentMetrics = new AttachmentMetrics();
        int iNextAttachmentMetrics = 0;
        while (iNextAttachmentMetrics < spanned.length()) {
            iNextAttachmentMetrics = textLayoutManager.nextAttachmentMetrics(layout, spanned, fCalculateWidth, iCalculateLineCount, iNextAttachmentMetrics, preparedLayout.getVerticalOffset(), attachmentMetrics);
            if (attachmentMetrics.getWasFound()) {
                PixelUtil pixelUtil2 = PixelUtil.INSTANCE;
                arrayList.add(Float.valueOf(pixelUtil2.pxToDp(attachmentMetrics.getTop())));
                arrayList.add(Float.valueOf(pixelUtil2.pxToDp(attachmentMetrics.getLeft())));
                arrayList.add(Float.valueOf(pixelUtil2.pxToDp(attachmentMetrics.getWidth())));
                arrayList.add(Float.valueOf(pixelUtil2.pxToDp(attachmentMetrics.getHeight())));
            }
        }
        float[] fArr = new float[arrayList.size()];
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = arrayList.get(i7);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            fArr[i7] = ((Number) obj).floatValue();
        }
        return fArr;
    }

    @JvmStatic
    public static final long measureText(@NotNull Context context, @NotNull MapBuffer attributedString, @NotNull MapBuffer paragraphAttributes, float width, @NotNull j widthYogaMeasureMode, float height, @NotNull j heightYogaMeasureMode, @Nullable ReactTextViewManagerCallback reactTextViewManagerCallback, @Nullable float[] attachmentsPositions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributedString, "attributedString");
        Intrinsics.checkNotNullParameter(paragraphAttributes, "paragraphAttributes");
        Intrinsics.checkNotNullParameter(widthYogaMeasureMode, "widthYogaMeasureMode");
        Intrinsics.checkNotNullParameter(heightYogaMeasureMode, "heightYogaMeasureMode");
        TextLayoutManager textLayoutManager = INSTANCE;
        Layout layoutCreateLayoutForMeasurement = textLayoutManager.createLayoutForMeasurement(context, attributedString, paragraphAttributes, width, widthYogaMeasureMode, height, heightYogaMeasureMode, reactTextViewManagerCallback);
        int iNextAttachmentMetrics = 0;
        int i7 = paragraphAttributes.contains(0) ? paragraphAttributes.getInt(0) : -1;
        CharSequence text = layoutCreateLayoutForMeasurement.getText();
        Intrinsics.f(text, "null cannot be cast to non-null type android.text.Spanned");
        Spanned spanned = (Spanned) text;
        int iCalculateLineCount = textLayoutManager.calculateLineCount(layoutCreateLayoutForMeasurement, i7);
        float fCalculateWidth = textLayoutManager.calculateWidth(layoutCreateLayoutForMeasurement, spanned, width, widthYogaMeasureMode, iCalculateLineCount);
        float fCalculateHeight = textLayoutManager.calculateHeight(layoutCreateLayoutForMeasurement, height, heightYogaMeasureMode, iCalculateLineCount);
        if (attachmentsPositions != null) {
            AttachmentMetrics attachmentMetrics = new AttachmentMetrics();
            int i10 = 0;
            while (iNextAttachmentMetrics < spanned.length()) {
                iNextAttachmentMetrics = INSTANCE.nextAttachmentMetrics(layoutCreateLayoutForMeasurement, spanned, fCalculateWidth, iCalculateLineCount, iNextAttachmentMetrics, 0.0f, attachmentMetrics);
                if (attachmentMetrics.getWasFound()) {
                    PixelUtil pixelUtil = PixelUtil.INSTANCE;
                    attachmentsPositions[i10] = pixelUtil.pxToDp(attachmentMetrics.getTop());
                    attachmentsPositions[i10 + 1] = pixelUtil.pxToDp(attachmentMetrics.getLeft());
                    i10 += 2;
                }
            }
        }
        PixelUtil pixelUtil2 = PixelUtil.INSTANCE;
        return p059e1.a.O(pixelUtil2.pxToDp(fCalculateWidth), pixelUtil2.pxToDp(fCalculateHeight));
    }

    private final TextPaint newPaintWithAttributes(TextAttributeProps baseTextAttributes, Context context) {
        TextPaint textPaint = new TextPaint(1);
        updateTextPaint(textPaint, baseTextAttributes, context);
        return textPaint;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    private final int nextAttachmentMetrics(Layout layout, Spanned text, float calculatedWidth, int calculatedLineCount, int i7, float verticalOffset, AttachmentMetrics metrics) {
        float primaryHorizontal;
        int iNextSpanTransition = text.nextSpanTransition(i7, text.length(), TextInlineViewPlaceholderSpan.class);
        TextInlineViewPlaceholderSpan[] textInlineViewPlaceholderSpanArr = (TextInlineViewPlaceholderSpan[]) text.getSpans(i7, iNextSpanTransition, TextInlineViewPlaceholderSpan.class);
        if (textInlineViewPlaceholderSpanArr.length == 0) {
            metrics.setWasFound(false);
            return iNextSpanTransition;
        }
        p059e1.a.d(textInlineViewPlaceholderSpanArr.length == 1);
        TextInlineViewPlaceholderSpan textInlineViewPlaceholderSpan = textInlineViewPlaceholderSpanArr[0];
        int spanStart = text.getSpanStart(textInlineViewPlaceholderSpan);
        int lineForOffset = layout.getLineForOffset(spanStart);
        boolean z3 = layout.getEllipsisCount(lineForOffset) > 0;
        if (lineForOffset > calculatedLineCount) {
            metrics.setTop(Float.NaN);
            metrics.setLeft(Float.NaN);
        } else {
            if (z3) {
                if (spanStart >= layout.getEllipsisStart(lineForOffset) + layout.getLineStart(lineForOffset)) {
                    metrics.setTop(Float.NaN);
                    metrics.setLeft(Float.NaN);
                }
            }
            float width = textInlineViewPlaceholderSpan.getWidth();
            float height = textInlineViewPlaceholderSpan.getHeight();
            boolean zIsRtlCharAt = layout.isRtlCharAt(spanStart);
            boolean z8 = layout.getParagraphDirection(lineForOffset) == -1;
            if (spanStart == text.length() - 1) {
                float lineWidth = (text.length() <= 0 || text.charAt(layout.getLineEnd(lineForOffset) - 1) != '\n') ? layout.getLineWidth(lineForOffset) : layout.getLineMax(lineForOffset);
                if (z8) {
                    primaryHorizontal = calculatedWidth - lineWidth;
                } else {
                    primaryHorizontal = layout.getLineRight(lineForOffset);
                    primaryHorizontal -= width;
                }
            } else {
                primaryHorizontal = z8 == zIsRtlCharAt ? layout.getPrimaryHorizontal(spanStart) : layout.getSecondaryHorizontal(spanStart);
                if (z8 && !zIsRtlCharAt) {
                    primaryHorizontal = calculatedWidth - (layout.getLineRight(lineForOffset) - primaryHorizontal);
                }
                if (zIsRtlCharAt) {
                    primaryHorizontal -= width;
                }
            }
            metrics.setTop(layout.getLineBaseline(lineForOffset) - height);
            metrics.setLeft(primaryHorizontal);
        }
        metrics.setTop(metrics.getTop() + verticalOffset);
        metrics.setWasFound(true);
        metrics.setWidth(textInlineViewPlaceholderSpan.getWidth());
        metrics.setHeight(textInlineViewPlaceholderSpan.getHeight());
        return iNextSpanTransition;
    }

    private final TextPaint scratchPaintWithAttributes(TextAttributeProps baseTextAttributes, Context context) {
        TextPaint textPaint = textPaintInstance.get();
        if (textPaint == null) {
            throw new IllegalStateException("Required value was null.");
        }
        TextPaint textPaint2 = textPaint;
        textPaint2.setTypeface(null);
        textPaint2.setTextSize(12.0f);
        textPaint2.setFakeBoldText(false);
        textPaint2.setTextSkewX(0.0f);
        updateTextPaint(textPaint2, baseTextAttributes, context);
        return textPaint2;
    }

    private final void updateTextPaint(TextPaint paint, TextAttributeProps baseTextAttributes, Context context) {
        if (baseTextAttributes.getEffectiveFontSize() != -1) {
            paint.setTextSize(baseTextAttributes.getEffectiveFontSize());
        }
        if (baseTextAttributes.getFontStyle() == -1 && baseTextAttributes.getFontWeight() == -1 && baseTextAttributes.getFontFamily() == null) {
            return;
        }
        int fontStyle = baseTextAttributes.getFontStyle();
        int fontWeight = baseTextAttributes.getFontWeight();
        String fontFamily = baseTextAttributes.getFontFamily();
        AssetManager assets = context.getAssets();
        Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
        Typeface typefaceApplyStyles = ReactTypefaceUtils.applyStyles(null, fontStyle, fontWeight, fontFamily, assets);
        paint.setTypeface(typefaceApplyStyles);
        if (baseTextAttributes.getFontStyle() == -1 || baseTextAttributes.getFontStyle() == typefaceApplyStyles.getStyle()) {
            return;
        }
        int fontStyle2 = baseTextAttributes.getFontStyle() & (~typefaceApplyStyles.getStyle());
        paint.setFakeBoldText((fontStyle2 & 1) != 0);
        paint.setTextSkewX((fontStyle2 & 2) != 0 ? -0.25f : 0.0f);
    }

    public final void deleteCachedSpannableForTag(int reactTag) {
        tagToSpannableCache.remove(Integer.valueOf(reactTag));
    }

    @NotNull
    public final Spannable getOrCreateSpannableForText(@NotNull Context context, @NotNull MapBuffer attributedString, @Nullable ReactTextViewManagerCallback reactTextViewManagerCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributedString, "attributedString");
        if (!attributedString.contains(3)) {
            return createSpannableFromAttributedString(context, attributedString, reactTextViewManagerCallback);
        }
        Spannable spannable = tagToSpannableCache.get(Integer.valueOf(attributedString.getInt(3)));
        if (spannable != null) {
            return spannable;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean isRTL(@NotNull MapBuffer attributedString) {
        Intrinsics.checkNotNullParameter(attributedString, "attributedString");
        if (!attributedString.contains(2)) {
            return false;
        }
        MapBuffer mapBuffer = attributedString.getMapBuffer(2);
        if (mapBuffer.getCount() == 0) {
            return false;
        }
        MapBuffer mapBuffer2 = mapBuffer.getMapBuffer(0).getMapBuffer(5);
        return mapBuffer2.contains(23) && TextAttributeProps.getLayoutDirection(mapBuffer2.getString(23)) == 1;
    }

    public final void setCachedSpannableForTag(int reactTag, @NotNull Spannable sp) {
        Intrinsics.checkNotNullParameter(sp, "sp");
        tagToSpannableCache.put(Integer.valueOf(reactTag), sp);
    }

    private final Layout createLayout(Spannable text, TextPaint paint, MapBuffer attributedString, MapBuffer paragraphAttributes, float width, j widthYogaMeasureMode, float height, j heightYogaMeasureMode) {
        BoringLayout.Metrics metricsIsBoring = isBoring(text, paint);
        int textBreakStrategy = TextAttributeProps.getTextBreakStrategy(paragraphAttributes.getString(2));
        boolean z3 = paragraphAttributes.contains(4) ? paragraphAttributes.getBoolean(4) : true;
        int hyphenationFrequency = TextAttributeProps.getHyphenationFrequency(paragraphAttributes.getString(5));
        boolean z8 = paragraphAttributes.contains(3) ? paragraphAttributes.getBoolean(3) : false;
        int i7 = paragraphAttributes.contains(0) ? paragraphAttributes.getInt(0) : -1;
        TextUtils.TruncateAt ellipsizeMode = paragraphAttributes.contains(1) ? TextAttributeProps.getEllipsizeMode(paragraphAttributes.getString(1)) : null;
        String textAlignmentAttr = getTextAlignmentAttr(attributedString);
        Layout.Alignment textAlignment = getTextAlignment(attributedString, text, textAlignmentAttr);
        int textJustificationMode = getTextJustificationMode(textAlignmentAttr);
        if (z8) {
            adjustSpannableFontToFit(text, width, j.f3659b, height, heightYogaMeasureMode, paragraphAttributes.contains(6) ? (float) paragraphAttributes.getDouble(6) : Float.NaN, i7, z3, textBreakStrategy, hyphenationFrequency, textAlignment, textJustificationMode, paint);
            hyphenationFrequency = hyphenationFrequency;
            textAlignment = textAlignment;
            textJustificationMode = textJustificationMode;
        }
        return createLayout(text, metricsIsBoring, width, widthYogaMeasureMode, z3, textBreakStrategy, hyphenationFrequency, textAlignment, textJustificationMode, ellipsizeMode, i7, paint);
    }
}
