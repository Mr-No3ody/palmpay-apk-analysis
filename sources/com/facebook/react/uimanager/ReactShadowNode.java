package com.facebook.react.uimanager;

import H3.e;
import H3.f;
import H3.h;
import H3.i;
import H3.m;
import H3.n;
import H3.p;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.yoga.YogaBaselineFunction;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaValue;

/* JADX INFO: loaded from: classes.dex */
public interface ReactShadowNode<T extends ReactShadowNode> {
    void addChildAt(T t, int i7);

    void addNativeChildAt(T t, int i7);

    void calculateLayout();

    void calculateLayout(float f10, float f11);

    @Nullable
    Iterable<? extends ReactShadowNode> calculateLayoutOnChildren();

    void dirty();

    void dispatchUpdates(float f10, float f11, UIViewOperationQueue uIViewOperationQueue, NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer);

    boolean dispatchUpdatesWillChangeLayout(float f10, float f11);

    void dispose();

    T getChildAt(int i7);

    int getChildCount();

    float getFlex();

    Integer getHeightMeasureSpec();

    String getHierarchyInfo();

    e getLayoutDirection();

    float getLayoutHeight();

    @Nullable
    T getLayoutParent();

    float getLayoutWidth();

    float getLayoutX();

    float getLayoutY();

    int getNativeChildCount();

    NativeKind getNativeKind();

    int getNativeOffsetForChild(T t);

    @Nullable
    T getNativeParent();

    float getPadding(int i7);

    @Nullable
    T getParent();

    int getReactTag();

    int getRootTag();

    int getScreenHeight();

    int getScreenWidth();

    int getScreenX();

    int getScreenY();

    YogaValue getStyleHeight();

    YogaValue getStylePadding(int i7);

    YogaValue getStyleWidth();

    ThemedReactContext getThemedContext();

    int getTotalNativeChildren();

    String getViewClass();

    Integer getWidthMeasureSpec();

    boolean hasNewLayout();

    boolean hasUnseenUpdates();

    boolean hasUpdates();

    boolean hoistNativeChildren();

    int indexOf(T t);

    int indexOfNativeChild(T t);

    boolean isDescendantOf(T t);

    boolean isDirty();

    boolean isLayoutOnly();

    boolean isMeasureDefined();

    boolean isVirtual();

    boolean isVirtualAnchor();

    boolean isYogaLeafNode();

    void markLayoutSeen();

    void markUpdateSeen();

    void markUpdated();

    void onAfterUpdateTransaction();

    void onBeforeLayout(NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer);

    void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue);

    void removeAllNativeChildren();

    void removeAndDisposeAllChildren();

    T removeChildAt(int i7);

    T removeNativeChildAt(int i7);

    void setAlignContent(H3.a aVar);

    void setAlignItems(H3.a aVar);

    void setAlignSelf(H3.a aVar);

    void setBaselineFunction(YogaBaselineFunction yogaBaselineFunction);

    void setBorder(int i7, float f10);

    void setColumnGap(float f10);

    void setColumnGapPercent(float f10);

    void setDefaultPadding(int i7, float f10);

    void setDisplay(f fVar);

    void setFlex(float f10);

    void setFlexBasis(float f10);

    void setFlexBasisAuto();

    void setFlexBasisPercent(float f10);

    void setFlexDirection(h hVar);

    void setFlexGrow(float f10);

    void setFlexShrink(float f10);

    void setFlexWrap(p pVar);

    void setGap(float f10);

    void setGapPercent(float f10);

    void setIsLayoutOnly(boolean z3);

    void setJustifyContent(i iVar);

    void setLayoutDirection(e eVar);

    void setLayoutParent(@Nullable T t);

    void setLocalData(Object obj);

    void setMargin(int i7, float f10);

    void setMarginAuto(int i7);

    void setMarginPercent(int i7, float f10);

    void setMeasureFunction(YogaMeasureFunction yogaMeasureFunction);

    void setMeasureSpecs(int i7, int i10);

    void setOverflow(m mVar);

    void setPadding(int i7, float f10);

    void setPaddingPercent(int i7, float f10);

    void setPosition(int i7, float f10);

    void setPositionPercent(int i7, float f10);

    void setPositionType(n nVar);

    void setReactTag(int i7);

    void setRootTag(int i7);

    void setRowGap(float f10);

    void setRowGapPercent(float f10);

    void setShouldNotifyOnLayout(boolean z3);

    void setStyleAspectRatio(float f10);

    void setStyleHeight(float f10);

    void setStyleHeightAuto();

    void setStyleHeightPercent(float f10);

    void setStyleMaxHeight(float f10);

    void setStyleMaxHeightPercent(float f10);

    void setStyleMaxWidth(float f10);

    void setStyleMaxWidthPercent(float f10);

    void setStyleMinHeight(float f10);

    void setStyleMinHeightPercent(float f10);

    void setStyleMinWidth(float f10);

    void setStyleMinWidthPercent(float f10);

    void setStyleWidth(float f10);

    void setStyleWidthAuto();

    void setStyleWidthPercent(float f10);

    void setThemedContext(ThemedReactContext themedReactContext);

    void setViewClassName(String str);

    boolean shouldNotifyOnLayout();

    void updateProperties(ReactStylesDiffMap reactStylesDiffMap);
}
