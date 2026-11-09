package V9;

import android.text.TextUtils;
import android.view.View;
import androidx.core.app.M;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.contacts.api.ContactsApiService;
import com.transsnet.palmpay.contacts.ui.activity.EditCloseContactsActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.RemindListBean;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.device.SetDeviceNotificationReq;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontBatchReq;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontReq;
import com.transsnet.palmpay.core.bean.req.DeleteFamilyAccontReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditCloseContactsActivity f10220b;

    public /* synthetic */ s(EditCloseContactsActivity editCloseContactsActivity, int i7) {
        this.f10219a = i7;
        this.f10220b = editCloseContactsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f10219a) {
            case 0:
                EditCloseContactsActivity editCloseContactsActivity = this.f10220b;
                editCloseContactsActivity.f27198Q.dismiss();
                editCloseContactsActivity.finish();
                break;
            case 1:
                this.f10220b.f27198Q.dismiss();
                break;
            case 2:
                int id2 = view.getId();
                int i7 = R9.d.cecca_save_tv;
                EditCloseContactsActivity editCloseContactsActivity2 = this.f10220b;
                if (id2 == i7) {
                    String str = "";
                    if (editCloseContactsActivity2.f27206i.f28343c.getText().toString().replace(" ", "").length() == PhoneBaseNumberUtils.INSTANCE.getMobileNumberValidLength(BaseApplication.getCountryLocale())) {
                        if (TextUtils.isEmpty(editCloseContactsActivity2.f27206i.getPhoneNumInput())) {
                            ToastUtils.showShort("please input phone number");
                        } else if (TextUtils.isEmpty(editCloseContactsActivity2.f27200b.getEditText())) {
                            ToastUtils.showShort("please input tag");
                        } else if (!editCloseContactsActivity2.f27192A) {
                            ToastUtils.showShort("please input remind time");
                        } else {
                            editCloseContactsActivity2.f27194C = new M(editCloseContactsActivity2).f15943b.areNotificationsEnabled();
                            boolean z3 = p367ya.a.d().f44149a.getBoolean("key_notification", true);
                            editCloseContactsActivity2.f27195H = z3;
                            if ((editCloseContactsActivity2.f27194C && z3) || !((editCloseContactsActivity2.f27210v.d() && editCloseContactsActivity2.f27210v.t.getVisibility() == 0) || (editCloseContactsActivity2.f27211w.d() && editCloseContactsActivity2.f27211w.t.getVisibility() == 0))) {
                                AddFamilyAccontBatchReq addFamilyAccontBatchReq = new AddFamilyAccontBatchReq(editCloseContactsActivity2.f27206i.getPhoneNumInput(), editCloseContactsActivity2.f27200b.getEditText(), AddFamilyAccontReq.BILLER_CATEGORY_ID_BUNDLE);
                                RemindListBean remindListBean = new RemindListBean();
                                RemindListBean remindListBean2 = new RemindListBean();
                                if (TextUtils.equals("04", editCloseContactsActivity2.f27196L)) {
                                    addFamilyAccontBatchReq.source = 3;
                                } else if (TextUtils.equals(TransType.TRANS_TYPE_BUNDLE, editCloseContactsActivity2.f27196L)) {
                                    addFamilyAccontBatchReq.source = 6;
                                }
                                remindListBean.reminder = editCloseContactsActivity2.f27210v.d() ? 1 : 0;
                                addFamilyAccontBatchReq.remindList.add(remindListBean);
                                String str2 = editCloseContactsActivity2.f27210v.f9325o;
                                remindListBean.remindPeriod = str2;
                                remindListBean.remindTime = "week".equals(str2) ? editCloseContactsActivity2.f27210v.f9326p.toUpperCase() : editCloseContactsActivity2.f27210v.f9326p;
                                remindListBean.remindHour = "day".equals(remindListBean.remindPeriod) ? EditCloseContactsActivity.m(editCloseContactsActivity2, editCloseContactsActivity2.f27210v.f9326p) : 0;
                                int i10 = editCloseContactsActivity2.f27210v.f9331v;
                                remindListBean.paymentType = i10 == 0 ? "Airtime" : i10 == 1 ? "Data Bundle" : "";
                                remindListBean2.reminder = (editCloseContactsActivity2.f27211w.d() && editCloseContactsActivity2.f27211w.t.getVisibility() == 0) ? 1 : 0;
                                addFamilyAccontBatchReq.remindList.add(remindListBean2);
                                String str3 = editCloseContactsActivity2.f27211w.f9325o;
                                remindListBean2.remindPeriod = str3;
                                remindListBean2.remindTime = "week".equals(str3) ? editCloseContactsActivity2.f27211w.f9326p.toUpperCase() : editCloseContactsActivity2.f27211w.f9326p;
                                remindListBean2.remindHour = "day".equals(remindListBean2.remindPeriod) ? EditCloseContactsActivity.m(editCloseContactsActivity2, editCloseContactsActivity2.f27211w.f9326p) : 0;
                                int i11 = editCloseContactsActivity2.f27211w.f9331v;
                                if (i11 == 0) {
                                    str = "Airtime";
                                } else if (i11 == 1) {
                                    str = "Data Bundle";
                                }
                                remindListBean2.paymentType = str;
                                if (editCloseContactsActivity2.f27209p != 0) {
                                    if (editCloseContactsActivity2.t.remindList.size() > 0 && addFamilyAccontBatchReq.remindList.size() > 0) {
                                        addFamilyAccontBatchReq.remindList.get(0).accountId = editCloseContactsActivity2.t.remindList.get(0).accountId;
                                    }
                                    if (editCloseContactsActivity2.t.remindList.size() > 1 && addFamilyAccontBatchReq.remindList.size() > 1) {
                                        addFamilyAccontBatchReq.remindList.get(1).accountId = editCloseContactsActivity2.t.remindList.get(1).accountId;
                                    }
                                    ((ContactsApiService) S9.a.f8824a.f41079b).saveFamilyAccountBatch(addFamilyAccontBatchReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new r(editCloseContactsActivity2, 2));
                                } else {
                                    ((ContactsApiService) S9.a.f8824a.f41079b).saveFamilyAccountBatch(addFamilyAccontBatchReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new r(editCloseContactsActivity2, 2));
                                }
                            } else {
                                O6.c cVar = new O6.c(editCloseContactsActivity2);
                                cVar.f6596b = O6.d.f(editCloseContactsActivity2.getString(p025ba.k.core_notification_permission));
                                cVar.f6598d = editCloseContactsActivity2.getString(p025ba.k.core_notification_permission_tips);
                                String string = editCloseContactsActivity2.getString(p025ba.k.core_allow_now);
                                s sVar = new s(editCloseContactsActivity2, 3);
                                cVar.f6600f = string;
                                cVar.f6602h = sVar;
                                cVar.f6601g = editCloseContactsActivity2.getString(p025ba.k.core_no_thanks);
                                cVar.f6603i = null;
                                cVar.g();
                            }
                        }
                    } else if (BaseApplication.isNG()) {
                        ToastUtils.showShort(editCloseContactsActivity2.getText(p025ba.k.core_please_enter_11_digit_phone_number));
                    } else if (!BaseApplication.isAO()) {
                        ToastUtils.showShort(editCloseContactsActivity2.getText(p025ba.k.core_phone_number_wrong_format));
                    } else {
                        ToastUtils.showShort(editCloseContactsActivity2.getText(p025ba.k.core_please_enter_9_digit_phone_number));
                    }
                } else if (id2 != R9.d.cecca_delete_tv) {
                    if (id2 == com.transsnet.palmpay.custom_view.s.lepn_contact_tv) {
                        ARouter.getInstance().build("/contact/all").navigation(editCloseContactsActivity2, 1811);
                    } else if (id2 == R9.d.ce_add_remind) {
                        editCloseContactsActivity2.f27204f.setVisibility(8);
                        editCloseContactsActivity2.f27205g.setVisibility(0);
                    }
                } else if (editCloseContactsActivity2.t != null) {
                    ArrayList arrayList = new ArrayList();
                    if (editCloseContactsActivity2.t.remindList.size() > 0) {
                        arrayList.add(new DeleteFamilyAccontReq(editCloseContactsActivity2.t.remindList.get(0).accountId));
                    }
                    if (editCloseContactsActivity2.t.remindList.size() > 1) {
                        arrayList.add(new DeleteFamilyAccontReq(editCloseContactsActivity2.t.remindList.get(1).accountId));
                    }
                    ((ContactsApiService) S9.a.f8824a.f41079b).deleteFamilyAccountBatch(arrayList).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new r(editCloseContactsActivity2, 3));
                } else {
                    ToastUtils.showShort("Data error");
                }
                break;
            default:
                EditCloseContactsActivity editCloseContactsActivity3 = this.f10220b;
                if (!editCloseContactsActivity3.f27194C) {
                    AppUtils.gotoNotificationSettingPage(editCloseContactsActivity3);
                }
                if (!editCloseContactsActivity3.f27195H) {
                    ((PayApiService) p324va.c.f43141a.f14621b).enableDeviceNotification(new SetDeviceNotificationReq(true)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new r(editCloseContactsActivity3, 1));
                }
                break;
        }
    }
}
