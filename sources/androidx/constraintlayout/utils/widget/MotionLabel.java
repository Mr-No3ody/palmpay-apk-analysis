package androidx.constraintlayout.utils.widget;

import J3.a;
import U.e;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.FloatLayout;
import androidx.constraintlayout.widget.p;
import com.transsnet.palmpay.bean.HomeDialogState;

/* JADX INFO: loaded from: classes.dex */
public class MotionLabel extends View implements FloatLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f15548A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public float f15549A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f15550B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public float f15551B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Rect f15552C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public float f15553C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public float f15554D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final Paint f15555E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f15556F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public Rect f15557G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f15558H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public Paint f15559H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public float f15560I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public float f15561J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public float f15562K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f15563L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public float f15564L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f15565M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public float f15566M0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f15567Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f15568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Path f15569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f15573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f15574g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ViewOutlineProvider f15575i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RectF f15576j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f15577k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f15578o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f15579p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f15580p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f15581q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f15582r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f15583s0;
    public int t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f15584t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f15585u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15586v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public Drawable f15587v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f15588w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public Matrix f15589w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Bitmap f15590x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public BitmapShader f15591y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public Matrix f15592z0;

    public MotionLabel(Context context) {
        super(context);
        this.f15568a = new TextPaint();
        this.f15569b = new Path();
        this.f15570c = 65535;
        this.f15571d = 65535;
        this.f15572e = false;
        this.f15573f = 0.0f;
        this.f15574g = Float.NaN;
        this.f15578o = 48.0f;
        this.f15579p = Float.NaN;
        this.f15588w = 0.0f;
        this.f15548A = "Hello World";
        this.f15550B = true;
        this.f15552C = new Rect();
        this.f15558H = 1;
        this.f15563L = 1;
        this.f15565M = 1;
        this.f15567Q = 1;
        this.f15580p0 = 8388659;
        this.f15581q0 = 0;
        this.f15582r0 = false;
        this.f15549A0 = Float.NaN;
        this.f15551B0 = Float.NaN;
        this.f15553C0 = 0.0f;
        this.f15554D0 = 0.0f;
        this.f15555E0 = new Paint();
        this.f15556F0 = 0;
        this.f15561J0 = Float.NaN;
        this.f15562K0 = Float.NaN;
        this.f15564L0 = Float.NaN;
        this.f15566M0 = Float.NaN;
        b(context, null);
    }

    private float getHorizontalOffset() {
        float f10 = Float.isNaN(this.f15579p) ? 1.0f : this.f15578o / this.f15579p;
        String str = this.f15548A;
        return ((this.f15553C0 + 1.0f) * ((((Float.isNaN(this.f15584t0) ? getMeasuredWidth() : this.f15584t0) - getPaddingLeft()) - getPaddingRight()) - (this.f15568a.measureText(str, 0, str.length()) * f10))) / 2.0f;
    }

    private float getVerticalOffset() {
        float f10 = Float.isNaN(this.f15579p) ? 1.0f : this.f15578o / this.f15579p;
        Paint.FontMetrics fontMetrics = this.f15568a.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.f15585u0) ? getMeasuredHeight() : this.f15585u0) - getPaddingTop()) - getPaddingBottom();
        float f11 = fontMetrics.descent;
        float f12 = fontMetrics.ascent;
        return (((1.0f - this.f15554D0) * (measuredHeight - ((f11 - f12) * f10))) / 2.0f) - (f10 * f12);
    }

    public final void a(float f10) {
        if (this.f15572e || f10 != 1.0f) {
            this.f15569b.reset();
            String str = this.f15548A;
            int length = str.length();
            TextPaint textPaint = this.f15568a;
            Rect rect = this.f15552C;
            textPaint.getTextBounds(str, 0, length, rect);
            this.f15568a.getTextPath(str, 0, length, 0.0f, 0.0f, this.f15569b);
            if (f10 != 1.0f) {
                a.o();
                Matrix matrix = new Matrix();
                matrix.postScale(f10, f10);
                this.f15569b.transform(matrix);
            }
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.f15550B = false;
        }
    }

    public final void b(Context context, AttributeSet attributeSet) {
        Typeface typefaceCreate;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(p241q.a.colorPrimary, typedValue, true);
        int i7 = typedValue.data;
        this.f15570c = i7;
        TextPaint textPaint = this.f15568a;
        textPaint.setColor(i7);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.MotionLabel);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == p.MotionLabel_android_text) {
                    setText(typedArrayObtainStyledAttributes.getText(index));
                } else if (index == p.MotionLabel_android_fontFamily) {
                    this.f15577k0 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == p.MotionLabel_scaleFromTextSize) {
                    this.f15579p = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f15579p);
                } else if (index == p.MotionLabel_android_textSize) {
                    this.f15578o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f15578o);
                } else if (index == p.MotionLabel_android_textStyle) {
                    this.t = typedArrayObtainStyledAttributes.getInt(index, this.t);
                } else if (index == p.MotionLabel_android_typeface) {
                    this.f15586v = typedArrayObtainStyledAttributes.getInt(index, this.f15586v);
                } else if (index == p.MotionLabel_android_textColor) {
                    this.f15570c = typedArrayObtainStyledAttributes.getColor(index, this.f15570c);
                } else if (index == p.MotionLabel_borderRound) {
                    float dimension = typedArrayObtainStyledAttributes.getDimension(index, this.f15574g);
                    this.f15574g = dimension;
                    setRound(dimension);
                } else if (index == p.MotionLabel_borderRoundPercent) {
                    float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f15573f);
                    this.f15573f = f10;
                    setRoundPercent(f10);
                } else if (index == p.MotionLabel_android_gravity) {
                    setGravity(typedArrayObtainStyledAttributes.getInt(index, -1));
                } else if (index == p.MotionLabel_android_autoSizeTextType) {
                    this.f15581q0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == p.MotionLabel_textOutlineColor) {
                    this.f15571d = typedArrayObtainStyledAttributes.getInt(index, this.f15571d);
                    this.f15572e = true;
                } else if (index == p.MotionLabel_textOutlineThickness) {
                    this.f15588w = typedArrayObtainStyledAttributes.getDimension(index, this.f15588w);
                    this.f15572e = true;
                } else if (index == p.MotionLabel_textBackground) {
                    this.f15587v0 = typedArrayObtainStyledAttributes.getDrawable(index);
                    this.f15572e = true;
                } else if (index == p.MotionLabel_textBackgroundPanX) {
                    this.f15561J0 = typedArrayObtainStyledAttributes.getFloat(index, this.f15561J0);
                } else if (index == p.MotionLabel_textBackgroundPanY) {
                    this.f15562K0 = typedArrayObtainStyledAttributes.getFloat(index, this.f15562K0);
                } else if (index == p.MotionLabel_textPanX) {
                    this.f15553C0 = typedArrayObtainStyledAttributes.getFloat(index, this.f15553C0);
                } else if (index == p.MotionLabel_textPanY) {
                    this.f15554D0 = typedArrayObtainStyledAttributes.getFloat(index, this.f15554D0);
                } else if (index == p.MotionLabel_textBackgroundRotate) {
                    this.f15566M0 = typedArrayObtainStyledAttributes.getFloat(index, this.f15566M0);
                } else if (index == p.MotionLabel_textBackgroundZoom) {
                    this.f15564L0 = typedArrayObtainStyledAttributes.getFloat(index, this.f15564L0);
                } else if (index == p.MotionLabel_textureHeight) {
                    this.f15549A0 = typedArrayObtainStyledAttributes.getDimension(index, this.f15549A0);
                } else if (index == p.MotionLabel_textureWidth) {
                    this.f15551B0 = typedArrayObtainStyledAttributes.getDimension(index, this.f15551B0);
                } else if (index == p.MotionLabel_textureEffect) {
                    this.f15556F0 = typedArrayObtainStyledAttributes.getInt(index, this.f15556F0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f15587v0 != null) {
            this.f15592z0 = new Matrix();
            int intrinsicWidth = this.f15587v0.getIntrinsicWidth();
            int intrinsicHeight = this.f15587v0.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.f15551B0) ? 128 : (int) this.f15551B0;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.f15549A0) ? 128 : (int) this.f15549A0;
            }
            if (this.f15556F0 != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.f15590x0 = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f15590x0);
            this.f15587v0.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.f15587v0.setFilterBitmap(true);
            this.f15587v0.draw(canvas);
            if (this.f15556F0 != 0) {
                Bitmap bitmap = this.f15590x0;
                System.nanoTime();
                int width = bitmap.getWidth() / 2;
                int height = bitmap.getHeight() / 2;
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
                for (int i11 = 0; i11 < 4 && width >= 32 && height >= 32; i11++) {
                    width /= 2;
                    height /= 2;
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, width, height, true);
                }
                this.f15590x0 = bitmapCreateScaledBitmap;
            }
            Bitmap bitmap2 = this.f15590x0;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f15591y0 = new BitmapShader(bitmap2, tileMode, tileMode);
        }
        this.f15558H = getPaddingLeft();
        this.f15563L = getPaddingRight();
        this.f15565M = getPaddingTop();
        this.f15567Q = getPaddingBottom();
        String str = this.f15577k0;
        int i12 = this.f15586v;
        int i13 = this.t;
        if (str != null) {
            typefaceCreate = Typeface.create(str, i13);
            if (typefaceCreate != null) {
                setTypeface(typefaceCreate);
            }
            textPaint.setColor(this.f15570c);
            textPaint.setStrokeWidth(this.f15588w);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            textPaint.setFlags(128);
            setTextSize(this.f15578o);
            textPaint.setAntiAlias(true);
        }
        typefaceCreate = null;
        if (i12 == 1) {
            typefaceCreate = Typeface.SANS_SERIF;
        } else if (i12 == 2) {
            typefaceCreate = Typeface.SERIF;
        } else if (i12 == 3) {
            typefaceCreate = Typeface.MONOSPACE;
        }
        if (i13 > 0) {
            Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(i13) : Typeface.create(typefaceCreate, i13);
            setTypeface(typefaceDefaultFromStyle);
            int i14 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i13;
            textPaint.setFakeBoldText((i14 & 1) != 0);
            textPaint.setTextSkewX((i14 & 2) != 0 ? -0.25f : 0.0f);
        } else {
            textPaint.setFakeBoldText(false);
            textPaint.setTextSkewX(0.0f);
            setTypeface(typefaceCreate);
        }
        textPaint.setColor(this.f15570c);
        textPaint.setStrokeWidth(this.f15588w);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint.setFlags(128);
        setTextSize(this.f15578o);
        textPaint.setAntiAlias(true);
    }

    public final void c() {
        float f10 = Float.isNaN(this.f15561J0) ? 0.0f : this.f15561J0;
        float f11 = Float.isNaN(this.f15562K0) ? 0.0f : this.f15562K0;
        float f12 = Float.isNaN(this.f15564L0) ? 1.0f : this.f15564L0;
        float f13 = Float.isNaN(this.f15566M0) ? 0.0f : this.f15566M0;
        this.f15592z0.reset();
        float width = this.f15590x0.getWidth();
        float height = this.f15590x0.getHeight();
        float f14 = Float.isNaN(this.f15551B0) ? this.f15584t0 : this.f15551B0;
        float f15 = Float.isNaN(this.f15549A0) ? this.f15585u0 : this.f15549A0;
        float f16 = f12 * (width * f15 < height * f14 ? f14 / width : f15 / height);
        this.f15592z0.postScale(f16, f16);
        float f17 = width * f16;
        float f18 = f14 - f17;
        float f19 = f16 * height;
        float f20 = f15 - f19;
        if (!Float.isNaN(this.f15549A0)) {
            f20 = this.f15549A0 / 2.0f;
        }
        if (!Float.isNaN(this.f15551B0)) {
            f18 = this.f15551B0 / 2.0f;
        }
        this.f15592z0.postTranslate((((f10 * f18) + f14) - f17) * 0.5f, (((f11 * f20) + f15) - f19) * 0.5f);
        this.f15592z0.postRotate(f13, f14 / 2.0f, f15 / 2.0f);
        this.f15591y0.setLocalMatrix(this.f15592z0);
    }

    public float getRound() {
        return this.f15574g;
    }

    public float getRoundPercent() {
        return this.f15573f;
    }

    public float getScaleFromTextSize() {
        return this.f15579p;
    }

    public float getTextBackgroundPanX() {
        return this.f15561J0;
    }

    public float getTextBackgroundPanY() {
        return this.f15562K0;
    }

    public float getTextBackgroundRotate() {
        return this.f15566M0;
    }

    public float getTextBackgroundZoom() {
        return this.f15564L0;
    }

    public int getTextOutlineColor() {
        return this.f15571d;
    }

    public float getTextPanX() {
        return this.f15553C0;
    }

    public float getTextPanY() {
        return this.f15554D0;
    }

    public float getTextureHeight() {
        return this.f15549A0;
    }

    public float getTextureWidth() {
        return this.f15551B0;
    }

    public Typeface getTypeface() {
        return this.f15568a.getTypeface();
    }

    @Override // android.view.View
    public final void layout(int i7, int i10, int i11, int i12) {
        super.layout(i7, i10, i11, i12);
        boolean zIsNaN = Float.isNaN(this.f15579p);
        float f10 = zIsNaN ? 1.0f : this.f15578o / this.f15579p;
        this.f15584t0 = i11 - i7;
        this.f15585u0 = i12 - i10;
        if (this.f15582r0) {
            Rect rect = this.f15557G0;
            TextPaint textPaint = this.f15568a;
            if (rect == null) {
                this.f15559H0 = new Paint();
                this.f15557G0 = new Rect();
                this.f15559H0.set(textPaint);
                this.f15560I0 = this.f15559H0.getTextSize();
            }
            Paint paint = this.f15559H0;
            String str = this.f15548A;
            paint.getTextBounds(str, 0, str.length(), this.f15557G0);
            int iWidth = this.f15557G0.width();
            int iHeight = (int) (this.f15557G0.height() * 1.3f);
            float f11 = (this.f15584t0 - this.f15563L) - this.f15558H;
            float f12 = (this.f15585u0 - this.f15567Q) - this.f15565M;
            if (zIsNaN) {
                float f13 = iWidth;
                float f14 = iHeight;
                if (f13 * f12 > f14 * f11) {
                    textPaint.setTextSize((this.f15560I0 * f11) / f13);
                } else {
                    textPaint.setTextSize((this.f15560I0 * f12) / f14);
                }
            } else {
                float f15 = iWidth;
                float f16 = iHeight;
                f10 = f15 * f12 > f16 * f11 ? f11 / f15 : f12 / f16;
            }
        }
        if (this.f15572e || !zIsNaN) {
            float f17 = i7;
            float f18 = i10;
            float f19 = i11;
            float f20 = i12;
            if (this.f15592z0 != null) {
                this.f15584t0 = f19 - f17;
                this.f15585u0 = f20 - f18;
                c();
            }
            a(f10);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10 = Float.isNaN(this.f15579p) ? 1.0f : this.f15578o / this.f15579p;
        super.onDraw(canvas);
        boolean z3 = this.f15572e;
        TextPaint textPaint = this.f15568a;
        if (!z3 && f10 == 1.0f) {
            canvas.drawText(this.f15548A, this.f15583s0 + this.f15558H + getHorizontalOffset(), this.f15565M + getVerticalOffset(), textPaint);
            return;
        }
        if (this.f15550B) {
            a(f10);
        }
        if (this.f15589w0 == null) {
            this.f15589w0 = new Matrix();
        }
        if (!this.f15572e) {
            float horizontalOffset = this.f15558H + getHorizontalOffset();
            float verticalOffset = this.f15565M + getVerticalOffset();
            this.f15589w0.reset();
            this.f15589w0.preTranslate(horizontalOffset, verticalOffset);
            this.f15569b.transform(this.f15589w0);
            textPaint.setColor(this.f15570c);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            textPaint.setStrokeWidth(this.f15588w);
            canvas.drawPath(this.f15569b, textPaint);
            this.f15589w0.reset();
            this.f15589w0.preTranslate(-horizontalOffset, -verticalOffset);
            this.f15569b.transform(this.f15589w0);
            return;
        }
        Paint paint = this.f15555E0;
        paint.set(textPaint);
        this.f15589w0.reset();
        float horizontalOffset2 = this.f15558H + getHorizontalOffset();
        float verticalOffset2 = this.f15565M + getVerticalOffset();
        this.f15589w0.postTranslate(horizontalOffset2, verticalOffset2);
        this.f15589w0.preScale(f10, f10);
        this.f15569b.transform(this.f15589w0);
        if (this.f15591y0 != null) {
            textPaint.setFilterBitmap(true);
            textPaint.setShader(this.f15591y0);
        } else {
            textPaint.setColor(this.f15570c);
        }
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setStrokeWidth(this.f15588w);
        canvas.drawPath(this.f15569b, textPaint);
        if (this.f15591y0 != null) {
            textPaint.setShader(null);
        }
        textPaint.setColor(this.f15571d);
        textPaint.setStyle(Paint.Style.STROKE);
        textPaint.setStrokeWidth(this.f15588w);
        canvas.drawPath(this.f15569b, textPaint);
        this.f15589w0.reset();
        this.f15589w0.postTranslate(-horizontalOffset2, -verticalOffset2);
        this.f15569b.transform(this.f15589w0);
        textPaint.set(paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        this.f15582r0 = false;
        this.f15558H = getPaddingLeft();
        this.f15563L = getPaddingRight();
        this.f15565M = getPaddingTop();
        this.f15567Q = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            String str = this.f15548A;
            int length = str.length();
            TextPaint textPaint = this.f15568a;
            Rect rect = this.f15552C;
            textPaint.getTextBounds(str, 0, length, rect);
            if (mode != 1073741824) {
                size = (int) (rect.width() + 0.99999f);
            }
            size += this.f15558H + this.f15563L;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (textPaint.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f15565M + this.f15567Q + fontMetricsInt;
            }
        } else if (this.f15581q0 != 0) {
            this.f15582r0 = true;
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int gravity) {
        if ((gravity & 8388615) == 0) {
            gravity |= 8388611;
        }
        if ((gravity & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR) == 0) {
            gravity |= 48;
        }
        if (gravity != this.f15580p0) {
            invalidate();
        }
        this.f15580p0 = gravity;
        int i7 = gravity & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR;
        if (i7 == 48) {
            this.f15554D0 = -1.0f;
        } else if (i7 != 80) {
            this.f15554D0 = 0.0f;
        } else {
            this.f15554D0 = 1.0f;
        }
        int i10 = gravity & 8388615;
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 8388611) {
                    if (i10 != 8388613) {
                        this.f15553C0 = 0.0f;
                        return;
                    }
                }
            }
            this.f15553C0 = 1.0f;
            return;
        }
        this.f15553C0 = -1.0f;
    }

    @RequiresApi(21)
    public void setRound(float round) {
        if (Float.isNaN(round)) {
            this.f15574g = round;
            float f10 = this.f15573f;
            this.f15573f = -1.0f;
            setRoundPercent(f10);
            return;
        }
        boolean z3 = this.f15574g != round;
        this.f15574g = round;
        if (round != 0.0f) {
            if (this.f15569b == null) {
                this.f15569b = new Path();
            }
            if (this.f15576j == null) {
                this.f15576j = new RectF();
            }
            if (this.f15575i == null) {
                e eVar = new e(this, 1);
                this.f15575i = eVar;
                setOutlineProvider(eVar);
            }
            setClipToOutline(true);
            this.f15576j.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f15569b.reset();
            Path path = this.f15569b;
            RectF rectF = this.f15576j;
            float f11 = this.f15574g;
            path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z3) {
            invalidateOutline();
        }
    }

    @RequiresApi(21)
    public void setRoundPercent(float round) {
        boolean z3 = this.f15573f != round;
        this.f15573f = round;
        if (round != 0.0f) {
            if (this.f15569b == null) {
                this.f15569b = new Path();
            }
            if (this.f15576j == null) {
                this.f15576j = new RectF();
            }
            if (this.f15575i == null) {
                e eVar = new e(this, 0);
                this.f15575i = eVar;
                setOutlineProvider(eVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f15573f) / 2.0f;
            this.f15576j.set(0.0f, 0.0f, width, height);
            this.f15569b.reset();
            this.f15569b.addRoundRect(this.f15576j, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z3) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float size) {
        this.f15579p = size;
    }

    public void setText(CharSequence text) {
        this.f15548A = text.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float pan) {
        this.f15561J0 = pan;
        c();
        invalidate();
    }

    public void setTextBackgroundPanY(float pan) {
        this.f15562K0 = pan;
        c();
        invalidate();
    }

    public void setTextBackgroundRotate(float rotation) {
        this.f15566M0 = rotation;
        c();
        invalidate();
    }

    public void setTextBackgroundZoom(float zoom) {
        this.f15564L0 = zoom;
        c();
        invalidate();
    }

    public void setTextFillColor(int color) {
        this.f15570c = color;
        invalidate();
    }

    public void setTextOutlineColor(int color) {
        this.f15571d = color;
        this.f15572e = true;
        invalidate();
    }

    public void setTextOutlineThickness(float width) {
        this.f15588w = width;
        this.f15572e = true;
        if (Float.isNaN(width)) {
            this.f15588w = 1.0f;
            this.f15572e = false;
        }
        invalidate();
    }

    public void setTextPanX(float textPanX) {
        this.f15553C0 = textPanX;
        invalidate();
    }

    public void setTextPanY(float textPanY) {
        this.f15554D0 = textPanY;
        invalidate();
    }

    public void setTextSize(float size) {
        this.f15578o = size;
        a.o();
        if (!Float.isNaN(this.f15579p)) {
            size = this.f15579p;
        }
        this.f15568a.setTextSize(size);
        a(Float.isNaN(this.f15579p) ? 1.0f : this.f15578o / this.f15579p);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float mTextureHeight) {
        this.f15549A0 = mTextureHeight;
        c();
        invalidate();
    }

    public void setTextureWidth(float mTextureWidth) {
        this.f15551B0 = mTextureWidth;
        c();
        invalidate();
    }

    public void setTypeface(Typeface tf2) {
        TextPaint textPaint = this.f15568a;
        if (textPaint.getTypeface() != tf2) {
            textPaint.setTypeface(tf2);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.FloatLayout
    public final void layout(float f10, float f11, float f12, float f13) {
        int i7 = (int) (f10 + 0.5f);
        this.f15583s0 = f10 - i7;
        int i10 = (int) (f12 + 0.5f);
        int i11 = i10 - i7;
        int i12 = (int) (f13 + 0.5f);
        int i13 = (int) (0.5f + f11);
        int i14 = i12 - i13;
        float f14 = f12 - f10;
        this.f15584t0 = f14;
        float f15 = f13 - f11;
        this.f15585u0 = f15;
        if (this.f15592z0 != null) {
            this.f15584t0 = f14;
            this.f15585u0 = f15;
            c();
        }
        if (getMeasuredHeight() == i14 && getMeasuredWidth() == i11) {
            super.layout(i7, i13, i10, i12);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
            super.layout(i7, i13, i10, i12);
        }
        if (this.f15582r0) {
            Rect rect = this.f15557G0;
            TextPaint textPaint = this.f15568a;
            if (rect == null) {
                this.f15559H0 = new Paint();
                this.f15557G0 = new Rect();
                this.f15559H0.set(textPaint);
                this.f15560I0 = this.f15559H0.getTextSize();
            }
            this.f15584t0 = f14;
            this.f15585u0 = f15;
            Paint paint = this.f15559H0;
            String str = this.f15548A;
            paint.getTextBounds(str, 0, str.length(), this.f15557G0);
            int iWidth = this.f15557G0.width();
            float fHeight = this.f15557G0.height() * 1.3f;
            float f16 = (f14 - this.f15563L) - this.f15558H;
            float f17 = (f15 - this.f15567Q) - this.f15565M;
            float f18 = iWidth;
            if (f18 * f17 > fHeight * f16) {
                textPaint.setTextSize((this.f15560I0 * f16) / f18);
            } else {
                textPaint.setTextSize((this.f15560I0 * f17) / fHeight);
            }
            if (this.f15572e || !Float.isNaN(this.f15579p)) {
                a(Float.isNaN(this.f15579p) ? 1.0f : this.f15578o / this.f15579p);
            }
        }
    }

    public MotionLabel(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.f15568a = new TextPaint();
        this.f15569b = new Path();
        this.f15570c = 65535;
        this.f15571d = 65535;
        this.f15572e = false;
        this.f15573f = 0.0f;
        this.f15574g = Float.NaN;
        this.f15578o = 48.0f;
        this.f15579p = Float.NaN;
        this.f15588w = 0.0f;
        this.f15548A = "Hello World";
        this.f15550B = true;
        this.f15552C = new Rect();
        this.f15558H = 1;
        this.f15563L = 1;
        this.f15565M = 1;
        this.f15567Q = 1;
        this.f15580p0 = 8388659;
        this.f15581q0 = 0;
        this.f15582r0 = false;
        this.f15549A0 = Float.NaN;
        this.f15551B0 = Float.NaN;
        this.f15553C0 = 0.0f;
        this.f15554D0 = 0.0f;
        this.f15555E0 = new Paint();
        this.f15556F0 = 0;
        this.f15561J0 = Float.NaN;
        this.f15562K0 = Float.NaN;
        this.f15564L0 = Float.NaN;
        this.f15566M0 = Float.NaN;
        b(context, attrs);
    }

    public MotionLabel(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f15568a = new TextPaint();
        this.f15569b = new Path();
        this.f15570c = 65535;
        this.f15571d = 65535;
        this.f15572e = false;
        this.f15573f = 0.0f;
        this.f15574g = Float.NaN;
        this.f15578o = 48.0f;
        this.f15579p = Float.NaN;
        this.f15588w = 0.0f;
        this.f15548A = "Hello World";
        this.f15550B = true;
        this.f15552C = new Rect();
        this.f15558H = 1;
        this.f15563L = 1;
        this.f15565M = 1;
        this.f15567Q = 1;
        this.f15580p0 = 8388659;
        this.f15581q0 = 0;
        this.f15582r0 = false;
        this.f15549A0 = Float.NaN;
        this.f15551B0 = Float.NaN;
        this.f15553C0 = 0.0f;
        this.f15554D0 = 0.0f;
        this.f15555E0 = new Paint();
        this.f15556F0 = 0;
        this.f15561J0 = Float.NaN;
        this.f15562K0 = Float.NaN;
        this.f15564L0 = Float.NaN;
        this.f15566M0 = Float.NaN;
        b(context, attrs);
    }
}
