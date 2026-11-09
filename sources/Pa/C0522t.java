package Pa;

import Bc.C0106c;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.request.transition.Transition;
import com.transsnet.palmpay.teller.ui.activity.TvPreCheckActivity;
import com.transsnet.palmpay.ui.activity.CoinRainActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: renamed from: Pa.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0522t extends H1.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f7162c;

    public /* synthetic */ C0522t(KeyEvent.Callback callback, int i7) {
        this.f7161b = i7;
        this.f7162c = callback;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onResourceReady(Object obj, Transition transition) {
        ImageView imageView;
        ImageView imageView2;
        TextView textView;
        TextView textView2;
        AppCompatImageView appCompatImageView;
        KeyEvent.Callback callback = this.f7162c;
        switch (this.f7161b) {
            case 0:
                ((View) callback).setBackground((Drawable) obj);
                break;
            case 1:
                Drawable resource = (Drawable) obj;
                Intrinsics.checkNotNullParameter(resource, "resource");
                KProperty[] kPropertyArr = TvPreCheckActivity.f34231j;
                Rd.C c6 = (Rd.C) ((TvPreCheckActivity) callback).f27334c;
                if (c6 != null && (imageView = c6.f8001d) != null) {
                    imageView.setImageDrawable(resource);
                    break;
                }
                break;
            default:
                Drawable resource2 = (Drawable) obj;
                Intrinsics.checkNotNullParameter(resource2, "resource");
                CoinRainActivity coinRainActivity = (CoinRainActivity) callback;
                C0106c c0106c = coinRainActivity.f34457g;
                if (c0106c != null && (appCompatImageView = (AppCompatImageView) c0106c.f677o) != null) {
                    appCompatImageView.setImageDrawable(resource2);
                }
                C0106c c0106c2 = coinRainActivity.f34457g;
                if (c0106c2 != null && (textView2 = (TextView) c0106c2.f672e) != null) {
                    p220oa.h.s(textView2, true);
                }
                C0106c c0106c3 = coinRainActivity.f34457g;
                if (c0106c3 != null && (textView = (TextView) c0106c3.f674g) != null) {
                    p220oa.h.s(textView, true);
                }
                C0106c c0106c4 = coinRainActivity.f34457g;
                if (c0106c4 != null && (imageView2 = (ImageView) c0106c4.f671d) != null) {
                    p220oa.h.s(imageView2, true);
                    break;
                }
                break;
        }
    }
}
