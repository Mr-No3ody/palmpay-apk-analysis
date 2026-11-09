package com.facebook.yoga;

import H3.a;
import H3.b;
import H3.e;
import H3.g;
import H3.h;
import H3.i;
import H3.n;
import H3.p;

/* JADX INFO: loaded from: classes.dex */
public interface YogaProps {
    a getAlignContent();

    a getAlignItems();

    a getAlignSelf();

    float getAspectRatio();

    float getBorder(g gVar);

    b getBoxSizing();

    YogaValue getFlexBasis();

    h getFlexDirection();

    float getFlexGrow();

    float getFlexShrink();

    YogaValue getHeight();

    i getJustifyContent();

    YogaValue getMargin(g gVar);

    YogaValue getMaxHeight();

    YogaValue getMaxWidth();

    YogaValue getMinHeight();

    YogaValue getMinWidth();

    YogaValue getPadding(g gVar);

    YogaValue getPosition(g gVar);

    n getPositionType();

    e getStyleDirection();

    YogaValue getWidth();

    void setAlignContent(a aVar);

    void setAlignItems(a aVar);

    void setAlignSelf(a aVar);

    void setAspectRatio(float f10);

    void setBaselineFunction(YogaBaselineFunction yogaBaselineFunction);

    void setBorder(g gVar, float f10);

    void setBoxSizing(b bVar);

    void setDirection(e eVar);

    void setFlex(float f10);

    void setFlexBasis(float f10);

    void setFlexBasisAuto();

    void setFlexBasisFitContent();

    void setFlexBasisMaxContent();

    void setFlexBasisPercent(float f10);

    void setFlexBasisStretch();

    void setFlexDirection(h hVar);

    void setFlexGrow(float f10);

    void setFlexShrink(float f10);

    void setHeight(float f10);

    void setHeightAuto();

    void setHeightFitContent();

    void setHeightMaxContent();

    void setHeightPercent(float f10);

    void setHeightStretch();

    void setIsReferenceBaseline(boolean z3);

    void setJustifyContent(i iVar);

    void setMargin(g gVar, float f10);

    void setMarginAuto(g gVar);

    void setMarginPercent(g gVar, float f10);

    void setMaxHeight(float f10);

    void setMaxHeightFitContent();

    void setMaxHeightMaxContent();

    void setMaxHeightPercent(float f10);

    void setMaxHeightStretch();

    void setMaxWidth(float f10);

    void setMaxWidthFitContent();

    void setMaxWidthMaxContent();

    void setMaxWidthPercent(float f10);

    void setMaxWidthStretch();

    void setMeasureFunction(YogaMeasureFunction yogaMeasureFunction);

    void setMinHeight(float f10);

    void setMinHeightFitContent();

    void setMinHeightMaxContent();

    void setMinHeightPercent(float f10);

    void setMinHeightStretch();

    void setMinWidth(float f10);

    void setMinWidthFitContent();

    void setMinWidthMaxContent();

    void setMinWidthPercent(float f10);

    void setMinWidthStretch();

    void setPadding(g gVar, float f10);

    void setPaddingPercent(g gVar, float f10);

    void setPosition(g gVar, float f10);

    void setPositionPercent(g gVar, float f10);

    void setPositionType(n nVar);

    void setWidth(float f10);

    void setWidthAuto();

    void setWidthFitContent();

    void setWidthMaxContent();

    void setWidthPercent(float f10);

    void setWidthStretch();

    void setWrap(p pVar);
}
