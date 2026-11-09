package p061e3;

import android.net.Uri;
import com.facebook.imagepipeline.request.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w {
    public /* synthetic */ w(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getShortenedUriString(Uri uri) {
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (string.length() <= 30) {
            return string;
        }
        String strSubstring = string.substring(0, 30);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring + "...";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateEncodedImageRequest(d dVar) {
        if (!(dVar.getLowestPermittedRequestLevel().f21663a <= 3)) {
            throw new IllegalArgumentException();
        }
    }

    private w() {
    }
}
