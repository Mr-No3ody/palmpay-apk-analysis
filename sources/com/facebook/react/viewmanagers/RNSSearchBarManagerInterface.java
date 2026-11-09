package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes.dex */
public interface RNSSearchBarManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void blur(T t);

    void cancelSearch(T t);

    void clearText(T t);

    void focus(T t);

    void setAllowToolbarIntegration(T t, boolean z3);

    void setAutoCapitalize(T t, @Nullable String str);

    void setAutoFocus(T t, boolean z3);

    void setBarTintColor(T t, @Nullable Integer num);

    void setCancelButtonText(T t, @Nullable String str);

    void setDisableBackButtonOverride(T t, boolean z3);

    void setHeaderIconColor(T t, @Nullable Integer num);

    void setHideNavigationBar(T t, @Nullable String str);

    void setHideWhenScrolling(T t, boolean z3);

    void setHintTextColor(T t, @Nullable Integer num);

    void setInputType(T t, @Nullable String str);

    void setObscureBackground(T t, @Nullable String str);

    void setPlaceholder(T t, @Nullable String str);

    void setPlacement(T t, @Nullable String str);

    void setShouldShowHintSearchIcon(T t, boolean z3);

    void setText(T t, String str);

    void setTextColor(T t, @Nullable Integer num);

    void setTintColor(T t, @Nullable Integer num);

    void toggleCancelButton(T t, boolean z3);
}
