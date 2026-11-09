package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes.dex */
public interface RNSBottomTabsScreenManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setBadgeValue(T t, @Nullable String str);

    void setBottomScrollEdgeEffect(T t, @Nullable String str);

    void setDrawableIconResourceName(T t, @Nullable String str);

    void setIconImageSource(T t, @Nullable ReadableMap readableMap);

    void setIconResourceName(T t, @Nullable String str);

    void setIconType(T t, @Nullable String str);

    void setImageIconResource(T t, @Nullable ReadableMap readableMap);

    void setIsFocused(T t, boolean z3);

    void setIsTitleUndefined(T t, boolean z3);

    void setLeftScrollEdgeEffect(T t, @Nullable String str);

    void setOrientation(T t, @Nullable String str);

    void setOverrideScrollViewContentInsetAdjustmentBehavior(T t, boolean z3);

    void setRightScrollEdgeEffect(T t, @Nullable String str);

    void setScrollEdgeAppearance(T t, Dynamic dynamic);

    void setSelectedIconImageSource(T t, @Nullable ReadableMap readableMap);

    void setSelectedIconResourceName(T t, @Nullable String str);

    void setSpecialEffects(T t, @Nullable ReadableMap readableMap);

    void setStandardAppearance(T t, Dynamic dynamic);

    void setSystemItem(T t, @Nullable String str);

    void setTabBarItemAccessibilityLabel(T t, @Nullable String str);

    void setTabBarItemBadgeBackgroundColor(T t, @Nullable Integer num);

    void setTabBarItemBadgeTextColor(T t, @Nullable Integer num);

    void setTabBarItemTestID(T t, @Nullable String str);

    void setTabKey(T t, @Nullable String str);

    void setTitle(T t, @Nullable String str);

    void setTopScrollEdgeEffect(T t, @Nullable String str);

    void setUserInterfaceStyle(T t, @Nullable String str);
}
