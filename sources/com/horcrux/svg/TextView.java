package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class TextView extends GroupView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ArrayList f23395A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public double f23396B;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1420q f23397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1420q f23398g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f23399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23400j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a0 f23401o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f23402p;
    public ArrayList t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f23403v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f23404w;

    public TextView(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        this.f23397f = null;
        this.f23398g = null;
        this.f23399i = null;
        this.f23400j = 1;
        this.f23396B = Double.NaN;
    }

    @Override // com.horcrux.svg.VirtualView
    public void clearCache() {
        this.f23396B = Double.NaN;
        super.clearCache();
    }

    @Override // com.horcrux.svg.GroupView
    public final Path d(Canvas canvas, Paint paint) {
        return getPath(canvas, paint);
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f10) {
        h(canvas);
        clip(canvas, paint);
        i(canvas, paint);
        g();
        b(canvas, paint, f10);
        f();
    }

    @Override // com.horcrux.svg.GroupView
    public void g() {
        boolean z3 = ((this instanceof TextPathView) || (this instanceof TSpanView)) ? false : true;
        C1413j c1413jE = e();
        ReadableMap readableMap = this.f23304a;
        ArrayList arrayList = this.f23402p;
        ArrayList arrayList2 = this.t;
        ArrayList arrayList3 = this.f23404w;
        ArrayList arrayList4 = this.f23395A;
        ArrayList arrayList5 = this.f23403v;
        if (z3) {
            c1413jE.f23493F = 0;
            c1413jE.f23492E = 0;
            c1413jE.f23491D = 0;
            c1413jE.f23490C = 0;
            c1413jE.f23489B = 0;
            c1413jE.f23498K = -1;
            c1413jE.f23497J = -1;
            c1413jE.f23496I = -1;
            c1413jE.f23495H = -1;
            c1413jE.f23494G = -1;
            c1413jE.f23523v = 0.0d;
            c1413jE.f23522u = 0.0d;
            c1413jE.t = 0.0d;
            c1413jE.f23521s = 0.0d;
        }
        c1413jE.f(this, readableMap);
        if (arrayList != null && arrayList.size() != 0) {
            c1413jE.f23489B++;
            c1413jE.f23494G = -1;
            c1413jE.f23509g.add(-1);
            C1420q[] c1420qArrA = C1413j.a(arrayList);
            c1413jE.f23524w = c1420qArrA;
            c1413jE.f23504b.add(c1420qArrA);
        }
        if (arrayList2 != null && arrayList2.size() != 0) {
            c1413jE.f23490C++;
            c1413jE.f23495H = -1;
            c1413jE.f23510h.add(-1);
            C1420q[] c1420qArrA2 = C1413j.a(arrayList2);
            c1413jE.f23525x = c1420qArrA2;
            c1413jE.f23505c.add(c1420qArrA2);
        }
        if (arrayList3 != null && arrayList3.size() != 0) {
            c1413jE.f23491D++;
            c1413jE.f23496I = -1;
            c1413jE.f23511i.add(-1);
            C1420q[] c1420qArrA3 = C1413j.a(arrayList3);
            c1413jE.f23526y = c1420qArrA3;
            c1413jE.f23506d.add(c1420qArrA3);
        }
        if (arrayList4 != null && arrayList4.size() != 0) {
            c1413jE.f23492E++;
            c1413jE.f23497J = -1;
            c1413jE.f23512j.add(-1);
            C1420q[] c1420qArrA4 = C1413j.a(arrayList4);
            c1413jE.f23527z = c1420qArrA4;
            c1413jE.f23507e.add(c1420qArrA4);
        }
        if (arrayList5 != null && arrayList5.size() != 0) {
            c1413jE.f23493F++;
            c1413jE.f23498K = -1;
            c1413jE.f23513k.add(-1);
            int size = arrayList5.size();
            double[] dArr = new double[size];
            for (int i7 = 0; i7 < size; i7++) {
                dArr[i7] = ((C1420q) arrayList5.get(i7)).f23543a;
            }
            c1413jE.f23488A = dArr;
            c1413jE.f23508f.add(dArr);
        }
        c1413jE.e();
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        h(canvas);
        return i(canvas, paint);
    }

    public final Path i(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        g();
        this.mPath = super.getPath(canvas, paint);
        f();
        return this.mPath;
    }

    @Override // com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        if (this.mPath == null) {
            return;
        }
        super.invalidate();
        ViewParent parent = getParent();
        TextView textView = this;
        while (parent instanceof TextView) {
            textView = (TextView) parent;
            parent = textView.getParent();
        }
        textView.clearChildCache();
    }

    public double j(Paint paint) {
        if (!Double.isNaN(this.f23396B)) {
            return this.f23396B;
        }
        double dJ = 0.0d;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof TextView) {
                dJ += ((TextView) childAt).j(paint);
            }
        }
        this.f23396B = dJ;
        return dJ;
    }

    public void k(String str) {
        this.f23401o = a0.a(str);
        invalidate();
    }
}
