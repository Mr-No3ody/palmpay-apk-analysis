package B1;

import Pa.C0525w;
import com.bumptech.glide.load.data.DataRewinder;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class a implements DataRewinder.Factory {
    @Override // com.bumptech.glide.load.data.DataRewinder.Factory
    public final DataRewinder build(Object obj) {
        return new C0525w((ByteBuffer) obj, 2);
    }

    @Override // com.bumptech.glide.load.data.DataRewinder.Factory
    public final Class getDataClass() {
        return ByteBuffer.class;
    }
}
