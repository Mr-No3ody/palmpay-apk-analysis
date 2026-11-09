package p166l2;

import E.Q;
import G7.x;
import G7.y;
import U2.B;
import android.content.Context;
import android.graphics.Matrix;
import android.net.Uri;
import android.provider.Settings;
import androidx.camera.core.processing.Operation;
import com.airbnb.lottie.configurations.reducemotion.ReducedMotionOption;
import com.airbnb.lottie.utils.i;
import com.bumptech.glide.b;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.p;
import com.didi.drouter.store.IRouterProxy;
import com.facebook.cache.disk.DiskStorage;
import com.facebook.cache.disk.g;
import com.facebook.common.disk.DiskTrimmable;
import com.facebook.common.disk.DiskTrimmableRegistry;
import com.facebook.imagepipeline.core.DiskStorageFactory;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.palmpay.lib.bridgewrapper.statusbar.StatusBarThemeBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.MfbBankSdkManagerBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.UploadPhotoBridge;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.TreeMap;
import p222oc.c;

/* JADX INFO: loaded from: classes.dex */
public final class a implements DiskTrimmableRegistry, Function, Operation, RequestManagerRetriever$RequestManagerFactory, ObjectConstructor, IRouterProxy, DiskStorageFactory, ReducedMotionOption {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f39265b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39266a;

    public /* synthetic */ a(int i7) {
        this.f39266a = i7;
    }

    public static Uri a(File file, File file2) throws Q {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new Q(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x011d */
    @Override // io.reactivex.functions.Function
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r18) throws E.Q {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p166l2.a.apply(java.lang.Object):java.lang.Object");
    }

    @Override // com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory
    public p build(b bVar, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context) {
        return new c(bVar, lifecycle, requestManagerTreeNode, context);
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object callMethod(Object obj, String str, Object[] objArr) throws B {
        switch (this.f39266a) {
            case 6:
                throw new B(11);
            case 7:
                throw new B(11);
            default:
                throw new B(11);
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public Object construct() {
        return new TreeMap();
    }

    @Override // com.facebook.imagepipeline.core.DiskStorageFactory
    public DiskStorage get(p136j2.b bVar) {
        return new g(bVar.f38179a, bVar.f38181c, bVar.f38180b, bVar.f38186h);
    }

    @Override // com.airbnb.lottie.configurations.reducemotion.ReducedMotionOption
    public p194n1.a getCurrentReducedMotionMode(Context context) {
        if (context != null) {
            Matrix matrix = i.f20269a;
            if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
                return p194n1.a.f39820b;
            }
        }
        return p194n1.a.f39819a;
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object newInstance(Context context) {
        switch (this.f39266a) {
            case 6:
                return new StatusBarThemeBridge();
            case 7:
                return new MfbBankSdkManagerBridge();
            default:
                return new UploadPhotoBridge();
        }
    }

    public a(x xVar) {
        this.f39266a = 1;
        y yVar = xVar.f3147a;
    }

    @Override // com.facebook.common.disk.DiskTrimmableRegistry
    public void registerDiskTrimmable(DiskTrimmable diskTrimmable) {
    }

    @Override // com.facebook.common.disk.DiskTrimmableRegistry
    public void unregisterDiskTrimmable(DiskTrimmable diskTrimmable) {
    }
}
