package p196n3;

import W2.c;
import W2.e;
import android.graphics.Bitmap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap.CompressFormat getOutputFormat(e imageFormat) {
        if (imageFormat == null) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (imageFormat == c.f10530a) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (imageFormat == c.f10531b) {
            return Bitmap.CompressFormat.PNG;
        }
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        return (imageFormat == c.f10535f || imageFormat == c.f10536g || imageFormat == c.f10537h || imageFormat == c.f10538i) ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
    }

    private d() {
    }
}
