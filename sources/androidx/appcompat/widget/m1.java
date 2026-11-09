package androidx.appcompat.widget;

import E.C0216v;
import V0.C0684c;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import android.util.Size;
import android.widget.TextView;
import androidx.camera.core.impl.C0977f;
import androidx.core.util.Supplier;
import androidx.work.impl.C1271d;
import androidx.work.impl.WorkDatabase;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import top.zibin.luban.CompressionPredicate;
import top.zibin.luban.InputStreamProvider;
import top.zibin.luban.OnCompressListener;
import top.zibin.luban.OnNewCompressListener;
import top.zibin.luban.OnRenameListener;

/* JADX INFO: loaded from: classes.dex */
public final class m1 implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f12971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f12973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f12974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f12975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f12976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f12977g;

    public m1(String str, androidx.camera.core.impl.P0 p3, androidx.camera.video.j jVar, Size size, C0977f c0977f, C0216v c0216v, Range range) {
        this.f12971a = str;
        this.f12972b = p3;
        this.f12973c = jVar;
        this.f12974d = size;
        this.f12975e = c0977f;
        this.f12976f = c0216v;
        this.f12977g = range;
    }

    public TextView a() {
        return (TextView) ((p355xf.t) this.f12974d).getValue();
    }

    public void b() {
        ph.e eVar = new ph.e();
        eVar.f41324a = (String) this.f12972b;
        eVar.f41326c = (OnRenameListener) this.f12973c;
        ArrayList arrayList = (ArrayList) this.f12977g;
        OnCompressListener onCompressListener = (OnCompressListener) this.f12974d;
        eVar.f41327d = onCompressListener;
        OnNewCompressListener onNewCompressListener = (OnNewCompressListener) this.f12975e;
        eVar.f41328e = onNewCompressListener;
        eVar.f41325b = 100;
        eVar.f41329f = (CompressionPredicate) this.f12976f;
        eVar.f41330g = new Handler(Looper.getMainLooper(), eVar);
        if (arrayList == null || arrayList.size() == 0) {
            if (onCompressListener != null) {
                onCompressListener.onError(-1, new NullPointerException("image file cannot be null"));
            }
            if (onNewCompressListener != null) {
                onNewCompressListener.onError("", new NullPointerException("image file cannot be null"));
                return;
            }
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AsyncTask.SERIAL_EXECUTOR.execute(new Ce.H(23, eVar, (Context) this.f12971a, (InputStreamProvider) it.next(), false));
            it.remove();
        }
    }

    public void c(int i7, File file) {
        ((ArrayList) this.f12977g).add(new ph.c(file, i7, 0));
    }

    public void d(ArrayList arrayList) {
        int i7 = -1;
        for (Object obj : arrayList) {
            i7++;
            boolean z3 = obj instanceof String;
            ArrayList arrayList2 = (ArrayList) this.f12977g;
            if (z3) {
                arrayList2.add(new ph.c((String) obj, i7, 1));
            } else if (obj instanceof File) {
                c(i7, (File) obj);
            } else {
                if (!(obj instanceof Uri)) {
                    throw new IllegalArgumentException("Incoming data type exception, it must be String, File, Uri or Bitmap");
                }
                arrayList2.add(new ph.d(this, (Uri) obj, i7));
            }
        }
    }

    @Override // androidx.core.util.Supplier
    public Object get() {
        C0977f c0977f = (C0977f) this.f12975e;
        int i7 = c0977f.f14051d;
        Range range = E.m0.f2054p;
        Range range2 = (Range) this.f12977g;
        int iIntValue = !Objects.equals(range2, range) ? ((Integer) range2.clamp(Integer.valueOf(i7))).intValue() : i7;
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numValueOf2 = Integer.valueOf(i7);
        boolean zEquals = Objects.equals(range2, range);
        Object obj = range2;
        if (!zEquals) {
            obj = "<UNSPECIFIED>";
        }
        String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", numValueOf, numValueOf2, obj);
        p140j8.f.G("VidEncVdPrflRslvr");
        p140j8.f.G("VidEncVdPrflRslvr");
        Range range3 = ((androidx.camera.video.j) this.f12973c).f14787c;
        p140j8.f.G("VidEncVdPrflRslvr");
        int i10 = ((C0216v) this.f12976f).f2129b;
        Size size = (Size) this.f12974d;
        int iC = androidx.camera.video.internal.config.b.c(c0977f.f14050c, i10, c0977f.f14055h, iIntValue, c0977f.f14051d, size.getWidth(), c0977f.f14052e, size.getHeight(), c0977f.f14053f, range3);
        String str = (String) this.f12971a;
        int i11 = c0977f.f14054g;
        androidx.camera.video.internal.encoder.e eVarA = androidx.camera.video.internal.config.b.a(i11, str);
        androidx.camera.video.internal.encoder.c cVarA = androidx.camera.video.internal.encoder.d.a();
        cVarA.f14648a = str;
        androidx.camera.core.impl.P0 p3 = (androidx.camera.core.impl.P0) this.f12972b;
        if (p3 == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        cVarA.f14650c = p3;
        cVarA.f14651d = size;
        cVarA.f14656i = Integer.valueOf(iC);
        cVarA.f14654g = Integer.valueOf(iIntValue);
        cVarA.f14649b = Integer.valueOf(i11);
        cVarA.f14653f = eVarA;
        return cVarA.a();
    }

    public m1(Context context, C0684c configuration, androidx.work.impl.utils.taskexecutor.a workTaskExecutor, C1271d foregroundProcessor, WorkDatabase workDatabase, androidx.work.impl.model.k workSpec, ArrayList tags) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(foregroundProcessor, "foregroundProcessor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f12972b = configuration;
        this.f12973c = workTaskExecutor;
        this.f12974d = foregroundProcessor;
        this.f12975e = workDatabase;
        this.f12976f = workSpec;
        this.f12977g = tags;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f12971a = applicationContext;
        new V0.a0();
    }
}
