package com.transsnet.palmpay.teller.ui.dialog;

import Pd.c;
import Pd.d;
import Xd.B;
import Yd.i;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.q;
import com.transsnet.palmpay.teller.bean.WAECOperatorBean;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001+B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\rR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R(\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/dialog/PickMobileNetWorkDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "layoutId", "(Landroid/content/Context;I)V", "styleId", "(Landroid/content/Context;II)V", "", "changeDialogHeight", "()V", "initViews", "Lcom/transsnet/palmpay/teller/ui/dialog/PickMobileNetWorkDialog$CallBack21;", "mCallBack", "Lcom/transsnet/palmpay/teller/ui/dialog/PickMobileNetWorkDialog$CallBack21;", "getMCallBack", "()Lcom/transsnet/palmpay/teller/ui/dialog/PickMobileNetWorkDialog$CallBack21;", "setMCallBack", "(Lcom/transsnet/palmpay/teller/ui/dialog/PickMobileNetWorkDialog$CallBack21;)V", "Landroid/view/View;", "mCloseIv", "Landroid/view/View;", "Landroid/widget/TextView;", "mTitleTv", "Landroid/widget/TextView;", "mViewRoot", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "LXd/B;", "mAdapter", "LXd/B;", "", "Lcom/transsnet/palmpay/teller/bean/WAECOperatorBean;", "datas", "Ljava/util/List;", "getDatas", "()Ljava/util/List;", "setDatas", "(Ljava/util/List;)V", "CallBack21", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PickMobileNetWorkDialog extends b {

    @NotNull
    private List<WAECOperatorBean> datas;
    private B mAdapter;

    @Nullable
    private CallBack21 mCallBack;
    private View mCloseIv;
    private RecyclerView mRecyclerView;
    private TextView mTitleTv;
    private View mViewRoot;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/dialog/PickMobileNetWorkDialog$CallBack21;", "", "onNetworkItemClick", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/teller/bean/WAECOperatorBean;", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CallBack21 {
        void onNetworkItemClick(@Nullable WAECOperatorBean data);
    }

    public PickMobileNetWorkDialog(@Nullable Context context) {
        super(context);
        this.datas = new ArrayList();
    }

    private final void changeDialogHeight() {
        Window window = getWindow();
        Intrinsics.e(window);
        window.setGravity(80);
        window.setWindowAnimations(l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
        window.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(PickMobileNetWorkDialog pickMobileNetWorkDialog, View view, WAECOperatorBean wAECOperatorBean, RecyclerView.ViewHolder viewHolder) {
        CallBack21 callBack21 = pickMobileNetWorkDialog.mCallBack;
        if (callBack21 != null) {
            callBack21.onNetworkItemClick(wAECOperatorBean);
        }
        pickMobileNetWorkDialog.dismiss();
    }

    @NotNull
    public final List<WAECOperatorBean> getDatas() {
        return this.datas;
    }

    @Nullable
    public final CallBack21 getMCallBack() {
        return this.mCallBack;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(d.qt_pick_mobile_network_dialog);
        this.mCloseIv = findViewById(c.ivClose);
        this.mTitleTv = (TextView) findViewById(c.ivTitle);
        this.mRecyclerView = (RecyclerView) findViewById(c.qpm_network_list);
        this.mViewRoot = findViewById(c.viewRoot);
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            Intrinsics.n("mRecyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
        Context context = this.mContext;
        Intrinsics.checkNotNullExpressionValue(context, "mContext");
        Intrinsics.checkNotNullParameter(context, "context");
        B b7 = new B(context);
        this.mAdapter = b7;
        b7.f4985b = this.datas;
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == null) {
            Intrinsics.n("mRecyclerView");
            throw null;
        }
        recyclerView2.setAdapter(b7);
        C1548f c1548f = new C1548f(getContext().getColor(L6.b.ppColorDividerLine), getContext().getResources().getDimensionPixelOffset(q.dp1), getContext().getResources().getDimensionPixelOffset(q.dp16), getContext().getResources().getDimensionPixelOffset(q.dp16));
        c1548f.f31336e = false;
        RecyclerView recyclerView3 = this.mRecyclerView;
        if (recyclerView3 == null) {
            Intrinsics.n("mRecyclerView");
            throw null;
        }
        recyclerView3.addItemDecoration(c1548f);
        B b10 = this.mAdapter;
        if (b10 == null) {
            Intrinsics.n("mAdapter");
            throw null;
        }
        b10.f4986c = new V9.q(this, 24);
        View view = this.mCloseIv;
        if (view == null) {
            Intrinsics.n("mCloseIv");
            throw null;
        }
        view.setOnClickListener(new i(this, 3));
        changeDialogHeight();
    }

    public final void setDatas(@NotNull List<WAECOperatorBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.datas = list;
    }

    public final void setMCallBack(@Nullable CallBack21 callBack21) {
        this.mCallBack = callBack21;
    }

    public PickMobileNetWorkDialog(@Nullable Context context, int i7) {
        super(context, i7);
        this.datas = new ArrayList();
    }

    public PickMobileNetWorkDialog(@Nullable Context context, int i7, int i10) {
        super(context, i7, i10);
        this.datas = new ArrayList();
    }
}
