package com.chuanyi.ad;

import M7.ChoreographerFrameCallbackC0441a;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.transsnet.adsdk.widgets.SingleAdView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class SingleAdViewManager extends BaseViewGroupManager {
    public static final String REACT_CLASS = "AdBannerSingleView";

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        HashMap map = new HashMap();
        map.put("topOnViewSuccess", MapBuilder.of("registrationName", "onViewSuccess"));
        map.put("topOnViewFailToLoad", MapBuilder.of("registrationName", "onViewFailToLoad"));
        map.put("topOnViewClosed", MapBuilder.of("registrationName", "onViewClosed"));
        map.put("topOnViewClicked", MapBuilder.of("registrationName", "onViewClicked"));
        return map;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = BaseViewGroupManager.PROP_SLOT_ID)
    public void setPropSlotId(ViewGroup viewGroup, String str) {
        SingleAdView singleAdView = (SingleAdView) viewGroup.findViewById(e.single_ad_view);
        if (singleAdView != null) {
            singleAdView.setSlotId(str);
        }
    }

    public void setupLayout(ViewGroup viewGroup) {
        ChoreographerFrameCallbackC0441a choreographerFrameCallbackC0441a = new ChoreographerFrameCallbackC0441a(viewGroup);
        Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC0441a);
        this.layoutCallbacks.put(viewGroup, choreographerFrameCallbackC0441a);
        b bVar = new b(viewGroup, 1);
        viewGroup.addOnAttachStateChangeListener(bVar);
        this.attachListeners.put(viewGroup, bVar);
    }

    @Override // com.chuanyi.ad.BaseViewGroupManager, com.facebook.react.uimanager.ViewManager
    public ViewGroup createViewInstance(ThemedReactContext themedReactContext) {
        super.createViewInstance(themedReactContext);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(themedReactContext).inflate(f.rn_single_ad_view_layout, (ViewGroup) null);
        SingleAdView singleAdView = (SingleAdView) viewGroup.findViewById(e.single_ad_view);
        setupLayout(viewGroup);
        singleAdView.setAdListener(new d(this, viewGroup, 1));
        return viewGroup;
    }

    @Override // com.chuanyi.ad.BaseViewGroupManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull ViewGroup viewGroup) {
        super.onDropViewInstance(viewGroup);
    }
}
