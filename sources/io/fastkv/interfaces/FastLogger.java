package io.fastkv.interfaces;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public interface FastLogger {
    void e(@NonNull String str, @NonNull Exception exc);

    void i(@NonNull String str, @NonNull String str2);

    void w(@NonNull String str, @NonNull Exception exc);
}
