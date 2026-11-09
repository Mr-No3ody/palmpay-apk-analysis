package p369yd;

import android.os.Handler;
import android.os.Message;
import android.widget.LinearLayout;
import com.transsnet.palmpay.send_money.ui.activity.topp.InputMobileActivity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p255qd.v;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f44284a;

    static {
        new b(null);
    }

    public c(InputMobileActivity inputMobileActivity) {
        this.f44284a = new WeakReference(inputMobileActivity);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        super.handleMessage(msg);
        if (msg.what == 1) {
            Object obj = msg.obj;
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            InputMobileActivity inputMobileActivity = (InputMobileActivity) this.f44284a.get();
            if (inputMobileActivity != null) {
                int i7 = InputMobileActivity.f33535Z;
                Object value = inputMobileActivity.f33549f.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                h.C((LinearLayout) value);
                v vVar = (v) inputMobileActivity.f27350a;
                if (vVar != null) {
                    vVar.queryMemberDetailByKeyword(str, inputMobileActivity.f33544Y);
                }
            }
        }
    }
}
