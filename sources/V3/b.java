package V3;

import androidx.activity.result.ActivityResultCallback;
import com.transsnet.palmpay.teller.ui.activity.JambHomeActivity;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ActivityResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9983a;

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        switch (this.f9983a) {
            case 0:
                Unit it = (Unit) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                ((Integer) obj).intValue();
                int i7 = JambHomeActivity.f34222B;
                break;
            default:
                Unit it2 = (Unit) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                break;
        }
    }
}
