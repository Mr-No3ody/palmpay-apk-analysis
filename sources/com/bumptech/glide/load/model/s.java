package com.bumptech.glide.load.model;

import com.bumptech.glide.load.Encoder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Encoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20866a;

    public s(com.bumptech.glide.load.engine.bitmap_recycle.f fVar) {
        this.f20866a = fVar;
    }

    @Override // com.bumptech.glide.load.Encoder
    public boolean encode(Object obj, File file, com.bumptech.glide.load.h hVar) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        com.bumptech.glide.load.engine.bitmap_recycle.f fVar = (com.bumptech.glide.load.engine.bitmap_recycle.f) this.f20866a;
        byte[] bArr = (byte[]) fVar.get(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            while (true) {
                try {
                    int i7 = inputStream.read(bArr);
                    if (i7 == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, i7);
                } catch (IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    fVar.put(bArr);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    fVar.put(bArr);
                    throw th;
                }
            }
            fileOutputStream2.close();
            try {
                fileOutputStream2.close();
            } catch (IOException unused4) {
            }
            fVar.put(bArr);
            return true;
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(int i7) {
        this(250L);
        switch (i7) {
            case 1:
                this.f20866a = new HashMap();
                break;
            default:
                break;
        }
    }

    public s(long j6) {
        this.f20866a = new q(j6);
    }
}
