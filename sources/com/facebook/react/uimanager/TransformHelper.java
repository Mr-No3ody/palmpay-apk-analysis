package com.facebook.react.uimanager;

import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.F;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0007J2\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0007J:\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\bH\u0002J,\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J3\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u001dH\u0083 R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/uimanager/TransformHelper;", "", "<init>", "()V", "helperMatrix", "Ljava/lang/ThreadLocal;", "", "convertToRadians", "", "transformMap", "Lcom/facebook/react/bridge/ReadableMap;", "key", "", "processTransform", "", "transforms", "Lcom/facebook/react/bridge/ReadableArray;", "result", "viewWidth", "", "viewHeight", ViewProps.TRANSFORM_ORIGIN, "allowPercentageResolution", "", "parseTranslateValue", "stringValue", "dimension", "getTranslateForTransformOrigin", "nativeProcessTransform", "Lcom/facebook/react/bridge/NativeArray;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransformHelper {

    @NotNull
    public static final TransformHelper INSTANCE = new TransformHelper();

    @NotNull
    private static final ThreadLocal<double[]> helperMatrix = new ThreadLocal<double[]>() { // from class: com.facebook.react.uimanager.TransformHelper$helperMatrix$1
        @Override // java.lang.ThreadLocal
        public double[] initialValue() {
            return new double[16];
        }
    };

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TransformHelper() {
    }

    private final double convertToRadians(ReadableMap transformMap, String key) {
        double d2;
        boolean z3 = true;
        if (transformMap.getType(key) == ReadableType.String) {
            String string = transformMap.getString(key);
            Intrinsics.e(string);
            if (y.g(string, "rad", false)) {
                string = F.w(3, string);
            } else if (y.g(string, "deg", false)) {
                string = F.w(3, string);
                z3 = false;
            }
            d2 = Double.parseDouble(string);
        } else {
            d2 = transformMap.getDouble(key);
        }
        return z3 ? d2 : MatrixMathHelper.degreesToRadians(d2);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    private final double[] getTranslateForTransformOrigin(float viewWidth, float viewHeight, ReadableArray transformOrigin, boolean allowPercentageResolution) {
        int i7 = 2;
        boolean z3 = false;
        if (transformOrigin == null) {
            return null;
        }
        if (viewHeight == 0.0f && viewWidth == 0.0f) {
            return null;
        }
        double d2 = ((double) viewWidth) / 2.0d;
        double d10 = ((double) viewHeight) / 2.0d;
        double[] dArr = new double[3];
        dArr[0] = d2;
        dArr[1] = d10;
        dArr[2] = 0.0d;
        int iMin = Math.min(transformOrigin.size(), 3);
        int i10 = 0;
        while (i10 < iMin) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[transformOrigin.getType(i10).ordinal()];
            if (i11 == 1) {
                dArr[i10] = transformOrigin.getDouble(i10);
            } else if (i11 == i7 && allowPercentageResolution) {
                String string = transformOrigin.getString(i10);
                Intrinsics.e(string);
                if (y.g(string, "%", z3)) {
                    dArr[i10] = (((double) (i10 == 0 ? viewWidth : viewHeight)) * Double.parseDouble(F.w(1, string))) / 100.0d;
                }
            }
            i10++;
            i7 = i7;
            z3 = z3;
        }
        int i12 = i7;
        boolean z8 = z3;
        double d11 = (-d2) + dArr[z8 ? 1 : 0];
        double d12 = (-d10) + dArr[1];
        double d13 = dArr[i12];
        double[] dArr2 = new double[3];
        dArr2[z8 ? 1 : 0] = d11;
        dArr2[1] = d12;
        dArr2[i12] = d13;
        return dArr2;
    }

    @JvmStatic
    private static final native void nativeProcessTransform(NativeArray transforms, double[] result, float viewWidth, float viewHeight, NativeArray transformOrigin);

    private final double parseTranslateValue(String stringValue, double dimension) {
        try {
            return y.g(stringValue, "%", false) ? (Double.parseDouble(F.w(1, stringValue)) * dimension) / 100.0d : Double.parseDouble(stringValue);
        } catch (NumberFormatException unused) {
            p229p2.a.v("ReactNative", "Invalid translate value: " + stringValue);
            return 0.0d;
        }
    }

    @Deprecated(message = "Use processTransform(ReadableArray, DoubleArray, Float, Float, ReadableArray, Boolean) instead", replaceWith = @ReplaceWith(expression = "processTransform(...)", imports = {}))
    @JvmStatic
    public static final void processTransform(@NotNull ReadableArray transforms, @NotNull double[] result) {
        Intrinsics.checkNotNullParameter(transforms, "transforms");
        Intrinsics.checkNotNullParameter(result, "result");
        processTransform(transforms, result, 0.0f, 0.0f, null, false);
    }

    @Deprecated(message = "Use processTransform(ReadableArray, DoubleArray, Float, Float, ReadableArray, Boolean) instead", replaceWith = @ReplaceWith(expression = "processTransform(...)", imports = {}))
    @JvmStatic
    public static final void processTransform(@NotNull ReadableArray transforms, @NotNull double[] result, float viewWidth, float viewHeight, @Nullable ReadableArray transformOrigin) {
        Intrinsics.checkNotNullParameter(transforms, "transforms");
        Intrinsics.checkNotNullParameter(result, "result");
        processTransform(transforms, result, viewWidth, viewHeight, transformOrigin, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:108:0x0257 A[PHI: r6 r7
      0x0257: PHI (r6v24 char) = 
      (r6v4 char)
      (r6v5 char)
      (r6v6 char)
      (r6v7 char)
      (r6v8 char)
      (r6v9 char)
      (r6v10 char)
      (r6v11 char)
      (r6v12 char)
      (r6v13 char)
      (r6v25 char)
     binds: [B:107:0x0255, B:97:0x0224, B:91:0x0204, B:87:0x01ec, B:83:0x01d5, B:79:0x01be, B:75:0x01a4, B:71:0x018b, B:67:0x0172, B:63:0x015b, B:29:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x0257: PHI (r7v25 int) = 
      (r7v4 int)
      (r7v5 int)
      (r7v6 int)
      (r7v7 int)
      (r7v8 int)
      (r7v9 int)
      (r7v10 int)
      (r7v11 int)
      (r7v12 int)
      (r7v13 int)
      (r7v26 int)
     binds: [B:107:0x0255, B:97:0x0224, B:91:0x0204, B:87:0x01ec, B:83:0x01d5, B:79:0x01be, B:75:0x01a4, B:71:0x018b, B:67:0x0172, B:63:0x015b, B:29:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void processTransform(@NotNull ReadableArray transforms, @NotNull double[] result, float viewWidth, float viewHeight, @Nullable ReadableArray transformOrigin, boolean allowPercentageResolution) {
        int i7;
        char c6;
        double translateValue;
        double translateValue2;
        double translateValue3;
        double translateValue4;
        Intrinsics.checkNotNullParameter(transforms, "transforms");
        Intrinsics.checkNotNullParameter(result, "result");
        int i10 = 1;
        if (allowPercentageResolution && ReactNativeFeatureFlags.useNativeTransformHelperAndroid() && (transforms instanceof NativeArray)) {
            if (transformOrigin == 0 ? true : transformOrigin instanceof NativeArray) {
                nativeProcessTransform((NativeArray) transforms, result, viewWidth, viewHeight, (NativeArray) transformOrigin);
                return;
            }
        }
        double[] dArr = helperMatrix.get();
        Intrinsics.e(dArr);
        double[] dArr2 = dArr;
        MatrixMathHelper.resetIdentityMatrix(result);
        double[] translateForTransformOrigin = INSTANCE.getTranslateForTransformOrigin(viewWidth, viewHeight, transformOrigin, allowPercentageResolution);
        if (translateForTransformOrigin != null) {
            MatrixMathHelper.resetIdentityMatrix(dArr2);
            MatrixMathHelper.applyTranslate3D(dArr2, translateForTransformOrigin[0], translateForTransformOrigin[1], translateForTransformOrigin[2]);
            MatrixMathHelper.multiplyInto(result, result, dArr2);
        }
        if (transforms.size() == 16 && transforms.getType(0) == ReadableType.Number) {
            MatrixMathHelper.resetIdentityMatrix(dArr2);
            int size = transforms.size();
            for (int i11 = 0; i11 < size; i11++) {
                dArr2[i11] = transforms.getDouble(i11);
            }
            MatrixMathHelper.multiplyInto(result, result, dArr2);
        } else {
            int size2 = transforms.size();
            int i12 = 0;
            while (i12 < size2) {
                ReadableMap map = transforms.getMap(i12);
                Intrinsics.e(map);
                String strNextKey = map.keySetIterator().nextKey();
                MatrixMathHelper.resetIdentityMatrix(dArr2);
                int i13 = i12;
                switch (strNextKey.hashCode()) {
                    case -1721943862:
                        i7 = size2;
                        c6 = 16;
                        if (!strNextKey.equals(ViewProps.TRANSLATE_X)) {
                            p229p2.a.v("ReactNative", "Unsupported transform type: ".concat(strNextKey));
                        } else {
                            if (map.getType(strNextKey) == ReadableType.String && allowPercentageResolution) {
                                TransformHelper transformHelper = INSTANCE;
                                String string = map.getString(strNextKey);
                                Intrinsics.e(string);
                                translateValue = transformHelper.parseTranslateValue(string, viewWidth);
                            } else {
                                translateValue = map.getDouble(strNextKey);
                            }
                            MatrixMathHelper.applyTranslate2D(dArr2, translateValue, 0.0d);
                        }
                        break;
                    case -1721943861:
                        i7 = size2;
                        c6 = 16;
                        if (strNextKey.equals(ViewProps.TRANSLATE_Y)) {
                            if (map.getType(strNextKey) == ReadableType.String && allowPercentageResolution) {
                                TransformHelper transformHelper2 = INSTANCE;
                                String string2 = map.getString(strNextKey);
                                Intrinsics.e(string2);
                                translateValue2 = transformHelper2.parseTranslateValue(string2, viewHeight);
                            } else {
                                translateValue2 = map.getDouble(strNextKey);
                            }
                            MatrixMathHelper.applyTranslate2D(dArr2, 0.0d, translateValue2);
                        } else {
                            p229p2.a.v("ReactNative", "Unsupported transform type: ".concat(strNextKey));
                        }
                        break;
                    case -1081239615:
                        i7 = size2;
                        c6 = 16;
                        if (strNextKey.equals("matrix")) {
                            ReadableArray array = map.getArray(strNextKey);
                            Intrinsics.e(array);
                            for (int i14 = 0; i14 < 16; i14++) {
                                dArr2[i14] = array.getDouble(i14);
                            }
                        } else {
                            p229p2.a.v("ReactNative", "Unsupported transform type: ".concat(strNextKey));
                        }
                        break;
                    case -925180581:
                        i7 = size2;
                        c6 = 16;
                        if (strNextKey.equals("rotate")) {
                            MatrixMathHelper.applyRotateZ(dArr2, INSTANCE.convertToRadians(map, strNextKey));
                        } else {
                            p229p2.a.v("ReactNative", "Unsupported transform type: ".concat(strNextKey));
                        }
                        break;
                    case -908189618:
                        i7 = size2;
                        c6 = 16;
                        if (strNextKey.equals(ViewProps.SCALE_X)) {
                            MatrixMathHelper.applyScaleX(dArr2, map.getDouble(strNextKey));
                        } else {
                            p229p2.a.v("ReactNative", "Unsupported transform type: ".concat(strNextKey));
                        }
                        break;
                    case -908189617:
                        i7 = size2;
                        c6 = 16;
                        if (strNextKey.equals(ViewProps.SCALE_Y)) {
                            MatrixMathHelper.applyScaleY(dArr2, map.getDouble(strNextKey));
                        } else {
                            p229p2.a.v("ReactNative", "Unsupported transform type: ".concat(strNextKey));
                        }
                        break;
                    case 109250890:
                        i7 = size2;
                        c6 = 16;
                        if (strNextKey.equals("scale")) {
                            double d2 = map.getDouble(strNextKey);
                            MatrixMathHelper.applyScaleX(dArr2, d2);
                            MatrixMathHelper.applyScaleY(dArr2, d2);
                        } else {
                            p229p2.a.v("ReactNative", "Unsupported transform type: ".concat(strNextKey));
                        }
                        break;
                    case 109493390:
                        i7 = size2;
                        c6 = 16;
                        if (strNextKey.equals("skewX")) {
                            MatrixMathHelper.applySkewX(dArr2, INSTANCE.convertToRadians(map, strNextKey));
                        } else {
                            p229p2.a.v("ReactNative", "Unsupported transform type: ".concat(strNextKey));
                        }
                        break;
                    case 109493391:
                        i7 = size2;
                        c6 = 16;
                        if (strNextKey.equals("skewY")) {
                            MatrixMathHelper.applySkewY(dArr2, INSTANCE.convertToRadians(map, strNextKey));
                        } else {
                            p229p2.a.v("ReactNative", "Unsupported transform type: ".concat(strNextKey));
                        }
                        break;
                    case 207960636:
                        i7 = size2;
                        c6 = 16;
                        if (strNextKey.equals("perspective")) {
                            MatrixMathHelper.applyPerspective(dArr2, map.getDouble(strNextKey));
                        } else {
                            p229p2.a.v("ReactNative", "Unsupported transform type: ".concat(strNextKey));
                        }
                        break;
                    case 1052832078:
                        if (strNextKey.equals("translate")) {
                            ReadableArray array2 = map.getArray(strNextKey);
                            Intrinsics.e(array2);
                            ReadableType type = array2.getType(0);
                            ReadableType readableType = ReadableType.String;
                            if (type == readableType && allowPercentageResolution) {
                                TransformHelper transformHelper3 = INSTANCE;
                                String string3 = array2.getString(0);
                                Intrinsics.e(string3);
                                translateValue3 = transformHelper3.parseTranslateValue(string3, viewWidth);
                            } else {
                                translateValue3 = array2.getDouble(0);
                            }
                            if (array2.getType(i10) == readableType && allowPercentageResolution) {
                                TransformHelper transformHelper4 = INSTANCE;
                                String string4 = array2.getString(i10);
                                Intrinsics.e(string4);
                                translateValue4 = transformHelper4.parseTranslateValue(string4, viewHeight);
                            } else {
                                translateValue4 = array2.getDouble(i10);
                            }
                            dArr2 = dArr2;
                            double d10 = translateValue4;
                            i7 = size2;
                            c6 = 16;
                            MatrixMathHelper.applyTranslate3D(dArr2, translateValue3, d10, array2.size() > 2 ? array2.getDouble(2) : 0.0d);
                        } else {
                            i7 = size2;
                            c6 = 16;
                            p229p2.a.v("ReactNative", "Unsupported transform type: ".concat(strNextKey));
                        }
                        break;
                    case 1384173149:
                        if (strNextKey.equals("rotateX")) {
                            MatrixMathHelper.applyRotateX(dArr2, INSTANCE.convertToRadians(map, strNextKey));
                            i7 = size2;
                            c6 = 16;
                        }
                        i7 = size2;
                        c6 = 16;
                        p229p2.a.v("ReactNative", "Unsupported transform type: ".concat(strNextKey));
                        break;
                    case 1384173150:
                        if (strNextKey.equals("rotateY")) {
                            MatrixMathHelper.applyRotateY(dArr2, INSTANCE.convertToRadians(map, strNextKey));
                            i7 = size2;
                            c6 = 16;
                        }
                        i7 = size2;
                        c6 = 16;
                        p229p2.a.v("ReactNative", "Unsupported transform type: ".concat(strNextKey));
                        break;
                    case 1384173151:
                        if (strNextKey.equals("rotateZ")) {
                            i7 = size2;
                            c6 = 16;
                            MatrixMathHelper.applyRotateZ(dArr2, INSTANCE.convertToRadians(map, strNextKey));
                        }
                        i7 = size2;
                        c6 = 16;
                        p229p2.a.v("ReactNative", "Unsupported transform type: ".concat(strNextKey));
                        break;
                    default:
                        i7 = size2;
                        c6 = 16;
                        p229p2.a.v("ReactNative", "Unsupported transform type: ".concat(strNextKey));
                        break;
                }
                MatrixMathHelper.multiplyInto(result, result, dArr2);
                i12 = i13 + 1;
                size2 = i7;
                i10 = 1;
            }
        }
        if (translateForTransformOrigin != null) {
            MatrixMathHelper.resetIdentityMatrix(dArr2);
            MatrixMathHelper.applyTranslate3D(dArr2, -translateForTransformOrigin[0], -translateForTransformOrigin[1], -translateForTransformOrigin[2]);
            MatrixMathHelper.multiplyInto(result, result, dArr2);
        }
    }
}
