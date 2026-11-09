package com.facebook.react.uimanager.drawable;

import N8.q0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.core.graphics.d;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.Spacing;
import com.facebook.react.uimanager.style.BackgroundImageLayer;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import com.facebook.react.uimanager.style.CornerRadii;
import com.google.android.flexbox.FlexItem;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(a.f41451a)
@UnstableReactNativeAPI
public class CSSBackgroundDrawable extends Drawable {
    private static final int ALL_BITS_SET = -1;
    private static final int ALL_BITS_UNSET = 0;
    private static final int DEFAULT_BORDER_ALPHA = 255;
    private static final int DEFAULT_BORDER_COLOR = -16777216;
    private static final int DEFAULT_BORDER_RGB = 0;

    @Nullable
    private Path mBackgroundColorRenderPath;

    @Nullable
    private Spacing mBorderAlpha;

    @Nullable
    private Spacing mBorderRGB;

    @Nullable
    private BorderStyle mBorderStyle;

    @Nullable
    private Spacing mBorderWidth;

    @Nullable
    private Path mCenterDrawPath;
    private final Context mContext;

    @Nullable
    private PointF mInnerBottomLeftCorner;

    @Nullable
    private PointF mInnerBottomRightCorner;

    @Nullable
    private Path mInnerClipPathForBorderRadius;

    @Nullable
    private RectF mInnerClipTempRectForBorderRadius;

    @Nullable
    private PointF mInnerTopLeftCorner;

    @Nullable
    private PointF mInnerTopRightCorner;

    @Nullable
    private Path mOuterClipPathForBorderRadius;

    @Nullable
    private RectF mOuterClipTempRectForBorderRadius;

    @Nullable
    private Path mPathForBorder;

    @Nullable
    private Path mPathForBorderRadiusOutline;

    @Nullable
    private RectF mTempRectForBorderRadiusOutline;

    @Nullable
    private RectF mTempRectForCenterDrawPath;
    private final Path mPathForSingleBorder = new Path();
    private boolean mNeedUpdatePathForBorderRadius = false;
    private final Paint mPaint = new Paint(1);
    private int mColor = 0;

    @Nullable
    private List<BackgroundImageLayer> mBackgroundImageLayers = null;
    private int mAlpha = 255;
    private final float mGapBetweenPaths = 0.8f;
    private BorderRadiusStyle mBorderRadius = new BorderRadiusStyle();
    private ComputedBorderRadius mComputedBorderRadius = new ComputedBorderRadius();
    private int mLayoutDirectionOverride = -1;

