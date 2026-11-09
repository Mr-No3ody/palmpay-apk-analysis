package com.facebook.react.views.switchview;

import H3.j;
import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import androidx.annotation.ColorInt;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.viewmanagers.AndroidSwitchManagerDelegate;
import com.facebook.react.viewmanagers.AndroidSwitchManagerInterface;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u0000 I2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004:\u0001IB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0019H\u0017¢\u0006\u0004\b \u0010\u001cJ\u001f\u0010\"\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\"\u0010\u001cJ!\u0010$\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\b&\u0010%J!\u0010'\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\b'\u0010%J!\u0010(\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\b(\u0010%J!\u0010)\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\b)\u0010%J\u001f\u0010*\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b*\u0010\u001cJ\u001f\u0010,\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0014¢\u0006\u0004\b,\u0010-J\u001f\u00101\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\b\u0012\u0004\u0012\u00020\u000203H\u0014¢\u0006\u0004\b4\u00105J_\u0010D\u001a\u00020C2\u0006\u0010\u0010\u001a\u0002062\b\u00108\u001a\u0004\u0018\u0001072\b\u00109\u001a\u0004\u0018\u0001072\b\u0010:\u001a\u0004\u0018\u0001072\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020;2\u0006\u0010@\u001a\u00020=2\b\u0010B\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0019H\u0002¢\u0006\u0004\bF\u0010\u001cR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/facebook/react/views/switchview/ReactSwitchManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/views/switchview/ReactSwitch;", "Lcom/facebook/react/views/switchview/ReactSwitchShadowNode;", "Lcom/facebook/react/viewmanagers/AndroidSwitchManagerInterface;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "createShadowNodeInstance", "()Lcom/facebook/react/views/switchview/ReactSwitchShadowNode;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/facebook/react/views/switchview/ReactSwitch;", "view", "", ViewProps.BACKGROUND_COLOR, "", "setBackgroundColor", "(Lcom/facebook/react/views/switchview/ReactSwitch;I)V", "", "disabled", "setDisabled", "(Lcom/facebook/react/views/switchview/ReactSwitch;Z)V", ViewProps.ENABLED, "setEnabled", ViewProps.ON, "setOn", "value", "setValue", ViewProps.COLOR, "setThumbTintColor", "(Lcom/facebook/react/views/switchview/ReactSwitch;Ljava/lang/Integer;)V", "setThumbColor", "setTrackColorForFalse", "setTrackColorForTrue", "setTrackTintColor", "setNativeValue", "reactContext", "addEventEmitters", "(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/facebook/react/views/switchview/ReactSwitch;)V", "root", "", "extraData", "updateExtraData", "(Lcom/facebook/react/views/switchview/ReactSwitch;Ljava/lang/Object;)V", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Landroid/content/Context;", "Lcom/facebook/react/bridge/ReadableMap;", "localData", "props", RemoteConfigConstants.ResponseFieldKey.STATE, "", "width", "LH3/j;", "widthMode", "height", "heightMode", "", "attachmentsPositions", "", "measure", "(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;FLH3/j;FLH3/j;[F)J", "setValueInternal", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactSwitchManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactSwitchManager.kt\ncom/facebook/react/views/switchview/ReactSwitchManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n1#2:147\n*E\n"})
public final class ReactSwitchManager extends BaseViewManager<ReactSwitch, ReactSwitchShadowNode> implements AndroidSwitchManagerInterface<ReactSwitch> {

    @NotNull
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new a(0);

    @NotNull
    public static final String REACT_CLASS = "AndroidSwitch";

    @NotNull
    private final ViewManagerDelegate<ReactSwitch> delegate = new AndroidSwitchManagerDelegate(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ON_CHECKED_CHANGE_LISTENER$lambda$2(CompoundButton buttonView, boolean z3) {
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        Context context = buttonView.getContext();
        Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int id2 = buttonView.getId();
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, id2);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new ReactSwitchEvent(UIManagerHelper.getSurfaceId(reactContext), id2, z3));
        }
    }

    private final void setValueInternal(ReactSwitch view, boolean value) {
        view.setOnCheckedChangeListener(null);
        view.setOn(value);
        view.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<ReactSwitch> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Class<ReactSwitchShadowNode> getShadowNodeClass() {
        return ReactSwitchShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(@NotNull Context context, @Nullable ReadableMap localData, @Nullable ReadableMap props, @Nullable ReadableMap state, float width, @NotNull j widthMode, float height, @NotNull j heightMode, @Nullable float[] attachmentsPositions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(widthMode, "widthMode");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        ReactSwitch reactSwitch = new ReactSwitch(context);
        reactSwitch.setShowText(false);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        reactSwitch.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        return p059e1.a.O(PixelUtil.toDIPFromPixel(reactSwitch.getMeasuredWidth()), PixelUtil.toDIPFromPixel(reactSwitch.getMeasuredHeight()));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(@NotNull ReactSwitch root, @NotNull Object extraData) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NotNull ThemedReactContext reactContext, @NotNull ReactSwitch view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ReactSwitchShadowNode createShadowNodeInstance() {
        return new ReactSwitchShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ReactSwitch createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ReactSwitch reactSwitch = new ReactSwitch(context);
        reactSwitch.setShowText(false);
        return reactSwitch;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setBackgroundColor(@NotNull ReactSwitch view, @ColorInt int backgroundColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackgroundColor(backgroundColor);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(defaultBoolean = false, name = "disabled")
    public void setDisabled(@NotNull ReactSwitch view, boolean disabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEnabled(!disabled);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(defaultBoolean = true, name = ViewProps.ENABLED)
    public void setEnabled(@NotNull ReactSwitch view, boolean enabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEnabled(enabled);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    public void setNativeValue(@NotNull ReactSwitch view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        setValueInternal(view, value);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(name = ViewProps.ON)
    public void setOn(@NotNull ReactSwitch view, boolean on) {
        Intrinsics.checkNotNullParameter(view, "view");
        setValueInternal(view, on);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(customType = "Color", name = "thumbColor")
    public void setThumbColor(@NotNull ReactSwitch view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setThumbColor(color);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(@NotNull ReactSwitch view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        setThumbColor(view, color);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(customType = "Color", name = "trackColorForFalse")
    public void setTrackColorForFalse(@NotNull ReactSwitch view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTrackColorForFalse(color);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(customType = "Color", name = "trackColorForTrue")
    public void setTrackColorForTrue(@NotNull ReactSwitch view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTrackColorForTrue(color);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(customType = "Color", name = "trackTintColor")
    public void setTrackTintColor(@NotNull ReactSwitch view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTrackColor(color);
    }

    @Override // com.facebook.react.viewmanagers.AndroidSwitchManagerInterface
    @ReactProp(name = "value")
    public void setValue(@NotNull ReactSwitch view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        setValueInternal(view, value);
    }
}
