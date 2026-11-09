package com.transsnet.palmpay.core.dialog;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.custom_view.indexrecycleview.IndexFastScrollRecyclerView;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.ArrayList;
import java.util.List;
import p025ba.l;
import p052da.C1636h;

/* JADX INFO: loaded from: classes3.dex */
public class SelectBankDialog extends com.transsnet.palmpay.custom_view.dialog.b {
    private boolean isLoading;
    private C1636h mBankInfoListAdapter;
    private List<BankInfo> mBankInfos;
    private CallBack mCallBack;
    private ImageView mCloseIv;
    private BankInfo mNowSelectedBank;
    private IndexFastScrollRecyclerView mRecyclerView;
    private TextView mTitleTv;
    private View mViewRoot;

    public interface CallBack {
        void onChooseBankClick(BankInfo data);
    }

    public SelectBankDialog(Context context) {
        super(context);
    }

    private int findNowSelectedPosition(BankInfo bankInfo) {
        if (this.mBankInfos == null) {
            return -1;
        }
        for (int i7 = 0; i7 < this.mBankInfos.size(); i7++) {
            BankInfo bankInfo2 = this.mBankInfos.get(i7);
            if (bankInfo2 != null && !TextUtils.isEmpty(bankInfo.bankCode) && bankInfo.bankCode.equals(bankInfo2.bankCode)) {
                return i7;
            }
        }
        return -1;
    }

    private void queryAndUpdateSelectedPosition(BankInfo bankCardInfo) {
        if (bankCardInfo == null || this.mBankInfoListAdapter == null) {
            return;
        }
        int iFindNowSelectedPosition = findNowSelectedPosition(bankCardInfo);
        C1636h c1636h = this.mBankInfoListAdapter;
        if (iFindNowSelectedPosition < 0) {
            c1636h.getClass();
        } else {
            c1636h.f35773f = iFindNowSelectedPosition;
            c1636h.notifyDataSetChanged();
        }
    }

    private void resetRevHeight() {
    }

    public List<BankInfo> getBankInfos() {
        if (this.mBankInfos == null) {
            this.mBankInfos = new ArrayList();
        }
        return this.mBankInfos;
    }

    public void initNowSelectedBankCard(BankInfo bankInfo) {
        this.mNowSelectedBank = bankInfo;
        queryAndUpdateSelectedPosition(bankInfo);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(p025ba.g.core_dialog_select_bank_method);
        this.mCloseIv = (ImageView) findViewById(p025ba.e.cdspm_close_iv);
        this.mTitleTv = (TextView) findViewById(p025ba.e.cdspm_title_tv);
        this.mRecyclerView = (IndexFastScrollRecyclerView) findViewById(p025ba.e.cdspm_rcv);
        this.mViewRoot = findViewById(p025ba.e.viewRoot);
        this.mRecyclerView.setTypeface(Typeface.DEFAULT_BOLD);
        this.mRecyclerView.setIndexbarMargin(SizeUtils.dp2px(10.0f));
        this.mRecyclerView.setIndexbarWidth(SizeUtils.dp2px(16.0f));
        this.mRecyclerView.setIndexBarColor(p.transparent);
        this.mRecyclerView.setIndexBarTextColor(L6.b.ppColorTextPrimary);
        this.mRecyclerView.setIndexBarTransparentValue(0.0f);
        this.mRecyclerView.setIndexbarHighLightTextColor(L6.b.ppColorPrimary);
        this.mRecyclerView.setIndexBarHighLightTextVisibility(true);
        this.mRecyclerView.setIndexBarStrokeVisibility(false);
        this.mRecyclerView.setPreviewVisibility(true);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
        C1636h c1636h = new C1636h(this.mContext);
        c1636h.f35773f = -1;
        c1636h.f35774g = true;
        this.mBankInfoListAdapter = c1636h;
        this.mRecyclerView.setAdapter(c1636h);
        this.mBankInfoListAdapter.notifyDataSetChanged();
        resetRevHeight();
        BankInfo bankInfo = this.mNowSelectedBank;
        if (bankInfo != null) {
            queryAndUpdateSelectedPosition(bankInfo);
        }
        this.mBankInfoListAdapter.f4986c = new g(this);
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
        window.setAttributes(attributes);
        p185ma.e eVar = new p185ma.e(this, 3);
        this.mTitleTv.setOnClickListener(eVar);
        this.mCloseIv.setOnClickListener(eVar);
        this.mViewRoot.getViewTreeObserver().addOnGlobalLayoutListener(new Be.c(this, 15));
    }

    public void setBankCardInfos(List<BankInfo> bankInfos) {
        this.isLoading = false;
        this.mBankInfos = bankInfos;
        C1636h c1636h = this.mBankInfoListAdapter;
        if (c1636h != null) {
            c1636h.b();
            this.mBankInfoListAdapter.a(this.mBankInfos);
            this.mBankInfoListAdapter.notifyDataSetChanged();
        }
        if (this.mRecyclerView != null) {
            resetRevHeight();
        }
    }

    public void setCallBack(CallBack callBack) {
        this.mCallBack = callBack;
    }

    public void setLoading() {
        this.isLoading = true;
        if (this.mBankInfos == null) {
            this.mBankInfos = new ArrayList();
        }
        if (this.mBankInfoListAdapter != null) {
            this.mBankInfos.clear();
            for (int i7 = 0; i7 < 4; i7++) {
                this.mBankInfos.add(new BankInfo());
            }
            this.mBankInfoListAdapter.b();
            this.mBankInfoListAdapter.a(this.mBankInfos);
            this.mBankInfoListAdapter.notifyDataSetChanged();
        }
        if (this.mRecyclerView != null) {
            resetRevHeight();
        }
    }

    public void setTitle(String title) {
        TextView textView;
        if (TextUtils.isEmpty(title) || (textView = this.mTitleTv) == null) {
            return;
        }
        textView.setText(title);
    }

    public SelectBankDialog(Context context, int layoutId) {
        super(context, layoutId);
    }

    public SelectBankDialog(Context context, int layoutId, int styleId) {
        super(context, layoutId, styleId);
    }

    @Override // android.app.Dialog
    public void setTitle(@StringRes int strId) {
        TextView textView = this.mTitleTv;
        if (textView == null) {
            return;
        }
        textView.setText(strId);
    }
}
