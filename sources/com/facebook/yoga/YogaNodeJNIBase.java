package com.facebook.yoga;

import C0.G;
import H3.a;
import H3.b;
import H3.c;
import H3.e;
import H3.g;
import H3.h;
import H3.i;
import H3.j;
import H3.k;
import H3.n;
import H3.o;
import H3.p;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.yoga.annotations.DoNotStrip;
import java.util.ArrayList;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
public abstract class YogaNodeJNIBase extends k implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public YogaNodeJNIBase f21913a;

    @DoNotStrip
    @Nullable
    private float[] arr;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f21914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f21915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public YogaMeasureFunction f21916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public YogaBaselineFunction f21917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f21918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ReactShadowNodeImpl f21919g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21920i;

    @DoNotStrip
    private int mLayoutDirection;

    public YogaNodeJNIBase(long j6) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f21920i = true;
        if (j6 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.f21918f = j6;
    }

    public static YogaValue k(long j6) {
        o oVar;
        float fIntBitsToFloat = Float.intBitsToFloat((int) j6);
        int i7 = (int) (j6 >> 32);
        switch (i7) {
            case 0:
                oVar = o.UNDEFINED;
                break;
            case 1:
                oVar = o.POINT;
                break;
            case 2:
                oVar = o.PERCENT;
                break;
            case 3:
                oVar = o.AUTO;
                break;
            case 4:
                oVar = o.MAX_CONTENT;
                break;
            case 5:
                oVar = o.FIT_CONTENT;
                break;
            case 6:
                oVar = o.STRETCH;
                break;
            default:
                throw new IllegalArgumentException(G.m(i7, "Unknown enum value: "));
        }
        return new YogaValue(fIntBitsToFloat, oVar);
    }

    @DoNotStrip
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i7) {
        ArrayList arrayList = this.f21915c;
        if (arrayList == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        arrayList.remove(i7);
        this.f21915c.add(i7, yogaNodeJNIBase);
        yogaNodeJNIBase.f21913a = this;
        return yogaNodeJNIBase.f21918f;
    }

    @Override // H3.k
    public final e a() {
        float[] fArr = this.arr;
        return e.a(fArr != null ? (int) fArr[5] : this.mLayoutDirection);
    }

    @Override // H3.k
    public final float b() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @DoNotStrip
    public final float baseline(float f10, float f11) {
        return this.f21917e.baseline(this, f10, f11);
    }

    @Override // H3.k
    public final float c(g gVar) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        int i7 = (int) fArr[0];
        if ((i7 & 2) != 2) {
            return 0.0f;
        }
        int i10 = (i7 & 1) != 1 ? 4 : 0;
        int i11 = 10 - i10;
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            return this.arr[i11];
        }
        if (iOrdinal == 1) {
            return this.arr[11 - i10];
        }
        if (iOrdinal == 2) {
            return this.arr[12 - i10];
        }
        if (iOrdinal == 3) {
            return this.arr[13 - i10];
        }
        e eVar = e.RTL;
        if (iOrdinal == 4) {
            return a() == eVar ? this.arr[12 - i10] : this.arr[i11];
        }
        if (iOrdinal == 5) {
            return a() == eVar ? this.arr[i11] : this.arr[12 - i10];
        }
        throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
    }

    @Override // H3.k
    public final float d() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // H3.k
    public final float e() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // H3.k
    public final float f() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // H3.k
    public final boolean g() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return (((int) fArr[0]) & 16) == 16;
        }
        return this.f21920i;
    }

    @Override // com.facebook.yoga.YogaProps
    public final a getAlignContent() {
        return a.a(YogaNative.jni_YGNodeStyleGetAlignContentJNI(this.f21918f));
    }

    @Override // com.facebook.yoga.YogaProps
    public final a getAlignItems() {
        return a.a(YogaNative.jni_YGNodeStyleGetAlignItemsJNI(this.f21918f));
    }

    @Override // com.facebook.yoga.YogaProps
    public final a getAlignSelf() {
        return a.a(YogaNative.jni_YGNodeStyleGetAlignSelfJNI(this.f21918f));
    }

    @Override // com.facebook.yoga.YogaProps
    public final float getAspectRatio() {
        return YogaNative.jni_YGNodeStyleGetAspectRatioJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final float getBorder(g gVar) {
        return YogaNative.jni_YGNodeStyleGetBorderJNI(this.f21918f, gVar.f3643a);
    }

    @Override // com.facebook.yoga.YogaProps
    public final b getBoxSizing() {
        int iJni_YGNodeStyleGetBoxSizingJNI = YogaNative.jni_YGNodeStyleGetBoxSizingJNI(this.f21918f);
        if (iJni_YGNodeStyleGetBoxSizingJNI == 0) {
            return b.BORDER_BOX;
        }
        if (iJni_YGNodeStyleGetBoxSizingJNI == 1) {
            return b.CONTENT_BOX;
        }
        throw new IllegalArgumentException(G.m(iJni_YGNodeStyleGetBoxSizingJNI, "Unknown enum value: "));
    }

    @Override // com.facebook.yoga.YogaProps
    public final YogaValue getFlexBasis() {
        return k(YogaNative.jni_YGNodeStyleGetFlexBasisJNI(this.f21918f));
    }

    @Override // com.facebook.yoga.YogaProps
    public final h getFlexDirection() {
        int iJni_YGNodeStyleGetFlexDirectionJNI = YogaNative.jni_YGNodeStyleGetFlexDirectionJNI(this.f21918f);
        if (iJni_YGNodeStyleGetFlexDirectionJNI == 0) {
            return h.COLUMN;
        }
        if (iJni_YGNodeStyleGetFlexDirectionJNI == 1) {
            return h.COLUMN_REVERSE;
        }
        if (iJni_YGNodeStyleGetFlexDirectionJNI == 2) {
            return h.ROW;
        }
        if (iJni_YGNodeStyleGetFlexDirectionJNI == 3) {
            return h.ROW_REVERSE;
        }
        throw new IllegalArgumentException(G.m(iJni_YGNodeStyleGetFlexDirectionJNI, "Unknown enum value: "));
    }

    @Override // com.facebook.yoga.YogaProps
    public final float getFlexGrow() {
        return YogaNative.jni_YGNodeStyleGetFlexGrowJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final float getFlexShrink() {
        return YogaNative.jni_YGNodeStyleGetFlexShrinkJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final YogaValue getHeight() {
        return k(YogaNative.jni_YGNodeStyleGetHeightJNI(this.f21918f));
    }

    @Override // com.facebook.yoga.YogaProps
    public final i getJustifyContent() {
        int iJni_YGNodeStyleGetJustifyContentJNI = YogaNative.jni_YGNodeStyleGetJustifyContentJNI(this.f21918f);
        if (iJni_YGNodeStyleGetJustifyContentJNI == 0) {
            return i.FLEX_START;
        }
        if (iJni_YGNodeStyleGetJustifyContentJNI == 1) {
            return i.CENTER;
        }
        if (iJni_YGNodeStyleGetJustifyContentJNI == 2) {
            return i.FLEX_END;
        }
        if (iJni_YGNodeStyleGetJustifyContentJNI == 3) {
            return i.SPACE_BETWEEN;
        }
        if (iJni_YGNodeStyleGetJustifyContentJNI == 4) {
            return i.SPACE_AROUND;
        }
        if (iJni_YGNodeStyleGetJustifyContentJNI == 5) {
            return i.SPACE_EVENLY;
        }
        throw new IllegalArgumentException(G.m(iJni_YGNodeStyleGetJustifyContentJNI, "Unknown enum value: "));
    }

    @Override // com.facebook.yoga.YogaProps
    public final YogaValue getMargin(g gVar) {
        return k(YogaNative.jni_YGNodeStyleGetMarginJNI(this.f21918f, gVar.f3643a));
    }

    @Override // com.facebook.yoga.YogaProps
    public final YogaValue getMaxHeight() {
        return k(YogaNative.jni_YGNodeStyleGetMaxHeightJNI(this.f21918f));
    }

    @Override // com.facebook.yoga.YogaProps
    public final YogaValue getMaxWidth() {
        return k(YogaNative.jni_YGNodeStyleGetMaxWidthJNI(this.f21918f));
    }

    @Override // com.facebook.yoga.YogaProps
    public final YogaValue getMinHeight() {
        return k(YogaNative.jni_YGNodeStyleGetMinHeightJNI(this.f21918f));
    }

    @Override // com.facebook.yoga.YogaProps
    public final YogaValue getMinWidth() {
        return k(YogaNative.jni_YGNodeStyleGetMinWidthJNI(this.f21918f));
    }

    @Override // com.facebook.yoga.YogaProps
    public final YogaValue getPadding(g gVar) {
        return k(YogaNative.jni_YGNodeStyleGetPaddingJNI(this.f21918f, gVar.f3643a));
    }

    @Override // com.facebook.yoga.YogaProps
    public final YogaValue getPosition(g gVar) {
        return k(YogaNative.jni_YGNodeStyleGetPositionJNI(this.f21918f, gVar.f3643a));
    }

    @Override // com.facebook.yoga.YogaProps
    public final n getPositionType() {
        int iJni_YGNodeStyleGetPositionTypeJNI = YogaNative.jni_YGNodeStyleGetPositionTypeJNI(this.f21918f);
        if (iJni_YGNodeStyleGetPositionTypeJNI == 0) {
            return n.STATIC;
        }
        if (iJni_YGNodeStyleGetPositionTypeJNI == 1) {
            return n.RELATIVE;
        }
        if (iJni_YGNodeStyleGetPositionTypeJNI == 2) {
            return n.ABSOLUTE;
        }
        throw new IllegalArgumentException(G.m(iJni_YGNodeStyleGetPositionTypeJNI, "Unknown enum value: "));
    }

    @Override // com.facebook.yoga.YogaProps
    public final e getStyleDirection() {
        return e.a(YogaNative.jni_YGNodeStyleGetDirectionJNI(this.f21918f));
    }

    @Override // com.facebook.yoga.YogaProps
    public final YogaValue getWidth() {
        return k(YogaNative.jni_YGNodeStyleGetWidthJNI(this.f21918f));
    }

    @Override // H3.k
    public final void h() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.f21920i = false;
    }

    @Override // H3.k
    public final YogaNodeJNIBase i(int i7) {
        ArrayList arrayList = this.f21915c;
        if (arrayList == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.remove(i7);
        yogaNodeJNIBase.f21913a = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.f21918f, yogaNodeJNIBase.f21918f);
        return yogaNodeJNIBase;
    }

    @Override // H3.k
    public final void j() {
        this.f21916d = null;
        this.f21917e = null;
        this.f21919g = null;
        this.arr = null;
        this.f21920i = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeResetJNI(this.f21918f);
    }

    @DoNotStrip
    public final long measure(float f10, int i7, float f11, int i10) {
        YogaMeasureFunction yogaMeasureFunction = this.f21916d;
        if (yogaMeasureFunction != null) {
            return yogaMeasureFunction.measure(this, f10, j.a(i7), f11, j.a(i10));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setAlignContent(a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f21918f, aVar.f3618a);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setAlignItems(a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f21918f, aVar.f3618a);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setAlignSelf(a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f21918f, aVar.f3618a);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setAspectRatio(float f10) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f21918f, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setBaselineFunction(YogaBaselineFunction yogaBaselineFunction) {
        this.f21917e = yogaBaselineFunction;
        YogaNative.jni_YGNodeSetHasBaselineFuncJNI(this.f21918f, yogaBaselineFunction != null);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setBorder(g gVar, float f10) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.f21918f, gVar.f3643a, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setBoxSizing(b bVar) {
        YogaNative.jni_YGNodeStyleSetBoxSizingJNI(this.f21918f, bVar.f3622a);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setDirection(e eVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.f21918f, eVar.f3628a);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setFlex(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.f21918f, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setFlexBasis(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.f21918f, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setFlexBasisAuto() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setFlexBasisFitContent() {
        YogaNative.jni_YGNodeStyleSetFlexBasisFitContentJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setFlexBasisMaxContent() {
        YogaNative.jni_YGNodeStyleSetFlexBasisMaxContentJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setFlexBasisPercent(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.f21918f, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setFlexBasisStretch() {
        YogaNative.jni_YGNodeStyleSetFlexBasisStretchJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setFlexDirection(h hVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f21918f, hVar.f3649a);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setFlexGrow(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f21918f, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setFlexShrink(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f21918f, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setHeight(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.f21918f, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setHeightAuto() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setHeightFitContent() {
        YogaNative.jni_YGNodeStyleSetHeightFitContentJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setHeightMaxContent() {
        YogaNative.jni_YGNodeStyleSetHeightMaxContentJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setHeightPercent(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.f21918f, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setHeightStretch() {
        YogaNative.jni_YGNodeStyleSetHeightStretchJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setIsReferenceBaseline(boolean z3) {
        YogaNative.jni_YGNodeSetIsReferenceBaselineJNI(this.f21918f, z3);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setJustifyContent(i iVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f21918f, iVar.f3657a);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMargin(g gVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.f21918f, gVar.f3643a, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMarginAuto(g gVar) {
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.f21918f, gVar.f3643a);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMarginPercent(g gVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.f21918f, gVar.f3643a, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMaxHeight(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.f21918f, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMaxHeightFitContent() {
        YogaNative.jni_YGNodeStyleSetMaxHeightFitContentJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMaxHeightMaxContent() {
        YogaNative.jni_YGNodeStyleSetMaxHeightMaxContentJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMaxHeightPercent(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.f21918f, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMaxHeightStretch() {
        YogaNative.jni_YGNodeStyleSetMaxHeightStretchJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMaxWidth(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.f21918f, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMaxWidthFitContent() {
        YogaNative.jni_YGNodeStyleSetMaxWidthFitContentJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMaxWidthMaxContent() {
        YogaNative.jni_YGNodeStyleSetMaxWidthMaxContentJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMaxWidthPercent(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.f21918f, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMaxWidthStretch() {
        YogaNative.jni_YGNodeStyleSetMaxWidthStretchJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMeasureFunction(YogaMeasureFunction yogaMeasureFunction) {
        this.f21916d = yogaMeasureFunction;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.f21918f, yogaMeasureFunction != null);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMinHeight(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.f21918f, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMinHeightFitContent() {
        YogaNative.jni_YGNodeStyleSetMinHeightFitContentJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMinHeightMaxContent() {
        YogaNative.jni_YGNodeStyleSetMinHeightMaxContentJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMinHeightPercent(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.f21918f, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMinHeightStretch() {
        YogaNative.jni_YGNodeStyleSetMinHeightStretchJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMinWidth(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.f21918f, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMinWidthFitContent() {
        YogaNative.jni_YGNodeStyleSetMinWidthFitContentJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMinWidthMaxContent() {
        YogaNative.jni_YGNodeStyleSetMinWidthMaxContentJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMinWidthPercent(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.f21918f, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setMinWidthStretch() {
        YogaNative.jni_YGNodeStyleSetMinWidthStretchJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setPadding(g gVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.f21918f, gVar.f3643a, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setPaddingPercent(g gVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.f21918f, gVar.f3643a, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setPosition(g gVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.f21918f, gVar.f3643a, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setPositionPercent(g gVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.f21918f, gVar.f3643a, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setPositionType(n nVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.f21918f, nVar.f3671a);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setWidth(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.f21918f, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setWidthAuto() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setWidthFitContent() {
        YogaNative.jni_YGNodeStyleSetWidthFitContentJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setWidthMaxContent() {
        YogaNative.jni_YGNodeStyleSetWidthMaxContentJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setWidthPercent(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.f21918f, f10);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setWidthStretch() {
        YogaNative.jni_YGNodeStyleSetWidthStretchJNI(this.f21918f);
    }

    @Override // com.facebook.yoga.YogaProps
    public final void setWrap(p pVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.f21918f, pVar.f3685a);
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }
}
