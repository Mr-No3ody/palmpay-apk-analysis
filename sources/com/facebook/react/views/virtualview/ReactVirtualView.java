package com.facebook.react.views.virtualview;

import C0.G;
import android.content.Context;
import android.graphics.Rect;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.VisibleForTesting;
import com.facebook.react.R;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.ReactRoot;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.scroll.ReactHorizontalScrollView;
import com.facebook.react.views.scroll.ReactScrollView;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import com.facebook.react.views.scroll.ScrollEventType;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229p2.a;
import p355xf.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u00107\u001a\u000208H\u0010¢\u0006\u0002\b9J\b\u0010:\u001a\u000208H\u0014J\r\u0010;\u001a\u000208H\u0001¢\u0006\u0002\b<J\b\u0010=\u001a\u000208H\u0014J0\u0010>\u001a\u0002082\u0006\u0010?\u001a\u00020\"2\u0006\u0010@\u001a\u0002002\u0006\u0010A\u001a\u0002002\u0006\u0010B\u001a\u0002002\u0006\u0010C\u001a\u000200H\u0014JR\u0010D\u001a\u0002082\b\u0010E\u001a\u0004\u0018\u00010*2\u0006\u0010@\u001a\u0002002\u0006\u0010A\u001a\u0002002\u0006\u0010B\u001a\u0002002\u0006\u0010C\u001a\u0002002\u0006\u0010F\u001a\u0002002\u0006\u0010G\u001a\u0002002\u0006\u0010H\u001a\u0002002\u0006\u0010I\u001a\u000200H\u0016J,\u0010J\u001a\u0002082\b\u0010K\u001a\u0004\u0018\u00010L2\b\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020PH\u0016J\u0012\u0010>\u001a\u0002082\b\u0010K\u001a\u0004\u0018\u00010LH\u0016J\u0010\u0010D\u001a\u0002082\u0006\u0010K\u001a\u00020LH\u0016J\u0010\u0010R\u001a\u0002082\u0006\u0010S\u001a\u00020\"H\u0002J\u0018\u0010T\u001a\u00020\"2\u0006\u0010U\u001a\u00020,2\u0006\u0010V\u001a\u00020,H\u0002J\u001a\u0010W\u001a\u0002082\b\u0010X\u001a\u0004\u0018\u00010\n2\u0006\u0010Y\u001a\u00020\nH\u0002J\u0010\u0010Z\u001a\u0002082\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010[\u001a\u0002082\u0006\u0010\t\u001a\u00020\nH\u0002J\n\u0010\\\u001a\u0004\u0018\u00010LH\u0002J\b\u0010]\u001a\u000208H\u0002J\u0012\u0010^\u001a\u0004\u0018\u00010L2\u0006\u0010_\u001a\u00020\"H\u0002J\b\u0010`\u001a\u000208H\u0002J)\u0010a\u001a\u0002082\u0006\u0010b\u001a\u0002042\u000e\b\u0002\u0010c\u001a\b\u0012\u0004\u0012\u0002040dH\u0080\bø\u0001\u0000¢\u0006\u0002\beR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\"X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000200X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00103\u001a\u0004\u0018\u0001048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u00106\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006f"}, d2 = {"Lcom/facebook/react/views/virtualview/ReactVirtualView;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$ScrollListener;", "Lcom/facebook/react/views/scroll/ReactScrollViewHelper$LayoutChangeListener;", "Landroid/view/View$OnLayoutChangeListener;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mode", "Lcom/facebook/react/views/virtualview/VirtualViewMode;", "getMode$ReactAndroid_release", "()Lcom/facebook/react/views/virtualview/VirtualViewMode;", "setMode$ReactAndroid_release", "(Lcom/facebook/react/views/virtualview/VirtualViewMode;)V", "renderState", "Lcom/facebook/react/views/virtualview/VirtualViewRenderState;", "getRenderState$ReactAndroid_release", "()Lcom/facebook/react/views/virtualview/VirtualViewRenderState;", "setRenderState$ReactAndroid_release", "(Lcom/facebook/react/views/virtualview/VirtualViewRenderState;)V", "modeChangeEmitter", "Lcom/facebook/react/views/virtualview/ModeChangeEmitter;", "getModeChangeEmitter$ReactAndroid_release", "()Lcom/facebook/react/views/virtualview/ModeChangeEmitter;", "setModeChangeEmitter$ReactAndroid_release", "(Lcom/facebook/react/views/virtualview/ModeChangeEmitter;)V", "prerenderRatio", "", "getPrerenderRatio$ReactAndroid_release", "()D", "setPrerenderRatio$ReactAndroid_release", "(D)V", "debugLogEnabled", "", "getDebugLogEnabled$ReactAndroid_release", "()Z", "detectWindowFocus", "getDetectWindowFocus$ReactAndroid_release", "onWindowFocusChangeListener", "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;", "parentScrollView", "Landroid/view/View;", "lastRect", "Landroid/graphics/Rect;", "targetRect", "thresholdRect", "offsetX", "", "offsetY", "offsetChanged", "nativeId", "", "getNativeId$ReactAndroid_release", "()Ljava/lang/String;", "recycleView", "", "recycleView$ReactAndroid_release", "onAttachedToWindow", "doAttachedToWindow", "doAttachedToWindow$ReactAndroid_release", "onDetachedFromWindow", "onLayout", "changed", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "onLayoutChange", "v", "oldLeft", "oldTop", "oldRight", "oldBottom", "onScroll", "scrollView", "Landroid/view/ViewGroup;", "scrollEventType", "Lcom/facebook/react/views/scroll/ScrollEventType;", "xVelocity", "", "yVelocity", "dispatchOnModeChangeIfNeeded", "checkRectChange", "rectsOverlap", "rect1", "rect2", "maybeEmitModeChanges", "oldMode", "newMode", "emitAsyncModeChange", "emitSyncModeChange", "getParentScrollView", "cleanupLayoutListeners", "traverseParentStack", "addListeners", "updateParentOffset", "debugLog", "subtag", "block", "Lkotlin/Function0;", "debugLog$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactVirtualView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactVirtualView.kt\ncom/facebook/react/views/virtualview/ReactVirtualView\n+ 2 ReactVirtualView.kt\ncom/facebook/react/views/virtualview/ReactVirtualView$debugLog$1\n*L\n1#1,383:1\n358#1,4:384\n364#1,4:389\n359#1,9:393\n359#1,9:402\n359#1,9:411\n359#1,9:420\n358#2:388\n*S KotlinDebug\n*F\n+ 1 ReactVirtualView.kt\ncom/facebook/react/views/virtualview/ReactVirtualView\n*L\n89#1:384,4\n89#1:389,4\n187#1:393,9\n194#1:402,9\n226#1:411,9\n265#1:420,9\n89#1:388\n*E\n"})
public final class ReactVirtualView extends ReactViewGroup implements ReactScrollViewHelper.ScrollListener, ReactScrollViewHelper.LayoutChangeListener, View.OnLayoutChangeListener {
    private final boolean debugLogEnabled;
    private final boolean detectWindowFocus;

