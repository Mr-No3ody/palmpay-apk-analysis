package com.appsflyer.internal;

import Kf.o;
import android.content.Context;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C1847n;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.collections.r;
import kotlin.collections.v;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@WorkerThread
@SourceDebugExtension({"SMAP\nExceptionManageCacheImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionManageCacheImpl.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ExceptionManageCacheImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n11653#2,9:131\n13579#2:140\n11653#2,9:141\n13579#2:150\n13580#2:152\n11662#2:153\n13580#2:155\n11662#2:156\n4117#2:158\n4217#2,2:159\n4117#2:165\n4217#2,2:166\n1#3:151\n1#3:154\n1#3:157\n1549#4:161\n1620#4,3:162\n1549#4:168\n1620#4,3:169\n*S KotlinDebug\n*F\n+ 1 ExceptionManageCacheImpl.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ExceptionManageCacheImpl\n*L\n69#1:131,9\n69#1:140\n71#1:141,9\n71#1:150\n71#1:152\n71#1:153\n69#1:155\n69#1:156\n101#1:158\n101#1:159,2\n119#1:165\n119#1:166,2\n71#1:151\n69#1:154\n101#1:161\n101#1:162,3\n120#1:168\n120#1:169,3\n*E\n"})
public final class AFd1xSDK implements AFc1cSDK {

    @NotNull
    private final AFc1eSDK getMediationNetwork;

    public AFd1xSDK(@NotNull AFc1eSDK aFc1eSDK) {
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        this.getMediationNetwork = aFc1eSDK;
    }

    private final File getRevenue() {
        Context context = this.getMediationNetwork.getRevenue;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final boolean AFAdRevenueData() {
        return getMediationNetwork(new String[0]);
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    @NotNull
    public final List<AFc1bSDK> getMediationNetwork() {
        List<AFc1bSDK> arrayList;
        File[] fileArrListFiles;
        ArrayList arrayList2;
        synchronized (this) {
            try {
                File revenue = getRevenue();
                arrayList = null;
                if (revenue != null && (fileArrListFiles = revenue.listFiles()) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (File file : fileArrListFiles) {
                        try {
                            File[] fileArrListFiles2 = file.listFiles();
                            if (fileArrListFiles2 != null) {
                                Intrinsics.checkNotNullExpressionValue(fileArrListFiles2, "");
                                arrayList2 = new ArrayList();
                                for (File file2 : fileArrListFiles2) {
                                    AFc1bSDK.Companion companion = AFc1bSDK.INSTANCE;
                                    Intrinsics.checkNotNullExpressionValue(file2, "");
                                    AFc1bSDK aFc1bSDKAFAdRevenueData = AFc1bSDK.Companion.AFAdRevenueData(Kf.m.b(file2));
                                    if (aFc1bSDKAFAdRevenueData != null) {
                                        arrayList2.add(aFc1bSDKAFAdRevenueData);
                                    }
                                }
                            } else {
                                arrayList2 = null;
                            }
                        } catch (Throwable th) {
                            AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not get stored exceptions\n " + th.getMessage(), false, 4, null);
                        }
                        if (arrayList2 != null) {
                            arrayList3.add(arrayList2);
                        }
                    }
                    Intrinsics.checkNotNullParameter(arrayList3, "<this>");
                    arrayList = new ArrayList<>();
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        v.n(arrayList, (Iterable) it.next());
                    }
                }
                if (arrayList == null) {
                    arrayList = z.f38935a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final int getMonetizationNetwork() {
        Iterator<T> it = getMediationNetwork().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((AFc1bSDK) it.next()).getCurrencyIso4217Code;
        }
        return i7;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final void AFAdRevenueData(int i7, int i10) {
        File[] fileArrListFiles;
        synchronized (this) {
            try {
                File revenue = getRevenue();
                if (revenue != null && (fileArrListFiles = revenue.listFiles()) != null) {
                    Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                    ArrayList<File> arrayList = new ArrayList();
                    for (File file : fileArrListFiles) {
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        int mediationNetwork = AFk1xSDK.getMediationNetwork(name);
                        if (i7 > mediationNetwork || mediationNetwork > i10) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(r.l(arrayList, 10));
                    for (File file2 : arrayList) {
                        Intrinsics.checkNotNullExpressionValue(file2, "");
                        arrayList2.add(Boolean.valueOf(o.e(file2)));
                    }
                }
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    @Nullable
    public final String getRevenue(@NotNull Throwable th, @NotNull String str) {
        String str2;
        File file;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            File revenue = getRevenue();
            str2 = null;
            if (revenue != null) {
                file = new File(revenue, "6.18.1");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    AFc1bSDK mediationNetwork = AFd1pSDK.getMediationNetwork(th, str);
                    String str3 = mediationNetwork.getMonetizationNetwork;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        AFc1bSDK.Companion companion = AFc1bSDK.INSTANCE;
                        AFc1bSDK aFc1bSDKAFAdRevenueData = AFc1bSDK.Companion.AFAdRevenueData(Kf.m.b(file2));
                        if (aFc1bSDKAFAdRevenueData != null) {
                            aFc1bSDKAFAdRevenueData.getCurrencyIso4217Code++;
                            mediationNetwork = aFc1bSDKAFAdRevenueData;
                        }
                    }
                    Kf.m.c(file2, mediationNetwork.getRevenue());
                    str2 = str3;
                } catch (Exception e10) {
                    AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e10.getMessage(), false, 4, null);
                }
            }
        }
        return str2;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final boolean getMediationNetwork(@NotNull String... strArr) {
        boolean zE;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            try {
                File revenue = getRevenue();
                zE = true;
                if (revenue != null) {
                    if (strArr.length == 0) {
                        AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        zE = o.e(revenue);
                    } else {
                        AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions except for: " + C1847n.u(62, strArr), false, 4, null);
                        File[] fileArrListFiles = revenue.listFiles();
                        if (fileArrListFiles != null) {
                            Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                            ArrayList<File> arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                if (!C1847n.p(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(r.l(arrayList, 10));
                            for (File file2 : arrayList) {
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                arrayList2.add(Boolean.valueOf(o.e(file2)));
                            }
                            Set setB0 = CollectionsKt.b0(arrayList2);
                            if (setB0.isEmpty()) {
                                setB0 = N.b(Boolean.TRUE);
                            }
                            if (setB0.size() != 1 || !((Boolean) CollectionsKt.E(setB0)).booleanValue()) {
                                zE = false;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zE;
    }
}
