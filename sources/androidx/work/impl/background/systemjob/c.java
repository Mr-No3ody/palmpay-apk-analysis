package androidx.work.impl.background.systemjob;

import V0.C;
import V0.C0697p;
import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f18457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0697p f18458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18459c;

    static {
        C.d("SystemJobInfoConverter");
    }

    public c(Context context, C0697p c0697p, boolean z3) {
        this.f18458b = c0697p;
        this.f18457a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f18459c = z3;
    }
}
