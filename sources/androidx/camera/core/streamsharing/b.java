package androidx.camera.core.streamsharing;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final double f14458h = Math.sqrt(2.3703703703703702d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f14459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rational f14460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rational f14461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f14462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Xe.e f14463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CameraInfoInternal f14464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f14465g;

    public b(CameraInternal cameraInternal, HashSet hashSet) {
        Size sizeE = o.e(cameraInternal.getCameraControlInternal().getSensorRect());
        CameraInfoInternal cameraInfoInternal = cameraInternal.getCameraInfoInternal();
        Xe.e eVar = new Xe.e(cameraInfoInternal, sizeE);
        this.f14465g = new HashMap();
        this.f14459a = sizeE;
        Rational rational = ((double) sizeE.getWidth()) / ((double) sizeE.getHeight()) > f14458h ? androidx.camera.core.impl.utils.b.f14145c : androidx.camera.core.impl.utils.b.f14143a;
        sizeE.toString();
        Objects.toString(rational);
        p140j8.f.G("ResolutionsMerger");
        this.f14460b = rational;
        Rational rational2 = androidx.camera.core.impl.utils.b.f14143a;
        if (rational.equals(rational2)) {
            rational2 = androidx.camera.core.impl.utils.b.f14145c;
        } else if (!rational.equals(androidx.camera.core.impl.utils.b.f14145c)) {
            throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
        }
        this.f14461c = rational2;
        this.f14464f = cameraInfoInternal;
        this.f14462d = hashSet;
        this.f14463e = eVar;
    }

    public static Rect a(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational rationalG = g(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalG2 = g(size);
        if (rationalG.floatValue() == rationalG2.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rationalG.floatValue() > rationalG2.floatValue()) {
                float f10 = width;
                float fFloatValue = f10 / rationalG.floatValue();
                float f11 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f11, f10, fFloatValue + f11);
            } else {
                float f12 = height;
                float fFloatValue2 = rationalG.floatValue() * f12;
                float f13 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f13, 0.0f, fFloatValue2 + f13, f12);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static boolean c(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    public static Rational g(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final List b(UseCaseConfig useCaseConfig) {
        Rational rationalG;
        if (!this.f14462d.contains(useCaseConfig)) {
            throw new IllegalArgumentException("Invalid child config: " + useCaseConfig);
        }
        HashMap map = this.f14465g;
        if (map.containsKey(useCaseConfig)) {
            List list = (List) map.get(useCaseConfig);
            Objects.requireNonNull(list);
            return list;
        }
        List<Size> listB = this.f14463e.b(useCaseConfig);
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : listB) {
            Iterator it = map2.keySet().iterator();
            do {
                if (!it.hasNext()) {
                    rationalG = null;
                    break;
                }
                rationalG = (Rational) it.next();
                Rational rational = androidx.camera.core.impl.utils.b.f14143a;
            } while (!androidx.camera.core.impl.utils.b.a(size, rationalG, androidx.camera.core.internal.utils.d.f14363c));
            if (rationalG != null) {
                Size size2 = (Size) map2.get(rationalG);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalG = g(size);
            }
            arrayList.add(size);
            map2.put(rationalG, size);
        }
        map.put(useCaseConfig, arrayList);
        return arrayList;
    }

    public final boolean d(Rational rational, Size size) {
        Rational rational2 = this.f14460b;
        if (rational2.equals(rational)) {
            return false;
        }
        Rational rational3 = androidx.camera.core.impl.utils.b.f14143a;
        Size size2 = androidx.camera.core.internal.utils.d.f14363c;
        if (androidx.camera.core.impl.utils.b.a(size, rational, size2)) {
            return false;
        }
        float fFloatValue = rational2.floatValue();
        float fFloatValue2 = rational.floatValue();
        Rational rationalG = androidx.camera.core.impl.utils.b.f14143a;
        if (!androidx.camera.core.impl.utils.b.a(size, rationalG, size2)) {
            rationalG = androidx.camera.core.impl.utils.b.f14145c;
            if (!androidx.camera.core.impl.utils.b.a(size, rationalG, size2)) {
                rationalG = g(size);
            }
        }
        float fFloatValue3 = rationalG.floatValue();
        if (fFloatValue == fFloatValue2 || fFloatValue2 == fFloatValue3) {
            return false;
        }
        if (fFloatValue > fFloatValue2) {
            return fFloatValue2 < fFloatValue3;
        }
        return fFloatValue2 > fFloatValue3;
    }

    public final ArrayList e(List list, boolean z3) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = androidx.camera.core.impl.utils.b.f14143a;
        map.put(rational, new ArrayList());
        Rational rational2 = androidx.camera.core.impl.utils.b.f14145c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (androidx.camera.core.impl.utils.b.a(size, rational3, androidx.camera.core.internal.utils.d.f14363c)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalG = g(size);
                    arrayList2.add(rationalG);
                    map.put(rationalG, arrayList);
                }
                arrayList.add(size);
            }
        }
        ArrayList<Rational> arrayList3 = new ArrayList(map.keySet());
        Collections.sort(arrayList3, new a(g(this.f14459a), 0));
        ArrayList arrayList4 = new ArrayList();
        for (Rational rational4 : arrayList3) {
            if (!rational4.equals(androidx.camera.core.impl.utils.b.f14145c) && !rational4.equals(androidx.camera.core.impl.utils.b.f14143a)) {
                List list2 = (List) map.get(rational4);
                Objects.requireNonNull(list2);
                arrayList4.addAll(f(rational4, list2, z3));
            }
        }
        return arrayList4;
    }

    public final ArrayList f(Rational rational, List list, boolean z3) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational2 = androidx.camera.core.impl.utils.b.f14143a;
            if (androidx.camera.core.impl.utils.b.a(size, rational, androidx.camera.core.internal.utils.d.f14363c)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new androidx.camera.core.impl.utils.d(true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator it2 = this.f14462d.iterator();
        while (it2.hasNext()) {
            List<Size> listB = b((UseCaseConfig) it2.next());
            if (!z3) {
                ArrayList arrayList3 = new ArrayList();
                for (Size size2 : listB) {
                    if (!d(rational, size2)) {
                        arrayList3.add(size2);
                    }
                }
                listB = arrayList3;
            }
            if (listB.isEmpty()) {
                return new ArrayList();
            }
            if (listB.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Size size3 : arrayList2) {
                    Iterator it3 = listB.iterator();
                    while (it3.hasNext()) {
                        if (!c((Size) it3.next(), size3)) {
                            arrayList4.add(size3);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList4;
            }
            if (listB.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList<Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                for (Size size4 : arrayList5) {
                    Iterator it4 = listB.iterator();
                    do {
                        if (!it4.hasNext()) {
                            arrayList.add(size4);
                            break;
                        }
                    } while (!c((Size) it4.next(), size4));
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Size size5 : arrayList2) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }
}
