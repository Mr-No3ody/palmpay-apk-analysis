package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.base.zai;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zae extends zag {
    private final WeakReference zac;

    public zae(ImageView imageView, int i7) {
        super(Uri.EMPTY, i7);
        Asserts.checkNotNull(imageView);
        this.zac = new WeakReference(imageView);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zae)) {
            return false;
        }
        ImageView imageView = (ImageView) this.zac.get();
        ImageView imageView2 = (ImageView) ((zae) obj).zac.get();
        return (imageView2 == null || imageView == null || !Objects.equal(imageView2, imageView)) ? false : true;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // com.google.android.gms.common.images.zag
    public final void zaa(@Nullable Drawable drawable, boolean z3, boolean z8, boolean z10) {
        ImageView imageView = (ImageView) this.zac.get();
        if (imageView != null) {
            if (!z8 && !z10 && (imageView instanceof zai)) {
                throw null;
            }
            boolean z11 = false;
            if (!z8 && !z3) {
                z11 = true;
            }
            if (z11) {
                Drawable drawable2 = imageView.getDrawable();
                if (drawable2 == null) {
                    drawable2 = null;
                } else if (drawable2 instanceof com.google.android.gms.internal.base.zah) {
                    drawable2 = ((com.google.android.gms.internal.base.zah) drawable2).zab();
                }
                drawable = new com.google.android.gms.internal.base.zah(drawable2, drawable);
            }
            imageView.setImageDrawable(drawable);
            if (imageView instanceof zai) {
                throw null;
            }
            if (drawable == null || !z11) {
                return;
            }
            ((com.google.android.gms.internal.base.zah) drawable).zac(250);
        }
    }

    public zae(ImageView imageView, Uri uri) {
        super(uri, 0);
        Asserts.checkNotNull(imageView);
        this.zac = new WeakReference(imageView);
    }
}
