package com.transsnet.palmpay.photograph.crop;

import Ab.r;
import Zc.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.video.u;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p012ad.a;
import p012ad.b;
import p012ad.c;
import p012ad.e;
import p012ad.g;

/* JADX INFO: loaded from: classes4.dex */
public class CropView extends AppCompatImageView implements ViewTreeObserver.OnGlobalLayoutListener, OnGestureListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final float[] f33084A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public c f33085B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f33086C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public g f33087H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public RectF f33088L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Paint f33089M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final Paint f33090Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f33091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f33092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f33093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f33094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f33095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GestureDetector f33096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f33097g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f33098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f33099j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Path f33100k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f33101o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Matrix f33102p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Rect f33103p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Uri f33104q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f33105r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f33106s0;
    public final Matrix t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public String f33107t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f33108u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Matrix f33109v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RectF f33110w;

    public CropView(Context context) {
        this(context, null);
    }

    public static void c(CropView cropView, float f10, float f11, float f12) {
        if (f10 < cropView.f33091a || f10 > cropView.f33093c) {
            return;
        }
        cropView.post(new a(cropView, cropView.getScale(), f10, f11, f12));
    }

    private int getCropViewHeight() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getCropViewWidth() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Matrix getDrawMatrix() {
        Matrix matrix = this.f33109v;
        matrix.set(this.f33102p);
        matrix.postConcat(this.t);
        return matrix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getScale() {
        Matrix matrix = this.t;
        float[] fArr = this.f33084A;
        matrix.getValues(fArr);
        float fPow = (float) Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(fPow + ((float) Math.pow(fArr[3], 2.0d)));
    }

    private void setImageRotateBitmap(g gVar) {
        Bitmap bitmap = this.f33087H.f11898a;
        this.f33087H = gVar;
        setImageBitmap(gVar.f11898a);
        if (bitmap != null) {
            bitmap.recycle();
        }
        g();
    }

    public final void d() {
        float f10;
        RectF rectFE = e(getDrawMatrix());
        if (rectFE == null) {
            return;
        }
        float f11 = rectFE.top;
        RectF rectF = this.f33088L;
        float f12 = rectF.top;
        float f13 = 0.0f;
        if (f11 >= f12) {
            f10 = (-f11) + f12;
        } else {
            float f14 = rectFE.bottom;
            float f15 = rectF.bottom;
            f10 = f14 <= f15 ? f15 - f14 : 0.0f;
        }
        float f16 = rectFE.left;
        float f17 = rectF.left;
        if (f16 >= f17) {
            f13 = (-f16) + f17;
        } else {
            float f18 = rectFE.right;
            float f19 = rectF.right;
            if (f18 <= f19) {
                f13 = f19 - f18;
            }
        }
        this.t.postTranslate(f13, f10);
        setImageMatrix(getDrawMatrix());
    }

    public final RectF e(Matrix matrix) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        RectF rectF = this.f33110w;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(rectF);
        return rectF;
    }

    public final void f(PhotoCropActivity photoCropActivity) {
        g gVar;
        if (this.f33104q0 == null) {
            return;
        }
        InputStream inputStream = null;
        File file = !TextUtils.isEmpty(this.f33107t0) ? new File(this.f33107t0) : null;
        try {
            this.f33108u0 = p002a.a.f(photoCropActivity, this.f33104q0);
            InputStream inputStreamOpenInputStream = photoCropActivity.getContentResolver().openInputStream(this.f33104q0);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = this.f33108u0;
                if (file != null) {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    int i7 = 0;
                    try {
                        int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 0);
                        if (attributeInt == 3) {
                            i7 = 180;
                        } else if (attributeInt == 6) {
                            i7 = 90;
                        } else if (attributeInt == 8) {
                            i7 = 270;
                        }
                    } catch (IOException unused) {
                    }
                    gVar = new g(bitmapDecodeStream, i7);
                } else {
                    gVar = new g(BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options), p002a.a.l(photoCropActivity, this.f33104q0));
                }
                setImageRotateBitmap(gVar);
                p002a.a.g(inputStreamOpenInputStream);
            } catch (Exception unused2) {
                inputStream = inputStreamOpenInputStream;
                p002a.a.g(inputStream);
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                p002a.a.g(inputStream);
                throw th;
            }
        } catch (Exception unused3) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void g() {
        int height;
        int width;
        float f10;
        int i7;
        int height2;
        int i10;
        if (this.f33087H.f11898a == null) {
            return;
        }
        float cropViewWidth = getCropViewWidth();
        float cropViewHeight = getCropViewHeight();
        g gVar = this.f33087H;
        Bitmap bitmap = gVar.f11898a;
        int width2 = 0;
        if (bitmap == null) {
            height = 0;
        } else {
            height = (gVar.f11899b / 90) % 2 != 0 ? bitmap.getHeight() : bitmap.getWidth();
        }
        float f11 = height;
        g gVar2 = this.f33087H;
        Bitmap bitmap2 = gVar2.f11898a;
        if (bitmap2 == null) {
            width = 0;
        } else {
            width = (gVar2.f11899b / 90) % 2 != 0 ? bitmap2.getWidth() : bitmap2.getHeight();
        }
        float f12 = width;
        Matrix matrix = this.f33102p;
        matrix.reset();
        float fMin = Math.min(Math.min(cropViewWidth / f11, 3.0f), Math.min(cropViewHeight / f12, 3.0f));
        float fMin2 = ((Math.min(f11, f12) * 4.0f) / 5.0f) * fMin;
        int i11 = this.f33105r0;
        if (i11 == 0 || (i10 = this.f33106s0) == 0) {
            f10 = fMin2;
        } else if (i11 > i10) {
            f10 = (i10 * fMin2) / i11;
        } else {
            float f13 = (i11 * fMin2) / i10;
            f10 = fMin2;
            fMin2 = f13;
        }
        float fMin3 = Math.min((cropViewWidth / fMin2) * 0.6f, (cropViewHeight / f10) * 0.6f);
        if (fMin3 > 1.0f) {
            fMin *= fMin3;
            fMin2 *= fMin3;
            f10 *= fMin3;
        }
        float f14 = (cropViewWidth - fMin2) / 2.0f;
        float f15 = (cropViewHeight - f10) / 2.0f;
        this.f33088L = new RectF(f14, f15, fMin2 + f14, f10 + f15);
        g gVar3 = this.f33087H;
        gVar3.getClass();
        Matrix matrix2 = new Matrix();
        Bitmap bitmap3 = gVar3.f11898a;
        if (bitmap3 != null && (i7 = gVar3.f11899b) != 0) {
            matrix2.preTranslate(-(bitmap3.getWidth() / 2), -(gVar3.f11898a.getHeight() / 2));
            matrix2.postRotate(i7);
            Bitmap bitmap4 = gVar3.f11898a;
            if (bitmap4 == null) {
                height2 = 0;
            } else {
                height2 = (gVar3.f11899b / 90) % 2 != 0 ? bitmap4.getHeight() : bitmap4.getWidth();
            }
            float f16 = height2 / 2;
            Bitmap bitmap5 = gVar3.f11898a;
            if (bitmap5 != null) {
                width2 = (gVar3.f11899b / 90) % 2 != 0 ? bitmap5.getWidth() : bitmap5.getHeight();
            }
            matrix2.postTranslate(f16, width2 / 2);
        }
        matrix.postConcat(matrix2);
        matrix.postScale(fMin, fMin);
        matrix.postTranslate((cropViewWidth - (f11 * fMin)) / 2.0f, u.a(f12, fMin, cropViewHeight, 2.0f));
        this.t.reset();
        setImageMatrix(getDrawMatrix());
        RectF rectFE = e(matrix);
        this.f33091a = Math.max(this.f33088L.width() / rectFE.width(), this.f33088L.height() / rectFE.height());
    }

    public Bitmap getOutput() throws Throwable {
        InputStream inputStreamOpenInputStream;
        Bitmap bitmapCreateBitmap = null;
        bitmapCreateBitmap = null;
        bitmapCreateBitmap = null;
        InputStream inputStream = null;
        bitmapCreateBitmap = null;
        if (getDrawable() != null && this.f33088L != null) {
            Matrix drawMatrix = getDrawMatrix();
            RectF rectFE = e(drawMatrix);
            RectF rectF = this.f33088L;
            float f10 = rectF.left - rectFE.left;
            float f11 = rectF.top - rectFE.top;
            float[] fArr = this.f33084A;
            drawMatrix.getValues(fArr);
            float fPow = (float) Math.pow(fArr[0], 2.0d);
            drawMatrix.getValues(fArr);
            float fSqrt = (float) Math.sqrt(fPow + ((float) Math.pow(fArr[3], 2.0d)));
            float f12 = this.f33108u0;
            Rect rect = new Rect((int) ((f10 / fSqrt) * f12), (int) ((f11 / fSqrt) * f12), (int) (((this.f33088L.width() + f10) / fSqrt) * this.f33108u0), (int) (((this.f33088L.height() + f11) / fSqrt) * this.f33108u0));
            Context context = getContext();
            Uri uri = this.f33104q0;
            int i7 = this.f33087H.f11899b;
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    try {
                        BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream, false);
                        int width = bitmapRegionDecoderNewInstance.getWidth();
                        int height = bitmapRegionDecoderNewInstance.getHeight();
                        if (i7 != 0) {
                            Matrix matrix = new Matrix();
                            matrix.setRotate(-i7);
                            RectF rectF2 = new RectF();
                            matrix.mapRect(rectF2, new RectF(rect));
                            rectF2.offset(rectF2.left < 0.0f ? width : 0.0f, rectF2.top < 0.0f ? height : 0.0f);
                            rect = new Rect((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                        }
                        int iO = p002a.a.o(context);
                        int i10 = 1;
                        while (true) {
                            if (rect.width() / i10 <= iO && rect.height() / i10 <= iO) {
                                break;
                            }
                            i10 <<= 1;
                        }
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = i10;
                        Bitmap bitmapDecodeRegion = bitmapRegionDecoderNewInstance.decodeRegion(rect, options);
                        Matrix matrix2 = new Matrix();
                        if (i7 != 0) {
                            matrix2.postRotate(i7);
                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeRegion, 0, 0, bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight(), matrix2, true);
                        } else {
                            bitmapCreateBitmap = bitmapDecodeRegion;
                        }
                    } catch (FileNotFoundException | IOException | IllegalArgumentException | OutOfMemoryError unused) {
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream = inputStreamOpenInputStream;
                    p002a.a.g(inputStream);
                    throw th;
                }
            } catch (FileNotFoundException | IOException | OutOfMemoryError unused2) {
                inputStreamOpenInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            p002a.a.g(inputStreamOpenInputStream);
        }
        return bitmapCreateBitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        c cVar = this.f33085B;
        if (cVar != null) {
            ((OverScroller) ((r) cVar.f11883d).f139b).forceFinished(true);
            this.f33085B = null;
        }
        GestureDetector gestureDetector = this.f33096f;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
        setImageBitmap(null);
        g gVar = this.f33087H;
        Bitmap bitmap = gVar.f11898a;
        if (bitmap != null) {
            bitmap.recycle();
            gVar.f11898a = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // com.transsnet.palmpay.photograph.crop.OnGestureListener
    public final void onDrag(float f10, float f11) {
        if (this.f33095e.f11888c.isInProgress()) {
            return;
        }
        this.t.postTranslate(f10, f11);
        d();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f33088L == null) {
            return;
        }
        Path path = this.f33100k0;
        path.reset();
        RectF rectF = this.f33088L;
        path.addRect(rectF.left, rectF.top, rectF.right, rectF.bottom, Path.Direction.CW);
        Rect rect = this.f33103p0;
        getDrawingRect(rect);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        canvas.drawRect(rect, this.f33090Q);
        canvas.drawPath(path, this.f33089M);
    }

    @Override // com.transsnet.palmpay.photograph.crop.OnGestureListener
    public final void onFling(float f10, float f11, float f12, float f13) {
        c cVar = new c(this, getContext());
        this.f33085B = cVar;
        int i7 = (int) f12;
        int i10 = (int) f13;
        RectF rectFE = e(getDrawMatrix());
        if (rectFE != null) {
            int iRound = Math.round(this.f33088L.left - rectFE.left);
            int iRound2 = Math.round(this.f33088L.top - rectFE.top);
            int iRound3 = Math.round(rectFE.width() - this.f33088L.width());
            int iRound4 = Math.round(rectFE.height() - this.f33088L.height());
            cVar.f11881b = iRound;
            cVar.f11882c = iRound2;
            ((OverScroller) ((r) cVar.f11883d).f139b).fling(iRound, iRound2, i7, i10, 0, iRound3, 0, iRound4, 0, 0);
        }
        post(this.f33085B);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int top2 = getTop();
        int bottom = getBottom();
        int left = getLeft();
        int right = getRight();
        if (top2 == this.f33097g && bottom == this.f33099j && left == this.f33101o && right == this.f33098i) {
            return;
        }
        g();
        this.f33097g = top2;
        this.f33099j = bottom;
        this.f33101o = left;
        this.f33098i = right;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d A[PHI: r1
      0x001d: PHI (r1v4 float) = (r1v3 float), (r1v6 float) binds: [B:10:0x001b, B:5:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.transsnet.palmpay.photograph.crop.OnGestureListener
    public final void onScale(float f10, float f11, float f12) {
        float f13;
        float scale = getScale();
        if (f10 > 1.0f) {
            f13 = this.f33093c / scale;
            if (f10 >= f13) {
                f10 = f13;
            }
        } else if (f10 < 1.0f) {
            f13 = this.f33091a / scale;
            if (f10 <= f13) {
                f10 = f13;
            }
        }
        this.t.postScale(f10, f10, f11, f12);
        d();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar;
        boolean z3 = false;
        if (getDrawable() != null && this.f33088L != null) {
            if (motionEvent.getAction() == 0 && (cVar = this.f33085B) != null) {
                ((OverScroller) ((r) cVar.f11883d).f139b).forceFinished(true);
                this.f33085B = null;
            }
            e eVar = this.f33095e;
            if (eVar != null) {
                eVar.onTouchEvent(motionEvent);
                z3 = true;
            }
            GestureDetector gestureDetector = this.f33096f;
            if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        return z3;
    }

    public CropView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CropView(Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f33091a = 1.0f;
        this.f33092b = 3.0f;
        this.f33093c = 6.0f;
        this.f33094d = 200L;
        this.f33102p = new Matrix();
        this.t = new Matrix();
        this.f33109v = new Matrix();
        this.f33110w = new RectF();
        this.f33084A = new float[9];
        this.f33086C = new AccelerateDecelerateInterpolator();
        this.f33087H = new g(null, 0);
        Paint paint = new Paint();
        this.f33089M = paint;
        Paint paint2 = new Paint();
        this.f33090Q = paint2;
        this.f33100k0 = new Path();
        this.f33103p0 = new Rect();
        this.f33105r0 = 1;
        this.f33106s0 = 1;
        setScaleType(ImageView.ScaleType.MATRIX);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.CropView);
        int color = typedArrayObtainStyledAttributes.getColor(o.CropView_crop_bound_color, -1);
        float dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(o.CropView_crop_bound_width, (int) (2.0f * getContext().getResources().getDisplayMetrics().density));
        typedArrayObtainStyledAttributes.recycle();
        e eVar = new e(context);
        eVar.f11895j = this;
        this.f33095e = eVar;
        GestureDetector gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener());
        this.f33096f = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new b(this));
        paint.setAntiAlias(true);
        paint.setColor(color);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(dimensionPixelOffset);
        paint2.setARGB(125, 50, 50, 50);
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
    }
}
