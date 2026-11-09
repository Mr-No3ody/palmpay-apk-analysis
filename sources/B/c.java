package B;

import android.content.Context;
import androidx.camera.camera2.internal.C0941m0;
import androidx.camera.core.impl.UseCaseConfigFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements UseCaseConfigFactory.Provider {
    @Override // androidx.camera.core.impl.UseCaseConfigFactory.Provider
    public final UseCaseConfigFactory newInstance(Context context) {
        return new C0941m0(context);
    }
}
