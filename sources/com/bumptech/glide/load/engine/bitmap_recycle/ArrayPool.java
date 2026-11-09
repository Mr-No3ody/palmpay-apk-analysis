package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: loaded from: classes.dex */
public interface ArrayPool {
    void clearMemory();

    <T> T get(int i7, Class<T> cls);

    <T> T getExact(int i7, Class<T> cls);

    <T> void put(T t);

    @Deprecated
    <T> void put(T t, Class<T> cls);

    void trimMemory(int i7);
}
