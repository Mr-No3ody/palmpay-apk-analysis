package com.rnmaps.maps;

import com.facebook.fbreact.specs.NativeAirMapsModuleSpec;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.reactnativecommunity.asyncstorage.AsyncStorageModule;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class J implements ReactModuleInfoProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24715a;

    @Override // com.facebook.react.module.model.ReactModuleInfoProvider
    public final Map getReactModuleInfos() {
        switch (this.f24715a) {
            case 0:
                HashMap map = new HashMap();
                map.put(NativeAirMapsModuleSpec.NAME, new ReactModuleInfo(NativeAirMapsModuleSpec.NAME, NativeAirMapsModuleSpec.NAME, false, false, false, true));
                return map;
            case 1:
                HashMap map2 = new HashMap();
                Class cls = new Class[]{AsyncStorageModule.class}[0];
                ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
                map2.put(reactModule.name(), new ReactModuleInfo(reactModule.name(), cls.getName(), reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.hasConstants(), reactModule.isCxxModule(), true));
                return map2;
            default:
                HashMap map3 = new HashMap();
                Class cls2 = new Class[]{ClipboardModule.class}[0];
                ReactModule reactModule2 = (ReactModule) cls2.getAnnotation(ReactModule.class);
                map3.put(reactModule2.name(), new ReactModuleInfo(reactModule2.name(), cls2.getName(), reactModule2.canOverrideExistingModule(), reactModule2.needsEagerInit(), reactModule2.hasConstants(), reactModule2.isCxxModule(), TurboModule.class.isAssignableFrom(cls2)));
                return map3;
        }
    }
}
