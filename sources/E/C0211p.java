package E;

import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.C0984i0;
import androidx.camera.core.impl.CameraInternal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: E.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0211p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0211p f2091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0211p f2092c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f2093a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C0984i0(0));
        f2091b = new C0211p(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new C0984i0(1));
        f2092c = new C0211p(linkedHashSet2);
    }

    public C0211p(LinkedHashSet linkedHashSet) {
        this.f2093a = linkedHashSet;
    }

    public final List a(ArrayList arrayList) {
        List<CameraInfo> arrayList2 = new ArrayList<>(arrayList);
        Iterator it = this.f2093a.iterator();
        while (it.hasNext()) {
            arrayList2 = ((CameraFilter) it.next()).filter(Collections.unmodifiableList(arrayList2));
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer b() {
        Integer num = null;
        for (CameraFilter cameraFilter : this.f2093a) {
            if (cameraFilter instanceof C0984i0) {
                Integer numValueOf = Integer.valueOf(((C0984i0) cameraFilter).f14085b);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public final CameraInternal c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((CameraInternal) it.next()).getCameraInfo());
        }
        List listA = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            CameraInternal cameraInternal = (CameraInternal) it2.next();
            if (listA.contains(cameraInternal.getCameraInfo())) {
                linkedHashSet2.add(cameraInternal);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (CameraInternal) it3.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}
