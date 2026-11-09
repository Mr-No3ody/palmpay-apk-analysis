package com.swmansion.rnscreens;

import android.view.ViewGroup;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.StateWrapper;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/swmansion/rnscreens/FabricEnabledViewGroup;", "Landroid/view/ViewGroup;", "Lcom/facebook/react/uimanager/StateWrapper;", "wrapper", "", "setStateWrapper", "(Lcom/facebook/react/uimanager/StateWrapper;)V", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class FabricEnabledViewGroup extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public StateWrapper f25269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f25270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f25271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f25272d;

    public final void a(int i7, int i10, int i11) {
        float dIPFromPixel = PixelUtil.toDIPFromPixel(i7);
        float dIPFromPixel2 = PixelUtil.toDIPFromPixel(i10);
        float dIPFromPixel3 = PixelUtil.toDIPFromPixel(i11);
        if (Math.abs(this.f25270b - dIPFromPixel) >= 0.9f || Math.abs(this.f25271c - dIPFromPixel2) >= 0.9f || Math.abs(this.f25272d - dIPFromPixel3) >= 0.9f) {
            this.f25270b = dIPFromPixel;
            this.f25271c = dIPFromPixel2;
            this.f25272d = dIPFromPixel3;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("frameWidth", dIPFromPixel);
            writableNativeMap.putDouble("frameHeight", dIPFromPixel2);
            writableNativeMap.putDouble("contentOffsetX", 0.0d);
            writableNativeMap.putDouble("contentOffsetY", dIPFromPixel3);
            StateWrapper stateWrapper = this.f25269a;
            if (stateWrapper != null) {
                stateWrapper.updateState(writableNativeMap);
            }
        }
    }

    public final void setStateWrapper(@Nullable StateWrapper wrapper) {
        this.f25269a = wrapper;
    }
}
