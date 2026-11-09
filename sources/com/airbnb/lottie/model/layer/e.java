package com.airbnb.lottie.model.layer;

import androidx.camera.video.u;
import com.airbnb.lottie.k;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f20052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f20057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f20058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.d f20059i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f20060j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f20061k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f20062l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f20063m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f20064n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f20065o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f20066p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.a f20067q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final androidx.work.impl.model.b f20068r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f20069s;
    public final List t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f20070u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f20071v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p1.c f20072w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final E2.a f20073x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f20074y;

    public e(List list, k kVar, String str, long j6, int i7, long j10, String str2, List list2, com.airbnb.lottie.model.animatable.d dVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, com.airbnb.lottie.model.animatable.a aVar, androidx.work.impl.model.b bVar, List list3, int i13, com.airbnb.lottie.model.animatable.b bVar2, boolean z3, p1.c cVar, E2.a aVar2, int i14) {
        this.f20051a = list;
        this.f20052b = kVar;
        this.f20053c = str;
        this.f20054d = j6;
        this.f20055e = i7;
        this.f20056f = j10;
        this.f20057g = str2;
        this.f20058h = list2;
        this.f20059i = dVar;
        this.f20060j = i10;
        this.f20061k = i11;
        this.f20062l = i12;
        this.f20063m = f10;
        this.f20064n = f11;
        this.f20065o = f12;
        this.f20066p = f13;
        this.f20067q = aVar;
        this.f20068r = bVar;
        this.t = list3;
        this.f20070u = i13;
        this.f20069s = bVar2;
        this.f20071v = z3;
        this.f20072w = cVar;
        this.f20073x = aVar2;
        this.f20074y = i14;
    }

    public final String a(String str) {
        int i7;
        StringBuilder sbS = u.s(str);
        sbS.append(this.f20053c);
        sbS.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        k kVar = this.f20052b;
        e eVar = (e) kVar.f19882i.b(this.f20056f);
        if (eVar != null) {
            sbS.append("\t\tParents: ");
            sbS.append(eVar.f20053c);
            for (e eVar2 = (e) kVar.f19882i.b(eVar.f20056f); eVar2 != null; eVar2 = (e) kVar.f19882i.b(eVar2.f20056f)) {
                sbS.append("->");
                sbS.append(eVar2.f20053c);
            }
            sbS.append(str);
            sbS.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        List list = this.f20058h;
        if (!list.isEmpty()) {
            sbS.append(str);
            sbS.append("\tMasks: ");
            sbS.append(list.size());
            sbS.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        int i10 = this.f20060j;
        if (i10 != 0 && (i7 = this.f20061k) != 0) {
            sbS.append(str);
            sbS.append("\tBackground: ");
            sbS.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i10), Integer.valueOf(i7), Integer.valueOf(this.f20062l)));
        }
        List list2 = this.f20051a;
        if (!list2.isEmpty()) {
            sbS.append(str);
            sbS.append("\tShapes:\n");
            for (Object obj : list2) {
                sbS.append(str);
                sbS.append("\t\t");
                sbS.append(obj);
                sbS.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            }
        }
        return sbS.toString();
    }

    public final String toString() {
        return a("");
    }
}
