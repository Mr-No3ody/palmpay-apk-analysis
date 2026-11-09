package com.dylanvann.fastimage;

import androidx.annotation.NonNull;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FastImageViewPackage implements ReactPackage {
    @Override // com.facebook.react.ReactPackage
    @NonNull
    public List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new FastImageViewModule(reactApplicationContext));
    }

    @Override // com.facebook.react.ReactPackage
    @NonNull
    public List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new FastImageViewManager());
    }
}
