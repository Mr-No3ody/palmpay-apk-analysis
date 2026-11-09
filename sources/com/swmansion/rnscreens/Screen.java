package com.swmansion.rnscreens;

import M7.C0443c;
import M7.EnumC0454n;
import M7.EnumC0455o;
import M7.RunnableC0447g;
import M7.p;
import M7.q;
import M7.r;
import N7.k;
import Z4.e;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Paint;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.camera.core.impl.utils.executor.g;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.c;
import androidx.core.view.F;
import androidx.core.view.N;
import androidx.core.view.P;
import androidx.core.view.Q;
import androidx.core.view.q0;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.palmpay.lib.webview.container.PPWebActivity;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.bottomsheet.SheetDelegate;
import com.swmansion.rnscreens.gamma.common.FragmentProviding;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.C1849p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\b5E=\fÂ\u0001Ã\u0001J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u000bR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u00100\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR(\u0010\u0011\u001a\u0004\u0018\u00010M2\b\u00100\u001a\u0004\u0018\u00010M8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR$\u0010W\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010\u0013R$\u0010Z\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010_\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010\u001b\u001a\u0004\b_\u0010\u001d\"\u0004\b`\u0010\u000bR*\u0010h\u001a\u00020a2\u0006\u00100\u001a\u00020a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010l\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010\u001b\u001a\u0004\bj\u0010\u001d\"\u0004\bk\u0010\u000bR\"\u0010t\u001a\u00020m8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010{\u001a\u00020M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\"\u0010\u007f\u001a\u00020M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010v\u001a\u0004\b}\u0010x\"\u0004\b~\u0010zR&\u0010\u0083\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010\u001b\u001a\u0005\b\u0081\u0001\u0010\u001d\"\u0005\b\u0082\u0001\u0010\u000bR&\u0010\u0087\u0001\u001a\u00020a8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010c\u001a\u0005\b\u0085\u0001\u0010e\"\u0005\b\u0086\u0001\u0010gR&\u0010\u008b\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010\u001b\u001a\u0005\b\u0089\u0001\u0010\u001d\"\u0005\b\u008a\u0001\u0010\u000bR&\u0010\u008f\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010\u001b\u001a\u0005\b\u008d\u0001\u0010\u001d\"\u0005\b\u008e\u0001\u0010\u000bR&\u0010\u0093\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010\u001b\u001a\u0005\b\u0091\u0001\u0010\u001d\"\u0005\b\u0092\u0001\u0010\u000bR7\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0094\u00012\t\u00100\u001a\u0005\u0018\u00010\u0094\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R3\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00102\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00108\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010S\u001a\u0005\b\u009e\u0001\u0010U\"\u0005\b\u009f\u0001\u0010\u0013R3\u0010¢\u0001\u001a\u0004\u0018\u00010\u00072\t\u0010 \u0001\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b¡\u0001\u0010Y\u001a\u0005\b¢\u0001\u0010[\"\u0005\b£\u0001\u0010]R3\u0010¦\u0001\u001a\u0004\u0018\u00010\u00072\t\u0010¤\u0001\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b¥\u0001\u0010Y\u001a\u0005\b¦\u0001\u0010[\"\u0005\b§\u0001\u0010]R&\u0010«\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¨\u0001\u0010\u001b\u001a\u0005\b©\u0001\u0010\u001d\"\u0005\bª\u0001\u0010\u000bR\u0015\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010\u0006R\u001d\u0010±\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010®\u00018F¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0017\u0010µ\u0001\u001a\u0005\u0018\u00010²\u00018F¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001R&\u0010¶\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¶\u0001\u0010\u001b\u001a\u0005\b¶\u0001\u0010\u001d\"\u0005\b·\u0001\u0010\u000bR&\u0010¸\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¸\u0001\u0010\u001b\u001a\u0005\b¸\u0001\u0010\u001d\"\u0005\b¹\u0001\u0010\u000bR\u0017\u0010½\u0001\u001a\u0005\u0018\u00010º\u00018F¢\u0006\b\u001a\u0006\b»\u0001\u0010¼\u0001R\u0017\u0010Á\u0001\u001a\u0005\u0018\u00010¾\u00018F¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001¨\u0006Ä\u0001"}, d2 = {"Lcom/swmansion/rnscreens/Screen;", "Lcom/swmansion/rnscreens/FabricEnabledViewGroup;", "Lcom/swmansion/rnscreens/ScreenContentWrapper$OnLayoutCallback;", "Lcom/swmansion/rnscreens/gamma/common/FragmentProviding;", "Landroidx/fragment/app/Fragment;", "getAssociatedFragment", "()Landroidx/fragment/app/Fragment;", "", "transitioning", "", "setTransitioning", "(Z)V", "LM7/n;", "activityState", "setActivityState", "(LM7/n;)V", "", "screenOrientation", "setScreenOrientation", "(Ljava/lang/String;)V", "Lcom/facebook/react/uimanager/ThemedReactContext;", "e", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getReactContext", "()Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "f", "Z", "getInsetsApplied", "()Z", "setInsetsApplied", "insetsApplied", "Lcom/swmansion/rnscreens/ScreenFragmentWrapper;", "g", "Lcom/swmansion/rnscreens/ScreenFragmentWrapper;", "getFragmentWrapper", "()Lcom/swmansion/rnscreens/ScreenFragmentWrapper;", "setFragmentWrapper", "(Lcom/swmansion/rnscreens/ScreenFragmentWrapper;)V", "fragmentWrapper", "Lcom/swmansion/rnscreens/ScreenContainer;", "i", "Lcom/swmansion/rnscreens/ScreenContainer;", "getContainer", "()Lcom/swmansion/rnscreens/ScreenContainer;", "setContainer", "(Lcom/swmansion/rnscreens/ScreenContainer;)V", "container", "value", "j", "LM7/n;", "getActivityState", "()LM7/n;", "LM7/q;", "p", "LM7/q;", "getStackPresentation", "()LM7/q;", "setStackPresentation", "(LM7/q;)V", "stackPresentation", "LM7/o;", "t", "LM7/o;", "getReplaceAnimation", "()LM7/o;", "setReplaceAnimation", "(LM7/o;)V", "replaceAnimation", "LM7/p;", "v", "LM7/p;", "getStackAnimation", "()LM7/p;", "setStackAnimation", "(LM7/p;)V", "stackAnimation", "", "w", "Ljava/lang/Integer;", "getScreenOrientation", "()Ljava/lang/Integer;", "A", "Ljava/lang/String;", "getScreenId", "()Ljava/lang/String;", "setScreenId", "screenId", "B", "Ljava/lang/Boolean;", "isStatusBarAnimated", "()Ljava/lang/Boolean;", "setStatusBarAnimated", "(Ljava/lang/Boolean;)V", "C", "isBeingRemoved", "setBeingRemoved", "", "L", "F", "getSheetCornerRadius", "()F", "setSheetCornerRadius", "(F)V", "sheetCornerRadius", "M", "getSheetExpandsWhenScrolledToEdge", "setSheetExpandsWhenScrolledToEdge", "sheetExpandsWhenScrolledToEdge", "LN7/k;", "Q", "LN7/k;", "getSheetDetents", "()LN7/k;", "setSheetDetents", "(LN7/k;)V", "sheetDetents", "k0", "I", "getSheetLargestUndimmedDetentIndex", "()I", "setSheetLargestUndimmedDetentIndex", "(I)V", "sheetLargestUndimmedDetentIndex", "p0", "getSheetInitialDetentIndex", "setSheetInitialDetentIndex", "sheetInitialDetentIndex", TransType.TRANS_TYPE_BILLER_ASSOCIATIONS_AND_SOCIETIES, "getSheetClosesOnTouchOutside", "setSheetClosesOnTouchOutside", "sheetClosesOnTouchOutside", "r0", "getSheetElevation", "setSheetElevation", "sheetElevation", "s0", "getSheetShouldOverflowTopInset", "setSheetShouldOverflowTopInset", "sheetShouldOverflowTopInset", "t0", "getSheetDefaultResizeAnimationEnabled", "setSheetDefaultResizeAnimationEnabled", "sheetDefaultResizeAnimationEnabled", "u0", "getShouldTriggerPostponedTransitionAfterLayout", "setShouldTriggerPostponedTransitionAfterLayout", "shouldTriggerPostponedTransitionAfterLayout", "Lcom/swmansion/rnscreens/ScreenFooter;", "v0", "Lcom/swmansion/rnscreens/ScreenFooter;", "getFooter", "()Lcom/swmansion/rnscreens/ScreenFooter;", "setFooter", "(Lcom/swmansion/rnscreens/ScreenFooter;)V", "footer", "statusBarStyle", TransType.TRANS_TYPE_W0, "getStatusBarStyle", "setStatusBarStyle", "statusBarHidden", "x0", "isStatusBarHidden", "setStatusBarHidden", PPWebActivity.KEY_WEB_NAV_BAR, "y0", "isNavigationBarHidden", "setNavigationBarHidden", "z0", "getNativeBackButtonDismissalEnabled", "setNativeBackButtonDismissalEnabled", "nativeBackButtonDismissalEnabled", "getFragment", "fragment", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "getSheetBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "sheetBehavior", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getReactEventDispatcher", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "reactEventDispatcher", "isGestureEnabled", "setGestureEnabled", "isSheetGrabberVisible", "setSheetGrabberVisible", "Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;", "getHeaderConfig", "()Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;", "headerConfig", "Lcom/swmansion/rnscreens/ScreenContentWrapper;", "getContentWrapper", "()Lcom/swmansion/rnscreens/ScreenContentWrapper;", "contentWrapper", "M7/r", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Screen.kt\ncom/swmansion/rnscreens/Screen\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,793:1\n1#2:794\n1321#3,2:795\n*S KotlinDebug\n*F\n+ 1 Screen.kt\ncom/swmansion/rnscreens/Screen\n*L\n602#1:795,2\n*E\n"})
public final class Screen extends FabricEnabledViewGroup implements ScreenContentWrapper.OnLayoutCallback, FragmentProviding {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static final /* synthetic */ int f25275A0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name and from kotlin metadata */
    public String screenId;

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    public Boolean isStatusBarAnimated;

    /* JADX INFO: renamed from: C, reason: collision with root package name and from kotlin metadata */
    public boolean isBeingRemoved;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f25279H;

    /* JADX INFO: renamed from: L, reason: collision with root package name and from kotlin metadata */
    public float sheetCornerRadius;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    public boolean sheetExpandsWhenScrolledToEdge;

    /* JADX INFO: renamed from: Q, reason: collision with root package name and from kotlin metadata */
    public k sheetDetents;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final ThemedReactContext reactContext;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean insetsApplied;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public ScreenFragmentWrapper fragmentWrapper;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public ScreenContainer container;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public EnumC0454n activityState;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public int sheetLargestUndimmedDetentIndex;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f25289o;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public q stackPresentation;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public int sheetInitialDetentIndex;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public boolean sheetClosesOnTouchOutside;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public float sheetElevation;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public boolean sheetShouldOverflowTopInset;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public EnumC0455o replaceAnimation;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    public boolean sheetDefaultResizeAnimationEnabled;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    public boolean shouldTriggerPostponedTransitionAfterLayout;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public p stackAnimation;

    /* JADX INFO: renamed from: v0, reason: collision with root package name and from kotlin metadata */
    public ScreenFooter footer;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Integer screenOrientation;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    public String statusBarStyle;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    public Boolean isStatusBarHidden;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    public Boolean isNavigationBarHidden;

    /* JADX INFO: renamed from: z0, reason: collision with root package name and from kotlin metadata */
    public boolean nativeBackButtonDismissalEnabled;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Screen(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.stackPresentation = q.f5842a;
        this.replaceAnimation = EnumC0455o.f5830b;
        this.stackAnimation = p.f5832a;
        this.sheetExpandsWhenScrolledToEdge = true;
        this.sheetDetents = new k(C1849p.c(Double.valueOf(1.0d)));
        this.sheetLargestUndimmedDetentIndex = -1;
        this.sheetClosesOnTouchOutside = true;
        this.sheetElevation = 24.0f;
        this.sheetDefaultResizeAnimationEnabled = true;
        setLayoutParams(new WindowManager.LayoutParams(2));
        this.nativeBackButtonDismissalEnabled = true;
    }

    public static void b(ViewGroup viewGroup) {
        Iterator it = new P(viewGroup).iterator();
        while (true) {
            Q q10 = (Q) it;
            if (!q10.hasNext()) {
                return;
            }
            View view = (View) q10.next();
            viewGroup.endViewTransition(view);
            if (view instanceof ScreenStackHeaderConfig) {
                b(((ScreenStackHeaderConfig) view).getToolbar());
            }
            if (view instanceof ViewGroup) {
                b((ViewGroup) view);
            }
        }
    }

    public static boolean c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt instanceof WebView) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && c((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z3) {
        if (g.N(this) && (this.container instanceof ScreenStack)) {
            if (g.z(this)) {
                requestLayout();
            }
            if (z3) {
                a(getWidth(), getHeight(), getTop());
            }
            ScreenFooter screenFooter = this.footer;
            if (screenFooter != null) {
                getLeft();
                getTop();
                getRight();
                getBottom();
                ScreenContainer screenContainer = this.container;
                Intrinsics.e(screenContainer);
                screenFooter.e(screenContainer.getHeight());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }

    public final void e() {
        a(getWidth(), getHeight(), getTop() + ((int) getTranslationY()));
    }

    public final int f(int i7, float f10) {
        Integer numE;
        int iIntValue;
        Fragment fragment = getFragment();
        if (fragment != null) {
            Intrinsics.checkNotNullParameter(fragment, "<this>");
            SheetDelegate sheetDelegate = ((ScreenStackFragment) fragment).f25344L;
            if (sheetDelegate != null && (numE = sheetDelegate.e()) != null && i7 > (iIntValue = (int) (numE.intValue() + f10))) {
                return iIntValue;
            }
        }
        return i7;
    }

    public final void g(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if ((viewGroup instanceof SwipeRefreshLayout) && (childAt instanceof ImageView)) {
                    viewGroup.addView(new View(getContext()), i7);
                } else if (childAt != null) {
                    viewGroup.startViewTransition(childAt);
                }
                if (childAt instanceof ScreenStackHeaderConfig) {
                    g(((ScreenStackHeaderConfig) childAt).getToolbar());
                }
                if (childAt instanceof ViewGroup) {
                    g((ViewGroup) childAt);
                }
            }
        }
    }

    @Nullable
    public final EnumC0454n getActivityState() {
        return this.activityState;
    }

    @Override // com.swmansion.rnscreens.gamma.common.FragmentProviding
    @Nullable
    public Fragment getAssociatedFragment() {
        return getFragment();
    }

    @Nullable
    public final ScreenContainer getContainer() {
        return this.container;
    }

    @Nullable
    public final ScreenContentWrapper getContentWrapper() {
        Object next;
        Iterator it = new P(this).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((View) next) instanceof ScreenContentWrapper));
        if (next instanceof ScreenContentWrapper) {
            return (ScreenContentWrapper) next;
        }
        return null;
    }

    @Nullable
    public final ScreenFooter getFooter() {
        return this.footer;
    }

    @Nullable
    public final Fragment getFragment() {
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            return screenFragmentWrapper.getFragment();
        }
        return null;
    }

    @Nullable
    public final ScreenFragmentWrapper getFragmentWrapper() {
        return this.fragmentWrapper;
    }

    @Nullable
    public final ScreenStackHeaderConfig getHeaderConfig() {
        Object next;
        Iterator it = new P(this).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((View) next) instanceof ScreenStackHeaderConfig));
        if (next instanceof ScreenStackHeaderConfig) {
            return (ScreenStackHeaderConfig) next;
        }
        return null;
    }

    public final boolean getInsetsApplied() {
        return this.insetsApplied;
    }

    public final boolean getNativeBackButtonDismissalEnabled() {
        return this.nativeBackButtonDismissalEnabled;
    }

    @NotNull
    public final ThemedReactContext getReactContext() {
        return this.reactContext;
    }

    @Nullable
    public final EventDispatcher getReactEventDispatcher() {
        return UIManagerHelper.getEventDispatcherForReactTag(this.reactContext, getId());
    }

    @NotNull
    public final EnumC0455o getReplaceAnimation() {
        return this.replaceAnimation;
    }

    @Nullable
    public final String getScreenId() {
        return this.screenId;
    }

    @Nullable
    public final Integer getScreenOrientation() {
        return this.screenOrientation;
    }

    @Nullable
    public final BottomSheetBehavior<Screen> getSheetBehavior() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        c cVar = layoutParams instanceof c ? (c) layoutParams : null;
        CoordinatorLayout.Behavior behavior = cVar != null ? cVar.f15872a : null;
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        return null;
    }

    public final boolean getSheetClosesOnTouchOutside() {
        return this.sheetClosesOnTouchOutside;
    }

    public final float getSheetCornerRadius() {
        return this.sheetCornerRadius;
    }

    public final boolean getSheetDefaultResizeAnimationEnabled() {
        return this.sheetDefaultResizeAnimationEnabled;
    }

    @NotNull
    public final k getSheetDetents() {
        return this.sheetDetents;
    }

    public final float getSheetElevation() {
        return this.sheetElevation;
    }

    public final boolean getSheetExpandsWhenScrolledToEdge() {
        return this.sheetExpandsWhenScrolledToEdge;
    }

    public final int getSheetInitialDetentIndex() {
        return this.sheetInitialDetentIndex;
    }

    public final int getSheetLargestUndimmedDetentIndex() {
        return this.sheetLargestUndimmedDetentIndex;
    }

    public final boolean getSheetShouldOverflowTopInset() {
        return this.sheetShouldOverflowTopInset;
    }

    public final boolean getShouldTriggerPostponedTransitionAfterLayout() {
        return this.shouldTriggerPostponedTransitionAfterLayout;
    }

    @NotNull
    public final p getStackAnimation() {
        return this.stackAnimation;
    }

    @NotNull
    public final q getStackPresentation() {
        return this.stackPresentation;
    }

    @Nullable
    public final String getStatusBarStyle() {
        return this.statusBarStyle;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.insetsApplied = true;
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Fragment fragment;
        super.onAttachedToWindow();
        if (!g.N(this) || (fragment = getFragment()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        SheetDelegate listener = ((ScreenStackFragment) fragment).f25344L;
        if (listener != null) {
            C0443c c0443c = C0443c.f5809a;
            Intrinsics.checkNotNullParameter(listener, "listener");
            C0443c.f5810b.add(listener);
        }
    }

    @Override // com.swmansion.rnscreens.ScreenContentWrapper.OnLayoutCallback
    public final void onContentWrapperLayout(boolean z3, int i7, int i10, int i11, int i12) {
        int i13 = i12 - i10;
        BottomSheetBehavior<Screen> sheetBehavior = getSheetBehavior();
        if (g.N(this) && g.z(this) && sheetBehavior != null) {
            Intrinsics.checkNotNullParameter(sheetBehavior, "<this>");
            int maxHeight = sheetBehavior.getMaxHeight();
            boolean z8 = maxHeight == 0;
            if (maxHeight != i13) {
                if (z8) {
                    Intrinsics.checkNotNullParameter(sheetBehavior, "<this>");
                    sheetBehavior.setSkipCollapsed(true);
                    sheetBehavior.setFitToContents(true);
                    sheetBehavior.setState(3);
                    sheetBehavior.setMaxHeight(i13);
                    requestLayout();
                    return;
                }
                if (!this.sheetDefaultResizeAnimationEnabled) {
                    int iF = f(i13, getTranslationY());
                    Intrinsics.checkNotNullParameter(sheetBehavior, "<this>");
                    sheetBehavior.setMaxHeight(iF);
                    layout(getLeft(), getBottom() - iF, getRight(), getBottom());
                    getParent().requestLayout();
                    a(getWidth(), iF, getTop() + ((int) getTranslationY()));
                    return;
                }
                final float translationY = getTranslationY();
                int iF2 = f(maxHeight, translationY);
                final int iF3 = f(i13, translationY);
                float f10 = iF3 - iF2;
                if (f10 == 0.0f) {
                    return;
                }
                if (f10 <= 0.0f) {
                    animate().translationY(translationY - f10).withStartAction(new B3.a(sheetBehavior, iF3, 2)).withEndAction(new Runnable() { // from class: M7.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i14 = Screen.f25275A0;
                            Screen screen = this.f5822a;
                            screen.layout(screen.getLeft(), screen.getBottom() - iF3, screen.getRight(), screen.getBottom());
                            screen.setTranslationY(translationY);
                            screen.getParent().requestLayout();
                            screen.e();
                        }
                    }).start();
                } else {
                    setTranslationY(getTranslationY() + f10);
                    animate().translationY(translationY).withStartAction(new H0.a(sheetBehavior, iF3, this, 1)).withEndAction(new RunnableC0447g(this, 1)).start();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        ScreenStackHeaderConfig headerConfig;
        ScreenStackHeaderConfig headerConfig2;
        Window window;
        if (z3 && (this.container instanceof ScreenStack) && !g.N(this)) {
            int i13 = i11 - i7;
            int i14 = i12 - i10;
            if (this.insetsApplied || (headerConfig = getHeaderConfig()) == null || headerConfig.isHeaderHidden || (headerConfig2 = getHeaderConfig()) == null || headerConfig2.isHeaderTranslucent) {
                a(i13, i14, i10);
                return;
            }
            Activity currentActivity = this.reactContext.getCurrentActivity();
            View decorView = (currentActivity == null || (window = currentActivity.getWindow()) == null) ? null : window.getDecorView();
            if (decorView == null) {
                throw new IllegalArgumentException("[RNScreens] DecorView is required for applying inset correction, but was null.");
            }
            Intrinsics.checkNotNullParameter(decorView, "decorView");
            WeakHashMap weakHashMap = N.f16168a;
            q0 q0VarA = F.a(decorView);
            int i15 = q0VarA == null ? 0 : q0VarA.f16277a.g(135).f16059b;
            a(i13, i14 - i15, i10 + i15);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (g.N(this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setActivityState(@NotNull EnumC0454n activityState) {
        Intrinsics.checkNotNullParameter(activityState, "activityState");
        EnumC0454n enumC0454n = this.activityState;
        if (activityState == enumC0454n) {
            return;
        }
        if ((this.container instanceof ScreenStack) && enumC0454n != null && activityState.compareTo(enumC0454n) < 0) {
            throw new IllegalStateException("[RNScreens] activityState can only progress in NativeStack");
        }
        this.activityState = activityState;
        ScreenContainer screenContainer = this.container;
        if (screenContainer != null) {
            screenContainer.f25308d = true;
            screenContainer.g();
        }
    }

    public final void setBeingRemoved(boolean z3) {
        this.isBeingRemoved = z3;
    }

    public final void setContainer(@Nullable ScreenContainer screenContainer) {
        this.container = screenContainer;
    }

    public final void setFooter(@Nullable ScreenFooter screenFooter) {
        BottomSheetBehavior<Screen> sheetBehavior;
        if (screenFooter == null && this.footer != null) {
            BottomSheetBehavior<Screen> behavior = getSheetBehavior();
            if (behavior != null) {
                ScreenFooter screenFooter2 = this.footer;
                Intrinsics.e(screenFooter2);
                Intrinsics.checkNotNullParameter(behavior, "behavior");
                if (screenFooter2.f25319f) {
                    behavior.removeBottomSheetCallback(screenFooter2.f25320g);
                    screenFooter2.f25319f = false;
                }
            }
        } else if (screenFooter != null && (sheetBehavior = getSheetBehavior()) != null) {
            screenFooter.f(sheetBehavior);
        }
        this.footer = screenFooter;
    }

    public final void setFragmentWrapper(@Nullable ScreenFragmentWrapper screenFragmentWrapper) {
        this.fragmentWrapper = screenFragmentWrapper;
    }

    public final void setGestureEnabled(boolean z3) {
    }

    public final void setInsetsApplied(boolean z3) {
        this.insetsApplied = z3;
    }

    @Override // android.view.View
    public final void setLayerType(int i7, Paint paint) {
    }

    public final void setNativeBackButtonDismissalEnabled(boolean z3) {
        this.nativeBackButtonDismissalEnabled = z3;
    }

    public final void setNavigationBarHidden(@Nullable Boolean bool) {
        if (bool != null) {
            e.f11515d = true;
        }
        this.isNavigationBarHidden = bool;
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            e.G(this, screenFragmentWrapper.tryGetActivity());
        }
    }

    public final void setReplaceAnimation(@NotNull EnumC0455o enumC0455o) {
        Intrinsics.checkNotNullParameter(enumC0455o, "<set-?>");
        this.replaceAnimation = enumC0455o;
    }

    public final void setScreenId(@Nullable String str) {
        this.screenId = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void setScreenOrientation(@Nullable String screenOrientation) {
        Integer screenOrientation2;
        if (screenOrientation == null) {
            this.screenOrientation = null;
            return;
        }
        int i7 = 1;
        e.f11513b = true;
        int iIntValue = -1;
        switch (screenOrientation.hashCode()) {
            case -1894896954:
                i7 = !screenOrientation.equals("portrait_down") ? -1 : 9;
                break;
            case 96673:
                i7 = !screenOrientation.equals("all") ? -1 : 10;
                break;
            case 729267099:
                i7 = !screenOrientation.equals("portrait") ? -1 : 7;
                break;
            case 1430647483:
                i7 = !screenOrientation.equals("landscape") ? -1 : 6;
                break;
            case 1651658175:
                if (!screenOrientation.equals("portrait_up")) {
                    i7 = -1;
                }
                break;
            case 1730732811:
                i7 = !screenOrientation.equals("landscape_left") ? -1 : 8;
                break;
            case 2118770584:
                i7 = !screenOrientation.equals("landscape_right") ? -1 : 0;
                break;
            default:
                i7 = -1;
                break;
        }
        this.screenOrientation = Integer.valueOf(i7);
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            Activity activityTryGetActivity = screenFragmentWrapper.tryGetActivity();
            Intrinsics.checkNotNullParameter(this, "screen");
            if (activityTryGetActivity == null) {
                return;
            }
            Screen screenE = e.e(this, r.f5847a);
            if (screenE != null && (screenOrientation2 = screenE.getScreenOrientation()) != null) {
                iIntValue = screenOrientation2.intValue();
            }
            activityTryGetActivity.setRequestedOrientation(iIntValue);
        }
    }

    public final void setSheetClosesOnTouchOutside(boolean z3) {
        this.sheetClosesOnTouchOutside = z3;
    }

    public final void setSheetCornerRadius(float f10) {
        if (this.sheetCornerRadius == f10) {
            return;
        }
        this.sheetCornerRadius = f10;
        this.f25279H = true;
    }

    public final void setSheetDefaultResizeAnimationEnabled(boolean z3) {
        this.sheetDefaultResizeAnimationEnabled = z3;
    }

    public final void setSheetDetents(@NotNull k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.sheetDetents = kVar;
    }

    public final void setSheetElevation(float f10) {
        this.sheetElevation = f10;
    }

    public final void setSheetExpandsWhenScrolledToEdge(boolean z3) {
        this.sheetExpandsWhenScrolledToEdge = z3;
    }

    public final void setSheetGrabberVisible(boolean z3) {
    }

    public final void setSheetInitialDetentIndex(int i7) {
        this.sheetInitialDetentIndex = i7;
    }

    public final void setSheetLargestUndimmedDetentIndex(int i7) {
        this.sheetLargestUndimmedDetentIndex = i7;
    }

    public final void setSheetShouldOverflowTopInset(boolean z3) {
        this.sheetShouldOverflowTopInset = z3;
    }

    public final void setShouldTriggerPostponedTransitionAfterLayout(boolean z3) {
        this.shouldTriggerPostponedTransitionAfterLayout = z3;
    }

    public final void setStackAnimation(@NotNull p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<set-?>");
        this.stackAnimation = pVar;
    }

    public final void setStackPresentation(@NotNull q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<set-?>");
        this.stackPresentation = qVar;
    }

    public final void setStatusBarAnimated(@Nullable Boolean bool) {
        this.isStatusBarAnimated = bool;
    }

    public final void setStatusBarHidden(@Nullable Boolean bool) {
        if (bool != null) {
            e.f11514c = true;
        }
        this.isStatusBarHidden = bool;
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            e.E(this, screenFragmentWrapper.tryGetActivity());
        }
    }

    public final void setStatusBarStyle(@Nullable String str) {
        if (str != null) {
            e.f11514c = true;
        }
        this.statusBarStyle = str;
        ScreenFragmentWrapper screenFragmentWrapper = this.fragmentWrapper;
        if (screenFragmentWrapper != null) {
            e.J(this, screenFragmentWrapper.tryGetActivity(), screenFragmentWrapper.tryGetContext());
        }
    }

    public final void setTransitioning(boolean transitioning) {
        if (this.f25289o == transitioning) {
            return;
        }
        this.f25289o = transitioning;
        boolean zC = c(this);
        if (!zC || getLayerType() == 2) {
            super.setLayerType((!transitioning || zC) ? 0 : 2, null);
        }
    }
}
