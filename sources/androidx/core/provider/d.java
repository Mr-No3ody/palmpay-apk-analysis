package androidx.core.provider;

import E.AbstractC0198c;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import androidx.camera.core.impl.C0998p0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M.l f16108a = new M.l(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0998p0 f16109b = new C0998p0(1);

    public static C4.a a(Context context, List list) {
        Trace.beginSection(AbstractC0198c.m0("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < list.size(); i7++) {
                e eVar = (e) list.get(i7);
                ProviderInfo providerInfoB = b(context.getPackageManager(), eVar, context.getResources());
                if (providerInfoB == null) {
                    return new C4.a(7);
                }
                arrayList.add(c(context, eVar, providerInfoB.authority));
            }
            return new C4.a(arrayList, 7);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, e eVar, Resources resources) {
        Trace.beginSection(AbstractC0198c.m0("FontProvider.getProvider"));
        try {
            List listJ = eVar.f16113d;
            String str = eVar.f16110a;
            String str2 = eVar.f16111b;
            if (listJ == null) {
                listJ = Y.a.j(resources, 0);
            }
            c cVar = new c();
            cVar.f16105a = str;
            cVar.f16106b = str2;
            cVar.f16107c = listJ;
            M.l lVar = f16108a;
            ProviderInfo providerInfo = (ProviderInfo) lVar.get(cVar);
            if (providerInfo != null) {
                Trace.endSection();
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            C0998p0 c0998p0 = f16109b;
            Collections.sort(arrayList, c0998p0);
            for (int i7 = 0; i7 < listJ.size(); i7++) {
                ArrayList arrayList2 = new ArrayList((Collection) listJ.get(i7));
                Collections.sort(arrayList2, c0998p0);
                if (arrayList.size() == arrayList2.size()) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            lVar.put(cVar, providerInfoResolveContentProvider);
                            Trace.endSection();
                            return providerInfoResolveContentProvider;
                        }
                        if (!Arrays.equals((byte[]) arrayList.get(i10), (byte[]) arrayList2.get(i10))) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            Trace.endSection();
            return null;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [androidx.core.provider.FontProvider$ContentQueryWrapper] */
    /* JADX WARN: Type inference failed for: r18v7 */
    public static j[] c(Context context, e eVar, String str) {
        ?? r18;
        FontProvider$ContentQueryWrapper fontProvider$ContentQueryWrapper;
        Trace.beginSection(AbstractC0198c.m0("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(str).appendPath("file").build();
            FontProvider$ContentQueryWrapper fontProvider$ContentQueryWrapperMake = FontProvider$ContentQueryWrapper.make(context, uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(AbstractC0198c.m0("ContentQueryWrapper.query"));
                try {
                    try {
                        cursorQuery = fontProvider$ContentQueryWrapperMake.query(uriBuild, strArr, "query = ?", new String[]{eVar.f16112c}, null, null);
                        Trace.endSection();
                        if (cursorQuery == null || cursorQuery.getCount() <= 0) {
                            fontProvider$ContentQueryWrapper = fontProvider$ContentQueryWrapperMake;
                        } else {
                            int columnIndex = cursorQuery.getColumnIndex("result_code");
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursorQuery.getColumnIndex("_id");
                            int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                            int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                            int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                            while (cursorQuery.moveToNext()) {
                                int i7 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                                arrayList2.add(new j(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i7));
                                fontProvider$ContentQueryWrapperMake = fontProvider$ContentQueryWrapperMake;
                            }
                            fontProvider$ContentQueryWrapper = fontProvider$ContentQueryWrapperMake;
                            arrayList = arrayList2;
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        fontProvider$ContentQueryWrapper.close();
                        return (j[]) arrayList.toArray(new j[0]);
                    } finally {
                        Trace.endSection();
                    }
                } catch (Throwable th) {
                    th = th;
                    r18 = context;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    r18.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r18 = fontProvider$ContentQueryWrapperMake;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
