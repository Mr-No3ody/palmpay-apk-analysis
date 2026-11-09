package p284sb;

import N8.q0;
import android.text.TextUtils;
import androidx.camera.video.u;
import com.transsnet.palmpay.core.bean.req.ParseInstalmentsQrcodeReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.credit.ui.activity.SearchMIDActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.y;
import p071ef.b;
import p298tf.f;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchMIDActivity f42140a;

    public T(SearchMIDActivity searchMIDActivity) {
        this.f42140a = searchMIDActivity;
    }

    public static String a(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (content.length() > 8) {
            String strSubstring = content.substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = content.substring(4, 8);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            String strSubstring3 = content.substring(8, content.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            return u.n(strSubstring, " ", strSubstring2, " ", strSubstring3);
        }
        if (content.length() <= 4) {
            return content;
        }
        String strSubstring4 = content.substring(0, 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
        String strSubstring5 = content.substring(4, content.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
        return q0.y(strSubstring4, " ", strSubstring5);
    }

    public final void b(String mid) {
        Intrinsics.checkNotNullParameter(mid, "mid");
        ((PayApiService) c.f43141a.f14621b).parseInstalmentQrcode(new ParseInstalmentsQrcodeReq("", mid)).k(f.f42629b).i(b.a()).subscribe(new S(this.f42140a, mid));
    }

    public final String c(String no) {
        Intrinsics.checkNotNullParameter(no, "no");
        if (TextUtils.isEmpty(no)) {
            return "";
        }
        if (no.length() > 8 && y.m(no, "M010001", false)) {
            String strSubstring = no.substring(no.length() - 8);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            no = new StringBuffer(strSubstring).toString();
        }
        Intrinsics.e(no);
        KProperty[] kPropertyArr = SearchMIDActivity.f28782Q;
        this.f42140a.o().getClass();
        return a(no);
    }
}
