package androidx.privacysandbox.ads.adservices.internal;

import android.os.ext.SdkExtensions;
import androidx.annotation.DoNotInline;
import com.luck.picture.lib.config.FileSizeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f17677a = new b();

    @DoNotInline
    public final int a() {
        return SdkExtensions.getExtensionVersion(FileSizeUnit.ACCURATE_MB);
    }
}
