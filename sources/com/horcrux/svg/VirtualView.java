package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.ReactViewGroup;
import com.horcrux.svg.events.SvgOnLayoutEvent;
import java.util.ArrayList;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public abstract class VirtualView extends ReactViewGroup {
    private static final int CLIP_RULE_EVENODD = 0;
    static final int CLIP_RULE_NONZERO = 1;
    private static final double M_SQRT1_2l = 0.7071067811865476d;
    private static final float[] sRawMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private double canvasDiagonal;
    private float canvasHeight;
    private float canvasWidth;
    ArrayList<C1415l> elements;
    private double fontSize;
    private C1413j glyphContext;
    RectF mBox;
    Matrix mCTM;
    boolean mCTMInvertible;
    private Path mCachedClipPath;
    private RectF mClientRect;
    RectF mClipBounds;

    @Nullable
    private String mClipPath;
    Region mClipRegion;
    Path mClipRegionPath;
    int mClipRule;
    final ReactContext mContext;
    String mDisplay;
    RectF mFillBounds;
    Path mFillPath;
    Matrix mInvCTM;
    Matrix mInvMatrix;
    boolean mInvertible;
    RectF mMarkerBounds;

    @Nullable
    String mMarkerEnd;

    @Nullable
    String mMarkerMid;
    Path mMarkerPath;
    Region mMarkerRegion;

    @Nullable
    String mMarkerStart;

    @Nullable
    String mMask;
    Matrix mMatrix;
    String mName;
    float mOpacity;
    Path mPath;
    PointerEvents mPointerEvents;
    Region mRegion;
    private boolean mResponsible;
    final float mScale;
    RectF mStrokeBounds;
    Path mStrokePath;
    Region mStrokeRegion;
    private GroupView mTextRoot;
    private SvgView svgView;

    public VirtualView(ReactContext reactContext) {
        super(reactContext);
        this.mOpacity = 1.0f;
        this.mCTM = new Matrix();
        this.mMatrix = new Matrix();
        this.mInvCTM = new Matrix();
        this.mInvMatrix = new Matrix();
        this.mInvertible = true;
        this.mCTMInvertible = true;
        this.fontSize = -1.0d;
        this.canvasDiagonal = -1.0d;
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.mContext = reactContext;
        this.mScale = DisplayMetricsHolder.getScreenDisplayMetrics().density;
    }

    private void clearParentCache() {
        VirtualView virtualView = this;
        while (true) {
            ViewParent parent = virtualView.getParent();
            if (!(parent instanceof VirtualView)) {
                return;
            }
            virtualView = (VirtualView) parent;
            if (virtualView.mPath == null) {
                return;
            } else {
                virtualView.clearCache();
            }
        }
    }

    private double fromRelativeFast(C1420q c1420q) {
        double fontSizeFromContext;
        switch (e0.f23456a[c1420q.f23544b.ordinal()]) {
            case 1:
                fontSizeFromContext = getFontSizeFromContext();
                break;
            case 2:
                fontSizeFromContext = getFontSizeFromContext() / 2.0d;
                break;
            case 3:
                fontSizeFromContext = 35.43307d;
                break;
            case 4:
                fontSizeFromContext = 3.543307d;
                break;
            case 5:
                fontSizeFromContext = 90.0d;
                break;
            case 6:
                fontSizeFromContext = 1.25d;
                break;
            case 7:
                fontSizeFromContext = 15.0d;
                break;
            default:
                fontSizeFromContext = 1.0d;
                break;
        }
        return c1420q.f23543a * fontSizeFromContext * ((double) this.mScale);
    }

    private double getCanvasDiagonal() {
        double d2 = this.canvasDiagonal;
        if (d2 != -1.0d) {
            return d2;
        }
        double dSqrt = Math.sqrt(Math.pow(getCanvasHeight(), 2.0d) + Math.pow(getCanvasWidth(), 2.0d)) * M_SQRT1_2l;
        this.canvasDiagonal = dSqrt;
        return dSqrt;
    }

    private float getCanvasHeight() {
        float f10 = this.canvasHeight;
        if (f10 != -1.0f) {
            return f10;
        }
        GroupView textRoot = getTextRoot();
        if (textRoot == null) {
            this.canvasHeight = getSvgView().getCanvasBounds().height();
        } else {
            this.canvasHeight = textRoot.f23305b.f23502O;
        }
        return this.canvasHeight;
    }

    private float getCanvasWidth() {
        float f10 = this.canvasWidth;
        if (f10 != -1.0f) {
            return f10;
        }
        GroupView textRoot = getTextRoot();
        if (textRoot == null) {
            this.canvasWidth = getSvgView().getCanvasBounds().width();
        } else {
            this.canvasWidth = textRoot.f23305b.f23501N;
        }
        return this.canvasWidth;
    }

    private double getFontSizeFromContext() {
        double d2 = this.fontSize;
        if (d2 != -1.0d) {
            return d2;
        }
        GroupView textRoot = getTextRoot();
        if (textRoot == null) {
            return 12.0d;
        }
        if (this.glyphContext == null) {
            this.glyphContext = textRoot.f23305b;
        }
        double d10 = this.glyphContext.f23519q;
        this.fontSize = d10;
        return d10;
    }

    public void clearCache() {
        this.canvasDiagonal = -1.0d;
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.fontSize = -1.0d;
        this.mStrokeRegion = null;
        this.mMarkerRegion = null;
        this.mRegion = null;
        this.mPath = null;
    }

    public void clearChildCache() {
        clearCache();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).clearChildCache();
            }
        }
    }

    public void clip(Canvas canvas, Paint paint) {
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
    }

    public abstract void draw(Canvas canvas, Paint paint, float f10);

    public RectF getClientRect() {
        return this.mClientRect;
    }

    @Nullable
    public Path getClipPath() {
        return this.mCachedClipPath;
    }

    @Nullable
    public GroupView getParentTextRoot() {
        ViewParent parent = getParent();
        if (parent instanceof VirtualView) {
            return ((VirtualView) parent).getTextRoot();
        }
        return null;
    }

    public abstract Path getPath(Canvas canvas, Paint paint);

    @Nullable
    public SvgView getSvgView() {
        SvgView svgView = this.svgView;
        if (svgView != null) {
            return svgView;
        }
        ViewParent parent = getParent();
        if (parent == null) {
            return null;
        }
        if (parent instanceof SvgView) {
            this.svgView = (SvgView) parent;
        } else if (parent instanceof VirtualView) {
            this.svgView = ((VirtualView) parent).getSvgView();
        } else {
            p229p2.a.h("ReactNative", "RNSVG: " + getClass().getName() + " should be descendant of a SvgView.");
        }
        return this.svgView;
    }

    @Nullable
    public GroupView getTextRoot() {
        if (this.mTextRoot == null) {
            VirtualView virtualView = this;
            while (virtualView != null) {
                if (virtualView instanceof GroupView) {
                    GroupView groupView = (GroupView) virtualView;
                    if (groupView.f23305b != null) {
                        this.mTextRoot = groupView;
                        break;
                    }
                }
                ViewParent parent = virtualView.getParent();
                virtualView = !(parent instanceof VirtualView) ? null : (VirtualView) parent;
            }
        }
        return this.mTextRoot;
    }

    public abstract int hitTest(float[] fArr);

    @Override // android.view.View
    public void invalidate() {
        if ((this instanceof RenderableView) && this.mPath == null) {
            return;
        }
        clearCache();
        clearParentCache();
        super.invalidate();
    }

    public boolean isResponsible() {
        return this.mResponsible;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.mClientRect != null) {
            SvgView svgView = getSvgView();
            int[] iArr = new int[2];
            getSvgView().getLocationOnScreen(iArr);
            Rect rect = new Rect();
            boolean z3 = false;
            rect.left = iArr[0] + ((int) Math.floor(this.mClientRect.left));
            rect.top = iArr[1] + ((int) Math.floor(this.mClientRect.top));
            rect.right = rect.left + ((int) Math.ceil(this.mClientRect.width()));
            rect.bottom = rect.top + ((int) Math.ceil(this.mClientRect.height()));
            Rect rect2 = new Rect();
            if (svgView.getGlobalVisibleRect(rect2) && rect.intersect(rect2)) {
                z3 = true;
            }
            String canonicalName = getClass().getCanonicalName();
            accessibilityNodeInfo.setBoundsInScreen(rect);
            accessibilityNodeInfo.setClassName(canonicalName);
            accessibilityNodeInfo.setVisibleToUser(z3);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        RectF rectF = this.mClientRect;
        if (rectF == null) {
            return;
        }
        if (!(this instanceof GroupView)) {
            int iFloor = (int) Math.floor(rectF.left);
            int iFloor2 = (int) Math.floor(this.mClientRect.top);
            int iCeil = (int) Math.ceil(this.mClientRect.right);
            int iCeil2 = (int) Math.ceil(this.mClientRect.bottom);
            setLeft(iFloor);
            setTop(iFloor2);
            setRight(iCeil);
            setBottom(iCeil2);
        }
        setMeasuredDimension((int) Math.ceil(this.mClientRect.width()), (int) Math.ceil(this.mClientRect.height()));
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public void onMeasure(int i7, int i10) {
        RectF rectF = this.mClientRect;
        int iCeil = rectF != null ? (int) Math.ceil(rectF.width()) : View.getDefaultSize(getSuggestedMinimumWidth(), i7);
        RectF rectF2 = this.mClientRect;
        setMeasuredDimension(iCeil, rectF2 != null ? (int) Math.ceil(rectF2.height()) : View.getDefaultSize(getSuggestedMinimumHeight(), i10));
    }

    public double relativeOn(C1420q c1420q, float f10) {
        double d2;
        SVGLength$UnitType sVGLength$UnitType = c1420q.f23544b;
        SVGLength$UnitType sVGLength$UnitType2 = SVGLength$UnitType.NUMBER;
        double d10 = c1420q.f23543a;
        if (sVGLength$UnitType == sVGLength$UnitType2) {
            d2 = this.mScale;
        } else {
            if (sVGLength$UnitType != SVGLength$UnitType.PERCENTAGE) {
                return fromRelativeFast(c1420q);
            }
            d10 /= 100.0d;
            d2 = f10;
        }
        return d10 * d2;
    }

    public double relativeOnFraction(C1420q c1420q, float f10) {
        SVGLength$UnitType sVGLength$UnitType = c1420q.f23544b;
        SVGLength$UnitType sVGLength$UnitType2 = SVGLength$UnitType.NUMBER;
        double d2 = c1420q.f23543a;
        if (sVGLength$UnitType != sVGLength$UnitType2) {
            if (sVGLength$UnitType != SVGLength$UnitType.PERCENTAGE) {
                return fromRelativeFast(c1420q);
            }
            d2 /= 100.0d;
        }
        return d2 * ((double) f10);
    }

    public double relativeOnHeight(C1420q c1420q) {
        SvgView svgView = getSvgView();
        return (c1420q.f23544b != SVGLength$UnitType.PERCENTAGE || svgView == null || svgView.getViewBox().height() == 0.0f) ? relativeOn(c1420q, getCanvasHeight()) : relativeOn(c1420q, svgView.getViewBox().height());
    }

    public double relativeOnOther(C1420q c1420q) {
        return relativeOn(c1420q, (float) getCanvasDiagonal());
    }

    public double relativeOnWidth(C1420q c1420q) {
        SvgView svgView = getSvgView();
        return (c1420q.f23544b != SVGLength$UnitType.PERCENTAGE || svgView == null || svgView.getViewBox().width() == 0.0f) ? relativeOn(c1420q, getCanvasWidth()) : relativeOn(c1420q, svgView.getViewBox().width());
    }

    public void render(Canvas canvas, Paint paint, float f10) {
        draw(canvas, paint, f10);
    }

    public void restoreCanvas(Canvas canvas, int i7) {
        canvas.restoreToCount(i7);
    }

    public int saveAndSetupCanvas(Canvas canvas, Matrix matrix) {
        int iSave = canvas.save();
        this.mCTM.set(this.mMatrix);
        canvas.concat(this.mCTM);
        this.mCTM.preConcat(matrix);
        this.mCTMInvertible = this.mCTM.invert(this.mInvCTM);
        return iSave;
    }

    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
    }

    public void setClientRect(RectF rectF) {
        SvgView svgView;
        RectF rectF2 = this.mClientRect;
        if (rectF2 == null || !rectF2.equals(rectF)) {
            this.mClientRect = rectF;
            if (rectF == null) {
                return;
            }
            int iCeil = (int) Math.ceil(rectF.width());
            int iCeil2 = (int) Math.ceil(this.mClientRect.height());
            int iFloor = (int) Math.floor(this.mClientRect.left);
            int iFloor2 = (int) Math.floor(this.mClientRect.top);
            int iCeil3 = (int) Math.ceil(this.mClientRect.right);
            int iCeil4 = (int) Math.ceil(this.mClientRect.bottom);
            setMeasuredDimension(iCeil, iCeil2);
            if (!(this instanceof GroupView) && (svgView = getSvgView()) != null) {
                setLeft(Math.max(iFloor, 0));
                setTop(Math.max(iFloor2, 0));
                setRight(Math.min(iCeil3, svgView.getWidth()));
                setBottom(Math.min(iCeil4, svgView.getHeight()));
            }
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.mContext, getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(new SvgOnLayoutEvent(UIManagerHelper.getSurfaceId(this), getId(), iFloor, iFloor2, iCeil, iCeil2));
            }
        }
    }

    public void setClipPath(String str) {
        this.mCachedClipPath = null;
        this.mClipPath = str;
        invalidate();
    }

    public void setClipRule(int i7) {
        this.mClipRule = i7;
        invalidate();
    }

    public void setDisplay(String str) {
        this.mDisplay = str;
        invalidate();
    }

    public void setMarkerEnd(String str) {
        this.mMarkerEnd = str;
        invalidate();
    }

    public void setMarkerMid(String str) {
        this.mMarkerMid = str;
        invalidate();
    }

    public void setMarkerStart(String str) {
        this.mMarkerStart = str;
        invalidate();
    }

    public void setMask(String str) {
        this.mMask = str;
        invalidate();
    }

    public void setMatrix(Dynamic dynamic) {
        setMatrix((dynamic.isNull() || !dynamic.getType().equals(ReadableType.Array)) ? null : dynamic.asArray());
    }

    public void setName(String str) {
        this.mName = str;
        invalidate();
    }

    public void setOpacity(float f10) {
        this.mOpacity = f10;
        invalidate();
    }

    @Override // com.facebook.react.views.view.ReactViewGroup
    public void setPointerEvents(PointerEvents pointerEvents) {
        this.mPointerEvents = pointerEvents;
    }

    public void setResponsible(boolean z3) {
        this.mResponsible = z3;
        invalidate();
    }

    @Nullable
    public Path getClipPath(Canvas canvas, Paint paint) {
        Path pathD;
        if (this.mClipPath != null) {
            ClipPathView clipPathView = (ClipPathView) getSvgView().getDefinedClipPath(this.mClipPath);
            if (clipPathView != null) {
                if (this.mClipRule == 0) {
                    pathD = clipPathView.getPath(canvas, paint);
                } else {
                    Region.Op op = Region.Op.UNION;
                    pathD = clipPathView.d(canvas, paint);
                }
                pathD.transform(clipPathView.mMatrix);
                int i7 = this.mClipRule;
                if (i7 == 0) {
                    pathD.setFillType(Path.FillType.EVEN_ODD);
                } else if (i7 != 1) {
                    p229p2.a.v("ReactNative", "RNSVG: clipRule: " + this.mClipRule + " unrecognized");
                }
                this.mCachedClipPath = pathD;
            } else {
                p229p2.a.v("ReactNative", "RNSVG: Undefined clipPath: " + this.mClipPath);
            }
        }
        return getClipPath();
    }

    public void setMatrix(@Nullable ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = sRawMatrix;
            int iJ = p264r5.a.J(readableArray, fArr, this.mScale);
            if (iJ == 6) {
                if (this.mMatrix == null) {
                    this.mMatrix = new Matrix();
                    this.mInvMatrix = new Matrix();
                }
                this.mMatrix.setValues(fArr);
                this.mInvertible = this.mMatrix.invert(this.mInvMatrix);
            } else if (iJ != -1) {
                p229p2.a.v("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.mMatrix.reset();
            this.mInvMatrix.reset();
            this.mInvertible = true;
        }
        super.invalidate();
        clearParentCache();
    }
}
