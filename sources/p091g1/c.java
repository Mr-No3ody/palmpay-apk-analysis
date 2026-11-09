package p091g1;

import Ff.h;
import Wf.AbstractC0780y;
import Wf.B;
import Wf.I;
import android.content.Context;
import android.net.Uri;
import androidx.camera.core.impl.utils.executor.g;
import com.abedelazizshe.lightcompressorlibrary.CompressionListener;
import com.abedelazizshe.lightcompressorlibrary.config.a;
import com.palmpay.lib.bridgewrapper.video.VideoUploadBridge;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p137j3.u;
import p150k1.d;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f36813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f36814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f36815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f36818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f36819g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u f36820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a f36821j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f36822o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ F f36823p;
    public final /* synthetic */ List t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ VideoUploadBridge.AnonymousClass1.AnonymousClass2 f36824v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, u uVar, a aVar, int i7, F f10, List list, VideoUploadBridge.AnonymousClass1.AnonymousClass2 anonymousClass2, Continuation continuation) {
        super(2, continuation);
        this.f36819g = context;
        this.f36820i = uVar;
        this.f36821j = aVar;
        this.f36822o = i7;
        this.f36823p = f10;
        this.t = list;
        this.f36824v = anonymousClass2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        VideoUploadBridge.AnonymousClass1.AnonymousClass2 anonymousClass2 = this.f36824v;
        c cVar = new c(this.f36819g, this.f36820i, this.f36821j, this.f36822o, this.f36823p, this.t, anonymousClass2, continuation);
        cVar.f36818f = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f0  */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objC;
        Object objS;
        u uVar;
        int i7;
        Context context;
        a aVar;
        CompressionListener compressionListener;
        d dVar;
        String str;
        Ef.a aVar2 = Ef.a.f2423a;
        int i10 = this.f36817e;
        List list = this.t;
        int i11 = this.f36822o;
        if (i10 == 0) {
            g.M(obj);
            B bD = AbstractC0780y.d((CoroutineScope) this.f36818f, null, new b(this.f36819g, list, i11, null), 3);
            this.f36817e = 1;
            objC = bD.c(this);
            if (objC != aVar2) {
            }
            return aVar2;
        }
        if (i10 == 1) {
            g.M(obj);
            objC = obj;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i7 = this.f36816d;
            u uVar2 = this.f36815c;
            aVar = this.f36814b;
            context = this.f36813a;
            CompressionListener compressionListener2 = (CompressionListener) this.f36818f;
            g.M(obj);
            uVar = uVar2;
            compressionListener = compressionListener2;
            objS = obj;
        }
        dVar = (d) objS;
        if (dVar.f38625b) {
            File fileA = e.a(e.f36833b, context, dVar.f38628e, uVar, false, (String) aVar.f19293c.get(i7), true);
            compressionListener.onSuccess(i7, dVar.f38627d, fileA != null ? fileA.getPath() : null);
        } else {
            str = dVar.f38626c;
            if (str == null) {
                str = "An error has occurred!";
            }
            compressionListener.onFailure(i7, str);
        }
        return Unit.f38893a;
        String str2 = (String) objC;
        e eVar = e.f36833b;
        Boolean bool = Boolean.FALSE;
        a aVar3 = this.f36821j;
        String str3 = (String) aVar3.f19293c.get(i11);
        Context context2 = this.f36819g;
        u uVar3 = this.f36820i;
        File fileA2 = e.a(eVar, context2, str2, uVar3, bool, str3, false);
        F f10 = this.f36823p;
        if (fileA2 != null) {
            VideoUploadBridge.AnonymousClass1.AnonymousClass2 anonymousClass2 = this.f36824v;
            int i12 = this.f36822o;
            anonymousClass2.onStart(i12);
            Uri uri = (Uri) list.get(i12);
            String path = fileA2.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "desFile.path");
            File file = (File) f10.f38951a;
            String path2 = file != null ? file.getPath() : null;
            this.f36818f = anonymousClass2;
            Context context3 = this.f36819g;
            this.f36813a = context3;
            this.f36814b = aVar3;
            this.f36815c = uVar3;
            this.f36816d = i12;
            this.f36817e = 2;
            objS = AbstractC0780y.s(I.f10809a, new d(i12, context3, uri, path, path2, aVar3, anonymousClass2, null), this);
            if (objS != aVar2) {
                uVar = uVar3;
                i7 = i12;
                context = context3;
                aVar = aVar3;
                compressionListener = anonymousClass2;
                dVar = (d) objS;
                if (dVar.f38625b) {
                    File fileA3 = e.a(e.f36833b, context, dVar.f38628e, uVar, false, (String) aVar.f19293c.get(i7), true);
                    compressionListener.onSuccess(i7, dVar.f38627d, fileA3 != null ? fileA3.getPath() : null);
                } else {
                    str = dVar.f38626c;
                    if (str == null) {
                        str = "An error has occurred!";
                    }
                    compressionListener.onFailure(i7, str);
                }
            }
            return aVar2;
        }
        return Unit.f38893a;
    }
}
