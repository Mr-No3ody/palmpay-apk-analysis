package androidx.core.graphics;

import Ce.H;
import E.AbstractC0198c;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f16065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M.l f16066b;

    static {
        Trace.beginSection(AbstractC0198c.m0("TypefaceCompat static init"));
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            f16065a = new m();
        } else if (i7 >= 28) {
            f16065a = new l();
        } else if (i7 >= 26) {
            f16065a = new k();
        } else if (j.f16074c != null) {
            f16065a = new j();
        } else {
            f16065a = new i();
        }
        f16066b = new M.l(16);
        Trace.endSection();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, FontResourcesParserCompat$FamilyResourceEntry fontResourcesParserCompat$FamilyResourceEntry, Resources resources, int i7, String str, int i10, int i11, Y.h hVar, boolean z3) {
        Typeface typefaceCreate;
        List listUnmodifiableList;
        int i12 = 29;
        int i13 = 1;
        boolean z8 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Typeface typeface = null;
        int i14 = -3;
        if (fontResourcesParserCompat$FamilyResourceEntry instanceof Y.e) {
            Y.e eVar = (Y.e) fontResourcesParserCompat$FamilyResourceEntry;
            String str2 = eVar.f11248e;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (hVar != null) {
                    hVar.callbackSuccessAsync(typefaceCreate, null);
                }
                return typefaceCreate;
            }
            Object[] objArr3 = !z3 ? hVar != null : eVar.f11247d != 0;
            int i15 = z3 ? eVar.f11246c : -1;
            Handler handler = Y.h.getHandler(null);
            p1.c cVar = new p1.c(14, z8);
            cVar.f41176b = hVar;
            androidx.core.provider.e eVar2 = eVar.f11245b;
            if (eVar2 != null) {
                Object[] objArr4 = {eVar.f11244a, eVar2};
                ArrayList arrayList = new ArrayList(2);
                int i16 = 0;
                for (int i17 = 2; i16 < i17; i17 = 2) {
                    Object obj = objArr4[i16];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                    i16++;
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                Object[] objArr5 = {eVar.f11244a};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr5[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            }
            androidx.core.provider.l lVar = new androidx.core.provider.l(handler);
            p279s5.d dVar = new p279s5.d(26, cVar, lVar);
            if (objArr3 != true) {
                String strA = androidx.core.provider.i.a(i11, listUnmodifiableList);
                Typeface typeface2 = (Typeface) androidx.core.provider.i.f16124a.get(strA);
                if (typeface2 != null) {
                    lVar.execute(new androidx.camera.core.impl.utils.futures.i(i12, cVar, typeface2));
                    typeface = typeface2;
                } else {
                    androidx.core.provider.g gVar = new androidx.core.provider.g(dVar, objArr == true ? 1 : 0);
                    synchronized (androidx.core.provider.i.f16126c) {
                        try {
                            M.n nVar = androidx.core.provider.i.f16127d;
                            ArrayList arrayList3 = (ArrayList) nVar.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(gVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(gVar);
                                nVar.put(strA, arrayList4);
                                androidx.core.provider.f fVar = new androidx.core.provider.f(strA, context, listUnmodifiableList, i11, 1);
                                ThreadPoolExecutor threadPoolExecutor = androidx.core.provider.i.f16125b;
                                androidx.core.provider.g gVar2 = new androidx.core.provider.g(strA, i13);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                H h7 = new H();
                                h7.f1426c = fVar;
                                h7.f1427d = gVar2;
                                h7.f1425b = handler2;
                                threadPoolExecutor.execute(h7);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                if (listUnmodifiableList.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                androidx.core.provider.e eVar3 = (androidx.core.provider.e) listUnmodifiableList.get(0);
                M.l lVar2 = androidx.core.provider.i.f16124a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{eVar3}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String strA2 = androidx.core.provider.i.a(i11, Collections.unmodifiableList(arrayList5));
                Typeface typeface3 = (Typeface) androidx.core.provider.i.f16124a.get(strA2);
                if (typeface3 != null) {
                    lVar.execute(new androidx.camera.core.impl.utils.futures.i(i12, cVar, typeface3));
                    typeface = typeface3;
                } else if (i15 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = new Object[]{eVar3}[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    androidx.core.provider.h hVarB = androidx.core.provider.i.b(strA2, context, Collections.unmodifiableList(arrayList6), i11);
                    dVar.c(hVarB);
                    typeface = hVarB.f16122a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    androidx.core.provider.h hVar2 = (androidx.core.provider.h) androidx.core.provider.i.f16125b.submit(new androidx.core.provider.f(strA2, context, eVar3, i11, 0)).get(i15, TimeUnit.MILLISECONDS);
                                    dVar.c(hVar2);
                                    typeface = hVar2.f16122a;
                                } catch (TimeoutException unused) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e10) {
                                throw e10;
                            }
                        } catch (ExecutionException e11) {
                            throw new RuntimeException(e11);
                        }
                    } catch (InterruptedException unused2) {
                        ((androidx.core.provider.l) dVar.f42026c).execute(new androidx.core.provider.a(dVar.f42025b, i14, (int) (objArr2 == true ? 1 : 0)));
                    }
                }
            }
        } else {
            Typeface typefaceF = f16065a.f(context, (Y.c) fontResourcesParserCompat$FamilyResourceEntry, resources, i11);
            if (hVar != null) {
                if (typefaceF != null) {
                    hVar.callbackSuccessAsync(typefaceF, null);
                } else {
                    hVar.callbackFailAsync(-3, null);
                }
            }
            typeface = typefaceF;
        }
        if (typeface != null) {
            f16066b.put(b(resources, i7, str, i10, i11), typeface);
        }
        return typeface;
    }

    public static String b(Resources resources, int i7, String str, int i10, int i11) {
        return resources.getResourcePackageName(i7) + '-' + str + '-' + i10 + '-' + i7 + '-' + i11;
    }
}
