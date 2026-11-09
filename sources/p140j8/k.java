package p140j8;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends LayoutShadowNode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f38358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f38359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f38360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f38361d;

    public k() {
        int[] iArr = ViewProps.PADDING_MARGIN_SPACING_TYPES;
        this.f38359b = new float[iArr.length];
        this.f38360c = new float[iArr.length];
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f38359b[i7] = Float.NaN;
            this.f38360c[i7] = Float.NaN;
        }
    }

    public static float a(g gVar, float f10, float f11) {
        if (gVar == g.f38344a) {
            return f11;
        }
        return gVar == g.f38346c ? Math.max(f10, f11) : f10 + f11;
    }

    public final void b() {
        i iVar = this.f38358a;
        if (iVar == null) {
            return;
        }
        j jVar = j.f38355a;
        j jVar2 = iVar.f38353b;
        float[] fArr = jVar2 == jVar ? this.f38359b : this.f38360c;
        float f10 = fArr[8];
        if (Float.isNaN(f10)) {
            f10 = 0.0f;
        }
        float f11 = f10;
        float f12 = f11;
        float f13 = f12;
        float f14 = fArr[7];
        if (!Float.isNaN(f14)) {
            f10 = f14;
            f12 = f10;
        }
        float f15 = fArr[6];
        if (!Float.isNaN(f15)) {
            f11 = f15;
            f13 = f11;
        }
        float f16 = fArr[1];
        if (!Float.isNaN(f16)) {
            f10 = f16;
        }
        float f17 = fArr[2];
        if (!Float.isNaN(f17)) {
            f11 = f17;
        }
        float f18 = fArr[3];
        if (!Float.isNaN(f18)) {
            f12 = f18;
        }
        float f19 = fArr[0];
        if (!Float.isNaN(f19)) {
            f13 = f19;
        }
        float pixelFromDIP = PixelUtil.toPixelFromDIP(f10);
        float pixelFromDIP2 = PixelUtil.toPixelFromDIP(f11);
        float pixelFromDIP3 = PixelUtil.toPixelFromDIP(f12);
        float pixelFromDIP4 = PixelUtil.toPixelFromDIP(f13);
        h hVar = iVar.f38354c;
        g gVar = hVar.f38351d;
        g gVar2 = hVar.f38350c;
        g gVar3 = hVar.f38349b;
        g gVar4 = hVar.f38348a;
        a aVar = iVar.f38352a;
        if (jVar2 == jVar) {
            super.setPadding(1, a(gVar4, aVar.f38332a, pixelFromDIP));
            super.setPadding(2, a(gVar3, aVar.f38333b, pixelFromDIP2));
            super.setPadding(3, a(gVar2, aVar.f38334c, pixelFromDIP3));
            super.setPadding(0, a(gVar, aVar.f38335d, pixelFromDIP4));
            return;
        }
        super.setMargin(1, a(gVar4, aVar.f38332a, pixelFromDIP));
        super.setMargin(2, a(gVar3, aVar.f38333b, pixelFromDIP2));
        super.setMargin(3, a(gVar2, aVar.f38334c, pixelFromDIP3));
        super.setMargin(0, a(gVar, aVar.f38335d, pixelFromDIP4));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public final void onBeforeLayout(NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        Intrinsics.checkNotNullParameter(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        if (this.f38361d) {
            this.f38361d = false;
            b();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public final void setLocalData(Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof i) {
            i iVar = this.f38358a;
            if (iVar != null) {
                j jVar = ((i) data).f38353b;
                j jVar2 = iVar.f38353b;
                if (jVar2 != jVar) {
                    if (jVar2 == j.f38355a) {
                        float[] fArr = this.f38359b;
                        super.setPadding(1, fArr[1]);
                        super.setPadding(2, fArr[2]);
                        super.setPadding(3, fArr[3]);
                        super.setPadding(0, fArr[0]);
                    } else {
                        float[] fArr2 = this.f38360c;
                        super.setMargin(1, fArr2[1]);
                        super.setMargin(2, fArr2[2]);
                        super.setMargin(3, fArr2[3]);
                        super.setMargin(0, fArr2[0]);
                    }
                    markUpdated();
                }
            }
            this.f38358a = (i) data;
            this.f38361d = false;
            b();
        }
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    @ReactPropGroup(names = {ViewProps.MARGIN, ViewProps.MARGIN_VERTICAL, ViewProps.MARGIN_HORIZONTAL, ViewProps.MARGIN_START, ViewProps.MARGIN_END, ViewProps.MARGIN_TOP, ViewProps.MARGIN_BOTTOM, ViewProps.MARGIN_LEFT, ViewProps.MARGIN_RIGHT})
    public void setMargins(int i7, @NotNull Dynamic margin) {
        Intrinsics.checkNotNullParameter(margin, "margin");
        this.f38360c[ViewProps.PADDING_MARGIN_SPACING_TYPES[i7]] = margin.getType() == ReadableType.Number ? (float) margin.asDouble() : Float.NaN;
        super.setMargins(i7, margin);
        this.f38361d = true;
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    @ReactPropGroup(names = {ViewProps.PADDING, ViewProps.PADDING_VERTICAL, ViewProps.PADDING_HORIZONTAL, ViewProps.PADDING_START, ViewProps.PADDING_END, ViewProps.PADDING_TOP, ViewProps.PADDING_BOTTOM, ViewProps.PADDING_LEFT, ViewProps.PADDING_RIGHT})
    public void setPaddings(int i7, @NotNull Dynamic padding) {
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.f38359b[ViewProps.PADDING_MARGIN_SPACING_TYPES[i7]] = padding.getType() == ReadableType.Number ? (float) padding.asDouble() : Float.NaN;
        super.setPaddings(i7, padding);
        this.f38361d = true;
    }
}
