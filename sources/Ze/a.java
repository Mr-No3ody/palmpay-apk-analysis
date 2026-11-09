package Ze;

import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends GuardedAsyncTask implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f11699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f11700b;

    public a(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f11699a = reactApplicationContext.getCacheDir();
        this.f11700b = reactApplicationContext.getExternalCacheDir();
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith("ReactNative-snapshot-image");
    }

    @Override // com.facebook.react.bridge.GuardedAsyncTask
    public final void doInBackgroundGuarded(Object[] objArr) {
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        File file = this.f11699a;
        if (file != null && (fileArrListFiles2 = file.listFiles(this)) != null) {
            for (File file2 : fileArrListFiles2) {
                if (file2.delete()) {
                    file2.getAbsolutePath();
                }
            }
        }
        File file3 = this.f11700b;
        if (file3 == null || (fileArrListFiles = file3.listFiles(this)) == null) {
            return;
        }
        for (File file4 : fileArrListFiles) {
            if (file4.delete()) {
                file4.getAbsolutePath();
            }
        }
    }
}
