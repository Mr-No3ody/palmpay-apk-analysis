package p183m6;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import p010a9.f;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f39522e;

    public l(Context context) {
        File file;
        Intrinsics.checkNotNullParameter(context, "context");
        File[] fileArrListFiles = context.getFilesDir().listFiles();
        if (fileArrListFiles == null) {
            file = null;
            break;
        }
        int length = fileArrListFiles.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                file = null;
                break;
            }
            File file2 = fileArrListFiles[i7];
            String name = file2.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (y.g(name, "config.cache.json", false)) {
                file = file2;
                break;
            }
            i7++;
        }
        this.f39522e = file != null ? new q(new i(context, null, file, null, null, 90), null) : null;
    }

    @Override // p183m6.n
    public final void a(f fVar, String... keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        if (fVar != null) {
            fVar.onComplete(true);
        }
    }

    @Override // p183m6.n
    public final boolean b(String key, boolean z3) {
        Intrinsics.checkNotNullParameter(key, "key");
        q qVar = this.f39522e;
        return qVar != null ? qVar.b(key, z3) : z3;
    }

    @Override // p183m6.n
    public final Number c(String key, Number number) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(number, "default");
        q qVar = this.f39522e;
        return qVar != null ? qVar.c(key, number) : number;
    }

    @Override // p183m6.n
    public final String d(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(str, "default");
        q qVar = this.f39522e;
        return qVar != null ? qVar.d(key, str) : str;
    }

    @Override // p183m6.n
    public final void e(String str) {
    }
}
