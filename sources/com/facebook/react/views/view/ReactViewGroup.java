package com.facebook.react.views.view;

import N8.q0;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import androidx.camera.video.u;
import androidx.transition.l0;
import com.facebook.react.R;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.touch.OnInterceptTouchEventListener;
import com.facebook.react.touch.ReactHitSlopView;
import com.facebook.react.touch.ReactInterceptingViewGroup;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.BlendModeHelper;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.MeasureSpecAssertions;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactAxOrderHelper;
import com.facebook.react.uimanager.ReactClippingProhibitedView;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.ReactOverflowViewWithInset;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.ReactZIndexedViewGroup;
import com.facebook.react.uimanager.ViewGroupDrawingOrderHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.uimanager.style.Overflow;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 ¿\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0004¾\u0001¿\u0001B\u0011\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010;\u001a\u00020<H\u0002J\r\u0010=\u001a\u00020<H\u0010¢\u0006\u0002\b>J\u0018\u0010D\u001a\u00020<2\u0006\u0010E\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\u0011H\u0014J0\u0010G\u001a\u00020<2\u0006\u0010H\u001a\u00020\u00132\u0006\u0010I\u001a\u00020\u00112\u0006\u0010J\u001a\u00020\u00112\u0006\u0010K\u001a\u00020\u00112\u0006\u0010L\u001a\u00020\u0011H\u0014J\b\u0010M\u001a\u00020<H\u0017J\u0010\u0010N\u001a\u00020<2\u0006\u0010O\u001a\u00020PH\u0017J\u0010\u0010Q\u001a\u00020<2\u0006\u0010R\u001a\u00020\u0011H\u0016J\u0012\u0010S\u001a\u00020<2\b\u0010T\u001a\u0004\u0018\u00010UH\u0007J\u0010\u0010V\u001a\u00020<2\u0006\u0010W\u001a\u000202H\u0016J\u0010\u0010X\u001a\u00020\u00132\u0006\u0010Y\u001a\u00020ZH\u0016J\u0010\u0010[\u001a\u00020\u00132\u0006\u0010Y\u001a\u00020ZH\u0016J\u0010\u0010\\\u001a\u00020\u00132\u0006\u0010Y\u001a\u00020ZH\u0016J\u0010\u0010]\u001a\u00020\u00132\u0006\u0010^\u001a\u00020ZH\u0016J\b\u0010_\u001a\u00020\u0013H\u0016J\u000e\u0010`\u001a\u00020<2\u0006\u00103\u001a\u00020\u0013J\u0016\u0010a\u001a\u00020<2\u0006\u0010b\u001a\u00020\u00112\u0006\u0010c\u001a\u000205J\u001d\u0010d\u001a\u00020<2\u0006\u0010b\u001a\u00020\u00112\b\u0010R\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010eJ\u0010\u0010f\u001a\u00020<2\u0006\u0010g\u001a\u000205H\u0007J\u0018\u0010f\u001a\u00020<2\u0006\u0010g\u001a\u0002052\u0006\u0010b\u001a\u00020\u0011H\u0007J\u0018\u0010f\u001a\u00020<2\u0006\u0010h\u001a\u00020i2\b\u0010g\u001a\u0004\u0018\u00010jJ\u0010\u0010k\u001a\u00020<2\b\u0010l\u001a\u0004\u0018\u00010*J\u0010\u0010s\u001a\u00020<2\u0006\u0010t\u001a\u00020\rH\u0016J\b\u0010u\u001a\u00020<H\u0016J\u0018\u0010u\u001a\u00020<2\u000e\u0010v\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010wH\u0016J\u0010\u0010x\u001a\u00020<2\u0006\u0010y\u001a\u00020\u0017H\u0016J\u0010\u0010z\u001a\u00020<2\u0006\u0010{\u001a\u00020\u0011H\u0002J\u0010\u0010|\u001a\u00020\u00132\u0006\u0010}\u001a\u00020\u0017H\u0002J\"\u0010~\u001a\u00020<2\u0006\u0010\u001d\u001a\u00020\r2\u0010\b\u0002\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010wH\u0002J5\u0010\u0080\u0001\u001a\u00020<2\u0006\u0010\u001d\u001a\u00020\r2\u0007\u0010\u0081\u0001\u001a\u00020\u00112\u0007\u0010\u0082\u0001\u001a\u00020\u00112\u0010\b\u0002\u0010\u007f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010wH\u0002J\u0012\u0010\u0080\u0001\u001a\u00020<2\u0007\u0010\u0083\u0001\u001a\u00020\u0017H\u0002J-\u0010\u0084\u0001\u001a\u00020<2\u0007\u0010\u0085\u0001\u001a\u00020\u00112\u0007\u0010\u0086\u0001\u001a\u00020\u00112\u0007\u0010\u0087\u0001\u001a\u00020\u00112\u0007\u0010\u0088\u0001\u001a\u00020\u0011H\u0014J\t\u0010\u0089\u0001\u001a\u00020<H\u0014J\t\u0010\u008a\u0001\u001a\u00020\u0013H\u0002J\u0011\u0010\u008b\u0001\u001a\u00020<2\u0006\u0010}\u001a\u00020\u0017H\u0016J\u0011\u0010\u008c\u0001\u001a\u00020<2\u0006\u0010}\u001a\u00020\u0017H\u0016J\u001a\u0010\u008d\u0001\u001a\u00020<2\u0006\u0010}\u001a\u00020\u00172\u0007\u0010\u008e\u0001\u001a\u00020\u0013H\u0002J\u001b\u0010\u008f\u0001\u001a\u00020\u00112\u0007\u0010\u0090\u0001\u001a\u00020\u00112\u0007\u0010\u0091\u0001\u001a\u00020\u0011H\u0014J\u0012\u0010\u0092\u0001\u001a\u00020\u00112\u0007\u0010\u0091\u0001\u001a\u00020\u0011H\u0016J\t\u0010\u0093\u0001\u001a\u00020<H\u0016J\u0012\u0010\u0094\u0001\u001a\u00020<2\u0007\u0010\u0095\u0001\u001a\u00020\u0013H\u0014J\t\u0010\u0096\u0001\u001a\u00020<H\u0002J\u001a\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00172\u0007\u0010\u0091\u0001\u001a\u00020\u0011H\u0000¢\u0006\u0003\b\u0098\u0001J \u0010\u0099\u0001\u001a\u00020<2\u0006\u0010}\u001a\u00020\u00172\u0007\u0010\u0091\u0001\u001a\u00020\u0011H\u0000¢\u0006\u0003\b\u009a\u0001J\u0017\u0010\u009b\u0001\u001a\u00020<2\u0006\u0010y\u001a\u00020\u0017H\u0000¢\u0006\u0003\b\u009c\u0001J\u000f\u0010\u009d\u0001\u001a\u00020<H\u0000¢\u0006\u0003\b\u009e\u0001J$\u0010\u009f\u0001\u001a\u00020\u00132\b\u0010y\u001a\u0004\u0018\u00010\u00172\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0003\u0010 \u0001J\u0011\u0010¡\u0001\u001a\u00020\u00112\u0006\u0010}\u001a\u00020\u0017H\u0002J\u001a\u0010¢\u0001\u001a\u00020<2\u0006\u0010}\u001a\u00020\u00172\u0007\u0010\u0091\u0001\u001a\u00020\u0011H\u0002J\u0012\u0010£\u0001\u001a\u00020<2\u0007\u0010\u0091\u0001\u001a\u00020\u0011H\u0002J)\u0010«\u0001\u001a\u00020<2\u0006\u0010I\u001a\u00020\u00112\u0006\u0010J\u001a\u00020\u00112\u0006\u0010K\u001a\u00020\u00112\u0006\u0010L\u001a\u00020\u0011H\u0016J\u0014\u0010¬\u0001\u001a\u00020<2\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010UH\u0002J\u0013\u0010®\u0001\u001a\u00020<2\b\u0010¯\u0001\u001a\u00030°\u0001H\u0016J\u0013\u0010±\u0001\u001a\u00020<2\b\u0010¯\u0001\u001a\u00030°\u0001H\u0014J%\u0010²\u0001\u001a\u00020\u00132\b\u0010¯\u0001\u001a\u00030°\u00012\u0006\u0010}\u001a\u00020\u00172\b\u0010³\u0001\u001a\u00030´\u0001H\u0014J\u0010\u0010µ\u0001\u001a\u00020<2\u0007\u0010¶\u0001\u001a\u000205J\u0010\u0010·\u0001\u001a\u00020<2\u0007\u0010¸\u0001\u001a\u00020*J\u0007\u0010¹\u0001\u001a\u00020<J\u0019\u0010º\u0001\u001a\u00020<2\u000e\u0010»\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170¼\u0001H\u0016J\u0007\u0010½\u0001\u001a\u00020<R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u001e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00107\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u0004\u0018\u00010@X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010A\u001a\u00020@8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR$\u0010n\u001a\u00020\u00132\u0006\u0010m\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u0012\u0010¤\u0001\u001a\u0005\u0018\u00010¥\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010¦\u0001\u001a\u0004\u0018\u00010*2\t\u0010¦\u0001\u001a\u0004\u0018\u00010*8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001¨\u0006À\u0001"}, d2 = {"Lcom/facebook/react/views/view/ReactViewGroup;", "Landroid/view/ViewGroup;", "Lcom/facebook/react/touch/ReactInterceptingViewGroup;", "Lcom/facebook/react/uimanager/ReactClippingViewGroup;", "Lcom/facebook/react/uimanager/ReactPointerEventsView;", "Lcom/facebook/react/touch/ReactHitSlopView;", "Lcom/facebook/react/uimanager/ReactZIndexedViewGroup;", "Lcom/facebook/react/uimanager/ReactOverflowViewWithInset;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "overflowInset", "Landroid/graphics/Rect;", "getOverflowInset", "()Landroid/graphics/Rect;", "recycleCount", "", "_removeClippedSubviews", "", "inSubviewClippingLoop", "allChildren", "", "Landroid/view/View;", "[Landroid/view/View;", "value", "allChildrenCount", "getAllChildrenCount$ReactAndroid_release", "()I", "clippingRect", "hitSlopRect", "getHitSlopRect", "setHitSlopRect", "(Landroid/graphics/Rect;)V", ViewProps.POINTER_EVENTS, "Lcom/facebook/react/uimanager/PointerEvents;", "getPointerEvents", "()Lcom/facebook/react/uimanager/PointerEvents;", "setPointerEvents", "(Lcom/facebook/react/uimanager/PointerEvents;)V", "axOrderList", "", "", "getAxOrderList", "()Ljava/util/List;", "setAxOrderList", "(Ljava/util/List;)V", "childrenLayoutChangeListener", "Lcom/facebook/react/views/view/ReactViewGroup$ChildrenLayoutChangeListener;", "onInterceptTouchEventListener", "Lcom/facebook/react/touch/OnInterceptTouchEventListener;", ViewProps.NEEDS_OFFSCREEN_ALPHA_COMPOSITING, "backfaceOpacity", "", "backfaceVisible", "childrenRemovedWhileTransitioning", "", "accessibilityStateChangeListener", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "initView", "", "recycleView", "recycleView$ReactAndroid_release", "_drawingOrderHelper", "Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;", "drawingOrderHelper", "getDrawingOrderHelper", "()Lcom/facebook/react/uimanager/ViewGroupDrawingOrderHelper;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "requestLayout", "dispatchProvideStructure", "structure", "Landroid/view/ViewStructure;", "setBackgroundColor", ViewProps.COLOR, "setTranslucentBackgroundDrawable", AppStateModule.APP_STATE_BACKGROUND, "Landroid/graphics/drawable/Drawable;", "setOnInterceptTouchEventListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onInterceptTouchEvent", "event", "Landroid/view/MotionEvent;", "onTouchEvent", "onHoverEvent", "dispatchGenericMotionEvent", "ev", "hasOverlappingRendering", "setNeedsOffscreenAlphaCompositing", "setBorderWidth", ViewProps.POSITION, "width", "setBorderColor", "(ILjava/lang/Integer;)V", "setBorderRadius", ViewProps.BORDER_RADIUS, "property", "Lcom/facebook/react/uimanager/style/BorderRadiusProp;", "Lcom/facebook/react/uimanager/LengthPercentage;", "setBorderStyle", "style", "newValue", ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS, "getRemoveClippedSubviews", "()Z", "setRemoveClippedSubviews", "(Z)V", "getClippingRect", "outClippingRect", "updateClippingRect", "excludedViews", "", "endViewTransition", "view", "trackChildViewTransition", "childId", "isChildRemovedWhileTransitioning", "child", "updateClippingToRect", "excludedViewsSet", "updateSubviewClipStatus", "idx", "clippedSoFar", "subview", "onSizeChanged", "w", "h", "oldw", "oldh", "onAttachedToWindow", "customDrawOrderDisabled", "onViewAdded", "onViewRemoved", "checkViewClippingTag", "expectedTag", "getChildDrawingOrder", "childCount", FirebaseAnalytics.Param.INDEX, "getZIndexMappedChildIndex", "updateDrawingOrder", "dispatchSetPressed", "pressed", "resetPointerEvents", "getChildAtWithSubviewClippingEnabled", "getChildAtWithSubviewClippingEnabled$ReactAndroid_release", "addViewWithSubviewClippingEnabled", "addViewWithSubviewClippingEnabled$ReactAndroid_release", "removeViewWithSubviewClippingEnabled", "removeViewWithSubviewClippingEnabled$ReactAndroid_release", "removeAllViewsWithSubviewClippingEnabled", "removeAllViewsWithSubviewClippingEnabled$ReactAndroid_release", "isViewClipped", "(Landroid/view/View;Ljava/lang/Integer;)Z", "indexOfChildInAllChildren", "addInArray", "removeFromArray", "_overflow", "Lcom/facebook/react/uimanager/style/Overflow;", ViewProps.OVERFLOW, "getOverflow", "()Ljava/lang/String;", "setOverflow", "(Ljava/lang/String;)V", "setOverflowInset", "updateBackgroundDrawable", "drawable", "draw", "canvas", "Landroid/graphics/Canvas;", "dispatchDraw", "drawChild", "drawingTime", "", "setOpacityIfPossible", ViewProps.OPACITY, "setBackfaceVisibility", "backfaceVisibility", "setBackfaceVisibilityDependantOpacity", "addChildrenForAccessibility", "outChildren", "Ljava/util/ArrayList;", "cleanUpAxOrderListener", "ChildrenLayoutChangeListener", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactViewGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactViewGroup.kt\ncom/facebook/react/views/view/ReactViewGroup\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1015:1\n1#2:1016\n*E\n"})
public class ReactViewGroup extends ViewGroup implements ReactInterceptingViewGroup, ReactClippingViewGroup, ReactPointerEventsView, ReactHitSlopView, ReactZIndexedViewGroup, ReactOverflowViewWithInset {
    private static final int ARRAY_CAPACITY_INCREMENT = 12;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final ViewGroup.LayoutParams defaultLayoutParam = new ViewGroup.LayoutParams(0, 0);

    @Nullable
    private ViewGroupDrawingOrderHelper _drawingOrderHelper;

    @Nullable
    private Overflow _overflow;
    private boolean _removeClippedSubviews;

    @Nullable
    private AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;

    @Nullable
    private View[] allChildren;
    private int allChildrenCount;

    @Nullable
    private List<String> axOrderList;
    private float backfaceOpacity;
    private boolean backfaceVisible;

    @Nullable
    private ChildrenLayoutChangeListener childrenLayoutChangeListener;

    @Nullable
    private Set<Integer> childrenRemovedWhileTransitioning;

    @Nullable
    private Rect clippingRect;

    @Nullable
    private Rect hitSlopRect;
    private volatile boolean inSubviewClippingLoop;
    private boolean needsOffscreenAlphaCompositing;

    @Nullable
    private OnInterceptTouchEventListener onInterceptTouchEventListener;

    @NotNull
    private final Rect overflowInset;

    @NotNull
    private PointerEvents pointerEvents;
    private int recycleCount;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005JP\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0006\u0010\u0013\u001a\u00020\u0007R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/views/view/ReactViewGroup$ChildrenLayoutChangeListener;", "Landroid/view/View$OnLayoutChangeListener;", "parent", "Lcom/facebook/react/views/view/ReactViewGroup;", "<init>", "(Lcom/facebook/react/views/view/ReactViewGroup;)V", "onLayoutChange", "", "v", "Landroid/view/View;", ViewProps.LEFT, "", ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "oldLeft", "oldTop", "oldRight", "oldBottom", "shutdown", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ChildrenLayoutChangeListener implements View.OnLayoutChangeListener {

        @Nullable
        private ReactViewGroup parent;

        public ChildrenLayoutChangeListener(@Nullable ReactViewGroup reactViewGroup) {
            this.parent = reactViewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull View v3, int left, int top2, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            ReactViewGroup reactViewGroup;
            Intrinsics.checkNotNullParameter(v3, "v");
            ReactViewGroup reactViewGroup2 = this.parent;
            if (reactViewGroup2 == null || !reactViewGroup2.get_removeClippedSubviews() || (reactViewGroup = this.parent) == null) {
                return;
            }
            reactViewGroup.updateSubviewClipStatus(v3);
        }

        public final void shutdown() {
            this.parent = null;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/views/view/ReactViewGroup$Companion;", "", "<init>", "()V", "ARRAY_CAPACITY_INCREMENT", "", "defaultLayoutParam", "Landroid/view/ViewGroup$LayoutParams;", "setViewClipped", "", "view", "Landroid/view/View;", "clipped", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setViewClipped(View view, boolean clipped) {
            view.setTag(R.id.view_clipped, Boolean.valueOf(clipped));
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Overflow.values().length];
            try {
                iArr[Overflow.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Overflow.SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Overflow.VISIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ReactViewGroup(@Nullable Context context) {
        super(context);
        this.overflowInset = new Rect();
        this.pointerEvents = PointerEvents.AUTO;
        initView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addChildrenForAccessibility$lambda$1(ReactViewGroup reactViewGroup, boolean z3) {
        if (z3) {
            return;
        }
        ReactAxOrderHelper.restoreFocusability(reactViewGroup);
    }

    private final void addInArray(View child, int index) {
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i7 = this.allChildrenCount;
        int length = viewArr.length;
        if (index == i7) {
            if (length == i7) {
                View[] viewArr2 = new View[length + 12];
                System.arraycopy(viewArr, 0, viewArr2, 0, length);
                this.allChildren = viewArr2;
                viewArr = viewArr2;
            }
            int i10 = this.allChildrenCount;
            this.allChildrenCount = i10 + 1;
            viewArr[i10] = child;
            return;
        }
        if (index >= i7) {
            throw new IndexOutOfBoundsException(u.h(index, "index=", i7, " count="));
        }
        if (length == i7) {
            View[] viewArr3 = new View[length + 12];
            System.arraycopy(viewArr, 0, viewArr3, 0, index);
            System.arraycopy(viewArr, index, viewArr3, index + 1, i7 - index);
            this.allChildren = viewArr3;
            viewArr = viewArr3;
        } else {
            System.arraycopy(viewArr, index, viewArr, index + 1, i7 - index);
        }
        viewArr[index] = child;
        this.allChildrenCount++;
    }

    private final void checkViewClippingTag(View child, boolean expectedTag) {
        if (this.inSubviewClippingLoop) {
            Object tag = child.getTag(R.id.view_clipped);
            if (!Boolean.valueOf(expectedTag).equals(tag)) {
                ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.RVG_ON_VIEW_REMOVED, new ReactNoCrashSoftException("View clipping tag mismatch: tag=" + tag + " expected=" + expectedTag));
            }
        }
        if (this._removeClippedSubviews) {
            child.setTag(R.id.view_clipped, Boolean.valueOf(expectedTag));
        } else {
            child.setTag(R.id.view_clipped, null);
        }
    }

    private final boolean customDrawOrderDisabled() {
        return getId() != -1 && ViewUtil.getUIManagerType(getId()) == 2;
    }

    private final ViewGroupDrawingOrderHelper getDrawingOrderHelper() {
        if (this._drawingOrderHelper == null) {
            this._drawingOrderHelper = new ViewGroupDrawingOrderHelper(this);
        }
        ViewGroupDrawingOrderHelper viewGroupDrawingOrderHelper = this._drawingOrderHelper;
        if (viewGroupDrawingOrderHelper != null) {
            return viewGroupDrawingOrderHelper;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final int indexOfChildInAllChildren(View child) {
        int i7 = this.allChildrenCount;
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        for (int i10 = 0; i10 < i7; i10++) {
            if (viewArr[i10] == child) {
                return i10;
            }
        }
        return -1;
    }

    private final void initView() {
        setClipChildren(false);
        this._removeClippedSubviews = false;
        this.inSubviewClippingLoop = false;
        this.allChildren = null;
        this.allChildrenCount = 0;
        this.clippingRect = null;
        setHitSlopRect(null);
        this._overflow = Overflow.VISIBLE;
        setPointerEvents(PointerEvents.AUTO);
        this.childrenLayoutChangeListener = null;
        this.onInterceptTouchEventListener = null;
        this.needsOffscreenAlphaCompositing = false;
        this._drawingOrderHelper = null;
        this.backfaceOpacity = 1.0f;
        this.backfaceVisible = true;
        this.childrenRemovedWhileTransitioning = null;
    }

    private final boolean isChildRemovedWhileTransitioning(View child) {
        Set<Integer> set = this.childrenRemovedWhileTransitioning;
        return set != null && set.contains(Integer.valueOf(child.getId()));
    }

    private final boolean isViewClipped(View view, Integer index) {
        if (view == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Object tag = view.getTag(R.id.view_clipped);
        if (tag != null) {
            return ((Boolean) tag).booleanValue();
        }
        ViewParent parent = view.getParent();
        boolean zIsChildRemovedWhileTransitioning = isChildRemovedWhileTransitioning(view);
        if (index != null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.RVG_IS_VIEW_CLIPPED, new ReactNoCrashSoftException("View missing clipping tag: index=" + index + " parentNull=" + (parent == null) + " parentThis=" + (parent == this) + " transitioning=" + zIsChildRemovedWhileTransitioning));
        }
        if (parent == null || zIsChildRemovedWhileTransitioning) {
            return true;
        }
        if (parent == this) {
            return false;
        }
        throw new IllegalStateException("Check failed.");
    }

    private final void removeFromArray(int index) {
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i7 = this.allChildrenCount;
        if (index == i7 - 1) {
            int i10 = i7 - 1;
            this.allChildrenCount = i10;
            viewArr[i10] = null;
        } else {
            if (index < 0 || index >= i7) {
                throw new IndexOutOfBoundsException();
            }
            System.arraycopy(viewArr, index + 1, viewArr, index, (i7 - index) - 1);
            int i11 = this.allChildrenCount - 1;
            this.allChildrenCount = i11;
            viewArr[i11] = null;
        }
    }

    private final void resetPointerEvents() {
        setPointerEvents(PointerEvents.AUTO);
    }

    private final void trackChildViewTransition(int childId) {
        if (this.childrenRemovedWhileTransitioning == null) {
            this.childrenRemovedWhileTransitioning = new LinkedHashSet();
        }
        Set<Integer> set = this.childrenRemovedWhileTransitioning;
        if (set != null) {
            set.add(Integer.valueOf(childId));
        }
    }

    private final void updateBackgroundDrawable(Drawable drawable) {
        super.setBackground(drawable);
    }

    private final void updateClippingToRect(Rect clippingRect, Set<Integer> excludedViewsSet) {
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.inSubviewClippingLoop = true;
        int i7 = this.allChildrenCount;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            try {
                updateSubviewClipStatus(clippingRect, i11, i10, excludedViewsSet);
                if (isViewClipped(viewArr[i11], Integer.valueOf(i11))) {
                    i10++;
                }
                if (i11 - i10 > getChildCount()) {
                    int childCount = getChildCount();
                    int i12 = this.allChildrenCount;
                    int i13 = this.recycleCount;
                    int size = excludedViewsSet != null ? excludedViewsSet.size() : 0;
                    StringBuilder sbP = q0.p(i11, "Invalid clipping state. i=", i10, " clippedSoFar=", " count=");
                    u.u(sbP, childCount, " allChildrenCount=", i12, " recycleCount=");
                    sbP.append(i13);
                    sbP.append("  excludedViews=");
                    sbP.append(size);
                    throw new IllegalStateException(sbP.toString());
                }
            } catch (IndexOutOfBoundsException e10) {
                HashSet hashSet = new HashSet();
                int i14 = 0;
                for (int i15 = 0; i15 < i11; i15++) {
                    i14 += isViewClipped(viewArr[i15], Integer.valueOf(i15)) ? 1 : 0;
                    hashSet.add(viewArr[i15]);
                }
                int childCount2 = getChildCount();
                int i16 = this.allChildrenCount;
                int i17 = this.recycleCount;
                int size2 = hashSet.size();
                int size3 = excludedViewsSet != null ? excludedViewsSet.size() : 0;
                StringBuilder sbP2 = q0.p(i11, "Invalid clipping state. i=", i10, " clippedSoFar=", " count=");
                u.u(sbP2, childCount2, " allChildrenCount=", i16, " recycleCount=");
                u.u(sbP2, i17, " realClippedSoFar=", i14, " uniqueViewsCount=");
                sbP2.append(size2);
                sbP2.append(" excludedViews=");
                sbP2.append(size3);
                throw new IllegalStateException(sbP2.toString(), e10);
            }
        }
        this.inSubviewClippingLoop = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateClippingToRect$default(ReactViewGroup reactViewGroup, Rect rect, Set set, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateClippingToRect");
        }
        if ((i7 & 2) != 0) {
            set = null;
        }
        reactViewGroup.updateClippingToRect(rect, set);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x007c  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void updateSubviewClipStatus(Rect clippingRect, int idx, int clippedSoFar, Set<Integer> excludedViewsSet) {
        View view;
        boolean z3;
        boolean z8;
        int i7;
        View view2;
        UiThreadUtil.assertOnUiThread();
        View[] viewArr = this.allChildren;
        if (viewArr != null) {
            view2 = viewArr[idx];
        } else {
            view = 0;
        }
        if (view == 0) {
            view = view2;
            throw new IllegalStateException("Required value was null.");
        }
        boolean zIntersects = clippingRect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        Animation animation = view.getAnimation();
        boolean z10 = false;
        if (animation == null || animation.hasEnded()) {
            view = view2;
            view = view2;
            z3 = false;
        } else {
            z3 = true;
        }
        if (excludedViewsSet == null || !excludedViewsSet.contains(Integer.valueOf(view.getId()))) {
            view = view2;
            view = view2;
            z8 = false;
        } else {
            z8 = true;
        }
        boolean z11 = excludedViewsSet != null;
        if (zIntersects) {
            if (z8) {
                i7 = idx - clippedSoFar;
                if (i7 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                Companion.setViewClipped(view, false);
                addViewInLayout(view, i7, defaultLayoutParam, true);
                invalidate();
            } else {
                i7 = idx - clippedSoFar;
                if (i7 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                Companion.setViewClipped(view, false);
                addViewInLayout(view, i7, defaultLayoutParam, true);
                invalidate();
            }
            z11 = true;
        } else {
            view = view2;
            if (!isViewClipped(view, Integer.valueOf(idx)) && !z3 && view != getFocusedChild() && !z8) {
                Companion.setViewClipped(view, true);
                removeViewInLayout(view);
            } else if ((z8 || zIntersects) && isViewClipped(view, Integer.valueOf(idx))) {
                i7 = idx - clippedSoFar;
                if (i7 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                Companion.setViewClipped(view, false);
                addViewInLayout(view, i7, defaultLayoutParam, true);
                invalidate();
            } else if (zIntersects) {
            }
            z11 = true;
        }
        if (z11) {
            ReactClippingViewGroup reactClippingViewGroup = view instanceof ReactClippingViewGroup ? (ReactClippingViewGroup) view : null;
            if (reactClippingViewGroup != null && reactClippingViewGroup.get_removeClippedSubviews()) {
                z10 = true;
            }
            if (z10) {
                ((ReactClippingViewGroup) view).updateClippingRect(excludedViewsSet);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateSubviewClipStatus$default(ReactViewGroup reactViewGroup, Rect rect, int i7, int i10, Set set, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSubviewClipStatus");
        }
        if ((i11 & 8) != 0) {
            set = null;
        }
        reactViewGroup.updateSubviewClipStatus(rect, i7, i10, set);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(@NotNull ArrayList<View> outChildren) {
        Intrinsics.checkNotNullParameter(outChildren, "outChildren");
        ReactViewGroup reactViewGroup = (ReactViewGroup) getTag(R.id.accessibility_order_parent);
        List<String> list = reactViewGroup != null ? reactViewGroup.axOrderList : null;
        List<String> list2 = this.axOrderList;
        if (list2 == null) {
            if (list == null) {
                super.addChildrenForAccessibility(outChildren);
                return;
            }
            if (!isFocusable()) {
                super.addChildrenForAccessibility(outChildren);
                return;
            }
            if (isFocusable() && (getContentDescription() == null || Intrinsics.c(getContentDescription(), ""))) {
                super.addChildrenForAccessibility(outChildren);
                ReactAxOrderHelper.INSTANCE.disableFocusForSubtree(this, list);
                return;
            } else {
                if (!isFocusable() || getContentDescription() == null) {
                    return;
                }
                Intrinsics.c(getContentDescription(), "");
                return;
            }
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        if (this.accessibilityStateChangeListener == null && accessibilityManager != null) {
            AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: com.facebook.react.views.view.a
                @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                public final void onAccessibilityStateChanged(boolean z3) {
                    ReactViewGroup.addChildrenForAccessibility$lambda$1(this.f21845a, z3);
                }
            };
            accessibilityManager.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
            this.accessibilityStateChangeListener = accessibilityStateChangeListener;
        }
        int size = list2.size();
        View[] viewArr = new View[size];
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ReactAxOrderHelper reactAxOrderHelper = ReactAxOrderHelper.INSTANCE;
            View childAt = getChildAt(i7);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            reactAxOrderHelper.buildAxOrderList(childAt, list2, viewArr);
        }
        for (int i10 = 0; i10 < size; i10++) {
            View view = viewArr[i10];
            if (view != null) {
                if (view.isFocusable()) {
                    outChildren.add(view);
                } else {
                    view.addChildrenForAccessibility(outChildren);
                }
            }
        }
    }

    public final void addViewWithSubviewClippingEnabled$ReactAndroid_release(@NotNull final View child, int index) {
        Intrinsics.checkNotNullParameter(child, "child");
        if (!this._removeClippedSubviews) {
            throw new IllegalStateException("Check failed.");
        }
        Companion.setViewClipped(child, true);
        addInArray(child, index);
        Rect rect = this.clippingRect;
        if (rect == null) {
            throw new IllegalStateException("Required value was null.");
        }
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.inSubviewClippingLoop = true;
        int i7 = 0;
        for (int i10 = 0; i10 < index; i10++) {
            if (isViewClipped(viewArr[i10], Integer.valueOf(i10))) {
                i7++;
            }
        }
        updateSubviewClipStatus$default(this, rect, index, i7, null, 8, null);
        this.inSubviewClippingLoop = false;
        child.addOnLayoutChangeListener(this.childrenLayoutChangeListener);
        if (child instanceof ReactClippingProhibitedView) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.views.view.ReactViewGroup$addViewWithSubviewClippingEnabled$1
                @Override // java.lang.Runnable
                public void run() {
                    if (child.isShown()) {
                        return;
                    }
                    ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.CLIPPING_PROHIBITED_VIEW, new ReactNoCrashSoftException("Child view has been added to Parent view in which it is clipped and not visible. This is not legal for this particular child view. Child: [" + child.getId() + "] " + child + " Parent: [" + this.getId() + "] " + this));
                }
            });
        }
    }

    public final void cleanUpAxOrderListener() {
        AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener;
        Object systemService = getContext().getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager != null && (accessibilityStateChangeListener = this.accessibilityStateChangeListener) != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
        }
        this.accessibilityStateChangeListener = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this._overflow != Overflow.VISIBLE || getTag(R.id.filter) != null) {
            BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (PointerEvents.INSTANCE.canChildrenBeTouchTarget(getPointerEvents())) {
            return super.dispatchGenericMotionEvent(ev);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(23)
    public void dispatchProvideStructure(@NotNull ViewStructure structure) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        try {
            super.dispatchProvideStructure(structure);
        } catch (NullPointerException e10) {
            p229p2.a.i("ReactNative", "NullPointerException when executing dispatchProvideStructure", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean pressed) {
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (Build.VERSION.SDK_INT < 29 || ViewUtil.getUIManagerType(this) != 2 || !BlendModeHelper.needsIsolatedLayer(this)) {
            super.draw(canvas);
            return;
        }
        Rect overflowInset = getOverflowInset();
        canvas.saveLayer(overflowInset.left, overflowInset.top, getWidth() + (-overflowInset.right), getHeight() + (-overflowInset.bottom), null);
        super.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c A[PHI: r4
      0x006c: PHI (r4v1 android.graphics.BlendMode) = 
      (r4v0 android.graphics.BlendMode)
      (r4v0 android.graphics.BlendMode)
      (r4v0 android.graphics.BlendMode)
      (r4v3 android.graphics.BlendMode)
     binds: [B:9:0x0022, B:11:0x0029, B:13:0x002f, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ViewGroup
    public boolean drawChild(@NotNull Canvas canvas, @NotNull View child, long drawingTime) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        boolean z3 = child.getElevation() > 0.0f;
        if (z3) {
            CanvasUtil.enableZ(canvas, true);
        }
        BlendMode blendModeF = null;
        if (Build.VERSION.SDK_INT >= 29 && ViewUtil.getUIManagerType(this) == 2 && BlendModeHelper.needsIsolatedLayer(this)) {
            Object tag = child.getTag(R.id.mix_blend_mode);
            blendModeF = com.facebook.react.uimanager.b.s(tag) ? l0.f(tag) : null;
            if (blendModeF != null) {
                Paint paint = new Paint();
                paint.setBlendMode(blendModeF);
                Rect overflowInset = getOverflowInset();
                canvas2 = canvas;
                canvas2.saveLayer(overflowInset.left, overflowInset.top, getWidth() + (-overflowInset.right), getHeight() + (-overflowInset.bottom), paint);
            } else {
                canvas2 = canvas;
            }
        } else {
            canvas2 = canvas;
        }
        boolean zDrawChild = super.drawChild(canvas2, child, drawingTime);
        if (blendModeF != null) {
            canvas2.restore();
        }
        if (z3) {
            CanvasUtil.enableZ(canvas2, false);
        }
        return zDrawChild;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.endViewTransition(view);
        Set<Integer> set = this.childrenRemovedWhileTransitioning;
        if (set != null) {
            set.remove(Integer.valueOf(view.getId()));
        }
    }

    /* JADX INFO: renamed from: getAllChildrenCount$ReactAndroid_release, reason: from getter */
    public final int getAllChildrenCount() {
        return this.allChildrenCount;
    }

    @Nullable
    public final List<String> getAxOrderList() {
        return this.axOrderList;
    }

    @Nullable
    public final View getChildAtWithSubviewClippingEnabled$ReactAndroid_release(int index) {
        if (index < 0 || index >= this.allChildrenCount) {
            return null;
        }
        View[] viewArr = this.allChildren;
        if (viewArr != null) {
            return viewArr[index];
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int childCount, int index) {
        UiThreadUtil.assertOnUiThread();
        return !customDrawOrderDisabled() ? getDrawingOrderHelper().getChildDrawingOrder(childCount, index) : index;
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void getClippingRect(@NotNull Rect outClippingRect) {
        Intrinsics.checkNotNullParameter(outClippingRect, "outClippingRect");
        Rect rect = this.clippingRect;
        if (rect == null) {
            throw new IllegalStateException("Required value was null.");
        }
        outClippingRect.set(rect);
    }

    @Override // com.facebook.react.touch.ReactHitSlopView
    @Nullable
    public Rect getHitSlopRect() {
        return this.hitSlopRect;
    }

    @Override // com.facebook.react.uimanager.ReactOverflowView
    @Nullable
    public String getOverflow() {
        Overflow overflow = this._overflow;
        int i7 = overflow == null ? -1 : WhenMappings.$EnumSwitchMapping$0[overflow.ordinal()];
        if (i7 == 1) {
            return ViewProps.HIDDEN;
        }
        if (i7 == 2) {
            return ViewProps.SCROLL;
        }
        if (i7 != 3) {
            return null;
        }
        return ViewProps.VISIBLE;
    }

    @Override // com.facebook.react.uimanager.ReactOverflowViewWithInset
    @NotNull
    public Rect getOverflowInset() {
        return this.overflowInset;
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    @NotNull
    public PointerEvents getPointerEvents() {
        return this.pointerEvents;
    }

    /* JADX INFO: renamed from: getRemoveClippedSubviews, reason: from getter */
    public boolean get_removeClippedSubviews() {
        return this._removeClippedSubviews;
    }

    @Override // com.facebook.react.uimanager.ReactZIndexedViewGroup
    public int getZIndexMappedChildIndex(int index) {
        UiThreadUtil.assertOnUiThread();
        return (customDrawOrderDisabled() || !getDrawingOrderHelper().shouldEnableCustomDrawingOrder()) ? index : getDrawingOrderHelper().getChildDrawingOrder(getChildCount(), index);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.needsOffscreenAlphaCompositing;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this._removeClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return ReactFeatureFlags.dispatchPointerEvents ? PointerEvents.INSTANCE.canBeTouchTarget(getPointerEvents()) : super.onHoverEvent(event);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        OnInterceptTouchEventListener onInterceptTouchEventListener = this.onInterceptTouchEventListener;
        if ((onInterceptTouchEventListener == null || !onInterceptTouchEventListener.onInterceptTouchEvent(this, event)) && PointerEvents.INSTANCE.canChildrenBeTouchTarget(getPointerEvents())) {
            return super.onInterceptTouchEvent(event);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top2, int right, int bottom) {
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        MeasureSpecAssertions.assertExplicitMeasureSpec(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
    }

    @Override // android.view.View
    public void onSizeChanged(int w3, int h7, int oldw, int oldh) {
        super.onSizeChanged(w3, h7, oldw, oldh);
        if (this._removeClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return PointerEvents.INSTANCE.canBeTouchTarget(getPointerEvents());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(@NotNull View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        UiThreadUtil.assertOnUiThread();
        checkViewClippingTag(child, false);
        if (customDrawOrderDisabled()) {
            setChildrenDrawingOrderEnabled(false);
        } else {
            getDrawingOrderHelper().handleAddView(child);
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().shouldEnableCustomDrawingOrder());
        }
        super.onViewAdded(child);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(@NotNull View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        UiThreadUtil.assertOnUiThread();
        checkViewClippingTag(child, true);
        if (customDrawOrderDisabled()) {
            setChildrenDrawingOrderEnabled(false);
        } else {
            getDrawingOrderHelper().handleRemoveView(child);
            setChildrenDrawingOrderEnabled(getDrawingOrderHelper().shouldEnableCustomDrawingOrder());
        }
        if (child.getParent() != null) {
            trackChildViewTransition(child.getId());
        }
        super.onViewRemoved(child);
    }

    public void recycleView$ReactAndroid_release() {
        ChildrenLayoutChangeListener childrenLayoutChangeListener;
        this.recycleCount++;
        View[] viewArr = this.allChildren;
        if (viewArr != null && (childrenLayoutChangeListener = this.childrenLayoutChangeListener) != null) {
            if (childrenLayoutChangeListener != null) {
                childrenLayoutChangeListener.shutdown();
            }
            int i7 = this.allChildrenCount;
            for (int i10 = 0; i10 < i7; i10++) {
                View view = viewArr[i10];
                if (view != null) {
                    view.removeOnLayoutChangeListener(this.childrenLayoutChangeListener);
                }
            }
        }
        initView();
        getOverflowInset().setEmpty();
        removeAllViews();
        if (getParent() != null) {
            ViewParent parent = getParent();
            Intrinsics.f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this);
        }
        updateBackgroundDrawable(null);
        resetPointerEvents();
    }

    public final void removeAllViewsWithSubviewClippingEnabled$ReactAndroid_release() {
        if (!this._removeClippedSubviews) {
            throw new IllegalStateException("Check failed.");
        }
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i7 = this.allChildrenCount;
        for (int i10 = 0; i10 < i7; i10++) {
            View view = viewArr[i10];
            if (view != null) {
                view.removeOnLayoutChangeListener(this.childrenLayoutChangeListener);
            }
        }
        removeAllViewsInLayout();
        this.allChildrenCount = 0;
    }

    public final void removeViewWithSubviewClippingEnabled$ReactAndroid_release(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UiThreadUtil.assertOnUiThread();
        if (!this._removeClippedSubviews) {
            throw new IllegalStateException("Check failed.");
        }
        View[] viewArr = this.allChildren;
        if (viewArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        view.removeOnLayoutChangeListener(this.childrenLayoutChangeListener);
        int iIndexOfChildInAllChildren = indexOfChildInAllChildren(view);
        if (!isViewClipped(viewArr[iIndexOfChildInAllChildren], Integer.valueOf(iIndexOfChildInAllChildren))) {
            int i7 = 0;
            for (int i10 = 0; i10 < iIndexOfChildInAllChildren; i10++) {
                if (isViewClipped(viewArr[i10], Integer.valueOf(i10))) {
                    i7++;
                }
            }
            removeViewsInLayout(iIndexOfChildInAllChildren - i7, 1);
            invalidate();
        }
        removeFromArray(iIndexOfChildInAllChildren);
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }

    public final void setAxOrderList(@Nullable List<String> list) {
        this.axOrderList = list;
    }

    public final void setBackfaceVisibility(@NotNull String backfaceVisibility) {
        Intrinsics.checkNotNullParameter(backfaceVisibility, "backfaceVisibility");
        this.backfaceVisible = ViewProps.VISIBLE.equals(backfaceVisibility);
        setBackfaceVisibilityDependantOpacity();
    }

    public final void setBackfaceVisibilityDependantOpacity() {
        if (this.backfaceVisible) {
            setAlpha(this.backfaceOpacity);
            return;
        }
        float rotationX = getRotationX();
        float rotationY = getRotationY();
        if (rotationX < -90.0f || rotationX >= 90.0f || rotationY < -90.0f || rotationY >= 90.0f) {
            setAlpha(0.0f);
        } else {
            setAlpha(this.backfaceOpacity);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        BackgroundStyleApplicator.setBackgroundColor(this, Integer.valueOf(color));
    }

    public final void setBorderColor(int position, @Nullable Integer color) {
        BackgroundStyleApplicator.setBorderColor(this, LogicalEdge.getEntries().get(position), color);
    }

    @Deprecated(message = "setBorderRadius(Float) is deprecated and will be removed in the future.", replaceWith = @ReplaceWith(expression = "setBorderRadius(Float,LengthPercentage)", imports = {}))
    public final void setBorderRadius(float borderRadius) {
        BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.BORDER_RADIUS, Float.isNaN(borderRadius) ? null : new LengthPercentage(borderRadius, LengthPercentageType.POINT));
    }

    public final void setBorderStyle(@Nullable String style) {
        BackgroundStyleApplicator.setBorderStyle(this, style != null ? BorderStyle.INSTANCE.fromString(style) : null);
    }

    public final void setBorderWidth(int position, float width) {
        BackgroundStyleApplicator.setBorderWidth(this, LogicalEdge.getEntries().get(position), Float.valueOf(PixelUtil.toDIPFromPixel(width)));
    }

    public void setHitSlopRect(@Nullable Rect rect) {
        this.hitSlopRect = rect;
    }

    public final void setNeedsOffscreenAlphaCompositing(boolean needsOffscreenAlphaCompositing) {
        this.needsOffscreenAlphaCompositing = needsOffscreenAlphaCompositing;
    }

    @Override // com.facebook.react.touch.ReactInterceptingViewGroup
    public void setOnInterceptTouchEventListener(@NotNull OnInterceptTouchEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onInterceptTouchEventListener = listener;
    }

    public final void setOpacityIfPossible(float opacity) {
        this.backfaceOpacity = opacity;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setOverflow(@Nullable String str) {
        this._overflow = str == null ? Overflow.VISIBLE : Overflow.INSTANCE.fromString(str);
        invalidate();
    }

    @Override // com.facebook.react.uimanager.ReactOverflowViewWithInset
    public void setOverflowInset(int left, int top2, int right, int bottom) {
        if (BlendModeHelper.needsIsolatedLayer(this) && (getOverflowInset().left != left || getOverflowInset().top != top2 || getOverflowInset().right != right || getOverflowInset().bottom != bottom)) {
            invalidate();
        }
        getOverflowInset().set(left, top2, right, bottom);
    }

    public void setPointerEvents(@NotNull PointerEvents pointerEvents) {
        Intrinsics.checkNotNullParameter(pointerEvents, "<set-?>");
        this.pointerEvents = pointerEvents;
    }

    public void setRemoveClippedSubviews(boolean z3) {
        if (z3 == this._removeClippedSubviews) {
            return;
        }
        this._removeClippedSubviews = z3;
        this.childrenRemovedWhileTransitioning = null;
        if (z3) {
            Rect rect = new Rect();
            ReactClippingViewGroupHelper.calculateClippingRect(this, rect);
            this.clippingRect = rect;
            int childCount = getChildCount();
            this.allChildrenCount = childCount;
            View[] viewArr = new View[Math.max(12, childCount)];
            this.childrenLayoutChangeListener = new ChildrenLayoutChangeListener(this);
            int i7 = this.allChildrenCount;
            for (int i10 = 0; i10 < i7; i10++) {
                View childAt = getChildAt(i10);
                viewArr[i10] = childAt;
                childAt.addOnLayoutChangeListener(this.childrenLayoutChangeListener);
                Companion.setViewClipped(childAt, false);
            }
            this.allChildren = viewArr;
            updateClippingRect();
            return;
        }
        View[] viewArr2 = this.allChildren;
        if (viewArr2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (this.childrenLayoutChangeListener == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i11 = this.allChildrenCount;
        for (int i12 = 0; i12 < i11; i12++) {
            View view = viewArr2[i12];
            if (view != null) {
                view.removeOnLayoutChangeListener(this.childrenLayoutChangeListener);
            }
        }
        Rect rect2 = this.clippingRect;
        if (rect2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        getDrawingRect(rect2);
        updateClippingToRect$default(this, rect2, null, 2, null);
        this.allChildren = null;
        this.clippingRect = null;
        this.allChildrenCount = 0;
        this.childrenLayoutChangeListener = null;
    }

    @Deprecated(message = "setTranslucentBackgroundDrawable is deprecated since React Native 0.76.0 and will be removed in a future version")
    public final void setTranslucentBackgroundDrawable(@Nullable Drawable background) {
        BackgroundStyleApplicator.setFeedbackUnderlay(this, background);
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void updateClippingRect() {
        updateClippingRect(null);
    }

    @Override // com.facebook.react.uimanager.ReactZIndexedViewGroup
    public void updateDrawingOrder() {
        if (customDrawOrderDisabled()) {
            return;
        }
        getDrawingOrderHelper().update();
        setChildrenDrawingOrderEnabled(getDrawingOrderHelper().shouldEnableCustomDrawingOrder());
        invalidate();
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void updateClippingRect(@Nullable Set<Integer> excludedViews) {
        if (this._removeClippedSubviews) {
            Rect rect = this.clippingRect;
            if (rect == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ReactClippingViewGroupHelper.calculateClippingRect(this, rect);
            updateClippingToRect(rect, excludedViews);
        }
    }

    @Deprecated(message = "setBorderRadius(Float) is deprecated and will be removed in the future.", replaceWith = @ReplaceWith(expression = "setBorderRadius(Float,LengthPercentage)", imports = {}))
    public final void setBorderRadius(float borderRadius, int position) {
        BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.getEntries().get(position), Float.isNaN(borderRadius) ? null : new LengthPercentage(borderRadius, LengthPercentageType.POINT));
    }

    public final void setBorderRadius(@NotNull BorderRadiusProp property, @Nullable LengthPercentage borderRadius) {
        Intrinsics.checkNotNullParameter(property, "property");
        BackgroundStyleApplicator.setBorderRadius(this, property, borderRadius);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSubviewClipStatus(View subview) {
        ReactViewGroup reactViewGroup;
        if (this._removeClippedSubviews && getParent() != null) {
            Rect rect = this.clippingRect;
            if (rect != null) {
                View[] viewArr = this.allChildren;
                if (viewArr != null) {
                    if (rect.intersects(subview.getLeft(), subview.getTop(), subview.getRight(), subview.getBottom()) != (!isViewClipped(subview, null))) {
                        this.inSubviewClippingLoop = true;
                        int i7 = this.allChildrenCount;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < i7) {
                            View view = viewArr[i10];
                            if (view == subview) {
                                updateSubviewClipStatus$default(this, rect, i10, i11, null, 8, null);
                                reactViewGroup = this;
                                reactViewGroup.inSubviewClippingLoop = false;
                            } else {
                                int i12 = i10;
                                Rect rect2 = rect;
                                if (isViewClipped(view, Integer.valueOf(i12))) {
                                    i11++;
                                }
                                rect = rect2;
                                i10 = i12 + 1;
                            }
                        }
                        reactViewGroup = this;
                        reactViewGroup.inSubviewClippingLoop = false;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
    }
}
