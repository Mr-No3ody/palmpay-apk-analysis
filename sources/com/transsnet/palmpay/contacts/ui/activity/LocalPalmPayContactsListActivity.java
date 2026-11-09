package com.transsnet.palmpay.contacts.ui.activity;

import Ga.c;
import L6.b;
import R9.d;
import R9.e;
import U9.a;
import V9.y;
import V9.z;
import W9.p;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration;
import com.transsnet.palmpay.contacts.contract.LocalContactsListContract$IView;
import com.transsnet.palmpay.contacts.ui.activity.LocalPalmPayContactsListActivity;
import com.transsnet.palmpay.contacts.ui.view.SideBarView;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.rsp.MobileContactListResp;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.LinkedHashMap;
import java.util.List;
import org.greenrobot.eventbus.f;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/contact/local_palmpay_contacts")
public class LocalPalmPayContactsListActivity extends i implements TextWatcher, LocalContactsListContract$IView {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f27226i = {"android.permission.READ_CONTACTS"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EditText f27227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f27228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SwipeRecyclerView f27229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SideBarView f27230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p f27231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f27232g;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // com.transsnet.palmpay.contacts.contract.LocalContactsListContract$IView
    public final void complete() {
        showLoadingDialog(false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ct_local_palmpay_contacts_list_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        p pVar = new p(this);
        pVar.f10645e = new LinkedHashMap();
        this.f27231f = pVar;
        pVar.f4986c = new z();
        pVar.f10646f = new f(this, 6);
        this.f27229d.getRecyclerView().setVerticalScrollBarEnabled(false);
        this.f27229d.getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        C1548f c1548f = new C1548f(getColor(b.ppColorDividerLine), 1, 30, 30);
        c1548f.f31336e = false;
        this.f27229d.setRefreshEnable(false);
        this.f27229d.setLoadMoreEnable(false);
        this.f27229d.getRecyclerView().addItemDecoration(c1548f);
        this.f27229d.getRecyclerView().addItemDecoration(new StickyRecyclerHeadersDecoration(this.f27231f));
        this.f27229d.setAdapter(this.f27231f);
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new a();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity, androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        if (iArr.length <= 0) {
            return;
        }
        for (int i10 : iArr) {
            if (i10 != 0) {
                ToastUtils.showShort(R9.f.ct_denied_permission_pick_contact);
                finish();
                return;
            }
        }
        if (i7 == 100) {
            showLoadingDialog(true);
            ((a) this.f27350a).queryPhoneContact();
            c.f3194a.periodUploadV3();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (this.f27232g == null) {
            return;
        }
        String strTrim = this.f27227b.getText().toString().trim();
        if (!TextUtils.isEmpty(strTrim)) {
            this.f27228c.setVisibility(0);
            ((a) this.f27350a).queryContactLike(strTrim, this.f27232g);
        } else {
            this.f27228c.setVisibility(8);
            p pVar = this.f27231f;
            pVar.f4985b = this.f27232g;
            pVar.notifyDataSetChanged();
        }
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        String[] strArr = f27226i;
        if (!PermissionUtils.isGranted(strArr)) {
            requestPermissions(strArr, 100);
        } else {
            showLoadingDialog(true);
            ((a) this.f27350a).queryPhoneContact();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        Z4.e.I(this);
        this.f27229d = (SwipeRecyclerView) findViewById(d.contact_rv);
        this.f27228c = findViewById(d.ivDelete);
        this.f27227b = (EditText) findViewById(d.editSearch);
        this.f27230e = (SideBarView) findViewById(d.side_bar);
        try {
            final int i7 = 0;
            findViewById(d.back_bt).setOnClickListener(new View.OnClickListener(this) { // from class: V9.x

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ LocalPalmPayContactsListActivity f10230b;

                {
                    this.f10230b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LocalPalmPayContactsListActivity localPalmPayContactsListActivity = this.f10230b;
                    switch (i7) {
                        case 0:
                            String[] strArr = LocalPalmPayContactsListActivity.f27226i;
                            int id2 = view.getId();
                            if (id2 == R9.d.back_bt) {
                                localPalmPayContactsListActivity.finish();
                            } else if (id2 == R9.d.ivDelete) {
                                localPalmPayContactsListActivity.f27227b.getText().clear();
                            }
                            break;
                        default:
                            String[] strArr2 = LocalPalmPayContactsListActivity.f27226i;
                            int id3 = view.getId();
                            if (id3 == R9.d.back_bt) {
                                localPalmPayContactsListActivity.finish();
                            } else if (id3 == R9.d.ivDelete) {
                                localPalmPayContactsListActivity.f27227b.getText().clear();
                            }
                            break;
                    }
                }
            });
            final int i10 = 1;
            this.f27228c.setOnClickListener(new View.OnClickListener(this) { // from class: V9.x

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ LocalPalmPayContactsListActivity f10230b;

                {
                    this.f10230b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LocalPalmPayContactsListActivity localPalmPayContactsListActivity = this.f10230b;
                    switch (i10) {
                        case 0:
                            String[] strArr = LocalPalmPayContactsListActivity.f27226i;
                            int id2 = view.getId();
                            if (id2 == R9.d.back_bt) {
                                localPalmPayContactsListActivity.finish();
                            } else if (id2 == R9.d.ivDelete) {
                                localPalmPayContactsListActivity.f27227b.getText().clear();
                            }
                            break;
                        default:
                            String[] strArr2 = LocalPalmPayContactsListActivity.f27226i;
                            int id3 = view.getId();
                            if (id3 == R9.d.back_bt) {
                                localPalmPayContactsListActivity.finish();
                            } else if (id3 == R9.d.ivDelete) {
                                localPalmPayContactsListActivity.f27227b.getText().clear();
                            }
                            break;
                    }
                }
            });
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f27227b.addTextChangedListener(this);
        this.f27230e.setLetters(getResources().getStringArray(R9.a.ct_slide_bar_value_no_favourite_list));
        this.f27230e.setOnLetterChangeListener(new y(this));
    }

    @Override // com.transsnet.palmpay.contacts.contract.LocalContactsListContract$IView
    public final void showContactError(String str) {
        showLoadingDialog(false);
        ToastUtils.showLong(str);
    }

    @Override // com.transsnet.palmpay.contacts.contract.LocalContactsListContract$IView
    public final void showLikeQueryPhoneContactList(List list) {
        p pVar = this.f27231f;
        pVar.f4985b = list;
        pVar.notifyDataSetChanged();
    }

    @Override // com.transsnet.palmpay.contacts.contract.LocalContactsListContract$IView
    public final void showPhoneContactResp(MobileContactListResp mobileContactListResp) {
        showLoadingDialog(false);
        if (!mobileContactListResp.isSuccess()) {
            ToastUtils.showLong(mobileContactListResp.getRespMsg());
            return;
        }
        this.f27232g = mobileContactListResp.getData();
        this.f27231f.f4985b = mobileContactListResp.getData();
        this.f27231f.notifyDataSetChanged();
    }
}
