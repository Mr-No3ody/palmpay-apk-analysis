package com.bumptech.glide.load.resource.bitmap;

import android.graphics.ImageDecoder;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1334f implements ResourceDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1333e f20917b;

    public C1334f(int i7) {
        this.f20916a = i7;
        switch (i7) {
            case 1:
                this.f20917b = new C1333e();
                break;
            default:
                this.f20917b = new C1333e();
                break;
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource decode(Object obj, int i7, int i10, com.bumptech.glide.load.h hVar) {
        switch (this.f20916a) {
            case 0:
                return this.f20917b.a(ImageDecoder.createSource((ByteBuffer) obj), i7, i10, hVar);
            default:
                return this.f20917b.a(ImageDecoder.createSource(J1.c.b((InputStream) obj)), i7, i10, hVar);
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final /* bridge */ /* synthetic */ boolean handles(Object obj, com.bumptech.glide.load.h hVar) {
        switch (this.f20916a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
