package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes.dex */
public interface AndroidProgressBarManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setAnimating(T t, boolean z3);

    void setColor(T t, @Nullable Integer num);

    void setIndeterminate(T t, boolean z3);

    void setProgress(T t, double d2);

    void setStyleAttr(T t, @Nullable String str);

    void setTestID(T t, @Nullable String str);

    void setTypeAttr(T t, @Nullable String str);
}
