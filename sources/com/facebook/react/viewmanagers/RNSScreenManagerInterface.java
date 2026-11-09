package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes.dex */
public interface RNSScreenManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setActivityState(T t, float f10);

    void setAndroidResetScreenShadowStateOnOrientationChangeEnabled(T t, boolean z3);

    void setBottomScrollEdgeEffect(T t, @Nullable String str);

    void setCustomAnimationOnSwipe(T t, boolean z3);

    void setFullScreenSwipeEnabled(T t, @Nullable String str);

    void setFullScreenSwipeShadowEnabled(T t, boolean z3);

    void setGestureEnabled(T t, boolean z3);

    void setGestureResponseDistance(T t, @Nullable ReadableMap readableMap);

    void setHideKeyboardOnSwipe(T t, boolean z3);

    void setHomeIndicatorHidden(T t, boolean z3);

    void setLeftScrollEdgeEffect(T t, @Nullable String str);

    void setNativeBackButtonDismissalEnabled(T t, boolean z3);

    void setNavigationBarColor(T t, @Nullable Integer num);

    void setNavigationBarHidden(T t, boolean z3);

    void setNavigationBarTranslucent(T t, boolean z3);

    void setPreventNativeDismiss(T t, boolean z3);

    void setReplaceAnimation(T t, @Nullable String str);

    void setRightScrollEdgeEffect(T t, @Nullable String str);

    void setScreenId(T t, @Nullable String str);

    void setScreenOrientation(T t, @Nullable String str);

    void setSheetAllowedDetents(T t, @Nullable ReadableArray readableArray);

    void setSheetCornerRadius(T t, float f10);

    void setSheetDefaultResizeAnimationEnabled(T t, boolean z3);

    void setSheetElevation(T t, int i7);

    void setSheetExpandsWhenScrolledToEdge(T t, boolean z3);

    void setSheetGrabberVisible(T t, boolean z3);

    void setSheetInitialDetent(T t, int i7);

    void setSheetLargestUndimmedDetent(T t, int i7);

    void setSheetShouldOverflowTopInset(T t, boolean z3);

    void setStackAnimation(T t, @Nullable String str);

    void setStackPresentation(T t, @Nullable String str);

    void setStatusBarAnimation(T t, @Nullable String str);

    void setStatusBarColor(T t, @Nullable Integer num);

    void setStatusBarHidden(T t, boolean z3);

    void setStatusBarStyle(T t, @Nullable String str);

    void setStatusBarTranslucent(T t, boolean z3);

    void setSwipeDirection(T t, @Nullable String str);

    void setSynchronousShadowStateUpdatesEnabled(T t, boolean z3);

    void setTopScrollEdgeEffect(T t, @Nullable String str);

    void setTransitionDuration(T t, int i7);
}
