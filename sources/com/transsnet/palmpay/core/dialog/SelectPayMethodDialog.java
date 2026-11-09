package com.transsnet.palmpay.core.dialog;

import Pa.i0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.bill.TransTypeUtils;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.bean.rsp.ActivityConfig;
import com.transsnet.palmpay.core.bean.rsp.OkCardPreCreditInfoRsp;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p052da.S;
import p185ma.o;

/* JADX INFO: loaded from: classes3.dex */
public class SelectPayMethodDialog extends com.transsnet.palmpay.custom_view.dialog.b implements View.OnClickListener {
    private AbstractActivityC1479m basePreviewActivity;
    private List<ActivityConfig> mActivityConfigs;
    private S mAdapter;
    private CallBack mCallBack;
    private ImageView mCloseIv;
    private boolean mIsFundType;
    private PaymentMethod mNowSelectedPayMethod;
    public OkCardPreCreditInfoRsp mOkCardPreCreditInfo;
    private long mPayAmount;
    private List<PaymentMethod> mPayMethods;
    private int mPaymentMethodOptions;
    private RecyclerView mRecyclerView;
    private boolean mShowFooterAddCardItem;
    private String mTitleText;
    private TextView mTitleTv;
    private String mTransType;
    private View mViewRoot;

    public interface CallBack {
        void onAddNewBankAccountClick();

        void onAddNewBankCardClick();

        void onAddNewBankCardOrBankAccountClick();

        void onChoosePayMethodClick(PaymentMethod data, PreviewPayInfoResp.DataBean responseData);

        void onUseUSSDClick();
    }

    public SelectPayMethodDialog(Context context) {
        super(context);
        this.mShowFooterAddCardItem = true;
        this.mIsFundType = false;
        if (context != null && (context instanceof AbstractActivityC1479m)) {
            this.basePreviewActivity = (AbstractActivityC1479m) context;
        }
        this.mActivityConfigs = new ArrayList();
    }

    private int findNowSelectedPosition(PaymentMethod pm) {
        if (pm == null) {
            return -1;
        }
        for (int i7 = 0; i7 < this.mPayMethods.size(); i7++) {
            PaymentMethod paymentMethod = this.mPayMethods.get(i7);
            if (paymentMethod != null) {
                if (pm.payType != 1 || paymentMethod.payType != 1) {
                    if (paymentMethod.senderAccountType == 23) {
                        String str = pm.bankCode;
                        if (str == null || !str.equals(paymentMethod.bankCode)) {
                        }
                    } else if ((TextUtils.isEmpty(pm.cardNo) || !pm.cardNo.equals(paymentMethod.cardNo)) && ((TextUtils.isEmpty(pm.accountId) || !pm.accountId.equals(paymentMethod.accountId)) && (TextUtils.isEmpty(pm.bankAccountNo) || !pm.bankAccountNo.equals(paymentMethod.bankAccountNo)))) {
                    }
                }
                return i7;
            }
        }
        return -1;
    }

    private boolean hasOkCard(List<PaymentMethod> datas) {
        if (datas == null) {
            return false;
        }
        Iterator<PaymentMethod> it = datas.iterator();
        while (it.hasNext()) {
            if (it.next().senderAccountType == 28) {
                return true;
            }
        }
        return false;
    }

