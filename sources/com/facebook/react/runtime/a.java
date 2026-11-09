package com.facebook.react.runtime;

import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.shell.MainReactPackage;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ReactModuleInfoProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f21761b;

    public /* synthetic */ a(HashMap map, int i7) {
        this.f21760a = i7;
        this.f21761b = map;
    }

    @Override // com.facebook.react.module.model.ReactModuleInfoProvider
    public final Map getReactModuleInfos() {
        switch (this.f21760a) {
            case 0:
                return CoreReactPackage.fallbackForMissingClass$lambda$0(this.f21761b);
            case 1:
                return this.f21761b;
            default:
                return MainReactPackage.fallbackForMissingClass$lambda$19((LinkedHashMap) this.f21761b);
        }
    }
}
