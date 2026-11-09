package androidx.core.graphics;

import N8.q0;
import android.graphics.Path;
import com.transsnet.palmpay.core.bean.rsp.HomeMenuBean;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char f16063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f16064b;

    public g(char c6, float[] fArr) {
        this.f16063a = c6;
        this.f16064b = fArr;
    }

    public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z3, boolean z8) {
        double d2;
        double d10;
        double radians = Math.toRadians(f16);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d11 = f10;
        double d12 = f11;
        double d13 = f14;
        double d14 = ((d12 * dSin) + (d11 * dCos)) / d13;
        double d15 = f15;
        double d16 = ((d12 * dCos) + (((double) (-f10)) * dSin)) / d15;
        double d17 = f13;
        double d18 = ((d17 * dSin) + (((double) f12) * dCos)) / d13;
        double d19 = ((d17 * dCos) + (((double) (-f12)) * dSin)) / d15;
        double d20 = d14 - d18;
        double d21 = d16 - d19;
        double d22 = (d14 + d18) / 2.0d;
        double d23 = (d16 + d19) / 2.0d;
        double d24 = (d21 * d21) + (d20 * d20);
        if (d24 == 0.0d) {
            return;
        }
        double d25 = (1.0d / d24) - 0.25d;
        if (d25 < 0.0d) {
            float fSqrt = (float) (Math.sqrt(d24) / 1.99999d);
            a(path, f10, f11, f12, f13, f14 * fSqrt, fSqrt * f15, f16, z3, z8);
            return;
        }
        double dSqrt = Math.sqrt(d25);
        double d26 = d20 * dSqrt;
        double d27 = dSqrt * d21;
        if (z3 == z8) {
            d2 = d22 - d27;
            d10 = d23 + d26;
        } else {
            d2 = d22 + d27;
            d10 = d23 - d26;
        }
        double dAtan2 = Math.atan2(d16 - d10, d14 - d2);
        double dAtan3 = Math.atan2(d19 - d10, d18 - d2) - dAtan2;
        if (z8 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d28 = d2 * d13;
        double d29 = d10 * d15;
        double d30 = (d28 * dCos) - (d29 * dSin);
        double d31 = (d29 * dCos) + (d28 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d32 = -d13;
        double d33 = d32 * dCos2;
        double d34 = d15 * dSin2;
        double d35 = (d33 * dSin3) - (d34 * dCos3);
        double d36 = d32 * dSin2;
        double d37 = d15 * dCos2;
        double d38 = dAtan3;
        double d39 = d30;
        int i7 = iCeil;
        double d40 = d38 / ((double) i7);
        double d41 = (dCos3 * d37) + (dSin3 * d36);
        double d42 = d35;
        double d43 = d11;
        double d44 = d12;
        int i10 = 0;
        double d45 = dAtan2;
        while (i10 < i7) {
            double d46 = d45 + d40;
            double dSin4 = Math.sin(d46);
            double dCos4 = Math.cos(d46);
            double d47 = dCos2;
            double dX = q0.x(d13, d47, dCos4, d39) - (d34 * dSin4);
            double d48 = dSin2;
            double dX2 = (d37 * dSin4) + q0.x(d13, d48, dCos4, d31);
            double d49 = (d33 * dSin4) - (d34 * dCos4);
            double d50 = (dCos4 * d37) + (dSin4 * d36);
            double d51 = d46 - d45;
            double dTan = Math.tan(d51 / 2.0d);
            double dSqrt2 = ((Math.sqrt(q0.x(dTan, 3.0d, dTan, 4.0d)) - 1.0d) * Math.sin(d51)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d42 * dSqrt2) + d43), (float) ((d41 * dSqrt2) + d44), (float) (dX - (dSqrt2 * d49)), (float) (dX2 - (dSqrt2 * d50)), (float) dX, (float) dX2);
            i10++;
            d40 = d40;
            d44 = dX2;
            d36 = d36;
            i7 = i7;
            d45 = d46;
            d39 = d39;
            dSin2 = d48;
            d42 = d49;
            d41 = d50;
            d43 = dX;
            dCos2 = d47;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(g[] gVarArr, Path path) {
        int i7;
        int i10;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float[] fArr = new float[6];
        int length = gVarArr.length;
        char c6 = 'm';
        int i11 = 0;
        char c10 = 'm';
        int i12 = 0;
        while (i12 < length) {
            g gVar = gVarArr[i12];
            char c11 = gVar.f16063a;
            float f22 = fArr[i11];
            float f23 = fArr[1];
            float f24 = fArr[2];
            float f25 = fArr[3];
            float f26 = fArr[4];
            float f27 = fArr[5];
            switch (c11) {
                case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
                case 'a':
                    i7 = 7;
                    break;
                case 'C':
                case 'c':
                    i7 = 6;
                    break;
                case KkCarPayResultDialog.SUCCESS_TITLE_MARGIN_TOP_DP /* 72 */:
                case 'V':
                case 'h':
                case 'v':
                    i7 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i7 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f26, f27);
                    f22 = f26;
                    f24 = f22;
                    f23 = f27;
                    f25 = f23;
                default:
                    i7 = 2;
                    break;
            }
            float f28 = f23;
            float f29 = f26;
            float f30 = f27;
            float f31 = f22;
            int i13 = i11;
            while (true) {
                float[] fArr2 = gVar.f16064b;
                if (i13 < fArr2.length) {
                    int i14 = i11;
                    if (c11 == 'A') {
                        i10 = i13;
                        gVar = gVar;
                        float f32 = f31;
                        float f33 = f28;
                        i12 = i12;
                        c11 = c11;
                        int i15 = i10 + 5;
                        int i16 = i10 + 6;
                        a(path, f32, f33, fArr2[i15], fArr2[i16], fArr2[i10], fArr2[i10 + 1], fArr2[i10 + 2], fArr2[i10 + 3] != 0.0f ? 1 : i14, fArr2[i10 + 4] != 0.0f ? 1 : i14);
                        f24 = fArr2[i15];
                        f10 = fArr2[i16];
                        f25 = f10;
                        f11 = f24;
                    } else if (c11 == 'C') {
                        i10 = i13;
                        i12 = i12;
                        gVar = gVar;
                        c11 = c11;
                        int i17 = i10 + 2;
                        int i18 = i10 + 3;
                        int i19 = i10 + 4;
                        int i20 = i10 + 5;
                        path.cubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i17], fArr2[i18], fArr2[i19], fArr2[i20]);
                        float f34 = fArr2[i19];
                        float f35 = fArr2[i20];
                        f24 = fArr2[i17];
                        f25 = fArr2[i18];
                        f10 = f35;
                        f11 = f34;
                    } else if (c11 != 'H') {
                        if (c11 == 'Q') {
                            i10 = i13;
                            int i21 = i10 + 1;
                            int i22 = i10 + 2;
                            int i23 = i10 + 3;
                            path.quadTo(fArr2[i10], fArr2[i21], fArr2[i22], fArr2[i23]);
                            f12 = fArr2[i10];
                            float f36 = fArr2[i21];
                            f13 = fArr2[i22];
                            f25 = f36;
                            f10 = fArr2[i23];
                        } else if (c11 == 'V') {
                            i10 = i13;
                            i12 = i12;
                            gVar = gVar;
                            f11 = f31;
                            c11 = c11;
                            path.lineTo(f11, fArr2[i10]);
                            f10 = fArr2[i10];
                        } else if (c11 != 'a') {
                            if (c11 == 'c') {
                                i10 = i13;
                                int i24 = i10 + 2;
                                int i25 = i10 + 3;
                                int i26 = i10 + 4;
                                int i27 = i10 + 5;
                                path.rCubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i24], fArr2[i25], fArr2[i26], fArr2[i27]);
                                float f37 = fArr2[i24] + f31;
                                float f38 = f28 + fArr2[i25];
                                f31 += fArr2[i26];
                                f28 += fArr2[i27];
                                f24 = f37;
                                f25 = f38;
                            } else if (c11 != 'h') {
                                if (c11 != 'q') {
                                    if (c11 != 'v') {
                                        if (c11 != 'L') {
                                            if (c11 == 'M') {
                                                i10 = i13;
                                                f11 = fArr2[i10];
                                                f10 = fArr2[i10 + 1];
                                                if (i10 > 0) {
                                                    path.lineTo(f11, f10);
                                                } else {
                                                    path.moveTo(f11, f10);
                                                    f29 = f11;
                                                    f30 = f10;
                                                }
                                            } else if (c11 == 'S') {
                                                i10 = i13;
                                                if (c10 == 'c' || c10 == 's' || c10 == 'C' || c10 == 'S') {
                                                    f31 = (f31 * 2.0f) - f24;
                                                    f28 = (f28 * 2.0f) - f25;
                                                }
                                                float f39 = f31;
                                                float f40 = f28;
                                                int i28 = i10 + 1;
                                                int i29 = i10 + 2;
                                                int i30 = i10 + 3;
                                                path.cubicTo(f39, f40, fArr2[i10], fArr2[i28], fArr2[i29], fArr2[i30]);
                                                f12 = fArr2[i10];
                                                float f41 = fArr2[i28];
                                                f13 = fArr2[i29];
                                                f25 = f41;
                                                f10 = fArr2[i30];
                                            } else if (c11 == 'T') {
                                                i10 = i13;
                                                if (c10 == 'q' || c10 == 't' || c10 == 'Q' || c10 == 'T') {
                                                    f31 = (f31 * 2.0f) - f24;
                                                    f28 = (f28 * 2.0f) - f25;
                                                }
                                                float f42 = f28;
                                                float f43 = fArr2[i10];
                                                int i31 = i10 + 1;
                                                path.quadTo(f31, f42, f43, fArr2[i31]);
                                                f25 = f42;
                                                f11 = fArr2[i10];
                                                f10 = fArr2[i31];
                                                gVar = gVar;
                                                f24 = f31;
                                            } else if (c11 == 'l') {
                                                i10 = i13;
                                                int i32 = i10 + 1;
                                                path.rLineTo(fArr2[i10], fArr2[i32]);
                                                f31 += fArr2[i10];
                                                f17 = fArr2[i32];
                                            } else if (c11 != c6) {
                                                if (c11 == 's') {
                                                    if (c10 == 'c' || c10 == 's' || c10 == 'C' || c10 == 'S') {
                                                        f18 = f28 - f25;
                                                        f19 = f31 - f24;
                                                    } else {
                                                        f19 = 0.0f;
                                                        f18 = 0.0f;
                                                    }
                                                    int i33 = i13 + 1;
                                                    int i34 = i13 + 2;
                                                    int i35 = i13 + 3;
                                                    i10 = i13;
                                                    path.rCubicTo(f19, f18, fArr2[i13], fArr2[i33], fArr2[i34], fArr2[i35]);
                                                    f14 = fArr2[i10] + f31;
                                                    f15 = f28 + fArr2[i33];
                                                    f31 += fArr2[i34];
                                                    f16 = fArr2[i35];
                                                } else if (c11 != 't') {
                                                    i10 = i13;
                                                } else {
                                                    if (c10 == 'q' || c10 == 't' || c10 == 'Q' || c10 == 'T') {
                                                        f20 = f31 - f24;
                                                        f21 = f28 - f25;
                                                    } else {
                                                        f21 = 0.0f;
                                                        f20 = 0.0f;
                                                    }
                                                    int i36 = i13 + 1;
                                                    path.rQuadTo(f20, f21, fArr2[i13], fArr2[i36]);
                                                    float f44 = f20 + f31;
                                                    float f45 = f28 + f21;
                                                    float f46 = f31 + fArr2[i13];
                                                    f28 += fArr2[i36];
                                                    f25 = f45;
                                                    i10 = i13;
                                                    f11 = f46;
                                                    f24 = f44;
                                                }
                                                f10 = f28;
                                            } else {
                                                i10 = i13;
                                                float f47 = fArr2[i10];
                                                f31 += f47;
                                                float f48 = fArr2[i10 + 1];
                                                f28 += f48;
                                                if (i10 > 0) {
                                                    path.rLineTo(f47, f48);
                                                } else {
                                                    path.rMoveTo(f47, f48);
                                                    gVar = gVar;
                                                    f11 = f31;
                                                    f29 = f11;
                                                    f10 = f28;
                                                    f30 = f10;
                                                }
                                            }
                                            c11 = c11;
                                        } else {
                                            i10 = i13;
                                            int i37 = i10 + 1;
                                            path.lineTo(fArr2[i10], fArr2[i37]);
                                            f11 = fArr2[i10];
                                            f10 = fArr2[i37];
                                        }
                                        gVar = gVar;
                                        c11 = c11;
                                    } else {
                                        i10 = i13;
                                        path.rLineTo(0.0f, fArr2[i10]);
                                        f17 = fArr2[i10];
                                    }
                                    f28 += f17;
                                } else {
                                    i10 = i13;
                                    int i38 = i10 + 1;
                                    int i39 = i10 + 2;
                                    int i40 = i10 + 3;
                                    path.rQuadTo(fArr2[i10], fArr2[i38], fArr2[i39], fArr2[i40]);
                                    f14 = fArr2[i10] + f31;
                                    f15 = f28 + fArr2[i38];
                                    f31 += fArr2[i39];
                                    f16 = fArr2[i40];
                                }
                                f28 += f16;
                                f24 = f14;
                                f25 = f15;
                            } else {
                                i10 = i13;
                                path.rLineTo(fArr2[i10], 0.0f);
                                f31 += fArr2[i10];
                            }
                            f11 = f31;
                            f10 = f28;
                            c11 = c11;
                        } else {
                            i10 = i13;
                            int i41 = i10 + 5;
                            float f49 = fArr2[i41] + f31;
                            int i42 = i10 + 6;
                            float f50 = fArr2[i42] + f28;
                            gVar = gVar;
                            float f51 = f31;
                            c11 = c11;
                            float f52 = f28;
                            i12 = i12;
                            a(path, f51, f52, f49, f50, fArr2[i10], fArr2[i10 + 1], fArr2[i10 + 2], fArr2[i10 + 3] != 0.0f ? 1 : i14, fArr2[i10 + 4] != 0.0f ? 1 : i14);
                            f11 = f51 + fArr2[i41];
                            f10 = f52 + fArr2[i42];
                            f24 = f11;
                            f25 = f10;
                        }
                        f24 = f12;
                        f11 = f13;
                    } else {
                        i10 = i13;
                        gVar = gVar;
                        c11 = c11;
                        f10 = f28;
                        i12 = i12;
                        path.lineTo(fArr2[i10], f10);
                        f11 = fArr2[i10];
                    }
                    c11 = c11;
                    gVar = gVar;
                    i12 = i12;
                    i11 = i14;
                    c6 = 'm';
                    f31 = f11;
                    f28 = f10;
                    c10 = c11;
                    i13 = i10 + i7;
                    path = path;
                }
            }
            int i43 = i11;
            fArr[i43] = f31;
            fArr[1] = f28;
            fArr[2] = f24;
            fArr[3] = f25;
            fArr[4] = f29;
            fArr[5] = f30;
            c10 = gVar.f16063a;
            i12++;
            i11 = i43;
            c6 = 'm';
        }
    }

    public g(g gVar) {
        this.f16063a = gVar.f16063a;
        float[] fArr = gVar.f16064b;
        this.f16064b = o.b(fArr.length, fArr);
    }
}
