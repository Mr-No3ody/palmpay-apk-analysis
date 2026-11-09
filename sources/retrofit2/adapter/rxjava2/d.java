package retrofit2.adapter.rxjava2;

import U2.B;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.emoji2.text.EmojiCompat$SpanFactory;
import androidx.emoji2.text.q;
import androidx.emoji2.text.w;
import androidx.emoji2.text.x;
import com.chad.library.adapter.base.animation.BaseAnimation;
import com.didi.drouter.store.IRouterProxy;
import com.facebook.soloader.SoLoader;
import com.facebook.soloader.nativeloader.NativeLoaderDelegate;
import com.palmpay.lib.bridgewrapper.page.PullRefreshBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.CalendarBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.SelectBankBridge;
import com.transsnet.palmpay.credit.rnbridge.GetCreditProcessInfoBridge;
import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;
import net.lingala.zip4j.crypto.Encrypter;
import p043d.i;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements BaseAnimation, i, EmojiCompat$SpanFactory, NativeLoaderDelegate, IRouterProxy, Consumer, Encrypter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41909a;

    public /* synthetic */ d(int i7) {
        this.f41909a = i7;
    }

    @Override // com.chad.library.adapter.base.animation.BaseAnimation
    public Animator[] animators(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "translationX", view.getRootView().getWidth(), 0.0f);
        animator.setDuration(400L);
        animator.setInterpolator(new DecelerateInterpolator(1.8f));
        Intrinsics.checkNotNullExpressionValue(animator, "animator");
        return new Animator[]{animator};
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object callMethod(Object obj, String str, Object[] objArr) throws B {
        switch (this.f41909a) {
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

    @Override // androidx.emoji2.text.EmojiCompat$SpanFactory
    public q createSpan(w wVar) {
        return new x(wVar);
    }

    @Override // net.lingala.zip4j.crypto.Encrypter
    public int encryptData(byte[] bArr) {
        return bArr.length;
    }

    @Override // com.facebook.soloader.nativeloader.NativeLoaderDelegate
    public String getLibraryPath(String str) {
        SoLoader.f21855c.readLock().lock();
        try {
            String strA = null;
            if (SoLoader.f21857e != null) {
                for (int i7 = 0; strA == null && i7 < SoLoader.f21857e.length; i7++) {
                    strA = SoLoader.f21857e[i7].a(str);
                }
            }
            return strA;
        } finally {
            SoLoader.f21855c.readLock().unlock();
        }
    }

    @Override // com.facebook.soloader.nativeloader.NativeLoaderDelegate
    public int getSoSourcesVersion() {
        return SoLoader.f21858f.get();
    }

    @Override // com.facebook.soloader.nativeloader.NativeLoaderDelegate
    public boolean loadLibrary(String str, int i7) {
        return SoLoader.k(str, (i7 & 1) != 0 ? 16 : 0);
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object newInstance(Context context) {
        switch (this.f41909a) {
            case 5:
                return new PullRefreshBridge();
            case 6:
                return new CalendarBridge();
            case 7:
                return new SelectBankBridge();
            default:
                return new GetCreditProcessInfoBridge();
        }
    }

    public String toString() {
        switch (this.f41909a) {
            case 9:
                return "EmptyConsumer";
            default:
                return super.toString();
        }
    }

    @Override // net.lingala.zip4j.crypto.Encrypter
    public int encryptData(byte[] bArr, int i7, int i10) {
        return i10;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
    }
}
