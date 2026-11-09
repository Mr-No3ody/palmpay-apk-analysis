package H1;

import J1.o;
import com.bumptech.glide.request.target.SizeReadyCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends a {
    @Override // com.bumptech.glide.request.target.Target
    public final void getSize(SizeReadyCallback sizeReadyCallback) {
        if (!o.i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648, either provide dimensions in the constructor or call override()");
        }
        sizeReadyCallback.onSizeReady(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void removeCallback(SizeReadyCallback sizeReadyCallback) {
    }
}
