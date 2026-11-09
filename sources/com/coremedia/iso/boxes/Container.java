package com.coremedia.iso.boxes;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface Container {
    List<Box> getBoxes();

    <T extends Box> List<T> getBoxes(Class<T> cls);

    <T extends Box> List<T> getBoxes(Class<T> cls, boolean z3);

    ByteBuffer getByteBuffer(long j6, long j10) throws IOException;

    void setBoxes(List<Box> list);

    void writeContainer(WritableByteChannel writableByteChannel) throws IOException;
}
