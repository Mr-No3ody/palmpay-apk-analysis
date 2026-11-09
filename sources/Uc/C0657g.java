package Uc;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingDetailPage;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.AboutDialog;
import com.transsnet.palmpay.util.Utils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Uc.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0657g extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9645b;

    public /* synthetic */ C0657g(Object obj, int i7) {
        this.f9644a = i7;
        this.f9645b = obj;
    }

    public final void a(TextPaint textPaint) {
        textPaint.setColor(Utils.getApp().getColor(Sc.a.p2p_theme_color));
        textPaint.setUnderlineText(false);
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        switch (this.f9644a) {
            case 0:
                Intrinsics.checkNotNullParameter(widget, "widget");
                ((C0661i) ((BookingDetailPage) this.f9645b).f32804C.getValue()).getClass();
                ARouter.getInstance().build("/cashin_out/add_money").navigation();
                break;
            default:
                ((AboutDialog) this.f9645b).mW.getClass();
                Pa.i0.c0(com.transsnet.palmpay.core.config.d.g("/h5/conditions/ng/get-naria?showTitle=true"));
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        switch (this.f9644a) {
            case 0:
                Intrinsics.checkNotNullParameter(ds, "ds");
                BookingDetailPage bookingDetailPage = (BookingDetailPage) this.f9645b;
                Intrinsics.checkNotNullParameter(bookingDetailPage, "<this>");
                ds.setColor(bookingDetailPage.getColor(Sc.a.p2p_theme_color));
                ds.setUnderlineText(true);
                break;
            default:
                a(ds);
                break;
        }
    }
}
