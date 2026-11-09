package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140j8.g;
import p140j8.h;
import p140j8.j;
import p140j8.k;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = SafeAreaViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0012\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "Lcom/th3rdwave/safeareacontext/SafeAreaView;", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/th3rdwave/safeareacontext/SafeAreaView;", "Lj8/k;", "createShadowNodeInstance", "()Lj8/k;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "view", "mode", "", "setMode", "(Lcom/th3rdwave/safeareacontext/SafeAreaView;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableMap;", "propList", "setEdges", "(Lcom/th3rdwave/safeareacontext/SafeAreaView;Lcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/views/view/ReactViewGroup;", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "props", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", "", "updateState", "(Lcom/facebook/react/views/view/ReactViewGroup;Lcom/facebook/react/uimanager/ReactStylesDiffMap;Lcom/facebook/react/uimanager/StateWrapper;)Ljava/lang/Object;", "Companion", "a", "react-native-safe-area-context_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSafeAreaViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeAreaViewManager.kt\ncom/th3rdwave/safeareacontext/SafeAreaViewManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
public final class SafeAreaViewManager extends ReactViewManager {

    @NotNull
    public static final String REACT_CLASS = "RNCSafeAreaView";

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Class<k> getShadowNodeClass() {
        return k.class;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    @ReactProp(name = "edges")
    public final void setEdges(@NotNull SafeAreaView view, @Nullable ReadableMap propList) {
        g gVarValueOf;
        g gVarValueOf2;
        g gVarValueOf3;
        g gVarValueOf4;
        Intrinsics.checkNotNullParameter(view, "view");
        if (propList != null) {
            String string = propList.getString(ViewProps.TOP);
            if (string != null) {
                String upperCase = string.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                gVarValueOf = g.valueOf(upperCase);
                if (gVarValueOf == null) {
                    gVarValueOf = g.f38344a;
                }
            } else {
                gVarValueOf = g.f38344a;
            }
            String string2 = propList.getString(ViewProps.RIGHT);
            if (string2 != null) {
                String upperCase2 = string2.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                gVarValueOf2 = g.valueOf(upperCase2);
                if (gVarValueOf2 == null) {
                    gVarValueOf2 = g.f38344a;
                }
            } else {
                gVarValueOf2 = g.f38344a;
            }
            String string3 = propList.getString(ViewProps.BOTTOM);
            if (string3 != null) {
                String upperCase3 = string3.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                gVarValueOf3 = g.valueOf(upperCase3);
                if (gVarValueOf3 == null) {
                    gVarValueOf3 = g.f38344a;
                }
            } else {
                gVarValueOf3 = g.f38344a;
            }
            String string4 = propList.getString(ViewProps.LEFT);
            if (string4 != null) {
                String upperCase4 = string4.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                gVarValueOf4 = g.valueOf(upperCase4);
                if (gVarValueOf4 == null) {
                    gVarValueOf4 = g.f38344a;
                }
            } else {
                gVarValueOf4 = g.f38344a;
            }
            view.setEdges(new h(gVarValueOf, gVarValueOf2, gVarValueOf3, gVarValueOf4));
        }
    }

    @ReactProp(name = "mode")
    public final void setMode(@NotNull SafeAreaView view, @Nullable String mode) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Intrinsics.c(mode, ViewProps.PADDING)) {
            view.setMode(j.f38355a);
        } else if (Intrinsics.c(mode, ViewProps.MARGIN)) {
            view.setMode(j.f38356b);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Object updateState(@NotNull ReactViewGroup view, @Nullable ReactStylesDiffMap props, @Nullable StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((SafeAreaView) view).setStateWrapper(stateWrapper);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public k createShadowNodeInstance() {
        return new k();
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public SafeAreaView createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new SafeAreaView(context);
    }
}
