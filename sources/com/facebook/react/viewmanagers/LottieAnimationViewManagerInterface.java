package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes.dex */
public interface LottieAnimationViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void pause(T t);

    void play(T t, int i7, int i10);

    void reset(T t);

    void resume(T t);

    void setAutoPlay(T t, boolean z3);

    void setCacheComposition(T t, boolean z3);

    void setColorFilters(T t, @Nullable ReadableArray readableArray);

    void setDummy(T t, @Nullable ReadableMap readableMap);

    void setEnableMergePathsAndroidForKitKatAndAbove(T t, boolean z3);

    void setEnableSafeModeAndroid(T t, boolean z3);

    void setHardwareAccelerationAndroid(T t, boolean z3);

    void setImageAssetsFolder(T t, @Nullable String str);

    void setLoop(T t, boolean z3);

    void setProgress(T t, float f10);

    void setRenderMode(T t, @Nullable String str);

    void setResizeMode(T t, @Nullable String str);

    void setSourceDotLottieURI(T t, @Nullable String str);

    void setSourceJson(T t, @Nullable String str);

    void setSourceName(T t, @Nullable String str);

    void setSourceURL(T t, @Nullable String str);

    void setSpeed(T t, double d2);

    void setTextFiltersAndroid(T t, @Nullable ReadableArray readableArray);

    void setTextFiltersIOS(T t, @Nullable ReadableArray readableArray);
}
