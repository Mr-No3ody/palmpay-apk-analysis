package androidx.constraintlayout.utils.widget;

import U.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.p;
import p264r5.a;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f15502A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f15503B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f15504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f15505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Path f15508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ViewOutlineProvider f15509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RectF f15510g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Drawable[] f15511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LayerDrawable f15512j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15513o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f15514p;
    public Drawable t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f15515v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f15516w;

    public ImageFilterButton(Context context) {
        super(context);
        this.f15504a = new c();
        this.f15505b = 0.0f;
        this.f15506c = 0.0f;
        this.f15507d = Float.NaN;
        this.f15511i = new Drawable[2];
        this.f15513o = true;
        this.f15514p = null;
        this.t = null;
        this.f15515v = Float.NaN;
        this.f15516w = Float.NaN;
        this.f15502A = Float.NaN;
        this.f15503B = Float.NaN;
        setPadding(0, 0, 0, 0);
    }

    private void setOverlay(boolean overlay) {
        this.f15513o = overlay;
    }

    public final void a(AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.ImageFilterView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f15514p = typedArrayObtainStyledAttributes.getDrawable(p.ImageFilterView_altSrc);
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == p.ImageFilterView_crossfade) {
                    this.f15505b = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == p.ImageFilterView_warmth) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == p.ImageFilterView_saturation) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == p.ImageFilterView_contrast) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == p.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == p.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == p.ImageFilterView_overlay) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f15513o));
                } else if (index == p.ImageFilterView_imagePanX) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.f15515v));
                } else if (index == p.ImageFilterView_imagePanY) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.f15516w));
                } else if (index == p.ImageFilterView_imageRotate) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.f15503B));
                } else if (index == p.ImageFilterView_imageZoom) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.f15502A));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.t = drawable;
            Drawable drawable2 = this.f15514p;
            Drawable[] drawableArr = this.f15511i;
            if (drawable2 == null || drawable == null) {
                Drawable drawable3 = getDrawable();
                this.t = drawable3;
                if (drawable3 != null) {
                    Drawable drawableMutate = drawable3.mutate();
                    this.t = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable drawableMutate2 = getDrawable().mutate();
            this.t = drawableMutate2;
            drawableArr[0] = drawableMutate2;
            drawableArr[1] = this.f15514p.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            this.f15512j = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f15505b * 255.0f));
            if (!this.f15513o) {
                this.f15512j.getDrawable(0).setAlpha((int) ((1.0f - this.f15505b) * 255.0f));
            }
            super.setImageDrawable(this.f15512j);
        }
    }

    public final void b() {
        if (Float.isNaN(this.f15515v) && Float.isNaN(this.f15516w) && Float.isNaN(this.f15502A) && Float.isNaN(this.f15503B)) {
            return;
        }
        float f10 = Float.isNaN(this.f15515v) ? 0.0f : this.f15515v;
        float f11 = Float.isNaN(this.f15516w) ? 0.0f : this.f15516w;
        float f12 = Float.isNaN(this.f15502A) ? 1.0f : this.f15502A;
        float f13 = Float.isNaN(this.f15503B) ? 0.0f : this.f15503B;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f14 = f12 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f14, f14);
        float f15 = intrinsicWidth * f14;
        float f16 = f14 * intrinsicHeight;
        matrix.postTranslate(((((width - f15) * f10) + width) - f15) * 0.5f, ((((height - f16) * f11) + height) - f16) * 0.5f);
        matrix.postRotate(f13, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void c() {
        if (Float.isNaN(this.f15515v) && Float.isNaN(this.f15516w) && Float.isNaN(this.f15502A) && Float.isNaN(this.f15503B)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            b();
        }
    }

    public float getContrast() {
        return this.f15504a.f9101f;
    }

    public float getCrossfade() {
        return this.f15505b;
    }

    public float getImagePanX() {
        return this.f15515v;
    }

    public float getImagePanY() {
        return this.f15516w;
    }

    public float getImageRotate() {
        return this.f15503B;
    }

    public float getImageZoom() {
        return this.f15502A;
    }

    public float getRound() {
        return this.f15507d;
    }

    public float getRoundPercent() {
        return this.f15506c;
    }

    public float getSaturation() {
        return this.f15504a.f9100e;
    }

    public float getWarmth() {
        return this.f15504a.f9102g;
    }

    @Override // android.view.View
    public final void layout(int i7, int i10, int i11, int i12) {
        super.layout(i7, i10, i11, i12);
        b();
    }

    public void setAltImageResource(int resId) {
        Drawable drawableMutate = a.q(resId, getContext()).mutate();
        this.f15514p = drawableMutate;
        Drawable drawable = this.t;
        Drawable[] drawableArr = this.f15511i;
        drawableArr[0] = drawable;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f15512j = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f15505b);
    }

    public void setBrightness(float brightness) {
        c cVar = this.f15504a;
        cVar.f9099d = brightness;
        cVar.a(this);
    }

    public void setContrast(float contrast) {
        c cVar = this.f15504a;
        cVar.f9101f = contrast;
        cVar.a(this);
    }

    public void setCrossfade(float crossfade) {
        this.f15505b = crossfade;
        if (this.f15511i != null) {
            if (!this.f15513o) {
                this.f15512j.getDrawable(0).setAlpha((int) ((1.0f - this.f15505b) * 255.0f));
            }
            this.f15512j.getDrawable(1).setAlpha((int) (this.f15505b * 255.0f));
            super.setImageDrawable(this.f15512j);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f15514p == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.t = drawableMutate;
        Drawable[] drawableArr = this.f15511i;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f15514p;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f15512j = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f15505b);
    }

    public void setImagePanX(float pan) {
        this.f15515v = pan;
        c();
    }

    public void setImagePanY(float pan) {
        this.f15516w = pan;
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int resId) {
        if (this.f15514p == null) {
            super.setImageResource(resId);
            return;
        }
        Drawable drawableMutate = a.q(resId, getContext()).mutate();
        this.t = drawableMutate;
        Drawable[] drawableArr = this.f15511i;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f15514p;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f15512j = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f15505b);
    }

    public void setImageRotate(float rotation) {
        this.f15503B = rotation;
        c();
    }

    public void setImageZoom(float zoom) {
        this.f15502A = zoom;
        c();
    }

    @RequiresApi(21)
    public void setRound(float round) {
        if (Float.isNaN(round)) {
            this.f15507d = round;
            float f10 = this.f15506c;
            this.f15506c = -1.0f;
            setRoundPercent(f10);
            return;
        }
        boolean z3 = this.f15507d != round;
        this.f15507d = round;
        if (round != 0.0f) {
            if (this.f15508e == null) {
                this.f15508e = new Path();
            }
            if (this.f15510g == null) {
                this.f15510g = new RectF();
            }
            if (this.f15509f == null) {
                U.a aVar = new U.a(this, 1);
                this.f15509f = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            this.f15510g.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f15508e.reset();
            Path path = this.f15508e;
            RectF rectF = this.f15510g;
            float f11 = this.f15507d;
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
        boolean z3 = this.f15506c != round;
        this.f15506c = round;
        if (round != 0.0f) {
            if (this.f15508e == null) {
                this.f15508e = new Path();
            }
            if (this.f15510g == null) {
                this.f15510g = new RectF();
            }
            if (this.f15509f == null) {
                U.a aVar = new U.a(this, 0);
                this.f15509f = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f15506c) / 2.0f;
            this.f15510g.set(0.0f, 0.0f, width, height);
            this.f15508e.reset();
            this.f15508e.addRoundRect(this.f15510g, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z3) {
            invalidateOutline();
        }
    }

    public void setSaturation(float saturation) {
        c cVar = this.f15504a;
        cVar.f9100e = saturation;
        cVar.a(this);
    }

    public void setWarmth(float warmth) {
        c cVar = this.f15504a;
        cVar.f9102g = warmth;
        cVar.a(this);
    }

    public ImageFilterButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f15504a = new c();
        this.f15505b = 0.0f;
        this.f15506c = 0.0f;
        this.f15507d = Float.NaN;
        this.f15511i = new Drawable[2];
        this.f15513o = true;
        this.f15514p = null;
        this.t = null;
        this.f15515v = Float.NaN;
        this.f15516w = Float.NaN;
        this.f15502A = Float.NaN;
        this.f15503B = Float.NaN;
        a(attrs);
    }

    public ImageFilterButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f15504a = new c();
        this.f15505b = 0.0f;
        this.f15506c = 0.0f;
        this.f15507d = Float.NaN;
        this.f15511i = new Drawable[2];
        this.f15513o = true;
        this.f15514p = null;
        this.t = null;
        this.f15515v = Float.NaN;
        this.f15516w = Float.NaN;
        this.f15502A = Float.NaN;
        this.f15503B = Float.NaN;
        a(attrs);
    }
}
