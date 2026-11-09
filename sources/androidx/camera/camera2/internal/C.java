package androidx.camera.camera2.internal;

import android.util.ArrayMap;
import androidx.camera.core.impl.AbstractC0970b0;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C0996o0;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.UseCaseConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class C implements CameraControlInternal.ControlUpdateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f13121a;

    public C(J j6) {
        this.f13121a = j6;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback
    public final void onCameraControlCaptureRequests(List list) {
        int iC;
        int iB;
        CameraCaptureResult cameraCaptureResult;
        list.getClass();
        J j6 = this.f13121a;
        j6.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.T t = (androidx.camera.core.impl.T) it.next();
            HashSet hashSet = new HashSet();
            C0992m0.b();
            ArrayList arrayList2 = new ArrayList();
            C0996o0.a();
            hashSet.addAll(t.f13966a);
            C0992m0 c0992m0C = C0992m0.c(t.f13967b);
            arrayList2.addAll(t.f13970e);
            ArrayMap arrayMap = new ArrayMap();
            androidx.camera.core.impl.O0 o10 = t.f13972g;
            for (String str : o10.f13941a.keySet()) {
                arrayMap.put(str, o10.f13941a.get(str));
            }
            C0996o0 c0996o0 = new C0996o0(arrayMap);
            CameraCaptureResult cameraCaptureResult2 = (t.f13968c != 5 || (cameraCaptureResult = t.f13973h) == null) ? null : cameraCaptureResult;
            if (Collections.unmodifiableList(t.f13966a).isEmpty() && t.f13971f) {
                if (hashSet.isEmpty()) {
                    org.greenrobot.eventbus.f fVar = j6.f13175a;
                    fVar.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : ((LinkedHashMap) fVar.f41079b).entrySet()) {
                        androidx.camera.core.impl.R0 r3 = (androidx.camera.core.impl.R0) entry.getValue();
                        if (r3.f13954f && r3.f13953e) {
                            arrayList3.add(((androidx.camera.core.impl.R0) entry.getValue()).f13949a);
                        }
                    }
                    Iterator it2 = Collections.unmodifiableCollection(arrayList3).iterator();
                    while (it2.hasNext()) {
                        androidx.camera.core.impl.T t3 = ((androidx.camera.core.impl.H0) it2.next()).f13886g;
                        List listUnmodifiableList = Collections.unmodifiableList(t3.f13966a);
                        if (!listUnmodifiableList.isEmpty()) {
                            if (t3.b() != 0 && (iB = t3.b()) != 0) {
                                c0992m0C.insertOption(UseCaseConfig.f13991W, Integer.valueOf(iB));
                            }
                            if (t3.c() != 0 && (iC = t3.c()) != 0) {
                                c0992m0C.insertOption(UseCaseConfig.f13992a0, Integer.valueOf(iC));
                            }
                            Iterator it3 = listUnmodifiableList.iterator();
                            while (it3.hasNext()) {
                                hashSet.add((AbstractC0970b0) it3.next());
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                        p140j8.f.G("Camera2CameraImpl");
                    }
                } else {
                    p140j8.f.G("Camera2CameraImpl");
                }
            }
            ArrayList arrayList4 = new ArrayList(hashSet);
            C1000q0 c1000q0A = C1000q0.a(c0992m0C);
            ArrayList arrayList5 = new ArrayList(arrayList2);
            androidx.camera.core.impl.O0 o11 = androidx.camera.core.impl.O0.f13940b;
            ArrayMap arrayMap2 = new ArrayMap();
            ArrayMap arrayMap3 = c0996o0.f13941a;
            for (String str2 : arrayMap3.keySet()) {
                arrayMap2.put(str2, arrayMap3.get(str2));
            }
            arrayList.add(new androidx.camera.core.impl.T(arrayList4, c1000q0A, t.f13968c, t.f13969d, arrayList5, t.f13971f, new androidx.camera.core.impl.O0(arrayMap2), cameraCaptureResult2));
        }
        j6.f("Issue capture request");
        j6.t.issueCaptureRequests(arrayList);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal.ControlUpdateCallback
    public final void onCameraControlUpdateSessionConfig() {
        this.f13121a.x();
    }
}
