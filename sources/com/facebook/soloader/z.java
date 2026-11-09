package com.facebook.soloader;

import C0.G;
import android.content.Context;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class z extends x {
    @Override // com.facebook.soloader.x
    public final String a(String str) {
        String classLoaderLdLoadLibrary = y.getClassLoaderLdLoadLibrary();
        if (TextUtils.isEmpty(classLoaderLdLoadLibrary)) {
            return null;
        }
        for (String str2 : classLoaderLdLoadLibrary.split(":")) {
            Context context = SoLoader.f21856d;
            if (context != null && (context.getApplicationInfo().flags & 268435456) == 0 && str2.contains(".apk!")) {
                return G.r(androidx.camera.video.u.s(str2), File.separator, str);
            }
            File file = new File(str2, str);
            if (file.exists()) {
                return file.getCanonicalPath();
            }
        }
        return null;
    }

    @Override // com.facebook.soloader.x
    public final String b() {
        return "SystemLoadWrapperSoSource";
    }

    @Override // com.facebook.soloader.x
    public final int c(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        try {
            System.loadLibrary(str.substring(3, str.length() - 3));
            return 1;
        } catch (Exception e10) {
            Log.e("SoLoader", "Error loading library: " + str, e10);
            return 0;
        }
    }

    @Override // com.facebook.soloader.x
    public final String toString() {
        return "SystemLoadWrapperSoSource[" + y.getClassLoaderLdLoadLibrary() + "]";
    }
}
