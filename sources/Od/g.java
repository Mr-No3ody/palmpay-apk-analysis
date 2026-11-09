package Od;

import Pa.C0525w;
import android.content.Context;
import android.text.TextUtils;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import com.transsnet.palmpay.bean.CoinRainConfig;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.FileIOUtils;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class g {
    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final boolean checkPath(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file2 = new File(file, str);
        return file2.exists() && file2.length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getParentDir(Context context) {
        return new File(context.getExternalCacheDir(), "/coinrain/");
    }

    @NotNull
    public final File getUnZipDir(@NotNull String zipName) {
        Intrinsics.checkNotNullParameter(zipName, "zipName");
        Context context = BaseApplication.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new File(getParentDir(context), zipName);
    }

    public final boolean isCompleteDownload(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            Intrinsics.e(str);
            File unZipDir = getUnZipDir(str);
            if (unZipDir.exists()) {
                File file = new File(unZipDir, OfflineConstant.CONFIG_FILE_NAME);
                C0525w c0525wF = C0525w.f();
                String file2String = FileIOUtils.readFile2String(file);
                c0525wF.getClass();
                CoinRainConfig coinRainConfig = (CoinRainConfig) C0525w.d(file2String, CoinRainConfig.class);
                if (coinRainConfig != null && checkPath(unZipDir, coinRainConfig.header) && checkPath(unZipDir, coinRainConfig.preview) && checkPath(unZipDir, coinRainConfig.background) && checkPath(unZipDir, coinRainConfig.topBgUrl)) {
                    List<String> list = coinRainConfig.icons;
                    if (list == null) {
                        return true;
                    }
                    if (list.isEmpty()) {
                        list = null;
                    }
                    if (list == null) {
                        return true;
                    }
                    int size = list.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        if (h.f6817c.checkPath(unZipDir, list.get(i7))) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private g() {
    }
}
