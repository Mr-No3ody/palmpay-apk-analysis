package Re;

import android.animation.ValueAnimator;
import androidx.camera.camera2.internal.F;
import com.horcrux.svg.d0;
import com.palmpay.lib.ui.calendar.CalendarLayout;
import com.palmpay.lib.ui.calendar.RunnableC1437g;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.custom_view.C1545c;
import com.transsnet.palmpay.custom_view.C1546d;
import com.transsnet.palmpay.custom_view.CoinRainNewView;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SizeUtils;
import com.wang.avi.indicators.BallPulseRiseIndicator;
import com.wang.avi.indicators.SemiCircleSpinIndicator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8573b;

    public /* synthetic */ g(Object obj, int i7) {
        this.f8572a = i7;
        this.f8573b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int screenWidth;
        int iNextInt;
        switch (this.f8572a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BallPulseRiseIndicator ballPulseRiseIndicator = (BallPulseRiseIndicator) this.f8573b;
                ballPulseRiseIndicator.f35449o = fFloatValue;
                ballPulseRiseIndicator.postInvalidate();
                break;
            case 1:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SemiCircleSpinIndicator semiCircleSpinIndicator = (SemiCircleSpinIndicator) this.f8573b;
                semiCircleSpinIndicator.f35473i = fFloatValue2;
                semiCircleSpinIndicator.postInvalidate();
                break;
            case 2:
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 1.0f;
                RunnableC1437g runnableC1437g = (RunnableC1437g) this.f8573b;
                CalendarLayout calendarLayout = runnableC1437g.f24209b;
                calendarLayout.f24104d.setTranslationY(calendarLayout.t * (fFloatValue3 / calendarLayout.f24111p));
                runnableC1437g.f24209b.f24095B = true;
                break;
            default:
                CoinRainNewView coinRainNewView = (CoinRainNewView) this.f8573b;
                coinRainNewView.f30966g++;
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (coinRainNewView.f30966g % (coinRainNewView.f30963d.size() > 5 ? 44 : 22) == 0) {
                    int iDp2px = SizeUtils.dp2px(50.0f);
                    int width = coinRainNewView.getWidth();
                    if (width > 0) {
                        screenWidth = width;
                    } else {
                        screenWidth = coinRainNewView.f30962c;
                        if (screenWidth <= 0) {
                            screenWidth = ScreenUtils.getScreenWidth();
                        }
                    }
                    float f10 = screenWidth;
                    float f11 = f10 * 0.1f;
                    float f12 = (0.8f * f10) + f11;
                    int i7 = (int) f11;
                    int i10 = (int) f12;
                    int iNextInt2 = i10 - iDp2px;
                    if (iNextInt2 > i7) {
                        iNextInt = coinRainNewView.f30965f.nextInt((iNextInt2 - i7) + 1) + i7;
                        if (iNextInt + iDp2px <= i10) {
                            iNextInt2 = iNextInt;
                        }
                    } else if (screenWidth > iDp2px) {
                        int i11 = ((int) (f10 * 0.90000004f)) - iDp2px;
                        if (i11 > i7) {
                            iNextInt = coinRainNewView.f30965f.nextInt((i11 - i7) + 1) + i7;
                            iNextInt2 = iNextInt;
                        } else {
                            iNextInt2 = i7;
                        }
                    } else {
                        float screenWidth2 = ScreenUtils.getScreenWidth();
                        int i12 = (int) (0.1f * screenWidth2);
                        int i13 = ((int) (screenWidth2 * 0.90000004f)) - iDp2px;
                        iNextInt2 = i13 > i12 ? coinRainNewView.f30965f.nextInt((i13 - i12) + 1) + i12 : i12;
                    }
                    StringBuilder sbE = F.e(iNextInt2, "randomX = ", ", rotate = ");
                    int i14 = iIntValue % MessageEvent.EVENT_CL_REPAYMENT_FAILED;
                    sbE.append(i14);
                    sbE.append(", availableWidth=");
                    sbE.append(screenWidth);
                    sbE.append(", centerArea=[");
                    sbE.append(i7);
                    sbE.append(",");
                    sbE.append(i10);
                    sbE.append("], iconRightEdge=");
                    sbE.append(iDp2px + iNextInt2);
                    sbE.append(", currentViewWidth=");
                    sbE.append(width);
                    F6.d.h("CoinRainView", 3, sbE.toString());
                    ArrayList arrayList = coinRainNewView.f30963d;
                    int i15 = coinRainNewView.f30970p + 1;
                    coinRainNewView.f30970p = i15;
                    C1546d c1546d = new C1546d();
                    c1546d.f31229a = iNextInt2;
                    c1546d.f31230b = 0;
                    c1546d.f31231c = i14;
                    c1546d.f31232d = i15;
                    c1546d.f31233e = CoinRainNewView.a(coinRainNewView, i15);
                    arrayList.add(c1546d);
                }
                Iterator it = coinRainNewView.f30963d.iterator();
                while (it.hasNext()) {
                    C1546d c1546d2 = (C1546d) it.next();
                    int i16 = c1546d2.f31232d % 3;
                    if (i16 == 0) {
                        c1546d2.f31230b += 15;
                    } else if (i16 == 1) {
                        c1546d2.f31230b += 12;
                    } else {
                        c1546d2.f31230b += 9;
                    }
                    if (c1546d2.f31230b > coinRainNewView.f30967i) {
                        it.remove();
                    }
                }
                if (coinRainNewView.f30969o || !coinRainNewView.f30964e.isEmpty()) {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Iterator it2 = coinRainNewView.f30964e.iterator();
                        while (it2.hasNext()) {
                            C1545c c1545c = (C1545c) it2.next();
                            long j6 = jCurrentTimeMillis - c1545c.f31207o;
                            if (j6 >= 2000) {
                                c1545c.f31193a.recycle();
                                it2.remove();
                            } else {
                                float f13 = j6 / 2000;
                                if (f13 <= 1.0f) {
                                    float f14 = 1.0f - f13;
                                    float f15 = f14 * f14;
                                    float f16 = f14 * 2.0f * f13;
                                    float f17 = f13 * f13;
                                    c1545c.f31196d = (c1545c.f31198f * f17) + (c1545c.f31200h * f16) + (c1545c.f31194b * f15);
                                    c1545c.f31197e = (f17 * c1545c.f31199g) + (f16 * c1545c.f31201i) + (f15 * c1545c.f31195c);
                                }
                                c1545c.f31202j = f13 + 1.0f;
                                if (f13 <= 0.3f) {
                                    c1545c.f31203k = c1545c.f31204l * (f13 / 0.3f);
                                } else {
                                    float f18 = c1545c.f31204l;
                                    c1545c.f31203k = d0.e(c1545c.f31205m, f18, (f13 - 0.3f) / 0.7f, f18);
                                }
                                if (f13 <= 0.3f) {
                                    c1545c.f31206n = 1.0f;
                                } else {
                                    c1545c.f31206n = 1.0f - ((f13 - 0.3f) / 0.7f);
                                }
                            }
                            break;
                        }
                    } catch (Exception unused) {
                    }
                }
                coinRainNewView.postInvalidate();
                break;
        }
    }
}
