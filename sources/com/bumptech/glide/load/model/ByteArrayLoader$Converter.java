package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes.dex */
public interface ByteArrayLoader$Converter<Data> {
    Data convert(byte[] bArr);

    Class<Data> getDataClass();
}
