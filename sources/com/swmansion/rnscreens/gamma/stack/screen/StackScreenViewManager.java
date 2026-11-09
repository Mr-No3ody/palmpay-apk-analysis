package com.swmansion.rnscreens.gamma.stack.screen;

import N8.q0;
import T7.a;
import T7.d;
import com.alibaba.android.arouter.utils.Consts;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RNSStackScreenManagerDelegate;
import com.facebook.react.viewmanagers.RNSStackScreenManagerInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = StackScreenViewManager.REACT_CLASS)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreen;", "Lcom/facebook/react/viewmanagers/RNSStackScreenManagerInterface;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreen;", "view", "", "addEventEmitters", "(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreen;)V", "value", "setActivityMode", "(Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreen;Ljava/lang/String;)V", "setScreenKey", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StackScreenViewManager extends ViewGroupManager<StackScreen> implements RNSStackScreenManagerInterface<StackScreen> {

    @NotNull
    public static final String REACT_CLASS = "RNSStackScreen";

    @NotNull
    private final ViewManagerDelegate<StackScreen> delegate;

    public StackScreenViewManager() {
        super(null, 1, null);
        this.delegate = new RNSStackScreenManagerDelegate(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<StackScreen> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NotNull ThemedReactContext reactContext, @NotNull StackScreen view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        super.addEventEmitters(reactContext, view);
        if (view.getId() == -1) {
            throw new IllegalStateException("[RNScreens] StackScreen must have its tag set when registering event emitters");
        }
        int id2 = view.getId();
        ThemedReactContext reactContext2 = view.f25414a;
        Intrinsics.checkNotNullParameter(reactContext2, "reactContext");
        view.setEventEmitter$react_native_screens_release(new d(reactContext2, id2));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public StackScreen createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new StackScreen(reactContext);
    }

    @Override // com.facebook.react.viewmanagers.RNSStackScreenManagerInterface
    public void setActivityMode(@NotNull StackScreen view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Intrinsics.c(value, "attached")) {
            view.setActivityMode(a.f9034b);
        } else {
            if (!Intrinsics.c(value, "detached")) {
                throw new JSApplicationIllegalArgumentException(q0.k("[RNScreens] Invalid activity mode: ", value, Consts.DOT));
            }
            view.setActivityMode(a.f9033a);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSStackScreenManagerInterface
    public void setScreenKey(@NotNull StackScreen view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value == null) {
            throw new IllegalArgumentException("[RNScreens] screenKey must not be null.");
        }
        view.setScreenKey(value);
    }
}
