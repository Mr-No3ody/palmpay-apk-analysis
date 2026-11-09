package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes.dex */
public interface RNSScreenStackHeaderConfigManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setBackButtonDisplayMode(T t, @Nullable String str);

    void setBackButtonInCustomView(T t, boolean z3);

    void setBackTitle(T t, @Nullable String str);

    void setBackTitleFontFamily(T t, @Nullable String str);

    void setBackTitleFontSize(T t, int i7);

    void setBackTitleVisible(T t, boolean z3);

    void setBackgroundColor(T t, @Nullable Integer num);

    void setBlurEffect(T t, @Nullable String str);

    void setColor(T t, @Nullable Integer num);

    void setDirection(T t, @Nullable String str);

    void setDisableBackButtonMenu(T t, boolean z3);

    void setHeaderLeftBarButtonItems(T t, @Nullable ReadableArray readableArray);

    void setHeaderRightBarButtonItems(T t, @Nullable ReadableArray readableArray);

    void setHidden(T t, boolean z3);

    void setHideBackButton(T t, boolean z3);

    void setHideShadow(T t, boolean z3);

    void setLargeTitle(T t, boolean z3);

    void setLargeTitleBackgroundColor(T t, @Nullable Integer num);

    void setLargeTitleColor(T t, @Nullable Integer num);

    void setLargeTitleFontFamily(T t, @Nullable String str);

    void setLargeTitleFontSize(T t, int i7);

    void setLargeTitleFontWeight(T t, @Nullable String str);

    void setLargeTitleHideShadow(T t, boolean z3);

    void setSynchronousShadowStateUpdatesEnabled(T t, boolean z3);

    void setTitle(T t, @Nullable String str);

    void setTitleColor(T t, @Nullable Integer num);

    void setTitleFontFamily(T t, @Nullable String str);

    void setTitleFontSize(T t, int i7);

    void setTitleFontWeight(T t, @Nullable String str);

    void setTopInsetEnabled(T t, boolean z3);

    void setTranslucent(T t, boolean z3);

    void setUserInterfaceStyle(T t, @Nullable String str);
}
