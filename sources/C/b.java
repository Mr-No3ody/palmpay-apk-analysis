package C;

import E.C0211p;
import E.T;
import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.C0933i0;
import androidx.camera.camera2.internal.M;
import androidx.camera.camera2.internal.compat.s;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.C0984i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p1.d;
import p140j8.f;
import p377z5.l;

/* JADX INFO: loaded from: classes.dex */
public final class b implements CameraCoordinator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f912a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f917f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f914c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f916e = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f913b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f915d = new ArrayList();

    public b(s sVar) {
        this.f912a = sVar;
        Set<Set<String>> hashSet = new HashSet<>();
        try {
            hashSet = sVar.f13482a.getConcurrentCameraIds();
        } catch (androidx.camera.camera2.internal.compat.a unused) {
            f.g("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        Iterator<Set<String>> it = hashSet.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList(it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                try {
                    if (l.p(sVar, str) && l.p(sVar, str2)) {
                        this.f916e.add(new HashSet(Arrays.asList(str, str2)));
                        HashMap map = this.f914c;
                        if (!map.containsKey(str)) {
                            map.put(str, new ArrayList());
                        }
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        ((List) map.get(str)).add((String) arrayList.get(1));
                        ((List) map.get(str2)).add((String) arrayList.get(0));
                    }
                } catch (T unused2) {
                    f.G("Camera2CameraCoordinator");
                }
            }
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public final void addListener(CameraCoordinator.ConcurrentCameraModeListener concurrentCameraModeListener) {
        this.f913b.add(concurrentCameraModeListener);
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public final List getActiveConcurrentCameraInfos() {
        return this.f915d;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public final int getCameraOperatingMode() {
        return this.f917f;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public final List getConcurrentCameraSelectors() {
        ArrayList arrayList = new ArrayList();
        for (Set<String> set : this.f916e) {
            ArrayList arrayList2 = new ArrayList();
            for (String str : set) {
                s sVar = this.f912a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new a(str, 0));
                try {
                    int iIntValue = ((Integer) sVar.a(str).a(CameraCharacteristics.LENS_FACING)).intValue();
                    p118hf.a.k(iIntValue != -1, "The specified lens facing is invalid.");
                    linkedHashSet.add(new C0984i0(iIntValue));
                    arrayList2.add(new C0211p(linkedHashSet));
                } catch (androidx.camera.camera2.internal.compat.a e10) {
                    throw new RuntimeException(e10);
                }
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public final String getPairedConcurrentCameraId(String str) {
        HashMap map = this.f914c;
        if (!map.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) map.get(str)) {
            Iterator it = this.f915d.iterator();
            while (it.hasNext()) {
                d dVarF = d.f((CameraInfo) it.next());
                C0933i0 c0933i0 = (C0933i0) dVarF.f41179c;
                if (str2.equals(c0933i0 != null ? c0933i0.f13554a : ((M) dVarF.f41178b).f13228a)) {
                    return str2;
                }
            }
        }
        return null;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public final void removeListener(CameraCoordinator.ConcurrentCameraModeListener concurrentCameraModeListener) {
        this.f913b.remove(concurrentCameraModeListener);
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public final void setActiveConcurrentCameraInfos(List list) {
        this.f915d = new ArrayList(list);
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public final void setCameraOperatingMode(int i7) {
        if (i7 != this.f917f) {
            Iterator it = this.f913b.iterator();
            while (it.hasNext()) {
                ((CameraCoordinator.ConcurrentCameraModeListener) it.next()).onCameraOperatingModeUpdated(this.f917f, i7);
            }
        }
        if (this.f917f == 2 && i7 != 2) {
            this.f915d.clear();
        }
        this.f917f = i7;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public final void shutdown() {
        this.f913b.clear();
        this.f914c.clear();
        this.f915d.clear();
        this.f916e.clear();
        this.f917f = 0;
    }
}
