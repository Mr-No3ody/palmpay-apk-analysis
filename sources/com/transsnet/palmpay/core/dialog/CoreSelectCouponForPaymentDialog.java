package com.transsnet.palmpay.core.dialog;

import C0.G;
import Pa.n0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import p025ba.k;
import p052da.I;
import p141j9.C1794b;

/* JADX INFO: loaded from: classes3.dex */
public class CoreSelectCouponForPaymentDialog extends com.transsnet.palmpay.custom_view.dialog.b implements View.OnClickListener {
    private long defaultCouponId;
    private CallBack mCallBack;
    private ImageView mCloseIv;
    private TextView mConfirmTv;
    private I mCouponListAdapter;
    private List<CouponItem> mCoupons;
    private View mLoadingView;
    private PreviewPayInfoV2Req mPreviewPayReq;
    private SwipeRecyclerView mRecyclerView;
    private String mTitleText;
    private TextView mTitleTv;
    private String mTransType;
    private View mViewRoot;

    public interface CallBack {
        void onCouponClick(CouponItem data);
    }

    public CoreSelectCouponForPaymentDialog(Context context) {
        super(context);
        this.defaultCouponId = -1L;
    }

    private void checkCoupon(CouponItem item) {
        this.mLoadingView.setVisibility(0);
        this.mPreviewPayReq.couponId = Long.valueOf(item.couponId);
        PreviewPayInfoV2Req previewPayInfoV2Req = this.mPreviewPayReq;
        previewPayInfoV2Req.couponAmount = item.nominaValue;
        ((PayApiService) p324va.c.f43141a.f14621b).checkCoupon(previewPayInfoV2Req).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new d(this, item));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initViews$0(View view, CouponItem couponItem, RecyclerView.ViewHolder viewHolder) {
        int id2 = view.getId();
        if (couponItem.startTime > System.currentTimeMillis()) {
            return;
        }
        if (id2 != p025ba.e.imageViewCheck) {
            if (id2 == p025ba.e.llDetailArrow) {
                couponItem.layoutExpand = !couponItem.layoutExpand;
                this.mCouponListAdapter.notifyItemChanged(viewHolder.getAdapterPosition());
                return;
            }
            return;
        }
        int adapterPosition = viewHolder.getAdapterPosition();
        CouponItem couponItem2 = (CouponItem) this.mCouponListAdapter.getItem(adapterPosition);
        if (couponItem2 == null || couponItem2.available) {
            I i7 = this.mCouponListAdapter;
            if (adapterPosition == i7.f35702g) {
                i7.f35702g = -1;
                i7.notifyDataSetChanged();
            } else {
                i7.f35702g = viewHolder.getAdapterPosition();
                i7.notifyDataSetChanged();
            }
        }
    }

    private void setEmptyView() {
        if (this.mRecyclerView.getEmptyView() != null) {
            return;
        }
        ModelEmptyView modelEmptyView = new ModelEmptyView(this.mContext);
        modelEmptyView.f31511b.setImageResource(r.cv_no_coupon_icon);
        modelEmptyView.f31512c.setText(k.core_no_coupon_available);
        modelEmptyView.setBackgroundColor(this.mContext.getResources().getColor(L6.b.ppColorBackgroundLight));
        this.mRecyclerView.setEmptyView(modelEmptyView);
    }

    public int getDefaultCouponPosition() {
        if (this.mCoupons != null && this.defaultCouponId > 0) {
            for (int i7 = 0; i7 < this.mCoupons.size(); i7++) {
                if (this.mCoupons.get(i7).couponId == this.defaultCouponId) {
                    return i7;
                }
            }
        }
        return -1;
    }

