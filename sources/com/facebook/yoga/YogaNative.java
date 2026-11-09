package com.facebook.yoga;

import com.facebook.soloader.SoLoader;
import com.facebook.yoga.annotations.DoNotStrip;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
public class YogaNative {
    static {
        SoLoader.j("yoga");
    }

    public static native void jni_YGConfigFreeJNI(long j6);

    public static native int jni_YGConfigGetErrataJNI(long j6);

    public static native long jni_YGConfigNewJNI();

    public static native void jni_YGConfigSetErrataJNI(long j6, int i7);

    public static native void jni_YGConfigSetExperimentalFeatureEnabledJNI(long j6, int i7, boolean z3);

    public static native void jni_YGConfigSetLoggerJNI(long j6, YogaLogger yogaLogger);

    public static native void jni_YGConfigSetPointScaleFactorJNI(long j6, float f10);

    public static native void jni_YGConfigSetUseWebDefaultsJNI(long j6, boolean z3);

    public static native void jni_YGNodeCalculateLayoutJNI(long j6, float f10, float f11, long[] jArr, YogaNodeJNIBase[] yogaNodeJNIBaseArr);

    public static native long jni_YGNodeCloneJNI(long j6);

    public static native void jni_YGNodeCopyStyleJNI(long j6, long j10);

    public static native void jni_YGNodeFinalizeJNI(long j6);

    public static native void jni_YGNodeInsertChildJNI(long j6, long j10, int i7);

    public static native boolean jni_YGNodeIsDirtyJNI(long j6);

    public static native boolean jni_YGNodeIsReferenceBaselineJNI(long j6);

    public static native void jni_YGNodeMarkDirtyJNI(long j6);

    public static native long jni_YGNodeNewJNI();

    public static native long jni_YGNodeNewWithConfigJNI(long j6);

    public static native void jni_YGNodeRemoveAllChildrenJNI(long j6);

    public static native void jni_YGNodeRemoveChildJNI(long j6, long j10);

    public static native void jni_YGNodeResetJNI(long j6);

    public static native void jni_YGNodeSetAlwaysFormsContainingBlockJNI(long j6, boolean z3);

    public static native void jni_YGNodeSetHasBaselineFuncJNI(long j6, boolean z3);

    public static native void jni_YGNodeSetHasMeasureFuncJNI(long j6, boolean z3);

    public static native void jni_YGNodeSetIsReferenceBaselineJNI(long j6, boolean z3);

    public static native void jni_YGNodeSetStyleInputsJNI(long j6, float[] fArr, int i7);

    public static native int jni_YGNodeStyleGetAlignContentJNI(long j6);

    public static native int jni_YGNodeStyleGetAlignItemsJNI(long j6);

    public static native int jni_YGNodeStyleGetAlignSelfJNI(long j6);

    public static native float jni_YGNodeStyleGetAspectRatioJNI(long j6);

    public static native float jni_YGNodeStyleGetBorderJNI(long j6, int i7);

    public static native int jni_YGNodeStyleGetBoxSizingJNI(long j6);

    public static native int jni_YGNodeStyleGetDirectionJNI(long j6);

    public static native int jni_YGNodeStyleGetDisplayJNI(long j6);

    public static native long jni_YGNodeStyleGetFlexBasisJNI(long j6);

    public static native int jni_YGNodeStyleGetFlexDirectionJNI(long j6);

    public static native float jni_YGNodeStyleGetFlexGrowJNI(long j6);

    public static native float jni_YGNodeStyleGetFlexJNI(long j6);

    public static native float jni_YGNodeStyleGetFlexShrinkJNI(long j6);

    public static native int jni_YGNodeStyleGetFlexWrapJNI(long j6);

    public static native long jni_YGNodeStyleGetGapJNI(long j6, int i7);

    public static native long jni_YGNodeStyleGetHeightJNI(long j6);

    public static native int jni_YGNodeStyleGetJustifyContentJNI(long j6);

    public static native long jni_YGNodeStyleGetMarginJNI(long j6, int i7);

    public static native long jni_YGNodeStyleGetMaxHeightJNI(long j6);

    public static native long jni_YGNodeStyleGetMaxWidthJNI(long j6);

    public static native long jni_YGNodeStyleGetMinHeightJNI(long j6);

    public static native long jni_YGNodeStyleGetMinWidthJNI(long j6);

    public static native int jni_YGNodeStyleGetOverflowJNI(long j6);

    public static native long jni_YGNodeStyleGetPaddingJNI(long j6, int i7);

    public static native long jni_YGNodeStyleGetPositionJNI(long j6, int i7);

    public static native int jni_YGNodeStyleGetPositionTypeJNI(long j6);

    public static native long jni_YGNodeStyleGetWidthJNI(long j6);

    public static native void jni_YGNodeStyleSetAlignContentJNI(long j6, int i7);

    public static native void jni_YGNodeStyleSetAlignItemsJNI(long j6, int i7);

    public static native void jni_YGNodeStyleSetAlignSelfJNI(long j6, int i7);

    public static native void jni_YGNodeStyleSetAspectRatioJNI(long j6, float f10);

    public static native void jni_YGNodeStyleSetBorderJNI(long j6, int i7, float f10);

    public static native void jni_YGNodeStyleSetBoxSizingJNI(long j6, int i7);

    public static native void jni_YGNodeStyleSetDirectionJNI(long j6, int i7);

