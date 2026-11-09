package androidx.camera.camera2.internal;

import android.os.Build;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0982h0;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.ReadableConfig;
import androidx.camera.core.impl.UseCaseConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0971c f13293a = new C0971c("camera2.streamSpec.streamUseCase", Long.TYPE, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f13294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f13295c;

    static {
        HashMap map = new HashMap();
        f13294b = map;
        HashMap map2 = new HashMap();
        f13295c = map2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            androidx.camera.core.impl.T0 t1 = androidx.camera.core.impl.T0.f13975b;
            hashSet.add(t1);
            androidx.camera.core.impl.T0 t3 = androidx.camera.core.impl.T0.f13979f;
            hashSet.add(t3);
            map.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(t1);
            hashSet2.add(t3);
            hashSet2.add(androidx.camera.core.impl.T0.f13976c);
            map.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            androidx.camera.core.impl.T0 t8 = androidx.camera.core.impl.T0.f13974a;
            hashSet3.add(t8);
            map.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            androidx.camera.core.impl.T0 t10 = androidx.camera.core.impl.T0.f13977d;
            hashSet4.add(t10);
            map.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(t1);
            hashSet5.add(t8);
            hashSet5.add(t10);
            map2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(t1);
            hashSet6.add(t10);
            map2.put(3L, hashSet6);
        }
    }

    public static androidx.camera.camera2.impl.b a(androidx.camera.camera2.impl.b bVar, long j6) {
        C0971c c0971c = f13293a;
        if (bVar.containsOption(c0971c) && ((Long) bVar.retrieveOption(c0971c)).longValue() == j6) {
            return null;
        }
        C0992m0 c0992m0C = C0992m0.c(bVar);
        c0992m0C.insertOption(c0971c, Long.valueOf(j6));
        return new androidx.camera.camera2.impl.b(c0992m0C, 2);
    }

    public static boolean b(androidx.camera.core.impl.T0 t1, long j6, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (t1 != androidx.camera.core.impl.T0.f13978e) {
            HashMap map = f13294b;
            return map.containsKey(Long.valueOf(j6)) && ((Set) map.get(Long.valueOf(j6))).contains(t1);
        }
        HashMap map2 = f13295c;
        if (!map2.containsKey(Long.valueOf(j6))) {
            return false;
        }
        Set set = (Set) map2.get(Long.valueOf(j6));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((androidx.camera.core.impl.T0) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(ReadableConfig readableConfig, androidx.camera.core.impl.T0 t1) {
        if (((Boolean) readableConfig.retrieveOption(UseCaseConfig.f13988T, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        C0971c c0971c = C0982h0.f14069b;
        if (readableConfig.containsOption(c0971c)) {
            return t1.ordinal() == 0 && ((Integer) readableConfig.retrieveOption(c0971c)).intValue() == 2;
        }
        return false;
    }
}
