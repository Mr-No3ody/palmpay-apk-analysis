package cn.tongdun.android.qgq9qg99;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cn.tongdun.android.qgq9qg99.qggqgq99q999g.ggq999qqgqgq9g9qqq;
import cn.tongdun.android.qgq9qg99.qggqgq99q999g.q999qqg;
import cn.tongdun.android.qgq9qg99.qggqgq99q999g.qq9gg9q;
import cn.tongdun.android.qgq9qg99.qgq9qg99.gq9qqgq9q9;
import cn.tongdun.android.qgq9qg99.qgq9qg99.qgg9gg99qgqgq;
import cn.tongdun.android.qgq9qg99.qgq9qg99.qggq9gqq9q99g99q;
import cn.tongdun.android.shell.FMAgent;
import cn.tongdun.android.shell.TDOption;
import cn.tongdun.android.shell.common.HelperJNI;
import cn.tongdun.android.shell.inter.FMCallback;
import com.adjust.sdk.Constants;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class q999ggg99999qqggqqg9qg {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    public static boolean f19092q999ggg99999qqggqqg9qg = false;
    public static boolean qqggggg9g9q99q9gq;
    private Handler g99q9ggqg9gqgq9;
    private volatile byte[] ggq999qqgqgq9g9qqq;
    private gq9qqgq9q9 gqg99q9q9q;
    private volatile boolean q999qqg;
    private HandlerThread q9q9gqgqg9qgqg9qggq9;
    public TDOption qgqq999g;
    private static final ArrayDeque q99q99qq99q9g = new ArrayDeque();
    public static volatile boolean gqgg9q99qg9 = true;
    private static boolean gq9gggq9gq9gg9q99g9q = false;
    private final cn.tongdun.android.qgq9qg99.qgq9qg99 qg9gqgqqggg9q9qg = new cn.tongdun.android.qgq9qg99.qgq9qg99(this);
    private boolean q9q999qgg99gq9qq9qqq9g = false;
    private volatile boolean qggqgq99q999g = false;
    public String qgq9qg99 = q999ggg99999qqggqqg9qg("452e32323228", 40);
    private long qqg999qq = 0;
    private CountDownLatch qq9gg99gqqqgqgq999gqg = null;
    private CountDownLatch gqgqgq9qqqg999qggqqqg = null;
    private final Object qq9gg9q = new Object();
    private final qggqgq99q999g q99g9q99 = new qggqgq99q999g(this);

    /* JADX INFO: renamed from: cn.tongdun.android.qgq9qg99.q999ggg99999qqggqqg9qg$q999ggg99999qqggqqg9qg, reason: collision with other inner class name */
    public interface InterfaceC0009q999ggg99999qqggqqg9qg {
        void q999ggg99999qqggqqg9qg();
    }

    public class qgq9qg99 implements InterfaceC0009q999ggg99999qqggqqg9qg {

        /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
        private final Context f19093q999ggg99999qqggqqg9qg;

        public qgq9qg99(Context context) {
            this.f19093q999ggg99999qqggqqg9qg = context;
        }

        @Override // cn.tongdun.android.qgq9qg99.q999ggg99999qqggqqg9qg.InterfaceC0009q999ggg99999qqggqqg9qg
        public final void q999ggg99999qqggqqg9qg() {
            String strGqgg9q99qg9;
            cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgq9qg99 qgq9qg99VarQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgq9qg99.q999ggg99999qqggqqg9qg();
            if (qgq9qg99VarQ999ggg99999qqggqqg9qg.qgq9qg99()) {
                cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgqq999g qgqq999gVarQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg();
                if (!cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.qgq9qg99() || qgqq999gVarQ999ggg99999qqggqqg9qg == null) {
                    strGqgg9q99qg9 = cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg.this.gqg99q9q9q.qqggggg9g9q99q9gq());
                } else {
                    strGqgg9q99qg9 = cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg(qgqq999gVarQ999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(), 0);
                    cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.qgq9qg99(this.f19093q999ggg99999qqggqqg9qg, strGqgg9q99qg9, qgqq999gVarQ999ggg99999qqggqqg9qg.qgq9qg99());
                }
            } else {
                qgq9qg99VarQ999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(1);
                strGqgg9q99qg9 = q999ggg99999qqggqqg9qg.this.gqgg9q99qg9(this.f19093q999ggg99999qqggqqg9qg);
            }
            q999ggg99999qqggqqg9qg.this.q999ggg99999qqggqqg9qg(strGqgg9q99qg9);
        }
    }

    public static class qqggggg9g9q99q9gq {

        /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
        static final q999ggg99999qqggqqg9qg f19094q999ggg99999qqggqqg9qg = new q999ggg99999qqggqqg9qg();
    }

    static {
        try {
            System.currentTimeMillis();
            cn.tongdun.android.qgq9qg99.q9q999qgg99gq9qq9qqq9g.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(), q999ggg99999qqggqqg9qg("446d777f75676d", 107), q999ggg99999qqggqqg9qg("04454545424244", 66), null);
            qqggggg9g9q99q9gq = true;
        } catch (Throwable th) {
            qqggggg9g9q99q9gq = false;
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.qqg999qq, th.getMessage());
            cn.tongdun.android.shell.common.qgqq999g.q999ggg99999qqggqqg9qg(400, q999ggg99999qqggqqg9qg("7c2f0209485f10434a0b0409050d46", 17));
        }
    }

    public q999ggg99999qqggqqg9qg() {
        HandlerThread handlerThread = new HandlerThread(q999ggg99999qqggqqg9qg("445d474f45575d77714f494c4e4f51", 91));
        this.q9q9gqgqg9qgqg9qggq9 = handlerThread;
        handlerThread.start();
        this.g99q9ggqg9gqgq9 = new Handler(this.q9q9gqgqg9qgqg9qggq9.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String gqgg9q99qg9(Context context) {
        if (!cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.qgq9qg99()) {
            return cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q99g9q99 ? cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg(this.gqg99q9q9q.qqggggg9g9q99q9gq()) : qqggggg9g9q99q9gq(context);
        }
        cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgqq999g qgqq999gVarQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg();
        return (qgqq999gVarQ999ggg99999qqggqqg9qg == null || TextUtils.isEmpty(qgqq999gVarQ999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg())) ? qqggggg9g9q99q9gq(context) : cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg(qgqq999gVarQ999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(), 0);
    }

    private String qgq9qg99(Context context) {
        String strQqggggg9g9q99q9gq;
        String strQ999ggg99999qqggqqg9qg;
        String strQ999ggg99999qqggqqg9qg2;
        cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgqq999g qgqq999gVarQgq9qg99;
        try {
            cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99 qgq9qg99VarQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.q999ggg99999qqggqqg9qg();
            String str = cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19075q999ggg99999qqggqqg9qg;
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.gqgg9q99qg9 gqgg9q99qg9Var = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.gqgg9q99qg9.f19271q999ggg99999qqggqqg9qg;
            if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.q9q999qgg99gq9qq9qqq9g.q999ggg99999qqggqqg9qg(context, str, gqgg9q99qg9Var.q999ggg99999qqggqqg9qg())) {
                String str2 = cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgqq999g;
                cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qgq9qg99 qgq9qg99Var = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qgq9qg99.f19273q999ggg99999qqggqqg9qg;
                if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.q9q999qgg99gq9qq9qqq9g.q999ggg99999qqggqqg9qg(context, str2, qgq9qg99Var.q999ggg99999qqggqqg9qg())) {
                    cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVarQgq9qg99 = qgq9qg99VarQ999ggg99999qqggqqg9qg.qgq9qg99(context, cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g9g9q9qq9);
                    qgq9qg99VarQ999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qgVarQgq9qg99);
                    if (q999ggg99999qqggqqg9qgVarQgq9qg99.equals(cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.q999ggg99999qqggqqg9qg.f19109q999ggg99999qqggqqg9qg)) {
                        cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgq9qg99 qgq9qg99VarQ999ggg99999qqggqqg9qg2 = cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgq9qg99.q999ggg99999qqggqqg9qg();
                        qgq9qg99(context, (FMCallback) null);
                        if (qgq9qg99VarQ999ggg99999qqggqqg9qg2.q999ggg99999qqggqqg9qg(1, 2)) {
                            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.qqggggg9g9q99q9gq, q999ggg99999qqggqqg9qg("60112e3a3c363a7677323a3e2b", 46));
                            q999ggg99999qqggqqg9qg(qgq9qg99VarQ999ggg99999qqggqqg9qg2.gqgg9q99qg9(), new qgq9qg99(context));
                        }
                        if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q9q999qgg99gq9qq9qqq9g) {
                            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.qgqq999g, q999ggg99999qqggqqg9qg("713a0c010f1d4453161f150c0a1116", 10));
                        } else if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.qgq9qg99()) {
                            strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg(qgq9qg99VarQ999ggg99999qqggqqg9qg2);
                            if (!TextUtils.isEmpty(strQ999ggg99999qqggqqg9qg)) {
                                cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgqq999g qgqq999gVarQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg();
                                if (qgqq999gVarQ999ggg99999qqggqqg9qg != null) {
                                    cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.qgq9qg99(context, strQ999ggg99999qqggqqg9qg, qgqq999gVarQ999ggg99999qqggqqg9qg.qgq9qg99());
                                }
                                strQ999ggg99999qqggqqg9qg2 = q999ggg99999qqggqqg9qg("77734005135f5c5359656c5c460902574751574751", 76);
                                cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99(strQ999ggg99999qqggqqg9qg2);
                                return strQ999ggg99999qqggqqg9qg;
                            }
                            strQqggggg9g9q99q9gq = this.gqg99q9q9q.qqggggg9g9q99q9gq();
                        } else if (!cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q99g9q99 && (qgqq999gVarQgq9qg99 = cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.qgq9qg99(context)) != null && cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.qqggggg9g9q99q9gq(context)) {
                            cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg(qgqq999gVarQgq9qg99.q999ggg99999qqggqqg9qg(), qgqq999gVarQgq9qg99.qgq9qg99(), false);
                            strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg(qgq9qg99VarQ999ggg99999qqggqqg9qg2);
                            if (!TextUtils.isEmpty(strQ999ggg99999qqggqqg9qg)) {
                                cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.qgq9qg99(context, strQ999ggg99999qqggqqg9qg, qgqq999gVarQgq9qg99.qgq9qg99());
                                strQ999ggg99999qqggqqg9qg2 = q999ggg99999qqggqqg9qg("77192a6f79353639330f06362c63683d2d3b3d2d3b", 38);
                                cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99(strQ999ggg99999qqggqqg9qg2);
                                return strQ999ggg99999qqggqqg9qg;
                            }
                            strQqggggg9g9q99q9gq = this.gqg99q9q9q.qqggggg9g9q99q9gq();
                        }
                    } else {
                        qgq9qg99VarQ999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq(context);
                    }
                    cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99(q999ggg99999qqggqqg9qg("77370441571b18171d212818024d46130315130315", 8));
                    strQqggggg9g9q99q9gq = this.gqg99q9q9q.qqggggg9g9q99q9gq();
                } else {
                    cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.g99q9ggqg9gqgq9, qgq9qg99Var.q999ggg99999qqggqqg9qg());
                    strQqggggg9g9q99q9gq = this.gqg99q9q9q.qqggggg9g9q99q9gq();
                }
            } else {
                cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q99g9q99, gqgg9q99qg9Var.q999ggg99999qqggqqg9qg());
                strQqggggg9g9q99q9gq = this.gqg99q9q9q.qqggggg9g9q99q9gq();
            }
            return cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg(strQqggggg9g9q99q9gq);
        } catch (Throwable th) {
            return cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(th).toString();
        }
    }

    public static q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qg() {
        return qqggggg9g9q99q9gq.f19094q999ggg99999qqggqqg9qg;
    }

    private String qqggggg9g9q99q9gq(Context context) {
        cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgqq999g qgqq999gVarQgq9qg99;
        if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.qqggggg9g9q99q9gq(context) && (qgqq999gVarQgq9qg99 = cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.qgq9qg99(context)) != null) {
            cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg(qgqq999gVarQgq9qg99.q999ggg99999qqggqqg9qg(), qgqq999gVarQgq9qg99.qgq9qg99(), false);
            return cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg(qgqq999gVarQgq9qg99.q999ggg99999qqggqqg9qg(), 0);
        }
        return cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg(this.gqg99q9q9q.qqggggg9g9q99q9gq());
    }

    public final String q999ggg99999qqggqqg9qg(Context context) {
        q999ggg99999qqggqqg9qg(false);
        if (!qqggggg9g9q99q9gq || !this.qggqgq99q999g || context == null) {
            return cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg(context);
        }
        if (gqgg9q99qg9) {
            return qgq9qg99(context);
        }
        String strGqgg9q99qg9 = cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.gqgg9q99qg9(context);
        return TextUtils.isEmpty(strGqgg9q99qg9) ? cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg(context) : strGqgg9q99qg9;
    }

    @Nullable
    private static String q999ggg99999qqggqqg9qg(cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgq9qg99 qgq9qg99Var) {
        String strQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg() != null ? cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg().q999ggg99999qqggqqg9qg() : null;
        if (strQ999ggg99999qqggqqg9qg == null) {
            return null;
        }
        return cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg(strQ999ggg99999qqggqqg9qg, qgq9qg99Var.qqggggg9g9q99q9gq() ? 1 : 0);
    }

    private boolean qgq9qg99(Context context, FMCallback fMCallback) {
        if (((int) ((SystemClock.elapsedRealtime() - this.qqg999qq) / 86400000)) > 0 && context != null) {
            cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgq9qg99 qgq9qg99VarQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgq9qg99.q999ggg99999qqggqqg9qg();
            q999ggg99999qqggqqg9qg(this.qgqq999g);
            q999ggg99999qqggqqg9qg(fMCallback != null);
            if (this.gqg99q9q9q != null) {
                qgq9qg99VarQ999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(2);
                cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.qqggggg9g9q99q9gq, q999ggg99999qqggqqg9qg("600c3327212b276b6a2f272336", 51));
                q999ggg99999qqggqqg9qg(qgq9qg99VarQ999ggg99999qqggqqg9qg.gqgg9q99qg9(), new qgq9qg99(context));
                if (fMCallback != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static /* synthetic */ void qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar, byte[] bArr) {
        if (!q999qqg.qgq9qg99(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg())) {
            if (!f19092q999ggg99999qqggqqg9qg) {
                f19092q999ggg99999qqggqqg9qg = true;
                cn.tongdun.android.qgq9qg99.gqg99q9q9q.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg());
                cn.tongdun.android.qgq9qg99.gqg99q9q9q.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qgVar.q99g9q99);
            }
            cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgq9qg99.q999ggg99999qqggqqg9qg().q999ggg99999qqggqqg9qg(1);
            return;
        }
        cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99 qgq9qg99VarQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.q999ggg99999qqggqqg9qg();
        try {
            q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(bArr);
            if (!q999ggg99999qqggqqg9qg("562728252921", 61).equals(q999ggg99999qqggqqg9qgVar.qgq9qg99) || gq9gggq9gq9gg9q99g9q || q999ggg99999qqggqqg9qgVar.gqg99q9q9q == null || qgq9qg99VarQ999ggg99999qqggqqg9qg.qgq9qg99()) {
                return;
            }
            q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qgVar.gqg99q9q9q.qgq9qg99(), 3000L);
        } catch (Throwable unused) {
            q999ggg99999qqggqqg9qgVar.qgq9qg99 = q999ggg99999qqggqqg9qg("56616e636f67", 123);
            if (q999ggg99999qqggqqg9qgVar.gqg99q9q9q == null || qgq9qg99VarQ999ggg99999qqggqqg9qg.qgq9qg99()) {
                return;
            }
            q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qgVar.gqg99q9q9q.qgq9qg99(), 3000L);
        }
    }

    private static String q999ggg99999qqggqqg9qg(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 29);
            byte b10 = (byte) (bArr[0] ^ 48);
            bArr[0] = b10;
            for (int i12 = 1; i12 < length; i12++) {
                b10 = (byte) ((b10 ^ bArr[i12]) ^ b7);
                bArr[i12] = b10;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    private byte[] qgq9qg99() throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        this.gqg99q9q9q.q999ggg99999qqggqqg9qg(this.qgqq999g, this.qq9gg99gqqqgqgq999gqg, countDownLatch);
        try {
            countDownLatch.await(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, TimeUnit.MILLISECONDS);
        } catch (Throwable unused) {
        }
        this.gqg99q9q9q.q999ggg99999qqggqqg9qg();
        byte[] bArrQgq9qg99 = this.gqg99q9q9q.qgq9qg99();
        if (bArrQgq9qg99 != null) {
            return bArrQgq9qg99;
        }
        throw new cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq.qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qg("546e7e7e2a2e60667a60626f766d6a252d6c636e626a2f6a6b6b", 118));
    }

    public static /* synthetic */ void qgq9qg99(q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar, Context context) {
        cn.tongdun.android.qgq9qg99.qgqq999g.gqg99q9q9q gqg99q9q9qVar;
        cn.tongdun.android.qgq9qg99.qgqq999g.gqg99q9q9q gqg99q9q9qVar2;
        cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgq9qg99 qgq9qg99VarQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgq9qg99.q999ggg99999qqggqqg9qg();
        cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.gqgg9q99qg9);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null && !q999ggg99999qqggqqg9qgVar.q9q999qgg99gq9qq9qqq9g) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new qgg9gg99qgqgq());
            q999ggg99999qqggqqg9qgVar.q9q999qgg99gq9qq9qqq9g = true;
        }
        try {
            try {
                HelperJNI.q999ggg99999qqggqqg9qg(21, new Object[]{context});
            } catch (Throwable unused) {
                System.loadLibrary(q999ggg99999qqggqqg9qg("440218101a0802", 4));
                HelperJNI.q999ggg99999qqggqqg9qg(21, new Object[]{context});
            }
        } catch (Throwable unused2) {
        }
        cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99(q999ggg99999qqggqqg9qg("64681c2b6f7733347b767d3c2b7e6e787e6e78", 101));
        SensorManager sensorManager = null;
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(q999ggg99999qqggqqg9qg("512b2e323922296e622d3732373237336f7f2235686b2633392225645f2235392823313135", 57));
            Intent intentRegisterReceiver = context.registerReceiver(null, intentFilter, q999ggg99999qqggqqg9qg("532a246578333139223c263c2027666a363b2823212434217c7c36", 59), null);
            if (intentRegisterReceiver != null) {
                FMAgent.usbConnected = intentRegisterReceiver.getBooleanExtra(q999ggg99999qqggqqg9qg("53646968636e7f7969", 117), false);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gq9gggq9gq9gg9q99g9q) {
                SensorManager sensorManager2 = (SensorManager) context.getSystemService(q999ggg99999qqggqqg9qg("436f72646564", 100));
                try {
                    cn.tongdun.android.qgq9qg99.qgqq999g.gqg99q9q9q gqg99q9q9qVar3 = (cn.tongdun.android.qgq9qg99.qgqq999g.gqg99q9q9q) cn.tongdun.android.qgq9qg99.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("53632e34756f676d7f752e21616478736863243378657372733227306e2626306e78266e2678782630782626406273", 115));
                    if (gqg99q9q9qVar3 != null) {
                        gqg99q9q9qVar3.q999ggg99999qqggqqg9qg(sensorManager2);
                    }
                    sensorManager = sensorManager2;
                } catch (Throwable th) {
                    th = th;
                    sensorManager = sensorManager2;
                    try {
                        if (th instanceof cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq.qqggggg9g9q99q9gq) {
                            gqgg9q99qg9 = false;
                        }
                        qgq9qg99VarQ999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(0);
                        CountDownLatch countDownLatch = q999ggg99999qqggqqg9qgVar.qq9gg99gqqqgqgq999gqg;
                        if (countDownLatch != null) {
                            countDownLatch.countDown();
                        }
                        if (!cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gq9gggq9gq9gg9q99g9q || sensorManager == null) {
                            return;
                        } else {
                            if (gqg99q9q9qVar2 == null) {
                                return;
                            }
                        }
                    } finally {
                        CountDownLatch countDownLatch2 = q999ggg99999qqggqqg9qgVar.qq9gg99gqqqgqgq999gqg;
                        if (countDownLatch2 != null) {
                            countDownLatch2.countDown();
                        }
                        if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gq9gggq9gq9gg9q99g9q && sensorManager != null && (gqg99q9q9qVar2 = (cn.tongdun.android.qgq9qg99.qgqq999g.gqg99q9q9q) cn.tongdun.android.qgq9qg99.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("531d504a0b111913010b505f1f1a060d161d5a4d061b0d0c0d4c594e1058584e10065810580606584e0658583e1c0d", 13))) != null) {
                            gqg99q9q9qVar2.qgq9qg99(sensorManager);
                        }
                    }
                }
            }
            q999ggg99999qqggqqg9qgVar.qgq9qg99 = q999ggg99999qqggqqg9qg("53616e6d646b7a706a64", HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR);
            byte[] bArrQgq9qg99 = q999ggg99999qqggqqg9qgVar.qgq9qg99();
            gqgg9q99qg9 = true;
            qgq9qg99VarQ999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(bArrQgq9qg99);
            qgq9qg99VarQ999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(1);
            CountDownLatch countDownLatch3 = q999ggg99999qqggqqg9qgVar.qq9gg99gqqqgqgq999gqg;
            if (countDownLatch3 != null) {
                countDownLatch3.countDown();
            }
            if (!cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gq9gggq9gq9gg9q99g9q || sensorManager == null || (gqg99q9q9qVar = (cn.tongdun.android.qgq9qg99.qgqq999g.gqg99q9q9q) cn.tongdun.android.qgq9qg99.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("53561b01405a52584a401b1454514d465d5611064d504647460712055b1313055b4d135b134d4d13054d1313755746", 70))) == null) {
                return;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        gqg99q9q9qVar.qgq9qg99(sensorManager);
    }

    public final void q999ggg99999qqggqqg9qg(Context context, FMCallback fMCallback) {
        cn.tongdun.android.q999ggg99999qqggqqg9qg.gqgg9q99qg9.qgq9qg99(new qg9gqgqqggg9q9qg(this, fMCallback, context));
    }

    public static synchronized void q999ggg99999qqggqqg9qg(FMCallback fMCallback) {
        if (fMCallback != null) {
            ArrayDeque arrayDeque = q99q99qq99q9g;
            if (!arrayDeque.contains(fMCallback)) {
                arrayDeque.offer(fMCallback);
            }
        }
    }

    public final void q999ggg99999qqggqqg9qg(String str) {
        synchronized (q999ggg99999qqggqqg9qg.class) {
            try {
                Iterator it = q99q99qq99q9g.iterator();
                while (it.hasNext()) {
                    FMCallback fMCallback = (FMCallback) it.next();
                    if (fMCallback != null) {
                        cn.tongdun.android.q999ggg99999qqggqqg9qg.gqgg9q99qg9.qgq9qg99(new gqgg9q99qg9(this, fMCallback, str));
                    }
                    it.remove();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg() != null && !q999qqg.qgq9qg99(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg())) {
            cn.tongdun.android.shell.common.qgqq999g.q999ggg99999qqggqqg9qg(302, q999ggg99999qqggqqg9qg("7e58363772687a616460", 100));
        }
        cn.tongdun.android.shell.common.qgqq999g.q999ggg99999qqggqqg9qg((String) null, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q999ggg99999qqggqqg9qg(boolean z3) {
        if (!this.qggqgq99q999g) {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                this.gqgqgq9qqqg999qggqqqg = countDownLatch;
                try {
                    countDownLatch.await(200L, TimeUnit.MILLISECONDS);
                } catch (Exception unused) {
                }
            }
            if (!this.qggqgq99q999g) {
                cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.f19274q999ggg99999qqggqqg9qg, q999ggg99999qqggqqg9qg("746949000a455f100d435c5d404a010d434359", 89));
                cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("7d556b6a39246a75746963282d4b66614b6f6677372a6a6a70792d2b62766c6a386d6d", HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR));
            }
        }
        CountDownLatch countDownLatch2 = this.qq9gg99gqqqgqgq999gqg;
        if (countDownLatch2 != null) {
            try {
                int i7 = z3 ? cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq * 3 : cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq;
                if (countDownLatch2.await(i7, TimeUnit.MILLISECONDS)) {
                    return;
                }
                cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(z3 ? cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.g9qqg99qqg : cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.gq9qqgq9q9, q999ggg99999qqggqqg9qg("7f211a4f54125d4c0d1306061c125c4f061f134401", 6) + i7 + q999ggg99999qqggqqg9qg("5d6c", HomeDialogState.PRIORITY_HIGHEST_111));
            } catch (Throwable unused2) {
            }
        }
    }

    private void q999ggg99999qqggqqg9qg(byte[] bArr, long j6) {
        HandlerThread handlerThread = new HandlerThread(q999ggg99999qqggqqg9qg("44100a02081a10", 22));
        handlerThread.start();
        new Handler(handlerThread.getLooper()).postDelayed(new q99q99qq99q9g(this, bArr), 3000L);
    }

    private void q999ggg99999qqggqqg9qg(byte[] bArr, qgq9qg99 qgq9qg99Var) {
        cn.tongdun.android.q999ggg99999qqggqqg9qg.gqgg9q99qg9.q999ggg99999qqggqqg9qg(new qqg999qq(this, bArr, qgq9qg99Var));
    }

    public final void q999ggg99999qqggqqg9qg(@NonNull TDOption tDOption) {
        try {
            cn.tongdun.android.qgq9qg99.qggqgq99q999g.q9q999qgg99gq9qq9qqq9g.q999ggg99999qqggqqg9qg(tDOption);
        } catch (Throwable unused) {
        }
        cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99 qgq9qg99VarQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.q999ggg99999qqggqqg9qg();
        cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.q999ggg99999qqggqqg9qg(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(), tDOption.getAppKey());
        cn.tongdun.android.qgq9qg99.qggqgq99q999g.q9q999qgg99gq9qq9qqq9g.q999ggg99999qqggqqg9qg(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(), cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19075q999ggg99999qqggqqg9qg, cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.gqgg9q99qg9.f19271q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg());
        cn.tongdun.android.qgq9qg99.qggqgq99q999g.q9q999qgg99gq9qq9qqq9g.q999ggg99999qqggqqg9qg(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(), cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgqq999g, cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qgq9qg99.f19273q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg());
        if (this.q999qqg) {
            cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99(q999ggg99999qqggqqg9qg("790e2e343421242c3a3a2e2062257935202d3b3f6c7d2f2270682f2f212e6765243c383e", 52));
            return;
        }
        this.qq9gg99gqqqgqgq999gqg = new CountDownLatch(2);
        this.qggqgq99q999g = true;
        this.gqg99q9q9q = gq9qqgq9q9.q999ggg99999qqggqqg9qg(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg());
        if (qqggggg9g9q99q9gq) {
            this.g99q9ggqg9gqgq9.post(new qgqq999g(this, qgq9qg99VarQ999ggg99999qqggqqg9qg, tDOption));
            return;
        }
        for (int i7 = 0; i7 < 2; i7++) {
            CountDownLatch countDownLatch = this.qq9gg99gqqqgqgq999gqg;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
        CountDownLatch countDownLatch2 = this.gqgqgq9qqqg999qggqqqg;
        if (countDownLatch2 != null) {
            countDownLatch2.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q999ggg99999qqggqqg9qg(byte[] bArr) throws Exception {
        String strQ999ggg99999qqggqqg9qg;
        String strOptString;
        String strOptString2;
        cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar;
        cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgq9qg99 qgq9qg99VarQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgq9qg99.q999ggg99999qqggqqg9qg();
        synchronized (this.qq9gg9q) {
            int iOptInt = 0;
            try {
                if (bArr == null) {
                    qgq9qg99VarQ999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(0);
                } else if (!q999ggg99999qqggqqg9qg("404e51454349494b45", 81).equals(this.qgq9qg99)) {
                    if (this.ggq999qqgqgq9g9qqq == null || !Arrays.equals(this.ggq999qqgqgq9g9qqq, bArr)) {
                        if (ggq999qqgqgq9g9qqq.q999ggg99999qqggqqg9qg(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(), cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgqq999g)) {
                            gq9gggq9gq9gg9q99g9q = true;
                            this.qgq9qg99 = q999ggg99999qqggqqg9qg("563d323f333b", 39);
                            qgq9qg99VarQ999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(1);
                            return;
                        }
                        gq9gggq9gq9gg9q99g9q = false;
                        this.qgq9qg99 = q999ggg99999qqggqqg9qg("405c4357515b5b5957", 67);
                        HashMap map = new HashMap();
                        map.put(q999ggg99999qqggqqg9qg("402a283d21302c", 38), cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgqq999g);
                        map.put(q999ggg99999qqggqqg9qg("466f6b7d667a7d", 97), q999ggg99999qqggqqg9qg("04565656515157", 81));
                        map.put(q999ggg99999qqggqqg9qg("516879425765", 100), cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g9g9q9qq9);
                        map.put(q999ggg99999qqggqqg9qg("517d6c52436064", 113), cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qqg999qq);
                        String str = cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19075q999ggg99999qqggqqg9qg;
                        System.currentTimeMillis();
                        JSONObject jSONObjectOptJSONObject = null;
                        if (q999ggg99999qqggqqg9qg("43150715", 26).equals(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19076q999ggg99999qqggqqg9qg)) {
                            HashMap map2 = new HashMap();
                            Object objQ999ggg99999qqggqqg9qg = HelperJNI.q999ggg99999qqggqqg9qg(73, new Object[]{bArr});
                            if (objQ999ggg99999qqggqqg9qg != null && (objQ999ggg99999qqggqqg9qg instanceof String)) {
                                map2.put(q999ggg99999qqggqqg9qg("446877", 101), (String) objQ999ggg99999qqggqqg9qg);
                            }
                            strQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(str, map2, map, bArr, 2);
                            if (TextUtils.isEmpty(strQ999ggg99999qqggqqg9qg)) {
                                throw new Exception(q999ggg99999qqggqqg9qg("4218190c100e12194a46155c4114160f", 18));
                            }
                            JSONObject jSONObject = new JSONObject(strQ999ggg99999qqggqqg9qg);
                            strOptString = jSONObject.optString(q999ggg99999qqggqqg9qg("5371767c", 96));
                            strOptString2 = jSONObject.optString(q999ggg99999qqggqqg9qg("54031412", 31));
                            String strOptString3 = jSONObject.optString(q999ggg99999qqggqqg9qg("425958485756", 83), "");
                            if (!TextUtils.isEmpty(strOptString3)) {
                                Object objQ999ggg99999qqggqqg9qg2 = HelperJNI.q999ggg99999qqggqqg9qg(75, new Object[]{strOptString3});
                                if (objQ999ggg99999qqggqqg9qg2 != null) {
                                    jSONObjectOptJSONObject = new JSONObject(new String((byte[]) objQ999ggg99999qqggqqg9qg2, StandardCharsets.UTF_8));
                                } else {
                                    this.qgq9qg99 = q999ggg99999qqggqqg9qg("562e212c2028", 52);
                                    cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.g9g9q9qq9, q999ggg99999qqggqqg9qg("427273667a647873202160707024216463746e6c617863642b23626d606c64", KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP));
                                }
                            }
                        } else {
                            strQ999ggg99999qqggqqg9qg = !cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qq9gg99gqqqgqgq999gqg ? cn.tongdun.android.qgq9qg99.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(str, null, map, bArr, 1) : cn.tongdun.android.qgq9qg99.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(str, null, map, bArr, 0);
                            if (TextUtils.isEmpty(strQ999ggg99999qqggqqg9qg)) {
                                throw new Exception(q999ggg99999qqggqqg9qg("424c4d58445a464d1e1241081540425b", 70));
                            }
                            JSONObject jSONObject2 = new JSONObject(strQ999ggg99999qqggqqg9qg);
                            strOptString = jSONObject2.optString(q999ggg99999qqggqqg9qg("53454248", 84));
                            strOptString2 = jSONObject2.optString(q999ggg99999qqggqqg9qg("54180f09", 4));
                            jSONObjectOptJSONObject = jSONObject2.optJSONObject(q999ggg99999qqggqqg9qg("422f2e3e2120", 37));
                        }
                        cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99 qgq9qg99VarQ999ggg99999qqggqqg9qg2 = cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.q999ggg99999qqggqqg9qg();
                        qq9gg9q qq9gg9qVarQ999ggg99999qqggqqg9qg = qq9gg9q.q999ggg99999qqggqqg9qg();
                        if (q999ggg99999qqggqqg9qg("001515", 8).equals(strOptString)) {
                            this.ggq999qqgqgq9g9qqq = bArr;
                            this.qgq9qg99 = q999ggg99999qqggqqg9qg("4311011711011702040e", 10);
                            if (jSONObjectOptJSONObject != null) {
                                qgq9qg99VarQ999ggg99999qqggqqg9qg.qgqq999g();
                                String strOptString4 = jSONObjectOptJSONObject.optString(q999ggg99999qqggqqg9qg("443c23292c000a", 58));
                                String strOptString5 = jSONObjectOptJSONObject.optString(q999ggg99999qqggqqg9qg("52373c20", 48));
                                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_CHARGE_BACK, 53));
                                int iOptInt2 = 24;
                                if (jSONObjectOptJSONObject2 != null) {
                                    iOptInt = jSONObjectOptJSONObject2.optInt(q999ggg99999qqggqqg9qg("560702171b1d", 29), 0);
                                    iOptInt2 = jSONObjectOptJSONObject2.optInt(q999ggg99999qqggqqg9qg("4647", 69), 24);
                                    int iOptInt3 = jSONObjectOptJSONObject2.optInt(q999ggg99999qqggqqg9qg("405a", 94), -1);
                                    int iOptInt4 = jSONObjectOptJSONObject2.optInt(q999ggg99999qqggqqg9qg("405f", 66), 443);
                                    if (iOptInt3 != -1) {
                                        String strQ999ggg99999qqggqqg9qg2 = cn.tongdun.android.qgq9qg99.qggqgq99q999g.q9q999qgg99gq9qq9qqq9g.q999ggg99999qqggqqg9qg(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19075q999ggg99999qqggqqg9qg);
                                        if (!TextUtils.isEmpty(strQ999ggg99999qqggqqg9qg2)) {
                                            cn.tongdun.android.q999ggg99999qqggqqg9qg.gqgg9q99qg9.q999ggg99999qqggqqg9qg(new q9q999qgg99gq9qq9qqq9g(this, strQ999ggg99999qqggqqg9qg2, iOptInt4, strOptString4));
                                        }
                                    }
                                }
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg(strOptString4, jCurrentTimeMillis, true);
                                cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(), q999ggg99999qqggqqg9qg("44386167323925", 53), strOptString5);
                                qq9gg9qVarQ999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(), jSONObjectOptJSONObject);
                                ggq999qqgqgq9g9qqq.q999ggg99999qqggqqg9qg(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(), cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgqq999g, jCurrentTimeMillis, iOptInt);
                                ggq999qqgqgq9g9qqq.q999ggg99999qqggqqg9qg(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(), cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgqq999g, iOptInt2);
                                if (!cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q99g9q99) {
                                    cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(), strOptString4, jCurrentTimeMillis);
                                }
                            } else {
                                this.qgq9qg99 = q999ggg99999qqggqqg9qg("56343b363a32", 46);
                                qgq9qg99VarQ999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(1);
                                cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.qgq9qg99, q999ggg99999qqggqqg9qg("537d707f7e642b3b7e796e74767b62797e312d68697966672b30622d2d68697966672b36652c3a77627b72", 98));
                            }
                            qggq9gqq9q99g99q.q999ggg99999qqggqqg9qg().qgq9qg99(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg());
                            cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.qgq9qg99(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg());
                        } else {
                            if (q999ggg99999qqggqqg9qg("032226", 60).equals(strOptString)) {
                                this.qgq9qg99 = q999ggg99999qqggqqg9qg("563639343830", 44);
                                qgq9qg99VarQ999ggg99999qqggqqg9qg2.q999ggg99999qqggqqg9qg(cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.q999ggg99999qqggqqg9qg.qg9gqgqqggg9q9qg);
                                qgq9qg99VarQ999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(1);
                                qqggggg9g9q99q9gqVar = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.g99gq9qg9gggq9qgg;
                            } else if (q999ggg99999qqggqqg9qg("034d46", 83).equals(strOptString)) {
                                this.qgq9qg99 = q999ggg99999qqggqqg9qg("56121d101c14", 8);
                                qgq9qg99VarQ999ggg99999qqggqqg9qg2.q999ggg99999qqggqqg9qg(cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.q999ggg99999qqggqqg9qg.qgqq999g);
                                qgq9qg99VarQ999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(1);
                                cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.ggq999qqgqgq9g9qqq, strOptString2);
                                cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.q999ggg99999qqggqqg9qg(cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg());
                            } else if (q999ggg99999qqggqqg9qg("030f05", 17).equals(strOptString)) {
                                this.qgq9qg99 = q999ggg99999qqggqqg9qg("56050a070b03", 31);
                                qgq9qg99VarQ999ggg99999qqggqqg9qg2.q999ggg99999qqggqqg9qg(cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.q999ggg99999qqggqqg9qg.qgq9qg99);
                                qgq9qg99VarQ999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(1);
                                qqggggg9g9q99q9gqVar = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q9q9gqgqg9qgqg9qggq9;
                            } else if (q999ggg99999qqggqqg9qg("037477", 107).equals(strOptString)) {
                                this.qgq9qg99 = q999ggg99999qqggqqg9qg("56626d606c64", KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP);
                                qgq9qg99VarQ999ggg99999qqggqqg9qg2.q999ggg99999qqggqqg9qg(cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.q999ggg99999qqggqqg9qg.gqg99q9q9q);
                                qgq9qg99VarQ999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(1);
                                qqggggg9g9q99q9gqVar = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.g9g9ggqqggqq99gqq9q99;
                            } else {
                                this.qgq9qg99 = q999ggg99999qqggqqg9qg("566c636e626a", 118);
                                qgq9qg99VarQ999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(1);
                                cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.qgq9qg99, strQ999ggg99999qqggqqg9qg);
                            }
                            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gqVar, strOptString2);
                        }
                        cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.qqggggg9g9q99q9gq);
                        return;
                    }
                    qgq9qg99VarQ999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar, String str) {
        String str2;
        cn.tongdun.android.qgq9qg99.qgqq999g.qgq9qg99 qgq9qg99Var = (cn.tongdun.android.qgq9qg99.qgqq999g.qgq9qg99) cn.tongdun.android.qgq9qg99.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("53317c66273d353f2d277c7333362a213a3176702b2e37296b500b2e3729", 33));
        if (qgq9qg99Var != null) {
            if (TextUtils.isEmpty(str)) {
                qgq9qg99Var.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("58001c181f55091c50115f570a42530d05010c565c170d", 1));
                return;
            }
            for (Map.Entry entry : q999ggg99999qqggqqg9qgVar.qg9gqgqqggg9q9qg.entrySet()) {
                if (str.startsWith((String) entry.getKey())) {
                    str2 = (String) entry.getValue();
                    qgq9qg99Var.q999ggg99999qqggqqg9qg(str2);
                }
            }
            str2 = "";
            qgq9qg99Var.q999ggg99999qqggqqg9qg(str2);
        }
    }

    public static /* synthetic */ void q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar, Context context) {
        cn.tongdun.android.qgq9qg99.qgqq999g.qgq9qg99 qgq9qg99Var = (cn.tongdun.android.qgq9qg99.qgqq999g.qgq9qg99) cn.tongdun.android.qgq9qg99.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("5378352f6e747c76646e353a7a7f636873783f3962677e60221942677e60", 104));
        if (qgq9qg99Var != null) {
            PackageInfo packageInfo = (PackageInfo) cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.qgq9qg99(cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.gqgg9q99qg9[0], new gqg99q9q9q(q999ggg99999qqggqqg9qgVar, context));
            qgq9qg99Var.q999ggg99999qqggqqg9qg(context, 1, q999ggg99999qqggqqg9qg("046b6b6b6c6c6a", 108), packageInfo != null ? packageInfo.versionName : null);
        }
    }

    public static /* synthetic */ void q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar, Context context, FMCallback fMCallback) {
        String string;
        String strQ999ggg99999qqggqqg9qg;
        cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar;
        String strQ999ggg99999qqggqqg9qg2;
        String str = cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19075q999ggg99999qqggqqg9qg;
        cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.gqgg9q99qg9 gqgg9q99qg9Var = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.gqgg9q99qg9.f19271q999ggg99999qqggqqg9qg;
        if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.q9q999qgg99gq9qq9qqq9g.q999ggg99999qqggqqg9qg(context, str, gqgg9q99qg9Var.q999ggg99999qqggqqg9qg())) {
            String str2 = cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgqq999g;
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qgq9qg99 qgq9qg99Var = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qgq9qg99.f19273q999ggg99999qqggqqg9qg;
            if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.q9q999qgg99gq9qq9qqq9g.q999ggg99999qqggqqg9qg(context, str2, qgq9qg99Var.q999ggg99999qqggqqg9qg())) {
                try {
                    cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99 qgq9qg99VarQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.q999ggg99999qqggqqg9qg();
                    cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVarQgq9qg99 = qgq9qg99VarQ999ggg99999qqggqqg9qg.qgq9qg99(context, cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g9g9q9qq9);
                    qgq9qg99VarQ999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qgVarQgq9qg99);
                    if (q999ggg99999qqggqqg9qgVarQgq9qg99.equals(cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99.q999ggg99999qqggqqg9qg.f19109q999ggg99999qqggqqg9qg)) {
                        cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgq9qg99 qgq9qg99VarQ999ggg99999qqggqqg9qg2 = cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgq9qg99.q999ggg99999qqggqqg9qg();
                        if (q999ggg99999qqggqqg9qgVar.qgq9qg99(context, fMCallback)) {
                            return;
                        }
                        if (!cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q9q999qgg99gq9qq9qqq9g) {
                            if (qgq9qg99VarQ999ggg99999qqggqqg9qg2.q999ggg99999qqggqqg9qg(1, 2)) {
                                cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.qqggggg9g9q99q9gq, q999ggg99999qqggqqg9qg("60754a5e58525e1213565e5a4f", 74));
                                q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qgq9qg99VarQ999ggg99999qqggqqg9qg2.gqgg9q99qg9(), q999ggg99999qqggqqg9qgVar.new qgq9qg99(context));
                            } else if (qgq9qg99VarQ999ggg99999qqggqqg9qg2.qgq9qg99()) {
                                strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qgVar.gqgg9q99qg9(context);
                            }
                            cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99(q999ggg99999qqggqqg9qg("777b480d1b57545b516d64544e010a5f4f595f4f59", 68));
                            return;
                        }
                        cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.qgqq999g, q999ggg99999qqggqqg9qg("713e08050b194057121b11080e1512", 14));
                        strQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qgVar.gqg99q9q9q.qqggggg9g9q99q9gq());
                    } else {
                        qgq9qg99VarQ999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq(context);
                        strQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qgVar.gqg99q9q9q.qqggggg9g9q99q9gq());
                    }
                    q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(strQ999ggg99999qqggqqg9qg);
                    cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99(q999ggg99999qqggqqg9qg("777b480d1b57545b516d64544e010a5f4f595f4f59", 68));
                    return;
                } catch (Throwable th) {
                    string = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(th).toString();
                }
            } else {
                qqggggg9g9q99q9gqVar = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.g99q9ggqg9gqgq9;
                strQ999ggg99999qqggqqg9qg2 = qgq9qg99Var.q999ggg99999qqggqqg9qg();
            }
        } else {
            qqggggg9g9q99q9gqVar = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q99g9q99;
            strQ999ggg99999qqggqqg9qg2 = gqgg9q99qg9Var.q999ggg99999qqggqqg9qg();
        }
        cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gqVar, strQ999ggg99999qqggqqg9qg2);
        string = cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qgVar.gqg99q9q9q.qqggggg9g9q99q9gq());
        q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(string);
    }
}
