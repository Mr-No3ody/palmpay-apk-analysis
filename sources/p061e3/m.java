package p061e3;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.camera.video.internal.c;
import com.facebook.common.webp.BitmapCreator;
import com.facebook.common.webp.WebpBitmapFactory;
import com.facebook.imagepipeline.transcoder.ImageTranscoderFactory;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p136j2.b;
import p181m3.a;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public /* synthetic */ m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b getDefaultMainDiskCacheConfig(Context context) {
        a.a();
        b bVar = new b(new c(context, 15));
        Intrinsics.checkNotNullExpressionValue(bVar, "traceSection(...)");
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageTranscoderFactory getImageTranscoderFactory(l lVar) {
        lVar.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMemoryChunkType(l lVar, r rVar) {
        lVar.getClass();
        rVar.getClass();
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setWebpBitmapFactory(WebpBitmapFactory webpBitmapFactory, r rVar, BitmapCreator bitmapCreator) {
        p346x2.a.f43562a = webpBitmapFactory;
        rVar.getClass();
        if (bitmapCreator != null) {
            webpBitmapFactory.setBitmapCreator(bitmapCreator);
        }
    }

    @NotNull
    public final n getDefaultImageRequestConfig() {
        return o.f36053E;
    }

    @JvmStatic
    @NotNull
    public final l newBuilder(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new l(context);
    }

    @JvmStatic
    @VisibleForTesting
    public final void resetDefaultRequestConfig() {
        o.f36053E = new n();
    }

    private m() {
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultImageRequestConfig$annotations() {
    }
}
