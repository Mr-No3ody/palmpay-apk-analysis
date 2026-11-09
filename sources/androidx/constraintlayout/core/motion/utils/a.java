package androidx.constraintlayout.core.motion.utils;

import Gb.Q;
import Ie.u;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f15121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f15123c;

    public final float a(float f10) {
        u uVar = this.f15121a;
        p059e1.a aVar = (p059e1.a) uVar.f4402g;
        if (aVar != null) {
            aVar.w(f10, (double[]) uVar.f4403h);
        } else {
            double[] dArr = (double[]) uVar.f4403h;
            dArr[0] = ((float[]) uVar.f4400e)[0];
            dArr[1] = ((float[]) uVar.f4401f)[0];
            dArr[2] = ((float[]) uVar.f4397b)[0];
        }
        double[] dArr2 = (double[]) uVar.f4403h;
        return (float) ((((top.zibin.luban.io.a) uVar.f4396a).k(f10, dArr2[1]) * ((double[]) uVar.f4403h)[2]) + dArr2[0]);
    }

    public final float b(float f10) {
        u uVar = this.f15121a;
        p059e1.a aVar = (p059e1.a) uVar.f4402g;
        double d2 = 0.0d;
        if (aVar != null) {
            double d10 = f10;
            aVar.B(d10, (double[]) uVar.f4404i);
            ((p059e1.a) uVar.f4402g).w(d10, (double[]) uVar.f4403h);
        } else {
            double[] dArr = (double[]) uVar.f4404i;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
            dArr[2] = 0.0d;
        }
        double d11 = f10;
        double d12 = ((double[]) uVar.f4403h)[1];
        top.zibin.luban.io.a aVar2 = (top.zibin.luban.io.a) uVar.f4396a;
        double dK = aVar2.k(d11, d12);
        double d13 = ((double[]) uVar.f4403h)[1];
        double d14 = ((double[]) uVar.f4404i)[1];
        double dH = aVar2.h(d11) + d13;
        if (d11 <= 0.0d) {
            d11 = 1.0E-5d;
        } else if (d11 >= 1.0d) {
            d11 = 0.999999d;
        }
        int iBinarySearch = Arrays.binarySearch((double[]) aVar2.f42646c, d11);
        if (iBinarySearch <= 0 && iBinarySearch != 0) {
            int i7 = -iBinarySearch;
            int i10 = i7 - 1;
            float[] fArr = (float[]) aVar2.f42645b;
            float f11 = fArr[i10];
            int i11 = i7 - 2;
            float f12 = fArr[i11];
            double[] dArr2 = (double[]) aVar2.f42646c;
            double d15 = dArr2[i10];
            double d16 = dArr2[i11];
            double d17 = ((double) (f11 - f12)) / (d15 - d16);
            d2 = (((double) f12) - (d17 * d16)) + (d11 * d17);
        }
        double dCos = Math.cos(6.283185307179586d * dH) * (d2 + d14) * 6.283185307179586d;
        double[] dArr3 = (double[]) uVar.f4404i;
        return (float) ((dCos * ((double[]) uVar.f4403h)[2]) + (dK * dArr3[r6]) + dArr3[0]);
    }

    public final void c() {
        ArrayList arrayList = this.f15123c;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new Q(1));
        double[] dArr = new double[size];
        char c6 = 2;
        int i7 = 0;
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 3);
        u uVar = new u();
        top.zibin.luban.io.a aVar = new top.zibin.luban.io.a(15, false);
        aVar.f42645b = new float[0];
        aVar.f42646c = new double[0];
        uVar.f4396a = aVar;
        uVar.f4397b = new float[size];
        uVar.f4398c = new double[size];
        uVar.f4399d = new float[size];
        uVar.f4400e = new float[size];
        uVar.f4401f = new float[size];
        float[] fArr = new float[size];
        this.f15121a = uVar;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        u uVar2 = this.f15121a;
        double[] dArr3 = (double[]) uVar2.f4398c;
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, dArr3.length, 3);
        float[] fArr2 = (float[]) uVar2.f4397b;
        uVar2.f4403h = new double[fArr2.length + 2];
        uVar2.f4404i = new double[fArr2.length + 2];
        double d2 = dArr3[0];
        float[] fArr3 = (float[]) uVar2.f4399d;
        top.zibin.luban.io.a aVar2 = (top.zibin.luban.io.a) uVar2.f4396a;
        if (d2 > 0.0d) {
            aVar2.b(0.0d, fArr3[0]);
        }
        int length = dArr3.length - 1;
        if (dArr3[length] < 1.0d) {
            aVar2.b(1.0d, fArr3[length]);
        }
        int i10 = 0;
        while (i10 < dArr4.length) {
            double[] dArr5 = dArr4[i10];
            char c10 = c6;
            dArr5[0] = ((float[]) uVar2.f4400e)[i10];
            dArr5[1] = ((float[]) uVar2.f4401f)[i10];
            dArr5[c10] = fArr2[i10];
            aVar2.b(dArr3[i10], fArr3[i10]);
            i10++;
            c6 = c10;
            dArr2 = dArr2;
        }
        double[][] dArr6 = dArr2;
        int i11 = 0;
        double d10 = 0.0d;
        while (true) {
            float[] fArr4 = (float[]) aVar2.f42645b;
            if (i11 >= fArr4.length) {
                break;
            }
            d10 += (double) fArr4[i11];
            i11++;
        }
        int i12 = 1;
        double d11 = 0.0d;
        while (true) {
            float[] fArr5 = (float[]) aVar2.f42645b;
            if (i12 >= fArr5.length) {
                break;
            }
            int i13 = i12 - 1;
            float f10 = (fArr5[i13] + fArr5[i12]) / 2.0f;
            double[] dArr7 = (double[]) aVar2.f42646c;
            d11 = ((dArr7[i12] - dArr7[i13]) * ((double) f10)) + d11;
            i12++;
            i7 = i7;
            d10 = d10;
        }
        int i14 = i7;
        double d12 = d10;
        int i15 = i14;
        while (true) {
            float[] fArr6 = (float[]) aVar2.f42645b;
            if (i15 >= fArr6.length) {
                break;
            }
            fArr6[i15] = (float) (((double) fArr6[i15]) * (d12 / d11));
            i15++;
        }
        ((double[]) aVar2.f42647d)[i14] = 0.0d;
        int i16 = 1;
        while (true) {
            float[] fArr7 = (float[]) aVar2.f42645b;
            if (i16 >= fArr7.length) {
                break;
            }
            int i17 = i16 - 1;
            float f11 = (fArr7[i17] + fArr7[i16]) / 2.0f;
            double[] dArr8 = (double[]) aVar2.f42646c;
            double d13 = dArr8[i16] - dArr8[i17];
            double[] dArr9 = (double[]) aVar2.f42647d;
            dArr9[i16] = (d13 * ((double) f11)) + dArr9[i17];
            i16++;
        }
        if (dArr3.length > 1) {
            uVar2.f4402g = p059e1.a.n(i14, dArr3, dArr4);
        } else {
            uVar2.f4402g = null;
        }
        p059e1.a.n(i14, dArr, dArr6);
    }

    public final String toString() {
        String str = this.f15122b;
        new DecimalFormat("##.##");
        Iterator it = this.f15123c.iterator();
        if (!it.hasNext()) {
            return str;
        }
        it.next().getClass();
        throw new ClassCastException();
    }
}
