package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes.dex */
interface ReadWriteBuf extends ReadBuf {
    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    int limit();

    void put(byte b7);

    void put(byte[] bArr, int i7, int i10);

    void putBoolean(boolean z3);

    void putDouble(double d2);

    void putFloat(float f10);

    void putInt(int i7);

    void putLong(long j6);

    void putShort(short s3);

    boolean requestCapacity(int i7);

    void set(int i7, byte b7);

    void set(int i7, byte[] bArr, int i10, int i11);

    void setBoolean(int i7, boolean z3);

    void setDouble(int i7, double d2);

    void setFloat(int i7, float f10);

    void setInt(int i7, int i10);

    void setLong(int i7, long j6);

    void setShort(int i7, short s3);

    int writePosition();
}
