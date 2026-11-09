package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f20698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f20699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceTranscoder f20700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final top.zibin.luban.io.a f20701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20702e;

    public j(Class cls, Class cls2, Class cls3, List list, ResourceTranscoder resourceTranscoder, top.zibin.luban.io.a aVar) {
        this.f20698a = cls;
        this.f20699b = list;
        this.f20700c = resourceTranscoder;
        this.f20701d = aVar;
        this.f20702e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final Resource a(DataRewinder dataRewinder, int i7, int i10, com.bumptech.glide.load.h hVar, List list) throws u {
        List list2 = this.f20699b;
        int size = list2.size();
        Resource resourceDecode = null;
        for (int i11 = 0; i11 < size; i11++) {
            ResourceDecoder resourceDecoder = (ResourceDecoder) list2.get(i11);
            try {
                if (resourceDecoder.handles(dataRewinder.rewindAndGet(), hVar)) {
                    resourceDecode = resourceDecoder.decode(dataRewinder.rewindAndGet(), i7, i10, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(resourceDecoder);
                }
                list.add(e10);
            }
            if (resourceDecode != null) {
                break;
            }
        }
        if (resourceDecode != null) {
            return resourceDecode;
        }
        throw new u(this.f20702e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f20698a + ", decoders=" + this.f20699b + ", transcoder=" + this.f20700c + '}';
    }
}
