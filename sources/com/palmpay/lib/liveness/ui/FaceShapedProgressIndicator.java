package com.palmpay.lib.liveness.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.FloatRange;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.horcrux.svg.d0;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p364y6.f;
import p364y6.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/palmpay/lib/liveness/ui/FaceShapedProgressIndicator;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", ReactProgressBarViewManager.PROP_PROGRESS, "", "setProgress", "(F)V", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceShapedProgressIndicator extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f23829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f23830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f23834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f23835g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f23836i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceShapedProgressIndicator(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        f fVar = g.f44075a;
        Path path = fVar.getPath();
        RectF rectF = this.f23834f;
        path.computeBounds(rectF, true);
        float fSqrt = (float) Math.sqrt((this.f23830b * (width * height)) / (rectF.height() * rectF.width()));
        float f10 = 2;
        float fWidth = (width - (rectF.width() * fSqrt)) / f10;
        float fHeight = ((height - (rectF.height() * fSqrt)) / f10) - (rectF.height() / (5 * fSqrt));
        int iSave = canvas.save();
        canvas.scale(fSqrt, fSqrt);
        canvas.translate(fWidth / fSqrt, fHeight / fSqrt);
        Path path2 = fVar.getPath();
        Region.Op op = Region.Op.DIFFERENCE;
        canvas.clipPath(path2, op);
        canvas.drawRect((-fWidth) / fSqrt, (-fHeight) / fSqrt, width, height, this.f23836i);
        Paint paint = this.f23835g;
        paint.setColor(this.f23833e);
        canvas.drawPath(fVar.getPath(), paint);
        if (this.f23829a > 0.0f) {
            paint.setColor(this.f23832d);
            float f11 = rectF.left;
            float f12 = this.f23831c;
            float f13 = f12 / f10;
            float f14 = f11 - f13;
            float f15 = rectF.top - f13;
            canvas.clipRect(f14, f15, rectF.width() + f14 + f12, d0.e(1, this.f23829a, rectF.height() + f12, f15), op);
            canvas.drawPath(fVar.getPath(), paint);
        }
        canvas.restoreToCount(iSave);
    }

    public final void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float progress) {
        this.f23829a = progress;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceShapedProgressIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FaceShapedProgressIndicator(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FaceShapedProgressIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f23830b = 0.88000005f;
        this.f23831c = 8.0f;
        this.f23832d = -9816577;
        this.f23833e = 1726471935;
        this.f23834f = new RectF();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(8.0f);
        this.f23835g = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-1);
        this.f23836i = paint2;
    }
}
