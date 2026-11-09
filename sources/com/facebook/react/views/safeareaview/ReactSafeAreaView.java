package com.facebook.react.views.safeareaview;

import M7.A;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.UiThread;
import androidx.core.graphics.e;
import androidx.core.view.E;
import androidx.core.view.N;
import androidx.core.view.q0;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/facebook/react/views/safeareaview/ReactSafeAreaView;", "Landroid/view/ViewGroup;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "Landroidx/core/graphics/e;", "insets", "", "updateState", "(Landroidx/core/graphics/e;)V", "onAttachedToWindow", "()V", "", "p0", "", "p1", TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW, "p3", TransType.TRANS_TYPE_SPLIT_BILL, "onLayout", "(ZIIII)V", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getReactContext", "()Lcom/facebook/react/uimanager/ThemedReactContext;", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "getStateWrapper$ReactAndroid_release", "()Lcom/facebook/react/uimanager/StateWrapper;", "setStateWrapper$ReactAndroid_release", "(Lcom/facebook/react/uimanager/StateWrapper;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactSafeAreaView extends ViewGroup {

    @NotNull
    private final ThemedReactContext reactContext;

    @Nullable
    private StateWrapper stateWrapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactSafeAreaView(@NotNull ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q0 onAttachedToWindow$lambda$0(ReactSafeAreaView reactSafeAreaView, View view, q0 windowInsets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        e eVarG = windowInsets.f16277a.g(135);
        Intrinsics.checkNotNullExpressionValue(eVarG, "getInsets(...)");
        reactSafeAreaView.updateState(eVarG);
        return q0.f16276b;
    }

    @UiThread
    private final void updateState(final e insets) {
        StateWrapper stateWrapper = this.stateWrapper;
        if (stateWrapper == null) {
            if (ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
                return;
            }
            ThemedReactContext themedReactContext = this.reactContext;
            themedReactContext.runOnNativeModulesQueueThread(new GuardedRunnable(themedReactContext) { // from class: com.facebook.react.views.safeareaview.ReactSafeAreaView.updateState.2
                @Override // com.facebook.react.bridge.GuardedRunnable
                public void runGuarded() {
                    UIManagerModule uIManagerModule = (UIManagerModule) ReactSafeAreaView.this.getReactContext().getReactApplicationContext().getNativeModule(UIManagerModule.class);
                    if (uIManagerModule != null) {
                        int id2 = ReactSafeAreaView.this.getId();
                        e eVar = insets;
                        uIManagerModule.updateInsetsPadding(id2, eVar.f16059b, eVar.f16058a, eVar.f16061d, eVar.f16060c);
                    }
                }
            });
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        PixelUtil pixelUtil = PixelUtil.INSTANCE;
        writableNativeMap.putDouble(ViewProps.LEFT, pixelUtil.pxToDp(insets.f16058a));
        writableNativeMap.putDouble(ViewProps.TOP, pixelUtil.pxToDp(insets.f16059b));
        writableNativeMap.putDouble(ViewProps.BOTTOM, pixelUtil.pxToDp(insets.f16061d));
        writableNativeMap.putDouble(ViewProps.RIGHT, pixelUtil.pxToDp(insets.f16060c));
        stateWrapper.updateState(writableNativeMap);
    }

    @NotNull
    public final ThemedReactContext getReactContext() {
        return this.reactContext;
    }

    @Nullable
    /* JADX INFO: renamed from: getStateWrapper$ReactAndroid_release, reason: from getter */
    public final StateWrapper getStateWrapper() {
        return this.stateWrapper;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A a3 = new A(this, 2);
        WeakHashMap weakHashMap = N.f16168a;
        E.n(this, a3);
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean p3, int p10, int p11, int p12, int p13) {
    }

    public final void setStateWrapper$ReactAndroid_release(@Nullable StateWrapper stateWrapper) {
        this.stateWrapper = stateWrapper;
    }
}
