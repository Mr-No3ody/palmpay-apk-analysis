package top.zibin.luban;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public interface OnCompressListener {
    void onError(int i7, Throwable th);

    void onStart();

    void onSuccess(int i7, File file);
}
