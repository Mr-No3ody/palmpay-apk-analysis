package com.swmansion.rnscreens;

import M7.G;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.StateWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0013\u0010\r\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderSubview;", "Lcom/swmansion/rnscreens/FabricEnabledHeaderSubviewViewGroup;", "LM7/G;", "j", "LM7/G;", "getType", "()LM7/G;", "setType", "(LM7/G;)V", "type", "Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;", "getConfig", "()Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;", "config", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class ScreenStackHeaderSubview extends FabricEnabledHeaderSubviewViewGroup {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25376g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25377i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public G type;

    @Nullable
    public final ScreenStackHeaderConfig getConfig() {
        ViewParent parent = getParent();
        CustomToolbar customToolbar = parent instanceof CustomToolbar ? (CustomToolbar) parent : null;
        if (customToolbar != null) {
            return customToolbar.getConfig();
        }
        return null;
    }

    @NotNull
    public final G getType() {
        return this.type;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        if (z3) {
            int i13 = i11 - i7;
            int i14 = i12 - i10;
            if (this.f25377i) {
                float dIPFromPixel = PixelUtil.toDIPFromPixel(i13);
                float dIPFromPixel2 = PixelUtil.toDIPFromPixel(i14);
                float dIPFromPixel3 = PixelUtil.toDIPFromPixel(i7);
                float dIPFromPixel4 = PixelUtil.toDIPFromPixel(i10);
                if (Math.abs(this.f25265b - dIPFromPixel) >= 0.9f || Math.abs(this.f25266c - dIPFromPixel2) >= 0.9f || Math.abs(this.f25267d - dIPFromPixel3) >= 0.9f || Math.abs(this.f25268e - dIPFromPixel4) >= 0.9f) {
                    this.f25265b = dIPFromPixel;
                    this.f25266c = dIPFromPixel2;
                    this.f25267d = dIPFromPixel3;
                    this.f25268e = dIPFromPixel4;
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putDouble("frameWidth", dIPFromPixel);
                    writableNativeMap.putDouble("frameHeight", dIPFromPixel2);
                    writableNativeMap.putDouble("contentOffsetX", dIPFromPixel3);
                    writableNativeMap.putDouble("contentOffsetY", dIPFromPixel4);
                    StateWrapper stateWrapper = this.f25264a;
                    if (stateWrapper != null) {
                        stateWrapper.updateState(writableNativeMap);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        if (View.MeasureSpec.getMode(i7) == 1073741824 && View.MeasureSpec.getMode(i10) == 1073741824) {
            this.f25375f = View.MeasureSpec.getSize(i7);
            this.f25376g = View.MeasureSpec.getSize(i10);
            this.f25377i = true;
            Object parent = getParent();
            if (parent != null) {
                forceLayout();
                ((View) parent).requestLayout();
            }
        }
        setMeasuredDimension(this.f25375f, this.f25376g);
    }

    public final void setType(@NotNull G g7) {
        Intrinsics.checkNotNullParameter(g7, "<set-?>");
        this.type = g7;
    }
}
