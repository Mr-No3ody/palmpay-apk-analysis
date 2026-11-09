package com.transsnet.palmpay.core.dialog;

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
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.List;
import p025ba.l;
import p052da.C1634f;

/* JADX INFO: loaded from: classes3.dex */
public class NgSelectBankCardDialog extends com.transsnet.palmpay.custom_view.dialog.b {
    private String mAddBankCardTitle;
    private List<BankCardInfo> mBankCardInfos;
    private C1634f mBankCardListAdapter;
    private CallBack mCallBack;
    private boolean mCheckPositionAtFooter;
    private ImageView mCloseIv;
    private String mDialogTitle;
    private BankCardInfo mNowSelectedBankCard;
    private View.OnClickListener mOnClickListener;
    private RecyclerView mRecyclerView;
    private TextView mTitleTv;

    public interface CallBack {
        void onAddBankcardClick();

        void onChooseBankClick(BankCardInfo data);
    }

    public NgSelectBankCardDialog(Context context) {
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
            C1634f c1634f = this.mBankCardListAdapter;
            int adapterPosition = viewHolder.getAdapterPosition();
            if (adapterPosition < 0) {
                c1634f.getClass();
            } else {
                c1634f.f35769f = adapterPosition;
                c1634f.notifyDataSetChanged();
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
        C1634f c1634f = this.mBankCardListAdapter;
        if (iFindNowSelectedPosition < 0) {
            c1634f.getClass();
        } else {
            c1634f.f35769f = iFindNowSelectedPosition;
            c1634f.notifyDataSetChanged();
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

    public int findNowSelectedPositionByAccountNo(String bankAccountNo) {
        for (int i7 = 0; i7 < this.mBankCardInfos.size(); i7++) {
            BankCardInfo bankCardInfo = this.mBankCardInfos.get(i7);
            if (bankCardInfo != null && !TextUtils.isEmpty(bankAccountNo) && bankAccountNo.equals(bankCardInfo.bankAccountNo)) {
                this.mNowSelectedBankCard = bankCardInfo;
                return i7;
            }
        }
        return -1;
    }

    public void initNowSelectedBankCard(BankCardInfo bankCardInfo) {
        this.mNowSelectedBankCard = bankCardInfo;
        queryAndUpdateSelectedPosition(bankCardInfo);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(p025ba.g.core_dialog_ng_select_bank_account);
        this.mCloseIv = (ImageView) findViewById(p025ba.e.cdspm_close_iv);
        this.mTitleTv = (TextView) findViewById(p025ba.e.cdspm_title_tv);
        this.mRecyclerView = (RecyclerView) findViewById(p025ba.e.cdspm_rcv);
        if (!TextUtils.isEmpty(this.mDialogTitle)) {
            this.mTitleTv.setText(this.mDialogTitle);
        }
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
        C1634f c1634f = new C1634f(this.mContext);
        c1634f.f35768e = false;
        c1634f.f35769f = -1;
        c1634f.f35770g = true;
        this.mBankCardListAdapter = c1634f;
        this.mRecyclerView.setAdapter(c1634f);
        List<BankCardInfo> list = this.mBankCardInfos;
        if (list != null) {
            C1634f c1634f2 = this.mBankCardListAdapter;
            c1634f2.f4985b = list;
            c1634f2.notifyDataSetChanged();
        }
        resetRevHeight();
        BankCardInfo bankCardInfo = this.mNowSelectedBankCard;
        if (bankCardInfo != null) {
            queryAndUpdateSelectedPosition(bankCardInfo);
        }
        C1634f c1634f3 = this.mBankCardListAdapter;
        c1634f3.f4986c = new p185ma.j(this);
        c1634f3.f4987d = new p185ma.j(this);
        c1634f3.f35768e = this.mCheckPositionAtFooter;
        c1634f3.notifyDataSetChanged();
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
        window.setAttributes(attributes);
        e eVar = new e(this);
        this.mOnClickListener = eVar;
        this.mTitleTv.setOnClickListener(eVar);
        this.mCloseIv.setOnClickListener(this.mOnClickListener);
    }

    public void setAddBankCardTitle(String title) {
        this.mAddBankCardTitle = title;
    }

    public void setBankCardInfos(List<BankCardInfo> bankCardInfos) {
        C1634f c1634f;
        this.mBankCardInfos = bankCardInfos;
        if (bankCardInfos != null && (c1634f = this.mBankCardListAdapter) != null) {
            c1634f.f4985b = bankCardInfos;
            c1634f.notifyDataSetChanged();
        }
        if (this.mRecyclerView != null) {
            resetRevHeight();
        }
    }

    public void setBankCardNum(String num) {
        this.mTitleTv.setText(num);
    }

    public void setCallBack(CallBack callBack) {
        this.mCallBack = callBack;
    }

    public void setCheckPositionAtFooter(boolean checkPositionAtFooter) {
        this.mCheckPositionAtFooter = checkPositionAtFooter;
        C1634f c1634f = this.mBankCardListAdapter;
        if (c1634f != null) {
            c1634f.f35768e = checkPositionAtFooter;
            c1634f.notifyDataSetChanged();
        }
    }

    public void setDialogTitle(String title) {
        this.mDialogTitle = title;
        TextView textView = this.mTitleTv;
        if (textView != null) {
            textView.setText(title);
        }
    }

    public NgSelectBankCardDialog(Context context, int layoutId) {
        super(context, layoutId);
        this.mCheckPositionAtFooter = false;
    }

    public NgSelectBankCardDialog(Context context, int layoutId, int styleId) {
        super(context, layoutId, styleId);
        this.mCheckPositionAtFooter = false;
    }
}
