package D9;

import Pa.r0;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.camera.core.impl.utils.n;
import com.transsnet.palmpay.cash_in.ui.activity.RecordListActivity;
import com.transsnet.palmpay.cash_in.ui.activity.instruction.InterBankCashInInstructionActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterBankCashInInstructionActivity f1723b;

    public /* synthetic */ f(InterBankCashInInstructionActivity interBankCashInInstructionActivity, int i7) {
        this.f1722a = i7;
        this.f1723b = interBankCashInInstructionActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterBankCashInInstructionActivity interBankCashInInstructionActivity = this.f1723b;
        switch (this.f1722a) {
            case 0:
                InterBankCashInInstructionActivity.a aVar = InterBankCashInInstructionActivity.f26981p;
                Intrinsics.checkNotNullParameter(view, "view");
                int id2 = view.getId();
                if (id2 == L6.f.tv_right) {
                    Intent intent = new Intent(interBankCashInInstructionActivity, (Class<?>) RecordListActivity.class);
                    intent.putExtra("extra_type", "01");
                    interBankCashInInstructionActivity.startActivity(intent);
                    break;
                } else if (id2 != p366y9.b.ivCopy) {
                    if (id2 == p366y9.b.tvShare) {
                        com.facebook.imagepipeline.nativecode.b.D(interBankCashInInstructionActivity, interBankCashInInstructionActivity.getString(p366y9.d.ci_bank_transfer_content, r0.Z(BaseApplication.getInstance().getUser().getPhoneNumber()), interBankCashInInstructionActivity.f26989i));
                    }
                    break;
                } else {
                    CharSequence text = interBankCashInInstructionActivity.m().getText();
                    if (!TextUtils.isEmpty(text)) {
                        ClipboardUtils.copyText(y.k(text.toString(), " ", ""));
                        n.v(p366y9.d.ci_account_no_copied);
                        break;
                    }
                }
                break;
            case 1:
                InterBankCashInInstructionActivity.a aVar2 = InterBankCashInInstructionActivity.f26981p;
                TextView textViewM = interBankCashInInstructionActivity.m();
                CharSequence text2 = textViewM != null ? textViewM.getText() : null;
                if (!TextUtils.isEmpty(text2)) {
                    ClipboardUtils.copyText(y.k(String.valueOf(text2), " ", ""));
                    ToastUtils.showLong(p366y9.d.ci_account_no_copied);
                    break;
                }
                break;
            default:
                InterBankCashInInstructionActivity.a aVar3 = InterBankCashInInstructionActivity.f26981p;
                interBankCashInInstructionActivity.l();
                break;
        }
    }
}
