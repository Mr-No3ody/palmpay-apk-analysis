package Dd;

import C0.G;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1847b;

    public /* synthetic */ d(int i7, int i10) {
        this.f1846a = i10;
        this.f1847b = i7;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        switch (this.f1846a) {
            case 0:
                Intrinsics.checkNotNullParameter(widget, "widget");
                if (!r0.U0()) {
                    n0.g().k((ClickEvent) G.f("keke_auth_agreement_click", "app", "native"));
                    i0.b0("/cashbox/agreement?version=KekePay&title=Agreement");
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(widget, "widget");
                Eb.a.n();
                break;
            case 2:
                Intrinsics.checkNotNullParameter(widget, "widget");
                Eb.a.p();
                break;
            case 3:
                Intrinsics.checkNotNullParameter(widget, "widget");
                Eb.a.o();
                break;
            case 4:
                Intrinsics.checkNotNullParameter(widget, "widget");
                Eb.a.m();
                break;
            case 5:
                Intrinsics.checkNotNullParameter(widget, "widget");
                Eb.a.m();
                break;
            case 6:
                Intrinsics.checkNotNullParameter(widget, "widget");
                Eb.a.n();
                break;
            case 7:
                Intrinsics.checkNotNullParameter(widget, "widget");
                Eb.a.p();
                break;
            case 8:
                Intrinsics.checkNotNullParameter(widget, "widget");
                Eb.a.o();
                break;
            case 9:
                Intrinsics.checkNotNullParameter(widget, "widget");
                Eb.a.n();
                break;
            case 10:
                Intrinsics.checkNotNullParameter(widget, "widget");
                Eb.a.p();
                break;
            case 11:
                Intrinsics.checkNotNullParameter(widget, "widget");
                Eb.a.o();
                break;
            case 12:
                Intrinsics.checkNotNullParameter(widget, "widget");
                i0.c0(com.transsnet.palmpay.core.config.d.g("/h5/conditions/ng/palmpay?showTitle=true"));
                break;
            case 13:
                Intrinsics.checkNotNullParameter(widget, "widget");
                i0.b0("https://h5.fleximfb.com/cash/protocol/debit-card/bill-agreement");
                break;
            case 14:
                Intrinsics.checkNotNullParameter(widget, "widget");
                i0.b0("https://h5.fleximfb.com/cash/protocol/debit-card/flexi-mfb");
                break;
            case 15:
                Intrinsics.checkNotNullParameter(widget, "widget");
                Eb.a.n();
                break;
            case 16:
                Intrinsics.checkNotNullParameter(widget, "widget");
                Eb.a.p();
                break;
            default:
                Intrinsics.checkNotNullParameter(widget, "widget");
                Eb.a.o();
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        switch (this.f1846a) {
            case 0:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(this.f1847b);
                ds.setUnderlineText(true);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(this.f1847b);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(this.f1847b);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(this.f1847b);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(this.f1847b);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(this.f1847b);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(this.f1847b);
                break;
            case 7:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(this.f1847b);
                break;
            case 8:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(this.f1847b);
                break;
            case 9:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(this.f1847b);
                break;
            case 10:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(this.f1847b);
                break;
            case 11:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(this.f1847b);
                break;
            case 12:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setUnderlineText(true);
                ds.setColor(this.f1847b);
                break;
            case 13:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                int i7 = this.f1847b;
                ds.linkColor = i7;
                ds.setColor(i7);
                ds.setUnderlineText(true);
                break;
            case 14:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                int i10 = this.f1847b;
                ds.linkColor = i10;
                ds.setColor(i10);
                ds.setUnderlineText(true);
                break;
            case 15:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(this.f1847b);
                break;
            case 16:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(this.f1847b);
                break;
            default:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(this.f1847b);
                break;
        }
    }
}
