package Xe;

import android.app.Application;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.internal.j;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import face.security.device.api.FaceSecCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f11207e;

    public e(Application application) {
        this.f11203a = FaceSecCode.SC_SUCCESS;
        this.f11204b = FaceSecCode.SC_SUCCESS;
        this.f11206d = new d(2);
        this.f11207e = new d(2);
        this.f11205c = application.getApplicationContext();
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(androidx.camera.core.impl.utils.b.f14143a);
        arrayList.add(androidx.camera.core.impl.utils.b.f14145c);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it2 = arrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        arrayList.add(rational);
                        break;
                    }
                } while (!androidx.camera.core.impl.utils.b.a(size, (Rational) it2.next(), androidx.camera.core.internal.utils.d.f14363c));
            }
        }
        return arrayList;
    }

    public static Rational c(int i7, boolean z3) {
        if (i7 == -1) {
            return null;
        }
        if (i7 == 0) {
            return z3 ? androidx.camera.core.impl.utils.b.f14143a : androidx.camera.core.impl.utils.b.f14144b;
        }
        if (i7 == 1) {
            return z3 ? androidx.camera.core.impl.utils.b.f14145c : androidx.camera.core.impl.utils.b.f14146d;
        }
        p140j8.f.g("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i7);
        return null;
    }

    public static HashMap d(List list) {
        HashMap map = new HashMap();
        Iterator it = a(list).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (androidx.camera.core.impl.utils.b.a(size, rational, androidx.camera.core.internal.utils.d.f14363c)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    public static List e(I.b bVar, List list, Size size, int i7, Rational rational, int i10, int i11) {
        I.a aVar = bVar.f3954a;
        HashMap mapD = d(list);
        Rational rationalC = c(aVar.f3953a, rational == null || rational.getNumerator() >= rational.getDenominator());
        ArrayList<Rational> arrayList = new ArrayList(mapD.keySet());
        Collections.sort(arrayList, new androidx.camera.core.impl.utils.a(rationalC, rational));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Rational rational2 : arrayList) {
            linkedHashMap.put(rational2, (List) mapD.get(rational2));
        }
        if (size != null) {
            Size size2 = androidx.camera.core.internal.utils.d.f14361a;
            int height = size.getHeight() * size.getWidth();
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                List<Size> list2 = (List) linkedHashMap.get((Rational) it.next());
                ArrayList arrayList2 = new ArrayList();
                for (Size size3 : list2) {
                    if (androidx.camera.core.internal.utils.d.a(size3) <= height) {
                        arrayList2.add(size3);
                    }
                }
                list2.clear();
                list2.addAll(arrayList2);
            }
        }
        I.c cVar = bVar.f3955b;
        if (cVar != null) {
            Iterator it2 = linkedHashMap.keySet().iterator();
            while (it2.hasNext()) {
                List list3 = (List) linkedHashMap.get((Rational) it2.next());
                if (!list3.isEmpty() && !cVar.equals(I.c.f3957c)) {
                    int i12 = cVar.f3959b;
                    Size size4 = cVar.f3958a;
                    if (i12 == 0) {
                        boolean zContains = list3.contains(size4);
                        list3.clear();
                        if (zContains) {
                            list3.add(size4);
                        }
                    } else if (i12 == 1) {
                        f(list3, size4, true);
                    } else if (i12 == 2) {
                        f(list3, size4, false);
                    } else if (i12 == 3) {
                        g(list3, size4, true);
                    } else if (i12 == 4) {
                        g(list3, size4, false);
                    }
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = linkedHashMap.values().iterator();
        while (it3.hasNext()) {
            for (Size size5 : (List) it3.next()) {
                if (!arrayList3.contains(size5)) {
                    arrayList3.add(size5);
                }
            }
        }
        Dg.a aVar2 = bVar.f3956c;
        if (aVar2 == null) {
            return arrayList3;
        }
        List listFilter = aVar2.filter(new ArrayList(arrayList3), com.facebook.imagepipeline.nativecode.b.v(com.facebook.imagepipeline.nativecode.b.V(i7), i10, i11 == 1));
        if (arrayList3.containsAll(listFilter)) {
            return listFilter;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    public static void f(List list, Size size, boolean z3) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z3) {
            list.addAll(arrayList);
        }
    }

    public static void g(List list, Size size, boolean z3) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            Size size2 = (Size) list.get(i7);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z3) {
            list.addAll(arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    public List b(UseCaseConfig useCaseConfig) {
        Size[] sizeArr;
        Rational rational;
        ImageOutputConfig imageOutputConfig = (ImageOutputConfig) useCaseConfig;
        List<Size> customOrderedResolutions = imageOutputConfig.getCustomOrderedResolutions(null);
        if (customOrderedResolutions != null) {
            return customOrderedResolutions;
        }
        I.b resolutionSelector = imageOutputConfig.getResolutionSelector(null);
        List<Pair<Integer, Size[]>> supportedResolutions = imageOutputConfig.getSupportedResolutions(null);
        int inputFormat = useCaseConfig.getInputFormat();
        if (supportedResolutions == null) {
            sizeArr = null;
            break;
        }
        Iterator<Pair<Integer, Size[]>> it = supportedResolutions.iterator();
        while (true) {
            if (!it.hasNext()) {
                sizeArr = null;
                break;
            }
            Pair<Integer, Size[]> next = it.next();
            if (((Integer) next.first).intValue() == inputFormat) {
                sizeArr = (Size[]) next.second;
                break;
            }
        }
        List<Size> listAsList = sizeArr == null ? null : Arrays.asList(sizeArr);
        if (listAsList == null) {
            listAsList = ((CameraInfoInternal) this.f11205c).getSupportedResolutions(inputFormat);
        }
        ArrayList arrayList = new ArrayList(listAsList);
        Collections.sort(arrayList, new androidx.camera.core.impl.utils.d(true));
        if (arrayList.isEmpty()) {
            p140j8.f.G("SupportedOutputSizesCollector");
        }
        if (resolutionSelector != null) {
            Size maxResolution = ((ImageOutputConfig) useCaseConfig).getMaxResolution(null);
            int targetRotation = imageOutputConfig.getTargetRotation(0);
            if (!useCaseConfig.isHighResolutionDisabled(false)) {
                useCaseConfig.getInputFormat();
            }
            return e(imageOutputConfig.getResolutionSelector(), arrayList, maxResolution, targetRotation, (Rational) this.f11206d, this.f11203a, this.f11204b);
        }
        j jVar = (j) this.f11207e;
        jVar.getClass();
        if (arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList<Size> arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2, new androidx.camera.core.impl.utils.d(true));
        ArrayList arrayList3 = new ArrayList();
        ImageOutputConfig imageOutputConfig2 = (ImageOutputConfig) useCaseConfig;
        Size maxResolution2 = imageOutputConfig2.getMaxResolution(null);
        Size size = (Size) arrayList2.get(0);
        if (maxResolution2 == null) {
            maxResolution2 = size;
        } else if (androidx.camera.core.internal.utils.d.a(size) < maxResolution2.getHeight() * maxResolution2.getWidth()) {
            maxResolution2 = size;
        }
        Size sizeA = jVar.a(imageOutputConfig2);
        Size size2 = androidx.camera.core.internal.utils.d.f14363c;
        int iA = androidx.camera.core.internal.utils.d.a(size2);
        if (androidx.camera.core.internal.utils.d.a(maxResolution2) < iA) {
            size2 = androidx.camera.core.internal.utils.d.f14361a;
        } else if (sizeA != null) {
            if (sizeA.getHeight() * sizeA.getWidth() < iA) {
                size2 = sizeA;
            }
        }
        for (Size size3 : arrayList2) {
            if (androidx.camera.core.internal.utils.d.a(size3) <= maxResolution2.getHeight() * maxResolution2.getWidth()) {
                if (size3.getHeight() * size3.getWidth() >= androidx.camera.core.internal.utils.d.a(size2) && !arrayList3.contains(size3)) {
                    arrayList3.add(size3);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + maxResolution2 + "\ninitial size list: " + arrayList2);
        }
        if (imageOutputConfig2.hasTargetAspectRatio()) {
            rational = c(imageOutputConfig2.getTargetAspectRatio(), jVar.f14356d);
        } else {
            Size sizeA2 = jVar.a(imageOutputConfig2);
            if (sizeA2 != null) {
                Iterator it2 = a(arrayList3).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        rational = new Rational(sizeA2.getWidth(), sizeA2.getHeight());
                        break;
                    }
                    Rational rational2 = (Rational) it2.next();
                    if (androidx.camera.core.impl.utils.b.a(sizeA2, rational2, androidx.camera.core.internal.utils.d.f14363c)) {
                        rational = rational2;
                        break;
                    }
                }
            } else {
                rational = null;
            }
        }
        if (sizeA == null) {
            sizeA = imageOutputConfig2.getDefaultResolution(null);
        }
        ArrayList arrayList4 = new ArrayList();
        new HashMap();
        if (rational == null) {
            arrayList4.addAll(arrayList3);
            if (sizeA != null) {
                f(arrayList4, sizeA, true);
                return arrayList4;
            }
        } else {
            HashMap mapD = d(arrayList3);
            if (sizeA != null) {
                Iterator it3 = mapD.keySet().iterator();
                while (it3.hasNext()) {
                    f((List) mapD.get((Rational) it3.next()), sizeA, true);
                }
            }
            ArrayList arrayList5 = new ArrayList(mapD.keySet());
            Collections.sort(arrayList5, new androidx.camera.core.impl.utils.a(rational, jVar.f14355c));
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                for (Size size4 : (List) mapD.get((Rational) it4.next())) {
                    if (!arrayList4.contains(size4)) {
                        arrayList4.add(size4);
                    }
                }
            }
        }
        return arrayList4;
    }

    public e(CameraInfoInternal cameraInfoInternal, Size size) {
        Rational rational;
        this.f11205c = cameraInfoInternal;
        this.f11203a = cameraInfoInternal.getSensorRotationDegrees();
        this.f11204b = cameraInfoInternal.getLensFacing();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List<Size> supportedResolutions = cameraInfoInternal.getSupportedResolutions(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            if (supportedResolutions.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(supportedResolutions, new androidx.camera.core.impl.utils.d(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.f11206d = rational;
        this.f11207e = new j(cameraInfoInternal, rational);
    }
}
