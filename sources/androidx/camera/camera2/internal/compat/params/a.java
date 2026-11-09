package androidx.camera.camera2.internal.compat.params;

import E.C0216v;
import android.hardware.camera2.params.DynamicRangeProfiles;
import com.luck.picture.lib.config.FileSizeUnit;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f13414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f13415b;

    static {
        C0216v c0216v;
        HashMap map = new HashMap();
        f13414a = map;
        HashMap map2 = new HashMap();
        f13415b = map2;
        C0216v c0216v2 = C0216v.f2122d;
        map.put(1L, c0216v2);
        map2.put(c0216v2, Collections.singletonList(1L));
        map.put(2L, C0216v.f2123e);
        map2.put((C0216v) map.get(2L), Collections.singletonList(2L));
        C0216v c0216v3 = C0216v.f2124f;
        map.put(4L, c0216v3);
        map2.put(c0216v3, Collections.singletonList(4L));
        C0216v c0216v4 = C0216v.f2125g;
        map.put(8L, c0216v4);
        map2.put(c0216v4, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c0216v = C0216v.f2126h;
            if (!zHasNext) {
                break;
            }
            f13414a.put((Long) it.next(), c0216v);
        }
        f13415b.put(c0216v, listAsList);
        List listAsList2 = Arrays.asList(Long.valueOf(FileSizeUnit.KB), 2048L, 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            C0216v c0216v5 = C0216v.f2127i;
            if (!zHasNext2) {
                f13415b.put(c0216v5, listAsList2);
                return;
            } else {
                f13414a.put((Long) it2.next(), c0216v5);
            }
        }
    }

    public static Long a(C0216v c0216v, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) f13415b.get(c0216v);
        if (list == null) {
            return null;
        }
        Set supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l5 : list) {
            if (supportedProfiles.contains(l5)) {
                return l5;
            }
        }
        return null;
    }
}
