package com.facebook.react.uimanager;

import N8.q0;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b*\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001;B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\fH\u0007J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0007J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0007J \u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0007J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0007J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0005H\u0007J\u0018\u0010\u001f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007J(\u0010 \u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H\u0007J\u0018\u0010#\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H\u0007J\b\u0010&\u001a\u00020\fH\u0007J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0007J\u0010\u0010)\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\fH\u0007J\u0018\u0010*\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0005H\u0007J\u0018\u0010,\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0005H\u0007J\u0018\u0010.\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0005H\u0007J\u0016\u0010/\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0005J \u00100\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0007J(\u00103\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u0005H\u0007J\u0018\u00105\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0005H\u0007J\u0018\u00107\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0005H\u0007J\u0018\u00108\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0005H\u0007J\u0018\u00109\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0005H\u0007J\u0018\u0010:\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/facebook/react/uimanager/MatrixMathHelper;", "", "<init>", "()V", "EPSILON", "", "isZero", "", "d", "multiplyInto", "", "out", "", "a", "b", "decomposeMatrix", "transformMatrix", "ctx", "Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;", "determinant", "matrix", "inverse", "transpose", "m", "multiplyVectorByMatrix", "v", "result", "v3Length", "v3Normalize", "vector", "norm", "v3Dot", "v3Combine", "aScale", "bScale", "v3Cross", "roundTo3Places", "n", "createIdentityMatrix", "degreesToRadians", "degrees", "resetIdentityMatrix", "applyPerspective", "perspective", "applyScaleX", "factor", "applyScaleY", "applyScaleZ", "applyTranslate2D", "x", "y", "applyTranslate3D", "z", "applySkewX", "radians", "applySkewY", "applyRotateX", "applyRotateY", "applyRotateZ", "MatrixDecompositionContext", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MatrixMathHelper {
    private static final double EPSILON = 1.0E-5d;

    @NotNull
    public static final MatrixMathHelper INSTANCE = new MatrixMathHelper();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext;", "", "<init>", "()V", "perspective", "", "scale", "skew", "translation", "rotationDegrees", "reset", "", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class MatrixDecompositionContext {

        @NotNull
        private static final Companion Companion = new Companion(null);

        @JvmField
        @NotNull
        public double[] perspective = new double[4];

        @JvmField
        @NotNull
        public double[] scale = new double[3];

        @JvmField
        @NotNull
        public double[] skew = new double[3];

        @JvmField
        @NotNull
        public double[] translation = new double[3];

        @JvmField
        @NotNull
        public double[] rotationDegrees = new double[3];

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0013\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/MatrixMathHelper$MatrixDecompositionContext$Companion;", "", "<init>", "()V", "resetArray", "", "arr", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void resetArray(double[] arr) {
                int length = arr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    arr[i7] = 0.0d;
                }
            }

            private Companion() {
            }
        }

        public final void reset() {
            Companion companion = Companion;
            companion.resetArray(this.perspective);
            companion.resetArray(this.scale);
            companion.resetArray(this.skew);
            companion.resetArray(this.translation);
            companion.resetArray(this.rotationDegrees);
        }
    }

    private MatrixMathHelper() {
    }

    @JvmStatic
    public static final void applyPerspective(@NotNull double[] m7, double perspective) {
        Intrinsics.checkNotNullParameter(m7, "m");
        m7[11] = ((double) (-1)) / perspective;
    }

    @JvmStatic
    public static final void applyRotateX(@NotNull double[] m7, double radians) {
        Intrinsics.checkNotNullParameter(m7, "m");
        m7[5] = Math.cos(radians);
        m7[6] = Math.sin(radians);
        m7[9] = -Math.sin(radians);
        m7[10] = Math.cos(radians);
    }

    @JvmStatic
    public static final void applyRotateY(@NotNull double[] m7, double radians) {
        Intrinsics.checkNotNullParameter(m7, "m");
        m7[0] = Math.cos(radians);
        m7[2] = -Math.sin(radians);
        m7[8] = Math.sin(radians);
        m7[10] = Math.cos(radians);
    }

    @JvmStatic
    public static final void applyRotateZ(@NotNull double[] m7, double radians) {
        Intrinsics.checkNotNullParameter(m7, "m");
        m7[0] = Math.cos(radians);
        m7[1] = Math.sin(radians);
        m7[4] = -Math.sin(radians);
        m7[5] = Math.cos(radians);
    }

    @JvmStatic
    public static final void applyScaleX(@NotNull double[] m7, double factor) {
        Intrinsics.checkNotNullParameter(m7, "m");
        m7[0] = factor;
    }

    @JvmStatic
    public static final void applyScaleY(@NotNull double[] m7, double factor) {
        Intrinsics.checkNotNullParameter(m7, "m");
        m7[5] = factor;
    }

    @JvmStatic
    public static final void applySkewX(@NotNull double[] m7, double radians) {
        Intrinsics.checkNotNullParameter(m7, "m");
        m7[4] = Math.tan(radians);
    }

    @JvmStatic
    public static final void applySkewY(@NotNull double[] m7, double radians) {
        Intrinsics.checkNotNullParameter(m7, "m");
        m7[1] = Math.tan(radians);
    }

    @JvmStatic
    public static final void applyTranslate2D(@NotNull double[] m7, double x3, double y8) {
        Intrinsics.checkNotNullParameter(m7, "m");
        m7[12] = x3;
        m7[13] = y8;
    }

    @JvmStatic
    public static final void applyTranslate3D(@NotNull double[] m7, double x3, double y8, double z3) {
        Intrinsics.checkNotNullParameter(m7, "m");
        m7[12] = x3;
        m7[13] = y8;
        m7[14] = z3;
    }

    @JvmStatic
    @NotNull
    public static final double[] createIdentityMatrix() {
        double[] dArr = new double[16];
        resetIdentityMatrix(dArr);
        return dArr;
    }

    @JvmStatic
    public static final void decomposeMatrix(@NotNull double[] transformMatrix, @NotNull MatrixDecompositionContext ctx) {
        Intrinsics.checkNotNullParameter(transformMatrix, "transformMatrix");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        p059e1.a.d(transformMatrix.length == 16);
        double[] dArr = ctx.perspective;
        double[] dArr2 = ctx.scale;
        double[] dArr3 = ctx.skew;
        double[] dArr4 = ctx.translation;
        double[] dArr5 = ctx.rotationDegrees;
        if (INSTANCE.isZero(transformMatrix[15])) {
            return;
        }
        double[][] dArr6 = new double[4][];
        for (int i7 = 0; i7 < 4; i7++) {
            dArr6[i7] = new double[4];
        }
        double[] dArr7 = new double[16];
        for (int i10 = 0; i10 < 4; i10++) {
            for (int i11 = 0; i11 < 4; i11++) {
                int i12 = (i10 * 4) + i11;
                double d2 = transformMatrix[i12] / transformMatrix[15];
                dArr6[i10][i11] = d2;
                if (i11 == 3) {
                    d2 = 0.0d;
                }
                dArr7[i12] = d2;
            }
        }
        dArr7[15] = 1.0d;
        MatrixMathHelper matrixMathHelper = INSTANCE;
        if (matrixMathHelper.isZero(determinant(dArr7))) {
            return;
        }
        if (matrixMathHelper.isZero(dArr6[0][3]) && matrixMathHelper.isZero(dArr6[1][3]) && matrixMathHelper.isZero(dArr6[2][3])) {
            dArr[2] = 0.0d;
            dArr[1] = 0.0d;
            dArr[0] = 0.0d;
            dArr[3] = 1.0d;
        } else {
            multiplyVectorByMatrix(new double[]{dArr6[0][3], dArr6[1][3], dArr6[2][3], dArr6[3][3]}, transpose(inverse(dArr7)), dArr);
        }
        for (int i13 = 0; i13 < 3; i13++) {
            dArr4[i13] = dArr6[3][i13];
        }
        double[][] dArr8 = new double[3][];
        for (int i14 = 0; i14 < 3; i14++) {
            dArr8[i14] = new double[3];
        }
        for (int i15 = 0; i15 < 3; i15++) {
            double[] dArr9 = dArr8[i15];
            double[] dArr10 = dArr6[i15];
            dArr9[0] = dArr10[0];
            dArr9[1] = dArr10[1];
            dArr9[2] = dArr10[2];
        }
        double dV3Length = v3Length(dArr8[0]);
        dArr2[0] = dV3Length;
        double[] dArrV3Normalize = v3Normalize(dArr8[0], dV3Length);
        dArr8[0] = dArrV3Normalize;
        double dV3Dot = v3Dot(dArrV3Normalize, dArr8[1]);
        dArr3[0] = dV3Dot;
        double[] dArrV3Combine = v3Combine(dArr8[1], dArr8[0], 1.0d, -dV3Dot);
        dArr8[1] = dArrV3Combine;
        double dV3Length2 = v3Length(dArrV3Combine);
        dArr2[1] = dV3Length2;
        dArr8[1] = v3Normalize(dArr8[1], dV3Length2);
        dArr3[0] = dArr3[0] / dArr2[1];
        double dV3Dot2 = v3Dot(dArr8[0], dArr8[2]);
        dArr3[1] = dV3Dot2;
        double[] dArrV3Combine2 = v3Combine(dArr8[2], dArr8[0], 1.0d, -dV3Dot2);
        dArr8[2] = dArrV3Combine2;
        double dV3Dot3 = v3Dot(dArr8[1], dArrV3Combine2);
        dArr3[2] = dV3Dot3;
        double[] dArrV3Combine3 = v3Combine(dArr8[2], dArr8[1], 1.0d, -dV3Dot3);
        dArr8[2] = dArrV3Combine3;
        double dV3Length3 = v3Length(dArrV3Combine3);
        dArr2[2] = dV3Length3;
        double[] dArrV3Normalize2 = v3Normalize(dArr8[2], dV3Length3);
        dArr8[2] = dArrV3Normalize2;
        double d10 = dArr3[1];
        double d11 = dArr2[2];
        dArr3[1] = d10 / d11;
        dArr3[2] = dArr3[2] / d11;
        if (v3Dot(dArr8[0], v3Cross(dArr8[1], dArrV3Normalize2)) < 0.0d) {
            for (int i16 = 0; i16 < 3; i16++) {
                dArr2[i16] = dArr2[i16] * (-1.0d);
                double[] dArr11 = dArr8[i16];
                dArr11[0] = dArr11[0] * (-1.0d);
                dArr11[1] = dArr11[1] * (-1.0d);
                dArr11[2] = dArr11[2] * (-1.0d);
            }
        }
        double[] dArr12 = dArr8[2];
        dArr5[0] = roundTo3Places((-Math.atan2(dArr12[1], dArr12[2])) * 57.29577951308232d);
        double[] dArr13 = dArr8[2];
        double d12 = -dArr13[0];
        double d13 = dArr13[1];
        double d14 = dArr13[2];
        dArr5[1] = roundTo3Places((-Math.atan2(d12, Math.sqrt((d14 * d14) + (d13 * d13)))) * 57.29577951308232d);
        dArr5[2] = roundTo3Places((-Math.atan2(dArr8[1][0], dArr8[0][0])) * 57.29577951308232d);
    }

    @JvmStatic
    public static final double degreesToRadians(double degrees) {
        return (degrees * 3.141592653589793d) / ((double) 180);
    }

    @JvmStatic
    public static final double determinant(@NotNull double[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        double d2 = matrix[0];
        double d10 = matrix[1];
        double d11 = matrix[2];
        double d12 = matrix[3];
        double d13 = matrix[4];
        double d14 = matrix[5];
        double d15 = matrix[6];
        double d16 = matrix[7];
        double d17 = matrix[8];
        double d18 = matrix[9];
        double d19 = matrix[10];
        double d20 = matrix[11];
        double d21 = matrix[12];
        double d22 = matrix[13];
        double d23 = matrix[14];
        double d24 = matrix[15];
        double d25 = d12 * d15;
        double d26 = d11 * d16;
        double d27 = d12 * d14;
        double d28 = d10 * d16;
        double dX = q0.x(d28, d19, d21, (((d25 * d18) * d21) - ((d26 * d18) * d21)) - ((d27 * d19) * d21));
        double d29 = d11 * d14;
        double d30 = d10 * d15;
        double dX2 = q0.x(d26, d17, d22, (q0.x(d29, d20, d21, dX) - ((d30 * d20) * d21)) - ((d25 * d17) * d22));
        double d31 = d12 * d13;
        double d32 = d16 * d2;
        double d33 = d11 * d13;
        double d34 = d15 * d2;
        double d35 = d10 * d13;
        double d36 = d2 * d14;
        return q0.x(d36, d19, d24, (q0.x(d33, d18, d24, q0.x(d30, d17, d24, (q0.x(d35, d20, d23, q0.x(d32, d18, d23, (q0.x(d27, d17, d23, q0.x(d34, d20, d22, (q0.x(d31, d19, d22, dX2) - ((d32 * d19) * d22)) - ((d33 * d20) * d22))) - ((d28 * d17) * d23)) - ((d31 * d18) * d23))) - ((d36 * d20) * d23)) - ((d29 * d17) * d24))) - ((d34 * d18) * d24)) - ((d35 * d19) * d24));
    }

    @JvmStatic
    @NotNull
    public static final double[] inverse(@NotNull double[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        double dDeterminant = determinant(matrix);
        if (INSTANCE.isZero(dDeterminant)) {
            return matrix;
        }
        double d2 = matrix[0];
        double d10 = matrix[1];
        double d11 = matrix[2];
        double d12 = matrix[3];
        double d13 = matrix[4];
        double d14 = matrix[5];
        double d15 = matrix[6];
        double d16 = matrix[7];
        double d17 = matrix[8];
        double d18 = matrix[9];
        double d19 = matrix[10];
        double d20 = matrix[11];
        double d21 = matrix[12];
        double d22 = matrix[13];
        double d23 = matrix[14];
        double d24 = matrix[15];
        double d25 = d15 * d20;
        double d26 = d16 * d19;
        double d27 = d16 * d18;
        double d28 = d14 * d20;
        double d29 = d15 * d18;
        double d30 = d14 * d19;
        double d31 = ((d30 * d24) + ((((d27 * d23) + ((d25 * d22) - (d26 * d22))) - (d28 * d23)) - (d29 * d24))) / dDeterminant;
        double d32 = d12 * d19;
        double d33 = d11 * d20;
        double d34 = d12 * d18;
        double d35 = d10 * d20;
        double d36 = d11 * d18;
        double d37 = (d36 * d24) + (d35 * d23) + (((d32 * d22) - (d33 * d22)) - (d34 * d23));
        double d38 = d10 * d19;
        double d39 = d11 * d16;
        double d40 = d12 * d15;
        double d41 = d12 * d14;
        double d42 = d10 * d16;
        double d43 = d11 * d14;
        double d44 = d10 * d15;
        double d45 = ((d44 * d24) + ((((d41 * d23) + ((d39 * d22) - (d40 * d22))) - (d42 * d23)) - (d43 * d24))) / dDeterminant;
        double d46 = (((d43 * d20) + ((d42 * d19) + (((d40 * d18) - (d39 * d18)) - (d41 * d19)))) - (d44 * d20)) / dDeterminant;
        double d47 = (d26 * d21) - (d25 * d21);
        double d48 = d16 * d17;
        double d49 = d13 * d20;
        double d50 = (d49 * d23) + (d47 - (d48 * d23));
        double d51 = d15 * d17;
        double d52 = (d51 * d24) + d50;
        double d53 = d13 * d19;
        double d54 = (d33 * d21) - (d32 * d21);
        double d55 = d12 * d17;
        double d56 = (d55 * d23) + d54;
        double d57 = d2 * d20;
        double d58 = d11 * d17;
        double d59 = d2 * d19;
        double d60 = ((d59 * d24) + ((d56 - (d57 * d23)) - (d58 * d24))) / dDeterminant;
        double d61 = d12 * d13;
        double d62 = d16 * d2;
        double d63 = d11 * d13;
        double d64 = d15 * d2;
        double d65 = (((d63 * d24) + ((d62 * d23) + (((d40 * d21) - (d39 * d21)) - (d61 * d23)))) - (d64 * d24)) / dDeterminant;
        double d66 = ((d64 * d20) + ((((d61 * d19) + ((d39 * d17) - (d40 * d17))) - (d62 * d19)) - (d63 * d20))) / dDeterminant;
        double d67 = ((d48 * d22) + ((d28 * d21) - (d27 * d21))) - (d49 * d22);
        double d68 = d14 * d17;
        double d69 = d13 * d18;
        double d70 = ((d69 * d24) + (d67 - (d68 * d24))) / dDeterminant;
        double d71 = d10 * d17;
        double d72 = (d71 * d24) + (d57 * d22) + (((d34 * d21) - (d35 * d21)) - (d55 * d22));
        double d73 = d2 * d18;
        double d74 = d10 * d13;
        double d75 = d2 * d14;
        return new double[]{d31, (d37 - (d38 * d24)) / dDeterminant, d45, d46, (d52 - (d53 * d24)) / dDeterminant, d60, d65, d66, d70, (d72 - (d73 * d24)) / dDeterminant, ((d24 * d75) + ((((d61 * d22) + ((d42 * d21) - (d41 * d21))) - (d62 * d22)) - (d74 * d24))) / dDeterminant, (((d74 * d20) + ((d62 * d18) + (((d41 * d17) - (d42 * d17)) - (d61 * d18)))) - (d20 * d75)) / dDeterminant, (((d68 * d23) + ((d53 * d22) + (((d29 * d21) - (d30 * d21)) - (d51 * d22)))) - (d69 * d23)) / dDeterminant, ((d73 * d23) + ((((d58 * d22) + ((d38 * d21) - (d36 * d21))) - (d59 * d22)) - (d71 * d23))) / dDeterminant, (((d74 * d23) + ((d22 * d64) + (((d43 * d21) - (d21 * d44)) - (d63 * d22)))) - (d23 * d75)) / dDeterminant, ((d75 * d19) + ((((d63 * d18) + ((d44 * d17) - (d43 * d17))) - (d64 * d18)) - (d74 * d19))) / dDeterminant};
    }

    private final boolean isZero(double d2) {
        return !Double.isNaN(d2) && Math.abs(d2) < EPSILON;
    }

    @JvmStatic
    public static final void multiplyInto(@NotNull double[] out, @NotNull double[] a3, @NotNull double[] b7) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(a3, "a");
        Intrinsics.checkNotNullParameter(b7, "b");
        double d2 = a3[0];
        double d10 = a3[1];
        double d11 = a3[2];
        double d12 = a3[3];
        double d13 = a3[4];
        double d14 = a3[5];
        double d15 = a3[6];
        double d16 = a3[7];
        double d17 = a3[8];
        double d18 = a3[9];
        double d19 = a3[10];
        double d20 = a3[11];
        double d21 = a3[12];
        double d22 = a3[13];
        double d23 = a3[14];
        double d24 = a3[15];
        double d25 = b7[0];
        double d26 = b7[1];
        double d27 = b7[2];
        double d28 = b7[3];
        out[0] = (d28 * d21) + (d27 * d17) + (d26 * d13) + (d25 * d2);
        out[1] = (d28 * d22) + (d27 * d18) + (d26 * d14) + (d25 * d10);
        out[2] = (d28 * d23) + (d27 * d19) + (d26 * d15) + (d25 * d11);
        double d29 = d27 * d20;
        double d30 = d28 * d24;
        out[3] = d30 + d29 + (d26 * d16) + (d25 * d12);
        double d31 = b7[4];
        double d32 = b7[5];
        double d33 = b7[6];
        double d34 = b7[7];
        out[4] = (d34 * d21) + (d33 * d17) + (d32 * d13) + (d31 * d2);
        out[5] = (d34 * d22) + (d33 * d18) + (d32 * d14) + (d31 * d10);
        out[6] = (d34 * d23) + (d33 * d19) + (d32 * d15) + (d31 * d11);
        double d35 = d33 * d20;
        double d36 = d34 * d24;
        out[7] = d36 + d35 + (d32 * d16) + (d31 * d12);
        double d37 = b7[8];
        double d38 = b7[9];
        double d39 = b7[10];
        double d40 = b7[11];
        out[8] = (d40 * d21) + (d39 * d17) + (d38 * d13) + (d37 * d2);
        out[9] = (d40 * d22) + (d39 * d18) + (d38 * d14) + (d37 * d10);
        out[10] = (d40 * d23) + (d39 * d19) + (d38 * d15) + (d37 * d11);
        double d41 = d39 * d20;
        double d42 = d40 * d24;
        out[11] = d42 + d41 + (d38 * d16) + (d37 * d12);
        double d43 = b7[12];
        double d44 = b7[13];
        double d45 = b7[14];
        double d46 = b7[15];
        double d47 = d17 * d45;
        double d48 = d21 * d46;
        out[12] = d48 + d47 + (d13 * d44) + (d2 * d43);
        double d49 = d18 * d45;
        double d50 = d22 * d46;
        out[13] = d50 + d49 + (d14 * d44) + (d10 * d43);
        double d51 = d19 * d45;
        double d52 = d23 * d46;
        out[14] = d52 + d51 + (d15 * d44) + (d11 * d43);
        double d53 = d45 * d20;
        double d54 = d46 * d24;
        out[15] = d54 + d53 + (d44 * d16) + (d43 * d12);
    }

    @JvmStatic
    public static final void multiplyVectorByMatrix(@NotNull double[] v3, @NotNull double[] m7, @NotNull double[] result) {
        Intrinsics.checkNotNullParameter(v3, "v");
        Intrinsics.checkNotNullParameter(m7, "m");
        Intrinsics.checkNotNullParameter(result, "result");
        double d2 = v3[0];
        double d10 = v3[1];
        double d11 = v3[2];
        double d12 = v3[3];
        result[0] = (m7[12] * d12) + (m7[8] * d11) + (m7[4] * d10) + (m7[0] * d2);
        result[1] = (m7[13] * d12) + (m7[9] * d11) + (m7[5] * d10) + (m7[1] * d2);
        result[2] = (m7[14] * d12) + (m7[10] * d11) + (m7[6] * d10) + (m7[2] * d2);
        result[3] = (d12 * m7[15]) + (d11 * m7[11]) + (d10 * m7[7]) + (d2 * m7[3]);
    }

    @JvmStatic
    public static final void resetIdentityMatrix(@NotNull double[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        matrix[14] = 0.0d;
        matrix[13] = 0.0d;
        matrix[12] = 0.0d;
        matrix[11] = 0.0d;
        matrix[9] = 0.0d;
        matrix[8] = 0.0d;
        matrix[7] = 0.0d;
        matrix[6] = 0.0d;
        matrix[4] = 0.0d;
        matrix[3] = 0.0d;
        matrix[2] = 0.0d;
        matrix[1] = 0.0d;
        matrix[15] = 1.0d;
        matrix[10] = 1.0d;
        matrix[5] = 1.0d;
        matrix[0] = 1.0d;
    }

    @JvmStatic
    public static final double roundTo3Places(double n10) {
        return Math.round(n10 * 1000.0d) * 0.001d;
    }

    @JvmStatic
    @NotNull
    public static final double[] transpose(@NotNull double[] m7) {
        Intrinsics.checkNotNullParameter(m7, "m");
        return new double[]{m7[0], m7[4], m7[8], m7[12], m7[1], m7[5], m7[9], m7[13], m7[2], m7[6], m7[10], m7[14], m7[3], m7[7], m7[11], m7[15]};
    }

    @JvmStatic
    @NotNull
    public static final double[] v3Combine(@NotNull double[] a3, @NotNull double[] b7, double aScale, double bScale) {
        Intrinsics.checkNotNullParameter(a3, "a");
        Intrinsics.checkNotNullParameter(b7, "b");
        return new double[]{(b7[0] * bScale) + (a3[0] * aScale), (b7[1] * bScale) + (a3[1] * aScale), (bScale * b7[2]) + (aScale * a3[2])};
    }

    @JvmStatic
    @NotNull
    public static final double[] v3Cross(@NotNull double[] a3, @NotNull double[] b7) {
        Intrinsics.checkNotNullParameter(a3, "a");
        Intrinsics.checkNotNullParameter(b7, "b");
        double d2 = a3[1];
        double d10 = b7[2];
        double d11 = a3[2];
        double d12 = b7[1];
        double d13 = b7[0];
        double d14 = a3[0];
        return new double[]{(d2 * d10) - (d11 * d12), (d11 * d13) - (d10 * d14), (d14 * d12) - (d2 * d13)};
    }

    @JvmStatic
    public static final double v3Dot(@NotNull double[] a3, @NotNull double[] b7) {
        Intrinsics.checkNotNullParameter(a3, "a");
        Intrinsics.checkNotNullParameter(b7, "b");
        return (a3[2] * b7[2]) + (a3[1] * b7[1]) + (a3[0] * b7[0]);
    }

    @JvmStatic
    public static final double v3Length(@NotNull double[] a3) {
        Intrinsics.checkNotNullParameter(a3, "a");
        double d2 = a3[0];
        double d10 = a3[1];
        double d11 = (d10 * d10) + (d2 * d2);
        double d12 = a3[2];
        return Math.sqrt((d12 * d12) + d11);
    }

    @JvmStatic
    @NotNull
    public static final double[] v3Normalize(@NotNull double[] vector, double norm) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        double d2 = 1;
        if (INSTANCE.isZero(norm)) {
            norm = v3Length(vector);
        }
        double d10 = d2 / norm;
        return new double[]{vector[0] * d10, vector[1] * d10, vector[2] * d10};
    }

    public final void applyScaleZ(@NotNull double[] m7, double factor) {
        Intrinsics.checkNotNullParameter(m7, "m");
        m7[10] = factor;
    }
}
