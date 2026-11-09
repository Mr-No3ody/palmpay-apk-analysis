package Jd;

import Pa.r0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.video.u;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.util.ImageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p159kd.e;
import p159kd.f;
import p159kd.h;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static String a(long j6) {
        return BaseApplication.getCurrencySymbol() + " " + r0.A(j6);
    }

    public static String b(int i7) {
        if (i7 == 1) {
            return "1st";
        }
        if (i7 == 2) {
            return "2nd";
        }
        return i7 == 3 ? "3rd" : u.g(i7, "th");
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "#";
        }
        String upperCase = str.substring(0, 1).toUpperCase();
        return !upperCase.matches("[A-Z]") ? "#" : upperCase;
    }

    public static String d(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : r0.D0(r0.w0(str2));
    }

    public static String e(int i7, Context context) {
        if (i7 == 3) {
            return context.getString(h.sm_money_transfer_bank_account);
        }
        if (i7 == 9) {
            return context.getString(h.sm_money_transfer_mmo);
        }
        if (i7 == 11) {
            return context.getString(h.sm_money_transfer_cash_out);
        }
        return i7 == 13 ? context.getString(h.sm_money_transfer_to_merchant) : context.getString(h.sm_money_transfer_palmpay);
    }

    public static Bitmap f(Context context, String str, String str2) {
        View viewInflate = LayoutInflater.from(context).inflate(f.sm_layout_pay_me_poster, (ViewGroup) null);
        int color = Color.parseColor("#202046");
        ((TextView) viewInflate.findViewById(e.tv_title)).setTextColor(color);
        TextView textView = (TextView) viewInflate.findViewById(e.tv_name);
        textView.setText(str2);
        textView.setTextColor(color);
        TextView textView2 = (TextView) viewInflate.findViewById(e.tv_account);
        textView2.setText(str);
        textView2.setTextColor(color);
        return ImageUtils.getViewBitmapByMeasure(viewInflate);
    }

    public static ArrayList g(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        String str = "";
        while (it.hasNext()) {
            BankInfo bankInfo = (BankInfo) it.next();
            String strC = c(bankInfo.bankName);
            if (!str.equals(strC)) {
                BankInfo bankInfo2 = new BankInfo();
                bankInfo2.isHeader = true;
                bankInfo2.bankName = bankInfo.bankName;
                arrayList.add(bankInfo2);
                str = strC;
            }
            arrayList.add(bankInfo);
        }
        return arrayList;
    }

    public static ArrayList h(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        String str = "";
        while (it.hasNext()) {
            RecipientListResp.RecipientBean recipientBean = (RecipientListResp.RecipientBean) it.next();
            String strC = c(recipientBean.getRecipientNickname());
            if (!str.equals(strC)) {
                RecipientListResp.RecipientBean recipientBean2 = new RecipientListResp.RecipientBean();
                recipientBean2.isHeader = true;
                recipientBean2.setRecipientNickname(recipientBean.getRecipientNickname());
                arrayList.add(recipientBean2);
                str = strC;
            }
            arrayList.add(recipientBean);
        }
        return arrayList;
    }
}
