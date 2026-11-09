package com.facebook.react.uimanager;

import H3.e;
import H3.f;
import H3.g;
import H3.h;
import H3.i;
import H3.k;
import H3.l;
import H3.m;
import H3.n;
import H3.p;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.F;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogLevel;
import com.facebook.react.common.annotations.internal.LegacyArchitectureLogger;
import com.facebook.react.uimanager.annotations.ReactPropertyHolder;
import com.facebook.yoga.YogaBaselineFunction;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNode$Inputs;
import com.facebook.yoga.YogaNodeJNIBase;
import com.facebook.yoga.YogaValue;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@ReactPropertyHolder
public class ReactShadowNodeImpl implements ReactShadowNode<ReactShadowNodeImpl> {
    private static final H3.c sYogaConfig = ReactYogaConfigProvider.INSTANCE.getYogaConfig();

    @Nullable
    private ArrayList<ReactShadowNodeImpl> mChildren;
    private Integer mHeightMeasureSpec;
    private boolean mIsLayoutOnly;

    @Nullable
    private ReactShadowNodeImpl mLayoutParent;

    @Nullable
    private ArrayList<ReactShadowNodeImpl> mNativeChildren;

    @Nullable
    private ReactShadowNodeImpl mNativeParent;
    private final float[] mPadding;

    @Nullable
    private ReactShadowNodeImpl mParent;
    private int mReactTag;
    private int mRootTag;
    private int mScreenHeight;
    private int mScreenWidth;
    private int mScreenX;
    private int mScreenY;
    private boolean mShouldNotifyOnLayout;

    @Nullable
    private ThemedReactContext mThemedContext;

    @Nullable
    private String mViewClassName;
    private Integer mWidthMeasureSpec;
    private k mYogaNode;
    private boolean mNodeUpdated = true;
    private int mTotalNativeChildren = 0;
    private final boolean[] mPaddingIsPercent = new boolean[9];
    private final Spacing mDefaultPadding = new Spacing(0.0f);

    static {
        LegacyArchitectureLogger.assertLegacyArchitecture("ReactShadowNodeImpl", LegacyArchitectureLogLevel.ERROR);
    }

    public ReactShadowNodeImpl() {
        float[] fArr = new float[9];
        this.mPadding = fArr;
        if (isVirtual()) {
            this.mYogaNode = null;
            return;
        }
        k kVarAcquire = YogaNodePool.get().acquire();
        if (kVarAcquire == null) {
            H3.c cVar = sYogaConfig;
            l lVar = new l(YogaNative.jni_YGNodeNewWithConfigJNI(((H3.d) cVar).f3623a));
            lVar.f21914b = cVar;
            kVarAcquire = lVar;
        }
        this.mYogaNode = kVarAcquire;
        ((YogaNodeJNIBase) kVarAcquire).f21919g = this;
        Arrays.fill(fArr, Float.NaN);
    }

    private void getHierarchyInfoWithIndentation(StringBuilder sb2, int i7) {
        for (int i10 = 0; i10 < i7; i10++) {
            sb2.append("  ");
        }
        sb2.append("<");
        sb2.append(getClass().getSimpleName());
        sb2.append(" view='");
        sb2.append(getViewClass());
        sb2.append("' tag=");
        sb2.append(getReactTag());
        if (this.mYogaNode != null) {
            sb2.append(" layout='x:");
            sb2.append(getScreenX());
            sb2.append(" y:");
            sb2.append(getScreenY());
            sb2.append(" w:");
            sb2.append(getLayoutWidth());
            sb2.append(" h:");
            sb2.append(getLayoutHeight());
            sb2.append("'");
        } else {
            sb2.append("(virtual node)");
        }
        sb2.append(">\n");
        if (getChildCount() == 0) {
            return;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            getChildAt(i11).getHierarchyInfoWithIndentation(sb2, i7 + 1);
        }
    }

