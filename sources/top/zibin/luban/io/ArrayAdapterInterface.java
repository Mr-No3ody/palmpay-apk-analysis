package top.zibin.luban.io;

/* JADX INFO: loaded from: classes4.dex */
interface ArrayAdapterInterface<T> {
    int getArrayLength(T t);

    int getElementSizeInBytes();

    String getTag();

    T newArray(int i7);
}
