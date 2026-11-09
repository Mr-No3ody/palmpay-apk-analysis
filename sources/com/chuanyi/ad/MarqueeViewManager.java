package com.chuanyi.ad;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class MarqueeViewManager extends BaseViewGroupManager {
    public static final String REACT_CLASS = "AdMarqueeView";

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
        MarqueeView marqueeView = (MarqueeView) viewGroup.findViewById(e.marquee_view);
        if (marqueeView != null) {
            marqueeView.setSlotId(str);
        }
    }

    @Override // com.chuanyi.ad.BaseViewGroupManager, com.facebook.react.uimanager.ViewManager
    public ViewGroup createViewInstance(ThemedReactContext themedReactContext) {
        super.createViewInstance(themedReactContext);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(themedReactContext).inflate(f.rn_marquee_view_layout, (ViewGroup) null);
        ((MarqueeView) viewGroup.findViewById(e.marquee_view)).setAdListener(new d(this, viewGroup, 0));
        return viewGroup;
    }

    @Override // com.chuanyi.ad.BaseViewGroupManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull ViewGroup viewGroup) {
        super.onDropViewInstance(viewGroup);
    }
}
