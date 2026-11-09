package com.transsnet.palmpay.teller.ui.dialog;

import Hb.L;
import Pa.b0;
import Pd.c;
import Pd.f;
import Vd.a;
import Yd.d;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.SingleKeyValueBean;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.teller.bean.resp.BillOrderInfoConfirmData;
import com.transsnet.palmpay.teller.ui.dialog.BillOrderInfoConfirmDialog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u000bR\u001e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010$\u001a\u0004\u0018\u00010 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u001d\u0010'\u001a\u0004\u0018\u00010 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010#R\u001d\u0010,\u001a\u0004\u0018\u00010(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/dialog/BillOrderInfoConfirmDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "layoutId", "styleId", "<init>", "(Landroid/content/Context;II)V", "", "initViews", "()V", "Lcom/transsnet/palmpay/teller/bean/resp/BillOrderInfoConfirmData;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setOrderInfo", "(Lcom/transsnet/palmpay/teller/bean/resp/BillOrderInfoConfirmData;)Lcom/transsnet/palmpay/teller/ui/dialog/BillOrderInfoConfirmDialog;", "Lkotlin/Function0;", "function", "setOnConfirmClickListener", "(Lkotlin/jvm/functions/Function0;)Lcom/transsnet/palmpay/teller/ui/dialog/BillOrderInfoConfirmDialog;", "show", "Lkotlin/jvm/functions/Function0;", "", "Lcom/transsnet/palmpay/core/bean/SingleKeyValueBean;", "dataList", "Ljava/util/List;", "Landroid/widget/ImageView;", "mCloseIv$delegate", "Lkotlin/Lazy;", "getMCloseIv", "()Landroid/widget/ImageView;", "mCloseIv", "Landroid/widget/TextView;", "mConfirmTv$delegate", "getMConfirmTv", "()Landroid/widget/TextView;", "mConfirmTv", "mRetryTv$delegate", "getMRetryTv", "mRetryTv", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView$delegate", "getMRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "LYd/d;", "billOrderInfoAdapter", "LYd/d;", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BillOrderInfoConfirmDialog extends b {

    @Nullable
    private d billOrderInfoAdapter;

    @NotNull
    private final List<SingleKeyValueBean> dataList;

    @NotNull
    private Function0<Unit> function;

    /* JADX INFO: renamed from: mCloseIv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mCloseIv;

    /* JADX INFO: renamed from: mConfirmTv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mConfirmTv;

    /* JADX INFO: renamed from: mRecyclerView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mRecyclerView;

    /* JADX INFO: renamed from: mRetryTv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mRetryTv;

    @JvmOverloads
    public BillOrderInfoConfirmDialog(@Nullable Context context) {
        this(context, 0, 0, 6, null);
    }

    private final ImageView getMCloseIv() {
        return (ImageView) this.mCloseIv.getValue();
    }

    private final TextView getMConfirmTv() {
        return (TextView) this.mConfirmTv.getValue();
    }

    private final RecyclerView getMRecyclerView() {
        return (RecyclerView) this.mRecyclerView.getValue();
    }

    private final TextView getMRetryTv() {
        return (TextView) this.mRetryTv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$8(BillOrderInfoConfirmDialog billOrderInfoConfirmDialog, View view) {
        billOrderInfoConfirmDialog.function.invoke();
        billOrderInfoConfirmDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mCloseIv_delegate$lambda$1(BillOrderInfoConfirmDialog billOrderInfoConfirmDialog) {
        return (ImageView) billOrderInfoConfirmDialog.findViewById(c.iv_dialog_close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mConfirmTv_delegate$lambda$2(BillOrderInfoConfirmDialog billOrderInfoConfirmDialog) {
        return (TextView) billOrderInfoConfirmDialog.findViewById(c.tv_confirm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mRecyclerView_delegate$lambda$5(BillOrderInfoConfirmDialog billOrderInfoConfirmDialog, Context context) {
        RecyclerView recyclerView = (RecyclerView) billOrderInfoConfirmDialog.findViewById(c.ry_order_info);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        return recyclerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mRetryTv_delegate$lambda$3(BillOrderInfoConfirmDialog billOrderInfoConfirmDialog) {
        return (TextView) billOrderInfoConfirmDialog.findViewById(c.tv_retry);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(Pd.d.qt_bill_order_info_confirm_dialog);
        this.billOrderInfoAdapter = new d(0, null);
        RecyclerView mRecyclerView = getMRecyclerView();
        if (mRecyclerView != null) {
            mRecyclerView.setAdapter(this.billOrderInfoAdapter);
        }
        ImageView mCloseIv = getMCloseIv();
        if (mCloseIv != null) {
            final int i7 = 0;
            mCloseIv.setOnClickListener(new View.OnClickListener(this) { // from class: Yd.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BillOrderInfoConfirmDialog f11331b;

                {
                    this.f11331b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f11331b.dismiss();
                            break;
                        case 1:
                            this.f11331b.dismiss();
                            break;
                        default:
                            BillOrderInfoConfirmDialog.initViews$lambda$8(this.f11331b, view);
                            break;
                    }
                }
            });
        }
        TextView mRetryTv = getMRetryTv();
        if (mRetryTv != null) {
            final int i10 = 1;
            mRetryTv.setOnClickListener(new View.OnClickListener(this) { // from class: Yd.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BillOrderInfoConfirmDialog f11331b;

                {
                    this.f11331b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f11331b.dismiss();
                            break;
                        case 1:
                            this.f11331b.dismiss();
                            break;
                        default:
                            BillOrderInfoConfirmDialog.initViews$lambda$8(this.f11331b, view);
                            break;
                    }
                }
            });
        }
        TextView mConfirmTv = getMConfirmTv();
        if (mConfirmTv != null) {
            final int i11 = 2;
            mConfirmTv.setOnClickListener(new View.OnClickListener(this) { // from class: Yd.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BillOrderInfoConfirmDialog f11331b;

                {
                    this.f11331b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.f11331b.dismiss();
                            break;
                        case 1:
                            this.f11331b.dismiss();
                            break;
                        default:
                            BillOrderInfoConfirmDialog.initViews$lambda$8(this.f11331b, view);
                            break;
                    }
                }
            });
        }
    }

    @NotNull
    public final BillOrderInfoConfirmDialog setOnConfirmClickListener(@NotNull Function0<Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
        return this;
    }

    @NotNull
    public final BillOrderInfoConfirmDialog setOrderInfo(@Nullable BillOrderInfoConfirmData data) {
        if (data != null) {
            this.dataList.clear();
            this.dataList.add(new SingleKeyValueBean(getContext().getString(f.qt_biller_name), data.getBillerName()));
            this.dataList.add(new SingleKeyValueBean(getContext().getString(a.qt_payment_item), data.getItemName()));
            if (!TextUtils.isEmpty(data.getCustomerId())) {
                this.dataList.add(new SingleKeyValueBean(getContext().getString(a.qt_meter_number), data.getCustomerId()));
            }
            if (!TextUtils.isEmpty(data.getAccountName())) {
                this.dataList.add(new SingleKeyValueBean(getContext().getString(a.qt_meter_name), data.getAccountName()));
            }
            if (!TextUtils.isEmpty(data.getAddress())) {
                this.dataList.add(new SingleKeyValueBean(getContext().getString(k.core_address), data.getAddress()));
            }
        }
        return this;
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        super.show();
        d dVar = this.billOrderInfoAdapter;
        if (dVar != null) {
            dVar.setList(this.dataList);
        }
    }

    @JvmOverloads
    public BillOrderInfoConfirmDialog(@Nullable Context context, int i7) {
        this(context, i7, 0, 4, null);
    }

    public /* synthetic */ BillOrderInfoConfirmDialog(Context context, int i7, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? 0 : i7, (i11 & 4) != 0 ? w.BaseDialogTheme : i10);
    }

    @JvmOverloads
    public BillOrderInfoConfirmDialog(@Nullable Context context, int i7, int i10) {
        super(context, i7, i10);
        this.function = new b0(25);
        this.dataList = new ArrayList();
        final int i11 = 0;
        this.mCloseIv = C2131j.b(new Function0(this) { // from class: Yd.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillOrderInfoConfirmDialog f11333b;

            {
                this.f11333b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return BillOrderInfoConfirmDialog.mCloseIv_delegate$lambda$1(this.f11333b);
                    case 1:
                        return BillOrderInfoConfirmDialog.mConfirmTv_delegate$lambda$2(this.f11333b);
                    default:
                        return BillOrderInfoConfirmDialog.mRetryTv_delegate$lambda$3(this.f11333b);
                }
            }
        });
        final int i12 = 1;
        this.mConfirmTv = C2131j.b(new Function0(this) { // from class: Yd.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillOrderInfoConfirmDialog f11333b;

            {
                this.f11333b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return BillOrderInfoConfirmDialog.mCloseIv_delegate$lambda$1(this.f11333b);
                    case 1:
                        return BillOrderInfoConfirmDialog.mConfirmTv_delegate$lambda$2(this.f11333b);
                    default:
                        return BillOrderInfoConfirmDialog.mRetryTv_delegate$lambda$3(this.f11333b);
                }
            }
        });
        final int i13 = 2;
        this.mRetryTv = C2131j.b(new Function0(this) { // from class: Yd.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillOrderInfoConfirmDialog f11333b;

            {
                this.f11333b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return BillOrderInfoConfirmDialog.mCloseIv_delegate$lambda$1(this.f11333b);
                    case 1:
                        return BillOrderInfoConfirmDialog.mConfirmTv_delegate$lambda$2(this.f11333b);
                    default:
                        return BillOrderInfoConfirmDialog.mRetryTv_delegate$lambda$3(this.f11333b);
                }
            }
        });
        this.mRecyclerView = C2131j.b(new L(6, this, context));
    }
}
