package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
@DoNotOptimize
@TargetApi(21)
final class SysUtil$LollipopSysdeps {
    private SysUtil$LollipopSysdeps() {
    }

    @DoNotOptimize
    public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j6) throws IOException {
        int i7;
        try {
            Os.posix_fallocate(fileDescriptor, 0L, j6);
        } catch (ErrnoException e10) {
            if (e10.errno != OsConstants.EOPNOTSUPP && (i7 = e10.errno) != OsConstants.ENOSYS && i7 != OsConstants.EINVAL) {
                throw new IOException(e10.toString(), e10);
            }
        }
    }

    @DoNotOptimize
    public static String[] getSupportedAbis() {
        String[] strArr = Build.SUPPORTED_ABIS;
        TreeSet treeSet = new TreeSet();
        try {
            if (is64Bit()) {
                treeSet.add("arm64-v8a");
                treeSet.add("x86_64");
            } else {
                treeSet.add("armeabi-v7a");
                treeSet.add("x86");
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (treeSet.contains(str)) {
                    arrayList.add(str);
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        } catch (ErrnoException e10) {
            Log.e("SysUtil", String.format("Could not read /proc/self/exe. Falling back to default ABI list: %s. errno: %d Err msg: %s", Arrays.toString(strArr), Integer.valueOf(e10.errno), e10.getMessage()));
            return Build.SUPPORTED_ABIS;
        }
    }

    @DoNotOptimize
    public static boolean is64Bit() throws ErrnoException {
        return Os.readlink("/proc/self/exe").contains("64");
    }
}
