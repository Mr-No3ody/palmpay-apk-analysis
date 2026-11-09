package com.didiglobal.booster.instrument;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public class CaughtCallback implements Handler.Callback {
    private final Handler mHandler;

    public CaughtCallback(Handler handler) {
        this.mHandler = handler;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        try {
            this.mHandler.handleMessage(message);
            return true;
        } catch (RuntimeException unused) {
            return true;
        }
    }
}
