package N8;

import android.content.Intent;
import android.view.View;
import com.transsnet.palmpay.account.ui.activity.SetPatternPinActivity;
import com.transsnet.palmpay.account.ui.activity.SetTouchIdActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class Q implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SetPatternPinActivity f6172b;

    public /* synthetic */ Q(SetPatternPinActivity setPatternPinActivity, int i7) {
        this.f6171a = i7;
        this.f6172b = setPatternPinActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6171a) {
            case 0:
                int id2 = view.getId();
                int i7 = F8.d.sppa_reset_tv;
                SetPatternPinActivity setPatternPinActivity = this.f6172b;
                if (id2 == i7) {
                    SetPatternPinActivity.l(setPatternPinActivity);
                } else if (id2 == F8.d.asppa_use_pattern_tv) {
                    Intent intent = new Intent(setPatternPinActivity, (Class<?>) SetTouchIdActivity.class);
                    intent.putExtra("IS_FORCE_SETTING_MODE", true);
                    setPatternPinActivity.startActivityForResult(intent, 257);
                    setPatternPinActivity.finish();
                }
                break;
            default:
                SetPatternPinActivity setPatternPinActivity2 = this.f6172b;
                SetPatternPinActivity.l(setPatternPinActivity2);
                setPatternPinActivity2.f26006v.setRightText("");
                break;
        }
    }
}
