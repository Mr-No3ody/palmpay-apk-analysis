package com.dylanvann.fastimage;

import H1.g;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes.dex */
public class FastImageRequestListener implements RequestListener<Drawable> {
    static final String REACT_ON_ERROR_EVENT = "onFastImageError";
    static final String REACT_ON_LOAD_END_EVENT = "onFastImageLoadEnd";
    static final String REACT_ON_LOAD_EVENT = "onFastImageLoad";
    private final String key;

    public FastImageRequestListener(String str) {
        this.key = str;
    }

    private static WritableMap mapFromResource(Drawable drawable) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("width", drawable.getIntrinsicWidth());
        writableNativeMap.putInt("height", drawable.getIntrinsicHeight());
        return writableNativeMap;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public boolean onLoadFailed(@Nullable u uVar, Object obj, Target<Drawable> target, boolean z3) {
        FastImageOkHttpProgressGlideModule.forget(this.key);
        if (!(target instanceof g)) {
            return false;
        }
        FastImageViewWithUrl fastImageViewWithUrl = (FastImageViewWithUrl) ((g) target).f3604b;
        RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((ThemedReactContext) fastImageViewWithUrl.getContext()).getJSModule(RCTEventEmitter.class);
        int id2 = fastImageViewWithUrl.getId();
        rCTEventEmitter.receiveEvent(id2, REACT_ON_ERROR_EVENT, new WritableNativeMap());
        rCTEventEmitter.receiveEvent(id2, REACT_ON_LOAD_END_EVENT, new WritableNativeMap());
        return false;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, com.bumptech.glide.load.a aVar, boolean z3) {
        if (!(target instanceof g)) {
            return false;
        }
        FastImageViewWithUrl fastImageViewWithUrl = (FastImageViewWithUrl) ((g) target).f3604b;
        RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((ThemedReactContext) fastImageViewWithUrl.getContext()).getJSModule(RCTEventEmitter.class);
        int id2 = fastImageViewWithUrl.getId();
        rCTEventEmitter.receiveEvent(id2, REACT_ON_LOAD_EVENT, mapFromResource(drawable));
        rCTEventEmitter.receiveEvent(id2, REACT_ON_LOAD_END_EVENT, new WritableNativeMap());
        return false;
    }
}
