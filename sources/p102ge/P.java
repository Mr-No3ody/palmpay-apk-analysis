package p102ge;

import Ac.h;
import Bc.C0107d;
import O6.c;
import O6.d;
import Pa.n0;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.bean.bill.TransHistroyDownReq;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.ui.activity.TransactionHistoryDownloadActivity;
import com.transsnet.palmpay.util.RegexUtils;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.text.StringsKt;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class P implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransactionHistoryDownloadActivity f37201b;

    public /* synthetic */ P(TransactionHistoryDownloadActivity transactionHistoryDownloadActivity, int i7) {
        this.f37200a = i7;
        this.f37201b = transactionHistoryDownloadActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Editable text;
        String string;
        Editable text2;
        Editable text3;
        IconicsImageView iconicsImageView;
        EditText editText;
        int i7 = 3;
        TransactionHistoryDownloadActivity transactionHistoryDownloadActivity = this.f37201b;
        switch (this.f37200a) {
            case 0:
                TransactionHistoryDownloadActivity.a aVar = TransactionHistoryDownloadActivity.f34576g;
                n0.g().m("TranscationHistoryDownload", "TXNHistoryDL_Submit", "");
                C0107d c0107d = transactionHistoryDownloadActivity.f34580f;
                String string2 = null;
                if (!TextUtils.isEmpty((c0107d == null || (text3 = ((EditText) c0107d.f681c).getText()) == null) ? null : text3.toString())) {
                    C0107d c0107d2 = transactionHistoryDownloadActivity.f34580f;
                    if (!RegexUtils.isEmail((c0107d2 == null || (text2 = ((EditText) c0107d2.f681c).getText()) == null) ? null : text2.toString())) {
                        ToastUtils.showLong(transactionHistoryDownloadActivity.getResources().getString(h.main_email_format_error), new Object[0]);
                    } else {
                        TransHistroyDownReq transHistroyDownReq = transactionHistoryDownloadActivity.f34577c;
                        if (transHistroyDownReq != null) {
                            C0107d c0107d3 = transactionHistoryDownloadActivity.f34580f;
                            if (c0107d3 != null && (text = ((EditText) c0107d3.f681c).getText()) != null && (string = text.toString()) != null) {
                                string2 = StringsKt.V(string).toString();
                            }
                            transHistroyDownReq.receiveEmail = string2;
                        }
                        TransHistroyDownReq transHistroyDownReq2 = transactionHistoryDownloadActivity.f34577c;
                        if (transHistroyDownReq2 != null) {
                            transHistroyDownReq2.includeAddress = transactionHistoryDownloadActivity.f34578d;
                        }
                        c cVar = new c(transactionHistoryDownloadActivity);
                        cVar.f6596b = d.f(transactionHistoryDownloadActivity.getResources().getString(h.main_confirm_your_email));
                        cVar.b(h.main_email_correct);
                        String string3 = transactionHistoryDownloadActivity.getResources().getString(k.core_cancel);
                        P p3 = new P(transactionHistoryDownloadActivity, 2);
                        cVar.f6601g = string3;
                        cVar.f6603i = p3;
                        String string4 = transactionHistoryDownloadActivity.getResources().getString(k.core_confirm);
                        P p10 = new P(transactionHistoryDownloadActivity, i7);
                        cVar.f6600f = string4;
                        cVar.f6602h = p10;
                        d dVarA = cVar.a();
                        transactionHistoryDownloadActivity.f34579e = dVarA;
                        dVarA.show();
                    }
                } else {
                    ToastUtils.showShort(transactionHistoryDownloadActivity.getResources().getString(h.main_hava_not_enter_email), new Object[0]);
                }
                break;
            case 1:
                C0107d c0107d4 = transactionHistoryDownloadActivity.f34580f;
                if (c0107d4 != null && (editText = (EditText) c0107d4.f681c) != null) {
                    editText.setText("");
                }
                C0107d c0107d5 = transactionHistoryDownloadActivity.f34580f;
                if (c0107d5 != null && (iconicsImageView = (IconicsImageView) c0107d5.f682d) != null) {
                    iconicsImageView.setVisibility(8);
                    break;
                }
                break;
            case 2:
                d dVar = transactionHistoryDownloadActivity.f34579e;
                if (dVar != null) {
                    dVar.dismiss();
                }
                break;
            default:
                TransactionHistoryDownloadActivity.a aVar2 = TransactionHistoryDownloadActivity.f34576g;
                n0.g().m("TranscationHistoryDownload", "TXNHistoryDL_Comfirm", "");
                ARouter.getInstance().build("/account/authentication").withInt("extra_mode", 3).withBoolean("extra_use_night_mode", true).navigation(transactionHistoryDownloadActivity, MessageEvent.EVENT_CREATE_SAVINGS_PLAN);
                break;
        }
    }
}
