package p230p4;

import android.text.TextUtils;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41183a;

    public a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f41183a = url;
    }

    public final boolean equals(Object obj) {
        try {
            if (!(obj instanceof a) || TextUtils.isEmpty(((a) obj).f41183a)) {
                return false;
            }
            return Intrinsics.c(((a) obj).f41183a, this.f41183a);
        } catch (Exception e10) {
            Log.e("FlexiBankImageUrl", "equals: ", e10);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f41183a;
        return TextUtils.isEmpty(str) ? super.hashCode() : str.hashCode();
    }
}
