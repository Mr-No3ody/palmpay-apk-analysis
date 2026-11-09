package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.view.AbstractC1057i;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1333e implements ResourceDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20915b;

    public /* synthetic */ C1333e(o oVar, int i7) {
        this.f20914a = i7;
        this.f20915b = oVar;
    }

    public C1331c a(ImageDecoder.Source source, int i7, int i10, com.bumptech.glide.load.h hVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new A1.d(i7, i10, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new C1331c((com.bumptech.glide.load.engine.bitmap_recycle.g) this.f20915b, bitmapDecodeBitmap);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource decode(Object obj, int i7, int i10, com.bumptech.glide.load.h hVar) {
        switch (this.f20914a) {
            case 0:
                o oVar = (o) this.f20915b;
                return oVar.a(new v((ByteBuffer) obj, oVar.f20942d, oVar.f20941c), i7, i10, hVar, o.f20937j);
            case 1:
                o oVar2 = (o) this.f20915b;
                return oVar2.a(new x((ParcelFileDescriptor) obj, oVar2.f20942d, oVar2.f20941c), i7, i10, hVar, o.f20937j);
            default:
                return a(AbstractC1057i.e(obj), i7, i10, hVar);
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean handles(Object obj, com.bumptech.glide.load.h hVar) {
        switch (this.f20914a) {
            case 0:
                ((o) this.f20915b).getClass();
                return true;
            case 1:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
            default:
                AbstractC1057i.r(obj);
                return true;
        }
    }

    public C1333e() {
        this.f20914a = 2;
        this.f20915b = new com.bumptech.glide.load.engine.bitmap_recycle.g();
    }
}
