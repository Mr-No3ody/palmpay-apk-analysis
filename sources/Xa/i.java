package Xa;

import C0.G;
import N8.q0;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.v0;
import android.content.Context;
import android.net.Uri;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.adjust.sdk.Constants;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.transsnet.palmpay.core.base.BaseApplication;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.C1847n;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.y;
import okhttp3.X;
import okhttp3.e0;
import okhttp3.h0;
import org.json.JSONArray;
import org.json.JSONObject;
import p072eg.j;
import p072eg.k;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f11106a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p015ag.c f11107b;

    static {
        v0 v0VarC = AbstractC0780y.c();
        p042cg.f fVar = I.f10809a;
        f11107b = AbstractC0777v.a(kotlin.coroutines.e.c(v0VarC, p042cg.e.f19009c));
    }

    public static final byte[] a(String str) {
        byte[] bArrBytes;
        try {
            X x3 = new X();
            x3.k(str);
            e0 e0VarExecute = FirebasePerfOkHttpClient.execute(BaseApplication.get().getHttpClient().newCall(x3.b()));
            try {
                if (e0VarExecute.isSuccessful()) {
                    h0 h0Var = e0VarExecute.f40734g;
                    if (h0Var != null) {
                        bArrBytes = h0Var.bytes();
                    }
                    e0VarExecute.close();
                    return bArrBytes;
                }
                F6.d.h("WebResPreloadMgr", 5, "[HTTP " + e0VarExecute.f40731d + "] download bytes failed: " + str);
                bArrBytes = null;
                e0VarExecute.close();
                return bArrBytes;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    org.chromium.support_lib_boundary.util.b.o(e0VarExecute, th);
                    throw th2;
                }
            }
        } catch (Exception e10) {
            F6.d.c("WebResPreloadMgr", G.o("[ERROR] download bytes exception: ", str), e10);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0185  */
    /* JADX WARN: Code duplicated, block: B:73:0x0195  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01be A[LOOP:0: B:74:0x01b0->B:78:0x01be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x020f  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r2v21 */
    public static final Object b(Context context, String path, Ff.c cVar) throws Throwable {
        f fVar;
        Uri uri;
        String host;
        Throwable th;
        CharSequence charSequenceSubSequence;
        String strN;
        int i7;
        ?? Y10;
        int i10;
        z zVar;
        List listB;
        String str;
        int i11 = 0;
        int i12 = 1;
        i iVar = f11106a;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i13 = fVar.f11097c;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f11097c = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(cVar);
            }
        } else {
            fVar = new f(cVar);
        }
        Object obj = fVar.f11096b;
        Ef.a aVar = Ef.a.f2423a;
        int i14 = fVar.f11097c;
        if (i14 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            F6.d.h("WebResPreloadMgr", 3, "========== preload path start: " + path + " ==========");
            Pattern pattern = a.f11061a;
            Intrinsics.checkNotNullParameter(path, "path");
            if (StringsKt.F(path) || (host = (uri = Uri.parse(path)).getHost()) == null) {
                th = null;
                strN = null;
            } else {
                String scheme = uri.getScheme();
                if (scheme == null) {
                    scheme = Constants.SCHEME;
                }
                String path2 = uri.getPath();
                if (path2 == null) {
                    path2 = "/";
                }
                char[] chars = {'/'};
                Intrinsics.checkNotNullParameter(path2, "<this>");
                Intrinsics.checkNotNullParameter(chars, "chars");
                int length = path2.length() - 1;
                if (length >= 0) {
                    while (true) {
                        int i15 = length - 1;
                        th = null;
                        if (!C1847n.m(chars, path2.charAt(length))) {
                            charSequenceSubSequence = path2.subSequence(0, length + 1);
                            break;
                        }
                        if (i15 >= 0) {
                            length = i15;
                        }
                    }
                    strN = u.n(scheme, "://", host, charSequenceSubSequence.toString(), "/asset-manifest.json");
                } else {
                    th = null;
                }
                charSequenceSubSequence = "";
                strN = u.n(scheme, "://", host, charSequenceSubSequence.toString(), "/asset-manifest.json");
            }
            if (strN == null) {
                F6.d.h("WebResPreloadMgr", 3, "[MANIFEST] cannot derive asset-manifest.json url from path: ".concat(path));
            } else {
                F6.d.h("WebResPreloadMgr", 3, "[MANIFEST] url=".concat(strN));
                String json = e(strN);
                if (json == null) {
                    F6.d.h("WebResPreloadMgr", 5, "[MANIFEST] download failed: ".concat(strN));
                } else {
                    byte[] bytes = json.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    f(context, strN, bytes);
                    F6.d.h("WebResPreloadMgr", 3, "[MANIFEST] saved to local: ".concat(strN));
                    Intrinsics.checkNotNullParameter(json, "json");
                    if (StringsKt.F(json)) {
                        zVar = z.f38935a;
                    } else {
                        try {
                            JSONArray jSONArrayOptJSONArray = new JSONObject(json).optJSONArray("assets");
                            if (jSONArrayOptJSONArray == null) {
                                zVar = z.f38935a;
                            } else {
                                LinkedHashSet linkedHashSet = new LinkedHashSet(jSONArrayOptJSONArray.length());
                                int length2 = jSONArrayOptJSONArray.length();
                                int i16 = 0;
                                while (i16 < length2) {
                                    i7 = i12;
                                    try {
                                        String strOptString = jSONArrayOptJSONArray.optString(i16);
                                        if (strOptString != null && !StringsKt.F(strOptString) && (y.m(strOptString, "http://", false) || y.m(strOptString, "https://", false))) {
                                            linkedHashSet.add(strOptString);
                                        }
                                        i16++;
                                        i12 = i7;
                                    } catch (Throwable unused) {
                                        Y10 = z.f38935a;
                                        if (Y10.isEmpty()) {
                                            F6.d.h("WebResPreloadMgr", 5, "[MANIFEST] empty or invalid assets: ".concat(strN));
                                            Y10 = th;
                                        } else {
                                            F6.d.h("WebResPreloadMgr", 3, F.c(Y10.size(), "[ASSETS] parsed ", " urls"));
                                            for (Object obj2 : (Iterable) Y10) {
                                                i10 = i11 + 1;
                                                if (i11 < 0) {
                                                    C1850q.k();
                                                    throw th;
                                                }
                                                F6.d.h("WebResPreloadMgr", 3, com.airbnb.lottie.model.layer.d.j("  [", i11, "] ", (String) obj2));
                                                i11 = i10;
                                            }
                                        }
                                        if (Y10 == 0) {
                                            F6.d.h("WebResPreloadMgr", 5, "[MANIFEST] path preload skipped (no manifest): ".concat(path));
                                            return Unit.f38893a;
                                        }
                                        listB = CollectionsKt.B((Iterable) Y10);
                                        F6.d.h("WebResPreloadMgr", 3, com.airbnb.lottie.model.layer.d.j("[DOWNLOAD] path total ", listB.size(), " unique resources for: ", path));
                                        fVar.f11095a = path;
                                        fVar.f11097c = i7;
                                        if (iVar.d(context, listB, fVar) == aVar) {
                                            return aVar;
                                        }
                                        str = path;
                                        F6.d.h("WebResPreloadMgr", 3, q0.k("========== preload path done: ", str, " =========="));
                                        return Unit.f38893a;
                                    }
                                }
                                i7 = i12;
                                Y10 = CollectionsKt.Y(linkedHashSet);
                            }
                        } catch (Throwable unused2) {
                            i7 = 1;
                        }
                        if (Y10.isEmpty()) {
                            F6.d.h("WebResPreloadMgr", 5, "[MANIFEST] empty or invalid assets: ".concat(strN));
                            Y10 = th;
                        } else {
                            F6.d.h("WebResPreloadMgr", 3, F.c(Y10.size(), "[ASSETS] parsed ", " urls"));
                            while (r2.hasNext()) {
                                i10 = i11 + 1;
                                if (i11 < 0) {
                                    C1850q.k();
                                    throw th;
                                }
                                F6.d.h("WebResPreloadMgr", 3, com.airbnb.lottie.model.layer.d.j("  [", i11, "] ", (String) obj2));
                                i11 = i10;
                            }
                        }
                    }
                    i7 = 1;
                    Y10 = zVar;
                    if (Y10.isEmpty()) {
                        F6.d.h("WebResPreloadMgr", 5, "[MANIFEST] empty or invalid assets: ".concat(strN));
                        Y10 = th;
                    } else {
                        F6.d.h("WebResPreloadMgr", 3, F.c(Y10.size(), "[ASSETS] parsed ", " urls"));
                        while (r2.hasNext()) {
                            i10 = i11 + 1;
                            if (i11 < 0) {
                                C1850q.k();
                                throw th;
                            }
                            F6.d.h("WebResPreloadMgr", 3, com.airbnb.lottie.model.layer.d.j("  [", i11, "] ", (String) obj2));
                            i11 = i10;
                        }
                    }
                }
                if (Y10 == 0) {
                    F6.d.h("WebResPreloadMgr", 5, "[MANIFEST] path preload skipped (no manifest): ".concat(path));
                    return Unit.f38893a;
                }
                listB = CollectionsKt.B((Iterable) Y10);
                F6.d.h("WebResPreloadMgr", 3, com.airbnb.lottie.model.layer.d.j("[DOWNLOAD] path total ", listB.size(), " unique resources for: ", path));
                fVar.f11095a = path;
                fVar.f11097c = i7;
                if (iVar.d(context, listB, fVar) == aVar) {
                    return aVar;
                }
                str = path;
            }
            Y10 = th;
            i7 = 1;
            if (Y10 == 0) {
                F6.d.h("WebResPreloadMgr", 5, "[MANIFEST] path preload skipped (no manifest): ".concat(path));
                return Unit.f38893a;
            }
            listB = CollectionsKt.B((Iterable) Y10);
            F6.d.h("WebResPreloadMgr", 3, com.airbnb.lottie.model.layer.d.j("[DOWNLOAD] path total ", listB.size(), " unique resources for: ", path));
            fVar.f11095a = path;
            fVar.f11097c = i7;
            if (iVar.d(context, listB, fVar) == aVar) {
                return aVar;
            }
            str = path;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = fVar.f11095a;
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        F6.d.h("WebResPreloadMgr", 3, q0.k("========== preload path done: ", str, " =========="));
        return Unit.f38893a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(Context context, String baseUrl, Ff.c cVar) {
        g gVar;
        i iVar = f11106a;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i7 = gVar.f11100c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                gVar.f11100c = i7 - Integer.MIN_VALUE;
            } else {
                gVar = new g(cVar);
            }
        } else {
            gVar = new g(cVar);
        }
        Object obj = gVar.f11099b;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = gVar.f11100c;
        if (i10 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            F6.d.h("WebResPreloadMgr", 3, "========== preload page start: " + baseUrl + " ==========");
            String html = e(baseUrl);
            if (html == null) {
                F6.d.c("WebResPreloadMgr", G.o("[FAIL] download html failed: ", baseUrl));
                return Unit.f38893a;
            }
            F6.d.h("WebResPreloadMgr", 3, "[HTML] downloaded: " + baseUrl + " (" + html.length() + " chars)");
            Pattern pattern = a.f11061a;
            Intrinsics.checkNotNullParameter(html, "html");
            Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Pattern pattern2 = a.f11061a;
            ArrayList arrayList = new ArrayList();
            Matcher matcher = pattern2.matcher(html);
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                if (strGroup != null) {
                    arrayList.add(strGroup);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                Pattern pattern3 = a.f11061a;
                if (!zHasNext) {
                    break;
                }
                String strA = a.a((String) it.next(), baseUrl);
                if (strA != null) {
                    linkedHashSet.add(strA);
                }
            }
            Pattern pattern4 = a.f11062b;
            ArrayList arrayList2 = new ArrayList();
            Matcher matcher2 = pattern4.matcher(html);
            while (matcher2.find()) {
                String strGroup2 = matcher2.group(1);
                if (strGroup2 != null) {
                    arrayList2.add(strGroup2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String strA2 = a.a((String) it2.next(), baseUrl);
                if (strA2 != null) {
                    linkedHashSet.add(strA2);
                }
            }
            List listY = CollectionsKt.Y(linkedHashSet);
            F6.d.h("WebResPreloadMgr", 3, F.c(listY.size(), "[PARSE] found ", " resources from html:"));
            List list = listY;
            int i11 = 0;
            for (Object obj2 : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C1850q.k();
                    throw null;
                }
                F6.d.h("WebResPreloadMgr", 3, com.airbnb.lottie.model.layer.d.j("  [", i11, "] ", (String) obj2));
                i11 = i12;
            }
            List listB = CollectionsKt.B(list);
            F6.d.h("WebResPreloadMgr", 3, com.airbnb.lottie.model.layer.d.j("[DOWNLOAD] page total ", listB.size(), " unique resources for: ", baseUrl));
            gVar.f11098a = baseUrl;
            gVar.f11100c = 1;
            if (iVar.d(context, listB, gVar) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            baseUrl = gVar.f11098a;
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        F6.d.h("WebResPreloadMgr", 3, q0.k("========== preload page done: ", baseUrl, " =========="));
        return Unit.f38893a;
    }

    public static String e(String str) {
        String strString;
        try {
            X x3 = new X();
            x3.k(str);
            e0 e0VarExecute = FirebasePerfOkHttpClient.execute(BaseApplication.get().getHttpClient().newCall(x3.b()));
            try {
                if (e0VarExecute.isSuccessful()) {
                    h0 h0Var = e0VarExecute.f40734g;
                    if (h0Var != null) {
                        strString = h0Var.string();
                    }
                    e0VarExecute.close();
                    return strString;
                }
                F6.d.h("WebResPreloadMgr", 5, "[HTTP " + e0VarExecute.f40731d + "] download text failed: " + str);
                strString = null;
                e0VarExecute.close();
                return strString;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    org.chromium.support_lib_boundary.util.b.o(e0VarExecute, th);
                    throw th2;
                }
            }
        } catch (Exception e10) {
            F6.d.c("WebResPreloadMgr", G.o("[ERROR] download text exception: ", str), e10);
            return null;
        }
    }

    public static void f(Context context, String str, byte[] array) throws IOException {
        File filesDir = context.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
        File fileC = p118hf.a.C(filesDir, str);
        if (fileC == null) {
            F6.d.h("WebResPreloadMgr", 5, G.o("[SAVE] cannot resolve local file path for: ", str));
            return;
        }
        File parentFile = fileC.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        Intrinsics.checkNotNullParameter(fileC, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(fileC);
        try {
            fileOutputStream.write(array);
            Unit unit = Unit.f38893a;
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                org.chromium.support_lib_boundary.util.b.o(fileOutputStream, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(Context context, List list, Ff.c cVar) {
        b bVar;
        List list2;
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        AtomicInteger atomicInteger3;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i7 = bVar.f11069g;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar.f11069g = i7 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object obj = bVar.f11067e;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = bVar.f11069g;
        if (i10 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            AtomicInteger atomicInteger4 = new AtomicInteger(0);
            AtomicInteger atomicInteger5 = new AtomicInteger(0);
            AtomicInteger atomicInteger6 = new AtomicInteger(0);
            int i11 = k.f36316a;
            d dVar = new d(list, new j(8), context, atomicInteger5, atomicInteger4, atomicInteger6, null);
            bVar.f11063a = list;
            bVar.f11064b = atomicInteger4;
            bVar.f11065c = atomicInteger5;
            bVar.f11066d = atomicInteger6;
            bVar.f11069g = 1;
            if (AbstractC0777v.d(dVar, bVar) == aVar) {
                return aVar;
            }
            list2 = list;
            atomicInteger = atomicInteger5;
            atomicInteger2 = atomicInteger4;
            atomicInteger3 = atomicInteger6;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atomicInteger3 = bVar.f11066d;
            atomicInteger = bVar.f11065c;
            atomicInteger2 = bVar.f11064b;
            list2 = bVar.f11063a;
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        int i12 = atomicInteger2.get();
        int i13 = atomicInteger.get();
        int i14 = atomicInteger3.get();
        int size = list2.size();
        StringBuilder sbP = q0.p(i12, "[DOWNLOAD] result: success=", i13, "  skip=", "  fail=");
        sbP.append(i14);
        sbP.append("  total=");
        sbP.append(size);
        F6.d.h("WebResPreloadMgr", 3, sbP.toString());
        return Unit.f38893a;
    }
}