    public String getTransType() {
        return this.mTransType;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(p025ba.g.core_dialog_select_coupon_for_payment);
        this.mCloseIv = (ImageView) findViewById(p025ba.e.cdsc_close_iv);
        this.mTitleTv = (TextView) findViewById(p025ba.e.cdsc_title_tv);
        this.mRecyclerView = (SwipeRecyclerView) findViewById(p025ba.e.cdsc_rcv);
        this.mViewRoot = findViewById(p025ba.e.viewRoot);
        this.mConfirmTv = (TextView) findViewById(p025ba.e.cdsc_confirm);
        this.mLoadingView = findViewById(p025ba.e.loadingView);
        this.mRecyclerView.getRecyclerView().setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
        this.mRecyclerView.getRecyclerView().setItemViewCacheSize(4);
        this.mRecyclerView.getRecyclerView().addItemDecoration(new Qb.c(15, 0, 20, 20));
        I i7 = new I(this.mContext);
        i7.f35700e = false;
        i7.f35702g = -1;
        i7.f35701f = true;
        this.mCouponListAdapter = i7;
        this.mRecyclerView.setAdapter(i7);
        this.mRecyclerView.setRefreshEnable(false);
        this.mRecyclerView.setLoadMoreEnable(false);
        if (!TextUtils.isEmpty(this.mTitleText)) {
            this.mTitleTv.setText(this.mTitleText);
        }
        List<CouponItem> list = this.mCoupons;
        if (list != null) {
            I i10 = this.mCouponListAdapter;
            i10.f4985b = list;
            i10.f35702g = getDefaultCouponPosition();
            i10.notifyDataSetChanged();
            this.mCouponListAdapter.notifyDataSetChanged();
        }
        this.mCouponListAdapter.f4986c = new C1794b(this, 12);
        setEmptyView();
        showAtBottom(getWindow());
        this.mCloseIv.setOnClickListener(this);
        this.mConfirmTv.setOnClickListener(this);
        this.mViewRoot.getViewTreeObserver().addOnGlobalLayoutListener(new Be.c(this, 14));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v3) {
        int id2 = v3.getId();
        if (id2 != this.mConfirmTv.getId()) {
            if (id2 == this.mCloseIv.getId()) {
                dismiss();
                return;
            }
            return;
        }
        if (id2 == this.mCloseIv.getId()) {
            n0.g().k(new ClickEvent("PPay_Btn_CouponClose").add("TransType", getTransType()));
        } else {
            n0.g().k(new ClickEvent("PPay_Select_Coupon_Btn_Confirm").add("TransType", getTransType()));
        }
        CallBack callBack = this.mCallBack;
        if (callBack != null) {
            I i7 = this.mCouponListAdapter;
            int i10 = i7.f35702g;
            if (i10 < 0) {
                callBack.onCouponClick(null);
                dismiss();
                return;
            }
            CouponItem couponItem = (CouponItem) i7.getItem(i10);
            if (couponItem != null && couponItem.showOnlyMeErrors) {
                ToastUtils.showLong(k.core_msg_coupons_myself_only);
            }
            if (this.mPreviewPayReq != null) {
                checkCoupon(couponItem);
            } else {
                this.mCallBack.onCouponClick(couponItem);
                dismiss();
            }
        }
    }

    public void setCallBack(CallBack callBack) {
        this.mCallBack = callBack;
    }

    public void setCoupons(List<CouponItem> coupons) {
        I i7;
        this.mCoupons = coupons;
        if (coupons == null || (i7 = this.mCouponListAdapter) == null) {
            return;
        }
        i7.f4985b = coupons;
        i7.notifyDataSetChanged();
    }

    public void setDefaultCouponId(long couponId) {
        this.defaultCouponId = couponId;
    }

    public void setDialogTitle(String titleText) {
        TextView textView;
        this.mTitleText = titleText;
        if (TextUtils.isEmpty(titleText) || (textView = this.mTitleTv) == null) {
            return;
        }
        textView.setText(this.mTitleText);
    }

    public void setPreviewPayReq(PreviewPayInfoV2Req req) {
        this.mPreviewPayReq = req;
    }

    public void setTransType(String mTransType) {
        this.mTransType = mTransType;
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        super.show();
        n0.g().u(((ViewEvent) G.g("PPay_Select_Coupon", true)).add("TransType", getTransType()));
    }

    public CoreSelectCouponForPaymentDialog(Context context, int layoutId) {
        super(context, layoutId);
        this.defaultCouponId = -1L;
    }

    public CoreSelectCouponForPaymentDialog(Context context, int layoutId, int styleId) {
        super(context, layoutId, styleId);
        this.defaultCouponId = -1L;
    }
}
