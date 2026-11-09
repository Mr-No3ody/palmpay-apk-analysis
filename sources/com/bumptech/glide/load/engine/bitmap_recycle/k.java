package com.bumptech.glide.load.engine.bitmap_recycle;

import J1.o;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.camera.video.u;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class k implements LruPoolStrategy {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f20601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f20602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f20603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f20604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f20605h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f20606a = new e(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f20607b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f20608c = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f20601d = configArr;
        f20602e = configArr;
        f20603f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f20604g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f20605h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String b(int i7, Bitmap.Config config) {
        return "[" + i7 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapC = c(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapC.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapC.remove(num);
                return;
            } else {
                navigableMapC.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + b(o.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    public final NavigableMap c(Bitmap.Config config) {
        HashMap map = this.f20608c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public final Bitmap get(int i7, int i10, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iD = o.d(config) * i7 * i10;
        e eVar = this.f20606a;
        Poolable poolableW = (Poolable) ((ArrayDeque) eVar.f1592b).poll();
        if (poolableW == null) {
            poolableW = eVar.w();
        }
        j jVar = (j) poolableW;
        jVar.f20599b = iD;
        jVar.f20600c = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i11 = i.f20597a[config.ordinal()];
            if (i11 == 1) {
                configArr = f20601d;
            } else if (i11 == 2) {
                configArr = f20603f;
            } else if (i11 != 3) {
                configArr = i11 != 4 ? new Bitmap.Config[]{config} : f20605h;
            } else {
                configArr = f20604g;
            }
        } else {
            configArr = f20602e;
        }
        for (Bitmap.Config config2 : configArr) {
            Integer num = (Integer) c(config2).ceilingKey(Integer.valueOf(iD));
            if (num != null && num.intValue() <= iD * 8) {
                if (num.intValue() == iD && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                eVar.q(jVar);
                int iIntValue = num.intValue();
                Poolable poolableW2 = (Poolable) ((ArrayDeque) eVar.f1592b).poll();
                if (poolableW2 == null) {
                    poolableW2 = eVar.w();
                }
                jVar = (j) poolableW2;
                jVar.f20599b = iIntValue;
                jVar.f20600c = config2;
                break;
            }
        }
        Bitmap bitmap = (Bitmap) this.f20607b.a(jVar);
        if (bitmap != null) {
            a(Integer.valueOf(jVar.f20599b), bitmap);
            bitmap.reconfigure(i7, i10, config);
        }
        return bitmap;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public final int getSize(Bitmap bitmap) {
        return o.c(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public final String logBitmap(int i7, int i10, Bitmap.Config config) {
        return b(o.d(config) * i7 * i10, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public final void put(Bitmap bitmap) {
        int iC = o.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        e eVar = this.f20606a;
        Poolable poolableW = (Poolable) ((ArrayDeque) eVar.f1592b).poll();
        if (poolableW == null) {
            poolableW = eVar.w();
        }
        j jVar = (j) poolableW;
        jVar.f20599b = iC;
        jVar.f20600c = config;
        this.f20607b.b(jVar, bitmap);
        NavigableMap navigableMapC = c(bitmap.getConfig());
        Integer num = (Integer) navigableMapC.get(Integer.valueOf(jVar.f20599b));
        navigableMapC.put(Integer.valueOf(jVar.f20599b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public final Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f20607b.c();
        if (bitmap != null) {
            a(Integer.valueOf(o.c(bitmap)), bitmap);
        }
        return bitmap;
    }

    public final String toString() {
        StringBuilder sbS = u.s("SizeConfigStrategy{groupedMap=");
        sbS.append(this.f20607b);
        sbS.append(", sortedSizes=(");
        HashMap map = this.f20608c;
        for (Map.Entry entry : map.entrySet()) {
            sbS.append(entry.getKey());
            sbS.append('[');
            sbS.append(entry.getValue());
            sbS.append("], ");
        }
        if (!map.isEmpty()) {
            sbS.replace(sbS.length() - 2, sbS.length(), "");
        }
        sbS.append(")}");
        return sbS.toString();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.LruPoolStrategy
    public final String logBitmap(Bitmap bitmap) {
        return b(o.c(bitmap), bitmap.getConfig());
    }
}
