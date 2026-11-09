package com.google.android.material.shape;

import Af.d;
import E.AbstractC0198c;
import G8.a;
import Z4.e;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p192n.c;
import t0.s;
import t0.t;
import t0.u;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public final class MaterialShapes {
    private static final t0.c CORNER_ROUND_15 = new t0.c(0.15f, 0.0f);
    private static final t0.c CORNER_ROUND_20 = new t0.c(0.2f, 0.0f);
    private static final t0.c CORNER_ROUND_30 = new t0.c(0.3f, 0.0f);
    private static final t0.c CORNER_ROUND_50 = new t0.c(0.5f, 0.0f);
    private static final t0.c CORNER_ROUND_100 = new t0.c(1.0f, 0.0f);
    public static final t CIRCLE = normalize(getCircle(), true);
    public static final t SQUARE = normalize(getSquare(), true);
    public static final t SLANTED_SQUARE = normalize(getSlantedSquare(), true);
    public static final t ARCH = normalize(getArch(), true);
    public static final t FAN = normalize(getFan(), true);
    public static final t ARROW = normalize(getArrow(), true);
    public static final t SEMI_CIRCLE = normalize(getSemiCircle(), true);
    public static final t OVAL = normalize(getOval(-45.0f), true);
    public static final t PILL = normalize(getPill(), true);
    public static final t TRIANGLE = normalize(getTriangle(-90.0f), true);
    public static final t DIAMOND = normalize(getDiamond(), true);
    public static final t CLAM_SHELL = normalize(getClamShell(), true);
    public static final t PENTAGON = normalize(getPentagon(), true);
    public static final t GEM = normalize(getGem(-90.0f), true);
    public static final t SUNNY = normalize(getSunny(), true);
    public static final t VERY_SUNNY = normalize(getVerySunny(), true);
    public static final t COOKIE_4 = normalize(getCookie4(), true);
    public static final t COOKIE_6 = normalize(getCookie6(), true);
    public static final t COOKIE_7 = normalize(getCookie7(), true);
    public static final t COOKIE_9 = normalize(getCookie9(), true);
    public static final t COOKIE_12 = normalize(getCookie12(), true);
    public static final t GHOSTISH = normalize(getGhostish(), true);
    public static final t CLOVER_4 = normalize(getClover4(), true);
    public static final t CLOVER_8 = normalize(getClover8(), true);
    public static final t BURST = normalize(getBurst(), true);
    public static final t SOFT_BURST = normalize(getSoftBurst(), true);
    public static final t BOOM = normalize(getBoom(), true);
    public static final t SOFT_BOOM = normalize(getSoftBoom(), true);
    public static final t FLOWER = normalize(getFlower(), true);
    public static final t PUFFY = normalize(getPuffy(), true);
    public static final t PUFFY_DIAMOND = normalize(getPuffyDiamond(), true);
    public static final t PIXEL_CIRCLE = normalize(getPixelCircle(), true);
    public static final t PIXEL_TRIANGLE = normalize(getPixelTriangle(), true);
    public static final t BUN = normalize(getBun(), true);
    public static final t HEART = normalize(getHeart(), true);

    private MaterialShapes() {
    }

    @NonNull
    @RestrictTo({c.f39801b})
    public static Matrix createRotationMatrix(float f10) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f10);
        return matrix;
    }

    @NonNull
    @RestrictTo({c.f39801b})
    public static Matrix createScaleMatrix(float f10, float f11) {
        Matrix matrix = new Matrix();
        matrix.setScale(f10, f11);
        return matrix;
    }

    @NonNull
    @RestrictTo({c.f39801b})
    public static ShapeDrawable createShapeDrawable(@NonNull t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Path path = new Path();
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        e.A(path, tVar.f42310d);
        return new ShapeDrawable(new PathShape(path, 1.0f, 1.0f));
    }

    @NonNull
    @RestrictTo({c.f39801b})
    public static Matrix createSkewMatrix(float f10, float f11) {
        Matrix matrix = new Matrix();
        matrix.setSkew(f10, f11);
        return matrix;
    }

    @NonNull
    private static t customPolygon(@NonNull List<VertexAndRounding> list, int i7, float f10, float f11, boolean z3) {
        ArrayList arrayList = new ArrayList();
        repeatAroundCenter(list, arrayList, i7, f10, f11, z3);
        return a.b(toVerticesXyArray(arrayList), t0.c.f42273c, toRoundingsList(arrayList), f10, f11);
    }

    @NonNull
    private static t getArch() {
        t0.c cVar = t0.c.f42273c;
        t0.c cVar2 = CORNER_ROUND_100;
        t0.c cVar3 = CORNER_ROUND_20;
        return e.O(a.a(4, 1.0f, cVar, Arrays.asList(cVar2, cVar2, cVar3, cVar3)), createRotationMatrix(-135.0f));
    }

    @NonNull
    private static t getArrow() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 0.892f), new t0.c(0.313f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(-0.216f, 1.05f), new t0.c(0.207f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.499f, -0.16f), new t0.c(0.215f, 1.0f)));
        arrayList.add(new VertexAndRounding(new PointF(1.225f, 1.06f), new t0.c(0.211f, 0.0f)));
        return customPolygon(arrayList, 1, 0.5f, 0.5f, false);
    }

    @NonNull
    private static t getBoom() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.457f, 0.296f), new t0.c(0.007f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.5f, -0.051f), new t0.c(0.007f, 0.0f)));
        return customPolygon(arrayList, 15, 0.5f, 0.5f, false);
    }

    @NonNull
    private static t getBun() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.796f, 0.5f)));
        PointF pointF = new PointF(0.853f, 0.518f);
        t0.c cVar = CORNER_ROUND_100;
        arrayList.add(new VertexAndRounding(pointF, cVar));
        arrayList.add(new VertexAndRounding(new PointF(0.992f, 0.631f), cVar));
        arrayList.add(new VertexAndRounding(new PointF(0.968f, 1.0f), cVar));
        return customPolygon(arrayList, 2, 0.5f, 0.5f, true);
    }

    @NonNull
    private static t getBurst() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, -0.006f), new t0.c(0.006f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.592f, 0.158f), new t0.c(0.006f, 0.0f)));
        return customPolygon(arrayList, 12, 0.5f, 0.5f, false);
    }

    @NonNull
    private static t getCircle() {
        s sVar = t.f42306e;
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return J3.a.f(sVar, 14);
    }

    @NonNull
    private static t getClamShell() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.171f, 0.841f), new t0.c(0.159f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(-0.02f, 0.5f), new t0.c(0.14f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.17f, 0.159f), new t0.c(0.159f, 0.0f)));
        return customPolygon(arrayList, 2, 0.5f, 0.5f, false);
    }

    @NonNull
    private static t getClover4() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 0.074f)));
        arrayList.add(new VertexAndRounding(new PointF(0.725f, -0.099f), new t0.c(0.476f, 0.0f)));
        return customPolygon(arrayList, 4, 0.5f, 0.5f, true);
    }

    @NonNull
    private static t getClover8() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 0.036f)));
        arrayList.add(new VertexAndRounding(new PointF(0.758f, -0.101f), new t0.c(0.209f, 0.0f)));
        return customPolygon(arrayList, 8, 0.5f, 0.5f, false);
    }

    @NonNull
    private static t getCookie12() {
        return e.O(J3.a.Q(t.f42306e, 12, 0.8f, CORNER_ROUND_50), createRotationMatrix(-90.0f));
    }

    @NonNull
    private static t getCookie4() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(1.237f, 1.236f), new t0.c(0.258f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 0.918f), new t0.c(0.233f, 0.0f)));
        return customPolygon(arrayList, 4, 0.5f, 0.5f, false);
    }

    @NonNull
    private static t getCookie6() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.723f, 0.884f), new t0.c(0.394f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 1.099f), new t0.c(0.398f, 0.0f)));
        return customPolygon(arrayList, 6, 0.5f, 0.5f, false);
    }

    @NonNull
    private static t getCookie7() {
        return e.O(J3.a.Q(t.f42306e, 7, 0.75f, CORNER_ROUND_50), createRotationMatrix(-90.0f));
    }

    @NonNull
    private static t getCookie9() {
        return e.O(J3.a.Q(t.f42306e, 9, 0.8f, CORNER_ROUND_50), createRotationMatrix(-90.0f));
    }

    @NonNull
    private static t getDiamond() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 1.096f), new t0.c(0.151f, 0.524f)));
        arrayList.add(new VertexAndRounding(new PointF(0.04f, 0.5f), new t0.c(0.159f, 0.0f)));
        return customPolygon(arrayList, 2, 0.5f, 0.5f, false);
    }

    @NonNull
    private static t getFan() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(1.0f, 1.0f), new t0.c(0.148f, 0.417f)));
        arrayList.add(new VertexAndRounding(new PointF(0.0f, 1.0f), new t0.c(0.151f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.0f, 0.0f), new t0.c(0.148f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.978f, 0.02f), new t0.c(0.803f, 0.0f)));
        return customPolygon(arrayList, 1, 0.5f, 0.5f, false);
    }

    @NonNull
    private static t getFlower() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.37f, 0.187f)));
        arrayList.add(new VertexAndRounding(new PointF(0.416f, 0.049f), new t0.c(0.381f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.479f, 0.0f), new t0.c(0.095f, 0.0f)));
        return customPolygon(arrayList, 8, 0.5f, 0.5f, true);
    }

    @NonNull
    private static t getGem() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.499f, 1.023f), new t0.c(0.241f, 0.778f)));
        arrayList.add(new VertexAndRounding(new PointF(-0.005f, 0.792f), new t0.c(0.208f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.073f, 0.258f), new t0.c(0.228f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.433f, -0.0f), new t0.c(0.491f, 0.0f)));
        return customPolygon(arrayList, 1, 0.5f, 0.5f, true);
    }

    @NonNull
    private static t getGhostish() {
        ArrayList arrayList = new ArrayList();
        PointF pointF = new PointF(0.5f, 0.0f);
        t0.c cVar = CORNER_ROUND_100;
        arrayList.add(new VertexAndRounding(pointF, cVar));
        arrayList.add(new VertexAndRounding(new PointF(1.0f, 0.0f), cVar));
        arrayList.add(new VertexAndRounding(new PointF(1.0f, 1.14f), new t0.c(0.254f, 0.106f)));
        arrayList.add(new VertexAndRounding(new PointF(0.575f, 0.906f), new t0.c(0.253f, 0.0f)));
        return customPolygon(arrayList, 1, 0.5f, 0.5f, true);
    }

    @NonNull
    private static t getHeart() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 0.268f), new t0.c(0.016f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.792f, -0.066f), new t0.c(0.958f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(1.064f, 0.276f), CORNER_ROUND_100));
        arrayList.add(new VertexAndRounding(new PointF(0.501f, 0.946f), new t0.c(0.129f, 0.0f)));
        return customPolygon(arrayList, 1, 0.5f, 0.5f, true);
    }

    @NonNull
    private static t getOval() {
        s sVar = t.f42306e;
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return e.O(J3.a.f(sVar, 15), createScaleMatrix(1.0f, 0.64f));
    }

    @NonNull
    private static t getPentagon() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, -0.009f), new t0.c(0.172f, 0.0f)));
        return customPolygon(arrayList, 5, 0.5f, 0.5f, false);
    }

    @NonNull
    private static t getPill() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.961f, 0.039f), new t0.c(0.426f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(1.001f, 0.428f)));
        arrayList.add(new VertexAndRounding(new PointF(1.0f, 0.609f), CORNER_ROUND_100));
        return customPolygon(arrayList, 2, 0.5f, 0.5f, true);
    }

    @NonNull
    private static t getPixelCircle() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.704f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.704f, 0.065f)));
        arrayList.add(new VertexAndRounding(new PointF(0.843f, 0.065f)));
        arrayList.add(new VertexAndRounding(new PointF(0.843f, 0.148f)));
        arrayList.add(new VertexAndRounding(new PointF(0.926f, 0.148f)));
        arrayList.add(new VertexAndRounding(new PointF(0.926f, 0.296f)));
        arrayList.add(new VertexAndRounding(new PointF(1.0f, 0.296f)));
        return customPolygon(arrayList, 2, 0.5f, 0.5f, true);
    }

    @NonNull
    private static t getPixelTriangle() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.11f, 0.5f)));
        arrayList.add(new VertexAndRounding(new PointF(0.113f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.287f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.287f, 0.087f)));
        arrayList.add(new VertexAndRounding(new PointF(0.421f, 0.087f)));
        arrayList.add(new VertexAndRounding(new PointF(0.421f, 0.17f)));
        arrayList.add(new VertexAndRounding(new PointF(0.56f, 0.17f)));
        arrayList.add(new VertexAndRounding(new PointF(0.56f, 0.265f)));
        arrayList.add(new VertexAndRounding(new PointF(0.674f, 0.265f)));
        arrayList.add(new VertexAndRounding(new PointF(0.675f, 0.344f)));
        arrayList.add(new VertexAndRounding(new PointF(0.789f, 0.344f)));
        arrayList.add(new VertexAndRounding(new PointF(0.789f, 0.439f)));
        arrayList.add(new VertexAndRounding(new PointF(0.888f, 0.439f)));
        return customPolygon(arrayList, 1, 0.5f, 0.5f, true);
    }

    @NonNull
    private static t getPuffy() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 0.053f)));
        arrayList.add(new VertexAndRounding(new PointF(0.545f, -0.04f), new t0.c(0.405f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.67f, -0.035f), new t0.c(0.426f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.717f, 0.066f), new t0.c(0.574f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.722f, 0.128f)));
        arrayList.add(new VertexAndRounding(new PointF(0.777f, 0.002f), new t0.c(0.36f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.914f, 0.149f), new t0.c(0.66f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.926f, 0.289f), new t0.c(0.66f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.881f, 0.346f)));
        arrayList.add(new VertexAndRounding(new PointF(0.94f, 0.344f), new t0.c(0.126f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(1.003f, 0.437f), new t0.c(0.255f, 0.0f)));
        return e.O(customPolygon(arrayList, 2, 0.5f, 0.5f, true), createScaleMatrix(1.0f, 0.742f));
    }

    @NonNull
    private static t getPuffyDiamond() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.87f, 0.13f), new t0.c(0.146f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.818f, 0.357f)));
        arrayList.add(new VertexAndRounding(new PointF(1.0f, 0.332f), new t0.c(0.853f, 0.0f)));
        return customPolygon(arrayList, 4, 0.5f, 0.5f, true);
    }

    @NonNull
    private static t getSemiCircle() {
        s sVar = t.f42306e;
        t0.c cVar = t0.c.f42273c;
        t0.c cVar2 = CORNER_ROUND_20;
        t0.c cVar3 = CORNER_ROUND_100;
        return J3.a.N(sVar, 1.6f, cVar, Arrays.asList(cVar2, cVar2, cVar3, cVar3));
    }

    @NonNull
    private static t getSlantedSquare() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.926f, 0.97f), new t0.c(0.189f, 0.811f)));
        arrayList.add(new VertexAndRounding(new PointF(-0.021f, 0.967f), new t0.c(0.187f, 0.057f)));
        return customPolygon(arrayList, 2, 0.5f, 0.5f, false);
    }

    @NonNull
    private static t getSoftBoom() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.733f, 0.454f)));
        arrayList.add(new VertexAndRounding(new PointF(0.839f, 0.437f), new t0.c(0.532f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.949f, 0.449f), new t0.c(0.439f, 1.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.998f, 0.478f), new t0.c(0.174f, 0.0f)));
        return customPolygon(arrayList, 16, 0.5f, 0.5f, true);
    }

    @NonNull
    private static t getSoftBurst() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.193f, 0.277f), new t0.c(0.053f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.176f, 0.055f), new t0.c(0.053f, 0.0f)));
        return customPolygon(arrayList, 10, 0.5f, 0.5f, false);
    }

    @NonNull
    private static t getSquare() {
        return J3.a.N(t.f42306e, 1.0f, CORNER_ROUND_30, null);
    }

    @NonNull
    private static t getSunny() {
        return J3.a.Q(t.f42306e, 8, 0.8f, CORNER_ROUND_15);
    }

    @NonNull
    private static t getTriangle() {
        t0.c rounding = CORNER_ROUND_20;
        Intrinsics.checkNotNullParameter(rounding, "rounding");
        return a.a(3, 1.0f, rounding, null);
    }

    @NonNull
    private static t getVerySunny() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VertexAndRounding(new PointF(0.5f, 1.08f), new t0.c(0.085f, 0.0f)));
        arrayList.add(new VertexAndRounding(new PointF(0.358f, 0.843f), new t0.c(0.085f, 0.0f)));
        return customPolygon(arrayList, 8, 0.5f, 0.5f, false);
    }

    @NonNull
    @RestrictTo({c.f39801b})
    public static t normalize(@NonNull t tVar, boolean z3, @NonNull RectF rectF) {
        char c6;
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        float f10;
        float f11;
        char c17 = 4;
        float[] bounds = new float[4];
        char c18 = 3;
        char c19 = 2;
        char c20 = 0;
        char c21 = 1;
        if (z3) {
            tVar.getClass();
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            d dVar = tVar.f42310d;
            int iA = dVar.a();
            float fMax = 0.0f;
            int i7 = 0;
            while (true) {
                f10 = tVar.f42309c;
                f11 = tVar.f42308b;
                if (i7 >= iA) {
                    break;
                }
                t0.e eVar = (t0.e) dVar.get(i7);
                float[] fArr = eVar.f42277a;
                float f12 = fArr[0] - f11;
                float f13 = fArr[1] - f10;
                float f14 = u.f42312b;
                float f15 = (f13 * f13) + (f12 * f12);
                long jC = eVar.c(0.5f);
                float F10 = AbstractC0198c.F(jC) - f11;
                float fG = AbstractC0198c.G(jC) - f10;
                fMax = Math.max(fMax, Math.max(f15, (fG * fG) + (F10 * F10)));
                i7++;
            }
            float fSqrt = (float) Math.sqrt(fMax);
            bounds[0] = f11 - fSqrt;
            bounds[1] = f10 - fSqrt;
            bounds[2] = f11 + fSqrt;
            bounds[3] = f10 + fSqrt;
            c6 = 3;
            c10 = 2;
            c11 = 0;
            c12 = 1;
        } else {
            tVar.getClass();
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            d dVar2 = tVar.f42310d;
            int iA2 = dVar2.a();
            float fMax2 = Float.MIN_VALUE;
            int i10 = 0;
            float fMin = Float.MAX_VALUE;
            float fMin2 = Float.MAX_VALUE;
            float fMax3 = Float.MIN_VALUE;
            while (i10 < iA2) {
                t0.e eVar2 = (t0.e) dVar2.get(i10);
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(bounds, "bounds");
                boolean zF = eVar2.f();
                char c22 = c17;
                float[] fArr2 = eVar2.f42277a;
                if (zF) {
                    bounds[c20] = fArr2[c20];
                    bounds[c21] = fArr2[c21];
                    bounds[c19] = fArr2[c20];
                    bounds[c18] = fArr2[c21];
                    c13 = c18;
                    c14 = c19;
                    c15 = c20;
                    c16 = c21;
                } else {
                    c13 = c18;
                    c14 = c19;
                    float fMin3 = Math.min(fArr2[c20], eVar2.a());
                    c15 = c20;
                    float fMin4 = Math.min(fArr2[c21], eVar2.b());
                    c16 = c21;
                    float fMax4 = Math.max(fArr2[c15], eVar2.a());
                    float fMax5 = Math.max(fArr2[c16], eVar2.b());
                    bounds[c15] = Math.min(fMin3, Math.min(fArr2[c14], fArr2[c22]));
                    bounds[c16] = Math.min(fMin4, Math.min(fArr2[c13], fArr2[5]));
                    bounds[c14] = Math.max(fMax4, Math.max(fArr2[c14], fArr2[c22]));
                    bounds[c13] = Math.max(fMax5, Math.max(fArr2[c13], fArr2[5]));
                }
                fMin = Math.min(fMin, bounds[c15]);
                fMin2 = Math.min(fMin2, bounds[c16]);
                fMax2 = Math.max(fMax2, bounds[c14]);
                fMax3 = Math.max(fMax3, bounds[c13]);
                i10++;
                c18 = c13;
                c17 = c22;
                c19 = c14;
                c20 = c15;
                c21 = c16;
            }
            c6 = c18;
            c10 = c19;
            c11 = c20;
            c12 = c21;
            bounds[c11] = fMin;
            bounds[c12] = fMin2;
            bounds[c10] = fMax2;
            bounds[c6] = fMax3;
        }
        RectF rectF2 = new RectF(bounds[c11], bounds[c12], bounds[c10], bounds[c6]);
        float fMin5 = Math.min(rectF.width() / rectF2.width(), rectF.height() / rectF2.height());
        Matrix matrixCreateScaleMatrix = createScaleMatrix(fMin5, fMin5);
        matrixCreateScaleMatrix.preTranslate(-rectF2.centerX(), -rectF2.centerY());
        matrixCreateScaleMatrix.postTranslate(rectF.centerX(), rectF.centerY());
        return e.O(tVar, matrixCreateScaleMatrix);
    }

    private static void repeatAroundCenter(@NonNull List<VertexAndRounding> list, @NonNull List<VertexAndRounding> list2, int i7, float f10, float f11, boolean z3) {
        list2.clear();
        toRadial(list, f10, f11);
        float f12 = (float) (6.283185307179586d / ((double) i7));
        if (z3) {
            int i10 = i7 * 2;
            float f13 = f12 / 2.0f;
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < list.size(); i12++) {
                    boolean z8 = i11 % 2 != 0;
                    int size = z8 ? (list.size() - 1) - i12 : i12;
                    VertexAndRounding vertexAndRounding = list.get(size);
                    if (size > 0 || !z8) {
                        list2.add(new VertexAndRounding(new PointF((i11 * f13) + (z8 ? (list.get(0).vertex.x * 2.0f) + (f13 - vertexAndRounding.vertex.x) : vertexAndRounding.vertex.x), vertexAndRounding.vertex.y), vertexAndRounding.rounding));
                    }
                }
            }
        } else {
            for (int i13 = 0; i13 < i7; i13++) {
                for (VertexAndRounding vertexAndRounding2 : list) {
                    list2.add(new VertexAndRounding(new PointF((i13 * f12) + vertexAndRounding2.vertex.x, vertexAndRounding2.vertex.y), vertexAndRounding2.rounding));
                }
            }
        }
        toCartesian(list2, f10, f11);
    }

    private static void toCartesian(@NonNull List<VertexAndRounding> list, float f10, float f11) {
        Iterator<VertexAndRounding> it = list.iterator();
        while (it.hasNext()) {
            it.next().toCartesian(f10, f11);
        }
    }

    private static void toRadial(@NonNull List<VertexAndRounding> list, float f10, float f11) {
        Iterator<VertexAndRounding> it = list.iterator();
        while (it.hasNext()) {
            it.next().toRadial(f10, f11);
        }
    }

    @NonNull
    private static List<t0.c> toRoundingsList(@NonNull List<VertexAndRounding> list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            arrayList.add(list.get(i7).rounding);
        }
        return arrayList;
    }

    @NonNull
    private static float[] toVerticesXyArray(@NonNull List<VertexAndRounding> list) {
        float[] fArr = new float[list.size() * 2];
        for (int i7 = 0; i7 < list.size(); i7++) {
            int i10 = i7 * 2;
            fArr[i10] = list.get(i7).vertex.x;
            fArr[i10 + 1] = list.get(i7).vertex.y;
        }
        return fArr;
    }

    public static class VertexAndRounding {
        private t0.c rounding;
        private PointF vertex;

        /* JADX INFO: Access modifiers changed from: private */
        public void toCartesian(float f10, float f11) {
            PointF pointF = this.vertex;
            float fCos = (float) ((Math.cos(pointF.x) * ((double) pointF.y)) + ((double) f10));
            PointF pointF2 = this.vertex;
            float fSin = (float) ((Math.sin(pointF2.x) * ((double) pointF2.y)) + ((double) f11));
            PointF pointF3 = this.vertex;
            pointF3.x = fCos;
            pointF3.y = fSin;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void toRadial(float f10, float f11) {
            this.vertex.offset(-f10, -f11);
            PointF pointF = this.vertex;
            float fAtan2 = (float) Math.atan2(pointF.y, pointF.x);
            PointF pointF2 = this.vertex;
            float fHypot = (float) Math.hypot(pointF2.x, pointF2.y);
            PointF pointF3 = this.vertex;
            pointF3.x = fAtan2;
            pointF3.y = fHypot;
        }

        private VertexAndRounding(@NonNull PointF pointF) {
            this(pointF, t0.c.f42273c);
        }

        private VertexAndRounding(@NonNull PointF pointF, @NonNull t0.c cVar) {
            this.vertex = pointF;
            this.rounding = cVar;
        }
    }

    @NonNull
    private static t getTriangle(float f10) {
        return e.O(getTriangle(), createRotationMatrix(f10));
    }

    @NonNull
    private static t getOval(float f10) {
        return e.O(getOval(), createRotationMatrix(f10));
    }

    @NonNull
    private static t getGem(float f10) {
        return e.O(getGem(), createRotationMatrix(f10));
    }

    @NonNull
    @RestrictTo({c.f39801b})
    public static t normalize(@NonNull t tVar, boolean z3) {
        return normalize(tVar, z3, new RectF(0.0f, 0.0f, 1.0f, 1.0f));
    }
}
