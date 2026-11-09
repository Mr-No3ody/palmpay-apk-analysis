package p091g1;

import Ff.h;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import android.net.Uri;
import androidx.camera.core.impl.utils.executor.g;
import com.abedelazizshe.lightcompressorlibrary.config.a;
import com.palmpay.lib.bridgewrapper.video.VideoUploadBridge;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f36827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Uri f36828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f36829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f36830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a f36831g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ VideoUploadBridge.AnonymousClass1.AnonymousClass2 f36832i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i7, Context context, Uri uri, String str, String str2, a aVar, VideoUploadBridge.AnonymousClass1.AnonymousClass2 anonymousClass2, Continuation continuation) {
        super(2, continuation);
        this.f36826b = i7;
        this.f36827c = context;
        this.f36828d = uri;
        this.f36829e = str;
        this.f36830f = str2;
        this.f36831g = aVar;
        this.f36832i = anonymousClass2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        a aVar = this.f36831g;
        VideoUploadBridge.AnonymousClass1.AnonymousClass2 anonymousClass2 = this.f36832i;
        return new d(this.f36826b, this.f36827c, this.f36828d, this.f36829e, this.f36830f, aVar, anonymousClass2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f36825a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        C2085k0 c2085k0 = new C2085k0(this.f36832i, 22);
        this.f36825a = 1;
        Object objS = AbstractC0780y.s(I.f10809a, new p107h1.a(this.f36827c, this.f36828d, this.f36826b, this.f36831g, this.f36829e, this.f36830f, c2085k0, null), this);
        return objS == aVar ? aVar : objS;
    }
}
