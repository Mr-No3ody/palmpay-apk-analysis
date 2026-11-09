package org.greenrobot.eventbus;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public interface Logger {
    void log(Level level, String str);

    void log(Level level, String str, Throwable th);
}
