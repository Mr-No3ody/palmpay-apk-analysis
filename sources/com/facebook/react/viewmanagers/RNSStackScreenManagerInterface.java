package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes.dex */
public interface RNSStackScreenManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setActivityMode(T t, @Nullable String str);

    void setScreenKey(T t, @Nullable String str);
}
