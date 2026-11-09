package com.facebook.react.views.modal;

import Hb.L;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.activity.n;
import androidx.activity.z;
import androidx.annotation.UiThread;
import androidx.core.view.C1052d;
import androidx.core.view.q0;
import androidx.core.view.r0;
import androidx.core.view.s0;
import androidx.core.view.u0;
import androidx.core.view.v0;
import androidx.core.view.w0;
import com.adjust.sdk.Constants;
import com.facebook.react.R;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.JSPointerDispatcher;
import com.facebook.react.uimanager.JSTouchDispatcher;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.common.ContextUtils;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.WindowUtilKt;
import com.facebook.yoga.annotations.DoNotStrip;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.chromium.support_lib_boundary.util.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u0085\u00012\u00020\u00012\u00020\u0002:\u0006\u0086\u0001\u0085\u0001\u0087\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001a\u0010\u0019J!\u0010\u001e\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010\u0017J'\u0010*\u001a\u00020\t2\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u001b0'j\b\u0012\u0004\u0012\u00020\u001b`(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\t¢\u0006\u0004\b0\u0010\u0019J\u000f\u00101\u001a\u00020\tH\u0016¢\u0006\u0004\b1\u0010\u0019J\u000f\u00102\u001a\u00020\tH\u0016¢\u0006\u0004\b2\u0010\u0019J\u000f\u00103\u001a\u00020\tH\u0016¢\u0006\u0004\b3\u0010\u0019J\r\u00104\u001a\u00020\t¢\u0006\u0004\b4\u0010\u0019J\u0017\u00107\u001a\u00020\t2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\tH\u0002¢\u0006\u0004\b9\u0010\u0019J\u0011\u0010;\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\b;\u0010<J\u0019\u0010>\u001a\u00020\f2\b\u0010=\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\tH\u0002¢\u0006\u0004\b@\u0010\u0019J\u000f\u0010A\u001a\u00020\tH\u0002¢\u0006\u0004\bA\u0010\u0019J1\u0010H\u001a\u00020\t2\u0006\u0010C\u001a\u00020B2\b\u0010E\u001a\u0004\u0018\u00010D2\u000e\b\u0002\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000e0FH\u0002¢\u0006\u0004\bH\u0010IR(\u0010L\u001a\u0004\u0018\u00010J2\b\u0010K\u001a\u0004\u0018\u00010J8G@BX\u0086\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\"\u0010P\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010W\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010^\u001a\u0004\u0018\u00010]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR*\u0010d\u001a\u00020\f2\u0006\u0010K\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010Q\u001a\u0004\be\u0010S\"\u0004\bf\u0010UR*\u0010g\u001a\u00020\f2\u0006\u0010K\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010Q\u001a\u0004\bh\u0010S\"\u0004\bi\u0010UR.\u0010j\u001a\u0004\u0018\u0001052\b\u0010K\u001a\u0004\u0018\u0001058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u00108R*\u0010o\u001a\u00020\f2\u0006\u0010K\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010Q\u001a\u0004\bp\u0010S\"\u0004\bq\u0010UR\u0014\u0010s\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010u\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010QR(\u0010w\u001a\u0004\u0018\u00010v2\b\u0010w\u001a\u0004\u0018\u00010v8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R*\u0010}\u001a\u0004\u0018\u00010|2\b\u0010}\u001a\u0004\u0018\u00010|8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0084\u0001\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0088\u0001"}, d2 = {"Lcom/facebook/react/views/modal/ReactModalHostView;", "Landroid/view/ViewGroup;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "Landroid/view/ViewStructure;", "structure", "", "dispatchProvideStructure", "(Landroid/view/ViewStructure;)V", "", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "id", "setId", "(I)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/View;", "child", FirebaseAnalytics.Param.INDEX, "addView", "(Landroid/view/View;I)V", "getChildCount", "()I", "getChildAt", "(I)Landroid/view/View;", "removeView", "(Landroid/view/View;)V", "removeViewAt", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "outChildren", "addChildrenForAccessibility", "(Ljava/util/ArrayList;)V", "Landroid/view/accessibility/AccessibilityEvent;", "event", "dispatchPopulateAccessibilityEvent", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "onDropInstance", "onHostResume", "onHostPause", "onHostDestroy", "showOrUpdate", "", "testId", "setDialogRootViewGroupTestId", "(Ljava/lang/String;)V", PPRNBridge.DIALOG_ACTION_DISMISS, "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "activity", "isFlagSecureSet", "(Landroid/app/Activity;)Z", "updateProperties", "updateSystemAppearance", "Landroidx/core/view/q0;", "activityRootWindowInsets", "Landroidx/core/view/w0;", "dialogWindowInsetsController", "", "types", "syncSystemBarsVisibility", "(Landroidx/core/view/q0;Landroidx/core/view/w0;Ljava/util/List;)V", "Landroidx/activity/n;", "value", "dialog", "Landroidx/activity/n;", "getDialog", "()Landroidx/activity/n;", "transparent", "Z", "getTransparent", "()Z", "setTransparent", "(Z)V", "Landroid/content/DialogInterface$OnShowListener;", "onShowListener", "Landroid/content/DialogInterface$OnShowListener;", "getOnShowListener", "()Landroid/content/DialogInterface$OnShowListener;", "setOnShowListener", "(Landroid/content/DialogInterface$OnShowListener;)V", "Lcom/facebook/react/views/modal/ReactModalHostView$OnRequestCloseListener;", "onRequestCloseListener", "Lcom/facebook/react/views/modal/ReactModalHostView$OnRequestCloseListener;", "getOnRequestCloseListener", "()Lcom/facebook/react/views/modal/ReactModalHostView$OnRequestCloseListener;", "setOnRequestCloseListener", "(Lcom/facebook/react/views/modal/ReactModalHostView$OnRequestCloseListener;)V", "statusBarTranslucent", "getStatusBarTranslucent", "setStatusBarTranslucent", "navigationBarTranslucent", "getNavigationBarTranslucent", "setNavigationBarTranslucent", "animationType", "Ljava/lang/String;", "getAnimationType", "()Ljava/lang/String;", "setAnimationType", "hardwareAccelerated", "getHardwareAccelerated", "setHardwareAccelerated", "Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;", "dialogRootViewGroup", "Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;", "createNewDialog", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", "getStateWrapper", "()Lcom/facebook/react/uimanager/StateWrapper;", "setStateWrapper", "(Lcom/facebook/react/uimanager/StateWrapper;)V", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "getEventDispatcher", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "setEventDispatcher", "(Lcom/facebook/react/uimanager/events/EventDispatcher;)V", "getContentView", "()Landroid/view/View;", "contentView", "Companion", "OnRequestCloseListener", "DialogRootViewGroup", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nReactModalHostView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactModalHostView.kt\ncom/facebook/react/views/modal/ReactModalHostView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,635:1\n1#2:636\n1869#3,2:637\n*S KotlinDebug\n*F\n+ 1 ReactModalHostView.kt\ncom/facebook/react/views/modal/ReactModalHostView\n*L\n454#1:637,2\n*E\n"})
public final class ReactModalHostView extends ViewGroup implements LifecycleEventListener {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "ReactModalHost";
    private static int statusBarHeight;

    @Nullable
    private String animationType;
    private boolean createNewDialog;

    @Nullable
    private n dialog;

    @NotNull
    private final DialogRootViewGroup dialogRootViewGroup;
    private boolean hardwareAccelerated;
    private boolean navigationBarTranslucent;

    @Nullable
    private OnRequestCloseListener onRequestCloseListener;

    @Nullable
    private DialogInterface.OnShowListener onShowListener;
    private boolean statusBarTranslucent;
    private boolean transparent;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0003J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/react/views/modal/ReactModalHostView$Companion;", "", "<init>", "()V", "TAG", "", "statusBarHeight", "", "initStatusBarHeight", "", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "getScreenDisplayMetricsWithoutInsets", "", "encodeFloatsToLong", "width", "", "height", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final long encodeFloatsToLong(float width, float height) {
            return ((long) Float.floatToRawIntBits(height)) | (((long) Float.floatToRawIntBits(width)) << 32);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        @DoNotStrip
        public final long getScreenDisplayMetricsWithoutInsets() {
            DisplayMetrics screenDisplayMetrics = DisplayMetricsHolder.getScreenDisplayMetrics();
            PixelUtil pixelUtil = PixelUtil.INSTANCE;
            return encodeFloatsToLong(pixelUtil.pxToDp(screenDisplayMetrics.widthPixels), pixelUtil.pxToDp(screenDisplayMetrics.heightPixels - ReactModalHostView.statusBarHeight));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void initStatusBarHeight(ReactContext reactContext) {
            ReactModalHostView.statusBarHeight = DisplayMetricsHolder.INSTANCE.getStatusBarHeightPx$ReactAndroid_release(reactContext.getCurrentActivity());
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J(\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u0014H\u0014J\u0018\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0014H\u0007J\u0010\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0017J\u0010\u00102\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00103\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u001a\u00104\u001a\u00020\u001f2\b\u00105\u001a\u0004\u0018\u0001062\u0006\u00107\u001a\u000200H\u0016J\u0018\u00108\u001a\u00020\u001f2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000200H\u0016J\u0010\u00109\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020.H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006;"}, d2 = {"Lcom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Lcom/facebook/react/uimanager/RootView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "getStateWrapper$ReactAndroid_release", "()Lcom/facebook/react/uimanager/StateWrapper;", "setStateWrapper$ReactAndroid_release", "(Lcom/facebook/react/uimanager/StateWrapper;)V", "eventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getEventDispatcher$ReactAndroid_release", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "setEventDispatcher$ReactAndroid_release", "(Lcom/facebook/react/uimanager/events/EventDispatcher;)V", "viewWidth", "", "viewHeight", "jSTouchDispatcher", "Lcom/facebook/react/uimanager/JSTouchDispatcher;", "jSPointerDispatcher", "Lcom/facebook/react/uimanager/JSPointerDispatcher;", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getReactContext", "()Lcom/facebook/react/uimanager/ThemedReactContext;", "onInitializeAccessibilityNodeInfo", "", Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH, "Landroid/view/accessibility/AccessibilityNodeInfo;", "onSizeChanged", "w", "h", "oldw", "oldh", "updateState", "width", "height", "handleException", "t", "", "onInterceptTouchEvent", "", "event", "Landroid/view/MotionEvent;", "onTouchEvent", "onInterceptHoverEvent", "onHoverEvent", "onChildStartedNativeGesture", "childView", "Landroid/view/View;", "ev", "onChildEndedNativeGesture", "requestDisallowInterceptTouchEvent", "disallowIntercept", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nReactModalHostView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactModalHostView.kt\ncom/facebook/react/views/modal/ReactModalHostView$DialogRootViewGroup\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,635:1\n1#2:636\n*E\n"})
    public static final class DialogRootViewGroup extends ReactViewGroup implements RootView {

        @Nullable
        private EventDispatcher eventDispatcher;

        @Nullable
        private JSPointerDispatcher jSPointerDispatcher;

        @NotNull
        private final JSTouchDispatcher jSTouchDispatcher;

        @Nullable
        private StateWrapper stateWrapper;
        private int viewHeight;
        private int viewWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogRootViewGroup(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.jSTouchDispatcher = new JSTouchDispatcher(this);
            if (ReactFeatureFlags.dispatchPointerEvents) {
                this.jSPointerDispatcher = new JSPointerDispatcher(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ThemedReactContext getReactContext() {
            Context context = getContext();
            Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
            return (ThemedReactContext) context;
        }

        @Nullable
        /* JADX INFO: renamed from: getEventDispatcher$ReactAndroid_release, reason: from getter */
        public final EventDispatcher getEventDispatcher() {
            return this.eventDispatcher;
        }

        @Nullable
        /* JADX INFO: renamed from: getStateWrapper$ReactAndroid_release, reason: from getter */
        public final StateWrapper getStateWrapper() {
            return this.stateWrapper;
        }

        @Override // com.facebook.react.uimanager.RootView
        public void handleException(@NotNull Throwable t) {
            Intrinsics.checkNotNullParameter(t, "t");
            getReactContext().getReactApplicationContext().handleException(new RuntimeException(t));
        }

        @Override // com.facebook.react.uimanager.RootView
        public void onChildEndedNativeGesture(@NotNull View childView, @NotNull MotionEvent ev) {
            Intrinsics.checkNotNullParameter(childView, "childView");
            Intrinsics.checkNotNullParameter(ev, "ev");
            EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher != null) {
                this.jSTouchDispatcher.onChildEndedNativeGesture(ev, eventDispatcher);
            }
            JSPointerDispatcher jSPointerDispatcher = this.jSPointerDispatcher;
            if (jSPointerDispatcher != null) {
                jSPointerDispatcher.onChildEndedNativeGesture();
            }
        }

        @Override // com.facebook.react.uimanager.RootView
        public void onChildStartedNativeGesture(@Nullable View childView, @NotNull MotionEvent ev) {
            Intrinsics.checkNotNullParameter(ev, "ev");
            EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher != null) {
                this.jSTouchDispatcher.onChildStartedNativeGesture(ev, eventDispatcher);
                JSPointerDispatcher jSPointerDispatcher = this.jSPointerDispatcher;
                if (jSPointerDispatcher != null) {
                    jSPointerDispatcher.onChildStartedNativeGesture(childView, ev, eventDispatcher);
                }
            }
        }

        @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
        public boolean onHoverEvent(@NotNull MotionEvent event) {
            JSPointerDispatcher jSPointerDispatcher;
            Intrinsics.checkNotNullParameter(event, "event");
            EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher != null && (jSPointerDispatcher = this.jSPointerDispatcher) != null) {
                jSPointerDispatcher.handleMotionEvent(event, eventDispatcher, false);
            }
            return super.onHoverEvent(event);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@NotNull AccessibilityNodeInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            super.onInitializeAccessibilityNodeInfo(info);
            String str = (String) getTag(R.id.react_test_id);
            if (str != null) {
                info.setViewIdResourceName(str);
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptHoverEvent(@NotNull MotionEvent event) {
            JSPointerDispatcher jSPointerDispatcher;
            Intrinsics.checkNotNullParameter(event, "event");
            EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher != null && (jSPointerDispatcher = this.jSPointerDispatcher) != null) {
                jSPointerDispatcher.handleMotionEvent(event, eventDispatcher, true);
            }
            return super.onHoverEvent(event);
        }

        @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup
        public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher != null) {
                this.jSTouchDispatcher.handleTouchEvent(event, eventDispatcher, getReactContext());
                JSPointerDispatcher jSPointerDispatcher = this.jSPointerDispatcher;
                if (jSPointerDispatcher != null) {
                    jSPointerDispatcher.handleMotionEvent(event, eventDispatcher, true);
                }
            }
            return super.onInterceptTouchEvent(event);
        }

        @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
        public void onSizeChanged(int w3, int h7, int oldw, int oldh) {
            super.onSizeChanged(w3, h7, oldw, oldh);
            this.viewWidth = w3;
            this.viewHeight = h7;
            updateState(w3, h7);
        }

        @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(@NotNull MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher != null) {
                this.jSTouchDispatcher.handleTouchEvent(event, eventDispatcher, getReactContext());
                JSPointerDispatcher jSPointerDispatcher = this.jSPointerDispatcher;
                if (jSPointerDispatcher != null) {
                    jSPointerDispatcher.handleMotionEvent(event, eventDispatcher, false);
                }
            }
            super.onTouchEvent(event);
            return true;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        }

        public final void setEventDispatcher$ReactAndroid_release(@Nullable EventDispatcher eventDispatcher) {
            this.eventDispatcher = eventDispatcher;
        }

        public final void setStateWrapper$ReactAndroid_release(@Nullable StateWrapper stateWrapper) {
            this.stateWrapper = stateWrapper;
        }

        @UiThread
        public final void updateState(int width, int height) {
            PixelUtil pixelUtil = PixelUtil.INSTANCE;
            float fPxToDp = pixelUtil.pxToDp(width);
            float fPxToDp2 = pixelUtil.pxToDp(height);
            StateWrapper stateWrapper = this.stateWrapper;
            if (stateWrapper != null) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("screenWidth", fPxToDp);
                writableNativeMap.putDouble("screenHeight", fPxToDp2);
                stateWrapper.updateState(writableNativeMap);
                return;
            }
            if (ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
                return;
            }
            ThemedReactContext reactContext = getReactContext();
            final ThemedReactContext reactContext2 = getReactContext();
            reactContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactContext2) { // from class: com.facebook.react.views.modal.ReactModalHostView$DialogRootViewGroup$updateState$1$1
                @Override // com.facebook.react.bridge.GuardedRunnable
                public void runGuarded() {
                    UIManagerModule uIManagerModule = (UIManagerModule) this.$this_run.getReactContext().getReactApplicationContext().getNativeModule(UIManagerModule.class);
                    if (uIManagerModule != null) {
                        uIManagerModule.updateNodeSize(this.$this_run.getId(), this.$this_run.viewWidth, this.$this_run.viewHeight);
                    }
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/facebook/react/views/modal/ReactModalHostView$OnRequestCloseListener;", "", "onRequestClose", "", "dialog", "Landroid/content/DialogInterface;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnRequestCloseListener {
        void onRequestClose(@Nullable DialogInterface dialog);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactModalHostView(@NotNull ThemedReactContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Companion.initStatusBarHeight(context);
        this.dialogRootViewGroup = new DialogRootViewGroup(context);
    }

    private final void dismiss() {
        Activity activity;
        UiThreadUtil.assertOnUiThread();
        n nVar = this.dialog;
        if (nVar != null) {
            if (nVar.isShowing() && ((activity = (Activity) ContextUtils.findContextOfType(nVar.getContext(), Activity.class)) == null || !activity.isFinishing())) {
                nVar.dismiss();
            }
            this.dialog = null;
            this.createNewDialog = true;
            ViewParent parent = this.dialogRootViewGroup.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeViewAt(0);
            }
        }
    }

    private final View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.dialogRootViewGroup);
        if (!getStatusBarTranslucent()) {
            frameLayout.setFitsSystemWindows(true);
        }
        return frameLayout;
    }

    private final Activity getCurrentActivity() {
        Context context = getContext();
        Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        return ((ThemedReactContext) context).getCurrentActivity();
    }

    @JvmStatic
    @DoNotStrip
    private static final long getScreenDisplayMetricsWithoutInsets() {
        return Companion.getScreenDisplayMetricsWithoutInsets();
    }

    private final boolean isFlagSecureSet(Activity activity) {
        return (activity == null || (activity.getWindow().getAttributes().flags & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showOrUpdate$lambda$2(ReactModalHostView reactModalHostView, n nVar) {
        OnRequestCloseListener onRequestCloseListener = reactModalHostView.onRequestCloseListener;
        if (onRequestCloseListener == null) {
            throw new IllegalStateException("onRequestClose callback must be set if back key is expected to close the modal");
        }
        onRequestCloseListener.onRequestClose(nVar);
        return Unit.f38893a;
    }

    private final void syncSystemBarsVisibility(q0 activityRootWindowInsets, w0 dialogWindowInsetsController, List<Integer> types) {
        Iterator<T> it = types.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (activityRootWindowInsets.f16277a.p(iIntValue)) {
                if (dialogWindowInsetsController != null) {
                    dialogWindowInsetsController.f16298a.k0(iIntValue);
                }
            } else if (dialogWindowInsetsController != null) {
                dialogWindowInsetsController.f16298a.G(iIntValue);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void syncSystemBarsVisibility$default(ReactModalHostView reactModalHostView, q0 q0Var, w0 w0Var, List list, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            list = C1850q.h(1, 2);
        }
        reactModalHostView.syncSystemBarsVisibility(q0Var, w0Var, list);
    }

    private final void updateProperties() {
        n nVar = this.dialog;
        if (nVar == null) {
            throw new IllegalStateException("dialog must exist when we call updateProperties");
        }
        Window window = nVar.getWindow();
        if (window == null) {
            throw new IllegalStateException("dialog must have window when we call updateProperties");
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing() || currentActivity.isDestroyed()) {
            return;
        }
        try {
            Window window2 = currentActivity.getWindow();
            if (window2 != null) {
                if ((window2.getAttributes().flags & 1024) != 0) {
                    window.addFlags(1024);
                } else {
                    window.clearFlags(1024);
                }
            }
            if (getNavigationBarTranslucent()) {
                WindowUtilKt.enableEdgeToEdge(window);
            } else {
                WindowUtilKt.disableEdgeToEdge(window);
                WindowUtilKt.setStatusBarTranslucency(window, getStatusBarTranslucent());
            }
            if (this.transparent) {
                window.clearFlags(2);
            } else {
                window.setDimAmount(0.5f);
                window.setFlags(2, 2);
            }
        } catch (IllegalArgumentException e10) {
            p229p2.a.j(TAG, "ReactModalHostView: error while setting window flags: ", e10.getMessage());
        }
    }

    private final void updateSystemAppearance() {
        b s0Var;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        n nVar = this.dialog;
        if (nVar == null) {
            throw new IllegalStateException("dialog must exist when we call updateProperties");
        }
        Window window = nVar.getWindow();
        if (window == null) {
            throw new IllegalStateException("dialog must have window when we call updateProperties");
        }
        Window window2 = currentActivity.getWindow();
        if (Build.VERSION.SDK_INT <= 30) {
            window.getDecorView().setSystemUiVisibility(window2.getDecorView().getSystemUiVisibility());
            return;
        }
        C1052d c1052d = new C1052d(window2.getDecorView(), 4);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            s0Var = new v0(window2, c1052d);
        } else if (i7 >= 30) {
            s0Var = new u0(window2, c1052d);
        } else {
            s0Var = i7 >= 26 ? new s0(window2, c1052d) : new r0(window2, c1052d);
        }
        w0 w0Var = new w0(window.getDecorView(), window);
        if (WindowUtilKt.isEdgeToEdgeFeatureFlagOn()) {
            s0Var.h0();
            w0Var.f16298a.h0();
        }
        w0Var.f16298a.d0(s0Var.N());
        WindowInsets rootWindowInsets = window2.getDecorView().getRootWindowInsets();
        if (rootWindowInsets != null) {
            q0 q0VarH = q0.h(null, rootWindowInsets);
            Intrinsics.checkNotNullExpressionValue(q0VarH, "toWindowInsetsCompat(...)");
            syncSystemBarsVisibility$default(this, q0VarH, w0Var, null, 4, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(@NotNull ArrayList<View> outChildren) {
        Intrinsics.checkNotNullParameter(outChildren, "outChildren");
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View child, int index) {
        UiThreadUtil.assertOnUiThread();
        this.dialogRootViewGroup.addView(child, index);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(@NotNull AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(@NotNull ViewStructure structure) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        this.dialogRootViewGroup.dispatchProvideStructure(structure);
    }

    @Nullable
    public final String getAnimationType() {
        return this.animationType;
    }

    @Override // android.view.ViewGroup
    @Nullable
    public View getChildAt(int index) {
        return this.dialogRootViewGroup.getChildAt(index);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.dialogRootViewGroup.getChildCount();
    }

    @VisibleForTesting
    @Nullable
    public final n getDialog() {
        return this.dialog;
    }

    @Nullable
    public final EventDispatcher getEventDispatcher() {
        return this.dialogRootViewGroup.getEventDispatcher();
    }

    public final boolean getHardwareAccelerated() {
        return this.hardwareAccelerated;
    }

    public final boolean getNavigationBarTranslucent() {
        return this.navigationBarTranslucent || WindowUtilKt.isEdgeToEdgeFeatureFlagOn();
    }

    @Nullable
    public final OnRequestCloseListener getOnRequestCloseListener() {
        return this.onRequestCloseListener;
    }

    @Nullable
    public final DialogInterface.OnShowListener getOnShowListener() {
        return this.onShowListener;
    }

    @Nullable
    public final StateWrapper getStateWrapper() {
        return this.dialogRootViewGroup.getStateWrapper();
    }

    public final boolean getStatusBarTranslucent() {
        return this.statusBarTranslucent || WindowUtilKt.isEdgeToEdgeFeatureFlagOn();
    }

    public final boolean getTransparent() {
        return this.transparent;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((ThemedReactContext) context).addLifecycleEventListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        onDropInstance();
    }

    public final void onDropInstance() {
        Context context = getContext();
        Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((ThemedReactContext) context).removeLifecycleEventListener(this);
        dismiss();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        onDropInstance();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        showOrUpdate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l5, int t, int r3, int b7) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@Nullable View child) {
        UiThreadUtil.assertOnUiThread();
        if (child != null) {
            this.dialogRootViewGroup.removeView(child);
        }
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int index) {
        UiThreadUtil.assertOnUiThread();
        this.dialogRootViewGroup.removeView(getChildAt(index));
    }

    public final void setAnimationType(@Nullable String str) {
        this.animationType = str;
        this.createNewDialog = true;
    }

    public final void setDialogRootViewGroupTestId(@Nullable String testId) {
        this.dialogRootViewGroup.setTag(R.id.react_test_id, testId);
    }

    public final void setEventDispatcher(@Nullable EventDispatcher eventDispatcher) {
        this.dialogRootViewGroup.setEventDispatcher$ReactAndroid_release(eventDispatcher);
    }

    public final void setHardwareAccelerated(boolean z3) {
        this.hardwareAccelerated = z3;
        this.createNewDialog = true;
    }

    @Override // android.view.View
    public void setId(int id2) {
        super.setId(id2);
        this.dialogRootViewGroup.setId(id2);
    }

    public final void setNavigationBarTranslucent(boolean z3) {
        this.navigationBarTranslucent = z3;
        this.createNewDialog = this.createNewDialog || !WindowUtilKt.isEdgeToEdgeFeatureFlagOn();
    }

    public final void setOnRequestCloseListener(@Nullable OnRequestCloseListener onRequestCloseListener) {
        this.onRequestCloseListener = onRequestCloseListener;
    }

    public final void setOnShowListener(@Nullable DialogInterface.OnShowListener onShowListener) {
        this.onShowListener = onShowListener;
    }

    public final void setStateWrapper(@Nullable StateWrapper stateWrapper) {
        this.dialogRootViewGroup.setStateWrapper$ReactAndroid_release(stateWrapper);
    }

    public final void setStatusBarTranslucent(boolean z3) {
        this.statusBarTranslucent = z3;
        this.createNewDialog = this.createNewDialog || !WindowUtilKt.isEdgeToEdgeFeatureFlagOn();
    }

    public final void setTransparent(boolean z3) {
        this.transparent = z3;
    }

    public final void showOrUpdate() {
        int i7;
        UiThreadUtil.assertOnUiThread();
        if (!this.createNewDialog) {
            updateProperties();
            return;
        }
        dismiss();
        this.createNewDialog = false;
        String str = this.animationType;
        if (Intrinsics.c(str, "fade")) {
            i7 = R.style.Theme_FullScreenDialogAnimatedFade;
        } else {
            i7 = Intrinsics.c(str, "slide") ? R.style.Theme_FullScreenDialogAnimatedSlide : R.style.Theme_FullScreenDialog;
        }
        Activity currentActivity = getCurrentActivity();
        Context context = currentActivity != null ? currentActivity : getContext();
        Intrinsics.e(context);
        n nVar = new n(context, i7);
        this.dialog = nVar;
        Window window = nVar.getWindow();
        if (window == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        window.setFlags(8, 8);
        nVar.setContentView(getContentView());
        updateProperties();
        nVar.setOnShowListener(this.onShowListener);
        final L l5 = new L(8, this, nVar);
        nVar.getOnBackPressedDispatcher().a(nVar, new z() { // from class: com.facebook.react.views.modal.ReactModalHostView$showOrUpdate$backPressedCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true);
            }

            @Override // androidx.activity.z
            public void handleOnBackPressed() {
                l5.invoke();
            }
        });
        nVar.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.facebook.react.views.modal.ReactModalHostView.showOrUpdate.1
            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.getAction() != 1) {
                    return false;
                }
                if (keyCode == 4 || keyCode == 111) {
                    l5.invoke();
                    return true;
                }
                Context context2 = this.getContext();
                Intrinsics.f(context2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                Activity currentActivity2 = ((ReactContext) context2).getCurrentActivity();
                if (currentActivity2 != null) {
                    return currentActivity2.onKeyUp(keyCode, event);
                }
                return false;
            }
        });
        window.setSoftInputMode(16);
        if (this.hardwareAccelerated) {
            window.addFlags(PointerEventHelper.X_FLAG_SUPPORTS_HOVER);
        }
        if (isFlagSecureSet(currentActivity)) {
            window.setFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE, UserMetadata.MAX_INTERNAL_KEY_SIZE);
        }
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        nVar.show();
        updateSystemAppearance();
        window.clearFlags(8);
    }
}
