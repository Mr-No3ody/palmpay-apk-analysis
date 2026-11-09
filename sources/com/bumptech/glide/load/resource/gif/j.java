package com.bumptech.glide.load.resource.gif;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j implements ResourceDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f21018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f21019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.f f21020c;

    public j(ArrayList arrayList, b bVar, com.bumptech.glide.load.engine.bitmap_recycle.f fVar) {
        this.f21018a = arrayList;
        this.f21019b = bVar;
        this.f21020c = fVar;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource decode(Object obj, int i7, int i10, com.bumptech.glide.load.h hVar) {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i11 = inputStream.read(bArr);
                if (i11 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i11);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f21019b.decode(ByteBuffer.wrap(byteArray), i7, i10, hVar);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean handles(Object obj, com.bumptech.glide.load.h hVar) {
        return !((Boolean) hVar.a(i.f21017b)).booleanValue() && com.bumptech.glide.load.e.b(this.f21018a, (InputStream) obj, this.f21020c) == ImageHeaderParser.ImageType.GIF;
    }
}
