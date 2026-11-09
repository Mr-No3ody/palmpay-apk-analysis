package com.transsnet.palmpay.cash_in.ui.dialog;

import F9.c;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.BankCardInfo;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.model.ModelAddBankCard;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.List;
import p025ba.e;
import p025ba.g;
import p025ba.l;
import p052da.C1632d;

/* JADX INFO: loaded from: classes3.dex */
public class SelectPaymentBankCardDialog extends b {
    private String mAddBankCardTitle;
    private List<BankCardInfo> mBankCardInfos;
    private C1632d mBankCardListAdapter;
    private CallBack mCallBack;
    private boolean mCheckPositionAtFooter;
    private ImageView mCloseIv;
    private String mDialogTitle;
    private ModelAddBankCard mModelAddBankCard;
    private BankCardInfo mNowSelectedBankCard;
    private View.OnClickListener mOnClickListener;
    private RecyclerView mRecyclerView;
    private TextView mTitleTv;

    public interface CallBack {
        void onAddBankcardClick();

        void onChooseBankClick(BankCardInfo bankCardInfo);
    }

    public SelectPaymentBankCardDialog(Context context) {
        super(context);
        this.mCheckPositionAtFooter = false;
    }

    private int findNowSelectedPosition(BankCardInfo bankCardInfo) {
        for (int i7 = 0; i7 < this.mBankCardInfos.size(); i7++) {
            BankCardInfo bankCardInfo2 = this.mBankCardInfos.get(i7);
            if (bankCardInfo2 != null && ((!TextUtils.isEmpty(bankCardInfo.bankAccountNo) && bankCardInfo.bankAccountNo.equals(bankCardInfo2.bankAccountNo)) || ((!TextUtils.isEmpty(bankCardInfo.cardNo) && bankCardInfo.cardNo.equals(bankCardInfo2.cardNo)) || (!TextUtils.isEmpty(bankCardInfo.phone) && bankCardInfo.phone.equals(bankCardInfo2.phone))))) {
                return i7;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initViews$0(View view, BankCardInfo bankCardInfo, RecyclerView.ViewHolder viewHolder) {
        CallBack callBack = this.mCallBack;
        if (callBack != null) {
            callBack.onChooseBankClick(bankCardInfo);
            C1632d c1632d = this.mBankCardListAdapter;
            int adapterPosition = viewHolder.getAdapterPosition();
            if (adapterPosition < 0) {
                c1632d.getClass();
            } else {
                c1632d.f35760f = adapterPosition;
                c1632d.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$1(View view, RecyclerView.ViewHolder viewHolder) {
        CallBack callBack = this.mCallBack;
        if (callBack != null) {
            callBack.onAddBankcardClick();
        }
    }

    private void queryAndUpdateSelectedPosition(BankCardInfo bankCardInfo) {
        if (bankCardInfo == null || this.mBankCardListAdapter == null) {
            return;
        }
        int iFindNowSelectedPosition = findNowSelectedPosition(bankCardInfo);
        C1632d c1632d = this.mBankCardListAdapter;
        if (iFindNowSelectedPosition < 0) {
            c1632d.getClass();
        } else {
            c1632d.f35760f = iFindNowSelectedPosition;
            c1632d.notifyDataSetChanged();
        }
    }

    private void resetRevHeight() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mRecyclerView.getLayoutParams();
        List<BankCardInfo> list = this.mBankCardInfos;
        if (list == null || list.size() <= 3) {
            layoutParams.height = -2;
        } else {
            layoutParams.height = SizeUtils.dp2px(210.0f);
        }
    }

    public void initNowSelectedBankCard(BankCardInfo bankCardInfo) {
        this.mNowSelectedBankCard = bankCardInfo;
        queryAndUpdateSelectedPosition(bankCardInfo);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(g.core_dialog_select_payment_method);
        this.mCloseIv = (ImageView) findViewById(e.cdspm_close_iv);
        this.mTitleTv = (TextView) findViewById(e.cdspm_title_tv);
        this.mRecyclerView = (RecyclerView) findViewById(e.cdspm_rcv);
        this.mModelAddBankCard = (ModelAddBankCard) findViewById(e.cdspm_add_bank_card);
        if (!TextUtils.isEmpty(this.mAddBankCardTitle)) {
            this.mModelAddBankCard.f31422c.setText(this.mAddBankCardTitle);
        }
        if (!TextUtils.isEmpty(this.mDialogTitle)) {
            this.mTitleTv.setText(this.mDialogTitle);
        }
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
        C1632d c1632d = new C1632d(this.mContext);
        c1632d.f35759e = false;
        c1632d.f35760f = -1;
        c1632d.f35761g = true;
        this.mBankCardListAdapter = c1632d;
        this.mRecyclerView.setAdapter(c1632d);
        List<BankCardInfo> list = this.mBankCardInfos;
        if (list != null) {
            C1632d c1632d2 = this.mBankCardListAdapter;
            c1632d2.f4985b = list;
            c1632d2.notifyDataSetChanged();
        }
        resetRevHeight();
        BankCardInfo bankCardInfo = this.mNowSelectedBankCard;
        if (bankCardInfo != null) {
            queryAndUpdateSelectedPosition(bankCardInfo);
        }
        C1632d c1632d3 = this.mBankCardListAdapter;
        c1632d3.f4986c = new c(this);
        c1632d3.f4987d = new c(this);
        c1632d3.f35759e = this.mCheckPositionAtFooter;
        c1632d3.notifyDataSetChanged();
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
        window.setAttributes(attributes);
        a aVar = new a(this);
        this.mOnClickListener = aVar;
        this.mTitleTv.setOnClickListener(aVar);
        this.mModelAddBankCard.setOnClickListener(this.mOnClickListener);
        this.mCloseIv.setOnClickListener(this.mOnClickListener);
    }

    public void setAddBankCardTitle(String str) {
        this.mAddBankCardTitle = str;
        ModelAddBankCard modelAddBankCard = this.mModelAddBankCard;
        if (modelAddBankCard != null) {
            modelAddBankCard.f31422c.setText(str);
        }
    }

    public void setBankCardInfos(List<BankCardInfo> list) {
        C1632d c1632d;
        this.mBankCardInfos = list;
        if (list != null && (c1632d = this.mBankCardListAdapter) != null) {
            c1632d.f4985b = list;
            c1632d.notifyDataSetChanged();
        }
        if (this.mRecyclerView != null) {
            resetRevHeight();
        }
    }

    public void setBankCardNum(String str) {
        this.mTitleTv.setText(str);
    }

    public void setCallBack(CallBack callBack) {
        this.mCallBack = callBack;
    }

    public void setCheckPositionAtFooter(boolean z3) {
        this.mCheckPositionAtFooter = z3;
        C1632d c1632d = this.mBankCardListAdapter;
        if (c1632d != null) {
            c1632d.f35759e = z3;
            c1632d.notifyDataSetChanged();
        }
    }

    public void setDialogTitle(String str) {
        this.mDialogTitle = str;
        TextView textView = this.mTitleTv;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public SelectPaymentBankCardDialog(Context context, int i7) {
        super(context, i7);
        this.mCheckPositionAtFooter = false;
    }

    public SelectPaymentBankCardDialog(Context context, int i7, int i10) {
        super(context, i7, i10);
        this.mCheckPositionAtFooter = false;
    }
}
