package j4;

import C0.G;
import N8.q0;
import android.content.Context;
import android.os.Environment;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import com.tencent.mmkv.MMKV;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.EncryptUtils;
import com.transsnet.palmpay.util.FileUtils;
import java.io.File;
import java.math.BigDecimal;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public /* synthetic */ o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final String buildCacheKey(String str, Object... objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : objArr) {
            if (obj instanceof String) {
                sb2.append((String) obj);
            } else {
                try {
                    sb2.append(obj.getClass().getSimpleName());
                    String json = j.f38294b.get().f38297a.toJson(obj);
                    Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                    sb2.append(json);
                } catch (Exception unused) {
                    sb2.append(obj.toString());
                }
            }
        }
        sb2.append(AppUtils.getAppVersionName());
        return q0.j(str, EncryptUtils.encryptMD5ToString(sb2.toString()));
    }

    public static /* synthetic */ p get$default(o oVar, File file, long j6, int i7, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j6 = p.f38304c;
        }
        if ((i10 & 4) != 0) {
            i7 = p.f38305d;
        }
        return oVar.get(file, j6, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MMKV getPref() {
        if (p.f38307f == null) {
            p.f38307f = MMKV.o("FlexiBankPalmPayCache");
        }
        MMKV mmkv = p.f38307f;
        Intrinsics.e(mmkv);
        return mmkv;
    }

    private final String myPid() {
        return G.m(Process.myPid(), "_");
    }

    @NotNull
    public final String createRootPath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!isSdCardAvailable()) {
            return context.getCacheDir().getAbsolutePath();
        }
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            return externalCacheDir.getAbsolutePath();
        }
        File externalFilesDir = context.getExternalFilesDir("palmpay_cache");
        return externalFilesDir != null ? externalFilesDir.getAbsolutePath() : context.getCacheDir().getAbsolutePath();
    }

    public final boolean deleteDir(@Nullable File file) {
        if (file == null || !file.isDirectory()) {
            return false;
        }
        String[] list = file.list();
        Intrinsics.e(list);
        for (String str : list) {
            if (!deleteDir(new File(file, str))) {
                return false;
            }
        }
        return file.delete();
    }

    @NotNull
    public final p get(@NotNull File cacheDir, long j6, int i7) {
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        HashMap map = p.f38306e;
        p pVar = (p) map.get(cacheDir.getAbsoluteFile() + myPid());
        if (pVar == null) {
            pVar = new p();
            if (FileUtils.createOrExistsDir(cacheDir)) {
                pVar.f38308a = new Pa.G(cacheDir, 1);
            } else if (!cacheDir.isFile()) {
                Log.e("FlexiBankPalmPayCache", "check parent " + FileUtils.createOrExistsDir(cacheDir.getParentFile()) + " can't make dirs in " + cacheDir.getAbsolutePath());
            } else if (FileUtils.createOrExistsDir(new File(q0.j(cacheDir.getAbsolutePath(), "_1")))) {
                pVar.f38308a = new Pa.G(cacheDir, 1);
            }
            map.put(cacheDir.getAbsolutePath() + myPid(), pVar);
        }
        return pVar;
    }

    public final long getFolderSize(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        long folderSize = 0;
        try {
            File[] fileArrListFiles = file.listFiles();
            Intrinsics.e(fileArrListFiles);
            for (File file2 : fileArrListFiles) {
                Intrinsics.e(file2);
                folderSize += file2.isDirectory() ? p.f38303b.getFolderSize(file2) : file2.length();
            }
            return folderSize;
        } catch (Exception e10) {
            Log.e("FlexiBankPalmPayCache", "getFolderSize: ", e10);
            return folderSize;
        }
    }

    @NotNull
    public final String getFormatSize(double d2) {
        double d10 = 1024;
        double d11 = d2 / d10;
        if (d11 < 1.0d) {
            return "0K";
        }
        double d12 = d11 / d10;
        if (d12 < 1.0d) {
            return q0.j(new BigDecimal(String.valueOf(d11)).setScale(2, 4).toPlainString(), "KB");
        }
        double d13 = d12 / d10;
        if (d13 < 1.0d) {
            return q0.j(new BigDecimal(String.valueOf(d12)).setScale(2, 4).toPlainString(), "MB");
        }
        double d14 = d13 / d10;
        return d14 < 1.0d ? q0.j(new BigDecimal(String.valueOf(d13)).setScale(2, 4).toPlainString(), "GB") : q0.j(BigDecimal.valueOf(d14).setScale(2, 4).toPlainString(), "TB");
    }

    public final boolean isSdCardAvailable() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    private o() {
    }

    public static /* synthetic */ p get$default(o oVar, Context context, String str, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
        }
        return oVar.get(context, str);
    }

    @NotNull
    public final p get(@NotNull Context ctx, @NotNull String cacheName) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(cacheName, "cacheName");
        return get(new File(createRootPath(ctx), cacheName), p.f38304c, p.f38305d);
    }

    @NotNull
    public final p get(@NotNull Context ctx, long j6, int i7) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        return get(new File(createRootPath(ctx), Constants.ScionAnalytics.MessageType.DATA_MESSAGE), j6, i7);
    }
}
