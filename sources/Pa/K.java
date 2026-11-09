package Pa;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m;
import com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class K {
    /* JADX WARN: Code duplicated, block: B:260:0x04e6  */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0389, code lost:
    
        if (r11.equals("17") == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0396, code lost:
    
        if (r11.equals("16") == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x049e, code lost:
    
        if (r11.equals(com.transsnet.palmpay.core.bean.bill.TransType.TRANS_TYPE_BUNDLE) == false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x04a1, code lost:
    
        com.alibaba.android.arouter.launcher.ARouter.getInstance().build("/quick_teller/handle_result_page").withParcelable("pay_result_data", r7).navigation();
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(Pa.J r40) {
        /*
            Method dump skipped, instruction units count: 2924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pa.K.a(Pa.J):boolean");
    }

    public static boolean b(Integer num, String str, String str2) {
        if (num != null) {
            if (num.intValue() == 1) {
                C0.G.z("/core/result_pay_with_ussd", "orderType", str, "business_data", str2);
                if ("2".equals(str)) {
                    r0.B1();
                }
                if ("0".equals(str)) {
                    r0.A1();
                    return true;
                }
            } else if (num.intValue() == 2) {
                C0.G.z("/core/result_pay_with_ussd_by_push", "orderType", str, "business_data", str2);
                if ("2".equals(str)) {
                    r0.B1();
                }
                if ("0".equals(str)) {
                    r0.A1();
                    return true;
                }
            } else if (num.intValue() == 3) {
                String localClassName = null;
                try {
                    List<Activity> activityList = ActivityUtils.getActivityList();
                    for (int size = (activityList != null ? activityList.size() : 0) - 1; size >= 0; size--) {
                        Activity activity = activityList.get(size);
                        if (!(activity instanceof AbstractActivityC1479m) && !(activity instanceof BaseCoreCashierPreviewActivity)) {
                        }
                        localClassName = activity.getLocalClassName();
                        break;
                    }
                } catch (Exception unused) {
                }
                MessageEvent messageEvent = new MessageEvent(MessageEvent.EVENT_GET_USSD_PAY_RESULT);
                messageEvent.setEventContent(localClassName);
                org.greenrobot.eventbus.c.b().f(messageEvent);
            }
            return true;
        }
        return false;
    }

    public static void c(String str, String str2) {
        Context context = BaseApplication.getContext();
        String strJ = "1".equals(str) ? C0525w.j(str2, "desc") : C0525w.j(str2, "orderDesc");
        if (TextUtils.isEmpty(strJ)) {
            strJ = context.getString(p025ba.k.core_msg_manual_review);
        }
        ARouter.getInstance().build("/core/common_result").withInt("extra_result", 2).withString("extra_message", strJ).withString("extra_Btn1Text", context.getString(p025ba.k.core_complete)).navigation();
    }
}