    public static native void jni_YGNodeStyleSetDisplayJNI(long j6, int i7);

    public static native void jni_YGNodeStyleSetFlexBasisAutoJNI(long j6);

    public static native void jni_YGNodeStyleSetFlexBasisFitContentJNI(long j6);

    public static native void jni_YGNodeStyleSetFlexBasisJNI(long j6, float f10);

    public static native void jni_YGNodeStyleSetFlexBasisMaxContentJNI(long j6);

    public static native void jni_YGNodeStyleSetFlexBasisPercentJNI(long j6, float f10);

    public static native void jni_YGNodeStyleSetFlexBasisStretchJNI(long j6);

    public static native void jni_YGNodeStyleSetFlexDirectionJNI(long j6, int i7);

    public static native void jni_YGNodeStyleSetFlexGrowJNI(long j6, float f10);

    public static native void jni_YGNodeStyleSetFlexJNI(long j6, float f10);

    public static native void jni_YGNodeStyleSetFlexShrinkJNI(long j6, float f10);

    public static native void jni_YGNodeStyleSetFlexWrapJNI(long j6, int i7);

    public static native void jni_YGNodeStyleSetGapJNI(long j6, int i7, float f10);

    public static native void jni_YGNodeStyleSetGapPercentJNI(long j6, int i7, float f10);

    public static native void jni_YGNodeStyleSetHeightAutoJNI(long j6);

    public static native void jni_YGNodeStyleSetHeightFitContentJNI(long j6);

    public static native void jni_YGNodeStyleSetHeightJNI(long j6, float f10);

    public static native void jni_YGNodeStyleSetHeightMaxContentJNI(long j6);

    public static native void jni_YGNodeStyleSetHeightPercentJNI(long j6, float f10);

    public static native void jni_YGNodeStyleSetHeightStretchJNI(long j6);

    public static native void jni_YGNodeStyleSetJustifyContentJNI(long j6, int i7);

    public static native void jni_YGNodeStyleSetMarginAutoJNI(long j6, int i7);

    public static native void jni_YGNodeStyleSetMarginJNI(long j6, int i7, float f10);

    public static native void jni_YGNodeStyleSetMarginPercentJNI(long j6, int i7, float f10);

    public static native void jni_YGNodeStyleSetMaxHeightFitContentJNI(long j6);

    public static native void jni_YGNodeStyleSetMaxHeightJNI(long j6, float f10);

    public static native void jni_YGNodeStyleSetMaxHeightMaxContentJNI(long j6);

    public static native void jni_YGNodeStyleSetMaxHeightPercentJNI(long j6, float f10);

    public static native void jni_YGNodeStyleSetMaxHeightStretchJNI(long j6);

    public static native void jni_YGNodeStyleSetMaxWidthFitContentJNI(long j6);

    public static native void jni_YGNodeStyleSetMaxWidthJNI(long j6, float f10);

    public static native void jni_YGNodeStyleSetMaxWidthMaxContentJNI(long j6);

    public static native void jni_YGNodeStyleSetMaxWidthPercentJNI(long j6, float f10);

    public static native void jni_YGNodeStyleSetMaxWidthStretchJNI(long j6);

    public static native void jni_YGNodeStyleSetMinHeightFitContentJNI(long j6);

    public static native void jni_YGNodeStyleSetMinHeightJNI(long j6, float f10);

    public static native void jni_YGNodeStyleSetMinHeightMaxContentJNI(long j6);

    public static native void jni_YGNodeStyleSetMinHeightPercentJNI(long j6, float f10);

    public static native void jni_YGNodeStyleSetMinHeightStretchJNI(long j6);

    public static native void jni_YGNodeStyleSetMinWidthFitContentJNI(long j6);

    public static native void jni_YGNodeStyleSetMinWidthJNI(long j6, float f10);

    public static native void jni_YGNodeStyleSetMinWidthMaxContentJNI(long j6);

    public static native void jni_YGNodeStyleSetMinWidthPercentJNI(long j6, float f10);

    public static native void jni_YGNodeStyleSetMinWidthStretchJNI(long j6);

    public static native void jni_YGNodeStyleSetOverflowJNI(long j6, int i7);

    public static native void jni_YGNodeStyleSetPaddingJNI(long j6, int i7, float f10);

    public static native void jni_YGNodeStyleSetPaddingPercentJNI(long j6, int i7, float f10);

    public static native void jni_YGNodeStyleSetPositionAutoJNI(long j6, int i7);

    public static native void jni_YGNodeStyleSetPositionJNI(long j6, int i7, float f10);

    public static native void jni_YGNodeStyleSetPositionPercentJNI(long j6, int i7, float f10);

    public static native void jni_YGNodeStyleSetPositionTypeJNI(long j6, int i7);

    public static native void jni_YGNodeStyleSetWidthAutoJNI(long j6);

    public static native void jni_YGNodeStyleSetWidthFitContentJNI(long j6);

    public static native void jni_YGNodeStyleSetWidthJNI(long j6, float f10);

    public static native void jni_YGNodeStyleSetWidthMaxContentJNI(long j6);

    public static native void jni_YGNodeStyleSetWidthPercentJNI(long j6, float f10);

    public static native void jni_YGNodeStyleSetWidthStretchJNI(long j6);

    public static native void jni_YGNodeSwapChildJNI(long j6, long j10, int i7);
}
