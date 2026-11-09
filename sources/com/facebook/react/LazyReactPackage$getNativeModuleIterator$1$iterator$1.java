package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0004H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¨\u0006\u0006"}, d2 = {"com/facebook/react/LazyReactPackage$getNativeModuleIterator$1$iterator$1", "", "Lcom/facebook/react/bridge/ModuleHolder;", "hasNext", "", "next", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LazyReactPackage$getNativeModuleIterator$1$iterator$1 implements Iterator<ModuleHolder>, KMappedMarker {
    final /* synthetic */ List<ModuleSpec> $nativeModules;
    final /* synthetic */ D $position;
    final /* synthetic */ Map<String, ReactModuleInfo> $reactModuleInfoMap;

    public LazyReactPackage$getNativeModuleIterator$1$iterator$1(D d2, List<ModuleSpec> list, Map<String, ReactModuleInfo> map) {
        this.$position = d2;
        this.$nativeModules = list;
        this.$reactModuleInfoMap = map;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.$position.f38949a < this.$nativeModules.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public ModuleHolder next() {
        List<ModuleSpec> list = this.$nativeModules;
        D d2 = this.$position;
        int i7 = d2.f38949a;
        d2.f38949a = i7 + 1;
        ModuleSpec moduleSpec = list.get(i7);
        String strModuleName = moduleSpec.moduleName();
        ReactModuleInfo reactModuleInfo = this.$reactModuleInfoMap.get(strModuleName);
        if (reactModuleInfo != null) {
            return new ModuleHolder(reactModuleInfo, moduleSpec.provider());
        }
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, strModuleName);
        try {
            NativeModule nativeModule = moduleSpec.provider().get();
            Intrinsics.checkNotNullExpressionValue(nativeModule, "get(...)");
            return new ModuleHolder(nativeModule);
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
        }
    }
}
