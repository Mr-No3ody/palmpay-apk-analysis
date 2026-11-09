package com.facebook.react.modules.statusbar;

import D.b;
import Da.i;
import Gb.z;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.airbnb.lottie.model.layer.d;
import com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.view.WindowUtilKt;
import com.google.android.flexbox.FlexItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229p2.a;

/* JADX INFO: loaded from: classes.dex */
@ReactModule(name = "StatusBarManager")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0014J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0012\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/modules/statusbar/StatusBarModule;", "Lcom/facebook/fbreact/specs/NativeStatusBarManagerAndroidSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getTypedExportedConstants", "", "", "", "setColor", "", "colorDouble", "", "animated", "", "setTranslucent", "translucent", "setHidden", ViewProps.HIDDEN, "setStyle", "style", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StatusBarModule extends NativeStatusBarManagerAndroidSpec {

    @NotNull
    private static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";

    @NotNull
    private static final String HEIGHT_KEY = "HEIGHT";

    @NotNull
    public static final String NAME = "StatusBarManager";

    /* JADX INFO: renamed from: com.facebook.react.modules.statusbar.StatusBarModule$setColor$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/facebook/react/modules/statusbar/StatusBarModule$setColor$1", "Lcom/facebook/react/bridge/GuardedRunnable;", "runGuarded", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends GuardedRunnable {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ boolean $animated;
        final /* synthetic */ int $color;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity, boolean z3, int i7, ReactApplicationContext reactApplicationContext) {
            super(reactApplicationContext);
            this.$activity = activity;
            this.$animated = z3;
            this.$color = i7;
            Intrinsics.e(reactApplicationContext);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void runGuarded$lambda$0(Activity activity, ValueAnimator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            Window window = activity.getWindow();
            if (window != null) {
                Object animatedValue = animator.getAnimatedValue();
                Intrinsics.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                window.setStatusBarColor(((Integer) animatedValue).intValue());
            }
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            Window window = this.$activity.getWindow();
            if (window == null) {
                return;
            }
            window.addFlags(Integer.MIN_VALUE);
            if (!this.$animated) {
                window.setStatusBarColor(this.$color);
                return;
            }
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(window.getStatusBarColor()), Integer.valueOf(this.$color));
            valueAnimatorOfObject.addUpdateListener(new z(this.$activity, 4));
            valueAnimatorOfObject.setDuration(300L).setStartDelay(0L);
            valueAnimatorOfObject.start();
        }
    }

    public StatusBarModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setHidden$lambda$1(Activity activity, boolean z3) {
        Window window = activity.getWindow();
        if (window != null) {
            WindowUtilKt.setStatusBarVisibility(window, z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setStyle$lambda$2(Activity activity, String str) {
        Window window = activity.getWindow();
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 30) {
            View decorView = window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility("dark-content".equals(str) ? systemUiVisibility | UserMetadata.MAX_INTERNAL_KEY_SIZE : systemUiVisibility & (-8193));
            return;
        }
        WindowInsetsController insetsController = window.getInsetsController();
        if (insetsController == null) {
            return;
        }
        if ("dark-content".equals(str)) {
            insetsController.setSystemBarsAppearance(8, 8);
        } else {
            insetsController.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    @NotNull
    public Map<String, Object> getTypedExportedConstants() {
        Window window;
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        return G.g(new Pair(HEIGHT_KEY, Float.valueOf(PixelUtil.toDIPFromPixel(DisplayMetricsHolder.INSTANCE.getStatusBarHeightPx$ReactAndroid_release(currentActivity)))), new Pair(DEFAULT_BACKGROUND_COLOR_KEY, (currentActivity == null || (window = currentActivity.getWindow()) == null) ? "black" : d.n(new Object[]{Integer.valueOf(window.getStatusBarColor() & FlexItem.MAX_SIZE)}, 1, "#%06X", "format(...)")));
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setColor(double colorDouble, boolean animated) {
        int i7 = (int) colorDouble;
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            a.v("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (WindowUtilKt.isEdgeToEdgeFeatureFlagOn()) {
            a.v("ReactNative", "StatusBarModule: Ignored status bar change, current activity is edge-to-edge.");
        } else {
            UiThreadUtil.runOnUiThread(new AnonymousClass1(currentActivity, animated, i7, getReactApplicationContext()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setHidden(boolean hidden) {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            a.v("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new b(currentActivity, hidden, 13));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setStyle(@Nullable String style) {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            a.v("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new i(currentActivity, style, 2));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setTranslucent(boolean translucent) {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            a.v("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (WindowUtilKt.isEdgeToEdgeFeatureFlagOn()) {
            a.v("ReactNative", "StatusBarModule: Ignored status bar change, current activity is edge-to-edge.");
        } else {
            UiThreadUtil.runOnUiThread(new GuardedRunnable(currentActivity, translucent, getReactApplicationContext()) { // from class: com.facebook.react.modules.statusbar.StatusBarModule.setTranslucent.1
                final /* synthetic */ Activity $activity;
                final /* synthetic */ boolean $translucent;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(reactApplicationContext);
                    Intrinsics.e(reactApplicationContext);
                }

                @Override // com.facebook.react.bridge.GuardedRunnable
                public void runGuarded() {
                    Window window = this.$activity.getWindow();
                    if (window != null) {
                        WindowUtilKt.setStatusBarTranslucency(window, this.$translucent);
                    }
                }
            });
        }
    }
}
