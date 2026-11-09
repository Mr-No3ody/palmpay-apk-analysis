package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: loaded from: classes.dex */
public interface RNMapsUrlTileManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setDoubleTileSize(T t, boolean z3);

    void setFlipY(T t, boolean z3);

    void setMaximumNativeZ(T t, int i7);

    void setMaximumZ(T t, int i7);

    void setMinimumZ(T t, int i7);

    void setOfflineMode(T t, boolean z3);

    void setShouldReplaceMapContent(T t, boolean z3);

    void setTileCacheMaxAge(T t, int i7);

    void setTileCachePath(T t, @Nullable String str);

    void setTileSize(T t, int i7);

    void setUrlTemplate(T t, @Nullable String str);
}
