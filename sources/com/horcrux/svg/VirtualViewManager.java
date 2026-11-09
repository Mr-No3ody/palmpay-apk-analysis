package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.util.SparseArray;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.MatrixMathHelper;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.TransformHelper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.google.api.Service;
import com.horcrux.svg.VirtualView;
import java.util.Locale;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
class VirtualViewManager<V extends VirtualView> extends ViewGroupManager<VirtualView> {
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = 5.0f;
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    protected final String mClassName;
    protected ViewManagerDelegate<V> mDelegate;
    protected final SVGClass svgClass;
    private static final MatrixMathHelper.MatrixDecompositionContext sMatrixDecompositionContext = new MatrixMathHelper.MatrixDecompositionContext();
    private static final double[] sTransformDecompositionArray = new double[16];
    private static final SparseArray<RenderableView> mTagToRenderableView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    public enum SVGClass {
        RNSVGGroup,
        RNSVGPath,
        RNSVGText,
        RNSVGTSpan,
        RNSVGTextPath,
        RNSVGImage,
        RNSVGCircle,
        RNSVGEllipse,
        RNSVGLine,
        RNSVGRect,
        RNSVGClipPath,
        RNSVGDefs,
        RNSVGUse,
        RNSVGSymbol,
        RNSVGLinearGradient,
        RNSVGRadialGradient,
        RNSVGPattern,
        RNSVGMask,
        RNSVGFilter,
        RNSVGFeBlend,
        RNSVGFeColorMatrix,
        RNSVGFeComposite,
        RNSVGFeFlood,
        RNSVGFeGaussianBlur,
        RNSVGFeMerge,
        RNSVGFeOffset,
        RNSVGMarker,
        RNSVGForeignObject
    }

    public VirtualViewManager(SVGClass sVGClass) {
        this.svgClass = sVGClass;
        this.mClassName = sVGClass.toString();
    }

