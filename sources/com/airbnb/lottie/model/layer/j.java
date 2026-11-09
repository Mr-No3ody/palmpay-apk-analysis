package com.airbnb.lottie.model.layer;

import N8.q0;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.camera.camera2.internal.F;
import androidx.camera.camera2.internal.P0;
import com.airbnb.lottie.AbstractC1310b;
import com.airbnb.lottie.J;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.o;
import com.airbnb.lottie.animation.keyframe.r;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.content.l;
import com.airbnb.lottie.y;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.text.ReactFontManager;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j extends a {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final StringBuilder f20087D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final StringBuilder f20088E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final StringBuilder f20089F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final StringBuilder f20090G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final RectF f20091H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final Matrix f20092I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final com.airbnb.lottie.animation.a f20093J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final com.airbnb.lottie.animation.a f20094K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final HashMap f20095L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final M.j f20096M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final ArrayList f20097N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ArrayList f20098O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.e f20099P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final y f20100Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final k f20101R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final int f20102S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.e f20103T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public r f20104U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.e f20105V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public r f20106W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.h f20107X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public r f20108Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.h f20109Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public r f20110a0;
    public final com.airbnb.lottie.animation.keyframe.e b0;
    public r c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public r f20111d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.e f20112e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.e f20113f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.e f20114g0;

    public j(y yVar, e eVar) {
        Na.a aVar;
        Na.a aVar2;
        com.airbnb.lottie.model.animatable.a aVar3;
        Na.a aVar4;
        com.airbnb.lottie.model.animatable.a aVar5;
        Na.a aVar6;
        com.airbnb.lottie.model.animatable.a aVar7;
        N2.a aVar8;
        com.airbnb.lottie.model.animatable.a aVar9;
        N2.a aVar10;
        com.airbnb.lottie.model.animatable.b bVar;
        N2.a aVar11;
        com.airbnb.lottie.model.animatable.b bVar2;
        N2.a aVar12;
        com.airbnb.lottie.model.animatable.a aVar13;
        N2.a aVar14;
        com.airbnb.lottie.model.animatable.a aVar15;
        super(yVar, eVar);
        this.f20087D = new StringBuilder(2);
        this.f20088E = new StringBuilder(0);
        this.f20089F = new StringBuilder(0);
        this.f20090G = new StringBuilder(0);
        this.f20091H = new RectF();
        this.f20092I = new Matrix();
        com.airbnb.lottie.animation.a aVar16 = new com.airbnb.lottie.animation.a(1, 1);
        aVar16.setStyle(Paint.Style.FILL);
        this.f20093J = aVar16;
        com.airbnb.lottie.animation.a aVar17 = new com.airbnb.lottie.animation.a(1, 2);
        aVar17.setStyle(Paint.Style.STROKE);
        this.f20094K = aVar17;
        this.f20095L = new HashMap();
        this.f20096M = new M.j();
        this.f20097N = new ArrayList();
        this.f20098O = new ArrayList();
        this.f20102S = 2;
        this.f20100Q = yVar;
        this.f20101R = eVar.f20052b;
        com.airbnb.lottie.animation.keyframe.e eVar2 = new com.airbnb.lottie.animation.keyframe.e((List) eVar.f20067q.f1592b, 2);
        this.f20099P = eVar2;
        eVar2.a(this);
        a(eVar2);
        androidx.work.impl.model.b bVar3 = eVar.f20068r;
        if (bVar3 != null && (aVar14 = (N2.a) bVar3.f18580b) != null && (aVar15 = (com.airbnb.lottie.model.animatable.a) aVar14.f6064a) != null) {
            com.airbnb.lottie.animation.keyframe.d dVarCreateAnimation = aVar15.createAnimation();
            this.f20103T = (com.airbnb.lottie.animation.keyframe.e) dVarCreateAnimation;
            dVarCreateAnimation.a(this);
            a(dVarCreateAnimation);
        }
        if (bVar3 != null && (aVar12 = (N2.a) bVar3.f18580b) != null && (aVar13 = (com.airbnb.lottie.model.animatable.a) aVar12.f6065b) != null) {
            com.airbnb.lottie.animation.keyframe.d dVarCreateAnimation2 = aVar13.createAnimation();
            this.f20105V = (com.airbnb.lottie.animation.keyframe.e) dVarCreateAnimation2;
            dVarCreateAnimation2.a(this);
            a(dVarCreateAnimation2);
        }
        if (bVar3 != null && (aVar11 = (N2.a) bVar3.f18580b) != null && (bVar2 = (com.airbnb.lottie.model.animatable.b) aVar11.f6066c) != null) {
            com.airbnb.lottie.animation.keyframe.h hVarCreateAnimation = bVar2.createAnimation();
            this.f20107X = hVarCreateAnimation;
            hVarCreateAnimation.a(this);
            a(hVarCreateAnimation);
        }
        if (bVar3 != null && (aVar10 = (N2.a) bVar3.f18580b) != null && (bVar = (com.airbnb.lottie.model.animatable.b) aVar10.f6067d) != null) {
            com.airbnb.lottie.animation.keyframe.h hVarCreateAnimation2 = bVar.createAnimation();
            this.f20109Z = hVarCreateAnimation2;
            hVarCreateAnimation2.a(this);
            a(hVarCreateAnimation2);
        }
        if (bVar3 != null && (aVar8 = (N2.a) bVar3.f18580b) != null && (aVar9 = (com.airbnb.lottie.model.animatable.a) aVar8.f6068e) != null) {
            com.airbnb.lottie.animation.keyframe.d dVarCreateAnimation3 = aVar9.createAnimation();
            this.b0 = (com.airbnb.lottie.animation.keyframe.e) dVarCreateAnimation3;
            dVarCreateAnimation3.a(this);
            a(dVarCreateAnimation3);
        }
        if (bVar3 != null && (aVar6 = (Na.a) bVar3.f18581c) != null && (aVar7 = (com.airbnb.lottie.model.animatable.a) aVar6.f6288c) != null) {
            com.airbnb.lottie.animation.keyframe.d dVarCreateAnimation4 = aVar7.createAnimation();
            this.f20112e0 = (com.airbnb.lottie.animation.keyframe.e) dVarCreateAnimation4;
            dVarCreateAnimation4.a(this);
            a(dVarCreateAnimation4);
        }
        if (bVar3 != null && (aVar4 = (Na.a) bVar3.f18581c) != null && (aVar5 = (com.airbnb.lottie.model.animatable.a) aVar4.f6287b) != null) {
            com.airbnb.lottie.animation.keyframe.d dVarCreateAnimation5 = aVar5.createAnimation();
            this.f20113f0 = (com.airbnb.lottie.animation.keyframe.e) dVarCreateAnimation5;
            dVarCreateAnimation5.a(this);
            a(dVarCreateAnimation5);
        }
        if (bVar3 != null && (aVar2 = (Na.a) bVar3.f18581c) != null && (aVar3 = (com.airbnb.lottie.model.animatable.a) aVar2.f6289d) != null) {
            com.airbnb.lottie.animation.keyframe.d dVarCreateAnimation6 = aVar3.createAnimation();
            this.f20114g0 = (com.airbnb.lottie.animation.keyframe.e) dVarCreateAnimation6;
            dVarCreateAnimation6.a(this);
            a(dVarCreateAnimation6);
        }
        if (bVar3 == null || (aVar = (Na.a) bVar3.f18581c) == null) {
            return;
        }
        this.f20102S = aVar.f6286a;
    }

    public static void n(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void o(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.model.KeyPathElement
    public final void addValueCallback(Object obj, p243q1.c cVar) {
        super.addValueCallback(obj, cVar);
        PointF pointF = LottieProperty.f19608a;
        if (obj == 1) {
            r rVar = this.f20104U;
            if (rVar != null) {
                h(rVar);
            }
            if (cVar == null) {
                this.f20104U = null;
                return;
            }
            r rVar2 = new r(null, cVar);
            this.f20104U = rVar2;
            rVar2.a(this);
            a(this.f20104U);
            return;
        }
        if (obj == 2) {
            r rVar3 = this.f20106W;
            if (rVar3 != null) {
                h(rVar3);
            }
            if (cVar == null) {
                this.f20106W = null;
                return;
            }
            r rVar4 = new r(null, cVar);
            this.f20106W = rVar4;
            rVar4.a(this);
            a(this.f20106W);
            return;
        }
        if (obj == LottieProperty.f19624q) {
            r rVar5 = this.f20108Y;
            if (rVar5 != null) {
                h(rVar5);
            }
            if (cVar == null) {
                this.f20108Y = null;
                return;
            }
            r rVar6 = new r(null, cVar);
            this.f20108Y = rVar6;
            rVar6.a(this);
            a(this.f20108Y);
            return;
        }
        if (obj == LottieProperty.f19625r) {
            r rVar7 = this.f20110a0;
            if (rVar7 != null) {
                h(rVar7);
            }
            if (cVar == null) {
                this.f20110a0 = null;
                return;
            }
            r rVar8 = new r(null, cVar);
            this.f20110a0 = rVar8;
            rVar8.a(this);
            a(this.f20110a0);
            return;
        }
        if (obj == LottieProperty.f19597D) {
            r rVar9 = this.c0;
            if (rVar9 != null) {
                h(rVar9);
            }
            if (cVar == null) {
                this.c0 = null;
                return;
            }
            r rVar10 = new r(null, cVar);
            this.c0 = rVar10;
            rVar10.a(this);
            a(this.c0);
            return;
        }
        if (obj != LottieProperty.f19604K) {
            if (obj == LottieProperty.f19606M) {
                com.airbnb.lottie.animation.keyframe.e eVar = this.f20099P;
                eVar.getClass();
                eVar.j(new o(new p243q1.b(), cVar, new p212o1.b()));
                return;
            }
            return;
        }
        r rVar11 = this.f20111d0;
        if (rVar11 != null) {
            h(rVar11);
        }
        if (cVar == null) {
            this.f20111d0 = null;
            return;
        }
        r rVar12 = new r(null, cVar);
        this.f20111d0 = rVar12;
        rVar12.a(this);
        a(this.f20111d0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0362  */
    /* JADX WARN: Code duplicated, block: B:102:0x0365  */
    /* JADX WARN: Code duplicated, block: B:105:0x036c  */
    /* JADX WARN: Code duplicated, block: B:106:0x036f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0378  */
    /* JADX WARN: Code duplicated, block: B:112:0x0381  */
    /* JADX WARN: Code duplicated, block: B:113:0x0384  */
    /* JADX WARN: Code duplicated, block: B:115:0x038c  */
    /* JADX WARN: Code duplicated, block: B:116:0x038e  */
    /* JADX WARN: Code duplicated, block: B:119:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:120:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:121:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:124:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:125:0x03e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:132:0x0419 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x041b  */
    /* JADX WARN: Code duplicated, block: B:134:0x041e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x0420  */
    /* JADX WARN: Code duplicated, block: B:136:0x0423  */
    /* JADX WARN: Code duplicated, block: B:140:0x042b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0434  */
    /* JADX WARN: Code duplicated, block: B:170:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:172:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:173:0x0500  */
    /* JADX WARN: Code duplicated, block: B:177:0x0512  */
    /* JADX WARN: Code duplicated, block: B:179:0x052b  */
    /* JADX WARN: Code duplicated, block: B:181:0x0542  */
    /* JADX WARN: Code duplicated, block: B:183:0x0557 A[LOOP:7: B:182:0x0555->B:183:0x0557, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:186:0x0579  */
    /* JADX WARN: Code duplicated, block: B:188:0x0597  */
    /* JADX WARN: Code duplicated, block: B:189:0x059d  */
    /* JADX WARN: Code duplicated, block: B:192:0x05ab A[LOOP:9: B:190:0x05a5->B:192:0x05ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:196:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:200:0x05e0 A[LOOP:10: B:198:0x05da->B:200:0x05e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:204:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:207:0x060b  */
    /* JADX WARN: Code duplicated, block: B:210:0x0618  */
    /* JADX WARN: Code duplicated, block: B:213:0x0631 A[LOOP:13: B:208:0x0612->B:213:0x0631, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:216:0x064c  */
    /* JADX WARN: Code duplicated, block: B:217:0x0653  */
    /* JADX WARN: Code duplicated, block: B:220:0x0670  */
    /* JADX WARN: Code duplicated, block: B:248:0x0639 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:250:0x0626 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:31:0x0109  */
    /* JADX WARN: Code duplicated, block: B:33:0x0120  */
    /* JADX WARN: Code duplicated, block: B:36:0x012c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0148  */
    /* JADX WARN: Code duplicated, block: B:39:0x0154  */
    /* JADX WARN: Code duplicated, block: B:41:0x015f  */
    /* JADX WARN: Code duplicated, block: B:42:0x016c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0181 A[LOOP:4: B:43:0x017f->B:44:0x0181, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:52:0x01df  */
    /* JADX WARN: Code duplicated, block: B:57:0x022a  */
    /* JADX WARN: Code duplicated, block: B:78:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:80:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:82:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:85:0x030e  */
    /* JADX WARN: Code duplicated, block: B:86:0x031d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0325  */
    /* JADX WARN: Code duplicated, block: B:91:0x0342  */
    /* JADX WARN: Code duplicated, block: B:94:0x034b  */
    /* JADX WARN: Code duplicated, block: B:95:0x034e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0357  */
    /* JADX WARN: Code duplicated, block: B:99:0x035a  */
    /* JADX WARN: Instruction removed from duplicated block: B:126:0x03e8, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.layer.a
    public final void d(Canvas canvas, Matrix matrix, int i7, com.airbnb.lottie.utils.a aVar) {
        P0 p0I;
        String str;
        com.airbnb.lottie.animation.a aVar2;
        y yVar;
        String str2;
        com.airbnb.lottie.animation.a aVar3;
        int i10;
        Typeface typeface;
        androidx.work.impl.model.b bVar;
        HashMap map;
        Typeface typeface2;
        HashMap map2;
        Typeface typeface3;
        AbstractC1310b abstractC1310b;
        Typeface typefaceCreateFromAsset;
        Typeface typeface4;
        int i11;
        ReactFontManager.Companion companion;
        Typeface typeface5;
        boolean zContains;
        boolean zContains2;
        int i12;
        float fFloatValue;
        float fC;
        List listAsList;
        int size;
        int i13;
        int length;
        PointF pointF;
        float f10;
        List listS;
        int i14;
        i iVar;
        int i15;
        byte b7;
        String string;
        ArrayList arrayList;
        int length2;
        int i16;
        StringBuilder sb2;
        int i17;
        String string2;
        String str3;
        int i18;
        ArrayList arrayList2;
        byte b10;
        Bidi bidi;
        int runCount;
        byte[] bArr;
        Integer[] numArr;
        int i19;
        StringBuilder sb3;
        int i20;
        int runLevel;
        String strSubstring;
        StringBuilder sb4;
        int length3;
        Canvas canvas2;
        float fFloatValue2;
        float f11;
        int i21;
        int i22;
        PointF pointF2;
        float f12;
        float f13;
        List listS2;
        int i23;
        i iVar2;
        int i24;
        String str4;
        int i25;
        float f14;
        k kVar;
        p212o1.d dVar;
        HashMap map3;
        ArrayList arrayList3;
        int size2;
        ArrayList arrayList4;
        int i26;
        List list;
        int i27;
        com.airbnb.lottie.animation.a aVar4;
        Path path;
        com.airbnb.lottie.animation.a aVar5;
        int i28 = i7;
        p212o1.b bVar2 = (p212o1.b) this.f20099P.e();
        k kVar2 = this.f20101R;
        p212o1.c cVar = (p212o1.c) kVar2.f19879f.get(bVar2.f39987b);
        if (cVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        m(bVar2, i28, 0);
        y yVar2 = this.f20100Q;
        Map map4 = yVar2.f20315p;
        com.airbnb.lottie.animation.keyframe.h hVar = this.f20109Z;
        String str5 = ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
        String str6 = "\u0003";
        com.airbnb.lottie.animation.a aVar6 = this.f20093J;
        com.airbnb.lottie.animation.a aVar7 = this.f20094K;
        int i29 = 0;
        byte b11 = 2;
        float f15 = 0.0f;
        String fontStyle = cVar.f40001c;
        com.airbnb.lottie.animation.a aVar8 = aVar7;
        String fontFamily = cVar.f39999a;
        if (map4 == null && yVar2.f20324w == null && yVar2.f20304a.f19881h.e() > 0) {
            r rVar = this.c0;
            float fFloatValue3 = (rVar != null ? ((Float) rVar.e()).floatValue() : bVar2.f39988c) / 100.0f;
            float[] fArr = (float[]) com.airbnb.lottie.utils.i.f20273e.get();
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f16 = com.airbnb.lottie.utils.i.f20274f;
            fArr[2] = f16;
            fArr[3] = f16;
            matrix.mapPoints(fArr);
            p212o1.c cVar2 = cVar;
            k kVar3 = kVar2;
            String str7 = fontStyle;
            Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
            List listAsList2 = Arrays.asList(bVar2.f39986a.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\r").split("\r"));
            int size3 = listAsList2.size();
            float f17 = bVar2.f39990e / 10.0f;
            r rVar2 = this.f20110a0;
            if (rVar2 != null) {
                fFloatValue2 = ((Float) rVar2.e()).floatValue();
            } else {
                if (hVar != null) {
                    fFloatValue2 = ((Float) hVar.e()).floatValue();
                }
                f11 = f17;
                i21 = 0;
                i22 = -1;
                while (i21 < size3) {
                    String str8 = (String) listAsList2.get(i21);
                    pointF2 = bVar2.f39998m;
                    if (pointF2 == null) {
                        f12 = f15;
                    } else {
                        f12 = pointF2.x;
                    }
                    f13 = fFloatValue3;
                    p212o1.c cVar3 = cVar2;
                    listS2 = s(str8, f12, cVar3, f13, f11, true);
                    i23 = i29;
                    while (i23 < listS2.size()) {
                        iVar2 = (i) listS2.get(i23);
                        List list2 = listS2;
                        i24 = i22 + 1;
                        canvas.save();
                        int i30 = i23;
                        if (r(canvas, bVar2, i24, iVar2.f20086b)) {
                            str4 = iVar2.f20085a;
                            i25 = i29;
                            while (i25 < str4.length()) {
                                char cCharAt = str4.charAt(i25);
                                String str9 = str4;
                                String str10 = str7;
                                f14 = f11;
                                List list3 = listAsList2;
                                kVar = kVar3;
                                dVar = (p212o1.d) kVar.f19881h.b(p212o1.d.a(cCharAt, fontFamily, str10));
                                if (dVar == null) {
                                    kVar3 = kVar;
                                    i25 = i25;
                                    size3 = size3;
                                    i21 = i21;
                                    aVar4 = aVar8;
                                } else {
                                    m(bVar2, i28, i25);
                                    map3 = this.f20095L;
                                    if (map3.containsKey(dVar)) {
                                        list = (List) map3.get(dVar);
                                    } else {
                                        arrayList3 = dVar.f40003a;
                                        size2 = arrayList3.size();
                                        arrayList4 = new ArrayList(size2);
                                        i26 = i29;
                                        while (i26 < size2) {
                                            arrayList4.add(new com.airbnb.lottie.animation.content.c(yVar2, this, (l) arrayList3.get(i26), kVar));
                                            i26++;
                                            arrayList3 = arrayList3;
                                        }
                                        map3.put(dVar, arrayList4);
                                        list = arrayList4;
                                    }
                                    i27 = i29;
                                    while (i27 < list.size()) {
                                        path = ((com.airbnb.lottie.animation.content.c) list.get(i27)).getPath();
                                        path.computeBounds(this.f20091H, i29);
                                        Matrix matrix2 = this.f20092I;
                                        matrix2.reset();
                                        k kVar4 = kVar;
                                        matrix2.preTranslate(f15, (-bVar2.f39992g) * com.airbnb.lottie.utils.i.c());
                                        matrix2.preScale(f13, f13);
                                        path.transform(matrix2);
                                        if (bVar2.f39996k) {
                                            o(path, aVar6, canvas);
                                            aVar5 = aVar8;
                                            o(path, aVar5, canvas);
                                        } else {
                                            aVar5 = aVar8;
                                            o(path, aVar5, canvas);
                                            o(path, aVar6, canvas);
                                        }
                                        i27++;
                                        aVar8 = aVar5;
                                        kVar = kVar4;
                                        i29 = 0;
                                        f15 = 0.0f;
                                    }
                                    kVar3 = kVar;
                                    aVar4 = aVar8;
                                    canvas.translate((com.airbnb.lottie.utils.i.c() * ((float) dVar.f40005c) * f13) + f14, 0.0f);
                                }
                                i25++;
                                i28 = i7;
                                str7 = str10;
                                aVar8 = aVar4;
                                str4 = str9;
                                f11 = f14;
                                listAsList2 = list3;
                                size3 = size3;
                                i21 = i21;
                                i29 = 0;
                                f15 = 0.0f;
                            }
                        }
                        float f18 = f11;
                        List list4 = listAsList2;
                        int i31 = size3;
                        int i32 = i21;
                        com.airbnb.lottie.animation.a aVar9 = aVar8;
                        String str11 = str7;
                        canvas.restore();
                        i28 = i7;
                        i22 = i24;
                        str7 = str11;
                        aVar8 = aVar9;
                        f11 = f18;
                        listAsList2 = list4;
                        size3 = i31;
                        i21 = i32;
                        i29 = 0;
                        f15 = 0.0f;
                        i23 = i30 + 1;
                        listS2 = list2;
                    }
                    i21++;
                    i28 = i7;
                    cVar2 = cVar3;
                    size3 = size3;
                    i29 = 0;
                    f15 = 0.0f;
                    fFloatValue3 = f13;
                }
                canvas2 = canvas;
            }
            f17 += fFloatValue2;
            f11 = f17;
            i21 = 0;
            i22 = -1;
            while (i21 < size3) {
                String str12 = (String) listAsList2.get(i21);
                pointF2 = bVar2.f39998m;
                if (pointF2 == null) {
                    f12 = f15;
                } else {
                    f12 = pointF2.x;
                }
                f13 = fFloatValue3;
                p212o1.c cVar4 = cVar2;
                listS2 = s(str12, f12, cVar4, f13, f11, true);
                i23 = i29;
                while (i23 < listS2.size()) {
                    iVar2 = (i) listS2.get(i23);
                    List list5 = listS2;
                    i24 = i22 + 1;
                    canvas.save();
                    int i33 = i23;
                    if (r(canvas, bVar2, i24, iVar2.f20086b)) {
                        str4 = iVar2.f20085a;
                        i25 = i29;
                        while (i25 < str4.length()) {
                            char cCharAt2 = str4.charAt(i25);
                            String str13 = str4;
                            String str14 = str7;
                            f14 = f11;
                            List list6 = listAsList2;
                            kVar = kVar3;
                            dVar = (p212o1.d) kVar.f19881h.b(p212o1.d.a(cCharAt2, fontFamily, str14));
                            if (dVar == null) {
                                kVar3 = kVar;
                                i25 = i25;
                                size3 = size3;
                                i21 = i21;
                                aVar4 = aVar8;
                            } else {
                                m(bVar2, i28, i25);
                                map3 = this.f20095L;
                                if (map3.containsKey(dVar)) {
                                    list = (List) map3.get(dVar);
                                } else {
                                    arrayList3 = dVar.f40003a;
                                    size2 = arrayList3.size();
                                    arrayList4 = new ArrayList(size2);
                                    i26 = i29;
                                    while (i26 < size2) {
                                        arrayList4.add(new com.airbnb.lottie.animation.content.c(yVar2, this, (l) arrayList3.get(i26), kVar));
                                        i26++;
                                        arrayList3 = arrayList3;
                                    }
                                    map3.put(dVar, arrayList4);
                                    list = arrayList4;
                                }
                                i27 = i29;
                                while (i27 < list.size()) {
                                    path = ((com.airbnb.lottie.animation.content.c) list.get(i27)).getPath();
                                    path.computeBounds(this.f20091H, i29);
                                    Matrix matrix3 = this.f20092I;
                                    matrix3.reset();
                                    k kVar5 = kVar;
                                    matrix3.preTranslate(f15, (-bVar2.f39992g) * com.airbnb.lottie.utils.i.c());
                                    matrix3.preScale(f13, f13);
                                    path.transform(matrix3);
                                    if (bVar2.f39996k) {
                                        o(path, aVar6, canvas);
                                        aVar5 = aVar8;
                                        o(path, aVar5, canvas);
                                    } else {
                                        aVar5 = aVar8;
                                        o(path, aVar5, canvas);
                                        o(path, aVar6, canvas);
                                    }
                                    i27++;
                                    aVar8 = aVar5;
                                    kVar = kVar5;
                                    i29 = 0;
                                    f15 = 0.0f;
                                }
                                kVar3 = kVar;
                                aVar4 = aVar8;
                                canvas.translate((com.airbnb.lottie.utils.i.c() * ((float) dVar.f40005c) * f13) + f14, 0.0f);
                            }
                            i25++;
                            i28 = i7;
                            str7 = str14;
                            aVar8 = aVar4;
                            str4 = str13;
                            f11 = f14;
                            listAsList2 = list6;
                            size3 = size3;
                            i21 = i21;
                            i29 = 0;
                            f15 = 0.0f;
                        }
                    }
                    float f19 = f11;
                    List list7 = listAsList2;
                    int i34 = size3;
                    int i35 = i21;
                    com.airbnb.lottie.animation.a aVar10 = aVar8;
                    String str15 = str7;
                    canvas.restore();
                    i28 = i7;
                    i22 = i24;
                    str7 = str15;
                    aVar8 = aVar10;
                    f11 = f19;
                    listAsList2 = list7;
                    size3 = i34;
                    i21 = i35;
                    i29 = 0;
                    f15 = 0.0f;
                    i23 = i33 + 1;
                    listS2 = list5;
                }
                i21++;
                i28 = i7;
                cVar2 = cVar4;
                size3 = size3;
                i29 = 0;
                f15 = 0.0f;
                fFloatValue3 = f13;
            }
            canvas2 = canvas;
        } else {
            r rVar3 = this.f20111d0;
            if (rVar3 == null || (typeface = (Typeface) rVar3.e()) == null) {
                Map map5 = yVar2.f20315p;
                String fontName = cVar.f40000b;
                if (map5 == null) {
                    p0I = yVar2.i();
                    if (p0I != null) {
                        bVar = (androidx.work.impl.model.b) p0I.f13246a;
                        bVar.f18580b = fontFamily;
                        bVar.f18581c = fontStyle;
                        map = (HashMap) p0I.f13247b;
                        typeface2 = (Typeface) map.get(bVar);
                        if (typeface2 != null) {
                            str = "\r";
                            aVar2 = aVar8;
                            yVar = yVar2;
                            str2 = "\r\n";
                            aVar3 = aVar6;
                            typeface = typeface2;
                            i10 = -1;
                        } else {
                            map2 = (HashMap) p0I.f13248c;
                            typeface3 = (Typeface) map2.get(fontFamily);
                            if (typeface3 != null) {
                                aVar2 = aVar8;
                                yVar = yVar2;
                                str2 = "\r\n";
                                aVar3 = aVar6;
                                typefaceCreateFromAsset = typeface3;
                                i10 = -1;
                                str = "\r";
                            } else {
                                str = "\r";
                                abstractC1310b = (AbstractC1310b) p0I.f13250e;
                                if (abstractC1310b != null) {
                                    p179m1.f fVar = (p179m1.f) abstractC1310b;
                                    str2 = "\r\n";
                                    Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
                                    aVar2 = aVar8;
                                    Intrinsics.checkNotNullParameter(fontStyle, "fontStyle");
                                    Intrinsics.checkNotNullParameter(fontName, "fontName");
                                    switch (fontStyle) {
                                        case "Medium":
                                            i11 = 500;
                                            break;
                                        case "Normal":
                                        case "Regular":
                                            i11 = 400;
                                            break;
                                        case "Bold":
                                            i11 = 700;
                                            break;
                                        case "Thin":
                                            i11 = 100;
                                            break;
                                        case "Black":
                                            i11 = 900;
                                            break;
                                        case "Light":
                                            i11 = 200;
                                            break;
                                        default:
                                            i11 = -1;
                                            break;
                                    }
                                    companion = ReactFontManager.INSTANCE;
                                    aVar3 = aVar6;
                                    ReactFontManager companion2 = companion.getInstance();
                                    AssetManager assets = fVar.f39440a.getContext().getAssets();
                                    Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
                                    yVar = yVar2;
                                    typeface5 = companion2.getTypeface(fontName, -1, i11, assets);
                                    if (typeface5 == null) {
                                        p179m1.f fVar2 = (p179m1.f) ((AbstractC1310b) p0I.f13250e);
                                        fVar2.getClass();
                                        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
                                        ReactFontManager companion3 = companion.getInstance();
                                        AssetManager assets2 = fVar2.f39440a.getContext().getAssets();
                                        Intrinsics.checkNotNullExpressionValue(assets2, "getAssets(...)");
                                        i10 = -1;
                                        typefaceCreateFromAsset = companion3.getTypeface(fontFamily, -1, -1, assets2);
                                    } else {
                                        i10 = -1;
                                        typefaceCreateFromAsset = typeface5;
                                    }
                                } else {
                                    aVar2 = aVar8;
                                    yVar = yVar2;
                                    str2 = "\r\n";
                                    aVar3 = aVar6;
                                    i10 = -1;
                                    typefaceCreateFromAsset = null;
                                }
                                typeface4 = cVar.f40002d;
                                if (typeface4 != null) {
                                    typefaceCreateFromAsset = typeface4;
                                } else {
                                    if (typefaceCreateFromAsset == null) {
                                        typefaceCreateFromAsset = Typeface.createFromAsset((AssetManager) p0I.f13249d, "fonts/" + fontFamily + ((String) p0I.f13251f));
                                    }
                                    map2.put(fontFamily, typefaceCreateFromAsset);
                                }
                            }
                            zContains = fontStyle.contains("Italic");
                            zContains2 = fontStyle.contains("Bold");
                            if (!zContains && zContains2) {
                                i12 = 3;
                            } else if (zContains) {
                                i12 = 2;
                            } else if (zContains2) {
                                i12 = 1;
                            } else {
                                i12 = 0;
                            }
                            if (typefaceCreateFromAsset.getStyle() != i12) {
                                typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i12);
                            }
                            map.put(bVar, typefaceCreateFromAsset);
                            typeface = typefaceCreateFromAsset;
                        }
                    } else {
                        str = "\r";
                        aVar2 = aVar8;
                        yVar = yVar2;
                        str2 = "\r\n";
                        aVar3 = aVar6;
                        i10 = -1;
                        typeface = null;
                    }
                } else {
                    if (map5.containsKey(fontFamily)) {
                        typeface = (Typeface) map5.get(fontFamily);
                    } else if (map5.containsKey(fontName)) {
                        typeface = (Typeface) map5.get(fontName);
                    } else {
                        String strY = q0.y(fontFamily, "-", fontStyle);
                        if (map5.containsKey(strY)) {
                            typeface = (Typeface) map5.get(strY);
                        } else {
                            p0I = yVar2.i();
                            if (p0I != null) {
                                bVar = (androidx.work.impl.model.b) p0I.f13246a;
                                bVar.f18580b = fontFamily;
                                bVar.f18581c = fontStyle;
                                map = (HashMap) p0I.f13247b;
                                typeface2 = (Typeface) map.get(bVar);
                                if (typeface2 != null) {
                                    str = "\r";
                                    aVar2 = aVar8;
                                    yVar = yVar2;
                                    str2 = "\r\n";
                                    aVar3 = aVar6;
                                    typeface = typeface2;
                                    i10 = -1;
                                } else {
                                    map2 = (HashMap) p0I.f13248c;
                                    typeface3 = (Typeface) map2.get(fontFamily);
                                    if (typeface3 != null) {
                                        aVar2 = aVar8;
                                        yVar = yVar2;
                                        str2 = "\r\n";
                                        aVar3 = aVar6;
                                        typefaceCreateFromAsset = typeface3;
                                        i10 = -1;
                                        str = "\r";
                                    } else {
                                        str = "\r";
                                        abstractC1310b = (AbstractC1310b) p0I.f13250e;
                                        if (abstractC1310b != null) {
                                            p179m1.f fVar3 = (p179m1.f) abstractC1310b;
                                            str2 = "\r\n";
                                            Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
                                            aVar2 = aVar8;
                                            Intrinsics.checkNotNullParameter(fontStyle, "fontStyle");
                                            Intrinsics.checkNotNullParameter(fontName, "fontName");
                                            switch (fontStyle) {
                                                case -1994163307:
                                                    if (!fontStyle.equals("Medium")) {
                                                        i11 = -1;
                                                    } else {
                                                        i11 = 500;
                                                    }
                                                    break;
                                                case -1955878649:
                                                    if (!fontStyle.equals(ReactProgressBarViewManager.DEFAULT_STYLE)) {
                                                        i11 = -1;
                                                    } else {
                                                        i11 = 400;
                                                    }
                                                    break;
                                                case -1543850116:
                                                    if (!fontStyle.equals("Regular")) {
                                                        i11 = -1;
                                                    } else {
                                                        i11 = 400;
                                                    }
                                                    break;
                                                case 2076325:
                                                    if (!fontStyle.equals("Bold")) {
                                                        i11 = -1;
                                                    } else {
                                                        i11 = 700;
                                                    }
                                                    break;
                                                case 2605753:
                                                    if (!fontStyle.equals("Thin")) {
                                                        i11 = 100;
                                                    } else {
                                                        i11 = -1;
                                                    }
                                                    break;
                                                case 64266207:
                                                    if (!fontStyle.equals("Black")) {
                                                        i11 = -1;
                                                    } else {
                                                        i11 = 900;
                                                    }
                                                    break;
                                                case 73417974:
                                                    if (!fontStyle.equals("Light")) {
                                                        i11 = -1;
                                                    } else {
                                                        i11 = 200;
                                                    }
                                                    break;
                                                default:
                                                    i11 = -1;
                                                    break;
                                            }
                                            companion = ReactFontManager.INSTANCE;
                                            aVar3 = aVar6;
                                            ReactFontManager companion4 = companion.getInstance();
                                            AssetManager assets3 = fVar3.f39440a.getContext().getAssets();
                                            Intrinsics.checkNotNullExpressionValue(assets3, "getAssets(...)");
                                            yVar = yVar2;
                                            typeface5 = companion4.getTypeface(fontName, -1, i11, assets3);
                                            if (typeface5 == null) {
                                                p179m1.f fVar4 = (p179m1.f) ((AbstractC1310b) p0I.f13250e);
                                                fVar4.getClass();
                                                Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
                                                ReactFontManager companion5 = companion.getInstance();
                                                AssetManager assets4 = fVar4.f39440a.getContext().getAssets();
                                                Intrinsics.checkNotNullExpressionValue(assets4, "getAssets(...)");
                                                i10 = -1;
                                                typefaceCreateFromAsset = companion5.getTypeface(fontFamily, -1, -1, assets4);
                                            } else {
                                                i10 = -1;
                                                typefaceCreateFromAsset = typeface5;
                                            }
                                        } else {
                                            aVar2 = aVar8;
                                            yVar = yVar2;
                                            str2 = "\r\n";
                                            aVar3 = aVar6;
                                            i10 = -1;
                                            typefaceCreateFromAsset = null;
                                        }
                                        typeface4 = cVar.f40002d;
                                        if (typeface4 != null) {
                                            typefaceCreateFromAsset = typeface4;
                                        } else {
                                            if (typefaceCreateFromAsset == null) {
                                                typefaceCreateFromAsset = Typeface.createFromAsset((AssetManager) p0I.f13249d, "fonts/" + fontFamily + ((String) p0I.f13251f));
                                            }
                                            map2.put(fontFamily, typefaceCreateFromAsset);
                                        }
                                    }
                                    zContains = fontStyle.contains("Italic");
                                    zContains2 = fontStyle.contains("Bold");
                                    if (!zContains) {
                                        if (zContains) {
                                            i12 = 2;
                                        } else if (zContains2) {
                                            i12 = 1;
                                        } else {
                                            i12 = 0;
                                        }
                                    } else if (zContains) {
                                        i12 = 2;
                                    } else if (zContains2) {
                                        i12 = 1;
                                    } else {
                                        i12 = 0;
                                    }
                                    if (typefaceCreateFromAsset.getStyle() != i12) {
                                        typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i12);
                                    }
                                    map.put(bVar, typefaceCreateFromAsset);
                                    typeface = typefaceCreateFromAsset;
                                }
                            } else {
                                str = "\r";
                                aVar2 = aVar8;
                                yVar = yVar2;
                                str2 = "\r\n";
                                aVar3 = aVar6;
                                i10 = -1;
                                typeface = null;
                            }
                        }
                    }
                    str = "\r";
                    aVar2 = aVar8;
                    yVar = yVar2;
                    str2 = "\r\n";
                    aVar3 = aVar6;
                    i10 = -1;
                }
                if (typeface == null) {
                    typeface = cVar.f40002d;
                }
            } else {
                str5 = ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
                str6 = "\u0003";
                str = "\r";
                aVar2 = aVar8;
                yVar = yVar2;
                str2 = "\r\n";
                aVar3 = aVar6;
                i10 = -1;
            }
            if (typeface != null) {
                String str16 = bVar2.f39986a;
                J j6 = yVar.f20324w;
                j jVar = this;
                if (j6 != null) {
                    String str17 = jVar.f20021p.f20053c;
                    HashMap map6 = j6.f19571a;
                    boolean z3 = j6.f19573c;
                    if (z3 && map6.containsKey(str16)) {
                        str16 = (String) map6.get(str16);
                    } else if (z3) {
                        map6.put(str16, str16);
                    }
                }
                com.airbnb.lottie.animation.a aVar11 = aVar3;
                aVar11.setTypeface(typeface);
                r rVar4 = jVar.c0;
                float fFloatValue4 = rVar4 != null ? ((Float) rVar4.e()).floatValue() : bVar2.f39988c;
                aVar11.setTextSize(com.airbnb.lottie.utils.i.c() * fFloatValue4);
                com.airbnb.lottie.animation.a aVar12 = aVar2;
                aVar12.setTypeface(aVar11.getTypeface());
                aVar12.setTextSize(aVar11.getTextSize());
                float f20 = bVar2.f39990e / 10.0f;
                r rVar5 = jVar.f20110a0;
                if (rVar5 != null) {
                    fFloatValue = ((Float) rVar5.e()).floatValue();
                } else {
                    if (hVar != null) {
                        fFloatValue = ((Float) hVar.e()).floatValue();
                    }
                    fC = ((com.airbnb.lottie.utils.i.c() * f20) * fFloatValue4) / 100.0f;
                    String str18 = str;
                    listAsList = Arrays.asList(str16.replaceAll(str2, str18).replaceAll(str6, str18).replaceAll(str5, str18).split(str18));
                    size = listAsList.size();
                    i13 = 0;
                    length = 0;
                    while (i13 < size) {
                        String str19 = (String) listAsList.get(i13);
                        pointF = bVar2.f39998m;
                        if (pointF == null) {
                            f10 = 0.0f;
                        } else {
                            f10 = pointF.x;
                        }
                        i14 = 0;
                        for (listS = s(str19, f10, cVar, 0.0f, fC, false); i14 < listS.size(); listS = listS) {
                            iVar = (i) listS.get(i14);
                            i10++;
                            canvas.save();
                            if (r(canvas, bVar2, i10, aVar11.measureText(iVar.f20085a))) {
                                string = iVar.f20085a;
                                if (Bidi.requiresBidi(string.toCharArray(), 0, string.length())) {
                                    bidi = new Bidi(string, -2);
                                    runCount = bidi.getRunCount();
                                    bArr = new byte[runCount];
                                    numArr = new Integer[runCount];
                                    i19 = 0;
                                    while (i19 < runCount) {
                                        bArr[i19] = (byte) bidi.getRunLevel(i19);
                                        numArr[i19] = Integer.valueOf(i19);
                                        i19++;
                                        size = size;
                                    }
                                    i15 = size;
                                    Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
                                    sb3 = this.f20089F;
                                    sb3.setLength(0);
                                    i20 = 0;
                                    while (i20 < runCount) {
                                        int iIntValue = numArr[i20].intValue();
                                        int i36 = runCount;
                                        int runStart = bidi.getRunStart(iIntValue);
                                        Integer[] numArr2 = numArr;
                                        int runLimit = bidi.getRunLimit(iIntValue);
                                        runLevel = bidi.getRunLevel(iIntValue);
                                        strSubstring = string.substring(runStart, runLimit);
                                        if ((runLevel & 1) == 0) {
                                            sb3.append(strSubstring);
                                        } else {
                                            sb4 = this.f20090G;
                                            length3 = 0;
                                            sb4.setLength(0);
                                            while (length3 < strSubstring.length()) {
                                                String strL = l(length3, strSubstring);
                                                sb4.insert(0, strL);
                                                length3 += strL.length();
                                                strSubstring = strSubstring;
                                            }
                                            sb3.append((CharSequence) sb4);
                                        }
                                        i20++;
                                        runCount = i36;
                                        numArr = numArr2;
                                        bidi = bidi;
                                    }
                                    string = sb3.toString();
                                } else {
                                    i15 = size;
                                }
                                arrayList = this.f20097N;
                                arrayList.clear();
                                length2 = 0;
                                while (length2 < string.length()) {
                                    String strL2 = l(length2, string);
                                    arrayList.add(strL2);
                                    length2 += strL2.length();
                                }
                                i16 = 0;
                                while (i16 < arrayList.size()) {
                                    sb2 = this.f20088E;
                                    sb2.setLength(0);
                                    sb2.append((String) arrayList.get(i16));
                                    i17 = i16 + 1;
                                    while (i17 < arrayList.size()) {
                                        str3 = (String) arrayList.get(i17);
                                        i18 = 0;
                                        while (true) {
                                            if (i18 < str3.length()) {
                                                arrayList2 = arrayList;
                                                b10 = b11;
                                                if (Character.getDirectionality(str3.codePointAt(i18)) == b10) {
                                                    sb2.insert(0, str3);
                                                    i17++;
                                                    b11 = b10;
                                                    arrayList = arrayList2;
                                                } else {
                                                    i18++;
                                                    b11 = b10;
                                                    arrayList = arrayList2;
                                                }
                                            } else {
                                                ArrayList arrayList5 = arrayList;
                                                byte b12 = b11;
                                                string2 = sb2.toString();
                                                m(bVar2, i7, i16 + length);
                                                if (bVar2.f39996k) {
                                                    n(string2, aVar11, canvas);
                                                    n(string2, aVar12, canvas);
                                                } else {
                                                    n(string2, aVar12, canvas);
                                                    n(string2, aVar11, canvas);
                                                }
                                                canvas.translate(aVar11.measureText(string2) + fC, 0.0f);
                                                b11 = b12;
                                                i16 = i17;
                                                arrayList = arrayList5;
                                            }
                                        }
                                    }
                                    ArrayList arrayList6 = arrayList;
                                    byte b13 = b11;
                                    string2 = sb2.toString();
                                    m(bVar2, i7, i16 + length);
                                    if (bVar2.f39996k) {
                                        n(string2, aVar11, canvas);
                                        n(string2, aVar12, canvas);
                                    } else {
                                        n(string2, aVar12, canvas);
                                        n(string2, aVar11, canvas);
                                    }
                                    canvas.translate(aVar11.measureText(string2) + fC, 0.0f);
                                    b11 = b13;
                                    i16 = i17;
                                    arrayList = arrayList6;
                                }
                                b7 = b11;
                            } else {
                                fC = fC;
                                listAsList = listAsList;
                                i15 = size;
                                b7 = b11;
                            }
                            length += iVar.f20085a.length();
                            canvas.restore();
                            i14++;
                            b11 = b7;
                            fC = fC;
                            listAsList = listAsList;
                            size = i15;
                            cVar = cVar;
                        }
                        i13++;
                        jVar = this;
                        listAsList = listAsList;
                        size = size;
                        cVar = cVar;
                    }
                }
                f20 += fFloatValue;
                fC = ((com.airbnb.lottie.utils.i.c() * f20) * fFloatValue4) / 100.0f;
                String str110 = str;
                listAsList = Arrays.asList(str16.replaceAll(str2, str110).replaceAll(str6, str110).replaceAll(str5, str110).split(str110));
                size = listAsList.size();
                i13 = 0;
                length = 0;
                while (i13 < size) {
                    String str111 = (String) listAsList.get(i13);
                    pointF = bVar2.f39998m;
                    if (pointF == null) {
                        f10 = 0.0f;
                    } else {
                        f10 = pointF.x;
                    }
                    i14 = 0;
                    while (i14 < listS.size()) {
                        iVar = (i) listS.get(i14);
                        i10++;
                        canvas.save();
                        if (r(canvas, bVar2, i10, aVar11.measureText(iVar.f20085a))) {
                            string = iVar.f20085a;
                            if (Bidi.requiresBidi(string.toCharArray(), 0, string.length())) {
                                bidi = new Bidi(string, -2);
                                runCount = bidi.getRunCount();
                                bArr = new byte[runCount];
                                numArr = new Integer[runCount];
                                i19 = 0;
                                while (i19 < runCount) {
                                    bArr[i19] = (byte) bidi.getRunLevel(i19);
                                    numArr[i19] = Integer.valueOf(i19);
                                    i19++;
                                    size = size;
                                }
                                i15 = size;
                                Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
                                sb3 = this.f20089F;
                                sb3.setLength(0);
                                i20 = 0;
                                while (i20 < runCount) {
                                    int iIntValue2 = numArr[i20].intValue();
                                    int i37 = runCount;
                                    int runStart2 = bidi.getRunStart(iIntValue2);
                                    Integer[] numArr3 = numArr;
                                    int runLimit2 = bidi.getRunLimit(iIntValue2);
                                    runLevel = bidi.getRunLevel(iIntValue2);
                                    strSubstring = string.substring(runStart2, runLimit2);
                                    if ((runLevel & 1) == 0) {
                                        sb3.append(strSubstring);
                                    } else {
                                        sb4 = this.f20090G;
                                        length3 = 0;
                                        sb4.setLength(0);
                                        while (length3 < strSubstring.length()) {
                                            String strL3 = l(length3, strSubstring);
                                            sb4.insert(0, strL3);
                                            length3 += strL3.length();
                                            strSubstring = strSubstring;
                                        }
                                        sb3.append((CharSequence) sb4);
                                    }
                                    i20++;
                                    runCount = i37;
                                    numArr = numArr3;
                                    bidi = bidi;
                                }
                                string = sb3.toString();
                            } else {
                                i15 = size;
                            }
                            arrayList = this.f20097N;
                            arrayList.clear();
                            length2 = 0;
                            while (length2 < string.length()) {
                                String strL4 = l(length2, string);
                                arrayList.add(strL4);
                                length2 += strL4.length();
                            }
                            i16 = 0;
                            while (i16 < arrayList.size()) {
                                sb2 = this.f20088E;
                                sb2.setLength(0);
                                sb2.append((String) arrayList.get(i16));
                                i17 = i16 + 1;
                                while (i17 < arrayList.size()) {
                                    str3 = (String) arrayList.get(i17);
                                    i18 = 0;
                                    while (true) {
                                        if (i18 < str3.length()) {
                                            arrayList2 = arrayList;
                                            b10 = b11;
                                            if (Character.getDirectionality(str3.codePointAt(i18)) == b10) {
                                                sb2.insert(0, str3);
                                                i17++;
                                                b11 = b10;
                                                arrayList = arrayList2;
                                            } else {
                                                i18++;
                                                b11 = b10;
                                                arrayList = arrayList2;
                                            }
                                        } else {
                                            ArrayList arrayList7 = arrayList;
                                            byte b14 = b11;
                                            string2 = sb2.toString();
                                            m(bVar2, i7, i16 + length);
                                            if (bVar2.f39996k) {
                                                n(string2, aVar11, canvas);
                                                n(string2, aVar12, canvas);
                                            } else {
                                                n(string2, aVar12, canvas);
                                                n(string2, aVar11, canvas);
                                            }
                                            canvas.translate(aVar11.measureText(string2) + fC, 0.0f);
                                            b11 = b14;
                                            i16 = i17;
                                            arrayList = arrayList7;
                                        }
                                    }
                                }
                                ArrayList arrayList8 = arrayList;
                                byte b15 = b11;
                                string2 = sb2.toString();
                                m(bVar2, i7, i16 + length);
                                if (bVar2.f39996k) {
                                    n(string2, aVar11, canvas);
                                    n(string2, aVar12, canvas);
                                } else {
                                    n(string2, aVar12, canvas);
                                    n(string2, aVar11, canvas);
                                }
                                canvas.translate(aVar11.measureText(string2) + fC, 0.0f);
                                b11 = b15;
                                i16 = i17;
                                arrayList = arrayList8;
                            }
                            b7 = b11;
                        } else {
                            fC = fC;
                            listAsList = listAsList;
                            i15 = size;
                            b7 = b11;
                        }
                        length += iVar.f20085a.length();
                        canvas.restore();
                        i14++;
                        b11 = b7;
                        fC = fC;
                        listAsList = listAsList;
                        size = i15;
                        cVar = cVar;
                    }
                    i13++;
                    jVar = this;
                    listAsList = listAsList;
                    size = size;
                    cVar = cVar;
                }
            }
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    @Override // com.airbnb.lottie.model.layer.a, com.airbnb.lottie.animation.content.DrawingContent
    public final void getBounds(RectF rectF, Matrix matrix, boolean z3) {
        super.getBounds(rectF, matrix, z3);
        k kVar = this.f20101R;
        rectF.set(0.0f, 0.0f, kVar.f19884k.width(), kVar.f19884k.height());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final String l(int i7, String str) {
        int iCodePointAt = str.codePointAt(i7);
        int iCharCount = Character.charCount(iCodePointAt) + i7;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (Character.getType(iCodePointAt2) != 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j6 = iCodePointAt;
        M.j jVar = this.f20096M;
        if (jVar.c(j6) >= 0) {
            return (String) jVar.b(j6);
        }
        StringBuilder sb2 = this.f20087D;
        sb2.setLength(0);
        while (i7 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i7);
            sb2.appendCodePoint(iCodePointAt3);
            i7 += Character.charCount(iCodePointAt3);
        }
        String string = sb2.toString();
        jVar.e(j6, string);
        return string;
    }

    public final void m(p212o1.b bVar, int i7, int i10) {
        r rVar = this.f20104U;
        com.airbnb.lottie.animation.a aVar = this.f20093J;
        if (rVar != null) {
            aVar.setColor(((Integer) rVar.e()).intValue());
        } else {
            com.airbnb.lottie.animation.keyframe.e eVar = this.f20103T;
            if (eVar == null || !q(i10)) {
                aVar.setColor(bVar.f39993h);
            } else {
                aVar.setColor(((Integer) eVar.e()).intValue());
            }
        }
        r rVar2 = this.f20106W;
        com.airbnb.lottie.animation.a aVar2 = this.f20094K;
        if (rVar2 != null) {
            aVar2.setColor(((Integer) rVar2.e()).intValue());
        } else {
            com.airbnb.lottie.animation.keyframe.e eVar2 = this.f20105V;
            if (eVar2 == null || !q(i10)) {
                aVar2.setColor(bVar.f39994i);
            } else {
                aVar2.setColor(((Integer) eVar2.e()).intValue());
            }
        }
        com.airbnb.lottie.animation.keyframe.d dVar = this.f20027w.f19847p;
        int iIntValue = 100;
        int iIntValue2 = dVar == null ? 100 : ((Integer) dVar.e()).intValue();
        com.airbnb.lottie.animation.keyframe.e eVar3 = this.b0;
        if (eVar3 != null && q(i10)) {
            iIntValue = ((Integer) eVar3.e()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i7) / 255.0f);
        aVar.setAlpha(iRound);
        aVar2.setAlpha(iRound);
        r rVar3 = this.f20108Y;
        if (rVar3 != null) {
            aVar2.setStrokeWidth(((Float) rVar3.e()).floatValue());
            return;
        }
        com.airbnb.lottie.animation.keyframe.h hVar = this.f20107X;
        if (hVar == null || !q(i10)) {
            aVar2.setStrokeWidth(com.airbnb.lottie.utils.i.c() * bVar.f39995j);
        } else {
            aVar2.setStrokeWidth(((Float) hVar.e()).floatValue());
        }
    }

    public final i p(int i7) {
        ArrayList arrayList = this.f20098O;
        for (int size = arrayList.size(); size < i7; size++) {
            i iVar = new i();
            iVar.f20085a = "";
            iVar.f20086b = 0.0f;
            arrayList.add(iVar);
        }
        return (i) arrayList.get(i7 - 1);
    }

    public final boolean q(int i7) {
        com.airbnb.lottie.animation.keyframe.e eVar;
        int length = ((p212o1.b) this.f20099P.e()).f39986a.length();
        com.airbnb.lottie.animation.keyframe.e eVar2 = this.f20112e0;
        if (eVar2 == null || (eVar = this.f20113f0) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) eVar2.e()).intValue(), ((Integer) eVar.e()).intValue());
        int iMax = Math.max(((Integer) eVar2.e()).intValue(), ((Integer) eVar.e()).intValue());
        com.airbnb.lottie.animation.keyframe.e eVar3 = this.f20114g0;
        if (eVar3 != null) {
            int iIntValue = ((Integer) eVar3.e()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.f20102S == 2) {
            return i7 >= iMin && i7 < iMax;
        }
        float f10 = (i7 / length) * 100.0f;
        return f10 >= ((float) iMin) && f10 < ((float) iMax);
    }

    public final boolean r(Canvas canvas, p212o1.b bVar, int i7, float f10) {
        PointF pointF = bVar.f39997l;
        PointF pointF2 = bVar.f39998m;
        float fC = com.airbnb.lottie.utils.i.c();
        float f11 = (i7 * bVar.f39991f * fC) + (pointF == null ? 0.0f : (bVar.f39991f * fC) + pointF.y);
        if (this.f20100Q.f20303Z && pointF2 != null && pointF != null && f11 >= pointF.y + pointF2.y + bVar.f39988c) {
            return false;
        }
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int i10 = F.i(bVar.f39989d);
        if (i10 == 0) {
            canvas.translate(f12, f11);
            return true;
        }
        if (i10 == 1) {
            canvas.translate((f12 + f13) - f10, f11);
            return true;
        }
        if (i10 != 2) {
            return true;
        }
        canvas.translate(((f13 / 2.0f) + f12) - (f10 / 2.0f), f11);
        return true;
    }

    public final List s(String str, float f10, p212o1.c cVar, float f11, float f12, boolean z3) {
        float fMeasureText;
        int i7 = 0;
        int i10 = 0;
        boolean z8 = false;
        int i11 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if (z3) {
                p212o1.d dVar = (p212o1.d) this.f20101R.f19881h.b(p212o1.d.a(cCharAt, cVar.f39999a, cVar.f40001c));
                if (dVar != null) {
                    fMeasureText = (com.airbnb.lottie.utils.i.c() * ((float) dVar.f40005c) * f11) + f12;
                }
            } else {
                fMeasureText = this.f20093J.measureText(str.substring(i12, i12 + 1)) + f12;
            }
            if (cCharAt == ' ') {
                z8 = true;
                f15 = fMeasureText;
            } else if (z8) {
                z8 = false;
                i11 = i12;
                f14 = fMeasureText;
            } else {
                f14 += fMeasureText;
            }
            f13 += fMeasureText;
            if (f10 > 0.0f && f13 >= f10 && cCharAt != ' ') {
                i7++;
                i iVarP = p(i7);
                if (i11 == i10) {
                    String strSubstring = str.substring(i10, i12);
                    String strTrim = strSubstring.trim();
                    float length = (f13 - fMeasureText) - ((strTrim.length() - strSubstring.length()) * f15);
                    iVarP.f20085a = strTrim;
                    iVarP.f20086b = length;
                    i10 = i12;
                    i11 = i10;
                    f13 = fMeasureText;
                    f14 = f13;
                } else {
                    String strSubstring2 = str.substring(i10, i11 - 1);
                    String strTrim2 = strSubstring2.trim();
                    float length2 = ((f13 - f14) - ((strSubstring2.length() - strTrim2.length()) * f15)) - f15;
                    iVarP.f20085a = strTrim2;
                    iVarP.f20086b = length2;
                    f13 = f14;
                    i10 = i11;
                }
            }
        }
        if (f13 > 0.0f) {
            i7++;
            i iVarP2 = p(i7);
            iVarP2.f20085a = str.substring(i10);
            iVarP2.f20086b = f13;
        }
        return this.f20098O.subList(0, i7);
    }
}
