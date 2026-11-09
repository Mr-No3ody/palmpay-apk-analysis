package V8;

import C0.G;
import Pa.r0;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStep1Fragment;
import com.transsnet.palmpay.airtime.bean.req.AirtimeOrderAddReq;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.rsp.BillerRenewalBodyBean;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.EnumC1932c;
import okhttp3.internal.http2.Http2Reader$Handler;
import okhttp3.internal.http2.K;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements Function0, Http2Reader$Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10155c;

    public /* synthetic */ p(Object obj, CommonBeanResult commonBeanResult, int i7) {
        this.f10153a = i7;
        this.f10155c = obj;
        this.f10154b = commonBeanResult;
    }

    @Override // okhttp3.internal.http2.Http2Reader$Handler
    public void alternateService(int i7, String origin, Pg.m protocol, String host, int i10, long j6) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(host, "host");
    }

    @Override // okhttp3.internal.http2.Http2Reader$Handler
    public void data(boolean z3, int i7, BufferedSource source, int i10) throws IOException {
        boolean z8;
        long j6;
        boolean z10;
        Intrinsics.checkNotNullParameter(source, "source");
        ((okhttp3.internal.http2.u) this.f10154b).getClass();
        long j10 = 0;
        if (i7 != 0 && (i7 & 1) == 0) {
            okhttp3.internal.http2.u uVar = (okhttp3.internal.http2.u) this.f10154b;
            uVar.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            Pg.k kVar = new Pg.k();
            long j11 = i10;
            source.require(j11);
            source.read(kVar, j11);
            uVar.f40888j.c(new okhttp3.internal.http2.q(uVar.f40882c + '[' + i7 + "] onData", uVar, i7, kVar, i10, z3), 0L);
            return;
        }
        okhttp3.internal.http2.E eC = ((okhttp3.internal.http2.u) this.f10154b).c(i7);
        if (eC == null) {
            ((okhttp3.internal.http2.u) this.f10154b).h(i7, EnumC1932c.PROTOCOL_ERROR);
            long j12 = i10;
            ((okhttp3.internal.http2.u) this.f10154b).f(j12);
            source.skip(j12);
            return;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        byte[] bArr = Dg.c.f1879a;
        okhttp3.internal.http2.C c6 = eC.f40784i;
        long j13 = i10;
        c6.getClass();
        Intrinsics.checkNotNullParameter(source, "source");
        long j14 = j13;
        while (true) {
            if (j14 <= j10) {
                byte[] bArr2 = Dg.c.f1879a;
                c6.f40774g.f40777b.f(j13);
                break;
            }
            synchronized (c6.f40774g) {
                z8 = c6.f40769b;
                j6 = j10;
                z10 = c6.f40771d.f7358b + j14 > c6.f40768a;
                Unit unit = Unit.f38893a;
            }
            if (z10) {
                source.skip(j14);
                c6.f40774g.e(EnumC1932c.FLOW_CONTROL_ERROR);
                break;
            }
            if (z8) {
                source.skip(j14);
                break;
            }
            long j15 = source.read(c6.f40770c, j14);
            if (j15 == -1) {
                throw new EOFException();
            }
            j14 -= j15;
            okhttp3.internal.http2.E e10 = c6.f40774g;
            synchronized (e10) {
                try {
                    if (c6.f40773f) {
                        c6.f40770c.a();
                    } else {
                        Pg.k kVar2 = c6.f40771d;
                        boolean z11 = kVar2.f7358b == j6;
                        kVar2.writeAll(c6.f40770c);
                        if (z11) {
                            e10.notifyAll();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            j10 = j6;
        }
        if (z3) {
            eC.i(Dg.c.f1880b, true);
        }
    }

    @Override // okhttp3.internal.http2.Http2Reader$Handler
    public void goAway(int i7, EnumC1932c errorCode, Pg.m debugData) {
        int i10;
        Object[] array;
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(debugData, "debugData");
        debugData.d();
        okhttp3.internal.http2.u uVar = (okhttp3.internal.http2.u) this.f10154b;
        synchronized (uVar) {
            array = uVar.f40881b.values().toArray(new okhttp3.internal.http2.E[0]);
            uVar.f40885f = true;
            Unit unit = Unit.f38893a;
        }
        for (okhttp3.internal.http2.E e10 : (okhttp3.internal.http2.E[]) array) {
            if (e10.f40776a > i7 && e10.g()) {
                e10.j(EnumC1932c.REFUSED_STREAM);
                ((okhttp3.internal.http2.u) this.f10154b).d(e10.f40776a);
            }
        }
    }

    @Override // okhttp3.internal.http2.Http2Reader$Handler
    public void headers(boolean z3, int i7, int i10, List requestHeaders) {
        int i11 = 1;
        Intrinsics.checkNotNullParameter(requestHeaders, "headerBlock");
        ((okhttp3.internal.http2.u) this.f10154b).getClass();
        if (i7 != 0 && (i7 & 1) == 0) {
            okhttp3.internal.http2.u uVar = (okhttp3.internal.http2.u) this.f10154b;
            uVar.getClass();
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            uVar.f40888j.c(new okhttp3.internal.http2.r(uVar.f40882c + '[' + i7 + "] onHeaders", uVar, i7, requestHeaders, z3), 0L);
            return;
        }
        okhttp3.internal.http2.u uVar2 = (okhttp3.internal.http2.u) this.f10154b;
        synchronized (uVar2) {
            okhttp3.internal.http2.E eC = uVar2.c(i7);
            if (eC != null) {
                Unit unit = Unit.f38893a;
                eC.i(Dg.c.w(requestHeaders), z3);
                return;
            }
            if (uVar2.f40885f) {
                return;
            }
            if (i7 <= uVar2.f40883d) {
                return;
            }
            if (i7 % 2 == uVar2.f40884e % 2) {
                return;
            }
            okhttp3.internal.http2.E e10 = new okhttp3.internal.http2.E(i7, uVar2, false, z3, Dg.c.w(requestHeaders));
            uVar2.f40883d = i7;
            uVar2.f40881b.put(Integer.valueOf(i7), e10);
            uVar2.f40886g.e().c(new okhttp3.internal.http2.n(uVar2.f40882c + '[' + i7 + "] onStream", uVar2, e10, i11), 0L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Throwable th;
        EnumC1932c enumC1932c;
        Object obj = this.f10155c;
        Object obj2 = this.f10154b;
        switch (this.f10153a) {
            case 0:
                IdentityVerificationStep1Fragment.u((IdentityVerificationStep1Fragment) obj, (CommonBeanResult) obj2);
                return Unit.f38893a;
            case 1:
                if (!r0.U0()) {
                    AirtimeOrderAddReq airtimeOrderAddReq = new AirtimeOrderAddReq();
                    CommonBeanResult commonBeanResult = (CommonBeanResult) obj2;
                    Long itemAmount = ((BillerRenewalBodyBean) commonBeanResult.data).getItemAmount();
                    airtimeOrderAddReq.amount = itemAmount != null ? itemAmount.longValue() : 0L;
                    airtimeOrderAddReq.itemId = ((BillerRenewalBodyBean) commonBeanResult.data).getItemId();
                    airtimeOrderAddReq.transType = "04";
                    airtimeOrderAddReq.billerName = ((BillerRenewalBodyBean) commonBeanResult.data).getBillerName();
                    airtimeOrderAddReq.network = ((BillerRenewalBodyBean) commonBeanResult.data).getBillerId();
                    airtimeOrderAddReq.icon = ((BillerRenewalBodyBean) commonBeanResult.data).getBillerIcon();
                    airtimeOrderAddReq.sourceCategoryId = TransType.TRANS_TYPE_BULK_DISBURSEMENT;
                    airtimeOrderAddReq.phone = r0.v0(((BillerRenewalBodyBean) commonBeanResult.data).getRecipientNumber());
                    int i7 = TopupAirtimeActivity.f26495x0;
                    ((TopupAirtimeActivity) obj).r(airtimeOrderAddReq, false);
                }
                return Unit.f38893a;
            default:
                okhttp3.internal.http2.u uVar = (okhttp3.internal.http2.u) obj2;
                okhttp3.internal.http2.z zVar = (okhttp3.internal.http2.z) obj;
                EnumC1932c enumC1932c2 = EnumC1932c.INTERNAL_ERROR;
                IOException e10 = null;
                try {
                    try {
                        Intrinsics.checkNotNullParameter(this, "handler");
                        if (!zVar.a(true, this)) {
                            throw new IOException("Required SETTINGS preface not received");
                        }
                        do {
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } while (zVar.a(false, this));
                        enumC1932c = EnumC1932c.NO_ERROR;
                        try {
                            try {
                                uVar.a(enumC1932c, EnumC1932c.CANCEL, null);
                            } catch (IOException e11) {
                                e10 = e11;
                                EnumC1932c enumC1932c3 = EnumC1932c.PROTOCOL_ERROR;
                                uVar.a(enumC1932c3, enumC1932c3, e10);
                            }
                            Dg.c.c(zVar);
                            return Unit.f38893a;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (IOException e12) {
                    e10 = e12;
                }
                enumC1932c = enumC1932c2;
                uVar.a(enumC1932c, enumC1932c2, e10);
                Dg.c.c(zVar);
                throw th;
        }
    }

    @Override // okhttp3.internal.http2.Http2Reader$Handler
    public void ping(boolean z3, int i7, int i10) {
        if (!z3) {
            ((okhttp3.internal.http2.u) this.f10154b).f40887i.c(new okhttp3.internal.http2.o(G.r(new StringBuilder(), ((okhttp3.internal.http2.u) this.f10154b).f40882c, " ping"), (okhttp3.internal.http2.u) this.f10154b, i7, i10), 0L);
            return;
        }
        okhttp3.internal.http2.u uVar = (okhttp3.internal.http2.u) this.f10154b;
        synchronized (uVar) {
            try {
                if (i7 == 1) {
                    uVar.t++;
                } else if (i7 != 2) {
                    if (i7 == 3) {
                        uVar.notifyAll();
                    }
                    Unit unit = Unit.f38893a;
                } else {
                    uVar.f40893w++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // okhttp3.internal.http2.Http2Reader$Handler
    public void pushPromise(int i7, int i10, List requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        okhttp3.internal.http2.u uVar = (okhttp3.internal.http2.u) this.f10154b;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (uVar) {
            if (uVar.f40889k0.contains(Integer.valueOf(i10))) {
                uVar.h(i10, EnumC1932c.PROTOCOL_ERROR);
                return;
            }
            uVar.f40889k0.add(Integer.valueOf(i10));
            uVar.f40888j.c(new okhttp3.internal.http2.s(uVar.f40882c + '[' + i10 + "] onRequest", uVar, i10, requestHeaders, 2), 0L);
        }
    }

    @Override // okhttp3.internal.http2.Http2Reader$Handler
    public void rstStream(int i7, EnumC1932c errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        okhttp3.internal.http2.u uVar = (okhttp3.internal.http2.u) this.f10154b;
        uVar.getClass();
        if (i7 == 0 || (i7 & 1) != 0) {
            okhttp3.internal.http2.E eD = uVar.d(i7);
            if (eD != null) {
                eD.j(errorCode);
                return;
            }
            return;
        }
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        uVar.f40888j.c(new okhttp3.internal.http2.s(uVar.f40882c + '[' + i7 + "] onReset", uVar, i7, errorCode, 0), 0L);
    }

    @Override // okhttp3.internal.http2.Http2Reader$Handler
    public void settings(boolean z3, K settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        okhttp3.internal.http2.u uVar = (okhttp3.internal.http2.u) this.f10154b;
        uVar.f40887i.c(new okhttp3.internal.http2.p(G.r(new StringBuilder(), uVar.f40882c, " applyAndAckSettings"), this, z3, settings), 0L);
    }

    @Override // okhttp3.internal.http2.Http2Reader$Handler
    public void windowUpdate(int i7, long j6) {
        if (i7 == 0) {
            okhttp3.internal.http2.u uVar = (okhttp3.internal.http2.u) this.f10154b;
            synchronized (uVar) {
                uVar.f40876Q += j6;
                uVar.notifyAll();
                Unit unit = Unit.f38893a;
            }
            return;
        }
        okhttp3.internal.http2.E eC = ((okhttp3.internal.http2.u) this.f10154b).c(i7);
        if (eC != null) {
            synchronized (eC) {
                eC.f40781f += j6;
                if (j6 > 0) {
                    eC.notifyAll();
                }
                Unit unit2 = Unit.f38893a;
            }
        }
    }

    public p(okhttp3.internal.http2.u uVar, okhttp3.internal.http2.z reader) {
        this.f10153a = 2;
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f10154b = uVar;
        this.f10155c = reader;
    }

    @Override // okhttp3.internal.http2.Http2Reader$Handler
    public void ackSettings() {
    }

    @Override // okhttp3.internal.http2.Http2Reader$Handler
    public void priority(int i7, int i10, int i11, boolean z3) {
    }
}