    /* JADX INFO: renamed from: com.facebook.react.uimanager.drawable.CSSBackgroundDrawable$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$uimanager$style$BorderStyle;

        static {
            int[] iArr = new int[BorderStyle.values().length];
            $SwitchMap$com$facebook$react$uimanager$style$BorderStyle = iArr;
            try {
                iArr[BorderStyle.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$style$BorderStyle[BorderStyle.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$style$BorderStyle[BorderStyle.DOTTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public CSSBackgroundDrawable(Context context) {
        this.mContext = context;
    }

    private static int colorFromAlphaAndRGBComponents(float f10, float f11) {
        return ((((int) f10) << 24) & DEFAULT_BORDER_COLOR) | (((int) f11) & FlexItem.MAX_SIZE);
    }

    private void drawQuadrilateral(Canvas canvas, int i7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        if (i7 == 0) {
            return;
        }
        if (this.mPathForBorder == null) {
            this.mPathForBorder = new Path();
        }
        this.mPaint.setColor(i7);
        this.mPathForBorder.reset();
        this.mPathForBorder.moveTo(f10, f11);
        this.mPathForBorder.lineTo(f12, f13);
        this.mPathForBorder.lineTo(f14, f15);
        this.mPathForBorder.lineTo(f16, f17);
        this.mPathForBorder.lineTo(f10, f11);
        canvas.drawPath(this.mPathForBorder, this.mPaint);
    }

    private void drawRectangularBackgroundWithBorders(Canvas canvas) {
        int i7;
        CSSBackgroundDrawable cSSBackgroundDrawable;
        this.mPaint.setStyle(Paint.Style.FILL);
        int iMultiplyColorAlpha = multiplyColorAlpha(this.mColor, this.mAlpha);
        if (Color.alpha(iMultiplyColorAlpha) != 0) {
            this.mPaint.setColor(iMultiplyColorAlpha);
            canvas.drawRect(getBounds(), this.mPaint);
        }
        List<BackgroundImageLayer> list = this.mBackgroundImageLayers;
        if (list != null && !list.isEmpty()) {
            this.mPaint.setShader(getBackgroundImageShader());
            canvas.drawRect(getBounds(), this.mPaint);
            this.mPaint.setShader(null);
        }
        RectF directionAwareBorderInsets = getDirectionAwareBorderInsets();
        int iRound = Math.round(directionAwareBorderInsets.left);
        int iRound2 = Math.round(directionAwareBorderInsets.top);
        int iRound3 = Math.round(directionAwareBorderInsets.right);
        int iRound4 = Math.round(directionAwareBorderInsets.bottom);
        if (iRound > 0 || iRound3 > 0 || iRound2 > 0 || iRound4 > 0) {
            Rect bounds = getBounds();
            int borderColor = getBorderColor(0);
            int borderColor2 = getBorderColor(1);
            int borderColor3 = getBorderColor(2);
            int borderColor4 = getBorderColor(3);
            int borderColor5 = getBorderColor(9);
            int borderColor6 = getBorderColor(11);
            int borderColor7 = getBorderColor(10);
            if (isBorderColorDefined(9)) {
                borderColor2 = borderColor5;
                borderColor4 = borderColor2;
            }
            if (isBorderColorDefined(10)) {
                borderColor4 = borderColor7;
            }
            if (isBorderColorDefined(11)) {
                borderColor2 = borderColor6;
            }
            boolean z3 = getLayoutDirection() == 1;
            int borderColor8 = getBorderColor(4);
            int borderColor9 = getBorderColor(5);
            if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(this.mContext)) {
                if (isBorderColorDefined(4)) {
                    borderColor = borderColor8;
                }
                if (isBorderColorDefined(5)) {
                    borderColor3 = borderColor9;
                }
                int i10 = z3 ? borderColor3 : borderColor;
                if (z3) {
                    borderColor3 = borderColor;
                }
                i7 = iRound;
                borderColor = i10;
            } else {
                int i11 = z3 ? borderColor9 : borderColor8;
                if (!z3) {
                    borderColor8 = borderColor9;
                }
                boolean zIsBorderColorDefined = isBorderColorDefined(4);
                i7 = iRound;
                boolean zIsBorderColorDefined2 = isBorderColorDefined(5);
                boolean z8 = z3 ? zIsBorderColorDefined2 : zIsBorderColorDefined;
                if (!z3) {
                    zIsBorderColorDefined = zIsBorderColorDefined2;
                }
                if (z8) {
                    borderColor = i11;
                }
                if (zIsBorderColorDefined) {
                    borderColor3 = borderColor8;
                }
            }
            int i12 = bounds.left;
            int i13 = bounds.top;
            int iFastBorderCompatibleColorOrZero = fastBorderCompatibleColorOrZero(i7, iRound2, iRound3, iRound4, borderColor, borderColor2, borderColor3, borderColor4);
            int i14 = borderColor2;
            int i15 = borderColor3;
            int i16 = borderColor4;
            if (iFastBorderCompatibleColorOrZero == 0) {
                this.mPaint.setAntiAlias(false);
                int iWidth = bounds.width();
                int iHeight = bounds.height();
                if (i7 > 0) {
                    float f10 = i12;
                    float f11 = i12 + i7;
                    int i17 = i13 + iHeight;
                    drawQuadrilateral(canvas, borderColor, f10, i13, f11, i13 + iRound2, f11, i17 - iRound4, f10, i17);
                }
                if (iRound2 > 0) {
                    float f12 = i13;
                    float f13 = i13 + iRound2;
                    int i18 = i12 + iWidth;
                    drawQuadrilateral(canvas, i14, i12, f12, i12 + i7, f13, i18 - iRound3, f13, i18, f12);
                }
                if (iRound3 > 0) {
                    int i19 = i12 + iWidth;
                    float f14 = i19;
                    int i20 = i13 + iHeight;
                    float f15 = i19 - iRound3;
                    drawQuadrilateral(canvas, i15, f14, i13, f14, i20, f15, i20 - iRound4, f15, i13 + iRound2);
                }
                if (iRound4 > 0) {
                    int i21 = i13 + iHeight;
                    float f16 = i21;
                    int i22 = iWidth + i12;
                    float f17 = i21 - iRound4;
                    cSSBackgroundDrawable = this;
                    cSSBackgroundDrawable.drawQuadrilateral(canvas, i16, i12, f16, i22, f16, i22 - iRound3, f17, i12 + i7, f17);
                } else {
                    cSSBackgroundDrawable = this;
                }
                cSSBackgroundDrawable.mPaint.setAntiAlias(true);
                return;
            }
            if (Color.alpha(iFastBorderCompatibleColorOrZero) != 0) {
                int i23 = bounds.right;
                int i24 = bounds.bottom;
                this.mPaint.setColor(iFastBorderCompatibleColorOrZero);
                this.mPaint.setStyle(Paint.Style.STROKE);
                if (i7 > 0) {
                    this.mPathForSingleBorder.reset();
                    int iRound5 = Math.round(directionAwareBorderInsets.left);
                    updatePathEffect(iRound5);
                    this.mPaint.setStrokeWidth(iRound5);
                    float f18 = (iRound5 / 2) + i12;
                    this.mPathForSingleBorder.moveTo(f18, i13);
                    this.mPathForSingleBorder.lineTo(f18, i24);
                    canvas.drawPath(this.mPathForSingleBorder, this.mPaint);
                }
                if (iRound2 > 0) {
                    this.mPathForSingleBorder.reset();
                    int iRound6 = Math.round(directionAwareBorderInsets.top);
                    updatePathEffect(iRound6);
                    this.mPaint.setStrokeWidth(iRound6);
                    float f19 = (iRound6 / 2) + i13;
                    this.mPathForSingleBorder.moveTo(i12, f19);
                    this.mPathForSingleBorder.lineTo(i23, f19);
                    canvas.drawPath(this.mPathForSingleBorder, this.mPaint);
                }
                if (iRound3 > 0) {
                    this.mPathForSingleBorder.reset();
                    int iRound7 = Math.round(directionAwareBorderInsets.right);
                    updatePathEffect(iRound7);
                    this.mPaint.setStrokeWidth(iRound7);
                    float f20 = i23 - (iRound7 / 2);
                    this.mPathForSingleBorder.moveTo(f20, i13);
                    this.mPathForSingleBorder.lineTo(f20, i24);
                    canvas.drawPath(this.mPathForSingleBorder, this.mPaint);
                }
                if (iRound4 > 0) {
                    this.mPathForSingleBorder.reset();
                    int iRound8 = Math.round(directionAwareBorderInsets.bottom);
                    updatePathEffect(iRound8);
                    this.mPaint.setStrokeWidth(iRound8);
                    float f21 = i24 - (iRound8 / 2);
                    this.mPathForSingleBorder.moveTo(i12, f21);
                    this.mPathForSingleBorder.lineTo(i23, f21);
                    canvas.drawPath(this.mPathForSingleBorder, this.mPaint);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:88:0x0201  */
    /* JADX WARN: Code duplicated, block: B:91:0x0224  */
    /* JADX WARN: Code duplicated, block: B:94:0x0247  */
    private void drawRoundedBackgroundWithBorders(Canvas canvas) {
        int i7;
        int i10;
        float f10;
        float f11;
        float f12;
        float f13;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        float f14;
        float f15;
        PointF pointF5;
        PointF pointF6;
        PointF pointF7;
        updatePath();
        canvas.save();
        int i11 = this.mColor;
        int iE = d.e(i11, (Color.alpha(i11) * this.mAlpha) >> 8);
        if (Color.alpha(iE) != 0) {
            this.mPaint.setColor(iE);
            this.mPaint.setStyle(Paint.Style.FILL);
            Path path = this.mBackgroundColorRenderPath;
            path.getClass();
            canvas.drawPath(path, this.mPaint);
        }
        List<BackgroundImageLayer> list = this.mBackgroundImageLayers;
        if (list != null && !list.isEmpty()) {
            this.mPaint.setShader(getBackgroundImageShader());
            this.mPaint.setStyle(Paint.Style.FILL);
            Path path2 = this.mBackgroundColorRenderPath;
            path2.getClass();
            canvas.drawPath(path2, this.mPaint);
            this.mPaint.setShader(null);
        }
        RectF directionAwareBorderInsets = getDirectionAwareBorderInsets();
        int borderColor = getBorderColor(0);
        int borderColor2 = getBorderColor(1);
        int borderColor3 = getBorderColor(2);
        int borderColor4 = getBorderColor(3);
        int borderColor5 = getBorderColor(9);
        int borderColor6 = getBorderColor(11);
        int borderColor7 = getBorderColor(10);
        if (isBorderColorDefined(9)) {
            borderColor2 = borderColor5;
            borderColor4 = borderColor2;
        }
        if (!isBorderColorDefined(10)) {
            borderColor7 = borderColor4;
        }
        if (!isBorderColorDefined(11)) {
            borderColor6 = borderColor2;
        }
        if (directionAwareBorderInsets.top > 0.0f || directionAwareBorderInsets.bottom > 0.0f || directionAwareBorderInsets.left > 0.0f || directionAwareBorderInsets.right > 0.0f) {
            Path path3 = this.mOuterClipPathForBorderRadius;
            path3.getClass();
            canvas.clipPath(path3, Region.Op.INTERSECT);
            float fullBorderWidth = getFullBorderWidth();
            int borderColor8 = getBorderColor(8);
            if (directionAwareBorderInsets.top != fullBorderWidth || directionAwareBorderInsets.bottom != fullBorderWidth || directionAwareBorderInsets.left != fullBorderWidth || directionAwareBorderInsets.right != fullBorderWidth || borderColor != borderColor8 || borderColor6 != borderColor8 || borderColor3 != borderColor8 || borderColor7 != borderColor8) {
                this.mPaint.setStyle(Paint.Style.FILL);
                Path path4 = this.mInnerClipPathForBorderRadius;
                path4.getClass();
                canvas.clipPath(path4, Region.Op.DIFFERENCE);
                boolean z3 = getLayoutDirection() == 1;
                int borderColor9 = getBorderColor(4);
                int borderColor10 = getBorderColor(5);
                if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(this.mContext)) {
                    if (isBorderColorDefined(4)) {
                        borderColor = borderColor9;
                    }
                    if (isBorderColorDefined(5)) {
                        borderColor3 = borderColor10;
                    }
                    int i12 = z3 ? borderColor3 : borderColor;
                    if (z3) {
                        borderColor3 = borderColor;
                    }
                    i7 = i12;
                } else {
                    int i13 = z3 ? borderColor10 : borderColor9;
                    if (!z3) {
                        borderColor9 = borderColor10;
                    }
                    boolean zIsBorderColorDefined = isBorderColorDefined(4);
                    boolean zIsBorderColorDefined2 = isBorderColorDefined(5);
                    boolean z8 = z3 ? zIsBorderColorDefined2 : zIsBorderColorDefined;
                    if (!z3) {
                        zIsBorderColorDefined = zIsBorderColorDefined2;
                    }
                    if (z8) {
                        borderColor = i13;
                    }
                    i7 = borderColor;
                    if (zIsBorderColorDefined) {
                        i10 = borderColor9;
                    }
                    RectF rectF = this.mOuterClipTempRectForBorderRadius;
                    rectF.getClass();
                    f10 = rectF.left;
                    f11 = rectF.right;
                    f12 = rectF.top;
                    f13 = rectF.bottom;
                    pointF = this.mInnerTopLeftCorner;
                    pointF.getClass();
                    pointF2 = this.mInnerTopRightCorner;
                    pointF2.getClass();
                    pointF3 = this.mInnerBottomLeftCorner;
                    pointF3.getClass();
                    pointF4 = this.mInnerBottomRightCorner;
                    pointF4.getClass();
                    if (directionAwareBorderInsets.left > 0.0f) {
                        f14 = f13;
                        pointF5 = pointF;
                        pointF6 = pointF3;
                        pointF7 = pointF4;
                        drawQuadrilateral(canvas, i7, f10, f12 - 0.8f, pointF.x, pointF.y - 0.8f, pointF3.x, pointF3.y + 0.8f, f10, f13 + 0.8f);
                        f15 = f10;
                    } else {
                        f14 = f13;
                        f15 = f10;
                        pointF5 = pointF;
                        pointF6 = pointF3;
                        pointF7 = pointF4;
                    }
                    if (directionAwareBorderInsets.top > 0.0f) {
                        drawQuadrilateral(canvas, borderColor6, f15 - 0.8f, f12, pointF5.x - 0.8f, pointF5.y, pointF2.x + 0.8f, pointF2.y, f11 + 0.8f, f12);
                    }
                    if (directionAwareBorderInsets.right > 0.0f) {
                        drawQuadrilateral(canvas, i10, f11, f12 - 0.8f, pointF2.x, pointF2.y - 0.8f, pointF7.x, pointF7.y + 0.8f, f11, f14 + 0.8f);
                    }
                    if (directionAwareBorderInsets.bottom > 0.0f) {
                        drawQuadrilateral(canvas, borderColor7, f15 - 0.8f, f14, pointF6.x - 0.8f, pointF6.y, pointF7.x + 0.8f, pointF7.y, f11 + 0.8f, f14);
                    }
                }
                i10 = borderColor3;
                RectF rectF2 = this.mOuterClipTempRectForBorderRadius;
                rectF2.getClass();
                f10 = rectF2.left;
                f11 = rectF2.right;
                f12 = rectF2.top;
                f13 = rectF2.bottom;
                pointF = this.mInnerTopLeftCorner;
                pointF.getClass();
                pointF2 = this.mInnerTopRightCorner;
                pointF2.getClass();
                pointF3 = this.mInnerBottomLeftCorner;
                pointF3.getClass();
                pointF4 = this.mInnerBottomRightCorner;
                pointF4.getClass();
                if (directionAwareBorderInsets.left > 0.0f) {
                    f14 = f13;
                    pointF5 = pointF;
                    pointF6 = pointF3;
                    pointF7 = pointF4;
                    drawQuadrilateral(canvas, i7, f10, f12 - 0.8f, pointF.x, pointF.y - 0.8f, pointF3.x, pointF3.y + 0.8f, f10, f13 + 0.8f);
                    f15 = f10;
                } else {
                    f14 = f13;
                    f15 = f10;
                    pointF5 = pointF;
                    pointF6 = pointF3;
                    pointF7 = pointF4;
                }
                if (directionAwareBorderInsets.top > 0.0f) {
                    drawQuadrilateral(canvas, borderColor6, f15 - 0.8f, f12, pointF5.x - 0.8f, pointF5.y, pointF2.x + 0.8f, pointF2.y, f11 + 0.8f, f12);
                }
                if (directionAwareBorderInsets.right > 0.0f) {
                    drawQuadrilateral(canvas, i10, f11, f12 - 0.8f, pointF2.x, pointF2.y - 0.8f, pointF7.x, pointF7.y + 0.8f, f11, f14 + 0.8f);
                }
                if (directionAwareBorderInsets.bottom > 0.0f) {
                    drawQuadrilateral(canvas, borderColor7, f15 - 0.8f, f14, pointF6.x - 0.8f, pointF6.y, pointF7.x + 0.8f, pointF7.y, f11 + 0.8f, f14);
                }
            } else if (fullBorderWidth > 0.0f) {
                this.mPaint.setColor(multiplyColorAlpha(borderColor8, this.mAlpha));
                this.mPaint.setStyle(Paint.Style.STROKE);
                this.mPaint.setStrokeWidth(fullBorderWidth);
                Path path5 = this.mCenterDrawPath;
                path5.getClass();
                canvas.drawPath(path5, this.mPaint);
            }
        }
        canvas.restore();
    }

    private static int fastBorderCompatibleColorOrZero(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = (i12 > 0 ? i16 : -1) & (i7 > 0 ? i13 : -1) & (i10 > 0 ? i14 : -1) & (i11 > 0 ? i15 : -1);
        if (i7 <= 0) {
            i13 = 0;
        }
        if (i10 <= 0) {
            i14 = 0;
        }
        int i18 = i13 | i14;
        if (i11 <= 0) {
            i15 = 0;
        }
        int i19 = i18 | i15;
        if (i12 <= 0) {
            i16 = 0;
        }
        if (i17 == (i19 | i16)) {
            return i17;
        }
        return 0;
    }

    @Nullable
    private Shader getBackgroundImageShader() {
        List<BackgroundImageLayer> list = this.mBackgroundImageLayers;
        Shader composeShader = null;
        if (list == null) {
            return null;
        }
        Iterator<BackgroundImageLayer> it = list.iterator();
        while (it.hasNext()) {
            Shader shader = it.next().getShader(getBounds());
            if (shader != null) {
                composeShader = composeShader == null ? shader : new ComposeShader(shader, composeShader, PorterDuff.Mode.SRC_OVER);
            }
        }
        return composeShader;
    }

    private static void getEllipseIntersectionWithLine(double d2, double d10, double d11, double d12, double d13, double d14, double d15, double d16, PointF pointF) {
        double d17 = (d2 + d11) / 2.0d;
        double d18 = (d10 + d12) / 2.0d;
        double d19 = d13 - d17;
        double d20 = d14 - d18;
        double dAbs = Math.abs(d11 - d2) / 2.0d;
        double dAbs2 = Math.abs(d12 - d10) / 2.0d;
        double d21 = ((d16 - d18) - d20) / ((d15 - d17) - d19);
        double d22 = d20 - (d19 * d21);
        double d23 = dAbs2 * dAbs2;
        double d24 = dAbs * dAbs;
        double dX = q0.x(d24, d21, d21, d23);
        double d25 = dAbs * 2.0d * dAbs * d22 * d21;
        double d26 = (-(d24 * ((d22 * d22) - d23))) / dX;
        double d27 = dX * 2.0d;
        double dSqrt = ((-d25) / d27) - Math.sqrt(Math.pow(d25 / d27, 2.0d) + d26);
        double d28 = (d21 * dSqrt) + d22;
        double d29 = dSqrt + d17;
        double d30 = d28 + d18;
        if (Double.isNaN(d29) || Double.isNaN(d30)) {
            return;
        }
        pointF.x = (float) d29;
        pointF.y = (float) d30;
    }

    @Nullable
    private static PathEffect getPathEffect(BorderStyle borderStyle, float f10) {
        int i7 = AnonymousClass1.$SwitchMap$com$facebook$react$uimanager$style$BorderStyle[borderStyle.ordinal()];
        if (i7 == 2) {
            float f11 = f10 * 3.0f;
            return new DashPathEffect(new float[]{f11, f11, f11, f11}, 0.0f);
        }
        if (i7 != 3) {
            return null;
        }
        return new DashPathEffect(new float[]{f10, f10, f10, f10}, 0.0f);
    }

    private boolean isBorderColorDefined(int i7) {
        Spacing spacing = this.mBorderRGB;
        float f10 = spacing != null ? spacing.get(i7) : Float.NaN;
        Spacing spacing2 = this.mBorderAlpha;
        return (Float.isNaN(f10) || Float.isNaN(spacing2 != null ? spacing2.get(i7) : Float.NaN)) ? false : true;
    }

    private static int multiplyColorAlpha(int i7, int i10) {
        if (i10 == 255) {
            return i7;
        }
        if (i10 == 0) {
            return i7 & FlexItem.MAX_SIZE;
        }
        return (i7 & FlexItem.MAX_SIZE) | ((((i7 >>> 24) * (i10 + (i10 >> 7))) >> 8) << 24);
    }

    private void setBorderAlpha(int i7, float f10) {
        if (this.mBorderAlpha == null) {
            this.mBorderAlpha = new Spacing(255.0f);
        }
        if (FloatUtil.floatsEqual(this.mBorderAlpha.getRaw(i7), f10)) {
            return;
        }
        this.mBorderAlpha.set(i7, f10);
        invalidateSelf();
    }

    private void setBorderRGB(int i7, float f10) {
        if (this.mBorderRGB == null) {
            this.mBorderRGB = new Spacing(0.0f);
        }
        if (FloatUtil.floatsEqual(this.mBorderRGB.getRaw(i7), f10)) {
            return;
        }
        this.mBorderRGB.set(i7, f10);
        invalidateSelf();
    }

    private void updatePath() {
        if (this.mNeedUpdatePathForBorderRadius) {
            this.mNeedUpdatePathForBorderRadius = false;
            if (this.mInnerClipPathForBorderRadius == null) {
                this.mInnerClipPathForBorderRadius = new Path();
            }
            if (this.mBackgroundColorRenderPath == null) {
                this.mBackgroundColorRenderPath = new Path();
            }
            if (this.mOuterClipPathForBorderRadius == null) {
                this.mOuterClipPathForBorderRadius = new Path();
            }
            if (this.mPathForBorderRadiusOutline == null) {
                this.mPathForBorderRadiusOutline = new Path();
            }
            if (this.mCenterDrawPath == null) {
                this.mCenterDrawPath = new Path();
            }
            if (this.mInnerClipTempRectForBorderRadius == null) {
                this.mInnerClipTempRectForBorderRadius = new RectF();
            }
            if (this.mOuterClipTempRectForBorderRadius == null) {
                this.mOuterClipTempRectForBorderRadius = new RectF();
            }
            if (this.mTempRectForBorderRadiusOutline == null) {
                this.mTempRectForBorderRadiusOutline = new RectF();
            }
            if (this.mTempRectForCenterDrawPath == null) {
                this.mTempRectForCenterDrawPath = new RectF();
            }
            this.mInnerClipPathForBorderRadius.reset();
            this.mBackgroundColorRenderPath.reset();
            this.mOuterClipPathForBorderRadius.reset();
            this.mPathForBorderRadiusOutline.reset();
            this.mCenterDrawPath.reset();
            this.mInnerClipTempRectForBorderRadius.set(getBounds());
            this.mOuterClipTempRectForBorderRadius.set(getBounds());
            this.mTempRectForBorderRadiusOutline.set(getBounds());
            this.mTempRectForCenterDrawPath.set(getBounds());
            RectF directionAwareBorderInsets = getDirectionAwareBorderInsets();
            int borderColor = getBorderColor(0);
            int borderColor2 = getBorderColor(1);
            int borderColor3 = getBorderColor(2);
            int borderColor4 = getBorderColor(3);
            int borderColor5 = getBorderColor(8);
            int borderColor6 = getBorderColor(9);
            int borderColor7 = getBorderColor(11);
            int borderColor8 = getBorderColor(10);
            if (isBorderColorDefined(9)) {
                borderColor2 = borderColor6;
                borderColor4 = borderColor2;
            }
            if (!isBorderColorDefined(10)) {
                borderColor8 = borderColor4;
            }
            if (!isBorderColorDefined(11)) {
                borderColor7 = borderColor2;
            }
            if (Color.alpha(borderColor) != 0 || Color.alpha(borderColor7) != 0 || Color.alpha(borderColor3) != 0 || Color.alpha(borderColor8) != 0 || Color.alpha(borderColor5) != 0) {
                RectF rectF = this.mInnerClipTempRectForBorderRadius;
                rectF.top += directionAwareBorderInsets.top;
                rectF.bottom -= directionAwareBorderInsets.bottom;
                rectF.left += directionAwareBorderInsets.left;
                rectF.right -= directionAwareBorderInsets.right;
            }
            RectF rectF2 = this.mTempRectForCenterDrawPath;
            rectF2.top = (directionAwareBorderInsets.top * 0.5f) + rectF2.top;
            rectF2.bottom -= directionAwareBorderInsets.bottom * 0.5f;
            rectF2.left = (directionAwareBorderInsets.left * 0.5f) + rectF2.left;
            rectF2.right -= directionAwareBorderInsets.right * 0.5f;
            ComputedBorderRadius computedBorderRadiusResolve = this.mBorderRadius.resolve(getLayoutDirection(), this.mContext, PixelUtil.toDIPFromPixel(this.mOuterClipTempRectForBorderRadius.width()), PixelUtil.toDIPFromPixel(this.mOuterClipTempRectForBorderRadius.height()));
            this.mComputedBorderRadius = computedBorderRadiusResolve;
            CornerRadii pixelFromDIP = computedBorderRadiusResolve.getTopLeft().toPixelFromDIP();
            CornerRadii pixelFromDIP2 = this.mComputedBorderRadius.getTopRight().toPixelFromDIP();
            CornerRadii pixelFromDIP3 = this.mComputedBorderRadius.getBottomLeft().toPixelFromDIP();
            CornerRadii pixelFromDIP4 = this.mComputedBorderRadius.getBottomRight().toPixelFromDIP();
            float innerBorderRadius = getInnerBorderRadius(pixelFromDIP.getHorizontal(), directionAwareBorderInsets.left);
            float innerBorderRadius2 = getInnerBorderRadius(pixelFromDIP.getVertical(), directionAwareBorderInsets.top);
            float innerBorderRadius3 = getInnerBorderRadius(pixelFromDIP2.getHorizontal(), directionAwareBorderInsets.right);
            float innerBorderRadius4 = getInnerBorderRadius(pixelFromDIP2.getVertical(), directionAwareBorderInsets.top);
            float innerBorderRadius5 = getInnerBorderRadius(pixelFromDIP4.getHorizontal(), directionAwareBorderInsets.right);
            float innerBorderRadius6 = getInnerBorderRadius(pixelFromDIP4.getVertical(), directionAwareBorderInsets.bottom);
            float innerBorderRadius7 = getInnerBorderRadius(pixelFromDIP3.getHorizontal(), directionAwareBorderInsets.left);
            float innerBorderRadius8 = getInnerBorderRadius(pixelFromDIP3.getVertical(), directionAwareBorderInsets.bottom);
            Path.Direction direction = Path.Direction.CW;
            this.mInnerClipPathForBorderRadius.addRoundRect(this.mInnerClipTempRectForBorderRadius, new float[]{innerBorderRadius, innerBorderRadius2, innerBorderRadius3, innerBorderRadius4, innerBorderRadius5, innerBorderRadius6, innerBorderRadius7, innerBorderRadius8}, direction);
            this.mBackgroundColorRenderPath.addRoundRect(directionAwareBorderInsets.left > 0.0f ? this.mInnerClipTempRectForBorderRadius.left - 0.8f : this.mInnerClipTempRectForBorderRadius.left, directionAwareBorderInsets.top > 0.0f ? this.mInnerClipTempRectForBorderRadius.top - 0.8f : this.mInnerClipTempRectForBorderRadius.top, directionAwareBorderInsets.right > 0.0f ? this.mInnerClipTempRectForBorderRadius.right + 0.8f : this.mInnerClipTempRectForBorderRadius.right, directionAwareBorderInsets.bottom > 0.0f ? this.mInnerClipTempRectForBorderRadius.bottom + 0.8f : this.mInnerClipTempRectForBorderRadius.bottom, new float[]{innerBorderRadius, innerBorderRadius2, innerBorderRadius3, innerBorderRadius4, innerBorderRadius5, innerBorderRadius6, innerBorderRadius7, innerBorderRadius8}, direction);
            this.mOuterClipPathForBorderRadius.addRoundRect(this.mOuterClipTempRectForBorderRadius, new float[]{pixelFromDIP.getHorizontal(), pixelFromDIP.getVertical(), pixelFromDIP2.getHorizontal(), pixelFromDIP2.getVertical(), pixelFromDIP4.getHorizontal(), pixelFromDIP4.getVertical(), pixelFromDIP3.getHorizontal(), pixelFromDIP3.getVertical()}, direction);
            Spacing spacing = this.mBorderWidth;
            float f10 = spacing != null ? spacing.get(8) / 2.0f : 0.0f;
            this.mPathForBorderRadiusOutline.addRoundRect(this.mTempRectForBorderRadiusOutline, new float[]{pixelFromDIP.getHorizontal() + f10, pixelFromDIP.getVertical() + f10, pixelFromDIP2.getHorizontal() + f10, pixelFromDIP2.getVertical() + f10, pixelFromDIP4.getHorizontal() + f10, pixelFromDIP4.getVertical() + f10, pixelFromDIP3.getHorizontal() + f10, pixelFromDIP3.getVertical() + f10}, direction);
            this.mCenterDrawPath.addRoundRect(this.mTempRectForCenterDrawPath, new float[]{pixelFromDIP.getHorizontal() - (directionAwareBorderInsets.left * 0.5f), pixelFromDIP.getVertical() - (directionAwareBorderInsets.top * 0.5f), pixelFromDIP2.getHorizontal() - (directionAwareBorderInsets.right * 0.5f), pixelFromDIP2.getVertical() - (directionAwareBorderInsets.top * 0.5f), pixelFromDIP4.getHorizontal() - (directionAwareBorderInsets.right * 0.5f), pixelFromDIP4.getVertical() - (directionAwareBorderInsets.bottom * 0.5f), pixelFromDIP3.getHorizontal() - (directionAwareBorderInsets.left * 0.5f), pixelFromDIP3.getVertical() - (directionAwareBorderInsets.bottom * 0.5f)}, direction);
            if (this.mInnerTopLeftCorner == null) {
                this.mInnerTopLeftCorner = new PointF();
            }
            PointF pointF = this.mInnerTopLeftCorner;
            RectF rectF3 = this.mInnerClipTempRectForBorderRadius;
            float f11 = rectF3.left;
            pointF.x = f11;
            float f12 = rectF3.top;
            pointF.y = f12;
            RectF rectF4 = this.mOuterClipTempRectForBorderRadius;
            getEllipseIntersectionWithLine(f11, f12, (innerBorderRadius * 2.0f) + f11, (innerBorderRadius2 * 2.0f) + f12, rectF4.left, rectF4.top, f11, f12, pointF);
            if (this.mInnerBottomLeftCorner == null) {
                this.mInnerBottomLeftCorner = new PointF();
            }
            PointF pointF2 = this.mInnerBottomLeftCorner;
            RectF rectF5 = this.mInnerClipTempRectForBorderRadius;
            float f13 = rectF5.left;
            pointF2.x = f13;
            float f14 = rectF5.bottom;
            pointF2.y = f14;
            RectF rectF6 = this.mOuterClipTempRectForBorderRadius;
            getEllipseIntersectionWithLine(f13, f14 - (innerBorderRadius8 * 2.0f), (innerBorderRadius7 * 2.0f) + f13, f14, rectF6.left, rectF6.bottom, f13, f14, pointF2);
            if (this.mInnerTopRightCorner == null) {
                this.mInnerTopRightCorner = new PointF();
            }
            PointF pointF3 = this.mInnerTopRightCorner;
            RectF rectF7 = this.mInnerClipTempRectForBorderRadius;
            float f15 = rectF7.right;
            pointF3.x = f15;
            float f16 = rectF7.top;
            pointF3.y = f16;
            double d2 = (innerBorderRadius4 * 2.0f) + f16;
            RectF rectF8 = this.mOuterClipTempRectForBorderRadius;
            getEllipseIntersectionWithLine(f15 - (innerBorderRadius3 * 2.0f), f16, f15, d2, rectF8.right, rectF8.top, f15, f16, pointF3);
            if (this.mInnerBottomRightCorner == null) {
                this.mInnerBottomRightCorner = new PointF();
            }
            PointF pointF4 = this.mInnerBottomRightCorner;
            RectF rectF9 = this.mInnerClipTempRectForBorderRadius;
            float f17 = rectF9.right;
            pointF4.x = f17;
            float f18 = rectF9.bottom;
            pointF4.y = f18;
            RectF rectF10 = this.mOuterClipTempRectForBorderRadius;
            getEllipseIntersectionWithLine(f17 - (innerBorderRadius5 * 2.0f), f18 - (innerBorderRadius6 * 2.0f), f17, f18, rectF10.right, rectF10.bottom, f17, f18, pointF4);
        }
    }

    private void updatePathEffect() {
        BorderStyle borderStyle = this.mBorderStyle;
        this.mPaint.setPathEffect(borderStyle != null ? getPathEffect(borderStyle, getFullBorderWidth()) : null);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        updatePathEffect();
        if (hasRoundedBorders()) {
            drawRoundedBackgroundWithBorders(canvas);
        } else {
            drawRectangularBackgroundWithBorders(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mAlpha;
    }

    @Nullable
    public Path getBorderBoxPath() {
        if (!hasRoundedBorders()) {
            return null;
        }
        updatePath();
        Path path = this.mOuterClipPathForBorderRadius;
        path.getClass();
        return new Path(path);
    }

    public RectF getBorderBoxRect() {
        return new RectF(getBounds());
    }

    public int getBorderColor(int i7) {
        Spacing spacing = this.mBorderRGB;
        float f10 = spacing != null ? spacing.get(i7) : 0.0f;
        Spacing spacing2 = this.mBorderAlpha;
        return colorFromAlphaAndRGBComponents(spacing2 != null ? spacing2.get(i7) : 255.0f, f10);
    }

    public BorderRadiusStyle getBorderRadius() {
        return this.mBorderRadius;
    }

    @Nullable
    public BorderStyle getBorderStyle() {
        return this.mBorderStyle;
    }

    @Nullable
    public Float getBorderWidth(int i7) {
        Spacing spacing = this.mBorderWidth;
        if (spacing == null) {
            return null;
        }
        float raw = spacing.getRaw(i7);
        if (Float.isNaN(raw)) {
            return null;
        }
        return Float.valueOf(raw);
    }

    public float getBorderWidthOrDefaultTo(float f10, int i7) {
        Float borderWidth = getBorderWidth(i7);
        return borderWidth == null ? f10 : borderWidth.floatValue();
    }

    public int getColor() {
        return this.mColor;
    }

    public RectF getDirectionAwareBorderInsets() {
        float borderWidthOrDefaultTo = getBorderWidthOrDefaultTo(0.0f, 8);
        float borderWidthOrDefaultTo2 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 1);
        float borderWidthOrDefaultTo3 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 3);
        float borderWidthOrDefaultTo4 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 0);
        float borderWidthOrDefaultTo5 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 2);
        if (this.mBorderWidth != null) {
            boolean z3 = getLayoutDirection() == 1;
            float raw = this.mBorderWidth.getRaw(4);
            float raw2 = this.mBorderWidth.getRaw(5);
            if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(this.mContext)) {
                if (!Float.isNaN(raw)) {
                    borderWidthOrDefaultTo4 = raw;
                }
                if (!Float.isNaN(raw2)) {
                    borderWidthOrDefaultTo5 = raw2;
                }
                float f10 = z3 ? borderWidthOrDefaultTo5 : borderWidthOrDefaultTo4;
                if (z3) {
                    borderWidthOrDefaultTo5 = borderWidthOrDefaultTo4;
                }
                borderWidthOrDefaultTo4 = f10;
            } else {
                float f11 = z3 ? raw2 : raw;
                if (!z3) {
                    raw = raw2;
                }
                if (!Float.isNaN(f11)) {
                    borderWidthOrDefaultTo4 = f11;
                }
                if (!Float.isNaN(raw)) {
                    borderWidthOrDefaultTo5 = raw;
                }
            }
        }
        return new RectF(borderWidthOrDefaultTo4, borderWidthOrDefaultTo2, borderWidthOrDefaultTo5, borderWidthOrDefaultTo3);
    }

    public float getFullBorderWidth() {
        Spacing spacing = this.mBorderWidth;
        if (spacing == null || Float.isNaN(spacing.getRaw(8))) {
            return 0.0f;
        }
        return this.mBorderWidth.getRaw(8);
    }

    public float getInnerBorderRadius(float f10, float f11) {
        return Math.max(f10 - f11, 0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    @SuppressLint({"WrongConstant"})
    public int getLayoutDirection() {
        int i7 = this.mLayoutDirectionOverride;
        return i7 == -1 ? super.getLayoutDirection() : i7;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int iAlpha = (Color.alpha(this.mColor) * this.mAlpha) >> 8;
        if (iAlpha != 0) {
            return iAlpha != 255 ? -3 : -1;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (!hasRoundedBorders()) {
            outline.setRect(getBounds());
            return;
        }
        updatePath();
        Path path = this.mPathForBorderRadiusOutline;
        path.getClass();
        outline.setConvexPath(path);
    }

    @Nullable
    public Path getPaddingBoxPath() {
        if (!hasRoundedBorders()) {
            return null;
        }
        updatePath();
        Path path = this.mInnerClipPathForBorderRadius;
        path.getClass();
        return new Path(path);
    }

    public RectF getPaddingBoxRect() {
        RectF directionAwareBorderInsets = getDirectionAwareBorderInsets();
        return directionAwareBorderInsets == null ? new RectF(0.0f, 0.0f, getBounds().width(), getBounds().height()) : new RectF(directionAwareBorderInsets.left, directionAwareBorderInsets.top, getBounds().width() - directionAwareBorderInsets.right, getBounds().height() - directionAwareBorderInsets.bottom);
    }

    public boolean hasRoundedBorders() {
        return this.mBorderRadius.hasRoundedBorders();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.mNeedUpdatePathForBorderRadius = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        if (i7 != this.mAlpha) {
            this.mAlpha = i7;
            invalidateSelf();
        }
    }

    public void setBackgroundImage(@Nullable List<BackgroundImageLayer> list) {
        this.mBackgroundImageLayers = list;
        invalidateSelf();
    }

    public void setBorderColor(int i7, @Nullable Integer num) {
        float fIntValue = num == null ? Float.NaN : num.intValue() & FlexItem.MAX_SIZE;
        float fIntValue2 = num != null ? num.intValue() >>> 24 : Float.NaN;
        setBorderRGB(i7, fIntValue);
        setBorderAlpha(i7, fIntValue2);
        this.mNeedUpdatePathForBorderRadius = true;
    }

    public void setBorderRadius(BorderRadiusProp borderRadiusProp, @Nullable LengthPercentage lengthPercentage) {
        if (Objects.equals(lengthPercentage, this.mBorderRadius.get(borderRadiusProp))) {
            return;
        }
        this.mBorderRadius.set(borderRadiusProp, lengthPercentage);
        this.mNeedUpdatePathForBorderRadius = true;
        invalidateSelf();
    }

    public void setBorderStyle(@Nullable String str) {
        setBorderStyle(str == null ? null : BorderStyle.valueOf(str.toUpperCase(Locale.US)));
    }

    public void setBorderWidth(int i7, float f10) {
        if (this.mBorderWidth == null) {
            this.mBorderWidth = new Spacing();
        }
        if (FloatUtil.floatsEqual(this.mBorderWidth.getRaw(i7), f10)) {
            return;
        }
        this.mBorderWidth.set(i7, f10);
        if (i7 == 0 || i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5 || i7 == 8) {
            this.mNeedUpdatePathForBorderRadius = true;
        }
        invalidateSelf();
    }

    public void setColor(int i7) {
        this.mColor = i7;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Deprecated
    public void setLayoutDirectionOverride(int i7) {
        if (this.mLayoutDirectionOverride != i7) {
            this.mLayoutDirectionOverride = i7;
        }
    }

    @Deprecated(forRemoval = true, since = "0.75.0")
    public void setRadius(float f10) {
        Float fValueOf = Float.isNaN(f10) ? null : Float.valueOf(f10);
        if (fValueOf == null) {
            setBorderRadius(BorderRadiusProp.BORDER_RADIUS, null);
        } else {
            setBorderRadius(BorderRadiusProp.BORDER_RADIUS, new LengthPercentage(fValueOf.floatValue(), LengthPercentageType.POINT));
        }
    }

    private void updatePathEffect(int i7) {
        BorderStyle borderStyle = this.mBorderStyle;
        this.mPaint.setPathEffect(borderStyle != null ? getPathEffect(borderStyle, i7) : null);
    }

    public void setBorderStyle(@Nullable BorderStyle borderStyle) {
        if (this.mBorderStyle != borderStyle) {
            this.mBorderStyle = borderStyle;
            this.mNeedUpdatePathForBorderRadius = true;
            invalidateSelf();
        }
    }

    public void setBorderRadius(BorderRadiusStyle borderRadiusStyle) {
        this.mBorderRadius = borderRadiusStyle;
    }

    @Deprecated(forRemoval = true, since = "0.75.0")
    public void setRadius(float f10, int i7) {
        Float fValueOf = Float.isNaN(f10) ? null : Float.valueOf(f10);
        if (fValueOf == null) {
            this.mBorderRadius.set(BorderRadiusProp.values()[i7], null);
            invalidateSelf();
        } else {
            setBorderRadius(BorderRadiusProp.values()[i7], new LengthPercentage(fValueOf.floatValue(), LengthPercentageType.POINT));
        }
    }
}
