package p024b9;

import Hb.A;
import androidx.camera.video.internal.encoder.o;
import androidx.fragment.app.E;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.manager.FileUploadManager;
import java.io.File;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements FileUploadManager.UploadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f18793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f18794b;

    public c(d dVar, Function1 function1) {
        this.f18793a = dVar;
        this.f18794b = function1;
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onComplete(String str, File file) {
        Function1 function1 = this.f18794b;
        d dVar = this.f18793a;
        A a3 = new A(dVar, 2, str, function1);
        E activity = dVar.f18796a.getActivity();
        if (activity != null) {
            BaseMVPFragment baseMVPFragment = dVar.f18796a;
            if (!baseMVPFragment.isAdded() || baseMVPFragment.getContext() == null) {
                return;
            }
            activity.runOnUiThread(new o(21, dVar, a3));
        }
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onError(Exception exc) {
        d dVar = this.f18793a;
        X6.c cVar = new X6.c(dVar, 8);
        E activity = dVar.f18796a.getActivity();
        if (activity != null) {
            BaseMVPFragment baseMVPFragment = dVar.f18796a;
            if (!baseMVPFragment.isAdded() || baseMVPFragment.getContext() == null) {
                return;
            }
            activity.runOnUiThread(new o(21, dVar, cVar));
        }
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onProgressChanged(long j6, long j10) {
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onStartSync(String str, File file) {
    }
}
