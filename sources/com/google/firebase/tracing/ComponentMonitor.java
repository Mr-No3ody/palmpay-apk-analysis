package com.google.firebase.tracing;

import O4.a;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ComponentMonitor implements ComponentRegistrarProcessor {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$processRegistrar$0(String str, Component component, ComponentContainer componentContainer) {
        try {
            FirebaseTrace.pushTrace(str);
            return component.getFactory().create(componentContainer);
        } finally {
            FirebaseTrace.popTrace();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List<Component<?>> processRegistrar(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (Component<?> componentWithFactory : componentRegistrar.getComponents()) {
            String name = componentWithFactory.getName();
            if (name != null) {
                componentWithFactory = componentWithFactory.withFactory(new a(name, componentWithFactory, 0));
            }
            arrayList.add(componentWithFactory);
        }
        return arrayList;
    }
}
