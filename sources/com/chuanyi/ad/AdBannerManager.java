package com.chuanyi.ad;

import M7.ChoreographerFrameCallbackC0441a;
import android.text.TextUtils;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AdBannerManager extends BaseViewGroupManager {
    public static final String PROP_AUTO_PLAY = "autoPlay";
    public static final String PROP_BANNER_TYPE = "bannerType";
    public static final String PROP_PAGE_MARGIN = "pageMargin";
    public static final String PROP_REVEAL_WIDTH = "revealWidth";
    public static final String REACT_CLASS = "AdBannerView";
    private static final int TYPE_NORMAL = 0;
    private static final int TYPE_NO_PAGE_MARGIN = 1;
    private String slotId = null;
    private Integer pageMargin = null;
    private Integer revealWidth = null;
    private int bannerType = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public BannerAdView getAdView(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        return (BannerAdView) viewGroup.findViewById(e.banner_ad_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void receiveEvent(ThemedReactContext themedReactContext, int i7, String str, @Nullable WritableMap writableMap) {
        receiveEvent(i7, str, writableMap);
    }

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

    public void manuallyLayoutChildren(View view) {
        view.forceLayout();
    }

    @ReactProp(name = PROP_AUTO_PLAY)
    public void setPropAutoPlay(ViewGroup viewGroup, boolean z3) {
        BannerAdView adView = getAdView(viewGroup);
        if (adView != null) {
            adView.setAutoPlay(z3);
        }
    }

    @ReactProp(name = PROP_BANNER_TYPE)
    public void setPropBannerType(ViewGroup viewGroup, int i7) {
        this.bannerType = i7;
    }

    @ReactProp(name = PROP_PAGE_MARGIN)
    public void setPropPageMargin(ViewGroup viewGroup, int i7) {
        BannerAdView adView = getAdView(viewGroup);
        if (adView != null) {
            adView.setPageMargin(i7);
        }
    }

    @ReactProp(name = PROP_REVEAL_WIDTH)
    public void setPropRevealWidth(ViewGroup viewGroup, int i7) {
        BannerAdView adView = getAdView(viewGroup);
        if (adView != null) {
            adView.setRevealWidth(i7);
        }
    }

    @ReactProp(name = BaseViewGroupManager.PROP_SLOT_ID)
    public void setPropSlotId(ViewGroup viewGroup, String str) {
        BannerAdView adView = getAdView(viewGroup);
        if (adView != null) {
            adView.setSlotId(str);
        }
    }

    public void setupLayout(ViewGroup viewGroup) {
        ChoreographerFrameCallbackC0441a choreographerFrameCallbackC0441a = new ChoreographerFrameCallbackC0441a(viewGroup);
        Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC0441a);
        this.layoutCallbacks.put(viewGroup, choreographerFrameCallbackC0441a);
        b bVar = new b(this, 0);
        viewGroup.addOnAttachStateChangeListener(bVar);
        this.attachListeners.put(viewGroup, bVar);
    }

    @Override // com.chuanyi.ad.BaseViewGroupManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull ViewGroup viewGroup) {
        super.onDropViewInstance(viewGroup);
    }

    @Override // com.chuanyi.ad.BaseViewGroupManager, com.facebook.react.uimanager.ViewManager
    public ViewGroup createViewInstance(ThemedReactContext themedReactContext) {
        ViewGroup viewGroup;
        super.createViewInstance(themedReactContext);
        if (themedReactContext == null) {
            return null;
        }
        if (this.bannerType == 1) {
            viewGroup = (ViewGroup) LayoutInflater.from(themedReactContext).inflate(f.rn_ad_banner_layout_2, (ViewGroup) null);
        } else {
            viewGroup = (ViewGroup) LayoutInflater.from(themedReactContext).inflate(f.rn_ad_banner_layout, (ViewGroup) null);
        }
        BannerAdView adView = getAdView(viewGroup);
        setupLayout(viewGroup);
        if (!TextUtils.isEmpty(this.slotId)) {
            adView.setSlotId(this.slotId);
        }
        Integer num = this.pageMargin;
        if (num != null) {
            adView.setPageMargin(num.intValue());
        }
        Integer num2 = this.revealWidth;
        if (num2 != null) {
            adView.setRevealWidth(num2.intValue());
        }
        adView.setAdListener(new a(this, themedReactContext, viewGroup));
        return viewGroup;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public ViewGroup createViewInstance(int i7, @NonNull ThemedReactContext themedReactContext, @Nullable ReactStylesDiffMap reactStylesDiffMap, @Nullable StateWrapper stateWrapper) {
        if (reactStylesDiffMap != null) {
            if (reactStylesDiffMap.getString(BaseViewGroupManager.PROP_SLOT_ID) != null) {
                this.slotId = reactStylesDiffMap.getString(BaseViewGroupManager.PROP_SLOT_ID);
            }
            if (reactStylesDiffMap.hasKey(PROP_PAGE_MARGIN)) {
                this.pageMargin = Integer.valueOf(reactStylesDiffMap.getInt(PROP_PAGE_MARGIN, 0));
            }
            if (reactStylesDiffMap.hasKey(PROP_REVEAL_WIDTH)) {
                this.revealWidth = Integer.valueOf(reactStylesDiffMap.getInt(PROP_REVEAL_WIDTH, 0));
            }
            if (reactStylesDiffMap.hasKey(PROP_BANNER_TYPE)) {
                this.bannerType = reactStylesDiffMap.getInt(PROP_BANNER_TYPE, 0);
            }
        }
        return (ViewGroup) super.createViewInstance(i7, themedReactContext, reactStylesDiffMap, stateWrapper);
    }
}