    @Nullable
    public static RenderableView getRenderableViewByTag(int i7) {
        return mTagToRenderableView.get(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateSvgView(V v3) {
        SvgView svgView = v3.getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
        if (v3 instanceof TextView) {
            TextView textView = (TextView) v3;
            ViewParent parent = textView.getParent();
            while (parent instanceof TextView) {
                textView = (TextView) parent;
                parent = textView.getParent();
            }
            textView.clearChildCache();
        }
    }

    public static void runWhenViewIsAvailable(int i7, Runnable runnable) {
        mTagToRunnable.put(i7, runnable);
    }

    private static float sanitizeFloatPropertyValue(float f10) {
        if (f10 >= -3.4028235E38f && f10 <= Float.MAX_VALUE) {
            return f10;
        }
        if (f10 < -3.4028235E38f || f10 == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f10 > Float.MAX_VALUE || f10 == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f10)) {
            return 0.0f;
        }
        throw new IllegalStateException("Invalid float property value: " + f10);
    }

    public static void setRenderableView(int i7, RenderableView renderableView) {
        mTagToRenderableView.put(i7, renderableView);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i7);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i7);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return this.mClassName;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return h0.class;
    }

    @ReactProp(name = "clipPath")
    public void setClipPath(V v3, String str) {
        v3.setClipPath(str);
    }

    @ReactProp(name = "clipRule")
    public void setClipRule(V v3, int i7) {
        v3.setClipRule(i7);
    }

    @ReactProp(name = "display")
    public void setDisplay(V v3, String str) {
        v3.setDisplay(str);
    }

    @ReactProp(name = "markerEnd")
    public void setMarkerEnd(V v3, String str) {
        v3.setMarkerEnd(str);
    }

    @ReactProp(name = "markerMid")
    public void setMarkerMid(V v3, String str) {
        v3.setMarkerMid(str);
    }

    @ReactProp(name = "markerStart")
    public void setMarkerStart(V v3, String str) {
        v3.setMarkerStart(str);
    }

    @ReactProp(name = "mask")
    public void setMask(V v3, String str) {
        v3.setMask(str);
    }

    @ReactProp(name = "matrix")
    public void setMatrix(V v3, Dynamic dynamic) {
        v3.setMatrix(dynamic);
    }

    @ReactProp(name = "name")
    public void setName(V v3, String str) {
        v3.setName(str);
    }

    @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
    public void setOpacity(@Nonnull V v3, float f10) {
        v3.setOpacity(f10);
    }

    @ReactProp(name = ViewProps.POINTER_EVENTS)
    public void setPointerEvents(V v3, @Nullable String str) {
        if (str == null) {
            v3.setPointerEvents(PointerEvents.AUTO);
        } else {
            v3.setPointerEvents(PointerEvents.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
        }
    }

    @ReactProp(name = "responsible")
    public void setResponsible(V v3, boolean z3) {
        v3.setResponsible(z3);
    }

    public void setTransformProperty(VirtualView virtualView, ReadableArray readableArray) {
        if (readableArray == null) {
            virtualView.setTranslationX(PixelUtil.toPixelFromDIP(0.0f));
            virtualView.setTranslationY(PixelUtil.toPixelFromDIP(0.0f));
            virtualView.setRotation(0.0f);
            virtualView.setRotationX(0.0f);
            virtualView.setRotationY(0.0f);
            virtualView.setScaleX(1.0f);
            virtualView.setScaleY(1.0f);
            virtualView.setCameraDistance(0.0f);
            return;
        }
        MatrixMathHelper.MatrixDecompositionContext matrixDecompositionContext = sMatrixDecompositionContext;
        matrixDecompositionContext.reset();
        double[] dArr = sTransformDecompositionArray;
        TransformHelper.processTransform(readableArray, dArr, virtualView.getWidth(), virtualView.getHeight(), null, false);
        MatrixMathHelper.decomposeMatrix(dArr, matrixDecompositionContext);
        virtualView.setTranslationX(PixelUtil.toPixelFromDIP(sanitizeFloatPropertyValue((float) matrixDecompositionContext.translation[0])));
        virtualView.setTranslationY(PixelUtil.toPixelFromDIP(sanitizeFloatPropertyValue((float) matrixDecompositionContext.translation[1])));
        virtualView.setRotation(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[2]));
        virtualView.setRotationX(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[0]));
        virtualView.setRotationY(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[1]));
        virtualView.setScaleX(sanitizeFloatPropertyValue((float) matrixDecompositionContext.scale[0]));
        virtualView.setScaleY(sanitizeFloatPropertyValue((float) matrixDecompositionContext.scale[1]));
        double[] dArr2 = matrixDecompositionContext.perspective;
        if (dArr2.length > 2) {
            float f10 = (float) dArr2[2];
            if (f10 == 0.0f) {
                f10 = 7.8125E-4f;
            }
            float f11 = (-1.0f) / f10;
            float f12 = DisplayMetricsHolder.getScreenDisplayMetrics().density;
            virtualView.setCameraDistance(f12 * f12 * f11 * 5.0f);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@Nonnull ThemedReactContext themedReactContext, @Nonnull VirtualView virtualView) {
        super.addEventEmitters(themedReactContext, virtualView);
        virtualView.setOnHierarchyChangeListener(new f0(this));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new h0();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public VirtualView createViewInstance(@Nonnull ThemedReactContext themedReactContext) {
        switch (g0.f23469a[this.svgClass.ordinal()]) {
            case 1:
                return new GroupView(themedReactContext);
            case 2:
                PathView pathView = new PathView(themedReactContext);
                org.chromium.support_lib_boundary.util.b.f41031b = pathView.mScale;
                pathView.f23349a = new Path();
                return pathView;
            case 3:
                return new CircleView(themedReactContext);
            case 4:
                return new EllipseView(themedReactContext);
            case 5:
                return new LineView(themedReactContext);
            case 6:
                return new RectView(themedReactContext);
            case 7:
                return new TextView(themedReactContext);
            case 8:
                return new TSpanView(themedReactContext);
            case 9:
                return new TextPathView(themedReactContext);
            case 10:
                return new ImageView(themedReactContext);
            case 11:
                return new ClipPathView(themedReactContext);
            case 12:
                return new DefsView(themedReactContext);
            case 13:
                return new UseView(themedReactContext);
            case 14:
                return new SymbolView(themedReactContext);
            case 15:
                LinearGradientView linearGradientView = new LinearGradientView(themedReactContext);
                linearGradientView.f23330g = null;
                return linearGradientView;
            case 16:
                RadialGradientView radialGradientView = new RadialGradientView(themedReactContext);
                radialGradientView.f23372j = null;
                return radialGradientView;
            case 17:
                PatternView patternView = new PatternView(themedReactContext);
                patternView.f23354H = null;
                return patternView;
            case 18:
                return new MaskView(themedReactContext);
            case 19:
                return new FilterView(themedReactContext);
            case 20:
                FeBlendView feBlendView = new FeBlendView(themedReactContext);
                C1420q c1420q = new C1420q(0.0d);
                FilterRegion filterRegion = feBlendView.f23294b;
                filterRegion.mX = c1420q;
                filterRegion.mY = new C1420q(0.0d);
                filterRegion.mW = new C1420q("100%");
                filterRegion.mH = new C1420q("100%");
                return feBlendView;
            case 21:
                return new FeColorMatrixView(themedReactContext);
            case 22:
                return new FeCompositeView(themedReactContext);
            case 23:
                FeFloodView feFloodView = new FeFloodView(themedReactContext);
                feFloodView.f23285d = 1.0f;
                return feFloodView;
            case 24:
                return new FeGaussianBlurView(themedReactContext);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new FeMergeView(themedReactContext);
            case 26:
                return new FeOffsetView(themedReactContext);
            case 27:
                MarkerView markerView = new MarkerView(themedReactContext);
                markerView.f23334H = new Matrix();
                return markerView;
            case 28:
                ForeignObjectView foreignObjectView = new ForeignObjectView(themedReactContext);
                foreignObjectView.f23303o = new Canvas(Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888));
                return foreignObjectView;
            default:
                throw new IllegalStateException("Unexpected type " + this.svgClass.toString());
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@Nonnull VirtualView virtualView) {
        super.onAfterUpdateTransaction(virtualView);
        invalidateSvgView(virtualView);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@Nonnull VirtualView virtualView) {
        super.onDropViewInstance(virtualView);
        mTagToRenderableView.remove(virtualView.getId());
    }

    public void setMatrix(V v3, @Nullable ReadableArray readableArray) {
        v3.setMatrix(readableArray);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setTransform(VirtualView virtualView, @Nullable ReadableArray readableArray) {
        setTransformProperty(virtualView, readableArray);
        Matrix matrix = virtualView.getMatrix();
        virtualView.mMatrix = matrix;
        virtualView.mInvertible = matrix.invert(virtualView.mInvMatrix);
    }

    @ReactProp(name = ViewProps.TRANSFORM)
    public void setTransform(V v3, Dynamic dynamic) {
        if (dynamic.getType() != ReadableType.Array) {
            return;
        }
        setTransform((VirtualView) v3, dynamic.asArray());
    }
}
