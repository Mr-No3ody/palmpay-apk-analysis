package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1329a implements ResourceDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20907c;

    public /* synthetic */ C1329a(int i7, Object obj, Object obj2) {
        this.f20905a = i7;
        this.f20906b = obj;
        this.f20907c = obj2;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource decode(Object obj, int i7, int i10, com.bumptech.glide.load.h hVar) throws IOException {
        boolean z3;
        y yVar;
        J1.f fVar;
        switch (this.f20905a) {
            case 0:
                Resource resourceDecode = ((ResourceDecoder) this.f20906b).decode(obj, i7, i10, hVar);
                if (resourceDecode == null) {
                    return null;
                }
                return new C1331c((Resources) this.f20907c, resourceDecode);
            case 1:
                Resource resourceA = ((C1.e) this.f20906b).a((Uri) obj, hVar);
                if (resourceA == null) {
                    return null;
                }
                return q.a((BitmapPool) this.f20907c, (Drawable) ((C1.d) resourceA).get(), i7, i10);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof y) {
                    yVar = (y) inputStream;
                    z3 = false;
                } else {
                    z3 = true;
                    yVar = new y(inputStream, (com.bumptech.glide.load.engine.bitmap_recycle.f) this.f20907c);
                }
                ArrayDeque arrayDeque = J1.f.f4458c;
                synchronized (arrayDeque) {
                    fVar = (J1.f) arrayDeque.poll();
                    break;
                }
                if (fVar == null) {
                    fVar = new J1.f();
                }
                J1.f fVar2 = fVar;
                fVar2.f4459a = yVar;
                J1.l lVar = new J1.l(fVar2);
                androidx.work.impl.model.b bVar = new androidx.work.impl.model.b(5, yVar, fVar2);
                try {
                    o oVar = (o) this.f20906b;
                    C1331c c1331cA = oVar.a(new w(lVar, oVar.f20942d, oVar.f20941c), i7, i10, hVar, bVar);
                    fVar2.f4460b = null;
                    fVar2.f4459a = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(fVar2);
                        break;
                    }
                    return c1331cA;
                } finally {
                    fVar2.f4460b = null;
                    fVar2.f4459a = null;
                    ArrayDeque arrayDeque2 = J1.f.f4458c;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(fVar2);
                        if (z3) {
                            yVar.release();
                        }
                    }
                }
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean handles(Object obj, com.bumptech.glide.load.h hVar) {
        switch (this.f20905a) {
            case 0:
                return ((ResourceDecoder) this.f20906b).handles(obj, hVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((o) this.f20906b).getClass();
                return true;
        }
    }

    public C1329a(Resources resources, ResourceDecoder resourceDecoder) {
        this.f20905a = 0;
        this.f20907c = resources;
        this.f20906b = resourceDecoder;
    }
}
