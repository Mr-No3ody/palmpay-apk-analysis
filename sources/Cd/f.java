package Cd;

import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.send_money.bean.AddRecipientResp;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.bean.event.AddRecipientEvent;
import com.transsnet.palmpay.send_money.bean.resp.QueryRecipientRelationshipListResp;
import com.transsnet.palmpay.send_money.ui.fragment.AddMobileContactFragment;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.List;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AddMobileContactFragment f1364g;

    public /* synthetic */ f(AddMobileContactFragment addMobileContactFragment, int i7) {
        this.f1363f = i7;
        this.f1364g = addMobileContactFragment;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f1363f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f1364g.f(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f1364g.f(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f1364g.f(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f1363f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f1364g.showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f1364g.showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f1364g.showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e5 A[LOOP:1: B:37:0x00c8->B:43:0x00e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x00e8 A[SYNTHETIC] */
    @Override // Z4.e
    public final void y(Object obj) {
        String respMsg;
        String respMsg2;
        List list;
        switch (this.f1363f) {
            case 0:
                AddRecipientResp addRecipientResp = (AddRecipientResp) obj;
                AddMobileContactFragment addMobileContactFragment = this.f1364g;
                addMobileContactFragment.showLoadingDialog(false);
                if (addRecipientResp == null || !addRecipientResp.isSuccess()) {
                    if (addRecipientResp == null || (respMsg = addRecipientResp.getRespMsg()) == null) {
                        respMsg = "";
                    }
                    AddMobileContactFragment.v(addMobileContactFragment, respMsg);
                } else {
                    ToastUtils.showLong(p159kd.h.sm_add_contact_successful);
                    org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(1));
                    addMobileContactFragment.requireActivity().finish();
                }
                break;
            case 1:
                CommonResult commonResult = (CommonResult) obj;
                AddMobileContactFragment addMobileContactFragment2 = this.f1364g;
                addMobileContactFragment2.showLoadingDialog(false);
                if (commonResult == null || !commonResult.isSuccess()) {
                    if (commonResult == null || (respMsg2 = commonResult.getRespMsg()) == null) {
                        respMsg2 = "";
                    }
                    AddMobileContactFragment.v(addMobileContactFragment2, respMsg2);
                } else {
                    ToastUtils.showLong(p159kd.h.sm_save_successfully);
                    org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(1));
                    addMobileContactFragment2.requireActivity().finish();
                }
                break;
            default:
                QueryRecipientRelationshipListResp queryRecipientRelationshipListResp = (QueryRecipientRelationshipListResp) obj;
                if (queryRecipientRelationshipListResp != null && queryRecipientRelationshipListResp.isSuccess() && queryRecipientRelationshipListResp.getData() != null) {
                    List<QueryRecipientRelationshipListResp.Data> data = queryRecipientRelationshipListResp.getData();
                    AddMobileContactFragment addMobileContactFragment3 = this.f1364g;
                    addMobileContactFragment3.f33668w = data;
                    List<QueryRecipientRelationshipListResp.Data> data2 = queryRecipientRelationshipListResp.getData();
                    List<QueryRecipientRelationshipListResp.Data> list2 = data2;
                    if (list2 != null && !list2.isEmpty()) {
                        p223od.l lVar = (p223od.l) addMobileContactFragment3.f27335j;
                        if (lVar != null) {
                            lVar.f40414d.removeAllViews();
                        }
                        int size = list2.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            QueryRecipientRelationshipListResp.Data data3 = data2.get(i7);
                            TextView textView = new TextView(addMobileContactFragment3.f27319c);
                            textView.setLayoutParams(new FlexboxLayout.LayoutParams(DensityUtil.dp2px(65.0f), DensityUtil.dp2px(26.0f)));
                            textView.setBackgroundResource(p159kd.d.sm_common_relationship_bg);
                            textView.setTextColor(addMobileContactFragment3.getResources().getColorStateList(p159kd.b.sm_relationship_select_color));
                            textView.setGravity(17);
                            textView.setText(data3.getRelationshipName());
                            textView.setTextSize(1, 12.0f);
                            textView.setOnClickListener(new e(addMobileContactFragment3, 4));
                            textView.setTag(Integer.valueOf(i7));
                            p223od.l lVar2 = (p223od.l) addMobileContactFragment3.f27335j;
                            if (lVar2 != null) {
                                lVar2.f40414d.addView(textView);
                            }
                        }
                        int i10 = -1;
                        if (addMobileContactFragment3.f33667v != null && (list = addMobileContactFragment3.f33668w) != null && !list.isEmpty()) {
                            List list3 = addMobileContactFragment3.f33668w;
                            IntRange intRangeF = list3 != null ? C1850q.f(list3) : null;
                            Intrinsics.e(intRangeF);
                            int i11 = intRangeF.f38977a;
                            int i12 = intRangeF.f38978b;
                            if (i11 <= i12) {
                                while (true) {
                                    RecipientListResp.RecipientBean recipientBean = addMobileContactFragment3.f33667v;
                                    if (recipientBean != null) {
                                        List list4 = addMobileContactFragment3.f33668w;
                                        Intrinsics.e(list4);
                                        if (((QueryRecipientRelationshipListResp.Data) list4.get(i11)).getRelationship() == recipientBean.getRelationship()) {
                                            i10 = i11;
                                        } else if (i11 != i12) {
                                            i11++;
                                        }
                                    } else if (i11 != i12) {
                                        i11++;
                                    }
                                }
                            }
                        }
                        addMobileContactFragment3.t = i10;
                        addMobileContactFragment3.x(true);
                        break;
                    }
                }
                break;
        }
    }
}
