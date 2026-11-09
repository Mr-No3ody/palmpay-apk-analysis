package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
interface ReadBuf {
    byte[] data();

    byte get(int i7);

    boolean getBoolean(int i7);

    double getDouble(int i7);

    float getFloat(int i7);

    int getInt(int i7);

    long getLong(int i7);

    short getShort(int i7);

    String getString(int i7, int i10);

    int limit();
}
