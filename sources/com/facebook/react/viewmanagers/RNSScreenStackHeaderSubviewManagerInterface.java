package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes.dex */
public interface RNSScreenStackHeaderSubviewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setHidesSharedBackground(T t, boolean z3);

    void setSynchronousShadowStateUpdatesEnabled(T t, boolean z3);

    void setType(T t, @Nullable String str);
}
