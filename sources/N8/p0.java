package N8;

import android.view.View;
import com.transsnet.palmpay.account.ui.activity.VerifyRealNameActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.TitleEditView;
import java.util.List;
import p051d9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VerifyRealNameActivity f6250b;

    public /* synthetic */ p0(VerifyRealNameActivity verifyRealNameActivity, int i7) {
        this.f6249a = i7;
        this.f6250b = verifyRealNameActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean zM;
        VerifyRealNameActivity verifyRealNameActivity = this.f6250b;
        switch (this.f6249a) {
            case 0:
                int i7 = VerifyRealNameActivity.f26075p;
                TitleEditView titleEditView = verifyRealNameActivity.f26078d;
                String editText = titleEditView != null ? titleEditView.getEditText() : "";
                TitleEditView titleEditView2 = verifyRealNameActivity.f26080f;
                if (!editText.equalsIgnoreCase(titleEditView2 != null ? titleEditView2.getEditText() : "")) {
                    List list = verifyRealNameActivity.f26082i;
                    if (list == null || list.isEmpty()) {
                        ((u0) verifyRealNameActivity.f27350a).getRegularRule(true);
                        zM = false;
                    } else {
                        zM = verifyRealNameActivity.m();
                    }
                    if (zM) {
                        verifyRealNameActivity.n();
                        break;
                    }
                } else {
                    verifyRealNameActivity.f26080f.setError(verifyRealNameActivity.getString(BaseApplication.isNG() ? F8.h.ac_msg_name_can_not_same_ng : F8.h.ac_msg_name_can_not_same));
                    break;
                }
                break;
            case 1:
                int i10 = VerifyRealNameActivity.f26075p;
                verifyRealNameActivity.finish();
                break;
            default:
                int i11 = VerifyRealNameActivity.f26075p;
                verifyRealNameActivity.finish();
                break;
        }
    }
}
