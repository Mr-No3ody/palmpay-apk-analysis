package top.zibin.luban.io;

/* JADX INFO: loaded from: classes4.dex */
public interface ArrayPool {
    void clearMemory();

    <T> T get(int i7, Class<T> cls);

    <T> void put(T t);

    @Deprecated
    <T> void put(T t, Class<T> cls);
}
