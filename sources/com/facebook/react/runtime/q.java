package com.facebook.react.runtime;

import com.facebook.react.bridge.NativeMap;
import com.facebook.react.uimanager.UIConstantsProviderBinding;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements UIConstantsProviderBinding.ConstantsForViewManagerProvider, UIConstantsProviderBinding.ConstantsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReactInstance f21816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f21817b;

    public /* synthetic */ q(ReactInstance reactInstance, HashMap map) {
        this.f21816a = reactInstance;
        this.f21817b = map;
    }

    @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.ConstantsProvider
    public NativeMap getConstants() {
        return ReactInstance._init_$lambda$2(this.f21816a, this.f21817b);
    }

    @Override // com.facebook.react.uimanager.UIConstantsProviderBinding.ConstantsForViewManagerProvider
    public NativeMap getConstantsForViewManager(String str) {
        return ReactInstance._init_$lambda$1(this.f21816a, this.f21817b, str);
    }
}
