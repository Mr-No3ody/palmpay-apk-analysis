package M0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f5711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5713e;

    public e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f5709a = context;
    }

    public final g a() {
        String str;
        d dVar = this.f5711c;
        if (dVar == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        if (this.f5712d && ((str = this.f5710b) == null || str.length() == 0)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new g(this.f5709a, this.f5710b, dVar, this.f5712d, this.f5713e);
    }
}
