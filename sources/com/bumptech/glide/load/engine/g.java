package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.Transformation;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g implements DecodePath$DecodeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Serializable f20663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20664b;

    public g() {
        this.f20663a = new HashMap();
        this.f20664b = new HashMap();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
    @Override // com.bumptech.glide.load.engine.DecodePath$DecodeCallback
    public Resource onResourceDecoded(Resource resource) {
        Resource resourceTransform;
        Transformation transformation;
        com.bumptech.glide.load.c encodeStrategy;
        boolean z3;
        boolean z8;
        Key dVar;
        i iVar = (i) this.f20664b;
        iVar.getClass();
        Class<?> cls = resource.get().getClass();
        com.bumptech.glide.load.a aVar = com.bumptech.glide.load.a.f20511d;
        com.bumptech.glide.load.a aVar2 = (com.bumptech.glide.load.a) this.f20663a;
        f fVar = iVar.f20678a;
        ResourceEncoder resourceEncoderD = null;
        if (aVar2 != aVar) {
            Transformation transformationE = fVar.e(cls);
            transformation = transformationE;
            resourceTransform = transformationE.transform(iVar.f20685i, resource, iVar.t, iVar.f20696v);
        } else {
            resourceTransform = resource;
            transformation = null;
        }
        if (!resource.equals(resourceTransform)) {
            resource.recycle();
        }
        if (fVar.f20647c.a().f20497d.d(resourceTransform.getResourceClass()) != null) {
            com.bumptech.glide.j jVarA = fVar.f20647c.a();
            jVarA.getClass();
            resourceEncoderD = jVarA.f20497d.d(resourceTransform.getResourceClass());
            if (resourceEncoderD == null) {
                throw new com.bumptech.glide.i(resourceTransform.getResourceClass());
            }
            encodeStrategy = resourceEncoderD.getEncodeStrategy(iVar.f20668A);
        } else {
            encodeStrategy = com.bumptech.glide.load.c.f20520c;
        }
        ResourceEncoder resourceEncoder = resourceEncoderD;
        Key key = iVar.f20674Q;
        ArrayList arrayListB = fVar.b();
        int size = arrayListB.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                z3 = false;
                break;
            }
            if (((com.bumptech.glide.load.model.t) arrayListB.get(i7)).f20867a.equals(key)) {
                z3 = true;
                break;
            }
            i7++;
        }
        switch (iVar.f20697w.f20707a) {
            case 0:
                if (aVar2 == com.bumptech.glide.load.a.f20511d || aVar2 == com.bumptech.glide.load.a.f20512e) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                break;
            case 1:
            case 2:
                z8 = false;
                break;
            default:
                if (((!z3 && aVar2 == com.bumptech.glide.load.a.f20510c) || aVar2 == com.bumptech.glide.load.a.f20508a) && encodeStrategy == com.bumptech.glide.load.c.f20519b) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                break;
        }
        if (!z8) {
            return resourceTransform;
        }
        if (resourceEncoder == null) {
            throw new com.bumptech.glide.i(resourceTransform.get().getClass());
        }
        int iOrdinal = encodeStrategy.ordinal();
        if (iOrdinal == 0) {
            dVar = new d(iVar.f20674Q, iVar.f20686j);
        } else {
            if (iOrdinal != 1) {
                throw new IllegalArgumentException("Unknown strategy: " + encodeStrategy);
            }
            dVar = new y(fVar.f20647c.f20459a, iVar.f20674Q, iVar.f20686j, iVar.t, iVar.f20696v, transformation, cls, iVar.f20668A);
        }
        w wVar = (w) w.f20775e.acquire();
        J1.g.c(wVar, "Argument must not be null");
        wVar.f20779d = false;
        wVar.f20778c = true;
        wVar.f20777b = resourceTransform;
        h hVar = iVar.f20683f;
        hVar.f20665a = dVar;
        hVar.f20666b = resourceEncoder;
        hVar.f20667c = wVar;
        return wVar;
    }

    public g(i iVar, com.bumptech.glide.load.a aVar) {
        this.f20664b = iVar;
        this.f20663a = aVar;
    }
}
