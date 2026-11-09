package com.rnmaps.maps;

import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.UIViewOperationQueue;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class L extends LayoutShadowNode {
    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public final void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        super.onCollectExtraUpdates(uIViewOperationQueue);
        HashMap map = new HashMap();
        map.put("width", Float.valueOf(getLayoutWidth()));
        map.put("height", Float.valueOf(getLayoutHeight()));
        uIViewOperationQueue.enqueueUpdateExtraData(getReactTag(), map);
    }
}
