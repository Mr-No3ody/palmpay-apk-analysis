package N8;

import Pa.r0;
import com.transsnet.palmpay.account.ui.activity.SetPatternPinActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.PatternLockView;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.FileIOUtils;
import com.transsnet.palmpay.util.SPUtils;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class P implements PatternLockView.UnlockListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SetPatternPinActivity f6170a;

    public P(SetPatternPinActivity setPatternPinActivity) {
        this.f6170a = setPatternPinActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.PatternLockView.UnlockListener
    public final void drawOver(int[] iArr) {
        String string;
        int i7 = 1;
        int i10 = SetPatternPinActivity.f25991H;
        SetPatternPinActivity setPatternPinActivity = this.f6170a;
        if (!r0.X0(iArr)) {
            setPatternPinActivity.m(setPatternPinActivity.getString(F8.h.ac_msg_connect_4_dots));
            L8.a.c(setPatternPinActivity.f26002i);
            return;
        }
        setPatternPinActivity.n();
        if (setPatternPinActivity.f26004o == 1) {
            setPatternPinActivity.f25996b.setNumbers(iArr);
            setPatternPinActivity.f26005p = (int[]) iArr.clone();
            setPatternPinActivity.f26004o = 2;
            setPatternPinActivity.f25999e.setText(F8.h.ac_pattern_step2);
            setPatternPinActivity.n();
            return;
        }
        int[] iArr2 = (int[]) iArr.clone();
        setPatternPinActivity.t = iArr2;
        int[] iArr3 = setPatternPinActivity.f26005p;
        if (iArr3 != null && iArr3.length == iArr2.length) {
            int i11 = 0;
            while (true) {
                if (i11 >= iArr3.length) {
                    setPatternPinActivity.f25996b.setNumbers(iArr);
                    int[] iArr4 = setPatternPinActivity.f26005p;
                    if (iArr4 == null) {
                        string = "";
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        for (int i12 : iArr4) {
                            sb2.append(i12);
                        }
                        string = sb2.toString();
                    }
                    String sHA256StrJava = AppUtils.getSHA256StrJava(string);
                    SPUtils.getInstance().put(com.transsnet.palmpay.core.config.d.m(), sHA256StrJava);
                    try {
                        FileIOUtils.writeFileFromString(new File(BaseApplication.getContext().getCacheDir(), com.transsnet.palmpay.core.config.d.m()), sHA256StrJava);
                    } catch (Exception e10) {
                        F6.d.c("PatternLockUtil", "setToken: ", e10);
                    }
                    r0.Q1(true);
                    setPatternPinActivity.setResult(-1);
                    setPatternPinActivity.finish();
                    r0.o();
                    return;
                }
                if (iArr3[i11] != iArr2[i11]) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        setPatternPinActivity.f26003j++;
        setPatternPinActivity.f26006v.setRightText(setPatternPinActivity.getString(F8.h.ac_reset));
        setPatternPinActivity.f26006v.setRightTextViewClickListener(new Q(setPatternPinActivity, i7));
        if (setPatternPinActivity.f26003j < 3) {
            setPatternPinActivity.m(setPatternPinActivity.getResources().getString(F8.h.ac_pattern_not_match_try_again));
        } else {
            setPatternPinActivity.m(setPatternPinActivity.getResources().getString(F8.h.ac_incorrectly_times_reset_it));
        }
        if (setPatternPinActivity.f26003j > 1) {
            L8.a.c(setPatternPinActivity.f26002i);
        }
    }
}
