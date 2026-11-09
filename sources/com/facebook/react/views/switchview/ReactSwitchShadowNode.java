package com.facebook.react.views.switchview;

import H3.j;
import H3.k;
import android.view.View;
import com.facebook.react.common.annotations.LegacyArchitectureShadowNodeWithCxxImpl;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.yoga.YogaMeasureFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@LegacyArchitectureShadowNodeWithCxxImpl
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J7\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0016\u0010\r\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/views/switchview/ReactSwitchShadowNode;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "Lcom/facebook/yoga/YogaMeasureFunction;", "<init>", "()V", "", "initMeasureFunction", "LH3/k;", "node", "", "width", "LH3/j;", "widthMode", "height", "heightMode", "", "measure", "(LH3/k;FLH3/j;FLH3/j;)J", "", "I", "", "measured", "Z", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactSwitchShadowNode extends LayoutShadowNode implements YogaMeasureFunction {
    private int height;
    private boolean measured;
    private int width;

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("ReactSwitchShadowNode", LegacyArchitectureLogLevel.ERROR);
    }

    public ReactSwitchShadowNode() {
        initMeasureFunction();
    }

    private final void initMeasureFunction() {
        setMeasureFunction(this);
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public long measure(@NotNull k node, float width, @NotNull j widthMode, float height, @NotNull j heightMode) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(widthMode, "widthMode");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        if (!this.measured) {
            ThemedReactContext themedContext = getThemedContext();
            Intrinsics.checkNotNullExpressionValue(themedContext, "getThemedContext(...)");
            ReactSwitch reactSwitch = new ReactSwitch(themedContext);
            reactSwitch.setShowText(false);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            reactSwitch.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            this.width = reactSwitch.getMeasuredWidth();
            this.height = reactSwitch.getMeasuredHeight();
            this.measured = true;
        }
        return p059e1.a.O(this.width, this.height);
    }
}
