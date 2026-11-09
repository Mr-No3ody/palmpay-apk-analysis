package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.touch.ReactHitSlopView;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.google.android.flexbox.FlexItem;
import com.horcrux.svg.events.SvgOnLayoutEvent;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RenderableView extends VirtualView implements ReactHitSlopView {
    private static final int CAP_BUTT = 0;
    static final int CAP_ROUND = 1;
    private static final int CAP_SQUARE = 2;
    private static final int FILL_RULE_EVENODD = 0;
    static final int FILL_RULE_NONZERO = 1;
    private static final int JOIN_BEVEL = 2;
    private static final int JOIN_MITER = 0;
    static final int JOIN_ROUND = 1;
    private static final int VECTOR_EFFECT_DEFAULT = 0;
    private static final int VECTOR_EFFECT_NON_SCALING_STROKE = 1;
    static RenderableView contextElement;
    private static final Pattern regex = Pattern.compile("[0-9.-]+");

    @Nullable
    public ReadableArray fill;
    public float fillOpacity;
    public Path.FillType fillRule;

    @Nullable
    private ArrayList<String> mAttributeList;

    @Nullable
    private RenderableView mCaller;
    private int mCurrentColor;

    @Nullable
    String mFilter;

    @Nullable
    private ArrayList<String> mLastMergedList;

    @Nullable
    private ArrayList<Object> mOriginProperties;

    @Nullable
    private ArrayList<String> mPropList;

    @Nullable
    public ReadableArray stroke;

    @Nullable
    public C1420q[] strokeDasharray;
    public float strokeDashoffset;
    public Paint.Cap strokeLinecap;
    public Paint.Join strokeLinejoin;
    public float strokeMiterlimit;
    public float strokeOpacity;
    public C1420q strokeWidth;
    public int vectorEffect;

    public RenderableView(ReactContext reactContext) {
        super(reactContext);
        this.vectorEffect = 0;
        this.strokeWidth = new C1420q(1.0d);
        this.strokeOpacity = 1.0f;
        this.strokeMiterlimit = 4.0f;
        this.strokeDashoffset = 0.0f;
        this.strokeLinecap = Paint.Cap.BUTT;
        this.strokeLinejoin = Paint.Join.MITER;
        this.mCurrentColor = 0;
        this.fillOpacity = 1.0f;
        this.fillRule = Path.FillType.WINDING;
        setPivotX(0.0f);
        setPivotY(0.0f);
    }

    private ArrayList<String> getAttributeList() {
        return this.mAttributeList;
    }

    private boolean hasOwnProperty(String str) {
        ArrayList<String> arrayList = this.mAttributeList;
        return arrayList != null && arrayList.contains(str);
    }

    private void setupPaint(Paint paint, float f10, ReadableArray readableArray) {
        float f11;
        float f12;
        int[] iArr;
        float[] fArr;
        float[] fArr2;
        int[] iArr2;
        double d2;
        ReadableArray readableArray2;
        RenderableView renderableView;
        ReadableArray readableArray3;
        int i7 = readableArray.getInt(0);
        char c6 = 4;
        if (i7 == 0) {
            if (readableArray.size() != 2) {
                paint.setARGB((int) (readableArray.size() > 4 ? readableArray.getDouble(4) * ((double) f10) * 255.0d : 255.0f * f10), (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
                return;
            } else {
                int iIntValue = readableArray.getType(1) == ReadableType.Map ? ColorPropConverter.getColor(readableArray.getMap(1), getContext()).intValue() : readableArray.getInt(1);
                paint.setColor((iIntValue & FlexItem.MAX_SIZE) | (Math.round((iIntValue >>> 24) * f10) << 24));
                return;
            }
        }
        if (i7 != 1) {
            if (i7 == 2) {
                int currentColor = getCurrentColor();
                paint.setColor((Math.round((currentColor >>> 24) * f10) << 24) | (currentColor & FlexItem.MAX_SIZE));
                return;
            }
            if (i7 != 3) {
                if (i7 != 4 || (renderableView = contextElement) == null || (readableArray3 = renderableView.stroke) == null) {
                    return;
                }
                setupPaint(paint, f10, readableArray3);
                return;
            }
            RenderableView renderableView2 = contextElement;
            if (renderableView2 == null || (readableArray2 = renderableView2.fill) == null) {
                return;
            }
            setupPaint(paint, f10, readableArray2);
            return;
        }
        C1404a definedBrush = getSvgView().getDefinedBrush(readableArray.getString(1));
        if (definedBrush != null) {
            RectF rectF = this.mBox;
            float f13 = this.mScale;
            boolean z3 = definedBrush.f23420d;
            if (!z3) {
                rectF = new RectF(definedBrush.f23423g);
            }
            float fWidth = rectF.width();
            float fHeight = rectF.height();
            if (z3) {
                f12 = rectF.left;
                f11 = rectF.top;
            } else {
                f11 = 0.0f;
                f12 = 0.0f;
            }
            RectF rectF2 = new RectF(f12, f11, fWidth + f12, fHeight + f11);
            float fWidth2 = rectF2.width();
            float fHeight2 = rectF2.height();
            float f14 = rectF2.left;
            float f15 = rectF2.top;
            float textSize = paint.getTextSize();
            C1420q[] c1420qArr = definedBrush.f23418b;
            int i10 = definedBrush.f23417a;
            if (i10 == 3) {
                double d10 = fWidth2;
                double dA = definedBrush.a(c1420qArr[0], d10, f13, textSize);
                double d11 = fHeight2;
                double dA2 = definedBrush.a(c1420qArr[1], d11, f13, textSize);
                double dA3 = definedBrush.a(c1420qArr[2], d10, f13, textSize);
                double dA4 = definedBrush.a(c1420qArr[3], d11, f13, textSize);
                if (dA3 <= 1.0d || dA4 <= 1.0d) {
                    return;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) dA3, (int) dA4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                PatternView patternView = definedBrush.f23424h;
                patternView.getClass();
                float f16 = patternView.t;
                float f17 = patternView.mScale;
                float f18 = patternView.f23361v;
                RectF rectF3 = new RectF(f16 * f17, f18 * f17, (f16 + patternView.f23362w) * f17, (f18 + patternView.f23351A) * f17);
                if (rectF3.width() > 0.0f && rectF3.height() > 0.0f) {
                    RectF rectF4 = new RectF((float) dA, (float) dA2, (float) dA3, (float) dA4);
                    PatternView patternView2 = definedBrush.f23424h;
                    canvas.concat(p377z5.l.n(rectF3, rectF4, patternView2.f23352B, patternView2.f23353C));
                }
                if (definedBrush.f23421e) {
                    canvas.scale(fWidth2 / f13, fHeight2 / f13);
                }
                definedBrush.f23424h.draw(canvas, new Paint(), f10);
                Matrix matrix = new Matrix();
                Matrix matrix2 = definedBrush.f23422f;
                if (matrix2 != null) {
                    matrix.preConcat(matrix2);
                }
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
                bitmapShader.setLocalMatrix(matrix);
                paint.setShader(bitmapShader);
                return;
            }
            int size = definedBrush.f23419c.size();
            if (size == 0) {
                p229p2.a.v("ReactNative", "Gradient contains no stops");
                return;
            }
            int i11 = size / 2;
            int[] iArr3 = new int[i11];
            float[] fArr3 = new float[i11];
            ReadableArray readableArray4 = definedBrush.f23419c;
            int i12 = 0;
            while (i12 < i11) {
                char c10 = c6;
                int i13 = i12 * 2;
                int i14 = i12;
                fArr3[i14] = (float) readableArray4.getDouble(i13);
                int i15 = readableArray4.getInt(i13 + 1);
                iArr3[i14] = (i15 & FlexItem.MAX_SIZE) | (Math.round((i15 >>> 24) * f10) << 24);
                i12 = i14 + 1;
                c6 = c10;
            }
            char c11 = c6;
            if (i11 == 1) {
                int[] iArr4 = {iArr3[0], iArr3[0]};
                float[] fArr4 = {fArr3[0], fArr3[0]};
                p229p2.a.v("ReactNative", "Gradient contains only one stop");
                iArr = iArr4;
                fArr = fArr4;
            } else {
                iArr = iArr3;
                fArr = fArr3;
            }
            if (i10 == 1) {
                double d12 = fWidth2;
                double d13 = f14;
                double dA5 = definedBrush.a(c1420qArr[0], d12, f13, textSize) + d13;
                double d14 = fHeight2;
                double d15 = f15;
                LinearGradient linearGradient = new LinearGradient((float) dA5, (float) (definedBrush.a(c1420qArr[1], d14, f13, textSize) + d15), (float) (d13 + definedBrush.a(c1420qArr[2], d12, f13, textSize)), (float) (definedBrush.a(c1420qArr[3], d14, f13, textSize) + d15), iArr, fArr, Shader.TileMode.CLAMP);
                if (definedBrush.f23422f != null) {
                    Matrix matrix3 = new Matrix();
                    matrix3.preConcat(definedBrush.f23422f);
                    linearGradient.setLocalMatrix(matrix3);
                }
                paint.setShader(linearGradient);
                return;
            }
            int[] iArr5 = iArr;
            float[] fArr5 = fArr;
            if (i10 == 2) {
                double d16 = fWidth2;
                double dA6 = definedBrush.a(c1420qArr[2], d16, f13, textSize);
                double d17 = fHeight2;
                double dA7 = definedBrush.a(c1420qArr[3], d17, f13, textSize);
                if (dA6 <= 0.0d || dA7 <= 0.0d) {
                    fArr2 = new float[]{fArr5[0], fArr5[fArr5.length - 1]};
                    iArr2 = new int[]{iArr5[iArr5.length - 1], iArr5[iArr5.length - 1]};
                    dA6 = d16;
                    d2 = d17;
                } else {
                    iArr2 = iArr5;
                    fArr2 = fArr5;
                    d2 = dA7;
                }
                double d18 = d2 / dA6;
                RadialGradient radialGradient = new RadialGradient((float) (definedBrush.a(c1420qArr[c11], d16, f13, textSize) + ((double) f14)), (float) ((((double) f15) / d18) + definedBrush.a(c1420qArr[5], d17 / d18, f13, textSize)), (float) dA6, iArr2, fArr2, Shader.TileMode.CLAMP);
                Matrix matrix4 = new Matrix();
                matrix4.preScale(1.0f, (float) d18);
                Matrix matrix5 = definedBrush.f23422f;
                if (matrix5 != null) {
                    matrix4.preConcat(matrix5);
                }
                radialGradient.setLocalMatrix(matrix4);
                paint.setShader(radialGradient);
            }
        }
    }

    @Override // com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f10) {
        float f11 = f10 * this.mOpacity;
        boolean z3 = this.mPath == null;
        if (z3) {
            Path path = getPath(canvas, paint);
            this.mPath = path;
            path.setFillType(this.fillRule);
        }
        boolean z8 = this.vectorEffect == 1;
        Path path2 = this.mPath;
        if (z8) {
            path2 = new Path();
            this.mPath.transform(this.mCTM, path2);
            canvas.setMatrix(null);
        }
        if (z3 || path2 != this.mPath) {
            RectF rectF = new RectF();
            this.mBox = rectF;
            path2.computeBounds(rectF, true);
        }
        RectF rectF2 = new RectF(this.mBox);
        this.mCTM.mapRect(rectF2);
        setClientRect(rectF2);
        clip(canvas, paint);
        if (setupFillPaint(paint, this.fillOpacity * f11)) {
            if (z3) {
                Path path3 = new Path();
                this.mFillPath = path3;
                paint.getFillPath(path2, path3);
            }
            canvas.drawPath(path2, paint);
        }
        if (setupStrokePaint(paint, this.strokeOpacity * f11)) {
            if (z3) {
                Path path4 = new Path();
                this.mStrokePath = path4;
                paint.getFillPath(path2, path4);
            }
            canvas.drawPath(path2, paint);
        }
        renderMarkers(canvas, paint, f11);
    }

    public int getCurrentColor() {
        int i7 = this.mCurrentColor;
        if (i7 != 0) {
            return i7;
        }
        RenderableView renderableView = this.mCaller;
        if (renderableView != null) {
            return renderableView.getCurrentColor();
        }
        ViewParent parent = getParent();
        if (parent instanceof VirtualView) {
            return ((RenderableView) parent).getCurrentColor();
        }
        if (parent instanceof SvgView) {
            return ((SvgView) parent).mCurrentColor;
        }
        return 0;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, com.facebook.react.touch.ReactHitSlopView
    @Nullable
    public Rect getHitSlopRect() {
        if (this.mPointerEvents == PointerEvents.BOX_NONE) {
            return new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        return null;
    }

    @Override // com.horcrux.svg.VirtualView
    public abstract Path getPath(Canvas canvas, Paint paint);

    public Region getRegion(Path path, RectF rectF) {
        Region region = new Region();
        region.setPath(path, new Region((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
        return region;
    }

    @Override // com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        Region region;
        Region region2;
        if (this.mPath == null || !this.mInvertible || this.mPointerEvents == PointerEvents.NONE) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        int iRound = Math.round(fArr2[0]);
        int iRound2 = Math.round(fArr2[1]);
        initBounds();
        Region region3 = this.mRegion;
        if ((region3 != null && region3.contains(iRound, iRound2)) || ((region = this.mStrokeRegion) != null && (region.contains(iRound, iRound2) || ((region2 = this.mMarkerRegion) != null && region2.contains(iRound, iRound2))))) {
            if (getClipPath() == null || this.mClipRegion.contains(iRound, iRound2)) {
                return getId();
            }
            return -1;
        }
        return -1;
    }

    public void initBounds() {
        if (this.mRegion == null && this.mFillPath != null) {
            RectF rectF = new RectF();
            this.mFillBounds = rectF;
            this.mFillPath.computeBounds(rectF, true);
            this.mRegion = getRegion(this.mFillPath, this.mFillBounds);
        }
        if (this.mRegion == null && this.mPath != null) {
            RectF rectF2 = new RectF();
            this.mFillBounds = rectF2;
            this.mPath.computeBounds(rectF2, true);
            this.mRegion = getRegion(this.mPath, this.mFillBounds);
        }
        if (this.mStrokeRegion == null && this.mStrokePath != null) {
            RectF rectF3 = new RectF();
            this.mStrokeBounds = rectF3;
            this.mStrokePath.computeBounds(rectF3, true);
            this.mStrokeRegion = getRegion(this.mStrokePath, this.mStrokeBounds);
        }
        if (this.mMarkerRegion == null && this.mMarkerPath != null) {
            RectF rectF4 = new RectF();
            this.mMarkerBounds = rectF4;
            this.mMarkerPath.computeBounds(rectF4, true);
            this.mMarkerRegion = getRegion(this.mMarkerPath, this.mMarkerBounds);
        }
        Path clipPath = getClipPath();
        if (clipPath == null || this.mClipRegionPath == clipPath) {
            return;
        }
        this.mClipRegionPath = clipPath;
        RectF rectF5 = new RectF();
        this.mClipBounds = rectF5;
        clipPath.computeBounds(rectF5, true);
        this.mClipRegion = getRegion(clipPath, this.mClipBounds);
    }

    public void mergeProperties(RenderableView renderableView) {
        this.mCaller = renderableView;
        ArrayList<String> attributeList = renderableView.getAttributeList();
        if (attributeList == null || attributeList.size() == 0) {
            return;
        }
        this.mOriginProperties = new ArrayList<>();
        this.mAttributeList = this.mPropList == null ? new ArrayList<>() : new ArrayList<>(this.mPropList);
        int size = attributeList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                String str = attributeList.get(i7);
                Field field = getClass().getField(str);
                Object obj = field.get(renderableView);
                this.mOriginProperties.add(field.get(this));
                if (!hasOwnProperty(str)) {
                    this.mAttributeList.add(str);
                    field.set(this, obj);
                }
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
        this.mLastMergedList = attributeList;
    }

    public void onReceiveNativeEvent() {
        ((RCTEventEmitter) ((ReactContext) getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), SvgOnLayoutEvent.EVENT_NAME, Arguments.createMap());
    }

    @Override // com.horcrux.svg.VirtualView
    public void render(Canvas canvas, Paint paint, float f10) {
        RectF rectF;
        RectF rectF2;
        MaskView maskView = this.mMask != null ? (MaskView) getSvgView().getDefinedMask(this.mMask) : null;
        FilterView filterView = this.mFilter != null ? (FilterView) getSvgView().getDefinedFilter(this.mFilter) : null;
        if (maskView == null && filterView == null) {
            draw(canvas, paint, f10);
            return;
        }
        if (filterView != null) {
            Paint paint2 = new Paint(2);
            canvas.saveLayer(null, paint2);
            Bitmap currentBitmap = getSvgView().getCurrentBitmap();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            canvas2.setMatrix(canvas.getMatrix());
            draw(canvas2, paint, f10);
            initBounds();
            RectF clientRect = getClientRect();
            if ((this instanceof ImageView) && clientRect == null) {
                return;
            }
            HashMap map = filterView.f23295a;
            map.clear();
            map.put("SourceGraphic", bitmapCreateBitmap);
            map.put("SourceAlpha", FilterUtils.applySourceAlphaFilter(bitmapCreateBitmap));
            map.put("BackgroundImage", currentBitmap);
            map.put("BackgroundAlpha", FilterUtils.applySourceAlphaFilter(currentBitmap));
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getConfig());
            Canvas canvas3 = new Canvas(bitmapCreateBitmap2);
            Rect cropRect = filterView.f23298d.getCropRect(filterView, filterView.f23296b, clientRect);
            int i7 = 0;
            int i10 = 0;
            while (i10 < filterView.getChildCount()) {
                View childAt = filterView.getChildAt(i10);
                if (childAt instanceof FilterPrimitiveView) {
                    FilterPrimitiveView filterPrimitiveView = (FilterPrimitiveView) childAt;
                    bitmapCreateBitmap2.eraseColor(i7);
                    FilterRegion filterRegion = filterPrimitiveView.f23294b;
                    EnumC1410g enumC1410g = filterView.f23297c;
                    Rect cropRect2 = filterRegion.getCropRect(filterPrimitiveView, enumC1410g, enumC1410g == EnumC1410g.USER_SPACE_ON_USE ? new RectF(cropRect) : clientRect);
                    canvas3.drawBitmap(filterPrimitiveView.b(map, bitmapCreateBitmap), cropRect2, cropRect2, (Paint) null);
                    Bitmap bitmapCopy = bitmapCreateBitmap2.copy(Bitmap.Config.ARGB_8888, true);
                    String str = filterPrimitiveView.f23293a;
                    if (str != null) {
                        map.put(str, bitmapCopy);
                    }
                    bitmapCreateBitmap = bitmapCopy;
                } else {
                    Log.e("RNSVG", "Invalid `Filter` child: Filter children can only be `Fe...` components");
                }
                i10++;
                i7 = 0;
            }
            bitmapCreateBitmap2.eraseColor(i7);
            rectF = null;
            canvas3.drawBitmap(bitmapCreateBitmap, cropRect, cropRect, (Paint) null);
            int iSave = canvas.save();
            canvas.setMatrix(null);
            canvas.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, paint2);
            canvas.restoreToCount(iSave);
        } else {
            rectF = null;
            canvas.saveLayer(null, new Paint());
            draw(canvas, paint, f10);
        }
        if (maskView != null) {
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.saveLayer(rectF, paint3);
            if (maskView.f23348p == 1) {
                Paint paint4 = new Paint();
                paint4.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2125f, 0.7154f, 0.0721f, 0.0f, 0.0f})));
                canvas.saveLayer(null, paint4);
            } else {
                canvas.saveLayer(null, paint);
            }
            if (maskView.f23347o == 2) {
                float fRelativeOnWidth = (float) relativeOnWidth(maskView.f23343f);
                float fRelativeOnHeight = (float) relativeOnHeight(maskView.f23344g);
                rectF2 = new RectF(fRelativeOnWidth, fRelativeOnHeight, ((float) relativeOnWidth(maskView.f23345i)) + fRelativeOnWidth, ((float) relativeOnHeight(maskView.f23346j)) + fRelativeOnHeight);
            } else {
                RectF clientRect2 = getClientRect();
                if ((this instanceof ImageView) && clientRect2 == null) {
                    return;
                }
                this.mInvCTM.mapRect(clientRect2);
                float fRelativeOnFraction = (float) relativeOnFraction(maskView.f23343f, clientRect2.width());
                float fRelativeOnFraction2 = (float) relativeOnFraction(maskView.f23344g, clientRect2.height());
                float fRelativeOnFraction3 = (float) relativeOnFraction(maskView.f23345i, clientRect2.width());
                float fRelativeOnFraction4 = (float) relativeOnFraction(maskView.f23346j, clientRect2.height());
                float f11 = clientRect2.left + fRelativeOnFraction;
                float f12 = clientRect2.top + fRelativeOnFraction2;
                rectF2 = new RectF(f11, f12, fRelativeOnFraction3 + f11, fRelativeOnFraction4 + f12);
            }
            canvas.clipRect(rectF2);
            maskView.draw(canvas, paint, 1.0f);
            canvas.restore();
            canvas.saveLayer(null, paint3);
            canvas.clipRect(rectF2);
            maskView.draw(canvas, paint, 1.0f);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00f4 A[PHI: r7
      0x00f4: PHI (r7v24 com.abedelazizshe.lightcompressorlibrary.config.b) = (r7v20 com.abedelazizshe.lightcompressorlibrary.config.b), (r7v26 com.abedelazizshe.lightcompressorlibrary.config.b) binds: [B:39:0x011c, B:30:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00fc A[PHI: r10
      0x00fc: PHI (r10v16 com.abedelazizshe.lightcompressorlibrary.config.b) = (r10v15 com.abedelazizshe.lightcompressorlibrary.config.b), (r10v21 com.abedelazizshe.lightcompressorlibrary.config.b) binds: [B:42:0x0123, B:33:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    public void renderMarkers(Canvas canvas, Paint paint, float f10) {
        char c6;
        int i7;
        int i10;
        MarkerView markerView;
        char c10;
        com.abedelazizshe.lightcompressorlibrary.config.b bVar;
        int i11;
        com.abedelazizshe.lightcompressorlibrary.config.b bVarC;
        com.abedelazizshe.lightcompressorlibrary.config.b bVarC2;
        com.abedelazizshe.lightcompressorlibrary.config.b bVarC3;
        com.abedelazizshe.lightcompressorlibrary.config.b bVarC4;
        com.abedelazizshe.lightcompressorlibrary.config.b bVar2;
        com.abedelazizshe.lightcompressorlibrary.config.b bVarC5;
        long j6;
        MarkerView markerView2 = (MarkerView) getSvgView().getDefinedMarker(this.mMarkerStart);
        MarkerView markerView3 = (MarkerView) getSvgView().getDefinedMarker(this.mMarkerMid);
        MarkerView markerView4 = (MarkerView) getSvgView().getDefinedMarker(this.mMarkerEnd);
        ArrayList<C1415l> arrayList = this.elements;
        if (arrayList != null) {
            if (markerView2 == null && markerView3 == null && markerView4 == null) {
                return;
            }
            contextElement = this;
            C1417n.f23532d = new ArrayList();
            char c11 = 0;
            C1417n.f23533e = 0;
            C1417n.f23534f = new com.abedelazizshe.lightcompressorlibrary.config.b(0.0d, 0.0d);
            C1417n.f23535g = new com.abedelazizshe.lightcompressorlibrary.config.b(0.0d, 0.0d);
            Iterator<C1415l> it = arrayList.iterator();
            while (true) {
                c6 = 4;
                if (!it.hasNext()) {
                    break;
                }
                C1415l next = it.next();
                char c12 = c11;
                com.abedelazizshe.lightcompressorlibrary.config.b[] bVarArr = next.f23530b;
                com.abedelazizshe.lightcompressorlibrary.config.b bVar3 = null;
                int i12 = next.f23529a;
                int i13 = androidx.camera.camera2.internal.F.i(i12);
                if (i13 != 0) {
                    if (i13 == 1) {
                        com.abedelazizshe.lightcompressorlibrary.config.b bVar4 = bVarArr[1];
                        com.abedelazizshe.lightcompressorlibrary.config.b bVar5 = C1417n.f23534f;
                        com.abedelazizshe.lightcompressorlibrary.config.b bVar6 = bVarArr[c12];
                        com.abedelazizshe.lightcompressorlibrary.config.b bVarC6 = C1417n.c(bVar6, bVar5);
                        com.abedelazizshe.lightcompressorlibrary.config.b bVarC7 = C1417n.c(bVar4, bVar6);
                        if (C1417n.b(bVarC6)) {
                            bVarC6 = bVarC7;
                        } else if (C1417n.b(bVarC7)) {
                            bVarC7 = bVarC6;
                        }
                        com.abedelazizshe.lightcompressorlibrary.config.b bVar7 = bVarC6;
                        bVarC4 = bVarC7;
                        bVar2 = bVar4;
                        bVarC5 = bVar7;
                    } else if (i13 == 2 || i13 == 3) {
                        bVar2 = bVarArr[c12];
                        bVarC5 = C1417n.c(bVar2, C1417n.f23534f);
                        bVarC4 = C1417n.c(bVar2, C1417n.f23534f);
                    } else if (i13 != 4) {
                        i11 = 2;
                        bVar = null;
                        bVarC = null;
                        bVar2 = bVar;
                        bVarC4 = bVarC;
                        bVarC5 = bVar3;
                    } else {
                        bVar2 = C1417n.f23535g;
                        bVarC5 = C1417n.c(bVar2, C1417n.f23534f);
                        bVarC4 = C1417n.c(bVar2, C1417n.f23534f);
                    }
                    i11 = 2;
                } else {
                    bVar = bVarArr[2];
                    com.abedelazizshe.lightcompressorlibrary.config.b bVarC8 = C1417n.c(bVarArr[c12], C1417n.f23534f);
                    i11 = 2;
                    bVarC = C1417n.c(bVarArr[2], bVarArr[1]);
                    if (C1417n.b(bVarC8)) {
                        com.abedelazizshe.lightcompressorlibrary.config.b bVar8 = bVarArr[c12];
                        com.abedelazizshe.lightcompressorlibrary.config.b bVar9 = bVarArr[1];
                        com.abedelazizshe.lightcompressorlibrary.config.b bVar10 = bVarArr[2];
                        bVarC2 = C1417n.c(bVar9, bVar8);
                        bVarC3 = C1417n.c(bVar10, bVar9);
                        if (C1417n.b(bVarC2)) {
                            bVarC2 = bVarC3;
                        } else if (C1417n.b(bVarC3)) {
                            bVarC3 = bVarC2;
                        }
                    } else if (C1417n.b(bVarC)) {
                        com.abedelazizshe.lightcompressorlibrary.config.b bVar11 = C1417n.f23534f;
                        com.abedelazizshe.lightcompressorlibrary.config.b bVar12 = bVarArr[c12];
                        com.abedelazizshe.lightcompressorlibrary.config.b bVar13 = bVarArr[1];
                        bVarC2 = C1417n.c(bVar12, bVar11);
                        bVarC3 = C1417n.c(bVar13, bVar12);
                        if (C1417n.b(bVarC2)) {
                            bVarC2 = bVarC3;
                        } else if (C1417n.b(bVarC3)) {
                            bVarC3 = bVarC2;
                        }
                    } else {
                        bVar3 = bVarC8;
                        bVar2 = bVar;
                        bVarC4 = bVarC;
                        bVarC5 = bVar3;
                    }
                    com.abedelazizshe.lightcompressorlibrary.config.b bVar14 = bVarC2;
                    bVarC4 = bVarC3;
                    bVar2 = bVar;
                    bVarC5 = bVar14;
                }
                C1417n.f23537i = bVarC5;
                int i14 = C1417n.f23533e;
                if (i14 > 0) {
                    int i15 = i14 == 1 ? 1 : i11;
                    C1417n.f23532d.add(new C1417n(i15, C1417n.f23534f, C1417n.a(i15)));
                }
                C1417n.f23536h = bVarC4;
                C1417n.f23534f = bVar2;
                if (i12 == 3) {
                    C1417n.f23535g = next.f23530b[c12];
                } else {
                    if (i12 == 5) {
                        j6 = 0;
                        C1417n.f23535g = new com.abedelazizshe.lightcompressorlibrary.config.b(0.0d, 0.0d);
                    }
                    C1417n.f23533e++;
                    c11 = c12;
                    markerView2 = markerView2;
                }
                j6 = 0;
                C1417n.f23533e++;
                c11 = c12;
                markerView2 = markerView2;
            }
            MarkerView markerView5 = markerView2;
            char c13 = c11;
            int i16 = 1;
            int i17 = 2;
            C1417n.f23532d.add(new C1417n(3, C1417n.f23534f, C1417n.a(3)));
            ArrayList arrayList2 = C1417n.f23532d;
            C1420q c1420q = this.strokeWidth;
            float fRelativeOnOther = (float) (c1420q != null ? relativeOnOther(c1420q) : 1.0d);
            this.mMarkerPath = new Path();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C1417n c1417n = (C1417n) it2.next();
                int i18 = androidx.camera.camera2.internal.F.i(c1417n.f23538a);
                if (i18 != 0) {
                    i10 = i16;
                    if (i18 != i10) {
                        i7 = i17;
                        markerView = i18 != i7 ? null : markerView4;
                    } else {
                        i7 = i17;
                        markerView = markerView3;
                    }
                } else {
                    i7 = i17;
                    i10 = i16;
                    markerView = markerView5;
                }
                if (markerView == null) {
                    i16 = i10;
                    i17 = i7;
                } else {
                    int iSaveAndSetupCanvas = markerView.saveAndSetupCanvas(canvas, markerView.mCTM);
                    Matrix matrix = markerView.f23334H;
                    matrix.reset();
                    com.abedelazizshe.lightcompressorlibrary.config.b bVar15 = c1417n.f23539b;
                    char c14 = c6;
                    matrix.setTranslate((float) bVar15.f19294a, (float) bVar15.f19295b);
                    double d2 = "auto".equals(markerView.f23340p) ? -1.0d : Double.parseDouble(markerView.f23340p);
                    matrix.preRotate(((float) (d2 == -1.0d ? c1417n.f23540c : d2)) + 180.0f);
                    if ("strokeWidth".equals(markerView.f23339o)) {
                        float f11 = fRelativeOnOther / markerView.mScale;
                        matrix.preScale(f11, f11);
                    }
                    RectF rectF = new RectF(0.0f, 0.0f, (float) markerView.relativeOnWidth(markerView.f23337i), (float) markerView.relativeOnHeight(markerView.f23338j));
                    if (markerView.f23332B != null) {
                        float f12 = markerView.t;
                        float f13 = markerView.mScale;
                        c10 = c14;
                        float f14 = markerView.f23341v;
                        float[] fArr = new float[9];
                        p377z5.l.n(new RectF(f12 * f13, f14 * f13, (f12 + markerView.f23342w) * f13, (f14 + markerView.f23331A) * f13), rectF, markerView.f23332B, markerView.f23333C).getValues(fArr);
                        matrix.preScale(fArr[c13], fArr[c10]);
                    } else {
                        c10 = c14;
                    }
                    matrix.preTranslate((float) (-markerView.relativeOnWidth(markerView.f23335f)), (float) (-markerView.relativeOnHeight(markerView.f23336g)));
                    canvas.concat(matrix);
                    markerView.b(canvas, paint, f10);
                    markerView.restoreCanvas(canvas, iSaveAndSetupCanvas);
                    this.mMarkerPath.addPath(markerView.getPath(canvas, paint), matrix);
                    c6 = c10;
                    it2 = it2;
                    markerView3 = markerView3;
                    i17 = 2;
                    i16 = 1;
                }
            }
            contextElement = null;
        }
    }

    public void resetProperties() {
        ArrayList<String> arrayList = this.mLastMergedList;
        if (arrayList == null || this.mOriginProperties == null) {
            return;
        }
        try {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                getClass().getField(this.mLastMergedList.get(size)).set(this, this.mOriginProperties.get(size));
            }
            this.mLastMergedList = null;
            this.mOriginProperties = null;
            this.mAttributeList = this.mPropList;
            this.mCaller = null;
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    public void setCurrentColor(Integer num) {
        this.mCurrentColor = num != null ? num.intValue() : 0;
        invalidate();
        clearChildCache();
    }

    public void setFill(@Nullable Dynamic dynamic) {
        if (dynamic == null || dynamic.isNull()) {
            this.fill = null;
            invalidate();
            return;
        }
        ReadableType type = dynamic.getType();
        if (type.equals(ReadableType.Map)) {
            setFill(dynamic.asMap());
            return;
        }
        int i7 = 0;
        if (type.equals(ReadableType.Number)) {
            this.fill = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
        } else if (type.equals(ReadableType.Array)) {
            this.fill = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = regex.matcher(dynamic.asString());
            while (matcher.find()) {
                double d2 = Double.parseDouble(matcher.group());
                int i10 = i7 + 1;
                if (i7 < 3) {
                    d2 /= 255.0d;
                }
                javaOnlyArray.pushDouble(d2);
                i7 = i10;
            }
            this.fill = javaOnlyArray;
        }
        invalidate();
    }

    public void setFillOpacity(float f10) {
        this.fillOpacity = f10;
        invalidate();
    }

    public void setFillRule(int i7) {
        if (i7 == 0) {
            this.fillRule = Path.FillType.EVEN_ODD;
        } else if (i7 != 1) {
            throw new JSApplicationIllegalArgumentException(androidx.camera.camera2.internal.F.c(i7, "fillRule ", " unrecognized"));
        }
        invalidate();
    }

    public void setFilter(String str) {
        this.mFilter = str;
        invalidate();
    }

    @Override // android.view.View
    public void setId(int i7) {
        super.setId(i7);
        VirtualViewManager.setRenderableView(i7, this);
    }

    public void setPropList(@Nullable ReadableArray readableArray) {
        if (readableArray != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.mAttributeList = arrayList;
            this.mPropList = arrayList;
            for (int i7 = 0; i7 < readableArray.size(); i7++) {
                this.mPropList.add(readableArray.getString(i7));
            }
        }
        invalidate();
    }

    public void setStroke(@Nullable Dynamic dynamic) {
        if (dynamic == null || dynamic.isNull()) {
            this.stroke = null;
            invalidate();
            return;
        }
        if (dynamic.getType().equals(ReadableType.Map)) {
            setStroke(dynamic.asMap());
            return;
        }
        ReadableType type = dynamic.getType();
        int i7 = 0;
        if (type.equals(ReadableType.Number)) {
            this.stroke = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
        } else if (type.equals(ReadableType.Array)) {
            this.stroke = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = regex.matcher(dynamic.asString());
            while (matcher.find()) {
                double d2 = Double.parseDouble(matcher.group());
                int i10 = i7 + 1;
                if (i7 < 3) {
                    d2 /= 255.0d;
                }
                javaOnlyArray.pushDouble(d2);
                i7 = i10;
            }
            this.stroke = javaOnlyArray;
        }
        invalidate();
    }

    public void setStrokeDasharray(Dynamic dynamic) {
        ArrayList arrayListA = C1420q.a(dynamic);
        if (arrayListA != null) {
            if (arrayListA.size() % 2 == 1) {
                arrayListA.addAll(arrayListA);
            }
            this.strokeDasharray = (C1420q[]) arrayListA.toArray(new C1420q[0]);
        } else {
            this.strokeDasharray = null;
        }
        invalidate();
    }

    public void setStrokeDashoffset(float f10) {
        this.strokeDashoffset = f10 * this.mScale;
        invalidate();
    }

    public void setStrokeLinecap(int i7) {
        if (i7 == 0) {
            this.strokeLinecap = Paint.Cap.BUTT;
        } else if (i7 == 1) {
            this.strokeLinecap = Paint.Cap.ROUND;
        } else {
            if (i7 != 2) {
                throw new JSApplicationIllegalArgumentException(androidx.camera.camera2.internal.F.c(i7, "strokeLinecap ", " unrecognized"));
            }
            this.strokeLinecap = Paint.Cap.SQUARE;
        }
        invalidate();
    }

    public void setStrokeLinejoin(int i7) {
        if (i7 == 0) {
            this.strokeLinejoin = Paint.Join.MITER;
        } else if (i7 == 1) {
            this.strokeLinejoin = Paint.Join.ROUND;
        } else {
            if (i7 != 2) {
                throw new JSApplicationIllegalArgumentException(androidx.camera.camera2.internal.F.c(i7, "strokeLinejoin ", " unrecognized"));
            }
            this.strokeLinejoin = Paint.Join.BEVEL;
        }
        invalidate();
    }

    public void setStrokeMiterlimit(float f10) {
        this.strokeMiterlimit = f10;
        invalidate();
    }

    public void setStrokeOpacity(float f10) {
        this.strokeOpacity = f10;
        invalidate();
    }

    public void setStrokeWidth(Dynamic dynamic) {
        this.strokeWidth = dynamic.isNull() ? new C1420q(1.0d) : C1420q.b(dynamic);
        invalidate();
    }

    public void setVectorEffect(int i7) {
        this.vectorEffect = i7;
        invalidate();
    }

    public boolean setupFillPaint(Paint paint, float f10) {
        ReadableArray readableArray = this.fill;
        if (readableArray == null || readableArray.size() <= 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(MessageEvent.EVENT_OC_RAISE_COMPLETED);
        paint.setStyle(Paint.Style.FILL);
        setupPaint(paint, f10, this.fill);
        return true;
    }

    public boolean setupStrokePaint(Paint paint, float f10) {
        ReadableArray readableArray;
        paint.reset();
        double dRelativeOnOther = relativeOnOther(this.strokeWidth);
        if (dRelativeOnOther == 0.0d || (readableArray = this.stroke) == null || readableArray.size() == 0) {
            return false;
        }
        paint.setFlags(MessageEvent.EVENT_OC_RAISE_COMPLETED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.strokeLinecap);
        paint.setStrokeJoin(this.strokeLinejoin);
        paint.setStrokeMiter(this.strokeMiterlimit * this.mScale);
        paint.setStrokeWidth((float) dRelativeOnOther);
        setupPaint(paint, f10, this.stroke);
        C1420q[] c1420qArr = this.strokeDasharray;
        if (c1420qArr == null) {
            return true;
        }
        int length = c1420qArr.length;
        float[] fArr = new float[length];
        for (int i7 = 0; i7 < length; i7++) {
            fArr[i7] = (float) relativeOnOther(this.strokeDasharray[i7]);
        }
        paint.setPathEffect(new DashPathEffect(fArr, this.strokeDashoffset));
        return true;
    }

    public void setFill(ReadableMap readableMap) {
        if (readableMap == null) {
            this.fill = null;
            invalidate();
            return;
        }
        int i7 = readableMap.getInt("type");
        if (i7 == 0) {
            ReadableType type = readableMap.getType("payload");
            if (type.equals(ReadableType.Number)) {
                this.fill = JavaOnlyArray.of(0, Integer.valueOf(readableMap.getInt("payload")));
            } else if (type.equals(ReadableType.Map)) {
                this.fill = JavaOnlyArray.of(0, readableMap.getMap("payload"));
            }
        } else if (i7 == 1) {
            this.fill = JavaOnlyArray.of(1, readableMap.getString("brushRef"));
        } else {
            this.fill = JavaOnlyArray.of(Integer.valueOf(i7));
        }
        invalidate();
    }

    public void setStroke(@Nullable ReadableMap readableMap) {
        if (readableMap == null) {
            this.stroke = null;
            invalidate();
            return;
        }
        int i7 = readableMap.getInt("type");
        if (i7 == 0) {
            ReadableType type = readableMap.getType("payload");
            if (type.equals(ReadableType.Number)) {
                this.stroke = JavaOnlyArray.of(0, Integer.valueOf(readableMap.getInt("payload")));
            } else if (type.equals(ReadableType.Map)) {
                this.stroke = JavaOnlyArray.of(0, readableMap.getMap("payload"));
            }
        } else if (i7 == 1) {
            this.stroke = JavaOnlyArray.of(1, readableMap.getString("brushRef"));
        } else {
            this.stroke = JavaOnlyArray.of(Integer.valueOf(i7));
        }
        invalidate();
    }
}
