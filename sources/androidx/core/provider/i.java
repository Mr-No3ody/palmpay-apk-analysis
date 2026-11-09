package androidx.core.provider;

import E.AbstractC0198c;
import M.n;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import androidx.core.graphics.o;
import face.security.device.api.FaceSecCode;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M.l f16124a = new M.l(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f16125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f16126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f16127d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, FaceSecCode.SC_SUCCESS, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new androidx.camera.core.impl.utils.executor.e(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f16125b = threadPoolExecutor;
        f16126c = new Object();
        f16127d = new n(0);
    }

    public static String a(int i7, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((e) list.get(i10)).f16114e);
            sb2.append("-");
            sb2.append(i7);
            if (i10 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    public static h b(String str, Context context, List list, int i7) {
        int i10;
        Typeface typefaceG;
        Trace.beginSection(AbstractC0198c.m0("getFontSync"));
        M.l lVar = f16124a;
        try {
            Typeface typeface = (Typeface) lVar.get(str);
            if (typeface != null) {
                h hVar = new h(typeface);
                Trace.endSection();
                return hVar;
            }
            try {
                C4.a aVarA = d.a(context, list);
                int i11 = aVarA.f1155b;
                List list2 = (List) aVarA.f1156c;
                if (i11 == 0) {
                    j[] jVarArr = (j[]) list2.get(0);
                    if (jVarArr == null || jVarArr.length == 0) {
                        i10 = 1;
                    } else {
                        int length = jVarArr.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length) {
                                i10 = 0;
                                break;
                            }
                            int i13 = jVarArr[i12].f16132e;
                            if (i13 != 0) {
                                if (i13 >= 0) {
                                    i10 = i13;
                                    break;
                                }
                                i10 = -3;
                                break;
                            }
                            i12++;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        i10 = -3;
                        break;
                    }
                    i10 = -2;
                }
                if (i10 != 0) {
                    h hVar2 = new h(i10);
                    Trace.endSection();
                    return hVar2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    j[] jVarArr2 = (j[]) list2.get(0);
                    o oVar = androidx.core.graphics.h.f16065a;
                    Trace.beginSection(AbstractC0198c.m0("TypefaceCompat.createFromFontInfo"));
                    try {
                        typefaceG = androidx.core.graphics.h.f16065a.g(context, jVarArr2, i7);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    o oVar2 = androidx.core.graphics.h.f16065a;
                    Trace.beginSection(AbstractC0198c.m0("TypefaceCompat.createFromFontInfoWithFallback"));
                    try {
                        typefaceG = androidx.core.graphics.h.f16065a.h(context, list2, i7);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceG == null) {
                    h hVar3 = new h(-3);
                    Trace.endSection();
                    return hVar3;
                }
                lVar.put(str, typefaceG);
                h hVar4 = new h(typefaceG);
                Trace.endSection();
                return hVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                h hVar5 = new h(-1);
                Trace.endSection();
                return hVar5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
