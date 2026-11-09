package Fe;

import Pa.C0525w;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.SizeUtils;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.internal.operators.observable.C1759k;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements ObservableOnSubscribe, ObservableTransformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2769a;

    public /* synthetic */ e0(String str) {
        this.f2769a = str;
    }

    @Override // io.reactivex.ObservableTransformer
    public ObservableSource apply(df.d dVar) {
        return new C1759k(dVar.k(p298tf.f.f42629b), new C0525w(this, 7), p147jf.a.f38600d, p147jf.a.f38599c);
    }

    @Override // io.reactivex.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        Bitmap bitmap;
        String avatar = BaseApplication.getInstance().getUser().getAvatar();
        int iDp2px = SizeUtils.dp2px(176.0f);
        if (TextUtils.isEmpty(avatar)) {
            bitmap = (Bitmap) com.bumptech.glide.b.e(BaseApplication.getContext()).b().load(Integer.valueOf(com.transsnet.palmpay.custom_view.r.cv_avatar_default)).f0(SizeUtils.dp2px(45.0f), SizeUtils.dp2px(45.0f)).get();
        } else {
            bitmap = (Bitmap) com.bumptech.glide.b.e(BaseApplication.getContext()).b().load(avatar).a((G1.d) new G1.d().d()).f0(SizeUtils.dp2px(45.0f), SizeUtils.dp2px(45.0f)).get();
        }
        observableEmitter.onNext(J3.a.i(this.f2769a, iDp2px, iDp2px, bitmap));
        observableEmitter.onComplete();
    }
}