    private boolean haveBalanceAccountItem(List<PaymentMethod> mPayMethods) {
        Iterator<PaymentMethod> it = mPayMethods.iterator();
        while (it.hasNext()) {
            if (it.next().senderAccountType == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$0(View view, PaymentMethod paymentMethod, RecyclerView.ViewHolder viewHolder) {
        if (paymentMethod.availableBalance < this.mPayAmount) {
            int i7 = paymentMethod.senderAccountType;
            if (i7 == 27) {
                return;
            }
            if (i7 == 1) {
                com.palmpay.lib.apm.launchcounter.util.d.F("/cashin_out/add_money");
                setSelectedPayMethod(paymentMethod);
                dismiss();
                return;
            }
        }
        queryPreviewInfo(paymentMethod, viewHolder.getAdapterPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$1(View view, RecyclerView.ViewHolder viewHolder) {
        int id2 = view.getId();
        if (id2 == p025ba.e.pmlf_use_new_bank_card) {
            this.mCallBack.onAddNewBankCardClick();
            return;
        }
        if (id2 == p025ba.e.pmlf_use_new_bank_account) {
            this.mCallBack.onAddNewBankAccountClick();
        } else if (id2 == p025ba.e.pmlf_use_new_bank_card_and_bank_account) {
            this.mCallBack.onAddNewBankCardOrBankAccountClick();
        } else if (id2 == p025ba.e.pmlf_use_ussd) {
            this.mCallBack.onUseUSSDClick();
        }
    }

    private void queryAndUpdateSelectedPosition(PaymentMethod pm) {
        if (this.mAdapter != null) {
            int iFindNowSelectedPosition = findNowSelectedPosition(pm);
            S s3 = this.mAdapter;
            s3.f35731o = iFindNowSelectedPosition;
            s3.notifyDataSetChanged();
        }
    }

    private void queryPreviewInfo(PaymentMethod data, int adapterPosition) {
        if (!TransTypeUtils.isUseNewQueryPaymentMethodDialog(this.mTransType) || !i0.W(this.basePreviewActivity)) {
            changePayMethodPosition(data, adapterPosition);
            return;
        }
        this.basePreviewActivity.showLoadingDialog(true);
        if (this.basePreviewActivity.v() == null) {
            changePayMethodPosition(data, adapterPosition);
            return;
        }
        PreviewPayInfoV2Req previewPayInfoV2ReqV = this.basePreviewActivity.v();
        previewPayInfoV2ReqV.payerAccountType = String.valueOf(data.senderAccountType);
        ((PayApiService) p324va.c.f43141a.f14621b).queryPreviewPayInfoV2(previewPayInfoV2ReqV).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new j(this, data, adapterPosition));
    }

    public boolean addNewPayMethod(PaymentMethod paymentMethod) {
        List<PaymentMethod> list = this.mPayMethods;
        if (list == null) {
            return false;
        }
        if (haveBalanceAccountItem(list)) {
            this.mPayMethods.add(1, paymentMethod);
        } else {
            this.mPayMethods.add(0, paymentMethod);
        }
        this.mAdapter.notifyDataSetChanged();
        return true;
    }

    public void changePayMethodPosition(PaymentMethod data, int position) {
        CallBack callBack = this.mCallBack;
        if (callBack != null) {
            callBack.onChoosePayMethodClick(data, null);
            S s3 = this.mAdapter;
            s3.f35731o = position;
            s3.notifyDataSetChanged();
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(p025ba.g.core_dialog_select_payment_method);
        this.mCloseIv = (ImageView) findViewById(p025ba.e.cdspm_close_iv);
        this.mTitleTv = (TextView) findViewById(p025ba.e.cdspm_title_tv);
        this.mRecyclerView = (RecyclerView) findViewById(p025ba.e.cdspm_rcv);
        this.mViewRoot = findViewById(p025ba.e.viewRoot);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
        S s3 = new S(this.mContext);
        this.mAdapter = s3;
        s3.f35727f = this.mShowFooterAddCardItem;
        s3.notifyDataSetChanged();
        S s8 = this.mAdapter;
        s8.t = this.mPaymentMethodOptions;
        List<ActivityConfig> list = this.mActivityConfigs;
        ArrayList arrayList = s8.f35733v;
        if (arrayList != null) {
            arrayList.clear();
            arrayList.addAll(list);
            s8.notifyDataSetChanged();
        }
        S s10 = this.mAdapter;
        s10.f35734w = this.mIsFundType;
        this.mRecyclerView.setAdapter(s10);
        setDialogTitle(this.mTitleText);
        List<PaymentMethod> list2 = this.mPayMethods;
        if (list2 != null) {
            S s11 = this.mAdapter;
            s11.f4985b = list2;
            s11.notifyDataSetChanged();
        }
        PaymentMethod paymentMethod = this.mNowSelectedPayMethod;
        if (paymentMethod != null) {
            queryAndUpdateSelectedPosition(paymentMethod);
        }
        S s12 = this.mAdapter;
        s12.f35726e = this.mPayAmount;
        s12.notifyDataSetChanged();
        S s13 = this.mAdapter;
        s13.f4986c = new o(this);
        s13.f4987d = new o(this);
        showAtBottom(getWindow());
        this.mTitleTv.setOnClickListener(this);
        this.mCloseIv.setOnClickListener(this);
        this.mViewRoot.getViewTreeObserver().addOnGlobalLayoutListener(new Be.c(this, 18));
    }

    public void onAddNewCard(PaymentMethod paymentMethod) {
        if (paymentMethod == null) {
            return;
        }
        addNewPayMethod(paymentMethod);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v3) {
        if (v3.getId() == p025ba.e.cdspm_close_iv) {
            CallBack callBack = this.mCallBack;
            if (callBack != null) {
                callBack.onChoosePayMethodClick(null, null);
            }
            dismiss();
        }
    }

    public void setActivityConfigs(List<ActivityConfig> data) {
        ArrayList arrayList;
        List<ActivityConfig> list = this.mActivityConfigs;
        if (list != null && data != null) {
            list.clear();
            this.mActivityConfigs.addAll(data);
        }
        S s3 = this.mAdapter;
        if (s3 == null || data == null || (arrayList = s3.f35733v) == null) {
            return;
        }
        arrayList.clear();
        arrayList.addAll(data);
        s3.notifyDataSetChanged();
    }

    public void setCallBack(CallBack callBack) {
        this.mCallBack = callBack;
    }

    public void setDialogTitle(String titleText) {
        TextView textView;
        this.mTitleText = titleText;
        if (TextUtils.isEmpty(titleText) || (textView = this.mTitleTv) == null) {
            return;
        }
        textView.setText(this.mTitleText);
    }

    public void setIsFundType(boolean isFundType) {
        this.mIsFundType = isFundType;
        S s3 = this.mAdapter;
        if (s3 != null) {
            s3.f35734w = isFundType;
            s3.notifyDataSetChanged();
        }
    }

    public void setOkCardPreCreditInfo(OkCardPreCreditInfoRsp info) {
        List<PaymentMethod> list;
        this.mOkCardPreCreditInfo = info;
        if (info == null || !info.canShowAtPaymentMethodDialog() || (list = this.mPayMethods) == null || hasOkCard(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.mPayMethods);
        setPayMethods(arrayList);
    }

    public void setPayAmount(long amount) {
        this.mPayAmount = amount;
        S s3 = this.mAdapter;
        if (s3 != null) {
            s3.f35726e = amount;
            s3.notifyDataSetChanged();
        }
    }

    public void setPayMethods(List<PaymentMethod> payMethods) {
        OkCardPreCreditInfoRsp okCardPreCreditInfoRsp;
        if (payMethods != null) {
            if (hasOkCard(payMethods) || (okCardPreCreditInfoRsp = this.mOkCardPreCreditInfo) == null || !okCardPreCreditInfoRsp.canShowAtPaymentMethodDialog()) {
                this.mPayMethods = payMethods;
            } else {
                this.mPayMethods = new ArrayList();
                PaymentMethod paymentMethod = new PaymentMethod();
                paymentMethod.senderAccountType = 28;
                paymentMethod.mOkCardPreCreditInfo = this.mOkCardPreCreditInfo;
                this.mPayMethods.add(paymentMethod);
                this.mPayMethods.addAll(payMethods);
            }
            S s3 = this.mAdapter;
            if (s3 != null) {
                s3.f4985b = this.mPayMethods;
                s3.notifyDataSetChanged();
            }
        }
    }

    public void setPaymentMethodOptions(int options) {
        this.mPaymentMethodOptions = options;
        S s3 = this.mAdapter;
        if (s3 != null) {
            s3.t = options;
        }
    }

    public void setSelectedPayMethod(PaymentMethod pm) {
        this.mNowSelectedPayMethod = pm;
        queryAndUpdateSelectedPosition(pm);
    }

    public void setShowFooter(boolean showFooter) {
        this.mShowFooterAddCardItem = showFooter;
        S s3 = this.mAdapter;
        if (s3 != null) {
            s3.f35727f = showFooter;
            s3.notifyDataSetChanged();
        }
    }

    public void setTransType(String transType) {
        this.mTransType = transType;
        if (TransType.TRANS_TYPE_CASH_BOX_DEPOSIT.equals(transType) || TransType.TRANS_TYPE_FIXED_SAVING.equals(transType)) {
            setShowFooter(false);
        }
    }

    public SelectPayMethodDialog(Context context, int layoutId) {
        super(context, layoutId);
        this.mShowFooterAddCardItem = true;
        this.mIsFundType = false;
    }

    public SelectPayMethodDialog(Context context, int layoutId, int styleId) {
        super(context, layoutId, styleId);
        this.mShowFooterAddCardItem = true;
        this.mIsFundType = false;
    }
}
