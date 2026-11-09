package com.tencent.mmkv;

import p126i8.a;
import p126i8.b;

/* JADX INFO: loaded from: classes3.dex */
public interface MMKVHandler {
    void mmkvLog(a level, String file, int line, String function, String message);

    b onMMKVCRCCheckFail(String mmapID);

    b onMMKVFileLengthError(String mmapID);

    boolean wantLogRedirecting();
}
