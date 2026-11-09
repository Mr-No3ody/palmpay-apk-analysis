package org.sufficientlysecure.htmltextview;

import U2.B;
import android.content.Context;
import androidx.customview.widget.FocusStrategy$CollectionAdapter;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.pool.FactoryPools$Resetter;
import com.didi.drouter.store.IRouterProxy;
import com.growingio.android.sdk.track.modelloader.DataFetcher;
import com.palmpay.lib.bridgewrapper.page.BrowserBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.AudioChannelQueryBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.QueryPermissionBridge;
import com.transsnet.palmpay.credit.rnbridge.CreditHandleRouterBridge;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements FactoryPools$Resetter, DataFetcher, FocusStrategy$CollectionAdapter, ResourceEncoder, IRouterProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41135a;

    public /* synthetic */ n(int i7) {
        this.f41135a = i7;
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object callMethod(Object obj, String str, Object[] objArr) throws B {
        switch (this.f41135a) {
            case 5:
                throw new B(11);
            case 6:
                throw new B(11);
            case 7:
                throw new B(11);
            default:
                throw new B(11);
        }
    }

    @Override // com.bumptech.glide.load.Encoder
    public boolean encode(Object obj, File file, com.bumptech.glide.load.h hVar) throws Throwable {
        try {
            J1.c.d(((com.bumptech.glide.load.resource.gif.h) ((com.bumptech.glide.load.resource.gif.d) ((Resource) obj).get()).f20982a.f18151b).f20999a.f20477d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.growingio.android.sdk.track.modelloader.DataFetcher
    public Object executeData() {
        throw null;
    }

    @Override // androidx.customview.widget.FocusStrategy$CollectionAdapter
    public Object get(Object obj, int i7) {
        return (p074f0.d) ((M.o) obj).f(i7);
    }

    @Override // com.growingio.android.sdk.track.modelloader.DataFetcher
    public Class getDataClass() {
        return Boolean.class;
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    public com.bumptech.glide.load.c getEncodeStrategy(com.bumptech.glide.load.h hVar) {
        return com.bumptech.glide.load.c.f20518a;
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object newInstance(Context context) {
        switch (this.f41135a) {
            case 5:
                return new BrowserBridge();
            case 6:
                return new AudioChannelQueryBridge();
            case 7:
                return new QueryPermissionBridge();
            default:
                return new CreditHandleRouterBridge();
        }
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools$Resetter
    public void reset(Object obj) {
        ((List) obj).clear();
    }

    @Override // androidx.customview.widget.FocusStrategy$CollectionAdapter
    public int size(Object obj) {
        return ((M.o) obj).e();
    }
}
