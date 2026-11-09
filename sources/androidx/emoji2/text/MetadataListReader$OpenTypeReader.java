package androidx.emoji2.text;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
interface MetadataListReader$OpenTypeReader {
    long getPosition();

    int readTag() throws IOException;

    long readUnsignedInt() throws IOException;

    int readUnsignedShort() throws IOException;

    void skip(int i7) throws IOException;
}
