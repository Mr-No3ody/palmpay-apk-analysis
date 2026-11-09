package com.transsnet.palmpay.core.dialog;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.BaseData;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.custom_view.indexrecycleview.IndexFastScrollRecyclerView;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p025ba.k;
import p025ba.l;
import p052da.C1630b;
import p052da.a0;

/* JADX INFO: loaded from: classes3.dex */
public class SelectBankDialogV2 extends com.transsnet.palmpay.custom_view.dialog.b {
    private boolean isLoading;
    private C1630b mBankInfoListAdapter;
    private List<BankInfo> mBankInfos;
    private CallBack mCallBack;
    private ImageView mCloseIv;
    private BaseData mNowSelectedItem;
    private List<PaymentMethod> mPayMethods;
    private IndexFastScrollRecyclerView mRecyclerView;
    private a0 mTextTitleDecoration;
    private TextView mTitleTv;
    private View mViewRoot;

    public interface CallBack {
        void onChooseBankClick(BankInfo data);

        void onClickPayMethod(PaymentMethod data);
    }

    public SelectBankDialogV2(Context context) {
        super(context);
    }

    private void addTitleDecoration(String[] titles) {
        List<PaymentMethod> list = this.mPayMethods;
        if (list == null || list.size() == 0) {
            a0 a0Var = this.mTextTitleDecoration;
            if (a0Var != null) {
                this.mRecyclerView.removeItemDecoration(a0Var);
                return;
            }
            return;
        }
        if (this.mTextTitleDecoration == null) {
            int size = this.mPayMethods.size();
            a0 a0Var2 = new a0();
            BaseApplication baseApplication = BaseApplication.getInstance();
            a0Var2.f35746a = baseApplication;
            baseApplication.getResources().getString(k.core_cards);
            baseApplication.getResources().getString(k.core_banks);
            a0Var2.f35752g = -1;
            a0Var2.f35747b = titles;
            Paint paint = new Paint();
            a0Var2.f35748c = paint;
            paint.setAntiAlias(true);
            a0Var2.f35749d = new Rect();
            DisplayMetrics displayMetrics = BaseApplication.getInstance().getResources().getDisplayMetrics();
            int i7 = (int) displayMetrics.density;
            a0Var2.f35751f = i7;
            a0Var2.f35750e = displayMetrics.widthPixels;
            a0Var2.f35748c.setTextSize(i7 * 14);
            a0Var2.f35754i = a0Var2.f35751f * 30;
            if (a0Var2.f35753h > 0) {
                a0Var2.f35753h = size;
                a0Var2.f35752g = -1;
            } else {
                a0Var2.f35753h = size;
                a0Var2.f35752g = 0;
            }
            this.mTextTitleDecoration = a0Var2;
            this.mRecyclerView.addItemDecoration(a0Var2);
        }
    }

    private int findNowSelectedPosition(BankInfo bankInfo) {
        if (this.mBankInfos == null) {
            return -1;
        }
        for (int i7 = 0; i7 < this.mBankInfos.size(); i7++) {
            BankInfo bankInfo2 = this.mBankInfos.get(i7);
            if (bankInfo2 != null && !TextUtils.isEmpty(bankInfo.bankCode) && bankInfo.bankCode.equals(bankInfo2.bankCode)) {
                List<PaymentMethod> list = this.mPayMethods;
                return list != null ? list.size() + i7 : i7;
            }
        }
        return -1;
    }

    private void queryAndUpdateSelectedPosition(BaseData data) {
        if (data instanceof BankInfo) {
            queryAndUpdateSelectedPosition((BankInfo) data);
        }
        if (data instanceof PaymentMethod) {
            queryAndUpdateSelectedPosition((PaymentMethod) data);
        }
    }

    private void removeNotBankAccountPayMethods() {
        Iterator<PaymentMethod> it = this.mPayMethods.iterator();
        while (it.hasNext()) {
            PaymentMethod next = it.next();
            if (next.payType != 7 || TextUtils.isEmpty(next.cardNo) || TextUtils.isEmpty(next.bankCode)) {
                it.remove();
            }
        }
    }

    private void removeNotBankCardPayMethods() {
        Iterator<PaymentMethod> it = this.mPayMethods.iterator();
        while (it.hasNext()) {
            PaymentMethod next = it.next();
            if (next.payType != 2 || TextUtils.isEmpty(next.cardNo) || TextUtils.isEmpty(next.bankCode)) {
                it.remove();
            }
        }
    }

    private void updateListData() {
        C1630b c1630b = this.mBankInfoListAdapter;
        if (c1630b != null) {
            c1630b.b();
            List<PaymentMethod> list = this.mPayMethods;
            if (list != null) {
                this.mBankInfoListAdapter.a(list);
            }
            List<BankInfo> list2 = this.mBankInfos;
            if (list2 != null) {
                this.mBankInfoListAdapter.a(list2);
            }
            List<PaymentMethod> list3 = this.mPayMethods;
            if (list3 != null) {
                C1630b c1630b2 = this.mBankInfoListAdapter;
                list3.size();
                c1630b2.getClass();
            }
            this.mBankInfoListAdapter.notifyDataSetChanged();
        }
    }

