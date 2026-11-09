package com.dylanvann.fastimage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.model.l;
import com.bumptech.glide.m;
import com.bumptech.glide.p;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
class FastImageViewManager extends SimpleViewManager<FastImageViewWithUrl> implements FastImageProgressListener {
    static final String REACT_CLASS = "FastImageView";
    static final String REACT_ON_LOAD_START_EVENT = "onFastImageLoadStart";
    static final String REACT_ON_PROGRESS_EVENT = "onFastImageProgress";
    private static final Map<String, List<FastImageViewWithUrl>> VIEWS_FOR_URLS = new WeakHashMap();

    private static Activity getActivityFromContext(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ThemedReactContext)) {
            return null;
        }
        Context baseContext = ((ThemedReactContext) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        if (!(baseContext instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext2 = ((ContextWrapper) baseContext).getBaseContext();
        if (baseContext2 instanceof Activity) {
            return (Activity) baseContext2;
        }
        return null;
    }

    @Nullable
    private static p getRequestManagerForContext(Context context) {
        if (isValidContextForGlide(context)) {
            return com.bumptech.glide.b.e(context);
        }
        return null;
    }

    private static boolean isActivityDestroyed(Activity activity) {
        return activity.isDestroyed() || activity.isFinishing();
    }

    private static boolean isValidContextForGlide(Context context) {
        Activity activityFromContext = getActivityFromContext(context);
        if (activityFromContext == null) {
            return false;
        }
        return !isActivityDestroyed(activityFromContext);
    }

    private static void pruneDestroyedViews() {
        for (Map.Entry entry : new ArrayList(VIEWS_FOR_URLS.entrySet())) {
            List list = (List) entry.getValue();
            for (int size = list.size() - 1; size >= 0; size--) {
                if (!isValidContextForGlide(((FastImageViewWithUrl) list.get(size)).getContext())) {
                    list.remove(size);
                }
            }
            if (list.isEmpty()) {
                VIEWS_FOR_URLS.remove(entry.getKey());
            }
        }
    }

    private static void removeViewFromTracking(@NonNull FastImageViewWithUrl fastImageViewWithUrl) {
        String strB;
        Map<String, List<FastImageViewWithUrl>> map;
        List<FastImageViewWithUrl> list;
        l lVar = fastImageViewWithUrl.f21160d;
        if (lVar != null && (list = (map = VIEWS_FOR_URLS).get((strB = lVar.b()))) != null) {
            list.remove(fastImageViewWithUrl);
            if (list.isEmpty()) {
                map.remove(strB);
                return;
            }
            return;
        }
        for (Map.Entry entry : new ArrayList(VIEWS_FOR_URLS.entrySet())) {
            List list2 = (List) entry.getValue();
            if (list2.remove(fastImageViewWithUrl) && list2.isEmpty()) {
                VIEWS_FOR_URLS.remove(entry.getKey());
            }
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.builder().put(REACT_ON_LOAD_START_EVENT, MapBuilder.of("registrationName", REACT_ON_LOAD_START_EVENT)).put(REACT_ON_PROGRESS_EVENT, MapBuilder.of("registrationName", REACT_ON_PROGRESS_EVENT)).put("onFastImageLoad", MapBuilder.of("registrationName", "onFastImageLoad")).put("onFastImageError", MapBuilder.of("registrationName", "onFastImageError")).put("onFastImageLoadEnd", MapBuilder.of("registrationName", "onFastImageLoadEnd")).build();
    }

    @Override // com.dylanvann.fastimage.FastImageProgressListener
    public float getGranularityPercentage() {
        return 0.5f;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.dylanvann.fastimage.FastImageProgressListener
    public void onProgress(String str, long j6, long j10) {
        pruneDestroyedViews();
        List<FastImageViewWithUrl> list = VIEWS_FOR_URLS.get(str);
        if (list != null) {
            Iterator<FastImageViewWithUrl> it = list.iterator();
            while (it.hasNext()) {
                FastImageViewWithUrl next = it.next();
                if (isValidContextForGlide(next.getContext())) {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putInt("loaded", (int) j6);
                    writableNativeMap.putInt("total", (int) j10);
                    ((RCTEventEmitter) ((ThemedReactContext) next.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(next.getId(), REACT_ON_PROGRESS_EVENT, writableNativeMap);
                } else {
                    it.remove();
                }
            }
            if (list.isEmpty()) {
                VIEWS_FOR_URLS.remove(str);
            }
        }
    }

    @ReactProp(name = "defaultSource")
    public void setDefaultSource(FastImageViewWithUrl fastImageViewWithUrl, @Nullable String str) {
        ResourceDrawableIdHelper.getInstance();
        Drawable resourceDrawable = ResourceDrawableIdHelper.getResourceDrawable(fastImageViewWithUrl.getContext(), str);
        fastImageViewWithUrl.f21157a = true;
        fastImageViewWithUrl.f21159c = resourceDrawable;
    }

    @ReactProp(name = ViewProps.RESIZE_MODE)
    public void setResizeMode(FastImageViewWithUrl fastImageViewWithUrl, String str) {
        fastImageViewWithUrl.setScaleType((ImageView.ScaleType) f.c(ViewProps.RESIZE_MODE, "cover", f.f21174d, str));
    }

    @ReactProp(name = "source")
    public void setSource(FastImageViewWithUrl fastImageViewWithUrl, @Nullable ReadableMap readableMap) {
        fastImageViewWithUrl.f21157a = true;
        fastImageViewWithUrl.f21158b = readableMap;
    }

    @ReactProp(customType = "Color", name = "tintColor")
    public void setTintColor(FastImageViewWithUrl fastImageViewWithUrl, @Nullable Integer num) {
        if (num == null) {
            fastImageViewWithUrl.clearColorFilter();
        } else {
            fastImageViewWithUrl.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public FastImageViewWithUrl createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        return new FastImageViewWithUrl(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NonNull FastImageViewWithUrl fastImageViewWithUrl) {
        String string;
        super.onAfterUpdateTransaction(fastImageViewWithUrl);
        p requestManagerForContext = getRequestManagerForContext(fastImageViewWithUrl.getContext());
        Map<String, List<FastImageViewWithUrl>> map = VIEWS_FOR_URLS;
        if (fastImageViewWithUrl.f21157a) {
            ReadableMap readableMap = fastImageViewWithUrl.f21158b;
            if ((readableMap == null || !readableMap.hasKey("uri") || (string = fastImageViewWithUrl.f21158b.getString("uri")) == null || string.trim().isEmpty()) && fastImageViewWithUrl.f21159c == null) {
                fastImageViewWithUrl.a(requestManagerForContext);
                l lVar = fastImageViewWithUrl.f21160d;
                if (lVar != null) {
                    FastImageOkHttpProgressGlideModule.forget(lVar.b());
                }
                fastImageViewWithUrl.setImageDrawable(null);
                return;
            }
            FastImageSource fastImageSourceA = f.a(fastImageViewWithUrl.getContext(), fastImageViewWithUrl.f21158b);
            if (fastImageSourceA != null && fastImageSourceA.getUri().toString().length() == 0) {
                RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((ThemedReactContext) fastImageViewWithUrl.getContext()).getJSModule(RCTEventEmitter.class);
                int id2 = fastImageViewWithUrl.getId();
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("message", "Invalid source prop:" + fastImageViewWithUrl.f21158b);
                rCTEventEmitter.receiveEvent(id2, "onFastImageError", writableNativeMap);
                fastImageViewWithUrl.a(requestManagerForContext);
                l lVar2 = fastImageViewWithUrl.f21160d;
                if (lVar2 != null) {
                    FastImageOkHttpProgressGlideModule.forget(lVar2.b());
                }
                fastImageViewWithUrl.setImageDrawable(null);
                return;
            }
            l glideUrl = fastImageSourceA == null ? null : fastImageSourceA.getGlideUrl();
            fastImageViewWithUrl.f21160d = glideUrl;
            fastImageViewWithUrl.a(requestManagerForContext);
            String strB = glideUrl == null ? null : glideUrl.b();
            if (glideUrl != null) {
                FastImageOkHttpProgressGlideModule.expect(strB, this);
                List<FastImageViewWithUrl> list = map.get(strB);
                if (list != null && !list.contains(fastImageViewWithUrl)) {
                    list.add(fastImageViewWithUrl);
                } else if (list == null) {
                    map.put(strB, new ArrayList(Collections.singletonList(fastImageViewWithUrl)));
                }
            }
            ThemedReactContext themedReactContext = (ThemedReactContext) fastImageViewWithUrl.getContext();
            if (fastImageSourceA != null) {
                ((RCTEventEmitter) themedReactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(fastImageViewWithUrl.getId(), REACT_ON_LOAD_START_EVENT, new WritableNativeMap());
            }
            if (requestManagerForContext != null) {
                m mVarA = requestManagerForContext.load(fastImageSourceA != null ? fastImageSourceA.getSourceForLoad() : null).a(((G1.d) f.b(themedReactContext, fastImageSourceA, fastImageViewWithUrl.f21158b).y(fastImageViewWithUrl.f21159c)).l(fastImageViewWithUrl.f21159c));
                if (strB != null) {
                    mVarA.U(new FastImageRequestListener(strB));
                }
                mVarA.S(fastImageViewWithUrl);
            }
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull FastImageViewWithUrl fastImageViewWithUrl) {
        fastImageViewWithUrl.a(getRequestManagerForContext(fastImageViewWithUrl.getContext()));
        l lVar = fastImageViewWithUrl.f21160d;
        if (lVar != null) {
            FastImageOkHttpProgressGlideModule.forget(lVar.b());
        }
        removeViewFromTracking(fastImageViewWithUrl);
        super.onDropViewInstance(fastImageViewWithUrl);
    }
}
