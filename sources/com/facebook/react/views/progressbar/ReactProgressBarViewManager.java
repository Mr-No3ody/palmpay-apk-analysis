package com.facebook.react.views.progressbar;

import H3.j;
import android.R;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.AndroidProgressBarManagerDelegate;
import com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229p2.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 I2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004:\u0001IB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0017H\u0017¢\u0006\u0004\b \u0010\u001aJ!\u0010\"\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\"\u0010\u0012J!\u0010#\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b#\u0010\u0012J\u000f\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030&H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\b\u0012\u0004\u0012\u00020\u000200H\u0014¢\u0006\u0004\b1\u00102JY\u0010A\u001a\u00020@2\u0006\u0010\u000b\u001a\u0002032\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u0002042\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u0002082\u0006\u0010=\u001a\u00020:2\b\u0010?\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\bA\u0010BR,\u0010E\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/views/progressbar/ProgressBarContainerView;", "Lcom/facebook/react/views/progressbar/ProgressBarShadowNode;", "Lcom/facebook/react/viewmanagers/AndroidProgressBarManagerInterface;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/facebook/react/views/progressbar/ProgressBarContainerView;", "view", "styleName", "", "setStyleAttr", "(Lcom/facebook/react/views/progressbar/ProgressBarContainerView;Ljava/lang/String;)V", "", ViewProps.COLOR, "setColor", "(Lcom/facebook/react/views/progressbar/ProgressBarContainerView;Ljava/lang/Integer;)V", "", ReactProgressBarViewManager.PROP_INDETERMINATE, "setIndeterminate", "(Lcom/facebook/react/views/progressbar/ProgressBarContainerView;Z)V", "", ReactProgressBarViewManager.PROP_PROGRESS, "setProgress", "(Lcom/facebook/react/views/progressbar/ProgressBarContainerView;D)V", ReactProgressBarViewManager.PROP_ANIMATING, "setAnimating", "value", "setTestID", "setTypeAttr", "createShadowNodeInstance", "()Lcom/facebook/react/views/progressbar/ProgressBarShadowNode;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "root", "", "extraData", "updateExtraData", "(Lcom/facebook/react/views/progressbar/ProgressBarContainerView;Ljava/lang/Object;)V", "onAfterUpdateTransaction", "(Lcom/facebook/react/views/progressbar/ProgressBarContainerView;)V", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Landroid/content/Context;", "Lcom/facebook/react/bridge/ReadableMap;", "localData", "props", RemoteConfigConstants.ResponseFieldKey.STATE, "", "width", "LH3/j;", "widthMode", "height", "heightMode", "", "attachmentsPositions", "", "measure", "(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;FLH3/j;FLH3/j;[F)J", "Ljava/util/WeakHashMap;", "Landroid/util/Pair;", "measuredStyles", "Ljava/util/WeakHashMap;", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ReactModule(name = ReactProgressBarViewManager.REACT_CLASS)
@SourceDebugExtension({"SMAP\nReactProgressBarViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactProgressBarViewManager.kt\ncom/facebook/react/views/progressbar/ReactProgressBarViewManager\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,166:1\n384#2,7:167\n*S KotlinDebug\n*F\n+ 1 ReactProgressBarViewManager.kt\ncom/facebook/react/views/progressbar/ReactProgressBarViewManager\n*L\n111#1:167,7\n*E\n"})
public final class ReactProgressBarViewManager extends BaseViewManager<ProgressBarContainerView, ProgressBarShadowNode> implements AndroidProgressBarManagerInterface<ProgressBarContainerView> {

    @NotNull
    public static final String DEFAULT_STYLE = "Normal";

    @NotNull
    public static final String PROP_ANIMATING = "animating";

    @NotNull
    public static final String PROP_ATTR = "typeAttr";

    @NotNull
    public static final String PROP_INDETERMINATE = "indeterminate";

    @NotNull
    public static final String PROP_PROGRESS = "progress";

    @NotNull
    public static final String PROP_STYLE = "styleAttr";

    @NotNull
    public static final String REACT_CLASS = "AndroidProgressBar";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Object progressBarCtorLock = new Object();

    @NotNull
    private final WeakHashMap<Integer, Pair<Integer, Integer>> measuredStyles = new WeakHashMap<>();

