package com.google.android.material.loadingindicator;

import Af.d;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.math.MathUtils;
import com.google.android.material.shape.MaterialShapes;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C1849p;
import kotlin.jvm.internal.Intrinsics;
import p377z5.l;
import t0.e;
import t0.o;
import t0.t;
import t0.u;

/* JADX INFO: loaded from: classes2.dex */
class LoadingIndicatorDrawingDelegate {

    @NonNull
    final Path indicatorPath = new Path();

    @NonNull
    final Matrix indicatorPathTransform = new Matrix();

    @NonNull
    LoadingIndicatorSpec specs;
    private static final t[] INDETERMINATE_SHAPES = {MaterialShapes.normalize(MaterialShapes.SOFT_BURST, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.COOKIE_9, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.PENTAGON, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.PILL, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.SUNNY, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.COOKIE_4, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), MaterialShapes.normalize(MaterialShapes.OVAL, true, new RectF(-1.0f, -1.0f, 1.0f, 1.0f))};
    private static final o[] INDETERMINATE_MORPH_SEQUENCE = new o[7];

    public static class IndicatorState {

        @ColorInt
        int color;
        float morphFraction;
        float rotationDegree;
    }

    static {
        int i7 = 0;
        while (true) {
            t[] tVarArr = INDETERMINATE_SHAPES;
            if (i7 >= tVarArr.length) {
                return;
            }
            int i10 = i7 + 1;
            INDETERMINATE_MORPH_SEQUENCE[i7] = new o(tVarArr[i7], tVarArr[i10 % tVarArr.length]);
            i7 = i10;
        }
    }

    public LoadingIndicatorDrawingDelegate(@NonNull LoadingIndicatorSpec loadingIndicatorSpec) {
        this.specs = loadingIndicatorSpec;
    }

    public void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect) {
        canvas.translate(rect.centerX(), rect.centerY());
        if (this.specs.scaleToFit) {
            float fMin = Math.min(rect.width() / getPreferredWidth(), rect.height() / getPreferredHeight());
            canvas.scale(fMin, fMin);
        }
        canvas.clipRect((-getPreferredWidth()) / 2.0f, (-getPreferredHeight()) / 2.0f, getPreferredWidth() / 2.0f, getPreferredHeight() / 2.0f);
        canvas.rotate(-90.0f);
    }

    public void drawContainer(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i7, @IntRange(from = 0, to = 255) int i10) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        float fMin = Math.min(loadingIndicatorSpec.containerWidth, loadingIndicatorSpec.containerHeight) / 2.0f;
        paint.setColor(MaterialColors.compositeARGBWithAlpha(i7, i10));
        paint.setStyle(Paint.Style.FILL);
        LoadingIndicatorSpec loadingIndicatorSpec2 = this.specs;
        int i11 = loadingIndicatorSpec2.containerWidth;
        int i12 = loadingIndicatorSpec2.containerHeight;
        canvas.drawRoundRect(new RectF((-i11) / 2.0f, (-i12) / 2.0f, i11 / 2.0f, i12 / 2.0f), fMin, fMin, paint);
    }

    public void drawIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull IndicatorState indicatorState, @IntRange(from = 0, to = 255) int i7) {
        paint.setColor(MaterialColors.compositeARGBWithAlpha(indicatorState.color, i7));
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        canvas.rotate(indicatorState.rotationDegree);
        this.indicatorPath.rewind();
        int iFloor = (int) Math.floor(indicatorState.morphFraction);
        o[] oVarArr = INDETERMINATE_MORPH_SEQUENCE;
        int iFloorMod = MathUtils.floorMod(iFloor, oVarArr.length);
        float f10 = indicatorState.morphFraction - iFloor;
        o oVar = oVarArr[iFloorMod];
        Path path = this.indicatorPath;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        oVar.getClass();
        d dVarB = C1849p.b();
        List list = oVar.f42294a;
        int size = list.size();
        e eVar = null;
        e eVar2 = null;
        int i10 = 0;
        while (i10 < size) {
            float[] fArr = new float[8];
            for (int i11 = 0; i11 < 8; i11++) {
                fArr[i11] = u.c(((e) ((Pair) list.get(i10)).f38891a).f42277a[i11], ((e) ((Pair) list.get(i10)).f38892b).f42277a[i11], f10);
            }
            e eVar3 = new e(fArr);
            if (eVar2 == null) {
                eVar2 = eVar3;
            }
            if (eVar != null) {
                dVarB.add(eVar);
            }
            i10++;
            eVar = eVar3;
        }
        if (eVar != null && eVar2 != null) {
            float[] fArr2 = eVar.f42277a;
            float f11 = fArr2[0];
            float f12 = fArr2[1];
            float f13 = fArr2[2];
            float f14 = fArr2[3];
            float f15 = fArr2[4];
            float f16 = fArr2[5];
            float[] fArr3 = eVar2.f42277a;
            dVarB.add(l.a(f11, f12, f13, f14, f15, f16, fArr3[0], fArr3[1]));
        }
        Z4.e.A(path, C1849p.a(dVarB));
        Matrix matrix = this.indicatorPathTransform;
        float f17 = this.specs.indicatorSize / 2.0f;
        matrix.setScale(f17, f17);
        this.indicatorPath.transform(this.indicatorPathTransform);
        canvas.drawPath(this.indicatorPath, paint);
        canvas.restore();
    }

    public int getPreferredHeight() {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        return Math.max(loadingIndicatorSpec.containerWidth, loadingIndicatorSpec.indicatorSize);
    }

    public int getPreferredWidth() {
        LoadingIndicatorSpec loadingIndicatorSpec = this.specs;
        return Math.max(loadingIndicatorSpec.containerHeight, loadingIndicatorSpec.indicatorSize);
    }
}
