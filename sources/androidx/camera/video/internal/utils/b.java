package androidx.camera.video.internal.utils;

import E.C0216v;
import androidx.camera.core.impl.C0977f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f14769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f14770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f14771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f14772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f14773e;

    static {
        HashMap map = new HashMap();
        f14769a = map;
        HashMap map2 = new HashMap();
        f14770b = map2;
        HashMap map3 = new HashMap();
        f14771c = map3;
        HashMap map4 = new HashMap();
        f14772d = map4;
        HashMap map5 = new HashMap();
        f14773e = map5;
        map.put(8, new HashSet(Collections.singletonList(8)));
        map.put(10, new HashSet(Collections.singletonList(10)));
        map.put(0, new HashSet(Arrays.asList(8, 10)));
        map2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        map2.put(1, new HashSet(Collections.singletonList(0)));
        map2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        map2.put(3, new HashSet(Collections.singletonList(1)));
        map2.put(4, new HashSet(Collections.singletonList(2)));
        map2.put(5, new HashSet(Collections.singletonList(3)));
        map2.put(6, new HashSet(Collections.singletonList(4)));
        map3.put(8, 8);
        map3.put(10, 10);
        map4.put(0, 1);
        map4.put(1, 3);
        map4.put(2, 4);
        map4.put(3, 5);
        map4.put(4, 6);
        HashMap map6 = new HashMap();
        C0216v c0216v = C0216v.f2122d;
        map6.put(c0216v, 1);
        C0216v c0216v2 = C0216v.f2123e;
        map6.put(c0216v2, 2);
        C0216v c0216v3 = C0216v.f2124f;
        map6.put(c0216v3, 4096);
        C0216v c0216v4 = C0216v.f2125g;
        Integer numValueOf = Integer.valueOf(UserMetadata.MAX_INTERNAL_KEY_SIZE);
        map6.put(c0216v4, numValueOf);
        HashMap map7 = new HashMap();
        map7.put(c0216v, 1);
        map7.put(c0216v2, 2);
        map7.put(c0216v3, 4096);
        map7.put(c0216v4, numValueOf);
        HashMap map8 = new HashMap();
        map8.put(c0216v, 1);
        map8.put(c0216v2, 4);
        map8.put(c0216v3, 4096);
        map8.put(c0216v4, 16384);
        HashMap map9 = new HashMap();
        map9.put(C0216v.f2126h, Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER));
        map9.put(C0216v.f2127i, 512);
        map5.put("video/hevc", map6);
        map5.put("video/av01", map7);
        map5.put("video/x-vnd.on2.vp9", map8);
        map5.put("video/dolby-vision", map9);
    }

    public static boolean a(C0977f c0977f, C0216v c0216v) {
        Set set;
        int i7 = c0977f.f14055h;
        Set set2 = (Set) f14769a.get(Integer.valueOf(c0216v.f2129b));
        return set2 != null && set2.contains(Integer.valueOf(i7)) && (set = (Set) f14770b.get(Integer.valueOf(c0216v.f2128a))) != null && set.contains(Integer.valueOf(c0977f.f14057j));
    }
}
