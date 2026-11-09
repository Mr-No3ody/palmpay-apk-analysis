package Ja;

import android.app.Activity;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import com.flexibank.sdk.core.viewmodel.FlexiBankOneTimeCodeView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.listener.OnSendCodeListener;
import com.transsnet.palmpay.core.viewmodel.MobileNumberInputV4View;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeSimpleView;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV2View;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV3View;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV4View;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeView;
import com.transsnet.palmpay.jara_packet.ui.model.comments.AutoPollRecyclerView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ja.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0336i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f4657b;

    public /* synthetic */ RunnableC0336i(int i7) {
        this.f4656a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        TextView textView7;
        PpButton mTextViewSendSms;
        switch (this.f4656a) {
            case 0:
                WeakReference weakReference = this.f4657b;
                TextView textView8 = weakReference != null ? (TextView) weakReference.get() : null;
                if (textView8 != null) {
                    Long l5 = (Long) textView8.getTag();
                    if (l5 != null) {
                        long jLongValue = (l5.longValue() + 60000) - SystemClock.elapsedRealtime();
                        if (jLongValue <= 0) {
                            textView8.setEnabled(true);
                            textView8.setText(textView8.getContext().getResources().getString(p025ba.k.core_get_code));
                        } else {
                            textView8.setEnabled(false);
                            textView8.setText(textView8.getContext().getResources().getString(p025ba.k.core_resend) + " (" + String.valueOf(jLongValue / 1000) + "s)");
                            textView8.postDelayed(this, 1000L);
                        }
                    } else {
                        textView8.removeCallbacks(this);
                    }
                    break;
                }
                break;
            case 1:
                WeakReference weakReference2 = this.f4657b;
                MobileNumberInputV4View mobileNumberInputV4View = weakReference2 != null ? (MobileNumberInputV4View) weakReference2.get() : null;
                if (mobileNumberInputV4View != null && (textView = mobileNumberInputV4View.f28229e) != null) {
                    textView.setText("");
                }
                MobileNumberInputV4View mobileNumberInputV4View2 = weakReference2 != null ? (MobileNumberInputV4View) weakReference2.get() : null;
                if (mobileNumberInputV4View2 != null && (view = mobileNumberInputV4View2.f28232i) != null) {
                    p220oa.h.s(view, false);
                    break;
                }
                break;
            case 2:
                WeakReference weakReference3 = this.f4657b;
                OneTimeCodeSimpleView oneTimeCodeSimpleView = weakReference3 != null ? (OneTimeCodeSimpleView) weakReference3.get() : null;
                if (oneTimeCodeSimpleView != null && (textView2 = oneTimeCodeSimpleView.f28445e) != null) {
                    Long l6 = (Long) textView2.getTag();
                    if (l6 != null) {
                        int i7 = OneTimeCodeSimpleView.f28440o;
                        long jLongValue2 = (l6.longValue() + ((long) 60000)) - SystemClock.elapsedRealtime();
                        if (jLongValue2 <= 0) {
                            textView2.setText("");
                            textView2.setVisibility(8);
                            oneTimeCodeSimpleView.setSendOtcButtonState(true);
                        } else {
                            if (oneTimeCodeSimpleView.f28447g && jLongValue2 <= 50000) {
                                oneTimeCodeSimpleView.f28447g = false;
                            }
                            textView2.setEnabled(false);
                            textView2.setText("(" + String.valueOf(jLongValue2 / 1000) + " s)");
                            textView2.postDelayed(this, 1000L);
                        }
                    } else {
                        textView2.removeCallbacks(this);
                    }
                }
                break;
            case 3:
                WeakReference weakReference4 = this.f4657b;
                OneTimeCodeV2View oneTimeCodeV2View = weakReference4 != null ? (OneTimeCodeV2View) weakReference4.get() : null;
                if (oneTimeCodeV2View != null && (textView3 = oneTimeCodeV2View.f28459i) != null) {
                    Long l8 = (Long) textView3.getTag();
                    if (l8 != null) {
                        long jLongValue3 = (l8.longValue() + 60000) - SystemClock.elapsedRealtime();
                        if (jLongValue3 <= 0) {
                            textView3.setText("");
                            oneTimeCodeV2View.f28461o = true;
                            OnSendCodeListener onSendCodeListener = oneTimeCodeV2View.f28462p;
                            if (onSendCodeListener != null) {
                                onSendCodeListener.onButtonVisibilityChange(oneTimeCodeV2View.f28455d, 0);
                            }
                            oneTimeCodeV2View.setSendOtcButtonState(true);
                        } else {
                            textView3.setEnabled(false);
                            textView3.setText("(" + String.valueOf(jLongValue3 / 1000) + " s)");
                            textView3.postDelayed(this, 1000L);
                        }
                    } else {
                        textView3.removeCallbacks(this);
                    }
                }
                break;
            case 4:
                WeakReference weakReference5 = this.f4657b;
                OneTimeCodeV3View oneTimeCodeV3View = weakReference5 != null ? (OneTimeCodeV3View) weakReference5.get() : null;
                if (oneTimeCodeV3View != null && (textView4 = oneTimeCodeV3View.f28471e) != null) {
                    Long l10 = (Long) textView4.getTag();
                    if (l10 != null) {
                        long jLongValue4 = (l10.longValue() + ((long) OneTimeCodeV3View.f28465B)) - SystemClock.elapsedRealtime();
                        if (jLongValue4 <= 0) {
                            textView4.setText("");
                            textView4.setVisibility(8);
                            oneTimeCodeV3View.setSendOtcButtonState(true);
                        } else {
                            if (oneTimeCodeV3View.f28474i && jLongValue4 <= 50000) {
                                oneTimeCodeV3View.f28470d.setVisibility(0);
                                oneTimeCodeV3View.f28474i = false;
                            }
                            textView4.setEnabled(false);
                            textView4.setText("(" + String.valueOf(jLongValue4 / 1000) + " s)");
                            textView4.postDelayed(this, 1000L);
                        }
                    } else {
                        textView4.removeCallbacks(this);
                    }
                }
                break;
            case 5:
                WeakReference weakReference6 = this.f4657b;
                OneTimeCodeV4View oneTimeCodeV4View = weakReference6 != null ? (OneTimeCodeV4View) weakReference6.get() : null;
                if (oneTimeCodeV4View != null && (textView5 = oneTimeCodeV4View.f28486e) != null) {
                    Long l11 = (Long) textView5.getTag();
                    if (l11 != null) {
                        long jLongValue5 = (l11.longValue() + ((long) OneTimeCodeV4View.f28480B)) - SystemClock.elapsedRealtime();
                        if (jLongValue5 <= 0) {
                            textView5.setText("");
                            textView5.setVisibility(8);
                            oneTimeCodeV4View.setSendOtcButtonState(true);
                        } else {
                            if (oneTimeCodeV4View.f28488g && jLongValue5 <= 50000) {
                                oneTimeCodeV4View.l();
                                oneTimeCodeV4View.f28488g = false;
                            }
                            textView5.setEnabled(false);
                            textView5.setText("(" + String.valueOf(jLongValue5 / 1000) + " s)");
                            textView5.postDelayed(this, 1000L);
                        }
                    } else {
                        textView5.removeCallbacks(this);
                    }
                }
                break;
            case 6:
                WeakReference weakReference7 = this.f4657b;
                OneTimeCodeView oneTimeCodeView = weakReference7 != null ? (OneTimeCodeView) weakReference7.get() : null;
                if (oneTimeCodeView != null && (textView6 = oneTimeCodeView.f28512f) != null) {
                    textView6.setText("");
                    oneTimeCodeView.f28511e.setVisibility(4);
                    break;
                }
                break;
            case 7:
                WeakReference weakReference8 = this.f4657b;
                OneTimeCodeView oneTimeCodeView2 = weakReference8 != null ? (OneTimeCodeView) weakReference8.get() : null;
                if (oneTimeCodeView2 != null && (textView7 = oneTimeCodeView2.f28510d) != null) {
                    Long l12 = (Long) textView7.getTag();
                    if (l12 != null) {
                        long jLongValue6 = (l12.longValue() + 60000) - SystemClock.elapsedRealtime();
                        if (jLongValue6 <= 0) {
                            oneTimeCodeView2.f28515j = true;
                            oneTimeCodeView2.setSendOtcButtonState(true);
                        } else {
                            textView7.setEnabled(false);
                            textView7.setText(String.valueOf(jLongValue6 / 1000) + "s");
                            textView7.postDelayed(this, 1000L);
                        }
                    } else {
                        textView7.removeCallbacks(this);
                    }
                }
                break;
            case 8:
                try {
                    WeakReference weakReference9 = this.f4657b;
                    Activity activity = weakReference9 != null ? (Activity) weakReference9.get() : null;
                    if (activity != null) {
                        Intent intent = new Intent();
                        intent.setClassName(activity.getPackageName(), "com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity");
                        activity.startActivity(intent);
                        if (!"SplashActivity".equals(activity.getClass().getSimpleName())) {
                            activity.overridePendingTransition(p025ba.a.core_anim_fade_in, com.transsnet.palmpay.custom_view.m.cv_anim_keep_activity);
                        } else {
                            activity.overridePendingTransition(p025ba.a.core_anim_fade_in, com.transsnet.palmpay.custom_view.m.cv_anim_keep_activity_2s);
                        }
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 9:
                WeakReference weakReference10 = this.f4657b;
                FlexiBankOneTimeCodeView flexiBankOneTimeCodeView = weakReference10 != null ? (FlexiBankOneTimeCodeView) weakReference10.get() : null;
                if (flexiBankOneTimeCodeView != null && flexiBankOneTimeCodeView.getMTextViewError() != null) {
                    TextView mTextViewError = flexiBankOneTimeCodeView.getMTextViewError();
                    Intrinsics.e(mTextViewError);
                    mTextViewError.setText("");
                    View mViewError = flexiBankOneTimeCodeView.getMViewError();
                    Intrinsics.e(mViewError);
                    mViewError.setVisibility(4);
                    break;
                }
                break;
            case 10:
                WeakReference weakReference11 = this.f4657b;
                FlexiBankOneTimeCodeView flexiBankOneTimeCodeView2 = weakReference11 != null ? (FlexiBankOneTimeCodeView) weakReference11.get() : null;
                if (flexiBankOneTimeCodeView2 != null && (mTextViewSendSms = flexiBankOneTimeCodeView2.getMTextViewSendSms()) != null) {
                    Long l13 = (Long) mTextViewSendSms.getTag();
                    if (l13 != null) {
                        long jLongValue7 = (l13.longValue() + ((long) FlexiBankOneTimeCodeView.f22135p)) - SystemClock.elapsedRealtime();
                        if (jLongValue7 <= 0) {
                            flexiBankOneTimeCodeView2.f22144j = true;
                            flexiBankOneTimeCodeView2.setSendOtcButtonState(true);
                        } else {
                            mTextViewSendSms.setEnabled(false);
                            mTextViewSendSms.setText((jLongValue7 / ((long) 1000)) + "s");
                            mTextViewSendSms.postDelayed(this, 1000L);
                        }
                    } else {
                        mTextViewSendSms.removeCallbacks(this);
                    }
                }
                break;
            default:
                AutoPollRecyclerView autoPollRecyclerView = (AutoPollRecyclerView) this.f4657b.get();
                if (autoPollRecyclerView != null && autoPollRecyclerView.f31982b && autoPollRecyclerView.f31983c) {
                    autoPollRecyclerView.scrollBy(2, 2);
                    autoPollRecyclerView.postDelayed(autoPollRecyclerView.f31981a, 16L);
                    break;
                }
                break;
        }
    }

    public RunnableC0336i(AutoPollRecyclerView autoPollRecyclerView) {
        this.f4656a = 11;
        this.f4657b = new WeakReference(autoPollRecyclerView);
    }

    public RunnableC0336i(FlexiBankOneTimeCodeView flexiBankOneTimeCodeView, int i7) {
        this.f4656a = i7;
        switch (i7) {
            case 10:
                this.f4657b = new WeakReference(flexiBankOneTimeCodeView);
                break;
            default:
                this.f4657b = new WeakReference(flexiBankOneTimeCodeView);
                break;
        }
    }

    public RunnableC0336i(MobileNumberInputV4View view) {
        this.f4656a = 1;
        Intrinsics.checkNotNullParameter(view, "view");
        this.f4657b = new WeakReference(view);
    }
}