    @NotNull
    private final Rect lastRect;

    @Nullable
    private VirtualViewMode mode;

    @Nullable
    private ModeChangeEmitter modeChangeEmitter;
    private boolean offsetChanged;
    private int offsetX;
    private int offsetY;

    @NotNull
    private final ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener;

    @Nullable
    private View parentScrollView;
    private double prerenderRatio;

    @NotNull
    private VirtualViewRenderState renderState;

    @NotNull
    private final Rect targetRect;

    @NotNull
    private final Rect thresholdRect;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VirtualViewMode.values().length];
            try {
                iArr[VirtualViewMode.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VirtualViewMode.Prerender.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VirtualViewMode.Hidden.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactVirtualView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.renderState = VirtualViewRenderState.Unknown;
        this.prerenderRatio = ReactNativeFeatureFlags.virtualViewPrerenderRatio();
        this.debugLogEnabled = ReactNativeFeatureFlags.enableVirtualViewDebugFeatures();
        this.detectWindowFocus = ReactNativeFeatureFlags.enableVirtualViewWindowFocusDetection();
        this.onWindowFocusChangeListener = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: C3.a
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z3) {
                this.f1153a.dispatchOnModeChangeIfNeeded(false);
            }
        };
        this.lastRect = new Rect();
        this.targetRect = new Rect();
        this.thresholdRect = new Rect();
    }

    private final void cleanupLayoutListeners() {
        traverseParentStack(false);
    }

    public static /* synthetic */ void debugLog$ReactAndroid_release$default(ReactVirtualView reactVirtualView, String subtag, Function0 block, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            block = new Function0<String>() { // from class: com.facebook.react.views.virtualview.ReactVirtualView$debugLog$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "";
                }
            };
        }
        Intrinsics.checkNotNullParameter(subtag, "subtag");
        Intrinsics.checkNotNullParameter(block, "block");
        if (reactVirtualView.getDebugLogEnabled()) {
            if (ReactVirtualViewKt.IS_DEBUG_BUILD) {
                a.a(G.o("ReactVirtualView:", subtag), block.invoke() + " [" + reactVirtualView.getId() + "][" + reactVirtualView.getNativeId$ReactAndroid_release() + "]");
                return;
            }
            a.v(G.o("ReactVirtualView:", subtag), block.invoke() + " [" + reactVirtualView.getId() + "][" + reactVirtualView.getNativeId$ReactAndroid_release() + "]");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchOnModeChangeIfNeeded(boolean checkRectChange) {
        View view;
        boolean zRectsOverlap;
        VirtualViewMode virtualViewMode;
        if (this.modeChangeEmitter == null || (view = this.parentScrollView) == null) {
            return;
        }
        if (this.offsetChanged) {
            updateParentOffset();
        }
        this.targetRect.set(getLeft() + this.offsetX, getTop() + this.offsetY, getRight() + this.offsetX, getBottom() + this.offsetY);
        view.getDrawingRect(this.thresholdRect);
        if ((this.targetRect.width() == 0 && this.targetRect.height() == 0) || this.thresholdRect.isEmpty()) {
            if (getDebugLogEnabled()) {
                if (ReactVirtualViewKt.IS_DEBUG_BUILD) {
                    String strP = G.p("empty rects target=", this.targetRect.toShortString(), " threshold=", this.thresholdRect.toShortString());
                    a.a("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) strP) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
                    return;
                }
                String strP2 = G.p("empty rects target=", this.targetRect.toShortString(), " threshold=", this.thresholdRect.toShortString());
                a.v("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) strP2) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
                return;
            }
            return;
        }
        if (checkRectChange) {
            if (!this.lastRect.isEmpty() && Intrinsics.c(this.lastRect, this.targetRect)) {
                if (getDebugLogEnabled()) {
                    if (ReactVirtualViewKt.IS_DEBUG_BUILD) {
                        a.a("ReactVirtualView:dispatchOnModeChangeIfNeeded", "no rect change [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
                        return;
                    }
                    a.v("ReactVirtualView:dispatchOnModeChangeIfNeeded", "no rect change [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
                    return;
                }
                return;
            }
            this.lastRect.set(this.targetRect);
        }
        if (rectsOverlap(this.targetRect, this.thresholdRect)) {
            virtualViewMode = (!this.detectWindowFocus || hasWindowFocus()) ? VirtualViewMode.Visible : VirtualViewMode.Prerender;
        } else {
            if (this.prerenderRatio > 0.0d) {
                Rect rect = this.thresholdRect;
                rect.inset((int) (((double) (-rect.width())) * this.prerenderRatio), (int) (((double) (-this.thresholdRect.height())) * this.prerenderRatio));
                zRectsOverlap = rectsOverlap(this.targetRect, this.thresholdRect);
            } else {
                zRectsOverlap = false;
            }
            if (zRectsOverlap) {
                virtualViewMode = VirtualViewMode.Prerender;
            } else {
                virtualViewMode = VirtualViewMode.Hidden;
                this.thresholdRect.setEmpty();
            }
        }
        if (getDebugLogEnabled()) {
            if (ReactVirtualViewKt.IS_DEBUG_BUILD) {
                String str = "mode=" + this.mode + " target=" + this.targetRect.toShortString() + " threshold=" + this.thresholdRect.toShortString();
                a.a("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) str) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
            } else {
                String str2 = "mode=" + this.mode + " target=" + this.targetRect.toShortString() + " threshold=" + this.thresholdRect.toShortString();
                a.v("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) str2) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
            }
        }
        VirtualViewMode virtualViewMode2 = this.mode;
        if (virtualViewMode == virtualViewMode2) {
            return;
        }
        this.mode = virtualViewMode;
        maybeEmitModeChanges(virtualViewMode2, virtualViewMode);
    }

    private final void emitAsyncModeChange(VirtualViewMode mode) {
        ModeChangeEmitter modeChangeEmitter = this.modeChangeEmitter;
        if (modeChangeEmitter != null) {
            modeChangeEmitter.emitModeChange(mode, this.targetRect, this.thresholdRect, false);
        }
    }

    private final void emitSyncModeChange(VirtualViewMode mode) {
        ModeChangeEmitter modeChangeEmitter = this.modeChangeEmitter;
        if (modeChangeEmitter != null) {
            modeChangeEmitter.emitModeChange(mode, this.targetRect, this.thresholdRect, true);
        }
    }

    private final ViewGroup getParentScrollView() {
        return traverseParentStack(true);
    }

    private final void maybeEmitModeChanges(VirtualViewMode oldMode, VirtualViewMode newMode) {
        if (getDebugLogEnabled()) {
            if (ReactVirtualViewKt.IS_DEBUG_BUILD) {
                int id2 = getId();
                String nativeId$ReactAndroid_release = getNativeId$ReactAndroid_release();
                a.a("ReactVirtualView:Mode change", ((Object) (oldMode + "->" + newMode)) + " [" + id2 + "][" + nativeId$ReactAndroid_release + "]");
            } else {
                int id3 = getId();
                String nativeId$ReactAndroid_release2 = getNativeId$ReactAndroid_release();
                a.v("ReactVirtualView:Mode change", ((Object) (oldMode + "->" + newMode)) + " [" + id3 + "][" + nativeId$ReactAndroid_release2 + "]");
            }
        }
        D3.a.a("VirtualView::mode change " + oldMode + " -> " + newMode + ", nativeID=" + getNativeId$ReactAndroid_release());
        int i7 = WhenMappings.$EnumSwitchMapping$0[newMode.ordinal()];
        if (i7 == 1) {
            VirtualViewRenderState virtualViewRenderState = this.renderState;
            if (virtualViewRenderState == VirtualViewRenderState.Unknown || oldMode != VirtualViewMode.Prerender || virtualViewRenderState != VirtualViewRenderState.Rendered) {
                emitSyncModeChange(VirtualViewMode.Visible);
            }
        } else if (i7 != 2) {
            if (i7 != 3) {
                throw new l();
            }
            emitAsyncModeChange(VirtualViewMode.Hidden);
        } else if (oldMode != VirtualViewMode.Visible) {
            emitAsyncModeChange(VirtualViewMode.Prerender);
        }
        Trace.endSection();
    }

    private final boolean rectsOverlap(Rect rect1, Rect rect2) {
        return rect1.top < rect2.bottom && rect2.top < rect1.bottom && rect1.left < rect2.right && rect2.left < rect1.right;
    }

    private final ViewGroup traverseParentStack(boolean addListeners) {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ReactScrollView) {
                return (ViewGroup) parent;
            }
            if (parent instanceof ReactHorizontalScrollView) {
                return (ViewGroup) parent;
            }
            if (parent instanceof ReactRoot) {
                return null;
            }
            if (parent instanceof View) {
                View view = (View) parent;
                view.removeOnLayoutChangeListener(this);
                if (addListeners) {
                    view.addOnLayoutChangeListener(this);
                }
            }
        }
        return null;
    }

    private final void updateParentOffset() {
        View view = this.parentScrollView;
        if (view == null) {
            return;
        }
        this.offsetX = 0;
        this.offsetY = 0;
        this.offsetChanged = false;
        for (ViewParent parent = getParent(); parent != null && !parent.equals(view); parent = parent.getParent()) {
            if (parent instanceof View) {
                View view2 = (View) parent;
                this.offsetX = view2.getLeft() + this.offsetX;
                this.offsetY = view2.getTop() + this.offsetY;
            }
        }
    }

    public final void debugLog$ReactAndroid_release(@NotNull String subtag, @NotNull Function0<String> block) {
        Intrinsics.checkNotNullParameter(subtag, "subtag");
        Intrinsics.checkNotNullParameter(block, "block");
        if (getDebugLogEnabled()) {
            if (ReactVirtualViewKt.IS_DEBUG_BUILD) {
                String strO = G.o("ReactVirtualView:", subtag);
                String strInvoke = block.invoke();
                a.a(strO, ((Object) strInvoke) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
                return;
            }
            String strO2 = G.o("ReactVirtualView:", subtag);
            String strInvoke2 = block.invoke();
            a.v(strO2, ((Object) strInvoke2) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
        }
    }

    @VisibleForTesting
    public final void doAttachedToWindow$ReactAndroid_release() {
        ViewGroup parentScrollView = getParentScrollView();
        if (parentScrollView != null) {
            this.offsetChanged = true;
            ReactScrollViewHelper.addScrollListener(this);
            ReactScrollViewHelper.addLayoutChangeListener(this);
        } else {
            parentScrollView = null;
        }
        this.parentScrollView = parentScrollView;
        if (getDebugLogEnabled()) {
            if (ReactVirtualViewKt.IS_DEBUG_BUILD) {
                a.a("ReactVirtualView:onAttachedToWindow", " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
            } else {
                a.v("ReactVirtualView:onAttachedToWindow", " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
            }
        }
        if (this.detectWindowFocus) {
            getViewTreeObserver().addOnWindowFocusChangeListener(this.onWindowFocusChangeListener);
        }
        dispatchOnModeChangeIfNeeded(false);
    }

    /* JADX INFO: renamed from: getDebugLogEnabled$ReactAndroid_release, reason: from getter */
    public final boolean getDebugLogEnabled() {
        return this.debugLogEnabled;
    }

    /* JADX INFO: renamed from: getDetectWindowFocus$ReactAndroid_release, reason: from getter */
    public final boolean getDetectWindowFocus() {
        return this.detectWindowFocus;
    }

    @Nullable
    /* JADX INFO: renamed from: getMode$ReactAndroid_release, reason: from getter */
    public final VirtualViewMode getMode() {
        return this.mode;
    }

    @Nullable
    /* JADX INFO: renamed from: getModeChangeEmitter$ReactAndroid_release, reason: from getter */
    public final ModeChangeEmitter getModeChangeEmitter() {
        return this.modeChangeEmitter;
    }

    @Nullable
    public final String getNativeId$ReactAndroid_release() {
        Object tag = getTag(R.id.view_tag_native_id);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: getPrerenderRatio$ReactAndroid_release, reason: from getter */
    public final double getPrerenderRatio() {
        return this.prerenderRatio;
    }

    @NotNull
    /* JADX INFO: renamed from: getRenderState$ReactAndroid_release, reason: from getter */
    public final VirtualViewRenderState getRenderState() {
        return this.renderState;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        doAttachedToWindow$ReactAndroid_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ReactScrollViewHelper.removeScrollListener(this);
        ReactScrollViewHelper.removeLayoutChangeListener(this);
        if (this.detectWindowFocus) {
            getViewTreeObserver().addOnWindowFocusChangeListener(this.onWindowFocusChangeListener);
        }
        cleanupLayoutListeners();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top2, int right, int bottom) {
        super.onLayout(changed, left, top2, right, bottom);
        if (changed) {
            this.offsetChanged = true;
            dispatchOnModeChangeIfNeeded(false);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(@Nullable View v3, int left, int top2, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        this.offsetChanged = (!this.offsetChanged && oldLeft == left && oldTop == top2) ? false : true;
        dispatchOnModeChangeIfNeeded(true);
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.ScrollListener
    public void onScroll(@Nullable ViewGroup scrollView, @Nullable ScrollEventType scrollEventType, float xVelocity, float yVelocity) {
        if (Intrinsics.c(scrollView, this.parentScrollView)) {
            dispatchOnModeChangeIfNeeded(false);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup
    public void recycleView$ReactAndroid_release() {
        ReactScrollViewHelper.removeScrollListener(this);
        ReactScrollViewHelper.removeLayoutChangeListener(this);
        cleanupLayoutListeners();
        this.mode = null;
        this.modeChangeEmitter = null;
        this.lastRect.setEmpty();
        this.parentScrollView = null;
        this.offsetX = 0;
        this.offsetY = 0;
        this.offsetChanged = false;
    }

    public final void setMode$ReactAndroid_release(@Nullable VirtualViewMode virtualViewMode) {
        this.mode = virtualViewMode;
    }

    public final void setModeChangeEmitter$ReactAndroid_release(@Nullable ModeChangeEmitter modeChangeEmitter) {
        this.modeChangeEmitter = modeChangeEmitter;
    }

    public final void setPrerenderRatio$ReactAndroid_release(double d2) {
        this.prerenderRatio = d2;
    }

    public final void setRenderState$ReactAndroid_release(@NotNull VirtualViewRenderState virtualViewRenderState) {
        Intrinsics.checkNotNullParameter(virtualViewRenderState, "<set-?>");
        this.renderState = virtualViewRenderState;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.LayoutChangeListener
    public void onLayoutChange(@NotNull ViewGroup scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        if (Intrinsics.c(scrollView, this.parentScrollView)) {
            this.offsetChanged = true;
            dispatchOnModeChangeIfNeeded(false);
        }
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.ScrollListener
    public void onLayout(@Nullable ViewGroup scrollView) {
        if (Intrinsics.c(scrollView, this.parentScrollView)) {
            dispatchOnModeChangeIfNeeded(false);
        }
    }
}
