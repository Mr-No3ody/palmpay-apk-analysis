package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.data.DataRewinder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final top.zibin.luban.io.a f20772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f20773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20774c;

    public v(Class cls, Class cls2, Class cls3, List list, top.zibin.luban.io.a aVar) {
        this.f20772a = aVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f20773b = list;
        this.f20774c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final Resource a(DataRewinder dataRewinder, com.bumptech.glide.load.h hVar, int i7, int i10, g gVar, List list) throws u {
        List list2 = this.f20773b;
        int size = list2.size();
        Resource resourceTranscode = null;
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = (j) list2.get(i11);
            try {
                top.zibin.luban.io.a aVar = jVar.f20701d;
                Object objAcquire = aVar.acquire();
                J1.g.c(objAcquire, "Argument must not be null");
                List list3 = (List) objAcquire;
                try {
                    Resource resourceA = jVar.a(dataRewinder, i7, i10, hVar, list3);
                    aVar.release(list3);
                    try {
                        resourceTranscode = jVar.f20700c.transcode(gVar.onResourceDecoded(resourceA), hVar);
                    } catch (u e10) {
                        e = e10;
                        list.add(e);
                    }
                    if (resourceTranscode != null) {
                        break;
                    }
                } catch (Throwable th) {
                    aVar.release(list3);
                    throw th;
                }
            } catch (u e11) {
                e = e11;
            }
        }
        if (resourceTranscode != null) {
            return resourceTranscode;
        }
        throw new u(this.f20774c, new ArrayList(list));
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f20773b.toArray()) + '}';
    }
}
