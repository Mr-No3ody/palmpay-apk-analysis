package A0;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static d a(LifecycleOwner lifecycleOwner) {
        return new d(lifecycleOwner, ((ViewModelStoreOwner) lifecycleOwner).getViewModelStore());
    }
}
