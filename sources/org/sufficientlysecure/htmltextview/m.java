package org.sufficientlysecure.htmltextview;

import U2.B;
import android.content.Context;
import android.graphics.Rect;
import androidx.customview.widget.FocusStrategy$BoundsAdapter;
import com.bumptech.glide.util.pool.FactoryPools$Factory;
import com.didi.drouter.store.IRouterProxy;
import com.facebook.cache.disk.EntryEvictionComparator;
import com.facebook.cache.disk.EntryEvictionComparatorSupplier;
import com.growingio.android.sdk.track.modelloader.ModelLoader;
import com.growingio.android.sdk.track.modelloader.ModelLoaderFactory;
import com.palmpay.lib.bridgewrapper.page.AppStoreBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.AudioChannelBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.PickLocationBridge;
import com.transsnet.palmpay.credit.rnbridge.CreditFaceRecBridge;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements FactoryPools$Factory, ModelLoaderFactory, FocusStrategy$BoundsAdapter, IRouterProxy, EntryEvictionComparatorSupplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41134a;

    public /* synthetic */ m(int i7) {
        this.f41134a = i7;
    }

    @Override // com.growingio.android.sdk.track.modelloader.ModelLoaderFactory
    public ModelLoader build() {
        return new W4.a(0);
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object callMethod(Object obj, String str, Object[] objArr) throws B {
        switch (this.f41134a) {
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

    @Override // com.bumptech.glide.util.pool.FactoryPools$Factory
    public Object create() {
        switch (this.f41134a) {
            case 1:
                return new ArrayList();
            default:
                try {
                    return new com.bumptech.glide.load.engine.cache.j(MessageDigest.getInstance("SHA-256"));
                } catch (NoSuchAlgorithmException e10) {
                    throw new RuntimeException(e10);
                }
        }
    }

    @Override // com.facebook.cache.disk.EntryEvictionComparatorSupplier
    public EntryEvictionComparator get() {
        return new com.facebook.cache.disk.e();
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object newInstance(Context context) {
        switch (this.f41134a) {
            case 5:
                return new AppStoreBridge();
            case 6:
                return new AudioChannelBridge();
            case 7:
                return new PickLocationBridge();
            default:
                return new CreditFaceRecBridge();
        }
    }

    @Override // androidx.customview.widget.FocusStrategy$BoundsAdapter
    public void obtainBounds(Object obj, Rect rect) {
        ((p074f0.d) obj).g(rect);
    }
}
