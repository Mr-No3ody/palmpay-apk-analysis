package androidx.camera.video;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f14803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f14804c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f14805a = new HashMap();

    static {
        HashMap map = new HashMap();
        f14803b = map;
        map.put(l.f14796d, Range.create(2160, 4319));
        map.put(l.f14795c, Range.create(1080, 1439));
        map.put(l.f14794b, Range.create(720, 1079));
        map.put(l.f14793a, Range.create(241, 719));
        HashMap map2 = new HashMap();
        f14804c = map2;
        map2.put(0, androidx.camera.core.impl.utils.b.f14143a);
        map2.put(1, androidx.camera.core.impl.utils.b.f14145c);
    }

    public n(List list, HashMap map) {
        HashMap map2;
        Integer num;
        l lVar;
        HashMap map3 = f14803b;
        Iterator it = map3.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map2 = f14804c;
            if (!zHasNext) {
                break;
            }
            l lVar2 = (l) it.next();
            this.f14805a.put(new C1017f(lVar2, -1), new ArrayList());
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                this.f14805a.put(new C1017f(lVar2, ((Integer) it2.next()).intValue()), new ArrayList());
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list2 = (List) this.f14805a.get(new C1017f((l) entry.getKey(), -1));
            Objects.requireNonNull(list2);
            list2.add((Size) entry.getValue());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Size size = (Size) it3.next();
            Iterator it4 = map3.entrySet().iterator();
            while (true) {
                num = null;
                if (!it4.hasNext()) {
                    lVar = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it4.next();
                if (((Range) entry2.getValue()).contains(Integer.valueOf(size.getHeight()))) {
                    lVar = (l) entry2.getKey();
                    break;
                }
            }
            if (lVar != null) {
                for (Map.Entry entry3 : map2.entrySet()) {
                    if (androidx.camera.core.impl.utils.b.a(size, (Rational) entry3.getValue(), androidx.camera.core.internal.utils.d.f14362b)) {
                        num = (Integer) entry3.getKey();
                        break;
                    }
                }
                if (num != null) {
                    List list3 = (List) this.f14805a.get(new C1017f(lVar, num.intValue()));
                    Objects.requireNonNull(list3);
                    list3.add(size);
                }
            }
        }
        for (Map.Entry entry4 : this.f14805a.entrySet()) {
            Size size2 = (Size) map.get(((C1017f) entry4.getKey()).f14593a);
            if (size2 != null) {
                Size size3 = androidx.camera.core.internal.utils.d.f14361a;
                final int height = size2.getHeight() * size2.getWidth();
                Collections.sort((List) entry4.getValue(), new Comparator() { // from class: androidx.camera.video.m
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int iA = androidx.camera.core.internal.utils.d.a((Size) obj);
                        int i7 = height;
                        return Math.abs(iA - i7) - Math.abs(androidx.camera.core.internal.utils.d.a((Size) obj2) - i7);
                    }
                });
            }
        }
    }
}