    public List<BankInfo> getBankInfos() {
        if (this.mBankInfos == null) {
            this.mBankInfos = new ArrayList();
        }
        return this.mBankInfos;
    }

    public void initNowSelectedBankCard(BaseData data) {
        this.mNowSelectedItem = data;
        queryAndUpdateSelectedPosition(data);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(p025ba.g.core_dialog_select_bank_method_v2);
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
        C1630b c1630b = new C1630b(this.mContext);
        c1630b.f35756f = -1;
        c1630b.f35757g = true;
        this.mBankInfoListAdapter = c1630b;
        this.mRecyclerView.setAdapter(c1630b);
        this.mBankInfoListAdapter.notifyDataSetChanged();
        updateListData();
        BaseData baseData = this.mNowSelectedItem;
        if (baseData != null) {
            queryAndUpdateSelectedPosition(baseData);
        }
        addTitleDecoration(new String[]{this.mContext.getResources().getString(k.core_cards), this.mContext.getResources().getString(k.core_banks)});
        this.mBankInfoListAdapter.f4986c = new h(this);
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
        window.setAttributes(attributes);
        p185ma.e eVar = new p185ma.e(this, 4);
        this.mTitleTv.setOnClickListener(eVar);
        this.mCloseIv.setOnClickListener(eVar);
        this.mViewRoot.getViewTreeObserver().addOnGlobalLayoutListener(new Be.c(this, 16));
    }

    public void setBankCardInfos(List<BankInfo> bankInfos) {
        this.isLoading = false;
        this.mBankInfos = bankInfos;
        updateListData();
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
    }

    public void setPayBankAccount(List<PaymentMethod> payMethods) {
        if (payMethods == null) {
            return;
        }
        this.mPayMethods = payMethods;
        removeNotBankAccountPayMethods();
        addTitleDecoration(new String[]{this.mContext.getResources().getString(k.core_account), this.mContext.getResources().getString(k.core_banks)});
        if (this.mPayMethods != null) {
            updateListData();
        }
    }

    public void setPayMethods(List<PaymentMethod> payMethods) {
        if (payMethods == null) {
            return;
        }
        this.mPayMethods = payMethods;
        removeNotBankCardPayMethods();
        addTitleDecoration(new String[]{this.mContext.getResources().getString(k.core_cards), this.mContext.getResources().getString(k.core_banks)});
        if (this.mPayMethods != null) {
            updateListData();
        }
    }

    public void setTitle(String title) {
        TextView textView;
        if (TextUtils.isEmpty(title) || (textView = this.mTitleTv) == null) {
            return;
        }
        textView.setText(title);
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        super.show();
        BaseData baseData = this.mNowSelectedItem;
        if (baseData != null) {
            initNowSelectedBankCard(baseData);
        }
    }

    public SelectBankDialogV2(Context context, int layoutId) {
        super(context, layoutId);
    }

    public SelectBankDialogV2(Context context, int layoutId, int styleId) {
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

    private void queryAndUpdateSelectedPosition(BankInfo bankCardInfo) {
        if (bankCardInfo == null || this.mBankInfoListAdapter == null) {
            return;
        }
        int iFindNowSelectedPosition = findNowSelectedPosition(bankCardInfo);
        C1630b c1630b = this.mBankInfoListAdapter;
        if (iFindNowSelectedPosition >= 0) {
            c1630b.f35756f = iFindNowSelectedPosition;
            c1630b.notifyDataSetChanged();
        } else {
            c1630b.getClass();
        }
    }

    private int findNowSelectedPosition(PaymentMethod paymentMethod) {
        for (int i7 = 0; i7 < this.mPayMethods.size(); i7++) {
            PaymentMethod paymentMethod2 = this.mPayMethods.get(i7);
            if (paymentMethod2 != null && !TextUtils.isEmpty(paymentMethod.bankCode) && paymentMethod.cardNo.equals(paymentMethod2.cardNo)) {
                return i7;
            }
        }
        return -1;
    }

    private void queryAndUpdateSelectedPosition(PaymentMethod paymentMethod) {
        if (this.mPayMethods == null || this.mBankInfoListAdapter == null) {
            return;
        }
        int iFindNowSelectedPosition = findNowSelectedPosition(paymentMethod);
        C1630b c1630b = this.mBankInfoListAdapter;
        if (iFindNowSelectedPosition >= 0) {
            c1630b.f35756f = iFindNowSelectedPosition;
            c1630b.notifyDataSetChanged();
        } else {
            c1630b.getClass();
        }
    }
}
