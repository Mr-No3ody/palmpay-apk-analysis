package M0;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5708a;

    static {
        new c(null);
    }

    public d(int i7) {
        this.f5708a = i7;
    }

    public static void a(String str) {
        if (y.h(str, ":memory:", true)) {
            return;
        }
        int length = str.length() - 1;
        int i7 = 0;
        boolean z3 = false;
        while (i7 <= length) {
            boolean z8 = Intrinsics.h(str.charAt(!z3 ? i7 : length), 32) <= 0;
            if (z3) {
                if (!z8) {
                    break;
                } else {
                    length--;
                }
            } else if (z8) {
                i7++;
            } else {
                z3 = true;
            }
        }
        if (str.subSequence(i7, length + 1).toString().length() == 0) {
            return;
        }
        try {
            File file = new File(str);
            Intrinsics.checkNotNullParameter(file, "file");
            SQLiteDatabase.deleteDatabase(file);
        } catch (Exception unused) {
        }
    }

    public void b(N0.d db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
    }

    public abstract void c(N0.d dVar);

    public abstract void d(N0.d dVar, int i7, int i10);

    public abstract void e(N0.d dVar);

    public abstract void f(N0.d dVar, int i7, int i10);
}
