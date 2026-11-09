package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;
import androidx.core.graphics.drawable.WrappedDrawable;
import face.security.device.api.FaceSecCode;

/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f12639c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbsSeekBar f12640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f12641b;

    public C(AbsSeekBar absSeekBar) {
        this.f12640a = absSeekBar;
    }

    public void a(AttributeSet attributeSet, int i7) {
        AbsSeekBar absSeekBar = this.f12640a;
        Z0 z0F = Z0.f(absSeekBar.getContext(), attributeSet, f12639c, i7, 0);
        Drawable drawableC = z0F.c(0);
        if (drawableC != null) {
            if (drawableC instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableC;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i10 = 0; i10 < numberOfFrames; i10++) {
                    Drawable drawableB = b(animationDrawable.getFrame(i10), true);
                    drawableB.setLevel(FaceSecCode.SC_SUCCESS);
                    animationDrawable2.addFrame(drawableB, animationDrawable.getDuration(i10));
                }
                animationDrawable2.setLevel(FaceSecCode.SC_SUCCESS);
                drawableC = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableC);
        }
        Drawable drawableC2 = z0F.c(1);
        if (drawableC2 != null) {
            absSeekBar.setProgressDrawable(b(drawableC2, false));
        }
        z0F.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable b(Drawable drawable, boolean z3) {
        if (drawable instanceof WrappedDrawable) {
            WrappedDrawable wrappedDrawable = (WrappedDrawable) drawable;
            Drawable wrappedDrawable2 = wrappedDrawable.getWrappedDrawable();
            if (wrappedDrawable2 != null) {
                wrappedDrawable.setWrappedDrawable(b(wrappedDrawable2, z3));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i7 = 0; i7 < numberOfLayers; i7++) {
                    int id2 = layerDrawable.getId(i7);
                    drawableArr[i7] = b(layerDrawable.getDrawable(i7), id2 == 16908301 || id2 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable2.setId(i10, layerDrawable.getId(i10));
                    layerDrawable2.setLayerGravity(i10, layerDrawable.getLayerGravity(i10));
                    layerDrawable2.setLayerWidth(i10, layerDrawable.getLayerWidth(i10));
                    layerDrawable2.setLayerHeight(i10, layerDrawable.getLayerHeight(i10));
                    layerDrawable2.setLayerInsetLeft(i10, layerDrawable.getLayerInsetLeft(i10));
                    layerDrawable2.setLayerInsetRight(i10, layerDrawable.getLayerInsetRight(i10));
                    layerDrawable2.setLayerInsetTop(i10, layerDrawable.getLayerInsetTop(i10));
                    layerDrawable2.setLayerInsetBottom(i10, layerDrawable.getLayerInsetBottom(i10));
                    layerDrawable2.setLayerInsetStart(i10, layerDrawable.getLayerInsetStart(i10));
                    layerDrawable2.setLayerInsetEnd(i10, layerDrawable.getLayerInsetEnd(i10));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f12641b == null) {
                    this.f12641b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z3 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
