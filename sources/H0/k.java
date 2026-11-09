package H0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.concurrent.futures.o;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f3573a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f3574b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static org.sufficientlysecure.htmltextview.i f3575c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? i.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static org.sufficientlysecure.htmltextview.i b() {
        org.sufficientlysecure.htmltextview.i iVar = new org.sufficientlysecure.htmltextview.i(1);
        f3575c = iVar;
        f3573a.set(iVar);
        return f3575c;
    }

    public static void c(Context context, boolean z3) {
        j jVarA;
        int i7;
        if (z3 || f3575c == null) {
            synchronized (f3574b) {
                if (!z3) {
                    try {
                        if (f3575c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28 && i10 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i11 = 0;
                    boolean z8 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z10 = file2.exists() && length2 > 0;
                    try {
                        long jA = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                jVarA = j.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            jVarA = null;
                        }
                        if (jVarA != null && jVarA.f3571c == jA && (i7 = jVarA.f3570b) != 2) {
                            i11 = i7;
                        } else if (z8) {
                            i11 = 1;
                        } else if (z10) {
                            i11 = 2;
                        }
                        if (z3 && z10 && i11 != 1) {
                            i11 = 2;
                        }
                        if (jVarA != null && jVarA.f3570b == 2 && i11 == 1 && length < jVarA.f3572d) {
                            i11 = 3;
                        }
                        j jVar = new j(1, i11, jA, length2);
                        if (jVarA == null || !jVarA.equals(jVar)) {
                            try {
                                jVar.b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
