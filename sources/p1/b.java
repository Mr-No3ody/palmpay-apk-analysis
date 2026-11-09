package p1;

import com.palmpay.lib.webview.offline.utils.OfflineConstant;

/* JADX INFO: loaded from: classes.dex */
public enum b {
    JSON(".json"),
    ZIP(OfflineConstant.ZIP_SUFFIX),
    GZIP(".gz");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41174a;

    b(String str) {
        this.f41174a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f41174a;
    }
}
