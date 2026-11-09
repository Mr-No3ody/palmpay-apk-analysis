package p382zb;

import Pa.i0;
import Ya.b;
import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.credit.bean.ApplyProtoContent;
import com.transsnet.palmpay.credit.ui.fragment.OcProtocolLockFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OcProtocolLockFragment f44587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ApplyProtoContent f44588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f44589c;

    public h0(OcProtocolLockFragment ocProtocolLockFragment, ApplyProtoContent applyProtoContent, Context context) {
        this.f44587a = ocProtocolLockFragment;
        this.f44588b = applyProtoContent;
        this.f44589c = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Integer num = this.f44588b.clickType;
        this.f44587a.getClass();
        if (num != null && num.intValue() == 1) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "okc");
            d.x(bundle, "TermsAndConditions");
            return;
        }
        if (num != null && num.intValue() == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("type", "okc");
            d.x(bundle2, "PrivacyPolicy");
        } else {
            if (num != null && num.intValue() == 3) {
                i0.b0("/#/protocol/okcard/NG/Disclaimer");
                return;
            }
            if (num != null && num.intValue() == 4) {
                i0.b0("/#/protocol/okcard/NG/PhoneBlockAuthorizationLetter");
            } else if (num != null && num.intValue() == 5) {
                i0.b0("/#/protocol/okcard/NG/TermsOfSecuritySolutionService");
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        ds.setColor(this.f44589c.getColor(b.cs_oc_proto_txt_color));
        ds.setUnderlineText(false);
    }
}
