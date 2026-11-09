package com.facebook.react.views.textinput;

import Ab.ViewOnFocusChangeListenerC0052d;
import M.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.adjust.sdk.Constants;
import com.airbnb.lottie.model.layer.d;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.events.BlurEvent;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.FocusEvent;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.facebook.react.views.scroll.ScrollEventType;
import com.facebook.react.views.text.DefaultStyleValuesUtil;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.facebook.react.views.text.ReactTextUpdate;
import com.facebook.react.views.text.ReactTextViewManagerCallback;
import com.facebook.react.views.text.ReactTypefaceUtils;
import com.facebook.react.views.text.TextAttributeProps;
import com.facebook.react.views.text.TextLayoutManager;
import com.facebook.react.views.text.internal.span.TextInlineImageSpan;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.maps.android.BuildConfig;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.F;
import kotlin.collections.G;
import kotlin.collections.z;
import kotlin.jvm.internal.AbstractC1859i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b9\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 ¥\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002¥\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0014H\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001a0\u0016H\u0016J\"\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0017J\"\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\r2\u0006\u0010$\u001a\u00020\u001aH\u0002J\u0018\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0017H\u0016J\u0018\u0010(\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u001aH\u0007J\u0018\u0010*\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010+\u001a\u00020,H\u0007J\u001a\u0010-\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\rH\u0007J\u0018\u0010/\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u00100\u001a\u00020,H\u0007J\u001a\u00101\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u00102\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u00103\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u00105\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u00010 H\u0007J\u0018\u00107\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u00108\u001a\u000209H\u0007J\u001a\u0010:\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010;\u001a\u0004\u0018\u00010\rH\u0007J\u0018\u0010:\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u001aH\u0002J)\u0010=\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0012\u0010>\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0?\"\u00020\rH\u0002¢\u0006\u0002\u0010@J\u0018\u0010A\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010B\u001a\u000209H\u0007J\u001a\u0010C\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010D\u001a\u0004\u0018\u00010\rH\u0007J\u0018\u0010E\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010F\u001a\u000209H\u0007J\u0018\u0010G\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010H\u001a\u000209H\u0007J\u0018\u0010I\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010J\u001a\u000209H\u0007J\u0018\u0010K\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010L\u001a\u00020,H\u0007J\u0018\u0010M\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010N\u001a\u000209H\u0007J\u001a\u0010O\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010P\u001a\u0004\u0018\u00010\rH\u0007J\u001f\u0010Q\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010R\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010SJ\u001f\u0010T\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010R\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010SJ\u001f\u0010U\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010R\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010SJ\u001f\u0010V\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010R\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010SJ\u0018\u0010W\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010X\u001a\u000209H\u0007J\u0018\u0010Y\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010Z\u001a\u000209H\u0007J\u0018\u0010[\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010\\\u001a\u000209H\u0007J\u001f\u0010]\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010R\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010SJ\u001f\u0010^\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010_\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010SJ\u001a\u0010`\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010a\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u0010b\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010c\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u0010d\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010e\u001a\u0004\u0018\u00010\rH\u0007J\u0018\u0010f\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010g\u001a\u00020\u001aH\u0007J\u0018\u0010h\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010i\u001a\u000209H\u0007J\u0018\u0010j\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010k\u001a\u00020\u001aH\u0007J\u001f\u0010l\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010m\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010SJ\u001a\u0010n\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010o\u001a\u0004\u0018\u00010\rH\u0007J\u001f\u0010p\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010q\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\u0010rJ\u0018\u0010s\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010t\u001a\u000209H\u0007J\u0018\u0010u\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010v\u001a\u000209H\u0007J\u0018\u0010w\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010x\u001a\u00020yH\u0007J\u001a\u0010z\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010{\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u0010|\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010}\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u0010~\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\b\u0010\u007f\u001a\u0004\u0018\u00010 H\u0007J\u001a\u0010\u0080\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0007\u0010\u0081\u0001\u001a\u000209H\u0007J\u001c\u0010\u0082\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\rH\u0007J#\u0010\u0084\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0007\u0010\u0085\u0001\u001a\u00020\u001a2\u0007\u0010\u0086\u0001\u001a\u00020,H\u0007J\u001c\u0010\u0087\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u0010\u0089\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0007\u0010\u0089\u0001\u001a\u000209H\u0007J\u001a\u0010\u008a\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0007\u0010\u008b\u0001\u001a\u000209H\u0007J\u001c\u0010\u008c\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010\rH\u0007J#\u0010\u008e\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0007\u0010\u0085\u0001\u001a\u00020\u001a2\u0007\u0010\u008f\u0001\u001a\u00020,H\u0007J*\u0010\u0090\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0007\u0010\u0085\u0001\u001a\u00020\u001a2\b\u0010R\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0003\u0010\u0091\u0001J\u001c\u0010\u0092\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010\rH\u0007J\u0011\u0010\u0094\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0002H\u0014J\u001b\u0010\u0095\u0001\u001a\u00020\u001c2\u0007\u0010\u0096\u0001\u001a\u00020\u00102\u0007\u0010\u0097\u0001\u001a\u00020\u0002H\u0014J\u0015\u0010\u0098\u0001\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J5\u0010\u0099\u0001\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00022\u0007\u0010\u009a\u0001\u001a\u00020\u001a2\u0007\u0010\u009b\u0001\u001a\u00020\u001a2\u0007\u0010\u009c\u0001\u001a\u00020\u001a2\u0007\u0010\u009d\u0001\u001a\u00020\u001aH\u0016J'\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010&\u001a\u00020\u00022\b\u0010\u009f\u0001\u001a\u00030 \u00012\b\u0010¡\u0001\u001a\u00030¢\u0001H\u0016J$\u0010!\u001a\u0004\u0018\u00010\u00172\u0006\u0010&\u001a\u00020\u00022\b\u0010\u009f\u0001\u001a\u00030 \u00012\b\u0010£\u0001\u001a\u00030¤\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006¦\u0001"}, d2 = {"Lcom/facebook/react/views/textinput/ReactTextInputManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/views/textinput/ReactEditText;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "<init>", "()V", "reactTextViewManagerCallback", "Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "getReactTextViewManagerCallback", "()Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "setReactTextViewManagerCallback", "(Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)V", "getName", "", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "createShadowNodeInstance", "Lcom/facebook/react/views/text/ReactBaseTextShadowNode;", "getShadowNodeClass", "Ljava/lang/Class;", "getExportedCustomBubblingEventTypeConstants", "", "", "getExportedCustomDirectEventTypeConstants", "getCommandsMap", "", "receiveCommand", "", "reactEditText", "commandId", "args", "Lcom/facebook/react/bridge/ReadableArray;", "getReactTextUpdate", "Lcom/facebook/react/views/text/ReactTextUpdate;", ReactTextInputShadowNode.PROP_TEXT, "mostRecentEventCount", "updateExtraData", "view", "extraData", "setLineHeight", ViewProps.LINE_HEIGHT, "setFontSize", ViewProps.FONT_SIZE, "", "setFontFamily", ViewProps.FONT_FAMILY, "setMaxFontSizeMultiplier", ViewProps.MAX_FONT_SIZE_MULTIPLIER, "setFontWeight", ViewProps.FONT_WEIGHT, "setFontStyle", ViewProps.FONT_STYLE, "setFontVariant", ViewProps.FONT_VARIANT, "setIncludeFontPadding", "includepad", "", "setImportantForAutofill", "value", "mode", "setAutofillHints", "hints", "", "(Lcom/facebook/react/views/textinput/ReactEditText;[Ljava/lang/String;)V", "setOnSelectionChange", "onSelectionChange", "setSubmitBehavior", "submitBehavior", "setOnContentSizeChange", "onContentSizeChange", "setOnScroll", "onScroll", "setOnKeyPress", "onKeyPress", "setLetterSpacing", ViewProps.LETTER_SPACING, "setAllowFontScaling", ViewProps.ALLOW_FONT_SCALING, "setPlaceholder", ReactTextInputShadowNode.PROP_PLACEHOLDER, "setPlaceholderTextColor", ViewProps.COLOR, "(Lcom/facebook/react/views/textinput/ReactEditText;Ljava/lang/Integer;)V", "setSelectionColor", "setSelectionHandleColor", "setCursorColor", "setCaretHidden", "caretHidden", "setContextMenuHidden", "contextMenuHidden", "setSelectTextOnFocus", "selectTextOnFocus", "setColor", "setUnderlineColor", "underlineColor", "setTextAlign", ViewProps.TEXT_ALIGN, "setTextAlignVertical", ViewProps.TEXT_ALIGN_VERTICAL, "setInlineImageLeft", "resource", "setInlineImagePadding", ViewProps.PADDING, "setEditable", "editable", "setNumLines", "numLines", "setMaxLength", "maxLength", "setTextContentType", "autoComplete", "setAutoCorrect", "autoCorrect", "(Lcom/facebook/react/views/textinput/ReactEditText;Ljava/lang/Boolean;)V", "setMultiline", "multiline", "setSecureTextEntry", "password", "setAutoCapitalize", "autoCapitalize", "Lcom/facebook/react/bridge/Dynamic;", "setKeyboardType", "keyboardType", "setReturnKeyType", "returnKeyType", "setAcceptDragAndDropTypes", "acceptDragAndDropTypes", "setDisableFullscreenUI", "disableFullscreenUI", "setReturnKeyLabel", "returnKeyLabel", "setBorderRadius", FirebaseAnalytics.Param.INDEX, ViewProps.BORDER_RADIUS, "setBorderStyle", "borderStyle", "showKeyboardOnFocus", "setAutoFocus", "autoFocus", "setTextDecorationLine", "textDecorationLineString", "setBorderWidth", "width", "setBorderColor", "(Lcom/facebook/react/views/textinput/ReactEditText;ILjava/lang/Integer;)V", "setOverflow", ViewProps.OVERFLOW, "onAfterUpdateTransaction", "addEventEmitters", "reactContext", "editText", "getExportedViewConstants", "setPadding", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "updateState", "props", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = ReactTextInputManager.REACT_CLASS)
@SourceDebugExtension({"SMAP\nReactTextInputManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactTextInputManager.kt\ncom/facebook/react/views/textinput/ReactTextInputManager\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1133:1\n37#2:1134\n36#2,3:1135\n37#2:1148\n36#2,3:1149\n1#3:1138\n739#4,9:1139\n*S KotlinDebug\n*F\n+ 1 ReactTextInputManager.kt\ncom/facebook/react/views/textinput/ReactTextInputManager\n*L\n626#1:1134\n626#1:1135,3\n838#1:1148\n838#1:1149,3\n837#1:1139,9\n*E\n"})
public class ReactTextInputManager extends BaseViewManager<ReactEditText, LayoutShadowNode> {
    private static final int AUTOCAPITALIZE_FLAGS = 28672;
    private static final int BLUR_TEXT_INPUT = 2;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String[] DRAWABLE_HANDLE_FIELDS;

    @NotNull
    private static final String[] DRAWABLE_HANDLE_RESOURCES;

    @NotNull
    private static final InputFilter[] EMPTY_FILTERS;
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final int IME_ACTION_ID = 1648;
    private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;

    @NotNull
    private static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";

    @NotNull
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";

    @NotNull
    private static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";

    @NotNull
    private static final String KEYBOARD_TYPE_NUMERIC = "numeric";

    @NotNull
    private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";

    @NotNull
    private static final String KEYBOARD_TYPE_URI = "url";

    @NotNull
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";

    @NotNull
    public static final String REACT_CLASS = "AndroidTextInput";

    @NotNull
    private static final Map<String, String> REACT_PROPS_AUTOFILL_HINTS_MAP;
    private static final int SET_MOST_RECENT_EVENT_COUNT = 3;
    private static final int SET_TEXT_AND_SELECTION = 4;

    @NotNull
    private static final String TAG;
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    private static final int UNSET = -1;

    @Nullable
    private ReactTextViewManagerCallback reactTextViewManagerCallback;

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010'\u001a\u00020(H\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J \u0010.\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u0010H\u0002J\u001a\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020-H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\"R\u000e\u0010#\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010%R\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010%R\u000e\u0010)\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/facebook/react/views/textinput/ReactTextInputManager$Companion;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "REACT_CLASS", "TX_STATE_KEY_ATTRIBUTED_STRING", "", "TX_STATE_KEY_PARAGRAPH_ATTRIBUTES", "TX_STATE_KEY_MOST_RECENT_EVENT_COUNT", "REACT_PROPS_AUTOFILL_HINTS_MAP", "", "FOCUS_TEXT_INPUT", "", "BLUR_TEXT_INPUT", "SET_MOST_RECENT_EVENT_COUNT", "SET_TEXT_AND_SELECTION", "INPUT_TYPE_KEYBOARD_NUMBER_PAD", "INPUT_TYPE_KEYBOARD_DECIMAL_PAD", "INPUT_TYPE_KEYBOARD_NUMBERED", "AUTOCAPITALIZE_FLAGS", "KEYBOARD_TYPE_EMAIL_ADDRESS", "KEYBOARD_TYPE_NUMERIC", "KEYBOARD_TYPE_DECIMAL_PAD", "KEYBOARD_TYPE_NUMBER_PAD", "KEYBOARD_TYPE_PHONE_PAD", "KEYBOARD_TYPE_VISIBLE_PASSWORD", "KEYBOARD_TYPE_URI", "EMPTY_FILTERS", "", "Landroid/text/InputFilter;", "[Landroid/text/InputFilter;", "UNSET", "DRAWABLE_HANDLE_RESOURCES", "[Ljava/lang/String;", "DRAWABLE_HANDLE_FIELDS", "shouldHideCursorForEmailTextInput", "", "IME_ACTION_ID", "checkPasswordType", "", "view", "Lcom/facebook/react/views/textinput/ReactEditText;", "updateStagedInputTypeFlag", "flagsToUnset", "flagsToSet", "getEventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "editText", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkPasswordType(ReactEditText view) {
            if ((view.getStagedInputType() & ReactTextInputManager.INPUT_TYPE_KEYBOARD_NUMBERED) == 0 || (view.getStagedInputType() & 128) == 0) {
                return;
            }
            updateStagedInputTypeFlag(view, 128, 16);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EventDispatcher getEventDispatcher(ReactContext reactContext, ReactEditText editText) {
            return UIManagerHelper.getEventDispatcherForReactTag(reactContext, editText.getId());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean shouldHideCursorForEmailTextInput() {
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            String lowerCase = MANUFACTURER.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return Build.VERSION.SDK_INT == 29 && StringsKt.A(lowerCase, Constants.REFERRER_API_XIAOMI, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void updateStagedInputTypeFlag(ReactEditText view, int flagsToUnset, int flagsToSet) {
            view.setStagedInputType(((~flagsToUnset) & view.getStagedInputType()) | flagsToSet);
        }

        @NotNull
        public final String getTAG() {
            return ReactTextInputManager.TAG;
        }

        private Companion() {
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("ReactTextInputManager", "getSimpleName(...)");
        TAG = "ReactTextInputManager";
        REACT_PROPS_AUTOFILL_HINTS_MAP = G.g(new Pair("birthdate-day", "birthDateDay"), new Pair("birthdate-full", "birthDateFull"), new Pair("birthdate-month", "birthDateMonth"), new Pair("birthdate-year", "birthDateYear"), new Pair("cc-csc", "creditCardSecurityCode"), new Pair("cc-exp", "creditCardExpirationDate"), new Pair("cc-exp-day", "creditCardExpirationDay"), new Pair("cc-exp-month", "creditCardExpirationMonth"), new Pair("cc-exp-year", "creditCardExpirationYear"), new Pair("cc-number", "creditCardNumber"), new Pair(Scopes.EMAIL, "emailAddress"), new Pair("gender", "gender"), new Pair("name", "personName"), new Pair("name-family", "personFamilyName"), new Pair("name-given", "personGivenName"), new Pair("name-middle", "personMiddleName"), new Pair("name-middle-initial", "personMiddleInitial"), new Pair("name-prefix", "personNamePrefix"), new Pair("name-suffix", "personNameSuffix"), new Pair("password", "password"), new Pair("password-new", "newPassword"), new Pair("postal-address", "postalAddress"), new Pair("postal-address-country", "addressCountry"), new Pair("postal-address-extended", "extendedAddress"), new Pair("postal-address-extended-postal-code", "extendedPostalCode"), new Pair("postal-address-locality", "addressLocality"), new Pair("postal-address-region", "addressRegion"), new Pair("postal-code", "postalCode"), new Pair("street-address", "streetAddress"), new Pair("sms-otp", "smsOTPCode"), new Pair("tel", "phoneNumber"), new Pair("tel-country-code", "phoneCountryCode"), new Pair("tel-national", "phoneNational"), new Pair("tel-device", "phoneNumberDevice"), new Pair("username", "username"), new Pair("username-new", "newUsername"));
        EMPTY_FILTERS = new InputFilter[0];
        DRAWABLE_HANDLE_RESOURCES = new String[]{"mTextSelectHandleLeftRes", "mTextSelectHandleRightRes", "mTextSelectHandleRes"};
        DRAWABLE_HANDLE_FIELDS = new String[]{"mSelectHandleLeft", "mSelectHandleRight", "mSelectHandleCenter"};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEventEmitters$lambda$2(ThemedReactContext themedReactContext, ReactEditText reactEditText, View view, boolean z3) {
        int surfaceId = themedReactContext.getSurfaceId();
        EventDispatcher eventDispatcher = INSTANCE.getEventDispatcher(themedReactContext, reactEditText);
        if (z3) {
            if (eventDispatcher != null) {
                eventDispatcher.dispatchEvent(new FocusEvent(surfaceId, reactEditText.getId()));
            }
        } else {
            if (eventDispatcher != null) {
                eventDispatcher.dispatchEvent(new BlurEvent(surfaceId, reactEditText.getId()));
            }
            if (eventDispatcher != null) {
                eventDispatcher.dispatchEvent(new ReactTextInputEndEditingEvent(surfaceId, reactEditText.getId(), String.valueOf(reactEditText.getText())));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addEventEmitters$lambda$3(ReactEditText reactEditText, ThemedReactContext themedReactContext, TextView textView, int i7, KeyEvent keyEvent) {
        EventDispatcher eventDispatcher;
        if ((i7 & 255) == 0 && i7 != 0) {
            return true;
        }
        boolean zIsMultiline$ReactAndroid_release = reactEditText.isMultiline$ReactAndroid_release();
        boolean zShouldSubmitOnReturn = reactEditText.shouldSubmitOnReturn();
        boolean zShouldBlurOnReturn = reactEditText.shouldBlurOnReturn();
        if (zShouldSubmitOnReturn && (eventDispatcher = INSTANCE.getEventDispatcher(themedReactContext, reactEditText)) != null) {
            eventDispatcher.dispatchEvent(new ReactTextInputSubmitEditingEvent(themedReactContext.getSurfaceId(), reactEditText.getId(), String.valueOf(reactEditText.getText())));
        }
        if (zShouldBlurOnReturn) {
            reactEditText.clearFocusAndMaybeRefocus$ReactAndroid_release();
        }
        return zShouldBlurOnReturn || zShouldSubmitOnReturn || !zIsMultiline$ReactAndroid_release || i7 == 5 || i7 == 7;
    }

    private final ReactTextUpdate getReactTextUpdate(String text, int mostRecentEventCount) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) text);
        return new ReactTextUpdate(spannableStringBuilder, mostRecentEventCount, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0);
    }

    private final void setAutofillHints(ReactEditText view, String... hints) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        view.setAutofillHints((String[]) Arrays.copyOf(hints, hints.length));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Integer> getCommandsMap() {
        return G.g(new Pair("focusTextInput", 1), new Pair("blurTextInput", 2));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants == null) {
            exportedCustomBubblingEventTypeConstants = new LinkedHashMap<>();
        }
        exportedCustomBubblingEventTypeConstants.putAll(G.g(new Pair("topSubmitEditing", F.b(new Pair("phasedRegistrationNames", G.g(new Pair("bubbled", "onSubmitEditing"), new Pair("captured", "onSubmitEditingCapture"))))), new Pair("topEndEditing", F.b(new Pair("phasedRegistrationNames", G.g(new Pair("bubbled", "onEndEditing"), new Pair("captured", "onEndEditingCapture"))))), new Pair(ReactTextInputKeyPressEvent.EVENT_NAME, F.b(new Pair("phasedRegistrationNames", G.g(new Pair("bubbled", "onKeyPress"), new Pair("captured", "onKeyPressCapture")))))));
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(F.b(new Pair(ScrollEventType.INSTANCE.getJSEventName(ScrollEventType.SCROLL), d.q("registrationName", "onScroll"))));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedViewConstants() {
        return F.b(new Pair("AutoCapitalizationType", G.g(new Pair(ViewProps.NONE, 0), new Pair("characters", 4096), new Pair("words", Integer.valueOf(UserMetadata.MAX_INTERNAL_KEY_SIZE)), new Pair("sentences", 16384))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Nullable
    public final ReactTextViewManagerCallback getReactTextViewManagerCallback() {
        return this.reactTextViewManagerCallback;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return ReactTextInputShadowNode.class;
    }

    @ReactProp(name = "acceptDragAndDropTypes")
    public final void setAcceptDragAndDropTypes(@NotNull ReactEditText view, @Nullable ReadableArray acceptDragAndDropTypes) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (acceptDragAndDropTypes == null) {
            view.setDragAndDropFilter(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = acceptDragAndDropTypes.size();
        for (int i7 = 0; i7 < size; i7++) {
            String string = acceptDragAndDropTypes.getString(i7);
            if (string != null) {
                arrayList.add(string);
            }
        }
        view.setDragAndDropFilter(arrayList);
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.ALLOW_FONT_SCALING)
    public final void setAllowFontScaling(@NotNull ReactEditText view, boolean allowFontScaling) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setAllowFontScaling(allowFontScaling);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    @ReactProp(name = "autoCapitalize")
    public final void setAutoCapitalize(@NotNull ReactEditText view, @NotNull Dynamic autoCapitalize) {
        int iAsInt;
        String strAsString;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(autoCapitalize, "autoCapitalize");
        if (autoCapitalize.getType() == ReadableType.Number) {
            iAsInt = autoCapitalize.asInt();
        } else if (autoCapitalize.getType() == ReadableType.String && (strAsString = autoCapitalize.asString()) != null) {
            switch (strAsString.hashCode()) {
                case 3387192:
                    if (!strAsString.equals(ViewProps.NONE)) {
                        iAsInt = 16384;
                    } else {
                        iAsInt = 0;
                    }
                    break;
                case 113318569:
                    if (!strAsString.equals("words")) {
                        iAsInt = 16384;
                    } else {
                        iAsInt = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    break;
                case 490141296:
                    strAsString.equals("sentences");
                    iAsInt = 16384;
                    break;
                case 1245424234:
                    if (!strAsString.equals("characters")) {
                        iAsInt = 16384;
                    } else {
                        iAsInt = 4096;
                    }
                    break;
                default:
                    iAsInt = 16384;
                    break;
            }
        } else {
            iAsInt = 16384;
        }
        INSTANCE.updateStagedInputTypeFlag(view, AUTOCAPITALIZE_FLAGS, iAsInt);
    }

    @ReactProp(name = "autoCorrect")
    public final void setAutoCorrect(@NotNull ReactEditText view, @Nullable Boolean autoCorrect) {
        int i7;
        Intrinsics.checkNotNullParameter(view, "view");
        Companion companion = INSTANCE;
        if (Intrinsics.c(autoCorrect, Boolean.TRUE)) {
            i7 = 32768;
        } else {
            i7 = Intrinsics.c(autoCorrect, Boolean.FALSE) ? 524288 : 0;
        }
        companion.updateStagedInputTypeFlag(view, 557056, i7);
    }

    @ReactProp(defaultBoolean = false, name = "autoFocus")
    public final void setAutoFocus(@NotNull ReactEditText view, boolean autoFocus) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setAutoFocus(autoFocus);
    }

    @ReactPropGroup(customType = "Color", names = {ViewProps.BORDER_COLOR, ViewProps.BORDER_LEFT_COLOR, ViewProps.BORDER_RIGHT_COLOR, ViewProps.BORDER_TOP_COLOR, ViewProps.BORDER_BOTTOM_COLOR})
    public final void setBorderColor(@NotNull ReactEditText view, int index, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.ALL, color);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_RADIUS, ViewProps.BORDER_TOP_LEFT_RADIUS, ViewProps.BORDER_TOP_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_LEFT_RADIUS})
    public final void setBorderRadius(@NotNull ReactEditText view, int index, float borderRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderRadius(view, BorderRadiusProp.getEntries().get(index), Float.isNaN(borderRadius) ? null : new LengthPercentage(borderRadius, LengthPercentageType.POINT));
    }

    @ReactProp(name = "borderStyle")
    public final void setBorderStyle(@NotNull ReactEditText view, @Nullable String borderStyle) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderStyle(view, borderStyle != null ? BorderStyle.INSTANCE.fromString(borderStyle) : null);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH})
    public final void setBorderWidth(@NotNull ReactEditText view, int index, float width) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderWidth(view, LogicalEdge.getEntries().get(index), Float.valueOf(width));
    }

    @ReactProp(defaultBoolean = false, name = "caretHidden")
    public final void setCaretHidden(@NotNull ReactEditText view, boolean caretHidden) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getStagedInputType() == 32 && INSTANCE.shouldHideCursorForEmailTextInput()) {
            return;
        }
        view.setCursorVisible(!caretHidden);
    }

    @ReactProp(customType = "Color", name = ViewProps.COLOR)
    public final void setColor(@NotNull ReactEditText view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (color != null) {
            view.setTextColor(color.intValue());
            return;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ColorStateList defaultTextColor = DefaultStyleValuesUtil.getDefaultTextColor(context);
        if (defaultTextColor != null) {
            view.setTextColor(defaultTextColor);
        } else {
            Context context2 = view.getContext();
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException(C0.G.o("Could not get default text color from View Context: ", context2 != null ? context2.getClass().getCanonicalName() : BuildConfig.TRAVIS)));
        }
    }

    @ReactProp(defaultBoolean = false, name = "contextMenuHidden")
    public final void setContextMenuHidden(@NotNull ReactEditText view, boolean contextMenuHidden) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setContextMenuHidden(contextMenuHidden);
    }

    @ReactProp(customType = "Color", name = "cursorColor")
    public final void setCursorColor(@NotNull ReactEditText view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            Drawable textCursorDrawable = view.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                if (color != null) {
                    textCursorDrawable.setColorFilter(new BlendModeColorFilter(color.intValue(), BlendMode.SRC_IN));
                } else {
                    textCursorDrawable.clearColorFilter();
                }
                view.setTextCursorDrawable(textCursorDrawable);
                return;
            }
            return;
        }
        if (i7 == 28) {
            return;
        }
        try {
            Field declaredField = view.getClass().getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i10 = declaredField.getInt(view);
            if (i10 == 0) {
                return;
            }
            Drawable drawable = view.getContext().getDrawable(i10);
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            if (drawableMutate == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (color != null) {
                drawableMutate.setColorFilter(color.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                drawableMutate.clearColorFilter();
            }
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(view);
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, new Drawable[]{drawableMutate, drawableMutate});
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    @ReactProp(defaultBoolean = false, name = "disableFullscreenUI")
    public final void setDisableFullscreenUI(@NotNull ReactEditText view, boolean disableFullscreenUI) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDisableFullscreenUI(disableFullscreenUI);
    }

    @ReactProp(defaultBoolean = true, name = "editable")
    public final void setEditable(@NotNull ReactEditText view, boolean editable) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEnabled(editable);
    }

    @ReactProp(name = ViewProps.FONT_FAMILY)
    public final void setFontFamily(@NotNull ReactEditText view, @Nullable String fontFamily) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFontFamily(fontFamily);
    }

    @ReactProp(defaultFloat = ViewDefaults.FONT_SIZE_SP, name = ViewProps.FONT_SIZE)
    public final void setFontSize(@NotNull ReactEditText view, float fontSize) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFontSize(fontSize);
    }

    @ReactProp(name = ViewProps.FONT_STYLE)
    public final void setFontStyle(@NotNull ReactEditText view, @Nullable String fontStyle) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFontStyle(fontStyle);
    }

    @ReactProp(name = ViewProps.FONT_VARIANT)
    public final void setFontVariant(@NotNull ReactEditText view, @Nullable ReadableArray fontVariant) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFontFeatureSettings(ReactTypefaceUtils.parseFontVariant(fontVariant));
    }

    @ReactProp(name = ViewProps.FONT_WEIGHT)
    public final void setFontWeight(@NotNull ReactEditText view, @Nullable String fontWeight) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFontWeight(fontWeight);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    @ReactProp(name = "importantForAutofill")
    public final void setImportantForAutofill(@NotNull ReactEditText view, @Nullable String value) {
        int i7;
        Intrinsics.checkNotNullParameter(view, "view");
        if (value == null) {
            i7 = 0;
        } else {
            int iHashCode = value.hashCode();
            if (iHashCode != 3521) {
                if (iHashCode != 119527) {
                    if (iHashCode != 1723649149) {
                        if (iHashCode == 1828836387 && value.equals("yesExcludeDescendants")) {
                            i7 = 4;
                        } else {
                            i7 = 0;
                        }
                    } else if (value.equals("noExcludeDescendants")) {
                        i7 = 8;
                    } else {
                        i7 = 0;
                    }
                } else if (value.equals("yes")) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
            } else if (value.equals("no")) {
                i7 = 2;
            } else {
                i7 = 0;
            }
        }
        setImportantForAutofill(view, i7);
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.INCLUDE_FONT_PADDING)
    public final void setIncludeFontPadding(@NotNull ReactEditText view, boolean includepad) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setIncludeFontPadding(includepad);
    }

    @ReactProp(name = "inlineImageLeft")
    public final void setInlineImageLeft(@NotNull ReactEditText view, @Nullable String resource) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setCompoundDrawablesWithIntrinsicBounds(ResourceDrawableIdHelper.getResourceDrawableId(context, resource), 0, 0, 0);
    }

    @ReactProp(name = "inlineImagePadding")
    public final void setInlineImagePadding(@NotNull ReactEditText view, int padding) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setCompoundDrawablePadding(padding);
    }

    @ReactProp(name = "keyboardType")
    public final void setKeyboardType(@NotNull ReactEditText view, @Nullable String keyboardType) {
        int i7;
        Intrinsics.checkNotNullParameter(view, "view");
        if (KEYBOARD_TYPE_NUMERIC.equalsIgnoreCase(keyboardType)) {
            i7 = INPUT_TYPE_KEYBOARD_NUMBERED;
        } else if (KEYBOARD_TYPE_NUMBER_PAD.equalsIgnoreCase(keyboardType)) {
            i7 = 2;
        } else if (KEYBOARD_TYPE_DECIMAL_PAD.equalsIgnoreCase(keyboardType)) {
            i7 = INPUT_TYPE_KEYBOARD_DECIMAL_PAD;
        } else if (KEYBOARD_TYPE_EMAIL_ADDRESS.equalsIgnoreCase(keyboardType)) {
            if (INSTANCE.shouldHideCursorForEmailTextInput()) {
                view.setCursorVisible(false);
            }
            i7 = 33;
        } else if (KEYBOARD_TYPE_PHONE_PAD.equalsIgnoreCase(keyboardType)) {
            i7 = 3;
        } else if (KEYBOARD_TYPE_VISIBLE_PASSWORD.equalsIgnoreCase(keyboardType)) {
            i7 = 144;
        } else {
            i7 = "url".equalsIgnoreCase(keyboardType) ? 16 : 1;
        }
        Companion companion = INSTANCE;
        companion.updateStagedInputTypeFlag(view, 15, i7);
        companion.checkPasswordType(view);
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.LETTER_SPACING)
    public final void setLetterSpacing(@NotNull ReactEditText view, float letterSpacing) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setLetterSpacingPt(letterSpacing);
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.LINE_HEIGHT)
    public final void setLineHeight(@NotNull ReactEditText view, int lineHeight) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setLineHeight(lineHeight);
    }

    @ReactProp(defaultFloat = Float.NaN, name = ViewProps.MAX_FONT_SIZE_MULTIPLIER)
    public final void setMaxFontSizeMultiplier(@NotNull ReactEditText view, float maxFontSizeMultiplier) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setMaxFontSizeMultiplier(maxFontSizeMultiplier);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043 A[PHI: r1
      0x0043: PHI (r1v7 android.text.InputFilter[]) = (r1v5 android.text.InputFilter[]), (r1v0 android.text.InputFilter[]), (r1v0 android.text.InputFilter[]) binds: [B:27:0x0076, B:5:0x0013, B:14:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    @ReactProp(name = "maxLength")
    public final void setMaxLength(@NotNull ReactEditText view, @Nullable Integer maxLength) {
        Intrinsics.checkNotNullParameter(view, "view");
        InputFilter[] filters = view.getFilters();
        InputFilter[] inputFilterArr = EMPTY_FILTERS;
        if (maxLength == null) {
            Intrinsics.e(filters);
            if (filters.length == 0) {
                filters = inputFilterArr;
            } else {
                LinkedList linkedList = new LinkedList();
                q qVarA = AbstractC1859i.a(filters);
                while (qVarA.hasNext()) {
                    InputFilter inputFilter = (InputFilter) qVarA.next();
                    if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                        linkedList.add(inputFilter);
                    }
                }
                if (linkedList.isEmpty()) {
                    filters = inputFilterArr;
                } else {
                    filters = (InputFilter[]) linkedList.toArray(new InputFilter[0]);
                }
            }
        } else {
            Intrinsics.e(filters);
            if (filters.length == 0) {
                filters = new InputFilter[]{new InputFilter.LengthFilter(maxLength.intValue())};
            } else {
                int length = filters.length;
                boolean z3 = false;
                for (int i7 = 0; i7 < length; i7++) {
                    if (filters[i7] instanceof InputFilter.LengthFilter) {
                        filters[i7] = new InputFilter.LengthFilter(maxLength.intValue());
                        z3 = true;
                    }
                }
                if (!z3) {
                    inputFilterArr = new InputFilter[filters.length + 1];
                    System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
                    filters[filters.length] = new InputFilter.LengthFilter(maxLength.intValue());
                    filters = inputFilterArr;
                }
            }
        }
        view.setFilters(filters);
    }

    @ReactProp(defaultBoolean = false, name = "multiline")
    public final void setMultiline(@NotNull ReactEditText view, boolean multiline) {
        Intrinsics.checkNotNullParameter(view, "view");
        INSTANCE.updateStagedInputTypeFlag(view, multiline ? 0 : 131072, multiline ? 131072 : 0);
    }

    @ReactProp(defaultInt = 1, name = ViewProps.NUMBER_OF_LINES)
    public final void setNumLines(@NotNull ReactEditText view, int numLines) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setLines(numLines);
    }

    @ReactProp(defaultBoolean = false, name = "onContentSizeChange")
    public final void setOnContentSizeChange(@NotNull ReactEditText view, boolean onContentSizeChange) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (onContentSizeChange) {
            view.setContentSizeWatcher(new ReactTextContentSizeWatcher(view));
        } else {
            view.setContentSizeWatcher(null);
        }
    }

    @ReactProp(defaultBoolean = false, name = "onKeyPress")
    public final void setOnKeyPress(@NotNull ReactEditText view, boolean onKeyPress) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnKeyPress(onKeyPress);
    }

    @ReactProp(defaultBoolean = false, name = "onScroll")
    public final void setOnScroll(@NotNull ReactEditText view, boolean onScroll) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (onScroll) {
            view.setScrollWatcher(new ReactTextScrollWatcher(view));
        } else {
            view.setScrollWatcher(null);
        }
    }

    @ReactProp(defaultBoolean = false, name = "onSelectionChange")
    public final void setOnSelectionChange(@NotNull ReactEditText view, boolean onSelectionChange) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (onSelectionChange) {
            view.setSelectionWatcher$ReactAndroid_release(new ReactTextSelectionWatcher(view));
        } else {
            view.setSelectionWatcher$ReactAndroid_release(null);
        }
    }

    @ReactProp(name = ViewProps.OVERFLOW)
    public final void setOverflow(@NotNull ReactEditText view, @Nullable String overflow) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOverflow(overflow);
    }

    @ReactProp(name = ReactTextInputShadowNode.PROP_PLACEHOLDER)
    public final void setPlaceholder(@NotNull ReactEditText view, @Nullable String placeholder) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPlaceholder(placeholder);
    }

    @ReactProp(customType = "Color", name = "placeholderTextColor")
    public final void setPlaceholderTextColor(@NotNull ReactEditText view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (color != null) {
            view.setHintTextColor(color.intValue());
            return;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setHintTextColor(DefaultStyleValuesUtil.getDefaultTextColorHint(context));
    }

    public final void setReactTextViewManagerCallback(@Nullable ReactTextViewManagerCallback reactTextViewManagerCallback) {
        this.reactTextViewManagerCallback = reactTextViewManagerCallback;
    }

    @ReactProp(name = "returnKeyLabel")
    public final void setReturnKeyLabel(@NotNull ReactEditText view, @Nullable String returnKeyLabel) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setImeActionLabel(returnKeyLabel, IME_ACTION_ID);
    }

    @ReactProp(name = "returnKeyType")
    public final void setReturnKeyType(@NotNull ReactEditText view, @Nullable String returnKeyType) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setReturnKeyType(returnKeyType);
    }

    @ReactProp(defaultBoolean = false, name = "secureTextEntry")
    public final void setSecureTextEntry(@NotNull ReactEditText view, boolean password) {
        Intrinsics.checkNotNullParameter(view, "view");
        Companion companion = INSTANCE;
        companion.updateStagedInputTypeFlag(view, 144, password ? 128 : 0);
        companion.checkPasswordType(view);
    }

    @ReactProp(defaultBoolean = false, name = "selectTextOnFocus")
    public final void setSelectTextOnFocus(@NotNull ReactEditText view, boolean selectTextOnFocus) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSelectTextOnFocus(selectTextOnFocus);
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public final void setSelectionColor(@NotNull ReactEditText view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (color != null) {
            view.setHighlightColor(color.intValue());
            return;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setHighlightColor(DefaultStyleValuesUtil.getDefaultTextColorHighlight(context));
    }

    @ReactProp(customType = "Color", name = "selectionHandleColor")
    public final void setSelectionHandleColor(@NotNull ReactEditText view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            Drawable textSelectHandle = view.getTextSelectHandle();
            Drawable drawableMutate = textSelectHandle != null ? textSelectHandle.mutate() : null;
            if (drawableMutate == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Drawable textSelectHandleLeft = view.getTextSelectHandleLeft();
            Drawable drawableMutate2 = textSelectHandleLeft != null ? textSelectHandleLeft.mutate() : null;
            if (drawableMutate2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Drawable textSelectHandleRight = view.getTextSelectHandleRight();
            Drawable drawableMutate3 = textSelectHandleRight != null ? textSelectHandleRight.mutate() : null;
            if (drawableMutate3 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (color != null) {
                BlendModeColorFilter blendModeColorFilter = new BlendModeColorFilter(color.intValue(), BlendMode.SRC_IN);
                drawableMutate.setColorFilter(blendModeColorFilter);
                drawableMutate2.setColorFilter(blendModeColorFilter);
                drawableMutate3.setColorFilter(blendModeColorFilter);
            } else {
                drawableMutate.clearColorFilter();
                drawableMutate2.clearColorFilter();
                drawableMutate3.clearColorFilter();
            }
            view.setTextSelectHandle(drawableMutate);
            view.setTextSelectHandleLeft(drawableMutate2);
            view.setTextSelectHandleRight(drawableMutate3);
            return;
        }
        if (i7 == 28) {
            return;
        }
        int length = DRAWABLE_HANDLE_RESOURCES.length;
        for (int i10 = 0; i10 < length; i10++) {
            try {
                Field declaredField = view.getClass().getDeclaredField(DRAWABLE_HANDLE_RESOURCES[i10]);
                declaredField.setAccessible(true);
                int i11 = declaredField.getInt(view);
                if (i11 == 0) {
                    return;
                }
                Drawable drawable = view.getContext().getDrawable(i11);
                Drawable drawableMutate4 = drawable != null ? drawable.mutate() : null;
                if (drawableMutate4 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (color != null) {
                    drawableMutate4.setColorFilter(color.intValue(), PorterDuff.Mode.SRC_IN);
                } else {
                    drawableMutate4.clearColorFilter();
                }
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                declaredField2.setAccessible(true);
                Object obj = declaredField2.get(view);
                if (obj == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Field declaredField3 = obj.getClass().getDeclaredField(DRAWABLE_HANDLE_FIELDS[i10]);
                declaredField3.setAccessible(true);
                declaredField3.set(obj, drawableMutate4);
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
        }
    }

    @ReactProp(name = "submitBehavior")
    public final void setSubmitBehavior(@NotNull ReactEditText view, @Nullable String submitBehavior) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSubmitBehavior(submitBehavior);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        if (r5.equals("auto") == false) goto L32;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @com.facebook.react.uimanager.annotations.ReactProp(name = com.facebook.react.uimanager.ViewProps.TEXT_ALIGN)
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setTextAlign(@org.jetbrains.annotations.NotNull com.facebook.react.views.textinput.ReactEditText r4, @org.jetbrains.annotations.Nullable java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "justify"
            boolean r0 = r0.equals(r5)
            r1 = 3
            r2 = 26
            if (r0 == 0) goto L1c
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r2) goto L18
            com.bumptech.glide.load.resource.bitmap.n.x(r4)
        L18:
            r4.setGravityHorizontal$ReactAndroid_release(r1)
            return
        L1c:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L23
            com.bumptech.glide.load.resource.bitmap.n.D(r4)
        L23:
            r0 = 0
            if (r5 == 0) goto L6e
            int r2 = r5.hashCode()
            switch(r2) {
                case -1364013995: goto L52;
                case 3005871: goto L49;
                case 3317767: goto L3c;
                case 108511772: goto L2e;
                default: goto L2d;
            }
        L2d:
            goto L5a
        L2e:
            java.lang.String r1 = "right"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L37
            goto L5a
        L37:
            r5 = 5
            r4.setGravityHorizontal$ReactAndroid_release(r5)
            return
        L3c:
            java.lang.String r2 = "left"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L45
            goto L5a
        L45:
            r4.setGravityHorizontal$ReactAndroid_release(r1)
            return
        L49:
            java.lang.String r1 = "auto"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L6e
            goto L5a
        L52:
            java.lang.String r1 = "center"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L69
        L5a:
            java.lang.String r1 = "Invalid textAlign: "
            java.lang.String r5 = r1.concat(r5)
            java.lang.String r1 = "ReactNative"
            p229p2.a.v(r1, r5)
            r4.setGravityHorizontal$ReactAndroid_release(r0)
            return
        L69:
            r5 = 1
            r4.setGravityHorizontal$ReactAndroid_release(r5)
            return
        L6e:
            r4.setGravityHorizontal$ReactAndroid_release(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.setTextAlign(com.facebook.react.views.textinput.ReactEditText, java.lang.String):void");
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
    public final void setTextAlignVertical(@org.jetbrains.annotations.NotNull com.facebook.react.views.textinput.ReactEditText r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
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
            r3.setGravityVertical$ReactAndroid_release(r4)
            return
        L2a:
            java.lang.String r1 = "center"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L33
            goto L41
        L33:
            r4 = 16
            r3.setGravityVertical$ReactAndroid_release(r4)
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
            r3.setGravityVertical$ReactAndroid_release(r0)
            return
        L50:
            r4 = 80
            r3.setGravityVertical$ReactAndroid_release(r4)
            return
        L56:
            r3.setGravityVertical$ReactAndroid_release(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.textinput.ReactTextInputManager.setTextAlignVertical(com.facebook.react.views.textinput.ReactEditText, java.lang.String):void");
    }

    @ReactProp(name = "autoComplete")
    public final void setTextContentType(@NotNull ReactEditText view, @Nullable String autoComplete) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (autoComplete == null) {
            setImportantForAutofill(view, 2);
            return;
        }
        if ("off".equals(autoComplete)) {
            setImportantForAutofill(view, 2);
            return;
        }
        Map<String, String> map = REACT_PROPS_AUTOFILL_HINTS_MAP;
        if (!map.containsKey(autoComplete)) {
            p229p2.a.v("ReactNative", "Invalid autoComplete: ".concat(autoComplete));
            setImportantForAutofill(view, 2);
            return;
        }
        String[] strArr = new String[1];
        String str = map.get(autoComplete);
        if (str == null) {
            throw new IllegalStateException("Required value was null.");
        }
        strArr[0] = str;
        setAutofillHints(view, strArr);
    }

    @ReactProp(name = ViewProps.TEXT_DECORATION_LINE)
    public final void setTextDecorationLine(@NotNull ReactEditText view, @Nullable String textDecorationLineString) {
        Collection collectionU;
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPaintFlags(view.getPaintFlags() & (-25));
        if (textDecorationLineString == null) {
            return;
        }
        List listC = new Regex(" ").c(textDecorationLineString);
        if (listC.isEmpty()) {
            collectionU = z.f38935a;
            break;
        }
        ListIterator listIterator = listC.listIterator(listC.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collectionU = CollectionsKt.U(listC, listIterator.nextIndex() + 1);
                    break;
                }
            } else {
                collectionU = z.f38935a;
                break;
            }
        }
        for (String str : (String[]) collectionU.toArray(new String[0])) {
            if (Intrinsics.c(str, "underline")) {
                view.setPaintFlags(view.getPaintFlags() | 8);
            } else if (Intrinsics.c(str, "line-through")) {
                view.setPaintFlags(view.getPaintFlags() | 16);
            }
        }
    }

    @ReactProp(customType = "Color", name = "underlineColorAndroid")
    public final void setUnderlineColor(@NotNull ReactEditText view, @Nullable Integer underlineColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        Drawable background = view.getBackground();
        if (background == null) {
            return;
        }
        if (background.getConstantState() != null) {
            try {
                Drawable drawableMutate = background.mutate();
                if (drawableMutate == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                background = drawableMutate;
            } catch (NullPointerException e10) {
                p229p2.a.i(TAG, "NullPointerException when setting underlineColorAndroid for TextInput", e10);
            }
        }
        if (underlineColor == null) {
            background.clearColorFilter();
        } else {
            background.setColorFilter(underlineColor.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @ReactProp(defaultBoolean = true, name = "showSoftInputOnFocus")
    public final void showKeyboardOnFocus(@NotNull ReactEditText view, boolean showKeyboardOnFocus) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setShowSoftInputOnFocus(showKeyboardOnFocus);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NotNull ThemedReactContext reactContext, @NotNull ReactEditText editText) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(editText, "editText");
        editText.setEventDispatcher(INSTANCE.getEventDispatcher(reactContext, editText));
        editText.addTextChangedListener(new ReactTextInputTextWatcher(reactContext, editText));
        editText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0052d(1, reactContext, editText));
        editText.setOnEditorActionListener(new b(editText, reactContext, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ReactBaseTextShadowNode createShadowNodeInstance() {
        return new ReactTextInputShadowNode(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ReactEditText createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ReactEditText reactEditText = new ReactEditText(context);
        reactEditText.setInputType(reactEditText.getInputType() & (-131073));
        reactEditText.setReturnKeyType("done");
        reactEditText.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return reactEditText;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull ReactEditText view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        view.maybeUpdateTypeface();
        view.commitStagedInputType$ReactAndroid_release();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(@NotNull ReactEditText view, int left, int top2, int right, int bottom) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPadding(left, top2, right, bottom);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(@NotNull ReactEditText view, @NotNull Object extraData) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        if (extraData instanceof ReactTextUpdate) {
            ReactTextUpdate reactTextUpdate = (ReactTextUpdate) extraData;
            int paddingLeft = (int) reactTextUpdate.getPaddingLeft();
            int paddingTop = (int) reactTextUpdate.getPaddingTop();
            int paddingRight = (int) reactTextUpdate.getPaddingRight();
            int paddingBottom = (int) reactTextUpdate.getPaddingBottom();
            int length = -1;
            if (paddingLeft != -1 || paddingTop != -1 || paddingRight != -1 || paddingBottom != -1) {
                if (paddingLeft == -1) {
                    paddingLeft = view.getPaddingLeft();
                }
                if (paddingTop == -1) {
                    paddingTop = view.getPaddingTop();
                }
                if (paddingRight == -1) {
                    paddingRight = view.getPaddingRight();
                }
                if (paddingBottom == -1) {
                    paddingBottom = view.getPaddingBottom();
                }
                view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
            }
            if (reactTextUpdate.getContainsImages()) {
                TextInlineImageSpan.INSTANCE.possiblyUpdateInlineImageSpans(reactTextUpdate.getText(), view);
            }
            if (view.getSelectionStart() == view.getSelectionEnd()) {
                Editable text = view.getText();
                length = reactTextUpdate.getText().length() - ((text != null ? text.length() : 0) - view.getSelectionStart());
            }
            view.maybeSetTextFromState(reactTextUpdate);
            view.maybeSetSelection(reactTextUpdate.getJsEventCounter(), length, length);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Object updateState(@NotNull ReactEditText view, @NotNull ReactStylesDiffMap props, @NotNull StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(stateWrapper, "stateWrapper");
        if (ReactEditText.INSTANCE.getDEBUG_MODE()) {
            p229p2.a.h(TAG, "updateState: [" + view.getId() + "]");
        }
        if (view.getStateWrapper() == null) {
            view.setPadding(0, 0, 0, 0);
        }
        view.setStateWrapper(stateWrapper);
        ReadableMapBuffer stateDataMapBuffer = stateWrapper.getStateDataMapBuffer();
        if (stateDataMapBuffer != null) {
            return getReactTextUpdate(view, props, stateDataMapBuffer);
        }
        return null;
    }

    private final void setImportantForAutofill(ReactEditText view, int mode) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        view.setImportantForAutofill(mode);
    }

    @NotNull
    public final ReactBaseTextShadowNode createShadowNodeInstance(@Nullable ReactTextViewManagerCallback reactTextViewManagerCallback) {
        return new ReactTextInputShadowNode(reactTextViewManagerCallback);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Deprecated(message = "Deprecated in Java")
    public void receiveCommand(@NotNull ReactEditText reactEditText, int commandId, @Nullable ReadableArray args) {
        Intrinsics.checkNotNullParameter(reactEditText, "reactEditText");
        if (commandId == 1) {
            receiveCommand(reactEditText, "focus", args);
        } else if (commandId == 2) {
            receiveCommand(reactEditText, "blur", args);
        } else {
            if (commandId != 4) {
                return;
            }
            receiveCommand(reactEditText, "setTextAndSelection", args);
        }
    }

    @Nullable
    public final Object getReactTextUpdate(@NotNull ReactEditText view, @NotNull ReactStylesDiffMap props, @NotNull MapBuffer state) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getCount() == 0) {
            return null;
        }
        MapBuffer mapBuffer = state.getMapBuffer(0);
        MapBuffer mapBuffer2 = state.getMapBuffer(1);
        TextLayoutManager textLayoutManager = TextLayoutManager.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ReactTextUpdate.INSTANCE.buildReactTextUpdateFromState(textLayoutManager.getOrCreateSpannableForText(context, mapBuffer, this.reactTextViewManagerCallback), state.getInt(3), TextAttributeProps.getTextAlignment(props, textLayoutManager.isRTL(mapBuffer), view.getGravityHorizontal$ReactAndroid_release()), TextAttributeProps.getTextBreakStrategy(mapBuffer2.getString(2)), TextAttributeProps.getJustificationMode(props, Build.VERSION.SDK_INT >= 26 ? view.getJustificationMode() : 0));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NotNull ReactEditText reactEditText, @NotNull String commandId, @Nullable ReadableArray args) {
        Intrinsics.checkNotNullParameter(reactEditText, "reactEditText");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        switch (commandId.hashCode()) {
            case -1699362314:
                if (!commandId.equals("blurTextInput")) {
                    return;
                }
                break;
            case 3027047:
                if (!commandId.equals("blur")) {
                    return;
                }
                break;
            case 97604824:
                if (!commandId.equals("focus")) {
                    return;
                }
                reactEditText.requestFocusFromJS();
                return;
            case 1427010500:
                if (commandId.equals("setTextAndSelection")) {
                    if (args != null) {
                        int i7 = args.getInt(0);
                        if (i7 == -1) {
                            return;
                        }
                        int i10 = args.getInt(2);
                        int i11 = args.getInt(3);
                        if (i11 == -1) {
                            i11 = i10;
                        }
                        if (!args.isNull(1)) {
                            reactEditText.maybeSetTextFromJS(getReactTextUpdate(args.getString(1), i7));
                        }
                        reactEditText.maybeSetSelection(i7, i10, i11);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                return;
            case 1690703013:
                if (!commandId.equals("focusTextInput")) {
                    return;
                }
                reactEditText.requestFocusFromJS();
                return;
            default:
                return;
        }
        reactEditText.clearFocusFromJS$ReactAndroid_release();
    }
}
