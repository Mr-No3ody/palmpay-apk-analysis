package C9;

import android.app.Dialog;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.camera2.internal.C0942n;
import androidx.core.text.TextDirectionHeuristicCompat;
import com.bumptech.glide.load.engine.Resource;
import com.facebook.common.file.FileTreeVisitor;
import com.google.common.util.concurrent.ListenableFuture;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawAgentPaymentResultActivity;
import com.transsnet.palmpay.credit.ui.activity.PayShopPaymentResultActivity;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.io.File;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes3.dex */
public class N implements AdShowCallback, TextDirectionHeuristicCompat, FileTreeVisitor, Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1269c;

    public /* synthetic */ N(Object obj, int i7) {
        this.f1267a = i7;
        this.f1269c = obj;
    }

    public CameraCaptureSession.CaptureCallback a(CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.f1268b) {
            return captureCallback;
        }
        C0942n c0942n = new C0942n(3);
        List list = (List) this.f1269c;
        androidx.concurrent.futures.m mVar = (androidx.concurrent.futures.m) c0942n.f13600b;
        list.add(mVar);
        mVar.addListener(new Da.h(this, 19, c0942n, mVar), org.chromium.support_lib_boundary.util.b.u());
        return new androidx.camera.camera2.internal.N(Arrays.asList(c0942n, captureCallback));
    }

    public boolean b() {
        return this.f1268b;
    }

    public ListenableFuture c() {
        List list = (List) this.f1269c;
        if (list.isEmpty()) {
            return androidx.camera.core.impl.utils.futures.l.f14212c;
        }
        androidx.camera.core.impl.utils.futures.m mVarH = androidx.camera.core.impl.utils.futures.j.h(new ArrayList(list));
        E.K k2 = new E.K(1);
        return androidx.camera.core.impl.utils.futures.j.e(androidx.camera.core.impl.utils.futures.j.i(mVarH, new C2085k0(k2, 13), org.chromium.support_lib_boundary.util.b.u()));
    }

    public void d() {
        this.f1268b = false;
    }

    public void e(byte b7) {
        ((C4.a) this.f1269c).writeLong(b7);
    }

    public void f(char c6) {
        ((C4.a) this.f1269c).writeChar(c6);
    }

    public void g(int i7) {
        ((C4.a) this.f1269c).writeLong(i7);
    }

    public void h(long j6) {
        ((C4.a) this.f1269c).writeLong(j6);
    }

    public void i(String v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        ((C4.a) this.f1269c).write(v3);
    }

    @Override // androidx.core.text.TextDirectionHeuristicCompat
    public boolean isRtl(char[] cArr, int i7, int i10) {
        return isRtl(CharBuffer.wrap(cArr), i7, i10);
    }

    public void j(short s3) {
        ((C4.a) this.f1269c).writeLong(s3);
    }

    public void k(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((C4.a) this.f1269c).writeQuoted(value);
    }

    public synchronized void l(Resource resource, boolean z3) {
        try {
            if (this.f1268b || z3) {
                ((Handler) this.f1269c).obtainMessage(1, resource).sendToTarget();
            } else {
                this.f1268b = true;
                resource.recycle();
                this.f1268b = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void n() {
        LinkedList linkedList = new LinkedList((List) this.f1269c);
        while (!linkedList.isEmpty()) {
            ListenableFuture listenableFuture = (ListenableFuture) linkedList.poll();
            Objects.requireNonNull(listenableFuture);
            listenableFuture.cancel(true);
        }
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.f1268b) {
            return;
        }
        ((Observer) this.f1269c).onComplete();
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        if (!this.f1268b) {
            ((Observer) this.f1269c).onError(th);
            return;
        }
        AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
        assertionError.initCause(th);
        org.chromium.support_lib_boundary.util.b.V(assertionError);
    }

    @Override // io.reactivex.Observer
    public void onNext(Object obj) {
        retrofit2.K k2 = (retrofit2.K) obj;
        boolean zIsSuccessful = k2.f41873a.isSuccessful();
        Observer observer = (Observer) this.f1269c;
        if (zIsSuccessful) {
            observer.onNext(k2.f41874b);
            return;
        }
        this.f1268b = true;
        retrofit2.adapter.rxjava2.c cVar = new retrofit2.adapter.rxjava2.c(k2);
        try {
            observer.onError(cVar);
        } catch (Throwable th) {
            D3.a.H(th);
            org.chromium.support_lib_boundary.util.b.V(new p118hf.b(cVar, th));
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        ((Observer) this.f1269c).onSubscribe(disposable);
    }

    @Override // com.facebook.common.file.FileTreeVisitor
    public void postVisitDirectory(File file) {
        com.facebook.cache.disk.d dVar = (com.facebook.cache.disk.d) this.f1269c;
        if (!dVar.f21186a.equals(file) && !this.f1268b) {
            file.delete();
        }
        if (this.f1268b && file.equals(dVar.f21188c)) {
            this.f1268b = false;
        }
    }

    @Override // com.facebook.common.file.FileTreeVisitor
    public void preVisitDirectory(File file) {
        if (this.f1268b || !file.equals(((com.facebook.cache.disk.d) this.f1269c).f21188c)) {
            return;
        }
        this.f1268b = true;
    }

    @Override // com.transsnet.adsdk.widgets.interfaces.AdShowCallback
    public void showCallback(Dialog dialog) {
        switch (this.f1267a) {
            case 0:
                super.showCallback(dialog);
                if (this.f1268b) {
                    ((WithdrawAgentPaymentResultActivity) this.f1269c).f26912C = true;
                    if (dialog != null) {
                        dialog.show();
                    }
                }
                break;
            default:
                super.showCallback(dialog);
                if (this.f1268b) {
                    ((PayShopPaymentResultActivity) this.f1269c).f28743M = true;
                    if (dialog != null) {
                        dialog.show();
                    }
                }
                break;
        }
    }

    @Override // com.facebook.common.file.FileTreeVisitor
    public void visitFile(File file) {
        com.facebook.cache.disk.d dVar;
        G6.b bVarA;
        if (this.f1268b && (bVarA = com.facebook.cache.disk.d.a((dVar = (com.facebook.cache.disk.d) this.f1269c), file)) != null) {
            String str = bVarA.f3025b;
            if (str != ".tmp") {
                p213o2.e.f(str == ".cnt");
                return;
            }
            long jLastModified = file.lastModified();
            dVar.f21190e.getClass();
            if (jLastModified > System.currentTimeMillis() - com.facebook.cache.disk.d.f21184f) {
                return;
            }
        }
        file.delete();
    }

    public /* synthetic */ N(boolean z3, Object obj, int i7) {
        this.f1267a = i7;
        this.f1268b = z3;
        this.f1269c = obj;
    }

    @Override // androidx.core.text.TextDirectionHeuristicCompat
    public boolean isRtl(CharSequence charSequence, int i7, int i10) {
        if (charSequence == null || i7 < 0 || i10 < 0 || charSequence.length() - i10 < i7) {
            throw new IllegalArgumentException();
        }
        androidx.core.text.e eVar = (androidx.core.text.e) this.f1269c;
        if (eVar == null) {
            return b();
        }
        int iCheckRtl = eVar.checkRtl(charSequence, i7, i10);
        if (iCheckRtl == 0) {
            return true;
        }
        if (iCheckRtl != 1) {
            return b();
        }
        return false;
    }

    public N() {
        this.f1267a = 4;
        this.f1269c = new Handler(Looper.getMainLooper(), new H1.i(1));
    }

    public N(C4.a writer) {
        this.f1267a = 6;
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f1269c = writer;
        this.f1268b = true;
    }

    public N(boolean z3) {
        this.f1267a = 1;
        this.f1269c = Collections.synchronizedList(new ArrayList());
        this.f1268b = z3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N(androidx.core.text.e eVar, boolean z3) {
        this(eVar, 2);
        this.f1267a = 2;
        this.f1268b = z3;
    }

    public void m() {
    }

    public void o() {
    }
}
