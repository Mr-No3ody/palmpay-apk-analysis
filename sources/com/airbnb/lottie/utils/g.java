package com.airbnb.lottie.utils;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.animation.content.KeyPathElementContent;
import com.airbnb.lottie.model.content.j;
import com.horcrux.svg.d0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PointF f20241a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static int c(int i7) {
        return Math.max(0, Math.min(255, i7));
    }

    public static int d(float f10, float f11) {
        int i7 = (int) f10;
        int i10 = (int) f11;
        int i11 = i7 / i10;
        int i12 = i7 % i10;
        if (!((i7 ^ i10) >= 0) && i12 != 0) {
            i11--;
        }
        return i7 - (i10 * i11);
    }

    public static void e(j jVar, Path path) {
        Path path2;
        path.reset();
        PointF pointF = jVar.f19972b;
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = f20241a;
        pointF2.set(pointF.x, pointF.y);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = jVar.f19971a;
            if (i7 >= arrayList.size()) {
                break;
            }
            p212o1.a aVar = (p212o1.a) arrayList.get(i7);
            PointF pointF3 = aVar.f39983a;
            boolean zEquals = pointF3.equals(pointF2);
            PointF pointF4 = aVar.f39984b;
            PointF pointF5 = aVar.f39985c;
            if (zEquals && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i7++;
            path = path2;
        }
        Path path3 = path;
        if (jVar.f19973c) {
            path3.close();
        }
    }

    public static float f(float f10, float f11, float f12) {
        return d0.e(f11, f10, f12, f10);
    }

    public static void g(p212o1.e eVar, int i7, List list, p212o1.e eVar2, KeyPathElementContent keyPathElementContent) {
        if (eVar.a(i7, keyPathElementContent.getName())) {
            String name = keyPathElementContent.getName();
            eVar2.getClass();
            p212o1.e eVar3 = new p212o1.e(eVar2);
            eVar3.f40009a.add(name);
            p212o1.e eVar4 = new p212o1.e(eVar3);
            eVar4.f40010b = keyPathElementContent;
            list.add(eVar4);
        }
    }
}
