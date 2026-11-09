package androidx.constraintlayout.utils.widget;

import U.b;
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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.p;
import p264r5.a;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f15517A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f15518B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f15519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f15521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f15522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f15523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f15524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f15525g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Path f15526i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewOutlineProvider f15527j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RectF f15528o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Drawable[] f15529p;
    public LayerDrawable t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f15530v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f15531w;

    public ImageFilterView(Context context) {
        super(context);
        this.f15519a = new c();
        this.f15520b = true;
        this.f15521c = null;
        this.f15522d = null;
        this.f15523e = 0.0f;
        this.f15524f = 0.0f;
        this.f15525g = Float.NaN;
        this.f15529p = new Drawable[2];
        this.f15530v = Float.NaN;
        this.f15531w = Float.NaN;
        this.f15517A = Float.NaN;
        this.f15518B = Float.NaN;
    }

    private void setOverlay(boolean overlay) {
        this.f15520b = overlay;
    }

    public final void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.ImageFilterView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f15521c = typedArrayObtainStyledAttributes.getDrawable(p.ImageFilterView_altSrc);
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == p.ImageFilterView_crossfade) {
                    this.f15523e = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == p.ImageFilterView_warmth) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == p.ImageFilterView_saturation) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == p.ImageFilterView_contrast) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == p.ImageFilterView_brightness) {
                    setBrightness(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == p.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == p.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == p.ImageFilterView_overlay) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f15520b));
                } else if (index == p.ImageFilterView_imagePanX) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.f15530v));
                } else if (index == p.ImageFilterView_imagePanY) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.f15531w));
                } else if (index == p.ImageFilterView_imageRotate) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.f15518B));
                } else if (index == p.ImageFilterView_imageZoom) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.f15517A));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f15522d = drawable;
            Drawable drawable2 = this.f15521c;
            Drawable[] drawableArr = this.f15529p;
            if (drawable2 == null || drawable == null) {
                Drawable drawable3 = getDrawable();
                this.f15522d = drawable3;
                if (drawable3 != null) {
                    Drawable drawableMutate = drawable3.mutate();
                    this.f15522d = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable drawableMutate2 = getDrawable().mutate();
            this.f15522d = drawableMutate2;
            drawableArr[0] = drawableMutate2;
            drawableArr[1] = this.f15521c.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            this.t = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f15523e * 255.0f));
            if (!this.f15520b) {
                this.t.getDrawable(0).setAlpha((int) ((1.0f - this.f15523e) * 255.0f));
            }
            super.setImageDrawable(this.t);
        }
    }

    public final void b() {
        if (Float.isNaN(this.f15530v) && Float.isNaN(this.f15531w) && Float.isNaN(this.f15517A) && Float.isNaN(this.f15518B)) {
            return;
        }
        float f10 = Float.isNaN(this.f15530v) ? 0.0f : this.f15530v;
        float f11 = Float.isNaN(this.f15531w) ? 0.0f : this.f15531w;
        float f12 = Float.isNaN(this.f15517A) ? 1.0f : this.f15517A;
        float f13 = Float.isNaN(this.f15518B) ? 0.0f : this.f15518B;
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
        if (Float.isNaN(this.f15530v) && Float.isNaN(this.f15531w) && Float.isNaN(this.f15517A) && Float.isNaN(this.f15518B)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            b();
        }
    }

    public float getBrightness() {
        return this.f15519a.f9099d;
    }

    public float getContrast() {
        return this.f15519a.f9101f;
    }

    public float getCrossfade() {
        return this.f15523e;
    }

    public float getImagePanX() {
        return this.f15530v;
    }

    public float getImagePanY() {
        return this.f15531w;
    }

    public float getImageRotate() {
        return this.f15518B;
    }

    public float getImageZoom() {
        return this.f15517A;
    }

    public float getRound() {
        return this.f15525g;
    }

    public float getRoundPercent() {
        return this.f15524f;
    }

    public float getSaturation() {
        return this.f15519a.f9100e;
    }

    public float getWarmth() {
        return this.f15519a.f9102g;
    }

    @Override // android.view.View
    public final void layout(int i7, int i10, int i11, int i12) {
        super.layout(i7, i10, i11, i12);
        b();
    }

    public void setAltImageResource(int resId) {
        Drawable drawableMutate = a.q(resId, getContext()).mutate();
        this.f15521c = drawableMutate;
        Drawable drawable = this.f15522d;
        Drawable[] drawableArr = this.f15529p;
        drawableArr[0] = drawable;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.t = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f15523e);
    }

    public void setBrightness(float brightness) {
        c cVar = this.f15519a;
        cVar.f9099d = brightness;
        cVar.a(this);
    }

    public void setContrast(float contrast) {
        c cVar = this.f15519a;
        cVar.f9101f = contrast;
        cVar.a(this);
    }

    public void setCrossfade(float crossfade) {
        this.f15523e = crossfade;
        if (this.f15529p != null) {
            if (!this.f15520b) {
                this.t.getDrawable(0).setAlpha((int) ((1.0f - this.f15523e) * 255.0f));
            }
            this.t.getDrawable(1).setAlpha((int) (this.f15523e * 255.0f));
            super.setImageDrawable(this.t);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f15521c == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f15522d = drawableMutate;
        Drawable[] drawableArr = this.f15529p;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f15521c;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.t = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f15523e);
    }

    public void setImagePanX(float pan) {
        this.f15530v = pan;
        c();
    }

    public void setImagePanY(float pan) {
        this.f15531w = pan;
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int resId) {
        if (this.f15521c == null) {
            super.setImageResource(resId);
            return;
        }
        Drawable drawableMutate = a.q(resId, getContext()).mutate();
        this.f15522d = drawableMutate;
        Drawable[] drawableArr = this.f15529p;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f15521c;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.t = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f15523e);
    }

    public void setImageRotate(float rotation) {
        this.f15518B = rotation;
        c();
    }

    public void setImageZoom(float zoom) {
        this.f15517A = zoom;
        c();
    }

    @RequiresApi(21)
    public void setRound(float round) {
        if (Float.isNaN(round)) {
            this.f15525g = round;
            float f10 = this.f15524f;
            this.f15524f = -1.0f;
            setRoundPercent(f10);
            return;
        }
        boolean z3 = this.f15525g != round;
        this.f15525g = round;
        if (round != 0.0f) {
            if (this.f15526i == null) {
                this.f15526i = new Path();
            }
            if (this.f15528o == null) {
                this.f15528o = new RectF();
            }
            if (this.f15527j == null) {
                b bVar = new b(this, 1);
                this.f15527j = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f15528o.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f15526i.reset();
            Path path = this.f15526i;
            RectF rectF = this.f15528o;
            float f11 = this.f15525g;
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
        boolean z3 = this.f15524f != round;
        this.f15524f = round;
        if (round != 0.0f) {
            if (this.f15526i == null) {
                this.f15526i = new Path();
            }
            if (this.f15528o == null) {
                this.f15528o = new RectF();
            }
            if (this.f15527j == null) {
                b bVar = new b(this, 0);
                this.f15527j = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f15524f) / 2.0f;
            this.f15528o.set(0.0f, 0.0f, width, height);
            this.f15526i.reset();
            this.f15526i.addRoundRect(this.f15528o, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z3) {
            invalidateOutline();
        }
    }

    public void setSaturation(float saturation) {
        c cVar = this.f15519a;
        cVar.f9100e = saturation;
        cVar.a(this);
    }

    public void setWarmth(float warmth) {
        c cVar = this.f15519a;
        cVar.f9102g = warmth;
        cVar.a(this);
    }

    public ImageFilterView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f15519a = new c();
        this.f15520b = true;
        this.f15521c = null;
        this.f15522d = null;
        this.f15523e = 0.0f;
        this.f15524f = 0.0f;
        this.f15525g = Float.NaN;
        this.f15529p = new Drawable[2];
        this.f15530v = Float.NaN;
        this.f15531w = Float.NaN;
        this.f15517A = Float.NaN;
        this.f15518B = Float.NaN;
        a(attrs);
    }

    public ImageFilterView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f15519a = new c();
        this.f15520b = true;
        this.f15521c = null;
        this.f15522d = null;
        this.f15523e = 0.0f;
        this.f15524f = 0.0f;
        this.f15525g = Float.NaN;
        this.f15529p = new Drawable[2];
        this.f15530v = Float.NaN;
        this.f15531w = Float.NaN;
        this.f15517A = Float.NaN;
        this.f15518B = Float.NaN;
        a(attrs);
    }
}
