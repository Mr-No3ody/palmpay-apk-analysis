package com.rnmaps.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileProvider;
import com.google.maps.android.SphericalUtil;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* JADX INFO: renamed from: com.rnmaps.maps.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1449d implements TileProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f24917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f24919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SphericalMercatorProjection f24921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LatLng[] f24922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Point[] f24923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Point[] f24924i;

    public C1449d(Context context, List list, int[] iArr, float f10) {
        this.f24916a = list;
        this.f24917b = iArr;
        this.f24918c = f10;
        float f11 = context.getResources().getDisplayMetrics().density;
        this.f24919d = f11;
        this.f24920e = (int) (f11 * 256.0f);
        this.f24921f = new SphericalMercatorProjection(256.0d);
        this.f24922g = new LatLng[list.size()];
        this.f24923h = new Point[list.size()];
        this.f24924i = new Point[Math.max(list.size() - 1, 0)];
        for (int i7 = 0; i7 < list.size(); i7++) {
            LatLng latLng = (LatLng) list.get(i7);
            this.f24922g[i7] = latLng;
            Point[] pointArr = this.f24923h;
            SphericalMercatorProjection sphericalMercatorProjection = this.f24921f;
            pointArr[i7] = sphericalMercatorProjection.toPoint(latLng);
            if (i7 > 0) {
                int i10 = i7 - 1;
                this.f24924i[i10] = sphericalMercatorProjection.toPoint(SphericalUtil.interpolate((LatLng) list.get(i10), latLng, 0.5d));
            }
        }
    }

    public final void a(Canvas canvas, Matrix matrix, Paint paint, Paint paint2, com.abedelazizshe.lightcompressorlibrary.config.b bVar, com.abedelazizshe.lightcompressorlibrary.config.b bVar2, float f10, float f11) {
        if (f10 == f11) {
            paint2.setColor(MapGradientPolyline.d(this.f24917b, f10));
            canvas.drawLine((float) bVar.f19294a, (float) bVar.f19295b, (float) bVar2.f19294a, (float) bVar2.f19295b, paint2);
            return;
        }
        matrix.reset();
        matrix.preRotate((float) Math.toDegrees(Math.atan2(bVar2.f19295b - bVar.f19295b, bVar2.f19294a - bVar.f19294a)), (float) bVar.f19294a, (float) bVar.f19295b);
        matrix.preTranslate((float) bVar.f19294a, (float) bVar.f19295b);
        float fSqrt = (float) Math.sqrt(Math.pow(bVar2.f19295b - bVar.f19295b, 2.0d) + Math.pow(bVar2.f19294a - bVar.f19294a, 2.0d));
        matrix.preScale(fSqrt, fSqrt);
        float f12 = 1.0f / (f11 - f10);
        matrix.preScale(f12, f12);
        matrix.preTranslate(-f10, 0.0f);
        paint.getShader().setLocalMatrix(matrix);
        canvas.drawLine((float) bVar.f19294a, (float) bVar.f19295b, (float) bVar2.f19294a, (float) bVar2.f19295b, paint);
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int i7, int i10, int i11) {
        C1449d c1449d = this;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i12 = c1449d.f24920e;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i12, i12, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        float f10 = c1449d.f24918c;
        paint.setStrokeWidth(f10);
        Paint.Cap cap = Paint.Cap.BUTT;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint.setFlags(1);
        paint.setShader(new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, c1449d.f24917b, (float[]) null, Shader.TileMode.CLAMP));
        paint.getShader().setLocalMatrix(matrix);
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setStrokeWidth(f10);
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
        paint2.setFlags(1);
        float fPow = (float) (Math.pow(2.0d, i11) * ((double) c1449d.f24919d));
        com.abedelazizshe.lightcompressorlibrary.config.b bVar = new com.abedelazizshe.lightcompressorlibrary.config.b();
        com.abedelazizshe.lightcompressorlibrary.config.b bVar2 = new com.abedelazizshe.lightcompressorlibrary.config.b();
        com.abedelazizshe.lightcompressorlibrary.config.b bVar3 = new com.abedelazizshe.lightcompressorlibrary.config.b();
        com.abedelazizshe.lightcompressorlibrary.config.b bVar4 = new com.abedelazizshe.lightcompressorlibrary.config.b();
        com.abedelazizshe.lightcompressorlibrary.config.b bVar5 = new com.abedelazizshe.lightcompressorlibrary.config.b();
        List list = c1449d.f24916a;
        int size = list.size();
        int[] iArr = c1449d.f24917b;
        if (size == 1) {
            bVar.a(c1449d.f24923h[0], fPow, i7, i10, c1449d.f24920e);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(MapGradientPolyline.d(iArr, 1.0f));
            canvas.drawCircle((float) bVar.f19294a, (float) bVar.f19295b, paint2.getStrokeWidth() / 2.0f, paint2);
            paint2.setStyle(style);
        } else {
            int i13 = 2;
            if (list.size() == 2) {
                bVar.a(c1449d.f24923h[0], fPow, i7, i10, c1449d.f24920e);
                bVar2.a(c1449d.f24923h[1], fPow, i7, i10, c1449d.f24920e);
                paint2.setColor(MapGradientPolyline.d(iArr, 0.0f));
                canvas.drawLine((float) bVar.f19294a, (float) bVar.f19295b, (float) bVar2.f19294a, (float) bVar2.f19295b, paint2);
            } else {
                while (i13 < list.size()) {
                    int i14 = i13 - 2;
                    List list2 = list;
                    bVar.a(c1449d.f24923h[i14], fPow, i7, i10, c1449d.f24920e);
                    com.abedelazizshe.lightcompressorlibrary.config.b bVar6 = bVar;
                    int i15 = i13 - 1;
                    bVar2.a(c1449d.f24923h[i15], fPow, i7, i10, c1449d.f24920e);
                    com.abedelazizshe.lightcompressorlibrary.config.b bVar7 = bVar3;
                    bVar7.a(c1449d.f24923h[i13], fPow, i7, i10, c1449d.f24920e);
                    com.abedelazizshe.lightcompressorlibrary.config.b bVar8 = bVar4;
                    bVar8.a(c1449d.f24924i[i14], fPow, i7, i10, c1449d.f24920e);
                    com.abedelazizshe.lightcompressorlibrary.config.b bVar9 = bVar5;
                    bVar9.a(c1449d.f24924i[i15], fPow, i7, i10, c1449d.f24920e);
                    float f11 = i13;
                    float size2 = (f11 - 2.0f) / list2.size();
                    float size3 = (f11 - 1.0f) / list2.size();
                    float f12 = (size2 + size3) / 2.0f;
                    String.valueOf(f12);
                    paint2.setStyle(Paint.Style.FILL);
                    paint2.setColor(MapGradientPolyline.d(iArr, f12));
                    float f13 = fPow;
                    canvas.drawCircle((float) bVar2.f19294a, (float) bVar2.f19295b, paint2.getStrokeWidth() / 2.0f, paint2);
                    paint2.setStyle(Paint.Style.STROKE);
                    com.abedelazizshe.lightcompressorlibrary.config.b bVar10 = bVar2;
                    c1449d.a(canvas, matrix, paint, paint2, i14 == 0 ? bVar6 : bVar8, bVar10, size2, f12);
                    bVar2 = bVar10;
                    a(canvas, matrix, paint, paint2, bVar2, i13 == list2.size() + (-1) ? bVar7 : bVar9, f12, size3);
                    i13++;
                    c1449d = this;
                    fPow = f13;
                    bVar5 = bVar9;
                    list = list2;
                    bVar = bVar6;
                    bVar3 = bVar7;
                    bVar4 = bVar8;
                }
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return new Tile(i12, i12, byteArrayOutputStream.toByteArray());
    }
}
