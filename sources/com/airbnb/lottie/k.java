package com.airbnb.lottie;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f19876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f19877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f19878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f19879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f19880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public M.o f19881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public M.j f19882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f19883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f19884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f19885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f19886m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f19887n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f19888o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f19874a = new E();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f19875b = new HashSet();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f19889p = 0;

    public final void a(String str) {
        com.airbnb.lottie.utils.c.b(str);
        this.f19875b.add(str);
    }

    public final float b() {
        return (long) (((this.f19886m - this.f19885l) / this.f19887n) * 1000.0f);
    }

    public final Map c() {
        float fC = com.airbnb.lottie.utils.i.c();
        if (fC != this.f19878e) {
            for (Map.Entry entry : this.f19877d.entrySet()) {
                HashMap map = this.f19877d;
                String str = (String) entry.getKey();
                A a3 = (A) entry.getValue();
                float f10 = this.f19878e / fC;
                int i7 = (int) (a3.f19550a * f10);
                int i10 = (int) (a3.f19551b * f10);
                A a10 = new A(i7, a3.f19552c, i10, a3.f19553d, a3.f19554e);
                Bitmap bitmap = a3.f19555f;
                if (bitmap != null) {
                    a10.f19555f = Bitmap.createScaledBitmap(bitmap, i7, i10, true);
                }
                map.put(str, a10);
            }
        }
        this.f19878e = fC;
        return this.f19877d;
    }

    public final p212o1.g d(String str) {
        int size = this.f19880g.size();
        for (int i7 = 0; i7 < size; i7++) {
            p212o1.g gVar = (p212o1.g) this.f19880g.get(i7);
            String str2 = gVar.f40013a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return gVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f19883j.iterator();
        while (it.hasNext()) {
            sb2.append(((com.airbnb.lottie.model.layer.e) it.next()).a("\t"));
        }
        return sb2.toString();
    }
}
