package com.appsflyer.internal;

import Kf.o;
import N8.q0;
import android.content.Context;
import android.util.Base64;
import androidx.annotation.WorkerThread;
import androidx.camera.camera2.internal.F;
import com.appsflyer.AFLogger;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C1846m;
import kotlin.collections.C1849p;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.collections.v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFileCacheManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileCacheManager.kt\ncom/appsflyer/internal/cache/FileCacheManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,335:1\n1855#2,2:336\n1855#2,2:339\n1855#2:341\n1856#2:344\n1855#2,2:346\n1855#2:348\n1856#2:351\n6442#3:338\n13579#3,2:349\n18#4:342\n26#5:343\n1#6:345\n*S KotlinDebug\n*F\n+ 1 FileCacheManager.kt\ncom/appsflyer/internal/cache/FileCacheManager\n*L\n106#1:336,2\n189#1:339,2\n207#1:341\n207#1:344\n263#1:346,2\n296#1:348\n296#1:351\n187#1:338\n299#1:349,2\n213#1:342\n213#1:343\n*E\n"})
public final class AFc1rSDK implements AFc1uSDK {

    @NotNull
    private final AFc1eSDK AFAdRevenueData;

    @NotNull
    private final AFc1sSDK getCurrencyIso4217Code;

    @NotNull
    private final AFc1qSDK getMediationNetwork;

    @NotNull
    private final Map<String, Integer> getRevenue;

    public AFc1rSDK(@NotNull AFc1eSDK aFc1eSDK, @NotNull AFc1qSDK aFc1qSDK) {
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        this.AFAdRevenueData = aFc1eSDK;
        this.getMediationNetwork = aFc1qSDK;
        this.getCurrencyIso4217Code = new AFc1sSDK(C1850q.h(new AFc1tSDK("ConversionsCache", C1849p.c(AFe1nSDK.CONVERSION), 1), new AFc1tSDK("AttrCache", C1849p.c(AFe1nSDK.ATTR), 1), new AFc1tSDK("OtherCache", C1850q.h(AFe1nSDK.LAUNCH, AFe1nSDK.INAPP, AFe1nSDK.ADREVENUE, AFe1nSDK.ARS_VALIDATE, AFe1nSDK.PURCHASE_VALIDATE, AFe1nSDK.MANUAL_PURCHASE_VALIDATION, AFe1nSDK.SDK_SERVICES), 40)));
        this.getRevenue = G.h(new Pair("ConversionsCache", 0), new Pair("AttrCache", 0), new Pair("OtherCache", 0));
    }

