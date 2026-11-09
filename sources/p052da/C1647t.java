package p052da;

import G8.a;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.viewmodel.CashierPayMethodItem;
import kotlin.jvm.functions.Function0;
import p025ba.k;

/* JADX INFO: renamed from: da.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1647t implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1650w f35814b;

    public /* synthetic */ C1647t(C1650w c1650w, int i7) {
        this.f35813a = i7;
        this.f35814b = c1650w;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f35813a) {
            case 0:
                C1650w c1650w = this.f35814b;
                CashierPayMethodItem cashierPayMethodItem = new CashierPayMethodItem(c1650w.getContext(), null, 6, 0);
                ImageView mPayMethodImg = cashierPayMethodItem.getMPayMethodImg();
                if (mPayMethodImg != null) {
                    mPayMethodImg.setImageDrawable(a.s(cashierPayMethodItem.getContext()));
                }
                TextView mPayMethodNameTv = cashierPayMethodItem.getMPayMethodNameTv();
                if (mPayMethodNameTv != null) {
                    mPayMethodNameTv.setText(cashierPayMethodItem.getContext().getString(k.core_add_bank_card_or_bank_account));
                }
                ImageView mRightIv = cashierPayMethodItem.getMRightIv();
                if (mRightIv != null) {
                    mRightIv.setVisibility(8);
                }
                TextView mPayMethodNumTv = cashierPayMethodItem.getMPayMethodNumTv();
                if (mPayMethodNumTv != null) {
                    mPayMethodNumTv.setText("");
                }
                cashierPayMethodItem.e(cashierPayMethodItem.getMHintText(), "");
                cashierPayMethodItem.setOnClickListener(new ViewOnClickListenerC1649v(c1650w, 0));
                return cashierPayMethodItem;
            case 1:
                return Long.valueOf(((Number) this.f35814b.f35824f.invoke()).longValue());
            default:
                return Boolean.valueOf(this.f35814b.f35825g);
        }
    }
}
