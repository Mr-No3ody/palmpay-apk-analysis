package androidx.work.impl.foreground;

import V0.C0699s;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({c.f39801b})
public interface ForegroundProcessor {
    void startForeground(@NonNull String workSpecId, @NonNull C0699s foregroundInfo);
}
