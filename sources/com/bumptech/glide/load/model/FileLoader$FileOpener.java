package com.bumptech.glide.load.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface FileLoader$FileOpener<Data> {
    void close(Data data) throws IOException;

    Class<Data> getDataClass();

    Data open(File file) throws FileNotFoundException;
}