    private int getTotalNativeNodeContributionToParent() {
        NativeKind nativeKind = getNativeKind();
        if (nativeKind == NativeKind.NONE) {
            return this.mTotalNativeChildren;
        }
        if (nativeKind == NativeKind.LEAF) {
            return this.mTotalNativeChildren + 1;
        }
        return 1;
    }

    private void updateNativeChildrenCountInParent(int i7) {
        if (getNativeKind() != NativeKind.PARENT) {
            for (ReactShadowNodeImpl parent = getParent(); parent != null; parent = parent.getParent()) {
                parent.mTotalNativeChildren += i7;
                if (parent.getNativeKind() == NativeKind.PARENT) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    private void updatePadding() {
        for (int i7 = 0; i7 <= 8; i7++) {
            if (i7 == 0 || i7 == 2 || i7 == 4 || i7 == 5) {
                if (com.palmpay.lib.apm.launchcounter.util.d.C(this.mPadding[i7]) && com.palmpay.lib.apm.launchcounter.util.d.C(this.mPadding[6]) && com.palmpay.lib.apm.launchcounter.util.d.C(this.mPadding[8])) {
                    this.mYogaNode.setPadding(g.a(i7), this.mDefaultPadding.getRaw(i7));
                } else if (this.mPaddingIsPercent[i7]) {
                    this.mYogaNode.setPaddingPercent(g.a(i7), this.mPadding[i7]);
                } else {
                    this.mYogaNode.setPadding(g.a(i7), this.mPadding[i7]);
                }
            } else if (i7 == 1 || i7 == 3) {
                if (com.palmpay.lib.apm.launchcounter.util.d.C(this.mPadding[i7]) && com.palmpay.lib.apm.launchcounter.util.d.C(this.mPadding[7]) && com.palmpay.lib.apm.launchcounter.util.d.C(this.mPadding[8])) {
                    this.mYogaNode.setPadding(g.a(i7), this.mDefaultPadding.getRaw(i7));
                } else if (this.mPaddingIsPercent[i7]) {
                    this.mYogaNode.setPaddingPercent(g.a(i7), this.mPadding[i7]);
                } else {
                    this.mYogaNode.setPadding(g.a(i7), this.mPadding[i7]);
                }
            } else if (com.palmpay.lib.apm.launchcounter.util.d.C(this.mPadding[i7])) {
                this.mYogaNode.setPadding(g.a(i7), this.mDefaultPadding.getRaw(i7));
            } else if (this.mPaddingIsPercent[i7]) {
                this.mYogaNode.setPaddingPercent(g.a(i7), this.mPadding[i7]);
            } else {
                this.mYogaNode.setPadding(g.a(i7), this.mPadding[i7]);
            }
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void calculateLayout() {
        calculateLayout(Float.NaN, Float.NaN);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    @Nullable
    public Iterable<? extends ReactShadowNode> calculateLayoutOnChildren() {
        if (isVirtualAnchor()) {
            return null;
        }
        return this.mChildren;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void dirty() {
        if (!isVirtual()) {
            YogaNative.jni_YGNodeMarkDirtyJNI(((YogaNodeJNIBase) this.mYogaNode).f21918f);
        } else if (getParent() != null) {
            getParent().dirty();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void dispatchUpdates(float f10, float f11, UIViewOperationQueue uIViewOperationQueue, @Nullable NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        if (this.mNodeUpdated) {
            onCollectExtraUpdates(uIViewOperationQueue);
        }
        if (hasNewLayout()) {
            float layoutX = getLayoutX();
            float layoutY = getLayoutY();
            float f12 = f10 + layoutX;
            int iRound = Math.round(f12);
            float f13 = f11 + layoutY;
            int iRound2 = Math.round(f13);
            int iRound3 = Math.round(getLayoutWidth() + f12);
            int iRound4 = Math.round(getLayoutHeight() + f13);
            int iRound5 = Math.round(layoutX);
            int iRound6 = Math.round(layoutY);
            int i7 = iRound3 - iRound;
            int i10 = iRound4 - iRound2;
            boolean z3 = (iRound5 == this.mScreenX && iRound6 == this.mScreenY && i7 == this.mScreenWidth && i10 == this.mScreenHeight) ? false : true;
            this.mScreenX = iRound5;
            this.mScreenY = iRound6;
            this.mScreenWidth = i7;
            this.mScreenHeight = i10;
            if (z3) {
                if (nativeViewHierarchyOptimizer != null) {
                    nativeViewHierarchyOptimizer.handleUpdateLayout(this);
                } else {
                    uIViewOperationQueue.enqueueUpdateLayout(getParent().getReactTag(), getReactTag(), getScreenX(), getScreenY(), getScreenWidth(), getScreenHeight(), getLayoutDirection());
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean dispatchUpdatesWillChangeLayout(float f10, float f11) {
        if (!hasNewLayout()) {
            return false;
        }
        float layoutX = getLayoutX();
        float layoutY = getLayoutY();
        float f12 = f10 + layoutX;
        int iRound = Math.round(f12);
        float f13 = f11 + layoutY;
        int iRound2 = Math.round(f13);
        return (Math.round(layoutX) == this.mScreenX && Math.round(layoutY) == this.mScreenY && Math.round(getLayoutWidth() + f12) - iRound == this.mScreenWidth && Math.round(getLayoutHeight() + f13) - iRound2 == this.mScreenHeight) ? false : true;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void dispose() {
        k kVar = this.mYogaNode;
        if (kVar != null) {
            kVar.j();
            YogaNodePool.get().release(this.mYogaNode);
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getChildCount() {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public float getFlex() {
        return YogaNative.jni_YGNodeStyleGetFlexJNI(((YogaNodeJNIBase) this.mYogaNode).f21918f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public Integer getHeightMeasureSpec() {
        return this.mHeightMeasureSpec;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public String getHierarchyInfo() {
        StringBuilder sb2 = new StringBuilder();
        getHierarchyInfoWithIndentation(sb2, 0);
        return sb2.toString();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final e getLayoutDirection() {
        return this.mYogaNode.a();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutHeight() {
        return this.mYogaNode.b();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutWidth() {
        return this.mYogaNode.d();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutX() {
        return this.mYogaNode.e();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getLayoutY() {
        return this.mYogaNode.f();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getNativeChildCount() {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mNativeChildren;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public NativeKind getNativeKind() {
        if (isVirtual() || isLayoutOnly()) {
            return NativeKind.NONE;
        }
        return hoistNativeChildren() ? NativeKind.LEAF : NativeKind.PARENT;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final float getPadding(int i7) {
        return this.mYogaNode.c(g.a(i7));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getReactTag() {
        return this.mReactTag;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getRootTag() {
        p059e1.a.d(this.mRootTag != 0);
        return this.mRootTag;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenHeight() {
        return this.mScreenHeight;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenWidth() {
        return this.mScreenWidth;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenX() {
        return this.mScreenX;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public int getScreenY() {
        return this.mScreenY;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final YogaValue getStyleHeight() {
        return this.mYogaNode.getHeight();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final YogaValue getStylePadding(int i7) {
        return this.mYogaNode.getPadding(g.a(i7));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final YogaValue getStyleWidth() {
        return this.mYogaNode.getWidth();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ThemedReactContext getThemedContext() {
        ThemedReactContext themedReactContext = this.mThemedContext;
        p059e1.a.f(themedReactContext);
        return themedReactContext;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getTotalNativeChildren() {
        return this.mTotalNativeChildren;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final String getViewClass() {
        String str = this.mViewClassName;
        p059e1.a.f(str);
        return str;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public Integer getWidthMeasureSpec() {
        return this.mWidthMeasureSpec;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean hasNewLayout() {
        k kVar = this.mYogaNode;
        return kVar != null && kVar.g();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean hasUnseenUpdates() {
        return this.mNodeUpdated;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean hasUpdates() {
        return this.mNodeUpdated || hasNewLayout() || isDirty();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean hoistNativeChildren() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean isDirty() {
        k kVar = this.mYogaNode;
        return kVar != null && YogaNative.jni_YGNodeIsDirtyJNI(((YogaNodeJNIBase) kVar).f21918f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean isLayoutOnly() {
        return this.mIsLayoutOnly;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isMeasureDefined() {
        return ((YogaNodeJNIBase) this.mYogaNode).f21916d != null;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtual() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtualAnchor() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isYogaLeafNode() {
        return isMeasureDefined();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void markLayoutSeen() {
        k kVar = this.mYogaNode;
        if (kVar != null) {
            kVar.h();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void markUpdateSeen() {
        this.mNodeUpdated = false;
        if (hasNewLayout()) {
            markLayoutSeen();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void markUpdated() {
        if (this.mNodeUpdated) {
            return;
        }
        this.mNodeUpdated = true;
        ReactShadowNodeImpl parent = getParent();
        if (parent != null) {
            parent.markUpdated();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void onAfterUpdateTransaction() {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void onBeforeLayout(NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void removeAllNativeChildren() {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mNativeChildren;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.mNativeChildren.get(size).mNativeParent = null;
            }
            this.mNativeChildren.clear();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void removeAndDisposeAllChildren() {
        if (getChildCount() == 0) {
            return;
        }
        int totalNativeNodeContributionToParent = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (this.mYogaNode != null && !isYogaLeafNode()) {
                this.mYogaNode.i(childCount);
            }
            ReactShadowNodeImpl childAt = getChildAt(childCount);
            childAt.mParent = null;
            totalNativeNodeContributionToParent += childAt.getTotalNativeNodeContributionToParent();
            childAt.dispose();
        }
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        p059e1.a.f(arrayList);
        arrayList.clear();
        markUpdated();
        this.mTotalNativeChildren -= totalNativeNodeContributionToParent;
        updateNativeChildrenCountInParent(-totalNativeNodeContributionToParent);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setAlignContent(H3.a aVar) {
        this.mYogaNode.setAlignContent(aVar);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setAlignItems(H3.a aVar) {
        this.mYogaNode.setAlignItems(aVar);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setAlignSelf(H3.a aVar) {
        this.mYogaNode.setAlignSelf(aVar);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setBaselineFunction(YogaBaselineFunction yogaBaselineFunction) {
        this.mYogaNode.setBaselineFunction(yogaBaselineFunction);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setBorder(int i7, float f10) {
        this.mYogaNode.setBorder(g.a(i7), f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setColumnGap(float f10) {
        YogaNative.jni_YGNodeStyleSetGapJNI(((YogaNodeJNIBase) this.mYogaNode).f21918f, 0, f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setColumnGapPercent(float f10) {
        YogaNative.jni_YGNodeStyleSetGapPercentJNI(((YogaNodeJNIBase) this.mYogaNode).f21918f, 0, f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setDefaultPadding(int i7, float f10) {
        this.mDefaultPadding.set(i7, f10);
        updatePadding();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setDisplay(f fVar) {
        YogaNative.jni_YGNodeStyleSetDisplayJNI(((YogaNodeJNIBase) this.mYogaNode).f21918f, fVar.f3632a);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlex(float f10) {
        this.mYogaNode.setFlex(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexBasis(float f10) {
        this.mYogaNode.setFlexBasis(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexBasisAuto() {
        this.mYogaNode.setFlexBasisAuto();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexBasisPercent(float f10) {
        this.mYogaNode.setFlexBasisPercent(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexDirection(h hVar) {
        this.mYogaNode.setFlexDirection(hVar);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexGrow(float f10) {
        this.mYogaNode.setFlexGrow(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexShrink(float f10) {
        this.mYogaNode.setFlexShrink(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setFlexWrap(p pVar) {
        this.mYogaNode.setWrap(pVar);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setGap(float f10) {
        YogaNative.jni_YGNodeStyleSetGapJNI(((YogaNodeJNIBase) this.mYogaNode).f21918f, 2, f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setGapPercent(float f10) {
        YogaNative.jni_YGNodeStyleSetGapJNI(((YogaNodeJNIBase) this.mYogaNode).f21918f, 2, f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void setIsLayoutOnly(boolean z3) {
        p059e1.a.e(getParent() == null, "Must remove from no opt parent first");
        p059e1.a.e(this.mNativeParent == null, "Must remove from native parent first");
        p059e1.a.e(getNativeChildCount() == 0, "Must remove all native children first");
        this.mIsLayoutOnly = z3;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setJustifyContent(i iVar) {
        this.mYogaNode.setJustifyContent(iVar);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setLayoutDirection(e eVar) {
        this.mYogaNode.setDirection(eVar);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setLocalData(Object obj) {
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMargin(int i7, float f10) {
        this.mYogaNode.setMargin(g.a(i7), f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMarginAuto(int i7) {
        this.mYogaNode.setMarginAuto(g.a(i7));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMarginPercent(int i7, float f10) {
        this.mYogaNode.setMarginPercent(g.a(i7), f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMeasureFunction(YogaMeasureFunction yogaMeasureFunction) {
        this.mYogaNode.setMeasureFunction(yogaMeasureFunction);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setMeasureSpecs(int i7, int i10) {
        this.mWidthMeasureSpec = Integer.valueOf(i7);
        this.mHeightMeasureSpec = Integer.valueOf(i10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setOverflow(m mVar) {
        YogaNative.jni_YGNodeStyleSetOverflowJNI(((YogaNodeJNIBase) this.mYogaNode).f21918f, mVar.f3666a);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPadding(int i7, float f10) {
        this.mPadding[i7] = f10;
        this.mPaddingIsPercent[i7] = false;
        updatePadding();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPaddingPercent(int i7, float f10) {
        this.mPadding[i7] = f10;
        this.mPaddingIsPercent[i7] = !com.palmpay.lib.apm.launchcounter.util.d.C(f10);
        updatePadding();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPosition(int i7, float f10) {
        this.mYogaNode.setPosition(g.a(i7), f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPositionPercent(int i7, float f10) {
        this.mYogaNode.setPositionPercent(g.a(i7), f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setPositionType(n nVar) {
        this.mYogaNode.setPositionType(nVar);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setReactTag(int i7) {
        this.mReactTag = i7;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void setRootTag(int i7) {
        this.mRootTag = i7;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setRowGap(float f10) {
        YogaNative.jni_YGNodeStyleSetGapJNI(((YogaNodeJNIBase) this.mYogaNode).f21918f, 1, f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setRowGapPercent(float f10) {
        YogaNative.jni_YGNodeStyleSetGapPercentJNI(((YogaNodeJNIBase) this.mYogaNode).f21918f, 1, f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setShouldNotifyOnLayout(boolean z3) {
        this.mShouldNotifyOnLayout = z3;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleAspectRatio(float f10) {
        this.mYogaNode.setAspectRatio(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleHeight(float f10) {
        this.mYogaNode.setHeight(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleHeightAuto() {
        this.mYogaNode.setHeightAuto();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleHeightPercent(float f10) {
        this.mYogaNode.setHeightPercent(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxHeight(float f10) {
        this.mYogaNode.setMaxHeight(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxHeightPercent(float f10) {
        this.mYogaNode.setMaxHeightPercent(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxWidth(float f10) {
        this.mYogaNode.setMaxWidth(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMaxWidthPercent(float f10) {
        this.mYogaNode.setMaxWidthPercent(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinHeight(float f10) {
        this.mYogaNode.setMinHeight(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinHeightPercent(float f10) {
        this.mYogaNode.setMinHeightPercent(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinWidth(float f10) {
        this.mYogaNode.setMinWidth(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleMinWidthPercent(float f10) {
        this.mYogaNode.setMinWidthPercent(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleWidth(float f10) {
        this.mYogaNode.setWidth(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleWidthAuto() {
        this.mYogaNode.setWidthAuto();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setStyleWidthPercent(float f10) {
        this.mYogaNode.setWidthPercent(f10);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void setThemedContext(ThemedReactContext themedReactContext) {
        this.mThemedContext = themedReactContext;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void setViewClassName(String str) {
        this.mViewClassName = str;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final boolean shouldNotifyOnLayout() {
        return this.mShouldNotifyOnLayout;
    }

    public String toString() {
        return "[" + this.mViewClassName + " " + getReactTag() + "]";
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void updateProperties(ReactStylesDiffMap reactStylesDiffMap) {
        ViewManagerPropertyUpdater.updateProps(this, reactStylesDiffMap);
        onAfterUpdateTransaction();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void addChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i7) {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList<>(4);
        }
        this.mChildren.add(i7, reactShadowNodeImpl);
        reactShadowNodeImpl.mParent = this;
        if (this.mYogaNode != null && !isYogaLeafNode()) {
            k kVar = reactShadowNodeImpl.mYogaNode;
            if (kVar == null) {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + reactShadowNodeImpl.toString() + "' to a '" + toString() + "')");
            }
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) this.mYogaNode;
            yogaNodeJNIBase.getClass();
            if (kVar instanceof YogaNodeJNIBase) {
                YogaNodeJNIBase yogaNodeJNIBase2 = (YogaNodeJNIBase) kVar;
                if (yogaNodeJNIBase2.f21913a != null) {
                    throw new IllegalStateException("Child already has a parent, it must be removed first.");
                }
                if (yogaNodeJNIBase.f21915c == null) {
                    yogaNodeJNIBase.f21915c = new ArrayList(4);
                }
                yogaNodeJNIBase.f21915c.add(i7, yogaNodeJNIBase2);
                yogaNodeJNIBase2.f21913a = yogaNodeJNIBase;
                YogaNative.jni_YGNodeInsertChildJNI(yogaNodeJNIBase.f21918f, yogaNodeJNIBase2.f21918f, i7);
            }
        }
        markUpdated();
        int totalNativeNodeContributionToParent = reactShadowNodeImpl.getTotalNativeNodeContributionToParent();
        this.mTotalNativeChildren += totalNativeNodeContributionToParent;
        updateNativeChildrenCountInParent(totalNativeNodeContributionToParent);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void addNativeChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i7) {
        p059e1.a.d(getNativeKind() == NativeKind.PARENT);
        p059e1.a.d(reactShadowNodeImpl.getNativeKind() != NativeKind.NONE);
        if (this.mNativeChildren == null) {
            this.mNativeChildren = new ArrayList<>(4);
        }
        this.mNativeChildren.add(i7, reactShadowNodeImpl);
        reactShadowNodeImpl.mNativeParent = this;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public void calculateLayout(float f10, float f11) {
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) this.mYogaNode;
        ReactShadowNode reactShadowNode = yogaNodeJNIBase.f21919g;
        if (reactShadowNode instanceof YogaNode$Inputs) {
            ((YogaNode$Inputs) reactShadowNode).freeze(yogaNodeJNIBase, null);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(yogaNodeJNIBase);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            YogaNodeJNIBase yogaNodeJNIBase2 = (YogaNodeJNIBase) arrayList.get(i7);
            ArrayList<YogaNodeJNIBase> arrayList2 = yogaNodeJNIBase2.f21915c;
            if (arrayList2 != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase3 : arrayList2) {
                    ReactShadowNode reactShadowNode2 = yogaNodeJNIBase3.f21919g;
                    if (reactShadowNode2 instanceof YogaNode$Inputs) {
                        ((YogaNode$Inputs) reactShadowNode2).freeze(yogaNodeJNIBase3, yogaNodeJNIBase2);
                    }
                    arrayList.add(yogaNodeJNIBase3);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i10 = 0; i10 < yogaNodeJNIBaseArr.length; i10++) {
            jArr[i10] = yogaNodeJNIBaseArr[i10].f21918f;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(yogaNodeJNIBase.f21918f, f10, f11, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ReactShadowNodeImpl getChildAt(int i7) {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList != null) {
            return arrayList.get(i7);
        }
        throw new ArrayIndexOutOfBoundsException(F.c(i7, "Index ", " out of bounds: node has no children"));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    @Nullable
    public final ReactShadowNodeImpl getLayoutParent() {
        ReactShadowNodeImpl reactShadowNodeImpl = this.mLayoutParent;
        return reactShadowNodeImpl != null ? reactShadowNodeImpl : getNativeParent();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int getNativeOffsetForChild(ReactShadowNodeImpl reactShadowNodeImpl) {
        int totalNativeNodeContributionToParent = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            ReactShadowNodeImpl childAt = getChildAt(i7);
            if (reactShadowNodeImpl == childAt) {
                return totalNativeNodeContributionToParent;
            }
            totalNativeNodeContributionToParent += childAt.getTotalNativeNodeContributionToParent();
        }
        throw new RuntimeException("Child " + reactShadowNodeImpl.getReactTag() + " was not a child of " + this.mReactTag);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    @Nullable
    public final ReactShadowNodeImpl getNativeParent() {
        return this.mNativeParent;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    @Nullable
    public final ReactShadowNodeImpl getParent() {
        return this.mParent;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int indexOf(ReactShadowNodeImpl reactShadowNodeImpl) {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.indexOf(reactShadowNodeImpl);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final int indexOfNativeChild(ReactShadowNodeImpl reactShadowNodeImpl) {
        p059e1.a.f(this.mNativeChildren);
        return this.mNativeChildren.indexOf(reactShadowNodeImpl);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public boolean isDescendantOf(ReactShadowNodeImpl reactShadowNodeImpl) {
        for (ReactShadowNodeImpl parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == reactShadowNodeImpl) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public ReactShadowNodeImpl removeChildAt(int i7) {
        ArrayList<ReactShadowNodeImpl> arrayList = this.mChildren;
        if (arrayList == null) {
            throw new ArrayIndexOutOfBoundsException(F.c(i7, "Index ", " out of bounds: node has no children"));
        }
        ReactShadowNodeImpl reactShadowNodeImplRemove = arrayList.remove(i7);
        reactShadowNodeImplRemove.mParent = null;
        if (this.mYogaNode != null && !isYogaLeafNode()) {
            this.mYogaNode.i(i7);
        }
        markUpdated();
        int totalNativeNodeContributionToParent = reactShadowNodeImplRemove.getTotalNativeNodeContributionToParent();
        this.mTotalNativeChildren -= totalNativeNodeContributionToParent;
        updateNativeChildrenCountInParent(-totalNativeNodeContributionToParent);
        return reactShadowNodeImplRemove;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final ReactShadowNodeImpl removeNativeChildAt(int i7) {
        p059e1.a.f(this.mNativeChildren);
        ReactShadowNodeImpl reactShadowNodeImplRemove = this.mNativeChildren.remove(i7);
        reactShadowNodeImplRemove.mNativeParent = null;
        return reactShadowNodeImplRemove;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNode
    public final void setLayoutParent(@Nullable ReactShadowNodeImpl reactShadowNodeImpl) {
        this.mLayoutParent = reactShadowNodeImpl;
    }
}
