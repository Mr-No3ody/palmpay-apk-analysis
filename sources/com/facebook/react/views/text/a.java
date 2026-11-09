package com.facebook.react.views.text;

import H3.j;
import H3.k;
import com.facebook.yoga.YogaBaselineFunction;
import com.facebook.yoga.YogaMeasureFunction;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements YogaMeasureFunction, YogaBaselineFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReactTextShadowNode f21839a;

    public /* synthetic */ a(ReactTextShadowNode reactTextShadowNode) {
        this.f21839a = reactTextShadowNode;
    }

    @Override // com.facebook.yoga.YogaBaselineFunction
    public float baseline(k kVar, float f10, float f11) {
        return ReactTextShadowNode.mTextBaselineFunction$lambda$4(this.f21839a, kVar, f10, f11);
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public long measure(k kVar, float f10, j jVar, float f11, j jVar2) {
        return ReactTextShadowNode.textMeasureFunction$lambda$2(this.f21839a, kVar, f10, jVar, f11, jVar2);
    }
}
