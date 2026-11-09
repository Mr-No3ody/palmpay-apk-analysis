package com.transsnet.palmpay.core.ui.activity;

import Pa.r0;
import Ua.m0;
import V9.C0714c;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.util.UssdUtils$UssdResponseCallback;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.IntentUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p355xf.C2131j;
import pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/coreImpl/ussd_list_page")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/CoreUssdListActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "Lpub/devrel/easypermissions/EasyPermissions$PermissionCallbacks;", "Lcom/transsnet/palmpay/core/util/UssdUtils$UssdResponseCallback;", "<init>", "()V", "a", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCoreUssdListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreUssdListActivity.kt\ncom/transsnet/palmpay/core/ui/activity/CoreUssdListActivity\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,271:1\n694#2,50:272\n37#3:322\n36#3,3:323\n*S KotlinDebug\n*F\n+ 1 CoreUssdListActivity.kt\ncom/transsnet/palmpay/core/ui/activity/CoreUssdListActivity\n*L\n122#1:272,50\n260#1:322\n260#1:323,3\n*E\n"})
public final class CoreUssdListActivity extends BaseActivity implements EasyPermissions$PermissionCallbacks, UssdUtils$UssdResponseCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f27608d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p355xf.t f27609a = C2131j.b(new X6.c(this, 16));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p052da.f0 f27611c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public static void l(String str) {
        if (str != null) {
            TextUtils.isEmpty(str);
        }
        ActivityUtils.startActivity(IntentUtils.getDialIntent(Uri.encode(str), true));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return L9.b.core_activity_ussd_list;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        this.f27611c = new p052da.f0(this);
        SwipeRecyclerView swipeRecyclerViewM = m();
        if (swipeRecyclerViewM != null && (recyclerView2 = swipeRecyclerViewM.getRecyclerView()) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        }
        SwipeRecyclerView swipeRecyclerViewM2 = m();
        if (swipeRecyclerViewM2 != null && (recyclerView = swipeRecyclerViewM2.getRecyclerView()) != null) {
            recyclerView.addItemDecoration(new O());
        }
        SwipeRecyclerView swipeRecyclerViewM3 = m();
        if (swipeRecyclerViewM3 != null) {
            swipeRecyclerViewM3.setRefreshEnable(true);
        }
        SwipeRecyclerView swipeRecyclerViewM4 = m();
        if (swipeRecyclerViewM4 != null) {
            swipeRecyclerViewM4.setLoadMoreEnable(false);
        }
        SwipeRecyclerView swipeRecyclerViewM5 = m();
        if (swipeRecyclerViewM5 != null) {
            swipeRecyclerViewM5.setAdapter(this.f27611c);
        }
        SwipeRecyclerView swipeRecyclerViewM6 = m();
        if (swipeRecyclerViewM6 != null) {
            swipeRecyclerViewM6.setOnLoadListener(new P(this));
        }
        ModelEmptyView modelEmptyView = new ModelEmptyView(this);
        modelEmptyView.f31511b.setImageResource(com.transsnet.palmpay.custom_view.r.cv_empty_no_transaction_history);
        modelEmptyView.f31512c.setText(getString(p025ba.k.core_no_history));
        SwipeRecyclerView swipeRecyclerViewM7 = m();
        if (swipeRecyclerViewM7 != null) {
            swipeRecyclerViewM7.setEmptyView(modelEmptyView);
        }
        p052da.f0 f0Var = this.f27611c;
        if (f0Var != null) {
            f0Var.f4986c = new com.google.firebase.crashlytics.internal.concurrency.b(this, 29);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final SwipeRecyclerView m() {
        return (SwipeRecyclerView) this.f27609a.getValue();
    }

    public final void n() {
        showLoadingDialog(true);
        ((PayApiService) p324va.c.f43141a.f14621b).getUssdList().i(p071ef.b.a()).k(p298tf.f.f42629b).subscribe(new C0714c(this, 6));
    }

    public final void o() {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        String string;
        String[] strArr = {"android.permission.CALL_PHONE", "android.permission.READ_PHONE_STATE"};
        if (!p377z5.l.o(this, (String[]) Arrays.copyOf(strArr, 2))) {
            p377z5.l.C(new dh.a(D4.f.p(this), (String[]) Arrays.copyOf(strArr, 2), 740, "Without the requested permission, you need to dial USSD manually", "Reselect", "Dial Now"));
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int[] iArr = null;
        try {
            activeSubscriptionInfoList = SubscriptionManager.from(this).getActiveSubscriptionInfoList();
        } catch (Exception unused) {
            activeSubscriptionInfoList = null;
        }
        if (activeSubscriptionInfoList == null || activeSubscriptionInfoList.isEmpty() || !PhoneUtils.isSimCardReady()) {
            l(this.f27610b);
            return;
        }
        int i7 = 1;
        if (activeSubscriptionInfoList.size() == 1) {
            String str = this.f27610b;
            int subscriptionId = activeSubscriptionInfoList.get(0).getSubscriptionId();
            if (str != null) {
                TextUtils.isEmpty(str);
            }
            showLoadingDialog(true);
            r0.j(this, subscriptionId, this.f27610b, 740, this);
            return;
        }
        for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
            StringBuilder sb2 = new StringBuilder("Card");
            if (subscriptionInfo == null) {
                string = sb2.toString();
            } else {
                String number = subscriptionInfo.getNumber();
                if (i7 > 0) {
                    sb2.append(i7);
                }
                if (!TextUtils.isEmpty(number)) {
                    androidx.camera.video.u.w(sb2, "(", number, ")");
                }
                string = sb2.toString();
            }
            arrayList.add(string);
            arrayList2.add(Integer.valueOf(activeSubscriptionInfoList.get(0).getSubscriptionId()));
            arrayList3.add(Integer.valueOf(com.transsnet.palmpay.custom_view.r.cv_ussd));
            i7++;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList3.size() > 0) {
            iArr = new int[arrayList3.size()];
            int size = arrayList3.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList3.get(i10);
                Intrinsics.e(obj);
                iArr[i10] = ((Number) obj).intValue();
            }
        }
        com.transsnet.palmpay.custom_view.dialog.p pVar = new com.transsnet.palmpay.custom_view.dialog.p(this);
        pVar.b(p025ba.k.core_select);
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new String[0]);
        m0 m0Var = new m0(this, arrayList2, 2);
        Context context = pVar.getContext();
        pVar.setSingleChoiceItems(new com.transsnet.palmpay.custom_view.dialog.o(context, com.transsnet.palmpay.custom_view.t.cv_layout_dialog_single_choice_item, charSequenceArr, context, iArr, -1), -1, m0Var);
        pVar.show();
    }

    @Override // pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks
    public final void onPermissionsDenied(int i7, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        l(this.f27610b);
    }

    @Override // pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks
    public final void onPermissionsGranted(int i7, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (i7 == 740) {
            o();
        }
    }

    @Override // com.transsnet.palmpay.core.util.UssdUtils$UssdResponseCallback
    public final void onReceiveUssdResponse(boolean z3, String str, CharSequence charSequence, int i7) {
        showLoadingDialog(false);
        if (TextUtils.isEmpty(charSequence)) {
            l(this.f27610b);
            return;
        }
        Intrinsics.e(charSequence);
        int i10 = p025ba.k.core_confirm;
        int i11 = p025ba.k.core_opps;
        O6.c cVar = new O6.c(this);
        cVar.f6614u = 1;
        cVar.e(i11);
        cVar.f("");
        cVar.f6598d = (String) charSequence;
        cVar.d(i10, null);
        cVar.f6605k = true;
        cVar.f6606l = 1;
        C0.G.v(cVar, false, false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity, androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    public final void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i7, permissions, grantResults);
        p377z5.l.r(i7, permissions, grantResults, this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        n();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
    }
}
