package top.zibin.luban;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public interface OnNewCompressListener {
    void onError(String str, Throwable th);

    void onStart();

    void onSuccess(String str, File file);
}
