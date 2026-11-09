package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import android.util.Base64;
import com.bumptech.glide.load.Encoder;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.bumptech.glide.load.model.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1326c implements ByteArrayLoader$Converter, Encoder, DataUrlLoader$DataDecoder, FileLoader$FileOpener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20825a;

    public /* synthetic */ C1326c(int i7) {
        this.f20825a = i7;
    }

    @Override // com.bumptech.glide.load.model.DataUrlLoader$DataDecoder, com.bumptech.glide.load.model.FileLoader$FileOpener
    public void close(Object obj) throws IOException {
        switch (this.f20825a) {
            case 3:
                ((InputStream) obj).close();
                break;
            case 4:
                ((ParcelFileDescriptor) obj).close();
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    @Override // com.bumptech.glide.load.model.ByteArrayLoader$Converter
    public Object convert(byte[] bArr) {
        switch (this.f20825a) {
            case 0:
                return ByteBuffer.wrap(bArr);
            default:
                return new ByteArrayInputStream(bArr);
        }
    }

    @Override // com.bumptech.glide.load.model.DataUrlLoader$DataDecoder
    public Object decode(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    @Override // com.bumptech.glide.load.Encoder
    public boolean encode(Object obj, File file, com.bumptech.glide.load.h hVar) throws Throwable {
        try {
            J1.c.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.bumptech.glide.load.model.ByteArrayLoader$Converter, com.bumptech.glide.load.model.DataUrlLoader$DataDecoder, com.bumptech.glide.load.model.FileLoader$FileOpener
    public Class getDataClass() {
        switch (this.f20825a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                return InputStream.class;
            case 2:
            default:
                return InputStream.class;
            case 3:
                return InputStream.class;
            case 4:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // com.bumptech.glide.load.model.FileLoader$FileOpener
    public Object open(File file) {
        switch (this.f20825a) {
            case 4:
                return ParcelFileDescriptor.open(file, 268435456);
            default:
                return new FileInputStream(file);
        }
    }
}
