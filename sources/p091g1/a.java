package p091g1;

import Wf.C0775t;
import com.palmpay.lib.bridgewrapper.video.VideoUploadBridge;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes.dex */
public final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoUploadBridge.AnonymousClass1.AnonymousClass2 f36808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f36809c;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(VideoUploadBridge.AnonymousClass1.AnonymousClass2 anonymousClass2, int i7) {
        C0775t c0775t = C0775t.f10898a;
        this.f36808b = anonymousClass2;
        this.f36809c = i7;
        super(c0775t);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        this.f36808b.onFailure(this.f36809c, message);
    }
}
