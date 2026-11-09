package com.transsnet.palmpay.core.dialog;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.bill.BillType;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.ArrayList;
import java.util.List;
import p025ba.k;
import p025ba.l;
import p052da.V;
import p185ma.n;

/* JADX INFO: loaded from: classes3.dex */
public class SelectBillTypeDialog extends com.transsnet.palmpay.custom_view.dialog.b {
    private List<BillType> mBillTypes;
    private CallBack mCallBack;
    private RecyclerView.ItemDecoration mItemDecoration;
    private RecyclerView mRecyclerView;
    private V mSelectBillTypeAdapter;
    private int mSelectedPosition;
    private View mViewRoot;
    private boolean showRefund;

    public interface CallBack {
        void onTypeSelected(BillType data);
    }

    public SelectBillTypeDialog(Context context) {
        this(context, true);
    }

    private void initData() {
        List<BillType> list = this.mBillTypes;
        if (list == null || list.size() <= 0) {
            this.mBillTypes = new ArrayList();
            String[] strArr = {null, "03", "04", "01,28", TransType.BILL_TYPE_REFUND, "02,97", "15", "16", "17", "29", TransType.TRANS_TYPE_P2P_CASH_IN, TransType.TRANS_TYPE_P2P_CASH_OUT, TransType.BILL_TYPE_COMBINE_MERCHANT, TransType.TRANS_TYPE_COMMISSION, TransType.TRANS_TYPE_AUTO_DEDUCT, TransType.TRANS_TYPE_BUNDLE, TransType.BILL_TYPE_REPAY_LOAN, TransType.BILL_TYPE_LUCKY_MONEY, TransType.TRANS_TYPE_THIRD_PARTY_MERCHANT, TransType.TRANS_TYPE_INTERBANK_CASH_IN, TransType.BILL_TYPE_DISBURSEMENT, "86,87,c0", TransType.TRANS_TYPE_BILLER_BETTING, TransType.TRANS_TYPE_GROUP_BUY, TransType.TRANS_TYPE_PALMBUY, TransType.TRANS_TYPE_BILLER_TRANSPORT, TransType.TRANS_TYPE_BILLER_RELIGIOUS, TransType.TRANS_TYPE_BILLER_EDUCATION, TransType.TRANS_TYPE_BILLER_GOVERNMENT_PAYMENTS, TransType.TRANS_TYPE_BILLER_INVOICE_PAYMENTS, TransType.TRANS_TYPE_BILLER_TRAVEL_HOTEL_PAYMENTS, TransType.TRANS_TYPE_BILLER_FINANCIAL_SERVICES_PAYMENTS, TransType.TRANS_TYPE_BILLER_BANKONE_MFBS_PAYMENTS, TransType.TRANS_TYPE_BILLER_PRODUCTS_SERVICES_PAYMENTS, TransType.TRANS_TYPE_BILLER_COWRY_CARD_PAYMENTS, TransType.TRANS_TYPE_BILLER_ONLINE_SHOPPING, TransType.TRANS_TYPE_BILLER_EVENT_TICKET, TransType.TRANS_TYPE_BILLER_DUES_AND_SERVICE_CHARGE, TransType.TRANS_TYPE_BILLER_CREDIT_AND_LOANS, TransType.TRANS_TYPE_BILLER_COMMERCE_RETAIL_TRADE, TransType.TRANS_TYPE_BILLER_ASSOCIATIONS_AND_SOCIETIES, TransType.TRANS_TYPE_FIXED_SAVING, TransType.TRANS_TYPE_FIXED_SAVING_PAID};
            int[] iArr = {k.core_all, k.core_transfer, k.core_top_up_airtime, k.core_fund, k.core_refund, k.core_withdraw, k.core_water, k.core_electricity, k.core_tv, k.core_internet, k.core_p2p_cash_in, k.core_p2p_cash_out, k.core_merchant, k.core_commission, k.core_auto_deduct, k.core_bundle, k.core_repay_loan, k.core_lucky_money, k.core_ticketing, k.core_interbank_transfer, k.core_disbursement, k.core_qrcode_payment, k.core_betting, k.core_group_discount, k.core_palmbuy, k.core_transport_toll, k.core_religious, k.core_education, k.core_biller_government_payments, k.core_biller_invoice_payments, k.core_biller_travel_hotel_payments, k.core_biller_financial_services_payments, k.core_biller_bankone_mfbs_payments, k.core_biller_products_services_payments, k.core_biller_cowry_card_payments, k.core_biller_online_shopping_payments, k.core_biller_event_ticket_payments, k.core_biller_dues_and_service_charge_payments, k.core_biller_credit_and_loans_payments, k.core_biller_commerce_retail_trade_payments, k.core_biller_associations_and_societies_payments, k.core_fixed_saving, k.core_fixed_saving_paid};
            for (int i7 = 0; i7 < 43; i7++) {
                if (!TransType.TRANS_SCENE_REFUND.equals(strArr[i7]) || this.showRefund) {
                    BillType billType = new BillType();
                    billType.type = strArr[i7];
                    billType.typeName = BaseApplication.getContext().getString(iArr[i7]);
                    this.mBillTypes.add(billType);
                }
            }
        }
    }

    private void initRcv() {
        this.mRecyclerView.setLayoutManager(new GridLayoutManager(this.mContext, 3));
        this.mRecyclerView.addItemDecoration(this.mItemDecoration);
        V v3 = new V(this.mContext);
        v3.f35736e = 0;
        this.mSelectBillTypeAdapter = v3;
        v3.f4985b = this.mBillTypes;
        this.mRecyclerView.setAdapter(v3);
        this.mSelectBillTypeAdapter.f4986c = new i(this);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(p025ba.g.core_dialog_select_bill_type);
        this.mRecyclerView = (RecyclerView) findViewById(p025ba.e.dsbt_rcv);
        this.mViewRoot = findViewById(p025ba.e.viewRoot);
        initData();
        initRcv();
        V v3 = this.mSelectBillTypeAdapter;
        v3.f35736e = this.mSelectedPosition;
        v3.notifyDataSetChanged();
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
        window.setAttributes(attributes);
        this.mViewRoot.getViewTreeObserver().addOnGlobalLayoutListener(new Be.c(this, 17));
    }

    public void setCallBack(CallBack callBack) {
        this.mCallBack = callBack;
    }

    public void setSelectedPosition(int selectedPosition) {
        this.mSelectedPosition = selectedPosition;
        V v3 = this.mSelectBillTypeAdapter;
        if (v3 != null) {
            v3.f35736e = selectedPosition;
            v3.notifyDataSetChanged();
        }
    }

    public SelectBillTypeDialog(Context context, boolean showRefund) {
        super(context);
        this.mSelectedPosition = 0;
        this.showRefund = true;
        this.mItemDecoration = new n(this);
        this.showRefund = showRefund;
    }

    public SelectBillTypeDialog(Context context, List<BillType> billTypes) {
        super(context);
        this.mSelectedPosition = 0;
        this.showRefund = true;
        this.mItemDecoration = new n(this);
        this.mBillTypes = billTypes;
    }

    public SelectBillTypeDialog(Context context, int layoutId) {
        super(context, layoutId);
        this.mSelectedPosition = 0;
        this.showRefund = true;
        this.mItemDecoration = new n(this);
    }

    public SelectBillTypeDialog(Context context, int layoutId, int styleId) {
        super(context, layoutId, styleId);
        this.mSelectedPosition = 0;
        this.showRefund = true;
        this.mItemDecoration = new n(this);
    }
}
