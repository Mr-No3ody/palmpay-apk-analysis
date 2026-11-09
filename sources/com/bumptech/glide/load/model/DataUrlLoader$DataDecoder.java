package com.bumptech.glide.load.model;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface DataUrlLoader$DataDecoder<Data> {
    void close(Data data) throws IOException;

    Data decode(String str) throws IllegalArgumentException;

    Class<Data> getDataClass();
}
