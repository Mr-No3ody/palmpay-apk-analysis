package com.google.firebase.perf;

import F6.d;
import androidx.annotation.Keep;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.transsnet.palmpay.core.base.BaseApplication;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class WrapFirebasePerfRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        BaseApplication baseApplication = BaseApplication.get();
        if (baseApplication == null || !baseApplication.isPrimaryProcessCached()) {
            d.h("FirebasePerf", 3, "getComponents: sub skip");
            return Collections.EMPTY_LIST;
        }
        d.h("FirebasePerf", 3, "getComponents: main");
        return new FirebasePerfRegistrar().getComponents();
    }
}
