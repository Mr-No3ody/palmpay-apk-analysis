package com.transsnet.palmpay.ui.view;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.text.ReactTextView;
import com.facebook.react.views.text.ReactTextViewManager;

/* JADX INFO: loaded from: classes4.dex */
@ReactModule(canOverrideExistingModule = true, name = "RCTText")
public class CustomReactTextViewManager extends ReactTextViewManager {
    @Override // com.facebook.react.views.text.ReactTextViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RCTText";
    }

    @Override // com.facebook.react.views.text.ReactTextViewManager, com.facebook.react.uimanager.ViewManager
    public ReactTextView createViewInstance(ThemedReactContext themedReactContext) {
        return new CustomReactTextView(themedReactContext);
    }
}