    private static AFc1vSDK AFAdRevenueData(File file) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                char[] cArr = new char[(int) file.length()];
                inputStreamReader.read(cArr);
                AFc1vSDK aFc1vSDK = new AFc1vSDK(cArr);
                aFc1vSDK.AFAdRevenueData = file.getName();
                inputStreamReader.close();
                return aFc1vSDK;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    org.chromium.support_lib_boundary.util.b.o(inputStreamReader, th);
                    throw th2;
                }
            }
        } catch (Exception e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Error while loading request from cache", e10, false, false, true, false);
            return null;
        }
    }

    private final boolean getMonetizationNetwork(File file) {
        try {
            file.delete();
            getRevenue();
            return true;
        } catch (Exception e10) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, q0.k("Could not delete ", file.getName(), " from cache"), e10, false, false, false, false, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, null);
            return false;
        }
    }

    private final void getRevenue() {
        for (AFc1tSDK aFc1tSDK : this.getCurrencyIso4217Code.getRevenue) {
            String str = aFc1tSDK.getRevenue;
            Context context = this.AFAdRevenueData.getRevenue;
            Intrinsics.e(context);
            File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
            if (file.exists()) {
                Map<String, Integer> map = this.getRevenue;
                String str2 = aFc1tSDK.getRevenue;
                File[] fileArrListFiles = file.listFiles();
                map.put(str2, Integer.valueOf(fileArrListFiles != null ? fileArrListFiles.length : 0));
            } else {
                file.mkdirs();
                this.getRevenue.put(aFc1tSDK.getRevenue, 0);
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    @WorkerThread
    @NotNull
    public final List<AFc1vSDK> getCurrencyIso4217Code() {
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Get Cached Requests", false, 4, null);
        ArrayList arrayList = new ArrayList();
        ArrayList<File> arrayList2 = new ArrayList();
        try {
            Context context = this.AFAdRevenueData.getRevenue;
            Intrinsics.e(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.AFAdRevenueData.getRevenue;
                Intrinsics.e(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            }
            Iterator<T> it = this.getCurrencyIso4217Code.getRevenue.iterator();
            while (it.hasNext()) {
                String str = ((AFc1tSDK) it.next()).getRevenue;
                Context context3 = this.AFAdRevenueData.getRevenue;
                Intrinsics.e(context3);
                File file = new File(new File(context3.getFilesDir(), "AFRequestCache"), str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                v.p(arrayList2, fileArrListFiles);
            }
            for (File file2 : arrayList2) {
                AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Found cached request: " + file2.getName(), false, 4, null);
                AFc1vSDK aFc1vSDKAFAdRevenueData = AFAdRevenueData(file2);
                if (aFc1vSDKAFAdRevenueData != null) {
                    arrayList.add(aFc1vSDKAFAdRevenueData);
                }
            }
        } catch (Exception e10) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not get cached requests", e10, false, false, false, false, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, null);
        }
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, F.c(arrayList.size(), "Found ", " Cached Requests"), false, 4, null);
        return arrayList;
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    @WorkerThread
    public final void getMediationNetwork() {
        try {
            if (this.getMediationNetwork.getMonetizationNetwork("AF_CACHE_VERSION", -1) == 2) {
                Context context = this.AFAdRevenueData.getRevenue;
                Intrinsics.e(context);
                if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                    Context context2 = this.AFAdRevenueData.getRevenue;
                    Intrinsics.e(context2);
                    new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                }
            } else {
                this.getMediationNetwork.getCurrencyIso4217Code("AF_CACHE_VERSION", 2);
                Context context3 = this.AFAdRevenueData.getRevenue;
                Intrinsics.e(context3);
                if (new File(context3.getFilesDir(), "AFRequestCache").exists()) {
                    Context context4 = this.AFAdRevenueData.getRevenue;
                    Intrinsics.e(context4);
                    o.e(new File(context4.getFilesDir(), "AFRequestCache"));
                    Context context5 = this.AFAdRevenueData.getRevenue;
                    Intrinsics.e(context5);
                    new File(context5.getFilesDir(), "AFRequestCache").mkdir();
                }
            }
            getRevenue();
        } catch (Exception e10) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not init cache", e10, false, false, false, false, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, null);
        }
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    @WorkerThread
    public final void AFAdRevenueData() {
        try {
            Context context = this.AFAdRevenueData.getRevenue;
            Intrinsics.e(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.AFAdRevenueData.getRevenue;
                Intrinsics.e(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                return;
            }
            Iterator<T> it = this.getCurrencyIso4217Code.getRevenue.iterator();
            while (it.hasNext()) {
                String str = ((AFc1tSDK) it.next()).getRevenue;
                Context context3 = this.AFAdRevenueData.getRevenue;
                Intrinsics.e(context3);
                File[] fileArrListFiles = new File(new File(context3.getFilesDir(), "AFRequestCache"), str).listFiles();
                if (fileArrListFiles != null) {
                    Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                    for (File file : fileArrListFiles) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
                        AFg1gSDK.i$default(aFLogger, aFg1cSDK, "ClearCache : Found cached request " + file.getName(), false, 4, null);
                        AFg1gSDK.i$default(aFLogger, aFg1cSDK, "Deleting " + file.getName() + " from cache", false, 4, null);
                        file.delete();
                    }
                }
            }
            Context context4 = this.AFAdRevenueData.getRevenue;
            Intrinsics.e(context4);
            o.e(new File(context4.getFilesDir(), "AFRequestCache"));
            getRevenue();
        } catch (Exception e10) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not clearCache request", e10, false, false, false, false, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, null);
        }
    }

    private final String getRevenue(AFe1nSDK aFe1nSDK) {
        String str;
        AFc1tSDK mediationNetwork = getMediationNetwork(aFe1nSDK);
        if (mediationNetwork == null || (str = mediationNetwork.getRevenue) == null) {
            throw new UnsupportedOperationException("Cache do not support this type of events");
        }
        return str;
    }

    private final AFc1tSDK getMediationNetwork(AFe1nSDK aFe1nSDK) {
        Object next;
        Iterator<T> it = this.getCurrencyIso4217Code.getRevenue.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((AFc1tSDK) next).getCurrencyIso4217Code.contains(aFe1nSDK)) {
                return (AFc1tSDK) next;
            }
        }
        next = null;
        return (AFc1tSDK) next;
    }

    @Override // com.appsflyer.internal.AFc1uSDK
    @WorkerThread
    public final boolean getMediationNetwork(@Nullable String str) {
        if (str == null) {
            return false;
        }
        Context context = this.AFAdRevenueData.getRevenue;
        Intrinsics.e(context);
        if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
            Context context2 = this.AFAdRevenueData.getRevenue;
            Intrinsics.e(context2);
            new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            return true;
        }
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, q0.k("Deleting ", str, " from cache"), false, 4, null);
        Iterator<T> it = this.getCurrencyIso4217Code.getRevenue.iterator();
        while (it.hasNext()) {
            String str2 = ((AFc1tSDK) it.next()).getRevenue;
            Context context3 = this.AFAdRevenueData.getRevenue;
            Intrinsics.e(context3);
            File file = new File(new File(new File(context3.getFilesDir(), "AFRequestCache"), str2), str);
            if (file.exists()) {
                return getMonetizationNetwork(file);
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x022c  */
    @Override // com.appsflyer.internal.AFc1uSDK
    @WorkerThread
    @Nullable
    public final String getCurrencyIso4217Code(@NotNull AFc1vSDK aFc1vSDK) {
        String str;
        Exception exc;
        File file;
        String str2;
        List<File> listU;
        Intrinsics.checkNotNullParameter(aFc1vSDK, "");
        try {
            AFe1nSDK aFe1nSDK = aFc1vSDK.getCurrencyIso4217Code;
            Intrinsics.checkNotNullExpressionValue(aFe1nSDK, "");
            Context context = this.AFAdRevenueData.getRevenue;
            Intrinsics.e(context);
            File file2 = new File(new File(context.getFilesDir(), "AFRequestCache"), getRevenue(aFe1nSDK));
            if (!file2.exists()) {
                try {
                    file2.mkdirs();
                } catch (Exception e10) {
                    exc = e10;
                    file = null;
                    str = null;
                    if (file != null) {
                        file.delete();
                    }
                    AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not cache request", exc, false, false, false, false, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, null);
                    return str;
                }
            }
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
            AFg1gSDK.i$default(aFLogger, aFg1cSDK, "Caching request with URL: " + aFc1vSDK.getRevenue, false, 4, null);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            file = new File(file2, strValueOf);
            try {
                try {
                    file.createNewFile();
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file.getPath(), true), Charset.defaultCharset());
                    try {
                        outputStreamWriter.write("version=");
                        outputStreamWriter.write(aFc1vSDK.getMonetizationNetwork);
                        outputStreamWriter.write(10);
                        outputStreamWriter.write("url=");
                        outputStreamWriter.write(aFc1vSDK.getRevenue);
                        outputStreamWriter.write(10);
                        outputStreamWriter.write("data=");
                        outputStreamWriter.write(Base64.encodeToString(aFc1vSDK.getMediationNetwork(), 2));
                        outputStreamWriter.write(10);
                        AFe1nSDK aFe1nSDK2 = aFc1vSDK.getCurrencyIso4217Code;
                        str = null;
                        try {
                            outputStreamWriter.write("type=");
                            outputStreamWriter.write(aFe1nSDK2.name());
                            outputStreamWriter.write(10);
                            Map<String, String> map = aFc1vSDK.getMediationNetwork;
                            if (map != null && !map.isEmpty()) {
                                outputStreamWriter.write("headers=");
                                Map<String, String> map2 = aFc1vSDK.getMediationNetwork;
                                Intrinsics.f(map2, "");
                                String string = new JSONObject(map2).toString();
                                Intrinsics.checkNotNullExpressionValue(string, "");
                                byte[] bytes = string.getBytes(Charsets.UTF_8);
                                Intrinsics.checkNotNullExpressionValue(bytes, "");
                                outputStreamWriter.write(Base64.encodeToString(bytes, 2));
                                outputStreamWriter.write(10);
                            }
                            outputStreamWriter.flush();
                            Unit unit = Unit.f38893a;
                            outputStreamWriter.close();
                            AFg1gSDK.i$default(aFLogger, aFg1cSDK, "Cache request: done, cacheKey: " + strValueOf, false, 4, null);
                            AFe1nSDK aFe1nSDK3 = aFc1vSDK.getCurrencyIso4217Code;
                            Intrinsics.checkNotNullExpressionValue(aFe1nSDK3, "");
                            AFc1tSDK mediationNetwork = getMediationNetwork(aFe1nSDK3);
                            Integer numValueOf = mediationNetwork != null ? Integer.valueOf(mediationNetwork.getMediationNetwork) : null;
                            if (numValueOf == null) {
                                return strValueOf;
                            }
                            int iIntValue = numValueOf.intValue();
                            Map<String, Integer> map3 = this.getRevenue;
                            AFc1tSDK mediationNetwork2 = getMediationNetwork(aFe1nSDK3);
                            if (mediationNetwork2 != null && (str2 = mediationNetwork2.getRevenue) != null) {
                                Integer num = map3.get(str2);
                                int iIntValue2 = num != null ? num.intValue() : 0;
                                if (iIntValue2 >= iIntValue) {
                                    int i7 = (iIntValue2 + 1) - iIntValue;
                                    AFg1gSDK.i$default(aFLogger, aFg1cSDK, "Cache overflown for type " + aFe1nSDK3 + ", removing " + i7 + " item(s)", false, 4, null);
                                    Context context2 = this.AFAdRevenueData.getRevenue;
                                    Intrinsics.e(context2);
                                    File file3 = new File(new File(context2.getFilesDir(), "AFRequestCache"), getRevenue(aFe1nSDK3));
                                    if (!file3.exists()) {
                                        file3.mkdirs();
                                    }
                                    Object[] objArrListFiles = file3.listFiles();
                                    if (objArrListFiles != null) {
                                        Comparator comparator = new Comparator() { // from class: com.appsflyer.internal.AFc1rSDK.2
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // java.util.Comparator
                                            public final int compare(T t, T t3) {
                                                return Bf.a.a(((File) t).getName(), ((File) t3).getName());
                                            }
                                        };
                                        Intrinsics.checkNotNullParameter(objArrListFiles, "<this>");
                                        Intrinsics.checkNotNullParameter(comparator, "comparator");
                                        Intrinsics.checkNotNullParameter(objArrListFiles, "<this>");
                                        Intrinsics.checkNotNullParameter(comparator, "comparator");
                                        if (objArrListFiles.length != 0) {
                                            objArrListFiles = Arrays.copyOf(objArrListFiles, objArrListFiles.length);
                                            Intrinsics.checkNotNullExpressionValue(objArrListFiles, "copyOf(...)");
                                            C1846m.k(comparator, objArrListFiles);
                                        }
                                        List listC = C1846m.c(objArrListFiles);
                                        if (listC != null && (listU = CollectionsKt.U(listC, i7)) != null) {
                                            for (File file4 : listU) {
                                                file4.delete();
                                                AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Cache entry " + file4.getName() + " removed", false, 4, null);
                                            }
                                        }
                                    }
                                }
                                getRevenue();
                                return strValueOf;
                            }
                            throw new UnsupportedOperationException("Cache do not support this type of events");
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                org.chromium.support_lib_boundary.util.b.o(outputStreamWriter, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        str = null;
                    }
                } catch (Exception e11) {
                    e = e11;
                    str = null;
                    exc = e;
                    if (file != null) {
                        file.delete();
                    }
                    AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not cache request", exc, false, false, false, false, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, null);
                    return str;
                }
            } catch (Exception e12) {
                e = e12;
                exc = e;
                if (file != null) {
                    file.delete();
                }
                AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not cache request", exc, false, false, false, false, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, null);
                return str;
            }
        } catch (Exception e13) {
            str = null;
            exc = e13;
            file = null;
        }
    }
}
