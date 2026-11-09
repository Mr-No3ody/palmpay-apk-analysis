package com.transsnet.palmpay.credit.ui.fragment;

import Pa.r0;
import Ya.b;
import Ya.f;
import android.content.Context;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.credit.bean.resp.QueryMemberByKeywordResp;
import com.transsnet.palmpay.credit.bean.resp.QueryMemberDetailResp;
import com.transsnet.palmpay.credit.bean.resp.RecipientListResp;
import com.transsnet.palmpay.credit.contract.ContactListContract$IView;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.CompatStateEditText;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.custom_view.q;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import p161kf.e;
import p235pb.g;
import p339wb.d;
import p382zb.C2158a;

/* JADX INFO: loaded from: classes4.dex */
public class BeneficiariesListFragment extends BaseMVPFragment<g> implements ContactListContract$IView {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CompatStateEditText f30229j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SwipeRecyclerView f30230o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f30231p;
    public e t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f30232v = new ArrayList();

    public static void u(QueryMemberDetailResp.Data data, String str) {
        Postcard postcardBuild = ARouter.getInstance().build("/sm/personal_transfer");
        if (data == null) {
            postcardBuild.withString("phone_number", str).withInt("extra_type", 5);
        } else {
            postcardBuild.withString("MEMBER_ID", data.memberId).withInt("extra_type", 2);
        }
        postcardBuild.navigation();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.cs_recent_contact_list_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        if (getArguments() != null) {
            getArguments().getBoolean("for_result", true);
        }
        Context context = getContext();
        d dVar = new d();
        dVar.f43365c = context;
        dVar.f43364b = new ArrayList();
        this.f30231p = dVar;
        dVar.f43366d = new C2158a(this);
        this.f30230o.getRecyclerView().setLayoutManager(new LinearLayoutManager(getContext()));
        C1548f c1548f = new C1548f(getContext().getColor(b.cs_list_divider_color), getResources().getDimensionPixelOffset(q.dp1), getResources().getDimensionPixelOffset(q.dp15), getResources().getDimensionPixelOffset(q.dp15));
        c1548f.f31336e = false;
        this.f30230o.setRefreshEnable(false);
        this.f30230o.setLoadMoreEnable(false);
        this.f30230o.getRecyclerView().addItemDecoration(c1548f);
        this.f30230o.setAdapter(this.f30231p);
        c.b().j(this);
        return 1;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        super.n();
        ((g) this.f27328i).queryRecipientList(1, 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        this.f30230o = (SwipeRecyclerView) this.f27318b.findViewById(Ya.e.contact_rv);
        this.f30229j = (CompatStateEditText) this.f27318b.findViewById(Ya.e.search_et);
        this.f30229j.setHint(Ya.g.cs_name_or_mobile_number);
        this.f30229j.addTextChangedListener(new R3.e(this, 29));
        return 1;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageEvent messageEvent) {
        if (messageEvent.getEventType() == 384) {
            String eventContent = messageEvent.getEventContent();
            if (TextUtils.isEmpty(eventContent)) {
                return;
            }
            ((g) this.f27328i).queryMemberDetailByKeyword(r0.w0(eventContent));
        }
    }

    @Override // com.transsnet.palmpay.credit.contract.ContactListContract$IView
    public final void showDeleteRecipientResult(boolean z3, String str) {
        if (z3) {
            ToastUtils.showLong(Ya.g.cs_delete_successfully);
        }
    }

    @Override // com.transsnet.palmpay.credit.contract.ContactListContract$IView
    public final void showLikeQueryRecipients(List list) {
    }

    @Override // com.transsnet.palmpay.credit.contract.ContactListContract$IView
    public final void showQueryMemberByKeyword(QueryMemberByKeywordResp queryMemberByKeywordResp, String str) {
        showLoadingDialog(false);
        if (!queryMemberByKeywordResp.isSuccess()) {
            ToastUtils.showShort(queryMemberByKeywordResp.getRespMsg());
        } else if (queryMemberByKeywordResp.data.isEmpty()) {
            u(null, str);
        } else {
            u(queryMemberByKeywordResp.data.get(0), str);
        }
    }

    @Override // com.transsnet.palmpay.credit.contract.ContactListContract$IView
    public final void showQueryMemberDetail(QueryMemberDetailResp queryMemberDetailResp, String str) {
        showLoadingDialog(false);
        if (!queryMemberDetailResp.isSuccess()) {
            ToastUtils.showShort(queryMemberDetailResp.getRespMsg());
            return;
        }
        Postcard postcardBuild = ARouter.getInstance().build("/sm/personal_transfer");
        QueryMemberDetailResp.Data data = queryMemberDetailResp.data;
        if (data == null) {
            postcardBuild.withString("phone_number", str);
        } else {
            postcardBuild.withString("MEMBER_ID", data.memberId);
        }
        postcardBuild.navigation();
    }

    @Override // com.transsnet.palmpay.credit.contract.ContactListContract$IView
    public final void showQueryMemberDetailError(String str) {
        showLoadingDialog(false);
        ToastUtils.showShort(str);
    }

    @Override // com.transsnet.palmpay.credit.contract.ContactListContract$IView
    public final void showRecipientListResp(RecipientListResp recipientListResp) {
        showLoadingDialog(false);
        if (!recipientListResp.isSuccess()) {
            showLoadingDialog(false);
            ToastUtils.showShort(recipientListResp.getRespMsg());
            return;
        }
        if (recipientListResp.getData() == null || recipientListResp.getData().isEmpty()) {
            if (this.f30230o.getEmptyView() != null) {
                return;
            }
            ModelEmptyView modelEmptyView = new ModelEmptyView(getActivity());
            modelEmptyView.f31511b.setImageResource(r.cv_empty_no_palmpay_contacts);
            modelEmptyView.f31512c.setText(Ya.g.cs_no_beneficiaries_text);
            this.f30230o.setEmptyView(modelEmptyView);
            return;
        }
        ArrayList arrayList = this.f30232v;
        arrayList.clear();
        arrayList.addAll(recipientListResp.getData());
        this.f30231p.f43364b = recipientListResp.getData();
        this.f30231p.notifyDataSetChanged();
    }

    @Override // com.transsnet.palmpay.credit.contract.ContactListContract$IView
    public final void showRecipientListRespError(String str) {
        showLoadingDialog(false);
        ToastUtils.showShort(str);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new g();
    }
}
