package com.facebook.react.views.scroll;

import V7.f;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import androidx.annotation.RequiresApi;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.F;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010a9.m;
import p229p2.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001:\tabcdefghiB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u001e\u001a\u00020\u001f\"\u000e\b\u0000\u0010 *\u0004\u0018\u00010!*\u00020\"2\u0006\u0010#\u001a\u0002H 2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0002\u0010'J%\u0010(\u001a\u00020\u001f\"\u000e\b\u0000\u0010 *\u0004\u0018\u00010!*\u00020\"2\u0006\u0010#\u001a\u0002H H\u0007¢\u0006\u0002\u0010)J5\u0010*\u001a\u00020\u001f\"\u000e\b\u0000\u0010 *\u0004\u0018\u00010!*\u00020\"2\u0006\u0010#\u001a\u0002H 2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0002\u0010'J5\u0010+\u001a\u00020\u001f\"\u000e\b\u0000\u0010 *\u0004\u0018\u00010!*\u00020\"2\u0006\u0010#\u001a\u0002H 2\u0006\u0010$\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010,J%\u0010-\u001a\u00020\u001f\"\u000e\b\u0000\u0010 *\u0004\u0018\u00010!*\u00020\"2\u0006\u0010#\u001a\u0002H H\u0007¢\u0006\u0002\u0010)J-\u0010\u001e\u001a\u00020\u001f\"\u000e\b\u0000\u0010 *\u0004\u0018\u00010!*\u00020\"2\u0006\u0010#\u001a\u0002H 2\u0006\u0010.\u001a\u00020/H\u0002¢\u0006\u0002\u00100J=\u0010\u001e\u001a\u00020\u001f\"\u000e\b\u0000\u0010 *\u0004\u0018\u00010!*\u00020\"2\u0006\u0010#\u001a\u0002H 2\u0006\u0010.\u001a\u00020/2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0002\u00101J\u0010\u00102\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0007J\u0010\u00103\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0007J\u0012\u00104\u001a\u00020\u00122\b\u00105\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u00106\u001a\u00020\u00122\b\u00107\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u00108\u001a\u00020\u00122\b\u00109\u001a\u0004\u0018\u00010:H\u0007J\u0010\u0010;\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020\u0019H\u0007J\u0010\u0010=\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020\u0019H\u0007J\u0010\u0010>\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020\u001bH\u0007J\u0010\u0010?\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020\u001bH\u0007JA\u0010@\u001a\u00020\u001f\"\u001a\b\u0000\u0010 *\u0004\u0018\u00010A*\u0004\u0018\u00010B*\u0004\u0018\u00010C*\u00020\"2\u0006\u0010#\u001a\u0002H 2\u0006\u0010D\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010,JC\u0010F\u001a\u00020\u0012\"\u0014\b\u0000\u0010 *\u0004\u0018\u00010A*\u0004\u0018\u00010B*\u00020\"2\u0006\u0010#\u001a\u0002H 2\u0006\u0010G\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\u00122\u0006\u0010I\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010JJ1\u0010K\u001a\u00020\u001f\"\u001a\b\u0000\u0010 *\u0004\u0018\u00010A*\u0004\u0018\u00010B*\u0004\u0018\u00010C*\u00020\"2\u0006\u0010#\u001a\u0002H H\u0007¢\u0006\u0002\u0010)J9\u0010K\u001a\u00020\u001f\"\u0014\b\u0000\u0010 *\u0004\u0018\u00010B*\u0004\u0018\u00010C*\u00020\"2\u0006\u0010#\u001a\u0002H 2\u0006\u0010L\u001a\u00020\u00122\u0006\u0010M\u001a\u00020\u0012¢\u0006\u0002\u0010,J+\u0010N\u001a\u00020\u001f\"\u0014\b\u0000\u0010 *\u0004\u0018\u00010B*\u0004\u0018\u00010C*\u00020\"2\u0006\u0010#\u001a\u0002H H\u0007¢\u0006\u0002\u0010)JG\u0010O\u001a\u00020\u001f\" \b\u0000\u0010 *\u0004\u0018\u00010A*\u0004\u0018\u00010!*\u0004\u0018\u00010B*\u0004\u0018\u00010C*\u00020\"2\u0006\u0010#\u001a\u0002H 2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0002\u0010'J/\u0010P\u001a\u00020\u001f\"\u001a\b\u0000\u0010 *\u0004\u0018\u00010A*\u0004\u0018\u00010B*\u0004\u0018\u00010C*\u00020\"2\u0006\u0010#\u001a\u0002H ¢\u0006\u0002\u0010)J+\u0010Q\u001a\u00020\u001f\"\u0014\b\u0000\u0010 *\u0004\u0018\u00010A*\u0004\u0018\u00010!*\u00020\"2\u0006\u0010#\u001a\u0002H H\u0007¢\u0006\u0002\u0010)JK\u0010R\u001a\u00020S\"\u0014\b\u0000\u0010 *\u0004\u0018\u00010A*\u0004\u0018\u00010B*\u00020\"2\u0006\u0010#\u001a\u0002H 2\u0006\u0010T\u001a\u00020\u00122\u0006\u0010U\u001a\u00020\u00122\u0006\u0010V\u001a\u00020\u00122\u0006\u0010W\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010XJ\"\u0010Y\u001a\u0004\u0018\u00010Z2\u0006\u0010[\u001a\u00020\"2\u0006\u0010\\\u001a\u00020Z2\u0006\u0010]\u001a\u00020\u0012H\u0007J \u0010^\u001a\u00020\u00122\u0006\u0010]\u001a\u00020\u00122\u0006\u0010_\u001a\u00020\b2\u0006\u0010`\u001a\u00020\u0012H\u0007R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006j"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "DEBUG_MODE", "", "CONTENT_OFFSET_LEFT", "CONTENT_OFFSET_TOP", "SCROLL_AWAY_PADDING_TOP", "MOMENTUM_DELAY", "", "OVER_SCROLL_ALWAYS", "AUTO", "OVER_SCROLL_NEVER", "SNAP_ALIGNMENT_DISABLED", "", "SNAP_ALIGNMENT_START", "SNAP_ALIGNMENT_CENTER", "SNAP_ALIGNMENT_END", "scrollListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;", "layoutChangeListeners", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;", "SMOOTH_SCROLL_DURATION", "smoothScrollDurationInitialized", "emitScrollEvent", "", "T", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasScrollEventThrottle;", "Landroid/view/ViewGroup;", "scrollView", "xVelocity", "", "yVelocity", "(Landroid/view/ViewGroup;FF)V", "emitScrollBeginDragEvent", "(Landroid/view/ViewGroup;)V", "emitScrollEndDragEvent", "emitScrollMomentumBeginEvent", "(Landroid/view/ViewGroup;II)V", "emitScrollMomentumEndEvent", "scrollEventType", "Lcom/facebook/react/views/scroll/ScrollEventType;", "(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/ScrollEventType;)V", "(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/ScrollEventType;FF)V", "emitLayoutEvent", "emitLayoutChangeEvent", "parseOverScrollMode", "jsOverScrollMode", "parseSnapToAlignment", "alignment", "getDefaultScrollAnimationDuration", "context", "Landroid/content/Context;", "addScrollListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeScrollListener", "addLayoutChangeListener", "removeLayoutChangeListener", "smoothScrollTo", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasFlingAnimator;", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasScrollState;", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasStateWrapper;", "x", "y", "getNextFlingStartValue", "currentValue", "postAnimationValue", "velocity", "(Landroid/view/ViewGroup;III)I", "updateFabricScrollState", "scrollX", "scrollY", "forceUpdateState", "updateStateOnScrollChanged", "registerFlingAnimator", "dispatchMomentumEndOnAnimationEnd", "predictFinalScrollPosition", "Landroid/graphics/Point;", "velocityX", "velocityY", "maximumOffsetX", "maximumOffsetY", "(Landroid/view/ViewGroup;IIII)Landroid/graphics/Point;", "findNextFocusableView", "Landroid/view/View;", "host", "focused", "direction", "resolveAbsoluteDirection", "horizontal", ViewProps.LAYOUT_DIRECTION, "ScrollListener", "LayoutChangeListener", "HasStateWrapper", "OverScrollerDurationGetter", "ReactScrollViewScrollState", "HasScrollState", "HasFlingAnimator", "HasScrollEventThrottle", "HasSmoothScroll", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactScrollViewHelper {

    @NotNull
    public static final String AUTO = "auto";

    @NotNull
    private static final String CONTENT_OFFSET_LEFT = "contentOffsetLeft";

    @NotNull
    private static final String CONTENT_OFFSET_TOP = "contentOffsetTop";
    private static final boolean DEBUG_MODE = false;
    public static final long MOMENTUM_DELAY = 20;

    @NotNull
    public static final String OVER_SCROLL_ALWAYS = "always";

    @NotNull
    public static final String OVER_SCROLL_NEVER = "never";

    @NotNull
    private static final String SCROLL_AWAY_PADDING_TOP = "scrollAwayPaddingTop";
    public static final int SNAP_ALIGNMENT_CENTER = 2;
    public static final int SNAP_ALIGNMENT_DISABLED = 0;
    public static final int SNAP_ALIGNMENT_END = 3;
    public static final int SNAP_ALIGNMENT_START = 1;
    private static boolean smoothScrollDurationInitialized;

    @NotNull
    public static final ReactScrollViewHelper INSTANCE = new ReactScrollViewHelper();
    private static final String TAG = "ReactScrollView";

    @NotNull
    private static final CopyOnWriteArrayList<WeakReference<ScrollListener>> scrollListeners = new CopyOnWriteArrayList<>();

    @NotNull
    private static final CopyOnWriteArrayList<WeakReference<LayoutChangeListener>> layoutChangeListeners = new CopyOnWriteArrayList<>();
    private static int SMOOTH_SCROLL_DURATION = 250;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasFlingAnimator;", "", "startFlingAnimator", "", ViewProps.START, "", ViewProps.END, "getFlingAnimator", "Landroid/animation/ValueAnimator;", "getFlingExtrapolatedDistance", "velocity", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface HasFlingAnimator {
        @NotNull
        ValueAnimator getFlingAnimator();

        int getFlingExtrapolatedDistance(int velocity);

        void startFlingAnimator(int start, int end);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasScrollEventThrottle;", "", "scrollEventThrottle", "", "getScrollEventThrottle", "()I", "setScrollEventThrottle", "(I)V", "lastScrollDispatchTime", "", "getLastScrollDispatchTime", "()J", "setLastScrollDispatchTime", "(J)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface HasScrollEventThrottle {
        long getLastScrollDispatchTime();

        int getScrollEventThrottle();

        void setLastScrollDispatchTime(long j6);

        void setScrollEventThrottle(int i7);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasScrollState;", "", "reactScrollViewScrollState", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;", "getReactScrollViewScrollState", "()Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface HasScrollState {
        @NotNull
        ReactScrollViewScrollState getReactScrollViewScrollState();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasSmoothScroll;", "", "reactSmoothScrollTo", "", "x", "", "y", "scrollToPreservingMomentum", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface HasSmoothScroll {
        void reactSmoothScrollTo(int x3, int y8);

        void scrollToPreservingMomentum(int x3, int y8);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$HasStateWrapper;", "", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "getStateWrapper", "()Lcom/facebook/react/uimanager/StateWrapper;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface HasStateWrapper {
        @Nullable
        StateWrapper getStateWrapper();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;", "", "onLayoutChange", "", "scrollView", "Landroid/view/ViewGroup;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface LayoutChangeListener {
        void onLayoutChange(@NotNull ViewGroup scrollView);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$OverScrollerDurationGetter;", "Landroid/widget/OverScroller;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "currentScrollAnimationDuration", "", "scrollAnimationDuration", "getScrollAnimationDuration", "()I", "startScroll", "", "startX", "startY", "dx", "dy", "duration", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OverScrollerDurationGetter extends OverScroller {
        private int currentScrollAnimationDuration;

        public OverScrollerDurationGetter(@Nullable Context context) {
            super(context);
            this.currentScrollAnimationDuration = 250;
        }

        public final int getScrollAnimationDuration() {
            startScroll(0, 0, 0, 0);
            return this.currentScrollAnimationDuration;
        }

        @Override // android.widget.OverScroller
        public void startScroll(int startX, int startY, int dx, int dy, int duration) {
            this.currentScrollAnimationDuration = duration;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tJ\u0016\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006#"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ReactScrollViewScrollState;", "", "<init>", "()V", "finalAnimatedPositionScroll", "Landroid/graphics/Point;", "getFinalAnimatedPositionScroll", "()Landroid/graphics/Point;", ReactScrollViewHelper.SCROLL_AWAY_PADDING_TOP, "", "getScrollAwayPaddingTop", "()I", "setScrollAwayPaddingTop", "(I)V", "lastStateUpdateScroll", "getLastStateUpdateScroll", "isCanceled", "", "()Z", "setCanceled", "(Z)V", "isFinished", "setFinished", "decelerationRate", "", "getDecelerationRate", "()F", "setDecelerationRate", "(F)V", "setFinalAnimatedPositionScroll", "finalAnimatedPositionScrollX", "finalAnimatedPositionScrollY", "setLastStateUpdateScroll", "lastStateUpdateScrollX", "lastStateUpdateScrollY", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ReactScrollViewScrollState {
        private boolean isCanceled;
        private int scrollAwayPaddingTop;

        @NotNull
        private final Point finalAnimatedPositionScroll = new Point();

        @NotNull
        private final Point lastStateUpdateScroll = new Point(-1, -1);
        private boolean isFinished = true;
        private float decelerationRate = 0.985f;

        public final float getDecelerationRate() {
            return this.decelerationRate;
        }

        @NotNull
        public final Point getFinalAnimatedPositionScroll() {
            return this.finalAnimatedPositionScroll;
        }

        @NotNull
        public final Point getLastStateUpdateScroll() {
            return this.lastStateUpdateScroll;
        }

        public final int getScrollAwayPaddingTop() {
            return this.scrollAwayPaddingTop;
        }

        /* JADX INFO: renamed from: isCanceled, reason: from getter */
        public final boolean getIsCanceled() {
            return this.isCanceled;
        }

        /* JADX INFO: renamed from: isFinished, reason: from getter */
        public final boolean getIsFinished() {
            return this.isFinished;
        }

        public final void setCanceled(boolean z3) {
            this.isCanceled = z3;
        }

        public final void setDecelerationRate(float f10) {
            this.decelerationRate = f10;
        }

        @NotNull
        public final ReactScrollViewScrollState setFinalAnimatedPositionScroll(int finalAnimatedPositionScrollX, int finalAnimatedPositionScrollY) {
            this.finalAnimatedPositionScroll.set(finalAnimatedPositionScrollX, finalAnimatedPositionScrollY);
            return this;
        }

        public final void setFinished(boolean z3) {
            this.isFinished = z3;
        }

        @NotNull
        public final ReactScrollViewScrollState setLastStateUpdateScroll(int lastStateUpdateScrollX, int lastStateUpdateScrollY) {
            this.lastStateUpdateScroll.set(lastStateUpdateScrollX, lastStateUpdateScrollY);
            return this;
        }

        public final void setScrollAwayPaddingTop(int i7) {
            this.scrollAwayPaddingTop = i7;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;", "", "onScroll", "", "scrollView", "Landroid/view/ViewGroup;", "scrollEventType", "Lcom/facebook/react/views/scroll/ScrollEventType;", "xVelocity", "", "yVelocity", "onLayout", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ScrollListener {
        void onLayout(@Nullable ViewGroup scrollView);

        void onScroll(@Nullable ViewGroup scrollView, @Nullable ScrollEventType scrollEventType, float xVelocity, float yVelocity);
    }

    private ReactScrollViewHelper() {
    }

    @JvmStatic
    public static final void addLayoutChangeListener(@NotNull LayoutChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        layoutChangeListeners.add(new WeakReference<>(listener));
    }

    @JvmStatic
    public static final void addScrollListener(@NotNull ScrollListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        scrollListeners.add(new WeakReference<>(listener));
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollEventThrottle> void dispatchMomentumEndOnAnimationEnd(final T scrollView) {
        scrollView.getFlingAnimator().addListener(new Animator.AnimatorListener() { // from class: com.facebook.react.views.scroll.ReactScrollViewHelper.dispatchMomentumEndOnAnimationEnd.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                ReactScrollViewHelper.emitScrollMomentumEndEvent(scrollView);
                animator.removeListener(this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                ReactScrollViewHelper.emitScrollMomentumEndEvent(scrollView);
                animator.removeListener(this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }
        });
    }

    @JvmStatic
    public static final void emitLayoutChangeEvent(@NotNull ViewGroup scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        Iterator<WeakReference<LayoutChangeListener>> it = layoutChangeListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            LayoutChangeListener layoutChangeListener = it.next().get();
            if (layoutChangeListener != null) {
                layoutChangeListener.onLayoutChange(scrollView);
            }
        }
    }

    @JvmStatic
    public static final void emitLayoutEvent(@NotNull ViewGroup scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        Iterator<WeakReference<ScrollListener>> it = scrollListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ScrollListener scrollListener = it.next().get();
            if (scrollListener != null) {
                scrollListener.onLayout(scrollView);
            }
        }
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollBeginDragEvent(T scrollView) {
        INSTANCE.emitScrollEvent(scrollView, ScrollEventType.BEGIN_DRAG);
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollEndDragEvent(T scrollView, float xVelocity, float yVelocity) {
        INSTANCE.emitScrollEvent(scrollView, ScrollEventType.END_DRAG, xVelocity, yVelocity);
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollEvent(T scrollView, float xVelocity, float yVelocity) {
        INSTANCE.emitScrollEvent(scrollView, ScrollEventType.SCROLL, xVelocity, yVelocity);
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollMomentumBeginEvent(T scrollView, int xVelocity, int yVelocity) {
        INSTANCE.emitScrollEvent(scrollView, ScrollEventType.MOMENTUM_BEGIN, xVelocity, yVelocity);
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollMomentumEndEvent(T scrollView) {
        INSTANCE.emitScrollEvent(scrollView, ScrollEventType.MOMENTUM_END);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    @Nullable
    public static final View findNextFocusableView(@NotNull ViewGroup host, @NotNull View focused, int direction) {
        FabricUIManager fabricUIManager;
        Integer numFindNextFocusableElement;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(focused, "focused");
        if (!(host instanceof ReactClippingViewGroup)) {
            return null;
        }
        Context context = host.getContext();
        Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        UIManager uIManager = UIManagerHelper.getUIManager((ReactContext) context, 2);
        if (uIManager != null && (numFindNextFocusableElement = (fabricUIManager = (FabricUIManager) uIManager).findNextFocusableElement(host.getId(), focused.getId(), direction)) != null) {
            int iIntValue = numFindNextFocusableElement.intValue();
            int[] relativeAncestorList = fabricUIManager.getRelativeAncestorList(host.getChildAt(0).getId(), iIntValue);
            if (relativeAncestorList != null) {
                Intrinsics.checkNotNullParameter(relativeAncestorList, "<this>");
                LinkedHashSet destination = new LinkedHashSet(F.a(relativeAncestorList.length));
                Intrinsics.checkNotNullParameter(relativeAncestorList, "<this>");
                Intrinsics.checkNotNullParameter(destination, "destination");
                for (int i7 : relativeAncestorList) {
                    destination.add(Integer.valueOf(i7));
                }
                destination.add(numFindNextFocusableElement);
                ((ReactClippingViewGroup) host).updateClippingRect(destination);
                return host.findViewById(iIntValue);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final <T extends ViewGroup & HasScrollState & HasStateWrapper> void forceUpdateState(T scrollView) {
        ReactScrollViewScrollState reactScrollViewScrollState = scrollView.getReactScrollViewScrollState();
        int scrollAwayPaddingTop = reactScrollViewScrollState.getScrollAwayPaddingTop();
        Point lastStateUpdateScroll = reactScrollViewScrollState.getLastStateUpdateScroll();
        int i7 = lastStateUpdateScroll.x;
        int i10 = lastStateUpdateScroll.y;
        if (DEBUG_MODE) {
            a.m(TAG, "updateFabricScrollState[%d] scrollX %d scrollY %d", Integer.valueOf(scrollView.getId()), Integer.valueOf(i7), Integer.valueOf(i10));
        }
        StateWrapper stateWrapper = scrollView.getStateWrapper();
        if (stateWrapper != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble(CONTENT_OFFSET_LEFT, PixelUtil.toDIPFromPixel(i7));
            writableNativeMap.putDouble(CONTENT_OFFSET_TOP, PixelUtil.toDIPFromPixel(i10));
            writableNativeMap.putDouble(SCROLL_AWAY_PADDING_TOP, PixelUtil.toDIPFromPixel(scrollAwayPaddingTop));
            stateWrapper.updateState(writableNativeMap);
        }
    }

    @JvmStatic
    public static final int getDefaultScrollAnimationDuration(@Nullable Context context) {
        if (!smoothScrollDurationInitialized) {
            smoothScrollDurationInitialized = true;
            try {
                SMOOTH_SCROLL_DURATION = new OverScrollerDurationGetter(context).getScrollAnimationDuration();
            } catch (Throwable unused) {
            }
        }
        return SMOOTH_SCROLL_DURATION;
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollState> int getNextFlingStartValue(T scrollView, int currentValue, int postAnimationValue, int velocity) {
        ReactScrollViewScrollState reactScrollViewScrollState = scrollView.getReactScrollViewScrollState();
        return (!reactScrollViewScrollState.getIsFinished() || (reactScrollViewScrollState.getIsCanceled() && ((postAnimationValue - currentValue) * (velocity != 0 ? velocity / Math.abs(velocity) : 0) > 0))) ? postAnimationValue : currentValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        if (r3.equals("auto") != false) goto L25;
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int parseOverScrollMode(@org.jetbrains.annotations.Nullable java.lang.String r3) {
        /*
            r0 = 1
            if (r3 == 0) goto L42
            int r1 = r3.hashCode()
            r2 = -1414557169(0xffffffffabaf920f, float:-1.2475037E-12)
            if (r1 == r2) goto L2b
            r2 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r1 == r2) goto L22
            r2 = 104712844(0x63dca8c, float:3.5695757E-35)
            if (r1 == r2) goto L17
            goto L33
        L17:
            java.lang.String r1 = "never"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L20
            goto L33
        L20:
            r3 = 2
            return r3
        L22:
            java.lang.String r1 = "auto"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L33
            goto L42
        L2b:
            java.lang.String r1 = "always"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L40
        L33:
            java.lang.String r1 = "wrong overScrollMode: "
            java.lang.String r3 = r1.concat(r3)
            java.lang.String r1 = "ReactNative"
            p229p2.a.v(r1, r3)
            return r0
        L40:
            r3 = 0
            return r3
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.scroll.ReactScrollViewHelper.parseOverScrollMode(java.lang.String):int");
    }

    @JvmStatic
    public static final int parseSnapToAlignment(@Nullable String alignment) {
        if (alignment == null) {
            return 0;
        }
        if (ViewProps.START.equalsIgnoreCase(alignment)) {
            return 1;
        }
        if ("center".equalsIgnoreCase(alignment)) {
            return 2;
        }
        if (ViewProps.END.equals(alignment)) {
            return 3;
        }
        a.v("ReactNative", "wrong snap alignment value: ".concat(alignment));
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    @NotNull
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollState> Point predictFinalScrollPosition(T scrollView, int velocityX, int velocityY, int maximumOffsetX, int maximumOffsetY) {
        ReactScrollViewScrollState reactScrollViewScrollState = scrollView.getReactScrollViewScrollState();
        OverScroller overScroller = new OverScroller(scrollView.getContext());
        overScroller.setFriction(1.0f - reactScrollViewScrollState.getDecelerationRate());
        int width = (scrollView.getWidth() - scrollView.getPaddingStart()) - scrollView.getPaddingEnd();
        int height = (scrollView.getHeight() - scrollView.getPaddingBottom()) - scrollView.getPaddingTop();
        Point finalAnimatedPositionScroll = reactScrollViewScrollState.getFinalAnimatedPositionScroll();
        overScroller.fling(getNextFlingStartValue(scrollView, scrollView.getScrollX(), finalAnimatedPositionScroll.x, velocityX), getNextFlingStartValue(scrollView, scrollView.getScrollY(), finalAnimatedPositionScroll.y, velocityY), velocityX, velocityY, 0, maximumOffsetX, 0, maximumOffsetY, width / 2, height / 2);
        return new Point(overScroller.getFinalX(), overScroller.getFinalY());
    }

    @JvmStatic
    @RequiresApi(24)
    public static final void removeLayoutChangeListener(@NotNull LayoutChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        layoutChangeListeners.removeIf(new f(new m(listener, 6), 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeLayoutChangeListener$lambda$2(LayoutChangeListener layoutChangeListener, WeakReference weakReference) {
        return weakReference.get() == null || Intrinsics.c(weakReference.get(), layoutChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeLayoutChangeListener$lambda$3(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    @JvmStatic
    @RequiresApi(24)
    public static final void removeScrollListener(@NotNull ScrollListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        scrollListeners.removeIf(new f(new m(listener, 5), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeScrollListener$lambda$0(ScrollListener scrollListener, WeakReference weakReference) {
        return weakReference.get() == null || Intrinsics.c(weakReference.get(), scrollListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeScrollListener$lambda$1(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    @JvmStatic
    public static final int resolveAbsoluteDirection(int direction, boolean horizontal, int layoutDirection) {
        boolean z3 = layoutDirection == 1;
        if (direction != 1 && direction != 2) {
            return direction;
        }
        if (horizontal) {
            return (direction == 2) != z3 ? 66 : 17;
        }
        return direction == 2 ? 130 : 33;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollState & HasStateWrapper> void smoothScrollTo(T scrollView, int x3, int y8) {
        if (DEBUG_MODE) {
            a.m(TAG, "smoothScrollTo[%d] x %d y %d", Integer.valueOf(scrollView.getId()), Integer.valueOf(x3), Integer.valueOf(y8));
        }
        T t = scrollView;
        ValueAnimator flingAnimator = t.getFlingAnimator();
        if (flingAnimator.getListeners() == null || flingAnimator.getListeners().size() == 0) {
            INSTANCE.registerFlingAnimator(scrollView);
        }
        scrollView.getReactScrollViewScrollState().setFinalAnimatedPositionScroll(x3, y8);
        int scrollX = scrollView.getScrollX();
        int scrollY = scrollView.getScrollY();
        if (scrollX != x3) {
            t.startFlingAnimator(scrollX, x3);
        }
        if (scrollY != y8) {
            t.startFlingAnimator(scrollY, y8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollState & HasStateWrapper> void updateFabricScrollState(T scrollView) {
        INSTANCE.updateFabricScrollState(scrollView, scrollView.getScrollX(), scrollView.getScrollY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollEventThrottle & HasScrollState & HasStateWrapper> void updateStateOnScrollChanged(T scrollView, float xVelocity, float yVelocity) {
        INSTANCE.updateFabricScrollState(scrollView, scrollView.getScrollX(), scrollView.getScrollY());
        emitScrollEvent(scrollView, xVelocity, yVelocity);
    }

    public final <T extends ViewGroup & HasFlingAnimator & HasScrollState & HasStateWrapper> void registerFlingAnimator(final T scrollView) {
        scrollView.getFlingAnimator().addListener(new Animator.AnimatorListener() { // from class: com.facebook.react.views.scroll.ReactScrollViewHelper.registerFlingAnimator.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                ((HasScrollState) scrollView).getReactScrollViewScrollState().setCanceled(true);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                ((HasScrollState) scrollView).getReactScrollViewScrollState().setFinished(true);
                ReactScrollViewHelper.updateFabricScrollState(scrollView);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                ReactScrollViewScrollState reactScrollViewScrollState = ((HasScrollState) scrollView).getReactScrollViewScrollState();
                reactScrollViewScrollState.setCanceled(false);
                reactScrollViewScrollState.setFinished(false);
            }
        });
    }

    private final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollEvent(T scrollView, ScrollEventType scrollEventType) {
        emitScrollEvent(scrollView, scrollEventType, 0.0f, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends ViewGroup & HasScrollState & HasStateWrapper> void updateFabricScrollState(T scrollView, int scrollX, int scrollY) {
        if (DEBUG_MODE) {
            a.m(TAG, "updateFabricScrollState[%d] scrollX %d scrollY %d", Integer.valueOf(scrollView.getId()), Integer.valueOf(scrollX), Integer.valueOf(scrollY));
        }
        if (ViewUtil.getUIManagerType(scrollView.getId()) == 1 || scrollView.getStateWrapper() == null) {
            return;
        }
        ReactScrollViewScrollState reactScrollViewScrollState = scrollView.getReactScrollViewScrollState();
        if (reactScrollViewScrollState.getLastStateUpdateScroll().equals(scrollX, scrollY)) {
            return;
        }
        reactScrollViewScrollState.setLastStateUpdateScroll(scrollX, scrollY);
        forceUpdateState(scrollView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollEvent(T scrollView, ScrollEventType scrollEventType, float xVelocity, float yVelocity) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (scrollEventType == ScrollEventType.SCROLL) {
            T t = scrollView;
            if (t.getScrollEventThrottle() >= Math.max(17L, jCurrentTimeMillis - t.getLastScrollDispatchTime())) {
                return;
            }
        }
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            return;
        }
        Iterator it = CollectionsKt.Y(scrollListeners).iterator();
        while (it.hasNext()) {
            ScrollListener scrollListener = (ScrollListener) ((WeakReference) it.next()).get();
            if (scrollListener != null) {
                scrollListener.onScroll(scrollView, scrollEventType, xVelocity, yVelocity);
            }
        }
        Context context = scrollView.getContext();
        Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, scrollView.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(ScrollEvent.INSTANCE.obtain(surfaceId, scrollView.getId(), scrollEventType, scrollView.getScrollX(), scrollView.getScrollY(), xVelocity, yVelocity, childAt.getWidth(), childAt.getHeight(), scrollView.getWidth(), scrollView.getHeight()));
            if (scrollEventType == ScrollEventType.SCROLL) {
                scrollView.setLastScrollDispatchTime(jCurrentTimeMillis);
            }
        }
    }
}
