package com.alibaba.android.arouter.utils;

import C0.G;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.appcompat.view.menu.e;
import com.alibaba.android.arouter.launcher.ARouter;
import com.alibaba.android.arouter.thread.DefaultPoolExecutor;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class ClassUtils {
    private static final String EXTRACTED_NAME_EXT = ".classes";
    private static final String EXTRACTED_SUFFIX = ".zip";
    private static final String KEY_DEX_NUMBER = "dex.number";
    private static final String PREFS_FILE = "multidex.version";
    private static final String SECONDARY_FOLDER_NAME = G.r(new StringBuilder("code_cache"), File.separator, "secondary-dexes");
    private static final int VM_WITH_MULTIDEX_VERSION_MAJOR = 2;
    private static final int VM_WITH_MULTIDEX_VERSION_MINOR = 1;

    public static Set<String> getFileNameByPackageName(Context context, String str) throws InterruptedException, PackageManager.NameNotFoundException, IOException {
        HashSet hashSet = new HashSet();
        List<String> sourcePaths = getSourcePaths(context);
        CountDownLatch countDownLatch = new CountDownLatch(sourcePaths.size());
        Iterator<String> it = sourcePaths.iterator();
        while (it.hasNext()) {
            DefaultPoolExecutor.getInstance().execute(new e(it.next(), str, hashSet, countDownLatch, 4, false));
        }
        countDownLatch.await();
        hashSet.size();
        return hashSet;
    }

    private static SharedPreferences getMultiDexPreferences(Context context) {
        return context.getSharedPreferences(PREFS_FILE, 4);
    }

    public static List<String> getSourcePaths(Context context) throws PackageManager.NameNotFoundException, IOException {
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
        File file = new File(applicationInfo.sourceDir);
        ArrayList arrayList = new ArrayList();
        arrayList.add(applicationInfo.sourceDir);
        String str = file.getName() + EXTRACTED_NAME_EXT;
        if (!isVMMultidexCapable()) {
            int i7 = getMultiDexPreferences(context).getInt(KEY_DEX_NUMBER, 1);
            File file2 = new File(applicationInfo.dataDir, SECONDARY_FOLDER_NAME);
            for (int i10 = 2; i10 <= i7; i10++) {
                File file3 = new File(file2, str + i10 + ".zip");
                if (!file3.isFile()) {
                    throw new IOException("Missing extracted secondary dex file '" + file3.getPath() + "'");
                }
                arrayList.add(file3.getAbsolutePath());
            }
        }
        if (ARouter.debuggable()) {
            arrayList.addAll(tryLoadInstantRunDexFile(applicationInfo));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    private static boolean isVMMultidexCapable() {
        boolean z3 = false;
        try {
            if (!isYunOS()) {
                String property = System.getProperty("java.vm.version");
                if (property != null) {
                    Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(property);
                    if (matcher.matches()) {
                        int i7 = Integer.parseInt(matcher.group(1));
                        int i10 = Integer.parseInt(matcher.group(2));
                        if (i7 > 2 || (i7 == 2 && i10 >= 1)) {
                            z3 = true;
                        }
                    }
                }
            } else if (Integer.valueOf(System.getProperty("ro.build.version.sdk")).intValue() >= 21) {
                z3 = true;
            }
        } catch (NumberFormatException | Exception unused) {
        }
        return z3;
    }

    private static boolean isYunOS() {
        try {
            String property = System.getProperty("ro.yunos.version");
            String property2 = System.getProperty("java.vm.name");
            return (property2 != null && property2.toLowerCase().contains("lemur")) || (property != null && property.trim().length() > 0);
        } catch (Exception unused) {
            return false;
        }
    }

    private static List<String> tryLoadInstantRunDexFile(ApplicationInfo applicationInfo) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            arrayList.addAll(Arrays.asList(strArr));
            return arrayList;
        }
        try {
            File file = new File((String) Class.forName("com.android.tools.fd.runtime.Paths").getMethod("getDexFileDirectory", String.class).invoke(null, applicationInfo.packageName));
            if (file.exists() && file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    if (file2 != null && file2.exists() && file2.isFile() && file2.getName().endsWith(".dex")) {
                        arrayList.add(file2.getAbsolutePath());
                    }
                }
                return arrayList;
            }
        } catch (Exception e10) {
            Log.e("ARouter::", "InstantRun support error, " + e10.getMessage());
        }
        return arrayList;
    }
}