    @NotNull
    private final ViewManagerDelegate<ProgressBarContainerView> delegate = new AndroidProgressBarManagerDelegate(this);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0017\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\b\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager$Companion;", "", "<init>", "()V", "REACT_CLASS", "", "PROP_STYLE", "PROP_ATTR", "PROP_INDETERMINATE", "PROP_PROGRESS", "PROP_ANIMATING", "DEFAULT_STYLE", "progressBarCtorLock", "createProgressBar", "Landroid/widget/ProgressBar;", "context", "Landroid/content/Context;", "style", "", "getStyleFromString", "styleStr", "getStyleFromString$ReactAndroid_release", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ProgressBar createProgressBar(@Nullable Context context, int style) {
            ProgressBar progressBar;
            synchronized (ReactProgressBarViewManager.progressBarCtorLock) {
                progressBar = new ProgressBar(context, null, style);
            }
            return progressBar;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:39:0x0065  */
        public final int getStyleFromString$ReactAndroid_release(@Nullable String styleStr) {
            if (styleStr == null) {
                a.v("ReactNative", "ProgressBar needs to have a style, null received");
                return R.attr.progressBarStyle;
            }
            switch (styleStr) {
                case "Normal":
                    if (!styleStr.equals(ReactProgressBarViewManager.DEFAULT_STYLE)) {
                        a.v("ReactNative", "Unknown ProgressBar style: ".concat(styleStr));
                    }
                    return R.attr.progressBarStyle;
                case "SmallInverse":
                    return R.attr.progressBarStyleSmallInverse;
                case "Horizontal":
                    return R.attr.progressBarStyleHorizontal;
                case "Inverse":
                    return R.attr.progressBarStyleInverse;
                case "LargeInverse":
                    return R.attr.progressBarStyleLargeInverse;
                case "Large":
                    return R.attr.progressBarStyleLarge;
                case "Small":
                    return R.attr.progressBarStyleSmall;
                default:
                    a.v("ReactNative", "Unknown ProgressBar style: ".concat(styleStr));
            }
        }

        private Companion() {
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<ProgressBarContainerView> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Class<ProgressBarShadowNode> getShadowNodeClass() {
        return ProgressBarShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(@NotNull Context context, @NotNull ReadableMap localData, @NotNull ReadableMap props, @NotNull ReadableMap state, float width, @NotNull j widthMode, float height, @NotNull j heightMode, @Nullable float[] attachmentsPositions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(localData, "localData");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widthMode, "widthMode");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        Companion companion = INSTANCE;
        int styleFromString$ReactAndroid_release = companion.getStyleFromString$ReactAndroid_release(props.getString(PROP_STYLE));
        WeakHashMap<Integer, Pair<Integer, Integer>> weakHashMap = this.measuredStyles;
        Integer numValueOf = Integer.valueOf(styleFromString$ReactAndroid_release);
        Pair<Integer, Integer> pairCreate = weakHashMap.get(numValueOf);
        if (pairCreate == null) {
            ProgressBar progressBarCreateProgressBar = companion.createProgressBar(context, styleFromString$ReactAndroid_release);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            progressBarCreateProgressBar.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            pairCreate = Pair.create(Integer.valueOf(progressBarCreateProgressBar.getMeasuredWidth()), Integer.valueOf(progressBarCreateProgressBar.getMeasuredHeight()));
            weakHashMap.put(numValueOf, pairCreate);
        }
        Pair<Integer, Integer> pair = pairCreate;
        return p059e1.a.O(PixelUtil.toDIPFromPixel(((Number) pair.first).intValue()), PixelUtil.toDIPFromPixel(((Number) pair.second).intValue()));
    }

    @Override // com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface
    @ReactProp(name = PROP_ATTR)
    public void setTypeAttr(@NotNull ProgressBarContainerView view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(@NotNull ProgressBarContainerView root, @NotNull Object extraData) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ProgressBarShadowNode createShadowNodeInstance() {
        return new ProgressBarShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ProgressBarContainerView createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ProgressBarContainerView(context);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull ProgressBarContainerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.apply$ReactAndroid_release();
    }

    @Override // com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface
    @ReactProp(name = PROP_ANIMATING)
    public void setAnimating(@NotNull ProgressBarContainerView view, boolean animating) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setAnimating$ReactAndroid_release(animating);
    }

    @Override // com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface
    @ReactProp(customType = "Color", name = ViewProps.COLOR)
    public void setColor(@NotNull ProgressBarContainerView view, @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setColor$ReactAndroid_release(color);
    }

    @Override // com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface
    @ReactProp(name = PROP_INDETERMINATE)
    public void setIndeterminate(@NotNull ProgressBarContainerView view, boolean indeterminate) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setIndeterminate$ReactAndroid_release(indeterminate);
    }

    @Override // com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface
    @ReactProp(name = PROP_PROGRESS)
    public void setProgress(@NotNull ProgressBarContainerView view, double progress) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setProgress$ReactAndroid_release(progress);
    }

    @Override // com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface
    @ReactProp(name = PROP_STYLE)
    public void setStyleAttr(@NotNull ProgressBarContainerView view, @Nullable String styleName) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStyle$ReactAndroid_release(styleName);
    }

    @Override // com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface
    public void setTestID(@NotNull ProgressBarContainerView view, @Nullable String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.setTestId(view, value);
    }
}
