package com.dylanvann.fastimage;

import C0.G;
import G.h;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
import com.adjust.sdk.Constants;
import com.bumptech.glide.g;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.load.model.Headers;
import com.bumptech.glide.load.model.m;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ColorDrawable f21171a = new ColorDrawable(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f21172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f21173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f21174d;

    static {
        h hVar = new h();
        hVar.put("immutable", FastImageCacheControl.IMMUTABLE);
        hVar.put("web", FastImageCacheControl.WEB);
        hVar.put("cacheOnly", FastImageCacheControl.CACHE_ONLY);
        f21172b = hVar;
        h hVar2 = new h();
        hVar2.put(Constants.LOW, g.f20472d);
        hVar2.put("normal", g.f20471c);
        hVar2.put(Constants.HIGH, g.f20470b);
        f21173c = hVar2;
        h hVar3 = new h();
        hVar3.put("contain", ImageView.ScaleType.FIT_CENTER);
        hVar3.put("cover", ImageView.ScaleType.CENTER_CROP);
        hVar3.put("stretch", ImageView.ScaleType.FIT_XY);
        hVar3.put("center", ImageView.ScaleType.CENTER_INSIDE);
        f21174d = hVar3;
    }

    public static FastImageSource a(Context context, ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        String string = readableMap.getString("uri");
        o oVar = Headers.f20819a;
        if (readableMap.hasKey("headers")) {
            ReadableMap map = readableMap.getMap("headers");
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
            m mVar = new m();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                n nVar = new n(map.getString(strNextKey));
                if (mVar.f20855c && "User-Agent".equalsIgnoreCase(strNextKey)) {
                    mVar.a();
                    List arrayList = (List) mVar.f20854b.get(strNextKey);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        mVar.f20854b.put(strNextKey, arrayList);
                    }
                    arrayList.clear();
                    arrayList.add(nVar);
                    if (mVar.f20855c && "User-Agent".equalsIgnoreCase(strNextKey)) {
                        mVar.f20855c = false;
                    }
                } else {
                    mVar.a();
                    List arrayList2 = (List) mVar.f20854b.get(strNextKey);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        mVar.f20854b.put(strNextKey, arrayList2);
                    }
                    arrayList2.add(nVar);
                }
            }
            mVar.f20853a = true;
            oVar = new o(mVar.f20854b);
        }
        return new FastImageSource(context, string, oVar);
    }

    public static G1.d b(Context context, FastImageSource fastImageSource, ReadableMap readableMap) {
        String string;
        String string2 = null;
        if (readableMap != null) {
            try {
                string = readableMap.getString("priority");
            } catch (NoSuchKeyException unused) {
                string = null;
            }
        } else {
            string = null;
        }
        g gVar = (g) c("priority", "normal", f21173c, string);
        if (readableMap != null) {
            try {
                string2 = readableMap.getString("cache");
            } catch (NoSuchKeyException unused2) {
            }
        }
        FastImageCacheControl fastImageCacheControl = (FastImageCacheControl) c("cache", "immutable", f21172b, string2);
        k kVar = k.f20706e;
        int i7 = e.f21170a[fastImageCacheControl.ordinal()];
        boolean z3 = false;
        boolean z8 = true;
        if (i7 == 1) {
            kVar = k.f20704c;
        } else if (i7 != 2) {
            z8 = false;
        } else {
            z8 = false;
            z3 = true;
        }
        G1.d dVar = (G1.d) ((G1.d) ((G1.d) ((G1.d) ((G1.d) new G1.d().g(kVar)).q(z3)).F(z8)).z(gVar)).y(f21171a);
        if (!fastImageSource.get_isResource()) {
            return dVar;
        }
        return (G1.d) dVar.a((G1.d) new G1.d().D(I1.b.a(context)));
    }

    public static Object c(String str, String str2, HashMap map, String str3) {
        if (str3 != null) {
            str2 = str3;
        }
        Object obj = map.get(str2);
        if (obj != null) {
            return obj;
        }
        throw new JSApplicationIllegalArgumentException(G.p("FastImage, invalid ", str, " : ", str2));
    }
}
